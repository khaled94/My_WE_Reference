package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* renamed from: edw  reason: default package */
/* loaded from: classes2.dex */
public interface edw extends een, ReadableByteChannel {
    int a(eee eeeVar) throws IOException;

    long a(eem eemVar) throws IOException;

    void a(long j) throws IOException;

    void a(byte[] bArr) throws IOException;

    @Deprecated
    edu b();

    boolean b(long j) throws IOException;

    edu c();

    edx d(long j) throws IOException;

    boolean d() throws IOException;

    InputStream e();

    String e(long j) throws IOException;

    byte g() throws IOException;

    byte[] g(long j) throws IOException;

    short h() throws IOException;

    void h(long j) throws IOException;

    int i() throws IOException;

    short j() throws IOException;

    int k() throws IOException;

    long l() throws IOException;

    String o() throws IOException;

    long r() throws IOException;
}
