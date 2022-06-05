package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.places.zzbk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bhm  reason: default package */
/* loaded from: classes2.dex */
public class bhm extends zx {
    public bhm(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] g(String str) {
        if (!d(str) || e(str)) {
            return null;
        }
        return f(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float h(String str) {
        if (!d(str) || e(str)) {
            return -1.0f;
        }
        return a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<Integer> a(String str, List<Integer> list) {
        byte[] g = g(str);
        if (g == null) {
            return list;
        }
        try {
            bfq a = bfq.a(g);
            return a.zzdp.size() == 0 ? list : a.zzdp;
        } catch (zzbk unused) {
            return list;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int i(String str) {
        if (!d(str) || e(str)) {
            return -1;
        }
        return b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <E extends abd> List<E> a(String str, Parcelable.Creator<E> creator, List<E> list) {
        byte[] g = g(str);
        if (g == null) {
            return list;
        }
        try {
            bfq a = bfq.a(g);
            if (a.h() == 0) {
                return list;
            }
            ArrayList arrayList = new ArrayList(a.h());
            for (bgb bgbVar : a.zzdq) {
                arrayList.add(abe.a(bgbVar.d(), creator));
            }
            return arrayList;
        } catch (zzbk unused) {
            return list;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str, String str2) {
        return (!d(str) || e(str)) ? str2 : c(str);
    }
}
