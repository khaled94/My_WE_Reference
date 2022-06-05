package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: avc  reason: default package */
/* loaded from: classes.dex */
public final class avc extends avd<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public avc(int i) {
        super(i, (byte) 0);
    }

    @Override // defpackage.avd
    public final void a() {
        if (!this.a) {
            for (int i = 0; i < b(); i++) {
                Map.Entry<FieldDescriptorType, Object> b = b(i);
                if (((ass) b.getKey()).d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            Iterator it = c().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((ass) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
