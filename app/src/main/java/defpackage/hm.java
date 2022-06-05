package defpackage;

import android.graphics.Bitmap;
import defpackage.ha;
import defpackage.hg;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: hm  reason: default package */
/* loaded from: classes2.dex */
public final class hm implements co<InputStream, Bitmap> {
    private final ha a;
    private final ek b;

    @Override // defpackage.co
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, cm cmVar) throws IOException {
        return true;
    }

    public hm(ha haVar, ek ekVar) {
        this.a = haVar;
        this.b = ekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ee<Bitmap> a(InputStream inputStream, int i, int i2, cm cmVar) throws IOException {
        hk hkVar;
        boolean z;
        if (inputStream instanceof hk) {
            hkVar = (hk) inputStream;
            z = false;
        } else {
            hkVar = new hk(inputStream, this.b);
            z = true;
        }
        ky a2 = ky.a(hkVar);
        ld ldVar = new ld(a2);
        a aVar = new a(hkVar, a2);
        try {
            ha haVar = this.a;
            return haVar.a(new hg.b(ldVar, haVar.h, haVar.g), i, i2, cmVar, aVar);
        } finally {
            a2.a();
            if (z) {
                hkVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hm$a */
    /* loaded from: classes2.dex */
    public static class a implements ha.a {
        private final hk a;
        private final ky b;

        a(hk hkVar, ky kyVar) {
            this.a = hkVar;
            this.b = kyVar;
        }

        @Override // defpackage.ha.a
        public final void a() {
            this.a.a();
        }

        @Override // defpackage.ha.a
        public final void a(en enVar, Bitmap bitmap) throws IOException {
            IOException iOException = this.b.a;
            if (iOException != null) {
                if (bitmap != null) {
                    enVar.a(bitmap);
                }
                throw iOException;
            }
        }
    }
}
