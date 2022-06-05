package com.ucare.we.model.BillSummaryModel;

/* loaded from: classes2.dex */
public class ResponseInitiateBillSummaryBody {
    @cqh(a = "confirmationCode")
    String confirmationCode;
    @cqh(a = "maskedMsisdn")
    String maskedMsisdn;

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
