package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J$\u0010\f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/aam/MetadataMatcher;", "", "()V", "MAX_INDICATOR_LENGTH", "", "getAroundViewIndicators", "", "", "view", "Landroid/view/View;", "getCurrentViewIndicators", "getTextIndicators", "matchIndicator", "", "indicator", "keys", "indicators", "matchValue", "text", "rule", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nf  reason: default package */
/* loaded from: classes2.dex */
public final class nf {
    public static final nf a = new nf();

    private nf() {
    }

    public static final List<String> a(View view) {
        if (qx.a(nf.class)) {
            return null;
        }
        try {
            dqc.d(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(nt.f(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    dqc.b(resourceName, "resourceName");
                    Object[] array = new dsf("/").b(resourceName).toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        if (strArr.length == 2) {
                            arrayList.add(strArr[1]);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if ((str.length() > 0) && str.length() <= 100) {
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = str.toLowerCase();
                    dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            qx.a(th, nf.class);
            return null;
        }
    }

    public static final List<String> b(View view) {
        if (qx.a(nf.class)) {
            return null;
        }
        try {
            dqc.d(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup a2 = nt.a(view);
            if (a2 != null) {
                for (View view2 : nt.b(a2)) {
                    if (view != view2) {
                        arrayList.addAll(a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            qx.a(th, nf.class);
            return null;
        }
    }

    public static final boolean a(List<String> list, List<String> list2) {
        if (qx.a(nf.class)) {
            return false;
        }
        try {
            dqc.d(list, "indicators");
            dqc.d(list2, "keys");
            for (String str : list) {
                if (a.a(str, list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, nf.class);
            return false;
        }
    }

    private final boolean a(String str, List<String> list) {
        if (qx.a(this)) {
            return false;
        }
        try {
            for (String str2 : list) {
                if (dsg.a((CharSequence) str, (CharSequence) str2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    public static final boolean a(String str, String str2) {
        if (qx.a(nf.class)) {
            return false;
        }
        try {
            dqc.d(str, "text");
            dqc.d(str2, "rule");
            return new dsf(str2).a(str);
        } catch (Throwable th) {
            qx.a(th, nf.class);
            return false;
        }
    }

    private final List<String> c(View view) {
        if (qx.a(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if ((obj.length() > 0) && obj.length() < 100) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = obj.toLowerCase();
                    dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            for (View view2 : nt.b(view)) {
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
