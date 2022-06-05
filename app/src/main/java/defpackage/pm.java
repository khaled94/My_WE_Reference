package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import defpackage.pq;
import defpackage.qk;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u001c\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/FacebookDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "innerDialog", "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "setInnerDialog", "(Landroid/app/Dialog;)V", "initDialog", "", "initDialog$facebook_common_release", "onCompleteWebDialog", "values", "Landroid/os/Bundle;", "error", "Lcom/facebook/FacebookException;", "onCompleteWebFallbackDialog", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "onCreateDialog", "onDestroyView", "onResume", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pm  reason: default package */
/* loaded from: classes2.dex */
public final class pm extends DialogFragment {
    public static final a b = new a((byte) 0);
    public Dialog a;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity activity;
        pq pqVar;
        super.onCreate(bundle);
        if (this.a != null || (activity = getActivity()) == null) {
            return;
        }
        dqc.b(activity, "activity ?: return");
        Intent intent = activity.getIntent();
        dqc.b(intent, "intent");
        Bundle a2 = qd.a(intent);
        String str = null;
        Bundle bundle2 = null;
        if (!(a2 != null ? a2.getBoolean("is_fallback", false) : false)) {
            String string = a2 != null ? a2.getString("action") : null;
            if (a2 != null) {
                bundle2 = a2.getBundle("params");
            }
            if (qi.a(string)) {
                qi.a();
                activity.finish();
                return;
            }
            FragmentActivity fragmentActivity = activity;
            if (string != null) {
                qk.a aVar = new qk.a(fragmentActivity, string, bundle2);
                aVar.d = new b();
                pqVar = aVar.a();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            if (a2 != null) {
                str = a2.getString("url");
            }
            if (qi.a(str)) {
                qi.a();
                activity.finish();
                return;
            }
            dqi dqiVar = dqi.a;
            String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{ly.m()}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            pq.a aVar2 = pq.a;
            FragmentActivity fragmentActivity2 = activity;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            pqVar = pq.a.a(fragmentActivity2, str, format);
            pqVar.c = new c();
        }
        this.a = pqVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "values", "Landroid/os/Bundle;", "error", "Lcom/facebook/FacebookException;", "onComplete"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pm$b */
    /* loaded from: classes2.dex */
    static final class b implements qk.d {
        b() {
        }

        @Override // defpackage.qk.d
        public final void a(Bundle bundle, FacebookException facebookException) {
            pm.this.a(bundle, facebookException);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "values", "Landroid/os/Bundle;", "<anonymous parameter 1>", "Lcom/facebook/FacebookException;", "onComplete"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pm$c */
    /* loaded from: classes2.dex */
    static final class c implements qk.d {
        c() {
        }

        @Override // defpackage.qk.d
        public final void a(Bundle bundle, FacebookException facebookException) {
            pm.a(pm.this, bundle);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
            }
            return dialog;
        }
        a((Bundle) null, (FacebookException) null);
        setShowsDialog(false);
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        dqc.b(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.a;
        if (dialog instanceof qk) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((qk) dialog).a();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        dqc.d(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (!(this.a instanceof qk) || !isResumed()) {
            return;
        }
        Dialog dialog = this.a;
        if (dialog == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
        ((qk) dialog).a();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Bundle bundle, FacebookException facebookException) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        dqc.b(activity, "activity ?: return");
        Intent intent = activity.getIntent();
        dqc.b(intent, "fragmentActivity.intent");
        activity.setResult(facebookException == null ? -1 : 0, qd.a(intent, bundle, facebookException));
        activity.finish();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/FacebookDialogFragment$Companion;", "", "()V", "TAG", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pm$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void a(pm pmVar, Bundle bundle) {
        FragmentActivity activity = pmVar.getActivity();
        if (activity == null) {
            return;
        }
        dqc.b(activity, "activity ?: return");
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
