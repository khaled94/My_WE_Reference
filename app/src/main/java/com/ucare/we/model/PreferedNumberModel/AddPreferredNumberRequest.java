package com.ucare.we.model.PreferedNumberModel;

/* loaded from: classes2.dex */
public class AddPreferredNumberRequest {
    @cqh(a = "body")
    AddPreferredNumberRequestBody body;
    @cqh(a = "header")
    AddPreferredNumberRequestHeader header;

    public AddPreferredNumberRequestBody getBody() {
        return this.body;
    }

    public void setBody(AddPreferredNumberRequestBody addPreferredNumberRequestBody) {
        this.body = addPreferredNumberRequestBody;
    }

    public AddPreferredNumberRequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(AddPreferredNumberRequestHeader addPreferredNumberRequestHeader) {
        this.header = addPreferredNumberRequestHeader;
    }
}
