package com.ucare.we.model;

/* loaded from: classes2.dex */
public class TransferAmountBody {
    @cqh(a = "amount")
    private String amount;
    @cqh(a = "measureUnitId")
    private String measureUnitId;
    @cqh(a = "sourceMsisdn")
    private String sourceMsisdn;
    @cqh(a = "targetMsisdn")
    private String targetMsisdn;

    public TransferAmountBody() {
    }

    public TransferAmountBody(String str, String str2, String str3) {
        this.amount = str;
        this.sourceMsisdn = str2;
        this.targetMsisdn = str3;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        this.amount = str;
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

    public String getMeasureUnitId() {
        return this.measureUnitId;
    }

    public void setMeasureUnitId(String str) {
        this.measureUnitId = str;
    }
}
