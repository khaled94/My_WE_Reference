package com.ucare.we.model.SwitchAccountModel;

/* loaded from: classes2.dex */
public class RequestNumberAccessResponseBody {
    @cqh(a = "confirmationCode")
    @cqf
    public String confirmationCode;
    @cqh(a = "maskedMsisdn")
    @cqf
    public String maskedMsisdn;

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    public void setConfirmationCode(String str) {
        this.confirmationCode = str;
    }

    public String getMaskedMsisdn() {
        return this.maskedMsisdn;
    }

    public void setMaskedMsisdn(String str) {
        this.maskedMsisdn = str;
    }
}
