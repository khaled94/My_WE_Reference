package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: cfd  reason: default package */
/* loaded from: classes2.dex */
public final class cfd {
    static final long a;
    static final boolean b;
    private static final Logger c = Logger.getLogger(cfd.class.getName());
    private static final Unsafe d = c();
    private static final Class<?> e = ccp.b();
    private static final boolean f = d(Long.TYPE);
    private static final boolean g = d(Integer.TYPE);
    private static final d h;
    private static final boolean i;
    private static final boolean j;
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

    static {
        d dVar;
        d dVar2 = null;
        if (d != null) {
            if (ccp.a()) {
                if (f) {
                    dVar2 = new b(d);
                } else if (g) {
                    dVar2 = new a(d);
                }
            } else {
                dVar2 = new c(d);
            }
        }
        h = dVar2;
        i = e();
        j = d();
        a = b(byte[].class);
        k = b(boolean[].class);
        l = c(boolean[].class);
        m = b(int[].class);
        n = c(int[].class);
        o = b(long[].class);
        p = c(long[].class);
        q = b(float[].class);
        r = c(float[].class);
        s = b(double[].class);
        t = c(double[].class);
        u = b(Object[].class);
        v = c(Object[].class);
        Field f2 = f();
        w = (f2 == null || (dVar = h) == null) ? -1L : dVar.a(f2);
        x = (int) (a & 7);
        b = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private cfd() {
    }

    public static boolean a() {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(Class<T> cls) {
        try {
            return (T) d.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(Field field) {
        return h.a(field);
    }

    private static int b(Class<?> cls) {
        if (j) {
            return h.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int c(Class<?> cls) {
        if (j) {
            return h.a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Object obj, long j2) {
        return h.e(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, int i2) {
        h.a(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(Object obj, long j2) {
        return h.f(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, long j3) {
        h.a(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Object obj, long j2) {
        return h.b(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, boolean z) {
        h.a(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(Object obj, long j2) {
        return h.c(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, float f2) {
        h.a(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double e(Object obj, long j2) {
        return h.d(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, double d2) {
        h.a(obj, j2, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(Object obj, long j2) {
        return h.a.getObject(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, Object obj2) {
        h.a.putObject(obj, j2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(byte[] bArr, long j2) {
        return h.a(bArr, a + j2);
    }

    public static void a(byte[] bArr, long j2, byte b2) {
        h.a((Object) bArr, a + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: cfd.1
                @Override // java.security.PrivilegedExceptionAction
                public final /* synthetic */ Unsafe run() throws Exception {
                    Field[] declaredFields;
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean d() {
        Unsafe unsafe = d;
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
            if (ccp.a()) {
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
            c.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    private static boolean e() {
        Unsafe unsafe = d;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (f() == null) {
                return false;
            }
            if (ccp.a()) {
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
            c.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    private static boolean d(Class<?> cls) {
        if (!ccp.a()) {
            return false;
        }
        try {
            Class<?> cls2 = e;
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

    private static Field f() {
        Field a2;
        if (!ccp.a() || (a2 = a(Buffer.class, "effectiveDirectAddress")) == null) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cfd$d */
    /* loaded from: classes2.dex */
    public static abstract class d {
        Unsafe a;

        public abstract byte a(Object obj, long j);

        public abstract void a(Object obj, long j, byte b);

        public abstract void a(Object obj, long j, double d);

        public abstract void a(Object obj, long j, float f);

        public abstract void a(Object obj, long j, boolean z);

        public abstract boolean b(Object obj, long j);

        public abstract float c(Object obj, long j);

        public abstract double d(Object obj, long j);

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final long a(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public final int e(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final void a(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final long f(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final void a(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }
    }

    /* renamed from: cfd$c */
    /* loaded from: classes2.dex */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.cfd.d
        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // defpackage.cfd.d
        public final boolean b(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // defpackage.cfd.d
        public final float c(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // defpackage.cfd.d
        public final double d(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }
    }

    /* renamed from: cfd$b */
    /* loaded from: classes2.dex */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.cfd.d
        public final byte a(Object obj, long j) {
            return cfd.b ? cfd.k(obj, j) : cfd.l(obj, j);
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, byte b) {
            if (cfd.b) {
                cfd.c(obj, j, b);
            } else {
                cfd.d(obj, j, b);
            }
        }

        @Override // defpackage.cfd.d
        public final boolean b(Object obj, long j) {
            if (cfd.b) {
                return cfd.i(obj, j);
            }
            return cfd.j(obj, j);
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, boolean z) {
            if (cfd.b) {
                cfd.b(obj, j, z);
            } else {
                cfd.c(obj, j, z);
            }
        }

        @Override // defpackage.cfd.d
        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.cfd.d
        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: cfd$a */
    /* loaded from: classes2.dex */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.cfd.d
        public final byte a(Object obj, long j) {
            return cfd.b ? cfd.k(obj, j) : cfd.l(obj, j);
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, byte b) {
            if (cfd.b) {
                cfd.c(obj, j, b);
            } else {
                cfd.d(obj, j, b);
            }
        }

        @Override // defpackage.cfd.d
        public final boolean b(Object obj, long j) {
            if (cfd.b) {
                return cfd.i(obj, j);
            }
            return cfd.j(obj, j);
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, boolean z) {
            if (cfd.b) {
                cfd.b(obj, j, z);
            } else {
                cfd.c(obj, j, z);
            }
        }

        @Override // defpackage.cfd.d
        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.cfd.d
        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }

        @Override // defpackage.cfd.d
        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte k(Object obj, long j2) {
        return (byte) ((a(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte l(Object obj, long j2) {
        return (byte) ((a(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int a2 = a(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a2 & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & (~(255 << i2))));
    }

    static /* synthetic */ boolean i(Object obj, long j2) {
        return k(obj, j2) != 0;
    }

    static /* synthetic */ boolean j(Object obj, long j2) {
        return l(obj, j2) != 0;
    }

    static /* synthetic */ void b(Object obj, long j2, boolean z) {
        c(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void c(Object obj, long j2, boolean z) {
        d(obj, j2, z ? (byte) 1 : (byte) 0);
    }
}
