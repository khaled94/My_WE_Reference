package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: um  reason: default package */
/* loaded from: classes2.dex */
public final class um implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    j = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\t':
                    str6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\n':
                    arrayList = SafeParcelReader.b(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\f':
                    str8 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
