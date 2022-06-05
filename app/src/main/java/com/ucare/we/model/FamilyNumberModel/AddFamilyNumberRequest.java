package com.ucare.we.model.FamilyNumberModel;

/* loaded from: classes2.dex */
public class AddFamilyNumberRequest {
    @cqh(a = "body")
    AddFamilyNumberRequestBody body;
    @cqh(a = "header")
    AddFamilyNumberRequestHeader header;

    public AddFamilyNumberRequestBody getBody() {
        return this.body;
    }

    public void setBody(AddFamilyNumberRequestBody addFamilyNumberRequestBody) {
        this.body = addFamilyNumberRequestBody;
    }

    public AddFamilyNumberRequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(AddFamilyNumberRequestHeader addFamilyNumberRequestHeader) {
        this.header = addFamilyNumberRequestHeader;
    }
}
