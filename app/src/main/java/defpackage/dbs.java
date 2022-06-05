package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.newHome.features.home.CustomLinearLayoutManager;
import defpackage.dbu;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010I\u001a\u00020JH\u0002J\u001a\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010P\u001a\u00020J2\u0006\u0010Q\u001a\u00020$H\u0002J\b\u0010R\u001a\u00020\u0002H\u0016R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u000e\u0010,\u001a\u00020-X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020/X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u001a\u0010C\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010&\"\u0004\bE\u0010(R!\u0010F\u001a\u0012\u0012\u0004\u0012\u00020G0\u0005j\b\u0012\u0004\u0012\u00020G`\u0007¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\t¨\u0006S"}, d2 = {"Lcom/ucare/we/newHome/features/home/HomeNewFragment;", "Lcom/ucare/we/newHome/core/platfrom/BaseFragment;", "Lcom/ucare/we/databinding/FragmentHomeBinding;", "()V", "New_form_list", "Ljava/util/ArrayList;", "Lcom/ucare/mywe/domain/entities/remote/movie/HomeNewFormItem;", "Lkotlin/collections/ArrayList;", "getNew_form_list", "()Ljava/util/ArrayList;", "adapter", "Lcom/ucare/we/newHome/features/home/HomeTablayoutAdapter;", "arrow_left", "Landroid/widget/ImageView;", "getArrow_left", "()Landroid/widget/ImageView;", "setArrow_left", "(Landroid/widget/ImageView;)V", "arrow_right", "getArrow_right", "setArrow_right", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "callback", "Lcom/ucare/we/newHome/features/home/MiddleItemFinder$MiddleItemCallback;", "getCallback", "()Lcom/ucare/we/newHome/features/home/MiddleItemFinder$MiddleItemCallback;", "setCallback", "(Lcom/ucare/we/newHome/features/home/MiddleItemFinder$MiddleItemCallback;)V", "customManager", "Lcom/ucare/we/newHome/features/home/CustomLinearLayoutManager;", "endScrollingPosition", "", "getEndScrollingPosition", "()I", "setEndScrollingPosition", "(I)V", "lastIterationPosition", "getLastIterationPosition", "setLastIterationPosition", "new_form_adapter", "Lcom/ucare/we/newHome/features/home/HomeNewFormAdapter;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "rv_new_form", "Landroidx/recyclerview/widget/RecyclerView;", "getRv_new_form", "()Landroidx/recyclerview/widget/RecyclerView;", "setRv_new_form", "(Landroidx/recyclerview/widget/RecyclerView;)V", "rv_tablayout", "getRv_tablayout", "setRv_tablayout", "startScrollingPosition", "getStartScrollingPosition", "setStartScrollingPosition", "users", "Lcom/ucare/mywe/domain/entities/remote/movie/HomeTabItem;", "getUsers", "initUi", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "progressBarAnimate", "position", "viewBinding", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dbs */
/* loaded from: classes2.dex */
public final class dbs extends dbm<cyn> {
    @Inject
    public dio b;
    @Inject
    public djw c;
    public ImageView d;
    public ImageView e;
    public ProgressBar h;
    private dbt j;
    private dbr k;
    private CustomLinearLayoutManager l;
    private RecyclerView o;
    private RecyclerView p;
    private final ArrayList<cwa> m = new ArrayList<>();
    private final ArrayList<cvz> n = new ArrayList<>();
    private int q = 1;
    int f = 1;
    int g = 1;
    dbu.a i = new dbu.a() { // from class: -$$Lambda$dbs$dxuUS-OLC8xzlwU4mn2zAW90lmk
        @Override // defpackage.dbu.a
        public final void scrollFinished(int i) {
            dbs.m99lambda$dxuUSOLC8xzlwU4mn2zAW90lmk(dbs.this, i);
        }
    };

    public static /* synthetic */ void lambda$BebaolZlYL2rf5utEK2e12oSGnU(dbs dbsVar, View view) {
        a(dbsVar, view);
    }

    /* renamed from: lambda$dxuUS-OLC8xzlwU4mn2zAW90lmk */
    public static /* synthetic */ void m99lambda$dxuUSOLC8xzlwU4mn2zAW90lmk(dbs dbsVar, int i) {
        a(dbsVar, i);
    }

    public static /* synthetic */ void lambda$mZ871IKl4x5wZeTxDEl9FQN9m74(dbs dbsVar, View view) {
        b(dbsVar, view);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        dqc.d(view, "view");
        super.onViewCreated(view, bundle);
        cyn a2 = a();
        a2.aq.setText("Ahmed");
        a2.ah.setText("0235371722");
        this.p = (RecyclerView) view.findViewById(R.id.home_new_form_rv);
        View findViewById = view.findViewById(R.id.ic_right_arrow);
        dqc.b(findViewById, "view.findViewById(R.id.ic_right_arrow)");
        ImageView imageView = (ImageView) findViewById;
        dqc.d(imageView, "<set-?>");
        this.d = imageView;
        View findViewById2 = view.findViewById(R.id.ic_left_arrow);
        dqc.b(findViewById2, "view.findViewById(R.id.ic_left_arrow)");
        ImageView imageView2 = (ImageView) findViewById2;
        dqc.d(imageView2, "<set-?>");
        this.e = imageView2;
        View findViewById3 = view.findViewById(R.id.progressBar);
        dqc.b(findViewById3, "view.findViewById(R.id.progressBar)");
        ProgressBar progressBar = (ProgressBar) findViewById3;
        dqc.d(progressBar, "<set-?>");
        this.h = progressBar;
        this.m.add(new cwa("1", "Family Plan"));
        this.m.add(new cwa(ExifInterface.GPS_MEASUREMENT_2D, "Minutes"));
        this.m.add(new cwa(ExifInterface.GPS_MEASUREMENT_3D, "Home Internet"));
        this.m.add(new cwa("4", "Home Internet"));
        this.m.add(new cwa("4", "Minutes"));
        this.n.add(new cvz("1", "Family Plan"));
        this.n.add(new cvz(ExifInterface.GPS_MEASUREMENT_2D, "Minutes"));
        this.n.add(new cvz(ExifInterface.GPS_MEASUREMENT_3D, "Home Internet"));
        this.l = new CustomLinearLayoutManager(getActivity());
        RecyclerView recyclerView = this.o;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        }
        RecyclerView recyclerView2 = this.p;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        }
        dbt dbtVar = new dbt(this.m);
        this.j = dbtVar;
        RecyclerView recyclerView3 = this.o;
        if (recyclerView3 != null) {
            if (dbtVar == null) {
                dqc.a("adapter");
                throw null;
            }
            recyclerView3.setAdapter(dbtVar);
        }
        dbr dbrVar = new dbr(this.n);
        this.k = dbrVar;
        RecyclerView recyclerView4 = this.p;
        if (recyclerView4 != null) {
            if (dbrVar == null) {
                dqc.a("new_form_adapter");
                throw null;
            }
            recyclerView4.setAdapter(dbrVar);
        }
        new LinearSnapHelper().attachToRecyclerView(this.o);
        new PagerSnapHelper().attachToRecyclerView(this.p);
        RecyclerView recyclerView5 = this.o;
        if (recyclerView5 != null) {
            recyclerView5.addOnScrollListener(new a());
        }
        ImageView imageView3 = this.d;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dbs$BebaolZlYL2rf5utEK2e12oSGnU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dbs.lambda$BebaolZlYL2rf5utEK2e12oSGnU(dbs.this, view2);
                }
            });
            ImageView imageView4 = this.e;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dbs$mZ871IKl4x5wZeTxDEl9FQN9m74
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        dbs.lambda$mZ871IKl4x5wZeTxDEl9FQN9m74(dbs.this, view2);
                    }
                });
                return;
            } else {
                dqc.a("arrow_left");
                throw null;
            }
        }
        dqc.a("arrow_right");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ucare/we/newHome/features/home/HomeNewFragment$initUi$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dbs$a */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        a() {
            dbs.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            dqc.d(recyclerView, "recyclerView");
            if (dbs.this.f >= 0 && i != 0) {
                dbt dbtVar = dbs.this.j;
                if (dbtVar == null) {
                    dqc.a("adapter");
                    throw null;
                }
                dbtVar.notifyDataSetChanged();
            }
            if (i == 0) {
                dbs.this.g = 1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            dqc.d(recyclerView, "recyclerView");
            if (i == 0) {
                Context context = dbs.this.getContext();
                CustomLinearLayoutManager customLinearLayoutManager = dbs.this.l;
                if (customLinearLayoutManager != null) {
                    new dbu(context, customLinearLayoutManager, dbs.this.i);
                } else {
                    dqc.a("customManager");
                    throw null;
                }
            }
        }
    }

    public static final void a(dbs dbsVar, int i) {
        dqc.d(dbsVar, "this$0");
        String.valueOf(i);
        ProgressBar progressBar = dbsVar.h;
        if (progressBar != null) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", 0, 80);
            dbsVar.a().Q.setText(dbsVar.m.get(i).a);
            ofInt.setDuration(4000L);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.start();
            Toast.makeText(dbsVar.getContext(), String.valueOf(i), 1);
            return;
        }
        dqc.a("progressBar");
        throw null;
    }

    public static final void a(dbs dbsVar, View view) {
        dqc.d(dbsVar, "this$0");
        RecyclerView recyclerView = dbsVar.o;
        if (recyclerView != null) {
            recyclerView.smoothScrollBy(-160, 0);
        }
    }

    public static final void b(dbs dbsVar, View view) {
        dqc.d(dbsVar, "this$0");
        RecyclerView recyclerView = dbsVar.o;
        if (recyclerView != null) {
            recyclerView.smoothScrollBy(160, 0);
        }
    }

    @Override // defpackage.dbm
    public final /* synthetic */ cyn b() {
        cyn a2 = cyn.a(getLayoutInflater());
        dqc.b(a2, "inflate(layoutInflater)");
        return a2;
    }
}
