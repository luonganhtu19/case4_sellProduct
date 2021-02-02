package com.casestudy.model;

public class Advertisement {
    private int idAdvertisement;
    private String nameAdvertisement;
    private String imgAdvertisement;
    private String linkAdvertisement;

    public Advertisement(){}

    public int getIdAdvertisement() {
        return idAdvertisement;
    }

    public void setIdAdvertisement(int idAdvertisement) {
        this.idAdvertisement = idAdvertisement;
    }

    public String getNameAdvertisement() {
        return nameAdvertisement;
    }

    public void setNameAdvertisement(String nameAdvertisement) {
        this.nameAdvertisement = nameAdvertisement;
    }

    public String getImgAdvertisement() {
        return imgAdvertisement;
    }

    public void setImgAdvertisement(String imgAdvertisement) {
        this.imgAdvertisement = imgAdvertisement;
    }

    public String getLinkAdvertisement() {
        return linkAdvertisement;
    }

    public void setLinkAdvertisement(String linkAdvertisement) {
        this.linkAdvertisement = linkAdvertisement;
    }
}