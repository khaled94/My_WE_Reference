package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ContextAwareHelper {
    private volatile Context mContext;
    private final Set<OnContextAvailableListener> mListeners = new CopyOnWriteArraySet();

    public final Context peekAvailableContext() {
        return this.mContext;
    }

    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        if (this.mContext != null) {
            onContextAvailableListener.onContextAvailable(this.mContext);
        }
        this.mListeners.add(onContextAvailableListener);
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.mListeners.remove(onContextAvailableListener);
    }

    public final void dispatchOnContextAvailable(Context context) {
        this.mContext = context;
        for (OnContextAvailableListener onContextAvailableListener : this.mListeners) {
            onContextAvailableListener.onContextAvailable(context);
        }
    }

    public final void clearAvailableContext() {
        this.mContext = null;
    }
}
