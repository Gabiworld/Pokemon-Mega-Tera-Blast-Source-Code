package com.facebook.appevents.codeless.internal;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\f\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo13302d2 = {"Lcom/facebook/appevents/codeless/internal/UnityReflection;", "", "()V", "CAPTURE_VIEW_HIERARCHY_METHOD", "", "EVENT_MAPPING_METHOD", "FB_UNITY_GAME_OBJECT", "TAG", "UNITY_PLAYER_CLASS", "UNITY_SEND_MESSAGE_METHOD", "unityPlayer", "Ljava/lang/Class;", "captureViewHierarchy", "", "getUnityPlayerClass", "sendEventMapping", "eventMapping", "sendMessage", "unityObject", "unityMethod", "message", "facebook-core_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* compiled from: UnityReflection.kt */
public final class UnityReflection {
    private static final String CAPTURE_VIEW_HIERARCHY_METHOD = "CaptureViewHierarchy";
    private static final String EVENT_MAPPING_METHOD = "OnReceiveMapping";
    private static final String FB_UNITY_GAME_OBJECT = "UnityFacebookSDKPlugin";
    public static final UnityReflection INSTANCE = new UnityReflection();
    private static final String TAG = UnityReflection.class.getCanonicalName();
    private static final String UNITY_PLAYER_CLASS = "com.unity3d.player.UnityPlayer";
    private static final String UNITY_SEND_MESSAGE_METHOD = "UnitySendMessage";
    private static Class<?> unityPlayer;

    private UnityReflection() {
    }

    private final Class<?> getUnityPlayerClass() {
        Class<?> cls = Class.forName(UNITY_PLAYER_CLASS);
        Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    @JvmStatic
    public static final void sendMessage(String str, String str2, String str3) {
        try {
            if (unityPlayer == null) {
                unityPlayer = INSTANCE.getUnityPlayerClass();
            }
            Class<?> cls = unityPlayer;
            if (cls != null) {
                Method method = cls.getMethod(UNITY_SEND_MESSAGE_METHOD, new Class[]{String.class, String.class, String.class});
                Intrinsics.checkNotNullExpressionValue(method, "unityPlayer.getMethod(\n              UNITY_SEND_MESSAGE_METHOD, String::class.java, String::class.java, String::class.java)");
                Class<?> cls2 = unityPlayer;
                if (cls2 != null) {
                    method.invoke(cls2, new Object[]{str, str2, str3});
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
            throw null;
        } catch (Exception e) {
            Log.e(TAG, "Failed to send message to Unity", e);
        }
    }

    @JvmStatic
    public static final void captureViewHierarchy() {
        sendMessage(FB_UNITY_GAME_OBJECT, CAPTURE_VIEW_HIERARCHY_METHOD, "");
    }

    @JvmStatic
    public static final void sendEventMapping(String str) {
        sendMessage(FB_UNITY_GAME_OBJECT, EVENT_MAPPING_METHOD, str);
    }
}
