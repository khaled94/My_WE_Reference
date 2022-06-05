package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public class SignInAccount extends abb implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new uq();
    @Deprecated
    String a;
    public GoogleSignInAccount b;
    @Deprecated
    String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        this.a = aat.a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.c = aat.a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 4, this.a);
        abc.a(parcel, 7, this.b, i);
        abc.a(parcel, 8, this.c);
        abc.b(parcel, a);
    }
}
