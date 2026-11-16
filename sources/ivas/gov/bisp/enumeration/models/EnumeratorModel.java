package ivas.gov.bisp.enumeration.models;

import com.orm.SugarRecord;
import java.io.Serializable;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class EnumeratorModel extends SugarRecord implements Serializable {
    private static int a = 0;
    private static int b = 1;
    private int enumeratorAutoContinueCount;
    private String enumeratorCnic;
    private String enumeratorContact;
    private int enumeratorContinueCount;
    private int enumeratorId;
    private String enumeratorImei;
    private String enumeratorName;
    private int enumeratorNotAtHomeCount;
    private int enumeratorTotalDoneVerifyCount;
    private int enumeratorTotalSurveyCount;
    private int enumeratorTotalVerifyCount;

    public EnumeratorModel() {
        setEmptyValues();
    }

    public int getEnumeratorAutoContinueCount() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 43) << 1) - ((i2 & (-44)) | ((~i2) & 43));
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.enumeratorAutoContinueCount;
        int i6 = (i2 ^ 45) + ((i2 & 45) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getEnumeratorCnic() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 41;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.enumeratorCnic;
        int i5 = i2 & 49;
        int i6 = (i5 - (~(-(-((i2 ^ 49) | i5))))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getEnumeratorContact() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 24) + (i2 | 24);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.enumeratorContact;
        int i6 = (-2) - ((i5 + 44) ^ (-1));
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public int getEnumeratorContinueCount() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 45) + (i3 | 45);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            i = this.enumeratorContinueCount;
            int i6 = 71 / 0;
        } else {
            i = this.enumeratorContinueCount;
        }
        int i7 = i5 & 19;
        int i8 = i7 + ((i5 ^ 19) | i7);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public int getEnumeratorId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 31;
        int i4 = ((((i2 & 31) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.enumeratorId;
        if (i5 == 0) {
            int i7 = 46 / 0;
        }
        int i8 = i2 & 115;
        int i9 = -(-((i2 ^ 115) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return i6;
    }

    public String getEnumeratorImei() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 105;
        int i4 = (((i2 | 105) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        String str = this.enumeratorImei;
        int i7 = i5 & 101;
        int i8 = ((i5 ^ 101) | i7) << 1;
        int i9 = -((i5 | 101) & (~i7));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getEnumeratorName() {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 94) ^ (-1));
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        String str = this.enumeratorName;
        int i5 = (i3 ^ 3) + ((i3 & 3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getEnumeratorNotAtHomeCount() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = -(-(i2 | 119));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.enumeratorNotAtHomeCount;
        int i8 = ((i2 & 109) - (~(i2 | 109))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public int getEnumeratorTotalDoneVerifyCount() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((i2 + 54) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.enumeratorTotalDoneVerifyCount;
        int i6 = (i2 & 105) + (i2 | 105);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 20 / 0;
        }
        return i5;
    }

    public int getEnumeratorTotalSurveyCount() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 43) + (i2 | 43);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.enumeratorTotalSurveyCount;
        int i6 = ((i2 ^ 99) | (i2 & 99)) << 1;
        int i7 = -(((~i2) & 99) | (i2 & (-100)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getEnumeratorTotalVerifyCount() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = i2 | 7;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.enumeratorTotalVerifyCount;
        }
        throw null;
    }

    @Override // com.orm.SugarRecord
    public long save() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 89;
        int i4 = ((i2 ^ 89) | i3) << 1;
        int i5 = -((i2 | 89) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        long jSave = super.save();
        int i8 = a;
        int i9 = (i8 & 86) + (i8 | 86);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return jSave;
    }

    public void setEnumeratorAutoContinueCount(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - (((i3 ^ 102) + ((i3 & 102) << 1)) ^ (-1));
        b = i4 % 128;
        int i5 = i4 % 2;
        this.enumeratorAutoContinueCount = i;
        int i6 = i3 & 69;
        int i7 = -(-((i3 ^ 69) | i6));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEnumeratorCnic(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = (i2 ^ 93) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.enumeratorCnic = str;
        int i7 = (((i2 | 102) << 1) - (i2 ^ 102)) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setEnumeratorContact(String str) {
        int i = 2 % 2;
        int i2 = b + 29;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.enumeratorContact = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public void setEnumeratorContinueCount(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 107) << 1) - (i3 ^ 107);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.enumeratorContinueCount = i;
        if (i5 != 0) {
            throw null;
        }
    }

    public void setEnumeratorId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 95;
        int i5 = (~i4) & (i3 | 95);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        this.enumeratorId = i;
        int i9 = ((i3 | 17) << 1) - (i3 ^ 17);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 57 / 0;
        }
    }

    public void setEnumeratorImei(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-104)) | ((~i2) & 103);
        int i4 = -(-((i2 & 103) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.enumeratorImei = str;
        if (i6 != 0) {
            throw null;
        }
    }

    public void setEnumeratorName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = -(-((i2 ^ 3) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.enumeratorName = str;
        int i8 = i6 | 19;
        int i9 = (i8 << 1) - (i8 & (~(i6 & 19)));
        a = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public void setEnumeratorNotAtHomeCount(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 85) << 1) - (i3 ^ 85);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.enumeratorNotAtHomeCount = i;
            int i5 = 86 / 0;
        } else {
            this.enumeratorNotAtHomeCount = i;
        }
        int i6 = i3 ^ 125;
        int i7 = ((i3 & 125) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 28 / 0;
        }
    }

    public void setEnumeratorTotalDoneVerifyCount(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-120)) | ((~i3) & 119);
        int i5 = -(-((i3 & 119) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            this.enumeratorTotalDoneVerifyCount = i;
            return;
        }
        this.enumeratorTotalDoneVerifyCount = i;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEnumeratorTotalSurveyCount(int i) {
        int i2 = 2 % 2;
        int i3 = b + 63;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            this.enumeratorTotalSurveyCount = i;
            int i5 = 47 / 0;
        } else {
            this.enumeratorTotalSurveyCount = i;
        }
        int i6 = i4 & 59;
        int i7 = (i4 ^ 59) | i6;
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 95 / 0;
        }
    }

    public void setEnumeratorTotalVerifyCount(int i) {
        int i2 = 2 % 2;
        int i3 = a + 115;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.enumeratorTotalVerifyCount = i;
        int i6 = i4 & 29;
        int i7 = (~i6) & (i4 | 29);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setEmptyValues() {
        int i = 2 % 2;
        int i2 = b + 37;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 != 0) {
            this.enumeratorImei = BuildConfig.FLAVOR;
            this.enumeratorName = BuildConfig.FLAVOR;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.enumeratorImei = BuildConfig.FLAVOR;
        this.enumeratorName = BuildConfig.FLAVOR;
        int i4 = (i3 ^ 39) + ((i3 & 39) << 1);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            this.enumeratorCnic = BuildConfig.FLAVOR;
            this.enumeratorContact = BuildConfig.FLAVOR;
            this.enumeratorTotalSurveyCount = 1;
        } else {
            this.enumeratorCnic = BuildConfig.FLAVOR;
            this.enumeratorContact = BuildConfig.FLAVOR;
            this.enumeratorTotalSurveyCount = 0;
        }
        int i6 = (-2) - ((i5 + 98) ^ (-1));
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        this.enumeratorTotalVerifyCount = 0;
        this.enumeratorAutoContinueCount = 0;
        this.enumeratorTotalDoneVerifyCount = 0;
        int i9 = i7 + 77;
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        this.enumeratorNotAtHomeCount = 0;
        this.enumeratorContinueCount = 0;
        int i12 = i10 & 101;
        int i13 = (i12 - (~((i10 ^ 101) | i12))) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
    }
}
