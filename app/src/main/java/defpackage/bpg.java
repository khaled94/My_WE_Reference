package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bpg  reason: default package */
/* loaded from: classes2.dex */
public final class bpg extends brh {
    private static final AtomicReference<String[]> a = new AtomicReference<>();
    private static final AtomicReference<String[]> b = new AtomicReference<>();
    private static final AtomicReference<String[]> c = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpg(bql bqlVar) {
        super(bqlVar);
    }

    @Override // defpackage.brh
    protected final boolean d() {
        return false;
    }

    private final boolean f() {
        return TextUtils.isEmpty(this.w.a) && this.w.q().a(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !f() ? str : a(str, brm.b, brm.a, a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !f() ? str : a(str, brl.b, brl.a, b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!f()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return a(str, bro.b, bro.a, c);
    }

    private static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        aat.a(strArr);
        aat.a(strArr2);
        aat.a(atomicReference);
        aat.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (buv.d(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(bli bliVar) {
        if (bliVar == null) {
            return null;
        }
        if (!f()) {
            return bliVar.toString();
        }
        return "origin=" + bliVar.c + ",name=" + a(bliVar.a) + ",params=" + a(bliVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(blf blfVar) {
        if (blfVar == null) {
            return null;
        }
        if (!f()) {
            return blfVar.toString();
        }
        return "Event{appId='" + blfVar.a + "', name='" + a(blfVar.b) + "', params=" + a(blfVar.e) + "}";
    }

    private final String a(blh blhVar) {
        if (blhVar == null) {
            return null;
        }
        if (!f()) {
            return blhVar.toString();
        }
        return a(blhVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!f()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
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
