package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import defpackage.ccm;
import defpackage.ccq;
import defpackage.cdg;
import defpackage.cdk;
import defpackage.cdk.a;
import defpackage.cdm;
import defpackage.cec;
import defpackage.cff;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: cdk  reason: default package */
/* loaded from: classes2.dex */
public abstract class cdk<MessageType extends cdk<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends ccm<MessageType, BuilderType> {
    private static Map<Object, cdk<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected cfa unknownFields = cfa.a();
    protected int memoizedSerializedSize = -1;

    /* renamed from: cdk$d */
    /* loaded from: classes2.dex */
    public interface d extends ced {
    }

    /* renamed from: cdk$f */
    /* loaded from: classes2.dex */
    public static class f<ContainingType extends cec, Type> extends ccz<ContainingType, Type> {
        final cec a;
        final e b;
    }

    protected abstract Object a(int i);

    @Override // defpackage.cec
    public final cel<MessageType> i() {
        return (cel) a(g.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public MessageType s() {
        return (MessageType) a(g.f);
    }

    /* renamed from: j */
    public final BuilderType r() {
        return (BuilderType) a(g.e);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        cee.a(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        this.memoizedHashCode = ceo.a().a((ceo) this).a(this);
        return this.memoizedHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (s().getClass().isInstance(obj)) {
            return ceo.a().a((ceo) this).a(this, (cdk) obj);
        }
        return false;
    }

    protected final void k() {
        ceo.a().a((ceo) this).d(this);
    }

    public final <MessageType extends cdk<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType l() {
        return (BuilderType) a(g.e);
    }

    @Override // defpackage.ced
    public final boolean m() {
        return a(this, true);
    }

    /* renamed from: n */
    public final BuilderType q() {
        BuilderType buildertype = (BuilderType) a(g.e);
        buildertype.a(this);
        return buildertype;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: cdk$g */
    /* loaded from: classes2.dex */
    public static final class g extends Enum<g> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object c(int i) {
        return a(i);
    }

    @Override // defpackage.ccm
    final int h() {
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.ccm
    final void b(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // defpackage.cec
    public final void a(CodedOutputStream codedOutputStream) throws IOException {
        ccx ccxVar;
        cet a2 = ceo.a().a((ceo) this);
        if (codedOutputStream.b != null) {
            ccxVar = codedOutputStream.b;
        } else {
            ccxVar = new ccx(codedOutputStream);
        }
        a2.a((cet) this, (cfg) ccxVar);
    }

    @Override // defpackage.cec
    public final int o() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = ceo.a().a((ceo) this).b(this);
        }
        return this.memoizedSerializedSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object p() throws Exception {
        return a(g.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends cdk<?, ?>> T a(Class<T> cls) {
        cdk<?, ?> cdkVar = defaultInstanceMap.get(cls);
        if (cdkVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                cdkVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (cdkVar == null) {
            cdkVar = (T) ((cdk) cfd.a(cls)).s();
            if (cdkVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, cdkVar);
        }
        return (T) cdkVar;
    }

    public static <T extends cdk<?, ?>> void a(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object a(cec cecVar, String str, Object[] objArr) {
        return new cer(cecVar, str, objArr);
    }

    /* renamed from: cdk$a */
    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends cdk<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends ccm.a<MessageType, BuilderType> {
        protected MessageType a;
        protected boolean b = false;
        private final MessageType c;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ccm.a
        protected final /* bridge */ /* synthetic */ ccm.a a(ccm ccmVar) {
            return a((a<MessageType, BuilderType>) ((cdk) ccmVar));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.c = messagetype;
            this.a = (MessageType) messagetype.c(g.d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void d() {
            if (this.b) {
                MessageType messagetype = (MessageType) this.a.c(g.d);
                a(messagetype, this.a);
                this.a = messagetype;
                this.b = false;
            }
        }

        @Override // defpackage.ced
        public final boolean m() {
            return cdk.a(this.a, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public MessageType f() {
            if (this.b) {
                return this.a;
            }
            this.a.k();
            this.b = true;
            return this.a;
        }

        /* renamed from: e */
        public final MessageType g() {
            MessageType f = f();
            if (f.m()) {
                return f;
            }
            throw new UninitializedMessageException();
        }

        public final BuilderType a(MessageType messagetype) {
            d();
            a(this.a, messagetype);
            return this;
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            ceo.a().a((ceo) messagetype).b(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) this.c.r();
            buildertype.a(f());
            return buildertype;
        }

        @Override // defpackage.ced
        public final /* bridge */ /* synthetic */ cec s() {
            return this.c;
        }
    }

    /* renamed from: cdk$c */
    /* loaded from: classes2.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends cdk<MessageType, BuilderType> implements d<MessageType, BuilderType> {
        protected cdg<e> extensions = cdg.a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final cdg<e> a() {
            if (this.extensions.b) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cdk$e */
    /* loaded from: classes2.dex */
    public static final class e implements cdg.a<e> {
        final cdm.d<?> a;
        final int b;
        final cff.a c;
        final boolean d;
        final boolean e;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.b - ((e) obj).b;
        }

        @Override // defpackage.cdg.a
        public final int a() {
            return this.b;
        }

        @Override // defpackage.cdg.a
        public final cff.a b() {
            return this.c;
        }

        @Override // defpackage.cdg.a
        public final cff.b c() {
            return this.c.getJavaType();
        }

        @Override // defpackage.cdg.a
        public final boolean d() {
            return this.d;
        }

        @Override // defpackage.cdg.a
        public final boolean e() {
            return this.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.cdg.a
        public final cec.a a(cec.a aVar, cec cecVar) {
            return ((a) aVar).a((a) ((cdk) cecVar));
        }
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

    protected static final <T extends cdk<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(g.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e2 = ceo.a().a((ceo) t).e(t);
        if (z) {
            t.a(g.b);
        }
        return e2;
    }

    public static <E> cdm.i<E> a(cdm.i<E> iVar) {
        int size = iVar.size();
        return iVar.a(size == 0 ? 10 : size * 2);
    }

    /* renamed from: cdk$b */
    /* loaded from: classes2.dex */
    public static class b<T extends cdk<T, ?>> extends ccn<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        @Override // defpackage.cel
        public final /* bridge */ /* synthetic */ Object a(ccv ccvVar, cdb cdbVar) throws InvalidProtocolBufferException {
            return cdk.a(this.a, ccvVar, cdbVar);
        }
    }

    static <T extends cdk<T, ?>> T a(T t, ccv ccvVar, cdb cdbVar) throws InvalidProtocolBufferException {
        ccw ccwVar;
        T t2 = (T) t.a(g.d);
        try {
            cet a2 = ceo.a().a((ceo) t2);
            if (ccvVar.d != null) {
                ccwVar = ccvVar.d;
            } else {
                ccwVar = new ccw(ccvVar);
            }
            a2.a(t2, ccwVar, cdbVar);
            a2.d(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException.a = t2;
            throw invalidProtocolBufferException;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw e3;
        }
    }

    private static <T extends cdk<T, ?>> T a(T t, byte[] bArr, int i, cdb cdbVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.a(g.d);
        try {
            cet a2 = ceo.a().a((ceo) t2);
            a2.a(t2, bArr, 0, i + 0, new ccq.a(cdbVar));
            a2.d(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException.a = t2;
            throw invalidProtocolBufferException;
        } catch (IndexOutOfBoundsException unused) {
            InvalidProtocolBufferException a3 = InvalidProtocolBufferException.a();
            a3.a = t2;
            throw a3;
        }
    }

    public static <T extends cdk<T, ?>> T a(T t, ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        return (T) a(b(t, ccuVar, cdbVar));
    }

    private static <T extends cdk<T, ?>> T b(T t, ccu ccuVar, cdb cdbVar) throws InvalidProtocolBufferException {
        try {
            ccv f2 = ccuVar.f();
            T t2 = (T) a(t, f2, cdbVar);
            try {
                f2.a(0);
                return t2;
            } catch (InvalidProtocolBufferException e2) {
                e2.a = t2;
                throw e2;
            }
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }

    public static <T extends cdk<T, ?>> T a(T t, byte[] bArr, cdb cdbVar) throws InvalidProtocolBufferException {
        return (T) a(a(t, bArr, bArr.length, cdbVar));
    }

    private static <T extends cdk<T, ?>> T a(T t) throws InvalidProtocolBufferException {
        if (t == null || a((cdk) t, true)) {
            return t;
        }
        InvalidProtocolBufferException a2 = new UninitializedMessageException().a();
        a2.a = t;
        throw a2;
    }
}
