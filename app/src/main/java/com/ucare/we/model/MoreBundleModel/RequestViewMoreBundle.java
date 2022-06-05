package com.ucare.we.model.MoreBundleModel;

/* loaded from: classes2.dex */
public class RequestViewMoreBundle {
    @cqh(a = "body")
    RequestViewMoreBundleBody body;
    @cqh(a = "header")
    RequestViewMoreBundleHeader header;

    public RequestViewMoreBundleBody getBody() {
        return this.body;
    }

    public void setBody(RequestViewMoreBundleBody requestViewMoreBundleBody) {
        this.body = requestViewMoreBundleBody;
    }

    public RequestViewMoreBundleHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestViewMoreBundleHeader requestViewMoreBundleHeader) {
        this.header = requestViewMoreBundleHeader;
    }
}
