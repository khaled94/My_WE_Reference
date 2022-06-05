package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.fw;
import java.io.InputStream;

/* renamed from: gb  reason: default package */
/* loaded from: classes2.dex */
public final class gb<Data> implements fw<Integer, Data> {
    private final fw<Uri, Data> a;
    private final Resources b;

    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // defpackage.fw
    public final /* bridge */ /* synthetic */ fw.a a(Integer num, int i, int i2, cm cmVar) {
        Uri a2 = a2(num);
        if (a2 == null) {
            return null;
        }
        return this.a.a(a2, i, i2, cmVar);
    }

    public gb(Resources resources, fw<Uri, Data> fwVar) {
        this.b = resources;
        this.a = fwVar;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private Uri a2(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            new StringBuilder("Received invalid resource id: ").append(num);
            return null;
        }
    }

    /* renamed from: gb$c */
    /* loaded from: classes2.dex */
    public static class c implements fx<Integer, InputStream> {
        private final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.fx
        public final fw<Integer, InputStream> a(ga gaVar) {
            return new gb(this.a, gaVar.a(Uri.class, InputStream.class));
        }
    }

    /* renamed from: gb$b */
    /* loaded from: classes2.dex */
    public static class b implements fx<Integer, ParcelFileDescriptor> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.fx
        public final fw<Integer, ParcelFileDescriptor> a(ga gaVar) {
            return new gb(this.a, gaVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: gb$a */
    /* loaded from: classes2.dex */
    public static final class a implements fx<Integer, AssetFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.fx
        public final fw<Integer, AssetFileDescriptor> a(ga gaVar) {
            return new gb(this.a, gaVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: gb$d */
    /* loaded from: classes2.dex */
    public static class d implements fx<Integer, Uri> {
        private final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.fx
        public final fw<Integer, Uri> a(ga gaVar) {
            return new gb(this.a, ge.a());
        }
    }
}
