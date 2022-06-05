package com.ucare.we.model.FamilyNumberModel;

/* loaded from: classes2.dex */
public class AddFamilyNumberResponse {
    @cqh(a = "body")
    AddFamilyNumberResponseBody body;
    @cqh(a = "header")
    AddFamilyNumberResponseHeader header;

    public AddFamilyNumberResponseBody getBody() {
        return this.body;
    }

    public void setBody(AddFamilyNumberResponseBody addFamilyNumberResponseBody) {
        this.body = addFamilyNumberResponseBody;
    }

    public AddFamilyNumberResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(AddFamilyNumberResponseHeader addFamilyNumberResponseHeader) {
        this.header = addFamilyNumberResponseHeader;
    }
}
