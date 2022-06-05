package com.ucare.we.model.deactivatefbb;

import com.ucare.we.model.MoreBundleModel.ResponseUnsubscribeFromMoreBundleHeader;

/* loaded from: classes2.dex */
public class DeactivateRequest {
    @cqh(a = "body")
    String body;
    @cqh(a = "header")
    ResponseUnsubscribeFromMoreBundleHeader header;

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public ResponseUnsubscribeFromMoreBundleHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseUnsubscribeFromMoreBundleHeader responseUnsubscribeFromMoreBundleHeader) {
        this.header = responseUnsubscribeFromMoreBundleHeader;
    }
}
