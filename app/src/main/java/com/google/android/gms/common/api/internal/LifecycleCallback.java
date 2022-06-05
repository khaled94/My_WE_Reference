package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class LifecycleCallback {
    public final vv a;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(vv vvVar) {
        this.a = vvVar;
    }

    public static vv a(Activity activity) {
        return a(new vu(activity));
    }

    private static vv getChimeraLifecycleFragmentImpl(vu vuVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public final Activity a() {
        Activity a = this.a.a();
        aat.a(a);
        return a;
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
    }

    public void b(Bundle bundle) {
    }

    public void c() {
    }

    public void d() {
    }

    public static vv a(vu vuVar) {
        if (vuVar.a instanceof FragmentActivity) {
            return zq.a((FragmentActivity) vuVar.a);
        }
        if (vuVar.a instanceof Activity) {
            return zo.a((Activity) vuVar.a);
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
