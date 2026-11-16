package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import ivas.gov.bisp.enumeration.p026az.t;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class UnionCouncil extends SugarRecord implements t {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("batch_size")
    private int batchSize;

    @o0OO00O("is_gps_exempted")
    private int isGpsExempted;

    @o0OO00O("is_hard_area")
    private int isHardArea;

    @o0OO00O("is_validate")
    private int isValidate;

    @o0OO00O("tehsil_id")
    private int tehsilId;

    @o0OO00O("uc_id")
    private int ucId;

    @o0OO00O("uc_name")
    private String ucName;

    public UnionCouncil() {
        setUcId(0);
        setTehsilId(0);
        setUcName(BuildConfig.FLAVOR);
        setIsGpsExempted(0);
        setIsHardArea(0);
        setIsValidate(0);
        setBatchSize(1);
    }

    public int getBatchSize() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 67) + ((i2 & 67) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.batchSize;
        int i6 = i2 ^ 47;
        int i7 = ((i2 & 47) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i5;
    }

    @Override // ivas.gov.bisp.enumeration.p026az.t
    public String getDropDownViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 110) + ((i2 & 110) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        String ucName = getUcName();
        int i5 = b;
        int i6 = i5 & 7;
        int i7 = i6 + ((i5 ^ 7) | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        return ucName;
    }

    public int getIsGpsExempted() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.isGpsExempted;
        int i6 = ((i2 & 122) + (i2 | 122)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getIsHardArea() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 95) + (i2 | 95);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.isHardArea;
        int i6 = i4 & 79;
        int i7 = (((i4 ^ 79) | i6) << 1) - ((i4 | 79) & (~i6));
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 70 / 0;
        }
        return i5;
    }

    public int getIsValidate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = ((((i2 ^ 81) | i3) << 1) - (~(-((i2 | 81) & (~i3))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.isValidate;
        int i8 = (i5 & 108) + (i5 | 108);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getTehsilId() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 93;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.tehsilId;
            int i5 = 58 / 0;
        } else {
            i = this.tehsilId;
        }
        int i6 = ((i3 & 63) - (~(-(-(i3 | 63))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public int getUcId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.ucId;
        }
        throw null;
    }

    public String getUcName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 14) + ((i2 & 14) << 1)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.ucName;
        int i6 = i4 & 79;
        int i7 = ((((i4 ^ 79) | i6) << 1) - (~(-((i4 | 79) & (~i6))))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            getUcName();
            throw null;
        }
        String ucName = getUcName();
        int i4 = a;
        int i5 = (((i4 ^ 77) | (i4 & 77)) << 1) - (((~i4) & 77) | (i4 & (-78)));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return ucName;
        }
        throw null;
    }

    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 31) << 1) - (i2 ^ 31);
        int i4 = i3 % 128;
        a = i4;
        boolean z = i3 % 2 != 0;
        int i5 = ((i4 | 37) << 1) - (i4 ^ 37);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return z;
    }

    public void setBatchSize(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 18) + ((i3 & 18) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        this.batchSize = i;
        int i8 = i6 & 37;
        int i9 = i8 + ((i6 ^ 37) | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setIsGpsExempted(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 28) + ((i3 & 28) << 1)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.isGpsExempted = i;
        int i6 = i3 + 23;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIsHardArea(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 98) << 1) - (i3 ^ 98)) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        this.isHardArea = i;
        int i7 = i5 & 105;
        int i8 = (i5 ^ 105) | i7;
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setIsValidate(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-50)) | ((~i3) & 49)) + ((i3 & 49) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.isValidate = i;
        if (i5 != 0) {
            int i6 = 18 / 0;
        }
        int i7 = i3 + 45;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public void setTehsilId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 99) + (i3 | 99);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.tehsilId = i;
        int i6 = (i3 & (-6)) | ((~i3) & 5);
        int i7 = -(-((i3 & 5) << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public void setUcId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 59;
        int i5 = ((i3 ^ 59) | i4) << 1;
        int i6 = -((i3 | 59) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        this.ucId = i;
        if (i8 == 0) {
            int i9 = 14 / 0;
        }
    }

    public void setUcName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 95;
        int i4 = -(-((i2 ^ 95) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.ucName = str;
            return;
        }
        this.ucName = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public UnionCouncil(String str) {
        this.ucName = str;
    }

    public UnionCouncil(int i, int i2, String str, int i3, int i4, int i5, int i6) {
        this.ucId = i2;
        this.tehsilId = i;
        this.ucName = str;
        this.isGpsExempted = i3;
        this.isHardArea = i4;
        this.isValidate = i5;
        this.batchSize = i6;
    }
}
