package com.ucare.we.model.MoreBundleModel;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ResponseViewMoreBundle {
    @cqh(a = "body")
    ArrayList<ResponseViewMoreBundleBody> body;
    @cqh(a = "header")
    ResponseViewMoreBundleHeader header;

    public ArrayList<ResponseViewMoreBundleBody> getBody() {
        return this.body;
    }

    public void setBody(ArrayList<ResponseViewMoreBundleBody> arrayList) {
        this.body = arrayList;
    }

    public ResponseViewMoreBundleHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseViewMoreBundleHeader responseViewMoreBundleHeader) {
        this.header = responseViewMoreBundleHeader;
    }
}
