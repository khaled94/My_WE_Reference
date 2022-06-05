package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afn;

/* renamed from: afd  reason: default package */
/* loaded from: classes.dex */
public final class afd extends abb {
    public static final Parcelable.Creator<afd> CREATOR = new afe();
    private final String a;
    private final boolean b;
    private final boolean c;
    private final Context d;
    private final boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public afd(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = (Context) afp.a(afn.a.a(iBinder));
        this.e = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [afn, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, (IBinder) afp.a(this.d));
        abc.a(parcel, 5, this.e);
        abc.b(parcel, a);
    }
}
