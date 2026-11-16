package ivas.gov.bisp.enumeration.models;

import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class NewLocationForm extends SugarRecord {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("batch_size")
    private int batchSize;

    @o0OO00O("date")
    private String date;

    @o0OO00O("desk_based_survey")
    private int deskBasedSurvey;

    @o0OO00O("district_id")
    private int districtId;

    @o0OO00O("district_name")
    private String districtName;

    @o0OO00O("imei_number")
    private String imeiNumber;

    @o0OO00O("is_gps_exempted")
    private int isGpsExempted;

    @o0OO00O("is_hard")
    private int isHard;

    @o0OO00O("is_recollection")
    private int isReCollection;

    @o0OO00O("is_validate")
    private int isValidate;

    @o0OO00O("latitude")
    private String latitude;

    @o0OO00O("longitude")
    private String longitude;

    @o0OO00O("per_address")
    private String per_address;

    @o0OO00O("po_id")
    private int poId;

    @o0OO00O("po_name")
    private String poName;

    @o0OO00O("province_id")
    private int provinceId;

    @o0OO00O("province_name")
    private String provinceName;

    @o0OO00O("region")
    private String region;

    @o0OO00O("tab_vs_gps_time")
    private int tabVsGpsTime;

    @o0OO00O("tehsil_id")
    private int tehsilId;

    @o0OO00O("tehsil_name")
    private String tehsilName;

    @o0OO00O("temp_address")
    private String temp_address;

    @o0OO00O("time")
    private String time;

    @o0OO00O("uc_id")
    private int ucId;

    @o0OO00O("uc_name")
    private String ucName;

    @o0OO00O("villageAccuracy")
    private double villageAccuracy;

    @o0OO00O("village_boundaries")
    private String villageBoundaries;

    @o0OO00O("village_id")
    private double villageId;

    @o0OO00O("village_map_list")
    private String villageMapList;

    @o0OO00O("village_name")
    private String villageName;

    @o0OO00O("village_structure_number")
    private String villageStructureNumber;

    public NewLocationForm(Survey survey) {
        this.deskBasedSurvey = 0;
        this.isGpsExempted = survey.is_gps_exempted;
        this.isHard = survey.is_hard;
        this.isValidate = survey.is_validate;
        this.region = survey.region;
        this.provinceId = survey.province_id;
        this.provinceName = survey.province_name;
        this.districtId = survey.district_id;
        this.districtName = survey.district_name;
        this.deskBasedSurvey = survey.deskBasedSurvey;
        this.tehsilId = survey.tehsil_id;
        this.tabVsGpsTime = survey.tabVsGpsTime;
        this.tehsilName = survey.tehsil_name;
        this.temp_address = survey.temp_address;
        this.per_address = survey.per_address;
        this.ucId = survey.uc_id;
        this.ucName = survey.uc_name;
        this.villageId = survey.village_id;
        this.villageName = survey.village_name;
        this.poId = survey.po_id;
        this.poName = survey.po_name;
        this.villageAccuracy = survey.villageAccuracy;
        this.villageMapList = survey.village_map_listing;
        this.villageStructureNumber = survey.village_structure_number;
        this.isReCollection = survey.reCollectionFlag;
    }

    public int getBatchSize() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 95) << 1) - (~(-(i2 ^ 95)))) - 1;
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this.batchSize;
        int i6 = i4 & 51;
        int i7 = -(-((i4 ^ 51) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public String getDate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 15) | (i2 & 15)) << 1;
        int i4 = -((i2 & (-16)) | ((~i2) & 15));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.date;
        if (i6 != 0) {
            int i7 = 62 / 0;
        }
        int i8 = i2 + 3;
        a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public int getDeskBasedSurvey() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 61;
        int i4 = (~i3) & (i2 | 61);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.deskBasedSurvey;
        int i9 = (i2 ^ 121) + ((i2 & 121) << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 99 / 0;
        }
        return i8;
    }

    public int getDistrictId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = (((~i3) & (i2 | 27)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.districtId;
        int i6 = (i2 ^ 95) + ((i2 & 95) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String getDistrictName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-4)) | ((~i2) & 3);
        int i4 = -(-((i2 & 3) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.districtName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getImeiNumber() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = ((i2 ^ 113) | i3) << 1;
        int i5 = -((i2 | 113) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.imeiNumber;
        int i8 = ((i7 ^ 85) | (i7 & 85)) << 1;
        int i9 = -(((~i7) & 85) | (i7 & (-86)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public int getIsGpsExempted() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 125;
        int i4 = (i2 & 125) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = this.isGpsExempted;
        int i9 = i6 + 80;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return i8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getIsHard() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 119) | (i2 & 119)) << 1;
        int i4 = -((i2 & (-120)) | ((~i2) & 119));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = this.isHard;
        int i7 = (i2 & (-66)) | ((~i2) & 65);
        int i8 = -(-((i2 & 65) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i6;
    }

    public int getIsReCollection() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 58) << 1) - (i2 ^ 58);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.isReCollection;
        int i7 = ((i2 | 117) << 1) - (i2 ^ 117);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 40 / 0;
        }
        return i6;
    }

    public int getIsValidate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 43;
        int i4 = (i3 - (~((i2 ^ 43) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.isValidate;
        int i7 = (i2 & 65) + (i2 | 65);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public String getLatitude() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 11) + ((i2 & 11) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.latitude;
        int i6 = i4 + 3;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getLongitude() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 125;
        int i4 = ((i2 | 125) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return this.longitude;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPer_address() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 51;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 51)));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        String str = this.per_address;
        int i8 = i2 ^ 69;
        int i9 = (i2 & 69) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 84 / 0;
        }
        return str;
    }

    public int getPoId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 108) + ((i2 & 108) << 1)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = this.poId;
        int i7 = ((i4 & 76) + (i4 | 76)) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPoName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 97;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 97)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        String str = this.poName;
        int i8 = ((i2 ^ 115) | (i2 & 115)) << 1;
        int i9 = -(((~i2) & 115) | (i2 & (-116)));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 28 / 0;
        }
        return str;
    }

    public int getProvinceId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 17;
        int i4 = (i3 << 1) - ((~(i2 & 17)) & i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.provinceId;
        int i8 = ((i5 & 47) - (~(-(-(i5 | 47))))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return i7;
        }
        throw null;
    }

    public String getProvinceName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = -(-(i2 | 67));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.provinceName;
        int i6 = i2 & 67;
        int i7 = -(-((i2 ^ 67) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 84 / 0;
        }
        return str;
    }

    public String getRegion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = (i2 ^ 7) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.region;
        int i7 = (i2 ^ 9) + ((i2 & 9) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public int getTabVsGpsTime() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 107;
        int i4 = i3 + ((i2 ^ 107) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.tabVsGpsTime;
        int i7 = i2 & 51;
        int i8 = ((i2 ^ 51) | i7) << 1;
        int i9 = -((i2 | 51) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return i6;
    }

    public int getTehsilId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.tehsilId;
        }
        throw null;
    }

    public String getTehsilName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 13) << 1) - (i2 ^ 13);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.tehsilName;
        int i6 = (i4 & 101) + (i4 | 101);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getTemp_address() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 79) | (i2 & 79)) << 1) - ((i2 & (-80)) | ((~i2) & 79));
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.temp_address;
        int i5 = i2 + 103;
        a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getTime() {
        int i = 2 % 2;
        int i2 = b + 9;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        String str = this.time;
        int i5 = (i3 ^ 93) + ((i3 & 93) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public int getUcId() {
        int i = 2 % 2;
        int i2 = b + 45;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ucId;
        }
        throw null;
    }

    public String getUcName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 14) << 1) - (i2 ^ 14)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.ucName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public double getVillageAccuracy() {
        double d;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = (((i2 ^ 107) | i3) << 1) - ((i2 | 107) & (~i3));
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            d = this.villageAccuracy;
            int i6 = 2 / 0;
        } else {
            d = this.villageAccuracy;
        }
        int i7 = (i5 ^ 79) + ((i5 & 79) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return d;
    }

    public String getVillageBoundaries() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.villageBoundaries;
        int i6 = i4 + 57;
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public double getVillageId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 41;
        int i4 = ((i2 | 41) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.villageId;
        }
        int i5 = 7 / 0;
        return this.villageId;
    }

    public String getVillageMapList() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((i2 + 50) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.villageMapList;
        int i5 = i2 + 115;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getVillageName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 25;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 25)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return this.villageName;
        }
        throw null;
    }

    public String getVillageStructureNumber() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-94)) | ((~i2) & 93);
        int i4 = -(-((i2 & 93) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        String str = this.villageStructureNumber;
        int i7 = (((i6 & (-86)) | ((~i6) & 85)) - (~(-(-((i6 & 85) << 1))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public void setBatchSize(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 3) << 1) - (i3 ^ 3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.batchSize = i;
        } else {
            this.batchSize = i;
            throw null;
        }
    }

    public void setDate(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.date = str;
        int i5 = (((i2 | 118) << 1) - (i2 ^ 118)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setDeskBasedSurvey(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 & (-44)) | ((~i3) & 43)) - (~(-(-((i3 & 43) << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.deskBasedSurvey = i;
        if (i5 != 0) {
            int i6 = 75 / 0;
        }
        int i7 = ((i3 | 2) << 1) - (i3 ^ 2);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setDistrictId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 3;
        int i5 = i4 + ((i3 ^ 3) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.districtId = i;
        if (i6 != 0) {
            int i7 = 64 / 0;
        }
    }

    public void setDistrictName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 68) << 1) - (i2 ^ 68)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.districtName = str;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setImeiNumber(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 121;
        int i4 = -(-((i2 & 121) << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.imeiNumber = str;
        int i7 = i2 & 27;
        int i8 = ((i2 | 27) & (~i7)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setIsGpsExempted(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 39;
        int i5 = i4 + ((i3 ^ 39) | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.isGpsExempted = i;
        if (i6 == 0) {
            int i7 = 7 / 0;
        }
    }

    public void setIsHard(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 75) | (i3 & 75)) << 1;
        int i5 = -((i3 & (-76)) | ((~i3) & 75));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.isHard = i;
        int i8 = i3 + 19;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setIsReCollection(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 55) << 1) - (i3 ^ 55);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.isReCollection = i;
        int i6 = i3 & 81;
        int i7 = (i3 | 81) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIsValidate(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 47;
        int i5 = (i3 ^ 47) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.isValidate = i;
        int i9 = i7 & 99;
        int i10 = -(-((i7 ^ 99) | i9));
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public void setLatitude(String str) {
        int i = 2 % 2;
        int i2 = b + 69;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.latitude = str;
            return;
        }
        this.latitude = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLongitude(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 79) + (i2 | 79);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.longitude = str;
        int i5 = i2 ^ 39;
        int i6 = ((((i2 & 39) | i5) << 1) - (~(-i5))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
    }

    public void setPer_address(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 89) | (i2 & 89)) << 1;
        int i4 = -((i2 & (-90)) | ((~i2) & 89));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        this.per_address = str;
        if (i6 == 0) {
            throw null;
        }
        int i7 = i2 & 89;
        int i8 = (i2 | 89) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setPoId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 121) + ((i3 & 121) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.poId = i;
        if (i5 == 0) {
            throw null;
        }
    }

    public void setPoName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 10) << 1) - (i2 ^ 10)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.poName = str;
        int i5 = ((i2 | 53) << 1) - (i2 ^ 53);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
    }

    public void setProvinceId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 105;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            this.provinceId = i;
            throw null;
        }
        this.provinceId = i;
        int i5 = (i3 & 63) + (i3 | 63);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setProvinceName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 67) + (i2 | 67);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.provinceName = str;
        int i5 = (i2 & (-120)) | ((~i2) & 119);
        int i6 = -(-((i2 & 119) << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setRegion(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 35;
        int i4 = (i2 ^ 35) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.region = str;
        int i7 = i2 & 3;
        int i8 = -(-((i2 ^ 3) | i7));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTabVsGpsTime(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 1) << 1) - (i3 ^ 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.tabVsGpsTime = i;
            return;
        }
        this.tabVsGpsTime = i;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTehsilId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 101;
        int i5 = (((i3 ^ 101) | i4) << 1) - ((i3 | 101) & (~i4));
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        this.tehsilId = i;
        if (i7 != 0) {
            int i8 = 28 / 0;
        }
        int i9 = i6 & 107;
        int i10 = i9 + ((i6 ^ 107) | i9);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 24 / 0;
        }
    }

    public void setTehsilName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-126)) | ((~i2) & 125);
        int i4 = (i2 & 125) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.tehsilName = str;
            int i6 = 99 / 0;
        } else {
            this.tehsilName = str;
        }
        int i7 = ((i2 ^ 83) | (i2 & 83)) << 1;
        int i8 = -(((~i2) & 83) | (i2 & (-84)));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setTemp_address(String str) {
        int i = 2 % 2;
        int i2 = (-2) - ((b + 120) ^ (-1));
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        this.temp_address = str;
        int i5 = i3 & 29;
        int i6 = (~i5) & (i3 | 29);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public void setTime(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (((i2 ^ 67) | i3) << 1) - ((~i3) & (i2 | 67));
        a = i4 % 128;
        int i5 = i4 % 2;
        this.time = str;
        int i6 = (i2 & (-66)) | ((~i2) & 65);
        int i7 = (i2 & 65) << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setUcId(int i) {
        int i2 = 2 % 2;
        int i3 = a + 79;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.ucId = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = ((i4 & 96) + (i4 | 96)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setUcName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 & 92) + (i2 | 92)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        this.ucName = str;
        int i5 = ((i2 ^ 5) | (i2 & 5)) << 1;
        int i6 = -(((~i2) & 5) | (i2 & (-6)));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setVillageAccuracy(double d) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 53;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.villageAccuracy = d;
        int i5 = i2 + 103;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setVillageBoundaries(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 33;
        a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.villageBoundaries = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 15;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setVillageId(double d) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 46) + (i2 | 46);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.villageId = d;
        int i6 = i2 + 73;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setVillageMapList(String str) {
        int i = 2 % 2;
        int i2 = a + 119;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 == 0) {
            this.villageMapList = str;
            int i4 = 41 / 0;
        } else {
            this.villageMapList = str;
        }
        int i5 = ((i3 | 103) << 1) - (i3 ^ 103);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
    }

    public void setVillageName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 93;
        int i4 = ((((i2 & 93) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.villageName = str;
        int i6 = i2 & 15;
        int i7 = ((i2 | 15) & (~i6)) + (i6 << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setVillageStructureNumber(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = i3 + ((i2 ^ 77) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.villageStructureNumber = str;
        int i6 = i2 & 47;
        int i7 = ((i2 ^ 47) | i6) << 1;
        int i8 = -((i2 | 47) & (~i6));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public NewLocationForm() {
        this.deskBasedSurvey = 0;
        setBatchSize(1);
        setDate(BuildConfig.FLAVOR);
        setDeskBasedSurvey(0);
        setDistrictId(0);
        setDistrictName(BuildConfig.FLAVOR);
        setImeiNumber(BuildConfig.FLAVOR);
        setIsGpsExempted(0);
        setIsHard(0);
        setIsValidate(0);
        setLatitude(BuildConfig.FLAVOR);
        setLongitude(BuildConfig.FLAVOR);
        setPoId(0);
        setPoName(BuildConfig.FLAVOR);
        setTehsilId(0);
        setTabVsGpsTime(0);
        setTehsilName(BuildConfig.FLAVOR);
        setVillageId(0.0d);
        setVillageBoundaries(BuildConfig.FLAVOR);
        setVillageName(BuildConfig.FLAVOR);
        setVillageMapList(BuildConfig.FLAVOR);
        setVillageStructureNumber(BuildConfig.FLAVOR);
        setTime(BuildConfig.FLAVOR);
        setProvinceId(0);
        setProvinceName(BuildConfig.FLAVOR);
        setUcId(0);
        setUcName(BuildConfig.FLAVOR);
        setRegion(BuildConfig.FLAVOR);
        setIsReCollection(0);
        setVillageAccuracy(50.0d);
    }
}
