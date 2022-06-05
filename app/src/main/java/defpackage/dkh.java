package defpackage;

import dagger.internal.Linker;
import java.util.List;

/* renamed from: dkh  reason: default package */
/* loaded from: classes2.dex */
public final class dkh implements Linker.a {
    @Override // dagger.internal.Linker.a
    public final void a(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Errors creating object graph:");
        for (String str : list) {
            sb.append("\n  ");
            sb.append(str);
        }
        throw new IllegalStateException(sb.toString());
    }
}
