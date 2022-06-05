package com.ucare.we.model.extras;

import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class ExtrasList {
    @cqh(a = "addOn")
    @cqf
    private Boolean addOn;
    @cqh(a = "expiryDate")
    @cqf
    private String expiryDate;
    @cqh(a = "main")
    @cqf
    private Boolean main;
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
    @cqh(a = "primary")
    @cqf
    private Boolean primary;
    @cqh(a = "remainingDaysForRenewal")
    @cqf
    private Integer remainingDaysForRenewal;
    @cqh(a = "renewable")
    @cqf
    private Boolean renewable;
    @cqh(a = "renewalDate")
    @cqf
    private String renewalDate;
    @cqh(a = NotificationCompat.CATEGORY_STATUS)
    @cqf
    private String status;
    @cqh(a = "statusCode")
    @cqf
    private String statusCode;
    @cqh(a = "subscriptionDate")
    @cqf
    private String subscriptionDate;
    @cqh(a = "vas")
    @cqf
    private Boolean vas;

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

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(String str) {
        this.expiryDate = str;
    }

    public Integer getRemainingDaysForRenewal() {
        return this.remainingDaysForRenewal;
    }

    public void setRemainingDaysForRenewal(Integer num) {
        this.remainingDaysForRenewal = num;
    }

    public Boolean getPrimary() {
        return this.primary;
    }

    public void setPrimary(Boolean bool) {
        this.primary = bool;
    }

    public Boolean getMain() {
        return this.main;
    }

    public void setMain(Boolean bool) {
        this.main = bool;
    }

    public Boolean getAddOn() {
        return this.addOn;
    }

    public void setAddOn(Boolean bool) {
        this.addOn = bool;
    }

    public Boolean getVas() {
        return this.vas;
    }

    public void setVas(Boolean bool) {
        this.vas = bool;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String str) {
        this.statusCode = str;
    }
}
