package defpackage;

import android.os.RemoteException;

@Deprecated
/* renamed from: agq  reason: default package */
/* loaded from: classes.dex */
public abstract class agq<T> {
    final int a;
    final String b;
    final T c;

    private agq(String str, T t) {
        this.a = 0;
        this.b = str;
        this.c = t;
        ags.a().a.add(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T a(ahf ahfVar);

    /* synthetic */ agq(String str, Object obj, byte b) {
        this(str, obj);
    }

    @Deprecated
    /* renamed from: agq$a */
    /* loaded from: classes.dex */
    public static class a extends agq<Boolean> {
        public a(String str, Boolean bool) {
            super(str, bool, (byte) 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Boolean a(ahf ahfVar) {
            try {
                return Boolean.valueOf(ahfVar.getBooleanFlagValue(this.b, ((Boolean) this.c).booleanValue(), this.a));
            } catch (RemoteException unused) {
                return (Boolean) this.c;
            }
        }
    }
}
