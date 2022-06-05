package com.ucare.we.model.MoreBundleModel;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class AddOnGroupOfferingsID implements Parcelable {
    public static final Parcelable.Creator<AddOnGroupOfferingsID> CREATOR = new Parcelable.Creator<AddOnGroupOfferingsID>() { // from class: com.ucare.we.model.MoreBundleModel.AddOnGroupOfferingsID.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddOnGroupOfferingsID createFromParcel(Parcel parcel) {
            return new AddOnGroupOfferingsID(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddOnGroupOfferingsID[] newArray(int i) {
            return new AddOnGroupOfferingsID[i];
        }
    };
    @cqh(a = "oneTimeOfferingId")
    String oneTimeOfferingId;
    @cqh(a = "otherOfferingId")
    String otherOfferingId;
    @cqh(a = "recurringOfferingId")
    String recurringOfferingId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected AddOnGroupOfferingsID(Parcel parcel) {
        this.oneTimeOfferingId = parcel.readString();
        this.recurringOfferingId = parcel.readString();
        this.otherOfferingId = parcel.readString();
    }

    public String getOneTimeOfferingId() {
        return this.oneTimeOfferingId;
    }

    public void setOneTimeOfferingId(String str) {
        this.oneTimeOfferingId = str;
    }

    public String getRecurringOfferingId() {
        return this.recurringOfferingId;
    }

    public void setRecurringOfferingId(String str) {
        this.recurringOfferingId = str;
    }

    public String getOtherOfferingId() {
        return this.otherOfferingId;
    }

    public void setOtherOfferingId(String str) {
        this.otherOfferingId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.oneTimeOfferingId);
        parcel.writeString(this.recurringOfferingId);
        parcel.writeString(this.otherOfferingId);
    }
}
