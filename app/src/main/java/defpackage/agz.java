package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: agz  reason: default package */
/* loaded from: classes.dex */
final class agz implements Callable<Long> {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public agz(SharedPreferences sharedPreferences, String str, Long l) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        return Long.valueOf(this.a.getLong(this.b, this.c.longValue()));
    }
}
