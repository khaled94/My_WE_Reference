package com.ucare.we.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class DeviceTypes implements Parcelable {
    public static final Parcelable.Creator<DeviceTypes> CREATOR = new Parcelable.Creator<DeviceTypes>() { // from class: com.ucare.we.model.DeviceTypes.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceTypes createFromParcel(Parcel parcel) {
            return new DeviceTypes(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceTypes[] newArray(int i) {
            return new DeviceTypes[i];
        }
    };
    @cqh(a = "alreadySubscribed")
    @cqf
    private Boolean alreadySubscribed;
    boolean isSelected;
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
    private float price;
    @cqh(a = "renewable")
    @cqf
    private Boolean renewable;
    @cqh(a = "subType")
    @cqf
    private String subType;
    @cqh(a = "type")
    @cqf
    private String type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DeviceTypes() {
    }

    protected DeviceTypes(Parcel parcel) {
        this.offerEnName = parcel.readString();
        this.offerArName = parcel.readString();
        this.type = parcel.readString();
        boolean z = true;
        this.alreadySubscribed = Boolean.valueOf(parcel.readByte() != 0);
        this.price = parcel.readFloat();
        this.renewable = Boolean.valueOf(parcel.readByte() == 0 ? false : z);
        this.subType = parcel.readString();
        this.offerId = parcel.readString();
    }

    public static Parcelable.Creator<DeviceTypes> getCREATOR() {
        return CREATOR;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
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

    public Boolean getAlreadySubscribed() {
        return this.alreadySubscribed;
    }

    public void setAlreadySubscribed(Boolean bool) {
        this.alreadySubscribed = bool;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float f) {
        this.price = f;
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.offerEnName);
        parcel.writeString(this.offerArName);
        parcel.writeString(this.type);
        parcel.writeByte(this.alreadySubscribed.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.price);
        parcel.writeByte(this.renewable.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.subType);
        parcel.writeString(this.offerId);
    }
}
