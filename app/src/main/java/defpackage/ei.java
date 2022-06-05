package defpackage;

import android.util.Log;
import com.bumptech.glide.Registry;
import defpackage.cu;
import defpackage.dp;
import defpackage.fw;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ei  reason: default package */
/* loaded from: classes2.dex */
public final class ei implements dp, dp.a {
    final dq<?> a;
    final dp.a b;
    volatile Object c;
    volatile dn d;
    private volatile int e;
    private volatile dm f;
    private volatile fw.a<?> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ei(dq<?> dqVar, dp.a aVar) {
        this.a = dqVar;
        this.b = aVar;
    }

    @Override // defpackage.dp
    public final boolean a() {
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                if (!a(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f == null || !this.f.a()) {
            this.f = null;
            this.g = null;
            boolean z = false;
            while (!z) {
                if (!(this.e < this.a.c().size())) {
                    break;
                }
                List<fw.a<?>> c = this.a.c();
                int i = this.e;
                this.e = i + 1;
                this.g = c.get(i);
                if (this.g != null && (this.a.l.a(this.g.c.d()) || this.a.a(this.g.c.a()))) {
                    final fw.a<?> aVar = this.g;
                    this.g.c.a(this.a.k, new cu.a<Object>() { // from class: ei.1
                        @Override // defpackage.cu.a
                        public final void a(Object obj2) {
                            if (ei.this.a(aVar)) {
                                ei eiVar = ei.this;
                                fw.a aVar2 = aVar;
                                dt dtVar = eiVar.a.l;
                                if (obj2 != null && dtVar.a(aVar2.c.d())) {
                                    eiVar.c = obj2;
                                    eiVar.b.c();
                                    return;
                                }
                                eiVar.b.a(aVar2.a, obj2, aVar2.c, aVar2.c.d(), eiVar.d);
                            }
                        }

                        @Override // defpackage.cu.a
                        public final void a(Exception exc) {
                            if (ei.this.a(aVar)) {
                                ei eiVar = ei.this;
                                fw.a aVar2 = aVar;
                                eiVar.b.a(eiVar.d, exc, aVar2.c, aVar2.c.d());
                            }
                        }
                    });
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    final boolean a(fw.a<?> aVar) {
        fw.a<?> aVar2 = this.g;
        return aVar2 != null && aVar2 == aVar;
    }

    private boolean a(Object obj) throws IOException {
        Throwable th;
        long a = lb.a();
        boolean z = true;
        try {
            cv a2 = this.a.a.c.a((Registry) obj);
            Object a3 = a2.a();
            ci a4 = this.a.a.c.a.a(a3.getClass());
            if (a4 != null) {
                C0053do c0053do = new C0053do(a4, a3, this.a.g);
                dn dnVar = new dn(this.g.a, this.a.j);
                ex b = this.a.b();
                b.a(dnVar, c0053do);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    StringBuilder sb = new StringBuilder("Finished encoding source to cache, key: ");
                    sb.append(dnVar);
                    sb.append(", data: ");
                    sb.append(obj);
                    sb.append(", encoder: ");
                    sb.append(a4);
                    sb.append(", duration: ");
                    sb.append(lb.a(a));
                }
                if (b.a(dnVar) != null) {
                    this.d = dnVar;
                    this.f = new dm(Collections.singletonList(this.g.a), this.a, this);
                    this.g.c.b();
                    return true;
                }
                if (Log.isLoggable("SourceGenerator", 3)) {
                    StringBuilder sb2 = new StringBuilder("Attempt to write: ");
                    sb2.append(this.d);
                    sb2.append(", data: ");
                    sb2.append(obj);
                    sb2.append(" to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
                }
                try {
                    this.b.a(this.g.a, a2.a(), this.g.c, this.g.c.d(), this.g.a);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (!z) {
                        this.g.c.b();
                    }
                    throw th;
                }
            }
            throw new Registry.NoSourceEncoderAvailableException(a3.getClass());
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    @Override // defpackage.dp
    public final void b() {
        fw.a<?> aVar = this.g;
        if (aVar != null) {
            aVar.c.c();
        }
    }

    @Override // defpackage.dp.a
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dp.a
    public final void a(ck ckVar, Object obj, cu<?> cuVar, cf cfVar, ck ckVar2) {
        this.b.a(ckVar, obj, cuVar, this.g.c.d(), ckVar);
    }

    @Override // defpackage.dp.a
    public final void a(ck ckVar, Exception exc, cu<?> cuVar, cf cfVar) {
        this.b.a(ckVar, exc, cuVar, this.g.c.d());
    }
}
