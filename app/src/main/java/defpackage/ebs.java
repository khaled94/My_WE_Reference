package defpackage;

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ebs  reason: default package */
/* loaded from: classes2.dex */
public final class ebs {
    boolean a;
    boolean b;
    private final List<eaj> c;
    private int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ebs(List<eaj> list) {
        this.c = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eaj a(SSLSocket sSLSocket) throws IOException {
        eaj eajVar;
        int i = this.d;
        int size = this.c.size();
        while (true) {
            if (i >= size) {
                eajVar = null;
                break;
            }
            eajVar = this.c.get(i);
            if (eajVar.a(sSLSocket)) {
                this.d = i + 1;
                break;
            }
            i++;
        }
        if (eajVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.b + ", modes=" + this.c + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        this.a = b(sSLSocket);
        ebg.a.a(eajVar, sSLSocket, this.b);
        return eajVar;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.d; i < this.c.size(); i++) {
            if (this.c.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
