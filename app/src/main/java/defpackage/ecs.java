package defpackage;

import defpackage.eco;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ecs  reason: default package */
/* loaded from: classes2.dex */
final class ecs implements Closeable {
    static final Logger a = Logger.getLogger(ecp.class.getName());
    final edw b;
    final boolean c;
    final eco.a d;
    private final a e;

    /* renamed from: ecs$b */
    /* loaded from: classes2.dex */
    interface b {
        void a(int i);

        void a(int i, long j);

        void a(int i, ecm ecmVar);

        void a(int i, List<ecn> list) throws IOException;

        void a(ecx ecxVar);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, edw edwVar, int i2) throws IOException;

        void a(boolean z, int i, List<ecn> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ecs(edw edwVar, boolean z) {
        this.b = edwVar;
        this.c = z;
        a aVar = new a(edwVar);
        this.e = aVar;
        this.d = new eco.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(boolean z, b bVar) throws IOException {
        short s = 0;
        boolean z2 = false;
        short s2 = 0;
        short s3 = 0;
        try {
            this.b.a(9L);
            int a2 = a(this.b);
            if (a2 < 0 || a2 > 16384) {
                throw ecp.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
            }
            byte g = (byte) (this.b.g() & 255);
            if (z && g != 4) {
                throw ecp.b("Expected a SETTINGS frame but was %s", Byte.valueOf(g));
            }
            byte g2 = (byte) (this.b.g() & 255);
            int i = this.b.i() & Integer.MAX_VALUE;
            if (a.isLoggable(Level.FINE)) {
                a.fine(ecp.a(true, i, a2, g, g2));
            }
            switch (g) {
                case 0:
                    if (i == 0) {
                        throw ecp.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                    }
                    boolean z3 = (g2 & 1) != 0;
                    if ((g2 & 32) != 0) {
                        throw ecp.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    if ((g2 & 8) != 0) {
                        s = (short) (this.b.g() & 255);
                    }
                    bVar.a(z3, i, this.b, a(a2, g2, s));
                    this.b.h(s);
                    break;
                case 1:
                    if (i == 0) {
                        throw ecp.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    boolean z4 = (g2 & 1) != 0;
                    if ((g2 & 8) != 0) {
                        s3 = (short) (this.b.g() & 255);
                    }
                    if ((g2 & 32) != 0) {
                        a();
                        a2 -= 5;
                    }
                    bVar.a(z4, i, a(a(a2, g2, s3), s3, g2, i));
                    break;
                case 2:
                    if (a2 != 5) {
                        throw ecp.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a2));
                    }
                    if (i == 0) {
                        throw ecp.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    a();
                    break;
                case 3:
                    if (a2 != 4) {
                        throw ecp.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a2));
                    }
                    if (i == 0) {
                        throw ecp.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int i2 = this.b.i();
                    ecm fromHttp2 = ecm.fromHttp2(i2);
                    if (fromHttp2 == null) {
                        throw ecp.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i2));
                    }
                    bVar.a(i, fromHttp2);
                    break;
                case 4:
                    if (i != 0) {
                        throw ecp.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((g2 & 1) == 0) {
                        if (a2 % 6 == 0) {
                            ecx ecxVar = new ecx();
                            for (int i3 = 0; i3 < a2; i3 += 6) {
                                int h = this.b.h() & 65535;
                                int i4 = this.b.i();
                                if (h != 2) {
                                    if (h == 3) {
                                        h = 4;
                                    } else if (h == 4) {
                                        h = 7;
                                        if (i4 < 0) {
                                            throw ecp.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        }
                                    } else if (h == 5 && (i4 < 16384 || i4 > 16777215)) {
                                        throw ecp.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i4));
                                    }
                                } else if (i4 != 0 && i4 != 1) {
                                    throw ecp.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                }
                                ecxVar.a(h, i4);
                            }
                            bVar.a(ecxVar);
                            break;
                        } else {
                            throw ecp.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a2));
                        }
                    } else if (a2 != 0) {
                        throw ecp.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    break;
                case 5:
                    if (i == 0) {
                        throw ecp.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    if ((g2 & 8) != 0) {
                        s2 = (short) (this.b.g() & 255);
                    }
                    bVar.a(this.b.i() & Integer.MAX_VALUE, a(a(a2 - 4, g2, s2), s2, g2, i));
                    break;
                case 6:
                    if (a2 != 8) {
                        throw ecp.b("TYPE_PING length != 8: %s", Integer.valueOf(a2));
                    }
                    if (i != 0) {
                        throw ecp.b("TYPE_PING streamId != 0", new Object[0]);
                    }
                    int i5 = this.b.i();
                    int i6 = this.b.i();
                    if ((g2 & 1) != 0) {
                        z2 = true;
                    }
                    bVar.a(z2, i5, i6);
                    break;
                case 7:
                    if (a2 < 8) {
                        throw ecp.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a2));
                    }
                    if (i != 0) {
                        throw ecp.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    int i7 = this.b.i();
                    int i8 = this.b.i();
                    int i9 = a2 - 8;
                    if (ecm.fromHttp2(i8) == null) {
                        throw ecp.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i8));
                    }
                    edx edxVar = edx.b;
                    if (i9 > 0) {
                        this.b.d(i9);
                    }
                    bVar.a(i7);
                    break;
                case 8:
                    if (a2 != 4) {
                        throw ecp.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a2));
                    }
                    long i10 = this.b.i() & 2147483647L;
                    if (i10 == 0) {
                        throw ecp.b("windowSizeIncrement was 0", Long.valueOf(i10));
                    }
                    bVar.a(i, i10);
                    break;
                default:
                    this.b.h(a2);
                    break;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private List<ecn> a(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.e;
        aVar.d = i;
        aVar.a = i;
        this.e.e = s;
        this.e.b = b2;
        this.e.c = i2;
        this.d.a();
        return this.d.b();
    }

    private void a() throws IOException {
        this.b.i();
        this.b.g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ecs$a */
    /* loaded from: classes2.dex */
    public static final class a implements een {
        int a;
        byte b;
        int c;
        int d;
        short e;
        private final edw f;

        @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        a(edw edwVar) {
            this.f = edwVar;
        }

        @Override // defpackage.een
        public final long a(edu eduVar, long j) throws IOException {
            int i;
            int i2;
            do {
                int i3 = this.d;
                if (i3 == 0) {
                    this.f.h(this.e);
                    this.e = (short) 0;
                    if ((this.b & 4) != 0) {
                        return -1L;
                    }
                    i = this.c;
                    int a = ecs.a(this.f);
                    this.d = a;
                    this.a = a;
                    byte g = (byte) (this.f.g() & 255);
                    this.b = (byte) (this.f.g() & 255);
                    if (ecs.a.isLoggable(Level.FINE)) {
                        ecs.a.fine(ecp.a(true, this.c, this.a, g, this.b));
                    }
                    i2 = this.f.i() & Integer.MAX_VALUE;
                    this.c = i2;
                    if (g != 9) {
                        throw ecp.b("%s != TYPE_CONTINUATION", Byte.valueOf(g));
                    }
                } else {
                    long a2 = this.f.a(eduVar, Math.min(j, i3));
                    if (a2 == -1) {
                        return -1L;
                    }
                    this.d = (int) (this.d - a2);
                    return a2;
                }
            } while (i2 == i);
            throw ecp.b("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        @Override // defpackage.een
        public final eeo a() {
            return this.f.a();
        }
    }

    static int a(edw edwVar) throws IOException {
        return (edwVar.g() & 255) | ((edwVar.g() & 255) << 16) | ((edwVar.g() & 255) << 8);
    }

    private static int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw ecp.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}
