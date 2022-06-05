package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: eby  reason: default package */
/* loaded from: classes2.dex */
public final class eby {
    private final dzz a;
    private final ebx b;
    private final ead c;
    private final eao d;
    private List<Proxy> e;
    private int f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<ebe> h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public eby(dzz dzzVar, ebx ebxVar, ead eadVar, eao eaoVar) {
        List<Proxy> list;
        this.e = Collections.emptyList();
        this.a = dzzVar;
        this.b = ebxVar;
        this.c = eadVar;
        this.d = eaoVar;
        eas easVar = dzzVar.a;
        Proxy proxy = dzzVar.h;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.a.g.select(easVar.b());
            list = (select == null || select.isEmpty()) ? ebk.a(Proxy.NO_PROXY) : ebk.a(select);
        }
        this.e = list;
        this.f = 0;
    }

    public final boolean a() {
        return c() || !this.h.isEmpty();
    }

    public final a b() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            if (!c()) {
                throw new SocketException("No route to " + this.a.a.b + "; exhausted proxy configurations: " + this.e);
            }
            List<Proxy> list = this.e;
            int i = this.f;
            this.f = i + 1;
            Proxy proxy = list.get(i);
            a(proxy);
            int size = this.g.size();
            for (int i2 = 0; i2 < size; i2++) {
                ebe ebeVar = new ebe(this.a, proxy, this.g.get(i2));
                if (this.b.c(ebeVar)) {
                    this.h.add(ebeVar);
                } else {
                    arrayList.add(ebeVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.h);
            this.h.clear();
        }
        return new a(arrayList);
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    private void a(Proxy proxy) throws IOException {
        String str;
        int i;
        this.g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            InetAddress address2 = inetSocketAddress.getAddress();
            if (address2 == null) {
                str = inetSocketAddress.getHostName();
            } else {
                str = address2.getHostAddress();
            }
            i = inetSocketAddress.getPort();
        } else {
            str = this.a.a.b;
            i = this.a.a.c;
        }
        if (i <= 0 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            List<InetAddress> lookup = this.a.b.lookup(str);
            if (lookup.isEmpty()) {
                throw new UnknownHostException(this.a.b + " returned no addresses for " + str);
            }
            int size = lookup.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.g.add(new InetSocketAddress(lookup.get(i2), i));
            }
        }
    }

    /* renamed from: eby$a */
    /* loaded from: classes2.dex */
    public static final class a {
        final List<ebe> a;
        int b = 0;

        a(List<ebe> list) {
            this.a = list;
        }

        public final boolean a() {
            return this.b < this.a.size();
        }
    }
}
