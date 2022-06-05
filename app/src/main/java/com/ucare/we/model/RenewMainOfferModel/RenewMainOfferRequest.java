package com.ucare.we.model.RenewMainOfferModel;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class RenewMainOfferRequest {
    @cqh(a = "body")
    private RenewMainOfferRequestBody body;
    @cqh(a = "header")
    private RequestHeader header;

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    public RenewMainOfferRequestBody getBody() {
        return this.body;
    }

    public void setBody(RenewMainOfferRequestBody renewMainOfferRequestBody) {
        this.body = renewMainOfferRequestBody;
    }
}
