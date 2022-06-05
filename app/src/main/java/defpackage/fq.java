package defpackage;

import defpackage.fs;
import java.util.Collections;
import java.util.Map;

/* renamed from: fq  reason: default package */
/* loaded from: classes2.dex */
public interface fq {
    @Deprecated
    public static final fq a = new fq() { // from class: fq.1
        @Override // defpackage.fq
        public final Map<String, String> a() {
            return Collections.emptyMap();
        }
    };
    public static final fq b;

    Map<String, String> a();

    static {
        fs.a aVar = new fs.a();
        aVar.a = true;
        b = new fs(aVar.b);
    }
}
