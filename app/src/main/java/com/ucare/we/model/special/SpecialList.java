package com.ucare.we.model.special;

import com.ucare.we.model.MoreBundleModel.AddOnGroupOfferingsID;

/* loaded from: classes2.dex */
public class SpecialList {
    @cqh(a = "addOnGroupOfferingsID")
    @cqf
    private AddOnGroupOfferingsID addOnGroupOfferingsID;
    @cqh(a = "alreadySubscribed")
    @cqf
    private Boolean alreadySubscribed;
    @cqh(a = "offerArName")
    @cqf
    private String offerArName;
    @cqh(a = "offerEnName")
    @cqf
    private String offerEnName;
    @cqh(a = "offerId")
    @cqf
    private String offerId;
    @cqh(a = "price")
    @cqf
    private Integer price;
    @cqh(a = "renewable")
    @cqf
    private Boolean renewable;
    @cqh(a = "subType")
    @cqf
    private String subType;
    @cqh(a = "type")
    @cqf
    private String type;

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

    public Boolean getAlreadySubscribed() {
        return this.alreadySubscribed;
    }

    public void setAlreadySubscribed(Boolean bool) {
        this.alreadySubscribed = bool;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer num) {
        this.price = num;
    }

    public Boolean getRenewable() {
        return this.renewable;
    }

    public void setRenewable(Boolean bool) {
        this.renewable = bool;
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
