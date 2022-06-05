package defpackage;

import android.os.Bundle;
import defpackage.vc;
import java.util.Arrays;
import java.util.Set;

/* renamed from: td  reason: default package */
/* loaded from: classes2.dex */
public final class td implements vc.d.f {
    public static final td a = new td(new Bundle());
    public final Bundle b;

    private /* synthetic */ td(Bundle bundle) {
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        Bundle bundle = this.b;
        Bundle bundle2 = ((td) obj).b;
        if (bundle == null || bundle2 == null) {
            if (bundle != bundle2) {
                return false;
            }
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String str : keySet) {
                if (!aar.a(bundle.get(str), bundle2.get(str))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
