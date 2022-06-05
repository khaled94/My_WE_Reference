package com.ucare.we.model;

/* loaded from: classes2.dex */
public class DefaultResponse {
    @cqh(a = "body")
    public String body = null;
    @cqh(a = "header")
    public ResponseHeader header;

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
