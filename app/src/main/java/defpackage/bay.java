package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bay  reason: default package */
/* loaded from: classes.dex */
public final class bay implements Parcelable.Creator<baz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ baz[] newArray(int i) {
        return new baz[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ baz createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = SafeParcelReader.f(parcel, readInt);
                    break;
                case 2:
                    j2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    bundle = SafeParcelReader.g(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new baz(j, j2, z, str, str2, str3, bundle);
    }
}
