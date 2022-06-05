package com.ucare.we.model.BillLimitModel;

/* loaded from: classes2.dex */
public class RequestSetBillLimitBody {
    @cqh(a = "actionType")
    private String actionType;
    @cqh(a = "consumptionLimit")
    private String consumptionLimit;
    @cqh(a = "msisdn")
    private String msisdn;
    @cqh(a = "notifyLimit")
    private String notifyLimit;
    @cqh(a = "serviceType")
    private String serviceType;

    public String getMobileNumber() {
        return this.msisdn;
    }

    public void setMobileNumber(String str) {
        this.msisdn = str;
    }

    public String getConsumptionLimit() {
        return this.consumptionLimit;
    }

    public void setConsumptionLimit(String str) {
        this.consumptionLimit = str;
    }

    public String getNotifyLimit() {
        return this.notifyLimit;
    }

    public void setNotifyLimit(String str) {
        this.notifyLimit = str;
    }

    public String getActionType() {
        return this.actionType;
    }

    public void setActionType(String str) {
        this.actionType = str;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(String str) {
        this.serviceType = str;
    }
}
