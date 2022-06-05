package com.ucare.we.model;

import com.ucare.we.model.SignInModel.GroupID;

/* loaded from: classes2.dex */
public class MainPlanBody extends GroupID {
    @cqh(a = "addOn")
    private boolean addOn;
    @cqh(a = "bundleService")
    private String bundleService;
    @cqh(a = "mainPlan")
    private boolean mainPlan;
    @cqh(a = "price")
    private float price;
    @cqh(a = "primaryService")
    private String primaryService;
    @cqh(a = "remainingDaysForRenewal")
    private int remainingDaysForRenewal;
    @cqh(a = "renewalDate")
    private String renewalDate;
    @cqh(a = "serviceId")
    private String serviceId;
    @cqh(a = "serviceName")
    private String serviceName;
    @cqh(a = "serviceStatusCode")
    private String serviceStatusCode;
    @cqh(a = "serviceStatusDesc")
    private String serviceStatusDesc;
    @cqh(a = "subscriptionDate")
    private String subscriptionDate;

    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public String getServiceStatusCode() {
        return this.serviceStatusCode;
    }

    public void setServiceStatusCode(String str) {
        this.serviceStatusCode = str;
    }

    public String getServiceStatusDesc() {
        return this.serviceStatusDesc;
    }

    public void setServiceStatusDesc(String str) {
        this.serviceStatusDesc = str;
    }

    public String getBundleService() {
        return this.bundleService;
    }

    public void setBundleService(String str) {
        this.bundleService = str;
    }

    public String getPrimaryService() {
        return this.primaryService;
    }

    public void setPrimaryService(String str) {
        this.primaryService = str;
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

    public int getRemainingDaysForRenewal() {
        return this.remainingDaysForRenewal;
    }

    public void setRemainingDaysForRenewal(int i) {
        this.remainingDaysForRenewal = i;
    }

    public boolean isMainPlan() {
        return this.mainPlan;
    }

    public void setMainPlan(boolean z) {
        this.mainPlan = z;
    }

    public boolean isAddOn() {
        return this.addOn;
    }

    public void setAddOn(boolean z) {
        this.addOn = z;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float f) {
        this.price = f;
    }
}
