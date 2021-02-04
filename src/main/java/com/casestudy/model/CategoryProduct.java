package com.casestudy.model;

public class CategoryProduct {
    private int idCategory;
    private String nameCategory;

    public CategoryProduct(){};
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
