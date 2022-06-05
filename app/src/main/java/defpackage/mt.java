package defpackage;

import android.content.Context;
import defpackage.mo;
import defpackage.mq;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\b\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/AppEventStore;", "", "()V", "PERSISTED_EVENTS_FILENAME", "", "TAG", "persistEvents", "", "accessTokenAppIdPair", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "appEvents", "Lcom/facebook/appevents/SessionEventsState;", "eventsToPersist", "Lcom/facebook/appevents/AppEventCollection;", "readAndClearStore", "Lcom/facebook/appevents/PersistedEvents;", "saveEventsToDisk", "saveEventsToDisk$facebook_core_release", "MovedClassObjectInputStream", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mt  reason: default package */
/* loaded from: classes2.dex */
public final class mt {
    public static final mt a = new mt();
    private static final String b;

    static {
        String name = mt.class.getName();
        dqc.b(name, "AppEventStore::class.java.name");
        b = name;
    }

    private mt() {
    }

    public static final synchronized void a(mo moVar, nc ncVar) {
        synchronized (mt.class) {
            if (qx.a(mt.class)) {
                return;
            }
            dqc.d(moVar, "accessTokenAppIdPair");
            dqc.d(ncVar, "appEvents");
            of.a();
            nb a2 = a();
            a2.a(moVar, ncVar.b());
            a(a2);
        }
    }

    public static final synchronized void a(mr mrVar) {
        synchronized (mt.class) {
            if (qx.a(mt.class)) {
                return;
            }
            dqc.d(mrVar, "eventsToPersist");
            of.a();
            nb a2 = a();
            for (mo moVar : mrVar.a()) {
                nc a3 = mrVar.a(moVar);
                if (a3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                a2.a(moVar, a3.b());
            }
            a(a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #8 {, blocks: (B:4:0x0003, B:9:0x000c, B:14:0x0034, B:15:0x0039, B:22:0x0051, B:23:0x0056, B:24:0x005f, B:26:0x0061, B:27:0x0066, B:28:0x006c, B:30:0x0071, B:31:0x0076, B:34:0x0080), top: B:47:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized defpackage.nb a() {
        /*
            java.lang.Class<mt> r0 = defpackage.mt.class
            monitor-enter(r0)
            boolean r1 = defpackage.qx.a(r0)     // Catch: java.lang.Throwable -> L8d
            r2 = 0
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            return r2
        Lc:
            defpackage.of.a()     // Catch: java.lang.Throwable -> L87
            android.content.Context r1 = defpackage.ly.k()     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60 java.io.FileNotFoundException -> L70
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            defpackage.dqc.b(r3, r4)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60 java.io.FileNotFoundException -> L70
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60 java.io.FileNotFoundException -> L70
            mt$a r4 = new mt$a     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60 java.io.FileNotFoundException -> L70
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60 java.io.FileNotFoundException -> L70
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60 java.io.FileNotFoundException -> L70
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60 java.io.FileNotFoundException -> L70
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60 java.io.FileNotFoundException -> L70
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L61 java.io.FileNotFoundException -> L71
            if (r3 == 0) goto L45
            nb r3 = (defpackage.nb) r3     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L61 java.io.FileNotFoundException -> L71
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L87
            defpackage.qi.a(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L87
            r1.delete()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L87
            goto L7e
        L43:
            goto L7e
        L45:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L61 java.io.FileNotFoundException -> L71
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L61 java.io.FileNotFoundException -> L71
            throw r3     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L61 java.io.FileNotFoundException -> L71
        L4d:
            r3 = move-exception
            goto L51
        L4f:
            r3 = move-exception
            r4 = r2
        L51:
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L87
            defpackage.qi.a(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L87
            r1.delete()     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L87
        L5f:
            throw r3     // Catch: java.lang.Throwable -> L87
        L60:
            r4 = r2
        L61:
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L87
            defpackage.qi.a(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L87
        L6c:
            r1.delete()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L87
            goto L7d
        L70:
            r4 = r2
        L71:
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L87
            defpackage.qi.a(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L87
            goto L6c
        L7d:
            r3 = r2
        L7e:
            if (r3 != 0) goto L85
            nb r3 = new nb     // Catch: java.lang.Throwable -> L87
            r3.<init>()     // Catch: java.lang.Throwable -> L87
        L85:
            monitor-exit(r0)
            return r3
        L87:
            r1 = move-exception
            defpackage.qx.a(r1, r0)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r0)
            return r2
        L8d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt.a():nb");
    }

    private static void a(nb nbVar) {
        if (qx.a(mt.class)) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            Context k = ly.k();
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(k.openFileOutput("AppEventsLogger.persistedevents", 0)));
                try {
                    objectOutputStream2.writeObject(nbVar);
                    qi.a(objectOutputStream2);
                } catch (Throwable unused) {
                    objectOutputStream = objectOutputStream2;
                    try {
                        k.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused2) {
                        qi.a(objectOutputStream);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable th) {
            qx.a(th, mt.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/AppEventStore$MovedClassObjectInputStream;", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "readClassDescriptor", "Ljava/io/ObjectStreamClass;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: mt$a */
    /* loaded from: classes2.dex */
    public static final class a extends ObjectInputStream {
        public static final C0039a a = new C0039a((byte) 0);

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected final ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            dqc.b(readClassDescriptor, "resultClassDescriptor");
            if (dqc.a((Object) readClassDescriptor.getName(), (Object) "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                readClassDescriptor = ObjectStreamClass.lookup(mo.b.class);
            } else if (dqc.a((Object) readClassDescriptor.getName(), (Object) "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                readClassDescriptor = ObjectStreamClass.lookup(mq.b.class);
            }
            dqc.b(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/AppEventStore$MovedClassObjectInputStream$Companion;", "", "()V", "ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME", "", "APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: mt$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0039a {
            private C0039a() {
            }

            public /* synthetic */ C0039a(byte b) {
                this();
            }
        }
    }
}
