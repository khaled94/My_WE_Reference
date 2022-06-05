package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import defpackage.mu;
import defpackage.nk;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J%\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessLoggingEventListener;", "", "()V", "getOnClickListener", "Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnClickListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "getOnItemClickListener", "Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnItemClickListener;", "Landroid/widget/AdapterView;", "logEvent", "", "logEvent$facebook_core_release", "updateParameters", "parameters", "Landroid/os/Bundle;", "updateParameters$facebook_core_release", "AutoLoggingOnClickListener", "AutoLoggingOnItemClickListener", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ni  reason: default package */
/* loaded from: classes2.dex */
public final class ni {
    public static final ni a = new ni();

    private ni() {
    }

    public static final a a(no noVar, View view, View view2) {
        if (qx.a(ni.class)) {
            return null;
        }
        try {
            dqc.d(noVar, "mapping");
            dqc.d(view, "rootView");
            dqc.d(view2, "hostView");
            return new a(noVar, view, view2);
        } catch (Throwable th) {
            qx.a(th, ni.class);
            return null;
        }
    }

    public static final b a(no noVar, View view, AdapterView<?> adapterView) {
        if (qx.a(ni.class)) {
            return null;
        }
        try {
            dqc.d(noVar, "mapping");
            dqc.d(view, "rootView");
            dqc.d(adapterView, "hostView");
            return new b(noVar, view, adapterView);
        } catch (Throwable th) {
            qx.a(th, ni.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ni$c */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Bundle b;

        c(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                Context k = ly.k();
                mu.a aVar = mu.b;
                mu a = mu.a.a(k);
                a.a.a(this.a, this.b);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnClickListener;", "Landroid/view/View$OnClickListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "existingOnClickListener", "Ljava/lang/ref/WeakReference;", "supportCodelessLogging", "", "getSupportCodelessLogging", "()Z", "setSupportCodelessLogging", "(Z)V", "onClick", "", "view", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ni$a */
    /* loaded from: classes2.dex */
    public static final class a implements View.OnClickListener {
        boolean a = true;
        private no b;
        private WeakReference<View> c;
        private WeakReference<View> d;
        private View.OnClickListener e;

        public a(no noVar, View view, View view2) {
            dqc.d(noVar, "mapping");
            dqc.d(view, "rootView");
            dqc.d(view2, "hostView");
            this.b = noVar;
            this.c = new WeakReference<>(view2);
            this.d = new WeakReference<>(view);
            this.e = nt.g(view2);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (qx.a(this)) {
                return;
            }
            try {
                dqc.d(view, "view");
                View.OnClickListener onClickListener = this.e;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = this.d.get();
                View view3 = this.c.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                no noVar = this.b;
                if (noVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                }
                ni.b(noVar, view2, view3);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\bJ.\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnItemClickListener;", "Landroid/widget/AdapterView$OnItemClickListener;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "Landroid/widget/AdapterView;", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/widget/AdapterView;)V", "existingOnItemClickListener", "Ljava/lang/ref/WeakReference;", "supportCodelessLogging", "", "getSupportCodelessLogging", "()Z", "setSupportCodelessLogging", "(Z)V", "onItemClick", "", "parent", "view", "position", "", "id", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ni$b */
    /* loaded from: classes2.dex */
    public static final class b implements AdapterView.OnItemClickListener {
        boolean a = true;
        private no b;
        private WeakReference<AdapterView<?>> c;
        private WeakReference<View> d;
        private AdapterView.OnItemClickListener e;

        public b(no noVar, View view, AdapterView<?> adapterView) {
            dqc.d(noVar, "mapping");
            dqc.d(view, "rootView");
            dqc.d(adapterView, "hostView");
            this.b = noVar;
            this.c = new WeakReference<>(adapterView);
            this.d = new WeakReference<>(view);
            this.e = adapterView.getOnItemClickListener();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            dqc.d(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            View view2 = this.d.get();
            AdapterView<?> adapterView2 = this.c.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            ni.b(this.b, view2, adapterView2);
        }
    }

    public static final void b(no noVar, View view, View view2) {
        List<nk.b> list;
        if (qx.a(ni.class)) {
            return;
        }
        try {
            dqc.d(noVar, "mapping");
            dqc.d(view, "rootView");
            dqc.d(view2, "hostView");
            String str = noVar.a;
            nk.a aVar = nk.f;
            dqc.d(view, "rootView");
            dqc.d(view2, "hostView");
            Bundle bundle = new Bundle();
            if (noVar != null) {
                List<np> unmodifiableList = Collections.unmodifiableList(noVar.b);
                dqc.b(unmodifiableList, "Collections.unmodifiableList(parameters)");
                if (unmodifiableList != null) {
                    for (np npVar : unmodifiableList) {
                        if (npVar.b != null) {
                            if (npVar.b.length() > 0) {
                                bundle.putString(npVar.a, npVar.b);
                            }
                        }
                        if (npVar.c.size() > 0) {
                            if (dqc.a((Object) npVar.d, (Object) "relative")) {
                                nk.c.a aVar2 = nk.c.a;
                                List<nq> list2 = npVar.c;
                                String simpleName = view2.getClass().getSimpleName();
                                dqc.b(simpleName, "hostView.javaClass.simpleName");
                                list = aVar2.a(noVar, view2, list2, 0, -1, simpleName);
                            } else {
                                nk.c.a aVar3 = nk.c.a;
                                List<nq> list3 = npVar.c;
                                String simpleName2 = view.getClass().getSimpleName();
                                dqc.b(simpleName2, "rootView.javaClass.simpleName");
                                list = aVar3.a(noVar, view, list3, 0, -1, simpleName2);
                            }
                            Iterator<nk.b> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    nk.b next = it.next();
                                    if (next.a() != null) {
                                        String e = nt.e(next.a());
                                        if (e.length() > 0) {
                                            bundle.putString(npVar.a, e);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!qx.a(a)) {
                dqc.d(bundle, "parameters");
                String string = bundle.getString("_valueToSum");
                if (string != null) {
                    bundle.putDouble("_valueToSum", of.a(string));
                }
                bundle.putString("_is_fb_codeless", "1");
            }
            ly.a().execute(new c(str, bundle));
        } catch (Throwable th) {
            qx.a(th, ni.class);
        }
    }
}
