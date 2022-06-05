package defpackage;

import defpackage.pr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentManager;", "", "()V", "start", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qs  reason: default package */
/* loaded from: classes2.dex */
public final class qs {
    public static final qs a = new qs();

    private qs() {
    }

    public static final void a() {
        if (!ly.p()) {
            return;
        }
        pr.a(pr.b.CrashReport, a.a);
        pr.a(pr.b.ErrorReport, b.a);
        pr.a(pr.b.AnrReport, c.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qs$a */
    /* loaded from: classes2.dex */
    public static final class a implements pr.a {
        public static final a a = new a();

        a() {
        }

        @Override // defpackage.pr.a
        public final void a(boolean z) {
            if (z) {
                qw.a.a();
                if (pr.a(pr.b.CrashShield)) {
                    qo.a();
                    qx.a();
                }
                if (!pr.a(pr.b.ThreadCheck)) {
                    return;
                }
                ra.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qs$b */
    /* loaded from: classes2.dex */
    public static final class b implements pr.a {
        public static final b a = new b();

        b() {
        }

        @Override // defpackage.pr.a
        public final void a(boolean z) {
            if (z) {
                qz.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qs$c */
    /* loaded from: classes2.dex */
    public static final class c implements pr.a {
        public static final c a = new c();

        c() {
        }

        @Override // defpackage.pr.a
        public final void a(boolean z) {
            if (z) {
                qv.a();
            }
        }
    }
}
