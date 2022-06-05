package com.ucare.we.model.family;

import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingsList;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FamilyAvailableOffersAddonsList implements Serializable, Comparable {
    @cqh(a = "availableAddOnOfferingList")
    ArrayList<FamilyOffersAddonsList> availableAddOnOfferingList;
    @cqh(a = "childGroups")
    ArrayList<FamilyAvailableOffersAddonsList> childGroups;
    @cqh(a = "groupArName")
    String groupArName;
    @cqh(a = "groupEnName")
    String groupEnName;
    @cqh(a = "order")
    int order;

    public ArrayList<FamilyAvailableOffersAddonsList> getChildGroups() {
        return this.childGroups;
    }

    public void setChildGroups(ArrayList<FamilyAvailableOffersAddonsList> arrayList) {
        this.childGroups = arrayList;
    }

    public String getGroupEnName() {
        return this.groupEnName;
    }

    public void setGroupEnName(String str) {
        this.groupEnName = str;
    }

    public String getGroupArName() {
        return this.groupArName;
    }

    public void setGroupArName(String str) {
        this.groupArName = str;
    }

    public int getOrder() {
        return this.order;
    }

    public void setOrder(int i) {
        this.order = i;
    }

    public ArrayList<FamilyOffersAddonsList> getAvailableAddOnOfferingList() {
        return this.availableAddOnOfferingList;
    }

    public void setAvailableAddOnOfferingList(ArrayList<FamilyOffersAddonsList> arrayList) {
        this.availableAddOnOfferingList = arrayList;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.order - ((AvailableAddOnOfferingsList) obj).getOrder();
    }
}
