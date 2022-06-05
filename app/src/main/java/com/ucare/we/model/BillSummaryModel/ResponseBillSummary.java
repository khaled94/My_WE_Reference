package com.ucare.we.model.BillSummaryModel;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ResponseBillSummary {
    @cqh(a = "body")
    ArrayList<ResponseBillSummaryBody> body;
    @cqh(a = "header")
    ResponseBillSummaryHeader header;

    public ResponseBillSummaryHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseBillSummaryHeader responseBillSummaryHeader) {
        this.header = responseBillSummaryHeader;
    }

    public ArrayList<ResponseBillSummaryBody> getBody() {
        return this.body;
    }

    public void setBody(ArrayList<ResponseBillSummaryBody> arrayList) {
        this.body = arrayList;
    }
}
