package com.google.android.gms.tasks;

/* loaded from: classes.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(bwl<?> bwlVar) {
        String str;
        if (!bwlVar.d()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception a = bwlVar.a();
        if (a != null) {
            str = "failure";
        } else if (bwlVar.e()) {
            String valueOf = String.valueOf(bwlVar.b());
            String.valueOf(valueOf).length();
            str = "result ".concat(String.valueOf(valueOf));
        } else {
            str = bwlVar.c() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException(str.length() != 0 ? "Complete with: ".concat(str) : new String("Complete with: "), a);
    }
}
