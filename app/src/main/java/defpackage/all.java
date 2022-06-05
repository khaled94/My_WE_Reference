package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: all  reason: default package */
/* loaded from: classes.dex */
public final class all implements Parcelable.Creator<ali> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ali[] newArray(int i) {
        return new ali[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ali createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ali(str, str2, str3, str4, str5, str6, str7);
    }
}
