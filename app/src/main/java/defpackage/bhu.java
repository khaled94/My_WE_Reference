package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.vf;
import java.util.Locale;

/* renamed from: bhu  reason: default package */
/* loaded from: classes2.dex */
public final class bhu extends aai<bhx> {
    final bhk a;

    private bhu(Context context, Looper looper, aaf aafVar, vf.b bVar, vf.c cVar, String str) {
        super(context, looper, 65, aafVar, bVar, cVar);
        this.a = new bhk(str, Locale.getDefault(), aafVar.a != null ? aafVar.a.name : null);
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final int a() {
        return uz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    @Override // defpackage.aad
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (queryLocalInterface instanceof bhx) {
            return (bhx) queryLocalInterface;
        }
        return new bhz(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bhu(Context context, Looper looper, aaf aafVar, vf.b bVar, vf.c cVar, String str, byte b) {
        this(context, looper, aafVar, bVar, cVar, str);
    }
}
