package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001+B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0019J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0004J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u001bH$J\b\u0010(\u001a\u00020\u0019H\u0002J\u0010\u0010)\u001a\u00020\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010*\u001a\u00020\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/facebook/internal/PlatformServiceClient;", "Landroid/content/ServiceConnection;", "context", "Landroid/content/Context;", "requestMessage", "", "replyMessage", "protocolVersion", "applicationId", "", "nonce", "(Landroid/content/Context;IIILjava/lang/String;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "handler", "Landroid/os/Handler;", "listener", "Lcom/facebook/internal/PlatformServiceClient$CompletedListener;", "getNonce", "()Ljava/lang/String;", "running", "", "sender", "Landroid/os/Messenger;", "callback", "", "result", "Landroid/os/Bundle;", "cancel", "handleMessage", "message", "Landroid/os/Message;", "onServiceConnected", "name", "Landroid/content/ComponentName;", NotificationCompat.CATEGORY_SERVICE, "Landroid/os/IBinder;", "onServiceDisconnected", "populateRequestBundle", "data", "sendMessage", "setCompletedListener", "start", "CompletedListener", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qe  reason: default package */
/* loaded from: classes2.dex */
public abstract class qe implements ServiceConnection {
    final Context a;
    public a b;
    public boolean c;
    final int d;
    private final Handler e;
    private Messenger f;
    private final int g;
    private final String h;
    private final int i;
    private final String j;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/PlatformServiceClient$CompletedListener;", "", "completed", "", "result", "Landroid/os/Bundle;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: qe$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Bundle bundle);
    }

    protected abstract void a(Bundle bundle);

    public qe(Context context, String str, String str2) {
        dqc.d(context, "context");
        dqc.d(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.g = 65536;
        this.d = 65537;
        this.h = str;
        this.i = 20121101;
        this.j = str2;
        this.e = new Handler() { // from class: qe.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (qx.a(this)) {
                    return;
                }
                try {
                    dqc.d(message, "message");
                    qe qeVar = qe.this;
                    dqc.d(message, "message");
                    if (message.what != qeVar.d) {
                        return;
                    }
                    Bundle data = message.getData();
                    if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                        qeVar.b(null);
                    } else {
                        qeVar.b(data);
                    }
                    try {
                        qeVar.a.unbindService(qeVar);
                    } catch (IllegalArgumentException unused) {
                    }
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        };
    }

    public final boolean a() {
        synchronized (this) {
            boolean z = false;
            if (this.c) {
                return false;
            }
            if (qd.a(this.i) == -1) {
                return false;
            }
            Intent a2 = qd.a(this.a);
            if (a2 != null) {
                this.c = true;
                this.a.bindService(a2, this, 1);
                z = true;
            }
            return z;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dqc.d(componentName, "name");
        dqc.d(iBinder, NotificationCompat.CATEGORY_SERVICE);
        this.f = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        String str = this.j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        a(bundle);
        Message obtain = Message.obtain((Handler) null, this.g);
        obtain.arg1 = this.i;
        dqc.b(obtain, "request");
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.e);
        try {
            Messenger messenger = this.f;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            b(null);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        dqc.d(componentName, "name");
        this.f = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        b(null);
    }

    final void b(Bundle bundle) {
        if (!this.c) {
            return;
        }
        this.c = false;
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(bundle);
    }
}
