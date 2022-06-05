package defpackage;

import java.io.IOException;
import java.util.zip.Inflater;

/* renamed from: eec  reason: default package */
/* loaded from: classes2.dex */
public final class eec implements een {
    private final edw a;
    private final Inflater b;
    private int c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eec(edw edwVar, Inflater inflater) {
        if (edwVar != null) {
            if (inflater == null) {
                throw new IllegalArgumentException("inflater == null");
            }
            this.a = edwVar;
            this.b = inflater;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r0.b != r0.c) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        r7.a = r0.b();
        defpackage.eek.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        return -1;
     */
    @Override // defpackage.een
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.edu r7, long r8) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb5
            boolean r3 = r6.d
            if (r3 != 0) goto Lad
            if (r2 != 0) goto Ld
            return r0
        Ld:
            java.util.zip.Inflater r0 = r6.b
            boolean r0 = r0.needsInput()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            goto L47
        L18:
            r6.b()
            java.util.zip.Inflater r0 = r6.b
            int r0 = r0.getRemaining()
            if (r0 != 0) goto La5
            edw r0 = r6.a
            boolean r0 = r0.d()
            if (r0 == 0) goto L2d
            r2 = 1
            goto L47
        L2d:
            edw r0 = r6.a
            edu r0 = r0.b()
            eej r0 = r0.a
            int r3 = r0.c
            int r4 = r0.b
            int r3 = r3 - r4
            r6.c = r3
            java.util.zip.Inflater r3 = r6.b
            byte[] r4 = r0.a
            int r0 = r0.b
            int r5 = r6.c
            r3.setInput(r4, r0, r5)
        L47:
            eej r0 = r7.e(r1)     // Catch: java.util.zip.DataFormatException -> L9e
            int r1 = r0.c     // Catch: java.util.zip.DataFormatException -> L9e
            int r1 = 8192 - r1
            long r3 = (long) r1     // Catch: java.util.zip.DataFormatException -> L9e
            long r3 = java.lang.Math.min(r8, r3)     // Catch: java.util.zip.DataFormatException -> L9e
            int r1 = (int) r3     // Catch: java.util.zip.DataFormatException -> L9e
            java.util.zip.Inflater r3 = r6.b     // Catch: java.util.zip.DataFormatException -> L9e
            byte[] r4 = r0.a     // Catch: java.util.zip.DataFormatException -> L9e
            int r5 = r0.c     // Catch: java.util.zip.DataFormatException -> L9e
            int r1 = r3.inflate(r4, r5, r1)     // Catch: java.util.zip.DataFormatException -> L9e
            if (r1 <= 0) goto L6d
            int r8 = r0.c     // Catch: java.util.zip.DataFormatException -> L9e
            int r8 = r8 + r1
            r0.c = r8     // Catch: java.util.zip.DataFormatException -> L9e
            long r8 = r7.b     // Catch: java.util.zip.DataFormatException -> L9e
            long r0 = (long) r1     // Catch: java.util.zip.DataFormatException -> L9e
            long r8 = r8 + r0
            r7.b = r8     // Catch: java.util.zip.DataFormatException -> L9e
            return r0
        L6d:
            java.util.zip.Inflater r1 = r6.b     // Catch: java.util.zip.DataFormatException -> L9e
            boolean r1 = r1.finished()     // Catch: java.util.zip.DataFormatException -> L9e
            if (r1 != 0) goto L89
            java.util.zip.Inflater r1 = r6.b     // Catch: java.util.zip.DataFormatException -> L9e
            boolean r1 = r1.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L9e
            if (r1 == 0) goto L7e
            goto L89
        L7e:
            if (r2 != 0) goto L81
            goto Ld
        L81:
            java.io.EOFException r7 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L9e
            java.lang.String r8 = "source exhausted prematurely"
            r7.<init>(r8)     // Catch: java.util.zip.DataFormatException -> L9e
            throw r7     // Catch: java.util.zip.DataFormatException -> L9e
        L89:
            r6.b()     // Catch: java.util.zip.DataFormatException -> L9e
            int r8 = r0.b     // Catch: java.util.zip.DataFormatException -> L9e
            int r9 = r0.c     // Catch: java.util.zip.DataFormatException -> L9e
            if (r8 != r9) goto L9b
            eej r8 = r0.b()     // Catch: java.util.zip.DataFormatException -> L9e
            r7.a = r8     // Catch: java.util.zip.DataFormatException -> L9e
            defpackage.eek.a(r0)     // Catch: java.util.zip.DataFormatException -> L9e
        L9b:
            r7 = -1
            return r7
        L9e:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        La5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "?"
            r7.<init>(r8)
            throw r7
        Lad:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        Lb5:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r8 = r9.concat(r8)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eec.a(edu, long):long");
    }

    private void b() throws IOException {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.b.getRemaining();
        this.c -= remaining;
        this.a.h(remaining);
    }

    @Override // defpackage.een
    public final eeo a() {
        return this.a.a();
    }

    @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
