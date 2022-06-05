package defpackage;

import defpackage.bcc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bbo  reason: default package */
/* loaded from: classes2.dex */
public class bbo {
    private static volatile boolean b = false;
    private static volatile bbo d;
    private final Map<a, bcc.e<?, ?>> e;
    private static final Class<?> c = b();
    static final bbo a = new bbo((byte) 0);

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: bbo$a */
    /* loaded from: classes2.dex */
    static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }
    }

    public static bbo a() {
        bbo bboVar = d;
        if (bboVar == null) {
            synchronized (bbo.class) {
                bboVar = d;
                if (bboVar == null) {
                    bboVar = bbp.a();
                    d = bboVar;
                }
            }
        }
        return bboVar;
    }

    public final <ContainingType extends bdh> bcc.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (bcc.e<ContainingType, ?>) this.e.get(new a(containingtype, i));
    }

    bbo() {
        this.e = new HashMap();
    }

    private bbo(byte b2) {
        this.e = Collections.emptyMap();
    }
}
