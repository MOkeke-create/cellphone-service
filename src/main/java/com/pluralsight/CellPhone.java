package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String iPhoneModel;
    private String carrier;
    private String phoneNumber;
    private String owner;
    private String phone1;
    private String phone2;

    public void cellPhone(){
        this.serialNumber = 0;
        this.iPhoneModel = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getiPhoneModel() {
        return iPhoneModel;
    }

    public void setiPhoneModel(String iPhoneModel) {
        this.iPhoneModel = iPhoneModel;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }
}


