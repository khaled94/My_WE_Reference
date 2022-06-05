package com.ucare.we.model.SocialMediaModel;

/* loaded from: classes2.dex */
public class LinkToSocialRequestBody {
    @cqh(a = "providerName")
    String providerName;
    @cqh(a = "socialLogin")
    boolean socialLogin;
    @cqh(a = "socialUserToken")
    String socialUserToken;
    @cqh(a = "tokenType")
    int tokenType;

    public boolean isSocialLogin() {
        return this.socialLogin;
    }

    public void setSocialLogin(boolean z) {
        this.socialLogin = z;
    }

    public int getTokenType() {
        return this.tokenType;
    }

    public void setTokenType(int i) {
        this.tokenType = i;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public void setProviderName(String str) {
        this.providerName = str;
    }

    public String getSocialUserToken() {
        return this.socialUserToken;
    }

    public void setSocialUserToken(String str) {
        this.socialUserToken = str;
    }
}
