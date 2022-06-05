package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: eeb  reason: default package */
/* loaded from: classes2.dex */
public final class eeb implements een {
    private final edw b;
    private final Inflater c;
    private final eec d;
    private int a = 0;
    private final CRC32 e = new CRC32();

    public eeb(een eenVar) {
        if (eenVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.c = new Inflater(true);
        edw a = eed.a(eenVar);
        this.b = a;
        this.d = new eec(a, this.c);
    }

    @Override // defpackage.een
    public final long a(edu eduVar, long j) throws IOException {
        long j2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            if (this.a == 0) {
                this.b.a(10L);
                byte c = this.b.b().c(3L);
                boolean z = ((c >> 1) & 1) == 1;
                if (z) {
                    a(this.b.b(), 0L, 10L);
                }
                a("ID1ID2", 8075, this.b.h());
                this.b.h(8L);
                if (((c >> 2) & 1) == 1) {
                    this.b.a(2L);
                    if (z) {
                        a(this.b.b(), 0L, 2L);
                    }
                    long j3 = this.b.b().j();
                    this.b.a(j3);
                    if (z) {
                        j2 = j3;
                        a(this.b.b(), 0L, j3);
                    } else {
                        j2 = j3;
                    }
                    this.b.h(j2);
                }
                if (((c >> 3) & 1) == 1) {
                    long r = this.b.r();
                    if (r == -1) {
                        throw new EOFException();
                    }
                    if (z) {
                        a(this.b.b(), 0L, r + 1);
                    }
                    this.b.h(r + 1);
                }
                if (((c >> 4) & 1) == 1) {
                    long r2 = this.b.r();
                    if (r2 == -1) {
                        throw new EOFException();
                    }
                    if (z) {
                        a(this.b.b(), 0L, r2 + 1);
                    }
                    this.b.h(r2 + 1);
                }
                if (z) {
                    a("FHCRC", this.b.j(), (short) this.e.getValue());
                    this.e.reset();
                }
                this.a = 1;
            }
            if (this.a == 1) {
                long j4 = eduVar.b;
                long a = this.d.a(eduVar, j);
                if (a != -1) {
                    a(eduVar, j4, a);
                    return a;
                }
                this.a = 2;
            }
            if (this.a == 2) {
                a("CRC", this.b.k(), (int) this.e.getValue());
                a("ISIZE", this.b.k(), (int) this.c.getBytesWritten());
                this.a = 3;
                if (!this.b.d()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
    }

    @Override // defpackage.een
    public final eeo a() {
        return this.b.a();
    }

    @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    private void a(edu eduVar, long j, long j2) {
        int i;
        eej eejVar = eduVar.a;
        while (j >= eejVar.c - eejVar.b) {
            j -= eejVar.c - eejVar.b;
            eejVar = eejVar.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(eejVar.c - i, j2);
            this.e.update(eejVar.a, (int) (eejVar.b + j), min);
            j2 -= min;
            eejVar = eejVar.f;
            j = 0;
        }
    }

    private static void a(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
    }
}
