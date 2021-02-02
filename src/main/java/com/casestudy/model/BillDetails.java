package com.casestudy.model;

public class BillDetails {
    private long idBillDetails;
    private int quantity;
    private Product product;

    public BillDetails(){}

    public long getIdBillDetails() {
        return idBillDetails;
    }

    public void setIdBillDetails(long idBillDetails) {
        this.idBillDetails = idBillDetails;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
