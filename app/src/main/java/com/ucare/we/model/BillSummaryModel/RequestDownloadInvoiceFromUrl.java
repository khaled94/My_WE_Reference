package com.ucare.we.model.BillSummaryModel;

import com.ucare.we.model.MainRequestsHeader;

/* loaded from: classes2.dex */
public class RequestDownloadInvoiceFromUrl {
    @cqh(a = "body")
    RequestDownloadInvoiceFromUrlBody body;
    @cqh(a = "header")
    MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public RequestDownloadInvoiceFromUrlBody getBody() {
        return this.body;
    }

    public void setBody(RequestDownloadInvoiceFromUrlBody requestDownloadInvoiceFromUrlBody) {
        this.body = requestDownloadInvoiceFromUrlBody;
    }
}
