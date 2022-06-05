package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: aac  reason: default package */
/* loaded from: classes.dex */
public final class aac {
    public static ApiException a(Status status) {
        if (status.b()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
