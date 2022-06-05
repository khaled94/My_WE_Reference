package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cll  reason: default package */
/* loaded from: classes2.dex */
public class cll extends chr {
    public static final Parcelable.Creator<cll> CREATOR = new clk();
    private final String a;
    private final String b;
    private final String c;
    private final alr d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cll(String str, String str2, String str3, alr alrVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = alrVar;
        this.e = str4;
    }

    public static cll a(alr alrVar) {
        aat.a(alrVar, "Must specify a non-null webSignInCredential");
        return new cll(null, null, null, alrVar, null);
    }

    @Override // defpackage.chh
    public final String a() {
        return this.a;
    }

    @Override // defpackage.chh
    public final String b() {
        return this.a;
    }

    @Override // defpackage.chr
    public final String d() {
        return this.b;
    }

    @Override // defpackage.chr
    public final String c() {
        return this.c;
    }

    public static alr a(cll cllVar, String str) {
        aat.a(cllVar);
        alr alrVar = cllVar.d;
        return alrVar != null ? alrVar : new alr(cllVar.d(), cllVar.c(), cllVar.a(), null, null, str, cllVar.e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, a());
        abc.a(parcel, 2, d());
        abc.a(parcel, 3, c());
        abc.a(parcel, 4, this.d, i);
        abc.a(parcel, 5, this.e);
        abc.b(parcel, a);
    }
}
