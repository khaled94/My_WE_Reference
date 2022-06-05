package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ucare.we.R;
import com.ucare.we.model.UserCredentials;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0002/0B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fJ\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010(\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\"\u0010)\u001a\u00020\u001b2\u001a\u0010*\u001a\u0016\u0012\u0004\u0012\u00020,\u0018\u00010+j\n\u0012\u0004\u0012\u00020,\u0018\u0001`-J\u0006\u0010.\u001a\u00020\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ucare/we/switchaccount/SwitchAccountBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "repository", "Lcom/ucare/we/util/prefs/Repository;", "(Lcom/ucare/we/util/prefs/Repository;)V", "addAccountClickListener", "Landroid/view/View$OnClickListener;", "getAddAccountClickListener", "()Landroid/view/View$OnClickListener;", "setAddAccountClickListener", "(Landroid/view/View$OnClickListener;)V", "addAccountContainer", "Landroid/view/View;", "btnAddAccount", "Landroid/widget/Button;", "containerView", "iSwitchAccountListener", "Lcom/ucare/we/switchaccount/SwitchAccountBottomSheet$ISwitchAccountListener;", "myAccountAdapter", "Lcom/ucare/we/switchaccount/adapter/MyAccountsAdapter;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "rvAccount", "Landroidx/recyclerview/widget/RecyclerView;", "tvNoAccount", "Landroid/widget/TextView;", "initializeViews", "", "view", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "renderAccounts", "data", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/UserCredentials;", "Lkotlin/collections/ArrayList;", "setListeners", "Companion", "ISwitchAccountListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dis */
/* loaded from: classes2.dex */
public final class dis extends BottomSheetDialogFragment {
    public static final a a = new a((byte) 0);
    private final djw b;
    private RecyclerView c;
    private dit d;
    private Button e;
    private TextView f;
    private View g;
    private View h;
    private b i;
    private View.OnClickListener j = new View.OnClickListener() { // from class: -$$Lambda$dis$cKbS32zvR70BPcdsF7TVD7iB8RQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dis.lambda$cKbS32zvR70BPcdsF7TVD7iB8RQ(dis.this, view);
        }
    };

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/ucare/we/switchaccount/SwitchAccountBottomSheet$ISwitchAccountListener;", "", "onAddAccountClickListener", "", "onDeleteAccountClickListener", "account", "Lcom/ucare/we/model/UserCredentials;", "onSelectAccountClickListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dis$b */
    /* loaded from: classes2.dex */
    public interface b {
        void b();

        void b(UserCredentials userCredentials);

        void b_(UserCredentials userCredentials);
    }

    /* renamed from: lambda$Wx5l-1vYtoigpQ3dZO3XoI7uyrA */
    public static /* synthetic */ void m116lambda$Wx5l1vYtoigpQ3dZO3XoI7uyrA(dis disVar, DialogInterface dialogInterface) {
        a(disVar, dialogInterface);
    }

    public static /* synthetic */ void lambda$cKbS32zvR70BPcdsF7TVD7iB8RQ(dis disVar, View view) {
        a(disVar, view);
    }

    /* renamed from: lambda$q-3gIIpwF8dCkqw50qwuSI5AUD4 */
    public static /* synthetic */ void m117lambda$q3gIIpwF8dCkqw50qwuSI5AUD4(dis disVar, View view) {
        b(disVar, view);
    }

    public dis(djw djwVar) {
        dqc.d(djwVar, "repository");
        this.b = djwVar;
    }

    public static final void a(dis disVar, View view) {
        dqc.d(disVar, "this$0");
        b bVar = disVar.i;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.BottomSheetDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dqc.d(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.switch_account_bottom_sheet, viewGroup, false);
        ((ConstraintLayout) inflate.findViewById(R.id.container)).setMaxHeight((int) (getResources().getDisplayMetrics().heightPixels * 0.7d));
        ((ConstraintLayout) inflate.findViewById(R.id.childContainer)).setMaxHeight((int) ((getResources().getDisplayMetrics().heightPixels * 0.7d) - (inflate.findViewById(R.id.btn_add_account_container).getHeight() + djr.a(32))));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        dqc.d(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        ArrayList parcelableArrayList = arguments == null ? null : arguments.getParcelableArrayList("SwitchAccountBottomSheet");
        dqc.d(view, "view");
        View findViewById = view.findViewById(R.id.rv_account);
        dqc.b(findViewById, "view.findViewById(R.id.rv_account)");
        this.c = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.btn_add_account);
        dqc.b(findViewById2, "view.findViewById(R.id.btn_add_account)");
        this.e = (Button) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_no_accounts);
        dqc.b(findViewById3, "view.findViewById(R.id.tv_no_accounts)");
        this.f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.container);
        dqc.b(findViewById4, "view.findViewById(R.id.container)");
        this.g = findViewById4;
        View findViewById5 = view.findViewById(R.id.btn_add_account_container);
        dqc.b(findViewById5, "view.findViewById(R.id.btn_add_account_container)");
        this.h = findViewById5;
        Button button = this.e;
        if (button == null) {
            dqc.a("btnAddAccount");
            throw null;
        }
        button.setOnClickListener(this.j);
        ArrayList arrayList = parcelableArrayList;
        if (arrayList == null || arrayList.isEmpty()) {
            TextView textView = this.f;
            if (textView != null) {
                textView.setVisibility(0);
                return;
            } else {
                dqc.a("tvNoAccount");
                throw null;
            }
        }
        TextView textView2 = this.f;
        if (textView2 == null) {
            dqc.a("tvNoAccount");
            throw null;
        }
        textView2.setVisibility(8);
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            dqc.a("rvAccount");
            throw null;
        }
        Context context = getContext();
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 == null) {
            dqc.a("rvAccount");
            throw null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
        if (layoutManager != null) {
            recyclerView.addItemDecoration(new diy(context, ((LinearLayoutManager) layoutManager).getOrientation()));
            dit ditVar = new dit(this.b);
            this.d = ditVar;
            RecyclerView recyclerView3 = this.c;
            if (recyclerView3 == null) {
                dqc.a("rvAccount");
                throw null;
            } else if (ditVar == null) {
                dqc.a("myAccountAdapter");
                throw null;
            } else {
                recyclerView3.setAdapter(ditVar);
                dit ditVar2 = this.d;
                if (ditVar2 == null) {
                    dqc.a("myAccountAdapter");
                    throw null;
                }
                ditVar2.submitList(parcelableArrayList);
                dit ditVar3 = this.d;
                if (ditVar3 == null) {
                    dqc.a("myAccountAdapter");
                    throw null;
                }
                c cVar = new c();
                dqc.d(cVar, "<set-?>");
                ditVar3.b = cVar;
                dit ditVar4 = this.d;
                if (ditVar4 == null) {
                    dqc.a("myAccountAdapter");
                    throw null;
                }
                d dVar = new d();
                dqc.d(dVar, "<set-?>");
                ditVar4.c = dVar;
                Dialog dialog = getDialog();
                if (dialog == null) {
                    return;
                }
                dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: -$$Lambda$dis$Wx5l-1vYtoigpQ3dZO3XoI7uyrA
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        dis.m116lambda$Wx5l1vYtoigpQ3dZO3XoI7uyrA(dis.this, dialogInterface);
                    }
                });
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "account", "Lcom/ucare/we/model/UserCredentials;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dis$c */
    /* loaded from: classes2.dex */
    static final class c extends dqd implements dow<UserCredentials, dmg> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            dis.this = r1;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(UserCredentials userCredentials) {
            UserCredentials userCredentials2 = userCredentials;
            dqc.d(userCredentials2, "account");
            b bVar = dis.this.i;
            if (bVar != null) {
                bVar.b_(userCredentials2);
            }
            return dmg.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "account", "Lcom/ucare/we/model/UserCredentials;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dis$d */
    /* loaded from: classes2.dex */
    static final class d extends dqd implements dow<UserCredentials, dmg> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(1);
            dis.this = r1;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(UserCredentials userCredentials) {
            UserCredentials userCredentials2 = userCredentials;
            dqc.d(userCredentials2, "account");
            b bVar = dis.this.i;
            if (bVar != null) {
                bVar.b(userCredentials2);
            }
            return dmg.a;
        }
    }

    public static final void a(dis disVar, DialogInterface dialogInterface) {
        dqc.d(disVar, "this$0");
        if (dialogInterface != null) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialogInterface;
            Window window = bottomSheetDialog.getWindow();
            dqc.a(window);
            window.getAttributes();
            Window window2 = bottomSheetDialog.getWindow();
            dqc.a(window2);
            window2.setBackgroundDrawableResource(R.drawable.blur_background);
            final View findViewById = bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
            if (findViewById == null) {
                return;
            }
            BottomSheetBehavior from = BottomSheetBehavior.from(findViewById);
            dqc.b(from, "from(this)");
            from.setPeekHeight((int) (findViewById.getResources().getDisplayMetrics().heightPixels * 0.5d));
            e eVar = new e(findViewById);
            findViewById.post(new Runnable() { // from class: -$$Lambda$dis$q-3gIIpwF8dCkqw50qwuSI5AUD4
                @Override // java.lang.Runnable
                public final void run() {
                    dis.m117lambda$q3gIIpwF8dCkqw50qwuSI5AUD4(dis.this, findViewById);
                }
            });
            dmg dmgVar = dmg.a;
            from.addBottomSheetCallback(eVar);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ucare/we/switchaccount/SwitchAccountBottomSheet$renderAccounts$3$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "view", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "v", "state", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dis$e */
    /* loaded from: classes2.dex */
    public static final class e extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ View b;

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(View view, int i) {
            dqc.d(view, "v");
        }

        e(View view) {
            dis.this = r1;
            this.b = view;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(View view, float f) {
            dqc.d(view, "view");
            View view2 = dis.this.h;
            if (view2 == null) {
                dqc.a("addAccountContainer");
                throw null;
            }
            ViewParent parent = this.b.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            int height = ((View) parent).getHeight() - this.b.getTop();
            View view3 = dis.this.h;
            if (view3 != null) {
                view2.setY(height - view3.getHeight());
            } else {
                dqc.a("addAccountContainer");
                throw null;
            }
        }
    }

    public static final void b(dis disVar, View view) {
        dqc.d(disVar, "this$0");
        View view2 = disVar.h;
        if (view2 == null) {
            dqc.a("addAccountContainer");
            throw null;
        }
        ViewParent parent = view.getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        int height = ((View) parent).getHeight() - view.getTop();
        View view3 = disVar.h;
        if (view3 != null) {
            view2.setY(height - view3.getHeight());
        } else {
            dqc.a("addAccountContainer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        dqc.d(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.i = (b) parentFragment;
            return;
        }
        try {
            this.i = (b) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ucare/we/switchaccount/SwitchAccountBottomSheet$Companion;", "", "()V", "TAG", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dis$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }
}
