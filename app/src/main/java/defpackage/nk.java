package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ni;
import defpackage.nl;
import defpackage.no;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0018\u001a\u00020\u0013H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007j\u001e\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\f`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher;", "", "()V", "activitiesSet", "", "Landroid/app/Activity;", "activityToListenerMap", "Ljava/util/HashMap;", "", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashMap;", "Lkotlin/collections/HashSet;", "listenerSet", "uiThreadHandler", "Landroid/os/Handler;", "viewMatchers", "Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "add", "", "activity", "destroy", "matchViews", "remove", "startTracking", "Companion", "MatchedView", "ViewMatcher", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nk  reason: default package */
/* loaded from: classes2.dex */
public final class nk {
    public static final a f = new a((byte) 0);
    private static final String g = nk.class.getCanonicalName();
    private static nk h;
    final Handler a;
    final Set<Activity> b;
    final Set<c> c;
    HashSet<String> d;
    final HashMap<Integer, HashSet<String>> e;

    private nk() {
        this.a = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        dqc.b(newSetFromMap, "Collections.newSetFromMap(WeakHashMap())");
        this.b = newSetFromMap;
        this.c = new LinkedHashSet();
        this.d = new HashSet<>();
        this.e = new HashMap<>();
    }

    public /* synthetic */ nk(byte b2) {
        this();
    }

    public static final /* synthetic */ void a(nk nkVar) {
        if (qx.a(nk.class)) {
            return;
        }
        try {
            nkVar.a();
        } catch (Throwable th) {
            qx.a(th, nk.class);
        }
    }

    public static final /* synthetic */ String b() {
        if (qx.a(nk.class)) {
            return null;
        }
        try {
            return g;
        } catch (Throwable th) {
            qx.a(th, nk.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(nk nkVar) {
        if (qx.a(nk.class)) {
            return;
        }
        try {
            h = nkVar;
        } catch (Throwable th) {
            qx.a(th, nk.class);
        }
    }

    public static final /* synthetic */ nk c() {
        if (qx.a(nk.class)) {
            return null;
        }
        try {
            return h;
        } catch (Throwable th) {
            qx.a(th, nk.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nk$d */
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        /* JADX INFO: Access modifiers changed from: package-private */
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                nk.a(nk.this);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (qx.a(this)) {
            return;
        }
        try {
            for (Activity activity : this.b) {
                if (activity != null) {
                    View a2 = of.a(activity);
                    String simpleName = activity.getClass().getSimpleName();
                    dqc.b(simpleName, "activity.javaClass.simpleName");
                    this.c.add(new c(a2, this.a, this.d, simpleName));
                }
            }
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0003R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "", "view", "Landroid/view/View;", "viewMapKey", "", "(Landroid/view/View;Ljava/lang/String;)V", "Ljava/lang/ref/WeakReference;", "getViewMapKey", "()Ljava/lang/String;", "getView", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nk$b */
    /* loaded from: classes2.dex */
    public static final class b {
        final String a;
        private final WeakReference<View> b;

        public b(View view, String str) {
            dqc.d(view, "view");
            dqc.d(str, "viewMapKey");
            this.b = new WeakReference<>(view);
            this.a = str;
        }

        public final View a() {
            WeakReference<View> weakReference = this.b;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB7\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u001c\u0010\u001a\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Ljava/lang/Runnable;", "rootView", "Landroid/view/View;", "handler", "Landroid/os/Handler;", "listenerSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "activityName", "(Landroid/view/View;Landroid/os/Handler;Ljava/util/HashSet;Ljava/lang/String;)V", "eventBindings", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "attachListener", "", "matchedView", "Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "mapping", "attachOnClickListener", "attachOnItemClickListener", "attachRCTListener", "findView", "onGlobalLayout", "onScrollChanged", "run", "startMatch", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nk$c */
    /* loaded from: classes2.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        public static final a a = new a((byte) 0);
        private final WeakReference<View> b;
        private List<no> c;
        private final Handler d;
        private final HashSet<String> e;
        private final String f;

        public c(View view, Handler handler, HashSet<String> hashSet, String str) {
            dqc.d(handler, "handler");
            dqc.d(hashSet, "listenerSet");
            dqc.d(str, "activityName");
            this.b = new WeakReference<>(view);
            this.d = handler;
            this.e = hashSet;
            this.f = str;
            handler.postDelayed(this, 200L);
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view;
            if (qx.a(this)) {
                return;
            }
            try {
                pv a2 = pw.a(ly.m());
                if (a2 != null && a2.g) {
                    no.b bVar = no.d;
                    List<no> a3 = no.b.a(a2.h);
                    this.c = a3;
                    if (a3 == null || (view = this.b.get()) == null) {
                        return;
                    }
                    dqc.b(view, "rootView.get() ?: return");
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    dqc.b(viewTreeObserver, "observer");
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    a();
                }
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            a();
        }

        private final void a() {
            List<no> list = this.c;
            if (list == null || this.b.get() == null) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a(list.get(i), this.b.get());
            }
        }

        private final void a(b bVar, View view, no noVar) {
            if (noVar == null) {
                return;
            }
            try {
                View a2 = bVar.a();
                if (a2 == null) {
                    return;
                }
                View i = nt.i(a2);
                if (i != null && nt.a.a(a2, i)) {
                    d(bVar, view, noVar);
                    return;
                }
                String name = a2.getClass().getName();
                dqc.b(name, "view.javaClass.name");
                if (dsg.c(name, "com.facebook.react")) {
                    return;
                }
                if (!(a2 instanceof AdapterView)) {
                    b(bVar, view, noVar);
                } else if (!(a2 instanceof ListView)) {
                } else {
                    c(bVar, view, noVar);
                }
            } catch (Exception e) {
                qi.a(nk.b(), e);
            }
        }

        private final void b(b bVar, View view, no noVar) {
            boolean z;
            View a2 = bVar.a();
            if (a2 == null) {
                return;
            }
            String str = bVar.a;
            View.OnClickListener g = nt.g(a2);
            if (g instanceof ni.a) {
                if (g == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((ni.a) g).a) {
                    z = true;
                    if (this.e.contains(str) || z) {
                    }
                    a2.setOnClickListener(ni.a(noVar, view, a2));
                    this.e.add(str);
                    return;
                }
            }
            z = false;
            if (this.e.contains(str)) {
            }
        }

        private final void c(b bVar, View view, no noVar) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            String str = bVar.a;
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof ni.b) {
                if (onItemClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((ni.b) onItemClickListener).a) {
                    z = true;
                    if (this.e.contains(str) || z) {
                    }
                    adapterView.setOnItemClickListener(ni.a(noVar, view, (AdapterView<?>) adapterView));
                    this.e.add(str);
                    return;
                }
            }
            z = false;
            if (this.e.contains(str)) {
            }
        }

        private final void d(b bVar, View view, no noVar) {
            boolean z;
            View a2 = bVar.a();
            if (a2 == null) {
                return;
            }
            String str = bVar.a;
            View.OnTouchListener h = nt.h(a2);
            if (h instanceof nl.a) {
                if (h == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((nl.a) h).a) {
                    z = true;
                    if (this.e.contains(str) || z) {
                    }
                    a2.setOnTouchListener(nl.a(noVar, view, a2));
                    this.e.add(str);
                    return;
                }
            }
            z = false;
            if (this.e.contains(str)) {
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher$Companion;", "", "()V", "findViewByPath", "", "Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "view", "Landroid/view/View;", "path", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "level", "", "index", "mapKey", "", "findVisibleChildren", "viewGroup", "Landroid/view/ViewGroup;", "isTheSameView", "", "targetView", "pathElement", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: nk$c$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public final List<b> a(no noVar, View view, List<nq> list, int i, int i2, String str) {
                dqc.d(list, "path");
                dqc.d(str, "mapKey");
                String str2 = str + '.' + i2;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i >= list.size()) {
                    arrayList.add(new b(view, str2));
                } else {
                    nq nqVar = list.get(i);
                    if (dqc.a((Object) nqVar.a, (Object) "..")) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            List<View> a = a((ViewGroup) parent);
                            int size = a.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                arrayList.addAll(a(noVar, a.get(i3), list, i + 1, i3, str2));
                            }
                        }
                        return arrayList;
                    } else if (dqc.a((Object) nqVar.a, (Object) ".")) {
                        arrayList.add(new b(view, str2));
                        return arrayList;
                    } else if (!a(view, nqVar, i2)) {
                        return arrayList;
                    } else {
                        if (i == list.size() - 1) {
                            arrayList.add(new b(view, str2));
                        }
                    }
                }
                if (view instanceof ViewGroup) {
                    List<View> a2 = a((ViewGroup) view);
                    int size2 = a2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList.addAll(a(noVar, a2.get(i4), list, i + 1, i4, str2));
                    }
                }
                return arrayList;
            }

            private static List<View> a(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    dqc.b(childAt, "child");
                    if (childAt.getVisibility() == 0) {
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
                if ((!defpackage.dqc.a((java.lang.Object) r5.getClass().getSimpleName(), (java.lang.Object) ((java.lang.String) r7.get(r7.size() - 1)))) != false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static boolean a(android.view.View r5, defpackage.nq r6, int r7) {
                /*
                    Method dump skipped, instructions count: 305
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nk.c.a.a(android.view.View, nq, int):boolean");
            }
        }

        private final void a(no noVar, View view) {
            if (noVar == null || view == null) {
                return;
            }
            String str = noVar.c;
            if (!(str == null || str.length() == 0) && (!dqc.a((Object) noVar.c, (Object) this.f))) {
                return;
            }
            List<nq> a2 = noVar.a();
            if (a2.size() > 25) {
                return;
            }
            for (b bVar : a.a(noVar, view, a2, 0, -1, this.f)) {
                a(bVar, view, noVar);
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0007J\"\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$Companion;", "", "()V", "CURRENT_CLASS_NAME", "", "PARENT_CLASS_NAME", "TAG", "codelessMatcher", "Lcom/facebook/appevents/codeless/CodelessMatcher;", "getInstance", "getParameters", "Landroid/os/Bundle;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nk$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final synchronized nk a() {
            nk c;
            if (nk.c() == null) {
                nk.b(new nk((byte) 0));
            }
            c = nk.c();
            if (c == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return c;
        }
    }
}
