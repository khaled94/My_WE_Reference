package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: ahd  reason: default package */
/* loaded from: classes.dex */
final class ahd implements Callable<SharedPreferences> {
    private final /* synthetic */ Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahd(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() throws Exception {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}
