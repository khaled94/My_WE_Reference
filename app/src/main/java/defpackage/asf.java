package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import java.io.IOException;

/* renamed from: asf  reason: default package */
/* loaded from: classes.dex */
public abstract class asf {
    int a;
    int b;
    asg c;
    private int d;
    private boolean e;

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int f(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a() throws IOException;

    public abstract <T extends aui> T a(aur<T> aurVar, asn asnVar) throws IOException;

    public abstract void a(int i) throws zzfi;

    public abstract double b() throws IOException;

    public abstract boolean b(int i) throws IOException;

    public abstract float c() throws IOException;

    public abstract int c(int i) throws zzfi;

    public abstract long d() throws IOException;

    public abstract void d(int i);

    public abstract long e() throws IOException;

    public abstract void e(int i) throws IOException;

    public abstract int f() throws IOException;

    public abstract long g() throws IOException;

    public abstract int h() throws IOException;

    public abstract boolean i() throws IOException;

    public abstract String j() throws IOException;

    public abstract String k() throws IOException;

    public abstract art l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long s() throws IOException;

    public abstract boolean t() throws IOException;

    public abstract int u();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static asf a(byte[] bArr, int i, int i2) {
        ash ashVar = new ash(bArr, i, i2, (byte) 0);
        try {
            ashVar.c(i2);
            return ashVar;
        } catch (zzfi e) {
            throw new IllegalArgumentException(e);
        }
    }

    private asf() {
        this.b = 100;
        this.d = Integer.MAX_VALUE;
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ asf(byte b) {
        this();
    }
}
