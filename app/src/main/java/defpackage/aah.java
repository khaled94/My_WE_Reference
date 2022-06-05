package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import defpackage.aal;

/* renamed from: aah  reason: default package */
/* loaded from: classes.dex */
public final class aah extends abb {
    public static final Parcelable.Creator<aah> CREATOR = new acx();
    final int a;
    final int b;
    int c;
    String d;
    IBinder e;
    Scope[] f;
    Bundle g;
    Account h;
    uw[] i;
    uw[] j;
    boolean k;
    int l;
    boolean m;
    String n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aah(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, uw[] uwVarArr, uw[] uwVarArr2, boolean z, int i4, boolean z2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            this.h = iBinder != null ? aab.a(aal.a.a(iBinder)) : null;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = uwVarArr;
        this.j = uwVarArr2;
        this.k = z;
        this.l = i4;
        this.m = z2;
        this.n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        acx.a(this, parcel, i);
    }

    public aah(int i, String str) {
        this.a = 6;
        this.c = uy.b;
        this.b = i;
        this.k = true;
        this.n = str;
    }
}
