package com.ucare.we.model;

/* loaded from: classes2.dex */
public class CreditCardInitResponseBody {
    @cqh(a = "hashCode")
    private String hashCode;
    @cqh(a = "mobileNumber")
    private String mobileNumber;
    @cqh(a = "newBalanceAmount")
    private String newBalanceAmount;
    @cqh(a = "paymentNarration")
    private String paymentNarration;
    @cqh(a = "paymentSerialNo")
    private String paymentSerialNo;
    @cqh(a = "transactionID")
    private int transactionID;

    public String getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(String str) {
        this.hashCode = str;
    }

    public String getNewBalanceAmount() {
        return this.newBalanceAmount;
    }

    public void setNewBalanceAmount(String str) {
        this.newBalanceAmount = str;
    }

    public int getTransactionID() {
        return this.transactionID;
    }

    public void setTransactionID(int i) {
        this.transactionID = i;
    }

    public String getPaymentSerialNo() {
        return this.paymentSerialNo;
    }

    public void setPaymentSerialNo(String str) {
        this.paymentSerialNo = str;
    }

    public String getPaymentNarration() {
        return this.paymentNarration;
    }

    public void setPaymentNarration(String str) {
        this.paymentNarration = str;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }
}
