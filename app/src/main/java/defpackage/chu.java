package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: chu  reason: default package */
/* loaded from: classes2.dex */
public class chu extends chh {
    public static final Parcelable.Creator<chu> CREATOR = new clg();
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public chu(String str) {
        this.a = aat.a(str);
    }

    @Override // defpackage.chh
    public final String a() {
        return "playgames.google.com";
    }

    @Override // defpackage.chh
    public final String b() {
        return "playgames.google.com";
    }

    public static alr a(chu chuVar, String str) {
        aat.a(chuVar);
        return new alr(null, null, chuVar.a(), null, chuVar.a, str, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.b(parcel, a);
    }
}
