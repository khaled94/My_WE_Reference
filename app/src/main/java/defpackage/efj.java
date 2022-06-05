package defpackage;

import defpackage.ear;
import defpackage.eav;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: efj  reason: default package */
/* loaded from: classes2.dex */
public abstract class efj<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(efl eflVar, T t) throws IOException;

    efj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final efj<Iterable<T>> a() {
        return new efj<Iterable<T>>() { // from class: efj.1
            @Override // defpackage.efj
            final /* synthetic */ void a(efl eflVar, Object obj) throws IOException {
                Iterable<T> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (T t : iterable) {
                        efj.this.a(eflVar, t);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final efj<Object> b() {
        return new efj<Object>() { // from class: efj.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.efj
            final void a(efl eflVar, Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    efj.this.a(eflVar, Array.get(obj, i2));
                }
            }
        };
    }

    /* renamed from: efj$n */
    /* loaded from: classes2.dex */
    static final class n extends efj<Object> {
        private final Method a;
        private final int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public n(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.efj
        final void a(efl eflVar, Object obj) {
            if (obj == null) {
                throw efs.a(this.a, this.b, "@Url parameter is null.", new Object[0]);
            }
            eflVar.b = obj.toString();
        }
    }

    /* renamed from: efj$d */
    /* loaded from: classes2.dex */
    static final class d<T> extends efj<T> {
        private final String a;
        private final efc<T, String> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, efc<T, String> efcVar) {
            this.a = (String) Objects.requireNonNull(str, "name == null");
            this.b = efcVar;
        }

        @Override // defpackage.efj
        final void a(efl eflVar, T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            eflVar.a(this.a, a);
        }
    }

    /* renamed from: efj$i */
    /* loaded from: classes2.dex */
    static final class i<T> extends efj<T> {
        private final Method a;
        private final int b;
        private final String c;
        private final efc<T, String> d;
        private final boolean e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public i(Method method, int i, String str, efc<T, String> efcVar, boolean z) {
            this.a = method;
            this.b = i;
            this.c = (String) Objects.requireNonNull(str, "name == null");
            this.d = efcVar;
            this.e = z;
        }

        @Override // defpackage.efj
        final void a(efl eflVar, T t) throws IOException {
            if (t == null) {
                Method method = this.a;
                int i = this.b;
                throw efs.a(method, i, "Path parameter \"" + this.c + "\" value must not be null.", new Object[0]);
            }
            String str = this.c;
            String a = this.d.a(t);
            boolean z = this.e;
            if (eflVar.b == null) {
                throw new AssertionError();
            }
            String a2 = efl.a(a, z);
            String str2 = eflVar.b;
            String replace = str2.replace("{" + str + "}", a2);
            if (efl.a.matcher(replace).matches()) {
                throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(String.valueOf(a)));
            }
            eflVar.b = replace;
        }
    }

    /* renamed from: efj$j */
    /* loaded from: classes2.dex */
    static final class j<T> extends efj<T> {
        private final String a;
        private final efc<T, String> b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(String str, efc<T, String> efcVar, boolean z) {
            this.a = (String) Objects.requireNonNull(str, "name == null");
            this.b = efcVar;
            this.c = z;
        }

        @Override // defpackage.efj
        final void a(efl eflVar, T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            eflVar.a(this.a, a, this.c);
        }
    }

    /* renamed from: efj$l */
    /* loaded from: classes2.dex */
    static final class l<T> extends efj<T> {
        private final efc<T, String> a;
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public l(efc<T, String> efcVar, boolean z) {
            this.a = efcVar;
            this.b = z;
        }

        @Override // defpackage.efj
        final void a(efl eflVar, T t) throws IOException {
            if (t == null) {
                return;
            }
            eflVar.a(this.a.a(t), null, this.b);
        }
    }

    /* renamed from: efj$k */
    /* loaded from: classes2.dex */
    static final class k<T> extends efj<Map<String, T>> {
        private final Method a;
        private final int b;
        private final efc<T, String> c;
        private final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.efj
        final /* synthetic */ void a(efl eflVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw efs.a(this.a, this.b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw efs.a(this.a, this.b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    Method method = this.a;
                    int i = this.b;
                    throw efs.a(method, i, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.c.a(value);
                if (str2 == null) {
                    Method method2 = this.a;
                    int i2 = this.b;
                    throw efs.a(method2, i2, "Query map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                eflVar.a(str, str2, this.d);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public k(Method method, int i, efc<T, String> efcVar, boolean z) {
            this.a = method;
            this.b = i;
            this.c = efcVar;
            this.d = z;
        }
    }

    /* renamed from: efj$e */
    /* loaded from: classes2.dex */
    static final class e<T> extends efj<Map<String, T>> {
        private final Method a;
        private final int b;
        private final efc<T, String> c;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.efj
        final /* synthetic */ void a(efl eflVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw efs.a(this.a, this.b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw efs.a(this.a, this.b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    Method method = this.a;
                    int i = this.b;
                    throw efs.a(method, i, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                eflVar.a(str, (String) this.c.a(value));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Method method, int i, efc<T, String> efcVar) {
            this.a = method;
            this.b = i;
            this.c = efcVar;
        }
    }

    /* renamed from: efj$f */
    /* loaded from: classes2.dex */
    static final class f extends efj<ear> {
        private final Method a;
        private final int b;

        @Override // defpackage.efj
        final /* synthetic */ void a(efl eflVar, ear earVar) throws IOException {
            ear earVar2 = earVar;
            if (earVar2 == null) {
                throw efs.a(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            ear.a aVar = eflVar.d;
            int length = earVar2.a.length / 2;
            for (int i = 0; i < length; i++) {
                aVar.c(earVar2.a(i), earVar2.b(i));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(Method method, int i) {
            this.a = method;
            this.b = i;
        }
    }

    /* renamed from: efj$b */
    /* loaded from: classes2.dex */
    static final class b<T> extends efj<T> {
        private final String a;
        private final efc<T, String> b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str, efc<T, String> efcVar, boolean z) {
            this.a = (String) Objects.requireNonNull(str, "name == null");
            this.b = efcVar;
            this.c = z;
        }

        @Override // defpackage.efj
        final void a(efl eflVar, T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            eflVar.b(this.a, a, this.c);
        }
    }

    /* renamed from: efj$c */
    /* loaded from: classes2.dex */
    static final class c<T> extends efj<Map<String, T>> {
        private final Method a;
        private final int b;
        private final efc<T, String> c;
        private final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.efj
        final /* synthetic */ void a(efl eflVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw efs.a(this.a, this.b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw efs.a(this.a, this.b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    Method method = this.a;
                    int i = this.b;
                    throw efs.a(method, i, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.c.a(value);
                if (str2 == null) {
                    Method method2 = this.a;
                    int i2 = this.b;
                    throw efs.a(method2, i2, "Field map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                eflVar.b(str, str2, this.d);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Method method, int i, efc<T, String> efcVar, boolean z) {
            this.a = method;
            this.b = i;
            this.c = efcVar;
            this.d = z;
        }
    }

    /* renamed from: efj$g */
    /* loaded from: classes2.dex */
    static final class g<T> extends efj<T> {
        private final Method a;
        private final int b;
        private final ear c;
        private final efc<T, ebb> d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(Method method, int i, ear earVar, efc<T, ebb> efcVar) {
            this.a = method;
            this.b = i;
            this.c = earVar;
            this.d = efcVar;
        }

        @Override // defpackage.efj
        final void a(efl eflVar, T t) {
            if (t == null) {
                return;
            }
            try {
                eflVar.a(this.c, this.d.a(t));
            } catch (IOException e) {
                Method method = this.a;
                int i = this.b;
                throw efs.a(method, i, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* renamed from: efj$m */
    /* loaded from: classes2.dex */
    static final class m extends efj<eav.b> {
        static final m a = new m();

        @Override // defpackage.efj
        final /* bridge */ /* synthetic */ void a(efl eflVar, eav.b bVar) throws IOException {
            eav.b bVar2 = bVar;
            if (bVar2 != null) {
                eflVar.e.a(bVar2);
            }
        }

        private m() {
        }
    }

    /* renamed from: efj$h */
    /* loaded from: classes2.dex */
    static final class h<T> extends efj<Map<String, T>> {
        private final Method a;
        private final int b;
        private final efc<T, ebb> c;
        private final String d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.efj
        final /* synthetic */ void a(efl eflVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw efs.a(this.a, this.b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw efs.a(this.a, this.b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    Method method = this.a;
                    int i = this.b;
                    throw efs.a(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                eflVar.a(ear.a("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.d), (ebb) this.c.a(value));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public h(Method method, int i, efc<T, ebb> efcVar, String str) {
            this.a = method;
            this.b = i;
            this.c = efcVar;
            this.d = str;
        }
    }

    /* renamed from: efj$a */
    /* loaded from: classes2.dex */
    static final class a<T> extends efj<T> {
        private final Method a;
        private final int b;
        private final efc<T, ebb> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Method method, int i, efc<T, ebb> efcVar) {
            this.a = method;
            this.b = i;
            this.c = efcVar;
        }

        @Override // defpackage.efj
        final void a(efl eflVar, T t) {
            if (t == null) {
                throw efs.a(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                eflVar.f = this.c.a(t);
            } catch (IOException e) {
                Method method = this.a;
                int i = this.b;
                throw efs.a(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    /* renamed from: efj$o */
    /* loaded from: classes2.dex */
    static final class o<T> extends efj<T> {
        final Class<T> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public o(Class<T> cls) {
            this.a = cls;
        }

        @Override // defpackage.efj
        final void a(efl eflVar, T t) {
            eflVar.c.a((Class<? super Class<T>>) this.a, (Class<T>) t);
        }
    }
}
