package com.ucare.we.model.suspendandresume;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class SuspendAndResumeDuration implements Parcelable {
    public static final Parcelable.Creator<SuspendAndResumeDuration> CREATOR = new Parcelable.Creator<SuspendAndResumeDuration>() { // from class: com.ucare.we.model.suspendandresume.SuspendAndResumeDuration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuspendAndResumeDuration createFromParcel(Parcel parcel) {
            return new SuspendAndResumeDuration(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuspendAndResumeDuration[] newArray(int i) {
            return new SuspendAndResumeDuration[i];
        }
    };
    @cqh(a = "ar")
    @cqf
    private String ar;
    @cqh(a = "days")
    @cqf
    private Integer days;
    @cqh(a = "en")
    @cqf
    private String en;
    boolean isSelected;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SuspendAndResumeDuration() {
    }

    protected SuspendAndResumeDuration(Parcel parcel) {
        this.days = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.en = parcel.readString();
        this.ar = parcel.readString();
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public Integer getDays() {
        return this.days;
    }

    public void setDays(Integer num) {
        this.days = num;
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
        parcel.writeValue(this.days);
        parcel.writeString(this.en);
        parcel.writeString(this.ar);
    }
}
