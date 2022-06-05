package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cmn  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class cmn implements Runnable {
    private final Map.Entry a;
    private final cmq b;

    private cmn(Map.Entry entry, cmq cmqVar) {
        this.a = entry;
        this.b = cmqVar;
    }

    public static Runnable a(Map.Entry entry, cmq cmqVar) {
        return new cmn(entry, cmqVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((cmr) this.a.getKey()).a(this.b);
    }
}
