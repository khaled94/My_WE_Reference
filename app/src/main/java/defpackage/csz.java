package defpackage;

import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: csz  reason: default package */
/* loaded from: classes2.dex */
public final class csz implements crg {
    private final cst a = new cst();

    @Override // defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        if (crcVar != crc.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(crcVar)));
        }
        return this.a.a("0".concat(String.valueOf(str)), crc.EAN_13, i, i2, map);
    }
}
