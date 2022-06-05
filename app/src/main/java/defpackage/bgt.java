package defpackage;

import defpackage.vc;
import java.util.Arrays;
import java.util.Locale;

@Deprecated
/* renamed from: bgt  reason: default package */
/* loaded from: classes2.dex */
public final class bgt implements vc.d.f {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    private final Locale e;

    private bgt() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = null;
    }

    /* renamed from: bgt$a */
    /* loaded from: classes2.dex */
    public static class a {
        private int a = 0;

        public static bgt a() {
            return new bgt((byte) 0);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bgt) && aar.a(null, null) && aar.a(null, null) && aar.a(0, 0) && aar.a(null, null) && aar.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, 0, null, null});
    }

    /* synthetic */ bgt(byte b) {
        this();
    }
}
