package com.ucare.we.model.BankCardPaymentPostpaidModel;

import com.ucare.we.model.MainRequestsHeader;

/* loaded from: classes2.dex */
public class BankCardModelPaymentPostPaidRequest {
    @cqh(a = "body")
    BankCardModelPaymentPostPaidRequestBody body;
    @cqh(a = "header")
    MainRequestsHeader header;

    public BankCardModelPaymentPostPaidRequestBody getBody() {
        return this.body;
    }

    public void setBody(BankCardModelPaymentPostPaidRequestBody bankCardModelPaymentPostPaidRequestBody) {
        this.body = bankCardModelPaymentPostPaidRequestBody;
    }

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }
}
