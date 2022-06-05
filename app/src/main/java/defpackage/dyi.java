package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherFactory;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0004H\u0082\bJ1\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "()V", "PREFIX", "", "createInstanceOf", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "Ljava/lang/Class;", "serviceClass", "getProviderInstance", ExifInterface.LATITUDE_SOUTH, "name", "loader", "Ljava/lang/ClassLoader;", NotificationCompat.CATEGORY_SERVICE, "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "load", "", "loadMainDispatcherFactory", "loadMainDispatcherFactory$kotlinx_coroutines_core", "loadProviders", "loadProviders$kotlinx_coroutines_core", "parse", "url", "Ljava/net/URL;", "parseFile", "r", "Ljava/io/BufferedReader;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dyi  reason: default package */
/* loaded from: classes2.dex */
public final class dyi {
    public static final dyi a = new dyi();

    private dyi() {
    }

    public static List<MainDispatcherFactory> a() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!dyj.a()) {
            return a(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
            }
            return arrayList;
        } catch (Throwable unused3) {
            return a(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    private static List<String> a(URL url) {
        String c;
        String c2;
        String url2 = url.toString();
        th = null;
        if (!dsg.c(url2, "jar")) {
            try {
                return a(new BufferedReader(new InputStreamReader(url.openStream())));
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        c = dsg.c(url2, "jar:file:", url2);
        dqc.d(c, "$this$substringBefore");
        dqc.d(c, "missingDelimiterValue");
        int a2 = dsg.a((CharSequence) c, '!', 0, 6);
        if (a2 != -1) {
            c = c.substring(0, a2);
            dqc.b(c, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        c2 = dsg.c(url2, "!/", url2);
        JarFile jarFile = new JarFile(c, false);
        try {
            List<String> a3 = a(new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(c2)), "UTF-8")));
            jarFile.close();
            return a3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jarFile.close();
                    throw th2;
                } catch (Throwable th3) {
                    dlr.a(th, th3);
                    throw th;
                }
            }
        }
    }

    private static List<String> a(BufferedReader bufferedReader) {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return dmq.b(linkedHashSet);
            }
            dqc.d(readLine, "$this$substringBefore");
            dqc.d("#", "delimiter");
            dqc.d(readLine, "missingDelimiterValue");
            boolean z2 = false;
            int a2 = dsg.a(readLine, "#", 0, 6);
            if (a2 != -1) {
                readLine = readLine.substring(0, a2);
                dqc.b(readLine, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (readLine != null) {
                String obj = dsg.b((CharSequence) readLine).toString();
                String str = obj;
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        z = true;
                        break;
                    }
                    char charAt = str.charAt(i);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    throw new IllegalArgumentException(dqc.a("Illegal service provider class name: ", (Object) obj).toString());
                }
                if (str.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    private static <S> List<S> a(Class<S> cls, ClassLoader classLoader) {
        dne dneVar;
        try {
            ArrayList<URL> list = Collections.list(classLoader.getResources(dqc.a("META-INF/services/", (Object) cls.getName())));
            dqc.b(list, "java.util.Collections.list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL url : list) {
                dmq.a((Collection) arrayList, (Iterable) a(url));
            }
            ArrayList arrayList2 = arrayList;
            dqc.d(arrayList2, "$this$toSet");
            int size = arrayList2.size();
            if (size == 0) {
                dneVar = dne.a;
            } else if (size == 1) {
                dneVar = dnm.a(arrayList2.get(0));
            } else {
                dneVar = (Set) dmq.a((Iterable) arrayList2, new LinkedHashSet(dnh.a(arrayList2.size())));
            }
            if (!(!dneVar.isEmpty())) {
                throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
            }
            Collection<String> collection = dneVar;
            ArrayList arrayList3 = new ArrayList(dmq.a((Iterable) collection));
            for (String str : collection) {
                Class<?> cls2 = Class.forName(str, false, classLoader);
                if (!cls.isAssignableFrom(cls2)) {
                    throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
                }
                arrayList3.add(cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
            }
            return arrayList3;
        } catch (Throwable unused) {
            return dmq.b(ServiceLoader.load(cls, classLoader));
        }
    }
}
