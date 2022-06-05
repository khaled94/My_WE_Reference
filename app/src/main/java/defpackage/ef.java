package defpackage;

import defpackage.cu;
import defpackage.dp;
import defpackage.fw;
import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ef  reason: default package */
/* loaded from: classes2.dex */
public final class ef implements cu.a<Object>, dp {
    private final dp.a a;
    private final dq<?> b;
    private int c;
    private int d = -1;
    private ck e;
    private List<fw<File, ?>> f;
    private int g;
    private volatile fw.a<?> h;
    private File i;
    private eg j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ef(dq<?> dqVar, dp.a aVar) {
        this.b = dqVar;
        this.a = aVar;
    }

    @Override // defpackage.dp
    public final boolean a() {
        li.a();
        try {
            List<ck> d = this.b.d();
            boolean z = false;
            if (d.isEmpty()) {
                return false;
            }
            dq<?> dqVar = this.b;
            List<Class<?>> b = dqVar.a.c.b(dqVar.b.getClass(), dqVar.e, dqVar.i);
            if (b.isEmpty()) {
                if (File.class.equals(this.b.i)) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.b.b.getClass() + " to " + this.b.i);
            }
            while (true) {
                if (this.f != null && c()) {
                    this.h = null;
                    while (!z && c()) {
                        List<fw<File, ?>> list = this.f;
                        int i = this.g;
                        this.g = i + 1;
                        this.h = list.get(i).a(this.i, this.b.c, this.b.d, this.b.g);
                        if (this.h != null && this.b.a(this.h.c.a())) {
                            this.h.c.a(this.b.k, this);
                            z = true;
                        }
                    }
                    return z;
                }
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 >= b.size()) {
                    int i3 = this.c + 1;
                    this.c = i3;
                    if (i3 >= d.size()) {
                        return false;
                    }
                    this.d = 0;
                }
                ck ckVar = d.get(this.c);
                Class<?> cls = b.get(this.d);
                this.j = new eg(this.b.a.b, ckVar, this.b.j, this.b.c, this.b.d, this.b.c(cls), cls, this.b.g);
                File a = this.b.b().a(this.j);
                this.i = a;
                if (a != null) {
                    this.e = ckVar;
                    this.f = this.b.a(a);
                    this.g = 0;
                }
            }
        } finally {
            li.f();
        }
    }

    private boolean c() {
        return this.g < this.f.size();
    }

    @Override // defpackage.dp
    public final void b() {
        fw.a<?> aVar = this.h;
        if (aVar != null) {
            aVar.c.c();
        }
    }

    @Override // defpackage.cu.a
    public final void a(Object obj) {
        this.a.a(this.e, obj, this.h.c, cf.RESOURCE_DISK_CACHE, this.j);
    }

    @Override // defpackage.cu.a
    public final void a(Exception exc) {
        this.a.a(this.j, exc, this.h.c, cf.RESOURCE_DISK_CACHE);
    }
}
