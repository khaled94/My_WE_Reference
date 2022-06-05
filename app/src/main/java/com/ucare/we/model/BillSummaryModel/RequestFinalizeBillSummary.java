package com.ucare.we.model.BillSummaryModel;

import com.ucare.we.model.MainRequestsHeader;

/* loaded from: classes2.dex */
public class RequestFinalizeBillSummary {
    @cqh(a = "body")
    RequestFinalizeBillSummaryBody body;
    @cqh(a = "header")
    MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public RequestFinalizeBillSummaryBody getBody() {
        return this.body;
    }

    public void setBody(RequestFinalizeBillSummaryBody requestFinalizeBillSummaryBody) {
        this.body = requestFinalizeBillSummaryBody;
    }
}
