package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: ede  reason: default package */
/* loaded from: classes2.dex */
public interface ede {
    public static final ede a = new ede() { // from class: ede.1
        @Override // defpackage.ede
        public final void a(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete ".concat(String.valueOf(file)));
        }
    };

    void a(File file) throws IOException;
}
