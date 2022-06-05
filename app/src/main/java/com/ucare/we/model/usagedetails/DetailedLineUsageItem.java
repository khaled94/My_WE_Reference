package com.ucare.we.model.usagedetails;

/* loaded from: classes2.dex */
public class DetailedLineUsageItem {
    @cqh(a = "freeAmount")
    private float freeAmount;
    @cqh(a = "freeUnitArName")
    private String freeUnitArName;
    @cqh(a = "freeUnitEnName")
    private String freeUnitEnName;
    @cqh(a = "initialTotalAmount")
    private float initialTotalAmount;
    @cqh(a = "itemCode")
    private String itemCode;
    @cqh(a = "measureUnitArName")
    private String measureUnitArName;
    @cqh(a = "measureUnitEnName")
    private String measureUnitEnName;
    @cqh(a = "measureUnitId")
    private String measureUnitId;
    @cqh(a = "remainingDaysForRenewal")
    private int remainingDaysForRenewal;
    @cqh(a = "renewalDate")
    private String renewalDate;
    @cqh(a = "serviceId")
    private String serviceId = "";
    @cqh(a = "subscriptionDate")
    private String subscriptionDate;
    @cqh(a = "summaryGroupName")
    private String summaryGroupName;
    @cqh(a = "usagePercentage")
    private float usagePercentage;
    @cqh(a = "usedAmount")
    private float usedAmount;

    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }

    public String getSummaryGroupName() {
        return this.summaryGroupName;
    }

    public void setSummaryGroupName(String str) {
        this.summaryGroupName = str;
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

    public String getSubscriptionDate() {
        return this.subscriptionDate;
    }

    public void setSubscriptionDate(String str) {
        this.subscriptionDate = str;
    }

    public String getRenewalDate() {
        return this.renewalDate;
    }

    public void setRenewalDate(String str) {
        this.renewalDate = str;
    }

    public float getUsagePercentage() {
        return this.usagePercentage;
    }

    public void setUsagePercentage(float f) {
        this.usagePercentage = f;
    }

    public int getRemainingDaysForRenewal() {
        return this.remainingDaysForRenewal;
    }

    public void setRemainingDaysForRenewal(int i) {
        this.remainingDaysForRenewal = i;
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
}
