package com.ucare.we.model.family;

import com.ucare.we.model.Header;

/* loaded from: classes2.dex */
public class FamilyCreateGroupResponse {
    @cqh(a = "body")
    @cqf
    public FamilyCreateGroupResponseBody body;
    @cqh(a = "header")
    @cqf
    public Header header;

    public Header getHeader() {
        return this.header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public FamilyCreateGroupResponseBody getBody() {
        return this.body;
    }

    public void setBody(FamilyCreateGroupResponseBody familyCreateGroupResponseBody) {
        this.body = familyCreateGroupResponseBody;
    }
}
