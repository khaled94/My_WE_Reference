package okhttp3.internal.connection;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {
    public IOException a;
    public IOException b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }
}
