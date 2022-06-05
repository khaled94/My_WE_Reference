package com.ucare.we.model;

/* loaded from: classes2.dex */
public class SignUpResponsBody {
    @cqh(a = "bundelOfferSubscription")
    private boolean bundelOfferSubscription;
    @cqh(a = "registered")
    private boolean registered;

    public boolean isRegistered() {
        return this.registered;
    }

    public void setRegistered(boolean z) {
        this.registered = z;
    }

    public boolean isBundelOfferSubscription() {
        return this.bundelOfferSubscription;
    }

    public void setBundelOfferSubscription(boolean z) {
        this.bundelOfferSubscription = z;
    }
}
