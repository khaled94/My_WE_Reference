package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ckh  reason: default package */
/* loaded from: classes2.dex */
public final class ckh implements Parcelable.Creator<cki> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cki[] newArray(int i) {
        return new cki[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cki createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 3) {
                z = SafeParcelReader.q(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cki(str, str2, z);
    }
}
