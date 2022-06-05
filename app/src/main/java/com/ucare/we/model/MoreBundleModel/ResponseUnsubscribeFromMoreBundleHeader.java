package com.ucare.we.model.MoreBundleModel;

/* loaded from: classes2.dex */
public class ResponseUnsubscribeFromMoreBundleHeader {
    @cqh(a = "channelId")
    String channelId;
    @cqh(a = "customerId")
    String customerId;
    @cqh(a = "locale")
    String locale;
    @cqh(a = "messageCode")
    String messageCode;
    @cqh(a = "msisdn")
    String msisdn;
    @cqh(a = "referenceId")
    String referenceId;
    @cqh(a = "responeAdditionalParameters")
    String responeAdditionalParameters;
    @cqh(a = "responseCode")
    String responseCode;
    @cqh(a = "responseMessage")
    String responseMessage;
    @cqh(a = "timstamp")
    String timstamp;

    public String getTimstamp() {
        return this.timstamp;
    }

    public void setTimstamp(String str) {
        this.timstamp = str;
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

    public String getResponeAdditionalParameters() {
        return this.responeAdditionalParameters;
    }

    public void setResponeAdditionalParameters(String str) {
        this.responeAdditionalParameters = str;
    }
}
