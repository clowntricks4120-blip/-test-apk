package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import ivas.gov.bisp.enumeration.p026az.t;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Item extends SugarRecord implements t {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("option")
    private String option;

    @o0OO00O("option_id")
    private int optionId;

    @o0OO00O("tag")
    private String tag;

    public Item() {
        setOptionId(0);
        setOption(BuildConfig.FLAVOR);
        setTag(BuildConfig.FLAVOR);
    }

    @Override // ivas.gov.bisp.enumeration.p026az.t
    public String getDropDownViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-122)) | ((~i2) & 121);
        int i4 = -(-((i2 & 121) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return getOption();
        }
        getOption();
        throw null;
    }

    public String getOption() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 64) + (i2 | 64)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.option;
        int i6 = ((((i4 ^ 105) | (i4 & 105)) << 1) - (~(-(((~i4) & 105) | (i4 & (-106)))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public int getOptionId() {
        int i = 2 % 2;
        int i2 = b + 51;
        a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.optionId;
        if (i3 != 0) {
            int i5 = 28 / 0;
        }
        return i4;
    }

    public String getTag() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 3) + (i2 | 3);
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tag;
        int i5 = i2 ^ 1;
        int i6 = -(-((i2 & 1) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getViewLabel() {
        String option;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 77;
        int i4 = (i2 & 77) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            option = getOption();
            int i6 = 52 / 0;
        } else {
            option = getOption();
        }
        int i7 = a;
        int i8 = ((i7 & 8) + (i7 | 8)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return option;
    }

    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 97;
        int i4 = ((i2 & 97) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 + 79;
        b = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public void setOption(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = ((i2 ^ 97) | i3) << 1;
        int i5 = -((~i3) & (i2 | 97));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.option = str;
            throw null;
        }
        this.option = str;
        int i7 = i2 & 13;
        int i8 = (i2 ^ 13) | i7;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public void setOptionId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 47) | (i3 & 47)) << 1;
        int i5 = -((i3 & (-48)) | ((~i3) & 47));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.optionId = i;
        int i8 = (-2) - ((i3 + 122) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setTag(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 112) + ((i2 & 112) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.tag = str;
        int i5 = ((i2 & 62) + (i2 | 62)) - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = (i3 - (~(-(-((i2 ^ 11) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        String option = getOption();
        int i6 = a + 114;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return option;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        if (r9.tag != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        if (r9.tag != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0117, code lost:
    
        r1 = r1 + 15;
        r9 = r1 % 128;
        ivas.gov.bisp.enumeration.databaseModels.Item.b = r9;
        r1 = r1 % 2;
        r1 = ((r9 | 67) << 1) - (r9 ^ 67);
        ivas.gov.bisp.enumeration.databaseModels.Item.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.databaseModels.Item.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    public int hashCode() {
        int i;
        String str;
        int iHashCode;
        int i2;
        int iHashCode2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((((i5 ^ 81) | (i5 & 81)) << 1) - (~(-(((~i5) & 81) | (i5 & (-82)))))) - 1;
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 != 0) {
            i = this.optionId;
            str = this.option;
            if (str == null) {
                i2 = 1;
                int i8 = i7 & 121;
                int i9 = -(-(i7 | 121));
                i3 = ((i8 | i9) << 1) - (i9 ^ i8);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i10 = 4 / 5;
                }
                iHashCode = i2;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = str.hashCode();
                int i11 = b;
                int i12 = ((i11 ^ 66) + ((i11 & 66) << 1)) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            i = this.optionId;
            str = this.option;
            if (str == null) {
                i2 = 0;
                int i14 = i7 & 121;
                int i15 = -(-(i7 | 121));
                i3 = ((i14 | i15) << 1) - (i15 ^ i14);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i16 = 4 / 5;
                }
                iHashCode = i2;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = str.hashCode();
                int i17 = b;
                int i18 = ((i17 ^ 66) + ((i17 & 66) << 1)) - 1;
                a = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        String str2 = this.tag;
        if (str2 != null) {
            int i20 = a;
            int i21 = (i20 & 59) + (i20 | 59);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                iHashCode = str2.hashCode();
                int i22 = 2 / 0;
            } else {
                iHashCode = str2.hashCode();
            }
        }
        int i23 = ((((i ^ 31) | (i & 31)) << 1) - (((~i) & 31) | (i & (-32)))) * 31;
        int i24 = i23 & iHashCode2;
        int i25 = (((i23 | iHashCode2) & (~i24)) + (i24 << 1)) * 31;
        int i26 = ((i25 ^ iHashCode) | (i25 & iHashCode)) << 1;
        int i27 = -((iHashCode & (~i25)) | ((~iHashCode) & i25));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        int i29 = b;
        int i30 = i29 & 3;
        int i31 = i30 + ((i29 ^ 3) | i30);
        a = i31 % 128;
        if (i31 % 2 == 0) {
            return i28;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Item(String str) {
        setOption(str);
        setOptionId(0);
        setTag(BuildConfig.FLAVOR);
    }

    public Item(int i, String str, String str2) {
        this.optionId = i;
        this.option = str;
        this.tag = str2;
    }
}
