package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@dog(b = "ViewGroup.kt", c = {97, 99}, d = "invokeSuspend", e = "androidx.core.view.ViewGroupKt$descendants$1")
/* loaded from: classes.dex */
public final class ViewGroupKt$descendants$1 extends dok implements dph<drs<? super View>, dnu<? super dmg>, Object> {
    final /* synthetic */ ViewGroup $this_descendants;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, dnu<? super ViewGroupKt$descendants$1> dnuVar) {
        super(2, dnuVar);
        this.$this_descendants = viewGroup;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, dnuVar);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    public final Object invoke(drs<? super View> drsVar, dnu<? super dmg> dnuVar) {
        return ((ViewGroupKt$descendants$1) create(drsVar, dnuVar)).invokeSuspend(dmg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
        if (r4 >= r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008b -> B:23:0x0090). Please submit an issue!!! */
    @Override // defpackage.doc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            dny r12 = defpackage.dny.COROUTINE_SUSPENDED
            int r0 = r11.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L29
            if (r0 != r1) goto L21
            int r0 = r11.I$1
            int r3 = r11.I$0
            java.lang.Object r4 = r11.L$1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r11.L$0
            drs r5 = (defpackage.drs) r5
            r6 = r11
            r9 = r5
            r5 = r0
            r0 = r9
            r10 = r4
            r4 = r3
            r3 = r10
            goto L90
        L21:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L29:
            int r0 = r11.I$1
            int r3 = r11.I$0
            java.lang.Object r4 = r11.L$2
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r5 = r11.L$1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r11.L$0
            drs r6 = (defpackage.drs) r6
            r7 = r11
            goto L6d
        L3b:
            java.lang.Object r0 = r11.L$0
            drs r0 = (defpackage.drs) r0
            android.view.ViewGroup r3 = r11.$this_descendants
            r4 = 0
            int r5 = r3.getChildCount()
            if (r5 <= 0) goto L92
            r6 = r11
        L49:
            int r7 = r4 + 1
            android.view.View r4 = r3.getChildAt(r4)
            java.lang.String r8 = "getChildAt(index)"
            defpackage.dqc.b(r4, r8)
            r6.L$0 = r0
            r6.L$1 = r3
            r6.L$2 = r4
            r6.I$0 = r7
            r6.I$1 = r5
            r6.label = r2
            java.lang.Object r8 = r0.a(r4, r6)
            if (r8 != r12) goto L67
            return r12
        L67:
            r9 = r6
            r6 = r0
            r0 = r5
            r5 = r3
            r3 = r7
            r7 = r9
        L6d:
            boolean r8 = r4 instanceof android.view.ViewGroup
            if (r8 == 0) goto L8b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            drq r4 = androidx.core.view.ViewGroupKt.getDescendants(r4)
            r7.L$0 = r6
            r7.L$1 = r5
            r8 = 0
            r7.L$2 = r8
            r7.I$0 = r3
            r7.I$1 = r0
            r7.label = r1
            java.lang.Object r4 = r6.a(r4, r7)
            if (r4 != r12) goto L8b
            return r12
        L8b:
            r4 = r3
            r3 = r5
            r5 = r0
            r0 = r6
            r6 = r7
        L90:
            if (r4 < r5) goto L49
        L92:
            dmg r12 = defpackage.dmg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
