package com.ucare.we.model.MoreBundleModel;

import android.os.Parcel;
import android.os.Parcelable;
import com.ucare.we.model.OfferDetails;

/* loaded from: classes2.dex */
public class AvailableAddOnOfferingList implements Parcelable {
    public static final Parcelable.Creator<AvailableAddOnOfferingList> CREATOR = new Parcelable.Creator<AvailableAddOnOfferingList>() { // from class: com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableAddOnOfferingList createFromParcel(Parcel parcel) {
            return new AvailableAddOnOfferingList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableAddOnOfferingList[] newArray(int i) {
            return new AvailableAddOnOfferingList[i];
        }
    };
    @cqh(a = "addOnGroupOfferingsID")
    AddOnGroupOfferingsID addOnGroupOfferingsID;
    @cqh(a = "alreadySubscribed")
    boolean alreadySubscribed;
    @cqh(a = "isRegional")
    Boolean isRegional;
    @cqh(a = "offerArName")
    String offerArName;
    @cqh(a = "offerDetails")
    OfferDetails offerDetails;
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

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected AvailableAddOnOfferingList(Parcel parcel) {
        Boolean bool;
        this.offerEnName = parcel.readString();
        this.offerArName = parcel.readString();
        this.type = parcel.readString();
        boolean z = false;
        this.alreadySubscribed = parcel.readByte() != 0;
        this.subType = parcel.readString();
        this.offerId = parcel.readString();
        this.price = parcel.readFloat();
        this.addOnGroupOfferingsID = (AddOnGroupOfferingsID) parcel.readParcelable(AddOnGroupOfferingsID.class.getClassLoader());
        byte readByte = parcel.readByte();
        if (readByte == 0) {
            bool = null;
        } else {
            bool = Boolean.valueOf(readByte == 1);
        }
        this.isRegional = bool;
        this.offerDetails = (OfferDetails) parcel.readParcelable(OfferDetails.class.getClassLoader());
        this.show = parcel.readByte() != 0 ? true : z;
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.offerEnName);
        parcel.writeString(this.offerArName);
        parcel.writeString(this.type);
        parcel.writeByte(this.alreadySubscribed ? (byte) 1 : (byte) 0);
        parcel.writeString(this.subType);
        parcel.writeString(this.offerId);
        parcel.writeFloat(this.price);
        parcel.writeParcelable(this.addOnGroupOfferingsID, i);
        Boolean bool = this.isRegional;
        parcel.writeByte((byte) (bool == null ? 0 : bool.booleanValue() ? 1 : 2));
        parcel.writeParcelable(this.offerDetails, i);
        parcel.writeByte(this.show ? (byte) 1 : (byte) 0);
    }
}
