package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: com.appsflyer.internal.aa */
public final class C0453aa {
    public final Context AFInAppEventParameterName;
    private Bundle valueOf;

    C0453aa() {
    }

    static C0456e AFKeystoreWrapper(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            C0454a aVar = new C0454a((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (!context.bindService(intent, aVar, 1)) {
                    if (context != null) {
                        context.unbindService(aVar);
                    }
                    throw new IOException("Google Play connection failed");
                } else if (!aVar.AFKeystoreWrapper) {
                    aVar.AFKeystoreWrapper = true;
                    IBinder poll = aVar.valueOf.poll(10, TimeUnit.SECONDS);
                    if (poll != null) {
                        C0455c cVar = new C0455c(poll);
                        return new C0456e(cVar.AFInAppEventType(), cVar.values());
                    }
                    throw new TimeoutException("Timed out waiting for the service connection");
                } else {
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
            } finally {
                if (context != null) {
                    context.unbindService(aVar);
                }
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    /* renamed from: com.appsflyer.internal.aa$e */
    static final class C0456e {
        final String AFInAppEventParameterName;
        private final boolean valueOf;

        C0456e(String str, boolean z) {
            this.AFInAppEventParameterName = str;
            this.valueOf = z;
        }

        /* access modifiers changed from: package-private */
        public final boolean AFKeystoreWrapper() {
            return this.valueOf;
        }
    }

    /* renamed from: com.appsflyer.internal.aa$a */
    static final class C0454a implements ServiceConnection {
        boolean AFKeystoreWrapper;
        final LinkedBlockingQueue<IBinder> valueOf;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private C0454a() {
            this.valueOf = new LinkedBlockingQueue<>(1);
            this.AFKeystoreWrapper = false;
        }

        /* synthetic */ C0454a(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.valueOf.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: com.appsflyer.internal.aa$c */
    static final class C0455c implements IInterface {
        private final IBinder AFKeystoreWrapper;

        C0455c(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        public final String AFInAppEventType() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean values() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public C0453aa(Context context) {
        this.valueOf = null;
        this.AFInAppEventParameterName = context.getApplicationContext();
    }

    public final String AFInAppEventParameterName(String str) {
        Object obj;
        try {
            if (this.valueOf == null) {
                this.valueOf = this.AFInAppEventParameterName.getPackageManager().getApplicationInfo(this.AFInAppEventParameterName.getPackageName(), 128).metaData;
            }
            Bundle bundle = this.valueOf;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.valueOf(sb.toString(), th);
            return null;
        }
    }
}
