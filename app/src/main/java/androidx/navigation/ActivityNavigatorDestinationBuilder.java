package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.navigation.ActivityNavigator;
import kotlin.Metadata;

@NavDestinationDsl
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010#\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001c\u0010 \u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\r¨\u0006$"}, d2 = {"Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/ActivityNavigator$Destination;", "navigator", "Landroidx/navigation/ActivityNavigator;", "id", "", "(Landroidx/navigation/ActivityNavigator;I)V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "activityClass", "Lkotlin/reflect/KClass;", "Landroid/app/Activity;", "getActivityClass", "()Lkotlin/reflect/KClass;", "setActivityClass", "(Lkotlin/reflect/KClass;)V", "context", "Landroid/content/Context;", "data", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)V", "dataPattern", "getDataPattern", "setDataPattern", "targetPackage", "getTargetPackage", "setTargetPackage", "build", "navigation-runtime-ktx_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {
    private String action;
    private drg<? extends Activity> activityClass;
    private final Context context;
    private Uri data;
    private String dataPattern;
    private String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator activityNavigator, int i) {
        super(activityNavigator, i);
        dqc.c(activityNavigator, "navigator");
        Context context = activityNavigator.getContext();
        dqc.a((Object) context, "navigator.context");
        this.context = context;
    }

    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setTargetPackage(String str) {
        this.targetPackage = str;
    }

    public final drg<? extends Activity> getActivityClass() {
        return this.activityClass;
    }

    public final void setActivityClass(drg<? extends Activity> drgVar) {
        this.activityClass = drgVar;
    }

    public final String getAction() {
        return this.action;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final Uri getData() {
        return this.data;
    }

    public final void setData(Uri uri) {
        this.data = uri;
    }

    public final String getDataPattern() {
        return this.dataPattern;
    }

    public final void setDataPattern(String str) {
        this.dataPattern = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavDestinationBuilder
    public final ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        drg<? extends Activity> drgVar = this.activityClass;
        if (drgVar != null) {
            destination.setComponentName(new ComponentName(this.context, dot.a(drgVar)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }
}
