package com.ucare.we.model;

/* loaded from: classes2.dex */
public class CreditCardFinalizeRequestBody {
    @cqh(a = "hashCode")
    private String hashCode;
    @cqh(a = "targetMobileNumber")
    private String targetMobileNumber;
    @cqh(a = "transactionID")
    private String transactionID;

    public String getTargetMobileNumber() {
        return this.targetMobileNumber;
    }

    public void setTargetMobileNumber(String str) {
        this.targetMobileNumber = str;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(String str) {
        this.hashCode = str;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public void setTransactionID(String str) {
        this.transactionID = str;
    }
}
