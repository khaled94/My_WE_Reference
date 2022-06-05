package com.ucare.we.model.VoucherPaymentModel;

import com.ucare.we.model.MainRequestsHeader;

/* loaded from: classes2.dex */
public class VoucherPaymentRequest {
    @cqh(a = "body")
    @cqf
    private VoucherPaymetRequestBody body;
    @cqh(a = "header")
    @cqf
    private MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public VoucherPaymetRequestBody getBody() {
        return this.body;
    }

    public void setBody(VoucherPaymetRequestBody voucherPaymetRequestBody) {
        this.body = voucherPaymetRequestBody;
    }
}
