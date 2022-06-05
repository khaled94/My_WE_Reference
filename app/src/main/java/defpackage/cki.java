package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: cki  reason: default package */
/* loaded from: classes2.dex */
public final class cki implements chg {
    public static final Parcelable.Creator<cki> CREATOR = new ckh();
    private final String a;
    private final String b;
    private Map<String, Object> c;
    private boolean d;

    public cki(String str, String str2, boolean z) {
        aat.a(str);
        aat.a(str2);
        this.a = str;
        this.b = str2;
        this.c = cjv.b(str2);
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public cki(boolean z) {
        this.d = z;
        this.b = null;
        this.a = null;
        this.c = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.d);
        abc.b(parcel, a);
    }
}
