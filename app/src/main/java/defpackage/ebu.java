package defpackage;

import defpackage.eat;
import defpackage.eby;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.RouteException;

/* renamed from: ebu  reason: default package */
/* loaded from: classes2.dex */
public final class ebu {
    static final /* synthetic */ boolean a = !ebu.class.desiredAssertionStatus();
    private final ebz b;
    private final dzz c;
    private final ebw d;
    private final ead e;
    private final eao f;
    private eby.a g;
    private final eby h;
    private ebv i;
    private boolean j;
    private ebe k;

    public ebu(ebz ebzVar, ebw ebwVar, dzz dzzVar, ead eadVar, eao eaoVar) {
        this.b = ebzVar;
        this.d = ebwVar;
        this.c = dzzVar;
        this.e = eadVar;
        this.f = eaoVar;
        this.h = new eby(dzzVar, ebwVar.e, eadVar, eaoVar);
    }

    public final ecc a(eaw eawVar, eat.a aVar, boolean z) {
        try {
            ebv a2 = a(aVar.c(), aVar.d(), aVar.e(), eawVar.D, eawVar.y, z);
            if (a2.f != null) {
                return new ecr(eawVar, a2, aVar, a2.f);
            }
            a2.d.setSoTimeout(aVar.d());
            a2.g.a().a(aVar.d(), TimeUnit.MILLISECONDS);
            a2.h.a().a(aVar.e(), TimeUnit.MILLISECONDS);
            return new ecl(eawVar, a2, a2.g, a2.h);
        } catch (IOException e) {
            b();
            throw new RouteException(e);
        } catch (RouteException e2) {
            b();
            throw e2;
        }
    }

    private ebv a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        while (true) {
            ebv a2 = a(i, i2, i3, i4, z);
            synchronized (this.d) {
                if (a2.k != 0 || a2.e()) {
                    if (a2.a(z2)) {
                        return a2;
                    }
                    a2.d();
                } else {
                    return a2;
                }
            }
        }
    }

    private ebv a(int i, int i2, int i3, int i4, boolean z) throws IOException {
        Socket socket;
        Socket b;
        ebv ebvVar;
        boolean z2;
        ebe ebeVar;
        boolean z3;
        ArrayList arrayList;
        eby.a aVar;
        synchronized (this.d) {
            if (this.b.g()) {
                throw new IOException("Canceled");
            }
            this.j = false;
            socket = null;
            b = (this.b.h == null || !this.b.h.i) ? null : this.b.b();
            ebvVar = this.b.h != null ? this.b.h : null;
            if (ebvVar == null) {
                if (this.d.a(this.c, this.b, null, false)) {
                    ebvVar = this.b.h;
                    ebeVar = null;
                    z2 = true;
                } else {
                    if (this.k != null) {
                        ebeVar = this.k;
                        this.k = null;
                    } else if (e()) {
                        ebeVar = this.b.h.b;
                    }
                    z2 = false;
                }
            }
            ebeVar = null;
            z2 = false;
        }
        ebk.a(b);
        if (ebvVar != null) {
            return ebvVar;
        }
        if (ebeVar != null || ((aVar = this.g) != null && aVar.a())) {
            z3 = false;
        } else {
            this.g = this.h.b();
            z3 = true;
        }
        synchronized (this.d) {
            if (this.b.g()) {
                throw new IOException("Canceled");
            }
            if (z3) {
                arrayList = new ArrayList(this.g.a);
                if (this.d.a(this.c, this.b, arrayList, false)) {
                    ebvVar = this.b.h;
                    z2 = true;
                }
            } else {
                arrayList = null;
            }
            if (!z2) {
                if (ebeVar == null) {
                    eby.a aVar2 = this.g;
                    if (!aVar2.a()) {
                        throw new NoSuchElementException();
                    }
                    List<ebe> list = aVar2.a;
                    int i5 = aVar2.b;
                    aVar2.b = i5 + 1;
                    ebeVar = list.get(i5);
                }
                ebvVar = new ebv(this.d, ebeVar);
                this.i = ebvVar;
            }
        }
        if (z2) {
            return ebvVar;
        }
        ebvVar.a(i, i2, i3, i4, z);
        this.d.e.b(ebvVar.b);
        synchronized (this.d) {
            this.i = null;
            if (this.d.a(this.c, this.b, arrayList, true)) {
                ebvVar.i = true;
                socket = ebvVar.d;
                ebvVar = this.b.h;
                this.k = ebeVar;
            } else {
                ebw ebwVar = this.d;
                if (!ebw.g && !Thread.holdsLock(ebwVar)) {
                    throw new AssertionError();
                }
                if (!ebwVar.f) {
                    ebwVar.f = true;
                    ebw.a.execute(ebwVar.c);
                }
                ebwVar.d.add(ebvVar);
                this.b.a(ebvVar);
            }
        }
        ebk.a(socket);
        return ebvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ebv a() {
        if (a || Thread.holdsLock(this.d)) {
            return this.i;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (a || !Thread.holdsLock(this.d)) {
            synchronized (this.d) {
                this.j = true;
            }
            return;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        boolean z;
        synchronized (this.d) {
            z = this.j;
        }
        return z;
    }

    public final boolean d() {
        synchronized (this.d) {
            boolean z = true;
            if (this.k != null) {
                return true;
            }
            if (e()) {
                this.k = this.b.h.b;
                return true;
            }
            if ((this.g == null || !this.g.a()) && !this.h.a()) {
                z = false;
            }
            return z;
        }
    }

    private boolean e() {
        return this.b.h != null && this.b.h.j == 0 && ebk.a(this.b.h.b.a.a, this.c.a);
    }
}
