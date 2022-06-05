package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bvg  reason: default package */
/* loaded from: classes2.dex */
public final class bvg implements Parcelable.Creator<bvd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvd[] newArray(int i) {
        return new bvd[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvd createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        buq buqVar = null;
        String str3 = null;
        bli bliVar = null;
        bli bliVar2 = null;
        bli bliVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    buqVar = (buq) SafeParcelReader.a(parcel, readInt, buq.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.f(parcel, readInt);
                    break;
                case 6:
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    bliVar = (bli) SafeParcelReader.a(parcel, readInt, bli.CREATOR);
                    break;
                case '\t':
                    j2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\n':
                    bliVar2 = (bli) SafeParcelReader.a(parcel, readInt, bli.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\f':
                    bliVar3 = (bli) SafeParcelReader.a(parcel, readInt, bli.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bvd(str, str2, buqVar, j, z, str3, bliVar, j2, bliVar2, j3, bliVar3);
    }
}
