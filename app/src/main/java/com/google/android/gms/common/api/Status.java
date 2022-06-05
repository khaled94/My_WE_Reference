package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.aar;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends abb implements ReflectedParcelable, vi {
    final int h;
    public final int i;
    public final String j;
    public final ConnectionResult k;
    private final PendingIntent l;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Status g = new Status(17);
    public static final Status f = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new zt();

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.h = i;
        this.i = i2;
        this.j = str;
        this.l = pendingIntent;
        this.k = connectionResult;
    }

    @Override // defpackage.vi
    public final Status a() {
        return this;
    }

    public final boolean b() {
        return this.l != null;
    }

    public final boolean c() {
        return this.i <= 0;
    }

    public final String d() {
        String str = this.j;
        return str != null ? str : vd.a(this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.h == status.h && this.i == status.i && aar.a(this.j, status.j) && aar.a(this.l, status.l) && aar.a(this.k, status.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.l, this.k});
    }

    public final String toString() {
        aar.a a2 = aar.a(this);
        a2.a("statusCode", d());
        a2.a("resolution", this.l);
        return a2.toString();
    }

    private Status(int i, String str, PendingIntent pendingIntent, byte b2) {
        this(1, i, str, pendingIntent, null);
    }

    public Status(int i, String str) {
        this(i, str, null, (byte) 0);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, (byte) 0);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, (byte) 0);
    }

    @Deprecated
    private Status(ConnectionResult connectionResult, String str, byte b2) {
        this(1, 17, str, connectionResult.d, connectionResult);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.i);
        abc.a(parcel, 2, this.j);
        abc.a(parcel, 3, this.l, i);
        abc.a(parcel, 4, this.k, i);
        abc.a(parcel, 1000, this.h);
        abc.b(parcel, a2);
    }
}
