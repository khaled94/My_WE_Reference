package com.ucare.we.model;

/* loaded from: classes2.dex */
public class PaymentHistoryRequestBody {
    @cqh(a = "msisdn")
    private String msisdn;
    @cqh(a = "queryRechargeEndDate")
    private String queryRechargeEndDate;
    @cqh(a = "queryRechargeStartDate")
    private String queryRechargeStartDate;

    public PaymentHistoryRequestBody(String str, String str2, String str3) {
        this.msisdn = str;
        this.queryRechargeStartDate = str2;
        this.queryRechargeEndDate = str3;
    }

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public String getQueryRechargeStartDate() {
        return this.queryRechargeStartDate;
    }

    public void setQueryRechargeStartDate(String str) {
        this.queryRechargeStartDate = str;
    }

    public String getQueryRechargeEndDate() {
        return this.queryRechargeEndDate;
    }

    public void setQueryRechargeEndDate(String str) {
        this.queryRechargeEndDate = str;
    }
}
