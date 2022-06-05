package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import defpackage.fw;
import java.io.InputStream;

/* renamed from: fj  reason: default package */
/* loaded from: classes2.dex */
public final class fj<Data> implements fw<Uri, Data> {
    private static final int a = 22;
    private final AssetManager b;
    private final a<Data> c;

    /* renamed from: fj$a */
    /* loaded from: classes2.dex */
    public interface a<Data> {
        cu<Data> a(AssetManager assetManager, String str);
    }

    @Override // defpackage.fw
    public final /* synthetic */ fw.a a(Uri uri, int i, int i2, cm cmVar) {
        Uri uri2 = uri;
        return new fw.a(new ku(uri2), this.c.a(this.b, uri2.toString().substring(a)));
    }

    @Override // defpackage.fw
    public final /* synthetic */ boolean a(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    public fj(AssetManager assetManager, a<Data> aVar) {
        this.b = assetManager;
        this.c = aVar;
    }

    /* renamed from: fj$c */
    /* loaded from: classes2.dex */
    public static class c implements a<InputStream>, fx<Uri, InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // defpackage.fx
        public final fw<Uri, InputStream> a(ga gaVar) {
            return new fj(this.a, this);
        }

        @Override // defpackage.fj.a
        public final cu<InputStream> a(AssetManager assetManager, String str) {
            return new dd(assetManager, str);
        }
    }

    /* renamed from: fj$b */
    /* loaded from: classes2.dex */
    public static class b implements a<AssetFileDescriptor>, fx<Uri, AssetFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // defpackage.fx
        public final fw<Uri, AssetFileDescriptor> a(ga gaVar) {
            return new fj(this.a, this);
        }

        @Override // defpackage.fj.a
        public final cu<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new cy(assetManager, str);
        }
    }
}
