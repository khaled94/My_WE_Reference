package com.ucare.we.model.SubmitTicketModel;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class SubmitTicketRequest {
    @cqh(a = "body")
    @cqf
    private SubmitTicketRequestBody body;
    @cqh(a = "header")
    @cqf
    private RequestHeader header;

    public SubmitTicketRequestBody getBody() {
        return this.body;
    }

    public void setBody(SubmitTicketRequestBody submitTicketRequestBody) {
        this.body = submitTicketRequestBody;
    }

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }
}
