package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aar  reason: default package */
/* loaded from: classes.dex */
public final class aar {

    /* renamed from: aar$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final List<String> a = new ArrayList();
        private final Object b;

        /* synthetic */ a(Object obj) {
            aat.a(obj);
            this.b = obj;
        }

        public final a a(String str, Object obj) {
            List<String> list = this.a;
            aat.a(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private aar() {
        throw new AssertionError("Uninstantiable");
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
