package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: but  reason: default package */
/* loaded from: classes2.dex */
public final class but implements Parcelable.Creator<buq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ buq[] newArray(int i) {
        return new buq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ buq createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 3:
                    j = SafeParcelReader.f(parcel, readInt);
                    break;
                case 4:
                    l = SafeParcelReader.k(parcel, readInt);
                    break;
                case 5:
                    f = SafeParcelReader.j(parcel, readInt);
                    break;
                case 6:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    int e = SafeParcelReader.e(parcel, readInt);
                    if (e != 0) {
                        SafeParcelReader.a(parcel, e, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new buq(i, str, j, l, f, str2, str3, d);
    }
}
