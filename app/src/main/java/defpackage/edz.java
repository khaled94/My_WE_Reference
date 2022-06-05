package defpackage;

import java.io.IOException;

/* renamed from: edz  reason: default package */
/* loaded from: classes2.dex */
public abstract class edz implements een {
    protected final een b;

    public edz(een eenVar) {
        if (eenVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.b = eenVar;
    }

    @Override // defpackage.een
    public long a(edu eduVar, long j) throws IOException {
        return this.b.a(eduVar, j);
    }

    @Override // defpackage.een
    public final eeo a() {
        return this.b.a();
    }

    @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.b.toString() + ")";
    }
}
