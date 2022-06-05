package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: akq  reason: default package */
/* loaded from: classes.dex */
public final class akq implements Parcelable.Creator<akr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ akr[] newArray(int i) {
        return new akr[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ akr createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        alr alrVar = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) == 1) {
                alrVar = (alr) SafeParcelReader.a(parcel, readInt, alr.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new akr(alrVar);
    }
}
