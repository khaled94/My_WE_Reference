package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: eea  reason: default package */
/* loaded from: classes2.dex */
public final class eea extends eeo {
    public eeo a;

    public eea(eeo eeoVar) {
        if (eeoVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.a = eeoVar;
    }

    @Override // defpackage.eeo
    public final eeo a(long j, TimeUnit timeUnit) {
        return this.a.a(j, timeUnit);
    }

    @Override // defpackage.eeo
    public final long C_() {
        return this.a.C_();
    }

    @Override // defpackage.eeo
    public final boolean E_() {
        return this.a.E_();
    }

    @Override // defpackage.eeo
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.eeo
    public final eeo a(long j) {
        return this.a.a(j);
    }

    @Override // defpackage.eeo
    public final eeo d() {
        return this.a.d();
    }

    @Override // defpackage.eeo
    public final eeo D_() {
        return this.a.D_();
    }

    @Override // defpackage.eeo
    public final void f() throws IOException {
        this.a.f();
    }
}
