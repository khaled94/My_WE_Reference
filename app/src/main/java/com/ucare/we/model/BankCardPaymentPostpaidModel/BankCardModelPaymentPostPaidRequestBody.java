package com.ucare.we.model.BankCardPaymentPostpaidModel;

/* loaded from: classes2.dex */
public class BankCardModelPaymentPostPaidRequestBody {
    @cqh(a = "hashCode")
    String hashCode;
    @cqh(a = "targetMobileNumber")
    String targetMobileNumber;
    @cqh(a = "transactionID")
    String transactionID;

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

    public String getTargetMobileNumber() {
        return this.targetMobileNumber;
    }

    public void setTargetMobileNumber(String str) {
        this.targetMobileNumber = str;
    }
}
