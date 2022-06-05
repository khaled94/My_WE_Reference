package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import defpackage.wf;

/* renamed from: ahr  reason: default package */
/* loaded from: classes.dex */
public final class ahr extends tg {
    public ahr(Activity activity) {
        super(activity);
    }

    @Override // defpackage.tg
    public final bwl<Void> a() {
        wf.a a = wf.a();
        a.a = new wb() { // from class: ahz
            public final /* synthetic */ String b = null;

            @Override // defpackage.wb
            public final void a(Object obj, Object obj2) {
                String str = this.b;
                ahv ahvVar = (ahv) ((ahy) obj).q();
                ahq ahqVar = new ahq((bwm) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(ahvVar.b);
                obtain.writeString(str);
                ahu.a(obtain, ahqVar);
                Parcel obtain2 = Parcel.obtain();
                try {
                    ahvVar.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            }
        };
        a.c = new uw[]{ahs.d};
        a.d = 1568;
        return c(a.a());
    }

    public ahr(Context context) {
        super(context);
    }
}
