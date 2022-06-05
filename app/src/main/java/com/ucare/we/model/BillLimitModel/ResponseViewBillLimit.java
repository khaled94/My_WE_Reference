package com.ucare.we.model.BillLimitModel;

/* loaded from: classes2.dex */
public class ResponseViewBillLimit {
    @cqh(a = "body")
    ResponseViewBillLimitBody body;
    @cqh(a = "header")
    ResponseViewBillLimitHeader header;

    public ResponseViewBillLimitBody getBody() {
        return this.body;
    }

    public void setBody(ResponseViewBillLimitBody responseViewBillLimitBody) {
        this.body = responseViewBillLimitBody;
    }

    public ResponseViewBillLimitHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseViewBillLimitHeader responseViewBillLimitHeader) {
        this.header = responseViewBillLimitHeader;
    }
}
