package defpackage;

import com.afollestad.materialdialogs.R;
import defpackage.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u  reason: default package */
/* loaded from: classes2.dex */
public final class u {
    u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(w.a aVar) {
        boolean a = ah.a(aVar.a, R.attr.md_dark_theme, aVar.J == y.b);
        aVar.J = a ? y.b : y.a;
        return a ? R.style.MD_Dark : R.style.MD_Light;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(w.a aVar) {
        if (aVar.s != null) {
            return R.layout.md_dialog_custom;
        }
        if (aVar.l != null || aVar.W != null) {
            if (aVar.av != null) {
                return R.layout.md_dialog_list_check;
            }
            return R.layout.md_dialog_list;
        } else if (aVar.aj > -2) {
            return R.layout.md_dialog_progress;
        } else {
            if (aVar.ah) {
                if (aVar.aA) {
                    return R.layout.md_dialog_progress_indeterminate_horizontal;
                }
                return R.layout.md_dialog_progress_indeterminate;
            } else if (aVar.an != null) {
                if (aVar.av != null) {
                    return R.layout.md_dialog_input_check;
                }
                return R.layout.md_dialog_input;
            } else if (aVar.av != null) {
                return R.layout.md_dialog_basic_check;
            } else {
                return R.layout.md_dialog_basic;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(final defpackage.w r14) {
        /*
            Method dump skipped, instructions count: 1880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u.a(w):void");
    }
}
