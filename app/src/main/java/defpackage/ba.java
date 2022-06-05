package defpackage;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import defpackage.ak;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: ba  reason: default package */
/* loaded from: classes.dex */
public final class ba implements ap {
    protected static final boolean a = ax.b;
    @Deprecated
    protected final bg b;
    protected final bb c;
    private final az d;

    @Deprecated
    public ba(bg bgVar) {
        this(bgVar, new bb());
    }

    @Deprecated
    private ba(bg bgVar, bb bbVar) {
        this.b = bgVar;
        this.d = new ay(bgVar);
        this.c = bbVar;
    }

    public ba(az azVar) {
        this(azVar, new bb());
    }

    private ba(az azVar, bb bbVar) {
        this.d = azVar;
        this.b = azVar;
        this.c = bbVar;
    }

    @Override // defpackage.ap
    public final ar a(as<?> asVar) throws VolleyError {
        List list;
        byte[] bArr;
        IOException e;
        Map<String, String> map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            List emptyList = Collections.emptyList();
            bf bfVar = null;
            try {
                try {
                    ak.a aVar = asVar.k;
                    if (aVar == null) {
                        map = Collections.emptyMap();
                    } else {
                        HashMap hashMap = new HashMap();
                        if (aVar.b != null) {
                            hashMap.put("If-None-Match", aVar.b);
                        }
                        if (aVar.d > 0) {
                            hashMap.put("If-Modified-Since", be.a().format(new Date(aVar.d)));
                        }
                        map = hashMap;
                    }
                    bf a2 = this.d.a(asVar, map);
                    try {
                        int i = a2.a;
                        List unmodifiableList = Collections.unmodifiableList(a2.b);
                        if (i == 304) {
                            ak.a aVar2 = asVar.k;
                            if (aVar2 == null) {
                                return new ar(304, null, true, SystemClock.elapsedRealtime() - elapsedRealtime, unmodifiableList);
                            }
                            return new ar(304, aVar2.a, true, SystemClock.elapsedRealtime() - elapsedRealtime, a(unmodifiableList, aVar2));
                        }
                        InputStream inputStream = a2.d;
                        byte[] a3 = inputStream != null ? a(inputStream, a2.c) : new byte[0];
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (a || elapsedRealtime2 > 3000) {
                            Object[] objArr = new Object[5];
                            objArr[0] = asVar;
                            objArr[1] = Long.valueOf(elapsedRealtime2);
                            objArr[2] = a3 != null ? Integer.valueOf(a3.length) : "null";
                            objArr[3] = Integer.valueOf(i);
                            objArr[4] = Integer.valueOf(asVar.j.b());
                            ax.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                        }
                        if (i < 200 || i > 299) {
                            throw new IOException();
                        }
                        return new ar(i, a3, false, SystemClock.elapsedRealtime() - elapsedRealtime, unmodifiableList);
                    } catch (IOException e2) {
                        e = e2;
                        list = emptyList;
                        bArr = null;
                        bfVar = a2;
                        if (bfVar == null) {
                            throw new NoConnectionError(e);
                        }
                        int i2 = bfVar.a;
                        ax.c("Unexpected response code %d for %s", Integer.valueOf(i2), asVar.b);
                        if (bArr != null) {
                            ar arVar = new ar(i2, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, list);
                            if (i2 == 401 || i2 == 403) {
                                a("auth", asVar, new AuthFailureError(arVar));
                            } else if (i2 >= 400 && i2 <= 499) {
                                throw new ClientError(arVar);
                            } else {
                                if (i2 < 500 || i2 > 599) {
                                    throw new ServerError(arVar);
                                }
                                if (asVar.i) {
                                    a("server", asVar, new ServerError(arVar));
                                } else {
                                    throw new ServerError(arVar);
                                }
                            }
                        } else {
                            a("network", asVar, new NetworkError());
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    list = emptyList;
                    bArr = null;
                }
            } catch (MalformedURLException e4) {
                throw new RuntimeException("Bad URL " + asVar.b, e4);
            } catch (SocketTimeoutException unused) {
                a("socket", asVar, new TimeoutError());
            }
        }
    }

    private byte[] a(InputStream inputStream, int i) throws IOException, ServerError {
        bl blVar = new bl(this.c, i);
        try {
            if (inputStream == null) {
                throw new ServerError();
            }
            byte[] a2 = this.c.a(1024);
            while (true) {
                int read = inputStream.read(a2);
                if (read == -1) {
                    break;
                }
                blVar.write(a2, 0, read);
            }
            byte[] byteArray = blVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    ax.a("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.c.a(a2);
            blVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    ax.a("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.c.a((byte[]) null);
            blVar.close();
            throw th;
        }
    }

    private static List<ao> a(List<ao> list, ak.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (ao aoVar : list) {
                treeSet.add(aoVar.a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (aVar.h != null) {
            if (!aVar.h.isEmpty()) {
                for (ao aoVar2 : aVar.h) {
                    if (!treeSet.contains(aoVar2.a)) {
                        arrayList.add(aoVar2);
                    }
                }
            }
        } else if (!aVar.g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new ao(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    private static void a(String str, as<?> asVar, VolleyError volleyError) throws VolleyError {
        aw awVar = asVar.j;
        int h = asVar.h();
        try {
            awVar.a(volleyError);
            asVar.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(h)));
        } catch (VolleyError e) {
            asVar.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(h)));
            throw e;
        }
    }
}
