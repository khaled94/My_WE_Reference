package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.family.FamilySharedLimitDetails;
import com.ucare.we.view.CircularProgressView;
import defpackage.det;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000267B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010+\u001a\u00020,2\n\u0010-\u001a\u00060\u0002R\u00020\u00002\u0006\u0010.\u001a\u00020/H\u0003J\b\u00100\u001a\u00020/H\u0016J\u001c\u00101\u001a\u00020,2\n\u0010-\u001a\u00060\u0002R\u00020\u00002\u0006\u0010.\u001a\u00020/H\u0017J\u001c\u00102\u001a\u00060\u0002R\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020/H\u0016R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010#\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00068"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/FamilyConsumptionLimitAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/FamilyConsumptionLimitAdapter$ViewHolder;", "context", "Landroid/content/Context;", "mClickHandler", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/FamilyConsumptionLimitAdapter$ConsumptionAdapterOnClickHandler;", "itemList", "", "Lcom/ucare/we/model/family/FamilySharedLimitDetails;", "familyQueryConsumptionLimitListener", "Lcom/ucare/we/presentation/family/provider/FamilyQueryConsumptionLimitListener;", "(Landroid/content/Context;Lcom/ucare/we/presentation/family/groupinfo/managemembers/FamilyConsumptionLimitAdapter$ConsumptionAdapterOnClickHandler;Ljava/util/List;Lcom/ucare/we/presentation/family/provider/FamilyQueryConsumptionLimitListener;)V", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "corporatePermissionProvider", "Lcom/ucare/we/provider/CorporatePermissionProvider;", "getCorporatePermissionProvider", "()Lcom/ucare/we/provider/CorporatePermissionProvider;", "setCorporatePermissionProvider", "(Lcom/ucare/we/provider/CorporatePermissionProvider;)V", "getFamilyQueryConsumptionLimitListener", "()Lcom/ucare/we/presentation/family/provider/FamilyQueryConsumptionLimitListener;", "setFamilyQueryConsumptionLimitListener", "(Lcom/ucare/we/presentation/family/provider/FamilyQueryConsumptionLimitListener;)V", "isCreateNewGroup", "", "()Ljava/lang/Boolean;", "setCreateNewGroup", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isFiltered", "setFiltered", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "bindItem", "", "holder", "position", "", "getItemCount", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ConsumptionAdapterOnClickHandler", "ViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: det */
/* loaded from: classes2.dex */
public final class det extends RecyclerView.Adapter<b> {
    private final Context a;
    private final a b;
    private final List<FamilySharedLimitDetails> c;
    private dfq d;
    @Inject
    private dio e;
    private djw f = new djw();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/FamilyConsumptionLimitAdapter$ConsumptionAdapterOnClickHandler;", "", "onClick", "", "item", "Lcom/ucare/we/model/family/FamilySharedLimitDetails;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: det$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(FamilySharedLimitDetails familySharedLimitDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03c5  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void onBindViewHolder(defpackage.det.b r20, int r21) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.det.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_consumption_limit_family, viewGroup, false);
        dqc.b(inflate, "view");
        return new b(this, inflate);
    }

    public det(Context context, a aVar, List<FamilySharedLimitDetails> list, dfq dfqVar) {
        dqc.d(context, "context");
        dqc.d(aVar, "mClickHandler");
        dqc.d(list, "itemList");
        dqc.d(dfqVar, "familyQueryConsumptionLimitListener");
        this.a = context;
        this.b = aVar;
        this.c = list;
        this.d = dfqVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001a\u0010#\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u001a\u0010&\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\n¨\u0006)"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/FamilyConsumptionLimitAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ucare/we/presentation/family/groupinfo/managemembers/FamilyConsumptionLimitAdapter;Landroid/view/View;)V", "btn_setLimit", "Landroid/widget/TextView;", "getBtn_setLimit", "()Landroid/widget/TextView;", "setBtn_setLimit", "(Landroid/widget/TextView;)V", "circleProgress", "Lcom/ucare/we/view/CircularProgressView;", "getCircleProgress", "()Lcom/ucare/we/view/CircularProgressView;", "setCircleProgress", "(Lcom/ucare/we/view/CircularProgressView;)V", "linearGroupProgressBar", "Landroid/widget/ProgressBar;", "getLinearGroupProgressBar", "()Landroid/widget/ProgressBar;", "setLinearGroupProgressBar", "(Landroid/widget/ProgressBar;)V", "tag_openLimit", "getTag_openLimit", "setTag_openLimit", "tv_consumedBar", "getTv_consumedBar", "setTv_consumedBar", "tv_consumedLimit", "getTv_consumedLimit", "setTv_consumedLimit", "tv_remaining", "getTv_remaining", "setTv_remaining", "tv_remainingBar", "getTv_remainingBar", "setTv_remainingBar", "txtMainPlan", "getTxtMainPlan", "setTxtMainPlan", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: det$b */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;
        TextView c;
        TextView d;
        TextView e;
        TextView f;
        CircularProgressView g;
        ProgressBar h;
        final /* synthetic */ det i;
        private TextView j;

        /* renamed from: lambda$AGpKa9WSGBAp_sPGrxpjvH-lcQc */
        public static /* synthetic */ void m109lambda$AGpKa9WSGBAp_sPGrxpjvHlcQc(b bVar, det detVar, View view) {
            a(bVar, detVar, view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(det detVar, View view) {
            super(view);
            dqc.d(detVar, "this$0");
            dqc.d(view, "itemView");
            this.i = detVar;
            View findViewById = view.findViewById(R.id.tv_bundle_name);
            dqc.b(findViewById, "itemView.findViewById(R.id.tv_bundle_name)");
            this.a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tag_openLimit);
            dqc.b(findViewById2, "itemView.findViewById(R.id.tag_openLimit)");
            this.f = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_consumedBar);
            dqc.b(findViewById3, "itemView.findViewById(R.id.tv_consumedBar)");
            this.d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tv_remainingBar);
            dqc.b(findViewById4, "itemView.findViewById(R.id.tv_remainingBar)");
            this.e = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.consumed_textview);
            dqc.b(findViewById5, "itemView.findViewById(R.id.consumed_textview)");
            this.c = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.remaining_textview);
            dqc.b(findViewById6, "itemView.findViewById(R.id.remaining_textview)");
            this.b = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.btn_setLimit);
            dqc.b(findViewById7, "itemView.findViewById(R.id.btn_setLimit)");
            this.j = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.yourCircularProgressbar);
            dqc.b(findViewById8, "itemView.findViewById(R.id.yourCircularProgressbar)");
            this.g = (CircularProgressView) findViewById8;
            View findViewById9 = view.findViewById(R.id.linear_progressBar);
            dqc.b(findViewById9, "itemView.findViewById(R.id.linear_progressBar)");
            this.h = (ProgressBar) findViewById9;
            TextView textView = this.j;
            final det detVar2 = this.i;
            textView.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$det$b$AGpKa9WSGBAp_sPGrxpjvH-lcQc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    det.b.m109lambda$AGpKa9WSGBAp_sPGrxpjvHlcQc(det.b.this, detVar2, view2);
                }
            });
        }

        public static final void a(b bVar, det detVar, View view) {
            dqc.d(bVar, "this$0");
            dqc.d(detVar, "this$1");
            detVar.b.a((FamilySharedLimitDetails) detVar.c.get(bVar.getAdapterPosition()));
        }
    }
}
