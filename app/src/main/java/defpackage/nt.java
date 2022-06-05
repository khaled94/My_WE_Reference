package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\"\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u001e\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\fH\u0003J\u0018\u0010,\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\fJ\u0010\u0010-\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u001a\u0010.\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u001cH\u0007J \u00100\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u000203H\u0007J\u0018\u00104\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/facebook/appevents/codeless/internal/ViewHierarchy;", "", "()V", "CLASS_RCTROOTVIEW", "", "CLASS_RCTVIEWGROUP", "CLASS_TOUCHTARGETHELPER", "ICON_MAX_EDGE_LENGTH", "", "METHOD_FIND_TOUCHTARGET_VIEW", "RCTRootViewReference", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "TAG", "methodFindTouchTargetView", "Ljava/lang/reflect/Method;", "findRCTRootView", "view", "getChildrenOfView", "", "getClassTypeBitmask", "getDictionaryOfView", "Lorg/json/JSONObject;", "getDimensionOfView", "getExistingClass", "Ljava/lang/Class;", "className", "getExistingOnClickListener", "Landroid/view/View$OnClickListener;", "getExistingOnTouchListener", "Landroid/view/View$OnTouchListener;", "getHintOfView", "getParentOfView", "Landroid/view/ViewGroup;", "getTextOfView", "getTouchReactView", "location", "", "RCTRootView", "getViewLocationOnScreen", "initTouchTargetHelperMethods", "", "isAdapterViewItem", "", "isRCTButton", "isRCTRootView", "setOnClickListener", "newListener", "updateAppearanceOfView", "json", "displayDensity", "", "updateBasicInfoOfView", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nt  reason: default package */
/* loaded from: classes2.dex */
public final class nt {
    public static final nt a = new nt();
    private static final String b = nt.class.getCanonicalName();
    private static WeakReference<View> c = new WeakReference<>(null);
    private static Method d;

    private nt() {
    }

    public static final ViewGroup a(View view) {
        if (!qx.a(nt.class) && view != null) {
            try {
                ViewParent parent = view.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return null;
                }
                return (ViewGroup) parent;
            } catch (Throwable th) {
                qx.a(th, nt.class);
                return null;
            }
        }
        return null;
    }

    public static final List<View> b(View view) {
        if (qx.a(nt.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            qx.a(th, nt.class);
            return null;
        }
    }

    public static final JSONObject c(View view) {
        if (qx.a(nt.class)) {
            return null;
        }
        try {
            dqc.d(view, "view");
            if (dqc.a((Object) view.getClass().getName(), (Object) "com.facebook.react.ReactRootView")) {
                c = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (!qx.a(nt.class)) {
                    try {
                        dqc.d(view, "view");
                        dqc.d(jSONObject, "json");
                        try {
                            String e = e(view);
                            String f = f(view);
                            Object tag = view.getTag();
                            CharSequence contentDescription = view.getContentDescription();
                            jSONObject.put("classname", view.getClass().getCanonicalName());
                            jSONObject.put("classtypebitmask", d(view));
                            jSONObject.put("id", view.getId());
                            if (!nr.a(view)) {
                                jSONObject.put("text", qi.a(qi.c(e), ""));
                            } else {
                                jSONObject.put("text", "");
                                jSONObject.put("is_user_input", true);
                            }
                            jSONObject.put("hint", qi.a(qi.c(f), ""));
                            if (tag != null) {
                                jSONObject.put("tag", qi.a(qi.c(tag.toString()), ""));
                            }
                            if (contentDescription != null) {
                                jSONObject.put("description", qi.a(qi.c(contentDescription.toString()), ""));
                            }
                            jSONObject.put(TypedValues.Custom.S_DIMENSION, a.k(view));
                        } catch (JSONException e2) {
                            qi.a(b, (Exception) e2);
                        }
                    } catch (Throwable th) {
                        qx.a(th, nt.class);
                    }
                }
                JSONArray jSONArray = new JSONArray();
                List<View> b2 = b(view);
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(c(b2.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th2) {
            qx.a(th2, nt.class);
            return null;
        }
    }

    public static final int d(View view) {
        if (qx.a(nt.class)) {
            return 0;
        }
        try {
            dqc.d(view, "view");
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            if (j(view)) {
                i |= 512;
            }
            if (view instanceof TextView) {
                int i2 = i | 1024 | 1;
                if (view instanceof Button) {
                    i2 |= 4;
                    if (view instanceof Switch) {
                        i2 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i2 |= 32768;
                    }
                }
                return view instanceof EditText ? i2 | 2048 : i2;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                return view instanceof RatingBar ? i | 65536 : view instanceof RadioGroup ? i | 16384 : (!(view instanceof ViewGroup) || !a.a(view, c.get())) ? i : i | 64;
            }
            return i | 4096;
        } catch (Throwable th) {
            qx.a(th, nt.class);
            return 0;
        }
    }

    private static final boolean j(View view) {
        if (qx.a(nt.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Class<?> a2 = a.a("android.support.v4.view.NestedScrollingChild");
            if (a2 != null && a2.isInstance(parent)) {
                return true;
            }
            Class<?> a3 = a.a("androidx.core.view.NestedScrollingChild");
            if (a3 != null) {
                if (a3.isInstance(parent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, nt.class);
            return false;
        }
    }

    public static final String e(View view) {
        CharSequence charSequence;
        Object selectedItem;
        if (qx.a(nt.class)) {
            return null;
        }
        try {
        } catch (Throwable th) {
            qx.a(th, nt.class);
            return null;
        }
        if (view instanceof TextView) {
            charSequence = ((TextView) view).getText();
            if (view instanceof Switch) {
                charSequence = ((Switch) view).isChecked() ? "1" : "0";
            }
        } else {
            if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    charSequence = selectedItem.toString();
                }
                charSequence = null;
            } else {
                if (view instanceof DatePicker) {
                    int year = ((DatePicker) view).getYear();
                    int month = ((DatePicker) view).getMonth();
                    int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                    dqi dqiVar = dqi.a;
                    charSequence = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                    dqc.b(charSequence, "java.lang.String.format(format, *args)");
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    dqc.b(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    dqc.b(currentMinute, "view.currentMinute");
                    int intValue2 = currentMinute.intValue();
                    dqi dqiVar2 = dqi.a;
                    charSequence = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                    dqc.b(charSequence, "java.lang.String.format(format, *args)");
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = ((RadioGroup) view).getChildAt(i);
                        dqc.b(childAt, "child");
                        if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                            charSequence = ((RadioButton) childAt).getText();
                            break;
                        }
                    }
                    charSequence = null;
                } else {
                    if (view instanceof RatingBar) {
                        charSequence = String.valueOf(((RatingBar) view).getRating());
                    }
                    charSequence = null;
                }
            }
            qx.a(th, nt.class);
            return null;
        }
        if (charSequence != null) {
            String obj = charSequence.toString();
            if (obj != null) {
                return obj;
            }
        }
        return "";
    }

    public static final String f(View view) {
        CharSequence charSequence;
        if (qx.a(nt.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else {
                charSequence = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            if (charSequence != null) {
                String obj = charSequence.toString();
                if (obj != null) {
                    return obj;
                }
            }
            return "";
        } catch (Throwable th) {
            qx.a(th, nt.class);
            return null;
        }
    }

    private final JSONObject k(View view) {
        if (qx.a(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        if (qx.a(nt.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            dqc.b(declaredField, "Class.forName(\"android.v…redField(\"mListenerInfo\")");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            dqc.b(declaredField2, "Class.forName(\"android.v…Field(\"mOnClickListener\")");
            if (declaredField2 == null) {
                return null;
            }
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
            }
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            qx.a(th, nt.class);
            return null;
        }
    }

    public static final void a(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (qx.a(nt.class)) {
            return;
        }
        try {
            dqc.d(view, "view");
            Object obj = null;
            try {
                try {
                    field2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        field = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        field = null;
                        if (field2 != null) {
                        }
                        view.setOnClickListener(onClickListener);
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                field2 = null;
            }
            if (field2 != null || field == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            field2.setAccessible(true);
            field.setAccessible(true);
            try {
                field2.setAccessible(true);
                obj = field2.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                field.set(obj, onClickListener);
            }
        } catch (Throwable th) {
            qx.a(th, nt.class);
        }
    }

    public static final View.OnTouchListener h(View view) {
        try {
            if (qx.a(nt.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    dqc.b(declaredField, "Class.forName(\"android.v…redField(\"mListenerInfo\")");
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(view);
                    if (obj == null) {
                        return null;
                    }
                    Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                    dqc.b(declaredField2, "Class.forName(\"android.v…Field(\"mOnTouchListener\")");
                    if (declaredField2 == null) {
                        return null;
                    }
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(obj);
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                    }
                    return (View.OnTouchListener) obj2;
                } catch (ClassNotFoundException e) {
                    qi.a(b, (Exception) e);
                    return null;
                }
            } catch (IllegalAccessException e2) {
                qi.a(b, (Exception) e2);
                return null;
            } catch (NoSuchFieldException e3) {
                qi.a(b, (Exception) e3);
                return null;
            }
        } catch (Throwable th) {
            qx.a(th, nt.class);
            return null;
        }
    }

    private final View a(float[] fArr, View view) {
        if (qx.a(this)) {
            return null;
        }
        try {
            if (!qx.a(this) && d == null) {
                try {
                    Class<?> cls = Class.forName("com.facebook.react.uimanager.TouchTargetHelper");
                    dqc.b(cls, "Class.forName(CLASS_TOUCHTARGETHELPER)");
                    Method declaredMethod = cls.getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                    d = declaredMethod;
                    if (declaredMethod == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    declaredMethod.setAccessible(true);
                } catch (ClassNotFoundException e) {
                    qi.a(b, (Exception) e);
                } catch (NoSuchMethodException e2) {
                    qi.a(b, (Exception) e2);
                }
            }
            if (d != null && view != null) {
                try {
                    try {
                        Method method = d;
                        if (method == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        Object invoke = method.invoke(null, fArr, view);
                        if (invoke == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        View view2 = (View) invoke;
                        if (view2 != null && view2.getId() > 0) {
                            ViewParent parent = view2.getParent();
                            if (parent == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                            return (View) parent;
                        }
                    } catch (InvocationTargetException e3) {
                        qi.a(b, (Exception) e3);
                    }
                } catch (IllegalAccessException e4) {
                    qi.a(b, (Exception) e4);
                }
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public final boolean a(View view, View view2) {
        View a2;
        if (qx.a(this)) {
            return false;
        }
        try {
            dqc.d(view, "view");
            String name = view.getClass().getName();
            dqc.b(name, "view.javaClass.name");
            if (dqc.a((Object) name, (Object) "com.facebook.react.views.view.ReactViewGroup") && (a2 = a(m(view), view2)) != null) {
                if (a2.getId() == view.getId()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final boolean l(View view) {
        if (qx.a(this)) {
            return false;
        }
        try {
            return dqc.a((Object) view.getClass().getName(), (Object) "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    public static final View i(View view) {
        if (qx.a(nt.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!a.l(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                qx.a(th, nt.class);
            }
        }
        return null;
    }

    private final float[] m(View view) {
        if (qx.a(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final Class<?> a(String str) {
        if (qx.a(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
