package com.ucare.we.model;

/* loaded from: classes2.dex */
public class TransferAmountRequest {
    @cqh(a = "body")
    private TransferAmountBody body;
    @cqh(a = "header")
    private MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public TransferAmountBody getBody() {
        return this.body;
    }

    public void setBody(TransferAmountBody transferAmountBody) {
        this.body = transferAmountBody;
    }
}
