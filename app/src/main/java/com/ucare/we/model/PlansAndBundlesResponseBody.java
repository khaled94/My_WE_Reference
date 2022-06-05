package com.ucare.we.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class PlansAndBundlesResponseBody implements Parcelable {
    public static final Parcelable.Creator<PlansAndBundlesResponseBody> CREATOR = new Parcelable.Creator<PlansAndBundlesResponseBody>() { // from class: com.ucare.we.model.PlansAndBundlesResponseBody.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlansAndBundlesResponseBody createFromParcel(Parcel parcel) {
            return new PlansAndBundlesResponseBody(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlansAndBundlesResponseBody[] newArray(int i) {
            return new PlansAndBundlesResponseBody[i];
        }
    };
    @cqh(a = "alreadySubscribed")
    private boolean alreadySubscribed;
    @cqh(a = "bundle")
    private boolean bundle;
    @cqh(a = "isRegional")
    private Boolean isRegional;
    @cqh(a = "offerArName")
    private String offerArName;
    @cqh(a = "offerDetails")
    OfferDetails offerDetails;
    @cqh(a = "offerEnName")
    private String offerEnName;
    @cqh(a = "offerId")
    private String offerId;
    @cqh(a = "parentOfferId")
    private String parentOfferId;
    @cqh(a = "price")
    private float price;
    @cqh(a = "renewable")
    private boolean renewable;
    @cqh(a = "type")
    private String type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PlansAndBundlesResponseBody() {
    }

    protected PlansAndBundlesResponseBody(Parcel parcel) {
        this.offerId = parcel.readString();
        this.offerEnName = parcel.readString();
        this.offerArName = parcel.readString();
        this.parentOfferId = parcel.readString();
        this.type = parcel.readString();
        boolean z = true;
        this.alreadySubscribed = parcel.readByte() != 0;
        this.renewable = parcel.readByte() != 0;
        this.price = parcel.readInt();
        this.bundle = parcel.readByte() == 0 ? false : z;
    }

    public static Parcelable.Creator<PlansAndBundlesResponseBody> getCREATOR() {
        return CREATOR;
    }

    public OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }

    public Boolean getRegional() {
        return this.isRegional;
    }

    public void setRegional(Boolean bool) {
        this.isRegional = bool;
    }

    public boolean isRenewable() {
        return this.renewable;
    }

    public void setRenewable(boolean z) {
        this.renewable = z;
    }

    public String getParentOfferId() {
        return this.parentOfferId;
    }

    public void setParentOfferId(String str) {
        this.parentOfferId = str;
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

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String str) {
        this.offerId = str;
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

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float f) {
        this.price = f;
    }

    public boolean isBundle() {
        return this.bundle;
    }

    public void setBundle(boolean z) {
        this.bundle = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.offerId);
        parcel.writeString(this.offerEnName);
        parcel.writeString(this.offerArName);
        parcel.writeString(this.parentOfferId);
        parcel.writeString(this.type);
        parcel.writeByte(this.alreadySubscribed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.renewable ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.price);
        parcel.writeByte(this.bundle ? (byte) 1 : (byte) 0);
    }
}
