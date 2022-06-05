package okhttp3.internal.http2;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class StreamResetException extends IOException {
    public final ecm a;

    public StreamResetException(ecm ecmVar) {
        super("stream was reset: ".concat(String.valueOf(ecmVar)));
        this.a = ecmVar;
    }
}
