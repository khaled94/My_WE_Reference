package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0007R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/suggestedevents/SuggestedEventViewHierarchy;", "", "()V", "blacklistedViews", "", "Ljava/lang/Class;", "Landroid/view/View;", "getAllClickableViews", "view", "getDictionaryOfView", "Lorg/json/JSONObject;", "clickedView", "getTextOfChildren", "", "getTextOfViewRecursively", "hostView", "updateBasicInfo", "", "json", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pb  reason: default package */
/* loaded from: classes2.dex */
public final class pb {
    public static final pb a = new pb();
    private static final List<Class<? extends View>> b = dmq.b(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    private pb() {
    }

    public static final JSONObject a(View view, View view2) {
        if (qx.a(pb.class)) {
            return null;
        }
        try {
            dqc.d(view, "view");
            dqc.d(view2, "clickedView");
            JSONObject jSONObject = new JSONObject();
            boolean z = true;
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            if (!qx.a(pb.class)) {
                try {
                    dqc.d(view, "view");
                    dqc.d(jSONObject, "json");
                    try {
                        String e = nt.e(view);
                        String f = nt.f(view);
                        jSONObject.put("classname", view.getClass().getSimpleName());
                        jSONObject.put("classtypebitmask", nt.d(view));
                        if (e.length() > 0) {
                            jSONObject.put("text", e);
                        }
                        if (f.length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            jSONObject.put("hint", f);
                        }
                        if (view instanceof EditText) {
                            jSONObject.put("inputtype", ((EditText) view).getInputType());
                        }
                    } catch (JSONException unused2) {
                    }
                } catch (Throwable th) {
                    qx.a(th, pb.class);
                }
            }
            JSONArray jSONArray = new JSONArray();
            for (View view3 : nt.b(view)) {
                jSONArray.put(a(view3, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            qx.a(th2, pb.class);
            return null;
        }
    }

    public static final List<View> a(View view) {
        if (qx.a(pb.class)) {
            return null;
        }
        try {
            dqc.d(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : b) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View view2 : nt.b(view)) {
                arrayList.addAll(a(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            qx.a(th, pb.class);
            return null;
        }
    }

    public static final String b(View view) {
        if (qx.a(pb.class)) {
            return null;
        }
        try {
            dqc.d(view, "hostView");
            String e = nt.e(view);
            if (e.length() > 0) {
                return e;
            }
            String join = TextUtils.join(" ", a.c(view));
            dqc.b(join, "TextUtils.join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            qx.a(th, pb.class);
            return null;
        }
    }

    private final List<String> c(View view) {
        if (qx.a(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : nt.b(view)) {
                String e = nt.e(view2);
                if (e.length() > 0) {
                    arrayList.add(e);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
