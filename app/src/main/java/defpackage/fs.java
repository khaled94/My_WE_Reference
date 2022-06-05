package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fs  reason: default package */
/* loaded from: classes2.dex */
public final class fs implements fq {
    private final Map<String, List<fr>> c;
    private volatile Map<String, String> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fs(Map<String, List<fr>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.fq
    public final Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, List<fr>> entry : this.c.entrySet()) {
                        String a2 = a(entry.getValue());
                        if (!TextUtils.isEmpty(a2)) {
                            hashMap.put(entry.getKey(), a2);
                        }
                    }
                    this.d = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.d;
    }

    private static String a(List<fr> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = list.get(i).a();
            if (!TextUtils.isEmpty(a2)) {
                sb.append(a2);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.c + '}';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fs) {
            return this.c.equals(((fs) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    /* renamed from: fs$b */
    /* loaded from: classes2.dex */
    static final class b implements fr {
        private final String a;

        b(String str) {
            this.a = str;
        }

        @Override // defpackage.fr
        public final String a() {
            return this.a;
        }

        public final String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: fs$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final String c;
        private static final Map<String, List<fr>> d;
        boolean a = true;
        Map<String, List<fr>> b = d;
        private boolean e = true;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            c = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(c)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(c)));
            }
            d = Collections.unmodifiableMap(hashMap);
        }
    }
}
