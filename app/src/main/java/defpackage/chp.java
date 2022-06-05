package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: chp  reason: default package */
/* loaded from: classes2.dex */
public class chp extends chh {
    public static final Parcelable.Creator<chp> CREATOR = new cls();
    private String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public chp(String str) {
        this.a = aat.a(str);
    }

    @Override // defpackage.chh
    public final String a() {
        return "github.com";
    }

    @Override // defpackage.chh
    public final String b() {
        return "github.com";
    }

    public static alr a(chp chpVar, String str) {
        aat.a(chpVar);
        return new alr(null, chpVar.a, chpVar.a(), null, null, str, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.b(parcel, a);
    }
}
