package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: com.appsflyer.internal.v */
final class C0618v {

    /* renamed from: com.appsflyer.internal.v$b */
    static final class C0619b {
        static final C0618v AFKeystoreWrapper = new C0618v();
    }

    C0618v() {
    }

    private static boolean AFInAppEventType(Context context, String[] strArr) {
        for (String AFInAppEventType : strArr) {
            if (C0630z.AFInAppEventType(context, AFInAppEventType)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Location valueOf(Context context) {
        Location location;
        Location location2;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (AFInAppEventType(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                location = locationManager.getLastKnownLocation("network");
            } else {
                location = null;
            }
            if (AFInAppEventType(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
                location2 = locationManager.getLastKnownLocation("gps");
            } else {
                location2 = null;
            }
            if (location2 == null && location == null) {
                location = null;
            } else if (location2 != null || location == null) {
                if ((location == null && location2 != null) || 60000 >= location.getTime() - location2.getTime()) {
                    location = location2;
                }
            }
            if (location != null) {
                return location;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
