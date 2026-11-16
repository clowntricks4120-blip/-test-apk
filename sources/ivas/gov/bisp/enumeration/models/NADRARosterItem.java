package ivas.gov.bisp.enumeration.models;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class NADRARosterItem implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public String age;
    public String card_status;
    public String citizen_number;
    public String disability;
    public String englishName;
    public String gender;
    private boolean isSelected = false;
    public String martial_Status;
    public String name;
    public String relation;

    public NADRARosterItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.relation = str;
        this.card_status = str2;
        this.citizen_number = str3;
        this.name = str4;
        this.englishName = str5;
        this.gender = str6;
        this.age = str7;
        this.martial_Status = str8;
        this.disability = str9;
    }

    public String getAge() {
        String str;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = (i2 | 49) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 == 0) {
            str = this.age;
            int i8 = 9 / 0;
        } else {
            str = this.age;
        }
        int i9 = i7 + 41;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 36 / 0;
        }
        return str;
    }

    public String getCard_status() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = (((~i3) & (i2 | 81)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.card_status;
        int i5 = i2 + 21;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getCitizen_number() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 50) + (i2 | 50)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.citizen_number;
        int i6 = (i4 | 1) << 1;
        int i7 = -(((~i4) & 1) | (i4 & (-2)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getDisability() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = (((i2 ^ 3) | i3) << 1) - ((~i3) & (i2 | 3));
        b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.disability;
        int i6 = i2 & 35;
        int i7 = -(-((i2 ^ 35) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getEnglishName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 31;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 31)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return this.englishName;
        }
        throw null;
    }

    public String getGender() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 31) + (i2 | 31);
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.gender;
        int i5 = (i2 & (-16)) | ((~i2) & 15);
        int i6 = (i2 & 15) << 1;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public String getMartial_Status() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 83) + (i2 | 83);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.martial_Status;
        int i5 = i4 & 113;
        int i6 = -(-((i4 ^ 113) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = a + 23;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getRelation() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.relation;
        int i6 = (i4 ^ 15) + ((i4 & 15) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean get_isSelected() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = (((i2 ^ 87) | i3) << 1) - ((~i3) & (i2 | 87));
        a = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.isSelected;
        int i6 = (((i2 | 30) << 1) - (i2 ^ 30)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void setAge(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 81;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.age = str;
        int i5 = ((i2 | 61) << 1) - (((~i2) & 61) | (i2 & (-62)));
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCard_status(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 107;
        int i4 = i3 + ((i2 ^ 107) | i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        this.card_status = str;
        int i7 = (i5 & 53) + (i5 | 53);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 20 / 0;
        }
    }

    public void setCitizen_number(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-108)) | ((~i2) & 107);
        int i4 = -(-((i2 & 107) << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.citizen_number = str;
        int i7 = i2 & 107;
        int i8 = i7 + ((i2 ^ 107) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setDisability(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.disability = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 & 57;
        int i6 = (i2 ^ 57) | i5;
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public void setEnglishName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 1;
        int i4 = (i2 | 1) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.englishName = str;
        if (i7 == 0) {
            throw null;
        }
    }

    public void setGender(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 79;
        int i4 = i2 | 79;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.gender = str;
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMartial_Status(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 41;
        int i4 = -(-((i2 ^ 41) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.martial_Status = str;
        int i7 = i2 & 71;
        int i8 = -(-((i2 ^ 71) | i7));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 55) + (i2 | 55);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.name = str;
        if (i4 == 0) {
            int i5 = 77 / 0;
        }
    }

    public void setRelation(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 101;
        int i4 = (i3 - (~(-(-((i2 ^ 101) | i3))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        this.relation = str;
        if (i6 != 0) {
            int i7 = 74 / 0;
        }
        int i8 = i5 & 121;
        int i9 = (i5 | 121) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    public void set_isSelected(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = (i2 | 97) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.isSelected = z;
        if (i7 != 0) {
            int i8 = 93 / 0;
        }
    }
}
