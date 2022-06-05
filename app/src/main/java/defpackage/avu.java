package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: avu  reason: default package */
/* loaded from: classes.dex */
public final class avu {
    static final long a;
    static final boolean b;
    private static final Logger c = Logger.getLogger(avu.class.getName());
    private static final Unsafe d = c();
    private static final Class<?> e = arm.b();
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

    private avu() {
    }

    /* renamed from: avu$b */
    /* loaded from: classes.dex */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.avu.d
        public final void a(long j, byte b) {
            this.a.putByte(j, b);
        }

        @Override // defpackage.avu.d
        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // defpackage.avu.d
        public final boolean b(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // defpackage.avu.d
        public final float c(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // defpackage.avu.d
        public final double d(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // defpackage.avu.d
        public final void a(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, avu.a + j, (Object) null, j2, j3);
        }
    }

    /* renamed from: avu$c */
    /* loaded from: classes.dex */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.avu.d
        public final void a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // defpackage.avu.d
        public final byte a(Object obj, long j) {
            if (avu.b) {
                return avu.k(obj, j);
            }
            return avu.l(obj, j);
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, byte b) {
            if (avu.b) {
                avu.c(obj, j, b);
            } else {
                avu.d(obj, j, b);
            }
        }

        @Override // defpackage.avu.d
        public final boolean b(Object obj, long j) {
            if (avu.b) {
                return avu.i(obj, j);
            }
            return avu.j(obj, j);
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, boolean z) {
            if (avu.b) {
                avu.b(obj, j, z);
            } else {
                avu.c(obj, j, z);
            }
        }

        @Override // defpackage.avu.d
        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.avu.d
        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        @Override // defpackage.avu.d
        public final void a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    public static boolean a() {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: avu$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void a(long j, byte b);

        public abstract void a(Object obj, long j, byte b);

        public abstract void a(Object obj, long j, double d);

        public abstract void a(Object obj, long j, float f);

        public abstract void a(Object obj, long j, boolean z);

        public abstract void a(byte[] bArr, long j, long j2, long j3);

        public abstract boolean b(Object obj, long j);

        public abstract float c(Object obj, long j);

        public abstract double d(Object obj, long j);

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

    public static boolean b() {
        return i;
    }

    /* renamed from: avu$a */
    /* loaded from: classes.dex */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.avu.d
        public final void a(long j, byte b) {
            Memory.pokeByte((int) (j & (-1)), b);
        }

        @Override // defpackage.avu.d
        public final byte a(Object obj, long j) {
            if (avu.b) {
                return avu.k(obj, j);
            }
            return avu.l(obj, j);
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, byte b) {
            if (avu.b) {
                avu.c(obj, j, b);
            } else {
                avu.d(obj, j, b);
            }
        }

        @Override // defpackage.avu.d
        public final boolean b(Object obj, long j) {
            if (avu.b) {
                return avu.i(obj, j);
            }
            return avu.j(obj, j);
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, boolean z) {
            if (avu.b) {
                avu.b(obj, j, z);
            } else {
                avu.c(obj, j, z);
            }
        }

        @Override // defpackage.avu.d
        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.avu.d
        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }

        @Override // defpackage.avu.d
        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        @Override // defpackage.avu.d
        public final void a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & (-1)), bArr, (int) j, (int) j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(Class<T> cls) {
        try {
            return (T) d.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
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

    public static void a(byte[] bArr, long j2, long j3, long j4) {
        h.a(bArr, j2, j3, j4);
    }

    public static void a(long j2, byte b2) {
        h.a(j2, b2);
    }

    public static long a(ByteBuffer byteBuffer) {
        return h.f(byteBuffer, w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new avw());
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
            if (arm.a()) {
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
            Logger logger = c;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
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
            if (arm.a()) {
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
            Logger logger = c;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean d(Class<?> cls) {
        if (!arm.a()) {
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
        if (!arm.a() || (a2 = a(Buffer.class, "effectiveDirectAddress")) == null) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static byte k(Object obj, long j2) {
        return (byte) (a(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte l(Object obj, long j2) {
        return (byte) (a(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
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

    static {
        d dVar;
        d dVar2 = null;
        if (d != null) {
            if (arm.a()) {
                if (f) {
                    dVar2 = new c(d);
                } else if (g) {
                    dVar2 = new a(d);
                }
            } else {
                dVar2 = new b(d);
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
        w = (f2 == null || (dVar = h) == null) ? -1L : dVar.a.objectFieldOffset(f2);
        x = (int) (a & 7);
        b = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
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
