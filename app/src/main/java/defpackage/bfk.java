package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bfk  reason: default package */
/* loaded from: classes2.dex */
public final class bfk implements Parcelable.Creator<bfl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bfl[] newArray(int i) {
        return new bfl[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bfl createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bfl(str);
    }
}
