package com.ucare.we.model.RegionalProducts;

import com.ucare.we.model.MoreBundleModel.ResponseViewMoreBundleHeader;
import java.util.List;

/* loaded from: classes2.dex */
public class RegionalPlansResponse {
    @cqh(a = "body")
    List<RegionalPlansResponseBody> body;
    @cqh(a = "header")
    ResponseViewMoreBundleHeader header;

    public List<RegionalPlansResponseBody> getBody() {
        return this.body;
    }

    public void setBody(List<RegionalPlansResponseBody> list) {
        this.body = list;
    }

    public ResponseViewMoreBundleHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseViewMoreBundleHeader responseViewMoreBundleHeader) {
        this.header = responseViewMoreBundleHeader;
    }
}
