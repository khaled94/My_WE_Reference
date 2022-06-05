package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* renamed from: clo  reason: default package */
/* loaded from: classes2.dex */
public final class clo implements Runnable {
    private final /* synthetic */ FirebaseAuth a;

    public clo(FirebaseAuth firebaseAuth) {
        this.a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        list = this.a.f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
