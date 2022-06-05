package com.ucare.we.model.SignInModel;

/* loaded from: classes2.dex */
public class GroupFamilyModel {
    @cqh(a = "id")
    String id;
    @cqh(a = "isSubscribed")
    boolean isSubscribed = false;
    @cqh(a = "owner")
    boolean owner = false;

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public boolean isSubscribed() {
        return this.isSubscribed;
    }

    public void setSubscribed(boolean z) {
        this.isSubscribed = z;
    }

    public boolean isOwner() {
        return this.owner;
    }

    public void setOwner(boolean z) {
        this.owner = z;
    }
}
