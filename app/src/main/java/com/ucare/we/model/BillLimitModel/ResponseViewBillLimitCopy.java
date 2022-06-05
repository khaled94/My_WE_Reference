package com.ucare.we.model.BillLimitModel;

/* loaded from: classes2.dex */
public class ResponseViewBillLimitCopy {
    @cqh(a = "body")
    String body;
    @cqh(a = "header")
    ResponseViewBillLimitHeader header;

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public ResponseViewBillLimitHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseViewBillLimitHeader responseViewBillLimitHeader) {
        this.header = responseViewBillLimitHeader;
    }
}
