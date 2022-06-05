package com.ucare.we.model;

/* loaded from: classes2.dex */
public class LoginRequestBody {
    @cqh(a = "password")
    private String password;

    public LoginRequestBody(String str) {
        this.password = str;
    }

    public String getPassword() {
        return this.password;
    }
}
