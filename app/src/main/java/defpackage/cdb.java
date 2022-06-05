package defpackage;

import defpackage.cdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cdb  reason: default package */
/* loaded from: classes2.dex */
public class cdb {
    static final cdb a = new cdb((byte) 0);
    private static volatile boolean b = false;
    private static boolean c = true;
    private static volatile cdb d;
    private final Map<a, cdk.f<?, ?>> e;

    public static cdb a() {
        cdb cdbVar = d;
        if (cdbVar == null) {
            synchronized (cdb.class) {
                cdbVar = d;
                if (cdbVar == null) {
                    if (c) {
                        cdbVar = cda.a();
                    } else {
                        cdbVar = a;
                    }
                    d = cdbVar;
                }
            }
        }
        return cdbVar;
    }

    public final <ContainingType extends cec> cdk.f<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (cdk.f<ContainingType, ?>) this.e.get(new a(containingtype, i));
    }

    cdb() {
        this.e = new HashMap();
    }

    private cdb(byte b2) {
        this.e = Collections.emptyMap();
    }

    /* renamed from: cdb$a */
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
}
