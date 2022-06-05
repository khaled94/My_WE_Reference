package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: chk  reason: default package */
/* loaded from: classes2.dex */
public class chk extends chh {
    public static final Parcelable.Creator<chk> CREATOR = new cln();
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public chk(String str) {
        this.a = aat.a(str);
    }

    @Override // defpackage.chh
    public final String a() {
        return "facebook.com";
    }

    @Override // defpackage.chh
    public final String b() {
        return "facebook.com";
    }

    public static alr a(chk chkVar, String str) {
        aat.a(chkVar);
        return new alr(null, chkVar.a, chkVar.a(), null, null, str, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.b(parcel, a);
    }
}
