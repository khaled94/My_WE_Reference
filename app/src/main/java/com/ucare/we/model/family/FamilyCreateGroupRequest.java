package com.ucare.we.model.family;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class FamilyCreateGroupRequest {
    @cqh(a = "body")
    private FamilyCreateGroupRequestBody body;
    @cqh(a = "header")
    private RequestHeader header;

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    public FamilyCreateGroupRequestBody getBody() {
        return this.body;
    }

    public void setBody(FamilyCreateGroupRequestBody familyCreateGroupRequestBody) {
        this.body = familyCreateGroupRequestBody;
    }
}
