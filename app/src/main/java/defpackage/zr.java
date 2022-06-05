package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.vi;

/* renamed from: zr  reason: default package */
/* loaded from: classes2.dex */
public final class zr<R extends vi> extends BasePendingResult<R> {
    private final R a;

    public zr(R r) {
        super(null);
        this.a = r;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R a(Status status) {
        return this.a;
    }
}
