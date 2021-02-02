package com.casestudy.model;

public class Product {
    private int idProduct;
    private String namProduct;
    private double priceEachProduct;
    private int quantityProduct;
    private CategoryProduct categoryProduct;
    private String descriptionProduct;
    private String colorProduct;
    private String manufacturerProduct;
    private String img1;
    private String img2;
    private String img3;
    private String img4;


    public Product(){};
    public Product(int idProduct, String namProduct, double priceEachProduct, int quantityProduct,CategoryProduct categoryProduct ,String img1, String img2, String img3, String img4) {
        this.idProduct = idProduct;
        this.namProduct = namProduct;
        this.priceEachProduct = priceEachProduct;
        this.quantityProduct = quantityProduct;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.categoryProduct=categoryProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNamProduct() {
        return namProduct;
    }

    public void setNamProduct(String namProduct) {
        this.namProduct = namProduct;
    }

    public double getPriceEachProduct() {
        return priceEachProduct;
    }

    public void setPriceEachProduct(double priceEachProduct) {
        this.priceEachProduct = priceEachProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public CategoryProduct getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(CategoryProduct categoryProduct) {
        this.categoryProduct = categoryProduct;
    }
}
