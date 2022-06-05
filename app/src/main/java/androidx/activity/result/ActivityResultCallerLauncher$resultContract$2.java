package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n"}, d2 = {"<anonymous>", "androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "I", "O"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class ActivityResultCallerLauncher$resultContract$2 extends dqd implements dov<AnonymousClass1> {
    final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultCallerLauncher$resultContract$2(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
        super(0);
        this.this$0 = activityResultCallerLauncher;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
    @Override // defpackage.dov
    public final AnonymousClass1 invoke() {
        final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
        return new ActivityResultContract<dmg, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
            public final Intent createIntent(Context context, dmg dmgVar) {
                dqc.d(context, "context");
                Intent createIntent = activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getInput());
                dqc.b(createIntent, "callerContract.createIntent(context, input)");
                return createIntent;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, O] */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public final O parseResult(int i, Intent intent) {
                return activityResultCallerLauncher.getCallerContract().parseResult(i, intent);
            }
        };
    }
}
