package com.ucare.we.model;

/* loaded from: classes2.dex */
public class DefaultRequest {
    @cqh(a = "body")
    private ebb body;
    @cqh(a = "header")
    private RequestHeader header;

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    public ebb getBody() {
        return this.body;
    }

    public void setBody(ebb ebbVar) {
        this.body = ebbVar;
    }
}
