package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.core.app.BundleCompat;
import defpackage.g;
import defpackage.h;
import defpackage.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaControllerCompat {
    private final b a;
    private final MediaSessionCompat.Token b;
    private final HashSet<a> c = new HashSet<>();

    /* loaded from: classes.dex */
    interface b {
        boolean a(KeyEvent keyEvent);
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) throws RemoteException {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.b = token;
        if (Build.VERSION.SDK_INT >= 24) {
            this.a = new d(context, token);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.a = new c(context, token);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.a = new MediaControllerImplApi21(context, token);
        } else {
            this.a = new e(token);
        }
    }

    public final boolean a(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        return this.a.a(keyEvent);
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {
        final Object a;
        HandlerC0003a b;
        g c;

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.a = new i.b(new b(this));
                return;
            }
            c cVar = new c(this);
            this.c = cVar;
            this.a = cVar;
        }

        final void a(int i, Object obj, Bundle bundle) {
            HandlerC0003a handlerC0003a = this.b;
            if (handlerC0003a != null) {
                Message obtainMessage = handlerC0003a.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* loaded from: classes.dex */
        static class b implements i.a {
            private final WeakReference<a> a;

            b(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // defpackage.i.a
            public final void a() {
                this.a.get();
            }

            @Override // defpackage.i.a
            public final void b() {
                a aVar = this.a.get();
                if (aVar == null || aVar.c == null) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
            }

            @Override // defpackage.i.a
            public final void a(Object obj) {
                a aVar = this.a.get();
                if (aVar == null || aVar.c != null) {
                    return;
                }
                PlaybackStateCompat.a(obj);
            }

            @Override // defpackage.i.a
            public final void b(Object obj) {
                if (this.a.get() != null) {
                    MediaMetadataCompat.a(obj);
                }
            }

            @Override // defpackage.i.a
            public final void a(List<?> list) {
                if (this.a.get() != null) {
                    MediaSessionCompat.QueueItem.a(list);
                }
            }

            @Override // defpackage.i.a
            public final void c() {
                this.a.get();
            }

            @Override // defpackage.i.a
            public final void d() {
                this.a.get();
            }

            @Override // defpackage.i.a
            public final void a(int i, int i2, int i3, int i4, int i5) {
                if (this.a.get() != null) {
                    new f(i, i2, i3, i4, i5);
                }
            }
        }

        /* loaded from: classes.dex */
        static class c extends g.a {
            private final WeakReference<a> a;

            @Override // defpackage.g
            public final void a(boolean z) throws RemoteException {
            }

            c(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // defpackage.g
            public final void a(String str, Bundle bundle) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(1, str, bundle);
                }
            }

            public void a() throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(8, null, null);
                }
            }

            @Override // defpackage.g
            public final void a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(2, playbackStateCompat, null);
                }
            }

            public void a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(3, mediaMetadataCompat, null);
                }
            }

            public void a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(5, list, null);
                }
            }

            public void a(CharSequence charSequence) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(6, charSequence, null);
                }
            }

            @Override // defpackage.g
            public final void b(boolean z) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(11, Boolean.valueOf(z), null);
                }
            }

            @Override // defpackage.g
            public final void a(int i) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(9, Integer.valueOf(i), null);
                }
            }

            @Override // defpackage.g
            public final void b(int i) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(12, Integer.valueOf(i), null);
                }
            }

            public void a(Bundle bundle) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(7, bundle, null);
                }
            }

            public void a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(4, parcelableVolumeInfo != null ? new f(parcelableVolumeInfo.a, parcelableVolumeInfo.b, parcelableVolumeInfo.c, parcelableVolumeInfo.d, parcelableVolumeInfo.e) : null, null);
                }
            }

            @Override // defpackage.g
            public final void b() throws RemoteException {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(13, null, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0003a extends Handler {
            boolean a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (!this.a) {
                    return;
                }
                switch (message.what) {
                    case 1:
                        MediaSessionCompat.a(message.getData());
                        Object obj = message.obj;
                        return;
                    case 2:
                        Object obj2 = message.obj;
                        return;
                    case 3:
                        Object obj3 = message.obj;
                        return;
                    case 4:
                        Object obj4 = message.obj;
                        return;
                    case 5:
                        Object obj5 = message.obj;
                        return;
                    case 6:
                        Object obj6 = message.obj;
                        return;
                    case 7:
                        MediaSessionCompat.a((Bundle) message.obj);
                        return;
                    case 8:
                    case 10:
                    default:
                        return;
                    case 9:
                        ((Integer) message.obj).intValue();
                        return;
                    case 11:
                        ((Boolean) message.obj).booleanValue();
                        return;
                    case 12:
                        ((Integer) message.obj).intValue();
                        return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;

        f(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    /* loaded from: classes.dex */
    static class e implements b {
        private h a;

        public e(MediaSessionCompat.Token token) {
            this.a = h.a.a((IBinder) token.a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final boolean a(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.a.a(keyEvent);
                return false;
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    static class MediaControllerImplApi21 implements b {
        protected final Object a;
        final Object b = new Object();
        final List<a> c = new ArrayList();
        HashMap<a, a> d = new HashMap<>();
        final MediaSessionCompat.Token e;

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.a);
            this.a = mediaController;
            if (mediaController == null) {
                throw new RemoteException();
            }
            if (this.e.b != null) {
                return;
            }
            ((MediaController) this.a).sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final boolean a(KeyEvent keyEvent) {
            return ((MediaController) this.a).dispatchMediaButtonEvent(keyEvent);
        }

        /* loaded from: classes.dex */
        static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.a = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.b) {
                    mediaControllerImplApi21.e.b = h.a.a(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    mediaControllerImplApi21.e.c = bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                    if (mediaControllerImplApi21.e.b != null) {
                        for (a aVar : mediaControllerImplApi21.c) {
                            a aVar2 = new a(aVar);
                            mediaControllerImplApi21.d.put(aVar, aVar2);
                            aVar.c = aVar2;
                            try {
                                mediaControllerImplApi21.e.b.a(aVar2);
                                aVar.a(13, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        mediaControllerImplApi21.c.clear();
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, defpackage.g
            public final void a() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, defpackage.g
            public final void a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, defpackage.g
            public final void a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, defpackage.g
            public final void a(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, defpackage.g
            public final void a(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, defpackage.g
            public final void a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }
    }

    /* loaded from: classes.dex */
    static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* loaded from: classes.dex */
    static class d extends c {
        public d(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }
}
