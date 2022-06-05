package com.ucare.we.model;

/* loaded from: classes2.dex */
public class BalanceTransferFinalizeRequestBody {
    @cqh(a = "amount")
    private float amount;
    @cqh(a = "confirmationCode")
    private String confirmationCode;
    @cqh(a = "freeUnitId")
    private String freeUnitId;
    @cqh(a = "measureUnitId")
    private String measureUnitId;
    @cqh(a = "sourceMsisdn")
    private String sourceMsisdn;
    @cqh(a = "targetMsisdn")
    private String targetMsisdn;

    public BalanceTransferFinalizeRequestBody() {
    }

    public BalanceTransferFinalizeRequestBody(float f, String str, String str2, String str3) {
        this.amount = f;
        this.sourceMsisdn = str;
        this.targetMsisdn = str2;
        this.confirmationCode = str3;
    }

    public String getFreeUnitId() {
        return this.freeUnitId;
    }

    public void setFreeUnitId(String str) {
        this.freeUnitId = str;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float f) {
        this.amount = f;
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

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    public void setConfirmationCode(String str) {
        this.confirmationCode = str;
    }

    public String getMeasureUnitId() {
        return this.measureUnitId;
    }

    public void setMeasureUnitId(String str) {
        this.measureUnitId = str;
    }
}
