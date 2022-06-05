package com.google.zxing;

/* loaded from: classes.dex */
public final class NotFoundException extends ReaderException {
    private static final NotFoundException c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        c = notFoundException;
        notFoundException.setStackTrace(b);
    }

    private NotFoundException() {
    }
}
