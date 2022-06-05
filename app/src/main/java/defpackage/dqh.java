package defpackage;

/* renamed from: dqh  reason: default package */
/* loaded from: classes2.dex */
public final class dqh {
    public static String a(dpy dpyVar) {
        String obj = dpyVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
