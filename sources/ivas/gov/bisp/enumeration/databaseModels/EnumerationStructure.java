package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import ivas.gov.bisp.enumeration.p026az.t;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class EnumerationStructure extends SugarRecord implements t {
    private static int a = 1;
    private static int b;

    @o0OO00O("distance")
    private String distance;

    @o0OO00O("is_gps_bound")
    private String isGpsBound;

    @o0OO00O("latitude")
    private String latitude;

    @o0OO00O("listing_id")
    private String listingId;

    @o0OO00O("longitude")
    private String longitude;

    @o0OO00O("structure_number")
    private String structureNumber;

    @o0OO00O("village_id")
    private String villageId;

    public String getDistance() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = (i3 - (~((i2 ^ 107) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.distance;
        int i6 = i2 + 7;
        b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    @Override // ivas.gov.bisp.enumeration.p026az.t
    public String getDropDownViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (i2 | 51) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        String structureNumber = getStructureNumber();
        int i8 = a;
        int i9 = i8 & 111;
        int i10 = i9 + ((i8 ^ 111) | i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 12 / 0;
        }
        return structureNumber;
    }

    public String getIsGpsBound() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 64) + (i2 | 64)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.isGpsBound;
        int i6 = i4 & 111;
        int i7 = i4 | 111;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 39 / 0;
        }
        return str;
    }

    public String getLatitude() {
        int i = 2 % 2;
        int i2 = b + 41;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.latitude;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getListingId() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 20) + (i2 | 20)) - 1;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            str = this.listingId;
            int i5 = 17 / 0;
        } else {
            str = this.listingId;
        }
        int i6 = i4 ^ 117;
        int i7 = -(-((i4 & 117) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getLongitude() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = -(-((i2 ^ 11) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.longitude;
        int i7 = i2 + 101;
        a = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public String getStructureNumber() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 124) + ((i2 & 124) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.structureNumber;
        }
        int i4 = 93 / 0;
        return this.structureNumber;
    }

    public String getViewLabel() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 33) + (i2 | 33);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return getStructureNumber();
        }
        getStructureNumber();
        throw null;
    }

    public String getVillageId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 11) + (i2 | 11);
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.villageId;
        int i5 = i2 | 83;
        int i6 = ((i5 << 1) - (~(-((~(i2 & 83)) & i5)))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
        a = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 & 7;
        int i5 = i4 + ((i2 ^ 7) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setDistance(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-42)) | ((~i2) & 41);
        int i4 = -(-((i2 & 41) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.distance = str;
        if (i7 != 0) {
            int i8 = 19 / 0;
        }
        int i9 = (i6 ^ 81) + ((i6 & 81) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setIsGpsBound(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.isGpsBound = str;
        if (i5 != 0) {
            throw null;
        }
        int i6 = (i4 | 3) << 1;
        int i7 = -(((~i4) & 3) | (i4 & (-4)));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setLatitude(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 33) << 1;
        int i4 = -(((~i2) & 33) | (i2 & (-34)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.latitude = str;
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setListingId(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 4) << 1) - (i2 ^ 4)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.listingId = str;
        int i5 = i2 + 23;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
    }

    public void setLongitude(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 84) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        this.longitude = str;
        if (i4 == 0) {
            int i5 = 87 / 0;
        }
        int i6 = ((i2 | 51) << 1) - (i2 ^ 51);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setStructureNumber(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-8)) | ((~i2) & 7)) - (~((i2 & 7) << 1))) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.structureNumber = str;
        if (i5 == 0) {
            int i6 = 62 / 0;
        }
        int i7 = ((i4 ^ 125) | (i4 & 125)) << 1;
        int i8 = -(((~i4) & 125) | (i4 & (-126)));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public void setVillageId(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = i3 + ((i2 ^ 67) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.villageId = str;
        if (i5 != 0) {
            throw null;
        }
    }
}
