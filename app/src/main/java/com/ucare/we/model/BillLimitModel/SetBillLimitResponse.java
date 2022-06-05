package com.ucare.we.model.BillLimitModel;

/* loaded from: classes2.dex */
public class SetBillLimitResponse {
    @cqh(a = "body")
    public String body;
    @cqh(a = "header")
    public ResponseSetBillLimitHeader header;

    public ResponseSetBillLimitHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseSetBillLimitHeader responseSetBillLimitHeader) {
        this.header = responseSetBillLimitHeader;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }
}
