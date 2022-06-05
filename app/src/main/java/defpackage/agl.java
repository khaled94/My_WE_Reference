package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: agl  reason: default package */
/* loaded from: classes.dex */
public final class agl implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.AbstractC0019a abstractC0019a) throws DynamiteModule.LoadingException {
        int i;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a = abstractC0019a.a(context, str);
        bVar.a = a;
        int i2 = 0;
        if (a != 0) {
            i = abstractC0019a.a(context, str, false);
            bVar.b = i;
        } else {
            i = abstractC0019a.a(context, str, true);
            bVar.b = i;
        }
        int i3 = bVar.a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            bVar.c = 0;
            return bVar;
        }
        if (i >= i2) {
            bVar.c = 1;
        } else {
            bVar.c = -1;
        }
        return bVar;
    }
}
