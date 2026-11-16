package ivas.gov.bisp.enumeration.models;

import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public class VersionResponse {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("eveningtime")
    private String eveningTime;

    @o0OO00O("isfingerprintenabled")
    private int isFingerPrintEnabled;

    @o0OO00O("morningtime")
    private String morningTime;

    @o0OO00O("version")
    private double version;

    public String getEveningTime() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 99;
        int i4 = (i2 ^ 99) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.eveningTime;
        int i6 = i2 ^ 109;
        int i7 = (i2 & 109) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getMorningTime() {
        int i = 2 % 2;
        int i2 = b + 87;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        String str = this.morningTime;
        int i5 = i3 + 53;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public double getVersion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-112)) | ((~i2) & 111)) + ((i2 & 111) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        double d = this.version;
        int i6 = (i4 & 83) + (i4 | 83);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
        return d;
    }

    public int isFingerPrintEnabled() {
        int i = 2 % 2;
        int i2 = b + 49;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isFingerPrintEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEveningTime(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 89) + (i2 | 89);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.eveningTime = str;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 | 67;
        int i7 = ((i6 << 1) - (~(-(i6 & (~(i4 & 67)))))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public void setIsFingerPrintEnabled(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-38)) | ((~i3) & 37);
        int i5 = (i3 & 37) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            this.isFingerPrintEnabled = i;
            return;
        }
        this.isFingerPrintEnabled = i;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMorningTime(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = ((i2 | 41) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.morningTime = str;
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setVersion(double d) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = ((i2 | 91) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.version = d;
        if (i5 != 0) {
            throw null;
        }
    }
}
