package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: bpm  reason: default package */
/* loaded from: classes2.dex */
final class bpm implements Runnable {
    private final bpn a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map<String, List<String>> f;

    private bpm(String str, bpn bpnVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        aat.a(bpnVar);
        this.a = bpnVar;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bpm(String str, bpn bpnVar, int i, Throwable th, byte[] bArr, Map map, byte b) {
        this(str, bpnVar, i, th, bArr, map);
    }
}
