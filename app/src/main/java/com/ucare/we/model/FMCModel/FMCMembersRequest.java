package com.ucare.we.model.FMCModel;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class FMCMembersRequest {
    @cqh(a = "body")
    FMCMembersRequestBody fmcMembersRequestBody;
    @cqh(a = "header")
    RequestHeader header;

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    public FMCMembersRequestBody getFmcMembersRequestBody() {
        return this.fmcMembersRequestBody;
    }

    public void setFmcMembersRequestBody(FMCMembersRequestBody fMCMembersRequestBody) {
        this.fmcMembersRequestBody = fMCMembersRequestBody;
    }
}
