package defpackage;

import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: cnn  reason: default package */
/* loaded from: classes2.dex */
public final class cnn {
    private final Executor a;
    private final Map<Pair<String, String>, bwl<cmu>> b = new ArrayMap();

    public cnn(Executor executor) {
        this.a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized bwl<cmu> a(String str, String str2, cnp cnpVar) {
        Pair pair = new Pair(str, str2);
        bwl<cmu> bwlVar = this.b.get(pair);
        if (bwlVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
            }
            return bwlVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
        }
        bwl b = cnpVar.a().b(this.a, new bwf(this, pair) { // from class: cnm
            private final cnn a;
            private final Pair b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = pair;
            }

            @Override // defpackage.bwf
            public final Object a(bwl bwlVar2) {
                return this.a.a(this.b, bwlVar2);
            }
        });
        this.b.put(pair, b);
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ bwl a(Pair pair, bwl bwlVar) throws Exception {
        synchronized (this) {
            this.b.remove(pair);
        }
        return bwlVar;
    }
}
