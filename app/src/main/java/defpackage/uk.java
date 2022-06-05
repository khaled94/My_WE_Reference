package defpackage;

import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: uk  reason: default package */
/* loaded from: classes2.dex */
public final class uk implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ SignInHubActivity a;

    public /* synthetic */ uk(SignInHubActivity signInHubActivity) {
        this.a = signInHubActivity;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new tt(this.a, vf.b());
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(SignInHubActivity.a(signInHubActivity), SignInHubActivity.b(signInHubActivity));
        this.a.finish();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(Loader loader) {
    }
}
