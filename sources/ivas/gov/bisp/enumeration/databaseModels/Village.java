package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import ivas.gov.bisp.enumeration.p026az.t;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Village extends SugarRecord implements t {
    private static int a = 1;
    private static int b;

    @o0OO00O("accuracy")
    private double accuracy;

    @o0OO00O("is_gps_exempted")
    private int isGpsExempted;

    @o0OO00O("is_recollection")
    private int isReCollection;

    @o0OO00O("is_validate")
    private int isValidate;

    @o0OO00O("status")
    private int status;

    @o0OO00O("uc_id")
    private int ucId;

    @o0OO00O("village_id")
    private long villageId;

    @o0OO00O("village_name")
    private String villageName;

    public Village() {
        setVillageId(0);
        setUcId(0);
        setVillageName(BuildConfig.FLAVOR);
        setIsGpsExempted(0);
        setIsValidate(0);
        setStatus(0);
        setAccuracy(50.0d);
    }

    public double getAccuracy() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 75) + ((i2 & 75) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        double d = this.accuracy;
        int i4 = i2 & 3;
        int i5 = -(-(i2 | 3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return d;
    }

    @Override // ivas.gov.bisp.enumeration.p026az.t
    public String getDropDownViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-114)) | ((~i2) & 113);
        int i4 = (i2 & 113) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        String villageName = getVillageName();
        if (i6 != 0) {
            int i7 = 92 / 0;
        }
        int i8 = b;
        int i9 = (i8 | 21) << 1;
        int i10 = -(((~i8) & 21) | (i8 & (-22)));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return villageName;
    }

    public int getIsGpsExempted() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = ((i2 ^ 11) | i3) << 1;
        int i5 = -((i2 | 11) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i8 = this.isGpsExempted;
        int i9 = (i7 ^ 31) + ((i7 & 31) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 52 / 0;
        }
        return i8;
    }

    public int getIsReCollection() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 7;
        int i4 = (((i2 & 7) | i3) << 1) - i3;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.isReCollection;
        if (i5 != 0) {
            int i7 = 40 / 0;
        }
        return i6;
    }

    public int getIsValidate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 109) + ((i2 & 109) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.isValidate;
        int i6 = ((i2 & (-118)) | ((~i2) & 117)) + ((i2 & 117) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public int getStatus() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 123;
        int i4 = (i2 & 123) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i7 = this.status;
        int i8 = ((i6 ^ 53) | (i6 & 53)) << 1;
        int i9 = -(((~i6) & 53) | (i6 & (-54)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return i7;
        }
        throw null;
    }

    public int getUcId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 107;
        int i4 = ((i2 ^ 107) | i3) << 1;
        int i5 = -((i2 | 107) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return this.ucId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getViewLabel() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 25) + (i2 | 25);
        a = i3 % 128;
        int i4 = i3 % 2;
        String villageName = getVillageName();
        int i5 = a;
        int i6 = (i5 & 26) + (i5 | 26);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return villageName;
    }

    public long getVillageId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 29;
        int i4 = (i2 & 29) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this.villageId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getVillageName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 31;
        int i4 = -(-((i2 ^ 31) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        String str = this.villageName;
        if (i6 != 0) {
            int i7 = 99 / 0;
        }
        return str;
    }

    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 89;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((i2 | 123) << 1) - (i2 ^ 123);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return false;
    }

    public void setAccuracy(double d) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 51;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.accuracy = d;
        int i5 = i2 & 13;
        int i6 = (~i5) & (i2 | 13);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setIsGpsExempted(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 92) << 1) - (i3 ^ 92)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.isGpsExempted = i;
        int i6 = i3 + 43;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIsReCollection(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 125) + (i3 | 125);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Object obj = null;
        this.isReCollection = i;
        if (i6 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i5 & 93;
        int i8 = (i5 | 93) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public void setIsValidate(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 118) << 1) - (i3 ^ 118)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.isValidate = i;
        if (i5 != 0) {
            int i6 = 4 / 0;
        }
        int i7 = i3 & 39;
        int i8 = (i7 - (~(-(-((i3 ^ 39) | i7))))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 76 / 0;
        }
    }

    public void setStatus(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - ((i3 + 112) ^ (-1));
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.status = i;
            int i5 = 32 / 0;
        } else {
            this.status = i;
        }
        int i6 = (i3 & 33) + (i3 | 33);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUcId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - (((i3 & 88) + (i3 | 88)) ^ (-1));
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.ucId = i;
        int i7 = i5 & 15;
        int i8 = (((i5 ^ 15) | i7) << 1) - ((~i7) & (i5 | 15));
        a = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public void setVillageId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 113;
        int i5 = i3 | 113;
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 == 0) {
            this.villageId = i;
            int i8 = 5 / 0;
        } else {
            this.villageId = i;
        }
        int i9 = i7 + 59;
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setVillageName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 46) + ((i2 & 46) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.villageName = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = (i2 | 27) << 1;
        int i6 = -(((~i2) & 27) | (i2 & (-28)));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 1 / 0;
        }
    }

    public void setVillageId(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 110) + (i2 | 110)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.villageId = j;
        int i5 = i2 & 7;
        int i6 = (i5 - (~(-(-((i2 ^ 7) | i5))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public Village(String str) {
        this.villageName = str;
    }
}
