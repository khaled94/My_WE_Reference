package com.ucare.we.model;

/* loaded from: classes2.dex */
public class BalanceTransferInitRequestBody {
    @cqh(a = "amount")
    private float amount;
    @cqh(a = "sourceMsisdn")
    private String sourceMsisdn;
    @cqh(a = "targetMsisdn")
    private String targetMsisdn;

    public BalanceTransferInitRequestBody(float f, String str, String str2) {
        this.amount = f;
        this.sourceMsisdn = str;
        this.targetMsisdn = str2;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(int i) {
        this.amount = i;
    }

    public String getSourceMsisdn() {
        return this.sourceMsisdn;
    }

    public void setSourceMsisdn(String str) {
        this.sourceMsisdn = str;
    }

    public String getTargetMsisdn() {
        return this.targetMsisdn;
    }

    public void setTargetMsisdn(String str) {
        this.targetMsisdn = str;
    }
}
