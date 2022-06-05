package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes.dex */
public final class GoogleMapOptions extends abb implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new bku();
    private Boolean a;
    private Boolean b;
    private int c;
    private CameraPosition d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Float n;
    private Float o;
    private LatLngBounds p;
    private Boolean q;

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12) {
        this.c = -1;
        this.n = null;
        this.o = null;
        this.p = null;
        this.a = bjw.a(b);
        this.b = bjw.a(b2);
        this.c = i;
        this.d = cameraPosition;
        this.e = bjw.a(b3);
        this.f = bjw.a(b4);
        this.g = bjw.a(b5);
        this.h = bjw.a(b6);
        this.i = bjw.a(b7);
        this.j = bjw.a(b8);
        this.k = bjw.a(b9);
        this.l = bjw.a(b10);
        this.m = bjw.a(b11);
        this.n = f;
        this.o = f2;
        this.p = latLngBounds;
        this.q = bjw.a(b12);
    }

    public GoogleMapOptions() {
        this.c = -1;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.maps.GoogleMapOptions a(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.GoogleMapOptions.a(android.content.Context, android.util.AttributeSet):com.google.android.gms.maps.GoogleMapOptions");
    }

    public final String toString() {
        return aar.a(this).a("MapType", Integer.valueOf(this.c)).a("LiteMode", this.k).a("Camera", this.d).a("CompassEnabled", this.f).a("ZoomControlsEnabled", this.e).a("ScrollGesturesEnabled", this.g).a("ZoomGesturesEnabled", this.h).a("TiltGesturesEnabled", this.i).a("RotateGesturesEnabled", this.j).a("ScrollGesturesEnabledDuringRotateOrZoom", this.q).a("MapToolbarEnabled", this.l).a("AmbientEnabled", this.m).a("MinZoomPreference", this.n).a("MaxZoomPreference", this.o).a("LatLngBoundsForCameraTarget", this.p).a("ZOrderOnTop", this.a).a("UseViewLifecycleInFragment", this.b).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, bjw.a(this.a));
        abc.a(parcel, 3, bjw.a(this.b));
        abc.a(parcel, 4, this.c);
        abc.a(parcel, 5, this.d, i);
        abc.a(parcel, 6, bjw.a(this.e));
        abc.a(parcel, 7, bjw.a(this.f));
        abc.a(parcel, 8, bjw.a(this.g));
        abc.a(parcel, 9, bjw.a(this.h));
        abc.a(parcel, 10, bjw.a(this.i));
        abc.a(parcel, 11, bjw.a(this.j));
        abc.a(parcel, 12, bjw.a(this.k));
        abc.a(parcel, 14, bjw.a(this.l));
        abc.a(parcel, 15, bjw.a(this.m));
        abc.a(parcel, 16, this.n);
        abc.a(parcel, 17, this.o);
        abc.a(parcel, 18, this.p, i);
        abc.a(parcel, 19, bjw.a(this.q));
        abc.b(parcel, a);
    }
}
