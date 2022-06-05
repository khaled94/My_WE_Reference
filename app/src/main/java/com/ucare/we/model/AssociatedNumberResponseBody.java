package com.ucare.we.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class AssociatedNumberResponseBody implements Parcelable {
    public static final Parcelable.Creator<AssociatedNumberResponseBody> CREATOR = new Parcelable.Creator<AssociatedNumberResponseBody>() { // from class: com.ucare.we.model.AssociatedNumberResponseBody.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssociatedNumberResponseBody createFromParcel(Parcel parcel) {
            return new AssociatedNumberResponseBody(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssociatedNumberResponseBody[] newArray(int i) {
            return new AssociatedNumberResponseBody[i];
        }
    };
    @cqh(a = "mobileNumber")
    private String mobileNumber;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AssociatedNumberResponseBody() {
    }

    protected AssociatedNumberResponseBody(Parcel parcel) {
        this.mobileNumber = parcel.readString();
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mobileNumber);
    }
}
