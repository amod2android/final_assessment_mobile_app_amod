package com.bajaj.amodrestaurent.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Long price;
    private String ingredients;
    private String tag ;
    private String prepmints;
    private String imageurl;
    @CreationTimestamp()
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;

    public Menu() {
    }

    public Menu(String name, Long price, String ingredients, String tag, String prepmints, String imageurl) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.tag = tag;
        this.prepmints = prepmints;
        this.imageurl = imageurl;
    }

    public Menu(Long id, String name, Long price, String ingredients, String tag, String prepmints, String imageurl, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.tag = tag;
        this.prepmints = prepmints;
        this.imageurl = imageurl;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPrepmints() {
        return prepmints;
    }

    public void setPrepmints(String prepmints) {
        this.prepmints = prepmints;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
