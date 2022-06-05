package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: acc  reason: default package */
/* loaded from: classes.dex */
public final class acc extends abb {
    public static final Parcelable.Creator<acc> CREATOR = new acd();
    final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public acc(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public acc(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b, i);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d, i);
        abc.b(parcel, a);
    }
}
