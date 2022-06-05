package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.usagedetails.DetailedLineUsageItem;
import com.ucare.we.view.CircularProgressView;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001'B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/ucare/we/adapters/GroupInfoBundleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ucare/we/adapters/GroupInfoBundleAdapter$ViewHolder;", "context", "Landroid/content/Context;", "usageDetailsDTOS", "", "Lcom/ucare/we/model/usagedetails/DetailedLineUsageItem;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "language", "", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "getUsageDetailsDTOS", "()Ljava/util/List;", "setUsageDetailsDTOS", "(Ljava/util/List;)V", "checkIfNumberHadAdditionalZero", "value", "", "formatNumberAndRemoveZero", "d", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: cwv  reason: default package */
/* loaded from: classes2.dex */
public final class cwv extends RecyclerView.Adapter<a> {
    private Context a;
    private List<? extends DetailedLineUsageItem> b;
    private String c;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void onBindViewHolder(defpackage.cwv.a r20, int r21) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwv.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_info_usage_details_item, viewGroup, false);
        dqc.b(inflate, "v");
        return new a(this, inflate);
    }

    public cwv(Context context, List<? extends DetailedLineUsageItem> list) {
        dqc.d(context, "context");
        dqc.d(list, "usageDetailsDTOS");
        this.a = context;
        this.b = list;
        String a2 = djv.a("LANGUAGE", "");
        dqc.b(a2, "getString(Constants.LANGUAGE, this.context, \"\")");
        this.c = a2;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/ucare/we/adapters/GroupInfoBundleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/ucare/we/adapters/GroupInfoBundleAdapter;Landroid/view/View;)V", "circleProgressbar", "Lcom/ucare/we/view/CircularProgressView;", "getCircleProgressbar", "()Lcom/ucare/we/view/CircularProgressView;", "setCircleProgressbar", "(Lcom/ucare/we/view/CircularProgressView;)V", "consumedTextView", "Landroid/widget/TextView;", "getConsumedTextView", "()Landroid/widget/TextView;", "setConsumedTextView", "(Landroid/widget/TextView;)V", "remainingTextView", "getRemainingTextView", "setRemainingTextView", "renewalDateTextView", "getRenewalDateTextView", "setRenewalDateTextView", "serviceIdNumberTextView", "getServiceIdNumberTextView", "setServiceIdNumberTextView", "tvBundleName", "getTvBundleName", "setTvBundleName", "tv_progress", "getTv_progress", "setTv_progress", "viewDivider", "getViewDivider", "()Landroid/view/View;", "setViewDivider", "(Landroid/view/View;)V", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: cwv$a */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.ViewHolder {
        CircularProgressView a;
        TextView b;
        TextView c;
        TextView d;
        TextView e;
        TextView f;
        TextView g;
        View h;
        final /* synthetic */ cwv i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cwv cwvVar, View view) {
            super(view);
            dqc.d(cwvVar, "this$0");
            dqc.d(view, "v");
            this.i = cwvVar;
            View findViewById = view.findViewById(R.id.yourCircularProgressbar);
            dqc.b(findViewById, "v.findViewById(R.id.yourCircularProgressbar)");
            this.a = (CircularProgressView) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_bundle_name);
            dqc.b(findViewById2, "v.findViewById(R.id.tv_bundle_name)");
            this.b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.consumed_textview);
            dqc.b(findViewById3, "v.findViewById(R.id.consumed_textview)");
            this.c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.remaining_textview);
            dqc.b(findViewById4, "v.findViewById(R.id.remaining_textview)");
            this.d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.txtRenewalDate);
            dqc.b(findViewById5, "v.findViewById(R.id.txtRenewalDate)");
            this.e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.serviceIdNumber);
            dqc.b(findViewById6, "v.findViewById(R.id.serviceIdNumber)");
            this.f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.tv_progress);
            dqc.b(findViewById7, "v.findViewById(R.id.tv_progress)");
            this.g = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.viewDivider);
            dqc.b(findViewById8, "v.findViewById(R.id.viewDivider)");
            this.h = findViewById8;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    private static String a(float f) {
        if (f % 1.0f == 0.0f) {
            double d = f;
            long j = (long) d;
            if (d == ((double) j)) {
                dqi dqiVar = dqi.a;
                String format = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                return format;
            }
            dqi dqiVar2 = dqi.a;
            String format2 = String.format(Locale.ENGLISH, "%s", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            dqc.b(format2, "java.lang.String.format(locale, format, *args)");
            return format2;
        }
        return String.valueOf(f);
    }
}
