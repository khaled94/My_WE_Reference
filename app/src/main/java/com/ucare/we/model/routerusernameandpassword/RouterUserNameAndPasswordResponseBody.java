package com.ucare.we.model.routerusernameandpassword;

/* loaded from: classes2.dex */
public class RouterUserNameAndPasswordResponseBody {
    @cqh(a = "routerPassword")
    String routerPassword;
    @cqh(a = "routerUserName")
    String routerUserName;

    public String getRouterUserName() {
        return this.routerUserName;
    }

    public void setRouterUserName(String str) {
        this.routerUserName = str;
    }

    public String getRouterPassword() {
        return this.routerPassword;
    }

    public void setRouterPassword(String str) {
        this.routerPassword = str;
    }
}
