package com.ucare.we.model.RegionalProducts;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class RegionalPlansResponseBody implements Parcelable {
    public static final Parcelable.Creator<RegionalPlansResponseBody> CREATOR = new Parcelable.Creator<RegionalPlansResponseBody>() { // from class: com.ucare.we.model.RegionalProducts.RegionalPlansResponseBody.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegionalPlansResponseBody createFromParcel(Parcel parcel) {
            return new RegionalPlansResponseBody(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegionalPlansResponseBody[] newArray(int i) {
            return new RegionalPlansResponseBody[i];
        }
    };
    @cqh(a = "addon")
    boolean addon;
    @cqh(a = "nameAr")
    String offerArName;
    @cqh(a = "nameEn")
    String offerEnName;
    @cqh(a = "offerId")
    String offerId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RegionalPlansResponseBody() {
    }

    public RegionalPlansResponseBody(Parcel parcel) {
        this.offerId = parcel.readString();
        this.offerEnName = parcel.readString();
        this.offerArName = parcel.readString();
        this.addon = parcel.readByte() != 0;
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

    public boolean isAddon() {
        return this.addon;
    }

    public void setAddon(boolean z) {
        this.addon = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.offerId);
        parcel.writeString(this.offerEnName);
        parcel.writeString(this.offerArName);
        parcel.writeByte(this.addon ? (byte) 1 : (byte) 0);
    }
}
