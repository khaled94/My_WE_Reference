package defpackage;

/* renamed from: cff  reason: default package */
/* loaded from: classes2.dex */
public final class cff {
    static final int a = 11;
    static final int b = 12;
    static final int c = 16;
    static final int d = 26;

    public static int a(int i) {
        return i & 7;
    }

    public static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int b(int i) {
        return i >>> 3;
    }

    private cff() {
    }

    /* renamed from: cff$b */
    /* loaded from: classes2.dex */
    public enum b {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ccu.a),
        ENUM(null),
        MESSAGE(null);
        
        private final Object defaultDefault;

        b(Object obj) {
            this.defaultDefault = obj;
        }

        final Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* renamed from: cff$a */
    /* loaded from: classes2.dex */
    public enum a {
        DOUBLE(b.DOUBLE, 1),
        FLOAT(b.FLOAT, 5),
        INT64(b.LONG, 0),
        UINT64(b.LONG, 0),
        INT32(b.INT, 0),
        FIXED64(b.LONG, 1),
        FIXED32(b.INT, 5),
        BOOL(b.BOOLEAN, 0),
        STRING(b.STRING, 2) { // from class: cff.a.1
            @Override // defpackage.cff.a
            public final boolean isPackable() {
                return false;
            }
        },
        GROUP(b.MESSAGE, 3) { // from class: cff.a.2
            @Override // defpackage.cff.a
            public final boolean isPackable() {
                return false;
            }
        },
        MESSAGE(b.MESSAGE, 2) { // from class: cff.a.3
            @Override // defpackage.cff.a
            public final boolean isPackable() {
                return false;
            }
        },
        BYTES(b.BYTE_STRING, 2) { // from class: cff.a.4
            @Override // defpackage.cff.a
            public final boolean isPackable() {
                return false;
            }
        },
        UINT32(b.INT, 0),
        ENUM(b.ENUM, 0),
        SFIXED32(b.INT, 5),
        SFIXED64(b.LONG, 1),
        SINT32(b.INT, 0),
        SINT64(b.LONG, 0);
        
        private final b javaType;
        private final int wireType;

        public boolean isPackable() {
            return true;
        }

        /* synthetic */ a(b bVar, int i, AnonymousClass1 anonymousClass1) {
            this(bVar, i);
        }

        a(b bVar, int i) {
            this.javaType = bVar;
            this.wireType = i;
        }

        public b getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }
    }

    /* renamed from: cff$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[a.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[a.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[a.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[a.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[a.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[a.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[a.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[a.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[a.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[a.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[a.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[a.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[a.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }
}
