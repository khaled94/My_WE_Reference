package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;

/* renamed from: cty  reason: default package */
/* loaded from: classes2.dex */
public final class cty {
    ctr a;
    ctq b;
    cts c;
    int d = -1;
    public ctu e;

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
