package com.ucare.we.model.GetCreditCardInfoFinalize;

import com.ucare.we.model.Header;

/* loaded from: classes2.dex */
public class GetCreditCardInfoResponse {
    @cqh(a = "body")
    public GetCreditCardInfoResponseBody body;
    @cqh(a = "header")
    public Header header;

    public Header getHeader() {
        return this.header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public GetCreditCardInfoResponseBody getBody() {
        return this.body;
    }

    public void setBody(GetCreditCardInfoResponseBody getCreditCardInfoResponseBody) {
        this.body = getCreditCardInfoResponseBody;
    }
}
