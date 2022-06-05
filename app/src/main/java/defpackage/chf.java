package defpackage;

import android.os.Bundle;
import androidx.lifecycle.CoroutineLiveDataKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: chf  reason: default package */
/* loaded from: classes2.dex */
public final class chf implements bsk {
    private final /* synthetic */ bbb a;

    public chf(bbb bbbVar) {
        this.a = bbbVar;
    }

    @Override // defpackage.bsk
    public final void a(String str, String str2, Bundle bundle) {
        bbb bbbVar = this.a;
        bbbVar.a(new apb(bbbVar, str, str2, bundle));
    }

    @Override // defpackage.bsk
    public final void a(String str, String str2, Object obj) {
        bbb bbbVar = this.a;
        bbbVar.a(new ape(bbbVar, str, str2, obj));
    }

    @Override // defpackage.bsk
    public final void a(boolean z) {
        bbb bbbVar = this.a;
        bbbVar.a(new apa(bbbVar, z));
    }

    @Override // defpackage.bsk
    public final Map<String, Object> a(String str, String str2, boolean z) {
        bbb bbbVar = this.a;
        aza azaVar = new aza();
        bbbVar.a(new aoy(bbbVar, str, str2, z, azaVar));
        Bundle b = azaVar.b(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        if (b == null || b.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b.size());
        for (String str3 : b.keySet()) {
            Object obj = b.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    @Override // defpackage.bsk
    public final String a() {
        bbb bbbVar = this.a;
        aza azaVar = new aza();
        bbbVar.a(new aow(bbbVar, azaVar));
        return azaVar.a(500L);
    }

    @Override // defpackage.bsk
    public final String b() {
        bbb bbbVar = this.a;
        aza azaVar = new aza();
        bbbVar.a(new aov(bbbVar, azaVar));
        return azaVar.a(500L);
    }

    @Override // defpackage.bsk
    public final String c() {
        bbb bbbVar = this.a;
        aza azaVar = new aza();
        bbbVar.a(new aou(bbbVar, azaVar));
        return azaVar.a(50L);
    }

    @Override // defpackage.bsk
    public final String d() {
        bbb bbbVar = this.a;
        aza azaVar = new aza();
        bbbVar.a(new aos(bbbVar, azaVar));
        return azaVar.a(500L);
    }

    @Override // defpackage.bsk
    public final long e() {
        return this.a.a();
    }

    @Override // defpackage.bsk
    public final void a(String str) {
        bbb bbbVar = this.a;
        bbbVar.a(new aor(bbbVar, str));
    }

    @Override // defpackage.bsk
    public final void b(String str) {
        bbb bbbVar = this.a;
        bbbVar.a(new aoq(bbbVar, str));
    }

    @Override // defpackage.bsk
    public final void a(Bundle bundle) {
        bbb bbbVar = this.a;
        bbbVar.a(new apd(bbbVar, bundle));
    }

    @Override // defpackage.bsk
    public final void b(String str, String str2, Bundle bundle) {
        bbb bbbVar = this.a;
        bbbVar.a(new aoo(bbbVar, str, str2, bundle));
    }

    @Override // defpackage.bsk
    public final List<Bundle> a(String str, String str2) {
        bbb bbbVar = this.a;
        aza azaVar = new aza();
        bbbVar.a(new aon(bbbVar, str, str2, azaVar));
        List<Bundle> list = (List) aza.a(azaVar.b(CoroutineLiveDataKt.DEFAULT_TIMEOUT), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    @Override // defpackage.bsk
    public final int c(String str) {
        bbb bbbVar = this.a;
        aza azaVar = new aza();
        bbbVar.a(new aoz(bbbVar, str, azaVar));
        Integer num = (Integer) aza.a(azaVar.b(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }
}
