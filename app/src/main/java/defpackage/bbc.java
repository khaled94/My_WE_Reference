package defpackage;

import java.util.Arrays;

/* renamed from: bbc  reason: default package */
/* loaded from: classes.dex */
final class bbc implements bbe {
    private bbc() {
    }

    @Override // defpackage.bbe
    public final byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bbc(byte b) {
        this();
    }
}
