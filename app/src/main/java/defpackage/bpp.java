package defpackage;

import java.net.URL;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bpp  reason: default package */
/* loaded from: classes2.dex */
public final class bpp implements Runnable {
    private final URL a;
    private final byte[] b;
    private final bpn c;
    private final String d;
    private final Map<String, String> e;
    private final /* synthetic */ bpl f;

    public bpp(bpl bplVar, String str, URL url, byte[] bArr, Map<String, String> map, bpn bpnVar) {
        this.f = bplVar;
        aat.a(str);
        aat.a(url);
        aat.a(bpnVar);
        this.a = url;
        this.b = bArr;
        this.c = bpnVar;
        this.d = str;
        this.e = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpp.run():void");
    }
}
