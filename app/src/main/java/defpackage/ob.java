package defpackage;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B=\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ$\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "", "skuDetailsParamsClazz", "Ljava/lang/Class;", "builderClazz", "newBuilderMethod", "Ljava/lang/reflect/Method;", "setTypeMethod", "setSkusListMethod", "buildMethod", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getSkuDetailsParamsClazz", "()Ljava/lang/Class;", "getSkuDetailsParams", "skuType", "", "skuIDs", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ob  reason: default package */
/* loaded from: classes2.dex */
public final class ob {
    private static ob h;
    private final Class<?> b;
    private final Class<?> c;
    private final Method d;
    private final Method e;
    private final Method f;
    private final Method g;
    public static final a a = new a((byte) 0);
    private static final AtomicBoolean i = new AtomicBoolean(false);

    public ob(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        dqc.d(cls, "skuDetailsParamsClazz");
        dqc.d(cls2, "builderClazz");
        dqc.d(method, "newBuilderMethod");
        dqc.d(method2, "setTypeMethod");
        dqc.d(method3, "setSkusListMethod");
        dqc.d(method4, "buildMethod");
        this.b = cls;
        this.c = cls2;
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = method4;
    }

    public static final /* synthetic */ void a(ob obVar) {
        if (qx.a(ob.class)) {
            return;
        }
        try {
            h = obVar;
        } catch (Throwable th) {
            qx.a(th, ob.class);
        }
    }

    public static final /* synthetic */ AtomicBoolean b() {
        if (qx.a(ob.class)) {
            return null;
        }
        try {
            return i;
        } catch (Throwable th) {
            qx.a(th, ob.class);
            return null;
        }
    }

    public static final /* synthetic */ ob c() {
        if (qx.a(ob.class)) {
            return null;
        }
        try {
            return h;
        } catch (Throwable th) {
            qx.a(th, ob.class);
            return null;
        }
    }

    public final Class<?> a() {
        if (qx.a(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public final Object a(String str, List<String> list) {
        Object a2;
        Object a3;
        if (qx.a(this)) {
            return null;
        }
        try {
            Object a4 = oc.a(this.b, this.d, null, new Object[0]);
            if (a4 != null && (a2 = oc.a(this.c, this.e, a4, str)) != null && (a3 = oc.a(this.c, this.f, a2, list)) != null) {
                return oc.a(this.c, this.g, a3, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper$Companion;", "", "()V", "CLASSNAME_SKU_DETAILS_PARAMS", "", "CLASSNAME_SKU_DETAILS_PARAMS_BUILDER", "METHOD_BUILD", "METHOD_NEW_BUILDER", "METHOD_SET_SKU_LIST", "METHOD_SET_TYPE", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "instance", "Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "createInstance", "", "getOrCreateInstance", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ob$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
