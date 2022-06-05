package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cee  reason: default package */
/* loaded from: classes2.dex */
public final class cee {
    cee() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a7, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a9, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ba, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01cb, code lost:
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01dd, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.cec r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cee.a(cec, java.lang.StringBuilder, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(cey.a(ccu.a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof ccu) {
                sb.append(": \"");
                sb.append(cey.a((ccu) obj));
                sb.append('\"');
            } else if (obj instanceof cdk) {
                sb.append(" {");
                a((cdk) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                a(sb, i4, "key", entry2.getKey());
                a(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
