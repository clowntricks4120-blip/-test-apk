package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class VillageExemption {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("enumerator_id")
    private int enumeratorID;

    @o0OO00O("supervisor_id")
    private int supervisorID;

    @o0OO00O("village_id")
    private int villageID;

    public int getEnumeratorID() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 37) | (i2 & 37)) << 1) - (~(-((i2 & (-38)) | ((~i2) & 37))))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.enumeratorID;
        int i5 = ((i2 ^ 87) - (~(-(-((i2 & 87) << 1))))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public int getSupervisorID() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 85) << 1) - (~(-(i2 ^ 85)))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.supervisorID;
        int i6 = i2 + 40;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 66 / 0;
        }
        return i5;
    }

    public int getVillageID() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 93) + (i3 | 93);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            i = this.villageID;
            int i6 = 68 / 0;
        } else {
            i = this.villageID;
        }
        int i7 = i5 ^ 71;
        int i8 = (((i5 & 71) | i7) << 1) - i7;
        b = i8 % 128;
        int i9 = i8 % 2;
        return i;
    }

    public void setEnumeratorID(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 39;
        int i5 = (((~i4) & (i3 | 39)) - (~(i4 << 1))) - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.enumeratorID = i;
            int i6 = 7 / 0;
        } else {
            this.enumeratorID = i;
        }
        int i7 = i3 + 103;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 88 / 0;
        }
    }

    public void setSupervisorID(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 97;
        int i5 = (i4 - (~((i3 ^ 97) | i4))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        this.supervisorID = i;
        int i7 = i3 & 117;
        int i8 = (((i3 ^ 117) | i7) << 1) - ((i3 | 117) & (~i7));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setVillageID(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 99) | (i3 & 99)) << 1;
        int i5 = -((i3 & (-100)) | ((~i3) & 99));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.villageID = i;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.villageID = i;
        int i7 = ((i3 ^ 80) + ((i3 & 80) << 1)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
    }
}
