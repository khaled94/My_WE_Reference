package com.ucare.we.model.QuotaTransferModel;

import com.ucare.we.model.MainRequestsHeader;
import com.ucare.we.model.usagedetails.DetailedLineUsageItem;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class QuotaTransferOptionsRequest {
    @cqh(a = "body")
    public ArrayList<DetailedLineUsageItem> body;
    @cqh(a = "header")
    public MainRequestsHeader header;

    public ArrayList<DetailedLineUsageItem> getBody() {
        return this.body;
    }

    public void setBody(ArrayList<DetailedLineUsageItem> arrayList) {
        this.body = arrayList;
    }

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }
}
