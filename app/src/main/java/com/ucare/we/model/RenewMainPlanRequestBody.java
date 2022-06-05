package com.ucare.we.model;

import java.util.List;

/* loaded from: classes2.dex */
public class RenewMainPlanRequestBody {
    @cqh(a = "msisdn")
    private String msisdn;
    @cqh(a = "offers")
    private List<Offer> offers;

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String str) {
        this.msisdn = str;
    }

    public List<Offer> getOffers() {
        return this.offers;
    }

    public void setOffers(List<Offer> list) {
        this.offers = list;
    }
}
