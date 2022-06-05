package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: eag  reason: default package */
/* loaded from: classes2.dex */
public final class eag {
    final String bq;
    static final Comparator<String> a = $$Lambda$eag$ducm_IL9dSPumw3AEePO921lcwc.INSTANCE;
    private static final Map<String, eag> br = new LinkedHashMap();
    public static final eag b = b("SSL_RSA_WITH_NULL_MD5");
    public static final eag c = b("SSL_RSA_WITH_NULL_SHA");
    public static final eag d = b("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
    public static final eag e = b("SSL_RSA_WITH_RC4_128_MD5");
    public static final eag f = b("SSL_RSA_WITH_RC4_128_SHA");
    public static final eag g = b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final eag h = b("SSL_RSA_WITH_DES_CBC_SHA");
    public static final eag i = b("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final eag j = b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
    public static final eag k = b("SSL_DHE_DSS_WITH_DES_CBC_SHA");
    public static final eag l = b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
    public static final eag m = b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final eag n = b("SSL_DHE_RSA_WITH_DES_CBC_SHA");
    public static final eag o = b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final eag p = b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
    public static final eag q = b("SSL_DH_anon_WITH_RC4_128_MD5");
    public static final eag r = b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
    public static final eag s = b("SSL_DH_anon_WITH_DES_CBC_SHA");
    public static final eag t = b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final eag u = b("TLS_KRB5_WITH_DES_CBC_SHA");
    public static final eag v = b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
    public static final eag w = b("TLS_KRB5_WITH_RC4_128_SHA");
    public static final eag x = b("TLS_KRB5_WITH_DES_CBC_MD5");
    public static final eag y = b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
    public static final eag z = b("TLS_KRB5_WITH_RC4_128_MD5");
    public static final eag A = b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
    public static final eag B = b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
    public static final eag C = b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
    public static final eag D = b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
    public static final eag E = b("TLS_RSA_WITH_AES_128_CBC_SHA");
    public static final eag F = b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    public static final eag G = b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    public static final eag H = b("TLS_DH_anon_WITH_AES_128_CBC_SHA");
    public static final eag I = b("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final eag J = b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    public static final eag K = b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    public static final eag L = b("TLS_DH_anon_WITH_AES_256_CBC_SHA");
    public static final eag M = b("TLS_RSA_WITH_NULL_SHA256");
    public static final eag N = b("TLS_RSA_WITH_AES_128_CBC_SHA256");
    public static final eag O = b("TLS_RSA_WITH_AES_256_CBC_SHA256");
    public static final eag P = b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    public static final eag Q = b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final eag R = b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
    public static final eag S = b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final eag T = b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final eag U = b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    public static final eag V = b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    public static final eag W = b("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
    public static final eag X = b("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
    public static final eag Y = b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final eag Z = b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
    public static final eag aa = b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final eag ab = b("TLS_PSK_WITH_RC4_128_SHA");
    public static final eag ac = b("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
    public static final eag ad = b("TLS_PSK_WITH_AES_128_CBC_SHA");
    public static final eag ae = b("TLS_PSK_WITH_AES_256_CBC_SHA");
    public static final eag af = b("TLS_RSA_WITH_SEED_CBC_SHA");
    public static final eag ag = b("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final eag ah = b("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final eag ai = b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final eag aj = b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final eag ak = b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    public static final eag al = b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    public static final eag am = b("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
    public static final eag an = b("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
    public static final eag ao = b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
    public static final eag ap = b("TLS_FALLBACK_SCSV");
    public static final eag aq = b("TLS_ECDH_ECDSA_WITH_NULL_SHA");
    public static final eag ar = b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
    public static final eag as = b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final eag at = b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
    public static final eag au = b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
    public static final eag av = b("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
    public static final eag aw = b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
    public static final eag ax = b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final eag ay = b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    public static final eag az = b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    public static final eag aA = b("TLS_ECDH_RSA_WITH_NULL_SHA");
    public static final eag aB = b("TLS_ECDH_RSA_WITH_RC4_128_SHA");
    public static final eag aC = b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final eag aD = b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
    public static final eag aE = b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
    public static final eag aF = b("TLS_ECDHE_RSA_WITH_NULL_SHA");
    public static final eag aG = b("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
    public static final eag aH = b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final eag aI = b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final eag aJ = b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final eag aK = b("TLS_ECDH_anon_WITH_NULL_SHA");
    public static final eag aL = b("TLS_ECDH_anon_WITH_RC4_128_SHA");
    public static final eag aM = b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final eag aN = b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
    public static final eag aO = b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
    public static final eag aP = b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final eag aQ = b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final eag aR = b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final eag aS = b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final eag aT = b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final eag aU = b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    public static final eag aV = b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
    public static final eag aW = b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
    public static final eag aX = b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final eag aY = b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final eag aZ = b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final eag ba = b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final eag bb = b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final eag bc = b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final eag bd = b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
    public static final eag be = b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    public static final eag bf = b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
    public static final eag bg = b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    public static final eag bh = b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final eag bi = b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final eag bj = b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final eag bk = b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    public static final eag bl = b("TLS_AES_128_GCM_SHA256");
    public static final eag bm = b("TLS_AES_256_GCM_SHA384");
    public static final eag bn = b("TLS_CHACHA20_POLY1305_SHA256");
    public static final eag bo = b("TLS_AES_128_CCM_SHA256");
    public static final eag bp = b("TLS_AES_128_CCM_8_SHA256");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i2 = 4; i2 < min; i2++) {
            char charAt = str.charAt(i2);
            char charAt2 = str2.charAt(i2);
            if (charAt != charAt2) {
                return charAt < charAt2 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }

    public static synchronized eag a(String str) {
        eag eagVar;
        String str2;
        synchronized (eag.class) {
            eagVar = br.get(str);
            if (eagVar == null) {
                Map<String, eag> map = br;
                if (str.startsWith("TLS_")) {
                    str2 = "SSL_" + str.substring(4);
                } else if (str.startsWith("SSL_")) {
                    str2 = "TLS_" + str.substring(4);
                } else {
                    str2 = str;
                }
                eagVar = map.get(str2);
                if (eagVar == null) {
                    eagVar = new eag(str);
                }
                br.put(str, eagVar);
            }
        }
        return eagVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<eag> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private eag(String str) {
        if (str == null) {
            throw null;
        }
        this.bq = str;
    }

    private static eag b(String str) {
        eag eagVar = new eag(str);
        br.put(str, eagVar);
        return eagVar;
    }

    public final String a() {
        return this.bq;
    }

    public final String toString() {
        return this.bq;
    }
}
