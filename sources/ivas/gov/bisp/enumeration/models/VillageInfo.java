package ivas.gov.bisp.enumeration.models;

import com.orm.SugarRecord;
import com.orm.annotation.Unique;
import ivas.gov.bisp.enumeration.p026az.t;

/* JADX INFO: loaded from: classes.dex */
public class VillageInfo extends SugarRecord implements t {
    private static int a = 1;
    private static int b;

    @Unique
    private int villageId;
    private String villageName;

    public VillageInfo() {
    }

    @Override // ivas.gov.bisp.enumeration.p026az.t
    public String getDropDownViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 53) + (i2 | 53);
        b = i3 % 128;
        int i4 = i3 % 2;
        String villageName = getVillageName();
        int i5 = a;
        int i6 = (i5 & 69) + (i5 | 69);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return villageName;
        }
        throw null;
    }

    public String getViewLabel() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-38)) | ((~i2) & 37);
        int i4 = (i2 & 37) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            getVillageName();
            throw null;
        }
        String villageName = getVillageName();
        int i6 = b + 43;
        a = i6 % 128;
        int i7 = i6 % 2;
        return villageName;
    }

    public int getVillageId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 125;
        int i4 = -(-((i2 ^ 125) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.villageId;
        int i8 = ((((i2 ^ 91) | (i2 & 91)) << 1) - (~(-(((~i2) & 91) | (i2 & (-92)))))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getVillageName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = ((~i3) & (i2 | 101)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.villageName;
        int i6 = (i2 & 99) + (i2 | 99);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 47) << 1) - (i2 ^ 47);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = (i4 & 71) + (i4 | 71);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
        return false;
    }

    public void setVillageId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 31;
        int i5 = i3 | 31;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        this.villageId = i;
        if (i8 == 0) {
            int i9 = 24 / 0;
        }
        int i10 = ((i7 & (-62)) | ((~i7) & 61)) + ((i7 & 61) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public void setVillageName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 56) + (i2 | 56)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.villageName = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 & 117;
        int i6 = (i2 ^ 117) | i5;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 96 / 0;
        }
    }

    public VillageInfo(int i, String str) {
        this.villageId = i;
        this.villageName = str;
    }
}
