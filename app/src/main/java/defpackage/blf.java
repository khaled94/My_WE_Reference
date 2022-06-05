package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: blf  reason: default package */
/* loaded from: classes2.dex */
public final class blf {
    final String a;
    final String b;
    final long c;
    final long d;
    final blh e;
    private final String f;

    private blf(bql bqlVar, String str, String str2, String str3, long j, long j2, blh blhVar) {
        aat.a(str2);
        aat.a(str3);
        aat.a(blhVar);
        this.a = str2;
        this.b = str3;
        this.f = TextUtils.isEmpty(str) ? null : str;
        this.c = j;
        this.d = j2;
        if (j2 != 0 && j2 > j) {
            bqlVar.q().f.a("Event created with reverse previous/current timestamps. appId, name", bpi.a(str2), bpi.a(str3));
        }
        this.e = blhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public blf(bql bqlVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        blh blhVar;
        aat.a(str2);
        aat.a(str3);
        this.a = str2;
        this.b = str3;
        this.f = TextUtils.isEmpty(str) ? null : str;
        this.c = j;
        this.d = j2;
        if (j2 != 0 && j2 > j) {
            bqlVar.q().f.a("Event created with reverse previous/current timestamps. appId", bpi.a(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    bqlVar.q().c.a("Param name can't be null");
                    it.remove();
                } else {
                    bqlVar.e();
                    Object a = buv.a(next, bundle2.get(next));
                    if (a == null) {
                        bqlVar.q().f.a("Param value can't be null", bqlVar.f().b(next));
                        it.remove();
                    } else {
                        bqlVar.e().a(bundle2, next, a);
                    }
                }
            }
            blhVar = new blh(bundle2);
        } else {
            blhVar = new blh(new Bundle());
        }
        this.e = blhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final blf a(bql bqlVar, long j) {
        return new blf(bqlVar, this.f, this.a, this.b, this.c, j, this.e);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
