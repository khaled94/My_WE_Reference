package com.ucare.we.model;

/* loaded from: classes2.dex */
public class CardRechargeRequestBody {
    @cqh(a = "sourceMobileNumber")
    private String sourceMobileNumber;
    @cqh(a = "targetMobileNumber")
    private String targetMobileNumber;
    @cqh(a = "voucherNumber")
    private String voucherNumber;

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

    public String getVoucherNumber() {
        return this.voucherNumber;
    }

    public void setVoucherNumber(String str) {
        this.voucherNumber = str;
    }
}
