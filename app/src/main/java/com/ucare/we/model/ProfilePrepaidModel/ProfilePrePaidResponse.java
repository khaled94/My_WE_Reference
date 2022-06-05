package com.ucare.we.model.ProfilePrepaidModel;

import com.ucare.we.model.CustomerProfile;
import com.ucare.we.model.Header;

/* loaded from: classes2.dex */
public class ProfilePrePaidResponse {
    @cqh(a = "body")
    @cqf
    public CustomerProfile body;
    @cqh(a = "header")
    @cqf
    public Header header;

    public Header getHeader() {
        return this.header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public CustomerProfile getBody() {
        return this.body;
    }

    public void setBody(CustomerProfile customerProfile) {
        this.body = customerProfile;
    }
}
