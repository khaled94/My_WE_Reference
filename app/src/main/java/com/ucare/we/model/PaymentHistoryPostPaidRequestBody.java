package com.ucare.we.model;

/* loaded from: classes2.dex */
public class PaymentHistoryPostPaidRequestBody {
    @cqh(a = "paymentHistoryEndDate")
    private String paymentHistoryEndDate;
    @cqh(a = "paymentHistoryStartDate")
    private String paymentHistoryStartDate;

    public String getPaymentHistoryStartDate() {
        return this.paymentHistoryStartDate;
    }

    public void setPaymentHistoryStartDate(String str) {
        this.paymentHistoryStartDate = str;
    }

    public String getPaymentHistoryEndDate() {
        return this.paymentHistoryEndDate;
    }

    public void setPaymentHistoryEndDate(String str) {
        this.paymentHistoryEndDate = str;
    }
}
