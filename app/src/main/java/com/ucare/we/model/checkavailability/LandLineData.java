package com.ucare.we.model.checkavailability;

/* loaded from: classes2.dex */
public class LandLineData {
    @cqh(a = "expectedSpeed")
    @cqf
    private String expectedSpeed;
    @cqh(a = "landLineType")
    @cqf
    private String landLineType;
    @cqh(a = "maximumSpeed")
    @cqf
    private String maximumSpeed;
    @cqh(a = "vdsLdata")
    @cqf
    private VdsLdata vdsLdata;

    public String getLandLineType() {
        return this.landLineType;
    }

    public void setLandLineType(String str) {
        this.landLineType = str;
    }

    public String getExpectedSpeed() {
        return this.expectedSpeed;
    }

    public void setExpectedSpeed(String str) {
        this.expectedSpeed = str;
    }

    public String getMaximumSpeed() {
        return this.maximumSpeed;
    }

    public void setMaximumSpeed(String str) {
        this.maximumSpeed = str;
    }

    public VdsLdata getVdsLdata() {
        return this.vdsLdata;
    }

    public void setVdsLdata(VdsLdata vdsLdata) {
        this.vdsLdata = vdsLdata;
    }
}
