package defpackage;

import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\f\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/codeless/internal/UnityReflection;", "", "()V", "CAPTURE_VIEW_HIERARCHY_METHOD", "", "EVENT_MAPPING_METHOD", "FB_UNITY_GAME_OBJECT", "TAG", "UNITY_PLAYER_CLASS", "UNITY_SEND_MESSAGE_METHOD", "unityPlayer", "Ljava/lang/Class;", "captureViewHierarchy", "", "getUnityPlayerClass", "sendEventMapping", "eventMapping", "sendMessage", "unityObject", "unityMethod", "message", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ns  reason: default package */
/* loaded from: classes2.dex */
public final class ns {
    public static final ns a = new ns();
    private static final String b = ns.class.getCanonicalName();
    private static Class<?> c;

    private ns() {
    }

    private static void a(String str, String str2, String str3) {
        try {
            if (c == null) {
                Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
                dqc.b(cls, "Class.forName(UNITY_PLAYER_CLASS)");
                c = cls;
            }
            Class<?> cls2 = c;
            if (cls2 == null) {
                dqc.a("unityPlayer");
            }
            Method method = cls2.getMethod("UnitySendMessage", String.class, String.class, String.class);
            dqc.b(method, "unityPlayer.getMethod(\n …java, String::class.java)");
            Class<?> cls3 = c;
            if (cls3 == null) {
                dqc.a("unityPlayer");
            }
            method.invoke(cls3, str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public static final void a() {
        a("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static final void a(String str) {
        a("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }
}
