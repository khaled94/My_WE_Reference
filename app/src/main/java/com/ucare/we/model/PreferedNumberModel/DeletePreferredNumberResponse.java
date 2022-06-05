package com.ucare.we.model.PreferedNumberModel;

/* loaded from: classes2.dex */
public class DeletePreferredNumberResponse {
    @cqh(a = "body")
    DeletePreferredNumberResponseBody body;
    @cqh(a = "header")
    DeletePreferredNumberResponseHeader header;

    public DeletePreferredNumberResponseBody getBody() {
        return this.body;
    }

    public void setBody(DeletePreferredNumberResponseBody deletePreferredNumberResponseBody) {
        this.body = deletePreferredNumberResponseBody;
    }

    public DeletePreferredNumberResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(DeletePreferredNumberResponseHeader deletePreferredNumberResponseHeader) {
        this.header = deletePreferredNumberResponseHeader;
    }
}
