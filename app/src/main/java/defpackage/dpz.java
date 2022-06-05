package defpackage;

/* renamed from: dpz  reason: default package */
/* loaded from: classes2.dex */
public class dpz extends dpt implements dpy, dri {
    private final int arity;
    private final int flags;

    public dpz(int i) {
        this(i, NO_RECEIVER, null, null, null, 0);
    }

    public dpz(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public dpz(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // defpackage.dpy
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dpt
    public dri getReflected() {
        return (dri) super.getReflected();
    }

    @Override // defpackage.dpt
    protected drf computeReflected() {
        return dqg.a(this);
    }

    @Override // defpackage.dri
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.dri
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.dri
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.dri
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.dpt, defpackage.drf
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dpz) {
            dpz dpzVar = (dpz) obj;
            return dqc.a(getOwner(), dpzVar.getOwner()) && getName().equals(dpzVar.getName()) && getSignature().equals(dpzVar.getSignature()) && this.flags == dpzVar.flags && this.arity == dpzVar.arity && dqc.a(getBoundReceiver(), dpzVar.getBoundReceiver());
        } else if (!(obj instanceof dri)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        drf compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
