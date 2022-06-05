package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import defpackage.lz;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 #2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001#B\u001b\b\u0016\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\bB\u0015\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0002\u0010\fB%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\u000fB\u001f\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\u0010B\u0017\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0002\u0010\u0011J)\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\"\u00020\u0002H\u0017¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014J\b\u0010 \u001a\u00020\u001eH\u0017J\b\u0010!\u001a\u00020\"H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\u000e\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/facebook/GraphRequestAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/facebook/GraphResponse;", "requests", "", "Lcom/facebook/GraphRequest;", "([Lcom/facebook/GraphRequest;)V", "", "(Ljava/util/Collection;)V", "Lcom/facebook/GraphRequestBatch;", "(Lcom/facebook/GraphRequestBatch;)V", "connection", "Ljava/net/HttpURLConnection;", "(Ljava/net/HttpURLConnection;[Lcom/facebook/GraphRequest;)V", "(Ljava/net/HttpURLConnection;Ljava/util/Collection;)V", "(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V", "<set-?>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "getException", "()Ljava/lang/Exception;", "getRequests", "()Lcom/facebook/GraphRequestBatch;", "doInBackground", "params", "([Ljava/lang/Void;)Ljava/util/List;", "onPostExecute", "", "result", "onPreExecute", "toString", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ma  reason: default package */
/* loaded from: classes2.dex */
public class ma extends AsyncTask<Void, Void, List<? extends mc>> {
    public static final a a = new a((byte) 0);
    private static final String e = ma.class.getCanonicalName();
    private Exception b;
    private final HttpURLConnection c;
    private final mb d;

    @Override // android.os.AsyncTask
    public /* synthetic */ List<? extends mc> doInBackground(Void[] voidArr) {
        if (qx.a(this)) {
            return null;
        }
        try {
            return a(voidArr);
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(List<? extends mc> list) {
        if (qx.a(this)) {
            return;
        }
        try {
            List<? extends mc> list2 = list;
            if (qx.a(this)) {
                return;
            }
            dqc.d(list2, "result");
            super.onPostExecute(list2);
            Exception exc = this.b;
            if (exc == null) {
                return;
            }
            dqi dqiVar = dqi.a;
            dqc.b(String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), "java.lang.String.format(format, *args)");
            qi.a();
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    private ma(mb mbVar) {
        dqc.d(mbVar, "requests");
        this.c = null;
        this.d = mbVar;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/GraphRequestAsyncTask$Companion;", "", "()V", "TAG", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ma$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ma(mb mbVar, byte b) {
        this(mbVar);
        dqc.d(mbVar, "requests");
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.c + ", requests: " + this.d + "}";
        dqc.b(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        Handler handler;
        if (qx.a(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (ly.c()) {
                dqi dqiVar = dqi.a;
                dqc.b(String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1)), "java.lang.String.format(format, *args)");
                qi.a();
            }
            if (this.d.a != null) {
                return;
            }
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.d.a = handler;
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    private List<mc> a(Void... voidArr) {
        List<mc> list;
        if (qx.a(this)) {
            return null;
        }
        try {
            dqc.d(voidArr, "params");
            try {
                if (this.c == null) {
                    list = lz.k.a(this.d);
                } else {
                    lz.c cVar = lz.k;
                    list = lz.c.a(this.c, this.d);
                }
                return list;
            } catch (Exception e2) {
                this.b = e2;
                return null;
            }
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
