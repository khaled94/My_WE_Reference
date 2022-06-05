package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.ead;
import defpackage.efg;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: efe  reason: default package */
/* loaded from: classes2.dex */
public abstract class efe<ResponseT, ReturnT> extends efp<ReturnT> {
    private final efm a;
    private final ead.a b;
    private final efc<ebd, ResponseT> c;

    protected abstract ReturnT a(eey<ResponseT> eeyVar, Object[] objArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <ResponseT> efc<ebd, ResponseT> a(efo efoVar, Method method, Type type) {
        try {
            return efoVar.a(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw efs.a(method, e, "Unable to create converter for %s", type);
        }
    }

    efe(efm efmVar, ead.a aVar, efc<ebd, ResponseT> efcVar) {
        this.a = efmVar;
        this.b = aVar;
        this.c = efcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.efp
    public final ReturnT a(Object[] objArr) {
        return a(new efh(this.a, objArr, this.b, this.c), objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: efe$a */
    /* loaded from: classes2.dex */
    public static final class a<ResponseT, ReturnT> extends efe<ResponseT, ReturnT> {
        private final eez<ResponseT, ReturnT> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(efm efmVar, ead.a aVar, efc<ebd, ResponseT> efcVar, eez<ResponseT, ReturnT> eezVar) {
            super(efmVar, aVar, efcVar);
            this.a = eezVar;
        }

        @Override // defpackage.efe
        protected final ReturnT a(eey<ResponseT> eeyVar, Object[] objArr) {
            return this.a.a(eeyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: efe$c */
    /* loaded from: classes2.dex */
    public static final class c<ResponseT> extends efe<ResponseT, Object> {
        private final eez<ResponseT, eey<ResponseT>> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(efm efmVar, ead.a aVar, efc<ebd, ResponseT> efcVar, eez<ResponseT, eey<ResponseT>> eezVar) {
            super(efmVar, aVar, efcVar);
            this.a = eezVar;
        }

        @Override // defpackage.efe
        protected final Object a(eey<ResponseT> eeyVar, Object[] objArr) {
            eey<ResponseT> a = this.a.a(eeyVar);
            dnu dnuVar = (dnu) objArr[objArr.length - 1];
            try {
                dtg dtgVar = new dtg(dnz.a(dnuVar), 1);
                dtg dtgVar2 = dtgVar;
                dtgVar2.a((dow<? super Throwable, dmg>) new efg.e(a));
                a.a(new efg.f(dtgVar2));
                Object e = dtgVar.e();
                if (e == dny.COROUTINE_SUSPENDED) {
                    dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
                }
                return e;
            } catch (Exception e2) {
                return efg.a(e2, dnuVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: efe$b */
    /* loaded from: classes2.dex */
    public static final class b<ResponseT> extends efe<ResponseT, Object> {
        private final eez<ResponseT, eey<ResponseT>> a;
        private final boolean b = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(efm efmVar, ead.a aVar, efc<ebd, ResponseT> efcVar, eez<ResponseT, eey<ResponseT>> eezVar) {
            super(efmVar, aVar, efcVar);
            this.a = eezVar;
        }

        @Override // defpackage.efe
        protected final Object a(eey<ResponseT> eeyVar, Object[] objArr) {
            eey<ResponseT> a = this.a.a(eeyVar);
            dnu dnuVar = (dnu) objArr[objArr.length - 1];
            try {
                if (this.b) {
                    dtg dtgVar = new dtg(dnz.a(dnuVar), 1);
                    dtg dtgVar2 = dtgVar;
                    dtgVar2.a((dow<? super Throwable, dmg>) new efg.b(a));
                    a.a(new efg.d(dtgVar2));
                    Object e = dtgVar.e();
                    if (e == dny.COROUTINE_SUSPENDED) {
                        dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
                    }
                    return e;
                }
                dtg dtgVar3 = new dtg(dnz.a(dnuVar), 1);
                dtg dtgVar4 = dtgVar3;
                dtgVar4.a((dow<? super Throwable, dmg>) new efg.a(a));
                a.a(new efg.c(dtgVar4));
                Object e2 = dtgVar3.e();
                if (e2 == dny.COROUTINE_SUSPENDED) {
                    dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
                }
                return e2;
            } catch (Exception e3) {
                return efg.a(e3, dnuVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <ResponseT, ReturnT> eez<ResponseT, ReturnT> a(efo efoVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            Objects.requireNonNull(type, "returnType == null");
            Objects.requireNonNull(annotationArr, "annotations == null");
            int indexOf = efoVar.d.indexOf(null) + 1;
            int size = efoVar.d.size();
            for (int i = indexOf; i < size; i++) {
                eez<ResponseT, ReturnT> eezVar = (eez<ResponseT, ReturnT>) efoVar.d.get(i).a(type, annotationArr);
                if (eezVar != null) {
                    return eezVar;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
            sb.append(type);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = efoVar.d.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(efoVar.d.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } catch (RuntimeException e) {
            throw efs.a(method, e, "Unable to create call adapter for %s", type);
        }
    }
}
