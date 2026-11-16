package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import ivas.gov.bisp.enumeration.p026az.t;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class District extends SugarRecord implements t {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("desk_based_survey")
    private int deskBasedSurvey;

    @o0OO00O("district_id")
    private int districtId;

    @o0OO00O("district_name")
    private String districtName;

    @o0OO00O("province_id")
    private int provinceId;

    public District() {
        this.deskBasedSurvey = 0;
        setDistrictId(0);
        setProvinceId(0);
        setDistrictName(BuildConfig.FLAVOR);
        setDeskBasedSurvey(0);
    }

    public int getDeskBasedSurvey() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-66)) | ((~i2) & 65);
        int i4 = -(-((i2 & 65) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.deskBasedSurvey;
        if (i6 == 0) {
            int i8 = 12 / 0;
        }
        return i7;
    }

    public int getDistrictId() {
        int i = 2 % 2;
        int i2 = a + 95;
        int i3 = i2 % 128;
        b = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.districtId;
        int i5 = (i3 & 116) + (i3 | 116);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public String getDistrictName() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 67) - (~(-(-((i2 & 67) << 1))))) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.districtName;
            int i4 = 59 / 0;
        } else {
            str = this.districtName;
        }
        int i5 = i2 & 27;
        int i6 = (i2 | 27) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p026az.t
    public String getDropDownViewLabel() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 95) | (i2 & 95)) << 1;
        int i4 = -(((~i2) & 95) | (i2 & (-96)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        String districtName = getDistrictName();
        int i7 = a;
        int i8 = i7 & 29;
        int i9 = (i8 - (~(-(-((i7 ^ 29) | i8))))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        return districtName;
    }

    public int getProvinceId() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 63;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.provinceId;
            int i5 = 25 / 0;
        } else {
            i = this.provinceId;
        }
        int i6 = ((i3 & 71) - (~(-(-(i3 | 71))))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getViewLabel() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = i3 + ((i2 ^ 15) | i3);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return getDistrictName();
        }
        getDistrictName();
        throw null;
    }

    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = b + 71;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = i3 & 31;
        int i6 = -(-((i3 ^ 31) | i5));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDeskBasedSurvey(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 103;
        int i5 = i4 + ((i3 ^ 103) | i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.deskBasedSurvey = i;
            throw null;
        }
        this.deskBasedSurvey = i;
        int i6 = i3 + 79;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setDistrictId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 95) << 1) - (i3 ^ 95);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.districtId = i;
        int i6 = ((i3 ^ 19) | (i3 & 19)) << 1;
        int i7 = -(((~i3) & 19) | (i3 & (-20)));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setDistrictName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 121) + ((i2 & 121) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.districtName = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = (i2 ^ 31) + ((i2 & 31) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setProvinceId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 22) + (i3 | 22)) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        this.provinceId = i;
        int i7 = i5 & 85;
        int i8 = i7 + ((i5 ^ 85) | i7);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public District(String str) {
        this.deskBasedSurvey = 0;
        this.districtName = str;
    }

    public District(int i, int i2, String str, int i3) {
        this.districtId = i2;
        this.provinceId = i;
        this.districtName = str;
        this.deskBasedSurvey = i3;
    }
}
