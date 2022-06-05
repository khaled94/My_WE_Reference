package defpackage;

import defpackage.efc;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: eex  reason: default package */
/* loaded from: classes2.dex */
public final class eex extends efc.a {
    private boolean a = true;

    @Override // defpackage.efc.a
    public final efc<ebd, ?> a(Type type, Annotation[] annotationArr, efo efoVar) {
        if (type == ebd.class) {
            if (efs.a(annotationArr, egs.class)) {
                return c.a;
            }
            return a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
            if (!this.a || type != dmg.class) {
                return null;
            }
            try {
                return e.a;
            } catch (NoClassDefFoundError unused) {
                this.a = false;
                return null;
            }
        }
    }

    @Override // defpackage.efc.a
    public final efc<?, ebb> a(Type type) {
        if (ebb.class.isAssignableFrom(efs.a(type))) {
            return b.a;
        }
        return null;
    }

    /* renamed from: eex$f */
    /* loaded from: classes2.dex */
    static final class f implements efc<ebd, Void> {
        static final f a = new f();

        f() {
        }

        @Override // defpackage.efc
        public final /* synthetic */ Void a(ebd ebdVar) throws IOException {
            ebdVar.close();
            return null;
        }
    }

    /* renamed from: eex$e */
    /* loaded from: classes2.dex */
    static final class e implements efc<ebd, dmg> {
        static final e a = new e();

        e() {
        }

        @Override // defpackage.efc
        public final /* synthetic */ dmg a(ebd ebdVar) throws IOException {
            ebdVar.close();
            return dmg.a;
        }
    }

    /* renamed from: eex$b */
    /* loaded from: classes2.dex */
    static final class b implements efc<ebb, ebb> {
        static final b a = new b();

        b() {
        }

        @Override // defpackage.efc
        public final /* bridge */ /* synthetic */ ebb a(ebb ebbVar) throws IOException {
            return ebbVar;
        }
    }

    /* renamed from: eex$c */
    /* loaded from: classes2.dex */
    static final class c implements efc<ebd, ebd> {
        static final c a = new c();

        c() {
        }

        @Override // defpackage.efc
        public final /* bridge */ /* synthetic */ ebd a(ebd ebdVar) throws IOException {
            return ebdVar;
        }
    }

    /* renamed from: eex$a */
    /* loaded from: classes2.dex */
    static final class a implements efc<ebd, ebd> {
        static final a a = new a();

        a() {
        }

        @Override // defpackage.efc
        public final /* bridge */ /* synthetic */ ebd a(ebd ebdVar) throws IOException {
            return a2(ebdVar);
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        private static ebd a2(ebd ebdVar) throws IOException {
            try {
                return efs.a(ebdVar);
            } finally {
                ebdVar.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eex$d */
    /* loaded from: classes2.dex */
    public static final class d implements efc<Object, String> {
        static final d a = new d();

        d() {
        }

        @Override // defpackage.efc
        public final /* synthetic */ String a(Object obj) throws IOException {
            return obj.toString();
        }
    }
}
