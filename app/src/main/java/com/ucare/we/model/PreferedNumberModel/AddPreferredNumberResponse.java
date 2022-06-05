package com.ucare.we.model.PreferedNumberModel;

/* loaded from: classes2.dex */
public class AddPreferredNumberResponse {
    @cqh(a = "body")
    AddPreferredNumberResponseBody body;
    @cqh(a = "header")
    AddPreferredNumberResponseHeader header;

    public AddPreferredNumberResponseBody getBody() {
        return this.body;
    }

    public void setBody(AddPreferredNumberResponseBody addPreferredNumberResponseBody) {
        this.body = addPreferredNumberResponseBody;
    }

    public AddPreferredNumberResponseHeader getHeader() {
        return this.header;
    }

    public void setHeader(AddPreferredNumberResponseHeader addPreferredNumberResponseHeader) {
        this.header = addPreferredNumberResponseHeader;
    }
}
