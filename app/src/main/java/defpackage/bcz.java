package defpackage;

import com.google.android.gms.internal.places.zzaj;
import java.io.IOException;

/* renamed from: bcz  reason: default package */
/* loaded from: classes2.dex */
public final class bcz<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void a(zzaj zzajVar, bcy<K, V> bcyVar, K k, V v) throws IOException {
        bbu.a(zzajVar, bcyVar.a, 1, k);
        bbu.a(zzajVar, bcyVar.c, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int a(bcy<K, V> bcyVar, K k, V v) {
        return bbu.a(bcyVar.a, 1, k) + bbu.a(bcyVar.c, 2, v);
    }
}
