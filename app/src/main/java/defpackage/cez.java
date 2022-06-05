package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cez  reason: default package */
/* loaded from: classes2.dex */
public abstract class cez<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B a();

    abstract T a(B b);

    abstract void a(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(B b, int i, ccu ccuVar);

    abstract void a(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(T t, cfg cfgVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T b(Object obj);

    abstract void b(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(T t, cfg cfgVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B c(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T c(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int f(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(B b, ces cesVar) throws IOException {
        int b2 = cesVar.b();
        int b3 = cff.b(b2);
        int a = cff.a(b2);
        if (a == 0) {
            a((cez<T, B>) b, b3, cesVar.g());
            return true;
        } else if (a == 1) {
            b(b, b3, cesVar.i());
            return true;
        } else if (a == 2) {
            a((cez<T, B>) b, b3, cesVar.n());
            return true;
        } else if (a != 3) {
            if (a == 4) {
                return false;
            }
            if (a == 5) {
                a((cez<T, B>) b, b3, cesVar.j());
                return true;
            }
            throw InvalidProtocolBufferException.f();
        } else {
            B a2 = a();
            int a3 = cff.a(b3, 4);
            b((cez<T, B>) a2, cesVar);
            if (a3 != cesVar.b()) {
                throw InvalidProtocolBufferException.e();
            }
            a((cez<T, B>) b, b3, (int) a(a2));
            return true;
        }
    }

    private void b(B b, ces cesVar) throws IOException {
        while (cesVar.a() != Integer.MAX_VALUE && a((cez<T, B>) b, cesVar)) {
        }
    }
}
