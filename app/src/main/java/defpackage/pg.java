package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers;", "", "()V", "androidAdvertiserId", "", "getAndroidAdvertiserId", "()Ljava/lang/String;", "androidAdvertiserIdValue", "<set-?>", "androidInstallerPackage", "getAndroidInstallerPackage", "attributionId", "getAttributionId", "fetchTime", "", "", "isTrackingLimited", "()Z", "Companion", "GoogleAdInfo", "GoogleAdServiceConnection", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pg  reason: default package */
/* loaded from: classes2.dex */
public final class pg {
    public static pg d;
    public static final a e = new a((byte) 0);
    private static final String h = pg.class.getCanonicalName();
    String a;
    String b;
    public boolean c;
    private String f;
    private long g;

    public final String a() {
        if (!ly.i() || !ly.r()) {
            return null;
        }
        return this.f;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$Companion;", "", "()V", "ANDROID_ID_COLUMN_NAME", "", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "CONNECTION_RESULT_SUCCESS", "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "", "LIMIT_TRACKING_COLUMN_NAME", "TAG", "cachedIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "getCachedIdentifiers$facebook_core_release$annotations", "cacheAndReturnIdentifiers", "identifiers", "getAndroidId", "context", "Landroid/content/Context;", "getAndroidIdViaReflection", "getAndroidIdViaService", "getAttributionIdentifiers", "getInstallerPackageName", "isGooglePlayServicesAvailable", "", "isTrackingLimited", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pg$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        private static pg c(Context context) {
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        if (!(!cVar.a.compareAndSet(true, true))) {
                            throw new IllegalStateException("Binder already consumed".toString());
                        }
                        IBinder take = cVar.b.take();
                        dqc.b(take, "queue.take()");
                        b bVar = new b(take);
                        pg pgVar = new pg();
                        pgVar.f = bVar.a();
                        pgVar.c = bVar.b();
                        return pgVar;
                    }
                } catch (Exception e) {
                    qi.a("android_id", e);
                } finally {
                    context.unbindService(cVar);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private static pg a(pg pgVar) {
            pgVar.g = System.currentTimeMillis();
            pg.d = pgVar;
            return pgVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[Catch: Exception -> 0x008d, TryCatch #0 {Exception -> 0x008d, blocks: (B:3:0x0001, B:6:0x0014, B:8:0x0020, B:14:0x0031, B:17:0x0042, B:20:0x004d, B:24:0x006a, B:26:0x0084, B:27:0x0088), top: B:33:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static defpackage.pg b(android.content.Context r7) {
            /*
                r0 = 0
                java.lang.String r1 = "com.google.android.gms.common.GooglePlayServicesUtil"
                java.lang.String r2 = "isGooglePlayServicesAvailable"
                r3 = 1
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L8d
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r6 = 0
                r4[r6] = r5     // Catch: java.lang.Exception -> L8d
                java.lang.reflect.Method r1 = defpackage.qi.a(r1, r2, r4)     // Catch: java.lang.Exception -> L8d
                if (r1 != 0) goto L14
                goto L2d
            L14:
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L8d
                r2[r6] = r7     // Catch: java.lang.Exception -> L8d
                java.lang.Object r1 = defpackage.qi.a(r0, r1, r2)     // Catch: java.lang.Exception -> L8d
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L8d
                if (r2 == 0) goto L2d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L8d
                boolean r1 = defpackage.dqc.a(r1, r2)     // Catch: java.lang.Exception -> L8d
                r1 = r1 ^ r3
                if (r1 != 0) goto L2d
                r1 = 1
                goto L2e
            L2d:
                r1 = 0
            L2e:
                if (r1 != 0) goto L31
                return r0
            L31:
                java.lang.String r1 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
                java.lang.String r2 = "getAdvertisingIdInfo"
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L8d
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r4[r6] = r5     // Catch: java.lang.Exception -> L8d
                java.lang.reflect.Method r1 = defpackage.qi.a(r1, r2, r4)     // Catch: java.lang.Exception -> L8d
                if (r1 != 0) goto L42
                return r0
            L42:
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L8d
                r2[r6] = r7     // Catch: java.lang.Exception -> L8d
                java.lang.Object r7 = defpackage.qi.a(r0, r1, r2)     // Catch: java.lang.Exception -> L8d
                if (r7 != 0) goto L4d
                return r0
            L4d:
                java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Exception -> L8d
                java.lang.String r2 = "getId"
                java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L8d
                java.lang.reflect.Method r1 = defpackage.qi.a(r1, r2, r3)     // Catch: java.lang.Exception -> L8d
                java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Exception -> L8d
                java.lang.String r3 = "isLimitAdTrackingEnabled"
                java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L8d
                java.lang.reflect.Method r2 = defpackage.qi.a(r2, r3, r4)     // Catch: java.lang.Exception -> L8d
                if (r1 == 0) goto L8c
                if (r2 != 0) goto L6a
                goto L8c
            L6a:
                pg r3 = new pg     // Catch: java.lang.Exception -> L8d
                r3.<init>()     // Catch: java.lang.Exception -> L8d
                java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L8d
                java.lang.Object r1 = defpackage.qi.a(r7, r1, r4)     // Catch: java.lang.Exception -> L8d
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8d
                defpackage.pg.a(r3, r1)     // Catch: java.lang.Exception -> L8d
                java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L8d
                java.lang.Object r7 = defpackage.qi.a(r7, r2, r1)     // Catch: java.lang.Exception -> L8d
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L8d
                if (r7 == 0) goto L88
                boolean r6 = r7.booleanValue()     // Catch: java.lang.Exception -> L8d
            L88:
                defpackage.pg.a(r3, r6)     // Catch: java.lang.Exception -> L8d
                return r3
            L8c:
                return r0
            L8d:
                r7 = move-exception
                java.lang.String r1 = "android_id"
                defpackage.qi.a(r1, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.a.b(android.content.Context):pg");
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[Catch: all -> 0x010b, Exception -> 0x010d, TryCatch #5 {Exception -> 0x010d, all -> 0x010b, blocks: (B:8:0x001d, B:10:0x002b, B:12:0x002f, B:15:0x0040, B:17:0x005b, B:19:0x0068, B:22:0x0072, B:24:0x007f, B:26:0x0087, B:28:0x008d, B:31:0x0099, B:33:0x009e, B:35:0x00a3, B:56:0x0101, B:57:0x010a), top: B:72:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x010b, Exception -> 0x010d, TryCatch #5 {Exception -> 0x010d, all -> 0x010b, blocks: (B:8:0x001d, B:10:0x002b, B:12:0x002f, B:15:0x0040, B:17:0x005b, B:19:0x0068, B:22:0x0072, B:24:0x007f, B:26:0x0087, B:28:0x008d, B:31:0x0099, B:33:0x009e, B:35:0x00a3, B:56:0x0101, B:57:0x010a), top: B:72:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[Catch: all -> 0x010b, Exception -> 0x010d, TryCatch #5 {Exception -> 0x010d, all -> 0x010b, blocks: (B:8:0x001d, B:10:0x002b, B:12:0x002f, B:15:0x0040, B:17:0x005b, B:19:0x0068, B:22:0x0072, B:24:0x007f, B:26:0x0087, B:28:0x008d, B:31:0x0099, B:33:0x009e, B:35:0x00a3, B:56:0x0101, B:57:0x010a), top: B:72:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[Catch: all -> 0x010b, Exception -> 0x010d, TRY_LEAVE, TryCatch #5 {Exception -> 0x010d, all -> 0x010b, blocks: (B:8:0x001d, B:10:0x002b, B:12:0x002f, B:15:0x0040, B:17:0x005b, B:19:0x0068, B:22:0x0072, B:24:0x007f, B:26:0x0087, B:28:0x008d, B:31:0x0099, B:33:0x009e, B:35:0x00a3, B:56:0x0101, B:57:0x010a), top: B:72:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.pg a(android.content.Context r12) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.a.a(android.content.Context):pg");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;", "Landroid/content/ServiceConnection;", "()V", "binder", "Landroid/os/IBinder;", "getBinder", "()Landroid/os/IBinder;", "consumed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "queue", "Ljava/util/concurrent/BlockingQueue;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", NotificationCompat.CATEGORY_SERVICE, "onServiceDisconnected", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pg$c */
    /* loaded from: classes2.dex */
    public static final class c implements ServiceConnection {
        final AtomicBoolean a = new AtomicBoolean(false);
        final BlockingQueue<IBinder> b = new LinkedBlockingDeque();

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;", "Landroid/os/IInterface;", "binder", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)V", "advertiserId", "", "getAdvertiserId", "()Ljava/lang/String;", "isTrackingLimited", "", "()Z", "asBinder", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pg$b */
    /* loaded from: classes2.dex */
    public static final class b implements IInterface {
        public static final a a = new a((byte) 0);
        private final IBinder b;

        public b(IBinder iBinder) {
            dqc.d(iBinder, "binder");
            this.b = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.b;
        }

        public final String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            dqc.b(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            dqc.b(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            dqc.b(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            dqc.b(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo$Companion;", "", "()V", "FIRST_TRANSACTION_CODE", "", "SECOND_TRANSACTION_CODE", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: pg$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }
    }
}
