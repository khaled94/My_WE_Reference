package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bjb  reason: default package */
/* loaded from: classes2.dex */
public final class bjb implements Parcelable.Creator<bja> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bja createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = SafeParcelReader.q(parcel, readInt);
            } else if (c == 2) {
                j = SafeParcelReader.f(parcel, readInt);
            } else if (c == 3) {
                f = SafeParcelReader.c(parcel, readInt);
            } else if (c == 4) {
                j2 = SafeParcelReader.f(parcel, readInt);
            } else if (c == 5) {
                i = SafeParcelReader.d(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bja(z, j, f, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ bja[] newArray(int i) {
        return new bja[i];
    }
}
