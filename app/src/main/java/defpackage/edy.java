package defpackage;

import java.io.IOException;

/* renamed from: edy  reason: default package */
/* loaded from: classes2.dex */
public abstract class edy implements eem {
    private final eem a;

    public edy(eem eemVar) {
        if (eemVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.a = eemVar;
    }

    @Override // defpackage.eem
    public void a_(edu eduVar, long j) throws IOException {
        this.a.a_(eduVar, j);
    }

    @Override // defpackage.eem, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.eem
    public final eeo a() {
        return this.a.a();
    }

    @Override // defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.a.toString() + ")";
    }
}
