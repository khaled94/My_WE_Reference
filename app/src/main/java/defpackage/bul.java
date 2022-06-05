package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bul  reason: default package */
/* loaded from: classes2.dex */
public final class bul implements bpn {
    private final /* synthetic */ String a;
    private final /* synthetic */ buj b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bul(buj bujVar, String str) {
        this.b = bujVar;
        this.a = str;
    }

    @Override // defpackage.bpn
    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.a(i, th, bArr);
    }
}
