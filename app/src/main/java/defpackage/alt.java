package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: alt  reason: default package */
/* loaded from: classes.dex */
public final class alt implements Parcelable.Creator<alr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alr[] newArray(int i) {
        return new alr[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alr createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    str5 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    str6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    str7 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\t':
                    str8 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\n':
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 11:
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\f':
                    str9 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\r':
                    str10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 14:
                    str11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 15:
                    str12 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 16:
                    z3 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 17:
                    str13 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new alr(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }
}
