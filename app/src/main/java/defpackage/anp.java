package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* renamed from: anp  reason: default package */
/* loaded from: classes.dex */
public final class anp implements Parcelable.Creator<ano> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ano createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = ano.a;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                switch (c) {
                    case 5:
                        arrayList = SafeParcelReader.b(parcel, readInt, aae.CREATOR);
                        continue;
                    case 6:
                        str = SafeParcelReader.l(parcel, readInt);
                        continue;
                    case 7:
                        z = SafeParcelReader.q(parcel, readInt);
                        continue;
                    case '\b':
                        z2 = SafeParcelReader.q(parcel, readInt);
                        continue;
                    case '\t':
                        z3 = SafeParcelReader.q(parcel, readInt);
                        continue;
                    case '\n':
                        str2 = SafeParcelReader.l(parcel, readInt);
                        continue;
                    case 11:
                        z4 = SafeParcelReader.q(parcel, readInt);
                        continue;
                    case '\f':
                        z5 = SafeParcelReader.q(parcel, readInt);
                        continue;
                    case '\r':
                        str3 = SafeParcelReader.l(parcel, readInt);
                        continue;
                    case 14:
                        j = SafeParcelReader.f(parcel, readInt);
                        continue;
                    default:
                        SafeParcelReader.p(parcel, readInt);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.a(parcel, readInt, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ano(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ano[] newArray(int i) {
        return new ano[i];
    }
}
