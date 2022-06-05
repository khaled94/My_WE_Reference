package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: ak  reason: default package */
/* loaded from: classes.dex */
public interface ak {
    a a(String str);

    void a();

    void a(String str, a aVar);

    /* renamed from: ak$a */
    /* loaded from: classes.dex */
    public static class a {
        public byte[] a;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public Map<String, String> g = Collections.emptyMap();
        public List<ao> h;

        public final boolean a() {
            return this.e < System.currentTimeMillis();
        }
    }
}
