package defpackage;

import android.os.Looper;

/* renamed from: agb  reason: default package */
/* loaded from: classes.dex */
public final class agb {
    private static volatile ClassLoader a;
    private static volatile Thread b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (agb.class) {
            if (a == null) {
                a = b();
            }
            classLoader = a;
        }
        return classLoader;
    }

    private static synchronized ClassLoader b() {
        synchronized (agb.class) {
            ClassLoader classLoader = null;
            if (b == null) {
                Thread c = c();
                b = c;
                if (c == null) {
                    return null;
                }
            }
            synchronized (b) {
                try {
                    classLoader = b.getContextClassLoader();
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        "Failed to get thread context classloader ".concat(valueOf);
                    } else {
                        new String("Failed to get thread context classloader ");
                    }
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread c() {
        aga agaVar;
        aga agaVar2;
        SecurityException e;
        ThreadGroup threadGroup;
        synchronized (agb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            agaVar = null;
                            break;
                        }
                        agaVar = threadArr[i];
                        if ("GmsDynamite".equals(agaVar.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    agaVar2 = null;
                }
                if (agaVar == null) {
                    try {
                        agaVar2 = new aga(threadGroup);
                        try {
                            agaVar2.setContextClassLoader(null);
                            agaVar2.start();
                        } catch (SecurityException e3) {
                            e = e3;
                            String valueOf = String.valueOf(e.getMessage());
                            if (valueOf.length() != 0) {
                                "Failed to enumerate thread/threadgroup ".concat(valueOf);
                            } else {
                                new String("Failed to enumerate thread/threadgroup ");
                            }
                            agaVar = agaVar2;
                            return agaVar;
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        agaVar2 = agaVar;
                    }
                    agaVar = agaVar2;
                }
            }
            return agaVar;
        }
    }
}
