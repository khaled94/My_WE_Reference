package defpackage;

import java.util.ArrayList;

/* renamed from: acp  reason: default package */
/* loaded from: classes.dex */
public abstract class acp<TListener> {
    private TListener a;
    private boolean b = false;
    final /* synthetic */ aad d;

    public acp(aad aadVar, TListener tlistener) {
        this.d = aadVar;
        this.a = tlistener;
    }

    protected abstract void a();

    public final void c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.a;
            if (this.b) {
                String obj = toString();
                StringBuilder sb = new StringBuilder(obj.length() + 47);
                sb.append("Callback proxy ");
                sb.append(obj);
                sb.append(" being reused. This is not safe.");
            }
        }
        if (tlistener != null) {
            try {
                a();
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.d.w;
        synchronized (arrayList) {
            arrayList2 = this.d.w;
            arrayList2.remove(this);
        }
    }
}
