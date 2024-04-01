package com.bajaj.amodrestaurent.services;

import com.bajaj.amodrestaurent.exceptions.EntityNotFoundException;
import com.bajaj.amodrestaurent.models.Menu;
import com.bajaj.amodrestaurent.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;


    // fetch all menus
    public List<Menu> getAll() {
        return menuRepository.findAll();
    }

    // fetch menu by id
    public Menu get(Long id) {
        Optional<Menu> menu = menuRepository.findById(id);
        if (menu.isPresent()) {
            return menu.get();
        }
        throw new EntityNotFoundException("Post not found");
    }


    //To create a new Post
    public Menu create(Menu menu) {
        return menuRepository.save(menu);
    }

    //To update menu by id
    public Menu update(Long id, Menu menuDetails) {
        Optional<Menu> optionalMenu = menuRepository.findById(id);
        if (optionalMenu.isPresent()) {
            Menu menu = optionalMenu.get();
            menu.setName(menuDetails.getName());
            menu.setPrice(menuDetails.getPrice());
            menu.setImageurl(menuDetails.getImageurl());
            menu.setImageurl(menuDetails.getImageurl());
            return menuRepository.save(menu);
        }
        throw new EntityNotFoundException("Menu with id " + id + " not found");
    }

    //To delete menu by id
    public void delete(Long id) {
        menuRepository.deleteById(id);
    }

}
