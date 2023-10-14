package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.appsflyer.internal.w */
public final class C0620w {
    private static final BitSet AFLogger$LogLevel;
    private static final Handler AFVersionDeclaration = new Handler(Looper.getMainLooper());
    private static volatile C0620w init;
    final Runnable AFInAppEventParameterName;
    final Object AFInAppEventType = new Object();
    final Handler AFKeystoreWrapper;
    /* access modifiers changed from: package-private */
    public final Executor AppsFlyer2dXConversionCallback;
    final Runnable getLevel;
    /* access modifiers changed from: private */
    public final Runnable onAppOpenAttribution;
    /* access modifiers changed from: private */
    public final Map<C0627x, Map<String, Object>> onAppOpenAttributionNative;
    /* access modifiers changed from: private */
    public int onAttributionFailureNative;
    /* access modifiers changed from: private */
    public final SensorManager onDeepLinkingNative;
    /* access modifiers changed from: private */
    public boolean onInstallConversionDataLoadedNative;
    /* access modifiers changed from: private */
    public final Map<C0627x, C0627x> onInstallConversionFailureNative;
    private long onResponseNative;
    boolean valueOf;
    final Runnable values;

    static {
        BitSet bitSet = new BitSet(6);
        AFLogger$LogLevel = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private C0620w(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = AFLogger$LogLevel;
        this.onInstallConversionFailureNative = new HashMap(bitSet.size());
        this.onAppOpenAttributionNative = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventParameterName = new Runnable() {
            public final void run() {
                synchronized (C0620w.this.AFInAppEventType) {
                    C0620w wVar = C0620w.this;
                    wVar.AppsFlyer2dXConversionCallback.execute(new Runnable() {
                        public final void run() {
                            try {
                                for (Sensor next : C0620w.this.onDeepLinkingNative.getSensorList(-1)) {
                                    if (C0620w.AFKeystoreWrapper(next.getType())) {
                                        C0627x xVar = new C0627x(next, C0620w.this.AppsFlyer2dXConversionCallback);
                                        if (!C0620w.this.onInstallConversionFailureNative.containsKey(xVar)) {
                                            C0620w.this.onInstallConversionFailureNative.put(xVar, xVar);
                                        }
                                        C0620w.this.onDeepLinkingNative.registerListener((SensorEventListener) C0620w.this.onInstallConversionFailureNative.get(xVar), next, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            boolean unused2 = C0620w.this.onInstallConversionDataLoadedNative = true;
                        }
                    });
                    C0620w.this.AFKeystoreWrapper.postDelayed(C0620w.this.onAppOpenAttribution, 100);
                    C0620w.this.valueOf = true;
                }
            }
        };
        this.values = new Runnable() {
            public final void run() {
                synchronized (C0620w.this.AFInAppEventType) {
                    C0620w wVar = C0620w.this;
                    wVar.AppsFlyer2dXConversionCallback.execute(new Runnable() {
                        public final void run() {
                            try {
                                if (!C0620w.this.onInstallConversionFailureNative.isEmpty()) {
                                    for (C0627x xVar : C0620w.this.onInstallConversionFailureNative.values()) {
                                        C0620w.this.onDeepLinkingNative.unregisterListener(xVar);
                                        xVar.AFKeystoreWrapper(C0620w.this.onAppOpenAttributionNative, true);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            int unused2 = C0620w.this.onAttributionFailureNative = 0;
                            boolean unused3 = C0620w.this.onInstallConversionDataLoadedNative = false;
                        }
                    });
                }
            }
        };
        this.getLevel = new Runnable() {
            public final void run() {
                synchronized (C0620w.this.AFInAppEventType) {
                    if (C0620w.this.valueOf) {
                        C0620w.this.AFKeystoreWrapper.removeCallbacks(C0620w.this.AFInAppEventParameterName);
                        C0620w.this.AFKeystoreWrapper.removeCallbacks(C0620w.this.values);
                        C0620w wVar = C0620w.this;
                        wVar.AppsFlyer2dXConversionCallback.execute(new Runnable() {
                            public final void run() {
                                try {
                                    if (!C0620w.this.onInstallConversionFailureNative.isEmpty()) {
                                        for (C0627x xVar : C0620w.this.onInstallConversionFailureNative.values()) {
                                            C0620w.this.onDeepLinkingNative.unregisterListener(xVar);
                                            xVar.AFKeystoreWrapper(C0620w.this.onAppOpenAttributionNative, true);
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                                int unused2 = C0620w.this.onAttributionFailureNative = 0;
                                boolean unused3 = C0620w.this.onInstallConversionDataLoadedNative = false;
                            }
                        });
                        C0620w.this.valueOf = false;
                    }
                }
            }
        };
        this.onAttributionFailureNative = 1;
        this.onResponseNative = 0;
        this.onAppOpenAttribution = new Runnable() {
            public final void run() {
                synchronized (C0620w.this.AFInAppEventType) {
                    if (C0620w.this.onAttributionFailureNative == 0) {
                        int unused = C0620w.this.onAttributionFailureNative = 1;
                    }
                    C0620w.this.AFKeystoreWrapper.postDelayed(C0620w.this.values, ((long) C0620w.this.onAttributionFailureNative) * 500);
                }
            }
        };
        this.AppsFlyer2dXConversionCallback = Executors.newSingleThreadExecutor();
        this.onDeepLinkingNative = sensorManager;
        this.AFKeystoreWrapper = handler;
    }

    static C0620w AFKeystoreWrapper(Context context) {
        if (init != null) {
            return init;
        }
        return AFKeystoreWrapper((SensorManager) context.getApplicationContext().getSystemService("sensor"), AFVersionDeclaration);
    }

    private static C0620w AFKeystoreWrapper(SensorManager sensorManager, Handler handler) {
        if (init == null) {
            synchronized (C0620w.class) {
                if (init == null) {
                    init = new C0620w(sensorManager, handler);
                }
            }
        }
        return init;
    }

    /* access modifiers changed from: private */
    public static boolean AFKeystoreWrapper(int i) {
        return i >= 0 && AFLogger$LogLevel.get(i);
    }

    /* access modifiers changed from: package-private */
    public final void AFInAppEventType() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.onResponseNative;
        if (j != 0) {
            this.onAttributionFailureNative++;
            if (j - currentTimeMillis < 500) {
                this.AFKeystoreWrapper.removeCallbacks(this.values);
                this.AFKeystoreWrapper.post(this.AFInAppEventParameterName);
            }
        } else {
            this.AFKeystoreWrapper.post(this.getLevel);
            this.AFKeystoreWrapper.post(this.AFInAppEventParameterName);
        }
        this.onResponseNative = currentTimeMillis;
    }

    /* access modifiers changed from: package-private */
    public final List<Map<String, Object>> AFInAppEventParameterName() {
        for (C0627x AFKeystoreWrapper2 : this.onInstallConversionFailureNative.values()) {
            AFKeystoreWrapper2.AFKeystoreWrapper(this.onAppOpenAttributionNative, true);
        }
        Map<C0627x, Map<String, Object>> map = this.onAppOpenAttributionNative;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.onAppOpenAttributionNative.values());
    }

    private List<Map<String, Object>> values() {
        synchronized (this.AFInAppEventType) {
            if (!this.onInstallConversionFailureNative.isEmpty() && this.onInstallConversionDataLoadedNative) {
                for (C0627x AFKeystoreWrapper2 : this.onInstallConversionFailureNative.values()) {
                    AFKeystoreWrapper2.AFKeystoreWrapper(this.onAppOpenAttributionNative, false);
                }
            }
            if (this.onAppOpenAttributionNative.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Collections.emptyList());
                return copyOnWriteArrayList;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(this.onAppOpenAttributionNative.values());
            return copyOnWriteArrayList2;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> values2 = values();
        if (!values2.isEmpty()) {
            concurrentHashMap.put("sensors", values2);
        } else {
            List<Map<String, Object>> AFInAppEventParameterName2 = AFInAppEventParameterName();
            if (!AFInAppEventParameterName2.isEmpty()) {
                concurrentHashMap.put("sensors", AFInAppEventParameterName2);
            }
        }
        return concurrentHashMap;
    }
}
