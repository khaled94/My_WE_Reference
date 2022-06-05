package retrofit2;

import java.util.Objects;

/* loaded from: classes2.dex */
public class HttpException extends RuntimeException {
    private final int a;
    private final String b;
    private final transient efn<?> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(efn<?> efnVar) {
        super("HTTP " + efnVar.a.c + " " + efnVar.a.d);
        Objects.requireNonNull(efnVar, "response == null");
        this.a = efnVar.a.c;
        this.b = efnVar.a.d;
        this.c = efnVar;
    }
}
