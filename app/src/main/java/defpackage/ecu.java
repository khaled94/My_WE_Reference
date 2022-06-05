package defpackage;

import defpackage.eco;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ecu  reason: default package */
/* loaded from: classes2.dex */
public final class ecu implements Closeable {
    private static final Logger c = Logger.getLogger(ecp.class.getName());
    int a = 16384;
    final eco.b b;
    private final edv d;
    private final boolean e;
    private final edu f;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ecu(edv edvVar, boolean z) {
        this.d = edvVar;
        this.e = z;
        edu eduVar = new edu();
        this.f = eduVar;
        this.b = new eco.b(eduVar);
    }

    public final synchronized void a() throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        if (!this.e) {
            return;
        }
        if (c.isLoggable(Level.FINE)) {
            c.fine(ebk.a(">> CONNECTION %s", ecp.a.e()));
        }
        this.d.c(ecp.a.h());
        this.d.flush();
    }

    public final synchronized void a(ecx ecxVar) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        int i = this.a;
        if ((ecxVar.a & 32) != 0) {
            i = ecxVar.b[5];
        }
        this.a = i;
        if (ecxVar.a() != -1) {
            this.b.a(ecxVar.a());
        }
        a(0, 0, (byte) 4, (byte) 1);
        this.d.flush();
    }

    public final synchronized void b() throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        this.d.flush();
    }

    public final synchronized void a(int i, ecm ecmVar) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        if (ecmVar.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        a(i, 4, (byte) 3, (byte) 0);
        this.d.f(ecmVar.httpCode);
        this.d.flush();
    }

    public final synchronized void a(boolean z, int i, edu eduVar, int i2) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.d.a_(eduVar, i2);
        }
    }

    public final synchronized void b(ecx ecxVar) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        int i = 0;
        a(0, Integer.bitCount(ecxVar.a) * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (ecxVar.a(i)) {
                this.d.g(i == 4 ? 3 : i == 7 ? 4 : i);
                this.d.f(ecxVar.b[i]);
            }
            i++;
        }
        this.d.flush();
    }

    public final synchronized void a(boolean z, int i, int i2) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.d.f(i);
        this.d.f(i2);
        this.d.flush();
    }

    public final synchronized void a(int i, ecm ecmVar, byte[] bArr) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        if (ecmVar.httpCode == -1) {
            throw ecp.a("errorCode.httpCode == -1", new Object[0]);
        }
        a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.d.f(i);
        this.d.f(ecmVar.httpCode);
        if (bArr.length > 0) {
            this.d.c(bArr);
        }
        this.d.flush();
    }

    public final synchronized void a(int i, long j) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw ecp.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        a(i, 4, (byte) 8, (byte) 0);
        this.d.f((int) j);
        this.d.flush();
    }

    private void a(int i, int i2, byte b, byte b2) throws IOException {
        if (c.isLoggable(Level.FINE)) {
            c.fine(ecp.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) != 0) {
                throw ecp.a("reserved bit set: %s", Integer.valueOf(i));
            }
            a(this.d, i2);
            this.d.h(b & 255);
            this.d.h(b2 & 255);
            this.d.f(i & Integer.MAX_VALUE);
            return;
        }
        throw ecp.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.g = true;
        this.d.close();
    }

    private static void a(edv edvVar, int i) throws IOException {
        edvVar.h((i >>> 16) & 255);
        edvVar.h((i >>> 8) & 255);
        edvVar.h(i & 255);
    }

    private void b(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min(this.a, j);
            long j2 = min;
            j -= j2;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.d.a_(this.f, j2);
        }
    }

    public final synchronized void a(boolean z, int i, List<ecn> list) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        this.b.a(list);
        long j = this.f.b;
        int min = (int) Math.min(this.a, j);
        long j2 = min;
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        byte b = i2 == 0 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        a(i, min, (byte) 1, b);
        this.d.a_(this.f, j2);
        if (i2 > 0) {
            b(i, j - j2);
        }
    }
}
