package defpackage;

import android.content.SharedPreferences;

/* renamed from: bps  reason: default package */
/* loaded from: classes2.dex */
public final class bps {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private final /* synthetic */ bpq e;

    public bps(bpq bpqVar, String str, boolean z) {
        this.e = bpqVar;
        aat.a(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        SharedPreferences f;
        if (!this.c) {
            this.c = true;
            f = this.e.f();
            this.d = f.getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void a(boolean z) {
        SharedPreferences f;
        f = this.e.f();
        SharedPreferences.Editor edit = f.edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
