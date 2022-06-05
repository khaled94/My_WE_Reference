package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

/* renamed from: bpi  reason: default package */
/* loaded from: classes2.dex */
public final class bpi extends brh {
    char a = 0;
    long b = -1;
    public final bpk c = new bpk(this, 6, false, false);
    final bpk d = new bpk(this, 6, true, false);
    final bpk e = new bpk(this, 6, false, true);
    public final bpk f = new bpk(this, 5, false, false);
    final bpk g = new bpk(this, 5, true, false);
    final bpk h = new bpk(this, 5, false, true);
    final bpk i = new bpk(this, 4, false, false);
    final bpk j = new bpk(this, 3, false, false);
    public final bpk k = new bpk(this, 2, false, false);
    private String l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpi(bql bqlVar) {
        super(bqlVar);
    }

    @Override // defpackage.brh
    protected final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new bpj(str);
    }

    public final void a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && a(i)) {
            a(i, a(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        aat.a(str);
        bqe bqeVar = this.w.g;
        if (bqeVar == null) {
            a(6, "Scheduler not set. Not logging error/warn");
        } else if (!bqeVar.v()) {
            a(6, "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i < 0) {
                i = 0;
            }
            bqeVar.a(new bph(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(int i) {
        return Log.isLoggable(f(), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, String str) {
        Log.println(i, f(), str);
    }

    private final String f() {
        String str;
        synchronized (this) {
            if (this.l == null) {
                if (this.w.c != null) {
                    this.l = this.w.c;
                } else {
                    this.l = bvf.d();
                }
            }
            str = this.l;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = a(z, obj);
        String a2 = a(z, obj2);
        String a3 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    private static String a(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = b(bql.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && b(className).equals(b)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof bpj) {
                return ((bpj) obj).a;
            } else {
                return z ? "-" : String.valueOf(obj);
            }
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final String n_() {
        long j;
        Pair<String, Long> pair;
        bpt bptVar = r().c;
        bptVar.d.c();
        bptVar.d.c();
        long b = bptVar.b();
        if (b == 0) {
            bptVar.a();
            j = 0;
        } else {
            j = Math.abs(b - bptVar.d.l().a());
        }
        if (j >= bptVar.c) {
            if (j > (bptVar.c << 1)) {
                bptVar.a();
            } else {
                String string = bpq.a(bptVar.d).getString(bptVar.b, null);
                long j2 = bpq.a(bptVar.d).getLong(bptVar.a, 0L);
                bptVar.a();
                if (string == null || j2 <= 0) {
                    pair = bpq.a;
                } else {
                    pair = new Pair<>(string, Long.valueOf(j2));
                }
                if (pair != null || pair == bpq.a) {
                    return null;
                }
                String valueOf = String.valueOf(pair.second);
                String str = (String) pair.first;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str);
                return sb.toString();
            }
        }
        pair = null;
        if (pair != null) {
        }
        return null;
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ blc k() {
        return super.k();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ ady l() {
        return super.l();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpg n() {
        return super.n();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ buv o() {
        return super.o();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bqe p() {
        return super.p();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bpi q() {
        return super.q();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpq r() {
        return super.r();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bvf s() {
        return super.s();
    }
}
