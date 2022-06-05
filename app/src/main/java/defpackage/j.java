package defpackage;

import android.media.session.MediaSession;

/* renamed from: j  reason: default package */
/* loaded from: classes2.dex */
public final class j {
    public static Object a(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    private j() {
    }
}
