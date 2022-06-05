package com.ucare.we.model.ticket;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class Category implements Parcelable {
    public static final Parcelable.Creator<Category> CREATOR = new Parcelable.Creator<Category>() { // from class: com.ucare.we.model.ticket.Category.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Category createFromParcel(Parcel parcel) {
            return new Category(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Category[] newArray(int i) {
            return new Category[i];
        }
    };
    @cqh(a = "id")
    @cqf
    private String id;
    boolean isSelected;
    @cqh(a = "name_ar")
    @cqf
    private String nameAr;
    @cqh(a = "name_en")
    @cqf
    private String nameEn;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Category() {
    }

    protected Category(Parcel parcel) {
        this.id = parcel.readString();
        this.nameEn = parcel.readString();
        this.nameAr = parcel.readString();
    }

    public static Parcelable.Creator<Category> getCREATOR() {
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

    public String getNameEn() {
        return this.nameEn;
    }

    public void setNameEn(String str) {
        this.nameEn = str;
    }

    public String getNameAr() {
        return this.nameAr;
    }

    public void setNameAr(String str) {
        this.nameAr = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.nameEn);
        parcel.writeString(this.nameAr);
    }
}
