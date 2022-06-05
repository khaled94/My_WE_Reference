package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: vv  reason: default package */
/* loaded from: classes2.dex */
public interface vv {
    Activity a();

    <T extends LifecycleCallback> T a(String str, Class<T> cls);

    void a(String str, LifecycleCallback lifecycleCallback);

    void startActivityForResult(Intent intent, int i);
}
