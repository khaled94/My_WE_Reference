package com.ucare.we.model.ConfirmationCode;

import com.ucare.we.model.Header;
import com.ucare.we.model.SendConfirmationResponseBody;

/* loaded from: classes2.dex */
public class ConfirmationCodeResponse {
    @cqh(a = "header")
    Header header;
    @cqh(a = "body")
    SendConfirmationResponseBody sendConfirmationResponseBody;

    public Header getHeader() {
        return this.header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public SendConfirmationResponseBody getSendConfirmationResponseBody() {
        return this.sendConfirmationResponseBody;
    }

    public void setSendConfirmationResponseBody(SendConfirmationResponseBody sendConfirmationResponseBody) {
        this.sendConfirmationResponseBody = sendConfirmationResponseBody;
    }
}
