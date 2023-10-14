package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.bc */
public final class C0515bc implements C0535bv {
    private final SharedPreferences valueOf;

    public C0515bc(SharedPreferences sharedPreferences) {
        this.valueOf = sharedPreferences;
    }

    public final void AFInAppEventParameterName(String str, String str2) {
        this.valueOf.edit().putString(str, str2).apply();
    }

    public final String AFInAppEventType(String str, String str2) {
        try {
            return this.valueOf.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.valueOf("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    public final boolean AFInAppEventParameterName(String str) {
        try {
            return this.valueOf.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.valueOf("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    public final void AFInAppEventType(String str, boolean z) {
        this.valueOf.edit().putBoolean(str, z).apply();
    }

    public final long AFKeystoreWrapper(String str) {
        try {
            return this.valueOf.getLong(str, 0);
        } catch (ClassCastException e) {
            AFLogger.valueOf("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return 0;
        }
    }

    public final void AFKeystoreWrapper(String str, long j) {
        this.valueOf.edit().putLong(str, j).apply();
    }

    public final int valueOf(String str) {
        try {
            return this.valueOf.getInt(str, 0);
        } catch (ClassCastException e) {
            AFLogger.valueOf("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return 0;
        }
    }

    public final void AFInAppEventType(String str) {
        this.valueOf.edit().remove(str).apply();
    }
}
