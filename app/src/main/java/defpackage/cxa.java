package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

/* renamed from: cxa  reason: default package */
/* loaded from: classes2.dex */
public final class cxa extends RecyclerView.Adapter<a> {
    public cwq a;
    @Inject
    Context b;
    @Inject
    djb c;
    @Inject
    dio d;
    @Inject
    dhn e;
    @Inject
    djw f;
    int h;
    int i;
    int j;
    public int k;
    public String m;
    public String n;
    public String o;
    public String p;
    public Long q;
    dcv r;
    public List<SummarizedLineUsageItem> t;
    private final String u = cxf.class.getSimpleName();
    int g = -1;
    boolean l = true;
    public List<cxg> s = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        List<cxg> list = this.s;
        if (list != null) {
            cxg cxgVar = list.get(i);
            if (cxgVar.a) {
                aVar2.e.setImageResource(cxgVar.b);
                aVar2.d.setText(cxgVar.d);
                aVar2.b.setText(cxgVar.f);
                aVar2.d.setVisibility(8);
                aVar2.b.setVisibility(8);
                aVar2.c.setVisibility(0);
                aVar2.f.setPadding(0, 0, 0, 0);
                aVar2.f.setAlpha(1.0f);
                if (this.g == i && (i == this.s.size() - 2 || i == 1)) {
                    return;
                }
                this.g = i;
                return;
            }
            aVar2.e.setImageResource(cxgVar.c);
            aVar2.c.setText(cxgVar.e);
            aVar2.c.setVisibility(0);
            aVar2.d.setVisibility(8);
            aVar2.b.setVisibility(8);
            if ((i != 0 && i != this.s.size() - 1) || !this.d.a()) {
                aVar2.f.setAlpha(1.0f);
            }
            this.h = (int) this.b.getResources().getDimension(R.dimen.slider_height);
            this.i = 0;
            if (this.c.f()) {
                if (i == 0 || !this.s.get(i - 1).a) {
                    aVar2.f.setPadding(this.i, 0, 0, 0);
                    return;
                }
            } else if (i != 0 && this.s.get(i - 1).a) {
                aVar2.f.setPadding(this.i, 0, 0, 0);
                return;
            }
            aVar2.f.setPadding(0, 0, this.i, 0);
        }
    }

    public cxa(dcv dcvVar, cwq cwqVar) {
        this.r = dcvVar;
        dad.a().a.inject(this);
        this.a = cwqVar;
    }

    public final void a(int i) {
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            if (i2 == i) {
                this.s.get(i).a = true;
            } else {
                this.s.get(i2).a = false;
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<cxg> list = this.s;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void a(float f) {
        new cxg();
        List<cxg> list = this.s;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.s.size(); i++) {
            if (this.s.get(i).f != null && this.s.get(i).f.equalsIgnoreCase(this.b.getString(R.string.remaining_balance))) {
                cxg cxgVar = this.s.get(i);
                NumberFormat numberFormat = NumberFormat.getInstance(new Locale("en", "US"));
                ((DecimalFormat) numberFormat).applyPattern("##.##");
                if (f == -1.0f) {
                    cxgVar.d = this.b.getString(R.string.navheader_blance_egp);
                    cxgVar.g = 0;
                } else {
                    cxgVar.g = 100;
                    cxgVar.d = numberFormat.format(f) + this.b.getString(R.string.blance_egp);
                }
                this.l = true;
                this.s.set(i, cxgVar);
            }
        }
        notifyDataSetChanged();
    }

    public final void a(List<SummarizedLineUsageItem> list) {
        this.t = list;
        ArrayList arrayList = new ArrayList();
        if (this.t.size() > 1) {
            List<SummarizedLineUsageItem> list2 = this.t;
            arrayList.add(a(list2.get(list2.size() - 2)));
        } else if (this.d.e()) {
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
                arrayList.add(c());
            } else if (c == 1) {
                arrayList.add(d());
            } else if (c == 2) {
                arrayList.add(d());
            } else if (c == 3) {
                arrayList.add(f());
            }
        } else {
            cxg cxgVar = new cxg();
            cxgVar.b = R.drawable.ico_tabbar_money_active;
            cxgVar.c = R.drawable.ico_tabbar_money_default;
            cxgVar.f = this.b.getString(R.string.remaining_of);
            cxgVar.e = this.b.getString(R.string.balance);
            cxgVar.d = this.b.getString(R.string.remaining_of);
            this.s.add(cxgVar);
            arrayList.add(cxgVar);
        }
        if (this.t.size() != 0) {
            List<SummarizedLineUsageItem> list3 = this.t;
            arrayList.add(a(list3.get(list3.size() - 1)));
        }
        for (int i = 0; i < this.t.size(); i++) {
            arrayList.add(a(this.t.get(i)));
        }
        cxg a2 = a(this.t.get(0));
        a2.a = false;
        arrayList.add(a2);
        if (this.t.size() > 1) {
            arrayList.add(a(this.t.get(1)));
        } else if (this.t.size() != 0) {
            arrayList.add(a(this.t.get(0)));
        }
        this.s = arrayList;
    }

    public final void b(List<SummarizedLineUsageItem> list) {
        this.t = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, e());
        for (int i = 0; i < this.t.size(); i++) {
            arrayList.add(a(this.t.get(i)));
        }
        arrayList.add(e());
        this.s = arrayList;
    }

    private cxg b() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_internet_active;
        cxgVar.c = R.drawable.ico_tabbar_internet_default;
        cxgVar.e = this.b.getString(R.string.mobile_Internet_remaining);
        cxgVar.d = this.b.getString(R.string.mobile_internet_not_available);
        cxgVar.g = 0;
        cxgVar.a = true;
        cxgVar.f = "";
        this.s.add(cxgVar);
        return cxgVar;
    }

    private void a(SummarizedLineUsageItem summarizedLineUsageItem, cxg cxgVar, Boolean bool) {
        if (!bool.booleanValue()) {
            if (summarizedLineUsageItem.getFreeAmount() % 1.0f == 0.0f) {
                cxgVar.d = String.valueOf((int) summarizedLineUsageItem.getFreeAmount());
                cxgVar.i = this.c.f() ? summarizedLineUsageItem.getMeasureUnitArName() : summarizedLineUsageItem.getMeasureUnitEnName();
            } else {
                cxgVar.d = String.valueOf((int) summarizedLineUsageItem.getFreeAmount());
                cxgVar.i = this.c.f() ? summarizedLineUsageItem.getMeasureUnitArName() : summarizedLineUsageItem.getMeasureUnitEnName();
            }
            summarizedLineUsageItem.getInitialTotalAmount();
            cxgVar.f = String.valueOf((int) summarizedLineUsageItem.getInitialTotalAmount());
            return;
        }
        cxgVar.f = this.c.f() ? summarizedLineUsageItem.getMeasureUnitArName() : summarizedLineUsageItem.getMeasureUnitEnName();
        cxgVar.d = String.valueOf((int) summarizedLineUsageItem.getInitialTotalAmount());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r2.equals("1106") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private defpackage.cxg a(com.ucare.we.model.usagedetails.SummarizedLineUsageItem r10) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxa.a(com.ucare.we.model.usagedetails.SummarizedLineUsageItem):cxg");
    }

    public final void a() {
        c();
        b();
        f();
        notifyDataSetChanged();
        this.l = false;
    }

    private cxg c() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_phone_active;
        cxgVar.c = R.drawable.ico_tabbar_phone_default;
        cxgVar.e = this.b.getString(R.string.voice_calls);
        this.s.add(cxgVar);
        return cxgVar;
    }

    private cxg d() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_internet_active;
        cxgVar.c = R.drawable.ico_tabbar_internet_default;
        cxgVar.e = this.b.getString(R.string.home_internet);
        this.s.add(cxgVar);
        return cxgVar;
    }

    private cxg e() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.transparent_image;
        cxgVar.h = 0L;
        cxgVar.c = R.drawable.transparent_image;
        cxgVar.e = "";
        this.s.add(cxgVar);
        return cxgVar;
    }

    private cxg f() {
        cxg cxgVar = new cxg();
        cxgVar.b = R.drawable.ico_tabbar_sms_dashboard_active;
        cxgVar.c = R.drawable.ico_tabbar_sms_dashboard_default;
        cxgVar.e = this.b.getString(R.string.SMS);
        this.s.add(cxgVar);
        return cxgVar;
    }

    /* renamed from: cxa$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        private final TextView b;
        private final TextView c;
        private final TextView d;
        private final ImageView e;
        private final LinearLayout f;

        /* synthetic */ a(cxa cxaVar, View view, byte b) {
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
            cxa.this.j = Resources.getSystem().getDisplayMetrics().widthPixels;
            layoutParams.width = cxa.this.j / 3;
            this.f.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_screen_slide_page, viewGroup, false), (byte) 0);
    }
}
