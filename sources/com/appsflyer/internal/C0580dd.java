package com.appsflyer.internal;

import android.content.Context;
import com.facebook.share.internal.ShareConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.appsflyer.internal.dd */
public abstract class C0580dd extends Observable {
    public C0582d AFInAppEventParameterName = C0582d.NOT_STARTED;
    public final Map<String, Object> AFInAppEventType = new HashMap();
    public final String AFKeystoreWrapper;
    private long valueOf;
    final Runnable values;

    /* renamed from: com.appsflyer.internal.dd$d */
    public enum C0582d {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void AFInAppEventParameterName(Context context);

    public C0580dd(String str, Runnable runnable) {
        this.values = runnable;
        this.AFKeystoreWrapper = str;
    }

    public final void values() {
        this.valueOf = System.currentTimeMillis();
        this.AFInAppEventParameterName = C0582d.STARTED;
        addObserver(new Observer() {
            public final void update(Observable observable, Object obj) {
                C0580dd.this.values.run();
            }
        });
    }

    public final void valueOf() {
        this.AFInAppEventType.put(ShareConstants.FEED_SOURCE_PARAM, this.AFKeystoreWrapper);
        this.AFInAppEventType.putAll(new C0576da());
        this.AFInAppEventType.put("latency", Long.valueOf(System.currentTimeMillis() - this.valueOf));
        this.AFInAppEventParameterName = C0582d.FINISHED;
        setChanged();
        notifyObservers();
    }
}
