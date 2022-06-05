package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: bvp  reason: default package */
/* loaded from: classes2.dex */
public final class bvp extends abb implements vi {
    public static final Parcelable.Creator<bvp> CREATOR = new bvq();
    final int a;
    private int b;
    private Intent c;

    public bvp() {
        this(2, 0, null);
    }

    @Override // defpackage.vi
    public final Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bvp(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c, i);
        abc.b(parcel, a);
    }
}
