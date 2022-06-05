package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: ale  reason: default package */
/* loaded from: classes.dex */
public final class ale implements Parcelable.Creator<ald> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ald[] newArray(int i) {
        return new ald[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ald createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        alk alkVar = null;
        String str5 = null;
        String str6 = null;
        cll cllVar = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
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
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    alkVar = (alk) SafeParcelReader.a(parcel, readInt, alk.CREATOR);
                    break;
                case '\b':
                    str5 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\t':
                    str6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\n':
                    j = SafeParcelReader.f(parcel, readInt);
                    break;
                case 11:
                    j2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\f':
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\r':
                    cllVar = (cll) SafeParcelReader.a(parcel, readInt, cll.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.b(parcel, readInt, alg.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ald(str, str2, z, str3, str4, alkVar, str5, str6, j, j2, z2, cllVar, arrayList);
    }
}
