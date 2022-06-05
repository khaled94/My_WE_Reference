package defpackage;

import java.util.Arrays;

/* renamed from: arx  reason: default package */
/* loaded from: classes.dex */
final class arx implements arz {
    private arx() {
    }

    @Override // defpackage.arz
    public final byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ arx(byte b) {
        this();
    }
}
