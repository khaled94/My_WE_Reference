package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@Deprecated
/* renamed from: bfm  reason: default package */
/* loaded from: classes2.dex */
public final class bfm extends zy<bfn> implements vi {
    private final Status b;

    private bfm(DataHolder dataHolder, Status status) {
        super(dataHolder, bfn.CREATOR);
        aat.a(dataHolder == null || dataHolder.d == status.i);
        this.b = status;
    }

    @Override // defpackage.vi
    public final Status a() {
        return this.b;
    }

    public bfm(DataHolder dataHolder) {
        this(dataHolder, bgu.b(dataHolder.d));
    }
}
