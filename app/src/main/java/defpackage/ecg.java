package defpackage;

import defpackage.eat;
import java.io.IOException;
import java.util.List;

/* renamed from: ecg  reason: default package */
/* loaded from: classes2.dex */
public final class ecg implements eat.a {
    public final ebz a;
    final ebt b;
    public final eba c;
    private final List<eat> d;
    private final int e;
    private final ead f;
    private final int g;
    private final int h;
    private final int i;
    private int j;

    public ecg(List<eat> list, ebz ebzVar, ebt ebtVar, int i, eba ebaVar, ead eadVar, int i2, int i3, int i4) {
        this.d = list;
        this.a = ebzVar;
        this.b = ebtVar;
        this.e = i;
        this.c = ebaVar;
        this.f = eadVar;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    @Override // defpackage.eat.a
    public final eah b() {
        ebt ebtVar = this.b;
        if (ebtVar != null) {
            return ebtVar.a();
        }
        return null;
    }

    @Override // defpackage.eat.a
    public final int c() {
        return this.g;
    }

    @Override // defpackage.eat.a
    public final int d() {
        return this.h;
    }

    @Override // defpackage.eat.a
    public final int e() {
        return this.i;
    }

    @Override // defpackage.eat.a
    public final eba a() {
        return this.c;
    }

    @Override // defpackage.eat.a
    public final ebc a(eba ebaVar) throws IOException {
        return a(ebaVar, this.a, this.b);
    }

    public final ebc a(eba ebaVar, ebz ebzVar, ebt ebtVar) throws IOException {
        if (this.e >= this.d.size()) {
            throw new AssertionError();
        }
        this.j++;
        ebt ebtVar2 = this.b;
        if (ebtVar2 != null && !ebtVar2.a().a(ebaVar.a)) {
            throw new IllegalStateException("network interceptor " + this.d.get(this.e - 1) + " must retain the same host and port");
        }
        if (this.b != null && this.j > 1) {
            throw new IllegalStateException("network interceptor " + this.d.get(this.e - 1) + " must call proceed() exactly once");
        }
        ecg ecgVar = new ecg(this.d, ebzVar, ebtVar, this.e + 1, ebaVar, this.f, this.g, this.h, this.i);
        eat eatVar = this.d.get(this.e);
        ebc a = eatVar.a(ecgVar);
        if (ebtVar != null && this.e + 1 < this.d.size() && ecgVar.j != 1) {
            throw new IllegalStateException("network interceptor " + eatVar + " must call proceed() exactly once");
        } else if (a == null) {
            throw new NullPointerException("interceptor " + eatVar + " returned null");
        } else if (a.g != null) {
            return a;
        } else {
            throw new IllegalStateException("interceptor " + eatVar + " returned a response with no body");
        }
    }
}
