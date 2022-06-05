package defpackage;

import android.database.ContentObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aqb  reason: default package */
/* loaded from: classes.dex */
public final class aqb extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aqb() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = aqc.e;
        atomicBoolean.set(true);
    }
}
