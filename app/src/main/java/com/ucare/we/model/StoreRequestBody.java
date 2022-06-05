package com.ucare.we.model;

/* loaded from: classes2.dex */
public class StoreRequestBody {
    @cqh(a = "latitude")
    private double latitude;
    @cqh(a = "longitude")
    private double longitude;
    @cqh(a = "numberOfStores")
    private int numberOfStores;

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public int getNumberOfStores() {
        return this.numberOfStores;
    }

    public void setNumberOfStores(int i) {
        this.numberOfStores = i;
    }
}
