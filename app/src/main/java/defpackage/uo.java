package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: uo  reason: default package */
/* loaded from: classes2.dex */
public final class uo implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    arrayList = SafeParcelReader.b(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 6:
                    z3 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 7:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\t':
                    arrayList2 = SafeParcelReader.b(parcel, readInt, tn.CREATOR);
                    break;
                case '\n':
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
