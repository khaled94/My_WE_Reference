package defpackage;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bqb  reason: default package */
/* loaded from: classes2.dex */
public final class bqb {
    private boolean A;
    private String B;
    private Boolean C;
    private long D;
    private long E;
    private long F;
    final bql a;
    List<String> b;
    long c;
    long d;
    long e;
    long f;
    long g;
    long h;
    String i;
    boolean j;
    private final String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private long p;
    private long q;
    private long r;
    private String s;
    private long t;
    private String u;
    private long v;
    private long w;
    private boolean x;
    private long y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqb(bql bqlVar, String str) {
        aat.a(bqlVar);
        aat.a(str);
        this.a = bqlVar;
        this.k = str;
        bqlVar.p().c();
    }

    public final String a() {
        this.a.p().c();
        return this.k;
    }

    public final String b() {
        this.a.p().c();
        return this.l;
    }

    public final void a(String str) {
        this.a.p().c();
        this.j |= !buv.d(this.l, str);
        this.l = str;
    }

    public final String c() {
        this.a.p().c();
        return this.m;
    }

    public final void b(String str) {
        this.a.p().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.j |= !buv.d(this.m, str);
        this.m = str;
    }

    public final String d() {
        this.a.p().c();
        return this.B;
    }

    public final void c(String str) {
        this.a.p().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.j |= !buv.d(this.B, str);
        this.B = str;
    }

    public final String e() {
        this.a.p().c();
        return this.n;
    }

    public final void d(String str) {
        this.a.p().c();
        this.j |= !buv.d(this.n, str);
        this.n = str;
    }

    public final String f() {
        this.a.p().c();
        return this.o;
    }

    public final void e(String str) {
        this.a.p().c();
        this.j |= !buv.d(this.o, str);
        this.o = str;
    }

    public final long g() {
        this.a.p().c();
        return this.q;
    }

    public final void a(long j) {
        this.a.p().c();
        this.j |= this.q != j;
        this.q = j;
    }

    public final long h() {
        this.a.p().c();
        return this.r;
    }

    public final void b(long j) {
        this.a.p().c();
        this.j |= this.r != j;
        this.r = j;
    }

    public final String i() {
        this.a.p().c();
        return this.s;
    }

    public final void f(String str) {
        this.a.p().c();
        this.j |= !buv.d(this.s, str);
        this.s = str;
    }

    public final long j() {
        this.a.p().c();
        return this.t;
    }

    public final void c(long j) {
        this.a.p().c();
        this.j |= this.t != j;
        this.t = j;
    }

    public final String k() {
        this.a.p().c();
        return this.u;
    }

    public final void g(String str) {
        this.a.p().c();
        this.j |= !buv.d(this.u, str);
        this.u = str;
    }

    public final long l() {
        this.a.p().c();
        return this.v;
    }

    public final void d(long j) {
        this.a.p().c();
        this.j |= this.v != j;
        this.v = j;
    }

    public final long m() {
        this.a.p().c();
        return this.w;
    }

    public final void e(long j) {
        this.a.p().c();
        this.j |= this.w != j;
        this.w = j;
    }

    public final long n() {
        this.a.p().c();
        return this.D;
    }

    public final void f(long j) {
        this.a.p().c();
        this.j |= this.D != j;
        this.D = j;
    }

    public final boolean o() {
        this.a.p().c();
        return this.x;
    }

    public final void a(boolean z) {
        this.a.p().c();
        this.j |= this.x != z;
        this.x = z;
    }

    public final void g(long j) {
        boolean z = true;
        aat.a(j >= 0);
        this.a.p().c();
        boolean z2 = this.j;
        if (this.p == j) {
            z = false;
        }
        this.j = z | z2;
        this.p = j;
    }

    public final long p() {
        this.a.p().c();
        return this.p;
    }

    public final long q() {
        this.a.p().c();
        return this.E;
    }

    public final void h(long j) {
        this.a.p().c();
        this.j |= this.E != j;
        this.E = j;
    }

    public final long r() {
        this.a.p().c();
        return this.F;
    }

    public final void i(long j) {
        this.a.p().c();
        this.j |= this.F != j;
        this.F = j;
    }

    public final void s() {
        this.a.p().c();
        long j = this.p + 1;
        if (j > 2147483647L) {
            this.a.q().f.a("Bundle index overflow. appId", bpi.a(this.k));
            j = 0;
        }
        this.j = true;
        this.p = j;
    }

    public final String t() {
        this.a.p().c();
        return this.i;
    }

    public final void h(String str) {
        this.a.p().c();
        this.j |= !buv.d(this.i, str);
        this.i = str;
    }

    public final long u() {
        this.a.p().c();
        return this.y;
    }

    public final void j(long j) {
        this.a.p().c();
        this.j |= this.y != j;
        this.y = j;
    }

    public final boolean v() {
        this.a.p().c();
        return this.z;
    }

    public final void b(boolean z) {
        this.a.p().c();
        this.j = this.z != z;
        this.z = z;
    }

    public final boolean w() {
        this.a.p().c();
        return this.A;
    }

    public final void c(boolean z) {
        this.a.p().c();
        this.j = this.A != z;
        this.A = z;
    }

    public final Boolean x() {
        this.a.p().c();
        return this.C;
    }

    public final void a(Boolean bool) {
        this.a.p().c();
        this.j = !buv.a(this.C, bool);
        this.C = bool;
    }

    public final List<String> y() {
        this.a.p().c();
        return this.b;
    }
}
