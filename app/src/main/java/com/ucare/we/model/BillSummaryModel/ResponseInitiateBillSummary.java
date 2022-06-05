package com.ucare.we.model.BillSummaryModel;

/* loaded from: classes2.dex */
public class ResponseInitiateBillSummary {
    @cqh(a = "body")
    ResponseInitiateBillSummaryBody body;
    @cqh(a = "header")
    ResponseInitiateBillSummaryHeader header;

    public ResponseInitiateBillSummaryBody getBody() {
        return this.body;
    }

    public void setBody(ResponseInitiateBillSummaryBody responseInitiateBillSummaryBody) {
        this.body = responseInitiateBillSummaryBody;
    }

    public ResponseInitiateBillSummaryHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseInitiateBillSummaryHeader responseInitiateBillSummaryHeader) {
        this.header = responseInitiateBillSummaryHeader;
    }
}
