package defpackage;

import com.google.errorprone.annotations.Immutable;

@Immutable
/* renamed from: bxr  reason: default package */
/* loaded from: classes2.dex */
public final class bxr {
    final cbp a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: bxr$a */
    /* loaded from: classes2.dex */
    public static final class a extends Enum<a> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bxr$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[a.a().length];
            b = iArr;
            try {
                iArr[a.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[a.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[a.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[a.d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ccf.values().length];
            a = iArr2;
            try {
                iArr2[ccf.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ccf.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ccf.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ccf.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static ccf a(int i) {
        int i2 = AnonymousClass1.b[i - 1];
        if (i2 != 1) {
            if (i2 == 2) {
                return ccf.LEGACY;
            }
            if (i2 == 3) {
                return ccf.RAW;
            }
            if (i2 == 4) {
                return ccf.CRUNCHY;
            }
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        return ccf.TINK;
    }

    public static bxr a(String str, byte[] bArr, int i) {
        return new bxr(cbp.a().a(str).a(ccu.a(bArr)).a(a(i)).g());
    }

    private bxr(cbp cbpVar) {
        this.a = cbpVar;
    }
}
