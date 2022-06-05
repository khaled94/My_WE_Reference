package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: eab  reason: default package */
/* loaded from: classes2.dex */
public final class eab implements Closeable, Flushable {
    final ebq a;
    final ebp b;

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }
}
