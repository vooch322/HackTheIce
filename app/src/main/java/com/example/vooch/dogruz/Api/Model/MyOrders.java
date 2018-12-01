package com.example.vooch.dogruz.Api.Model;

public class MyOrders {

    private String driver;
    private String placeStart;
    private String placeDestination;
    private String dateStart;
    private String status;
    private String dateDelivery;
    private String daysWay;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getPlaceStart() {
        return placeStart;
    }

    public void setPlaceStart(String placeStart) {
        this.placeStart = placeStart;
    }

    public String getPlaceDestination() {
        return placeDestination;
    }

    public void setPlaceDestination(String placeDestination) {
        this.placeDestination = placeDestination;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(String dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public String getDaysWay() {
        return daysWay;
    }

    public void setDaysWay(String daysWay) {
        this.daysWay = daysWay;
    }
}
