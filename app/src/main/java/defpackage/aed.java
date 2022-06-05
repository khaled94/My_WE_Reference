package defpackage;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* renamed from: aed  reason: default package */
/* loaded from: classes.dex */
public final class aed {
    private aed() {
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
