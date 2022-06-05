package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: fl  reason: default package */
/* loaded from: classes2.dex */
public final class fl implements ci<ByteBuffer> {
    @Override // defpackage.ci
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, File file, cm cmVar) {
        return a(byteBuffer, file);
    }

    private static boolean a(ByteBuffer byteBuffer, File file) {
        try {
            kv.a(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
