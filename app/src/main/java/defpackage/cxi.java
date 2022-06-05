package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.view.CircularProgressView;
import com.ucare.we.view.CustomAppCompatTextView;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0016J\u001c\u0010,\u001a\u00020-2\n\u0010.\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020)H\u0016J\u001c\u0010/\u001a\u00060\u0002R\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020)H\u0016J\u0018\u00103\u001a\u00020-2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\rH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0005¨\u00068"}, d2 = {"Lcom/ucare/we/adapters/UsageDetailsRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ucare/we/adapters/UsageDetailsRecyclerViewAdapter$ViewHolder;", "usageDetailsScreenActivityPluginInterface", "Lcom/ucare/we/plugininterfaces/UsageDetailsScreenActivityPluginInterface;", "(Lcom/ucare/we/plugininterfaces/UsageDetailsScreenActivityPluginInterface;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "language", "", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "usageDetailsDTOS", "", "Lcom/ucare/we/dto/usagedetails/UsageDetailsDTO;", "getUsageDetailsDTOS", "()Ljava/util/List;", "setUsageDetailsDTOS", "(Ljava/util/List;)V", "getUsageDetailsScreenActivityPluginInterface", "()Lcom/ucare/we/plugininterfaces/UsageDetailsScreenActivityPluginInterface;", "setUsageDetailsScreenActivityPluginInterface", "checkIfNumberHadAdditionalZero", "value", "", "formatNumberAndRemoveZero", "d", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setIcon", "view", "Lcom/ucare/we/view/CustomAppCompatTextView;", "icon", "ViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: cxi  reason: default package */
/* loaded from: classes2.dex */
public final class cxi extends RecyclerView.Adapter<a> {
    private dcx a;
    private List<? extends cyr> b;
    private Context c;
    private String d;
    @Inject
    private djw e = new djw();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        dqc.d(aVar2, "holder");
        cyr cyrVar = this.b.get(i);
        String str = cyrVar.h;
        aVar2.c.setText(this.c.getString(R.string.home_extra_bundle));
        CustomAppCompatTextView customAppCompatTextView = aVar2.d;
        String str2 = cyrVar.i;
        dqc.b(str2, "usageDetailsDTO.tabEnName");
        switch (str2.hashCode()) {
            case -1565412161:
                if (str2.equals("Minutes")) {
                    customAppCompatTextView.setDrawableStartVector(R.drawable.ic_minutes_small);
                    break;
                }
                break;
            case -543010462:
                if (str2.equals("Home Internet")) {
                    customAppCompatTextView.setDrawableStartVector(R.drawable.ic_h__internet_selected);
                    break;
                }
                break;
            case 82233:
                if (str2.equals("SMS")) {
                    customAppCompatTextView.setDrawableStartVector(R.drawable.ic_sms_selected);
                    break;
                }
                break;
            case 81880911:
                if (str2.equals("Units")) {
                    customAppCompatTextView.setDrawableStartVector(R.drawable.ic_units_small);
                    break;
                }
                break;
            case 1153784880:
                if (str2.equals("SMS_USAGE_POSTPAID")) {
                    customAppCompatTextView.setDrawableStartVector(R.drawable.ic_sms_selected);
                    break;
                }
                break;
            case 1275840767:
                if (str2.equals("Mobile Internet")) {
                    customAppCompatTextView.setDrawableStartVector(R.drawable.ic_mobile_internet_small);
                    break;
                }
                break;
        }
        float f = (cyrVar.b * 100.0f) / cyrVar.a;
        if (!Float.isNaN(f)) {
            aVar2.a.a(f, false);
            TextView textView = aVar2.b;
            StringBuilder sb = new StringBuilder();
            sb.append(dqn.a(f));
            sb.append('%');
            textView.setText(sb.toString());
        }
        float f2 = cyrVar.b;
        float f3 = cyrVar.a;
        float f4 = f3 - f2;
        String a2 = a(((float) Math.round(f3 * 100.0d)) / 100.0f);
        String a3 = a(((float) Math.round(f2 * 100.0d)) / 100.0f);
        String a4 = a(((float) Math.round(f4 * 100.0d)) / 100.0f);
        String str3 = "";
        Spanned fromHtml = HtmlCompat.fromHtml(this.c.getString(R.string.remaining_value, a3, str3), 0);
        dqc.b(fromHtml, "fromHtml(\n            context.getString(\n                R.string.remaining_value,\n                stringRemainingAmount,\n                measureUnitName\n            ), HtmlCompat.FROM_HTML_MODE_LEGACY\n        )");
        Spanned fromHtml2 = HtmlCompat.fromHtml(this.c.getString(R.string.consumed_value, a4, str3, a2, str3), 0);
        dqc.b(fromHtml2, "fromHtml(\n                context.getString(\n                    R.string.consumed_value,\n                    stringConsumedAmount,\n                    measureUnitName,\n                    stringTotalAmount,\n                    measureUnitName\n                ), HtmlCompat.FROM_HTML_MODE_LEGACY\n            )");
        if (dqc.a((Object) this.d, (Object) "ar")) {
            str3 = cyrVar.d;
            String str4 = cyrVar.f;
            Spanned fromHtml3 = HtmlCompat.fromHtml(this.c.getString(R.string.remaining_value, a3, str4), 0);
            dqc.b(fromHtml3, "fromHtml(\n                context.getString(\n                    R.string.remaining_value,\n                    stringRemainingAmount,\n                    measureUnitName\n                ), HtmlCompat.FROM_HTML_MODE_LEGACY\n            )");
            fromHtml2 = HtmlCompat.fromHtml(this.c.getString(R.string.consumed_value, a4, str4, a2, str4), 0);
            dqc.b(fromHtml2, "fromHtml(\n                    context.getString(\n                        R.string.consumed_value,\n                        stringConsumedAmount,\n                        measureUnitName,\n                        stringTotalAmount,\n                        measureUnitName\n                    ), HtmlCompat.FROM_HTML_MODE_LEGACY\n                )");
            fromHtml = fromHtml3;
        } else if (dqc.a((Object) this.d, (Object) "en")) {
            String str5 = cyrVar.c;
            String str6 = cyrVar.e;
            Spanned fromHtml4 = HtmlCompat.fromHtml(this.c.getString(R.string.remaining_value, a3, str6), 0);
            dqc.b(fromHtml4, "fromHtml(\n                context.getString(\n                    R.string.remaining_value,\n                    stringRemainingAmount,\n                    measureUnitName\n                ), HtmlCompat.FROM_HTML_MODE_LEGACY\n            )");
            Spanned fromHtml5 = HtmlCompat.fromHtml(this.c.getString(R.string.consumed_value, a4, str6, a2, str6), 0);
            dqc.b(fromHtml5, "fromHtml(\n                    context.getString(\n                        R.string.consumed_value,\n                        stringConsumedAmount,\n                        measureUnitName,\n                        stringTotalAmount,\n                        measureUnitName\n                    ), HtmlCompat.FROM_HTML_MODE_LEGACY\n                )");
            fromHtml = fromHtml4;
            str3 = str5;
            fromHtml2 = fromHtml5;
        }
        aVar2.d.setText(str3);
        aVar2.f.setText(fromHtml);
        aVar2.e.setText(fromHtml2);
        if (!this.e.O()) {
            aVar2.h.setVisibility(8);
        } else {
            aVar2.h.setVisibility(0);
            this.e.N();
            if (dsg.b(cyrVar.k, this.e.N())) {
                aVar2.h.setText(this.c.getString(R.string.group));
            } else {
                aVar2.h.setText(cyrVar.k);
            }
        }
        if (dqc.a((Object) this.d, (Object) "ar")) {
            aVar2.g.setText(str);
        } else if (!dqc.a((Object) this.d, (Object) "en")) {
        } else {
            aVar2.g.setText(djm.b(str));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.usage_details_recycler_view_content, viewGroup, false);
        dqc.b(inflate, "v");
        return new a(this, inflate);
    }

    public cxi(dcx dcxVar) {
        dqc.d(dcxVar, "usageDetailsScreenActivityPluginInterface");
        this.a = dcxVar;
        List<cyr> k = dcxVar.k();
        dqc.b(k, "usageDetailsScreenActivityPluginInterface.usageDetailsDTOS");
        this.b = k;
        Context l = this.a.l();
        dqc.b(l, "usageDetailsScreenActivityPluginInterface.myContext");
        this.c = l;
        String a2 = djv.a("LANGUAGE", "");
        dqc.b(a2, "getString(Constants.LANGUAGE, context, \"\")");
        this.d = a2;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010¨\u0006&"}, d2 = {"Lcom/ucare/we/adapters/UsageDetailsRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/ucare/we/adapters/UsageDetailsRecyclerViewAdapter;Landroid/view/View;)V", "circleProgressbar", "Lcom/ucare/we/view/CircularProgressView;", "getCircleProgressbar", "()Lcom/ucare/we/view/CircularProgressView;", "setCircleProgressbar", "(Lcom/ucare/we/view/CircularProgressView;)V", "consumedTextView", "Landroid/widget/TextView;", "getConsumedTextView", "()Landroid/widget/TextView;", "setConsumedTextView", "(Landroid/widget/TextView;)V", "remainingTextView", "getRemainingTextView", "setRemainingTextView", "renewalDateTextView", "getRenewalDateTextView", "setRenewalDateTextView", "serviceIdNumberTextView", "getServiceIdNumberTextView", "setServiceIdNumberTextView", "tvBundleName", "Lcom/ucare/we/view/CustomAppCompatTextView;", "getTvBundleName", "()Lcom/ucare/we/view/CustomAppCompatTextView;", "setTvBundleName", "(Lcom/ucare/we/view/CustomAppCompatTextView;)V", "tvBundleType", "getTvBundleType", "setTvBundleType", "tvProgress", "getTvProgress", "setTvProgress", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: cxi$a */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.ViewHolder {
        CircularProgressView a;
        TextView b;
        TextView c;
        CustomAppCompatTextView d;
        TextView e;
        TextView f;
        TextView g;
        TextView h;
        final /* synthetic */ cxi i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cxi cxiVar, View view) {
            super(view);
            dqc.d(cxiVar, "this$0");
            dqc.d(view, "v");
            this.i = cxiVar;
            View findViewById = view.findViewById(R.id.yourCircularProgressbar);
            dqc.b(findViewById, "v.findViewById(R.id.yourCircularProgressbar)");
            this.a = (CircularProgressView) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_progress);
            dqc.b(findViewById2, "v.findViewById(R.id.tv_progress)");
            this.b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_bundle_type);
            dqc.b(findViewById3, "v.findViewById(R.id.tv_bundle_type)");
            this.c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tv_bundle_name);
            dqc.b(findViewById4, "v.findViewById(R.id.tv_bundle_name)");
            this.d = (CustomAppCompatTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.consumed_textview);
            dqc.b(findViewById5, "v.findViewById(R.id.consumed_textview)");
            this.e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.remaining_textview);
            dqc.b(findViewById6, "v.findViewById(R.id.remaining_textview)");
            this.f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.txtRenewalDate);
            dqc.b(findViewById7, "v.findViewById(R.id.txtRenewalDate)");
            this.g = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.serviceIdNumber);
            dqc.b(findViewById8, "v.findViewById(R.id.serviceIdNumber)");
            this.h = (TextView) findViewById8;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    private static String a(float f) {
        if (!(f % 1.0f == 0.0f)) {
            return String.valueOf(f);
        }
        double d = f;
        dqi dqiVar = dqi.a;
        String format = String.format(Locale.ENGLISH, "%s", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        dqc.b(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }
}
