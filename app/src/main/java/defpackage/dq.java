package defpackage;

import com.bumptech.glide.Registry;
import defpackage.dr;
import defpackage.fw;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dq  reason: default package */
/* loaded from: classes2.dex */
public final class dq<Transcode> {
    bq a;
    Object b;
    int c;
    int d;
    Class<?> e;
    dr.d f;
    cm g;
    Map<Class<?>, cq<?>> h;
    Class<Transcode> i;
    ck j;
    bt k;
    dt l;
    boolean m;
    boolean n;
    private final List<fw.a<?>> o = new ArrayList();
    private final List<ck> p = new ArrayList();
    private boolean q;
    private boolean r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = null;
        this.b = null;
        this.j = null;
        this.e = null;
        this.i = null;
        this.g = null;
        this.k = null;
        this.h = null;
        this.l = null;
        this.o.clear();
        this.q = false;
        this.p.clear();
        this.r = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ex b() {
        return this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Class<?> cls) {
        return b(cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <Data> ec<Data, ?, Transcode> b(Class<Data> cls) {
        return this.a.c.a(cls, this.e, this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <Z> cq<Z> c(Class<Z> cls) {
        cq<Z> cqVar = (cq<Z>) this.h.get(cls);
        if (cqVar == null) {
            Iterator<Map.Entry<Class<?>, cq<?>>> it = this.h.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, cq<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    cqVar = (cq<Z>) next.getValue();
                    break;
                }
            }
        }
        if (cqVar == null) {
            if (this.h.isEmpty() && this.m) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return go.a();
        }
        return cqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<fw<File, ?>> a(File file) throws Registry.NoModelLoaderAvailableException {
        return this.a.c.b(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<fw.a<?>> c() {
        if (!this.q) {
            this.q = true;
            this.o.clear();
            List b = this.a.c.b(this.b);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                fw.a<?> a = ((fw) b.get(i)).a(this.b, this.c, this.d, this.g);
                if (a != null) {
                    this.o.add(a);
                }
            }
        }
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<ck> d() {
        if (!this.r) {
            this.r = true;
            this.p.clear();
            List<fw.a<?>> c = c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                fw.a<?> aVar = c.get(i);
                if (!this.p.contains(aVar.a)) {
                    this.p.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.p.contains(aVar.b.get(i2))) {
                        this.p.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.p;
    }
}
