package com.example.vooch.dogruz.Api.Model;

public class Order {

    private String placeNameDestination;
    private String placeNameStart;
    private float orderPrice;
    private float orderVolume;

    public String getPlaceNameDestination() {
        return placeNameDestination;
    }

    public void setPlaceNameDestination(String placeNameDestination) {
        this.placeNameDestination = placeNameDestination;
    }

    public String getPlaceNameStart() {
        return placeNameStart;
    }

    public void setPlaceNameStart(String placeNameStart) {
        this.placeNameStart = placeNameStart;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public float getOrderVolume() {
        return orderVolume;
    }

    public void setOrderVolume(float orderVolume) {
        this.orderVolume = orderVolume;
    }
}
