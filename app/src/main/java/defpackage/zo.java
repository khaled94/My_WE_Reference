package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: zo  reason: default package */
/* loaded from: classes2.dex */
public final class zo extends Fragment implements vv {
    private static final WeakHashMap<Activity, WeakReference<zo>> a = new WeakHashMap<>();
    private final Map<String, LifecycleCallback> b = Collections.synchronizedMap(new ArrayMap());
    private int c = 0;
    private Bundle d;

    public static zo a(Activity activity) {
        zo zoVar;
        WeakReference<zo> weakReference = a.get(activity);
        if (weakReference == null || (zoVar = weakReference.get()) == null) {
            try {
                zo zoVar2 = (zo) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (zoVar2 == null || zoVar2.isRemoving()) {
                    zoVar2 = new zo();
                    activity.getFragmentManager().beginTransaction().add(zoVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                a.put(activity, new WeakReference<>(zoVar2));
                return zoVar2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        return zoVar;
    }

    @Override // defpackage.vv
    public final Activity a() {
        return getActivity();
    }

    @Override // defpackage.vv
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.b.get(str));
    }

    @Override // defpackage.vv
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, lifecycleCallback);
            if (this.c <= 0) {
                return;
            }
            new aiy(Looper.getMainLooper()).post(new zn(this, lifecycleCallback, str));
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.a(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = 1;
        this.d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.b.entrySet()) {
            entry.getValue().a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.c = 5;
        Iterator<LifecycleCallback> it = this.b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.c = 3;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.b();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.c = 2;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.c();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.c = 4;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.d();
        }
    }
}
