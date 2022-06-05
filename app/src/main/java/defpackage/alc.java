package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: alc  reason: default package */
/* loaded from: classes.dex */
public final class alc implements Parcelable.Creator<alb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alb[] newArray(int i) {
        return new alb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ alb createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        alq alqVar = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 6:
                    alqVar = (alq) SafeParcelReader.a(parcel, readInt, alq.CREATOR);
                    break;
                case 7:
                    arrayList = SafeParcelReader.n(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new alb(str, z, str2, z2, alqVar, arrayList);
    }
}
