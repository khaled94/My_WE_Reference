package com.ucare.we.model.MoreBundleModel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ResponseRetrieveMoreBundleBody implements Parcelable {
    public static final Parcelable.Creator<ResponseRetrieveMoreBundleBody> CREATOR = new Parcelable.Creator<ResponseRetrieveMoreBundleBody>() { // from class: com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundleBody.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResponseRetrieveMoreBundleBody createFromParcel(Parcel parcel) {
            return new ResponseRetrieveMoreBundleBody(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResponseRetrieveMoreBundleBody[] newArray(int i) {
            return new ResponseRetrieveMoreBundleBody[i];
        }
    };
    @cqh(a = "availableAddOnOfferingsList")
    ArrayList<AvailableAddOnOfferingsList> availableAddOnOfferingsList;
    @cqh(a = "purchasedAddOnOfferingsList")
    ArrayList<PurchasedAddOnOfferingsList> purchasedAddOnOfferingsList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ResponseRetrieveMoreBundleBody() {
    }

    protected ResponseRetrieveMoreBundleBody(Parcel parcel) {
        this.purchasedAddOnOfferingsList = parcel.createTypedArrayList(PurchasedAddOnOfferingsList.CREATOR);
        this.availableAddOnOfferingsList = parcel.createTypedArrayList(AvailableAddOnOfferingsList.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.purchasedAddOnOfferingsList);
        parcel.writeTypedList(this.availableAddOnOfferingsList);
    }

    public ArrayList<PurchasedAddOnOfferingsList> getPurchasedAddOnOfferingsList() {
        return this.purchasedAddOnOfferingsList;
    }

    public void setPurchasedAddOnOfferingsList(ArrayList<PurchasedAddOnOfferingsList> arrayList) {
        this.purchasedAddOnOfferingsList = arrayList;
    }

    public ArrayList<AvailableAddOnOfferingsList> getAvailableAddOnOfferingsList() {
        return this.availableAddOnOfferingsList;
    }

    public void setAvailableAddOnOfferingsList(ArrayList<AvailableAddOnOfferingsList> arrayList) {
        this.availableAddOnOfferingsList = arrayList;
    }
}
