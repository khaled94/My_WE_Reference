package com.ucare.we.model.AreasModel;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class Area implements Parcelable {
    public static final Parcelable.Creator<Area> CREATOR = new Parcelable.Creator<Area>() { // from class: com.ucare.we.model.AreasModel.Area.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Area createFromParcel(Parcel parcel) {
            return new Area(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Area[] newArray(int i) {
            return new Area[i];
        }
    };
    @cqh(a = "areaArabic")
    public String areaArabic;
    @cqh(a = "areaEnglish")
    public String areaEnglish;
    @cqh(a = "areaID")
    public int areaID;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected Area(Parcel parcel) {
        this.areaArabic = parcel.readString();
        this.areaEnglish = parcel.readString();
        this.areaID = parcel.readInt();
    }

    public String getAreaArabic() {
        return this.areaArabic;
    }

    public void setAreaArabic(String str) {
        this.areaArabic = str;
    }

    public String getAreaEnglish() {
        return this.areaEnglish;
    }

    public void setAreaEnglish(String str) {
        this.areaEnglish = str;
    }

    public int getAreaID() {
        return this.areaID;
    }

    public void setAreaID(int i) {
        this.areaID = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.areaArabic);
        parcel.writeString(this.areaEnglish);
        parcel.writeInt(this.areaID);
    }
}
