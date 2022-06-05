package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* renamed from: ebb  reason: default package */
/* loaded from: classes2.dex */
public abstract class ebb {
    public abstract eau a();

    public abstract void a(edv edvVar) throws IOException;

    public long b() throws IOException {
        return -1L;
    }

    public static ebb a(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return a(bytes, bytes.length);
    }

    public static ebb a(final eau eauVar, final edx edxVar) {
        return new ebb() { // from class: ebb.1
            @Override // defpackage.ebb
            public final eau a() {
                return eau.this;
            }

            @Override // defpackage.ebb
            public final long b() throws IOException {
                return edxVar.g();
            }

            @Override // defpackage.ebb
            public final void a(edv edvVar) throws IOException {
                edvVar.b(edxVar);
            }
        };
    }

    public static ebb a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static ebb a(final byte[] bArr, final int i) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        ebk.a(bArr.length, i);
        return new ebb() { // from class: ebb.2
            final /* synthetic */ eau a = null;
            final /* synthetic */ int d = 0;

            @Override // defpackage.ebb
            public final eau a() {
                return this.a;
            }

            @Override // defpackage.ebb
            public final long b() {
                return i;
            }

            @Override // defpackage.ebb
            public final void a(edv edvVar) throws IOException {
                edvVar.c(bArr, this.d, i);
            }
        };
    }

    public static ebb a(final eau eauVar, final File file) {
        return new ebb() { // from class: ebb.3
            @Override // defpackage.ebb
            public final eau a() {
                return eau.this;
            }

            @Override // defpackage.ebb
            public final long b() {
                return file.length();
            }

            @Override // defpackage.ebb
            public final void a(edv edvVar) throws IOException {
                een a = eed.a(file);
                try {
                    edvVar.a(a);
                    if (a == null) {
                        return;
                    }
                    a.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (a != null) {
                            try {
                                a.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
            }
        };
    }
}
