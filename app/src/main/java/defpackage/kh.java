package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: kh  reason: default package */
/* loaded from: classes2.dex */
public abstract class kh<T> implements km<T> {
    private final int a;
    private final int b;
    private jy c;

    @Override // defpackage.jd
    public final void a() {
    }

    @Override // defpackage.jd
    public final void b() {
    }

    @Override // defpackage.km
    public final void b(Drawable drawable) {
    }

    @Override // defpackage.km
    public final void b(kl klVar) {
    }

    @Override // defpackage.jd
    public final void c() {
    }

    @Override // defpackage.km
    public final void c(Drawable drawable) {
    }

    public kh() {
        this((byte) 0);
    }

    private kh(byte b) {
        if (!lg.a(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    @Override // defpackage.km
    public final void a(kl klVar) {
        klVar.a(this.a, this.b);
    }

    @Override // defpackage.km
    public final void a(jy jyVar) {
        this.c = jyVar;
    }

    @Override // defpackage.km
    public final jy d() {
        return this.c;
    }
}
