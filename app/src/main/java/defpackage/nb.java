package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B7\b\u0016\u0012.\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005J\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u0005H\u0086\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002R6\u0010\n\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/PersistedEvents;", "Ljava/io/Serializable;", "()V", "appEventMap", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "", "Lcom/facebook/appevents/AppEvent;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "events", "addEvents", "", "accessTokenAppIdPair", "appEvents", "", "containsKey", "", "get", "keySet", "", "writeReplace", "", "Companion", "SerializationProxyV1", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nb  reason: default package */
/* loaded from: classes2.dex */
public final class nb implements Serializable {
    public static final a a = new a((byte) 0);
    private final HashMap<mo, List<mq>> b;

    public nb() {
        this.b = new HashMap<>();
    }

    public nb(HashMap<mo, List<mq>> hashMap) {
        dqc.d(hashMap, "appEventMap");
        HashMap<mo, List<mq>> hashMap2 = new HashMap<>();
        this.b = hashMap2;
        hashMap2.putAll(hashMap);
    }

    public final Set<mo> a() {
        if (qx.a(this)) {
            return null;
        }
        try {
            Set<mo> keySet = this.b.keySet();
            dqc.b(keySet, "events.keys");
            return keySet;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public final List<mq> a(mo moVar) {
        if (qx.a(this)) {
            return null;
        }
        try {
            dqc.d(moVar, "accessTokenAppIdPair");
            return this.b.get(moVar);
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public final void a(mo moVar, List<mq> list) {
        if (qx.a(this)) {
            return;
        }
        try {
            dqc.d(moVar, "accessTokenAppIdPair");
            dqc.d(list, "appEvents");
            if (!this.b.containsKey(moVar)) {
                this.b.put(moVar, dmq.a((Collection) list));
                return;
            }
            List<mq> list2 = this.b.get(moVar);
            if (list2 == null) {
                return;
            }
            list2.addAll(list);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB5\u0012.\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002R6\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/PersistedEvents$SerializationProxyV1;", "Ljava/io/Serializable;", "proxyEvents", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "", "Lcom/facebook/appevents/AppEvent;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "readResolve", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nb$b */
    /* loaded from: classes2.dex */
    public static final class b implements Serializable {
        public static final a a = new a((byte) 0);
        private final HashMap<mo, List<mq>> b;

        public b(HashMap<mo, List<mq>> hashMap) {
            dqc.d(hashMap, "proxyEvents");
            this.b = hashMap;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new nb(this.b);
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/PersistedEvents$SerializationProxyV1$Companion;", "", "()V", "serialVersionUID", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: nb$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (qx.a(this)) {
            return null;
        }
        try {
            return new b(this.b);
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/PersistedEvents$Companion;", "", "()V", "serialVersionUID", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nb$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
