package com.ucare.we.model.AutoRechargeModel;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class GetAutoRechargeDefaultValuesRequest {
    @cqh(a = "body")
    GetAutoRechargeDefaultValuesRequestBody body;
    @cqh(a = "header")
    RequestHeader header;

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    public GetAutoRechargeDefaultValuesRequestBody getBody() {
        return this.body;
    }

    public void setBody(GetAutoRechargeDefaultValuesRequestBody getAutoRechargeDefaultValuesRequestBody) {
        this.body = getAutoRechargeDefaultValuesRequestBody;
    }
}
