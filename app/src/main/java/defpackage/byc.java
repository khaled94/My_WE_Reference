package defpackage;

import defpackage.bya;
import defpackage.cbt;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: byc  reason: default package */
/* loaded from: classes2.dex */
public final class byc {
    private static final Logger a = Logger.getLogger(byc.class.getName());
    private static final ConcurrentMap<String, a> b = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Object> c = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> d = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Object<?>> e = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, byb<?, ?>> f = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: byc$a */
    /* loaded from: classes2.dex */
    public interface a {
        bxp<?> a();

        <P> bxp<P> a(Class<P> cls) throws GeneralSecurityException;

        Class<?> b();

        Set<Class<?>> c();
    }

    private static synchronized a a(String str) throws GeneralSecurityException {
        a aVar;
        synchronized (byc.class) {
            if (!b.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
            }
            aVar = b.get(str);
        }
        return aVar;
    }

    private static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    private static synchronized void a(String str, Class<?> cls) throws GeneralSecurityException {
        synchronized (byc.class) {
            if (!b.containsKey(str)) {
                return;
            }
            a aVar = b.get(str);
            if (!aVar.b().equals(cls)) {
                a.warning("Attempted overwrite of a registered key manager for key type ".concat(String.valueOf(str)));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, aVar.b().getName(), cls.getName()));
            } else if (!d.get(str).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(String.valueOf(str)));
            }
        }
    }

    public static synchronized <KeyProtoT extends cec> void a(final bxs<KeyProtoT> bxsVar) throws GeneralSecurityException {
        synchronized (byc.class) {
            String a2 = bxsVar.a();
            a(a2, bxsVar.getClass());
            if (!b.containsKey(a2)) {
                b.put(a2, new a() { // from class: byc.1
                    @Override // defpackage.byc.a
                    public final <Q> bxp<Q> a(Class<Q> cls) throws GeneralSecurityException {
                        try {
                            return new bxq(bxs.this, cls);
                        } catch (IllegalArgumentException e2) {
                            throw new GeneralSecurityException("Primitive type not supported", e2);
                        }
                    }

                    @Override // defpackage.byc.a
                    public final bxp<?> a() {
                        bxs bxsVar2 = bxs.this;
                        return new bxq(bxsVar2, bxsVar2.b);
                    }

                    @Override // defpackage.byc.a
                    public final Class<?> b() {
                        return bxs.this.getClass();
                    }

                    @Override // defpackage.byc.a
                    public final Set<Class<?>> c() {
                        return bxs.this.c();
                    }
                });
                c.put(a2, new Object() { // from class: byc.2
                });
            }
            d.put(a2, Boolean.TRUE);
        }
    }

    public static synchronized <B, P> void a(byb<B, P> bybVar) throws GeneralSecurityException {
        synchronized (byc.class) {
            Class<P> a2 = bybVar.a();
            if (f.containsKey(a2)) {
                byb<?, ?> bybVar2 = f.get(a2);
                if (!bybVar.getClass().equals(bybVar2.getClass())) {
                    a.warning("Attempted overwrite of a registered SetWrapper for type ".concat(String.valueOf(a2)));
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", a2.getName(), bybVar2.getClass().getName(), bybVar.getClass().getName()));
                }
            }
            f.put(a2, bybVar);
        }
    }

    private static bxp<?> b(String str) throws GeneralSecurityException {
        return a(str).a();
    }

    private static String a(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    public static <P> P a(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) a(str, ccu.a(bArr), (Class) a(cls));
    }

    public static <B, P> P a(bya<B> byaVar, Class<P> cls) throws GeneralSecurityException {
        byb<?, ?> bybVar = f.get(cls);
        if (bybVar == null) {
            throw new GeneralSecurityException("No wrapper found for " + byaVar.c.getName());
        } else if (!bybVar.b().equals(byaVar.c)) {
            throw new GeneralSecurityException("Wrong input primitive class, expected " + bybVar.b() + ", got " + byaVar.c);
        } else {
            return (P) bybVar.a(byaVar);
        }
    }

    public static Class<?> a(Class<?> cls) {
        byb<?, ?> bybVar = f.get(cls);
        if (bybVar == null) {
            return null;
        }
        return bybVar.b();
    }

    private byc() {
    }

    public static synchronized cbm a(cbp cbpVar) throws GeneralSecurityException {
        cbm c2;
        synchronized (byc.class) {
            bxp<?> b2 = b(cbpVar.typeUrl_);
            if (d.get(cbpVar.typeUrl_).booleanValue()) {
                c2 = b2.c(cbpVar.value_);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + cbpVar.typeUrl_);
            }
        }
        return c2;
    }

    public static synchronized cec b(cbp cbpVar) throws GeneralSecurityException {
        cec b2;
        synchronized (byc.class) {
            bxp<?> b3 = b(cbpVar.typeUrl_);
            if (d.get(cbpVar.typeUrl_).booleanValue()) {
                b2 = b3.b(cbpVar.value_);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + cbpVar.typeUrl_);
            }
        }
        return b2;
    }

    private static <P> P a(String str, ccu ccuVar, Class<P> cls) throws GeneralSecurityException {
        bxp<?> bxpVar;
        a a2 = a(str);
        if (cls == null) {
            bxpVar = a2.a();
        } else if (a2.c().contains(cls)) {
            bxpVar = a2.a(cls);
        } else {
            throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + a2.b() + ", supported primitives: " + a(a2.c()));
        }
        return (P) bxpVar.a(ccuVar);
    }

    public static <P> bya<P> a(bxt bxtVar, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) a(cls);
        bye.b(bxtVar.a);
        bya<P> byaVar = new bya<>(cls2);
        for (cbt.b bVar : bxtVar.a.key_) {
            if (bVar.b() == cbo.ENABLED) {
                Object a2 = a(bVar.a().typeUrl_, bVar.a().value_, cls2);
                if (bVar.b() != cbo.ENABLED) {
                    throw new GeneralSecurityException("only ENABLED key is allowed");
                }
                bya.a<P> aVar = new bya.a<>(a2, bxn.a(bVar), bVar.b(), bVar.c(), bVar.keyId_);
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                bya.b bVar2 = new bya.b(aVar.a(), (byte) 0);
                List<bya.a<P>> put = byaVar.a.put(bVar2, Collections.unmodifiableList(arrayList));
                if (put != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(put);
                    arrayList2.add(aVar);
                    byaVar.a.put(bVar2, Collections.unmodifiableList(arrayList2));
                }
                if (bVar.keyId_ != bxtVar.a.primaryKeyId_) {
                    continue;
                } else if (aVar.b != cbo.ENABLED) {
                    throw new IllegalArgumentException("the primary entry has to be ENABLED");
                } else {
                    if (byaVar.a(aVar.a()).isEmpty()) {
                        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                    }
                    byaVar.b = aVar;
                }
            }
        }
        return byaVar;
    }
}
