package com.ucare.we.model.BillLimitModel;

/* loaded from: classes2.dex */
public class ResponseViewBillLimitBody {
    @cqh(a = "consumptionLimit")
    private String consumptionLimit;
    @cqh(a = "notifyLimit")
    private String notifyLimit;

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
}
