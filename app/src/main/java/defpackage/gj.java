package defpackage;

import android.content.Context;
import android.net.Uri;
import defpackage.dh;
import defpackage.fw;
import java.io.InputStream;

/* renamed from: gj  reason: default package */
/* loaded from: classes2.dex */
public final class gj implements fw<Uri, InputStream> {
    private final Context a;

    @Override // defpackage.fw
    public final /* synthetic */ fw.a<InputStream> a(Uri uri, int i, int i2, cm cmVar) {
        Uri uri2 = uri;
        if (dg.a(i, i2)) {
            Long l = (Long) cmVar.a(hp.a);
            if (!(l != null && l.longValue() == -1)) {
                return null;
            }
            ku kuVar = new ku(uri2);
            Context context = this.a;
            return new fw.a<>(kuVar, dh.a(context, uri2, new dh.b(context.getContentResolver())));
        }
        return null;
    }

    @Override // defpackage.fw
    public final /* synthetic */ boolean a(Uri uri) {
        Uri uri2 = uri;
        return dg.a(uri2) && dg.b(uri2);
    }

    public gj(Context context) {
        this.a = context.getApplicationContext();
    }

    /* renamed from: gj$a */
    /* loaded from: classes2.dex */
    public static class a implements fx<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.fx
        public final fw<Uri, InputStream> a(ga gaVar) {
            return new gj(this.a);
        }
    }
}
