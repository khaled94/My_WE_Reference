package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: ama  reason: default package */
/* loaded from: classes.dex */
public final class ama {
    static final boolean a;
    private static final Logger b = Logger.getLogger(ama.class.getName());
    private static final Unsafe c = b();
    private static final Class<?> d = alv.b();
    private static final boolean e = c(Long.TYPE);
    private static final boolean f = c(Integer.TYPE);
    private static final d g;
    private static final boolean h;
    private static final boolean i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final long v;
    private static final long w;
    private static final int x;

    /* renamed from: ama$a */
    /* loaded from: classes.dex */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }
    }

    /* renamed from: ama$b */
    /* loaded from: classes.dex */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }
    }

    /* renamed from: ama$c */
    /* loaded from: classes.dex */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ama$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }
    }

    private ama() {
    }

    public static boolean a() {
        return i;
    }

    private static int a(Class<?> cls) {
        if (i) {
            return g.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int b(Class<?> cls) {
        if (i) {
            return g.a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Unsafe b() {
        try {
            return (Unsafe) AccessController.doPrivileged(new amb());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean c() {
        Unsafe unsafe = c;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (alv.a()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = b;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean d() {
        Unsafe unsafe = c;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (e() == null) {
                return false;
            }
            if (alv.a()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = b;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean c(Class<?> cls) {
        if (!alv.a()) {
            return false;
        }
        try {
            Class<?> cls2 = d;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field e() {
        Field a2;
        if (!alv.a() || (a2 = a(Buffer.class, "effectiveDirectAddress")) == null) {
            Field a3 = a(Buffer.class, "address");
            if (a3 != null && a3.getType() == Long.TYPE) {
                return a3;
            }
            return null;
        }
        return a2;
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        d dVar;
        d dVar2 = null;
        if (c != null) {
            if (alv.a()) {
                if (e) {
                    dVar2 = new c(c);
                } else if (f) {
                    dVar2 = new a(c);
                }
            } else {
                dVar2 = new b(c);
            }
        }
        g = dVar2;
        h = d();
        i = c();
        j = a(byte[].class);
        k = a(boolean[].class);
        l = b(boolean[].class);
        m = a(int[].class);
        n = b(int[].class);
        o = a(long[].class);
        p = b(long[].class);
        q = a(float[].class);
        r = b(float[].class);
        s = a(double[].class);
        t = b(double[].class);
        u = a(Object[].class);
        v = b(Object[].class);
        Field e2 = e();
        w = (e2 == null || (dVar = g) == null) ? -1L : dVar.a.objectFieldOffset(e2);
        x = (int) (j & 7);
        a = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }
}
