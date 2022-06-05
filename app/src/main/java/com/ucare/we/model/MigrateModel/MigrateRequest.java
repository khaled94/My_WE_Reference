package com.ucare.we.model.MigrateModel;

import com.ucare.we.model.RequestHeader;

/* loaded from: classes2.dex */
public class MigrateRequest {
    @cqh(a = "body")
    @cqf
    private MigrateRequestBody body;
    @cqh(a = "header")
    @cqf
    private RequestHeader header;

    public RequestHeader getHeader() {
        return this.header;
    }

    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    public MigrateRequestBody getBody() {
        return this.body;
    }

    public void setBody(MigrateRequestBody migrateRequestBody) {
        this.body = migrateRequestBody;
    }
}
