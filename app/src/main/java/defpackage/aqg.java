package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aqg  reason: default package */
/* loaded from: classes.dex */
public final class aqg extends ContentObserver {
    private final /* synthetic */ aqe a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqg(aqe aqeVar) {
        super(null);
        this.a = aqeVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        aqe aqeVar = this.a;
        synchronized (aqeVar.b) {
            aqeVar.c = null;
            aqp.a();
        }
        synchronized (aqeVar) {
            Iterator<Object> it = aqeVar.d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
