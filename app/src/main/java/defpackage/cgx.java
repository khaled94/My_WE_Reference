package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseException;

/* renamed from: cgx  reason: default package */
/* loaded from: classes2.dex */
public final class cgx implements wd {
    @Override // defpackage.wd
    public final Exception a(Status status) {
        if (status.i == 8) {
            return new FirebaseException(status.d());
        }
        return new FirebaseApiNotAvailableException(status.d());
    }
}
