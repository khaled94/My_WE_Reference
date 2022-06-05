package com.ucare.we.model.RenewMainOfferModel;

/* loaded from: classes2.dex */
public class RenewMainOfferRequestBody {
    @cqh(a = "offerId")
    String offerId;
    @cqh(a = "parentOfferId")
    String parentOfferId;

    public String getParentOfferId() {
        return this.parentOfferId;
    }

    public void setParentOfferId(String str) {
        this.parentOfferId = str;
    }

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String str) {
        this.offerId = str;
    }
}
