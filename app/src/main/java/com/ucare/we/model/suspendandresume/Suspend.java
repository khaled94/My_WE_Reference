package com.ucare.we.model.suspendandresume;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class Suspend implements Parcelable {
    public static final Parcelable.Creator<Suspend> CREATOR = new Parcelable.Creator<Suspend>() { // from class: com.ucare.we.model.suspendandresume.Suspend.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Suspend createFromParcel(Parcel parcel) {
            return new Suspend(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Suspend[] newArray(int i) {
            return new Suspend[i];
        }
    };
    @cqh(a = "ar")
    @cqf
    private String ar;
    @cqh(a = "en")
    @cqf
    private String en;
    @cqh(a = "id")
    @cqf
    private String id;
    boolean isSelected;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Suspend() {
    }

    protected Suspend(Parcel parcel) {
        this.id = parcel.readString();
        this.en = parcel.readString();
        this.ar = parcel.readString();
    }

    public static Parcelable.Creator<Suspend> getCREATOR() {
        return CREATOR;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getEn() {
        return this.en;
    }

    public void setEn(String str) {
        this.en = str;
    }

    public String getAr() {
        return this.ar;
    }

    public void setAr(String str) {
        this.ar = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.en);
        parcel.writeString(this.ar);
    }
}
