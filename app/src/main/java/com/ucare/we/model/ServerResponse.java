package com.ucare.we.model;

/* loaded from: classes2.dex */
public class ServerResponse<T> {
    @cqh(a = "header")
    private ResponseHeader header = null;
    @cqh(a = "body")
    private T body = null;

    public ResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseHeader responseHeader) {
        this.header = responseHeader;
    }

    public T getBody() {
        return this.body;
    }

    public void setBody(T t) {
        this.body = t;
    }
}
