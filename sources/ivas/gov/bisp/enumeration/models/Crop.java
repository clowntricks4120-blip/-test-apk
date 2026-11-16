package ivas.gov.bisp.enumeration.models;

import java.io.Serializable;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Crop implements Serializable {
    private static int a = 1;
    private static int b;
    private int cropId;
    private int isSelected;
    private String landMeasure;
    private int landUnitId;
    private int landUnitPosition;
    private String name;

    public Crop(String str, int i, int i2, int i3, int i4, String str2) {
        this.name = str;
        this.cropId = i;
        this.isSelected = i2;
        this.landUnitPosition = i3;
        this.landUnitId = i4;
        this.landMeasure = str2;
    }

    private void setEmptyValues() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = ((i2 | 49) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        setName(BuildConfig.FLAVOR);
        setLandUnitPosition(0);
        setCropId(0);
        int i6 = a;
        int i7 = i6 & 123;
        int i8 = ((((i6 ^ 123) | i7) << 1) - (~(-((i6 | 123) & (~i7))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        setIsSelected(0);
        setLandMeasure(BuildConfig.FLAVOR);
        setLandUnitId(0);
        int i10 = b + 35;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 17 / 0;
        }
    }

    public int getCropId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 29;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.cropId;
        int i6 = (i2 & (-12)) | ((~i2) & 11);
        int i7 = -(-((i2 & 11) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return i5;
    }

    public int getIsSelected() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = (i2 ^ 9) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.isSelected;
        int i8 = (i2 & 26) + (i2 | 26);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public JSONObject getJson() throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        String str = this.name;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = -(-((i2 ^ 115) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        jSONObject.put("crop_name", str);
        jSONObject.put("crop_id", this.cropId);
        int i7 = a;
        int i8 = (i7 & 91) + (i7 | 91);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            jSONObject.put("land_unit_id", this.landUnitId);
            int i9 = 30 / 0;
        } else {
            jSONObject.put("land_unit_id", this.landUnitId);
        }
        int i10 = b;
        int i11 = (-2) - (((i10 & 38) + (i10 | 38)) ^ (-1));
        a = i11 % 128;
        int i12 = i11 % 2;
        jSONObject.put("land_unit_number", this.landMeasure);
        int i13 = b + 113;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 44 / 0;
        }
        return jSONObject;
    }

    public String getLandMeasure() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.landMeasure;
        int i5 = ((i4 & 40) + (i4 | 40)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int getLandUnitId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-12)) | ((~i2) & 11)) - (~(-(-((i2 & 11) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.landUnitId;
        int i6 = (-2) - (((i2 & 80) + (i2 | 80)) ^ (-1));
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getLandUnitPosition() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-22)) | ((~i2) & 21);
        int i4 = -(-((i2 & 21) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i7 = this.landUnitPosition;
        int i8 = i6 & 25;
        int i9 = (i6 ^ 25) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return i7;
        }
        throw null;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = ((~i3) & (i2 | 107)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.name;
        if (i5 != 0) {
            int i6 = 84 / 0;
        }
        int i7 = ((i2 | 63) << 1) - (i2 ^ 63);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 50 / 0;
        }
        return str;
    }

    public void setCropId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 33;
        int i5 = i4 + ((i3 ^ 33) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.cropId = i;
        if (i6 == 0) {
            int i7 = 17 / 0;
        }
        int i8 = (i3 & 61) + (i3 | 61);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setIsSelected(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-62)) | ((~i3) & 61);
        int i5 = (i3 & 61) << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.isSelected = i;
        int i8 = i3 & 31;
        int i9 = (i8 - (~(-(-((i3 ^ 31) | i8))))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setLandMeasure(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 13;
        int i4 = ((i2 & 13) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        this.landMeasure = str;
        int i9 = (i7 & 41) + (i7 | 41);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 79 / 0;
        }
    }

    public void setLandUnitId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 23;
        int i5 = (i4 - (~((i3 ^ 23) | i4))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        this.landUnitId = i;
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLandUnitPosition(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 69;
        int i5 = (i3 & 69) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.landUnitPosition = i;
        int i9 = i7 | 67;
        int i10 = i9 << 1;
        int i11 = -(i9 & (~(i7 & 67)));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 37 / 0;
        }
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-26)) | ((~i2) & 25);
        int i4 = -(-((i2 & 25) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.name = str;
        if (i6 == 0) {
            throw null;
        }
    }

    public Crop(String str, int i) {
        this.name = str;
        this.cropId = i;
    }
}
