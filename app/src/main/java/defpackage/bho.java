package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collections;

/* renamed from: bho  reason: default package */
/* loaded from: classes2.dex */
public final class bho extends bhm implements bgl {
    public bho(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // defpackage.bgl
    public final String b() {
        return a("ap_place_id", (String) null);
    }

    @Override // defpackage.bgl
    public final CharSequence a() {
        String a = a("ap_description", "");
        a("ap_matched_subscriptions", bhn.CREATOR, Collections.emptyList());
        return a;
    }
}
