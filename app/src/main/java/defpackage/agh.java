package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: agh  reason: default package */
/* loaded from: classes.dex */
public final class agh implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.AbstractC0019a abstractC0019a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a = abstractC0019a.a(context, str, false);
        bVar.b = a;
        if (a == 0) {
            bVar.c = 0;
        } else {
            bVar.c = 1;
        }
        return bVar;
    }
}
