package com.google.zxing;

/* loaded from: classes.dex */
public abstract class ReaderException extends Exception {
    protected static final boolean a;
    protected static final StackTraceElement[] b;

    static {
        a = System.getProperty("surefire.test.class.path") != null;
        b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
