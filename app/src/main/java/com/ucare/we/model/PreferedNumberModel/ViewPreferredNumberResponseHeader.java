package com.ucare.we.model.PreferedNumberModel;

/* loaded from: classes2.dex */
public class ViewPreferredNumberResponseHeader {
    @cqh(a = "channelId")
    private String channelId;
    @cqh(a = "customerId")
    private String customerId;
    @cqh(a = "locale")
    private String locale;
    @cqh(a = "messageCode")
    private String messageCode;
    @cqh(a = "msisdn")
    private String msisdn;
    @cqh(a = "referenceId")
    private String referenceId;
    @cqh(a = "responeAdditionalParameters")
    private int responeAdditionalParameters;
    @cqh(a = "responseCode")
    private String responseCode;
    @cqh(a = "responseMessage")
    private String responseMessage;
    @cqh(a = "timstamp")
    private int timstamp;

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

    public int getResponeAdditionalParameters() {
        return this.responeAdditionalParameters;
    }

    public void setResponeAdditionalParameters(int i) {
        this.responeAdditionalParameters = i;
    }
}
