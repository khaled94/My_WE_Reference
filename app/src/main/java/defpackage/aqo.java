package defpackage;

import android.database.ContentObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aqo  reason: default package */
/* loaded from: classes.dex */
public final class aqo extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aqo() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        aqp.a();
    }
}
