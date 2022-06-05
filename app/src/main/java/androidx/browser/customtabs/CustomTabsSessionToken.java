package androidx.browser.customtabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.BundleCompat;
import defpackage.a;

/* loaded from: classes.dex */
public class CustomTabsSessionToken {
    private static final String TAG = "CustomTabsSessionToken";
    private final CustomTabsCallback mCallback = new CustomTabsCallback() { // from class: androidx.browser.customtabs.CustomTabsSessionToken.1
        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.mCallbackBinder.onNavigationEvent(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.mCallbackBinder.extraCallback(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
            try {
                CustomTabsSessionToken.this.mCallbackBinder.onMessageChannelReady(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.mCallbackBinder.onPostMessage(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.mCallbackBinder.onRelationshipValidationResult(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }
    };
    final a mCallbackBinder;

    /* loaded from: classes.dex */
    static class MockCallback extends a.AbstractBinderC0000a {
        @Override // defpackage.a.AbstractBinderC0000a, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // defpackage.a
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // defpackage.a
        public void onMessageChannelReady(Bundle bundle) {
        }

        @Override // defpackage.a
        public void onNavigationEvent(int i, Bundle bundle) {
        }

        @Override // defpackage.a
        public void onPostMessage(String str, Bundle bundle) {
        }

        @Override // defpackage.a
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        }
    }

    public static CustomTabsSessionToken getSessionTokenFromIntent(Intent intent) {
        IBinder binder = BundleCompat.getBinder(intent.getExtras(), CustomTabsIntent.EXTRA_SESSION);
        if (binder == null) {
            return null;
        }
        return new CustomTabsSessionToken(a.AbstractBinderC0000a.asInterface(binder));
    }

    public static CustomTabsSessionToken createMockSessionTokenForTesting() {
        return new CustomTabsSessionToken(new MockCallback());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomTabsSessionToken(a aVar) {
        this.mCallbackBinder = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder getCallbackBinder() {
        return this.mCallbackBinder.asBinder();
    }

    public int hashCode() {
        return getCallbackBinder().hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        return ((CustomTabsSessionToken) obj).getCallbackBinder().equals(this.mCallbackBinder.asBinder());
    }

    public CustomTabsCallback getCallback() {
        return this.mCallback;
    }

    public boolean isAssociatedWith(CustomTabsSession customTabsSession) {
        return customTabsSession.getBinder().equals(this.mCallbackBinder);
    }
}
