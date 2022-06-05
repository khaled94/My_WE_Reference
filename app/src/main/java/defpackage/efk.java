package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.eez;
import defpackage.efc;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: efk  reason: default package */
/* loaded from: classes2.dex */
public class efk {
    private static final efk a;
    private final boolean b;
    private final Constructor<MethodHandles.Lookup> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Executor b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static efk a() {
        return a;
    }

    efk(boolean z) {
        this.b = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.c = constructor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<? extends eez.a> a(Executor executor) {
        efd efdVar = new efd(executor);
        return this.b ? Arrays.asList(efb.a, efdVar) : Collections.singletonList(efdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<? extends efc.a> c() {
        return this.b ? Collections.singletonList(efi.a) : Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        return this.b ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Method method) {
        return this.b && method.isDefault();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.c;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* renamed from: efk$a */
    /* loaded from: classes2.dex */
    static final class a extends efk {
        a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // defpackage.efk
        public final Executor b() {
            return new ExecutorC0031a();
        }

        @Override // defpackage.efk
        final Object a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT < 26) {
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            }
            return efk.super.a(method, cls, obj, objArr);
        }

        /* renamed from: efk$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class ExecutorC0031a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            ExecutorC0031a() {
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }
    }

    static {
        efk efkVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            efkVar = new a();
        } else {
            efkVar = new efk(true);
        }
        a = efkVar;
    }
}
