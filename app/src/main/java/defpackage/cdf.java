package defpackage;

import defpackage.cdm;
import java.lang.reflect.Field;

/* renamed from: cdf  reason: default package */
/* loaded from: classes2.dex */
final class cdf implements Comparable<cdf> {
    final Field a;
    final cdh b;
    final Class<?> c;
    final int d;
    final Field e;
    final int f;
    final boolean g;
    final boolean h;
    final cek i;
    final Field j;
    final Class<?> k;
    final Object l;
    final cdm.e m;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cdf cdfVar) {
        return this.d - cdfVar.d;
    }

    /* renamed from: cdf$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cdh.values().length];
            a = iArr;
            try {
                iArr[cdh.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cdh.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cdh.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cdh.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
