package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import defpackage.fw;
import java.io.File;
import java.io.InputStream;

/* renamed from: gd  reason: default package */
/* loaded from: classes2.dex */
public final class gd<Data> implements fw<String, Data> {
    private final fw<Uri, Data> a;

    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // defpackage.fw
    public final /* synthetic */ fw.a a(String str, int i, int i2, cm cmVar) {
        Uri uri;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else if (str2.charAt(0) == '/') {
            uri = a2(str2);
        } else {
            Uri parse = Uri.parse(str2);
            uri = parse.getScheme() == null ? a2(str2) : parse;
        }
        if (uri == null || !this.a.a(uri)) {
            return null;
        }
        return this.a.a(uri, i, i2, cmVar);
    }

    public gd(fw<Uri, Data> fwVar) {
        this.a = fwVar;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Uri a2(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: gd$c */
    /* loaded from: classes2.dex */
    public static class c implements fx<String, InputStream> {
        @Override // defpackage.fx
        public final fw<String, InputStream> a(ga gaVar) {
            return new gd(gaVar.a(Uri.class, InputStream.class));
        }
    }

    /* renamed from: gd$b */
    /* loaded from: classes2.dex */
    public static class b implements fx<String, ParcelFileDescriptor> {
        @Override // defpackage.fx
        public final fw<String, ParcelFileDescriptor> a(ga gaVar) {
            return new gd(gaVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: gd$a */
    /* loaded from: classes2.dex */
    public static final class a implements fx<String, AssetFileDescriptor> {
        @Override // defpackage.fx
        public final fw<String, AssetFileDescriptor> a(ga gaVar) {
            return new gd(gaVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }
}
