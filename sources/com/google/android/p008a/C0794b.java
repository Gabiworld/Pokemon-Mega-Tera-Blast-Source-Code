package com.google.android.p008a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.b */
/* compiled from: BaseStub */
public class C0794b extends Binder implements IInterface {
    protected C0794b() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo10204a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo10204a(i, parcel, parcel2);
    }
}
