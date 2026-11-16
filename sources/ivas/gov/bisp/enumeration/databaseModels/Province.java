package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import ivas.gov.bisp.enumeration.p026az.t;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Province extends SugarRecord implements t {
    private static int a = 1;
    private static int b;

    @o0OO00O("province_id")
    private int provinceId;

    @o0OO00O("province_name")
    private String provinceName;

    public Province() {
        setProvinceName(BuildConfig.FLAVOR);
        setProvinceId(0);
    }

    @Override // ivas.gov.bisp.enumeration.p026az.t
    public String getDropDownViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 43;
        int i4 = ((i2 ^ 43) | i3) << 1;
        int i5 = -((i2 | 43) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        String provinceName = getProvinceName();
        int i8 = a + 45;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return provinceName;
        }
        throw null;
    }

    public int getProvinceId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 1;
        int i4 = (i2 ^ 1) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = this.provinceId;
        if (i7 != 0) {
            int i9 = 2 / 0;
        }
        int i10 = i6 & 75;
        int i11 = ((i6 | 75) & (~i10)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 8 / 0;
        }
        return i8;
    }

    public String getProvinceName() {
        String str;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 41;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.provinceName;
            int i4 = 92 / 0;
        } else {
            str = this.provinceName;
        }
        int i5 = (i2 ^ 49) + ((i2 & 49) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 13;
        int i4 = (((i2 ^ 13) | i3) << 1) - ((i2 | 13) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
        String provinceName = getProvinceName();
        int i6 = b;
        int i7 = ((i6 | 13) << 1) - (i6 ^ 13);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 48 / 0;
        }
        return provinceName;
    }

    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 99) - (~(-(-((i2 & 99) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 ^ 113;
        int i6 = (((i2 & 113) | i5) << 1) - i5;
        a = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public void setProvinceId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((((i3 ^ 101) | (i3 & 101)) << 1) - (~(-(((~i3) & 101) | (i3 & (-102)))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.provinceId = i;
        } else {
            this.provinceId = i;
            throw null;
        }
    }

    public void setProvinceName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = (i2 ^ 57) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.provinceName = str;
        int i7 = i2 & 7;
        int i8 = (i2 ^ 7) | i7;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 81 / 0;
        }
    }

    public Province(String str) {
        this.provinceName = str;
    }

    public Province(int i, String str) {
        this.provinceId = i;
        this.provinceName = str;
    }
}
