package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: eem  reason: default package */
/* loaded from: classes2.dex */
public interface eem extends Closeable, Flushable {
    eeo a();

    void a_(edu eduVar, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;
}
