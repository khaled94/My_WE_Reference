package defpackage;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.rb;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001b\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002JB\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J+\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", "", "()V", "lithoViewToStringMethod", "Ljava/lang/reflect/Method;", "rootResolver", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver;", "webViewDumpHelper", "Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper;", "dumpViewHierarchy", "", "prefix", "", "writer", "Ljava/io/PrintWriter;", "view", "Landroid/view/View;", "leftOffset", "", "topOffset", "withWebView", "", "withProps", "args", "", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "writeLithoViewSubHierarchy", "Api21Utils", "Api24Utils", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: rc  reason: default package */
/* loaded from: classes2.dex */
public final class rc {
    public static final c a = new c((byte) 0);
    private static rc e;
    private static Method f;
    private final rb b = new rb();
    private final re c = new re();
    private Method d;

    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
        if ((r0.length() == 0) != false) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(java.lang.String r18, java.io.PrintWriter r19, android.view.View r20, int r21, int r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc.a(java.lang.String, java.io.PrintWriter, android.view.View, int, int, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Api21Utils;", "", "()V", "keyedTagsField", "Ljava/lang/reflect/Field;", "getTags", "Lorg/json/JSONObject;", "view", "Landroid/view/View;", "writeExtraProps", "", "writer", "Ljava/io/PrintWriter;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rc$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a a = new a();
        private static Field b;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                b = declaredField;
                if (declaredField == null) {
                    return;
                }
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }

        private a() {
        }

        static JSONObject a(View view) {
            try {
                if (b == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    b = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
                Field field = b;
                Object obj = field != null ? field.get(view) : null;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.util.SparseArray<*>");
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray == null || sparseArray.size() <= 0) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        try {
                            jSONObject.put(rd.a(view.getResources(), sparseArray.keyAt(i)), sparseArray.valueAt(i));
                        } catch (JSONException unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                return jSONObject;
            } catch (Exception unused3) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Api24Utils;", "", "()V", "addExtraProps", "", "props", "Lorg/json/JSONObject;", "nodeInfo", "Landroid/view/accessibility/AccessibilityNodeInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rc$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final b a = new b();

        private b() {
        }

        public static void a(JSONObject jSONObject, AccessibilityNodeInfo accessibilityNodeInfo) throws JSONException {
            dqc.d(jSONObject, "props");
            dqc.d(accessibilityNodeInfo, "nodeInfo");
            if (Build.VERSION.SDK_INT < 24) {
                return;
            }
            jSONObject.put("context-clickable", accessibilityNodeInfo.isContextClickable()).put("drawing-order", accessibilityNodeInfo.getDrawingOrder()).put("important-for-accessibility", accessibilityNodeInfo.isImportantForAccessibility());
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J%\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J-\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0002J\u0018\u0010,\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010-\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010.\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Companion;", "", "()V", "ALL_ROOTS_ARGUMENT", "", "E2E_ARGUMENT", "LITHO_VIEW_CLASS", "LITHO_VIEW_TEST_HELPER_CLASS", "LITHO_VIEW_TO_STRING_METHOD", "RC_TEXT_VIEW_SIMPLE_CLASS_NAME", "TOP_ROOT_ARGUMENT", "WITH_PROPS_ARGUMENT", "WITH_WEBVIEW_ARGUMENT", "instance", "Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", "rcTextViewGetTextMethod", "Ljava/lang/reflect/Method;", "createNodeInfoFromView", "Landroid/view/accessibility/AccessibilityNodeInfo;", "view", "Landroid/view/View;", "fixString", "str", "", "maxLength", "", "getTextFromRcTextView", "hasArgument", "", "args", "", "argument", "([Ljava/lang/String;Ljava/lang/String;)Z", "isExtendsLithoView", "maybeDump", "prefix", "writer", "Ljava/io/PrintWriter;", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)Z", "maybeWriteViewTestIdFromTag", "", "writeViewBounds", "leftOffset", "topOffset", "writeViewFlags", "writeViewTestId", "writeViewText", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rc$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }

        static boolean a(View view) {
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (dqc.a((Object) cls.getName(), (Object) "com.facebook.litho.LithoView")) {
                    return true;
                }
            }
            return false;
        }

        static void a(PrintWriter printWriter, View view) {
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                tag = null;
            }
            String str = (String) tag;
            if (str == null) {
                return;
            }
            String str2 = str;
            if (str2.length() == 0) {
                return;
            }
            printWriter.print(" app:tag/");
            printWriter.print(a(str2, 60));
        }

        static String a(CharSequence charSequence, int i) {
            if (charSequence != null) {
                if (charSequence.length() == 0) {
                    return "";
                }
                String a = dsg.a(dsg.a(dsg.a(charSequence.toString(), " \n", " "), "\n", " "), "\"", "");
                if (charSequence.length() <= i) {
                    return a;
                }
                StringBuilder sb = new StringBuilder();
                if (a == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String substring = a.substring(0, i);
                dqc.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append("...");
                return sb.toString();
            }
            return "";
        }

        static boolean a(String[] strArr, String str) {
            if (strArr == null) {
                return false;
            }
            for (String str2 : strArr) {
                if (dsg.b(str, str2)) {
                    return true;
                }
            }
            return false;
        }

        static AccessibilityNodeInfo b(View view) {
            if (view == null) {
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            try {
                view.onInitializeAccessibilityNodeInfo(obtain);
                return obtain;
            } catch (NullPointerException unused) {
                if (obtain != null) {
                    obtain.recycle();
                }
                return null;
            }
        }
    }

    public static final /* synthetic */ void a(rc rcVar, String str, PrintWriter printWriter, String[] strArr) {
        View view;
        String str2 = str;
        printWriter.print(str2);
        printWriter.println("Top Level Window View Hierarchy:");
        boolean a2 = c.a(strArr, "all-roots");
        boolean a3 = c.a(strArr, "top-root");
        boolean a4 = c.a(strArr, "webview");
        boolean a5 = c.a(strArr, "props");
        try {
            List<rb.b> a6 = rcVar.b.a();
            if (a6 != null && !a6.isEmpty()) {
                Collections.reverse(a6);
                WindowManager.LayoutParams layoutParams = null;
                for (rb.b bVar : a6) {
                    if (bVar != null && (view = bVar.a) != null && view.getVisibility() == 0) {
                        if (!a2 && layoutParams != null && Math.abs(bVar.b.type - layoutParams.type) != 1) {
                            break;
                        }
                        rcVar.a(str2 + "  ", printWriter, bVar.a, 0, 0, a4, a5);
                        layoutParams = bVar.b;
                        if (a3) {
                            break;
                        }
                    }
                    str2 = str;
                }
                rcVar.c.a(printWriter);
            }
        } catch (Exception e2) {
            printWriter.println("Failure in view hierarchy dump: " + e2.getMessage());
        }
    }
}
