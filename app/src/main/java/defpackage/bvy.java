package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bvy  reason: default package */
/* loaded from: classes2.dex */
public final class bvy implements Parcelable.Creator<bvx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvx createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        acc accVar = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                accVar = (acc) SafeParcelReader.a(parcel, readInt, acc.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bvx(i, accVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvx[] newArray(int i) {
        return new bvx[i];
    }
}
