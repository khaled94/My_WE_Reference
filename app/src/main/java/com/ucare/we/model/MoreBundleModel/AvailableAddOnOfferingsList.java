package com.ucare.we.model.MoreBundleModel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class AvailableAddOnOfferingsList implements Parcelable, Comparable {
    public static final Parcelable.Creator<AvailableAddOnOfferingsList> CREATOR = new Parcelable.Creator<AvailableAddOnOfferingsList>() { // from class: com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingsList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableAddOnOfferingsList createFromParcel(Parcel parcel) {
            return new AvailableAddOnOfferingsList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableAddOnOfferingsList[] newArray(int i) {
            return new AvailableAddOnOfferingsList[i];
        }
    };
    @cqh(a = "availableAddOnOfferingList")
    ArrayList<AvailableAddOnOfferingList> availableAddOnOfferingList;
    @cqh(a = "childGroups")
    ArrayList<AvailableAddOnOfferingsList> childGroups;
    @cqh(a = "groupArName")
    String groupArName;
    @cqh(a = "groupEnName")
    String groupEnName;
    @cqh(a = "iconUrl")
    String iconUrl;
    @cqh(a = "order")
    int order;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AvailableAddOnOfferingsList(Parcel parcel) {
        this.groupEnName = parcel.readString();
        this.groupArName = parcel.readString();
        this.order = parcel.readInt();
        this.childGroups = parcel.createTypedArrayList(CREATOR);
        this.iconUrl = parcel.readString();
        this.availableAddOnOfferingList = parcel.createTypedArrayList(AvailableAddOnOfferingList.CREATOR);
    }

    public AvailableAddOnOfferingsList() {
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public ArrayList<AvailableAddOnOfferingsList> getChildGroups() {
        return this.childGroups;
    }

    public void setChildGroups(ArrayList<AvailableAddOnOfferingsList> arrayList) {
        this.childGroups = arrayList;
    }

    public String getGroupEnName() {
        return this.groupEnName;
    }

    public void setGroupEnName(String str) {
        this.groupEnName = str;
    }

    public String getGroupArName() {
        return this.groupArName;
    }

    public void setGroupArName(String str) {
        this.groupArName = str;
    }

    public int getOrder() {
        return this.order;
    }

    public void setOrder(int i) {
        this.order = i;
    }

    public ArrayList<AvailableAddOnOfferingList> getAvailableAddOnOfferingList() {
        return this.availableAddOnOfferingList;
    }

    public void setAvailableAddOnOfferingList(ArrayList<AvailableAddOnOfferingList> arrayList) {
        this.availableAddOnOfferingList = arrayList;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.order - ((AvailableAddOnOfferingsList) obj).getOrder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.groupEnName);
        parcel.writeString(this.groupArName);
        parcel.writeInt(this.order);
        parcel.writeTypedList(this.childGroups);
        parcel.writeString(this.iconUrl);
        parcel.writeTypedList(this.availableAddOnOfferingList);
    }
}
