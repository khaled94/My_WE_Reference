package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: at  reason: default package */
/* loaded from: classes.dex */
public final class at {
    private final AtomicInteger a;
    private final Set<as<?>> b;
    private final PriorityBlockingQueue<as<?>> c;
    private final PriorityBlockingQueue<as<?>> d;
    private final ak e;
    private final ap f;
    private final av g;
    private final aq[] h;
    private al i;
    private final List<Object> j;

    /* renamed from: at$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(as<?> asVar);
    }

    private at(ak akVar, ap apVar, av avVar) {
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.e = akVar;
        this.f = apVar;
        this.h = new aq[4];
        this.g = avVar;
    }

    private at(ak akVar, ap apVar) {
        this(akVar, apVar, new an(new Handler(Looper.getMainLooper())));
    }

    public at(ak akVar, ap apVar, byte b) {
        this(akVar, apVar);
    }

    public final void a(final Object obj) {
        a aVar = new a() { // from class: at.1
            @Override // defpackage.at.a
            public final boolean a(as<?> asVar) {
                return asVar.l == obj;
            }
        };
        synchronized (this.b) {
            for (as<?> asVar : this.b) {
                if (aVar.a(asVar)) {
                    asVar.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void b(as<T> asVar) {
        synchronized (this.b) {
            this.b.remove(asVar);
        }
        synchronized (this.j) {
            Iterator<Object> it = this.j.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void a() {
        aq[] aqVarArr;
        al alVar = this.i;
        if (alVar != null) {
            alVar.a();
        }
        for (aq aqVar : this.h) {
            if (aqVar != null) {
                aqVar.a = true;
                aqVar.interrupt();
            }
        }
        al alVar2 = new al(this.c, this.d, this.e, this.g);
        this.i = alVar2;
        alVar2.start();
        for (int i = 0; i < this.h.length; i++) {
            aq aqVar2 = new aq(this.d, this.f, this.e, this.g);
            this.h[i] = aqVar2;
            aqVar2.start();
        }
    }

    public final <T> as<T> a(as<T> asVar) {
        asVar.g = this;
        synchronized (this.b) {
            this.b.add(asVar);
        }
        asVar.f = Integer.valueOf(this.a.incrementAndGet());
        asVar.a("add-to-queue");
        if (!asVar.h) {
            this.d.add(asVar);
            return asVar;
        }
        this.c.add(asVar);
        return asVar;
    }
}
