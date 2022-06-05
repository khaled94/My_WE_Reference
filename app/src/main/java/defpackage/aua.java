package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import java.io.IOException;

/* renamed from: aua  reason: default package */
/* loaded from: classes.dex */
public final class aua<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void a(zzee zzeeVar, aty<K, V> atyVar, K k, V v) throws IOException {
        asq.a(zzeeVar, atyVar.a, 1, k);
        asq.a(zzeeVar, atyVar.c, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int a(aty<K, V> atyVar, K k, V v) {
        return asq.a(atyVar.a, 1, k) + asq.a(atyVar.c, 2, v);
    }
}
