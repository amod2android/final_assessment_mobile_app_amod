package com.bajaj.amodrestaurent.controllers;

import com.bajaj.amodrestaurent.been.ResponseHandler;
import com.bajaj.amodrestaurent.models.Menu;
import com.bajaj.amodrestaurent.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/menu")
public class MenuController {


    @Autowired
    private MenuService menuService;

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return ResponseHandler.createResponse("Menu Found", HttpStatus.OK, menuService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id) {
        return ResponseHandler.createResponse("Found", HttpStatus.OK, menuService.get(id));
    }

    @PostMapping("/")
    public ResponseEntity<Object> create(@RequestBody Menu menu) {
        Object createMenu = menuService.create(menu);
        if (createMenu != null) {
            return ResponseHandler.createResponse("Menu Created", HttpStatus.CREATED, createMenu);
        }
        return ResponseHandler.createResponse("Menu not created", HttpStatus.CONFLICT, null);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMenu(@PathVariable Long id, @RequestBody Menu menu) {
        Menu updatedMenu = menuService.update(id, menu);
        return ResponseHandler.createResponse("Post Updated", HttpStatus.OK, updatedMenu);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        menuService.delete(id);
        return ResponseHandler.deleteResponse("Menu Deleted", HttpStatus.OK);
    }
}
