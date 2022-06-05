package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import defpackage.afn;

/* renamed from: bkp  reason: default package */
/* loaded from: classes2.dex */
public final class bkp extends abb {
    public static final Parcelable.Creator<bkp> CREATOR = new bkt();
    public LatLng a;
    public String b;
    public String c;
    private bkm d;
    private float e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;

    public bkp() {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkp(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.d = null;
        } else {
            this.d = new bkm(afn.a.a(iBinder));
        }
        this.e = f;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a, i);
        abc.a(parcel, 3, this.b);
        abc.a(parcel, 4, this.c);
        bkm bkmVar = this.d;
        abc.a(parcel, 5, bkmVar == null ? null : bkmVar.a.asBinder());
        abc.a(parcel, 6, this.e);
        abc.a(parcel, 7, this.f);
        abc.a(parcel, 8, this.g);
        abc.a(parcel, 9, this.h);
        abc.a(parcel, 10, this.i);
        abc.a(parcel, 11, this.j);
        abc.a(parcel, 12, this.k);
        abc.a(parcel, 13, this.l);
        abc.a(parcel, 14, this.m);
        abc.a(parcel, 15, this.n);
        abc.b(parcel, a);
    }
}
