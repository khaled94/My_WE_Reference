package com.ucare.we.model.SocialMediaModel;

/* loaded from: classes2.dex */
public class ProviderStatusObject {
    @cqh(a = "linked")
    boolean linked;
    @cqh(a = "loginEnabled")
    boolean loginEnabled;
    @cqh(a = "providerName")
    String providerName;

    public String getProviderName() {
        return this.providerName;
    }

    public void setProviderName(String str) {
        this.providerName = str;
    }

    public boolean isLinked() {
        return this.linked;
    }

    public void setLinked(boolean z) {
        this.linked = z;
    }

    public boolean isLoginEnabled() {
        return this.loginEnabled;
    }

    public void setLoginEnabled(boolean z) {
        this.loginEnabled = z;
    }
}
