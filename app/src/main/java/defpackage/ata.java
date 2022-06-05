package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzhq;
import defpackage.ata;
import defpackage.ata.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ata  reason: default package */
/* loaded from: classes.dex */
public abstract class ata<MessageType extends ata<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends arj<MessageType, BuilderType> {
    private static Map<Object, ata<?, ?>> zzaib = new ConcurrentHashMap();
    protected avr zzahz = avr.a();
    private int zzaia = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: ata$d */
    /* loaded from: classes.dex */
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

    /* renamed from: ata$e */
    /* loaded from: classes.dex */
    public static class e<ContainingType extends aui, Type> extends asm<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a(int i);

    /* renamed from: ata$b */
    /* loaded from: classes.dex */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends ata<MessageType, BuilderType> implements auk {
        protected asq<Object> zzaic = asq.a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final asq<Object> a() {
            if (this.zzaic.b) {
                this.zzaic = (asq) this.zzaic.clone();
            }
            return this.zzaic;
        }
    }

    /* renamed from: ata$c */
    /* loaded from: classes.dex */
    public static class c<T extends ata<T, ?>> extends ark<T> {
        private final T a;

        public c(T t) {
            this.a = t;
        }

        @Override // defpackage.aur
        public final /* synthetic */ Object a(asf asfVar, asn asnVar) throws zzfi {
            return ata.a(this.a, asfVar, asnVar);
        }
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        auj.a(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.zzact != 0) {
            return this.zzact;
        }
        this.zzact = aut.a().a((aut) this).a(this);
        return this.zzact;
    }

    /* renamed from: ata$a */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends ata<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends arl<MessageType, BuilderType> {
        protected MessageType a;
        private final MessageType b;
        private boolean c = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.b = messagetype;
            this.a = (MessageType) messagetype.a(d.d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void s() {
            if (this.c) {
                MessageType messagetype = (MessageType) this.a.a(d.d);
                a(messagetype, this.a);
                this.a = messagetype;
                this.c = false;
            }
        }

        @Override // defpackage.auk
        public final boolean m() {
            return ata.a(this.a, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public MessageType u() {
            if (this.c) {
                return this.a;
            }
            this.a.k();
            this.c = true;
            return this.a;
        }

        public final BuilderType a(MessageType messagetype) {
            s();
            a(this.a, messagetype);
            return this;
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            aut.a().a((aut) messagetype).b(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final BuilderType a(byte[] bArr, int i, asn asnVar) throws zzfi {
            s();
            try {
                aut.a().a((aut) this.a).a(this.a, bArr, 0, i + 0, new aro(asnVar));
                return this;
            } catch (zzfi e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzfi.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final BuilderType a(asf asfVar, asn asnVar) throws IOException {
            s();
            try {
                aut.a().a((aut) this.a).a(this.a, asg.a(asfVar), asnVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.arl
        protected final /* synthetic */ arl a(arj arjVar) {
            return a((a<MessageType, BuilderType>) ((ata) arjVar));
        }

        @Override // defpackage.arl
        public final /* synthetic */ arl r() {
            return (a) clone();
        }

        @Override // defpackage.auk
        public final /* synthetic */ aui g_() {
            return this.b;
        }

        @Override // defpackage.arl
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.b.a(d.e);
            aVar.a((a) u());
            return aVar;
        }

        /* renamed from: t */
        public final MessageType v() {
            MessageType u = u();
            if (u.m()) {
                return u;
            }
            throw new zzhq();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((ata) a(d.f)).getClass().isInstance(obj)) {
            return aut.a().a((aut) this).a(this, (ata) obj);
        }
        return false;
    }

    protected final void k() {
        aut.a().a((aut) this).c(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends ata<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType l() {
        return (BuilderType) a(d.e);
    }

    @Override // defpackage.auk
    public final boolean m() {
        return a(this, true);
    }

    public final BuilderType n() {
        BuilderType buildertype = (BuilderType) a(d.e);
        buildertype.a(this);
        return buildertype;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.arj
    public final int j() {
        return this.zzaia;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.arj
    public final void c(int i) {
        this.zzaia = i;
    }

    @Override // defpackage.aui
    public final void a(zzee zzeeVar) throws IOException {
        ask askVar;
        aux a2 = aut.a().a((Class) getClass());
        if (zzeeVar.b != null) {
            askVar = zzeeVar.b;
        } else {
            askVar = new ask(zzeeVar);
        }
        a2.a((aux) this, (awm) askVar);
    }

    @Override // defpackage.aui
    public final int o() {
        if (this.zzaia == -1) {
            this.zzaia = aut.a().a((aut) this).b(this);
        }
        return this.zzaia;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends ata<?, ?>> T a(Class<T> cls) {
        T t = zzaib.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = zzaib.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (T) ((ata) avu.a(cls)).a(d.f);
            if (t == null) {
                throw new IllegalStateException();
            }
            zzaib.put(cls, t);
        }
        return (T) t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends ata<?, ?>> void a(Class<T> cls, T t) {
        zzaib.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object a(aui auiVar, String str, Object[] objArr) {
        return new auv(auiVar, str, objArr);
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

    protected static final <T extends ata<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(d.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = aut.a().a((aut) t).d(t);
        if (z) {
            t.a(d.b);
        }
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static atj a(atj atjVar) {
        int size = atjVar.size();
        return atjVar.c(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> ati<E> a(ati<E> atiVar) {
        int size = atiVar.size();
        return atiVar.a(size == 0 ? 10 : size << 1);
    }

    static <T extends ata<T, ?>> T a(T t, asf asfVar, asn asnVar) throws zzfi {
        T t2 = (T) t.a(d.d);
        try {
            aut.a().a((aut) t2).a(t2, asg.a(asfVar), asnVar);
            t2.k();
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzfi) {
                throw ((zzfi) e2.getCause());
            }
            zzfi zzfiVar = new zzfi(e2.getMessage());
            zzfiVar.a = t2;
            throw zzfiVar;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzfi) {
                throw ((zzfi) e3.getCause());
            }
            throw e3;
        }
    }

    private static <T extends ata<T, ?>> T a(T t, byte[] bArr, int i, asn asnVar) throws zzfi {
        T t2 = (T) t.a(d.d);
        try {
            aut.a().a((aut) t2).a(t2, bArr, 0, i, new aro(asnVar));
            t2.k();
            if (t2.zzact == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzfi) {
                throw ((zzfi) e2.getCause());
            }
            zzfi zzfiVar = new zzfi(e2.getMessage());
            zzfiVar.a = t2;
            throw zzfiVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfi a2 = zzfi.a();
            a2.a = t2;
            throw a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends ata<T, ?>> T a(T t, byte[] bArr, asn asnVar) throws zzfi {
        T t2 = (T) a(t, bArr, bArr.length, asnVar);
        if (t2 == null || a((ata) t2, true)) {
            return t2;
        }
        zzfi zzfiVar = new zzfi(new zzhq().getMessage());
        zzfiVar.a = t2;
        throw zzfiVar;
    }

    @Override // defpackage.aui
    public final /* synthetic */ auh p() {
        a aVar = (a) a(d.e);
        aVar.a((a) this);
        return aVar;
    }

    @Override // defpackage.aui
    public final /* synthetic */ auh q() {
        return (a) a(d.e);
    }

    @Override // defpackage.auk
    public final /* synthetic */ aui g_() {
        return (ata) a(d.f);
    }
}
