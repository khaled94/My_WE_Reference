package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.e;
import defpackage.f;
import defpackage.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    static final boolean a = Log.isLoggable("MediaBrowserCompat", 3);
    public final d b;

    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void c();

        void d();

        MediaSessionCompat.Token e();
    }

    /* loaded from: classes.dex */
    interface i {
        void a(Messenger messenger);

        void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = new g(context, componentName, bVar);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.b = new f(context, componentName, bVar);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.b = new e(context, componentName, bVar);
        } else {
            this.b = new h(context, componentName, bVar);
        }
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }
        };
        private final int a;
        private final MediaDescriptionCompat b;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static List<MediaItem> a(List<?> list) {
            MediaItem mediaItem;
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj == null || Build.VERSION.SDK_INT < 21) {
                    mediaItem = null;
                } else {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                    mediaItem = new MediaItem(MediaDescriptionCompat.a(mediaItem2.getDescription()), mediaItem2.getFlags());
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        private MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.a)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.a = i;
            this.b = mediaDescriptionCompat;
        }

        MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        a mConnectionCallbackInternal;
        final Object mConnectionCallbackObj;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface a {
            void a();

            void b();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.mConnectionCallbackObj = new e.b(new C0002b());
            } else {
                this.mConnectionCallbackObj = null;
            }
        }

        void setInternalConnectionCallback(a aVar) {
            this.mConnectionCallbackInternal = aVar;
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0002b implements e.a {
            C0002b() {
            }

            @Override // defpackage.e.a
            public final void a() {
                if (b.this.mConnectionCallbackInternal != null) {
                    b.this.mConnectionCallbackInternal.a();
                }
                b.this.onConnected();
            }

            @Override // defpackage.e.a
            public final void b() {
                if (b.this.mConnectionCallbackInternal != null) {
                    b.this.mConnectionCallbackInternal.b();
                }
                b.this.onConnectionSuspended();
            }

            @Override // defpackage.e.a
            public final void c() {
                b.this.onConnectionFailed();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        final Object a;
        final IBinder b = new Binder();
        WeakReference<k> c;

        public l() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a = new f.b(new b());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.a = new e.d(new a());
            } else {
                this.a = null;
            }
        }

        /* loaded from: classes.dex */
        class a implements e.c {
            a() {
            }

            @Override // defpackage.e.c
            public final void a(List<?> list) {
                k kVar = l.this.c == null ? null : l.this.c.get();
                if (kVar == null) {
                    MediaItem.a(list);
                    return;
                }
                List<MediaItem> a = MediaItem.a(list);
                List<l> list2 = kVar.a;
                List<Bundle> list3 = kVar.b;
                for (int i = 0; i < list2.size(); i++) {
                    Bundle bundle = list3.get(i);
                    if (bundle != null && a != null) {
                        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                        if (i2 != -1 || i3 != -1) {
                            int i4 = i3 * i2;
                            int i5 = i4 + i3;
                            if (i2 < 0 || i3 <= 0 || i4 >= a.size()) {
                                Collections.emptyList();
                            } else {
                                if (i5 > a.size()) {
                                    i5 = a.size();
                                }
                                a.subList(i4, i5);
                            }
                        }
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        class b extends a implements f.a {
            b() {
                super();
            }

            @Override // defpackage.f.a
            public final void b(List<?> list) {
                MediaItem.a(list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h implements d, i {
        final Context a;
        final ComponentName b;
        final b c;
        final Bundle d;
        a g;
        j h;
        Messenger i;
        private String k;
        private MediaSessionCompat.Token l;
        private Bundle m;
        private Bundle n;
        final a e = new a(this);
        private final ArrayMap<String, k> j = new ArrayMap<>();
        int f = 1;

        public h(Context context, ComponentName componentName, b bVar) {
            if (context != null) {
                if (componentName == null) {
                    throw new IllegalArgumentException("service component must not be null");
                }
                if (bVar == null) {
                    throw new IllegalArgumentException("connection callback must not be null");
                }
                this.a = context;
                this.b = componentName;
                this.c = bVar;
                this.d = null;
                return;
            }
            throw new IllegalArgumentException("context must not be null");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final void c() {
            int i = this.f;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + a(this.f) + ")");
            }
            this.f = 2;
            this.e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.h.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (h.this.f == 0) {
                        return;
                    }
                    h.this.f = 2;
                    if (MediaBrowserCompat.a && h.this.g != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + h.this.g);
                    } else if (h.this.h != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + h.this.h);
                    } else if (h.this.i != null) {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + h.this.i);
                    } else {
                        Intent intent = new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE);
                        intent.setComponent(h.this.b);
                        h hVar = h.this;
                        hVar.g = new a();
                        boolean z = false;
                        try {
                            z = h.this.a.bindService(intent, h.this.g, 1);
                        } catch (Exception unused) {
                            new StringBuilder("Failed binding to service ").append(h.this.b);
                        }
                        if (!z) {
                            h.this.a();
                            h.this.c.onConnectionFailed();
                        }
                        if (!MediaBrowserCompat.a) {
                            return;
                        }
                        h.this.b();
                    }
                }
            });
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final void d() {
            this.f = 0;
            this.e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.h.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (h.this.i != null) {
                        try {
                            h.this.h.a(2, null, h.this.i);
                        } catch (RemoteException unused) {
                            new StringBuilder("RemoteException during connect for ").append(h.this.b);
                        }
                    }
                    int i = h.this.f;
                    h.this.a();
                    if (i != 0) {
                        h.this.f = i;
                    }
                    if (MediaBrowserCompat.a) {
                        h.this.b();
                    }
                }
            });
        }

        final void a() {
            a aVar = this.g;
            if (aVar != null) {
                this.a.unbindService(aVar);
            }
            this.f = 1;
            this.g = null;
            this.h = null;
            this.i = null;
            this.e.a(null);
            this.k = null;
            this.l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (!a(messenger, "onConnect")) {
                return;
            }
            if (this.f != 2) {
                StringBuilder sb = new StringBuilder("onConnect from service while mState=");
                sb.append(a(this.f));
                sb.append("... ignoring");
                return;
            }
            this.k = str;
            this.l = token;
            this.m = bundle;
            this.f = 3;
            if (MediaBrowserCompat.a) {
                b();
            }
            this.c.onConnected();
            try {
                for (Map.Entry<String, k> entry : this.j.entrySet()) {
                    String key = entry.getKey();
                    k value = entry.getValue();
                    List<l> list = value.a;
                    List<Bundle> list2 = value.b;
                    for (int i = 0; i < list.size(); i++) {
                        j jVar = this.h;
                        IBinder iBinder = list.get(i).b;
                        Messenger messenger2 = this.i;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, key);
                        BundleCompat.putBinder(bundle2, MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
                        bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, list2.get(i));
                        jVar.a(3, bundle2, messenger2);
                    }
                }
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger) {
            new StringBuilder("onConnectFailed for ").append(this.b);
            if (!a(messenger, "onConnectFailed")) {
                return;
            }
            if (this.f != 2) {
                StringBuilder sb = new StringBuilder("onConnect from service while mState=");
                sb.append(a(this.f));
                sb.append("... ignoring");
                return;
            }
            a();
            this.c.onConnectionFailed();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (!a(messenger, "onLoadChildren")) {
                return;
            }
            if (MediaBrowserCompat.a) {
                StringBuilder sb = new StringBuilder("onLoadChildren for ");
                sb.append(this.b);
                sb.append(" id=");
                sb.append(str);
            }
            k kVar = this.j.get(str);
            if (kVar == null) {
                boolean z = MediaBrowserCompat.a;
            } else if (kVar.a(bundle) == null) {
            } else {
                if (bundle == null) {
                    if (list == null) {
                        return;
                    }
                    this.n = bundle2;
                    this.n = null;
                } else if (list == null) {
                } else {
                    this.n = bundle2;
                    this.n = null;
                }
            }
        }

        private static String a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN/".concat(String.valueOf(i)) : "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";
        }

        private boolean a(Messenger messenger, String str) {
            int i;
            if (this.i != messenger || (i = this.f) == 0 || i == 1) {
                int i2 = this.f;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" for ");
                sb.append(this.b);
                sb.append(" with mCallbacksMessenger=");
                sb.append(this.i);
                sb.append(" this=");
                sb.append(this);
                return false;
            }
            return true;
        }

        final void b() {
            new StringBuilder("  mServiceComponent=").append(this.b);
            new StringBuilder("  mCallback=").append(this.c);
            new StringBuilder("  mRootHints=").append(this.d);
            new StringBuilder("  mState=").append(a(this.f));
            new StringBuilder("  mServiceConnection=").append(this.g);
            new StringBuilder("  mServiceBinderWrapper=").append(this.h);
            new StringBuilder("  mCallbacksMessenger=").append(this.i);
            new StringBuilder("  mRootId=").append(this.k);
            new StringBuilder("  mMediaSessionToken=").append(this.l);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements ServiceConnection {
            a() {
            }

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                a(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.h.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (MediaBrowserCompat.a) {
                            StringBuilder sb = new StringBuilder("MediaServiceConnection.onServiceConnected name=");
                            sb.append(componentName);
                            sb.append(" binder=");
                            sb.append(iBinder);
                            h.this.b();
                        }
                        if (!a.this.a("onServiceConnected")) {
                            return;
                        }
                        h.this.h = new j(iBinder, h.this.d);
                        h.this.i = new Messenger(h.this.e);
                        h.this.e.a(h.this.i);
                        h.this.f = 2;
                        try {
                            if (MediaBrowserCompat.a) {
                                h.this.b();
                            }
                            j jVar = h.this.h;
                            Context context = h.this.a;
                            Messenger messenger = h.this.i;
                            Bundle bundle = new Bundle();
                            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
                            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, jVar.a);
                            jVar.a(1, bundle, messenger);
                        } catch (RemoteException unused) {
                            new StringBuilder("RemoteException during connect for ").append(h.this.b);
                            if (!MediaBrowserCompat.a) {
                                return;
                            }
                            h.this.b();
                        }
                    }
                });
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(final ComponentName componentName) {
                a(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.h.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (MediaBrowserCompat.a) {
                            StringBuilder sb = new StringBuilder("MediaServiceConnection.onServiceDisconnected name=");
                            sb.append(componentName);
                            sb.append(" this=");
                            sb.append(this);
                            sb.append(" mServiceConnection=");
                            sb.append(h.this.g);
                            h.this.b();
                        }
                        if (!a.this.a("onServiceDisconnected")) {
                            return;
                        }
                        h.this.h = null;
                        h.this.i = null;
                        h.this.e.a(null);
                        h.this.f = 4;
                        h.this.c.onConnectionSuspended();
                    }
                });
            }

            private void a(Runnable runnable) {
                if (Thread.currentThread() == h.this.e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    h.this.e.post(runnable);
                }
            }

            final boolean a(String str) {
                if (h.this.g != this || h.this.f == 0 || h.this.f == 1) {
                    if (h.this.f == 0 || h.this.f == 1) {
                        return false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" for ");
                    sb.append(h.this.b);
                    sb.append(" with mServiceConnection=");
                    sb.append(h.this.g);
                    sb.append(" this=");
                    sb.append(this);
                    return false;
                }
                return true;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final MediaSessionCompat.Token e() {
            if (!(this.f == 3)) {
                throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f + ")");
            }
            return this.l;
        }
    }

    /* loaded from: classes.dex */
    static class e implements b.a, d, i {
        final Context a;
        protected final Object b;
        protected final Bundle c;
        protected int e;
        protected j f;
        protected Messenger g;
        private MediaSessionCompat.Token i;
        private Bundle j;
        protected final a d = new a(this);
        private final ArrayMap<String, k> h = new ArrayMap<>();

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        e(Context context, ComponentName componentName, b bVar) {
            this.a = context;
            Bundle bundle = new Bundle();
            this.c = bundle;
            bundle.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bVar.setInternalConnectionCallback(this);
            this.b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) bVar.mConnectionCallbackObj, this.c);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final void c() {
            ((MediaBrowser) this.b).connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final void d() {
            Messenger messenger;
            j jVar = this.f;
            if (jVar != null && (messenger = this.g) != null) {
                try {
                    jVar.a(7, null, messenger);
                } catch (RemoteException unused) {
                }
            }
            ((MediaBrowser) this.b).disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public final MediaSessionCompat.Token e() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.a(((MediaBrowser) this.b).getSessionToken());
            }
            return this.i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public final void a() {
            Bundle extras = ((MediaBrowser) this.b).getExtras();
            if (extras == null) {
                return;
            }
            this.e = extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
            IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
            if (binder != null) {
                this.f = new j(binder, this.c);
                Messenger messenger = new Messenger(this.d);
                this.g = messenger;
                this.d.a(messenger);
                try {
                    j jVar = this.f;
                    Context context = this.a;
                    Messenger messenger2 = this.g;
                    Bundle bundle = new Bundle();
                    bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
                    bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, jVar.a);
                    jVar.a(6, bundle, messenger2);
                } catch (RemoteException unused) {
                }
            }
            defpackage.h a = h.a.a(BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
            if (a == null) {
                return;
            }
            this.i = MediaSessionCompat.Token.a(((MediaBrowser) this.b).getSessionToken(), a);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public final void b() {
            this.f = null;
            this.g = null;
            this.i = null;
            this.d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public final void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.g != messenger) {
                return;
            }
            k kVar = this.h.get(str);
            if (kVar == null) {
                boolean z = MediaBrowserCompat.a;
            } else if (kVar.a(bundle) == null) {
            } else {
                if (bundle == null) {
                    if (list == null) {
                        return;
                    }
                    this.j = bundle2;
                    this.j = null;
                } else if (list == null) {
                } else {
                    this.j = bundle2;
                    this.j = null;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class f extends e {
        f(Context context, ComponentName componentName, b bVar) {
            super(context, componentName, bVar);
        }
    }

    /* loaded from: classes.dex */
    static class g extends f {
        g(Context context, ComponentName componentName, b bVar) {
            super(context, componentName, bVar);
        }
    }

    /* loaded from: classes.dex */
    static class k {
        final List<l> a = new ArrayList();
        final List<Bundle> b = new ArrayList();

        public final l a(Bundle bundle) {
            for (int i = 0; i < this.b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.b.get(i), bundle)) {
                    return this.a.get(i);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends Handler {
        private final WeakReference<i> a;
        private WeakReference<Messenger> b;

        a(i iVar) {
            this.a = new WeakReference<>(iVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null || this.a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            i iVar = this.a.get();
            Messenger messenger = this.b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                    MediaSessionCompat.a(bundle);
                    iVar.a(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle);
                } else if (i == 2) {
                    iVar.a(messenger);
                } else if (i == 3) {
                    Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                    MediaSessionCompat.a(bundle2);
                    Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                    MediaSessionCompat.a(bundle3);
                    iVar.a(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle2, bundle3);
                } else {
                    StringBuilder sb = new StringBuilder("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Client version: 1\n  Service version: ");
                    sb.append(message.arg1);
                }
            } catch (BadParcelableException unused) {
                if (message.what != 1) {
                    return;
                }
                iVar.a(messenger);
            }
        }

        final void a(Messenger messenger) {
            this.b = new WeakReference<>(messenger);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        Bundle a;
        private Messenger b;

        public j(IBinder iBinder, Bundle bundle) {
            this.b = new Messenger(iBinder);
            this.a = bundle;
        }

        final void a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.b.send(obtain);
        }
    }

    /* loaded from: classes.dex */
    static class ItemReceiver extends defpackage.l {
        @Override // defpackage.l
        public final void a(int i, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                return;
            }
            bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
        }
    }

    /* loaded from: classes.dex */
    static class SearchResultReceiver extends defpackage.l {
        @Override // defpackage.l
        public final void a(int i, Bundle bundle) {
            Parcelable[] parcelableArray;
            MediaSessionCompat.a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS) || (parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
        }
    }

    /* loaded from: classes.dex */
    static class CustomActionResultReceiver extends defpackage.l {
        private final Bundle d;
        private final c e;

        @Override // defpackage.l
        public final void a(int i, Bundle bundle) {
            if (this.e == null) {
                return;
            }
            MediaSessionCompat.a(bundle);
            if (i == -1 || i == 0 || i == 1) {
                return;
            }
            StringBuilder sb = new StringBuilder("Unknown result code: ");
            sb.append(i);
            sb.append(" (extras=");
            sb.append(this.d);
            sb.append(", resultData=");
            sb.append(bundle);
            sb.append(")");
        }
    }
}
