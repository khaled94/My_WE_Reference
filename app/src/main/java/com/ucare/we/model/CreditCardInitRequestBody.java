package com.ucare.we.model;

/* loaded from: classes2.dex */
public class CreditCardInitRequestBody {
    @cqh(a = "amount")
    private String amount;
    @cqh(a = "redirectionURL")
    private String redirectionURL;
    @cqh(a = "sourceMobileNumber")
    private String sourceMobileNumber;
    @cqh(a = "targetMobileNumber")
    private String targetMobileNumber;

    public String getRedirectionURL() {
        return this.redirectionURL;
    }

    public void setRedirectionURL(String str) {
        this.redirectionURL = str;
    }

    public String getSourceMobileNumber() {
        return this.sourceMobileNumber;
    }

    public void setSourceMobileNumber(String str) {
        this.sourceMobileNumber = str;
    }

    public String getTargetMobileNumber() {
        return this.targetMobileNumber;
    }

    public void setTargetMobileNumber(String str) {
        this.targetMobileNumber = str;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        this.amount = str;
    }
}
