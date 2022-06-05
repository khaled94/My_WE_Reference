package com.ucare.we.model.FMCModel;

import com.ucare.we.model.Header;

/* loaded from: classes2.dex */
public class FMCMemebrsResponse {
    @cqh(a = "body")
    FMCMemebrsResponseBody body;
    @cqh(a = "header")
    Header header;

    public Header getHeader() {
        return this.header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public FMCMemebrsResponseBody getBody() {
        return this.body;
    }

    public void setBody(FMCMemebrsResponseBody fMCMemebrsResponseBody) {
        this.body = fMCMemebrsResponseBody;
    }
}
