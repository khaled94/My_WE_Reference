package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: ahb  reason: default package */
/* loaded from: classes.dex */
final class ahb implements Callable<String> {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahb(SharedPreferences sharedPreferences, String str, String str2) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.a.getString(this.b, this.c);
    }
}
