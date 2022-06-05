package defpackage;

import defpackage.fv;
import defpackage.fw;
import java.io.InputStream;

/* renamed from: gh  reason: default package */
/* loaded from: classes2.dex */
public final class gh implements fw<fp, InputStream> {
    public static final cl<Integer> a = cl.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final fv<fp, fp> b;

    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ boolean a(fp fpVar) {
        return true;
    }

    @Override // defpackage.fw
    public final /* synthetic */ fw.a<InputStream> a(fp fpVar, int i, int i2, cm cmVar) {
        fp fpVar2 = fpVar;
        fv<fp, fp> fvVar = this.b;
        if (fvVar != null) {
            fp a2 = fvVar.a(fpVar2);
            if (a2 == null) {
                fv<fp, fp> fvVar2 = this.b;
                fvVar2.a.b(fv.a.a(fpVar2), fpVar2);
            } else {
                fpVar2 = a2;
            }
        }
        return new fw.a<>(fpVar2, new da(fpVar2, ((Integer) cmVar.a(a)).intValue()));
    }

    public gh() {
        this(null);
    }

    public gh(fv<fp, fp> fvVar) {
        this.b = fvVar;
    }

    /* renamed from: gh$a */
    /* loaded from: classes2.dex */
    public static class a implements fx<fp, InputStream> {
        private final fv<fp, fp> a = new fv<>(500);

        @Override // defpackage.fx
        public final fw<fp, InputStream> a(ga gaVar) {
            return new gh(this.a);
        }
    }
}
