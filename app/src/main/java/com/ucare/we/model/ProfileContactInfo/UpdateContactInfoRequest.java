package com.ucare.we.model.ProfileContactInfo;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class UpdateContactInfoRequest {
    @cqh(a = "body")
    private UpdateContactInfoRequestBody body;
    @cqh(a = "header")
    private RequestHeader header;

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    public UpdateContactInfoRequestBody getBody() {
        return this.body;
    }

    public void setBody(UpdateContactInfoRequestBody updateContactInfoRequestBody) {
        this.body = updateContactInfoRequestBody;
    }
}
