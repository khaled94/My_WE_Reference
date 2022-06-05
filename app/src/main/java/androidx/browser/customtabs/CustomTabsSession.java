package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.RemoteViews;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.List;

/* loaded from: classes.dex */
public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    private final a mCallback;
    private final ComponentName mComponentName;
    private final Object mLock = new Object();
    private final b mService;

    public static CustomTabsSession createMockSessionForTesting(ComponentName componentName) {
        return new CustomTabsSession(null, new CustomTabsSessionToken.MockCallback(), componentName);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomTabsSession(b bVar, a aVar, ComponentName componentName) {
        this.mService = bVar;
        this.mCallback = aVar;
        this.mComponentName = componentName;
    }

    public final boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean setActionButton(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean setSecondaryToolbarViews(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public final boolean setToolbarItem(int i, Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean requestPostMessageChannel(Uri uri) {
        try {
            return this.mService.requestPostMessageChannel(this.mCallback, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int postMessage(String str, Bundle bundle) {
        int postMessage;
        synchronized (this.mLock) {
            try {
                try {
                    postMessage = this.mService.postMessage(this.mCallback, str, bundle);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return postMessage;
    }

    public final boolean validateRelationship(int i, Uri uri, Bundle bundle) {
        if (i > 0 && i <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ComponentName getComponentName() {
        return this.mComponentName;
    }
}
