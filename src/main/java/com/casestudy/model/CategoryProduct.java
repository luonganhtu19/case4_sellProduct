package com.casestudy.model;

public class CategoryProduct {
    private int idCategory;
    private String name;

    public CategoryProduct(){};
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
