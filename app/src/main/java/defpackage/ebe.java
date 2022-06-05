package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: ebe  reason: default package */
/* loaded from: classes2.dex */
public final class ebe {
    public final dzz a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ebe(dzz dzzVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (dzzVar != null) {
            if (proxy == null) {
                throw new NullPointerException("proxy == null");
            }
            if (inetSocketAddress == null) {
                throw new NullPointerException("inetSocketAddress == null");
            }
            this.a = dzzVar;
            this.b = proxy;
            this.c = inetSocketAddress;
            return;
        }
        throw new NullPointerException("address == null");
    }

    public final Proxy a() {
        return this.b;
    }

    public final boolean b() {
        return this.a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ebe) {
            ebe ebeVar = (ebe) obj;
            return ebeVar.a.equals(this.a) && ebeVar.b.equals(this.b) && ebeVar.c.equals(this.c);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
