package com.ucare.we.model.checkavailability;

/* loaded from: classes2.dex */
public class CheckAvailabilityResponse {
    @cqh(a = "hasMessage")
    @cqf
    private Boolean hasMessage;
    @cqh(a = "landLineData")
    @cqf
    private LandLineData landLineData;
    @cqh(a = "message")
    @cqf
    private String message;
    @cqh(a = "newPlan")
    @cqf
    private String newPlan;
    @cqh(a = "oldPlan")
    @cqf
    private String oldPlan;
    @cqh(a = "upgrade")
    @cqf
    private Boolean upgrade;

    public String getOldPlan() {
        return this.oldPlan;
    }

    public void setOldPlan(String str) {
        this.oldPlan = str;
    }

    public String getNewPlan() {
        return this.newPlan;
    }

    public void setNewPlan(String str) {
        this.newPlan = str;
    }

    public Boolean getUpgrade() {
        return this.upgrade;
    }

    public void setUpgrade(Boolean bool) {
        this.upgrade = bool;
    }

    public LandLineData getLandLineData() {
        return this.landLineData;
    }

    public void setLandLineData(LandLineData landLineData) {
        this.landLineData = landLineData;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public Boolean getHasMessage() {
        return this.hasMessage;
    }

    public void setHasMessage(Boolean bool) {
        this.hasMessage = bool;
    }
}
