package com.ucare.we.model.QuotaTransferModel;

import com.ucare.we.model.ResponseHeader;

/* loaded from: classes2.dex */
public class QuotaTransferResponse {
    @cqh(a = "body")
    public QuotaTransferResponseBody body;
    @cqh(a = "header")
    public ResponseHeader header;

    public ResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseHeader responseHeader) {
        this.header = responseHeader;
    }

    public QuotaTransferResponseBody getBody() {
        return this.body;
    }

    public void setBody(QuotaTransferResponseBody quotaTransferResponseBody) {
        this.body = quotaTransferResponseBody;
    }
}
