package com.ucare.we.model.family;

import com.ucare.we.model.MoreBundleModel.AddOnGroupOfferingsID;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class FamilyOffersAddonsList implements Serializable {
    @cqh(a = "addOnGroupOfferingsID")
    AddOnGroupOfferingsID addOnGroupOfferingsID;
    @cqh(a = "alreadySubscribed")
    boolean alreadySubscribed;
    @cqh(a = "isRegional")
    Boolean isRegional;
    @cqh(a = "offerArName")
    String offerArName;
    @cqh(a = "offerEnName")
    String offerEnName;
    @cqh(a = "offerId")
    String offerId;
    @cqh(a = "price")
    private float price;
    boolean show;
    @cqh(a = "subType")
    String subType;
    @cqh(a = "type")
    String type;

    public Boolean getRegional() {
        return this.isRegional;
    }

    public void setRegional(Boolean bool) {
        this.isRegional = bool;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float f) {
        this.price = f;
    }

    public boolean isShow() {
        return this.show;
    }

    public void setShow(boolean z) {
        this.show = z;
    }

    public String getOfferEnName() {
        return this.offerEnName;
    }

    public void setOfferEnName(String str) {
        this.offerEnName = str;
    }

    public String getOfferArName() {
        return this.offerArName;
    }

    public void setOfferArName(String str) {
        this.offerArName = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public boolean isAlreadySubscribed() {
        return this.alreadySubscribed;
    }

    public void setAlreadySubscribed(boolean z) {
        this.alreadySubscribed = z;
    }

    public String getSubType() {
        return this.subType;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String str) {
        this.offerId = str;
    }

    public AddOnGroupOfferingsID getAddOnGroupOfferingsID() {
        return this.addOnGroupOfferingsID;
    }

    public void setAddOnGroupOfferingsID(AddOnGroupOfferingsID addOnGroupOfferingsID) {
        this.addOnGroupOfferingsID = addOnGroupOfferingsID;
    }
}
