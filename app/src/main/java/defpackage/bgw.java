package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.vf;
import java.util.Locale;

/* renamed from: bgw  reason: default package */
/* loaded from: classes2.dex */
public final class bgw extends aai<bhv> {
    private final bhk a;
    private final Locale m;

    private bgw(Context context, Looper looper, aaf aafVar, vf.b bVar, vf.c cVar, String str) {
        super(context, looper, 67, aafVar, bVar, cVar);
        this.m = Locale.getDefault();
        this.a = new bhk(str, this.m, aafVar.a != null ? aafVar.a.name : null);
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final int a() {
        return uz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    @Override // defpackage.aad
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (queryLocalInterface instanceof bhv) {
            return (bhv) queryLocalInterface;
        }
        return new bhy(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bgw(Context context, Looper looper, aaf aafVar, vf.b bVar, vf.c cVar, String str, byte b) {
        this(context, looper, aafVar, bVar, cVar, str);
    }
}
