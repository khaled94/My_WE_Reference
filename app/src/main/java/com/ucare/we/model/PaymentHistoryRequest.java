package com.ucare.we.model;

/* loaded from: classes2.dex */
public class PaymentHistoryRequest {
    @cqh(a = "body")
    private PaymentHistoryPostPaidRequestBody body;
    @cqh(a = "header")
    private MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public PaymentHistoryPostPaidRequestBody getBody() {
        return this.body;
    }

    public void setBody(PaymentHistoryPostPaidRequestBody paymentHistoryPostPaidRequestBody) {
        this.body = paymentHistoryPostPaidRequestBody;
    }
}
