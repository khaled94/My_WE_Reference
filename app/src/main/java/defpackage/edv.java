package defpackage;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* renamed from: edv  reason: default package */
/* loaded from: classes2.dex */
public interface edv extends eem, WritableByteChannel {
    long a(een eenVar) throws IOException;

    edu b();

    edv b(edx edxVar) throws IOException;

    edv b(String str) throws IOException;

    edv c(byte[] bArr) throws IOException;

    edv c(byte[] bArr, int i, int i2) throws IOException;

    edv f(int i) throws IOException;

    @Override // defpackage.eem, java.io.Flushable
    void flush() throws IOException;

    edv g(int i) throws IOException;

    edv h(int i) throws IOException;

    edv k(long j) throws IOException;

    edv l(long j) throws IOException;

    edv t() throws IOException;
}
