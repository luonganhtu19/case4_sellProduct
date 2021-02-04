package com.casestudy.model;

public class BillDetails {
    private long idBillDetails;
    private long quantity;
    private long  idBill;
    private Product product;

    public BillDetails(){}

    public long getIdBillDetails() {
        return idBillDetails;
    }

    public void setIdBillDetails(long idBillDetails) {
        this.idBillDetails = idBillDetails;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getIdBill() {
        return idBill;
    }

    public void setIdBill(long idBill) {
        this.idBill = idBill;
    }
}
