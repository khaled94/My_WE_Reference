package defpackage;

import android.content.Context;
import defpackage.fa;
import java.io.File;

/* renamed from: fc  reason: default package */
/* loaded from: classes2.dex */
public final class fc extends fa {
    public fc(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private fc(final Context context, final String str) {
        super(new fa.a() { // from class: fc.1
            @Override // defpackage.fa.a
            public final File a() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        });
    }
}
