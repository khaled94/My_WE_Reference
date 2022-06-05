package com.ucare.we.model.BillLimitModel;

/* loaded from: classes2.dex */
public class SetBillLimitRequest {
    @cqh(a = "body")
    private RequestSetBillLimitBody body;
    @cqh(a = "header")
    private RequestSetBillLimitHeader header;

    public RequestSetBillLimitHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestSetBillLimitHeader requestSetBillLimitHeader) {
        this.header = requestSetBillLimitHeader;
    }

    public RequestSetBillLimitBody getBody() {
        return this.body;
    }

    public void setBody(RequestSetBillLimitBody requestSetBillLimitBody) {
        this.body = requestSetBillLimitBody;
    }
}
