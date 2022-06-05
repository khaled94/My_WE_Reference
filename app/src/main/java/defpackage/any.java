package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: any  reason: default package */
/* loaded from: classes.dex */
public final class any implements Parcelable.Creator<anx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ anx createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        bja bjaVar = anx.b;
        List<aae> list = anx.a;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bjaVar = (bja) SafeParcelReader.a(parcel, readInt, bja.CREATOR);
            } else if (c == 2) {
                list = SafeParcelReader.b(parcel, readInt, aae.CREATOR);
            } else if (c == 3) {
                str = SafeParcelReader.l(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new anx(bjaVar, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ anx[] newArray(int i) {
        return new anx[i];
    }
}
