package com.ucare.we.model.PreferedNumberModel;

/* loaded from: classes2.dex */
public class DeletePreferredNumberRequest {
    @cqh(a = "body")
    DeletePreferredNumberRequestBody body;
    @cqh(a = "header")
    DeletePreferredNumberRequestHeader header;

    public DeletePreferredNumberRequestBody getBody() {
        return this.body;
    }

    public void setBody(DeletePreferredNumberRequestBody deletePreferredNumberRequestBody) {
        this.body = deletePreferredNumberRequestBody;
    }

    public DeletePreferredNumberRequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(DeletePreferredNumberRequestHeader deletePreferredNumberRequestHeader) {
        this.header = deletePreferredNumberRequestHeader;
    }
}
