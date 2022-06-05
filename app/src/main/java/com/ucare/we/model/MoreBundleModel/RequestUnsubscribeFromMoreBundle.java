package com.ucare.we.model.MoreBundleModel;

/* loaded from: classes2.dex */
public class RequestUnsubscribeFromMoreBundle {
    @cqh(a = "body")
    RequestUnsubscribeFromMoreBundleBody body;
    @cqh(a = "header")
    RequestUnsubscribeFromMoreBundleHeader header;

    public RequestUnsubscribeFromMoreBundleBody getBody() {
        return this.body;
    }

    public void setBody(RequestUnsubscribeFromMoreBundleBody requestUnsubscribeFromMoreBundleBody) {
        this.body = requestUnsubscribeFromMoreBundleBody;
    }

    public RequestUnsubscribeFromMoreBundleHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestUnsubscribeFromMoreBundleHeader requestUnsubscribeFromMoreBundleHeader) {
        this.header = requestUnsubscribeFromMoreBundleHeader;
    }
}
