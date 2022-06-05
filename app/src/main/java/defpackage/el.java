package defpackage;

import android.graphics.Bitmap;

/* renamed from: el  reason: default package */
/* loaded from: classes2.dex */
final class el implements eu {
    private final b a = new b();
    private final eq<a, Bitmap> b = new eq<>();

    @Override // defpackage.eu
    public final void a(Bitmap bitmap) {
        this.b.a(this.a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // defpackage.eu
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.b.a((eq<a, Bitmap>) this.a.a(i, i2, config));
    }

    @Override // defpackage.eu
    public final Bitmap a() {
        return this.b.a();
    }

    @Override // defpackage.eu
    public final String b(int i, int i2, Bitmap.Config config) {
        return c(i, i2, config);
    }

    @Override // defpackage.eu
    public final int c(Bitmap bitmap) {
        return lg.a(bitmap);
    }

    public final String toString() {
        return "AttributeStrategy:\n  " + this.b;
    }

    static String c(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: el$b */
    /* loaded from: classes2.dex */
    static class b extends em<a> {
        b() {
        }

        final a a(int i, int i2, Bitmap.Config config) {
            a b = b();
            b.a(i, i2, config);
            return b;
        }

        @Override // defpackage.em
        protected final /* synthetic */ a a() {
            return new a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: el$a */
    /* loaded from: classes2.dex */
    public static class a implements ev {
        private final b a;
        private int b;
        private int c;
        private Bitmap.Config d;

        public a(b bVar) {
            this.a = bVar;
        }

        public final void a(int i, int i2, Bitmap.Config config) {
            this.b = i;
            this.c = i2;
            this.d = config;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.b * 31) + this.c) * 31;
            Bitmap.Config config = this.d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return el.c(this.b, this.c, this.d);
        }

        @Override // defpackage.ev
        public final void a() {
            this.a.a(this);
        }
    }

    @Override // defpackage.eu
    public final String b(Bitmap bitmap) {
        return c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }
}
