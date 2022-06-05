package com.ucare.we.model.HomeCollection;

import com.ucare.we.model.MainRequestsHeader;

/* loaded from: classes2.dex */
public class HomeCollectionRequest {
    @cqh(a = "body")
    @cqf
    private HomeCollectionRequestBody body;
    @cqh(a = "header")
    @cqf
    private MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public HomeCollectionRequestBody getBody() {
        return this.body;
    }

    public void setBody(HomeCollectionRequestBody homeCollectionRequestBody) {
        this.body = homeCollectionRequestBody;
    }
}
