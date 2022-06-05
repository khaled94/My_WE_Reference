package com.ucare.we.model;

/* loaded from: classes2.dex */
public class LoginRequest {
    @cqh(a = "body")
    passwordBody body;
    @cqh(a = "header")
    Header header;

    public LoginRequest(Header header, passwordBody passwordbody) {
        this.header = header;
        this.body = passwordbody;
    }
}
