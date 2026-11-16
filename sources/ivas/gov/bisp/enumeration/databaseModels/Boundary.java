package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Boundary extends SugarRecord {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("coord_order")
    private String coordOrder;

    @o0OO00O("latitude")
    private String latitude;

    @o0OO00O("longitude")
    private String longitude;

    @o0OO00O("tag")
    private String tag;

    @o0OO00O("village_id")
    private String villageId;

    public String getCoordOrder() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 37;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.coordOrder;
        int i4 = ((((i2 ^ 11) | (i2 & 11)) << 1) - (~(-(((~i2) & 11) | (i2 & (-12)))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public String getLatitude() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 62) + ((i2 & 62) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.latitude;
        int i5 = i2 | 37;
        int i6 = i5 << 1;
        int i7 = -((~(i2 & 37)) & i5);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getLongitude() {
        int i = 2 % 2;
        int i2 = a + 78;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.longitude;
        }
        throw null;
    }

    public String getTag() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 15;
        int i4 = (i3 << 1) - ((~(i2 & 15)) & i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        String str = this.tag;
        int i7 = i5 & 11;
        int i8 = (i5 ^ 11) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getVillageId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-64)) | ((~i2) & 63);
        int i4 = -(-((i2 & 63) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this.villageId;
        }
        throw null;
    }

    public void setCoordOrder(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 57) + (i2 | 57);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.coordOrder = str;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLatitude(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 104) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        this.latitude = str;
        int i5 = (((i2 ^ 97) | (i2 & 97)) << 1) - (((~i2) & 97) | (i2 & (-98)));
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
    }

    public void setLongitude(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 73) + ((i2 & 73) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.longitude = str;
        int i5 = i2 & 41;
        int i6 = (i2 ^ 41) | i5;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setTag(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 125) << 1) - (i2 ^ 125);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.tag = str;
        } else {
            this.tag = str;
            int i4 = 92 / 0;
        }
    }

    public void setVillageId(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.villageId = str;
        int i6 = (((i4 | 34) << 1) - (i4 ^ 34)) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 23 / 0;
        }
    }
}
