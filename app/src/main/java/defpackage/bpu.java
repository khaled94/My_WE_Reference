package defpackage;

import android.content.SharedPreferences;

/* renamed from: bpu  reason: default package */
/* loaded from: classes2.dex */
public final class bpu {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ bpq e;

    public bpu(bpq bpqVar, String str, long j) {
        this.e = bpqVar;
        aat.a(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        SharedPreferences f;
        if (!this.c) {
            this.c = true;
            f = this.e.f();
            this.d = f.getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void a(long j) {
        SharedPreferences f;
        f = this.e.f();
        SharedPreferences.Editor edit = f.edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
