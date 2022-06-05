package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dmb;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002\u001a1\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00072\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0006H\u0082\b\u001a!\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00052\u0006\u0010\u0011\u001a\u0002H\u0010H\u0000¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\b\b\u0002\u0010\u0014\u001a\u00020\tH\u0082\u0010\u001a\u0018\u0010\u0015\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0016\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"4\u0010\u0002\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00062\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006¨\u0006\u0018"}, d2 = {"cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "throwableFields", "", "createConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", ExifInterface.LONGITUDE_EAST, "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: dyh  reason: default package */
/* loaded from: classes2.dex */
public final class dyh {
    private static final int a = a(Throwable.class, -1);
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, dow<Throwable, Throwable>> c = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dyh$f */
    /* loaded from: classes2.dex */
    static final class f extends dqd implements dow {
        public static final f a = new f();

        f() {
            super(1);
        }

        @Override // defpackage.dow
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dyh$g */
    /* loaded from: classes2.dex */
    static final class g extends dqd implements dow {
        public static final g a = new g();

        g() {
            super(1);
        }

        @Override // defpackage.dow
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0143 A[EDGE_INSN: B:106:0x0143->B:67:0x0143 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E extends java.lang.Throwable> E a(E r9) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyh.a(java.lang.Throwable):java.lang.Throwable");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "e", "kotlinx/coroutines/internal/ExceptionsConstuctorKt$safeCtor$1"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dyh$a */
    /* loaded from: classes2.dex */
    public static final class a extends dqd implements dow<Throwable, Throwable> {
        final /* synthetic */ Constructor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Throwable invoke(Throwable th) {
            Object obj;
            Object newInstance;
            try {
                dmb.a aVar = dmb.a;
                newInstance = this.a.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                dmb.a aVar2 = dmb.a;
                obj = dmb.d(dmc.a(th2));
            }
            if (newInstance != null) {
                obj = dmb.d((Throwable) newInstance);
                if (dmb.b(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "e", "kotlinx/coroutines/internal/ExceptionsConstuctorKt$safeCtor$1"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dyh$b */
    /* loaded from: classes2.dex */
    public static final class b extends dqd implements dow<Throwable, Throwable> {
        final /* synthetic */ Constructor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Throwable invoke(Throwable th) {
            Object obj;
            Object newInstance;
            try {
                dmb.a aVar = dmb.a;
                newInstance = this.a.newInstance(th);
            } catch (Throwable th2) {
                dmb.a aVar2 = dmb.a;
                obj = dmb.d(dmc.a(th2));
            }
            if (newInstance != null) {
                obj = dmb.d((Throwable) newInstance);
                if (dmb.b(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "e", "kotlinx/coroutines/internal/ExceptionsConstuctorKt$safeCtor$1"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dyh$c */
    /* loaded from: classes2.dex */
    public static final class c extends dqd implements dow<Throwable, Throwable> {
        final /* synthetic */ Constructor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Throwable invoke(Throwable th) {
            Object obj;
            Object newInstance;
            try {
                dmb.a aVar = dmb.a;
                newInstance = this.a.newInstance(th.getMessage());
            } catch (Throwable th2) {
                dmb.a aVar2 = dmb.a;
                obj = dmb.d(dmc.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                obj = dmb.d(th3);
                if (dmb.b(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "e", "kotlinx/coroutines/internal/ExceptionsConstuctorKt$safeCtor$1"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dyh$d */
    /* loaded from: classes2.dex */
    public static final class d extends dqd implements dow<Throwable, Throwable> {
        final /* synthetic */ Constructor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Throwable invoke(Throwable th) {
            Object obj;
            Object newInstance;
            try {
                dmb.a aVar = dmb.a;
                newInstance = this.a.newInstance(new Object[0]);
            } catch (Throwable th2) {
                dmb.a aVar2 = dmb.a;
                obj = dmb.d(dmc.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                obj = dmb.d(th3);
                if (dmb.b(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    private static final int a(Class<?> cls, int i) {
        Integer num;
        dqc.d(cls, "$this$kotlin");
        dqg.b(cls);
        try {
            dmb.a aVar = dmb.a;
            int i2 = 0;
            do {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } while (cls != null);
            num = dmb.d(Integer.valueOf(i2));
        } catch (Throwable th) {
            dmb.a aVar2 = dmb.a;
            num = dmb.d(dmc.a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (dmb.b(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 5, 1})
    /* renamed from: dyh$e */
    /* loaded from: classes2.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Integer valueOf = Integer.valueOf(((Constructor) t2).getParameterTypes().length);
            Integer valueOf2 = Integer.valueOf(((Constructor) t).getParameterTypes().length);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 != null) {
                return valueOf.compareTo(valueOf2);
            }
            return 1;
        }
    }
}
