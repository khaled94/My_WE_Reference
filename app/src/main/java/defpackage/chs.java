package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: chs  reason: default package */
/* loaded from: classes2.dex */
public final class chs extends chh implements Cloneable {
    public static final Parcelable.Creator<chs> CREATOR = new cld();
    public boolean a;
    private String b;
    private String c;
    private boolean d;
    private String e;
    private String f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public chs(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        aat.a((z && !TextUtils.isEmpty(str3)) || (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, ortemprary proof.");
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.a = z2;
        this.f = str4;
    }

    @Override // defpackage.chh
    public final String a() {
        return "phone";
    }

    @Override // defpackage.chh
    public final String b() {
        return "phone";
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new chs(this.b, this.c, this.d, this.e, this.a, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.b);
        abc.a(parcel, 2, this.c);
        abc.a(parcel, 3, this.d);
        abc.a(parcel, 4, this.e);
        abc.a(parcel, 5, this.a);
        abc.a(parcel, 6, this.f);
        abc.b(parcel, a);
    }
}
