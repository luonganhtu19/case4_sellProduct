package com.casestudy.model;

public class Manufacturer {
    private int idManufacturer;
    private String nameManufacturer;
    private String descriptionManufacturer;
    public Manufacturer(){};

    public Manufacturer(int idManufacturer, String nameManufacturer, String descriptionManufacturer) {
        this.idManufacturer = idManufacturer;
        this.nameManufacturer = nameManufacturer;
        this.descriptionManufacturer = descriptionManufacturer;
    }

    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public String getDescriptionManufacturer() {
        return descriptionManufacturer;
    }

    public void setDescriptionManufacturer(String descriptionManufacturer) {
        this.descriptionManufacturer = descriptionManufacturer;
    }
}
