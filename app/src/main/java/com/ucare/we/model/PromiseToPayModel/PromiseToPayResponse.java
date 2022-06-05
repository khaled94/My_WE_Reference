package com.ucare.we.model.PromiseToPayModel;

import com.ucare.we.model.Header;

/* loaded from: classes2.dex */
public class PromiseToPayResponse {
    @cqh(a = "header")
    Header header = new Header();
    @cqh(a = "body")
    boolean showPromiseToPay;

    public Header getHeader() {
        return this.header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public boolean isShowPromiseToPay() {
        return this.showPromiseToPay;
    }

    public void setShowPromiseToPay(boolean z) {
        this.showPromiseToPay = z;
    }
}
