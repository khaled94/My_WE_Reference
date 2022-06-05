package com.ucare.we.model.RegionalProducts;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class RegionalProductDismissRequest {
    @cqh(a = "body")
    private String body;
    @cqh(a = "header")
    private RequestHeader header;

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }
}
