package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: sq  reason: default package */
/* loaded from: classes2.dex */
public abstract class sq implements sr {
    private final Bundle a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public sq(Parcel parcel) {
        this.a = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
