package defpackage;

import android.os.Message;
import com.google.android.gms.common.api.Status;

/* renamed from: yq  reason: default package */
/* loaded from: classes2.dex */
final class yq extends ait {
    final /* synthetic */ ys a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String valueOf = String.valueOf(runtimeException.getMessage());
                if (valueOf.length() != 0) {
                    "Runtime exception on the transformation worker thread: ".concat(valueOf);
                } else {
                    new String("Runtime exception on the transformation worker thread: ");
                }
                throw runtimeException;
            }
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(70);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i2);
            return;
        }
        vg<R> vgVar = (vg) message.obj;
        synchronized (this.a.e) {
            ys ysVar = (ys) aat.a(this.a.b);
            if (vgVar != 0) {
                if (vgVar instanceof yj) {
                    ysVar.a(((yj) vgVar).a);
                } else {
                    synchronized (ysVar.e) {
                        ysVar.d = vgVar;
                        if (ysVar.a != null || ysVar.c != null) {
                            vf vfVar = ysVar.g.get();
                            if (!ysVar.i && ysVar.a != null && vfVar != null) {
                                vfVar.a(ysVar);
                                ysVar.i = true;
                            }
                            Status status = ysVar.f;
                            if (status != null) {
                                ysVar.b(status);
                            } else {
                                vg<R> vgVar2 = ysVar.d;
                                if (vgVar2 != 0) {
                                    vgVar2.a(ysVar);
                                }
                            }
                        }
                    }
                }
            } else {
                ysVar.a(new Status(13, "Transform returned null"));
            }
        }
    }
}
