package com.ucare.we.model.BalanceTransferModel;

/* loaded from: classes2.dex */
public class BalanceTransferResponseBody {
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

    public String getMaskedMSISDN() {
        return this.maskedMsisdn;
    }

    public void setMaskedMSISDN(String str) {
        this.maskedMsisdn = str;
    }
}
