package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: afl  reason: default package */
/* loaded from: classes.dex */
public class afl {
    private static final afl d = new afl(true, null, null);
    final boolean a;
    final String b;
    final Throwable c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public afl(boolean z, String str, Throwable th) {
        this.a = z;
        this.b = str;
        this.c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afl a(String str) {
        return new afl(false, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afl a(String str, Throwable th) {
        return new afl(false, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afl b() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.b;
    }
}
