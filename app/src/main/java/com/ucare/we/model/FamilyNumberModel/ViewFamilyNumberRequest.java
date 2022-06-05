package com.ucare.we.model.FamilyNumberModel;

/* loaded from: classes2.dex */
public class ViewFamilyNumberRequest {
    @cqh(a = "body")
    private ViewFamilyNumberRequestBody body;
    @cqh(a = "header")
    private ViewFamilyNumberRequestHeader header;

    public ViewFamilyNumberRequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(ViewFamilyNumberRequestHeader viewFamilyNumberRequestHeader) {
        this.header = viewFamilyNumberRequestHeader;
    }

    public ViewFamilyNumberRequestBody getBody() {
        return this.body;
    }

    public void setBody(ViewFamilyNumberRequestBody viewFamilyNumberRequestBody) {
        this.body = viewFamilyNumberRequestBody;
    }
}
