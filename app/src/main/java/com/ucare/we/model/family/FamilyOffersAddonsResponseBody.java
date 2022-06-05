package com.ucare.we.model.family;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FamilyOffersAddonsResponseBody {
    @cqh(a = "availableAddOnOfferingsList")
    ArrayList<FamilyAvailableOffersAddonsList> availableAddOnOfferingsList;

    public ArrayList<FamilyAvailableOffersAddonsList> getAvailableAddOnOfferingsList() {
        return this.availableAddOnOfferingsList;
    }

    public void setAvailableAddOnOfferingsList(ArrayList<FamilyAvailableOffersAddonsList> arrayList) {
        this.availableAddOnOfferingsList = arrayList;
    }
}
