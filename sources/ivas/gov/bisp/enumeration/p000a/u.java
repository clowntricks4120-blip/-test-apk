package ivas.gov.bisp.enumeration.p000a;

import android.media.session.MediaSessionManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u implements t {
    private static int a = 1;
    private static int b;
    public final MediaSessionManager.RemoteUserInfo c;

    public u(String str, int i, int i2) {
        this.c = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 105;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 & 45;
            int i7 = -(-((i2 ^ 45) | i6));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(obj instanceof u)) {
            int i10 = i4 | 57;
            int i11 = (i10 << 1) - (i10 & (~(i4 & 57)));
            a = i11 % 128;
            return i11 % 2 == 0;
        }
        boolean zEquals = this.c.equals(((u) obj).c);
        int i12 = a;
        int i13 = ((i12 ^ 9) | (i12 & 9)) << 1;
        int i14 = -(((~i12) & 9) | (i12 & (-10)));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        return zEquals;
    }

    public final int hashCode() {
        int iHash;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 34) + (i2 | 34)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[0];
            objArr[1] = this.c;
            iHash = Objects.hash(objArr);
        } else {
            iHash = Objects.hash(this.c);
        }
        int i4 = a;
        int i5 = i4 ^ 53;
        int i6 = ((i4 & 53) | i5) << 1;
        int i7 = -i5;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return iHash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public u(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.c = remoteUserInfo;
    }
}
