package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: agi  reason: default package */
/* loaded from: classes.dex */
public final class agi implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.AbstractC0019a abstractC0019a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.a = abstractC0019a.a(context, str);
        int a = abstractC0019a.a(context, str, true);
        bVar.b = a;
        int i = bVar.a;
        if (i == 0) {
            if (a == 0) {
                bVar.c = 0;
                return bVar;
            }
            i = 0;
        }
        if (i >= a) {
            bVar.c = -1;
        } else {
            bVar.c = 1;
        }
        return bVar;
    }
}
