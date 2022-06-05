package defpackage;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import defpackage.e;
import java.util.List;

/* renamed from: f  reason: default package */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: f$a */
    /* loaded from: classes2.dex */
    public interface a extends e.c {
        void b(List<?> list);
    }

    /* renamed from: f$b */
    /* loaded from: classes2.dex */
    public static class b<T extends a> extends e.d<T> {
        public b(T t) {
            super(t);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((a) this.a).b(list);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public final void onError(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
        }
    }

    private f() {
    }
}
