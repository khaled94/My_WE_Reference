package defpackage;

import android.content.Context;
import android.os.Looper;
import defpackage.bgt;
import defpackage.vc;
import defpackage.vf;

/* renamed from: bhw  reason: default package */
/* loaded from: classes2.dex */
public final class bhw extends vc.a<bhu, bgt> {
    @Override // defpackage.vc.a
    public final /* synthetic */ bhu a(Context context, Looper looper, aaf aafVar, bgt bgtVar, vf.b bVar, vf.c cVar) {
        if (bgtVar == null) {
            new bgt.a();
            bgt.a.a();
        }
        return new bhu(context, looper, aafVar, bVar, cVar, context.getPackageName(), (byte) 0);
    }
}
