package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: efu  reason: default package */
/* loaded from: classes2.dex */
final class efu<T> implements efc<T, ebb> {
    private static final eau a = eau.a("application/json; charset=UTF-8");
    private static final Charset b = Charset.forName("UTF-8");
    private final Gson c;
    private final cqd<T> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public efu(Gson gson, cqd<T> cqdVar) {
        this.c = gson;
        this.d = cqdVar;
    }

    @Override // defpackage.efc
    public final /* synthetic */ ebb a(Object obj) throws IOException {
        final edu eduVar = new edu();
        JsonWriter a2 = this.c.a((Writer) new OutputStreamWriter(new OutputStream() { // from class: edu.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                eduVar.h((int) ((byte) i));
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                eduVar.c(bArr, i, i2);
            }

            public final String toString() {
                return eduVar + ".outputStream()";
            }
        }, b));
        this.d.a(a2, obj);
        a2.close();
        return ebb.a(a, eduVar.m());
    }
}
