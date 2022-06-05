package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: akx  reason: default package */
/* loaded from: classes.dex */
public final class akx extends abb {
    public static final Parcelable.Creator<akx> CREATOR = new akw();
    public final Status a;
    public final cll b;
    public final String c;
    public final String d;

    public akx(Status status, cll cllVar, String str, String str2) {
        this.a = status;
        this.b = cllVar;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a, i);
        abc.a(parcel, 2, this.b, i);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.b(parcel, a);
    }
}
