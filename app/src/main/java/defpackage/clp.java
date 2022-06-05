package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* renamed from: clp  reason: default package */
/* loaded from: classes2.dex */
public final class clp implements Runnable {
    private final /* synthetic */ cox a;
    private final /* synthetic */ FirebaseAuth b;

    public clp(FirebaseAuth firebaseAuth, cox coxVar) {
        this.b = firebaseAuth;
        this.a = coxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        list = this.b.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        list2 = this.b.d;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }
}
