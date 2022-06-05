package defpackage;

import defpackage.fw;
import java.io.InputStream;
import java.net.URL;

/* renamed from: gl  reason: default package */
/* loaded from: classes2.dex */
public final class gl implements fw<URL, InputStream> {
    private final fw<fp, InputStream> a;

    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // defpackage.fw
    public final /* synthetic */ fw.a<InputStream> a(URL url, int i, int i2, cm cmVar) {
        return this.a.a(new fp(url), i, i2, cmVar);
    }

    public gl(fw<fp, InputStream> fwVar) {
        this.a = fwVar;
    }

    /* renamed from: gl$a */
    /* loaded from: classes2.dex */
    public static class a implements fx<URL, InputStream> {
        @Override // defpackage.fx
        public final fw<URL, InputStream> a(ga gaVar) {
            return new gl(gaVar.a(fp.class, InputStream.class));
        }
    }
}
