package com.ucare.we.model.FamilyNumberModel;

/* loaded from: classes2.dex */
public class DeleteFamilyNumberResponse {
    @cqh(a = "body")
    DeleteFamilyNumberResponseBody body;
    @cqh(a = "header")
    DeleteFamilyNumberResponseHeader header;

    public DeleteFamilyNumberResponseBody getBody() {
        return this.body;
    }

    public void setBody(DeleteFamilyNumberResponseBody deleteFamilyNumberResponseBody) {
        this.body = deleteFamilyNumberResponseBody;
    }

    public DeleteFamilyNumberResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(DeleteFamilyNumberResponseHeader deleteFamilyNumberResponseHeader) {
        this.header = deleteFamilyNumberResponseHeader;
    }
}
