package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.x */
final class C0627x implements SensorEventListener {
    double AFInAppEventParameterName;
    final float[][] AFInAppEventType = new float[2][];
    long AFKeystoreWrapper;
    private final String AFLogger$LogLevel;
    private final String AFVersionDeclaration;
    private final int AppsFlyer2dXConversionCallback;
    private final Executor getLevel;
    final long[] valueOf = new long[2];
    private final int values;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    C0627x(Sensor sensor, Executor executor) {
        this.getLevel = executor;
        int type = sensor.getType();
        this.values = type;
        String name = sensor.getName();
        String str = "";
        name = name == null ? str : name;
        this.AFLogger$LogLevel = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.AFVersionDeclaration = str;
        this.AppsFlyer2dXConversionCallback = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    private static List<Float> AFInAppEventType(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf2 : fArr) {
            arrayList.add(Float.valueOf(valueOf2));
        }
        return arrayList;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        final long j = sensorEvent.timestamp;
        final float[] fArr = sensorEvent.values;
        this.getLevel.execute(new Runnable() {
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                float[] fArr = C0627x.this.AFInAppEventType[0];
                if (fArr == null) {
                    float[][] fArr2 = C0627x.this.AFInAppEventType;
                    float[] fArr3 = fArr;
                    fArr2[0] = Arrays.copyOf(fArr3, fArr3.length);
                    C0627x.this.valueOf[0] = currentTimeMillis;
                    return;
                }
                float[] fArr4 = C0627x.this.AFInAppEventType[1];
                if (fArr4 == null) {
                    float[] fArr5 = fArr;
                    float[] copyOf = Arrays.copyOf(fArr5, fArr5.length);
                    C0627x.this.AFInAppEventType[1] = copyOf;
                    C0627x.this.valueOf[1] = currentTimeMillis;
                    C0627x.this.AFInAppEventParameterName = C0627x.AFInAppEventParameterName(fArr, copyOf);
                } else if (50000000 <= j - C0627x.this.AFKeystoreWrapper) {
                    C0627x.this.AFKeystoreWrapper = j;
                    if (Arrays.equals(fArr4, fArr)) {
                        C0627x.this.valueOf[1] = currentTimeMillis;
                        return;
                    }
                    double AFInAppEventParameterName = C0627x.AFInAppEventParameterName(fArr, fArr);
                    if (AFInAppEventParameterName > C0627x.this.AFInAppEventParameterName) {
                        float[][] fArr6 = C0627x.this.AFInAppEventType;
                        float[] fArr7 = fArr;
                        fArr6[1] = Arrays.copyOf(fArr7, fArr7.length);
                        C0627x.this.valueOf[1] = currentTimeMillis;
                        C0627x.this.AFInAppEventParameterName = AFInAppEventParameterName;
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void AFKeystoreWrapper(Map<C0627x, Map<String, Object>> map, boolean z) {
        if (AFKeystoreWrapper()) {
            map.put(this, AFInAppEventType());
            if (z) {
                int length = this.AFInAppEventType.length;
                for (int i = 0; i < length; i++) {
                    this.AFInAppEventType[i] = null;
                }
                int length2 = this.valueOf.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.valueOf[i2] = 0;
                }
                this.AFInAppEventParameterName = 0.0d;
                this.AFKeystoreWrapper = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, AFInAppEventType());
        }
    }

    private boolean AFInAppEventParameterName(int i, String str, String str2) {
        return this.values == i && this.AFLogger$LogLevel.equals(str) && this.AFVersionDeclaration.equals(str2);
    }

    private Map<String, Object> AFInAppEventType() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.AFLogger$LogLevel);
        concurrentHashMap.put("sV", this.AFVersionDeclaration);
        float[] fArr = this.AFInAppEventType[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFInAppEventType(fArr));
        }
        float[] fArr2 = this.AFInAppEventType[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFInAppEventType(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean AFKeystoreWrapper() {
        return this.AFInAppEventType[0] != null;
    }

    public final int hashCode() {
        return this.AppsFlyer2dXConversionCallback;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0627x)) {
            return false;
        }
        C0627x xVar = (C0627x) obj;
        return AFInAppEventParameterName(xVar.values, xVar.AFLogger$LogLevel, xVar.AFVersionDeclaration);
    }

    static /* synthetic */ double AFInAppEventParameterName(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }
}
