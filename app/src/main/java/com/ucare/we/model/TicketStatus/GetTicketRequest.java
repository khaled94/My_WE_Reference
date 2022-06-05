package com.ucare.we.model.TicketStatus;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class GetTicketRequest {
    @cqh(a = "body")
    @cqf
    private GetTicketBody body;
    @cqh(a = "header")
    @cqf
    private RequestHeader header;

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    public GetTicketBody getBody() {
        return this.body;
    }

    public void setBody(GetTicketBody getTicketBody) {
        this.body = getTicketBody;
    }
}
