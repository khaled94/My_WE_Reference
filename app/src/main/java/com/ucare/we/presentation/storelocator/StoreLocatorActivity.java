package com.ucare.we.presentation.storelocator;

import android.os.Bundle;
import com.ucare.we.R;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/ucare/we/presentation/storelocator/StoreLocatorActivity;", "Lcom/ucare/we/injection/BaseActivity;", "()V", "inputSearch", "Landroid/widget/AutoCompleteTextView;", "getInputSearch", "()Landroid/widget/AutoCompleteTextView;", "setInputSearch", "(Landroid/widget/AutoCompleteTextView;)V", "launcher", "Lcom/ucare/we/view/ActivityLauncher;", "getLauncher", "()Lcom/ucare/we/view/ActivityLauncher;", "setLauncher", "(Lcom/ucare/we/view/ActivityLauncher;)V", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "rvStores", "Landroidx/recyclerview/widget/RecyclerView;", "getRvStores", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvStores", "(Landroidx/recyclerview/widget/RecyclerView;)V", "storeAdapter", "Lcom/ucare/we/adapters/StoreAdapter;", "getStoreAdapter", "()Lcom/ucare/we/adapters/StoreAdapter;", "setStoreAdapter", "(Lcom/ucare/we/adapters/StoreAdapter;)V", "storeLocatorProvider", "Lcom/ucare/we/provider/StoreLocatorProvider;", "getStoreLocatorProvider", "()Lcom/ucare/we/provider/StoreLocatorProvider;", "setStoreLocatorProvider", "(Lcom/ucare/we/provider/StoreLocatorProvider;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class StoreLocatorActivity extends czy {
    @Inject
    public djx a;
    @Inject
    public djg b;
    @Inject
    public dih c;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_store_locator);
        a(getString(R.string.title_store_locator), false, false);
    }
}
