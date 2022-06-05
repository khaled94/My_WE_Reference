package com.ucare.we.model;

/* loaded from: classes2.dex */
public class summarizedPointsCardModel {
    private float remainingPoints;
    private Long tabID;
    private float totalPoints;

    public summarizedPointsCardModel(Long l, float f, float f2) {
        this.tabID = l;
        this.totalPoints = f;
        this.remainingPoints = f2;
    }

    public Long getTabID() {
        return this.tabID;
    }

    public void setTabID(Long l) {
        this.tabID = l;
    }

    public float getTotalPoints() {
        return this.totalPoints;
    }

    public void setTotalPoints(float f) {
        this.totalPoints = f;
    }

    public float getRemainingPoints() {
        return this.remainingPoints;
    }

    public void setRemainingPoints(float f) {
        this.remainingPoints = f;
    }
}
