package defpackage;

import io.realm.RealmFieldType;
import java.util.Map;

/* renamed from: dla  reason: default package */
/* loaded from: classes2.dex */
public abstract class dla {
    public final Map<String, a> a;
    private final Map<String, a> b;
    private final boolean c;

    /* renamed from: dla$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final long a;
        public final RealmFieldType b;
        public final String c;

        public final String toString() {
            return "ColumnDetails[" + this.a + ", " + this.b + ", " + this.c + "]";
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnInfo[");
        sb.append("mutable=" + this.c);
        sb.append(",");
        boolean z = false;
        if (this.a != null) {
            sb.append("JavaFieldNames=[");
            boolean z2 = false;
            for (Map.Entry<String, a> entry : this.a.entrySet()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(entry.getKey());
                sb.append("->");
                sb.append(entry.getValue());
                z2 = true;
            }
            sb.append("]");
        }
        if (this.b != null) {
            sb.append(", InternalFieldNames=[");
            for (Map.Entry<String, a> entry2 : this.b.entrySet()) {
                if (z) {
                    sb.append(",");
                }
                sb.append(entry2.getKey());
                sb.append("->");
                sb.append(entry2.getValue());
                z = true;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }
}
