package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bec  reason: default package */
/* loaded from: classes2.dex */
public final class bec extends bdz<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bec(int i) {
        super(i, (byte) 0);
    }

    @Override // defpackage.bdz
    public final void a() {
        if (!this.a) {
            for (int i = 0; i < b(); i++) {
                Map.Entry<FieldDescriptorType, Object> b = b(i);
                if (((bbw) b.getKey()).d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            Iterator it = c().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((bbw) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
