package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.internal.OsSharedRealm;
import io.realm.log.RealmLog;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class OsRealmConfig implements dlf {
    private static final long d = nativeGetFinalizerPtr();
    final dks a;
    final URI b;
    final dle c;
    private final long e;
    private final CompactOnLaunchCallback f;
    private final OsSharedRealm.MigrationCallback g;
    private final OsSharedRealm.InitializationCallback h;

    private static native long nativeCreate(String str, String str2, boolean z, boolean z2);

    private static native String nativeCreateAndSetSyncConfig(long j, String str, String str2, String str3, String str4, boolean z, byte b2, String str5, String str6, String[] strArr, byte b3);

    private static native void nativeEnableChangeNotification(long j, boolean z);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j, byte[] bArr);

    private static native void nativeSetInMemory(long j, boolean z);

    private native void nativeSetInitializationCallback(long j, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j, byte b2, long j2, long j3, OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j, byte b2, String str, int i);

    private static native void nativeSetSyncConfigSslSettings(long j, boolean z, String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ OsRealmConfig(dks dksVar, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, byte b2) {
        this(dksVar, str, z, osSchemaInfo, migrationCallback, initializationCallback);
    }

    /* loaded from: classes2.dex */
    public enum b {
        FULL(0),
        MEM_ONLY(1);
        
        final int value;

        b(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE((byte) 4),
        SCHEMA_MODE_MANUAL((byte) 5);
        
        final byte value;

        c(byte b) {
            this.value = b;
        }

        public final byte getNativeValue() {
            return this.value;
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        dks a;
        OsSchemaInfo b = null;
        OsSharedRealm.MigrationCallback c = null;
        OsSharedRealm.InitializationCallback d = null;
        boolean e = false;
        String f = "";

        public a(dks dksVar) {
            this.a = dksVar;
        }
    }

    private OsRealmConfig(dks dksVar, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback) {
        URI uri;
        URI uri2;
        this.c = new dle();
        this.a = dksVar;
        this.e = nativeCreate(dksVar.b, str, false, true);
        dle.a.a(this);
        dlg.c();
        Object[] a2 = dlg.a();
        String str2 = (String) a2[0];
        String str3 = (String) a2[1];
        String str4 = (String) a2[2];
        String str5 = (String) a2[3];
        boolean equals = Boolean.TRUE.equals(a2[4]);
        String str6 = (String) a2[5];
        Byte b2 = (Byte) a2[6];
        boolean equals2 = Boolean.TRUE.equals(a2[7]);
        String str7 = (String) a2[8];
        String str8 = (String) a2[9];
        Byte b3 = (Byte) a2[11];
        Map map = (Map) a2[10];
        String[] strArr = new String[map != null ? map.size() * 2 : 0];
        if (map != null) {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                strArr[i] = (String) entry.getKey();
                strArr[i + 1] = (String) entry.getValue();
                i += 2;
            }
        }
        byte[] copyOf = dksVar.c == null ? null : Arrays.copyOf(dksVar.c, dksVar.c.length);
        if (copyOf != null) {
            nativeSetEncryptionKey(this.e, copyOf);
        }
        nativeSetInMemory(this.e, dksVar.f == b.MEM_ONLY);
        nativeEnableChangeNotification(this.e, z);
        c cVar = c.SCHEMA_MODE_MANUAL;
        if (dksVar.i) {
            cVar = c.SCHEMA_MODE_IMMUTABLE;
        } else if (dksVar.g) {
            cVar = c.SCHEMA_MODE_READONLY;
        } else if (str3 != null) {
            cVar = c.SCHEMA_MODE_ADDITIVE;
        } else if (dksVar.e) {
            cVar = c.SCHEMA_MODE_RESET_FILE;
        }
        long j = dksVar.d;
        long nativePtr = osSchemaInfo == null ? 0L : osSchemaInfo.getNativePtr();
        this.g = migrationCallback;
        nativeSetSchemaConfig(this.e, cVar.getNativeValue(), j, nativePtr, migrationCallback);
        CompactOnLaunchCallback compactOnLaunchCallback = dksVar.h;
        this.f = compactOnLaunchCallback;
        if (compactOnLaunchCallback != null) {
            nativeSetCompactOnLaunchCallback(this.e, compactOnLaunchCallback);
        }
        this.h = initializationCallback;
        if (initializationCallback != null) {
            nativeSetInitializationCallback(this.e, initializationCallback);
        }
        if (str3 != null) {
            String nativeCreateAndSetSyncConfig = nativeCreateAndSetSyncConfig(this.e, str3, str4, str2, str5, equals2, b2.byteValue(), str7, str8, strArr, b3.byteValue());
            try {
                uri = new URI(nativeCreateAndSetSyncConfig);
            } catch (URISyntaxException e) {
                RealmLog.a(e, "Cannot create a URI from the Realm URL address", new Object[0]);
                uri = null;
            }
            nativeSetSyncConfigSslSettings(this.e, equals, str6);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (uri != null && proxySelector != null) {
                try {
                    uri2 = new URI(nativeCreateAndSetSyncConfig.replaceFirst("realm", "http"));
                } catch (URISyntaxException e2) {
                    RealmLog.a(e2, "Cannot create a URI from the Realm URL address", new Object[0]);
                    uri2 = null;
                }
                List<Proxy> select = proxySelector.select(uri2);
                if (select != null && !select.isEmpty()) {
                    Proxy proxy = select.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        byte b4 = AnonymousClass1.a[proxy.type().ordinal()] == 1 ? (byte) 0 : (byte) -1;
                        if (proxy.type() == Proxy.Type.HTTP) {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                nativeSetSyncConfigProxySettings(this.e, b4, inetSocketAddress.getHostString(), inetSocketAddress.getPort());
                            } else {
                                RealmLog.b("Unsupported proxy socket address type: " + address.getClass().getName(), new Object[0]);
                            }
                        } else {
                            RealmLog.b("SOCKS proxies are not supported.", new Object[0]);
                        }
                    }
                }
            }
        } else {
            uri = null;
        }
        this.b = uri;
    }

    /* renamed from: io.realm.internal.OsRealmConfig$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            a = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // defpackage.dlf
    public long getNativePtr() {
        return this.e;
    }

    @Override // defpackage.dlf
    public long getNativeFinalizerPtr() {
        return d;
    }
}
