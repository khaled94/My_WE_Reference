package com.ucare.we.model.local.family;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FamilySuppOffersRequestBody {
    @cqh(a = "groupId")
    private String groupId;
    @cqh(a = "offers")
    ArrayList<OffersRequestArray> offers;

    public FamilySuppOffersRequestBody(String str, ArrayList<OffersRequestArray> arrayList) {
        this.groupId = str;
        this.offers = arrayList;
    }

    public ArrayList<OffersRequestArray> getOffers() {
        return this.offers;
    }

    public void setOffers(ArrayList<OffersRequestArray> arrayList) {
        this.offers = arrayList;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }
}
