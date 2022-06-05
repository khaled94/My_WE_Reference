package com.ucare.we.model;

/* loaded from: classes2.dex */
public class MainRequestsHeader {
    @cqh(a = "channelId")
    private String channelId;
    @cqh(a = "customerId")
    private String customerId;
    @cqh(a = "locale")
    private String locale;
    @cqh(a = "messageCode")
    private int messageCode;
    @cqh(a = "msisdn")
    private int msisdn;
    private String msisdnNew;
    @cqh(a = "referenceId")
    private String referenceId;
    @cqh(a = "responeAdditionalParameters")
    private String responeAdditionalParameters;
    @cqh(a = "responseCode")
    String responseCode;
    @cqh(a = "responseMessage")
    private String responseMessage;
    @cqh(a = "timestamp")
    private int timstamp;

    public String getMsisdnNew() {
        return this.msisdnNew;
    }

    public void setMsisdnNew(String str) {
        this.msisdnNew = str;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(String str) {
        this.responseCode = str;
    }

    public int getTimstamp() {
        return this.timstamp;
    }

    public void setTimstamp(int i) {
        this.timstamp = i;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public int getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(int i) {
        this.msisdn = i;
    }

    public int getMessageCode() {
        return this.messageCode;
    }

    public void setMessageCode(int i) {
        this.messageCode = i;
    }

    public String getResponseMessage() {
        return this.responseMessage;
    }

    public void setResponseMessage(String str) {
        this.responseMessage = str;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public String getReferenceId() {
        return this.referenceId;
    }

    public void setReferenceId(String str) {
        this.referenceId = str;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public String getResponeAdditionalParameters() {
        return this.responeAdditionalParameters;
    }

    public void setResponeAdditionalParameters(String str) {
        this.responeAdditionalParameters = str;
    }
}
