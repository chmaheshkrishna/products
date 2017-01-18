package com.products.model;


import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.Serializable;

public class Product implements Serializable {

    private Integer id;

    private String name;

    private boolean active;

    private Integer categoryId;

    private String description;

    public Product(int id, String name, String description, boolean active, int categoryId) {
        this.id=id;
        this.name = name;
        this.description = description;
        this.active = active;
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", categoryId=" + categoryId +
                ", description='" + description + '\'' +
                '}';
    }
}
