package com.ucare.we.model.SwitchAccountModel;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class NumberAccessInitializeRequest {
    @cqh(a = "body")
    @cqf
    private NumberAccessInitializeRequestBody body;
    @cqh(a = "header")
    @cqf
    private RequestHeader header;

    public NumberAccessInitializeRequestBody getBody() {
        return this.body;
    }

    public void setBody(NumberAccessInitializeRequestBody numberAccessInitializeRequestBody) {
        this.body = numberAccessInitializeRequestBody;
    }

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }
}
