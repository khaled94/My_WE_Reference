package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: alo  reason: default package */
/* loaded from: classes.dex */
public final class alo extends abb {
    public static final Parcelable.Creator<alo> CREATOR = new alp();
    private String a;
    private String b;
    private String c;

    public alo() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public alo(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a);
        abc.a(parcel, 3, this.b);
        abc.a(parcel, 4, this.c);
        abc.b(parcel, a);
    }
}
