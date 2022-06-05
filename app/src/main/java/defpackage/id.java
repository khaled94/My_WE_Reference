package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: id  reason: default package */
/* loaded from: classes2.dex */
public final class id implements cp<ic> {
    @Override // defpackage.ci
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, cm cmVar) {
        return a((ee) obj, file);
    }

    @Override // defpackage.cp
    public final ch a(cm cmVar) {
        return ch.SOURCE;
    }

    private static boolean a(ee<ic> eeVar, File file) {
        try {
            kv.a(eeVar.b().b(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
