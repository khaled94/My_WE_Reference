package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: ckp  reason: default package */
/* loaded from: classes2.dex */
public final class ckp implements Parcelable.Creator<ckq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckq[] newArray(int i) {
        return new ckq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ckq createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        alf alfVar = null;
        ckm ckmVar = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        cks cksVar = null;
        cll cllVar = null;
        cjx cjxVar = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    alfVar = (alf) SafeParcelReader.a(parcel, readInt, alf.CREATOR);
                    break;
                case 2:
                    ckmVar = (ckm) SafeParcelReader.a(parcel, readInt, ckm.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    arrayList = SafeParcelReader.b(parcel, readInt, ckm.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    bool = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    cksVar = (cks) SafeParcelReader.a(parcel, readInt, cks.CREATOR);
                    break;
                case '\n':
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 11:
                    cllVar = (cll) SafeParcelReader.a(parcel, readInt, cll.CREATOR);
                    break;
                case '\f':
                    cjxVar = (cjx) SafeParcelReader.a(parcel, readInt, cjx.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ckq(alfVar, ckmVar, str, str2, arrayList, arrayList2, str3, bool, cksVar, z, cllVar, cjxVar);
    }
}
