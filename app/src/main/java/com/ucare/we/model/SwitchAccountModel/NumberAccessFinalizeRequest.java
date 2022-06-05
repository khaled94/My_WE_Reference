package com.ucare.we.model.SwitchAccountModel;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class NumberAccessFinalizeRequest {
    @cqh(a = "body")
    @cqf
    private NumberAccessFinalizeRequestBody body;
    @cqh(a = "header")
    @cqf
    private RequestHeader header;

    public NumberAccessFinalizeRequestBody getBody() {
        return this.body;
    }

    public void setBody(NumberAccessFinalizeRequestBody numberAccessFinalizeRequestBody) {
        this.body = numberAccessFinalizeRequestBody;
    }

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }
}
