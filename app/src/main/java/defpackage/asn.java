package defpackage;

import defpackage.ata;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: asn  reason: default package */
/* loaded from: classes.dex */
public class asn {
    private static volatile boolean b = false;
    private static volatile asn d;
    private static volatile asn e;
    private final Map<a, ata.e<?, ?>> f;
    private static final Class<?> c = d();
    static final asn a = new asn((byte) 0);

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: asn$a */
    /* loaded from: classes.dex */
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

    public static asn a() {
        asn asnVar = d;
        if (asnVar == null) {
            synchronized (asn.class) {
                asnVar = d;
                if (asnVar == null) {
                    asnVar = asl.a();
                    d = asnVar;
                }
            }
        }
        return asnVar;
    }

    public static asn b() {
        asn asnVar = e;
        if (asnVar == null) {
            synchronized (asn.class) {
                asnVar = e;
                if (asnVar == null) {
                    asnVar = asl.b();
                    e = asnVar;
                }
            }
        }
        return asnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static asn c() {
        return asz.a(asn.class);
    }

    public final <ContainingType extends aui> ata.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (ata.e<ContainingType, ?>) this.f.get(new a(containingtype, i));
    }

    asn() {
        this.f = new HashMap();
    }

    private asn(byte b2) {
        this.f = Collections.emptyMap();
    }
}
