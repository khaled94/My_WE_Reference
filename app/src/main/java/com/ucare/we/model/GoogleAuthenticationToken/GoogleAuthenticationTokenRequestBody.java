package com.ucare.we.model.GoogleAuthenticationToken;

/* loaded from: classes2.dex */
public class GoogleAuthenticationTokenRequestBody {
    @cqh(a = "client_id")
    String client_id;
    @cqh(a = "client_secret")
    String client_secret;
    @cqh(a = "code")
    String code;
    @cqh(a = "grant_type")
    String grant_type;
    @cqh(a = "redirect_uri")
    String redirect_uri;

    public String getGrant_type() {
        return this.grant_type;
    }

    public void setGrant_type(String str) {
        this.grant_type = str;
    }

    public String getClient_id() {
        return this.client_id;
    }

    public void setClient_id(String str) {
        this.client_id = str;
    }

    public String getClient_secret() {
        return this.client_secret;
    }

    public void setClient_secret(String str) {
        this.client_secret = str;
    }

    public String getRedirect_uri() {
        return this.redirect_uri;
    }

    public void setRedirect_uri(String str) {
        this.redirect_uri = str;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }
}
