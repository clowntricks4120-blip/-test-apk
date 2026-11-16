package ivas.gov.bisp.enumeration.models;

import java.io.Serializable;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AgricultureDetail implements Serializable {
    private static int a = 1;
    private static int b;
    private String agriType;
    private int agriTypePosition;
    private ArrayList<AgriResource> cropResource;
    private ArrayList<Crop> khareefCrop;
    private String landNumber;
    private String landUnit;
    private int landUnitId;
    private int landUnitPosition;
    private String ownerMobile;
    private String ownerName;
    private ArrayList<Crop> rabiCrop;
    private ArrayList<AgriResource> waterResource;

    public AgricultureDetail() {
        setEmptyValues();
    }

    public String encryptOwnerMobile() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 69) + ((i2 & 69) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.ownerMobile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String encryptOwnerName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 109;
        int i4 = (i2 ^ 109) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ownerName;
        int i6 = ((i2 ^ 85) | (i2 & 85)) << 1;
        int i7 = -(((~i2) & 85) | (i2 & (-86)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getAgriType() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 2;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.agriType;
        int i5 = ((i2 | 7) << 1) - (i2 ^ 7);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public int getAgriTypePosition() {
        int i = 2 % 2;
        int i2 = b + 11;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.agriTypePosition;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ArrayList<AgriResource> getCropResource() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-96)) | ((~i2) & 95)) + ((i2 & 95) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        ArrayList<AgriResource> arrayList = this.cropResource;
        int i6 = ((i4 & (-114)) | ((~i4) & 113)) + ((i4 & 113) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public ArrayList<Crop> getKhareefCrop() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 116) + ((i2 & 116) << 1)) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        ArrayList<Crop> arrayList = this.khareefCrop;
        int i6 = (i4 & 61) + (i4 | 61);
        b = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public String getLandNumber() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 20) + ((i2 & 20) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return this.landNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getLandUnit() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 55;
        int i4 = (i2 & 55) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this.landUnit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getLandUnitId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 5;
        int i4 = ((i2 & 5) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return this.landUnitId;
        }
        throw null;
    }

    public int getLandUnitPosition() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = (~i3) & (i2 | 115);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.landUnitPosition;
        int i9 = i2 + 46;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 86 / 0;
        }
        return i8;
    }

    public String getOwnerMobile() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = (((i2 ^ 77) | i3) << 1) - ((i2 | 77) & (~i3));
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.ownerMobile;
        int i6 = i5 ^ 91;
        int i7 = (i5 & 91) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public String getOwnerName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = -(-((i2 ^ 5) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        String str = this.ownerName;
        int i7 = (i2 & (-36)) | ((~i2) & 35);
        int i8 = -(-((i2 & 35) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    public ArrayList<Crop> getRabiCrop() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 39) << 1) - (i2 ^ 39);
        a = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<Crop> arrayList = this.rabiCrop;
        int i5 = i2 & 97;
        int i6 = (i2 | 97) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return arrayList;
    }

    public ArrayList<AgriResource> getWaterResource() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = (i2 ^ 45) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        ArrayList<AgriResource> arrayList = this.waterResource;
        int i7 = i2 & 123;
        int i8 = i2 | 123;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return arrayList;
    }

    public void setAgriType(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = ((i2 ^ 15) | i3) << 1;
        int i5 = -((i2 | 15) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.agriType = str;
        if (i7 == 0) {
            throw null;
        }
    }

    public void setAgriTypePosition(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 120;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.agriTypePosition = i;
        if (i6 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i3 & 13;
        int i8 = i7 + ((i3 ^ 13) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setCropResource(ArrayList<AgriResource> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 73) + (i2 | 73);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.cropResource = arrayList;
        if (i5 == 0) {
            throw null;
        }
        int i6 = ((i4 | 121) << 1) - (i4 ^ 121);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setKhareefCrop(ArrayList<Crop> arrayList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 71;
        int i4 = ((((i2 & 71) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.khareefCrop = arrayList;
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLandNumber(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 81;
        int i4 = ((i2 & 81) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.landNumber = str;
        } else {
            this.landNumber = str;
            throw null;
        }
    }

    public void setLandUnit(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 13;
        int i4 = (i2 ^ 13) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.landUnit = str;
        if (i6 != 0) {
            throw null;
        }
        int i7 = ((i2 ^ 81) - (~(-(-((i2 & 81) << 1))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setLandUnitId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 65) | (i3 & 65)) << 1;
        int i5 = -(((~i3) & 65) | (i3 & (-66)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        this.landUnitId = i;
        int i9 = i7 & 71;
        int i10 = (i9 - (~((i7 ^ 71) | i9))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public void setLandUnitPosition(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 9) + ((i3 & 9) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.landUnitPosition = i;
        int i6 = ((i3 | 89) << 1) - (i3 ^ 89);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setOwnerMobile(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = -(-(i2 | 19));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.ownerMobile = str;
        int i7 = ((i2 ^ 15) | (i2 & 15)) << 1;
        int i8 = -(((~i2) & 15) | (i2 & (-16)));
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOwnerName(String str) {
        int i = 2 % 2;
        int i2 = b + 31;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        this.ownerName = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = (i3 ^ 103) + ((i3 & 103) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setRabiCrop(ArrayList<Crop> arrayList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (i2 ^ 47) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.rabiCrop = arrayList;
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setWaterResource(ArrayList<AgriResource> arrayList) {
        int i = 2 % 2;
        int i2 = a + 91;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            this.waterResource = arrayList;
            throw null;
        }
        this.waterResource = arrayList;
        int i4 = i3 & 5;
        int i5 = (((i3 ^ 5) | i4) << 1) - ((~i4) & (i3 | 5));
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public JSONObject getJson() throws JSONException {
        Object obj;
        AgriResource agriResource;
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = this.agriType;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = (((i2 ^ 3) | i3) << 1) - ((i2 | 3) & (~i3));
        a = i4 % 128;
        Object obj3 = null;
        if (i4 % 2 == 0) {
            jSONObject.put("agri_type", obj2);
            jSONObject.put("owner_name", encryptOwnerName());
            obj3.hashCode();
            throw null;
        }
        jSONObject.put("agri_type", obj2);
        jSONObject.put("owner_name", encryptOwnerName());
        int i5 = a;
        int i6 = (i5 & 101) + (i5 | 101);
        b = i6 % 128;
        int i7 = i6 % 2;
        jSONObject.put("owner_mobile", encryptOwnerMobile());
        int i8 = a;
        int i9 = i8 & 113;
        int i10 = i9 + ((i8 ^ 113) | i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObject.put("land_unit_id", this.landUnitId);
            obj = this.landNumber;
            int i11 = 86 / 0;
        } else {
            jSONObject.put("land_unit_id", this.landUnitId);
            obj = this.landNumber;
        }
        jSONObject.put("land_unit_number", obj);
        JSONArray jSONArray = new JSONArray();
        int i12 = a;
        int i13 = i12 ^ 97;
        int i14 = (i12 & 97) << 1;
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < this.rabiCrop.size()) {
            int i18 = a + 67;
            b = i18 % 128;
            if (i18 % 2 != 0) {
                this.rabiCrop.get(i17).getIsSelected();
                obj3.hashCode();
                throw null;
            }
            if (this.rabiCrop.get(i17).getIsSelected() == 1) {
                int i19 = b;
                int i20 = ((i19 | 108) << 1) - (i19 ^ 108);
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                a = i21 % 128;
                int i22 = i21 % 2;
                Crop crop = this.rabiCrop.get(i17);
                int i23 = a;
                int i24 = (-2) - (((i23 ^ 56) + ((i23 & 56) << 1)) ^ (-1));
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    jSONArray.put(crop.getJson());
                    int i25 = 32 / 0;
                } else {
                    jSONArray.put(crop.getJson());
                }
                int i26 = a + 15;
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 4 % 2;
                }
            }
            int i28 = i17 & 1;
            int i29 = -(-((i17 ^ 1) | i28));
            i17 = (i29 | i28) + (i28 & i29);
            int i30 = a;
            int i31 = i30 & 99;
            int i32 = -(-((i30 ^ 99) | i31));
            int i33 = (i31 & i32) + (i32 | i31);
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        jSONObject.put("rabi_crop", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        int i35 = b;
        int i36 = (-2) - ((((i35 | 46) << 1) - (i35 ^ 46)) ^ (-1));
        a = i36 % 128;
        int i37 = i36 % 2;
        int i38 = (i35 & (-56)) | ((~i35) & 55);
        int i39 = -(-((i35 & 55) << 1));
        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
        a = i40 % 128;
        int i41 = i40 % 2;
        int i42 = 0;
        while (i42 < this.khareefCrop.size()) {
            int i43 = b;
            int i44 = i43 & 121;
            int i45 = ((i43 | 121) & (~i44)) + (i44 << 1);
            a = i45 % 128;
            int i46 = i45 % 2;
            Crop crop2 = this.khareefCrop.get(i42);
            int i47 = a;
            int i48 = (i47 & (-6)) | ((~i47) & 5);
            int i49 = -(-((i47 & 5) << 1));
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            b = i50 % 128;
            int i51 = i50 % 2;
            if (crop2.getIsSelected() == 1) {
                int i52 = a;
                int i53 = i52 & 13;
                int i54 = ((((i52 ^ 13) | i53) << 1) - (~(-((i52 | 13) & (~i53))))) - 1;
                b = i54 % 128;
                if (i54 % 2 != 0) {
                    this.khareefCrop.get(i42).getJson();
                    throw null;
                }
                jSONArray2.put(this.khareefCrop.get(i42).getJson());
                int i55 = a;
                int i56 = i55 & 69;
                int i57 = (i55 | 69) & (~i56);
                int i58 = i56 << 1;
                int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
                b = i59 % 128;
                int i60 = i59 % 2;
            }
            int i61 = i42 & (-62);
            int i62 = -(-((i42 ^ (-62)) | i61));
            int i63 = (i61 & i62) + (i62 | i61);
            int i64 = i63 ^ 63;
            int i65 = -(-((i63 & 63) << 1));
            i42 = ((i64 | i65) << 1) - (i64 ^ i65);
            int i66 = b;
            int i67 = (i66 & (-48)) | ((~i66) & 47);
            int i68 = (i66 & 47) << 1;
            int i69 = (i67 & i68) + (i68 | i67);
            a = i69 % 128;
            int i70 = i69 % 2;
        }
        jSONObject.put("khareef_crop", jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        int i71 = b;
        int i72 = ((i71 ^ 24) + ((i71 & 24) << 1)) - 1;
        a = i72 % 128;
        int i73 = i72 % 2 == 0 ? 1 : 0;
        while (i73 < this.waterResource.size()) {
            int i74 = a;
            int i75 = i74 | 67;
            int i76 = i75 << 1;
            int i77 = -((~(i74 & 67)) & i75);
            int i78 = (i76 & i77) + (i77 | i76);
            b = i78 % 128;
            int i79 = i78 % 2;
            if (this.waterResource.get(i73).getIsSelected() == 1) {
                int i80 = b;
                int i81 = i80 & 23;
                int i82 = ((i80 | 23) & (~i81)) + (i81 << 1);
                a = i82 % 128;
                int i83 = i82 % 2;
                String name = this.waterResource.get(i73).getName();
                int i84 = b;
                int i85 = (i84 ^ 59) + ((i84 & 59) << 1);
                a = i85 % 128;
                int i86 = i85 % 2;
                jSONArray3.put(name);
                int i87 = b;
                int i88 = (i87 & (-88)) | ((~i87) & 87);
                int i89 = (i87 & 87) << 1;
                int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                a = i90 % 128;
                int i91 = i90 % 2;
            }
            i73++;
            int i92 = b;
            int i93 = i92 & 51;
            int i94 = (i92 ^ 51) | i93;
            int i95 = (i93 & i94) + (i94 | i93);
            a = i95 % 128;
            int i96 = i95 % 2;
        }
        jSONObject.put("water_source", jSONArray3);
        JSONArray jSONArray4 = new JSONArray();
        int i97 = a;
        int i98 = (i97 | 119) << 1;
        int i99 = -(((~i97) & 119) | (i97 & (-120)));
        int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
        int i101 = i100 % 128;
        b = i101;
        int i102 = i100 % 2;
        int i103 = (i101 | 91) << 1;
        int i104 = -(i101 ^ 91);
        int i105 = (i103 ^ i104) + ((i104 & i103) << 1);
        a = i105 % 128;
        int i106 = i105 % 2;
        int i107 = 0;
        while (i107 < this.cropResource.size()) {
            JSONObject jSONObject2 = new JSONObject();
            ArrayList<AgriResource> arrayList = this.cropResource;
            int i108 = b;
            int i109 = i108 & 57;
            int i110 = ((((i108 ^ 57) | i109) << 1) - (~(-((i108 | 57) & (~i109))))) - 1;
            a = i110 % 128;
            int i111 = i110 % 2;
            if (arrayList.get(i107).getIsSelected() == 1) {
                int i112 = b;
                int i113 = ((i112 ^ 81) | (i112 & 81)) << 1;
                int i114 = -(((~i112) & 81) | (i112 & (-82)));
                int i115 = (i113 & i114) + (i114 | i113);
                a = i115 % 128;
                int i116 = i115 % 2;
                String name2 = this.cropResource.get(i107).getName();
                int i117 = b;
                int i118 = i117 & 13;
                int i119 = (i117 ^ 13) | i118;
                int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                a = i120 % 128;
                if (i120 % 2 == 0) {
                    jSONObject2.put("crop_machinary_name", name2);
                    agriResource = this.cropResource.get(i107);
                    int i121 = 44 / 0;
                } else {
                    jSONObject2.put("crop_machinary_name", name2);
                    agriResource = this.cropResource.get(i107);
                }
                jSONObject2.put("crop_machinary_owner", agriResource.getResourceName());
                jSONArray4.put(jSONObject2);
                int i122 = a;
                int i123 = i122 & 31;
                int i124 = i123 + ((i122 ^ 31) | i123);
                b = i124 % 128;
                if (i124 % 2 != 0) {
                    int i125 = 54 / 0;
                }
                int i126 = i122 & 69;
                int i127 = (i122 ^ 69) | i126;
                int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                b = i128 % 128;
                int i129 = i128 % 2;
            }
            int i130 = (i107 & 82) + (i107 | 82);
            i107 = ((i130 & (-81)) - (~(-(-(i130 | (-81)))))) - 1;
            int i131 = a;
            int i132 = (i131 ^ 79) + ((i131 & 79) << 1);
            b = i132 % 128;
            int i133 = i132 % 2;
        }
        jSONObject.put("crop_machinary", jSONArray4);
        int i134 = a;
        int i135 = (i134 ^ 93) + ((i134 & 93) << 1);
        b = i135 % 128;
        int i136 = i135 % 2;
        return jSONObject;
    }

    private void setEmptyValues() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            setAgriType(BuildConfig.FLAVOR);
            setAgriTypePosition(1);
        } else {
            setAgriType(BuildConfig.FLAVOR);
            setAgriTypePosition(0);
        }
        setOwnerName(BuildConfig.FLAVOR);
        setOwnerMobile(BuildConfig.FLAVOR);
        setLandUnit(BuildConfig.FLAVOR);
        setLandUnitPosition(0);
        setLandUnitId(0);
        setLandNumber(BuildConfig.FLAVOR);
        setKhareefCrop(new ArrayList<>());
        setRabiCrop(new ArrayList<>());
        setCropResource(new ArrayList<>());
        setWaterResource(new ArrayList<>());
        int i4 = b;
        int i5 = ((i4 | 105) << 1) - (i4 ^ 105);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x0163  */
    /* JADX WARN: Code duplicated, block: B:34:0x0178  */
    /* JADX WARN: Code duplicated, block: B:35:0x0188  */
    /* JADX WARN: Code duplicated, block: B:48:0x0233  */
    public JSONObject getDecryptedJson() throws JSONException {
        Crop crop;
        int i;
        JSONObject json;
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Object obj = this.agriType;
        int i3 = a + 3;
        b = i3 % 128;
        int i4 = i3 % 2;
        jSONObject.put("agri_type", obj);
        jSONObject.put("owner_name", this.ownerName);
        int i5 = a;
        int i6 = i5 & 101;
        int i7 = (i6 - (~(-(-((i5 ^ 101) | i6))))) - 1;
        b = i7 % 128;
        Object obj2 = null;
        if (i7 % 2 != 0) {
            jSONObject.put("owner_mobile", this.ownerMobile);
            throw null;
        }
        jSONObject.put("owner_mobile", this.ownerMobile);
        jSONObject.put("land_unit_id", this.landUnitId);
        jSONObject.put("land_unit_number", this.landNumber);
        JSONArray jSONArray = new JSONArray();
        int i8 = a + 57;
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.rabiCrop.size()) {
            int i12 = b;
            int i13 = (-2) - ((((i12 | 92) << 1) - (i12 ^ 92)) ^ (-1));
            a = i13 % 128;
            if (i13 % 2 == 0) {
                this.rabiCrop.get(i11).getIsSelected();
                throw null;
            }
            int isSelected = this.rabiCrop.get(i11).getIsSelected();
            int i14 = a;
            int i15 = ((i14 ^ 77) | (i14 & 77)) << 1;
            int i16 = -(((~i14) & 77) | (i14 & (-78)));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                if (isSelected == 1) {
                    JSONObject json2 = this.rabiCrop.get(i11).getJson();
                    int i18 = a;
                    int i19 = i18 ^ 117;
                    int i20 = (((i18 & 117) | i19) << 1) - i19;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    jSONArray.put(json2);
                    int i22 = b;
                    int i23 = i22 & 9;
                    int i24 = ((i22 | 9) & (~i23)) + (i23 << 1);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                }
            } else if (isSelected == 1) {
                JSONObject json3 = this.rabiCrop.get(i11).getJson();
                int i110 = a;
                int i111 = i110 ^ 117;
                int i26 = (((i110 & 117) | i111) << 1) - i111;
                b = i26 % 128;
                int i27 = i26 % 2;
                jSONArray.put(json3);
                int i28 = b;
                int i29 = i28 & 9;
                int i210 = ((i28 | 9) & (~i29)) + (i29 << 1);
                a = i210 % 128;
                int i211 = i210 % 2;
            }
            i11++;
            int i30 = a;
            int i31 = i30 & 19;
            int i32 = i31 + ((i30 ^ 19) | i31);
            b = i32 % 128;
            int i33 = i32 % 2;
        }
        jSONObject.put("rabi_crop", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        int i34 = a;
        int i35 = i34 ^ 75;
        int i36 = ((i34 & 75) | i35) << 1;
        int i37 = -i35;
        int i38 = (i36 & i37) + (i37 | i36);
        b = i38 % 128;
        int i39 = i38 % 2;
        int i40 = i34 & 7;
        int i41 = ((i34 ^ 7) | i40) << 1;
        int i42 = -((i34 | 7) & (~i40));
        int i43 = (i41 & i42) + (i42 | i41);
        b = i43 % 128;
        int i44 = i43 % 2;
        int i45 = 0;
        while (i45 < this.khareefCrop.size()) {
            int i46 = b;
            int i47 = (((i46 | 8) << 1) - (i46 ^ 8)) - 1;
            a = i47 % 128;
            if (i47 % 2 == 0) {
                crop = this.khareefCrop.get(i45);
                int i48 = 70 / 0;
            } else {
                crop = this.khareefCrop.get(i45);
            }
            int i49 = a + 30;
            int i50 = (i49 ^ (-1)) + (i49 << 1);
            b = i50 % 128;
            if (i50 % 2 != 0) {
                if (crop.getIsSelected() == 0) {
                    int i51 = b;
                    int i52 = i51 & 85;
                    int i53 = -(-((i51 ^ 85) | i52));
                    i = ((i52 | i53) << 1) - (i53 ^ i52);
                    a = i % 128;
                    if (i % 2 == 0) {
                        json = this.khareefCrop.get(i45).getJson();
                        int i54 = 82 / 0;
                    } else {
                        json = this.khareefCrop.get(i45).getJson();
                    }
                    int i55 = a;
                    int i56 = i55 | 53;
                    int i57 = i56 << 1;
                    int i58 = -((~(i55 & 53)) & i56);
                    int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                    b = i59 % 128;
                    int i60 = i59 % 2;
                    jSONArray2.put(json);
                    int i61 = a;
                    int i62 = i61 & 75;
                    int i63 = ((i61 ^ 75) | i62) << 1;
                    int i64 = -((i61 | 75) & (~i62));
                    int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                    b = i65 % 128;
                    int i66 = i65 % 2;
                }
            } else if (crop.getIsSelected() == 1) {
                int i510 = b;
                int i511 = i510 & 85;
                int i512 = -(-((i510 ^ 85) | i511));
                i = ((i511 | i512) << 1) - (i512 ^ i511);
                a = i % 128;
                if (i % 2 == 0) {
                    json = this.khareefCrop.get(i45).getJson();
                    int i513 = 82 / 0;
                } else {
                    json = this.khareefCrop.get(i45).getJson();
                }
                int i514 = a;
                int i515 = i514 | 53;
                int i516 = i515 << 1;
                int i517 = -((~(i514 & 53)) & i515);
                int i518 = ((i516 | i517) << 1) - (i517 ^ i516);
                b = i518 % 128;
                int i67 = i518 % 2;
                jSONArray2.put(json);
                int i68 = a;
                int i69 = i68 & 75;
                int i610 = ((i68 ^ 75) | i69) << 1;
                int i611 = -((i68 | 75) & (~i69));
                int i612 = (i610 ^ i611) + ((i611 & i610) << 1);
                b = i612 % 128;
                int i613 = i612 % 2;
            }
            int i70 = (i45 & 114) | ((~i45) & (-115));
            int i71 = -(-((i45 & (-115)) << 1));
            int i72 = (i70 & i71) + (i71 | i70);
            int i73 = i72 & 116;
            int i74 = (i72 ^ 116) | i73;
            i45 = ((i73 | i74) << 1) - (i73 ^ i74);
            int i75 = a + 77;
            b = i75 % 128;
            int i76 = i75 % 2;
        }
        jSONObject.put("khareef_crop", jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        int i77 = b;
        int i78 = i77 & 27;
        int i79 = i77 | 27;
        int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
        a = i80 % 128;
        int i81 = i80 % 2;
        int i82 = 0;
        while (i82 < this.waterResource.size()) {
            int i83 = a + 41;
            b = i83 % 128;
            if (i83 % 2 != 0) {
                if (this.waterResource.get(i82).getIsSelected() == 0) {
                    AgriResource agriResource = this.waterResource.get(i82);
                    int i84 = a;
                    int i85 = (i84 & 123) + (i84 | 123);
                    b = i85 % 128;
                    int i86 = i85 % 2;
                    jSONArray3.put(agriResource.getName());
                    int i87 = a;
                    int i88 = ((i87 & 18) + (i87 | 18)) - 1;
                    b = i88 % 128;
                    int i89 = i88 % 2;
                }
            } else if (this.waterResource.get(i82).getIsSelected() == 1) {
                AgriResource agriResource2 = this.waterResource.get(i82);
                int i810 = a;
                int i811 = (i810 & 123) + (i810 | 123);
                b = i811 % 128;
                int i812 = i811 % 2;
                jSONArray3.put(agriResource2.getName());
                int i813 = a;
                int i814 = ((i813 & 18) + (i813 | 18)) - 1;
                b = i814 % 128;
                int i815 = i814 % 2;
            }
            int i90 = i82 ^ 1;
            int i91 = ((i82 & 1) | i90) << 1;
            int i92 = -i90;
            i82 = (i91 | i92) + (i91 & i92);
            int i93 = a;
            int i94 = i93 & 19;
            int i95 = -(-((i93 ^ 19) | i94));
            int i96 = (i94 & i95) + (i95 | i94);
            b = i96 % 128;
            int i97 = i96 % 2;
        }
        jSONObject.put("water_source", jSONArray3);
        JSONArray jSONArray4 = new JSONArray();
        int i98 = a;
        int i99 = i98 & 89;
        int i100 = i99 + ((i98 ^ 89) | i99);
        b = i100 % 128;
        int i101 = i100 % 2;
        int i102 = (i98 | 69) << 1;
        int i103 = -(i98 ^ 69);
        int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
        b = i104 % 128;
        int i105 = i104 % 2;
        while (i10 < this.cropResource.size()) {
            JSONObject jSONObject2 = new JSONObject();
            AgriResource agriResource3 = this.cropResource.get(i10);
            int i106 = b;
            int i107 = i106 & 109;
            int i108 = i106 | 109;
            int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
            a = i109 % 128;
            int i112 = i109 % 2;
            if (agriResource3.getIsSelected() == 1) {
                int i113 = b;
                int i114 = (-2) - (((i113 ^ 50) + ((i113 & 50) << 1)) ^ (-1));
                a = i114 % 128;
                int i115 = i114 % 2;
                AgriResource agriResource4 = this.cropResource.get(i10);
                int i116 = b;
                int i117 = (i116 & (-80)) | ((~i116) & 79);
                int i118 = (i116 & 79) << 1;
                int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                a = i119 % 128;
                int i120 = i119 % 2;
                jSONObject2.put("crop_machinary_name", agriResource4.getName());
                ArrayList<AgriResource> arrayList = this.cropResource;
                int i121 = b;
                int i122 = i121 & 23;
                int i123 = (i121 ^ 23) | i122;
                int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
                a = i124 % 128;
                if (i124 % 2 == 0) {
                    jSONObject2.put("crop_machinary_owner", arrayList.get(i10).getResourceName());
                    obj2.hashCode();
                    throw null;
                }
                jSONObject2.put("crop_machinary_owner", arrayList.get(i10).getResourceName());
                jSONArray4.put(jSONObject2);
                int i125 = b;
                int i126 = i125 ^ 3;
                int i127 = -(-((i125 & 3) << 1));
                int i128 = ((i126 | i127) << 1) - (i127 ^ i126);
                a = i128 % 128;
                int i129 = i128 % 2;
            }
            int i130 = i10 & (-5);
            int i131 = ((i10 | (-5)) & (~i130)) + (i130 << 1);
            int i132 = ((i131 | 7) << 1) - (i131 ^ 7);
            i10 = (i132 ^ (-1)) + (i132 << 1);
            int i133 = a;
            int i134 = (((i133 | 22) << 1) - (i133 ^ 22)) - 1;
            b = i134 % 128;
            int i135 = i134 % 2;
        }
        jSONObject.put("crop_machinary", jSONArray4);
        int i136 = a + 119;
        b = i136 % 128;
        if (i136 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }
}
