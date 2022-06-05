package com.ucare.we.model;

/* loaded from: classes2.dex */
public class MainPlanRequest {
    @cqh(a = "body")
    private MainPlanBody body;
    @cqh(a = "header")
    private MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public MainPlanBody getBody() {
        return this.body;
    }

    public void setBody(MainPlanBody mainPlanBody) {
        this.body = mainPlanBody;
    }
}
