package ivas.gov.bisp.enumeration.models;

/* JADX INFO: loaded from: classes.dex */
public class SurveyCount {
    private static int a = 1;
    private static int b;
    private int autoMarkContined;
    private int continuedCount;
    private int isBatchMarked;
    private int notAtHomeCount;
    private int status;
    private int totalRostersCount;
    private int totalSurveyCount;

    public SurveyCount() {
        setContinuedCount(0);
        setNotAtHomeCount(0);
        setTotalSurveyCount(0);
        setIsBatchMarked(0);
        setAutoMarkContined(0);
        setStatus(3);
    }

    public int getAutoMarkContined() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = (i2 ^ 53) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = this.autoMarkContined;
        int i8 = (i6 & 37) + (i6 | 37);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 98 / 0;
        }
        return i7;
    }

    public int getContinuedCount() {
        int i = 2 % 2;
        int i2 = b + 49;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.continuedCount;
        }
        throw null;
    }

    public int getIsBatchMarked() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 51) | (i2 & 51)) << 1;
        int i4 = -(((~i2) & 51) | (i2 & (-52)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = this.isBatchMarked;
        int i8 = ((i6 | 111) << 1) - (i6 ^ 111);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 16 / 0;
        }
        return i7;
    }

    public int getNotAtHomeCount() {
        int i = 2 % 2;
        int i2 = b + 23;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = this.notAtHomeCount;
        int i6 = i3 & 107;
        int i7 = (i3 ^ 107) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getStatus() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 102) << 1) - (i2 ^ 102);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return this.status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getTotalRostersCount() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-84)) | ((~i2) & 83);
        int i4 = -(-((i2 & 83) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this.totalRostersCount;
        }
        throw null;
    }

    public int getTotalSurveyCount() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 31;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.totalSurveyCount;
        int i6 = ((((i2 ^ 117) | (i2 & 117)) << 1) - (~(-(((~i2) & 117) | (i2 & (-118)))))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAutoMarkContined(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 30) + (i3 | 30)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.autoMarkContined = i;
        int i6 = ((i3 & 38) + (i3 | 38)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setContinuedCount(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 91;
        int i5 = ((i3 ^ 91) | i4) << 1;
        int i6 = -((~i4) & (i3 | 91));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.continuedCount = i;
        int i9 = (((i3 & (-46)) | ((~i3) & 45)) - (~((i3 & 45) << 1))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setIsBatchMarked(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 55;
        int i5 = (~i4) & (i3 | 55);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        this.isBatchMarked = i;
        int i9 = (((i3 | 36) << 1) - (i3 ^ 36)) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 31 / 0;
        }
    }

    public void setNotAtHomeCount(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 99;
        int i5 = ((i4 << 1) - (~(-(i4 & (~(i3 & 99)))))) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.notAtHomeCount = i;
            throw null;
        }
        this.notAtHomeCount = i;
        int i6 = i3 & 67;
        int i7 = i6 + ((i3 ^ 67) | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setStatus(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 35) + (i3 | 35);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.status = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 15;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 91 / 0;
        }
    }

    public void setTotalRostersCount(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 75;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.totalRostersCount = i;
        int i6 = i3 + 69;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
    }

    public void setTotalSurveyCount(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 78) << 1) - (i3 ^ 78)) - 1;
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            this.totalSurveyCount = i;
            throw null;
        }
        this.totalSurveyCount = i;
        int i6 = (((i5 | 26) << 1) - (i5 ^ 26)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }
}
