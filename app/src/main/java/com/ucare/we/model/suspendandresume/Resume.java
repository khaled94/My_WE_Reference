package com.ucare.we.model.suspendandresume;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class Resume implements Parcelable {
    public static final Parcelable.Creator<Resume> CREATOR = new Parcelable.Creator<Resume>() { // from class: com.ucare.we.model.suspendandresume.Resume.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Resume createFromParcel(Parcel parcel) {
            return new Resume(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Resume[] newArray(int i) {
            return new Resume[i];
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

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Resume() {
    }

    protected Resume(Parcel parcel) {
        this.id = parcel.readString();
        this.en = parcel.readString();
        this.ar = parcel.readString();
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
