package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: chv  reason: default package */
/* loaded from: classes2.dex */
public class chv extends chh {
    public static final Parcelable.Creator<chv> CREATOR = new clh();
    private String a;
    private String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public chv(String str, String str2) {
        this.a = aat.a(str);
        this.b = aat.a(str2);
    }

    @Override // defpackage.chh
    public final String a() {
        return "twitter.com";
    }

    @Override // defpackage.chh
    public final String b() {
        return "twitter.com";
    }

    public static alr a(chv chvVar, String str) {
        aat.a(chvVar);
        return new alr(null, chvVar.a, chvVar.a(), chvVar.b, null, str, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
