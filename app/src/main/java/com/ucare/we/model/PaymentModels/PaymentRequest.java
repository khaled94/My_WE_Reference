package com.ucare.we.model.PaymentModels;

import com.ucare.we.model.MainRequestsHeader;

/* loaded from: classes2.dex */
public class PaymentRequest {
    @cqh(a = "body")
    @cqf
    private PaymentBody body;
    @cqh(a = "header")
    @cqf
    private MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public PaymentBody getBody() {
        return this.body;
    }

    public void setBody(PaymentBody paymentBody) {
        this.body = paymentBody;
    }
}
