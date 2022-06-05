package com.ucare.we.model.AutoPaymentModel;

/* loaded from: classes2.dex */
public class AutoPaymentAddCreditCardInitializeRequestHeader {
    @cqh(a = "customerId")
    private String customerId;
    @cqh(a = "locale")
    private String locale;
    @cqh(a = "messageCode")
    private String messageCode;
    @cqh(a = "msisdn")
    private String msisdn;
    @cqh(a = "timestamp")
    private Long timestamp;

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
}
