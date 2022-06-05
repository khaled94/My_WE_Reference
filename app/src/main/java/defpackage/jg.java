package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import defpackage.bp;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jg  reason: default package */
/* loaded from: classes2.dex */
public final class jg implements Handler.Callback {
    private static final a j = new a() { // from class: jg.1
        @Override // defpackage.jg.a
        public final bv a(bo boVar, jc jcVar, jh jhVar, Context context) {
            return new bv(boVar, jcVar, jhVar, context);
        }
    };
    private volatile bv c;
    private final Handler d;
    private final a e;
    private final jb i;
    final Map<FragmentManager, jf> a = new HashMap();
    final Map<androidx.fragment.app.FragmentManager, jk> b = new HashMap();
    private final ArrayMap<View, Fragment> f = new ArrayMap<>();
    private final ArrayMap<View, android.app.Fragment> g = new ArrayMap<>();
    private final Bundle h = new Bundle();

    /* renamed from: jg$a */
    /* loaded from: classes2.dex */
    public interface a {
        bv a(bo boVar, jc jcVar, jh jhVar, Context context);
    }

    public jg(a aVar, br brVar) {
        jb jbVar;
        this.e = aVar == null ? j : aVar;
        this.d = new Handler(Looper.getMainLooper(), this);
        if (!hf.b || !hf.a) {
            jbVar = new ix();
        } else if (brVar.a(bp.d.class)) {
            jbVar = new iz();
        } else {
            jbVar = new ja();
        }
        this.i = jbVar;
    }

    private bv b(Context context) {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.e.a(bo.a(context.getApplicationContext()), new is(), new iy(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }

    public final bv a(Context context) {
        while (context != null) {
            if (lg.b() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return a((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        context = contextWrapper.getBaseContext();
                    }
                }
            }
            return b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    private bv a(FragmentActivity fragmentActivity) {
        if (lg.c()) {
            return a(fragmentActivity.getApplicationContext());
        }
        b((Activity) fragmentActivity);
        return a(fragmentActivity, fragmentActivity.getSupportFragmentManager(), d(fragmentActivity));
    }

    private bv a(Activity activity) {
        if (lg.c()) {
            return a(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return a((FragmentActivity) activity);
        }
        b(activity);
        return a(activity, activity.getFragmentManager(), d(activity));
    }

    private static Activity c(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    private static void b(Activity activity) {
        if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jf a(FragmentManager fragmentManager) {
        jf jfVar = this.a.get(fragmentManager);
        if (jfVar == null) {
            jf jfVar2 = (jf) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (jfVar2 == null) {
                jfVar2 = new jf();
                jfVar2.d = null;
                this.a.put(fragmentManager, jfVar2);
                fragmentManager.beginTransaction().add(jfVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.d.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return jfVar2;
        }
        return jfVar;
    }

    @Deprecated
    private bv a(Context context, FragmentManager fragmentManager, boolean z) {
        jf a2 = a(fragmentManager);
        bv bvVar = a2.c;
        if (bvVar == null) {
            bvVar = this.e.a(bo.a(context), a2.a, a2.b, context);
            if (z) {
                bvVar.a();
            }
            a2.c = bvVar;
        }
        return bvVar;
    }

    private static boolean d(Context context) {
        Activity c = c(context);
        return c == null || !c.isFinishing();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jk a(androidx.fragment.app.FragmentManager fragmentManager) {
        jk jkVar = this.b.get(fragmentManager);
        if (jkVar == null) {
            jk jkVar2 = (jk) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (jkVar2 == null) {
                jkVar2 = new jk();
                jkVar2.d = null;
                this.b.put(fragmentManager, jkVar2);
                fragmentManager.beginTransaction().add(jkVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.d.obtainMessage(2, fragmentManager).sendToTarget();
            }
            return jkVar2;
        }
        return jkVar;
    }

    private bv a(Context context, androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        jk a2 = a(fragmentManager);
        bv bvVar = a2.c;
        if (bvVar == null) {
            bvVar = this.e.a(bo.a(context), a2.a, a2.b, context);
            if (z) {
                bvVar.a();
            }
            a2.c = bvVar;
        }
        return bvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.handleMessage(android.os.Message):boolean");
    }
}
