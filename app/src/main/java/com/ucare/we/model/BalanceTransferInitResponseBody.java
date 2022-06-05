package com.ucare.we.model;

/* loaded from: classes2.dex */
public class BalanceTransferInitResponseBody {
    @cqh(a = "confirmationCode")
    private String confirmationCode;
    @cqh(a = "maskedMsisdn")
    private String maskedMsisdn;

    public String getMaskedMsisdn() {
        return this.maskedMsisdn;
    }

    public void setMaskedMsisdn(String str) {
        this.maskedMsisdn = str;
    }

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    public void setConfirmationCode(String str) {
        this.confirmationCode = str;
    }
}
