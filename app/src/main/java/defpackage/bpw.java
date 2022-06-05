package defpackage;

import android.content.SharedPreferences;

/* renamed from: bpw  reason: default package */
/* loaded from: classes2.dex */
public final class bpw {
    private final String a;
    private final String b = null;
    private boolean c;
    private String d;
    private final /* synthetic */ bpq e;

    public bpw(bpq bpqVar, String str) {
        this.e = bpqVar;
        aat.a(str);
        this.a = str;
    }

    public final String a() {
        SharedPreferences f;
        if (!this.c) {
            this.c = true;
            f = this.e.f();
            this.d = f.getString(this.a, null);
        }
        return this.d;
    }

    public final void a(String str) {
        SharedPreferences f;
        if (buv.d(str, this.d)) {
            return;
        }
        f = this.e.f();
        SharedPreferences.Editor edit = f.edit();
        edit.putString(this.a, str);
        edit.apply();
        this.d = str;
    }
}
