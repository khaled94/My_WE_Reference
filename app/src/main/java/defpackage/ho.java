package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: ho  reason: default package */
/* loaded from: classes2.dex */
public final class ho implements co<Bitmap, Bitmap> {
    @Override // defpackage.co
    public final /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, cm cmVar) throws IOException {
        return true;
    }

    @Override // defpackage.co
    public final /* synthetic */ ee<Bitmap> a(Bitmap bitmap, int i, int i2, cm cmVar) throws IOException {
        return new a(bitmap);
    }

    /* renamed from: ho$a */
    /* loaded from: classes2.dex */
    static final class a implements ee<Bitmap> {
        private final Bitmap a;

        @Override // defpackage.ee
        public final void d() {
        }

        a(Bitmap bitmap) {
            this.a = bitmap;
        }

        @Override // defpackage.ee
        public final Class<Bitmap> a() {
            return Bitmap.class;
        }

        @Override // defpackage.ee
        public final int c() {
            return lg.a(this.a);
        }

        @Override // defpackage.ee
        public final /* bridge */ /* synthetic */ Bitmap b() {
            return this.a;
        }
    }
}
