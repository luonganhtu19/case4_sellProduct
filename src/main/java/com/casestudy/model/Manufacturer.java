package com.casestudy.model;

public class Manufacturer {
    private long idManufacturer;
    private String nameManufacturer;
    private String linkManufacturer;


    public Manufacturer(){};

    public long getIdManufacturer() {
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

    public String getLinkManufacturer() {
        return linkManufacturer;
    }

    public void setLinkManufacturer(String linkManufacturer) {
        this.linkManufacturer = linkManufacturer;
    }
}
