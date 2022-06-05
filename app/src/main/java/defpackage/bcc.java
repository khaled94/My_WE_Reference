package defpackage;

import com.google.android.gms.internal.places.zzaj;
import com.google.android.gms.internal.places.zzbk;
import com.google.android.gms.internal.places.zzdp;
import defpackage.bcc;
import defpackage.bcc.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bcc  reason: default package */
/* loaded from: classes2.dex */
public abstract class bcc<MessageType extends bcc<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends bfr<MessageType, BuilderType> {
    static Map<Object, bcc<?, ?>> zzij = new ConcurrentHashMap();
    protected ben zzih = ben.a();
    private int zzii = -1;

    /* renamed from: bcc$c */
    /* loaded from: classes2.dex */
    public static class c<T extends bcc<T, ?>> extends bfs<T> {
        private final T a;

        public c(T t) {
            this.a = t;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: bcc$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 1;
        public static final int k = 2;
        private static final /* synthetic */ int[] l = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] m = {1, 2};
        private static final /* synthetic */ int[] n = {1, 2};

        public static int[] a() {
            return (int[]) l.clone();
        }
    }

    /* renamed from: bcc$e */
    /* loaded from: classes2.dex */
    public static class e<ContainingType extends bdh, Type> extends bbm<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a(int i);

    /* renamed from: bcc$b */
    /* loaded from: classes2.dex */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends bcc<MessageType, BuilderType> implements bdj {
        protected bbu<Object> zzik = bbu.a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final bbu<Object> h() {
            if (this.zzik.b) {
                this.zzik = (bbu) this.zzik.clone();
            }
            return this.zzik;
        }
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        bdi.a(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.zzdt != 0) {
            return this.zzdt;
        }
        this.zzdt = bds.a().a((bds) this).a(this);
        return this.zzdt;
    }

    /* renamed from: bcc$a */
    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends bcc<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends bft<MessageType, BuilderType> {
        private final MessageType a;
        private MessageType b;
        private boolean c = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) messagetype.a(d.d);
        }

        @Override // defpackage.bdj
        public final boolean b() {
            return bcc.a(this.b, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public MessageType c() {
            if (this.c) {
                return this.b;
            }
            this.b.a();
            this.c = true;
            return this.b;
        }

        public final BuilderType a(MessageType messagetype) {
            if (this.c) {
                MessageType messagetype2 = (MessageType) this.b.a(d.d);
                a(messagetype2, this.b);
                this.b = messagetype2;
                this.c = false;
            }
            a(this.b, messagetype);
            return this;
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            bds.a().a((bds) messagetype).b(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bft
        protected final /* synthetic */ bft a(bfr bfrVar) {
            return a((a<MessageType, BuilderType>) ((bcc) bfrVar));
        }

        @Override // defpackage.bft
        public final /* synthetic */ bft a() {
            return (a) clone();
        }

        @Override // defpackage.bdj
        public final /* synthetic */ bdh g() {
            return this.a;
        }

        @Override // defpackage.bft
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.a.a(d.e);
            aVar.a((a) c());
            return aVar;
        }

        @Override // defpackage.bdg
        public final /* synthetic */ bdh d() {
            MessageType c = c();
            if (c.b()) {
                return c;
            }
            throw new zzdp();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((bcc) a(d.f)).getClass().isInstance(obj)) {
            return bds.a().a((bds) this).a(this, (bcc) obj);
        }
        return false;
    }

    protected final void a() {
        bds.a().a((bds) this).c(this);
    }

    @Override // defpackage.bdj
    public final boolean b() {
        return a(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bfr
    public final int c() {
        return this.zzii;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bfr
    public final void b(int i) {
        this.zzii = i;
    }

    @Override // defpackage.bdh
    public final void a(zzaj zzajVar) throws IOException {
        bbl bblVar;
        bdy a2 = bds.a().a((Class) getClass());
        if (zzajVar.c != null) {
            bblVar = zzajVar.c;
        } else {
            bblVar = new bbl(zzajVar);
        }
        a2.a((bdy) this, (bfi) bblVar);
    }

    @Override // defpackage.bdh
    public final int d() {
        if (this.zzii == -1) {
            this.zzii = bds.a().a((bds) this).b(this);
        }
        return this.zzii;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends bcc<?, ?>> T a(Class<T> cls) {
        T t = zzij.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = zzij.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (T) ((bcc) beu.a(cls)).a(d.f);
            if (t == null) {
                throw new IllegalStateException();
            }
            zzij.put(cls, t);
        }
        return (T) t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends bcc<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(d.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = bds.a().a((bds) t).d(t);
        if (z) {
            t.a(d.b);
        }
        return d2;
    }

    private static <T extends bcc<T, ?>> T a(T t, byte[] bArr, int i, bbo bboVar) throws zzbk {
        T t2 = (T) t.a(d.d);
        try {
            bds.a().a((bds) t2).a(t2, bArr, 0, i, new bfw(bboVar));
            t2.a();
            if (t2.zzdt == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzbk) {
                throw ((zzbk) e2.getCause());
            }
            zzbk zzbkVar = new zzbk(e2.getMessage());
            zzbkVar.a = t2;
            throw zzbkVar;
        } catch (IndexOutOfBoundsException unused) {
            zzbk a2 = zzbk.a();
            a2.a = t2;
            throw a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends bcc<T, ?>> T a(T t, byte[] bArr) throws zzbk {
        T t2 = (T) a(t, bArr, bArr.length, bbo.a());
        if (t2 == null || a((bcc) t2, true)) {
            return t2;
        }
        zzbk zzbkVar = new zzbk(new zzdp().getMessage());
        zzbkVar.a = t2;
        throw zzbkVar;
    }

    @Override // defpackage.bdh
    public final /* synthetic */ bdg e() {
        a aVar = (a) a(d.e);
        aVar.a((a) this);
        return aVar;
    }

    @Override // defpackage.bdh
    public final /* synthetic */ bdg f() {
        return (a) a(d.e);
    }

    @Override // defpackage.bdj
    public final /* synthetic */ bdh g() {
        return (bcc) a(d.f);
    }
}
