package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@dog(b = "View.kt", c = {406, 408}, d = "invokeSuspend", e = "androidx.core.view.ViewKt$allViews$1")
/* loaded from: classes.dex */
final class ViewKt$allViews$1 extends dok implements dph<drs<? super View>, dnu<? super dmg>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, dnu<? super ViewKt$allViews$1> dnuVar) {
        super(2, dnuVar);
        this.$this_allViews = view;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, dnuVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    public final Object invoke(drs<? super View> drsVar, dnu<? super dmg> dnuVar) {
        return ((ViewKt$allViews$1) create(drsVar, dnuVar)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        drs drsVar;
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            drsVar = (drs) this.L$0;
            this.L$0 = drsVar;
            this.label = 1;
            if (drsVar.a((drs) this.$this_allViews, (dnu<? super dmg>) this) == dnyVar) {
                return dnyVar;
            }
        } else if (i == 1) {
            drsVar = (drs) this.L$0;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return dmg.a;
        }
        View view = this.$this_allViews;
        if (view instanceof ViewGroup) {
            this.L$0 = null;
            this.label = 2;
            if (drsVar.a((drq) ViewGroupKt.getDescendants((ViewGroup) view), (dnu<? super dmg>) this) == dnyVar) {
                return dnyVar;
            }
        }
        return dmg.a;
    }
}
