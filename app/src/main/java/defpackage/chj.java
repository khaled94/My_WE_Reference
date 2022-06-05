package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: chj  reason: default package */
/* loaded from: classes2.dex */
public class chj extends chh {
    public static final Parcelable.Creator<chj> CREATOR = new clm();
    public String a;
    public String b;
    public final String c;
    public String d;
    public boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public chj(String str, String str2, String str3, String str4, boolean z) {
        this.a = aat.a(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    @Override // defpackage.chh
    public final String a() {
        return "password";
    }

    @Override // defpackage.chh
    public final String b() {
        return !TextUtils.isEmpty(this.b) ? "password" : "emailLink";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.a(parcel, 5, this.e);
        abc.b(parcel, a);
    }
}
