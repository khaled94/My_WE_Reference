package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@Deprecated
/* renamed from: bgm  reason: default package */
/* loaded from: classes2.dex */
public final class bgm extends zu<bgl> implements vi {
    public bgm(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // defpackage.vi
    public final Status a() {
        return bgu.b(this.a.d);
    }

    public final String toString() {
        return aar.a(this).a(NotificationCompat.CATEGORY_STATUS, a()).toString();
    }

    @Override // defpackage.zv
    public final /* synthetic */ Object a(int i) {
        return new bho(this.a, i);
    }
}
