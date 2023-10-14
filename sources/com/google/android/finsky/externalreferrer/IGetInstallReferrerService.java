package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p008a.C0793a;
import com.google.android.p008a.C0794b;
import com.google.android.p008a.C0795c;

public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends C0794b implements IGetInstallReferrerService {

        public static class Proxy extends C0793a implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            /* renamed from: c */
            public final Bundle mo10207c(Bundle bundle) throws RemoteException {
                Parcel a = mo10201a();
                C0795c.m22b(a, bundle);
                Parcel b = mo10203b(a);
                Bundle bundle2 = (Bundle) C0795c.m21a(b, Bundle.CREATOR);
                b.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static IGetInstallReferrerService m25b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                return (IGetInstallReferrerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo10204a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle c = mo10207c((Bundle) C0795c.m21a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            C0795c.m23c(parcel2, c);
            return true;
        }
    }

    /* renamed from: c */
    Bundle mo10207c(Bundle bundle) throws RemoteException;
}
