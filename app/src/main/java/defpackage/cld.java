package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: cld  reason: default package */
/* loaded from: classes2.dex */
public final class cld implements Parcelable.Creator<chs> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chs[] newArray(int i) {
        return new chs[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ chs createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new chs(str, str2, z, str3, z2, str4);
    }
}
