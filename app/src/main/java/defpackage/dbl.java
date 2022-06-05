package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ucare/we/newHome/core/extensions/MainViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "appUseCase", "Lcom/ucare/we/newHome/domain/use_case/HomeUseCase;", "(Lcom/ucare/we/newHome/domain/use_case/HomeUseCase;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dbl  reason: default package */
/* loaded from: classes2.dex */
public final class dbl implements ViewModelProvider.Factory {
    private final dbn a;

    @Inject
    public dbl(dbn dbnVar) {
        dqc.d(dbnVar, "appUseCase");
        this.a = dbnVar;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        dqc.d(cls, "modelClass");
        if (cls.isAssignableFrom(dbp.class)) {
            return new dbp(this.a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
