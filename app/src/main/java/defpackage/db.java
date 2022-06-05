package defpackage;

import defpackage.cv;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: db  reason: default package */
/* loaded from: classes2.dex */
public final class db implements cv<InputStream> {
    public final hk a;

    public db(InputStream inputStream, ek ekVar) {
        hk hkVar = new hk(inputStream, ekVar);
        this.a = hkVar;
        hkVar.mark(5242880);
    }

    /* renamed from: c */
    public final InputStream a() throws IOException {
        this.a.reset();
        return this.a;
    }

    @Override // defpackage.cv
    public final void b() {
        this.a.b();
    }

    /* renamed from: db$a */
    /* loaded from: classes2.dex */
    public static final class a implements cv.a<InputStream> {
        private final ek a;

        @Override // defpackage.cv.a
        public final /* synthetic */ cv<InputStream> a(InputStream inputStream) {
            return new db(inputStream, this.a);
        }

        public a(ek ekVar) {
            this.a = ekVar;
        }

        @Override // defpackage.cv.a
        public final Class<InputStream> a() {
            return InputStream.class;
        }
    }
}
