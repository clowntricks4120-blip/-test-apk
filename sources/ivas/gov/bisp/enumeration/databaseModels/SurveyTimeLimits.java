package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class SurveyTimeLimits {
    private static int a = 1;
    private static int b;

    @o0OO00O("agricultureinfo")
    private int agriTime;

    @o0OO00O("assetinformation")
    private int assetsTime;

    @o0OO00O("geographiceinformation")
    private int contactTime;

    @o0OO00O("familytree")
    private int familyTree;

    @o0OO00O("householdcomposition")
    private int houseHoldComposition;

    @o0OO00O("istimeablescreen")
    private int isTimeableScreen;

    @o0OO00O("miscellaneous")
    private int miscleanousTime;

    @o0OO00O("roster")
    private int rosterTime;

    public SurveyTimeLimits(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.contactTime = i;
        this.miscleanousTime = i2;
        this.rosterTime = i3;
        this.assetsTime = i4;
        this.agriTime = i5;
        this.houseHoldComposition = i6;
        this.familyTree = i7;
        this.isTimeableScreen = i8;
    }

    public int getAgriTime() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 73) + ((i3 & 73) << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.agriTime;
            int i5 = 48 / 0;
        } else {
            i = this.agriTime;
        }
        int i6 = i3 + 29;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
        return i;
    }

    public int getAssetsTime() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = i3 + ((i2 ^ 69) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return this.assetsTime;
        }
        throw null;
    }

    public int getContactTime() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 109) + ((i2 & 109) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.contactTime;
        }
        throw null;
    }

    public int getFamilyTree() {
        int i = 2 % 2;
        int i2 = b + 53;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = this.familyTree;
        int i6 = (i3 & 25) + (i3 | 25);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return i5;
    }

    public int getHouseHoldComposition() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 111;
        int i4 = ((i2 & 111) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = this.houseHoldComposition;
        int i10 = i7 & 87;
        int i11 = (i7 | 87) & (~i10);
        int i12 = i10 << 1;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        return i9;
    }

    public int getIsTimeableScreen() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 7) - (~((i2 & 7) << 1))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.isTimeableScreen;
        int i5 = ((i2 | 111) << 1) - (i2 ^ 111);
        b = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int getMiscleanousTime() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-100)) | ((~i2) & 99)) + ((i2 & 99) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.miscleanousTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getRosterTime() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-106)) | ((~i2) & 105)) + ((i2 & 105) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = this.rosterTime;
        int i7 = i4 + 93;
        a = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void setAgriTime(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 25) + (i3 | 25);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.agriTime = i;
        int i6 = ((i3 | 61) << 1) - (i3 ^ 61);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void setAssetsTime(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 61) + (i3 | 61);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.assetsTime = i;
        int i7 = i5 & 121;
        int i8 = (i5 | 121) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public void setContactTime(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - ((i3 + 122) ^ (-1));
        b = i4 % 128;
        int i5 = i4 % 2;
        this.contactTime = i;
        if (i5 != 0) {
            int i6 = 60 / 0;
        }
        int i7 = (((i3 ^ 119) | (i3 & 119)) << 1) - (((~i3) & 119) | (i3 & (-120)));
        b = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public void setFamilyTree(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - ((((i3 | 80) << 1) - (i3 ^ 80)) ^ (-1));
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.familyTree = i;
        int i7 = i5 & 65;
        int i8 = i5 | 65;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public void setHouseHoldComposition(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-90)) | ((~i3) & 89)) + ((i3 & 89) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.houseHoldComposition = i;
        if (i5 != 0) {
            int i6 = 27 / 0;
        }
    }

    public void setIsTimeableScreen(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 32) + (i3 | 32);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.isTimeableScreen = i;
        int i8 = (i6 ^ 87) + ((i6 & 87) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public void setMiscleanousTime(int i) {
        int i2 = 2 % 2;
        int i3 = a + 89;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.miscleanousTime = i;
        int i6 = (-2) - ((i4 + 102) ^ (-1));
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setRosterTime(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 20) + ((i3 & 20) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.rosterTime = i;
        if (i6 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i3 & 107;
        int i8 = i7 + ((i3 ^ 107) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
