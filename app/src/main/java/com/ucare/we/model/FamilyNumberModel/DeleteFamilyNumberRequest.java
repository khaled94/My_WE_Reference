package com.ucare.we.model.FamilyNumberModel;

/* loaded from: classes2.dex */
public class DeleteFamilyNumberRequest {
    @cqh(a = "body")
    DeleteFamilyNumberRequestBody body;
    @cqh(a = "header")
    DeleteFamilyNumberRequestHeader header;

    public DeleteFamilyNumberRequestBody getBody() {
        return this.body;
    }

    public void setBody(DeleteFamilyNumberRequestBody deleteFamilyNumberRequestBody) {
        this.body = deleteFamilyNumberRequestBody;
    }

    public DeleteFamilyNumberRequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(DeleteFamilyNumberRequestHeader deleteFamilyNumberRequestHeader) {
        this.header = deleteFamilyNumberRequestHeader;
    }
}
