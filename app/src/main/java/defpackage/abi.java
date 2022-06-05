package defpackage;

import android.content.Context;
import defpackage.vc;
import defpackage.ve;
import defpackage.wf;

/* renamed from: abi  reason: default package */
/* loaded from: classes.dex */
public final class abi extends ve<aba> implements aaz {
    public static final /* synthetic */ int a = 0;
    private static final vc.g<abj> i = new vc.g<>();
    private static final vc.a<abj, aba> j;
    private static final vc<aba> k;

    static {
        abh abhVar = new abh();
        j = abhVar;
        k = new vc<>("ClientTelemetry.API", abhVar, i);
    }

    public abi(Context context, aba abaVar) {
        super(context, k, abaVar, ve.a.a);
    }

    @Override // defpackage.aaz
    public final bwl<Void> a(final aax aaxVar) {
        wf.a a2 = wf.a();
        a2.c = new uw[]{aio.a};
        a2.b = false;
        a2.a = new wb() { // from class: abg
            @Override // defpackage.wb
            public final void a(Object obj, Object obj2) {
                aax aaxVar2 = aax.this;
                int i2 = abi.a;
                ((abf) ((abj) obj).q()).a(aaxVar2);
                ((bwm) obj2).a((bwm) null);
            }
        };
        return a(a2.a());
    }
}
