package com.ucare.we.model.BillSummaryModel;

import com.ucare.we.model.Header;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ResponseFinalizeBillSummary {
    @cqh(a = "body")
    ArrayList<ResponseFinalizeBillSummaryBody> body;
    @cqh(a = "header")
    Header header;

    public Header getHeader() {
        return this.header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public ArrayList<ResponseFinalizeBillSummaryBody> getBody() {
        return this.body;
    }

    public void setBody(ArrayList<ResponseFinalizeBillSummaryBody> arrayList) {
        this.body = arrayList;
    }
}
