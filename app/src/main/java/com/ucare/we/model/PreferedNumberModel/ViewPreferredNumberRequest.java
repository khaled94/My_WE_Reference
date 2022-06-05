package com.ucare.we.model.PreferedNumberModel;

/* loaded from: classes2.dex */
public class ViewPreferredNumberRequest {
    @cqh(a = "body")
    private ViewPreferredNumberRequestBody body;
    @cqh(a = "header")
    private ViewPreferredNumberRequestHeader header;

    public ViewPreferredNumberRequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(ViewPreferredNumberRequestHeader viewPreferredNumberRequestHeader) {
        this.header = viewPreferredNumberRequestHeader;
    }

    public ViewPreferredNumberRequestBody getBody() {
        return this.body;
    }

    public void setBody(ViewPreferredNumberRequestBody viewPreferredNumberRequestBody) {
        this.body = viewPreferredNumberRequestBody;
    }
}
