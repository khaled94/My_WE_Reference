package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.vf;

/* renamed from: anw  reason: default package */
/* loaded from: classes.dex */
public class anw extends aai<ane> {
    protected final ans<ane> a = new anv(this);
    private final String m;

    public anw(Context context, Looper looper, vf.b bVar, vf.c cVar, String str, aaf aafVar) {
        super(context, looper, 23, aafVar, bVar, cVar);
        this.m = str;
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final int a() {
        return 11717000;
    }

    @Override // defpackage.aad
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof ane) {
            return (ane) queryLocalInterface;
        }
        return new and(iBinder);
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.aad
    public final Bundle p() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.m);
        return bundle;
    }

    @Override // defpackage.aad
    public final uw[] z() {
        return bjc.f;
    }
}
