package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: afn  reason: default package */
/* loaded from: classes.dex */
public interface afn extends IInterface {

    /* renamed from: afn$a */
    /* loaded from: classes.dex */
    public static abstract class a extends aiv implements afn {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static afn a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof afn ? (afn) queryLocalInterface : new afz(iBinder);
        }
    }
}
