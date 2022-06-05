package defpackage;

import defpackage.ear;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: eba  reason: default package */
/* loaded from: classes2.dex */
public final class eba {
    public final eas a;
    public final String b;
    public final ear c;
    public final ebb d;
    public final Map<Class<?>, Object> e;
    private volatile eac f;

    eba(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = ebk.a(aVar.e);
    }

    public final eas a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final ear c() {
        return this.c;
    }

    public final String a(String str) {
        return this.c.a(str);
    }

    public final ebb d() {
        return this.d;
    }

    public final a e() {
        return new a(this);
    }

    public final eac f() {
        eac eacVar = this.f;
        if (eacVar != null) {
            return eacVar;
        }
        eac a2 = eac.a(this.c);
        this.f = a2;
        return a2;
    }

    public final String toString() {
        return "Request{method=" + this.b + ", url=" + this.a + ", tags=" + this.e + '}';
    }

    /* renamed from: eba$a */
    /* loaded from: classes2.dex */
    public static class a {
        eas a;
        String b;
        ear.a c;
        ebb d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = "GET";
            this.c = new ear.a();
        }

        a(eba ebaVar) {
            Map<Class<?>, Object> map;
            this.e = Collections.emptyMap();
            this.a = ebaVar.a;
            this.b = ebaVar.b;
            this.d = ebaVar.d;
            if (ebaVar.e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(ebaVar.e);
            }
            this.e = map;
            this.c = ebaVar.c.b();
        }

        public final a a(eas easVar) {
            if (easVar == null) {
                throw new NullPointerException("url == null");
            }
            this.a = easVar;
            return this;
        }

        public final a a(String str, String str2) {
            this.c.d(str, str2);
            return this;
        }

        public final a a(String str) {
            this.c.a(str);
            return this;
        }

        public final a a(ear earVar) {
            this.c = earVar.b();
            return this;
        }

        public final a a(String str, ebb ebbVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (ebbVar != null && !ecf.a(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (ebbVar == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    throw new IllegalArgumentException("method " + str + " must have a request body.");
                }
            }
            this.b = str;
            this.d = ebbVar;
            return this;
        }

        public final <T> a a(Class<? super T> cls, T t) {
            if (cls != null) {
                if (t == null) {
                    this.e.remove(cls);
                } else {
                    if (this.e.isEmpty()) {
                        this.e = new LinkedHashMap();
                    }
                    this.e.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        public final eba a() {
            if (this.a == null) {
                throw new IllegalStateException("url == null");
            }
            return new eba(this);
        }
    }
}
