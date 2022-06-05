package com.ucare.we.model.AutoRechargeModel;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class UpdateAutoRechargeRequest {
    @cqh(a = "body")
    UpdateAutoRechargeRequestBody body;
    @cqh(a = "header")
    RequestHeader header;

    public UpdateAutoRechargeRequestBody getBody() {
        return this.body;
    }

    public void setBody(UpdateAutoRechargeRequestBody updateAutoRechargeRequestBody) {
        this.body = updateAutoRechargeRequestBody;
    }

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }
}
