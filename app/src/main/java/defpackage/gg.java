package defpackage;

import android.net.Uri;
import defpackage.fw;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gg  reason: default package */
/* loaded from: classes2.dex */
public final class gg<Data> implements fw<Uri, Data> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final fw<fp, Data> b;

    @Override // defpackage.fw
    public final /* synthetic */ fw.a a(Uri uri, int i, int i2, cm cmVar) {
        return this.b.a(new fp(uri.toString()), i, i2, cmVar);
    }

    @Override // defpackage.fw
    public final /* synthetic */ boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }

    public gg(fw<fp, Data> fwVar) {
        this.b = fwVar;
    }

    /* renamed from: gg$a */
    /* loaded from: classes2.dex */
    public static class a implements fx<Uri, InputStream> {
        @Override // defpackage.fx
        public final fw<Uri, InputStream> a(ga gaVar) {
            return new gg(gaVar.a(fp.class, InputStream.class));
        }
    }
}
