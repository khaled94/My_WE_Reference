package defpackage;

import defpackage.dmb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: dyj  reason: default package */
/* loaded from: classes2.dex */
public final class dyj {
    private static final boolean a;

    static {
        Object obj;
        try {
            dmb.a aVar = dmb.a;
            obj = dmb.d(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            dmb.a aVar2 = dmb.a;
            obj = dmb.d(dmc.a(th));
        }
        a = dmb.a(obj);
    }

    public static final boolean a() {
        return a;
    }
}
