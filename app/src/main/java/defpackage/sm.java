package defpackage;

import android.os.Bundle;
import com.facebook.FacebookException;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u0015"}, d2 = {"Lcom/facebook/share/internal/WebDialogParameters;", "", "()V", "create", "Landroid/os/Bundle;", "appGroupCreationContent", "Lcom/facebook/share/model/AppGroupCreationContent;", "gameRequestContent", "Lcom/facebook/share/model/GameRequestContent;", "shareLinkContent", "Lcom/facebook/share/model/ShareLinkContent;", "shareOpenGraphContent", "Lcom/facebook/share/model/ShareOpenGraphContent;", "sharePhotoContent", "Lcom/facebook/share/model/SharePhotoContent;", "createBaseParameters", "shareContent", "Lcom/facebook/share/model/ShareContent;", "createForFeed", "shareFeedContent", "Lcom/facebook/share/internal/ShareFeedContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: sm  reason: default package */
/* loaded from: classes2.dex */
public final class sm {
    public static final sm a = new sm();

    private sm() {
    }

    public static final Bundle a(sp spVar) {
        dqc.d(spVar, "shareLinkContent");
        Bundle a2 = a((sn<?, ?>) spVar);
        qi.a(a2, "href", spVar.a);
        qi.a(a2, "quote", spVar.a());
        return a2;
    }

    public static final Bundle a(st stVar) {
        dqc.d(stVar, "shareOpenGraphContent");
        Bundle a2 = a((sn<?, ?>) stVar);
        ss a3 = stVar.a();
        String str = null;
        qi.a(a2, "action_type", a3 != null ? a3.a() : null);
        try {
            JSONObject a4 = sl.a(sl.a(stVar), false);
            if (a4 != null) {
                str = a4.toString();
            }
            qi.a(a2, "action_properties", str);
            return a2;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    private static Bundle a(sn<?, ?> snVar) {
        dqc.d(snVar, "shareContent");
        Bundle bundle = new Bundle();
        so soVar = snVar.b;
        qi.a(bundle, "hashtag", soVar != null ? soVar.a() : null);
        return bundle;
    }
}
