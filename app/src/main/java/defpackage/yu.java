package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: yu  reason: default package */
/* loaded from: classes2.dex */
public final class yu {
    public static final Status a = new Status(8, "The connection to Google Play services was lost");
    public final Set<BasePendingResult<?>> b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final yt c = new yt(this);

    public final void a() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.b.toArray(new BasePendingResult[0])) {
            basePendingResult.a((yt) null);
            if (basePendingResult.c()) {
                this.b.remove(basePendingResult);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends vi> basePendingResult) {
        this.b.add(basePendingResult);
        basePendingResult.a(this.c);
    }
}
