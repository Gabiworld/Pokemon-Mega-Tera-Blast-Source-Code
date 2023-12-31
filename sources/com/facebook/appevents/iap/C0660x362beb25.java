package com.facebook.appevents.iap;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo13301d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, mo13302d2 = {"com/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1", "Landroid/content/ServiceConnection;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "facebook-core_release"}, mo13303k = 1, mo13304mv = {1, 5, 1}, mo13306xi = 48)
/* renamed from: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1 */
/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
public final class C0660x362beb25 implements ServiceConnection {
    public void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "name");
    }

    C0660x362beb25() {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(componentName, "name");
        Intrinsics.checkNotNullParameter(iBinder, NotificationCompat.CATEGORY_SERVICE);
        InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = InAppPurchaseActivityLifecycleTracker.INSTANCE;
        InAppPurchaseEventManager inAppPurchaseEventManager = InAppPurchaseEventManager.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        InAppPurchaseActivityLifecycleTracker.inAppBillingObj = InAppPurchaseEventManager.asInterface(FacebookSdk.getApplicationContext(), iBinder);
    }
}
