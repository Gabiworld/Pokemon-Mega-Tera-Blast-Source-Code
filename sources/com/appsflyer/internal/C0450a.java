package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.appsflyer.internal.a */
final class C0450a {
    private IntentFilter valueOf = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.a$a */
    static final class C0451a {
        static final C0450a valueOf = new C0450a();
    }

    C0450a() {
    }

    /* access modifiers changed from: package-private */
    public final C0452d values(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, this.valueOf);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new C0452d(f, str);
    }

    /* renamed from: com.appsflyer.internal.a$d */
    static final class C0452d {
        final float AFInAppEventType;
        final String AFKeystoreWrapper;

        C0452d(float f, String str) {
            this.AFInAppEventType = f;
            this.AFKeystoreWrapper = str;
        }
    }
}
