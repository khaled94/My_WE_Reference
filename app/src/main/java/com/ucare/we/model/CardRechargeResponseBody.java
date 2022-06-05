package com.ucare.we.model;

/* loaded from: classes2.dex */
public class CardRechargeResponseBody {
    @cqh(a = "mobileNumber")
    private String mobileNumber;
    @cqh(a = "newBalanceAmount")
    private float newBalanceAmount;
    @cqh(a = "oldBalanceAmount")
    private float oldBalanceAmount;
    @cqh(a = "paymentNarration")
    private String paymentNarration;
    @cqh(a = "paymentSerialNo")
    private String paymentSerialNo;

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public float getNewBalanceAmount() {
        return this.newBalanceAmount;
    }

    public void setNewBalanceAmount(float f) {
        this.newBalanceAmount = f;
    }

    public float getOldBalanceAmount() {
        return this.oldBalanceAmount;
    }

    public void setOldBalanceAmount(float f) {
        this.oldBalanceAmount = f;
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
}
