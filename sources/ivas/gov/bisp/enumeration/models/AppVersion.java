package ivas.gov.bisp.enumeration.models;

import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public class AppVersion {
    private static int a = 1;
    private static int b;

    @o0OO00O("error_code")
    private int errorCode;

    @o0OO00O("force_update")
    private int forceUpdate;

    @o0OO00O("status")
    private String status;

    @o0OO00O("version")
    private int version;

    public int getErrorCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 35) + ((i2 & 35) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.errorCode;
        int i6 = i2 & 69;
        int i7 = ((i2 ^ 69) | i6) << 1;
        int i8 = -((i2 | 69) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getForceUpdate() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 67) << 1) - (i3 ^ 67);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.forceUpdate;
            int i5 = 26 / 0;
        } else {
            i = this.forceUpdate;
        }
        int i6 = ((i3 | 9) << 1) - (((~i3) & 9) | (i3 & (-10)));
        a = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public String getStatus() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 125;
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = (((i2 | 54) << 1) - (i2 ^ 54)) - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public int getVersion() {
        int i = 2 % 2;
        int i2 = b + 91;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = this.version;
        int i6 = ((i3 | 23) << 1) - (i3 ^ 23);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setErrorCode(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 75) + (i3 | 75);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.errorCode = i;
        if (i5 == 0) {
            throw null;
        }
    }

    public void setForceUpdate(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 35;
        int i5 = ((i3 ^ 35) | i4) << 1;
        int i6 = -((i3 | 35) & (~i4));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        this.forceUpdate = i;
        if (i8 != 0) {
            throw null;
        }
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.status = str;
        int i5 = (i2 ^ 73) + ((i2 & 73) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setVersion(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 & (-96)) | ((~i3) & 95)) - (~((i3 & 95) << 1))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        this.version = i;
        int i7 = ((((i5 ^ 119) | (i5 & 119)) << 1) - (~(-(((~i5) & 119) | (i5 & (-120)))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
    }
}
