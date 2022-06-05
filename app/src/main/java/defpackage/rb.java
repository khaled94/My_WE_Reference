package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\nH\u0002J\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver;", "", "()V", "initialized", "", "paramsField", "Ljava/lang/reflect/Field;", "viewsField", "windowManagerObj", "attachActiveRootListener", "", "listener", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Listener;", "initialize", "listActiveRoots", "", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Root;", "Companion", "ListenableArrayList", "Listener", "Root", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: rb  reason: default package */
/* loaded from: classes2.dex */
public final class rb {
    public static final a a = new a((byte) 0);
    private static final String f;
    private boolean b;
    private Object c;
    private Field d;
    private Field e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Root;", "", "view", "Landroid/view/View;", "param", "Landroid/view/WindowManager$LayoutParams;", "(Landroid/view/View;Landroid/view/WindowManager$LayoutParams;)V", "getParam", "()Landroid/view/WindowManager$LayoutParams;", "getView", "()Landroid/view/View;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rb$b */
    /* loaded from: classes2.dex */
    public static final class b {
        final View a;
        final WindowManager.LayoutParams b;

        public b(View view, WindowManager.LayoutParams layoutParams) {
            dqc.d(view, "view");
            dqc.d(layoutParams, "param");
            this.a = view;
            this.b = layoutParams;
        }
    }

    public final List<b> a() {
        dnc dncVar;
        List list = null;
        if (!this.b) {
            this.b = true;
            String str = Build.VERSION.SDK_INT > 16 ? "android.view.WindowManagerGlobal" : "android.view.WindowManagerImpl";
            String str2 = Build.VERSION.SDK_INT > 16 ? "getInstance" : "getDefault";
            try {
                Class<?> cls = Class.forName(str);
                dqc.b(cls, "Class.forName(accessClass)");
                Method method = cls.getMethod(str2, new Class[0]);
                dqc.b(method, "clazz.getMethod(instanceMethod)");
                this.c = method.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mViews");
                this.d = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                Field declaredField2 = cls.getDeclaredField("mParams");
                this.e = declaredField2;
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                dqi dqiVar = dqi.a;
                dqc.b(String.format("could not find class: %s", Arrays.copyOf(new Object[]{str}, 1)), "java.lang.String.format(format, *args)");
            } catch (IllegalAccessException unused2) {
                dqi dqiVar2 = dqi.a;
                dqc.b(String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{str, str2, "mViews"}, 3)), "java.lang.String.format(format, *args)");
            } catch (NoSuchFieldException unused3) {
                dqi dqiVar3 = dqi.a;
                dqc.b(String.format("could not find field: %s or %s on %s", Arrays.copyOf(new Object[]{"mParams", "mViews", str}, 3)), "java.lang.String.format(format, *args)");
            } catch (NoSuchMethodException unused4) {
                dqi dqiVar4 = dqi.a;
                dqc.b(String.format("could not find method: %s on %s", Arrays.copyOf(new Object[]{str2, str}, 2)), "java.lang.String.format(format, *args)");
            } catch (RuntimeException unused5) {
                dqi dqiVar5 = dqi.a;
                dqc.b(String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{str, str2, "mViews"}, 3)), "java.lang.String.format(format, *args)");
            } catch (InvocationTargetException e) {
                dqi dqiVar6 = dqi.a;
                dqc.b(String.format("could not invoke: %s on %s", Arrays.copyOf(new Object[]{str2, str}, 2)), "java.lang.String.format(format, *args)");
                e.getCause();
            }
        }
        if (this.c == null || this.d == null || this.e == null) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT < 19) {
                Field field = this.d;
                View[] viewArr = (View[]) (field != null ? field.get(this.c) : null);
                dncVar = viewArr != null ? dmj.b(viewArr) : null;
                Field field2 = this.e;
                WindowManager.LayoutParams[] layoutParamsArr = (WindowManager.LayoutParams[]) (field2 != null ? field2.get(this.c) : null);
                if (layoutParamsArr != null) {
                    list = dmj.b(layoutParamsArr);
                }
            } else {
                Field field3 = this.d;
                dncVar = (List) (field3 != null ? field3.get(this.c) : null);
                Field field4 = this.e;
                list = (List) (field4 != null ? field4.get(this.c) : null);
            }
            ArrayList arrayList = new ArrayList();
            if (dncVar == null) {
                dncVar = dnc.a;
            }
            for (dma dmaVar : dmq.a((Iterable) dncVar, list != null ? list : dnc.a)) {
                arrayList.add(new b((View) dmaVar.a, (WindowManager.LayoutParams) dmaVar.b));
            }
            return arrayList;
        } catch (IllegalAccessException unused6) {
            dqi dqiVar7 = dqi.a;
            dqc.b(String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.d, this.e, this.c}, 3)), "java.lang.String.format(format, *args)");
            return null;
        } catch (RuntimeException unused7) {
            dqi dqiVar8 = dqi.a;
            dqc.b(String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.d, this.e, this.c}, 3)), "java.lang.String.format(format, *args)");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Companion;", "", "()V", "GET_DEFAULT_IMPL", "", "GET_GLOBAL_INSTANCE", "TAG", "VIEWS_FIELD", "WINDOW_MANAGER_GLOBAL_CLAZZ", "WINDOW_MANAGER_IMPL_CLAZZ", "WINDOW_PARAMS_FIELD", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rb$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        String simpleName = rb.class.getSimpleName();
        dqc.b(simpleName, "AndroidRootResolver::class.java.simpleName");
        f = simpleName;
    }
}
