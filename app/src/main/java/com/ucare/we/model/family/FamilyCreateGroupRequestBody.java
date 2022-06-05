package com.ucare.we.model.family;

/* loaded from: classes2.dex */
public class FamilyCreateGroupRequestBody {
    @cqh(a = "offerId")
    private String offerId;

    public FamilyCreateGroupRequestBody() {
    }

    public FamilyCreateGroupRequestBody(String str) {
        this.offerId = str;
    }

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String str) {
        this.offerId = str;
    }
}
