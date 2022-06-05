package defpackage;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* compiled from: lambda */
/* renamed from: -$$Lambda$djk$T9jOiujFHvpLQKCqh8Of3vukCEE  reason: invalid class name and default package */
/* loaded from: classes.dex */
public final /* synthetic */ class $$Lambda$djk$T9jOiujFHvpLQKCqh8Of3vukCEE implements HostnameVerifier {
    public static final /* synthetic */ $$Lambda$djk$T9jOiujFHvpLQKCqh8Of3vukCEE INSTANCE = new $$Lambda$djk$T9jOiujFHvpLQKCqh8Of3vukCEE();

    private /* synthetic */ $$Lambda$djk$T9jOiujFHvpLQKCqh8Of3vukCEE() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean a;
        a = djk.a(str, sSLSession);
        return a;
    }
}
