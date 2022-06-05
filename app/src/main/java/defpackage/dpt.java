package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: dpt  reason: default package */
/* loaded from: classes2.dex */
public abstract class dpt implements drf, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient drf reflected;
    private final String signature;

    protected abstract drf computeReflected();

    /* renamed from: dpt$a */
    /* loaded from: classes2.dex */
    static class a implements Serializable {
        private static final a a = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return a;
        }
    }

    public dpt() {
        this(NO_RECEIVER);
    }

    protected dpt(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dpt(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public drf compute() {
        drf drfVar = this.reflected;
        if (drfVar == null) {
            drf computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return drfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public drf getReflected() {
        drf compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new dou();
    }

    public drh getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? dqg.a(cls) : dqg.b(cls);
    }

    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.drf
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    @Override // defpackage.drf
    public drk getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // defpackage.dre
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // defpackage.drf
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.drf
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.drf
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @Override // defpackage.drf
    public drl getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.drf
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.drf
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.drf
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.drf
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
