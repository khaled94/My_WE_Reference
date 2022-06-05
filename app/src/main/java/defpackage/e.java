package defpackage;

import android.media.browse.MediaBrowser;
import java.util.List;

/* renamed from: e  reason: default package */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: e$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* renamed from: e$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a(List<?> list);
    }

    /* renamed from: e$b */
    /* loaded from: classes2.dex */
    public static class b<T extends a> extends MediaBrowser.ConnectionCallback {
        protected final T a;

        public b(T t) {
            this.a = t;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public final void onConnected() {
            this.a.a();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public final void onConnectionSuspended() {
            this.a.b();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public final void onConnectionFailed() {
            this.a.c();
        }
    }

    /* renamed from: e$d */
    /* loaded from: classes2.dex */
    public static class d<T extends c> extends MediaBrowser.SubscriptionCallback {
        protected final T a;

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str) {
        }

        public d(T t) {
            this.a = t;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            this.a.a(list);
        }
    }

    private e() {
    }
}
