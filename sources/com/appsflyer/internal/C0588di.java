package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* renamed from: com.appsflyer.internal.di */
public final class C0588di extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private final int AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger$LogLevel;
    private int[] AFVersionDeclaration;
    private int AppsFlyer2dXConversionCallback = Integer.MAX_VALUE;
    private int getLevel;
    private int init;
    private C0589dj valueOf;
    private byte[] values;

    public final boolean markSupported() {
        return false;
    }

    public C0588di(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        int min = Math.min(Math.max(i, 3), 16);
        this.AFInAppEventType = min;
        this.AFInAppEventParameterName = new byte[8];
        byte[] bArr2 = new byte[8];
        this.values = bArr2;
        this.AFKeystoreWrapper = new byte[8];
        this.AFVersionDeclaration = new int[2];
        this.AFLogger$LogLevel = 8;
        this.getLevel = 8;
        this.init = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.valueOf = new C0589dj(iArr, min, true, false);
    }

    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.AFLogger$LogLevel;
        if (i >= this.getLevel) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventParameterName;
        this.AFLogger$LogLevel = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            AFInAppEventType();
            int i5 = this.AFLogger$LogLevel;
            if (i5 < this.getLevel) {
                byte[] bArr2 = this.AFInAppEventParameterName;
                this.AFLogger$LogLevel = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public final int available() throws IOException {
        AFInAppEventType();
        return this.getLevel - this.AFLogger$LogLevel;
    }

    private void AFKeystoreWrapper() {
        if (this.init == 2) {
            byte[] bArr = this.AFInAppEventParameterName;
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, bArr.length);
        }
        byte[] bArr2 = this.AFInAppEventParameterName;
        C0590dk.values(((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & UByte.MAX_VALUE), (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UByte.MAX_VALUE), false, this.AFInAppEventType, this.valueOf.AFInAppEventParameterName, this.valueOf.AFInAppEventType, this.AFVersionDeclaration);
        int[] iArr = this.AFVersionDeclaration;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.AFInAppEventParameterName;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.init == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.AFInAppEventParameterName;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.values[i3]);
            }
            byte[] bArr5 = this.AFKeystoreWrapper;
            System.arraycopy(bArr5, 0, this.values, 0, bArr5.length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int AFInAppEventType() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.AppsFlyer2dXConversionCallback
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.AppsFlyer2dXConversionCallback = r0
        L_0x000f:
            int r0 = r7.AFLogger$LogLevel
            r1 = 8
            if (r0 != r1) goto L_0x0059
            byte[] r0 = r7.AFInAppEventParameterName
            int r2 = r7.AppsFlyer2dXConversionCallback
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0053
            r2 = 1
        L_0x0022:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.AFInAppEventParameterName
            int r6 = 8 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0031
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0022
        L_0x0031:
            if (r2 < r1) goto L_0x004d
            r7.AFKeystoreWrapper()
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.AppsFlyer2dXConversionCallback = r0
            r7.AFLogger$LogLevel = r4
            if (r0 >= 0) goto L_0x004a
            byte[] r0 = r7.AFInAppEventParameterName
            r2 = 7
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004a:
            r7.getLevel = r1
            goto L_0x0059
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0059:
            int r0 = r7.getLevel
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C0588di.AFInAppEventType():int");
    }
}
