package defpackage;

/* renamed from: ko  reason: default package */
/* loaded from: classes2.dex */
public final class ko<R> implements kp<R> {
    static final ko<?> a = new ko<>();
    private static final kq<?> b = new a();

    /* renamed from: ko$a */
    /* loaded from: classes2.dex */
    public static class a<R> implements kq<R> {
        @Override // defpackage.kq
        public final kp<R> a() {
            return ko.a;
        }
    }

    public static <R> kq<R> a() {
        return (kq<R>) b;
    }
}
