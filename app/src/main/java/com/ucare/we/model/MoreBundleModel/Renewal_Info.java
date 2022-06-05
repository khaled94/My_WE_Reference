package com.ucare.we.model.MoreBundleModel;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class Renewal_Info implements Parcelable {
    public static final Parcelable.Creator<Renewal_Info> CREATOR = new Parcelable.Creator<Renewal_Info>() { // from class: com.ucare.we.model.MoreBundleModel.Renewal_Info.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Renewal_Info createFromParcel(Parcel parcel) {
            return new Renewal_Info(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Renewal_Info[] newArray(int i) {
            return new Renewal_Info[i];
        }
    };
    @cqh(a = "remainingLocks")
    int remainingLocks;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Renewal_Info(int i) {
        this.remainingLocks = i;
    }

    protected Renewal_Info(Parcel parcel) {
        this.remainingLocks = parcel.readInt();
    }

    public int getRemainingLocks() {
        return this.remainingLocks;
    }

    public void setRemainingLocks(int i) {
        this.remainingLocks = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.remainingLocks);
    }
}
