package com.ucare.we.model.FirebaseNotificationModel;

/* loaded from: classes2.dex */
public class DeviceProperties {
    @cqh(a = "brand")
    String brand;
    @cqh(a = "manufacturer")
    String manufacturer;
    @cqh(a = "model")
    String model;
    @cqh(a = "osVersion")
    String osVersion;

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }
}
