package androidx.tracing;

import android.os.Trace;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TraceApi18Impl {
    private TraceApi18Impl() {
    }

    public static void beginSection(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
