package butterknife.internal;

/* compiled from: lambda */
/* renamed from: butterknife.internal.-$$Lambda$DebouncingOnClickListener$EDavjG1Da3G8JTdFPVGk_7OErB8  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class $$Lambda$DebouncingOnClickListener$EDavjG1Da3G8JTdFPVGk_7OErB8 implements Runnable {
    public static final /* synthetic */ $$Lambda$DebouncingOnClickListener$EDavjG1Da3G8JTdFPVGk_7OErB8 INSTANCE = new $$Lambda$DebouncingOnClickListener$EDavjG1Da3G8JTdFPVGk_7OErB8();

    private /* synthetic */ $$Lambda$DebouncingOnClickListener$EDavjG1Da3G8JTdFPVGk_7OErB8() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        DebouncingOnClickListener.enabled = true;
    }
}
