package defpackage;

import java.util.Locale;

/* renamed from: dkn  reason: default package */
/* loaded from: classes2.dex */
public interface dkn {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: dkn$b */
    /* loaded from: classes2.dex */
    public static final class b extends Enum<b> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};
    }

    /* renamed from: dkn$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }
}
