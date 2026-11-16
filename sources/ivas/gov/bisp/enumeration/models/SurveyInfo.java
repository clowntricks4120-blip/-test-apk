package ivas.gov.bisp.enumeration.models;

import com.orm.SugarRecord;
import com.orm.annotation.MultiUnique;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.List;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@MultiUnique("uniqueID,imeiMac")
public class SurveyInfo extends SugarRecord {
    private static int a = 0;
    private static int b = 1;
    public int air_conditioner_flag;
    public int air_cooler_flag;
    public int animal_flag;
    public int attended_school_flag;
    public double averageRosterTime;
    public String batchName;
    public int bform_flag;
    public int buffalo_flag;
    public int camel_flag;
    public int car_flag;
    public int chronic_disease_flag;
    public String cnic;
    public int cnic_flag;
    public int cnic_option_flag;
    public int computer_flag;
    public int cooking_fuel_flag;
    public int cooking_range_flag;
    public int cooking_stove_flag;
    public int cow_flag;
    public String date;
    public int date_of_birth_flag;
    public int disability_flag;
    public int drinking_water_flag;
    public int electricity_flag;
    public int employment_status_flag;
    public int fan_flag;
    public String formNo;
    public String formNotAtHome;
    public int freezer_flag;
    public int gas_flag;
    public int gender_flag;
    public int generator_flag;
    public int geyser_flag;
    public int goat_flag;
    public String headName;
    public int heater_flag;
    public int higher_education_flag;
    public int horse_flag;
    public int hours_worked_flag;
    public int household_agriculture_land_flag;
    public String imeiMac;
    public int internet_flag;
    public int interviewStatus;
    public int isOffHour;
    public int isSentToServer = 0;
    public int isSentToSupervisor = 0;
    public int is_bisp_flag;
    public int land_number_flag;
    public int land_unit_flag;
    public int landline_flag;
    public int language_flag;
    public String latitude;
    public String longitude;
    public int marital_status_flag;
    public int mobile_flag;
    public int motorcycle_flag;
    public int name_of_member_flag;
    public int number_of_rooms_flag;
    public int occupancy_status_flag;
    public int refrigerator_flag;
    public int relation_to_household_flag;
    public int roof_material_flag;
    public int rosterCount;
    public String serverTimeStamp;
    public int sewing_flag;
    public String supervisorTimeStamp;
    public String time;
    public double timeAssetDetail;
    public double timeContactDetail;
    public double timeMiscellaneousDetail;
    public double timeRosterDetail;
    public int toilet_flag;
    public int tractor_flag;
    public int tv_flag;
    public int type;
    public String uniqueID;
    public String uuid;
    public int vcr_flag;
    public double villageId;
    public String villageName;
    public int wall_material_flag;
    public int washing_machine_flag;
    public int work_activity_flag;

    public SurveyInfo() {
        setEmptyValues();
    }

    public String getHeadName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 51;
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.headName;
        int i5 = ((i2 | 119) << 1) - (i2 ^ 119);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return str;
    }

    public String getLatitude() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 89) + (i2 | 89);
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.latitude;
        int i5 = ((i4 ^ 77) - (~((i4 & 77) << 1))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public String getLongitude() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 3) + (i2 | 3);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.longitude;
        int i5 = ((i4 & 107) - (~(i4 | 107))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        StringBuilder sbW = j.w("SurveyInfo{uuid='");
        j.v(sbW, this.uuid, '\'', ", formNo='");
        j.v(sbW, this.formNo, '\'', ", formNotAtHome='");
        int i5 = (-2) - ((a + 68) ^ (-1));
        b = i5 % 128;
        int i6 = i5 % 2;
        j.v(sbW, this.formNotAtHome, '\'', ", type=");
        sbW.append(this.type);
        sbW.append(", interviewStatus=");
        int i7 = this.interviewStatus;
        int i8 = a;
        int i9 = i8 & 7;
        int i10 = -(-((i8 ^ 7) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        sbW.append(i7);
        sbW.append(", batchName='");
        j.v(sbW, this.batchName, '\'', ", cnic='");
        String str = this.cnic;
        int i13 = a + 41;
        b = i13 % 128;
        if (i13 % 2 == 0) {
            j.v(sbW, str, '\'', ", imeiMac='");
            j.v(sbW, this.imeiMac, 'Z', ", rosterCount=");
        } else {
            j.v(sbW, str, '\'', ", imeiMac='");
            j.v(sbW, this.imeiMac, '\'', ", rosterCount=");
        }
        sbW.append(this.rosterCount);
        sbW.append(", timeContactDetail=");
        sbW.append(this.timeContactDetail);
        sbW.append(", timeRosterDetail=");
        sbW.append(this.timeRosterDetail);
        sbW.append(", timeAssetDetail=");
        int i14 = b;
        int i15 = (i14 & 65) + (i14 | 65);
        a = i15 % 128;
        int i16 = i15 % 2;
        sbW.append(this.timeAssetDetail);
        sbW.append(", timeMiscellaneousDetail=");
        sbW.append(this.timeMiscellaneousDetail);
        sbW.append(", serverTimeStamp='");
        int i17 = a + 123;
        b = i17 % 128;
        if (i17 % 2 == 0) {
            j.v(sbW, this.serverTimeStamp, '{', ", isSentToServer=");
        } else {
            j.v(sbW, this.serverTimeStamp, '\'', ", isSentToServer=");
        }
        sbW.append(this.isSentToServer);
        sbW.append(", averageRosterTime=");
        sbW.append(this.averageRosterTime);
        sbW.append(", isOffHour=");
        sbW.append(this.isOffHour);
        sbW.append('}');
        String string = sbW.toString();
        int i18 = a;
        int i19 = (i18 ^ 45) + ((i18 & 45) << 1);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 88 / 0;
        }
        return string;
    }

    public SurveyInfo(String str, int i, String str2, String str3, int i2, int i3, String str4, String str5, String str6, int i4, double d, double d2, double d3, double d4, double d5, String str7, String str8, double d6, String str9, String str10, String str11, String str12, String str13) {
        setEmptyValues();
        this.uniqueID = str;
        this.headName = str12;
        this.isOffHour = i;
        this.supervisorTimeStamp = str13;
        this.uuid = str2;
        this.formNo = str3;
        this.type = i2;
        this.interviewStatus = i3;
        this.batchName = str4;
        this.cnic = str5;
        this.imeiMac = str6;
        this.rosterCount = i4;
        this.timeContactDetail = d;
        this.timeRosterDetail = d2;
        this.timeAssetDetail = d3;
        this.timeMiscellaneousDetail = d4;
        this.averageRosterTime = d5;
        this.date = str7;
        this.time = str8;
        this.villageId = d6;
        this.villageName = str9;
        this.latitude = str10;
        this.longitude = str11;
    }

    public JSONObject getJsonToSendToEnum() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.batchName;
            int i2 = a;
            int i3 = i2 & 125;
            int i4 = ((i2 ^ 125) | i3) << 1;
            int i5 = -((i2 | 125) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            jSONObject.put("name", str);
            jSONObject.put("server_sent", this.serverTimeStamp);
            int i8 = a;
            int i9 = i8 & 67;
            int i10 = (i8 | 67) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            b = i12 % 128;
            Object obj = null;
            if (i12 % 2 == 0) {
                jSONObject.put("form_no", this.formNo);
                obj.hashCode();
                throw null;
            }
            jSONObject.put("form_no", this.formNo);
            jSONObject.put("uuid", this.uuid);
            int i13 = b;
            int i14 = (((i13 | 92) << 1) - (i13 ^ 92)) - 1;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                jSONObject.put("form_not_at_home", this.formNotAtHome);
                obj.hashCode();
                throw null;
            }
            jSONObject.put("form_not_at_home", this.formNotAtHome);
            int i15 = b;
            int i16 = i15 & 41;
            int i17 = ((i15 ^ 41) | i16) << 1;
            int i18 = -((i15 | 41) & (~i16));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            return jSONObject;
        } catch (JSONException unused) {
        }
    }

    public SurveyInfo(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, String str7, int i3, double d, String str8, String str9, double d2, String str10, String str11, String str12) {
        setEmptyValues();
        this.uniqueID = str;
        this.uuid = str2;
        this.formNo = str3;
        this.formNotAtHome = str4;
        this.type = i;
        this.interviewStatus = i2;
        this.batchName = str5;
        this.cnic = str6;
        this.imeiMac = str7;
        this.rosterCount = i3;
        this.averageRosterTime = d;
        this.date = str8;
        this.time = str9;
        this.villageId = d2;
        this.villageName = str10;
        this.latitude = str11;
        this.longitude = str12;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0233  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:207:0x037e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0396  */
    /* JADX WARN: Code duplicated, block: B:222:0x03be  */
    /* JADX WARN: Code duplicated, block: B:260:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:267:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:269:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:273:0x0514  */
    /* JADX WARN: Code duplicated, block: B:276:0x052c  */
    /* JADX WARN: Code duplicated, block: B:279:0x053f  */
    /* JADX WARN: Code duplicated, block: B:282:0x054b  */
    /* JADX WARN: Code duplicated, block: B:285:0x0562  */
    /* JADX WARN: Code duplicated, block: B:288:0x057f  */
    /* JADX WARN: Code duplicated, block: B:291:0x059c  */
    /* JADX WARN: Code duplicated, block: B:294:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:297:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:299:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:300:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:303:0x0616  */
    /* JADX WARN: Code duplicated, block: B:306:0x0633  */
    /* JADX WARN: Code duplicated, block: B:309:0x064b  */
    /* JADX WARN: Code duplicated, block: B:312:0x0664  */
    /* JADX WARN: Code duplicated, block: B:315:0x0683  */
    /* JADX WARN: Code duplicated, block: B:317:0x068d  */
    /* JADX WARN: Code duplicated, block: B:320:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:323:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:325:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:327:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:330:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:333:0x070d  */
    /* JADX WARN: Code duplicated, block: B:335:0x0717  */
    /* JADX WARN: Code duplicated, block: B:337:0x0733  */
    /* JADX WARN: Code duplicated, block: B:338:0x0735  */
    /* JADX WARN: Code duplicated, block: B:341:0x0753  */
    /* JADX WARN: Code duplicated, block: B:343:0x0767  */
    /* JADX WARN: Code duplicated, block: B:344:0x0769  */
    /* JADX WARN: Code duplicated, block: B:347:0x0791  */
    /* JADX WARN: Code duplicated, block: B:350:0x079b  */
    /* JADX WARN: Code duplicated, block: B:352:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:354:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:366:0x07f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x06ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x07e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    public SurveyInfo(Survey survey, String str, String str2, List<Roster> list, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        Roster roster;
        int i40;
        int i41;
        int i42;
        int i43;
        Roster roster2;
        int i44;
        int i45;
        Roster roster3;
        Roster roster4;
        int i46;
        setEmptyValues();
        this.uniqueID = survey.uniqueID;
        this.uuid = survey.uuid;
        this.formNo = survey.form_no;
        this.formNotAtHome = survey.form_no_not_at_home;
        this.type = survey.userType;
        this.interviewStatus = survey.visit_status_id;
        this.batchName = survey.batchName;
        this.cnic = str;
        this.imeiMac = str2;
        this.rosterCount = i;
        this.averageRosterTime = survey.averageRosterTime;
        this.date = survey.date;
        this.time = survey.time;
        this.villageId = survey.village_id;
        this.villageName = survey.village_name;
        this.latitude = survey.latitude;
        this.longitude = survey.longitude;
        int i47 = survey.occupacy_status_flag;
        this.occupancy_status_flag = (i47 == -1 || i47 != 0) ? 0 : 1;
        int i48 = survey.wall_material_flag;
        this.wall_material_flag = (i48 == -1 || i48 != 0) ? 0 : 1;
        int i49 = survey.roof_material_flag;
        int i50 = a;
        int i51 = (i50 & 5) + (i50 | 5);
        b = i51 % 128;
        int i52 = i51 % 2;
        this.roof_material_flag = (i49 == -1 || i49 != 0) ? 0 : 1;
        int i53 = survey.cooking_fuel_flag;
        this.cooking_fuel_flag = (i53 == -1 || i53 != 0) ? 0 : 1;
        int i54 = survey.toilet_flag;
        this.toilet_flag = (i54 == -1 || i54 != 0) ? 0 : 1;
        int i55 = survey.drinking_water_flag;
        if (i55 == -1 || i55 != 0) {
            i2 = 0;
        } else {
            int i56 = 2 % 2;
            i2 = 1;
        }
        this.drinking_water_flag = i2;
        int i57 = survey.electricity_flag;
        this.electricity_flag = (i57 == -1 || i57 != 0) ? 0 : 1;
        int i58 = survey.gas_flag;
        if (i58 != -1) {
            int i59 = a;
            int i60 = i59 & 113;
            int i61 = (i59 | 113) & (~i60);
            int i62 = i60 << 1;
            int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
            b = i63 % 128;
            if (i63 % 2 == 0) {
                int i64 = 55 / 0;
                if (i58 == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            } else if (i58 == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        this.gas_flag = i3;
        int i65 = survey.landline_flag;
        Object obj = null;
        if (i65 != -1) {
            int i66 = a;
            int i67 = i66 & 101;
            int i68 = (i66 ^ 101) | i67;
            int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
            int i70 = i69 % 128;
            b = i70;
            if (i69 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i65 == 0) {
                int i71 = i70 + 8;
                int i72 = (i71 ^ (-1)) + (i71 << 1);
                a = i72 % 128;
                int i73 = i72 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
        } else {
            i4 = 0;
        }
        this.landline_flag = i4;
        int i74 = survey.number_of_rooms_flag;
        if (i74 != -1) {
            int i75 = b;
            int i76 = (i75 ^ 87) + ((i75 & 87) << 1);
            a = i76 % 128;
            int i77 = i76 % 2;
            if (i74 == 0) {
                int i78 = 2 % 2;
                i5 = 1;
            } else {
                int i79 = 2 % 2;
                i5 = 0;
            }
        } else {
            int i710 = 2 % 2;
            i5 = 0;
        }
        this.number_of_rooms_flag = i5;
        int i80 = survey.animal_flag;
        this.animal_flag = (i80 == -1 || i80 != 0) ? 0 : 1;
        int i81 = survey.buffalo_flag;
        if (i81 == -1 || i81 != 0) {
            int i82 = 2 % 2;
            i6 = 0;
        } else {
            int i83 = b;
            int i84 = i83 ^ 33;
            int i85 = ((i83 & 33) | i84) << 1;
            int i86 = -i84;
            int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
            a = i87 % 128;
            int i88 = i87 % 2;
            i6 = 1;
        }
        this.buffalo_flag = i6;
        int i89 = survey.cow_flag;
        if (i89 != -1) {
            int i90 = b;
            int i91 = (i90 ^ 65) + ((i90 & 65) << 1);
            a = i91 % 128;
            int i92 = i91 % 2;
            if (i89 == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
        }
        this.cow_flag = i7;
        int i93 = survey.horse_flag;
        this.horse_flag = (i93 == -1 || i93 != 0) ? 0 : 1;
        int i94 = survey.camel_flag;
        int i95 = b;
        int i96 = ((i95 ^ 79) | (i95 & 79)) << 1;
        int i97 = -(((~i95) & 79) | (i95 & (-80)));
        int i98 = (i96 & i97) + (i97 | i96);
        int i99 = i98 % 128;
        a = i99;
        int i100 = i98 % 2;
        if (i94 == -1 || i94 != 0) {
            i8 = 0;
        } else {
            int i101 = i99 & 55;
            int i102 = (i101 - (~((i99 ^ 55) | i101))) - 1;
            b = i102 % 128;
            int i103 = i102 % 2;
            i8 = 1;
        }
        this.camel_flag = i8;
        int i104 = survey.goat_flag;
        if (i104 == -1 || i104 != 0) {
            i9 = 0;
        } else {
            int i105 = a;
            int i106 = i105 & 47;
            int i107 = (i105 | 47) & (~i106);
            int i108 = -(-(i106 << 1));
            int i109 = (i107 ^ i108) + ((i107 & i108) << 1);
            int i110 = i109 % 128;
            b = i110;
            int i111 = i109 % 2;
            int i112 = (i110 | 11) << 1;
            int i113 = -(((~i110) & 11) | (i110 & (-12)));
            int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
            a = i114 % 128;
            int i115 = i114 % 2;
            int i116 = 2 % 2;
            i9 = 1;
        }
        this.goat_flag = i9;
        int i117 = survey.land_unit_flag;
        if (i117 == -1 || i117 != 0) {
            i10 = 0;
        } else {
            int i118 = b;
            int i119 = ((i118 ^ 49) | (i118 & 49)) << 1;
            int i120 = -(((~i118) & 49) | (i118 & (-50)));
            int i121 = (i119 ^ i120) + ((i120 & i119) << 1);
            a = i121 % 128;
            int i122 = i121 % 2;
            int i123 = 2 % 2;
            i10 = 1;
        }
        this.land_unit_flag = i10;
        int i124 = survey.land_number_flag;
        this.land_number_flag = (i124 == -1 || i124 != 0) ? 0 : 1;
        int i125 = survey.household_agriculture_land_flag;
        if (i125 == -1 || i125 != 0) {
            i11 = 0;
        } else {
            int i126 = 2 % 2;
            i11 = 1;
        }
        this.household_agriculture_land_flag = i11;
        int i127 = survey.heater_flag;
        this.heater_flag = (i127 == -1 || i127 != 0) ? 0 : 1;
        int i128 = survey.washing_machine_flag;
        if (i128 != -1) {
            int i129 = a;
            int i130 = (i129 ^ 95) + ((i129 & 95) << 1);
            int i131 = i130 % 128;
            b = i131;
            int i132 = i130 % 2;
            if (i128 == 0) {
                int i133 = (i131 & 29) + (i131 | 29);
                a = i133 % 128;
                int i134 = i133 % 2;
                i12 = 1;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        this.washing_machine_flag = i12;
        int i135 = survey.geyser_flag;
        this.geyser_flag = (i135 == -1 || i135 != 0) ? 0 : 1;
        int i136 = survey.air_cooler_flag;
        this.air_cooler_flag = (i136 == -1 || i136 != 0) ? 0 : 1;
        int i137 = survey.air_conditioner_flag;
        this.air_conditioner_flag = (i137 == -1 || i137 != 0) ? 0 : 1;
        int i138 = survey.fan_flag;
        if (i138 == -1 || i138 != 0) {
            i13 = 0;
        } else {
            int i139 = 2 % 2;
            i13 = 1;
        }
        this.fan_flag = i13;
        int i140 = survey.cooking_range_flag;
        if (i140 == -1 || i140 != 0) {
            i14 = 0;
        } else {
            int i141 = b;
            int i142 = ((i141 ^ 110) + ((i141 & 110) << 1)) - 1;
            a = i142 % 128;
            int i143 = i142 % 2;
            i14 = 1;
        }
        this.cooking_range_flag = i14;
        int i144 = survey.cooking_stove_flag;
        if (i144 == -1 || i144 != 0) {
            int i145 = 2 % 2;
            i15 = 0;
        } else {
            i15 = 1;
        }
        this.cooking_stove_flag = i15;
        int i146 = survey.tv_flag;
        if (i146 == -1 || i146 != 0) {
            int i147 = 2 % 2;
            i16 = 0;
        } else {
            i16 = 1;
        }
        this.tv_flag = i16;
        int i148 = survey.vcr_flag;
        if (i148 == -1 || i148 != 0) {
            int i149 = 2 % 2;
            i17 = 0;
        } else {
            int i150 = a + 73;
            b = i150 % 128;
            int i151 = i150 % 2;
            int i152 = 2 % 2;
            i17 = 1;
        }
        this.vcr_flag = i17;
        int i153 = survey.refrigerator_flag;
        if (i153 != -1) {
            int i154 = b;
            int i155 = ((i154 ^ 24) + ((i154 & 24) << 1)) - 1;
            a = i155 % 128;
            if (i155 % 2 != 0) {
                throw null;
            }
            if (i153 == 0) {
                i18 = 1;
            } else {
                i18 = 0;
            }
        } else {
            i18 = 0;
        }
        this.refrigerator_flag = i18;
        int i156 = survey.freezer_flag;
        this.freezer_flag = (i156 == -1 || i156 != 0) ? 0 : 1;
        int i157 = survey.generator_flag;
        if (i157 != -1) {
            int i158 = a;
            int i159 = i158 | 125;
            int i160 = (i159 << 1) - ((~(i158 & 125)) & i159);
            b = i160 % 128;
            int i161 = i160 % 2;
            if (i157 == 0) {
                i19 = 1;
            } else {
                i19 = 0;
            }
        } else {
            i19 = 0;
        }
        this.generator_flag = i19;
        int i162 = survey.car_flag;
        this.car_flag = (i162 == -1 || i162 != 0) ? 0 : 1;
        int i163 = survey.mobile_flag;
        if (i163 == -1 || i163 != 0) {
            i20 = 0;
        } else {
            int i164 = a;
            int i165 = (i164 & 67) + (i164 | 67);
            b = i165 % 128;
            int i166 = i165 % 2;
            i20 = 1;
        }
        this.mobile_flag = i20;
        int i167 = survey.tractor_flag;
        if (i167 == -1 || i167 != 0) {
            i21 = 0;
        } else {
            int i168 = a;
            int i169 = (i168 & 95) + (i168 | 95);
            b = i169 % 128;
            int i170 = i169 % 2;
            i21 = 1;
        }
        this.tractor_flag = i21;
        int i171 = survey.motorcycle_flag;
        if (i171 == -1 || i171 != 0) {
            int i172 = 2 % 2;
            i22 = 0;
        } else {
            int i173 = b;
            int i174 = ((i173 ^ 18) + ((i173 & 18) << 1)) - 1;
            a = i174 % 128;
            int i175 = i174 % 2;
            int i176 = i173 & 61;
            int i177 = (i173 ^ 61) | i176;
            int i178 = (i176 & i177) + (i177 | i176);
            a = i178 % 128;
            int i179 = i178 % 2;
            int i180 = 2 % 2;
            i22 = 1;
        }
        this.motorcycle_flag = i22;
        int i181 = survey.internet_flag;
        if (i181 != -1) {
            int i182 = b;
            int i183 = (i182 & 107) + (i182 | 107);
            a = i183 % 128;
            int i184 = i183 % 2;
            if (i181 == 0) {
                int i185 = i182 & 11;
                int i186 = (i182 | 11) & (~i185);
                int i187 = i185 << 1;
                int i188 = (i186 & i187) + (i187 | i186);
                a = i188 % 128;
                if (i188 % 2 == 0) {
                    int i189 = 2 % 2;
                }
                i24 = 1;
            } else {
                int i190 = a;
                int i191 = i190 & 43;
                int i192 = (i190 | 43) & (~i191);
                int i193 = -(-(i191 << 1));
                i23 = (i192 ^ i193) + ((i192 & i193) << 1);
                b = i23 % 128;
                if (i23 % 2 != 0) {
                    int i194 = 2 % 2;
                }
                i24 = 0;
            }
        } else {
            int i195 = a;
            int i196 = i195 & 43;
            int i197 = (i195 | 43) & (~i196);
            int i198 = -(-(i196 << 1));
            i23 = (i197 ^ i198) + ((i197 & i198) << 1);
            b = i23 % 128;
            if (i23 % 2 != 0) {
                int i199 = 2 % 2;
            }
            i24 = 0;
        }
        this.internet_flag = i24;
        int i200 = survey.computer_flag;
        if (i200 != -1) {
            int i201 = a + 77;
            int i202 = i201 % 128;
            b = i202;
            if (i201 % 2 == 0) {
                throw null;
            }
            if (i200 == 0) {
                int i203 = i202 + 104;
                int i204 = (i203 ^ (-1)) + (i203 << 1);
                a = i204 % 128;
                if (i204 % 2 != 0) {
                    i25 = 0;
                } else {
                    i25 = 1;
                }
            } else {
                i25 = 0;
            }
        } else {
            i25 = 0;
        }
        this.computer_flag = i25;
        int i205 = survey.sewing_flag;
        if (i205 == -1 || i205 != 0) {
            i26 = 0;
        } else {
            int i206 = a;
            int i207 = i206 & 117;
            int i208 = ((i206 ^ 117) | i207) << 1;
            int i209 = -((i206 | 117) & (~i207));
            int i210 = (i208 ^ i209) + ((i209 & i208) << 1);
            b = i210 % 128;
            int i211 = i210 % 2;
            i26 = 1;
        }
        this.sewing_flag = i26;
        if (list != null) {
            int i212 = 0;
            while (i212 < list.size()) {
                int i213 = a;
                int i214 = i213 & 121;
                int i215 = ((i213 ^ 121) | i214) << 1;
                int i216 = -((i213 | 121) & (~i214));
                int i217 = (i215 ^ i216) + ((i216 & i215) << 1);
                b = i217 % 128;
                int i218 = i217 % 2;
                int i219 = (list.get(i212).name_of_member_flag == -1 || list.get(i212).name_of_member_flag != 0) ? 0 : 1;
                int i220 = this.name_of_member_flag;
                this.name_of_member_flag = (((~i219) & i220) | ((~i220) & i219)) + ((i219 & i220) << 1);
                int i221 = a;
                int i222 = i221 & 57;
                int i223 = (i221 ^ 57) | i222;
                int i224 = (i222 & i223) + (i223 | i222);
                b = i224 % 128;
                if (i224 % 2 == 0) {
                    int i225 = list.get(i212).relation_to_household_flag;
                    obj.hashCode();
                    throw null;
                }
                int i226 = (list.get(i212).relation_to_household_flag == -1 || list.get(i212).relation_to_household_flag != 0) ? 0 : 1;
                int i227 = this.relation_to_household_flag;
                int i228 = -(~(-(-i226)));
                this.relation_to_household_flag = (-2) - ((((i227 | i228) << 1) - (i228 ^ i227)) ^ (-1));
                int i229 = (list.get(i212).gender_flag == -1 || list.get(i212).gender_flag != 0) ? 0 : 1;
                int i230 = this.gender_flag;
                int i231 = -(-i229);
                int i232 = ((i230 ^ i231) | (i230 & i231)) << 1;
                int i233 = -((i231 & (~i230)) | ((~i231) & i230));
                this.gender_flag = ((i232 | i233) << 1) - (i233 ^ i232);
                int i234 = b + 13;
                a = i234 % 128;
                if (i234 % 2 != 0) {
                    int i235 = list.get(i212).date_of_birth_flag;
                    throw null;
                }
                if (list.get(i212).date_of_birth_flag != -1) {
                    int i236 = a + 33;
                    b = i236 % 128;
                    int i237 = i236 % 2;
                    if (list.get(i212).date_of_birth_flag == 0) {
                        i27 = 1;
                    } else {
                        i27 = 0;
                    }
                } else {
                    i27 = 0;
                }
                int i238 = this.date_of_birth_flag;
                int i239 = i238 & i27;
                this.date_of_birth_flag = ((i27 | i238) & (~i239)) + (i239 << 1);
                int i240 = list.get(i212).merital_status_flag;
                int i241 = a;
                int i242 = (i241 & 31) + (i241 | 31);
                b = i242 % 128;
                if (i242 % 2 == 0) {
                    int i243 = 9 / 0;
                    if (i240 != -1) {
                        i28 = list.get(i212).merital_status_flag == 0 ? 1 : i28;
                    }
                    int i244 = this.marital_status_flag;
                    int i245 = -(~i28);
                    this.marital_status_flag = (-2) - (((i244 & i245) + (i245 | i244)) ^ (-1));
                    int i246 = (-2) - ((a + 88) ^ (-1));
                    b = i246 % 128;
                    int i247 = i246 % 2;
                    if (list.get(i212).cnic_flag == -1 && list.get(i212).cnic_flag == 0) {
                        int i248 = b;
                        int i249 = (i248 & 93) + (i248 | 93);
                        a = i249 % 128;
                        int i250 = i249 % 2;
                        i29 = 1;
                    } else {
                        i29 = 0;
                    }
                    int i251 = this.cnic_flag;
                    this.cnic_flag = (i251 & i29) + (i29 | i251);
                    if (list.get(i212).cnic_option_flag == -1 && list.get(i212).cnic_option_flag == 0) {
                        i30 = 1;
                    } else {
                        i30 = 0;
                    }
                    this.cnic_option_flag = (-2) - ((this.cnic_option_flag - (~(-(-i30)))) ^ (-1));
                    if (list.get(i212).is_bisp_flag == -1 && list.get(i212).is_bisp_flag == 0) {
                        int i252 = a;
                        int i253 = ((i252 & (-76)) | ((~i252) & 75)) + ((i252 & 75) << 1);
                        b = i253 % 128;
                        int i254 = i253 % 2;
                        i31 = 1;
                    } else {
                        i31 = 0;
                    }
                    int i255 = this.is_bisp_flag;
                    int i256 = -(~(-(-i31)));
                    int i257 = ((i255 | i256) << 1) - (i256 ^ i255);
                    this.is_bisp_flag = (i257 ^ (-1)) + (i257 << 1);
                    if (list.get(i212).bform_flag == -1 && list.get(i212).bform_flag == 0) {
                        i32 = 1;
                    } else {
                        int i258 = 2 % 2;
                        i32 = 0;
                    }
                    this.bform_flag = (this.bform_flag - (~i32)) - 1;
                    i33 = list.get(i212).disability_flag;
                    i34 = a;
                    int i259 = i34 & 89;
                    int i260 = i259 + ((i34 ^ 89) | i259);
                    b = i260 % 128;
                    int i261 = i260 % 2;
                    if (i33 != -1) {
                        int i262 = i34 & 53;
                        int i263 = (i34 ^ 53) | i262;
                        int i264 = (i262 ^ i263) + ((i262 & i263) << 1);
                        b = i264 % 128;
                        int i265 = i264 % 2;
                        if (list.get(i212).disability_flag == 0) {
                            int i266 = a;
                            int i267 = i266 ^ 51;
                            int i268 = ((((i266 & 51) | i267) << 1) - (~(-i267))) - 1;
                            b = i268 % 128;
                            int i269 = i268 % 2;
                            int i270 = 2 % 2;
                            i35 = 1;
                        } else {
                            i35 = 0;
                        }
                    } else {
                        i35 = 0;
                    }
                    int i271 = this.disability_flag;
                    int i272 = -(-i35);
                    int i273 = i271 & i272;
                    int i274 = (i272 | i271) & (~i273);
                    int i275 = -(-(i273 << 1));
                    this.disability_flag = ((i274 | i275) << 1) - (i274 ^ i275);
                    if (list.get(i212).chronic_disease_flag == -1 && list.get(i212).chronic_disease_flag == 0) {
                        int i276 = a;
                        int i277 = ((i276 | 27) << 1) - (((~i276) & 27) | (i276 & (-28)));
                        b = i277 % 128;
                        int i278 = i277 % 2;
                        i36 = 1;
                    } else {
                        i36 = 0;
                    }
                    int i279 = this.chronic_disease_flag;
                    int i280 = -(~(-(-i36)));
                    this.chronic_disease_flag = ((i279 & i280) + (i280 | i279)) - 1;
                    if (list.get(i212).language_flag == -1 && list.get(i212).language_flag == 0) {
                        int i281 = b;
                        int i282 = ((i281 & 24) + (i281 | 24)) - 1;
                        a = i282 % 128;
                        int i283 = i282 % 2;
                        i37 = 1;
                    } else {
                        i37 = 0;
                    }
                    int i284 = this.language_flag;
                    int i285 = -(-i37);
                    int i286 = i284 & i285;
                    int i287 = i285 | i284;
                    this.language_flag = ((i286 | i287) << 1) - (i287 ^ i286);
                    int i288 = b;
                    i38 = (((i288 | 100) << 1) - (i288 ^ 100)) - 1;
                    a = i38 % 128;
                    if (i38 % 2 != 0) {
                        int i289 = list.get(i212).attended_school_flag;
                        throw null;
                    }
                    if (list.get(i212).attended_school_flag == -1 && list.get(i212).attended_school_flag == 0) {
                        int i290 = b;
                        int i291 = (i290 & 104) + (i290 | 104);
                        int i292 = (i291 ^ (-1)) + (i291 << 1);
                        a = i292 % 128;
                        int i293 = i292 % 2;
                        i39 = 1;
                    } else {
                        i39 = 0;
                    }
                    this.attended_school_flag += i39;
                    roster = list.get(i212);
                    int i294 = b;
                    int i295 = ((i294 ^ 109) | (i294 & 109)) << 1;
                    int i296 = -(((~i294) & 109) | (i294 & (-110)));
                    int i297 = (i295 ^ i296) + ((i296 & i295) << 1);
                    a = i297 % 128;
                    int i298 = i297 % 2;
                    if (roster.higher_education_flag != -1) {
                        int i299 = b;
                        i46 = ((i299 | 41) << 1) - (i299 ^ 41);
                        a = i46 % 128;
                        if (i46 % 2 != 0) {
                            int i300 = list.get(i212).higher_education_flag;
                            throw null;
                        }
                        if (list.get(i212).higher_education_flag == 0) {
                            i40 = 1;
                        } else {
                            i40 = 0;
                        }
                    } else {
                        i40 = 0;
                    }
                    this.higher_education_flag = (this.higher_education_flag - (~(-(~(-(-i40)))))) - 2;
                    i41 = a + 39;
                    b = i41 % 128;
                    if (i41 % 2 == 0) {
                        int i301 = list.get(i212).employment_status_flag;
                        throw null;
                    }
                    if (list.get(i212).employment_status_flag != -1) {
                        roster4 = list.get(i212);
                        int i302 = a;
                        int i303 = (i302 | 103) << 1;
                        int i304 = -(i302 ^ 103);
                        int i305 = ((i303 | i304) << 1) - (i304 ^ i303);
                        b = i305 % 128;
                        int i306 = i305 % 2;
                        if (roster4.employment_status_flag == 0) {
                            i42 = 1;
                        } else {
                            i42 = 0;
                        }
                    } else {
                        i42 = 0;
                    }
                    int i307 = this.employment_status_flag;
                    int i308 = -(-i42);
                    int i309 = ((~i308) & i307) | ((~i307) & i308);
                    int i310 = -(-((i308 & i307) << 1));
                    this.employment_status_flag = (i309 & i310) + (i310 | i309);
                    if (list.get(i212).work_activity_flag != -1) {
                        roster3 = list.get(i212);
                        int i311 = b + 35;
                        a = i311 % 128;
                        int i312 = i311 % 2;
                        if (roster3.work_activity_flag == 0) {
                            i43 = 1;
                        } else {
                            i43 = 0;
                        }
                    } else {
                        i43 = 0;
                    }
                    int i313 = this.work_activity_flag;
                    int i314 = -(-i43);
                    int i315 = i313 & i314;
                    this.work_activity_flag = i315 + ((i314 ^ i313) | i315);
                    roster2 = list.get(i212);
                    int i316 = a;
                    i44 = ((((i316 ^ 5) | (i316 & 5)) << 1) - (~(-(((~i316) & 5) | (i316 & (-6)))))) - 1;
                    b = i44 % 128;
                    if (i44 % 2 == 0) {
                        int i317 = 24 / 0;
                        if (roster2.hours_worked_flag != -1) {
                            if (list.get(i212).hours_worked_flag == 0) {
                                int i318 = 2 % 2;
                                i45 = 1;
                            }
                        }
                        int i319 = this.hours_worked_flag;
                        int i320 = -(-i45);
                        this.hours_worked_flag = ((i319 ^ i320) - (~(-(-((i320 & i319) << 1))))) - 1;
                        int i321 = i212 & 1;
                        int i322 = (i212 | 1) & (~i321);
                        int i323 = i321 << 1;
                        i212 = ((i322 & i323) << 1) + (i322 ^ i323);
                        int i324 = a;
                        int i325 = ((i324 ^ 89) | (i324 & 89)) << 1;
                        int i326 = -(((~i324) & 89) | (i324 & (-90)));
                        int i327 = (i325 & i326) + (i326 | i325);
                        b = i327 % 128;
                        int i328 = i327 % 2;
                        int i329 = 2 % 2;
                    } else {
                        if (roster2.hours_worked_flag != -1) {
                            if (list.get(i212).hours_worked_flag == 0) {
                                int i3110 = 2 % 2;
                                i45 = 1;
                            }
                        }
                        int i3111 = this.hours_worked_flag;
                        int i3210 = -(-i45);
                        this.hours_worked_flag = ((i3111 ^ i3210) - (~(-(-((i3210 & i3111) << 1))))) - 1;
                        int i3211 = i212 & 1;
                        int i3212 = (i212 | 1) & (~i3211);
                        int i3213 = i3211 << 1;
                        i212 = ((i3212 & i3213) << 1) + (i3212 ^ i3213);
                        int i3214 = a;
                        int i3215 = ((i3214 ^ 89) | (i3214 & 89)) << 1;
                        int i3216 = -(((~i3214) & 89) | (i3214 & (-90)));
                        int i3217 = (i3215 & i3216) + (i3216 | i3215);
                        b = i3217 % 128;
                        int i3218 = i3217 % 2;
                        int i3219 = 2 % 2;
                    }
                    i45 = 0;
                    int i3112 = this.hours_worked_flag;
                    int i32110 = -(-i45);
                    this.hours_worked_flag = ((i3112 ^ i32110) - (~(-(-((i32110 & i3112) << 1))))) - 1;
                    int i32111 = i212 & 1;
                    int i32112 = (i212 | 1) & (~i32111);
                    int i32113 = i32111 << 1;
                    i212 = ((i32112 & i32113) << 1) + (i32112 ^ i32113);
                    int i32114 = a;
                    int i32115 = ((i32114 ^ 89) | (i32114 & 89)) << 1;
                    int i32116 = -(((~i32114) & 89) | (i32114 & (-90)));
                    int i32117 = (i32115 & i32116) + (i32116 | i32115);
                    b = i32117 % 128;
                    int i32118 = i32117 % 2;
                    int i32119 = 2 % 2;
                } else {
                    if (i240 != -1) {
                        if (list.get(i212).merital_status_flag == 0) {
                        }
                    }
                    int i2410 = this.marital_status_flag;
                    int i2411 = -(~i28);
                    this.marital_status_flag = (-2) - (((i2410 & i2411) + (i2411 | i2410)) ^ (-1));
                    int i2412 = (-2) - ((a + 88) ^ (-1));
                    b = i2412 % 128;
                    int i2413 = i2412 % 2;
                    if (list.get(i212).cnic_flag == -1) {
                        i29 = 0;
                    } else {
                        i29 = 0;
                    }
                    int i2510 = this.cnic_flag;
                    this.cnic_flag = (i2510 & i29) + (i29 | i2510);
                    if (list.get(i212).cnic_option_flag == -1) {
                        i30 = 0;
                    } else {
                        i30 = 0;
                    }
                    this.cnic_option_flag = (-2) - ((this.cnic_option_flag - (~(-(-i30)))) ^ (-1));
                    if (list.get(i212).is_bisp_flag == -1) {
                        i31 = 0;
                    } else {
                        i31 = 0;
                    }
                    int i2511 = this.is_bisp_flag;
                    int i2512 = -(~(-(-i31)));
                    int i2513 = ((i2511 | i2512) << 1) - (i2512 ^ i2511);
                    this.is_bisp_flag = (i2513 ^ (-1)) + (i2513 << 1);
                    if (list.get(i212).bform_flag == -1) {
                        int i2514 = 2 % 2;
                        i32 = 0;
                    } else {
                        int i2515 = 2 % 2;
                        i32 = 0;
                    }
                    this.bform_flag = (this.bform_flag - (~i32)) - 1;
                    i33 = list.get(i212).disability_flag;
                    i34 = a;
                    int i2516 = i34 & 89;
                    int i2610 = i2516 + ((i34 ^ 89) | i2516);
                    b = i2610 % 128;
                    int i2611 = i2610 % 2;
                    if (i33 != -1) {
                        int i2612 = i34 & 53;
                        int i2613 = (i34 ^ 53) | i2612;
                        int i2614 = (i2612 ^ i2613) + ((i2612 & i2613) << 1);
                        b = i2614 % 128;
                        int i2615 = i2614 % 2;
                        if (list.get(i212).disability_flag == 0) {
                            int i2616 = a;
                            int i2617 = i2616 ^ 51;
                            int i2618 = ((((i2616 & 51) | i2617) << 1) - (~(-i2617))) - 1;
                            b = i2618 % 128;
                            int i2619 = i2618 % 2;
                            int i2710 = 2 % 2;
                            i35 = 1;
                        } else {
                            i35 = 0;
                        }
                    } else {
                        i35 = 0;
                    }
                    int i2711 = this.disability_flag;
                    int i2712 = -(-i35);
                    int i2713 = i2711 & i2712;
                    int i2714 = (i2712 | i2711) & (~i2713);
                    int i2715 = -(-(i2713 << 1));
                    this.disability_flag = ((i2714 | i2715) << 1) - (i2714 ^ i2715);
                    if (list.get(i212).chronic_disease_flag == -1) {
                        i36 = 0;
                    } else {
                        i36 = 0;
                    }
                    int i2716 = this.chronic_disease_flag;
                    int i2810 = -(~(-(-i36)));
                    this.chronic_disease_flag = ((i2716 & i2810) + (i2810 | i2716)) - 1;
                    if (list.get(i212).language_flag == -1) {
                        i37 = 0;
                    } else {
                        i37 = 0;
                    }
                    int i2811 = this.language_flag;
                    int i2812 = -(-i37);
                    int i2813 = i2811 & i2812;
                    int i2814 = i2812 | i2811;
                    this.language_flag = ((i2813 | i2814) << 1) - (i2814 ^ i2813);
                    int i2815 = b;
                    i38 = (((i2815 | 100) << 1) - (i2815 ^ 100)) - 1;
                    a = i38 % 128;
                    if (i38 % 2 != 0) {
                        int i2816 = list.get(i212).attended_school_flag;
                        throw null;
                    }
                    if (list.get(i212).attended_school_flag == -1) {
                        i39 = 0;
                    } else {
                        i39 = 0;
                    }
                    this.attended_school_flag += i39;
                    roster = list.get(i212);
                    int i2910 = b;
                    int i2911 = ((i2910 ^ 109) | (i2910 & 109)) << 1;
                    int i2912 = -(((~i2910) & 109) | (i2910 & (-110)));
                    int i2913 = (i2911 ^ i2912) + ((i2912 & i2911) << 1);
                    a = i2913 % 128;
                    int i2914 = i2913 % 2;
                    if (roster.higher_education_flag != -1) {
                        int i2915 = b;
                        i46 = ((i2915 | 41) << 1) - (i2915 ^ 41);
                        a = i46 % 128;
                        if (i46 % 2 != 0) {
                            int i3010 = list.get(i212).higher_education_flag;
                            throw null;
                        }
                        if (list.get(i212).higher_education_flag == 0) {
                            i40 = 1;
                        } else {
                            i40 = 0;
                        }
                    } else {
                        i40 = 0;
                    }
                    this.higher_education_flag = (this.higher_education_flag - (~(-(~(-(-i40)))))) - 2;
                    i41 = a + 39;
                    b = i41 % 128;
                    if (i41 % 2 == 0) {
                        int i3011 = list.get(i212).employment_status_flag;
                        throw null;
                    }
                    if (list.get(i212).employment_status_flag != -1) {
                        roster4 = list.get(i212);
                        int i3012 = a;
                        int i3013 = (i3012 | 103) << 1;
                        int i3014 = -(i3012 ^ 103);
                        int i3015 = ((i3013 | i3014) << 1) - (i3014 ^ i3013);
                        b = i3015 % 128;
                        int i3016 = i3015 % 2;
                        if (roster4.employment_status_flag == 0) {
                            i42 = 1;
                        } else {
                            i42 = 0;
                        }
                    } else {
                        i42 = 0;
                    }
                    int i3017 = this.employment_status_flag;
                    int i3018 = -(-i42);
                    int i3019 = ((~i3018) & i3017) | ((~i3017) & i3018);
                    int i3113 = -(-((i3018 & i3017) << 1));
                    this.employment_status_flag = (i3019 & i3113) + (i3113 | i3019);
                    if (list.get(i212).work_activity_flag != -1) {
                        roster3 = list.get(i212);
                        int i3114 = b + 35;
                        a = i3114 % 128;
                        int i3115 = i3114 % 2;
                        if (roster3.work_activity_flag == 0) {
                            i43 = 1;
                        } else {
                            i43 = 0;
                        }
                    } else {
                        i43 = 0;
                    }
                    int i3116 = this.work_activity_flag;
                    int i3117 = -(-i43);
                    int i3118 = i3116 & i3117;
                    this.work_activity_flag = i3118 + ((i3117 ^ i3116) | i3118);
                    roster2 = list.get(i212);
                    int i3119 = a;
                    i44 = ((((i3119 ^ 5) | (i3119 & 5)) << 1) - (~(-(((~i3119) & 5) | (i3119 & (-6)))))) - 1;
                    b = i44 % 128;
                    if (i44 % 2 == 0) {
                        int i3120 = 24 / 0;
                        if (roster2.hours_worked_flag != -1) {
                            if (list.get(i212).hours_worked_flag == 0) {
                                int i31110 = 2 % 2;
                                i45 = 1;
                            }
                        }
                        int i31111 = this.hours_worked_flag;
                        int i321110 = -(-i45);
                        this.hours_worked_flag = ((i31111 ^ i321110) - (~(-(-((i321110 & i31111) << 1))))) - 1;
                        int i321111 = i212 & 1;
                        int i321112 = (i212 | 1) & (~i321111);
                        int i321113 = i321111 << 1;
                        i212 = ((i321112 & i321113) << 1) + (i321112 ^ i321113);
                        int i321114 = a;
                        int i321115 = ((i321114 ^ 89) | (i321114 & 89)) << 1;
                        int i321116 = -(((~i321114) & 89) | (i321114 & (-90)));
                        int i321117 = (i321115 & i321116) + (i321116 | i321115);
                        b = i321117 % 128;
                        int i321118 = i321117 % 2;
                        int i321119 = 2 % 2;
                    } else {
                        if (roster2.hours_worked_flag != -1) {
                            if (list.get(i212).hours_worked_flag == 0) {
                                int i31112 = 2 % 2;
                                i45 = 1;
                            }
                        }
                        int i31113 = this.hours_worked_flag;
                        int i3211110 = -(-i45);
                        this.hours_worked_flag = ((i31113 ^ i3211110) - (~(-(-((i3211110 & i31113) << 1))))) - 1;
                        int i3211111 = i212 & 1;
                        int i3211112 = (i212 | 1) & (~i3211111);
                        int i3211113 = i3211111 << 1;
                        i212 = ((i3211112 & i3211113) << 1) + (i3211112 ^ i3211113);
                        int i3211114 = a;
                        int i3211115 = ((i3211114 ^ 89) | (i3211114 & 89)) << 1;
                        int i3211116 = -(((~i3211114) & 89) | (i3211114 & (-90)));
                        int i3211117 = (i3211115 & i3211116) + (i3211116 | i3211115);
                        b = i3211117 % 128;
                        int i3211118 = i3211117 % 2;
                        int i3211119 = 2 % 2;
                    }
                    i45 = 0;
                    int i31114 = this.hours_worked_flag;
                    int i32111110 = -(-i45);
                    this.hours_worked_flag = ((i31114 ^ i32111110) - (~(-(-((i32111110 & i31114) << 1))))) - 1;
                    int i32111111 = i212 & 1;
                    int i32111112 = (i212 | 1) & (~i32111111);
                    int i32111113 = i32111111 << 1;
                    i212 = ((i32111112 & i32111113) << 1) + (i32111112 ^ i32111113);
                    int i32111114 = a;
                    int i32111115 = ((i32111114 ^ 89) | (i32111114 & 89)) << 1;
                    int i32111116 = -(((~i32111114) & 89) | (i32111114 & (-90)));
                    int i32111117 = (i32111115 & i32111116) + (i32111116 | i32111115);
                    b = i32111117 % 128;
                    int i32111118 = i32111117 % 2;
                    int i32111119 = 2 % 2;
                }
                i28 = 0;
                int i2414 = this.marital_status_flag;
                int i2415 = -(~i28);
                this.marital_status_flag = (-2) - (((i2414 & i2415) + (i2415 | i2414)) ^ (-1));
                int i2416 = (-2) - ((a + 88) ^ (-1));
                b = i2416 % 128;
                int i2417 = i2416 % 2;
                if (list.get(i212).cnic_flag == -1) {
                    i29 = 0;
                } else {
                    i29 = 0;
                }
                int i2517 = this.cnic_flag;
                this.cnic_flag = (i2517 & i29) + (i29 | i2517);
                if (list.get(i212).cnic_option_flag == -1) {
                    i30 = 0;
                } else {
                    i30 = 0;
                }
                this.cnic_option_flag = (-2) - ((this.cnic_option_flag - (~(-(-i30)))) ^ (-1));
                if (list.get(i212).is_bisp_flag == -1) {
                    i31 = 0;
                } else {
                    i31 = 0;
                }
                int i2518 = this.is_bisp_flag;
                int i2519 = -(~(-(-i31)));
                int i25110 = ((i2518 | i2519) << 1) - (i2519 ^ i2518);
                this.is_bisp_flag = (i25110 ^ (-1)) + (i25110 << 1);
                if (list.get(i212).bform_flag == -1) {
                    int i25111 = 2 % 2;
                    i32 = 0;
                } else {
                    int i25112 = 2 % 2;
                    i32 = 0;
                }
                this.bform_flag = (this.bform_flag - (~i32)) - 1;
                i33 = list.get(i212).disability_flag;
                i34 = a;
                int i25113 = i34 & 89;
                int i26110 = i25113 + ((i34 ^ 89) | i25113);
                b = i26110 % 128;
                int i26111 = i26110 % 2;
                if (i33 != -1) {
                    int i26112 = i34 & 53;
                    int i26113 = (i34 ^ 53) | i26112;
                    int i26114 = (i26112 ^ i26113) + ((i26112 & i26113) << 1);
                    b = i26114 % 128;
                    int i26115 = i26114 % 2;
                    if (list.get(i212).disability_flag == 0) {
                        int i26116 = a;
                        int i26117 = i26116 ^ 51;
                        int i26118 = ((((i26116 & 51) | i26117) << 1) - (~(-i26117))) - 1;
                        b = i26118 % 128;
                        int i26119 = i26118 % 2;
                        int i2717 = 2 % 2;
                        i35 = 1;
                    } else {
                        i35 = 0;
                    }
                } else {
                    i35 = 0;
                }
                int i2718 = this.disability_flag;
                int i2719 = -(-i35);
                int i27110 = i2718 & i2719;
                int i27111 = (i2719 | i2718) & (~i27110);
                int i27112 = -(-(i27110 << 1));
                this.disability_flag = ((i27111 | i27112) << 1) - (i27111 ^ i27112);
                if (list.get(i212).chronic_disease_flag == -1) {
                    i36 = 0;
                } else {
                    i36 = 0;
                }
                int i27113 = this.chronic_disease_flag;
                int i2817 = -(~(-(-i36)));
                this.chronic_disease_flag = ((i27113 & i2817) + (i2817 | i27113)) - 1;
                if (list.get(i212).language_flag == -1) {
                    i37 = 0;
                } else {
                    i37 = 0;
                }
                int i2818 = this.language_flag;
                int i2819 = -(-i37);
                int i28110 = i2818 & i2819;
                int i28111 = i2819 | i2818;
                this.language_flag = ((i28110 | i28111) << 1) - (i28111 ^ i28110);
                int i28112 = b;
                i38 = (((i28112 | 100) << 1) - (i28112 ^ 100)) - 1;
                a = i38 % 128;
                if (i38 % 2 != 0) {
                    int i28113 = list.get(i212).attended_school_flag;
                    throw null;
                }
                if (list.get(i212).attended_school_flag == -1) {
                    i39 = 0;
                } else {
                    i39 = 0;
                }
                this.attended_school_flag += i39;
                roster = list.get(i212);
                int i2916 = b;
                int i2917 = ((i2916 ^ 109) | (i2916 & 109)) << 1;
                int i2918 = -(((~i2916) & 109) | (i2916 & (-110)));
                int i2919 = (i2917 ^ i2918) + ((i2918 & i2917) << 1);
                a = i2919 % 128;
                int i29110 = i2919 % 2;
                if (roster.higher_education_flag != -1) {
                    int i29111 = b;
                    i46 = ((i29111 | 41) << 1) - (i29111 ^ 41);
                    a = i46 % 128;
                    if (i46 % 2 != 0) {
                        int i30110 = list.get(i212).higher_education_flag;
                        throw null;
                    }
                    if (list.get(i212).higher_education_flag == 0) {
                        i40 = 1;
                    } else {
                        i40 = 0;
                    }
                } else {
                    i40 = 0;
                }
                this.higher_education_flag = (this.higher_education_flag - (~(-(~(-(-i40)))))) - 2;
                i41 = a + 39;
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    int i30111 = list.get(i212).employment_status_flag;
                    throw null;
                }
                if (list.get(i212).employment_status_flag != -1) {
                    roster4 = list.get(i212);
                    int i30112 = a;
                    int i30113 = (i30112 | 103) << 1;
                    int i30114 = -(i30112 ^ 103);
                    int i30115 = ((i30113 | i30114) << 1) - (i30114 ^ i30113);
                    b = i30115 % 128;
                    int i30116 = i30115 % 2;
                    if (roster4.employment_status_flag == 0) {
                        i42 = 1;
                    } else {
                        i42 = 0;
                    }
                } else {
                    i42 = 0;
                }
                int i30117 = this.employment_status_flag;
                int i30118 = -(-i42);
                int i30119 = ((~i30118) & i30117) | ((~i30117) & i30118);
                int i31115 = -(-((i30118 & i30117) << 1));
                this.employment_status_flag = (i30119 & i31115) + (i31115 | i30119);
                if (list.get(i212).work_activity_flag != -1) {
                    roster3 = list.get(i212);
                    int i31116 = b + 35;
                    a = i31116 % 128;
                    int i31117 = i31116 % 2;
                    if (roster3.work_activity_flag == 0) {
                        i43 = 1;
                    } else {
                        i43 = 0;
                    }
                } else {
                    i43 = 0;
                }
                int i31118 = this.work_activity_flag;
                int i31119 = -(-i43);
                int i31120 = i31118 & i31119;
                this.work_activity_flag = i31120 + ((i31119 ^ i31118) | i31120);
                roster2 = list.get(i212);
                int i31121 = a;
                i44 = ((((i31121 ^ 5) | (i31121 & 5)) << 1) - (~(-(((~i31121) & 5) | (i31121 & (-6)))))) - 1;
                b = i44 % 128;
                if (i44 % 2 == 0) {
                    int i3121 = 24 / 0;
                    if (roster2.hours_worked_flag != -1) {
                        if (list.get(i212).hours_worked_flag == 0) {
                            int i311110 = 2 % 2;
                            i45 = 1;
                        }
                    }
                    int i311111 = this.hours_worked_flag;
                    int i321111110 = -(-i45);
                    this.hours_worked_flag = ((i311111 ^ i321111110) - (~(-(-((i321111110 & i311111) << 1))))) - 1;
                    int i321111111 = i212 & 1;
                    int i321111112 = (i212 | 1) & (~i321111111);
                    int i321111113 = i321111111 << 1;
                    i212 = ((i321111112 & i321111113) << 1) + (i321111112 ^ i321111113);
                    int i321111114 = a;
                    int i321111115 = ((i321111114 ^ 89) | (i321111114 & 89)) << 1;
                    int i321111116 = -(((~i321111114) & 89) | (i321111114 & (-90)));
                    int i321111117 = (i321111115 & i321111116) + (i321111116 | i321111115);
                    b = i321111117 % 128;
                    int i321111118 = i321111117 % 2;
                    int i321111119 = 2 % 2;
                } else {
                    if (roster2.hours_worked_flag != -1) {
                        if (list.get(i212).hours_worked_flag == 0) {
                            int i311112 = 2 % 2;
                            i45 = 1;
                        }
                    }
                    int i311113 = this.hours_worked_flag;
                    int i3211111110 = -(-i45);
                    this.hours_worked_flag = ((i311113 ^ i3211111110) - (~(-(-((i3211111110 & i311113) << 1))))) - 1;
                    int i3211111111 = i212 & 1;
                    int i3211111112 = (i212 | 1) & (~i3211111111);
                    int i3211111113 = i3211111111 << 1;
                    i212 = ((i3211111112 & i3211111113) << 1) + (i3211111112 ^ i3211111113);
                    int i3211111114 = a;
                    int i3211111115 = ((i3211111114 ^ 89) | (i3211111114 & 89)) << 1;
                    int i3211111116 = -(((~i3211111114) & 89) | (i3211111114 & (-90)));
                    int i3211111117 = (i3211111115 & i3211111116) + (i3211111116 | i3211111115);
                    b = i3211111117 % 128;
                    int i3211111118 = i3211111117 % 2;
                    int i3211111119 = 2 % 2;
                }
                i45 = 0;
                int i311114 = this.hours_worked_flag;
                int i32111111110 = -(-i45);
                this.hours_worked_flag = ((i311114 ^ i32111111110) - (~(-(-((i32111111110 & i311114) << 1))))) - 1;
                int i32111111111 = i212 & 1;
                int i32111111112 = (i212 | 1) & (~i32111111111);
                int i32111111113 = i32111111111 << 1;
                i212 = ((i32111111112 & i32111111113) << 1) + (i32111111112 ^ i32111111113);
                int i32111111114 = a;
                int i32111111115 = ((i32111111114 ^ 89) | (i32111111114 & 89)) << 1;
                int i32111111116 = -(((~i32111111114) & 89) | (i32111111114 & (-90)));
                int i32111111117 = (i32111111115 & i32111111116) + (i32111111116 | i32111111115);
                b = i32111111117 % 128;
                int i32111111118 = i32111111117 % 2;
                int i32111111119 = 2 % 2;
            }
        }
    }

    private void setEmptyValues() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 17;
        int i4 = (((i2 & 17) | i3) << 1) - i3;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.uuid = BuildConfig.FLAVOR;
        this.formNo = BuildConfig.FLAVOR;
        this.formNotAtHome = BuildConfig.FLAVOR;
        this.type = -1;
        this.interviewStatus = 0;
        this.isOffHour = 0;
        this.batchName = BuildConfig.FLAVOR;
        this.cnic = BuildConfig.FLAVOR;
        this.imeiMac = BuildConfig.FLAVOR;
        int i6 = i2 ^ 91;
        int i7 = (((i2 & 91) | i6) << 1) - i6;
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        this.rosterCount = 0;
        this.timeContactDetail = 0.0d;
        this.timeRosterDetail = 0.0d;
        this.timeAssetDetail = 0.0d;
        this.timeMiscellaneousDetail = 0.0d;
        this.serverTimeStamp = BuildConfig.FLAVOR;
        this.supervisorTimeStamp = BuildConfig.FLAVOR;
        this.isSentToServer = 0;
        this.averageRosterTime = 0.0d;
        this.headName = BuildConfig.FLAVOR;
        int i10 = (i8 & (-78)) | ((~i8) & 77);
        int i11 = -(-((i8 & 77) << 1));
        int i12 = (i10 & i11) + (i10 | i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        this.latitude = BuildConfig.FLAVOR;
        this.longitude = BuildConfig.FLAVOR;
        this.villageId = -1.0d;
        this.villageName = BuildConfig.FLAVOR;
        this.date = BuildConfig.FLAVOR;
        this.time = BuildConfig.FLAVOR;
        this.occupancy_status_flag = 0;
        this.wall_material_flag = 0;
        this.roof_material_flag = 0;
        int i14 = (i8 & 60) + (i8 | 60);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        this.cooking_fuel_flag = 0;
        this.toilet_flag = 0;
        this.drinking_water_flag = 0;
        this.electricity_flag = 0;
        this.gas_flag = 0;
        this.landline_flag = 0;
        this.land_unit_flag = 0;
        this.number_of_rooms_flag = 0;
        this.animal_flag = 0;
        this.buffalo_flag = 0;
        this.cow_flag = 0;
        int i17 = i8 & 1;
        int i18 = ((i8 ^ 1) | i17) << 1;
        int i19 = -((~i17) & (i8 | 1));
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        this.horse_flag = 0;
        this.camel_flag = 0;
        this.goat_flag = 0;
        this.land_number_flag = 0;
        this.household_agriculture_land_flag = 0;
        this.heater_flag = 0;
        this.washing_machine_flag = 0;
        this.geyser_flag = 0;
        this.air_cooler_flag = 0;
        this.air_conditioner_flag = 0;
        this.fan_flag = 0;
        int i22 = i8 + 120;
        int i23 = (i22 ^ (-1)) + (i22 << 1);
        int i24 = i23 % 128;
        b = i24;
        int i25 = i23 % 2;
        this.cooking_range_flag = 0;
        this.cooking_stove_flag = 0;
        this.tv_flag = 0;
        this.vcr_flag = 0;
        this.refrigerator_flag = 0;
        this.freezer_flag = 0;
        this.generator_flag = 0;
        this.car_flag = 0;
        this.mobile_flag = 0;
        this.tractor_flag = 0;
        this.motorcycle_flag = 0;
        int i26 = i24 & 121;
        int i27 = i26 + ((i24 ^ 121) | i26);
        int i28 = i27 % 128;
        a = i28;
        int i29 = i27 % 2;
        this.internet_flag = 0;
        this.computer_flag = 0;
        this.sewing_flag = 0;
        this.name_of_member_flag = 0;
        this.relation_to_household_flag = 0;
        this.gender_flag = 0;
        this.date_of_birth_flag = 0;
        this.marital_status_flag = 0;
        this.cnic_flag = 0;
        this.cnic_option_flag = 0;
        this.is_bisp_flag = 0;
        int i30 = i28 + 113;
        b = i30 % 128;
        if (i30 % 2 == 0) {
            this.bform_flag = 0;
            this.disability_flag = 0;
            this.chronic_disease_flag = 0;
            this.language_flag = 1;
            this.attended_school_flag = 1;
            this.higher_education_flag = 0;
            this.work_activity_flag = 0;
            this.hours_worked_flag = 1;
        } else {
            this.bform_flag = 0;
            this.disability_flag = 0;
            this.chronic_disease_flag = 0;
            this.language_flag = 0;
            this.attended_school_flag = 0;
            this.higher_education_flag = 0;
            this.work_activity_flag = 0;
            this.hours_worked_flag = 0;
        }
        this.employment_status_flag = 0;
    }
}
