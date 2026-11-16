package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class ServerApkVersion {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("apk_version")
    private String apkVersion;

    @o0OO00O("error_code")
    private int errorCode;

    @o0OO00O("force_update")
    private int forceUpdate;

    @o0OO00O("status")
    private String status;

    @o0OO00O("version")
    private int version;

    public String getApkVersion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 49) << 1) - (i2 ^ 49);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.apkVersion;
        }
        int i4 = 11 / 0;
        return this.apkVersion;
    }

    public int getErrorCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 92) + (i2 | 92);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.errorCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getForceUpdate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 98) + ((i2 & 98) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.forceUpdate;
        int i6 = i2 ^ 23;
        int i7 = ((i2 & 23) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        return i5;
    }

    public String getStatus() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 35;
        int i4 = (i2 ^ 35) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        String str = this.status;
        int i7 = i2 & 3;
        int i8 = (((i2 | 3) & (~i7)) - (~(i7 << 1))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getVersion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = -(-(i2 | 93));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = this.version;
        int i7 = (i2 ^ 107) + ((i2 & 107) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public void setApkVersion(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 119;
        int i4 = -(-((i2 & 119) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.apkVersion = str;
        int i8 = i6 + 17;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setErrorCode(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 46) << 1) - (i3 ^ 46)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.errorCode = i;
        int i6 = i3 & 101;
        int i7 = ((i3 | 101) & (~i6)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setForceUpdate(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 115;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.forceUpdate = i;
        int i6 = i3 + 85;
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = a + 17;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.status = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public void setVersion(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 121;
        int i5 = -(-((i3 & 121) << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.version = i;
        int i8 = i3 ^ 21;
        int i9 = -(-((i3 & 21) << 1));
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }
}
