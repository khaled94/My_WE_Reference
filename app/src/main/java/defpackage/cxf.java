package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: cxf  reason: default package */
/* loaded from: classes2.dex */
public class cxf extends RecyclerView.Adapter<a> {
    @Inject
    Context a;
    @Inject
    djb b;
    @Inject
    dio c;
    @Inject
    dhn d;
    @Inject
    djw e;
    int g;
    int h;
    int i;
    dcv k;
    private List<SummarizedLineUsageItem> n;
    private final String l = cxf.class.getSimpleName();
    int f = -1;
    boolean j = true;
    private List<cxg> m = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        List<cxg> list = this.m;
        if (list != null) {
            cxg cxgVar = list.get(i);
            if (cxgVar.a) {
                aVar2.e.setImageResource(cxgVar.b);
                aVar2.d.setText(cxgVar.d);
                aVar2.b.setText(cxgVar.f);
                if (cxgVar.d.equals("")) {
                    aVar2.d.setVisibility(8);
                } else {
                    aVar2.d.setVisibility(0);
                }
                if (cxgVar.f.equals("")) {
                    aVar2.b.setVisibility(8);
                } else {
                    aVar2.b.setVisibility(0);
                }
                aVar2.c.setVisibility(8);
                aVar2.f.setPadding(0, 0, 0, 0);
                aVar2.f.setAlpha(1.0f);
                if (this.f == i && (i == this.m.size() - 2 || i == 1)) {
                    return;
                }
                this.f = i;
                View view = aVar2.itemView;
                Animation loadAnimation = AnimationUtils.loadAnimation(this.a, 17432576);
                loadAnimation.setDuration(1500L);
                view.startAnimation(loadAnimation);
                return;
            }
            aVar2.e.setImageResource(cxgVar.c);
            aVar2.c.setText(cxgVar.e);
            aVar2.c.setVisibility(0);
            aVar2.d.setVisibility(8);
            aVar2.b.setVisibility(8);
            if ((i != 0 && i != this.m.size() - 1) || !this.c.a()) {
                aVar2.f.setAlpha(1.0f);
            }
            int dimension = (int) this.a.getResources().getDimension(R.dimen.slider_height);
            this.g = dimension;
            this.h = (this.i / 3) - ((this.i - dimension) / 2);
            if (this.b.f()) {
                if (i == 0 || !this.m.get(i - 1).a) {
                    aVar2.f.setPadding(this.h, 0, 0, 0);
                    return;
                }
            } else if (i != 0 && this.m.get(i - 1).a) {
                aVar2.f.setPadding(this.h, 0, 0, 0);
                return;
            }
            aVar2.f.setPadding(0, 0, this.h, 0);
        }
    }

    public cxf(dcv dcvVar) {
        this.k = dcvVar;
        dad.a().a.inject(this);
    }

    public final void a(int i) {
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            if (i2 == i) {
                this.m.get(i).a = true;
            } else {
                this.m.get(i2).a = false;
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<cxg> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void a(float f) {
        new cxg();
        List<cxg> list = this.m;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            if (this.m.get(i).f != null && this.m.get(i).f.equalsIgnoreCase(this.a.getString(R.string.remaining_balance))) {
                cxg cxgVar = this.m.get(i);
                NumberFormat numberFormat = NumberFormat.getInstance(new Locale("en", "US"));
                ((DecimalFormat) numberFormat).applyPattern("##.##");
                if (f == -1.0f) {
                    cxgVar.d = this.a.getString(R.string.navheader_blance_egp);
                    cxgVar.g = 0;
                } else {
                    cxgVar.g = 100;
                    cxgVar.d = numberFormat.format(f) + this.a.getString(R.string.blance_egp);
                }
                this.j = true;
                this.m.set(i, cxgVar);
            }
        }
        notifyDataSetChanged();
    }

    public final void a(float f, List<SummarizedLineUsageItem> list) {
        this.n = list;
        ArrayList arrayList = new ArrayList();
        cxg b = b(f);
        if (this.n.size() > 1) {
            List<SummarizedLineUsageItem> list2 = this.n;
            arrayList.add(a(list2.get(list2.size() - 2)));
        } else if (this.c.e()) {
            String mesaureUnitId = list.get(0).getMesaureUnitId();
            char c = 65535;
            switch (mesaureUnitId.hashCode()) {
                case 1507426:
                    if (mesaureUnitId.equals("1003")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1508385:
                    if (mesaureUnitId.equals("1101")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1508390:
                    if (mesaureUnitId.equals("1106")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1508393:
                    if (mesaureUnitId.equals("1109")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                arrayList.add(e());
            } else if (c == 1) {
                arrayList.add(f());
            } else if (c == 2) {
                arrayList.add(f());
            } else if (c == 3) {
                arrayList.add(g());
            }
        } else {
            arrayList.add(d());
        }
        if (this.n.size() != 0) {
            List<SummarizedLineUsageItem> list3 = this.n;
            arrayList.add(a(list3.get(list3.size() - 1)));
        }
        arrayList.add(b);
        for (int i = 0; i < this.n.size(); i++) {
            arrayList.add(a(this.n.get(i)));
        }
        cxg b2 = b(-1.0f);
        b2.a = false;
        arrayList.add(b2);
        if (this.n.size() != 0) {
            arrayList.add(a(this.n.get(0)));
        }
        this.m = arrayList;
    }

    public final void a(List<SummarizedLineUsageItem> list) {
        this.n = list;
        ArrayList arrayList = new ArrayList();
        if (this.n.size() > 1) {
            List<SummarizedLineUsageItem> list2 = this.n;
            arrayList.add(a(list2.get(list2.size() - 2)));
        } else if (this.c.e()) {
            String mesaureUnitId = list.get(0).getMesaureUnitId();
            char c = 65535;
            switch (mesaureUnitId.hashCode()) {
                case 1507426:
                    if (mesaureUnitId.equals("1003")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1508385:
                    if (mesaureUnitId.equals("1101")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1508390:
                    if (mesaureUnitId.equals("1106")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1508393:
                    if (mesaureUnitId.equals("1109")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                arrayList.add(e());
            } else if (c == 1) {
                arrayList.add(f());
            } else if (c == 2) {
                arrayList.add(f());
            } else if (c == 3) {
                arrayList.add(g());
            }
        } else {
            arrayList.add(d());
        }
        if (this.n.size() != 0) {
            List<SummarizedLineUsageItem> list3 = this.n;
            arrayList.add(a(list3.get(list3.size() - 1)));
        }
        for (int i = 0; i < this.n.size(); i++) {
            arrayList.add(a(this.n.get(i)));
        }
        cxg a2 = a(this.n.get(0));
        a2.a = false;
        arrayList.add(a2);
        if (this.n.size() > 1) {
            arrayList.add(a(this.n.get(1)));
        } else if (this.n.size() != 0) {
            arrayList.add(a(this.n.get(0)));
        }
        this.m = arrayList;
    }

    private cxg b(float f) {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_money_active;
        cxgVar.c = R.drawable.ico_tabbar_money_default;
        cxgVar.e = this.a.getString(R.string.balance);
        if (f == -1.0f) {
            cxgVar.d = "0" + this.a.getString(R.string.blance_egp);
            cxgVar.g = 0;
            cxgVar.a = true;
        } else {
            cxgVar.d = djm.a(f) + this.a.getString(R.string.blance_egp);
            cxgVar.g = 100;
        }
        cxgVar.f = a(this.e.k(), R.string.remaining_balance);
        this.m.add(cxgVar);
        return cxgVar;
    }

    private cxg c() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_internet_active;
        cxgVar.c = R.drawable.ico_tabbar_internet_default;
        cxgVar.e = this.a.getString(R.string.mobile_Internet_remaining);
        cxgVar.d = this.a.getString(R.string.mobile_internet_not_available);
        cxgVar.g = 0;
        cxgVar.a = true;
        cxgVar.f = "";
        this.m.add(cxgVar);
        return cxgVar;
    }

    private void a(SummarizedLineUsageItem summarizedLineUsageItem, cxg cxgVar, Boolean bool, String str) {
        if (bool.booleanValue()) {
            if (str.equals("110022")) {
                cxgVar.f = "";
                cxgVar.d = this.b.f() ? summarizedLineUsageItem.getGroupArName() : summarizedLineUsageItem.getGroupEnName();
                return;
            }
            cxgVar.f = this.b.f() ? summarizedLineUsageItem.getMeasureUnitArName() : summarizedLineUsageItem.getMeasureUnitEnName();
            cxgVar.d = String.valueOf((int) summarizedLineUsageItem.getInitialTotalAmount());
            return;
        }
        if (summarizedLineUsageItem.getFreeAmount() % 1.0f == 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append((int) summarizedLineUsageItem.getFreeAmount());
            sb.append(" ");
            sb.append(this.b.f() ? summarizedLineUsageItem.getMeasureUnitArName() : summarizedLineUsageItem.getMeasureUnitEnName());
            cxgVar.d = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(summarizedLineUsageItem.getFreeAmount());
            sb2.append(" ");
            sb2.append(this.b.f() ? summarizedLineUsageItem.getMeasureUnitArName() : summarizedLineUsageItem.getMeasureUnitEnName());
            cxgVar.d = sb2.toString();
        }
        if (summarizedLineUsageItem.getInitialTotalAmount() % 1.0f == 0.0f) {
            cxgVar.f = a(this.e.k(), R.string.remaining_of) + ((int) summarizedLineUsageItem.getInitialTotalAmount());
            return;
        }
        cxgVar.f = a(this.e.k(), R.string.remaining_of) + summarizedLineUsageItem.getInitialTotalAmount();
    }

    private String a(String str, int i) {
        Resources resources = this.a.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = new Locale(str);
        resources.updateConfiguration(configuration, null);
        return resources.getString(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r2.equals("1106") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private defpackage.cxg a(com.ucare.we.model.usagedetails.SummarizedLineUsageItem r12) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxf.a(com.ucare.we.model.usagedetails.SummarizedLineUsageItem):cxg");
    }

    public final int b(int i) {
        List<cxg> list = this.m;
        if (list == null || list.size() <= i || this.m.size() <= 0) {
            return 0;
        }
        if (this.m.get(i).h != null && this.m.get(i).h.longValue() != 110022) {
            return this.m.get(i).g;
        }
        return -1;
    }

    public final cxg c(int i) {
        List<cxg> list = this.m;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.m.get(i);
    }

    public final void d(int i) {
        List<cxg> list = this.m;
        if (list != null) {
            list.clear();
            if (i == -1) {
                a();
            } else {
                b();
            }
        }
    }

    public final void a() {
        e();
        c();
        g();
        notifyDataSetChanged();
        this.j = false;
    }

    public final void b() {
        d();
        b(-1.0f);
        d();
        notifyDataSetChanged();
        this.j = false;
    }

    private cxg d() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_money_active;
        cxgVar.c = R.drawable.ico_tabbar_money_default;
        cxgVar.f = this.a.getString(R.string.remaining_of);
        cxgVar.e = this.a.getString(R.string.balance);
        cxgVar.d = this.a.getString(R.string.remaining_of);
        this.m.add(cxgVar);
        return cxgVar;
    }

    private cxg e() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_phone_active;
        cxgVar.c = R.drawable.ico_tabbar_phone_default;
        cxgVar.e = this.a.getString(R.string.voice_calls);
        this.m.add(cxgVar);
        return cxgVar;
    }

    private cxg f() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_internet_active;
        cxgVar.c = R.drawable.ico_tabbar_internet_default;
        cxgVar.e = this.a.getString(R.string.home_internet);
        this.m.add(cxgVar);
        return cxgVar;
    }

    private cxg g() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_sms_dashboard_active;
        cxgVar.c = R.drawable.ico_tabbar_sms_dashboard_default;
        cxgVar.e = this.a.getString(R.string.SMS);
        this.m.add(cxgVar);
        return cxgVar;
    }

    /* renamed from: cxf$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        private final TextView b;
        private final TextView c;
        private final TextView d;
        private final ImageView e;
        private final LinearLayout f;

        /* synthetic */ a(cxf cxfVar, View view, byte b) {
            this(view);
        }

        private a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.slider_text_small);
            this.c = (TextView) view.findViewById(R.id.slider_text_medium);
            this.d = (TextView) view.findViewById(R.id.slider_text_large);
            this.e = (ImageView) view.findViewById(R.id.slider_icon);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content);
            this.f = linearLayout;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            cxf.this.i = Resources.getSystem().getDisplayMetrics().widthPixels;
            layoutParams.width = cxf.this.i / 3;
            this.f.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_screen_slide_page, viewGroup, false), (byte) 0);
    }
}
