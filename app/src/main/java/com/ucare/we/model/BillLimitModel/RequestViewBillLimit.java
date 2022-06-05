package com.ucare.we.model.BillLimitModel;

/* loaded from: classes2.dex */
public class RequestViewBillLimit {
    @cqh(a = "body")
    RequestViewBillLimitBody body;
    @cqh(a = "header")
    RequestViewBillLimitHeader header;

    public RequestViewBillLimitBody getBody() {
        return this.body;
    }

    public void setBody(RequestViewBillLimitBody requestViewBillLimitBody) {
        this.body = requestViewBillLimitBody;
    }

    public RequestViewBillLimitHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestViewBillLimitHeader requestViewBillLimitHeader) {
        this.header = requestViewBillLimitHeader;
    }
}
