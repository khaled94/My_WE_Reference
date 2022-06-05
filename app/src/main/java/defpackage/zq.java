package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: zq  reason: default package */
/* loaded from: classes2.dex */
public final class zq extends Fragment implements vv {
    private static final WeakHashMap<FragmentActivity, WeakReference<zq>> a = new WeakHashMap<>();
    private final Map<String, LifecycleCallback> b = Collections.synchronizedMap(new ArrayMap());
    private int c = 0;
    private Bundle d;

    public static zq a(FragmentActivity fragmentActivity) {
        zq zqVar;
        WeakReference<zq> weakReference = a.get(fragmentActivity);
        if (weakReference == null || (zqVar = weakReference.get()) == null) {
            try {
                zq zqVar2 = (zq) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
                if (zqVar2 == null || zqVar2.isRemoving()) {
                    zqVar2 = new zq();
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(zqVar2, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                }
                a.put(fragmentActivity, new WeakReference<>(zqVar2));
                return zqVar2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        return zqVar;
    }

    @Override // defpackage.vv
    public final /* synthetic */ Activity a() {
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
            new aiy(Looper.getMainLooper()).post(new zp(this, lifecycleCallback, str));
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = 1;
        this.d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.b.entrySet()) {
            entry.getValue().a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.c = 5;
        Iterator<LifecycleCallback> it = this.b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.c = 3;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
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

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.c = 2;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.c = 4;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.d();
        }
    }
}
