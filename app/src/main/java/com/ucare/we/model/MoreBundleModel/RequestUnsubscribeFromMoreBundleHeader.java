package com.ucare.we.model.MoreBundleModel;

/* loaded from: classes2.dex */
public class RequestUnsubscribeFromMoreBundleHeader {
    @cqh(a = "customerId")
    String customerId;
    @cqh(a = "locale")
    String locale;
    @cqh(a = "messageCode")
    String messageCode;
    @cqh(a = "msisdn")
    String msisdn;
    @cqh(a = "timestamp")
    int timestamp;

    public int getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(int i) {
        this.timestamp = i;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public String getMessageCode() {
        return this.messageCode;
    }

    public void setMessageCode(String str) {
        this.messageCode = str;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String str) {
        this.locale = str;
    }
}
