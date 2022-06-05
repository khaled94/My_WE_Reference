package com.ucare.we.model.family;

/* loaded from: classes2.dex */
public class FamilyConsumptionLimitMembersList {
    @cqh(a = "freeUnitArName")
    private String freeUnitArName;
    @cqh(a = "freeUnitEnName")
    private String freeUnitEnName;
    @cqh(a = "itemCode")
    private String itemCode;
    @cqh(a = "measureUnitArName")
    private String measureUnitArName;
    @cqh(a = "measureUnitEnName")
    private String measureUnitEnName;
    @cqh(a = "measureUnitId")
    private String measureUnitId;
    @cqh(a = "summaryGroupName")
    private String summaryGroupName;
    @cqh(a = "usagePercentage")
    private float usagePercentage;
    @cqh(a = "initialTotalAmount")
    private float initialTotalAmount = 0.0f;
    @cqh(a = "freeAmount")
    private float freeAmount = 0.0f;
    @cqh(a = "usedAmount")
    private float usedAmount = 0.0f;

    public float getUsagePercentage() {
        return this.usagePercentage;
    }

    public void setUsagePercentage(float f) {
        this.usagePercentage = f;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String str) {
        this.itemCode = str;
    }

    public float getInitialTotalAmount() {
        return this.initialTotalAmount;
    }

    public void setInitialTotalAmount(float f) {
        this.initialTotalAmount = f;
    }

    public float getFreeAmount() {
        return this.freeAmount;
    }

    public void setFreeAmount(float f) {
        this.freeAmount = f;
    }

    public String getMeasureUnitId() {
        return this.measureUnitId;
    }

    public void setMeasureUnitId(String str) {
        this.measureUnitId = str;
    }

    public float getUsedAmount() {
        return this.usedAmount;
    }

    public void setUsedAmount(float f) {
        this.usedAmount = f;
    }

    public String getFreeUnitEnName() {
        return this.freeUnitEnName;
    }

    public void setFreeUnitEnName(String str) {
        this.freeUnitEnName = str;
    }

    public String getFreeUnitArName() {
        return this.freeUnitArName;
    }

    public void setFreeUnitArName(String str) {
        this.freeUnitArName = str;
    }

    public String getMeasureUnitEnName() {
        return this.measureUnitEnName;
    }

    public void setMeasureUnitEnName(String str) {
        this.measureUnitEnName = str;
    }

    public String getMeasureUnitArName() {
        return this.measureUnitArName;
    }

    public void setMeasureUnitArName(String str) {
        this.measureUnitArName = str;
    }

    public String getSummaryGroupName() {
        return this.summaryGroupName;
    }

    public void setSummaryGroupName(String str) {
        this.summaryGroupName = str;
    }
}
