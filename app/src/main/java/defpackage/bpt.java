package defpackage;

import android.content.SharedPreferences;

/* renamed from: bpt  reason: default package */
/* loaded from: classes2.dex */
public final class bpt {
    final String a;
    final String b;
    final long c;
    final /* synthetic */ bpq d;
    private final String e;

    private bpt(bpq bpqVar, String str, long j) {
        this.d = bpqVar;
        aat.a(str);
        aat.a(j > 0);
        this.e = String.valueOf(str).concat(":start");
        this.a = String.valueOf(str).concat(":count");
        this.b = String.valueOf(str).concat(":value");
        this.c = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        SharedPreferences f;
        this.d.c();
        long a = this.d.l().a();
        f = this.d.f();
        SharedPreferences.Editor edit = f.edit();
        edit.remove(this.a);
        edit.remove(this.b);
        edit.putLong(this.e, a);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b() {
        SharedPreferences f;
        f = this.d.f();
        return f.getLong(this.e, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bpt(bpq bpqVar, String str, long j, byte b) {
        this(bpqVar, str, j);
    }
}
