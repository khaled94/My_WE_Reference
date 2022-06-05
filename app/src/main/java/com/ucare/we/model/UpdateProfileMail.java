package com.ucare.we.model;

/* loaded from: classes2.dex */
public class UpdateProfileMail {
    @cqh(a = "body")
    private UpdateProfileMailBody body;
    @cqh(a = "header")
    private MainRequestsHeader header;

    public MainRequestsHeader getHeader() {
        return this.header;
    }

    public void setHeader(MainRequestsHeader mainRequestsHeader) {
        this.header = mainRequestsHeader;
    }

    public UpdateProfileMailBody getBody() {
        return this.body;
    }

    public void setBody(UpdateProfileMailBody updateProfileMailBody) {
        this.body = updateProfileMailBody;
    }
}
