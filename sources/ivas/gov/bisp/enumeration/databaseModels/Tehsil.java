package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import ivas.gov.bisp.enumeration.p026az.t;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Tehsil extends SugarRecord implements t {
    private static int a = 1;
    private static int b;

    @o0OO00O("district_id")
    private int districtId;

    @o0OO00O("tab_vs_gps_time")
    private int tabVsGpsTime;

    @o0OO00O("tehsil_id")
    private int tehsilId;

    @o0OO00O("tehsil_name")
    private String tehsilName;

    public Tehsil() {
        setTehsilId(0);
        setDistrictId(0);
        setTehsilName(BuildConfig.FLAVOR);
        setTabVsGpsTime(0);
    }

    public int getDistrictId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 51) + (i2 | 51);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = this.districtId;
        int i7 = i4 & 59;
        int i8 = (i4 ^ 59) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return i6;
    }

    @Override // ivas.gov.bisp.enumeration.p026az.t
    public String getDropDownViewLabel() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = -(-(i2 | 79));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        String tehsilName = getTehsilName();
        int i7 = a;
        int i8 = i7 & 87;
        int i9 = -(-(i7 | 87));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return tehsilName;
    }

    public int getTabVsGpsTime() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = (i2 | 75) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = this.tabVsGpsTime;
        int i10 = (i7 & 29) + (i7 | 29);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return i9;
        }
        throw null;
    }

    public int getTehsilId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.tehsilId;
        int i7 = ((i4 & 16) + (i4 | 16)) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 56 / 0;
        }
        return i6;
    }

    public String getTehsilName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 16) << 1) - (i2 ^ 16)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tehsilName;
        int i5 = ((((i2 ^ 3) | (i2 & 3)) << 1) - (~(-(((~i2) & 3) | (i2 & (-4)))))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getViewLabel() {
        int i = 2 % 2;
        int i2 = a + 107;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return getTehsilName();
        }
        getTehsilName();
        throw null;
    }

    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 35;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 33;
        int i6 = i5 + ((i2 ^ 33) | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public void setDistrictId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 59;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.districtId = i;
        int i6 = i3 & 69;
        int i7 = (i3 | 69) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setTabVsGpsTime(int i) {
        int i2 = 2 % 2;
        int i3 = a + 119;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.tabVsGpsTime = i;
        if (i5 != 0) {
            int i6 = 67 / 0;
        }
        int i7 = i4 & 53;
        int i8 = -(-((i4 ^ 53) | i7));
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 31 / 0;
        }
    }

    public void setTehsilId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 123;
        int i5 = -(-((i3 & 123) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.tehsilId = i;
        int i9 = i7 ^ 37;
        int i10 = -(-((i7 & 37) << 1));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public void setTehsilName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            this.tehsilName = str;
            int i5 = 64 / 0;
        } else {
            this.tehsilName = str;
        }
        int i6 = i4 ^ 37;
        int i7 = ((i4 & 37) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 81 / 0;
        }
    }

    public Tehsil(String str) {
        this.tehsilName = str;
    }
}
