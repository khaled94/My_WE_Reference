package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: agx  reason: default package */
/* loaded from: classes.dex */
final class agx implements Callable<Integer> {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Integer c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public agx(SharedPreferences sharedPreferences, String str, Integer num) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() throws Exception {
        return Integer.valueOf(this.a.getInt(this.b, this.c.intValue()));
    }
}
