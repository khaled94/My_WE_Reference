package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: akw  reason: default package */
/* loaded from: classes.dex */
public final class akw implements Parcelable.Creator<akx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ akx[] newArray(int i) {
        return new akx[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ akx createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Status status = null;
        cll cllVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) SafeParcelReader.a(parcel, readInt, Status.CREATOR);
            } else if (c == 2) {
                cllVar = (cll) SafeParcelReader.a(parcel, readInt, cll.CREATOR);
            } else if (c == 3) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 4) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new akx(status, cllVar, str, str2);
    }
}
