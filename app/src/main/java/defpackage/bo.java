package defpackage;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import defpackage.bp;
import defpackage.cv;
import defpackage.db;
import defpackage.ff;
import defpackage.fj;
import defpackage.fk;
import defpackage.fm;
import defpackage.fn;
import defpackage.fo;
import defpackage.ft;
import defpackage.gb;
import defpackage.gd;
import defpackage.ge;
import defpackage.gf;
import defpackage.gg;
import defpackage.gh;
import defpackage.gi;
import defpackage.gj;
import defpackage.gk;
import defpackage.gl;
import defpackage.hq;
import defpackage.hs;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bo  reason: default package */
/* loaded from: classes2.dex */
public class bo implements ComponentCallbacks2 {
    private static volatile bo h;
    private static volatile boolean i;
    public final en a;
    public final bq b;
    public final Registry c;
    public final ek d;
    public final jg e;
    final iu f;
    private final du j;
    private final fe k;
    private final a l;
    final List<bv> g = new ArrayList();
    private bs m = bs.NORMAL;

    /* renamed from: bo$a */
    /* loaded from: classes2.dex */
    public interface a {
        kb a();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public static bo a(Context context) {
        if (h == null) {
            GeneratedAppGlideModule c = c(context.getApplicationContext());
            synchronized (bo.class) {
                if (h == null) {
                    if (i) {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                    i = true;
                    a(context, new bp(), c);
                    i = false;
                }
            }
        }
        return h;
    }

    private static void a(Context context, bp bpVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        List<jn> a2 = new jp(applicationContext).a();
        if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
            Set<Class<?>> a3 = generatedAppGlideModule.a();
            Iterator<jn> it = a2.iterator();
            while (it.hasNext()) {
                jn next = it.next();
                if (a3.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        new StringBuilder("AppGlideModule excludes manifest GlideModule: ").append(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (jn jnVar : a2) {
                new StringBuilder("Discovered GlideModule from manifest: ").append(jnVar.getClass());
            }
        }
        bpVar.n = null;
        Iterator<jn> it2 = a2.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        if (bpVar.g == null) {
            bpVar.g = fh.b();
        }
        if (bpVar.h == null) {
            bpVar.h = fh.a();
        }
        if (bpVar.o == null) {
            bpVar.o = fh.d();
        }
        if (bpVar.j == null) {
            bpVar.j = new ff(new ff.a(applicationContext));
        }
        if (bpVar.k == null) {
            bpVar.k = new iw();
        }
        if (bpVar.d == null) {
            int i2 = bpVar.j.a;
            if (i2 > 0) {
                bpVar.d = new et(i2);
            } else {
                bpVar.d = new eo();
            }
        }
        if (bpVar.e == null) {
            bpVar.e = new es(bpVar.j.c);
        }
        if (bpVar.f == null) {
            bpVar.f = new fd(bpVar.j.b);
        }
        if (bpVar.i == null) {
            bpVar.i = new fc(applicationContext);
        }
        if (bpVar.c == null) {
            bpVar.c = new du(bpVar.f, bpVar.i, bpVar.h, bpVar.g, fh.c(), bpVar.o, bpVar.p);
        }
        if (bpVar.q == null) {
            bpVar.q = Collections.emptyList();
        } else {
            bpVar.q = Collections.unmodifiableList(bpVar.q);
        }
        br brVar = new br(bpVar.b);
        bo boVar = new bo(applicationContext, bpVar.c, bpVar.f, bpVar.d, bpVar.e, new jg(bpVar.n, brVar), bpVar.k, bpVar.l, bpVar.m, bpVar.a, bpVar.q, brVar);
        Iterator<jn> it3 = a2.iterator();
        while (it3.hasNext()) {
            it3.next();
        }
        applicationContext.registerComponentCallbacks(boVar);
        h = boVar;
    }

    private static GeneratedAppGlideModule c(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            a(e);
            return null;
        } catch (InstantiationException e2) {
            a(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            a(e3);
            return null;
        } catch (InvocationTargetException e4) {
            a(e4);
            return null;
        }
    }

    private static void a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    private bo(Context context, du duVar, fe feVar, en enVar, ek ekVar, jg jgVar, iu iuVar, int i2, a aVar, Map<Class<?>, bw<?, ?>> map, List<ka<Object>> list, br brVar) {
        co coVar;
        co coVar2;
        ia iaVar;
        Object obj;
        hw hwVar;
        this.j = duVar;
        this.a = enVar;
        this.d = ekVar;
        this.k = feVar;
        this.e = jgVar;
        this.f = iuVar;
        this.l = aVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.c = registry;
        registry.a((ImageHeaderParser) new DefaultImageHeaderParser());
        if (Build.VERSION.SDK_INT >= 27) {
            this.c.a((ImageHeaderParser) new hd());
        }
        List<ImageHeaderParser> a2 = this.c.a();
        ia iaVar2 = new ia(context, a2, enVar, ekVar);
        co<ParcelFileDescriptor, Bitmap> b = hp.b(enVar);
        ha haVar = new ha(this.c.a(), resources.getDisplayMetrics(), enVar, ekVar);
        if (Build.VERSION.SDK_INT >= 28 && brVar.a(bp.b.class)) {
            coVar2 = new hh();
            coVar = new gw();
        } else {
            coVar = new gv(haVar);
            coVar2 = new hm(haVar, ekVar);
        }
        if (Build.VERSION.SDK_INT < 28 || !brVar.a(bp.a.class)) {
            obj = byte[].class;
            iaVar = iaVar2;
        } else {
            obj = byte[].class;
            iaVar = iaVar2;
            this.c.a("Animation", InputStream.class, Drawable.class, new hs.c(new hs(a2, ekVar)));
            this.c.a("Animation", ByteBuffer.class, Drawable.class, new hs.b(new hs(a2, ekVar)));
        }
        hw hwVar2 = new hw(context);
        gb.c cVar = new gb.c(resources);
        gb.d dVar = new gb.d(resources);
        gb.b bVar = new gb.b(resources);
        gb.a aVar2 = new gb.a(resources);
        gr grVar = new gr(ekVar);
        ik ikVar = new ik();
        in inVar = new in();
        ContentResolver contentResolver = context.getContentResolver();
        this.c.a(ByteBuffer.class, new fl()).a(InputStream.class, new gc(ekVar)).a("Bitmap", ByteBuffer.class, Bitmap.class, coVar).a("Bitmap", InputStream.class, Bitmap.class, coVar2);
        if (ParcelFileDescriptorRewinder.c()) {
            hwVar = hwVar2;
            this.c.a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new hj(haVar));
        } else {
            hwVar = hwVar2;
        }
        ia iaVar3 = iaVar;
        hw hwVar3 = hwVar;
        this.c.a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b).a("Bitmap", AssetFileDescriptor.class, Bitmap.class, hp.a(enVar)).a(Bitmap.class, Bitmap.class, ge.a.a()).a("Bitmap", Bitmap.class, Bitmap.class, new ho()).a(Bitmap.class, (cp) grVar).a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new gp(resources, coVar)).a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new gp(resources, coVar2)).a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new gp(resources, b)).a(BitmapDrawable.class, (cp) new gq(enVar, grVar)).a("Animation", InputStream.class, ic.class, new ij(a2, iaVar3, ekVar)).a("Animation", ByteBuffer.class, ic.class, iaVar3).a(ic.class, (cp) new id()).a(ca.class, ca.class, ge.a.a()).a("Bitmap", ca.class, Bitmap.class, new ih(enVar)).a(Uri.class, Drawable.class, hwVar3).a(Uri.class, Bitmap.class, new hl(hwVar3, enVar)).a((cv.a<?>) new hq.a()).a(File.class, ByteBuffer.class, new fm.b()).a(File.class, InputStream.class, new fo.e()).a(File.class, File.class, new hy()).a(File.class, ParcelFileDescriptor.class, new fo.b()).a(File.class, File.class, ge.a.a()).a((cv.a<?>) new db.a(ekVar));
        if (ParcelFileDescriptorRewinder.c()) {
            this.c.a((cv.a<?>) new ParcelFileDescriptorRewinder.a());
        }
        this.c.a(Integer.TYPE, InputStream.class, cVar).a(Integer.TYPE, ParcelFileDescriptor.class, bVar).a(Integer.class, InputStream.class, cVar).a(Integer.class, ParcelFileDescriptor.class, bVar).a(Integer.class, Uri.class, dVar).a(Integer.TYPE, AssetFileDescriptor.class, aVar2).a(Integer.class, AssetFileDescriptor.class, aVar2).a(Integer.TYPE, Uri.class, dVar).a(String.class, InputStream.class, new fn.c()).a(Uri.class, InputStream.class, new fn.c()).a(String.class, InputStream.class, new gd.c()).a(String.class, ParcelFileDescriptor.class, new gd.b()).a(String.class, AssetFileDescriptor.class, new gd.a()).a(Uri.class, InputStream.class, new fj.c(context.getAssets())).a(Uri.class, AssetFileDescriptor.class, new fj.b(context.getAssets())).a(Uri.class, InputStream.class, new gi.a(context)).a(Uri.class, InputStream.class, new gj.a(context));
        if (Build.VERSION.SDK_INT >= 29) {
            this.c.a(Uri.class, InputStream.class, new gk.c(context));
            this.c.a(Uri.class, ParcelFileDescriptor.class, new gk.b(context));
        }
        Object obj2 = obj;
        this.c.a(Uri.class, InputStream.class, new gf.d(contentResolver)).a(Uri.class, ParcelFileDescriptor.class, new gf.b(contentResolver)).a(Uri.class, AssetFileDescriptor.class, new gf.a(contentResolver)).a(Uri.class, InputStream.class, new gg.a()).a(URL.class, InputStream.class, new gl.a()).a(Uri.class, File.class, new ft.a(context)).a(fp.class, InputStream.class, new gh.a()).a((Class) obj2, ByteBuffer.class, (fx) new fk.a()).a((Class) obj2, InputStream.class, (fx) new fk.d()).a(Uri.class, Uri.class, ge.a.a()).a(Drawable.class, Drawable.class, ge.a.a()).a(Drawable.class, Drawable.class, new hx()).a(Bitmap.class, BitmapDrawable.class, new il(resources)).a(Bitmap.class, (Class) obj2, (io) ikVar).a(Drawable.class, (Class) obj2, (io) new im(enVar, ikVar, inVar)).a(ic.class, (Class) obj2, (io) inVar);
        if (Build.VERSION.SDK_INT >= 23) {
            co<ByteBuffer, Bitmap> c = hp.c(enVar);
            this.c.a(ByteBuffer.class, Bitmap.class, c);
            this.c.a(ByteBuffer.class, BitmapDrawable.class, new gp(resources, c));
        }
        this.b = new bq(context, ekVar, this.c, new kk(), aVar, map, list, duVar, brVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(km<?> kmVar) {
        synchronized (this.g) {
            for (bv bvVar : this.g) {
                if (bvVar.b(kmVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static bv b(Context context) {
        lf.a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).e.a(context);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        lg.a();
        synchronized (this.g) {
            for (bv bvVar : this.g) {
                bvVar.onTrimMemory(i2);
            }
        }
        this.k.a(i2);
        this.a.a(i2);
        this.d.a(i2);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        lg.a();
        this.k.a();
        this.a.a();
        this.d.a();
    }
}
