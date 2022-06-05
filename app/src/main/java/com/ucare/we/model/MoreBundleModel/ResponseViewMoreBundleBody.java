package com.ucare.we.model.MoreBundleModel;

import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class ResponseViewMoreBundleBody {
    @cqh(a = "addOn")
    boolean addOn;
    @cqh(a = "alreadySubscribed")
    boolean alreadySubscribed;
    @cqh(a = "main")
    boolean main;
    @cqh(a = "offerArName")
    String offerArName;
    @cqh(a = "offerDetails")
    OfferDetails offerDetails;
    @cqh(a = "offerEnName")
    String offerEnName;
    @cqh(a = "offerId")
    String offerId;
    @cqh(a = "parentOfferId")
    private String parentOfferId;
    @cqh(a = "price")
    String price;
    @cqh(a = "primary")
    boolean primary;
    @cqh(a = "remainingDaysForRenewal")
    String remainingDaysForRenewal;
    @cqh(a = "renewable")
    boolean renewable;
    @cqh(a = "renewalDate")
    String renewalDate;
    @cqh(a = "renewalInfo")
    Renewal_Info renewalInfo;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    String status;
    @cqh(a = "statusCode")
    String statusCode;
    @cqh(a = "subscriptionDate")
    String subscriptionDate;
    @cqh(a = "vas")
    boolean vas;

    public String getParentOfferId() {
        return this.parentOfferId;
    }

    public void setParentOfferId(String str) {
        this.parentOfferId = str;
    }

    public Renewal_Info getRenewalInfo() {
        return this.renewalInfo;
    }

    public void setRenewalInfo(Renewal_Info renewal_Info) {
        this.renewalInfo = renewal_Info;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String str) {
        this.statusCode = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public boolean isPrimary() {
        return this.primary;
    }

    public boolean isMain() {
        return this.main;
    }

    public boolean isAlreadySubscribed() {
        return this.alreadySubscribed;
    }

    public boolean isAddOn() {
        return this.addOn;
    }

    public boolean isVas() {
        return this.vas;
    }

    public boolean isRenewable() {
        return this.renewable;
    }

    public void setRenewable(boolean z) {
        this.renewable = z;
    }

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String str) {
        this.offerId = str;
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

    public boolean getPrimary() {
        return this.primary;
    }

    public void setPrimary(boolean z) {
        this.primary = z;
    }

    public String getSubscriptionDate() {
        return this.subscriptionDate;
    }

    public void setSubscriptionDate(String str) {
        this.subscriptionDate = str;
    }

    public String getRenewalDate() {
        return this.renewalDate;
    }

    public void setRenewalDate(String str) {
        this.renewalDate = str;
    }

    public String getRemainingDaysForRenewal() {
        return this.remainingDaysForRenewal;
    }

    public void setRemainingDaysForRenewal(String str) {
        this.remainingDaysForRenewal = str;
    }

    public boolean getMain() {
        return this.main;
    }

    public void setMain(boolean z) {
        this.main = z;
    }

    public boolean getAddOn() {
        return this.addOn;
    }

    public void setAddOn(boolean z) {
        this.addOn = z;
    }

    public boolean getVas() {
        return this.vas;
    }

    public void setVas(boolean z) {
        this.vas = z;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public boolean getAlreadySubscribed() {
        return this.alreadySubscribed;
    }

    public void setAlreadySubscribed(boolean z) {
        this.alreadySubscribed = z;
    }

    public OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }
}
