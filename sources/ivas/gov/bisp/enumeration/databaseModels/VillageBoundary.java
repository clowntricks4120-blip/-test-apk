package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class VillageBoundary extends SugarRecord {
    private static int a = 1;
    private static int b;

    @o0OO00O("coord_order")
    private String coordOrder;

    @o0OO00O("latitude")
    private String latitude;

    @o0OO00O("longitude")
    private String longitude;

    @o0OO00O("village_id")
    private String villageID;

    public String getCoordOrder() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 42) + (i2 | 42)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.coordOrder;
        int i5 = i2 & 5;
        int i6 = (i5 - (~((i2 ^ 5) | i5))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
        return str;
    }

    public String getLatitude() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 78) + (i2 | 78)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.latitude;
        int i6 = i4 & 99;
        int i7 = (i4 ^ 99) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getLongitude() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 110) << 1) - (i2 ^ 110)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.longitude;
        }
        throw null;
    }

    public String getVillageID() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 79) + (i2 | 79);
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.villageID;
        if (i4 != 0) {
            int i5 = 79 / 0;
        }
        return str;
    }

    public void setCoordOrder(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 125) + (i2 | 125);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.coordOrder = str;
        int i5 = i2 & 27;
        int i6 = (i5 - (~((i2 ^ 27) | i5))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setLatitude(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 117;
        int i4 = ((i2 & 117) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.latitude = str;
        if (i7 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLongitude(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 73) | (i2 & 73)) << 1;
        int i4 = -(((~i2) & 73) | (i2 & (-74)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.longitude = str;
        int i8 = i6 & 35;
        int i9 = (((i6 | 35) & (~i8)) - (~(-(-(i8 << 1))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setVillageID(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = (i3 - (~((i2 ^ 49) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.villageID = str;
        if (i5 == 0) {
            int i6 = 46 / 0;
        }
        int i7 = (i2 & 5) + (i2 | 5);
        a = i7 % 128;
        int i8 = i7 % 2;
    }
}
