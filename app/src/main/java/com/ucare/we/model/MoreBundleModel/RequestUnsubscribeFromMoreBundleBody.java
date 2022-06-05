package com.ucare.we.model.MoreBundleModel;

import com.ucare.we.model.SignInModel.GroupID;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class RequestUnsubscribeFromMoreBundleBody extends GroupID {
    @cqh(a = "msisdn")
    String msisdn;
    @cqh(a = "offers")
    ArrayList<Offer> offers;

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public ArrayList<Offer> getOffers() {
        return this.offers;
    }

    public void setOffers(ArrayList<Offer> arrayList) {
        this.offers = arrayList;
    }
}
