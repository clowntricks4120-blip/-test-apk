package ivas.gov.bisp.enumeration.models;

import com.orm.SugarRecord;

/* JADX INFO: loaded from: classes.dex */
public class SummaryReport extends SugarRecord {
    private static int a = 1;
    private static int b;
    private String enumeratorVersion;
    private String qrCode;
    private int surveyCount;

    public SummaryReport() {
    }

    public String getEnumeratorVersion() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 63;
        int i4 = (((i2 & 63) | i3) << 1) - i3;
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.enumeratorVersion;
        int i6 = (i5 & (-106)) | ((~i5) & 105);
        int i7 = (i5 & 105) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public String getQrCode() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-12)) | ((~i2) & 11)) - (~(-(-((i2 & 11) << 1))))) - 1;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            str = this.qrCode;
            int i5 = 76 / 0;
        } else {
            str = this.qrCode;
        }
        int i6 = i4 + 73;
        b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public int getSurveyCount() {
        int i = 2 % 2;
        int i2 = a + 105;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.surveyCount;
        if (i3 != 0) {
            int i5 = 52 / 0;
        }
        return i4;
    }

    public void setEnumeratorVersion(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = i2 | 55;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.enumeratorVersion = str;
        int i7 = (-2) - ((i2 + 52) ^ (-1));
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 58 / 0;
        }
    }

    public void setQrCode(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = -(-(i2 | 15));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.qrCode = str;
        } else {
            this.qrCode = str;
            int i6 = 48 / 0;
        }
    }

    public void setSurveyCount(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 52) + (i3 | 52);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.surveyCount = i;
        int i7 = i3 & 15;
        int i8 = (i3 | 15) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SummaryReport(String str, int i, String str2) {
        this.enumeratorVersion = str;
        this.qrCode = str2;
        this.surveyCount = i;
    }
}
