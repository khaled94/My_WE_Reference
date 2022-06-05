package com.ucare.we.model.MoreBundleModel;

/* loaded from: classes2.dex */
public class RequestRetrieveMoreBundle {
    @cqh(a = "body")
    RequestRetrieveMoreBundleBody body;
    @cqh(a = "header")
    RequestRetrieveMoreBundleHeader header;

    public RequestRetrieveMoreBundleHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestRetrieveMoreBundleHeader requestRetrieveMoreBundleHeader) {
        this.header = requestRetrieveMoreBundleHeader;
    }

    public RequestRetrieveMoreBundleBody getBody() {
        return this.body;
    }

    public void setBody(RequestRetrieveMoreBundleBody requestRetrieveMoreBundleBody) {
        this.body = requestRetrieveMoreBundleBody;
    }
}
