package ivas.gov.bisp.enumeration.p000a;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    private static int a = 0;
    private static int b = 1;
    public t c;

    public P(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.c = new u(str, i, i2);
            int i3 = a;
            int i4 = ((i3 & 96) + (i3 | 96)) - 1;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.c = new l(str, i, i2);
        int i5 = b;
        int i6 = (((i5 ^ 31) | (i5 & 31)) << 1) - (((~i5) & 31) | (i5 & (-32)));
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 2 / 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 103) << 1;
        int i4 = -(i2 ^ 103);
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iHashCode = this.c.hashCode();
        int i7 = b;
        int i8 = (i7 & (-122)) | ((~i7) & 121);
        int i9 = (i7 & 121) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 35) + (i2 | 35);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 ^ 87;
            int i7 = ((i4 & 87) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }
        if (obj instanceof P) {
            boolean zEquals = this.c.equals(((P) obj).c);
            int i11 = b;
            int i12 = (i11 ^ 45) + ((i11 & 45) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            return zEquals;
        }
        int i14 = (i4 & (-62)) | ((~i4) & 61);
        int i15 = (i4 & 61) << 1;
        int i16 = (i14 & i15) + (i14 | i15);
        a = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    public P(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.c = new u(remoteUserInfo);
    }
}
