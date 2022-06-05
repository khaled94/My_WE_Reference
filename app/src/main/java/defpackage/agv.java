package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: agv  reason: default package */
/* loaded from: classes.dex */
final class agv implements Callable<Boolean> {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public agv(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf(this.a.getBoolean(this.b, this.c.booleanValue()));
    }
}
