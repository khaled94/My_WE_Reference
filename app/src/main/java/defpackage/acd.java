package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: acd  reason: default package */
/* loaded from: classes.dex */
public final class acd implements Parcelable.Creator<acc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ acc createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                account = (Account) SafeParcelReader.a(parcel, readInt, Account.CREATOR);
            } else if (c == 3) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (c == 4) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.a(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new acc(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ acc[] newArray(int i) {
        return new acc[i];
    }
}
