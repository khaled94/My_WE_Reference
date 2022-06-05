package defpackage;

import java.util.Map;

/* renamed from: cib  reason: default package */
/* loaded from: classes2.dex */
final class cib implements cic {
    private final int a;
    private final int b;
    private final Map<String, Integer> c;

    public cib(int i, int i2, Map<String, Integer> map) {
        this.a = i;
        this.b = i2;
        this.c = (Map) aat.a(map);
    }

    @Override // defpackage.cic
    public final boolean a(String str) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (this.b <= i) {
            return false;
        }
        Integer num = this.c.get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue() > this.a && this.b >= num.intValue();
    }
}
