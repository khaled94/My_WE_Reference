package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import java.io.IOException;

/* renamed from: avp  reason: default package */
/* loaded from: classes.dex */
abstract class avp<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B a();

    abstract T a(B b);

    abstract void a(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(B b, int i, art artVar);

    abstract void a(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(T t, awm awmVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T b(Object obj);

    abstract void b(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(T t, awm awmVar) throws IOException;

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
    public final boolean a(B b, auy auyVar) throws IOException {
        int b2 = auyVar.b();
        int i = b2 >>> 3;
        int i2 = b2 & 7;
        if (i2 == 0) {
            a((avp<T, B>) b, i, auyVar.g());
            return true;
        } else if (i2 == 1) {
            b(b, i, auyVar.i());
            return true;
        } else if (i2 == 2) {
            a((avp<T, B>) b, i, auyVar.n());
            return true;
        } else if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                a((avp<T, B>) b, i, auyVar.j());
                return true;
            }
            throw zzfi.f();
        } else {
            B a = a();
            int i3 = 4 | (i << 3);
            while (auyVar.a() != Integer.MAX_VALUE && a((avp<T, B>) a, auyVar)) {
            }
            if (i3 != auyVar.b()) {
                throw zzfi.e();
            }
            a((avp<T, B>) b, i, (int) a(a));
            return true;
        }
    }
}
