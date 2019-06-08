package com.nhannt.snef.model;

import java.io.Serializable;

public class Location implements Serializable {

    private int locationid;
    private String city;
    private String address;
    private String district;
    private String ward;

    public Location() {
    }

    public Location(int locationid, String city, String address, String district, String ward) {
        this.locationid = locationid;
        this.city = city;
        this.address = address;
        this.district = district;
        this.ward = ward;
    }

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
}
