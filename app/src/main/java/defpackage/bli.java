package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bli  reason: default package */
/* loaded from: classes2.dex */
public final class bli extends abb {
    public static final Parcelable.Creator<bli> CREATOR = new bll();
    public final String a;
    public final blh b;
    public final String c;
    public final long d;

    public bli(String str, blh blhVar, String str2, long j) {
        this.a = str;
        this.b = blhVar;
        this.c = str2;
        this.d = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bli(bli bliVar, long j) {
        aat.a(bliVar);
        this.a = bliVar.a;
        this.b = bliVar.b;
        this.c = bliVar.c;
        this.d = j;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a);
        abc.a(parcel, 3, this.b, i);
        abc.a(parcel, 4, this.c);
        abc.a(parcel, 5, this.d);
        abc.b(parcel, a);
    }
}
