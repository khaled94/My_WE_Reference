package com.ucare.we.model.MoreBundleModel;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class ResponseRetrieveMoreBundle implements Parcelable {
    public static final Parcelable.Creator<ResponseRetrieveMoreBundle> CREATOR = new Parcelable.Creator<ResponseRetrieveMoreBundle>() { // from class: com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundle.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResponseRetrieveMoreBundle createFromParcel(Parcel parcel) {
            return new ResponseRetrieveMoreBundle(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResponseRetrieveMoreBundle[] newArray(int i) {
            return new ResponseRetrieveMoreBundle[i];
        }
    };
    @cqh(a = "body")
    ResponseRetrieveMoreBundleBody body;
    @cqh(a = "header")
    ResponseRetrieveMoreBundleHeader header;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ResponseRetrieveMoreBundle() {
    }

    protected ResponseRetrieveMoreBundle(Parcel parcel) {
        this.body = (ResponseRetrieveMoreBundleBody) parcel.readParcelable(ResponseRetrieveMoreBundleBody.class.getClassLoader());
    }

    public ResponseRetrieveMoreBundleHeader getHeader() {
        return this.header;
    }

    public void setHeader(ResponseRetrieveMoreBundleHeader responseRetrieveMoreBundleHeader) {
        this.header = responseRetrieveMoreBundleHeader;
    }

    public ResponseRetrieveMoreBundleBody getBody() {
        return this.body;
    }

    public void setBody(ResponseRetrieveMoreBundleBody responseRetrieveMoreBundleBody) {
        this.body = responseRetrieveMoreBundleBody;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.body, i);
    }
}
