package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cbm;
import defpackage.cec;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bxs  reason: default package */
/* loaded from: classes2.dex */
public abstract class bxs<KeyProtoT extends cec> {
    final Class<KeyProtoT> a;
    final Class<?> b;
    private final Map<Class<?>, b<?, KeyProtoT>> c;

    public abstract KeyProtoT a(ccu ccuVar) throws InvalidProtocolBufferException;

    public abstract String a();

    public abstract void a(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract cbm.b b();

    /* renamed from: bxs$b */
    /* loaded from: classes2.dex */
    public static abstract class b<PrimitiveT, KeyT> {
        final Class<PrimitiveT> a;

        public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;

        public b(Class<PrimitiveT> cls) {
            this.a = cls;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public bxs(Class<KeyProtoT> cls, b<?, KeyProtoT>... bVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            b<?, KeyProtoT> bVar = bVarArr[0];
            if (hashMap.containsKey(bVar.a)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + bVar.a.getCanonicalName());
            }
            hashMap.put(bVar.a, bVar);
        }
        this.b = bVarArr[0].a;
        this.c = Collections.unmodifiableMap(hashMap);
    }

    public final <P> P a(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        b<?, KeyProtoT> bVar = this.c.get(cls);
        if (bVar == null) {
            throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
        }
        return (P) bVar.a(keyprotot);
    }

    public final Set<Class<?>> c() {
        return this.c.keySet();
    }

    /* renamed from: bxs$a */
    /* loaded from: classes2.dex */
    public static abstract class a<KeyFormatProtoT extends cec, KeyT> {
        final Class<KeyFormatProtoT> a;

        public abstract KeyFormatProtoT a(ccu ccuVar) throws InvalidProtocolBufferException;

        public abstract void a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        public abstract KeyT b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        public a(Class<KeyFormatProtoT> cls) {
            this.a = cls;
        }
    }

    public a<?, KeyProtoT> d() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
