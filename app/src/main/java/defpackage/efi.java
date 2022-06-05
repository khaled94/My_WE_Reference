package defpackage;

import defpackage.efc;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: efi  reason: default package */
/* loaded from: classes2.dex */
public final class efi extends efc.a {
    static final efc.a a = new efi();

    efi() {
    }

    /* renamed from: efi$a */
    /* loaded from: classes2.dex */
    static final class a<T> implements efc<ebd, Optional<T>> {
        final efc<ebd, T> a;

        @Override // defpackage.efc
        public final /* synthetic */ Object a(ebd ebdVar) throws IOException {
            return Optional.ofNullable(this.a.a(ebdVar));
        }

        a(efc<ebd, T> efcVar) {
            this.a = efcVar;
        }
    }

    @Override // defpackage.efc.a
    public final efc<ebd, ?> a(Type type, Annotation[] annotationArr, efo efoVar) {
        if (efs.a(type) != Optional.class) {
            return null;
        }
        return new a(efoVar.a(efs.a(0, (ParameterizedType) type), annotationArr));
    }
}
