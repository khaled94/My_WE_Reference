package com.ucare.we.model.RenewMainOfferModel;

import com.ucare.we.model.ResponseHeader;

/* loaded from: classes2.dex */
public class RenewMainOfferResponse {
    @cqh(a = "body")
    String body;
    @cqh(a = "header")
    ResponseHeader header;

    public ResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseHeader responseHeader) {
        this.header = responseHeader;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }
}
