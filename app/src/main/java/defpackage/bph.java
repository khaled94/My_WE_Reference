package defpackage;

import android.content.SharedPreferences;
import androidx.core.location.LocationRequestCompat;
import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bph  reason: default package */
/* loaded from: classes2.dex */
public final class bph implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ Object d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ bpi f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bph(bpi bpiVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = bpiVar;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences f;
        SharedPreferences f2;
        SharedPreferences f3;
        bpq b = this.f.w.b();
        if (!b.v()) {
            this.f.a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f.a == 0) {
            if (this.f.s().e()) {
                this.f.a = 'C';
            } else {
                this.f.a = 'c';
            }
        }
        if (this.f.b < 0) {
            this.f.b = 16250L;
        }
        char charAt = "01VDIWEA?".charAt(this.a);
        char c = this.f.a;
        long j = this.f.b;
        boolean z = true;
        String a = bpi.a(true, this.b, this.c, this.d, this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 24);
        sb.append(ExifInterface.GPS_MEASUREMENT_2D);
        sb.append(charAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(a);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.b.substring(0, 1024);
        }
        bpt bptVar = b.c;
        bptVar.d.c();
        if (bptVar.b() == 0) {
            bptVar.a();
        }
        if (sb2 == null) {
            sb2 = "";
        }
        f = bptVar.d.f();
        long j2 = f.getLong(bptVar.a, 0L);
        if (j2 <= 0) {
            f3 = bptVar.d.f();
            SharedPreferences.Editor edit = f3.edit();
            edit.putString(bptVar.b, sb2);
            edit.putLong(bptVar.a, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        if ((bptVar.d.o().g().nextLong() & LocationRequestCompat.PASSIVE_INTERVAL) >= LocationRequestCompat.PASSIVE_INTERVAL / j3) {
            z = false;
        }
        f2 = bptVar.d.f();
        SharedPreferences.Editor edit2 = f2.edit();
        if (z) {
            edit2.putString(bptVar.b, sb2);
        }
        edit2.putLong(bptVar.a, j3);
        edit2.apply();
    }
}
