package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ckl  reason: default package */
/* loaded from: classes2.dex */
public final class ckl implements Parcelable.Creator<ckm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckm[] newArray(int i) {
        return new ckm[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckm createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
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
                    str5 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    str4 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 6:
                    str6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\b':
                    str7 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ckm(str, str2, str3, str4, str5, str6, z, str7);
    }
}
