package com.google.android.p008a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a */
/* compiled from: BaseProxy */
public class C0793a implements IInterface {

    /* renamed from: a */
    private final IBinder f52a;

    /* renamed from: b */
    private final String f53b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected C0793a(IBinder iBinder) {
        this.f52a = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo10201a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f53b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f52a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel mo10203b(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f52a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
