package com.ucare.we.model;

/* loaded from: classes2.dex */
public class RequestHeader {
    @cqh(a = "responseCode")
    public String responseCode;
    @cqh(a = "responseMessage")
    public String responseMessage;
    @cqh(a = "timestamp")
    private Long timestamp = null;
    @cqh(a = "customerId")
    private String customerId = null;
    @cqh(a = "msisdn")
    private String msisdn = null;
    @cqh(a = "messageCode")
    private String messageCode = null;
    @cqh(a = "locale")
    private String locale = null;

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
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

    public String getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(String str) {
        this.responseCode = str;
    }

    public String getResponseMessage() {
        return this.responseMessage;
    }

    public void setResponseMessage(String str) {
        this.responseMessage = str;
    }
}
