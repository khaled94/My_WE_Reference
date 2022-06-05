package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: buz  reason: default package */
/* loaded from: classes2.dex */
public final class buz implements Parcelable.Creator<bva> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bva[] newArray(int i) {
        return new bva[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bva createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 6:
                    j = SafeParcelReader.f(parcel, readInt);
                    break;
                case 7:
                    j2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\b':
                    str5 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\t':
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\n':
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 11:
                    j6 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\f':
                    str6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\r':
                    j3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 14:
                    j4 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 15:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 16:
                    z3 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 17:
                    z4 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 18:
                    z5 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 19:
                    str7 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 20:
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
                case 21:
                    bool = SafeParcelReader.i(parcel, readInt);
                    break;
                case 22:
                    j5 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 23:
                    arrayList = SafeParcelReader.n(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bva(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, arrayList);
    }
}
