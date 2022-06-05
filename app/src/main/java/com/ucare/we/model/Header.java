package com.ucare.we.model;

/* loaded from: classes2.dex */
public class Header {
    @cqh(a = "channelId")
    @cqf
    public String channelId;
    @cqh(a = "customerId")
    @cqf
    public Object customerId;
    @cqh(a = "locale")
    @cqf
    public String locale;
    @cqh(a = "messageCode")
    @cqf
    public Object messageCode;
    @cqh(a = "msisdn")
    @cqf
    public String msisdn;
    @cqh(a = "referenceId")
    @cqf
    public String referenceId;
    @cqh(a = "responeAdditionalParameters")
    @cqf
    public Object responeAdditionalParameters;
    @cqh(a = "responseCode")
    @cqf
    public String responseCode;
    @cqh(a = "responseMessage")
    @cqf
    public String responseMessage;
    @cqh(a = "timstamp")
    @cqf
    public Integer timstamp;

    public Integer getTimstamp() {
        return this.timstamp;
    }

    public void setTimstamp(Integer num) {
        this.timstamp = num;
    }

    public Object getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Object obj) {
        this.customerId = obj;
    }

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public Object getMessageCode() {
        return this.messageCode;
    }

    public void setMessageCode(Object obj) {
        this.messageCode = obj;
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

    public Object getResponeAdditionalParameters() {
        return this.responeAdditionalParameters;
    }

    public void setResponeAdditionalParameters(Object obj) {
        this.responeAdditionalParameters = obj;
    }
}
