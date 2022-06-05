package defpackage;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: eaq  reason: default package */
/* loaded from: classes2.dex */
public final class eaq {
    public final eag a;
    public final List<Certificate> b;
    private final ebf c;
    private final List<Certificate> d;

    private eaq(ebf ebfVar, eag eagVar, List<Certificate> list, List<Certificate> list2) {
        this.c = ebfVar;
        this.a = eagVar;
        this.b = list;
        this.d = list2;
    }

    public static eaq a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        eag a = eag.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        ebf forJavaName = ebf.forJavaName(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        if (certificateArr != null) {
            list = ebk.a(certificateArr);
        } else {
            list = Collections.emptyList();
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            list2 = ebk.a(localCertificates);
        } else {
            list2 = Collections.emptyList();
        }
        return new eaq(forJavaName, a, list, list2);
    }

    public final eag a() {
        return this.a;
    }

    public final List<Certificate> b() {
        return this.b;
    }

    public final Principal c() {
        if (!this.b.isEmpty()) {
            return ((X509Certificate) this.b.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public final List<Certificate> d() {
        return this.d;
    }

    public final Principal e() {
        if (!this.d.isEmpty()) {
            return ((X509Certificate) this.d.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eaq)) {
            return false;
        }
        eaq eaqVar = (eaq) obj;
        return this.c.equals(eaqVar.c) && this.a.equals(eaqVar.a) && this.b.equals(eaqVar.b) && this.d.equals(eaqVar.d);
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.c + " cipherSuite=" + this.a + " peerCertificates=" + a(this.b) + " localCertificates=" + a(this.d) + '}';
    }

    private static List<String> a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }
}
