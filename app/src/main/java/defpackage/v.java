package defpackage;

import android.os.Build;
import androidx.core.view.GravityCompat;

/* renamed from: v  reason: default package */
/* loaded from: classes2.dex */
public enum v {
    START,
    CENTER,
    END;
    
    private static final boolean HAS_RTL;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z = true;
        }
        HAS_RTL = z;
    }

    /* renamed from: v$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v.values().length];
            a = iArr;
            try {
                iArr[v.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[v.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[v.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final int getGravityInt() {
        int i = AnonymousClass1.a[ordinal()];
        if (i == 1) {
            if (!HAS_RTL) {
                return 3;
            }
            return GravityCompat.START;
        } else if (i == 2) {
            return 1;
        } else {
            if (i == 3) {
                if (!HAS_RTL) {
                    return 5;
                }
                return GravityCompat.END;
            }
            throw new IllegalStateException("Invalid gravity constant");
        }
    }

    public final int getTextAlignment() {
        int i = AnonymousClass1.a[ordinal()];
        if (i != 2) {
            return i != 3 ? 5 : 6;
        }
        return 4;
    }
}
