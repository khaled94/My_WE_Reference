package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.fw;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gf  reason: default package */
/* loaded from: classes2.dex */
public final class gf<Data> implements fw<Uri, Data> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final c<Data> b;

    /* renamed from: gf$c */
    /* loaded from: classes2.dex */
    public interface c<Data> {
        cu<Data> a(Uri uri);
    }

    @Override // defpackage.fw
    public final /* synthetic */ fw.a a(Uri uri, int i, int i2, cm cmVar) {
        Uri uri2 = uri;
        return new fw.a(new ku(uri2), this.b.a(uri2));
    }

    @Override // defpackage.fw
    public final /* synthetic */ boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }

    public gf(c<Data> cVar) {
        this.b = cVar;
    }

    /* renamed from: gf$d */
    /* loaded from: classes2.dex */
    public static class d implements fx<Uri, InputStream>, c<InputStream> {
        private final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.gf.c
        public final cu<InputStream> a(Uri uri) {
            return new de(this.a, uri);
        }

        @Override // defpackage.fx
        public final fw<Uri, InputStream> a(ga gaVar) {
            return new gf(this);
        }
    }

    /* renamed from: gf$b */
    /* loaded from: classes2.dex */
    public static class b implements fx<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.gf.c
        public final cu<ParcelFileDescriptor> a(Uri uri) {
            return new cz(this.a, uri);
        }

        @Override // defpackage.fx
        public final fw<Uri, ParcelFileDescriptor> a(ga gaVar) {
            return new gf(this);
        }
    }

    /* renamed from: gf$a */
    /* loaded from: classes2.dex */
    public static final class a implements fx<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.fx
        public final fw<Uri, AssetFileDescriptor> a(ga gaVar) {
            return new gf(this);
        }

        @Override // defpackage.gf.c
        public final cu<AssetFileDescriptor> a(Uri uri) {
            return new cr(this.a, uri);
        }
    }
}
