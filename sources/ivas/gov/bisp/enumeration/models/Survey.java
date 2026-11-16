package ivas.gov.bisp.enumeration.models;

import android.content.Context;
import android.util.Base64;
import com.orm.SugarRecord;
import com.orm.annotation.MultiUnique;
import ivas.gov.bisp.enumeration.p026az.P;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@MultiUnique("uniqueID,imei_number")
public class Survey extends SugarRecord implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public String address_of_house;
    public String address_of_house_1;
    public String address_of_house_2;
    public String address_of_house_3;
    public String agriJson;
    public String agriTypeOption;
    public int agriTypeOptionId;
    public int air_conditioner;
    public int air_conditioner_flag;
    public int air_cooler;
    public int air_cooler_flag;
    public String alternative_contact;
    public String alternative_contact_1;
    public String alternative_contact_2;
    public String alternative_contact_3;
    public int animal;
    public int animal_flag;
    public int appVersion;
    public String appVersionName;
    public String areaCode;
    public double averageRosterTime;
    public String batchName;
    public int batch_size;
    public int bisp_benificiary;
    public int bisp_survey_taken_before;
    public int bisp_survey_taken_left;
    public int bisp_survey_taken_nearest;
    public int bisp_survey_taken_right;
    public String blockCode;
    public int buffalo;
    public int buffalo_flag;
    public int camel;
    public int camel_flag;
    public int car;
    public int car_flag;
    public String comments;
    public String complete_form;
    public int computer;
    public int computer_flag;
    public String contactDetailEnd;
    public String contactDetailStart;
    public int cooking_fuel_code;
    public int cooking_fuel_flag;
    public String cooking_fuel_status;
    public int cooking_range;
    public int cooking_range_flag;
    public int cooking_stove;
    public int cooking_stove_flag;
    public int cow;
    public int cow_flag;
    public String data_collection_modality;
    public String date;
    public String dateGPS;
    public int defence_job;
    public int deskBasedSurvey;
    public double diffContactDetail;
    public double diffHousehold;
    public double diffMiscellaneous;
    public int district_id;
    public String district_name;
    public int drinking_water_code;
    public int drinking_water_flag;
    public String drinking_water_status;
    public int electricity_code;
    public int electricity_flag;
    public String electricity_status;
    public String endTime;
    public String endTimeGPS;
    public int enumerator_id;
    public String enumerator_name;
    public int fan;
    public int fan_flag;
    public int financial_assistance;
    public String form_no;
    public String form_no_not_at_home;
    public String form_no_old;
    public int freezer;
    public int freezer_flag;
    public int gas_code;
    public int gas_flag;
    public String gas_status;
    public int generator;
    public int generator_flag;
    public int geyser;
    public int geyser_flag;
    public int goat;
    public int goat_flag;
    public int heater;
    public int heater_flag;
    public int horse;
    public int horse_flag;
    public String householdEnd;
    public String householdNo;
    public String householdNo_1;
    public String householdNo_2;
    public String householdNo_3;
    public String householdStart;
    public int household_agriculture_land;
    public int household_agriculture_land_flag;
    public byte[] image_benificiary;
    public String image_benificiary_from_enum;
    public String image_benificiary_name;
    public byte[] image_household;
    public byte[] image_household_1;
    public byte[] image_household_2;
    public byte[] image_household_3;
    public String image_household_from_enum;
    public String image_household_name;
    public String image_household_name_1;
    public String image_household_name_2;
    public String image_household_name_3;
    public byte[] image_selfie;
    public String image_selfie_from_enum;
    public String image_selfie_name;
    public byte[] image_thumb_imp;
    public String imei_number;
    public int infant_birth;
    public int infant_death;
    public int internet;
    public int internet_flag;
    public int isCompound_flag;
    public int isMultiStory_flag;
    public int isNewSurvey;
    public int isOffHour;
    public int isSelectedAtRandom;
    public int isSelectedForReSurvey;
    public int isSentToServer;
    public int isSentToSupervisor;
    public int isSingleStorey_flag;
    public int is_gps_exempted;
    public int is_hard;
    public int is_validate;
    public int land_number;
    public int land_number_flag;
    public int land_unit_code;
    public int land_unit_flag;
    public String land_unit_status;
    public int landline_code;
    public int landline_flag;
    public String landline_status;
    public String latitude;
    public int left_neighbour_survey;
    public String location;
    public double locationAccuracy;
    public String longitude;
    public int m_internet;
    public int m_internet_flag;
    public int migration;
    public String miscellaneousEnd;
    public String miscellaneousStart;
    public int mobile;
    public int mobile_flag;
    public String mobile_network;
    public String mobile_number;
    public String mobile_number_1;
    public String mobile_number_2;
    public String mobile_number_3;
    public int monthly_income;
    public int mother_lang_id;
    public int motorcycle;
    public int motorcycle_flag;
    public String name_of_head;
    public String name_of_head_1;
    public String name_of_head_2;
    public String name_of_head_3;
    public int nearest_neighbour_survey;
    public String neighbour_survey_done;
    public int number_of_rooms;
    public int number_of_rooms_flag;
    public String occupacy_status;
    public int occupacy_status_code;
    public int occupacy_status_flag;
    public String per_address;
    public int po_id;
    public String po_name;
    public String previousQR;
    public int province_id;
    public String province_name;
    public int reCollectionFlag;
    public int reason_not_to_survey;
    public String refNo;
    public int refrigerator;
    public int refrigerator_flag;
    public String region;
    public int resolve_complaint;
    public int resolve_complaint_govt;
    public int right_neighbour_survey;
    public int roof_material_code;
    public int roof_material_flag;
    public String roof_material_status;
    public List<Roster> rosterList;
    public int satisfaction_level;
    public String serverSentTimeStamp;
    public int sewing;
    public int sewing_flag;
    public int snowball_type;
    public String startTime;
    public String startTimeGPS;
    public String structureID;
    public String structureID_1;
    public String structureID_2;
    public String structureID_3;
    public String structureNo;
    public String structureNo_1;
    public String structureNo_2;
    public String structureNo_3;
    public String subLocality;
    public String supervisorSentGPSTimeStamp;
    public String supervisorSentTimeStamp;
    public String supervisor_name;
    public int surveyPickedForCnic;
    public String survey_accepted;
    public int survey_advertisement_received;
    public String survey_type;
    public String survey_verified;
    public int tabVsGpsTime;
    public int taken_loan;
    public int tehsil_id;
    public String tehsil_name;
    public String temp_address;
    public String time;
    public String timeGPS;
    public int toilet_code;
    public int toilet_flag;
    public String toilet_status;
    public int totalRosters;
    public int tractor;
    public int tractor_flag;
    public int tv;
    public int tv_flag;
    public int uc_id;
    public String uc_name;
    public String uniqueID;
    public int userType;
    public String uuid;
    public double validation_percentage = 0.0d;
    public int vcr;
    public int vcr_flag;
    public double villageAccuracy;
    public double village_id;
    public String village_map_listing;
    public String village_name;
    public String village_structure_number;
    public int visit_status_id;
    public int visit_status_id_1;
    public int visit_status_id_2;
    public int visit_status_id_3;
    public String visit_status_reason;
    public String visit_status_reason_1;
    public String visit_status_reason_2;
    public String visit_status_reason_3;
    public int wall_material_code;
    public int wall_material_flag;
    public String wall_material_status;
    public int washing_machine;
    public int washing_machine_flag;

    public Survey() {
        setEmptyValues();
    }

    private boolean isDefaultValueSet(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 33) + ((i3 & 33) << 1);
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i == -1) {
            int i6 = ((i5 ^ 29) | (i5 & 29)) << 1;
            int i7 = -((i5 & (-30)) | ((~i5) & 29));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            int i10 = ((i3 ^ 36) + ((i3 & 36) << 1)) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        int i12 = a;
        int i13 = ((i12 & 106) + (i12 | 106)) - 1;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public String getAddress_of_house() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = (i2 ^ 13) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.address_of_house;
        int i7 = i2 ^ 103;
        int i8 = ((i2 & 103) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 90 / 0;
        }
        return str;
    }

    public String getLocation() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 78) << 1) - (i2 ^ 78)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.location;
        int i4 = i2 + 6;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return str;
    }

    public String getMobile_number() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = i3 + ((i2 ^ 117) | i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.mobile_number;
        }
        throw null;
    }

    public String getNameOfHead() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 61;
        int i4 = (i2 ^ 61) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        String str = this.name_of_head;
        int i7 = ((i2 | 105) << 1) - (i2 ^ 105);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 66) + (i2 | 66)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        String string = getJson().toString();
        int i5 = a;
        int i6 = (i5 & 33) + (i5 | 33);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:16:0x007e  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r2
  0x0029: PHI (r2v7 java.util.List<ivas.gov.bisp.enumeration.models.Roster>) = 
  (r2v6 java.util.List<ivas.gov.bisp.enumeration.models.Roster>)
  (r2v26 java.util.List<ivas.gov.bisp.enumeration.models.Roster>)
 binds: [B:8:0x0027, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public List<Roster> getAllRosters() {
        List<Roster> list;
        int i;
        int i2;
        Roster roster;
        int i3;
        Roster roster2;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 93;
        int i7 = ((((i5 ^ 93) | i6) << 1) - (~(-((i5 | 93) & (~i6))))) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            list = this.rosterList;
            int i8 = 41 / 0;
            if (list != null) {
                if (list.size() > 0) {
                    int i9 = b;
                    int i10 = i9 ^ 1;
                    int i11 = -(-((i9 & 1) << 1));
                    int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = i9 & 1;
                    int i15 = (i9 ^ 1) | i14;
                    int i16 = (i14 & i15) + (i15 | i14);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    i = 0;
                    while (i < this.rosterList.size()) {
                        int i18 = b;
                        int i19 = (i18 & (-64)) | ((~i18) & 63);
                        int i20 = -(-((i18 & 63) << 1));
                        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                        a = i21 % 128;
                        i2 = i21 % 2;
                        roster = this.rosterList.get(i);
                        if (i2 != 0) {
                            int i22 = 45 / 0;
                        }
                        i3 = a + 23;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            roster.surveyType = "1";
                            roster2 = this.rosterList.get(i);
                            int i23 = 80 / 0;
                        } else {
                            roster.surveyType = "1";
                            roster2 = this.rosterList.get(i);
                        }
                        roster2.surveyUuid = this.uniqueID;
                        Roster roster3 = this.rosterList.get(i);
                        int i24 = a;
                        int i25 = i24 & 71;
                        int i26 = (((i24 ^ 71) | i25) << 1) - ((i24 | 71) & (~i25));
                        b = i26 % 128;
                        int i27 = i26 % 2;
                        roster3.surveyFormNo = this.form_no;
                        int i28 = (i & (-101)) | ((~i) & 100);
                        int i29 = (i & 100) << 1;
                        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                        i = ((i30 & (-98)) + (i30 | (-98))) - 1;
                        int i31 = a;
                        int i32 = i31 & 37;
                        int i33 = i32 + ((i31 ^ 37) | i32);
                        b = i33 % 128;
                        int i34 = i33 % 2;
                    }
                }
            }
        } else {
            list = this.rosterList;
            if (list != null) {
                if (list.size() > 0) {
                    int i35 = b;
                    int i110 = i35 ^ 1;
                    int i111 = -(-((i35 & 1) << 1));
                    int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                    a = i112 % 128;
                    int i113 = i112 % 2;
                    int i114 = i35 & 1;
                    int i115 = (i35 ^ 1) | i114;
                    int i116 = (i114 & i115) + (i115 | i114);
                    a = i116 % 128;
                    int i117 = i116 % 2;
                    i = 0;
                    while (i < this.rosterList.size()) {
                        int i118 = b;
                        int i119 = (i118 & (-64)) | ((~i118) & 63);
                        int i210 = -(-((i118 & 63) << 1));
                        int i211 = ((i119 | i210) << 1) - (i210 ^ i119);
                        a = i211 % 128;
                        i2 = i211 % 2;
                        roster = this.rosterList.get(i);
                        if (i2 != 0) {
                            int i212 = 45 / 0;
                        }
                        i3 = a + 23;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            roster.surveyType = "1";
                            roster2 = this.rosterList.get(i);
                            int i213 = 80 / 0;
                        } else {
                            roster.surveyType = "1";
                            roster2 = this.rosterList.get(i);
                        }
                        roster2.surveyUuid = this.uniqueID;
                        Roster roster4 = this.rosterList.get(i);
                        int i214 = a;
                        int i215 = i214 & 71;
                        int i216 = (((i214 ^ 71) | i215) << 1) - ((i214 | 71) & (~i215));
                        b = i216 % 128;
                        int i217 = i216 % 2;
                        roster4.surveyFormNo = this.form_no;
                        int i218 = (i & (-101)) | ((~i) & 100);
                        int i219 = (i & 100) << 1;
                        int i36 = (i218 ^ i219) + ((i219 & i218) << 1);
                        i = ((i36 & (-98)) + (i36 | (-98))) - 1;
                        int i37 = a;
                        int i38 = i37 & 37;
                        int i39 = i38 + ((i37 ^ 37) | i38);
                        b = i39 % 128;
                        int i310 = i39 % 2;
                    }
                }
            }
        }
        List<Roster> list2 = this.rosterList;
        int i40 = b;
        int i41 = (((i40 | 84) << 1) - (i40 ^ 84)) - 1;
        a = i41 % 128;
        int i42 = i41 % 2;
        return list2;
    }

    public Survey(JSONObject jSONObject) throws JSONException {
        setFromJSON(jSONObject);
    }

    public Survey(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, String str7, double d, String str8, String str9, String str10) {
        setEmptyValues();
        this.startTime = str;
        this.startTimeGPS = str2;
        this.form_no = str3;
        this.form_no_old = str4;
        this.uuid = str5;
        this.visit_status_id = i;
        this.survey_accepted = str6;
        this.appVersion = i2;
        this.appVersionName = str7;
        this.village_id = d;
        this.village_name = str8;
        this.village_map_listing = str9;
        this.village_structure_number = str10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[Catch: JSONException -> 0x01cb, TRY_LEAVE, TryCatch #5 {JSONException -> 0x01cb, blocks: (B:3:0x000b, B:6:0x0021, B:9:0x0036, B:11:0x003d, B:16:0x0047, B:19:0x0061, B:30:0x009d, B:32:0x00a2, B:57:0x00fa, B:59:0x0114, B:61:0x012b, B:63:0x0145, B:65:0x0158, B:68:0x016c, B:70:0x0173, B:75:0x017d, B:77:0x0191, B:80:0x01a1, B:74:0x0178, B:36:0x00a7, B:42:0x00c4, B:43:0x00c8, B:44:0x00cb, B:50:0x00dd, B:52:0x00f1, B:53:0x00f4, B:54:0x00f7, B:25:0x0074, B:23:0x006d, B:15:0x0042, B:82:0x01bd, B:83:0x01c5, B:84:0x01c8), top: B:102:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0084 A[DONT_INVERT, PHI: r0
  0x0084: PHI (r0v64 int) = (r0v10 int), (r0v90 int) binds: [B:24:0x0072, B:21:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[Catch: JSONException -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #5 {JSONException -> 0x01cb, blocks: (B:3:0x000b, B:6:0x0021, B:9:0x0036, B:11:0x003d, B:16:0x0047, B:19:0x0061, B:30:0x009d, B:32:0x00a2, B:57:0x00fa, B:59:0x0114, B:61:0x012b, B:63:0x0145, B:65:0x0158, B:68:0x016c, B:70:0x0173, B:75:0x017d, B:77:0x0191, B:80:0x01a1, B:74:0x0178, B:36:0x00a7, B:42:0x00c4, B:43:0x00c8, B:44:0x00cb, B:50:0x00dd, B:52:0x00f1, B:53:0x00f4, B:54:0x00f7, B:25:0x0074, B:23:0x006d, B:15:0x0042, B:82:0x01bd, B:83:0x01c5, B:84:0x01c8), top: B:102:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[Catch: JSONException -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #5 {JSONException -> 0x01cb, blocks: (B:3:0x000b, B:6:0x0021, B:9:0x0036, B:11:0x003d, B:16:0x0047, B:19:0x0061, B:30:0x009d, B:32:0x00a2, B:57:0x00fa, B:59:0x0114, B:61:0x012b, B:63:0x0145, B:65:0x0158, B:68:0x016c, B:70:0x0173, B:75:0x017d, B:77:0x0191, B:80:0x01a1, B:74:0x0178, B:36:0x00a7, B:42:0x00c4, B:43:0x00c8, B:44:0x00cb, B:50:0x00dd, B:52:0x00f1, B:53:0x00f4, B:54:0x00f7, B:25:0x0074, B:23:0x006d, B:15:0x0042, B:82:0x01bd, B:83:0x01c5, B:84:0x01c8), top: B:102:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[Catch: JSONException -> 0x01cb, TRY_ENTER, TryCatch #5 {JSONException -> 0x01cb, blocks: (B:3:0x000b, B:6:0x0021, B:9:0x0036, B:11:0x003d, B:16:0x0047, B:19:0x0061, B:30:0x009d, B:32:0x00a2, B:57:0x00fa, B:59:0x0114, B:61:0x012b, B:63:0x0145, B:65:0x0158, B:68:0x016c, B:70:0x0173, B:75:0x017d, B:77:0x0191, B:80:0x01a1, B:74:0x0178, B:36:0x00a7, B:42:0x00c4, B:43:0x00c8, B:44:0x00cb, B:50:0x00dd, B:52:0x00f1, B:53:0x00f4, B:54:0x00f7, B:25:0x0074, B:23:0x006d, B:15:0x0042, B:82:0x01bd, B:83:0x01c5, B:84:0x01c8), top: B:102:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8 A[Catch: JSONException -> 0x01cb, TRY_LEAVE, TryCatch #5 {JSONException -> 0x01cb, blocks: (B:3:0x000b, B:6:0x0021, B:9:0x0036, B:11:0x003d, B:16:0x0047, B:19:0x0061, B:30:0x009d, B:32:0x00a2, B:57:0x00fa, B:59:0x0114, B:61:0x012b, B:63:0x0145, B:65:0x0158, B:68:0x016c, B:70:0x0173, B:75:0x017d, B:77:0x0191, B:80:0x01a1, B:74:0x0178, B:36:0x00a7, B:42:0x00c4, B:43:0x00c8, B:44:0x00cb, B:50:0x00dd, B:52:0x00f1, B:53:0x00f4, B:54:0x00f7, B:25:0x0074, B:23:0x006d, B:15:0x0042, B:82:0x01bd, B:83:0x01c5, B:84:0x01c8), top: B:102:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd A[Catch: JSONException -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #5 {JSONException -> 0x01cb, blocks: (B:3:0x000b, B:6:0x0021, B:9:0x0036, B:11:0x003d, B:16:0x0047, B:19:0x0061, B:30:0x009d, B:32:0x00a2, B:57:0x00fa, B:59:0x0114, B:61:0x012b, B:63:0x0145, B:65:0x0158, B:68:0x016c, B:70:0x0173, B:75:0x017d, B:77:0x0191, B:80:0x01a1, B:74:0x0178, B:36:0x00a7, B:42:0x00c4, B:43:0x00c8, B:44:0x00cb, B:50:0x00dd, B:52:0x00f1, B:53:0x00f4, B:54:0x00f7, B:25:0x0074, B:23:0x006d, B:15:0x0042, B:82:0x01bd, B:83:0x01c5, B:84:0x01c8), top: B:102:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1 A[Catch: JSONException -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #5 {JSONException -> 0x01cb, blocks: (B:3:0x000b, B:6:0x0021, B:9:0x0036, B:11:0x003d, B:16:0x0047, B:19:0x0061, B:30:0x009d, B:32:0x00a2, B:57:0x00fa, B:59:0x0114, B:61:0x012b, B:63:0x0145, B:65:0x0158, B:68:0x016c, B:70:0x0173, B:75:0x017d, B:77:0x0191, B:80:0x01a1, B:74:0x0178, B:36:0x00a7, B:42:0x00c4, B:43:0x00c8, B:44:0x00cb, B:50:0x00dd, B:52:0x00f1, B:53:0x00f4, B:54:0x00f7, B:25:0x0074, B:23:0x006d, B:15:0x0042, B:82:0x01bd, B:83:0x01c5, B:84:0x01c8), top: B:102:0x000b }] */
    private JSONObject getJson() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            int i6 = this.visit_status_id;
            int i7 = a;
            int i8 = i7 & 53;
            int i9 = i8 + ((i7 ^ 53) | i8);
            b = i9 % 128;
            Object obj = null;
            if (i9 % 2 == 0) {
                jSONObject.put("visit_status_id", i6);
                jSONObject.put("unique_id", this.uniqueID);
                obj.hashCode();
                throw null;
            }
            jSONObject.put("visit_status_id", i6);
            jSONObject.put("unique_id", this.uniqueID);
            int i10 = b + 23;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObject.put("form_no", this.form_no);
                int i11 = 49 / 0;
            } else {
                jSONObject.put("form_no", this.form_no);
            }
            jSONObject.put("form_no_old", this.form_no_old);
            String str = this.batchName;
            int i12 = (-2) - ((b + 58) ^ (-1));
            a = i12 % 128;
            if (i12 % 2 != 0) {
                jSONObject.put("batch_name", str);
                i = this.userType;
                int i13 = 12 / 0;
                if (i == 0) {
                    jSONObject.put("user_type", "enum");
                    int i14 = a + 57;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                } else if (i == 1) {
                    int i16 = b;
                    int i17 = i16 & 103;
                    i4 = (((i16 | 103) & (~i17)) - (~(-(-(i17 << 1))))) - 1;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        jSONObject.put("user_type", "super");
                        int i18 = 93 / 0;
                    } else {
                        jSONObject.put("user_type", "super");
                    }
                    int i19 = a + 1;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                } else if (i == 3) {
                    i3 = a + 35;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        jSONObject.put("user_type", "super_verified");
                        throw null;
                    }
                    jSONObject.put("user_type", "super_verified");
                } else if (i == 2) {
                    i2 = b + 35;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        jSONObject.put("user_type", "not_at_home");
                        obj.hashCode();
                        throw null;
                    }
                    jSONObject.put("user_type", "not_at_home");
                    int i21 = a;
                    int i22 = i21 & 105;
                    int i23 = i21 | 105;
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                }
            } else {
                jSONObject.put("batch_name", str);
                i = this.userType;
                if (i == 0) {
                    jSONObject.put("user_type", "enum");
                    int i110 = a + 57;
                    b = i110 % 128;
                    int i111 = i110 % 2;
                } else if (i == 1) {
                    int i112 = b;
                    int i113 = i112 & 103;
                    i4 = (((i112 | 103) & (~i113)) - (~(-(-(i113 << 1))))) - 1;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        jSONObject.put("user_type", "super");
                        int i114 = 93 / 0;
                    } else {
                        jSONObject.put("user_type", "super");
                    }
                    int i115 = a + 1;
                    b = i115 % 128;
                    int i26 = i115 % 2;
                } else if (i == 3) {
                    i3 = a + 35;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        jSONObject.put("user_type", "super_verified");
                        throw null;
                    }
                    jSONObject.put("user_type", "super_verified");
                } else if (i == 2) {
                    i2 = b + 35;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        jSONObject.put("user_type", "not_at_home");
                        obj.hashCode();
                        throw null;
                    }
                    jSONObject.put("user_type", "not_at_home");
                    int i27 = a;
                    int i28 = i27 & 105;
                    int i29 = i27 | 105;
                    int i210 = (i28 ^ i29) + ((i29 & i28) << 1);
                    b = i210 % 128;
                    int i211 = i210 % 2;
                }
            }
            jSONObject.put("enumerator_name", this.enumerator_name);
            int i30 = b;
            int i31 = i30 & 19;
            int i32 = -(-((i30 ^ 19) | i31));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            a = i33 % 128;
            int i34 = i33 % 2;
            jSONObject.put("form_no_not_at_home", this.form_no_not_at_home);
            int i35 = b;
            int i36 = i35 & 83;
            int i37 = ((i35 | 83) & (~i36)) + (i36 << 1);
            a = i37 % 128;
            int i38 = i37 % 2;
            jSONObject.put("survey_accepted", this.survey_accepted);
            int i39 = b;
            int i40 = i39 & 89;
            int i41 = -(-((i39 ^ 89) | i40));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            a = i42 % 128;
            int i43 = i42 % 2;
            jSONObject.put("survey_verified", this.survey_verified);
            int i44 = b;
            int i45 = (i44 & 99) + (i44 | 99);
            a = i45 % 128;
            int i46 = i45 % 2;
            jSONObject.put("validation_percentage", this.validation_percentage);
            int i47 = b + 109;
            a = i47 % 128;
            if (i47 % 2 != 0) {
                jSONObject.put("is_selected_at_random", this.isSelectedAtRandom);
                int i48 = 49 / 0;
            } else {
                jSONObject.put("is_selected_at_random", this.isSelectedAtRandom);
            }
            jSONObject.put("is_selected_for_resurvey", this.isSelectedForReSurvey);
            int i49 = (-2) - ((b + 60) ^ (-1));
            int i50 = i49 % 128;
            a = i50;
            int i51 = i49 % 2;
            List<Roster> list = this.rosterList;
            if (list != null) {
                int i52 = (((i50 | 110) << 1) - (i50 ^ 110)) - 1;
                b = i52 % 128;
                int i53 = i52 % 2;
                jSONObject.put("roster", list.size());
                int i54 = b;
                int i55 = (i54 & (-84)) | ((~i54) & 83);
                int i56 = (i54 & 83) << 1;
                int i57 = (i55 & i56) + (i56 | i55);
                a = i57 % 128;
                int i58 = i57 % 2;
            }
            int i59 = b;
            int i60 = (i59 ^ 103) + ((i59 & 103) << 1);
            a = i60 % 128;
            if (i60 % 2 != 0) {
                int i61 = 30 / 0;
            }
            return jSONObject;
        } catch (JSONException unused) {
        }
    }

    public JSONObject getJSONForSuper(List<Roster> list, int i) throws JSONException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        int i3 = this.occupacy_status_code;
        if (i3 != 0) {
            jSONObject3.put("occupacy_status_code", i3);
            jSONObject3.put("occupacy_status", this.occupacy_status);
            int i4 = a;
            int i5 = i4 & 113;
            int i6 = (i4 | 113) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            jSONObject3.put("occupacy_status_flag", this.occupacy_status_flag);
        }
        int i10 = this.wall_material_code;
        if (i10 != 0) {
            jSONObject3.put("wall_material_code", i10);
            jSONObject3.put("wall_material_status", this.wall_material_status);
            int i11 = a + 111;
            b = i11 % 128;
            int i12 = i11 % 2;
            jSONObject3.put("wall_material_flag", this.wall_material_flag);
        }
        int i13 = this.roof_material_code;
        if (i13 != 0) {
            jSONObject3.put("roof_material_code", i13);
            jSONObject3.put("roof_material_status", this.roof_material_status);
            int i14 = this.roof_material_flag;
            int i15 = b;
            int i16 = i15 & 9;
            int i17 = ((((i15 ^ 9) | i16) << 1) - (~(-((i15 | 9) & (~i16))))) - 1;
            a = i17 % 128;
            int i18 = i17 % 2;
            jSONObject3.put("roof_material_flag", i14);
        }
        int i19 = this.cooking_fuel_code;
        if (i19 != 0) {
            jSONObject3.put("cooking_fuel_code", i19);
            jSONObject3.put("cooking_fuel_status", this.cooking_fuel_status);
            jSONObject3.put("cooking_fuel_flag", this.cooking_fuel_flag);
        }
        int i20 = this.toilet_code;
        Object obj = null;
        if (i20 != 0) {
            jSONObject3.put("toilet_code", i20);
            int i21 = a;
            int i22 = (((i21 & (-16)) | ((~i21) & 15)) - (~((i21 & 15) << 1))) - 1;
            b = i22 % 128;
            if (i22 % 2 == 0) {
                jSONObject3.put("toilet_status", this.toilet_status);
                throw null;
            }
            jSONObject3.put("toilet_status", this.toilet_status);
            jSONObject3.put("toilet_flag", this.toilet_flag);
        }
        int i23 = this.drinking_water_code;
        if (i23 != 0) {
            jSONObject3.put("drinking_water_code", i23);
            jSONObject3.put("drinking_water_status", this.drinking_water_status);
            jSONObject3.put("drinking_water_flag", this.drinking_water_flag);
        }
        int i24 = this.electricity_code;
        int i25 = 0;
        if (i24 != 0) {
            int i26 = a;
            int i27 = i26 | 13;
            int i28 = (i27 << 1) - ((~(i26 & 13)) & i27);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                jSONObject3.put("electricity_code", i24);
                int i29 = 14 / 0;
            } else {
                jSONObject3.put("electricity_code", i24);
            }
            jSONObject3.put("electricity_status", this.electricity_status);
            jSONObject3.put("electricity_flag", this.electricity_flag);
        }
        int i30 = this.gas_code;
        if (i30 != 0) {
            int i31 = b;
            int i32 = i31 & 35;
            int i33 = (i31 | 35) & (~i32);
            int i34 = i32 << 1;
            int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
            a = i35 % 128;
            int i36 = i35 % 2;
            jSONObject3.put("gas_code", i30);
            jSONObject3.put("gas_status", this.gas_status);
            jSONObject3.put("gas_flag", this.gas_flag);
            int i37 = b + 43;
            a = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = this.landline_code;
        if (i39 != 0) {
            jSONObject3.put("landline_code", i39);
            jSONObject3.put("landline_status", this.landline_status);
            int i40 = this.landline_flag;
            int i41 = b;
            int i42 = i41 & 61;
            int i43 = (i41 ^ 61) | i42;
            int i44 = (i42 & i43) + (i43 | i42);
            a = i44 % 128;
            if (i44 % 2 != 0) {
                jSONObject3.put("landline_flag", i40);
                throw null;
            }
            jSONObject3.put("landline_flag", i40);
        }
        int i45 = this.land_unit_code;
        if (i45 != 0) {
            int i46 = b;
            int i47 = (i46 & 33) + (i46 | 33);
            a = i47 % 128;
            if (i47 % 2 != 0) {
                jSONObject3.put("land_unit_code", i45);
                int i48 = 26 / 0;
            } else {
                jSONObject3.put("land_unit_code", i45);
            }
            int i49 = b;
            int i50 = ((i49 | 53) << 1) - (i49 ^ 53);
            a = i50 % 128;
            if (i50 % 2 != 0) {
                jSONObject3.put("land_unit_status", this.land_unit_status);
                throw null;
            }
            jSONObject3.put("land_unit_status", this.land_unit_status);
            jSONObject3.put("land_unit_flag", this.land_unit_flag);
        }
        int i51 = this.number_of_rooms;
        if (i51 != 0) {
            jSONObject3.put("number_of_rooms", i51);
            int i52 = a;
            int i53 = (((i52 | 126) << 1) - (i52 ^ 126)) - 1;
            b = i53 % 128;
            if (i53 % 2 == 0) {
                jSONObject3.put("number_of_rooms_flag", this.number_of_rooms_flag);
                int i54 = 72 / 0;
            } else {
                jSONObject3.put("number_of_rooms_flag", this.number_of_rooms_flag);
            }
        }
        if (!isDefaultValueSet(this.animal)) {
            int i55 = a;
            int i56 = ((i55 ^ 85) | (i55 & 85)) << 1;
            int i57 = -(((~i55) & 85) | (i55 & (-86)));
            int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
            b = i58 % 128;
            if (i58 % 2 == 0) {
                jSONObject3.put("animal", this.animal);
                throw null;
            }
            jSONObject3.put("animal", this.animal);
            jSONObject3.put("animal_flag", this.animal_flag);
        }
        int i59 = this.buffalo;
        if (i59 != 0) {
            int i60 = b;
            int i61 = (i60 & 13) + (i60 | 13);
            a = i61 % 128;
            int i62 = i61 % 2;
            jSONObject3.put("buffalo", i59);
            jSONObject3.put("buffalo_flag", this.buffalo_flag);
        }
        int i63 = this.cow;
        if (i63 != 0) {
            int i64 = b;
            int i65 = (i64 ^ 45) + ((i64 & 45) << 1);
            a = i65 % 128;
            int i66 = i65 % 2;
            jSONObject3.put("cow", i63);
            jSONObject3.put("cow_flag", this.cow_flag);
        }
        int i67 = this.horse;
        if (i67 != 0) {
            jSONObject3.put("horse", i67);
            jSONObject3.put("horse_flag", this.horse_flag);
        }
        int i68 = this.camel;
        if (i68 != 0) {
            jSONObject3.put("camel", i68);
            int i69 = b;
            int i70 = (i69 ^ 61) + ((i69 & 61) << 1);
            a = i70 % 128;
            int i71 = i70 % 2;
            jSONObject3.put("camel_flag", this.camel_flag);
            int i72 = a;
            int i73 = ((i72 | 3) << 1) - (((~i72) & 3) | (i72 & (-4)));
            b = i73 % 128;
            int i74 = i73 % 2;
        }
        int i75 = this.goat;
        if (i75 != 0) {
            int i76 = b + 75;
            a = i76 % 128;
            int i77 = i76 % 2;
            jSONObject3.put("goat", i75);
            jSONObject3.put("goat_flag", this.goat_flag);
        }
        int i78 = this.land_number;
        if (i78 != 0) {
            jSONObject3.put("land_number", i78);
            jSONObject3.put("land_number_flag", this.land_number_flag);
            int i79 = b + 123;
            a = i79 % 128;
            int i80 = i79 % 2;
        }
        if (!isDefaultValueSet(this.household_agriculture_land)) {
            jSONObject3.put("household_agriculture_land", this.household_agriculture_land);
            int i81 = a + 109;
            b = i81 % 128;
            int i82 = i81 % 2;
            jSONObject3.put("household_agriculture_land_flag", this.household_agriculture_land_flag);
            int i83 = a;
            int i84 = i83 & 47;
            int i85 = -(-((i83 ^ 47) | i84));
            int i86 = (i84 & i85) + (i85 | i84);
            b = i86 % 128;
            int i87 = i86 % 2;
        }
        if (!isDefaultValueSet(this.heater)) {
            jSONObject3.put("heater", this.heater);
            int i88 = a;
            int i89 = i88 & 67;
            int i90 = (i88 | 67) & (~i89);
            int i91 = i89 << 1;
            int i92 = ((i90 | i91) << 1) - (i90 ^ i91);
            b = i92 % 128;
            if (i92 % 2 == 0) {
                jSONObject3.put("heater_flag", this.heater_flag);
                obj.hashCode();
                throw null;
            }
            jSONObject3.put("heater_flag", this.heater_flag);
        }
        if (!isDefaultValueSet(this.washing_machine)) {
            jSONObject3.put("washing_machine", this.washing_machine);
            int i93 = a;
            int i94 = i93 & 87;
            int i95 = ((i93 | 87) & (~i94)) + (i94 << 1);
            b = i95 % 128;
            int i96 = i95 % 2;
            jSONObject3.put("washing_machine_flag", this.washing_machine_flag);
        }
        if (!isDefaultValueSet(this.geyser)) {
            jSONObject3.put("geyser", this.geyser);
            jSONObject3.put("geyser_flag", this.geyser_flag);
            int i97 = b;
            int i98 = ((i97 & (-100)) | ((~i97) & 99)) + ((i97 & 99) << 1);
            a = i98 % 128;
            int i99 = i98 % 2;
        }
        if (!isDefaultValueSet(this.air_cooler)) {
            jSONObject3.put("air_cooler", this.air_cooler);
            int i100 = a + 125;
            b = i100 % 128;
            if (i100 % 2 == 0) {
                jSONObject3.put("air_cooler_flag", this.air_cooler_flag);
                throw null;
            }
            jSONObject3.put("air_cooler_flag", this.air_cooler_flag);
        }
        if (!isDefaultValueSet(this.air_conditioner)) {
            jSONObject3.put("air_conditioner", this.air_conditioner);
            jSONObject3.put("air_conditioner_flag", this.air_conditioner_flag);
            int i101 = b;
            int i102 = i101 | 41;
            int i103 = i102 << 1;
            int i104 = -((~(i101 & 41)) & i102);
            int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
            a = i105 % 128;
            int i106 = i105 % 2;
        }
        if (!isDefaultValueSet(this.fan)) {
            jSONObject3.put("fan", this.fan);
            jSONObject3.put("fan_flag", this.fan_flag);
            int i107 = b;
            int i108 = i107 & 35;
            int i109 = -(-((i107 ^ 35) | i108));
            int i110 = (i108 & i109) + (i109 | i108);
            a = i110 % 128;
            if (i110 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        if (!isDefaultValueSet(this.cooking_range)) {
            jSONObject3.put("cooking_range", this.cooking_range);
            int i111 = b;
            int i112 = (-2) - ((((i111 | 26) << 1) - (i111 ^ 26)) ^ (-1));
            a = i112 % 128;
            if (i112 % 2 != 0) {
                jSONObject3.put("cooking_range_flag", this.cooking_range_flag);
                obj.hashCode();
                throw null;
            }
            jSONObject3.put("cooking_range_flag", this.cooking_range_flag);
        }
        if (!isDefaultValueSet(this.cooking_stove)) {
            jSONObject3.put("cooking_stove", this.cooking_stove);
            jSONObject3.put("cooking_stove_flag", this.cooking_stove_flag);
            int i113 = b;
            int i114 = i113 & 99;
            int i115 = ((i113 | 99) & (~i114)) + (i114 << 1);
            a = i115 % 128;
            int i116 = i115 % 2;
        }
        if (!isDefaultValueSet(this.tv)) {
            jSONObject3.put("tv", this.tv);
            int i117 = b;
            int i118 = ((i117 & 39) - (~(i117 | 39))) - 1;
            a = i118 % 128;
            int i119 = i118 % 2;
            jSONObject3.put("tv_flag", this.tv_flag);
            int i120 = b;
            int i121 = ((i120 & (-22)) | ((~i120) & 21)) + ((i120 & 21) << 1);
            a = i121 % 128;
            if (i121 % 2 != 0) {
                throw null;
            }
        }
        if (!isDefaultValueSet(this.vcr)) {
            jSONObject3.put("vcr", this.vcr);
            int i122 = a;
            int i123 = (i122 ^ 5) + ((i122 & 5) << 1);
            b = i123 % 128;
            if (i123 % 2 == 0) {
                jSONObject3.put("vcr_flag", this.vcr_flag);
                obj.hashCode();
                throw null;
            }
            jSONObject3.put("vcr_flag", this.vcr_flag);
        }
        if (!isDefaultValueSet(this.refrigerator)) {
            jSONObject3.put("refrigerator", this.refrigerator);
            jSONObject3.put("refrigerator_flag", this.refrigerator_flag);
            int i124 = b;
            int i125 = i124 & 79;
            int i126 = (i124 | 79) & (~i125);
            int i127 = -(-(i125 << 1));
            int i128 = (i126 ^ i127) + ((i126 & i127) << 1);
            a = i128 % 128;
            int i129 = i128 % 2;
        }
        if (!isDefaultValueSet(this.freezer)) {
            jSONObject3.put("freezer", this.freezer);
            jSONObject3.put("freezer_flag", this.freezer_flag);
            int i130 = b;
            int i131 = i130 & 67;
            int i132 = -(-((i130 ^ 67) | i131));
            int i133 = (i131 & i132) + (i132 | i131);
            a = i133 % 128;
            if (i133 % 2 != 0) {
                int i134 = 3 % 2;
            }
        }
        if (!isDefaultValueSet(this.generator)) {
            jSONObject3.put("generator", this.generator);
            jSONObject3.put("generator_flag", this.generator_flag);
        }
        if (!isDefaultValueSet(this.car)) {
            jSONObject3.put("car", this.car);
            int i135 = b;
            int i136 = i135 & 1;
            int i137 = (i135 ^ 1) | i136;
            int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
            a = i138 % 128;
            int i139 = i138 % 2;
            jSONObject3.put("car_flag", this.car_flag);
        }
        if (!isDefaultValueSet(this.mobile)) {
            jSONObject3.put("mobile", this.mobile);
            int i140 = b;
            int i141 = i140 & 85;
            int i142 = (i140 ^ 85) | i141;
            int i143 = (i141 ^ i142) + ((i142 & i141) << 1);
            a = i143 % 128;
            int i144 = i143 % 2;
            jSONObject3.put("mobile_flag", this.mobile_flag);
        }
        if (!isDefaultValueSet(this.tractor)) {
            jSONObject3.put("tractor", this.tractor);
            int i145 = a;
            int i146 = i145 & 79;
            int i147 = (i146 - (~((i145 ^ 79) | i146))) - 1;
            b = i147 % 128;
            int i148 = i147 % 2;
            jSONObject3.put("tractor_flag", this.tractor_flag);
            int i149 = b;
            int i150 = ((i149 ^ 9) | (i149 & 9)) << 1;
            int i151 = -(((~i149) & 9) | (i149 & (-10)));
            int i152 = (i150 ^ i151) + ((i151 & i150) << 1);
            a = i152 % 128;
            int i153 = i152 % 2;
        }
        if (!isDefaultValueSet(this.motorcycle)) {
            int i154 = b;
            int i155 = (i154 | 21) << 1;
            int i156 = -(i154 ^ 21);
            int i157 = ((i155 | i156) << 1) - (i156 ^ i155);
            a = i157 % 128;
            if (i157 % 2 != 0) {
                jSONObject3.put("motorcycle", this.motorcycle);
                int i158 = 46 / 0;
            } else {
                jSONObject3.put("motorcycle", this.motorcycle);
            }
            jSONObject3.put("motorcycle_flag", this.motorcycle_flag);
        }
        if (!isDefaultValueSet(this.internet)) {
            jSONObject3.put("internet", this.internet);
            jSONObject3.put("internet_flag", this.internet_flag);
        }
        if (!isDefaultValueSet(this.m_internet)) {
            jSONObject3.put("m_internet", this.m_internet);
            int i159 = a + 21;
            b = i159 % 128;
            int i160 = i159 % 2;
            jSONObject3.put("m_internet_flag", this.m_internet_flag);
        }
        if (!isDefaultValueSet(this.computer)) {
            jSONObject3.put("computer", this.computer);
            int i161 = a;
            int i162 = (((i161 ^ 113) | (i161 & 113)) << 1) - (((~i161) & 113) | (i161 & (-114)));
            b = i162 % 128;
            int i163 = i162 % 2;
            jSONObject3.put("computer_flag", this.computer_flag);
        }
        if (!isDefaultValueSet(this.sewing)) {
            jSONObject3.put("sewing", this.sewing);
            jSONObject3.put("sewing_flag", this.sewing_flag);
        }
        jSONObject2.put("apk_type", "signed");
        jSONObject2.put("is_new_survey", 1);
        jSONObject2.put("date", this.date);
        jSONObject2.put("date_gps", this.dateGPS);
        jSONObject2.put("time", this.time);
        jSONObject2.put("time_gps", this.timeGPS);
        jSONObject2.put("start_time", this.startTime);
        jSONObject2.put("start_time_gps", this.startTimeGPS);
        jSONObject2.put("end_time", this.endTime);
        jSONObject2.put("end_time_gps", this.endTimeGPS);
        jSONObject2.put("imei_number", this.imei_number);
        jSONObject2.put("supervisor_name", this.supervisor_name);
        jSONObject2.put("app_version", this.appVersion);
        jSONObject2.put("app_version_name", this.appVersionName);
        int i164 = b;
        int i165 = ((i164 ^ 69) | (i164 & 69)) << 1;
        int i166 = -(((~i164) & 69) | (i164 & (-70)));
        int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
        a = i167 % 128;
        int i168 = i167 % 2;
        jSONObject2.put("previous_qr", this.previousQR);
        jSONObject2.put("batch_name", this.batchName);
        jSONObject2.put("is_selected_at_random", this.isSelectedAtRandom);
        jSONObject2.put("is_selected_for_resurvey", this.isSelectedForReSurvey);
        int i169 = this.visit_status_id;
        int i170 = b + 69;
        a = i170 % 128;
        int i171 = i170 % 2;
        jSONObject2.put("visit_status_id", i169);
        jSONObject2.put("mother_lang_id", this.mother_lang_id);
        jSONObject2.put("data_collection_modality", this.data_collection_modality);
        jSONObject2.put("average_roster_time", this.averageRosterTime);
        jSONObject2.put("visit_status_reason", this.visit_status_reason);
        jSONObject2.put("uuid", this.uuid);
        jSONObject2.put("is_off_hour", this.isOffHour);
        jSONObject2.put("unique_id", this.uniqueID);
        jSONObject2.put("form_no", this.form_no);
        jSONObject2.put("form_no_old", this.form_no_old);
        int i172 = a;
        int i173 = i172 & 49;
        int i174 = i173 + ((i172 ^ 49) | i173);
        b = i174 % 128;
        int i175 = i174 % 2;
        jSONObject2.put("form_no_not_at_home", this.form_no_not_at_home);
        jSONObject2.put("re_collection_flag", this.reCollectionFlag);
        jSONObject2.put("validation_percentage", this.validation_percentage);
        jSONObject2.put("location", this.location);
        jSONObject2.put("longitude", this.longitude);
        jSONObject2.put("latitude", this.latitude);
        jSONObject2.put("location_accuracy", this.locationAccuracy);
        jSONObject2.put("supervisor_name", this.supervisor_name);
        if (this.survey_verified == null) {
            int i176 = a;
            int i177 = ((i176 ^ 115) | (i176 & 115)) << 1;
            int i178 = -(((~i176) & 115) | (i176 & (-116)));
            int i179 = (i177 & i178) + (i178 | i177);
            b = i179 % 128;
            if (i179 % 2 == 0) {
                this.survey_verified = BuildConfig.FLAVOR;
                int i180 = 59 / 0;
            } else {
                this.survey_verified = BuildConfig.FLAVOR;
            }
        }
        if (this.survey_accepted == null) {
            this.survey_accepted = BuildConfig.FLAVOR;
            int i181 = b;
            int i182 = (i181 & 51) + (i181 | 51);
            a = i182 % 128;
            int i183 = i182 % 2;
        }
        jSONObject2.put("survey_verified", this.survey_verified);
        String str = this.survey_accepted;
        int i184 = a;
        int i185 = (i184 & 35) + (i184 | 35);
        b = i185 % 128;
        if (i185 % 2 == 0) {
            jSONObject2.put("survey_accepted", str);
            jSONObject2.put("contact_detail_start", this.contactDetailStart);
            int i186 = 33 / 0;
        } else {
            jSONObject2.put("survey_accepted", str);
            jSONObject2.put("contact_detail_start", this.contactDetailStart);
        }
        jSONObject2.put("contact_detail_end", this.contactDetailEnd);
        jSONObject2.put("diff_contact_detail", this.diffContactDetail);
        int i187 = b;
        int i188 = ((i187 | 69) << 1) - (i187 ^ 69);
        a = i188 % 128;
        int i189 = i188 % 2;
        jSONObject2.put("household_start", this.householdStart);
        jSONObject2.put("household_end", this.householdEnd);
        jSONObject2.put("diff_household", this.diffHousehold);
        int i190 = a;
        int i191 = (-2) - (((i190 & 58) + (i190 | 58)) ^ (-1));
        b = i191 % 128;
        int i192 = i191 % 2;
        jSONObject2.put("miscellaneous_start", this.miscellaneousStart);
        jSONObject2.put("miscellaneous_end", this.miscellaneousEnd);
        int i193 = b;
        int i194 = i193 & 119;
        int i195 = (i193 ^ 119) | i194;
        int i196 = (i194 ^ i195) + ((i195 & i194) << 1);
        a = i196 % 128;
        if (i196 % 2 != 0) {
            jSONObject2.put("diff_miscellaneous", this.diffMiscellaneous);
            jSONObject.put("household_info", jSONObject3);
            obj.hashCode();
            throw null;
        }
        jSONObject2.put("diff_miscellaneous", this.diffMiscellaneous);
        jSONObject.put("household_info", jSONObject3);
        jSONObject.put("survey_information", jSONObject2);
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            while (i25 < list.size()) {
                JSONObject json = list.get(i25).getJSON(i);
                json.remove("cnic_pic");
                jSONArray.put(json);
                int i197 = i25 & 1;
                int i198 = -(-((i25 ^ 1) | i197));
                i25 = (i197 & i198) + (i197 | i198);
            }
            jSONObject.put("roster", jSONArray);
            int i199 = b;
            int i200 = i199 & 29;
            int i201 = ((((i199 ^ 29) | i200) << 1) - (~(-((i199 | 29) & (~i200))))) - 1;
            a = i201 % 128;
            int i202 = i201 % 2;
        }
        return jSONObject;
    }

    public Survey(String str, String str2) {
        setEmptyValues();
        this.startTime = str;
        this.startTimeGPS = str2;
    }

    /* JADX WARN: Code duplicated, block: B:756:0x0f34  */
    /* JADX WARN: Code duplicated, block: B:77:0x0182  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    public void setFromJSON(JSONObject jSONObject) throws JSONException {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        double d;
        int i;
        String string9;
        String string10;
        String string11;
        int i2;
        String string12;
        int i3;
        String string13;
        String string14;
        String string15;
        String string16;
        double d2;
        String string17;
        JSONObject jSONObject2;
        int i4;
        JSONObject jSONObject3;
        int i5;
        String string18;
        int i6;
        String string19;
        String string20;
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
        JSONObject jSONObject4;
        int i19;
        int i20;
        int i21 = 2 % 2;
        setEmptyValues();
        JSONObject jSONObject5 = jSONObject.has("contact_details") ? jSONObject.getJSONObject("contact_details") : new JSONObject();
        JSONObject jSONObject6 = jSONObject.has("pictures") ? jSONObject.getJSONObject("pictures") : new JSONObject();
        JSONObject jSONObject7 = jSONObject.has("survey_information") ? jSONObject.getJSONObject("survey_information") : new JSONObject();
        JSONObject jSONObject8 = jSONObject.has("geographic_location") ? jSONObject.getJSONObject("geographic_location") : new JSONObject();
        int i22 = 0;
        if (jSONObject.has("miscellaneous")) {
            if (jSONObject.has("miscellaneous")) {
                int i23 = b + 121;
                a = i23 % 128;
                if (i23 % 2 != 0) {
                    jSONObject4 = jSONObject.getJSONObject("miscellaneous");
                    int i24 = 93 / 0;
                } else {
                    jSONObject4 = jSONObject.getJSONObject("miscellaneous");
                }
            } else {
                jSONObject4 = new JSONObject();
            }
            if (jSONObject4.has("taken_loan")) {
                i19 = jSONObject4.getInt("taken_loan");
            } else {
                int i25 = a;
                int i26 = ((i25 ^ 70) + ((i25 & 70) << 1)) - 1;
                b = i26 % 128;
                int i27 = i26 % 2;
                i19 = 0;
            }
            this.taken_loan = i19;
            this.monthly_income = jSONObject4.has("monthly_income") ? jSONObject4.getInt("monthly_income") : 0;
            if (jSONObject4.has("satisfaction_level")) {
                int i28 = a;
                int i29 = ((i28 ^ 38) + ((i28 & 38) << 1)) - 1;
                b = i29 % 128;
                int i30 = i29 % 2;
                i20 = jSONObject4.getInt("satisfaction_level");
            } else {
                i20 = 0;
            }
            this.satisfaction_level = i20;
            this.resolve_complaint = jSONObject4.has("resolve_complaint") ? jSONObject4.getInt("resolve_complaint") : 0;
            this.resolve_complaint_govt = jSONObject4.has("resolve_complaint_govt") ? jSONObject4.getInt("resolve_complaint_govt") : 0;
            this.infant_death = jSONObject4.has("infant_death") ? jSONObject4.getInt("infant_death") : -1;
            this.infant_birth = jSONObject4.has("infant_birth") ? jSONObject4.getInt("infant_birth") : -1;
            this.defence_job = jSONObject4.has("defence_job") ? jSONObject4.getInt("defence_job") : -1;
            this.migration = jSONObject4.has("migration") ^ true ? -1 : jSONObject4.getInt("migration");
            this.financial_assistance = jSONObject4.has("financial_assistance") ? jSONObject4.getInt("financial_assistance") : -1;
        }
        boolean zHas = jSONObject.has("household_info");
        String string21 = null;
        String string22 = BuildConfig.FLAVOR;
        if (zHas) {
            int i31 = a;
            int i32 = ((i31 | 111) << 1) - (i31 ^ 111);
            b = i32 % 128;
            if (i32 % 2 == 0) {
                int i33 = 6 / 0;
                if (jSONObject.has("household_info")) {
                    jSONObject3 = jSONObject.getJSONObject("household_info");
                    int i34 = b;
                    int i35 = ((i34 & (-48)) | (47 & (~i34))) + ((i34 & 47) << 1);
                    a = i35 % 128;
                    int i36 = i35 % 2;
                } else {
                    jSONObject3 = new JSONObject();
                }
            } else if (jSONObject.has("household_info")) {
                jSONObject3 = jSONObject.getJSONObject("household_info");
                int i37 = b;
                int i38 = ((i37 & (-48)) | (47 & (~i37))) + ((i37 & 47) << 1);
                a = i38 % 128;
                int i39 = i38 % 2;
            } else {
                jSONObject3 = new JSONObject();
            }
            this.occupacy_status_code = jSONObject3.has("occupacy_status_code") ? jSONObject3.getInt("occupacy_status_code") : 0;
            this.occupacy_status = jSONObject3.has("occupacy_status") ? jSONObject3.getString("occupacy_status") : BuildConfig.FLAVOR;
            this.wall_material_code = jSONObject3.has("wall_material_code") ? jSONObject3.getInt("wall_material_code") : 0;
            this.wall_material_status = jSONObject3.has("wall_material_status") ? jSONObject3.getString("wall_material_status") : BuildConfig.FLAVOR;
            if (!jSONObject3.has("roof_material_code")) {
                i5 = 0;
            } else {
                int i40 = b;
                int i41 = (((i40 | 76) << 1) - (i40 ^ 76)) - 1;
                a = i41 % 128;
                if (i41 % 2 != 0) {
                    i5 = jSONObject3.getInt("roof_material_code");
                    int i42 = 1 / 0;
                } else {
                    i5 = jSONObject3.getInt("roof_material_code");
                }
            }
            this.roof_material_code = i5;
            if (jSONObject3.has("roof_material_status")) {
                int i43 = b;
                int i44 = (((i43 | 106) << 1) - (i43 ^ 106)) - 1;
                a = i44 % 128;
                int i45 = i44 % 2;
                string18 = jSONObject3.getString("roof_material_status");
            } else {
                string18 = BuildConfig.FLAVOR;
            }
            this.roof_material_status = string18;
            if (jSONObject3.has("cooking_fuel_code")) {
                int i46 = b;
                int i47 = (((i46 ^ 55) | (i46 & 55)) << 1) - ((i46 & (-56)) | ((~i46) & 55));
                a = i47 % 128;
                if (i47 % 2 != 0) {
                    i6 = jSONObject3.getInt("cooking_fuel_code");
                    int i48 = 1 / 0;
                } else {
                    i6 = jSONObject3.getInt("cooking_fuel_code");
                }
            } else {
                i6 = 0;
            }
            this.cooking_fuel_code = i6;
            if (jSONObject3.has("cooking_fuel_status")) {
                int i49 = a;
                int i50 = i49 ^ 95;
                int i51 = -(-((i49 & 95) << 1));
                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                b = i52 % 128;
                int i53 = i52 % 2;
                string19 = jSONObject3.getString("cooking_fuel_status");
            } else {
                string19 = BuildConfig.FLAVOR;
            }
            this.cooking_fuel_status = string19;
            this.toilet_code = jSONObject3.has("toilet_code") ? jSONObject3.getInt("toilet_code") : 0;
            if (jSONObject3.has("toilet_status")) {
                int i54 = b + 19;
                a = i54 % 128;
                int i55 = i54 % 2;
                string20 = jSONObject3.getString("toilet_status");
            } else {
                string20 = BuildConfig.FLAVOR;
            }
            this.toilet_status = string20;
            this.drinking_water_code = jSONObject3.has("drinking_water_code") ^ true ? 0 : jSONObject3.getInt("drinking_water");
            this.drinking_water_status = jSONObject3.has("drinking_water_status") ? jSONObject3.getString("drinking_water_status") : BuildConfig.FLAVOR;
            this.electricity_code = jSONObject3.has("electricity_code") ? jSONObject3.getInt("electricity_code") : 0;
            this.electricity_status = jSONObject3.has("electricity_status") ? jSONObject3.getString("electricity_status") : BuildConfig.FLAVOR;
            this.gas_code = !(jSONObject3.has("gas_code") ^ true) ? jSONObject3.getInt("gas_code") : 0;
            this.gas_status = jSONObject3.has("gas_status") ? jSONObject3.getString("gas_status") : BuildConfig.FLAVOR;
            if (jSONObject3.has("landline_code")) {
                i7 = jSONObject3.getInt("landline_code");
            } else {
                int i56 = b;
                int i57 = (i56 & 85) + (i56 | 85);
                a = i57 % 128;
                if (i57 % 2 != 0) {
                    int i58 = 2 % 4;
                }
                i7 = 0;
            }
            this.landline_code = i7;
            this.landline_status = jSONObject3.has("landline_status") ? jSONObject3.getString("landline_status") : BuildConfig.FLAVOR;
            this.land_unit_code = jSONObject3.has("land_unit_code") ? jSONObject3.getInt("land_unit_code") : 0;
            this.land_unit_status = jSONObject3.has("land_unit_status") ? jSONObject3.getString("land_unit_status") : BuildConfig.FLAVOR;
            this.number_of_rooms = jSONObject3.has("number_of_rooms") ? jSONObject3.getInt("number_of_rooms") : 0;
            this.animal = jSONObject3.has("animal") ? jSONObject3.getInt("animal") : -1;
            if (jSONObject3.has("buffalo")) {
                int i59 = a;
                int i60 = (((i59 | 102) << 1) - (i59 ^ 102)) - 1;
                b = i60 % 128;
                if (i60 % 2 == 0) {
                    jSONObject3.getInt("buffalo");
                    throw null;
                }
                i8 = jSONObject3.getInt("buffalo");
            } else {
                i8 = 0;
            }
            this.buffalo = i8;
            if (jSONObject3.has("cow")) {
                int i61 = b;
                int i62 = ((i61 ^ 35) | (i61 & 35)) << 1;
                int i63 = -((i61 & (-36)) | (35 & (~i61)));
                int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                a = i64 % 128;
                if (i64 % 2 != 0) {
                    i9 = jSONObject3.getInt("cow");
                    int i65 = 33 / 0;
                } else {
                    i9 = jSONObject3.getInt("cow");
                }
            } else {
                i9 = 0;
            }
            this.cow = i9;
            if (jSONObject3.has("horse")) {
                int i66 = b + 12;
                int i67 = (i66 ^ (-1)) + (i66 << 1);
                a = i67 % 128;
                if (i67 % 2 != 0) {
                    jSONObject3.getInt("horse");
                    string21.hashCode();
                    throw null;
                }
                i10 = jSONObject3.getInt("horse");
            } else {
                i10 = 0;
            }
            this.horse = i10;
            if (jSONObject3.has("camel")) {
                int i68 = a + 104;
                int i69 = (i68 ^ (-1)) + (i68 << 1);
                b = i69 % 128;
                if (i69 % 2 == 0) {
                    jSONObject3.getInt("camel");
                    throw null;
                }
                i11 = jSONObject3.getInt("camel");
            } else {
                i11 = 0;
            }
            this.camel = i11;
            if (jSONObject3.has("goat")) {
                int i70 = b;
                int i71 = ((i70 | 95) << 1) - (i70 ^ 95);
                a = i71 % 128;
                if (i71 % 2 != 0) {
                    jSONObject3.getInt("goat");
                    string21.hashCode();
                    throw null;
                }
                i12 = jSONObject3.getInt("goat");
            } else {
                i12 = 0;
            }
            this.goat = i12;
            this.land_number = jSONObject3.has("land_number") ? jSONObject3.getInt("land_number") : 0;
            this.household_agriculture_land = !(jSONObject3.has("household_agriculture_land") ^ true) ? jSONObject3.getInt("household_agriculture_land") : -1;
            this.heater = jSONObject3.has("heater") ? jSONObject3.getInt("heater") : -1;
            this.washing_machine = jSONObject3.has("washing_machine") ? jSONObject3.getInt("washing_machine") : -1;
            if (jSONObject3.has("geyser")) {
                int i72 = b;
                int i73 = i72 | 31;
                int i74 = i73 << 1;
                int i75 = -((~(i72 & 31)) & i73);
                int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                a = i76 % 128;
                if (i76 % 2 != 0) {
                    jSONObject3.getInt("geyser");
                    throw null;
                }
                i13 = jSONObject3.getInt("geyser");
            } else {
                i13 = -1;
            }
            this.geyser = i13;
            if (jSONObject3.has("air_cooler")) {
                int i77 = a;
                int i78 = i77 & 83;
                int i79 = (i77 ^ 83) | i78;
                int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                b = i80 % 128;
                if (i80 % 2 == 0) {
                    i14 = jSONObject3.getInt("air_cooler");
                    int i81 = 72 / 0;
                } else {
                    i14 = jSONObject3.getInt("air_cooler");
                }
            } else {
                i14 = -1;
            }
            this.air_cooler = i14;
            if (jSONObject3.has("air_conditioner")) {
                int i82 = b;
                int i83 = i82 & 85;
                int i84 = (i83 - (~(-(-((i82 ^ 85) | i83))))) - 1;
                a = i84 % 128;
                if (i84 % 2 != 0) {
                    jSONObject3.getInt("air_conditioner");
                    throw null;
                }
                i15 = jSONObject3.getInt("air_conditioner");
            } else {
                i15 = -1;
            }
            this.air_conditioner = i15;
            this.fan = jSONObject3.has("fan") ? jSONObject3.getInt("fan") : -1;
            this.cooking_range = jSONObject3.has("cooking_range") ? jSONObject3.getInt("cooking_range") : -1;
            this.cooking_stove = jSONObject3.has("cooking_stove") ? jSONObject3.getInt("cooking_stove") : -1;
            this.tv = jSONObject3.has("tv") ? jSONObject3.getInt("tv") : -1;
            this.vcr = jSONObject3.has("vcr") ? jSONObject3.getInt("vcr") : -1;
            this.refrigerator = jSONObject3.has("refrigerator") ? jSONObject3.getInt("refrigerator") : -1;
            this.freezer = jSONObject3.has("freezer") ? jSONObject3.getInt("freezer") : -1;
            this.generator = jSONObject3.has("generator") ? jSONObject3.getInt("generator") : -1;
            this.car = jSONObject3.has("car") ? jSONObject3.getInt("car") : -1;
            if (jSONObject3.has("mobile")) {
                int i85 = a;
                int i86 = (((i85 & (-64)) | ((~i85) & 63)) - (~((i85 & 63) << 1))) - 1;
                b = i86 % 128;
                if (i86 % 2 == 0) {
                    jSONObject3.getInt("mobile");
                    throw null;
                }
                i16 = jSONObject3.getInt("mobile");
            } else {
                i16 = -1;
            }
            this.mobile = i16;
            this.tractor = jSONObject3.has("tractor") ? jSONObject3.getInt("tractor") : -1;
            this.motorcycle = jSONObject3.has("motorcycle") ? jSONObject3.getInt("motorcycle") : -1;
            this.internet = jSONObject3.has("internet") ? jSONObject3.getInt("internet") : -1;
            if (jSONObject3.has("m_internet")) {
                int i87 = a;
                int i88 = (i87 & 23) + (i87 | 23);
                b = i88 % 128;
                int i89 = i88 % 2;
                i17 = jSONObject3.getInt("m_internet");
            } else {
                i17 = -1;
            }
            this.m_internet = i17;
            this.computer = jSONObject3.has("computer") ? jSONObject3.getInt("computer") : -1;
            if (jSONObject3.has("sewing")) {
                i18 = jSONObject3.getInt("sewing");
            } else {
                int i90 = b;
                int i91 = i90 & 117;
                int i92 = (i90 | 117) & (~i91);
                int i93 = i91 << 1;
                int i94 = (i92 & i93) + (i92 | i93);
                a = i94 % 128;
                int i95 = i94 % 2;
                i18 = -1;
            }
            this.sewing = i18;
        }
        if (jSONObject.has("agri_info")) {
            if (jSONObject.has("agri_info")) {
                int i96 = b;
                int i97 = (i96 & 95) + (i96 | 95);
                a = i97 % 128;
                if (i97 % 2 != 0) {
                    jSONObject.getJSONObject("agri_info");
                    string21.hashCode();
                    throw null;
                }
                jSONObject2 = jSONObject.getJSONObject("agri_info");
            } else {
                jSONObject2 = new JSONObject();
            }
            this.agriTypeOption = jSONObject2.has("agri_type_option") ? jSONObject2.getString("agri_type_option") : BuildConfig.FLAVOR;
            if (jSONObject2.has("agri_type_option_id")) {
                int i98 = a;
                int i99 = i98 & 109;
                int i100 = (i99 - (~((i98 ^ 109) | i99))) - 1;
                b = i100 % 128;
                if (i100 % 2 == 0) {
                    jSONObject2.getInt("agri_type_option_id");
                    throw null;
                }
                i4 = jSONObject2.getInt("agri_type_option_id");
            } else {
                i4 = 0;
            }
            this.agriTypeOptionId = i4;
            this.agriJson = jSONObject2.has("agri_json") ? jSONObject2.getString("agri_json") : BuildConfig.FLAVOR;
        }
        this.totalRosters = jSONObject5.has("total_rosters") ? jSONObject5.getInt("total_rosters") : 0;
        this.name_of_head = jSONObject5.has("name_of_head") ? jSONObject5.getString("name_of_head") : BuildConfig.FLAVOR;
        if (jSONObject5.has("address_of_house")) {
            int i101 = a;
            int i102 = i101 & 115;
            int i103 = i102 + ((i101 ^ 115) | i102);
            b = i103 % 128;
            int i104 = i103 % 2;
            string = jSONObject5.getString("address_of_house");
        } else {
            string = BuildConfig.FLAVOR;
        }
        this.address_of_house = string;
        this.mobile_number = !jSONObject5.has("mobile_number") ? BuildConfig.FLAVOR : jSONObject5.getString("mobile_number");
        this.mother_lang_id = jSONObject5.has("mother_lang_id") ? jSONObject5.getInt("mother_lang_id") : 0;
        this.data_collection_modality = jSONObject5.has("data_collection_modality") ? jSONObject5.getString("data_collection_modality") : BuildConfig.FLAVOR;
        if (jSONObject5.has("alternative_contact")) {
            int i105 = b;
            int i106 = i105 & 37;
            int i107 = (i105 ^ 37) | i106;
            int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
            a = i108 % 128;
            if (i108 % 2 != 0) {
                string2 = jSONObject5.getString("alternative_contact");
                int i109 = 27 / 0;
            } else {
                string2 = jSONObject5.getString("alternative_contact");
            }
        } else {
            string2 = BuildConfig.FLAVOR;
        }
        this.alternative_contact = string2;
        this.bisp_benificiary = jSONObject5.has("bisp_benificiary") ? jSONObject5.getInt("bisp_benificiary") : 0;
        this.refNo = jSONObject5.has("ref_no") ? jSONObject5.getString("ref_no") : BuildConfig.FLAVOR;
        if (jSONObject5.has("sub_locality")) {
            int i110 = a + 11;
            b = i110 % 128;
            if (i110 % 2 == 0) {
                jSONObject5.getString("sub_locality");
                string21.hashCode();
                throw null;
            }
            string3 = jSONObject5.getString("sub_locality");
        } else {
            string3 = BuildConfig.FLAVOR;
        }
        this.subLocality = string3;
        if (jSONObject5.has("household_no")) {
            int i111 = a;
            int i112 = (i111 & (-58)) | ((~i111) & 57);
            int i113 = -(-((i111 & 57) << 1));
            int i114 = (i112 & i113) + (i113 | i112);
            b = i114 % 128;
            int i115 = i114 % 2;
            string4 = jSONObject5.getString("household_no");
        } else {
            string4 = BuildConfig.FLAVOR;
        }
        this.householdNo = string4;
        this.structureNo = jSONObject5.has("structure_no") ? jSONObject5.getString("structure_no") : BuildConfig.FLAVOR;
        this.structureID = jSONObject5.has("structure_id") ? jSONObject5.getString("structure_id") : BuildConfig.FLAVOR;
        this.blockCode = jSONObject5.has("block_code") ? jSONObject5.getString("block_code") : BuildConfig.FLAVOR;
        this.areaCode = jSONObject5.has("area_code") ? jSONObject5.getString("area_code") : BuildConfig.FLAVOR;
        if (jSONObject8.has("region")) {
            int i116 = b + 77;
            a = i116 % 128;
            if (i116 % 2 != 0) {
                string5 = jSONObject8.getString("region");
                int i117 = 26 / 0;
            } else {
                string5 = jSONObject8.getString("region");
            }
        } else {
            string5 = BuildConfig.FLAVOR;
        }
        this.region = string5;
        this.is_gps_exempted = !(jSONObject8.has("is_gps_exempted") ^ true) ? jSONObject8.getInt("is_gps_exempted") : 0;
        this.is_hard = jSONObject8.has("is_hard") ? jSONObject8.getInt("is_hard") : 0;
        this.is_validate = !(jSONObject8.has("is_validate") ^ true) ? jSONObject8.getInt("is_validate") : 0;
        this.batch_size = jSONObject8.has("batch_size") ? jSONObject8.getInt("batch_size") : 1;
        this.province_id = jSONObject8.has("province_id") ? jSONObject8.getInt("province_id") : 0;
        this.province_name = jSONObject8.has("province_name") ? jSONObject8.getString("province_name") : BuildConfig.FLAVOR;
        this.district_id = jSONObject8.has("district_id") ? jSONObject8.getInt("district_id") : 0;
        if (jSONObject8.has("district_name")) {
            int i118 = a;
            int i119 = i118 & 85;
            int i120 = i118 | 85;
            int i121 = (i119 & i120) + (i120 | i119);
            b = i121 % 128;
            if (i121 % 2 == 0) {
                jSONObject8.getString("district_name");
                string21.hashCode();
                throw null;
            }
            string6 = jSONObject8.getString("district_name");
        } else {
            string6 = BuildConfig.FLAVOR;
        }
        this.district_name = string6;
        this.deskBasedSurvey = jSONObject8.has("desk_based_survey") ? jSONObject8.getInt("desk_based_survey") : 1;
        this.tehsil_id = jSONObject8.has("tehsil_id") ? jSONObject8.getInt("tehsil_id") : 0;
        this.tabVsGpsTime = jSONObject8.has("tab_vs_gps_time") ? jSONObject8.getInt("tab_vs_gps_time") : 0;
        this.tehsil_name = jSONObject8.has("tehsil_name") ? jSONObject8.getString("tehsil_name") : BuildConfig.FLAVOR;
        this.temp_address = jSONObject8.has("temp_address") ? jSONObject8.getString("temp_address") : BuildConfig.FLAVOR;
        this.per_address = jSONObject8.has("per_address") ? jSONObject8.getString("per_Address") : BuildConfig.FLAVOR;
        this.uc_id = jSONObject8.has("uc_id") ? jSONObject8.getInt("uc_id") : 0;
        this.uc_name = jSONObject8.has("uc_name") ? jSONObject8.getString("uc_name") : BuildConfig.FLAVOR;
        this.village_id = jSONObject8.has("village_id") ? jSONObject8.getInt("village_id") : 0.0d;
        this.village_name = jSONObject8.has("village_name") ? jSONObject8.getString("village_name") : BuildConfig.FLAVOR;
        if (!jSONObject8.has("village_map_list")) {
            string7 = BuildConfig.FLAVOR;
        } else {
            int i122 = b;
            int i123 = ((i122 & 90) + (i122 | 90)) - 1;
            a = i123 % 128;
            if (i123 % 2 != 0) {
                jSONObject8.getString("village_map_list");
                string21.hashCode();
                throw null;
            }
            string7 = jSONObject8.getString("village_map_list");
        }
        this.village_map_listing = string7;
        this.village_structure_number = jSONObject8.has("village_structure_number") ? jSONObject8.getString("village_structure_number") : BuildConfig.FLAVOR;
        this.po_id = !(jSONObject8.has("po_id") ^ true) ? jSONObject8.getInt("po_id") : 0;
        this.po_name = jSONObject8.has("po_name") ? jSONObject8.getString("po_name") : BuildConfig.FLAVOR;
        this.location = jSONObject8.has("location") ? jSONObject8.getString("location") : BuildConfig.FLAVOR;
        this.latitude = jSONObject8.has("latitude") ? jSONObject8.getString("latitude") : BuildConfig.FLAVOR;
        if (jSONObject8.has("longitude")) {
            int i124 = a;
            int i125 = (i124 ^ 21) + ((i124 & 21) << 1);
            b = i125 % 128;
            if (i125 % 2 == 0) {
                jSONObject8.getString("longitude");
                throw null;
            }
            string8 = jSONObject8.getString("longitude");
        } else {
            string8 = BuildConfig.FLAVOR;
        }
        this.longitude = string8;
        this.locationAccuracy = jSONObject8.has("location_accuracy") ? jSONObject8.getDouble("location_accuracy") : 0.0d;
        if (jSONObject8.has("village_accuracy")) {
            d = jSONObject8.getDouble("village_accuracy");
            int i126 = b;
            int i127 = (i126 & 53) + (i126 | 53);
            a = i127 % 128;
            int i128 = i127 % 2;
        } else {
            d = 0.0d;
        }
        this.villageAccuracy = d;
        if (jSONObject7.has("is_new_survey")) {
            int i129 = a;
            int i130 = i129 & 21;
            int i131 = (((i129 ^ 21) | i130) << 1) - ((i129 | 21) & (~i130));
            b = i131 % 128;
            int i132 = i131 % 2;
            i = jSONObject7.getInt("is_new_survey");
        } else {
            i = 0;
        }
        this.isNewSurvey = i;
        this.isSelectedForReSurvey = jSONObject7.has("is_selected_for_resurvey") ? jSONObject7.getInt("is_selected_for_resurvey") : 0;
        this.isSelectedAtRandom = jSONObject7.has("is_selected_at_random") ? jSONObject7.getInt("is_selected_at_random") : 0;
        this.batchName = jSONObject7.has("batch_name") ? jSONObject7.getString("batch_name") : BuildConfig.FLAVOR;
        this.startTime = jSONObject7.has("start_time") ? jSONObject7.getString("start_time") : BuildConfig.FLAVOR;
        this.startTimeGPS = jSONObject7.has("start_time_gps") ? jSONObject7.getString("start_time_gps") : BuildConfig.FLAVOR;
        this.endTime = jSONObject7.has("end_time") ? jSONObject7.getString("end_time") : BuildConfig.FLAVOR;
        this.endTimeGPS = jSONObject7.has("end_time_gps") ? jSONObject7.getString("end_time_gps") : BuildConfig.FLAVOR;
        this.date = jSONObject7.has("date") ? jSONObject7.getString("date") : BuildConfig.FLAVOR;
        if (jSONObject7.has("date_gps")) {
            int i133 = a;
            int i134 = i133 & 49;
            int i135 = -(-((i133 ^ 49) | i134));
            int i136 = (i134 & i135) + (i135 | i134);
            b = i136 % 128;
            if (i136 % 2 == 0) {
                jSONObject7.getString("date_gps");
                throw null;
            }
            string9 = jSONObject7.getString("date_gps");
        } else {
            string9 = BuildConfig.FLAVOR;
        }
        this.dateGPS = string9;
        if (jSONObject7.has("time")) {
            int i137 = b;
            int i138 = (((i137 ^ 25) | (i137 & 25)) << 1) - (((~i137) & 25) | (i137 & (-26)));
            a = i138 % 128;
            if (i138 % 2 != 0) {
                jSONObject7.getString("time");
                throw null;
            }
            string10 = jSONObject7.getString("time");
        } else {
            string10 = BuildConfig.FLAVOR;
        }
        this.time = string10;
        if (jSONObject7.has("time_gps")) {
            string11 = jSONObject7.getString("time_gps");
        } else {
            int i139 = b + 63;
            a = i139 % 128;
            int i140 = i139 % 2;
            string11 = BuildConfig.FLAVOR;
        }
        this.timeGPS = string11;
        this.imei_number = !jSONObject7.has("imei_number") ? BuildConfig.FLAVOR : jSONObject7.getString("imei_number");
        this.enumerator_name = jSONObject7.has("enumerator_name") ? jSONObject7.getString("enumerator_name") : BuildConfig.FLAVOR;
        int i141 = b;
        int i142 = ((i141 ^ 10) + ((i141 & 10) << 1)) - 1;
        a = i142 % 128;
        if (i142 % 2 != 0) {
            jSONObject7.has("enumerator_id");
            string21.hashCode();
            throw null;
        }
        if (jSONObject7.has("enumerator_id")) {
            int i143 = b;
            int i144 = i143 & 103;
            int i145 = i143 | 103;
            int i146 = (i144 ^ i145) + ((i145 & i144) << 1);
            a = i146 % 128;
            if (i146 % 2 != 0) {
                i2 = jSONObject7.getInt("enumerator_id");
                int i147 = 29 / 0;
            } else {
                i2 = jSONObject7.getInt("enumerator_id");
            }
        } else {
            i2 = -1;
        }
        this.enumerator_id = i2;
        this.complete_form = jSONObject7.has("complete_form") ? jSONObject7.getString("complete_form") : BuildConfig.FLAVOR;
        this.form_no = jSONObject7.has("form_no") ? jSONObject7.getString("form_no") : BuildConfig.FLAVOR;
        if (jSONObject7.has("form_no_old")) {
            int i148 = a;
            int i149 = ((i148 & 108) + (i148 | 108)) - 1;
            b = i149 % 128;
            int i150 = i149 % 2;
            string12 = jSONObject7.getString("form_no_old");
        } else {
            string12 = BuildConfig.FLAVOR;
        }
        this.form_no_old = string12;
        this.uuid = jSONObject7.has("uuid") ? jSONObject7.getString("uuid") : BuildConfig.FLAVOR;
        this.isOffHour = jSONObject7.has("is_off_hour") ? jSONObject7.getInt("is_off_hour") : 0;
        this.uniqueID = jSONObject7.has("unique_id") ? jSONObject7.getString("unique_id") : BuildConfig.FLAVOR;
        this.form_no_not_at_home = jSONObject7.has("form_no_not_at_home") ? jSONObject7.getString("form_no_not_at_home") : BuildConfig.FLAVOR;
        if (jSONObject7.has("visit_status_id")) {
            i3 = jSONObject7.getInt("visit_status_id");
            int i151 = a;
            int i152 = i151 & 115;
            int i153 = i152 + ((i151 ^ 115) | i152);
            b = i153 % 128;
            int i154 = i153 % 2;
        } else {
            i3 = 0;
        }
        this.visit_status_id = i3;
        this.averageRosterTime = jSONObject7.has("average_roster_time") ? jSONObject7.getDouble("average_roster_time") : 0.0d;
        this.appVersionName = jSONObject7.has("app_version_name") ? jSONObject7.getString("app_version_name") : BuildConfig.FLAVOR;
        this.appVersion = jSONObject7.has("app_version") ? jSONObject7.getInt("app_version") : 0;
        if (!(!jSONObject7.has("previous_qr"))) {
            int i155 = a;
            int i156 = i155 & 87;
            int i157 = (i155 ^ 87) | i156;
            int i158 = (i156 ^ i157) + ((i157 & i156) << 1);
            b = i158 % 128;
            if (i158 % 2 == 0) {
                jSONObject7.getString("previous_qr");
                string21.hashCode();
                throw null;
            }
            string13 = jSONObject7.getString("previous_qr");
        } else {
            string13 = BuildConfig.FLAVOR;
        }
        this.previousQR = string13;
        if (jSONObject7.has("visit_status_reason")) {
            int i159 = a + 41;
            b = i159 % 128;
            if (i159 % 2 == 0) {
                jSONObject7.getString("visit_status_reason");
                throw null;
            }
            string14 = jSONObject7.getString("visit_status_reason");
        } else {
            string14 = BuildConfig.FLAVOR;
        }
        this.visit_status_reason = string14;
        if (jSONObject7.has("contact_detail_start")) {
            int i160 = b;
            int i161 = i160 & 15;
            int i162 = -(-((i160 ^ 15) | i161));
            int i163 = (i161 & i162) + (i162 | i161);
            a = i163 % 128;
            int i164 = i163 % 2;
            string15 = jSONObject7.getString("contact_detail_start");
        } else {
            string15 = BuildConfig.FLAVOR;
        }
        this.contactDetailStart = string15;
        this.contactDetailEnd = jSONObject7.has("contact_detail_end") ? jSONObject7.getString("contact_detail_end") : BuildConfig.FLAVOR;
        this.householdStart = jSONObject7.has("household_start") ? jSONObject7.getString("household_start") : BuildConfig.FLAVOR;
        if (!jSONObject7.has("household_end")) {
            string16 = BuildConfig.FLAVOR;
        } else {
            int i165 = b + 95;
            a = i165 % 128;
            int i166 = i165 % 2;
            string16 = jSONObject7.getString("household_end");
        }
        this.householdEnd = string16;
        this.miscellaneousStart = jSONObject7.has("miscellaneous_start") ? jSONObject7.getString("miscellaneous_start") : BuildConfig.FLAVOR;
        this.miscellaneousEnd = jSONObject7.has("miscellaneous_end") ? jSONObject7.getString("miscellaneous_end") : BuildConfig.FLAVOR;
        if (!jSONObject7.has("diff_contact_detail")) {
            d2 = 0.0d;
        } else {
            int i167 = b;
            int i168 = i167 & 29;
            int i169 = (i167 | 29) & (~i168);
            int i170 = i168 << 1;
            int i171 = (i169 ^ i170) + ((i169 & i170) << 1);
            a = i171 % 128;
            int i172 = i171 % 2;
            d2 = jSONObject7.getInt("diff_contact_detail");
        }
        this.diffContactDetail = d2;
        this.diffHousehold = jSONObject7.has("diff_household") ? jSONObject7.getInt("diff_household") : 0.0d;
        this.diffMiscellaneous = jSONObject7.has("diff_miscellaneous") ? jSONObject7.getInt("diff_miscellaneous") : 0.0d;
        this.reCollectionFlag = !(jSONObject7.has("re_collection_flag") ^ true) ? jSONObject7.getInt("re_collection_flag") : 0;
        this.comments = jSONObject7.has("comments") ? jSONObject7.getString("comments") : BuildConfig.FLAVOR;
        if (jSONObject6.has("image_benificiary_name")) {
            string17 = jSONObject6.getString("image_benificiary_name");
        } else {
            int i173 = a;
            int i174 = ((i173 & 70) + (i173 | 70)) - 1;
            b = i174 % 128;
            int i175 = i174 % 2;
            string17 = BuildConfig.FLAVOR;
        }
        this.image_benificiary_name = string17;
        this.image_selfie_name = jSONObject6.has("image_selfie_name") ^ true ? BuildConfig.FLAVOR : jSONObject6.getString("image_selfie_name");
        this.image_household_name = jSONObject6.has("image_household_name") ? jSONObject6.getString("image_household_name") : BuildConfig.FLAVOR;
        this.image_benificiary_from_enum = jSONObject6.has("image_benificiary") ? jSONObject6.getString("image_benificiary") : null;
        this.image_household_from_enum = jSONObject6.has("image_household") ? jSONObject6.getString("image_household") : null;
        if (jSONObject6.has("image_selfie")) {
            int i176 = a + 103;
            b = i176 % 128;
            if (i176 % 2 == 0) {
                jSONObject6.getString("image_selfie");
                string21.hashCode();
                throw null;
            }
            string21 = jSONObject6.getString("image_selfie");
        }
        this.image_selfie_from_enum = string21;
        this.image_household_name_1 = jSONObject6.has("image_household_name_left") ? jSONObject6.getString("image_household_name_left") : BuildConfig.FLAVOR;
        int i177 = a + 25;
        b = i177 % 128;
        if (i177 % 2 == 0) {
            int i178 = 36 / 0;
            if (!(!jSONObject6.has("image_household_left"))) {
                this.image_household_1 = P.c(jSONObject6.getString("image_household_left"));
            }
        } else if (jSONObject6.has("image_household_left")) {
            this.image_household_1 = P.c(jSONObject6.getString("image_household_left"));
        }
        this.image_household_name_2 = jSONObject6.has("image_household_name_right") ? jSONObject6.getString("image_household_name_right") : BuildConfig.FLAVOR;
        if (jSONObject6.has("image_household_right")) {
            this.image_household_2 = P.c(jSONObject6.getString("image_household_right"));
        }
        if (jSONObject6.has("image_household_name_nearest")) {
            string22 = jSONObject6.getString("image_household_name_nearest");
        }
        this.image_household_name_3 = string22;
        if (jSONObject6.has("image_household_nearest")) {
            this.image_household_3 = P.c(jSONObject6.getString("image_household_nearest"));
        }
        this.rosterList = new ArrayList();
        if (jSONObject.has("roster")) {
            JSONArray jSONArray = jSONObject.getJSONArray("roster");
            while (i22 < jSONArray.length()) {
                this.rosterList.add(new Roster(jSONArray.getJSONObject(i22)));
                int i179 = b;
                int i180 = i179 & 23;
                int i181 = (i179 ^ 23) | i180;
                int i182 = (i180 ^ i181) + ((i181 & i180) << 1);
                a = i182 % 128;
                int i183 = i182 % 2;
                int i184 = i22 & (-100);
                int i185 = -(-((i22 ^ (-100)) | i184));
                int i186 = (i184 & i185) + (i184 | i185);
                int i187 = i186 & 101;
                i22 = i187 + ((i186 ^ 101) | i187);
            }
        }
    }

    public void setEmptyValues() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 117;
        int i4 = (i2 & 117) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.uniqueID = BuildConfig.FLAVOR;
        this.uuid = BuildConfig.FLAVOR;
        this.userType = 0;
        this.batchName = BuildConfig.FLAVOR;
        this.supervisorSentTimeStamp = BuildConfig.FLAVOR;
        this.serverSentTimeStamp = BuildConfig.FLAVOR;
        this.supervisorSentGPSTimeStamp = BuildConfig.FLAVOR;
        this.isSelectedForReSurvey = 0;
        this.totalRosters = 0;
        this.isSentToSupervisor = 0;
        this.averageRosterTime = 0.0d;
        this.isOffHour = 0;
        this.region = BuildConfig.FLAVOR;
        this.province_id = 0;
        this.province_name = BuildConfig.FLAVOR;
        this.district_id = 0;
        this.district_name = BuildConfig.FLAVOR;
        this.deskBasedSurvey = 1;
        this.tehsil_id = 0;
        this.tabVsGpsTime = 0;
        this.tehsil_name = BuildConfig.FLAVOR;
        this.temp_address = BuildConfig.FLAVOR;
        this.per_address = BuildConfig.FLAVOR;
        this.uc_id = 0;
        this.uc_name = BuildConfig.FLAVOR;
        int i7 = (i2 ^ 13) + ((i2 & 13) << 1);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        this.is_gps_exempted = 0;
        this.is_hard = 0;
        this.is_validate = 0;
        this.batch_size = 1;
        this.village_id = 0.0d;
        this.village_name = BuildConfig.FLAVOR;
        this.village_map_listing = BuildConfig.FLAVOR;
        this.village_structure_number = BuildConfig.FLAVOR;
        this.po_id = 0;
        this.po_name = BuildConfig.FLAVOR;
        this.villageAccuracy = 50.0d;
        this.visit_status_id = 0;
        this.visit_status_reason = BuildConfig.FLAVOR;
        this.mother_lang_id = 0;
        this.name_of_head = BuildConfig.FLAVOR;
        this.data_collection_modality = BuildConfig.FLAVOR;
        this.address_of_house = BuildConfig.FLAVOR;
        this.alternative_contact = BuildConfig.FLAVOR;
        this.comments = BuildConfig.FLAVOR;
        this.mobile_number = BuildConfig.FLAVOR;
        this.bisp_benificiary = 999;
        this.occupacy_status_code = 0;
        this.occupacy_status = BuildConfig.FLAVOR;
        this.wall_material_code = 0;
        int i10 = (((i8 ^ 79) | (i8 & 79)) << 1) - ((i8 & (-80)) | ((~i8) & 79));
        b = i10 % 128;
        int i11 = i10 % 2;
        this.wall_material_status = BuildConfig.FLAVOR;
        this.roof_material_code = 0;
        this.roof_material_status = BuildConfig.FLAVOR;
        this.cooking_fuel_code = 0;
        this.cooking_fuel_status = BuildConfig.FLAVOR;
        this.toilet_code = 0;
        this.toilet_status = BuildConfig.FLAVOR;
        this.drinking_water_code = 0;
        this.drinking_water_status = BuildConfig.FLAVOR;
        this.electricity_code = 0;
        this.electricity_status = BuildConfig.FLAVOR;
        this.gas_code = 0;
        this.gas_status = BuildConfig.FLAVOR;
        this.landline_code = 0;
        this.landline_status = BuildConfig.FLAVOR;
        this.land_unit_code = 0;
        this.land_unit_status = BuildConfig.FLAVOR;
        this.number_of_rooms = 0;
        this.animal = -1;
        this.buffalo = 0;
        this.cow = 0;
        this.horse = 0;
        this.camel = 0;
        this.goat = 0;
        this.land_number = 0;
        this.household_agriculture_land = -1;
        int i12 = i8 & 61;
        int i13 = ((i8 ^ 61) | i12) << 1;
        int i14 = -((i8 | 61) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        int i16 = i15 % 128;
        b = i16;
        int i17 = i15 % 2;
        this.heater = -1;
        this.washing_machine = -1;
        this.geyser = -1;
        this.air_cooler = -1;
        this.air_conditioner = -1;
        this.fan = -1;
        this.cooking_range = -1;
        this.cooking_stove = -1;
        this.tv = -1;
        this.vcr = -1;
        this.refrigerator = -1;
        this.freezer = -1;
        this.generator = -1;
        this.car = -1;
        this.mobile = -1;
        this.tractor = -1;
        this.motorcycle = -1;
        this.internet = -1;
        this.m_internet = -1;
        this.computer = -1;
        this.sewing = -1;
        this.occupacy_status_flag = -1;
        this.wall_material_flag = -1;
        this.roof_material_flag = -1;
        this.cooking_fuel_flag = -1;
        this.toilet_flag = -1;
        this.drinking_water_flag = -1;
        this.electricity_flag = -1;
        this.gas_flag = -1;
        this.landline_flag = -1;
        int i18 = i16 + 37;
        int i19 = i18 % 128;
        a = i19;
        int i20 = i18 % 2;
        this.land_unit_flag = -1;
        this.number_of_rooms_flag = -1;
        this.animal_flag = -1;
        this.buffalo_flag = -1;
        this.cow_flag = -1;
        this.horse_flag = -1;
        this.camel_flag = -1;
        this.goat_flag = -1;
        this.land_number_flag = -1;
        this.household_agriculture_land_flag = -1;
        this.heater_flag = -1;
        this.washing_machine_flag = -1;
        this.geyser_flag = -1;
        this.air_cooler_flag = -1;
        this.air_conditioner_flag = -1;
        this.fan_flag = -1;
        this.cooking_range_flag = -1;
        this.cooking_stove_flag = -1;
        this.tv_flag = -1;
        this.vcr_flag = -1;
        this.refrigerator_flag = -1;
        this.freezer_flag = -1;
        this.generator_flag = -1;
        this.car_flag = -1;
        this.mobile_flag = -1;
        this.tractor_flag = -1;
        this.motorcycle_flag = -1;
        this.internet_flag = -1;
        this.m_internet_flag = -1;
        this.computer_flag = -1;
        int i21 = i19 ^ 13;
        int i22 = -(-((i19 & 13) << 1));
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        b = i23 % 128;
        int i24 = i23 % 2;
        this.sewing_flag = -1;
        this.satisfaction_level = 0;
        this.taken_loan = 0;
        this.monthly_income = 0;
        this.resolve_complaint = 0;
        this.resolve_complaint_govt = 0;
        this.infant_death = -1;
        this.infant_birth = -1;
        this.defence_job = -1;
        this.migration = -1;
        this.financial_assistance = -1;
        this.startTime = "0000-00-00 00:00:00";
        this.startTimeGPS = "0000-00-00 00:00:00";
        this.endTime = "0000-00-00 00:00:00";
        this.endTimeGPS = "0000-00-00 00:00:00";
        this.location = BuildConfig.FLAVOR;
        this.latitude = BuildConfig.FLAVOR;
        this.longitude = BuildConfig.FLAVOR;
        this.locationAccuracy = 0.0d;
        this.date = "0000-00-00";
        this.dateGPS = "0000-00-00";
        this.time = "00:00:00";
        this.timeGPS = "00:00:00";
        this.imei_number = BuildConfig.FLAVOR;
        this.enumerator_name = BuildConfig.FLAVOR;
        this.appVersion = 0;
        this.appVersionName = BuildConfig.FLAVOR;
        this.previousQR = BuildConfig.FLAVOR;
        this.enumerator_id = -1;
        this.supervisor_name = BuildConfig.FLAVOR;
        this.complete_form = "no";
        this.form_no = BuildConfig.FLAVOR;
        this.form_no_old = BuildConfig.FLAVOR;
        this.form_no_not_at_home = BuildConfig.FLAVOR;
        this.reCollectionFlag = 0;
        this.survey_verified = BuildConfig.FLAVOR;
        this.survey_accepted = BuildConfig.FLAVOR;
        this.validation_percentage = 0.0d;
        this.rosterList = new ArrayList();
        this.image_benificiary_name = BuildConfig.FLAVOR;
        this.image_selfie_name = BuildConfig.FLAVOR;
        this.image_household_name = BuildConfig.FLAVOR;
        this.image_benificiary = null;
        this.image_selfie = null;
        this.image_household = null;
        this.image_benificiary_from_enum = BuildConfig.FLAVOR;
        this.image_selfie_from_enum = BuildConfig.FLAVOR;
        this.image_household_from_enum = BuildConfig.FLAVOR;
        int i25 = a;
        int i26 = i25 + 21;
        b = i26 % 128;
        int i27 = i26 % 2;
        this.isSelectedAtRandom = 0;
        this.contactDetailStart = "0000-00-00 00:00:00";
        this.contactDetailEnd = "0000-00-00 00:00:00";
        this.diffContactDetail = 0.0d;
        this.householdStart = "0000-00-00 00:00:00";
        this.householdEnd = "0000-00-00 00:00:00";
        this.diffHousehold = 0.0d;
        this.miscellaneousStart = "0000-00-00 00:00:00";
        this.miscellaneousEnd = "0000-00-00 00:00:00";
        this.diffMiscellaneous = 0.0d;
        this.agriTypeOption = BuildConfig.FLAVOR;
        this.agriTypeOptionId = 0;
        this.agriJson = BuildConfig.FLAVOR;
        this.refNo = BuildConfig.FLAVOR;
        this.subLocality = BuildConfig.FLAVOR;
        this.householdNo = BuildConfig.FLAVOR;
        this.structureNo = BuildConfig.FLAVOR;
        this.structureID = BuildConfig.FLAVOR;
        this.blockCode = BuildConfig.FLAVOR;
        this.areaCode = BuildConfig.FLAVOR;
        this.surveyPickedForCnic = 0;
        int i28 = i25 + 15;
        b = i28 % 128;
        int i29 = i28 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:23:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:24:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:27:0x051a  */
    /* JADX WARN: Code duplicated, block: B:29:0x052f  */
    /* JADX WARN: Code duplicated, block: B:30:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x061c  */
    /* JADX WARN: Code duplicated, block: B:36:0x062b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0658  */
    /* JADX WARN: Code duplicated, block: B:42:0x0679  */
    /* JADX WARN: Code duplicated, block: B:43:0x0683  */
    /* JADX WARN: Code duplicated, block: B:46:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x06dd  */
    public JSONObject getJSONForEnum(Context context, List<Roster> list, int i) throws JSONException {
        String str;
        String str2;
        char c;
        String str3;
        int i2;
        JSONObject jSONObject;
        int i3;
        int i4;
        JSONObject jSONObject2;
        int i5;
        int i6 = 2 % 2;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = new JSONObject();
        JSONObject jSONObject10 = new JSONObject();
        JSONObject jSONObject11 = new JSONObject();
        jSONObject4.put("region", this.region);
        jSONObject4.put("province_id", this.province_id);
        jSONObject4.put("province_name", this.province_name);
        jSONObject4.put("district_id", this.district_id);
        jSONObject4.put("district_name", this.district_name);
        jSONObject4.put("desk_based_survey", this.deskBasedSurvey);
        int i7 = a + 26;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        jSONObject4.put("tehsil_id", this.tehsil_id);
        jSONObject4.put("tab_vs_gps_time", this.tabVsGpsTime);
        jSONObject4.put("tehsil_name", this.tehsil_name);
        jSONObject4.put("temp_address", this.temp_address);
        jSONObject4.put("per_address", this.per_address);
        jSONObject4.put("uc_id", this.uc_id);
        String str4 = this.uc_name;
        int i10 = a;
        int i11 = (i10 ^ 121) + ((i10 & 121) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        jSONObject4.put("uc_name", str4);
        jSONObject4.put("is_gps_exempted", this.is_gps_exempted);
        jSONObject4.put("is_hard", this.is_hard);
        jSONObject4.put("is_validate", this.is_validate);
        jSONObject4.put("batch_size", this.batch_size);
        jSONObject4.put("village_id", this.village_id);
        jSONObject4.put("village_name", this.village_name);
        jSONObject4.put("village_map_list", this.village_map_listing);
        jSONObject4.put("village_structure_number", this.village_structure_number);
        jSONObject4.put("location", this.location);
        jSONObject4.put("longitude", this.longitude);
        jSONObject4.put("latitude", this.latitude);
        jSONObject4.put("location_accuracy", this.locationAccuracy);
        int i13 = a;
        int i14 = (i13 ^ 75) + ((i13 & 75) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        jSONObject4.put("po_id", this.po_id);
        jSONObject4.put("po_name", this.po_name);
        jSONObject4.put("village_accuracy", this.villageAccuracy);
        jSONObject6.put("total_rosters", this.totalRosters);
        jSONObject6.put("name_of_head", this.name_of_head);
        jSONObject6.put("address_of_house", this.address_of_house);
        jSONObject6.put("mobile_number", this.mobile_number);
        jSONObject6.put("alternative_contact", this.alternative_contact);
        jSONObject6.put("mother_lang_id", this.mother_lang_id);
        jSONObject6.put("data_collection_modality", this.data_collection_modality);
        jSONObject6.put("bisp_benificiary", this.bisp_benificiary);
        jSONObject6.put("ref_no", this.refNo);
        String str5 = this.subLocality;
        int i16 = b;
        int i17 = ((i16 | 15) << 1) - (i16 ^ 15);
        a = i17 % 128;
        int i18 = i17 % 2;
        jSONObject6.put("sub_locality", str5);
        jSONObject6.put("household_no", this.householdNo);
        jSONObject6.put("structure_no", this.structureNo);
        jSONObject6.put("structure_id", this.structureID);
        jSONObject6.put("block_code", this.blockCode);
        jSONObject6.put("area_code", this.areaCode);
        Object obj = null;
        if (this.visit_status_id == 3) {
            int i19 = a;
            int i20 = (i19 & (-112)) | (111 & (~i19));
            int i21 = -(-((i19 & 111) << 1));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
            jSONObject7.put("occupacy_status_code", this.occupacy_status_code);
            jSONObject7.put("occupacy_status", this.occupacy_status);
            jSONObject7.put("wall_material_code", this.wall_material_code);
            jSONObject7.put("wall_material_status", this.wall_material_status);
            jSONObject7.put("roof_material_code", this.roof_material_code);
            jSONObject7.put("roof_material_status", this.roof_material_status);
            jSONObject7.put("cooking_fuel_code", this.cooking_fuel_code);
            jSONObject7.put("cooking_fuel_status", this.cooking_fuel_status);
            jSONObject7.put("toilet_code", this.toilet_code);
            jSONObject7.put("toilet_status", this.toilet_status);
            jSONObject7.put("drinking_water_code", this.drinking_water_code);
            jSONObject7.put("drinking_water_status", this.drinking_water_status);
            jSONObject7.put("electricity_code", this.electricity_code);
            jSONObject7.put("electricity_status", this.electricity_status);
            jSONObject7.put("gas_code", this.gas_code);
            String str6 = this.gas_status;
            int i24 = b;
            int i25 = (i24 | 35) << 1;
            int i26 = -((i24 & (-36)) | ((~i24) & 35));
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
            jSONObject7.put("gas_status", str6);
            jSONObject7.put("landline_code", this.landline_code);
            jSONObject7.put("landline_status", this.landline_status);
            jSONObject7.put("land_unit_code", this.land_unit_code);
            jSONObject7.put("land_unit_status", this.land_unit_status);
            jSONObject7.put("number_of_rooms", this.number_of_rooms);
            jSONObject7.put("animal", this.animal);
            jSONObject7.put("buffalo", this.buffalo);
            int i29 = b;
            int i30 = (((i29 ^ 49) | (i29 & 49)) << 1) - ((49 & (~i29)) | (i29 & (-50)));
            a = i30 % 128;
            int i31 = i30 % 2;
            jSONObject7.put("cow", this.cow);
            jSONObject7.put("horse", this.horse);
            jSONObject7.put("camel", this.camel);
            jSONObject7.put("goat", this.goat);
            jSONObject7.put("land_number", this.land_number);
            jSONObject7.put("household_agriculture_land", this.household_agriculture_land);
            jSONObject7.put("heater", this.heater);
            jSONObject7.put("washing_machine", this.washing_machine);
            int i32 = a;
            int i33 = ((i32 | 30) << 1) - (i32 ^ 30);
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            b = i34 % 128;
            int i35 = i34 % 2;
            jSONObject7.put("geyser", this.geyser);
            jSONObject7.put("air_cooler", this.air_cooler);
            jSONObject7.put("air_conditioner", this.air_conditioner);
            jSONObject7.put("fan", this.fan);
            jSONObject7.put("cooking_range", this.cooking_range);
            jSONObject7.put("cooking_stove", this.cooking_stove);
            jSONObject7.put("tv", this.tv);
            jSONObject7.put("vcr", this.vcr);
            int i36 = b;
            int i37 = (i36 & 109) + (i36 | 109);
            a = i37 % 128;
            int i38 = i37 % 2;
            jSONObject7.put("refrigerator", this.refrigerator);
            jSONObject7.put("freezer", this.freezer);
            jSONObject7.put("generator", this.generator);
            jSONObject7.put("car", this.car);
            jSONObject7.put("mobile", this.mobile);
            jSONObject7.put("tractor", this.tractor);
            jSONObject7.put("motorcycle", this.motorcycle);
            jSONObject7.put("internet", this.internet);
            int i39 = b;
            int i40 = (i39 | 83) << 1;
            int i41 = -((i39 & (-84)) | ((~i39) & 83));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            a = i42 % 128;
            int i43 = i42 % 2;
            jSONObject7.put("m_internet", this.m_internet);
            jSONObject7.put("computer", this.computer);
            jSONObject7.put("sewing", this.sewing);
            jSONObject3.put("household_info", jSONObject7);
            jSONObject9.put("taken_loan", this.taken_loan);
            jSONObject9.put("monthly_income", this.monthly_income);
            jSONObject9.put("satisfaction_level", this.satisfaction_level);
            jSONObject9.put("resolve_complaint", this.resolve_complaint);
            int i44 = a;
            int i45 = (i44 ^ 109) + ((i44 & 109) << 1);
            b = i45 % 128;
            int i46 = i45 % 2;
            jSONObject9.put("resolve_complaint_govt", this.resolve_complaint_govt);
            jSONObject9.put("infant_death", this.infant_death);
            jSONObject9.put("infant_birth", this.infant_birth);
            jSONObject9.put("defence_job", this.defence_job);
            jSONObject9.put("migration", this.migration);
            jSONObject9.put("financial_assistance", this.financial_assistance);
            jSONObject3.put("miscellaneous", jSONObject9);
            if (i == 2) {
                int i47 = a;
                int i48 = i47 & 5;
                int i49 = (i47 | 5) & (~i48);
                int i50 = -(-(i48 << 1));
                int i51 = (i49 & i50) + (i49 | i50);
                b = i51 % 128;
                if (i51 % 2 == 0) {
                    jSONObject8.put("bisp_survey_taken_before", this.bisp_survey_taken_before);
                    int i52 = 98 / 0;
                } else {
                    jSONObject8.put("bisp_survey_taken_before", this.bisp_survey_taken_before);
                }
                jSONObject8.put("reason_not_to_survey", this.reason_not_to_survey);
                int i53 = b;
                int i54 = (i53 & (-110)) | ((~i53) & 109);
                int i55 = -(-((i53 & 109) << 1));
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                a = i56 % 128;
                int i57 = i56 % 2;
                jSONObject8.put("survey_advertisement_received", this.survey_advertisement_received);
                int i58 = b;
                int i59 = (i58 & 82) + (i58 | 82);
                int i60 = (i59 ^ (-1)) + (i59 << 1);
                a = i60 % 128;
                if (i60 % 2 != 0) {
                    jSONObject8.put("survey_type", this.survey_type);
                    obj.hashCode();
                    throw null;
                }
                jSONObject8.put("survey_type", this.survey_type);
                String str7 = this.survey_type;
                if (str7 != null) {
                    int i61 = b;
                    int i62 = ((i61 ^ 80) + ((i61 & 80) << 1)) - 1;
                    a = i62 % 128;
                    if (i62 % 2 != 0) {
                        str7.equalsIgnoreCase("snowball");
                        throw null;
                    }
                    if (!(!str7.equalsIgnoreCase("snowball"))) {
                        jSONObject8.put("snowball_type", this.snowball_type);
                        int i63 = a;
                        int i64 = i63 & 51;
                        int i65 = (i63 ^ 51) | i64;
                        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                        b = i66 % 128;
                        int i67 = i66 % 2;
                        str = "visit_status_id";
                        str2 = "visit_status_reason";
                    } else {
                        str3 = this.neighbour_survey_done;
                        if (str3 != null) {
                            jSONObject8.put("neighbour_survey_done", str3);
                            int i68 = a;
                            int i69 = i68 & 53;
                            int i70 = ((i68 ^ 53) | i69) << 1;
                            int i71 = -((i68 | 53) & (~i69));
                            int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                            b = i72 % 128;
                            int i73 = i72 % 2;
                        } else {
                            jSONObject8.put("neighbour_survey_done", BuildConfig.FLAVOR);
                            int i74 = b;
                            int i75 = (i74 ^ 7) + ((i74 & 7) << 1);
                            a = i75 % 128;
                            int i76 = i75 % 2;
                        }
                        jSONObject8.put("left_neighbour_survey", this.left_neighbour_survey);
                        int i77 = a;
                        int i78 = i77 | 71;
                        i2 = ((i78 << 1) - (~(-((~(i77 & 71)) & i78)))) - 1;
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            jSONObject8.put("right_neighbour_survey", this.right_neighbour_survey);
                            throw null;
                        }
                        jSONObject8.put("right_neighbour_survey", this.right_neighbour_survey);
                        jSONObject8.put("nearest_neighbour_survey", this.nearest_neighbour_survey);
                        if (this.left_neighbour_survey != -1) {
                            JSONObject jSONObject12 = new JSONObject();
                            jSONObject12.put("bisp_survey_taken", this.bisp_survey_taken_left);
                            int i79 = b + 67;
                            a = i79 % 128;
                            int i80 = i79 % 2;
                            jSONObject12.put("name_of_head", this.name_of_head_1);
                            int i81 = b;
                            int i82 = (i81 ^ 103) + ((i81 & 103) << 1);
                            a = i82 % 128;
                            int i83 = i82 % 2;
                            jSONObject12.put("address_of_house", this.address_of_house_1);
                            jSONObject12.put("mobile_number", this.mobile_number_1);
                            int i84 = a;
                            int i85 = (i84 | 15) << 1;
                            int i86 = -((15 & (~i84)) | (i84 & (-16)));
                            int i87 = (i85 & i86) + (i86 | i85);
                            b = i87 % 128;
                            int i88 = i87 % 2;
                            jSONObject12.put("alternative_contact", this.alternative_contact_1);
                            jSONObject12.put("household_no", this.householdNo_1);
                            jSONObject12.put("structure_no", this.structureNo_1);
                            jSONObject12.put("structure_id", this.structureID_1);
                            int i89 = b;
                            int i90 = i89 & 37;
                            int i91 = ((i89 ^ 37) | i90) << 1;
                            int i92 = -((i89 | 37) & (~i90));
                            int i93 = (i91 & i92) + (i92 | i91);
                            a = i93 % 128;
                            int i94 = i93 % 2;
                            str = "visit_status_id";
                            jSONObject12.put(str, this.visit_status_id_1);
                            str2 = "visit_status_reason";
                            jSONObject12.put(str2, this.visit_status_reason_1);
                            jSONObject8.put("contact_detail_left", jSONObject12);
                        } else {
                            str = "visit_status_id";
                            str2 = "visit_status_reason";
                        }
                        if (this.right_neighbour_survey != -1) {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("bisp_survey_taken", this.bisp_survey_taken_right);
                            jSONObject2.put("name_of_head", this.name_of_head_2);
                            int i95 = a;
                            int i96 = (i95 ^ 23) + ((i95 & 23) << 1);
                            b = i96 % 128;
                            int i97 = i96 % 2;
                            jSONObject2.put("address_of_house", this.address_of_house_2);
                            jSONObject2.put("mobile_number", this.mobile_number_2);
                            jSONObject2.put("alternative_contact", this.alternative_contact_2);
                            jSONObject2.put("household_no", this.householdNo_2);
                            jSONObject2.put("structure_no", this.structureNo_2);
                            jSONObject2.put("structure_id", this.structureID_2);
                            int i98 = b;
                            int i99 = i98 & 11;
                            int i100 = -(-((i98 ^ 11) | i99));
                            i5 = (i99 ^ i100) + ((i100 & i99) << 1);
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                jSONObject2.put(str, this.visit_status_id_2);
                                jSONObject2.put(str2, this.visit_status_reason_2);
                                int i101 = 14 / 0;
                            } else {
                                jSONObject2.put(str, this.visit_status_id_2);
                                jSONObject2.put(str2, this.visit_status_reason_2);
                            }
                            jSONObject8.put("contact_detail_right", jSONObject2);
                            int i102 = b;
                            int i103 = i102 | 37;
                            int i104 = i103 << 1;
                            int i105 = -((~(i102 & 37)) & i103);
                            int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
                            a = i106 % 128;
                            int i107 = i106 % 2;
                        }
                        if (this.nearest_neighbour_survey != -1) {
                            jSONObject = new JSONObject();
                            jSONObject.put("bisp_survey_taken", this.bisp_survey_taken_nearest);
                            int i108 = b;
                            int i109 = i108 & 113;
                            int i110 = -(-((i108 ^ 113) | i109));
                            i3 = (i109 ^ i110) + ((i110 & i109) << 1);
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                jSONObject.put("name_of_head", this.name_of_head_3);
                                int i111 = 81 / 0;
                            } else {
                                jSONObject.put("name_of_head", this.name_of_head_3);
                            }
                            jSONObject.put("address_of_house", this.address_of_house_3);
                            jSONObject.put("mobile_number", this.mobile_number_3);
                            jSONObject.put("alternative_contact", this.alternative_contact_3);
                            int i112 = a;
                            int i113 = i112 & 3;
                            i4 = i113 + ((i112 ^ 3) | i113);
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                jSONObject.put("household_no", this.householdNo_3);
                                jSONObject.put("structure_no", this.structureNo_3);
                                int i114 = 48 / 0;
                            } else {
                                jSONObject.put("household_no", this.householdNo_3);
                                jSONObject.put("structure_no", this.structureNo_3);
                            }
                            jSONObject.put("structure_id", this.structureID_3);
                            jSONObject.put(str, this.visit_status_id_3);
                            jSONObject.put(str2, this.visit_status_reason_3);
                            jSONObject8.put("contact_detail_nearest", jSONObject);
                        }
                    }
                } else {
                    str3 = this.neighbour_survey_done;
                    if (str3 != null) {
                        jSONObject8.put("neighbour_survey_done", str3);
                        int i610 = a;
                        int i611 = i610 & 53;
                        int i710 = ((i610 ^ 53) | i611) << 1;
                        int i711 = -((i610 | 53) & (~i611));
                        int i712 = ((i710 | i711) << 1) - (i711 ^ i710);
                        b = i712 % 128;
                        int i713 = i712 % 2;
                    } else {
                        jSONObject8.put("neighbour_survey_done", BuildConfig.FLAVOR);
                        int i714 = b;
                        int i715 = (i714 ^ 7) + ((i714 & 7) << 1);
                        a = i715 % 128;
                        int i716 = i715 % 2;
                    }
                    jSONObject8.put("left_neighbour_survey", this.left_neighbour_survey);
                    int i717 = a;
                    int i718 = i717 | 71;
                    i2 = ((i718 << 1) - (~(-((~(i717 & 71)) & i718)))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        jSONObject8.put("right_neighbour_survey", this.right_neighbour_survey);
                        throw null;
                    }
                    jSONObject8.put("right_neighbour_survey", this.right_neighbour_survey);
                    jSONObject8.put("nearest_neighbour_survey", this.nearest_neighbour_survey);
                    if (this.left_neighbour_survey != -1) {
                        JSONObject jSONObject13 = new JSONObject();
                        jSONObject13.put("bisp_survey_taken", this.bisp_survey_taken_left);
                        int i719 = b + 67;
                        a = i719 % 128;
                        int i810 = i719 % 2;
                        jSONObject13.put("name_of_head", this.name_of_head_1);
                        int i811 = b;
                        int i812 = (i811 ^ 103) + ((i811 & 103) << 1);
                        a = i812 % 128;
                        int i813 = i812 % 2;
                        jSONObject13.put("address_of_house", this.address_of_house_1);
                        jSONObject13.put("mobile_number", this.mobile_number_1);
                        int i814 = a;
                        int i815 = (i814 | 15) << 1;
                        int i816 = -((15 & (~i814)) | (i814 & (-16)));
                        int i817 = (i815 & i816) + (i816 | i815);
                        b = i817 % 128;
                        int i818 = i817 % 2;
                        jSONObject13.put("alternative_contact", this.alternative_contact_1);
                        jSONObject13.put("household_no", this.householdNo_1);
                        jSONObject13.put("structure_no", this.structureNo_1);
                        jSONObject13.put("structure_id", this.structureID_1);
                        int i819 = b;
                        int i910 = i819 & 37;
                        int i911 = ((i819 ^ 37) | i910) << 1;
                        int i912 = -((i819 | 37) & (~i910));
                        int i913 = (i911 & i912) + (i912 | i911);
                        a = i913 % 128;
                        int i914 = i913 % 2;
                        str = "visit_status_id";
                        jSONObject13.put(str, this.visit_status_id_1);
                        str2 = "visit_status_reason";
                        jSONObject13.put(str2, this.visit_status_reason_1);
                        jSONObject8.put("contact_detail_left", jSONObject13);
                    } else {
                        str = "visit_status_id";
                        str2 = "visit_status_reason";
                    }
                    if (this.right_neighbour_survey != -1) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put("bisp_survey_taken", this.bisp_survey_taken_right);
                        jSONObject2.put("name_of_head", this.name_of_head_2);
                        int i915 = a;
                        int i916 = (i915 ^ 23) + ((i915 & 23) << 1);
                        b = i916 % 128;
                        int i917 = i916 % 2;
                        jSONObject2.put("address_of_house", this.address_of_house_2);
                        jSONObject2.put("mobile_number", this.mobile_number_2);
                        jSONObject2.put("alternative_contact", this.alternative_contact_2);
                        jSONObject2.put("household_no", this.householdNo_2);
                        jSONObject2.put("structure_no", this.structureNo_2);
                        jSONObject2.put("structure_id", this.structureID_2);
                        int i918 = b;
                        int i919 = i918 & 11;
                        int i1010 = -(-((i918 ^ 11) | i919));
                        i5 = (i919 ^ i1010) + ((i1010 & i919) << 1);
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            jSONObject2.put(str, this.visit_status_id_2);
                            jSONObject2.put(str2, this.visit_status_reason_2);
                            int i1011 = 14 / 0;
                        } else {
                            jSONObject2.put(str, this.visit_status_id_2);
                            jSONObject2.put(str2, this.visit_status_reason_2);
                        }
                        jSONObject8.put("contact_detail_right", jSONObject2);
                        int i1012 = b;
                        int i1013 = i1012 | 37;
                        int i1014 = i1013 << 1;
                        int i1015 = -((~(i1012 & 37)) & i1013);
                        int i1016 = ((i1014 | i1015) << 1) - (i1015 ^ i1014);
                        a = i1016 % 128;
                        int i1017 = i1016 % 2;
                    }
                    if (this.nearest_neighbour_survey != -1) {
                        jSONObject = new JSONObject();
                        jSONObject.put("bisp_survey_taken", this.bisp_survey_taken_nearest);
                        int i1018 = b;
                        int i1019 = i1018 & 113;
                        int i115 = -(-((i1018 ^ 113) | i1019));
                        i3 = (i1019 ^ i115) + ((i115 & i1019) << 1);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            jSONObject.put("name_of_head", this.name_of_head_3);
                            int i116 = 81 / 0;
                        } else {
                            jSONObject.put("name_of_head", this.name_of_head_3);
                        }
                        jSONObject.put("address_of_house", this.address_of_house_3);
                        jSONObject.put("mobile_number", this.mobile_number_3);
                        jSONObject.put("alternative_contact", this.alternative_contact_3);
                        int i117 = a;
                        int i118 = i117 & 3;
                        i4 = i118 + ((i117 ^ 3) | i118);
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            jSONObject.put("household_no", this.householdNo_3);
                            jSONObject.put("structure_no", this.structureNo_3);
                            int i119 = 48 / 0;
                        } else {
                            jSONObject.put("household_no", this.householdNo_3);
                            jSONObject.put("structure_no", this.structureNo_3);
                        }
                        jSONObject.put("structure_id", this.structureID_3);
                        jSONObject.put(str, this.visit_status_id_3);
                        jSONObject.put(str2, this.visit_status_reason_3);
                        jSONObject8.put("contact_detail_nearest", jSONObject);
                    }
                }
                jSONObject3.put("new_spot_check_questions", jSONObject8);
                c = 2;
            } else {
                str = "visit_status_id";
                str2 = "visit_status_reason";
                c = 2;
            }
            if (i != c) {
                jSONObject11.put("agri_type_option", this.agriTypeOption);
                jSONObject11.put("agri_type_option_id", this.agriTypeOptionId);
                jSONObject11.put("agri_json", this.agriJson);
                jSONObject3.put("agri_info", jSONObject11);
                int i120 = b + 6;
                int i121 = (i120 ^ (-1)) + (i120 << 1);
                a = i121 % 128;
                int i122 = i121 % 2;
            }
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                int i123 = 0;
                while (i123 < list.size()) {
                    int i124 = a;
                    int i125 = i124 | 27;
                    int i126 = i125 << 1;
                    int i127 = -((~(i124 & 27)) & i125);
                    int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                    b = i128 % 128;
                    int i129 = i128 % 2;
                    if (!list.get(i123).surveyType.equals("4")) {
                        JSONObject json = list.get(i123).getJSON(i);
                        json.remove("cnic_pic");
                        int i130 = b;
                        int i131 = ((i130 | 40) << 1) - (i130 ^ 40);
                        int i132 = (i131 ^ (-1)) + (i131 << 1);
                        a = i132 % 128;
                        if (i132 % 2 != 0) {
                            jSONArray.put(json);
                            obj.hashCode();
                            throw null;
                        }
                        jSONArray.put(json);
                    } else {
                        int i133 = a;
                        int i134 = ((i133 ^ 56) + ((i133 & 56) << 1)) - 1;
                        b = i134 % 128;
                        if (i134 % 2 == 0) {
                            list.get(i123).getJSONForCnicVerified();
                            throw null;
                        }
                        jSONArray2.put(list.get(i123).getJSONForCnicVerified());
                        int i135 = b;
                        int i136 = i135 & 57;
                        int i137 = i136 + ((i135 ^ 57) | i136);
                        a = i137 % 128;
                        int i138 = i137 % 2;
                    }
                    int i139 = ((i123 ^ 2) + ((i123 & 2) << 1)) - 1;
                    i123 = ((i139 << 1) - (~(-i139))) - 1;
                    int i140 = b;
                    int i141 = i140 & 41;
                    int i142 = (i141 - (~(-(-((i140 ^ 41) | i141))))) - 1;
                    a = i142 % 128;
                    int i143 = i142 % 2;
                }
                jSONObject3.put("roster", jSONArray);
                jSONObject3.put("roster_cnic", jSONArray2);
                int i144 = a;
                int i145 = ((i144 | 103) << 1) - (i144 ^ 103);
                b = i145 % 128;
                int i146 = i145 % 2;
            }
        } else {
            str = "visit_status_id";
            str2 = "visit_status_reason";
        }
        jSONObject5.put("apk_type", "signed");
        jSONObject5.put("is_new_survey", 1);
        jSONObject5.put("date", this.date);
        jSONObject5.put("date_gps", this.dateGPS);
        jSONObject5.put("time", this.time);
        jSONObject5.put("time_gps", this.timeGPS);
        jSONObject5.put("start_time", this.startTime);
        jSONObject5.put("start_time_gps", this.startTimeGPS);
        jSONObject5.put("end_time", this.endTime);
        jSONObject5.put("end_time_gps", this.endTimeGPS);
        jSONObject5.put("imei_number", this.imei_number);
        jSONObject5.put("enumerator_name", this.enumerator_name);
        jSONObject5.put("enumerator_id", this.enumerator_id);
        jSONObject5.put(str, this.visit_status_id);
        jSONObject5.put(str2, this.visit_status_reason);
        jSONObject5.put("complete_form", this.complete_form);
        jSONObject5.put("average_roster_time", this.averageRosterTime);
        jSONObject5.put("uuid", this.uuid);
        jSONObject5.put("is_off_hour", this.isOffHour);
        jSONObject5.put("comments", this.comments);
        String str8 = this.uniqueID;
        int i147 = b + 117;
        a = i147 % 128;
        int i148 = i147 % 2;
        jSONObject5.put("unique_id", str8);
        jSONObject5.put("form_no", this.form_no);
        jSONObject5.put("form_no_old", this.form_no_old);
        jSONObject5.put("form_no_not_at_home", this.form_no_not_at_home);
        jSONObject5.put("re_collection_flag", this.reCollectionFlag);
        jSONObject5.put("location", this.location);
        jSONObject5.put("longitude", this.longitude);
        int i149 = a;
        int i150 = ((((i149 ^ 37) | (i149 & 37)) << 1) - (~(-((37 & (~i149)) | (i149 & (-38)))))) - 1;
        b = i150 % 128;
        int i151 = i150 % 2;
        jSONObject5.put("latitude", this.latitude);
        jSONObject5.put("location_accuracy", this.locationAccuracy);
        jSONObject5.put("survey_accepted", this.survey_accepted);
        jSONObject5.put("validation_percentage", this.validation_percentage);
        jSONObject5.put("survey_verified", this.survey_verified);
        jSONObject5.put("batch_name", this.batchName);
        jSONObject5.put("is_selected_at_random", this.isSelectedAtRandom);
        int i152 = a;
        int i153 = (i152 | 123) << 1;
        int i154 = -(i152 ^ 123);
        int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
        b = i155 % 128;
        int i156 = i155 % 2;
        jSONObject5.put("is_selected_for_resurvey", this.isSelectedForReSurvey);
        jSONObject5.put("contact_detail_start", this.contactDetailStart);
        jSONObject5.put("contact_detail_end", this.contactDetailEnd);
        jSONObject5.put("household_start", this.householdStart);
        jSONObject5.put("household_end", this.householdEnd);
        jSONObject5.put("miscellaneous_start", this.miscellaneousStart);
        jSONObject5.put("miscellaneous_end", this.miscellaneousEnd);
        jSONObject5.put("diff_contact_detail", this.diffContactDetail);
        jSONObject5.put("diff_household", this.diffHousehold);
        jSONObject5.put("diff_miscellaneous", this.diffMiscellaneous);
        jSONObject5.put("app_version", this.appVersion);
        jSONObject5.put("app_version_name", this.appVersionName);
        jSONObject5.put("previous_qr", this.previousQR);
        jSONObject10.put("imei_mac", this.imei_number);
        jSONObject10.put("image_benificiary_name", this.image_benificiary_name);
        jSONObject10.put("image_benificiary_name", this.image_benificiary_name);
        jSONObject10.put("image_benificiary", Base64.encodeToString(this.image_benificiary, 0));
        jSONObject10.put("image_household_name", this.image_household_name);
        jSONObject10.put("image_household", Base64.encodeToString(this.image_household, 0));
        byte[] bArr = this.image_household_1;
        if (bArr != null) {
            int i157 = a;
            int i158 = i157 ^ 71;
            int i159 = ((i157 & 71) | i158) << 1;
            int i160 = -i158;
            int i161 = (i159 & i160) + (i159 | i160);
            b = i161 % 128;
            int i162 = i161 % 2;
            if (bArr.length > 0) {
                jSONObject10.put("image_household_name_left", this.image_household_name_1);
                String strEncodeToString = Base64.encodeToString(this.image_household_1, 0);
                int i163 = b;
                int i164 = i163 & 113;
                int i165 = -(-((i163 ^ 113) | i164));
                int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
                a = i166 % 128;
                if (i166 % 2 != 0) {
                    jSONObject10.put("image_household_left", strEncodeToString);
                    int i167 = 39 / 0;
                } else {
                    jSONObject10.put("image_household_left", strEncodeToString);
                }
                int i168 = a;
                int i169 = i168 & 9;
                int i170 = i169 + ((i168 ^ 9) | i169);
                b = i170 % 128;
                int i171 = i170 % 2;
            }
        }
        byte[] bArr2 = this.image_household_2;
        if (bArr2 != null) {
            int i172 = a;
            int i173 = (i172 ^ 117) + ((i172 & 117) << 1);
            b = i173 % 128;
            if (i173 % 2 == 0) {
                int length = bArr2.length;
                throw null;
            }
            if (bArr2.length > 0) {
                jSONObject10.put("image_household_name_right", this.image_household_name_2);
                jSONObject10.put("image_household_right", Base64.encodeToString(this.image_household_2, 0));
            }
        }
        byte[] bArr3 = this.image_household_3;
        if (bArr3 != null) {
            int i174 = a;
            int i175 = ((i174 | 47) << 1) - (i174 ^ 47);
            int i176 = i175 % 128;
            b = i176;
            if (i175 % 2 == 0) {
                int length2 = bArr3.length;
                throw null;
            }
            if (bArr3.length > 0) {
                int i177 = i176 & 49;
                int i178 = -(-((i176 ^ 49) | i177));
                int i179 = (i177 ^ i178) + ((i177 & i178) << 1);
                a = i179 % 128;
                int i180 = i179 % 2;
                jSONObject10.put("image_household_name_nearest", this.image_household_name_3);
                int i181 = b;
                int i182 = i181 & 21;
                int i183 = (((i181 ^ 21) | i182) << 1) - ((~i182) & (i181 | 21));
                a = i183 % 128;
                int i184 = i183 % 2;
                byte[] bArr4 = this.image_household_3;
                int i185 = (i181 ^ 19) + ((i181 & 19) << 1);
                a = i185 % 128;
                int i186 = i185 % 2;
                jSONObject10.put("image_household_nearest", Base64.encodeToString(bArr4, 0));
            }
        }
        jSONObject10.put("image_selfie_name", this.image_selfie_name);
        int i187 = a;
        int i188 = ((i187 ^ 51) | (i187 & 51)) << 1;
        int i189 = -(((~i187) & 51) | (i187 & (-52)));
        int i190 = (i188 & i189) + (i189 | i188);
        b = i190 % 128;
        if (i190 % 2 == 0) {
            jSONObject10.put("image_selfie", Base64.encodeToString(this.image_selfie, 0));
        } else {
            jSONObject10.put("image_selfie", Base64.encodeToString(this.image_selfie, 0));
        }
        jSONObject10.put("image_thumb_imp", this.image_thumb_imp);
        int i191 = a - (-1);
        b = i191 % 128;
        int i192 = i191 % 2;
        jSONObject3.put("geographic_location", jSONObject4);
        jSONObject3.put("contact_details", jSONObject6);
        jSONObject3.put("pictures", jSONObject10);
        int i193 = a + 73;
        b = i193 % 128;
        if (i193 % 2 == 0) {
            jSONObject3.put("survey_information", jSONObject5);
            throw null;
        }
        jSONObject3.put("survey_information", jSONObject5);
        int i194 = b;
        int i195 = (i194 & (-98)) | ((~i194) & 97);
        int i196 = -(-((i194 & 97) << 1));
        int i197 = ((i195 | i196) << 1) - (i196 ^ i195);
        a = i197 % 128;
        if (i197 % 2 != 0) {
            int i198 = 22 / 0;
        }
        return jSONObject3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0519  */
    /* JADX WARN: Code duplicated, block: B:31:0x0537  */
    /* JADX WARN: Code duplicated, block: B:43:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x054a A[SYNTHETIC] */
    public JSONObject getJSONForEnum(Context context, List<Roster> list, String str, int i) throws JSONException {
        int i2;
        Roster roster;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = new JSONObject();
        String str2 = this.region;
        int i7 = b;
        int i8 = i7 & 39;
        int i9 = -(-((i7 ^ 39) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        jSONObject2.put("region", str2);
        jSONObject2.put("province_id", this.province_id);
        jSONObject2.put("province_name", this.province_name);
        jSONObject2.put("district_id", this.district_id);
        jSONObject2.put("district_name", this.district_name);
        jSONObject2.put("desk_based_survey", this.deskBasedSurvey);
        jSONObject2.put("tehsil_id", this.tehsil_id);
        int i12 = a;
        int i13 = i12 & 53;
        int i14 = (i12 | 53) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        jSONObject2.put("tab_vs_gps_time", this.tabVsGpsTime);
        jSONObject2.put("tehsil_name", this.tehsil_name);
        jSONObject2.put("temp_address", this.temp_address);
        jSONObject2.put("per_address", this.per_address);
        jSONObject2.put("uc_id", this.uc_id);
        jSONObject2.put("uc_name", this.uc_name);
        int i18 = a;
        int i19 = i18 ^ 43;
        int i20 = ((((i18 & 43) | i19) << 1) - (~(-i19))) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        jSONObject2.put("is_gps_exempted", this.is_gps_exempted);
        jSONObject2.put("is_hard", this.is_hard);
        jSONObject2.put("is_validate", this.is_validate);
        jSONObject2.put("batch_size", this.batch_size);
        jSONObject2.put("village_id", this.village_id);
        jSONObject2.put("village_name", this.village_name);
        int i22 = b;
        int i23 = (((i22 | 73) << 1) - (~(-((i22 & (-74)) | (73 & (~i22)))))) - 1;
        a = i23 % 128;
        int i24 = i23 % 2;
        jSONObject2.put("village_map_list", this.village_map_listing);
        jSONObject2.put("village_structure_number", this.village_structure_number);
        jSONObject2.put("location", this.location);
        jSONObject2.put("longitude", this.longitude);
        jSONObject2.put("latitude", this.latitude);
        jSONObject2.put("location_accuracy", this.locationAccuracy);
        int i25 = this.po_id;
        int i26 = a;
        int i27 = i26 & 61;
        int i28 = (((~i27) & (i26 | 61)) - (~(i27 << 1))) - 1;
        b = i28 % 128;
        int i29 = i28 % 2;
        jSONObject2.put("po_id", i25);
        jSONObject2.put("po_name", this.po_name);
        jSONObject2.put("village_accuracy", this.villageAccuracy);
        jSONObject5.put("total_rosters", this.totalRosters);
        jSONObject5.put("name_of_head", this.name_of_head);
        jSONObject5.put("address_of_house", this.address_of_house);
        jSONObject5.put("mobile_number", this.mobile_number);
        int i30 = a;
        int i31 = (i30 & 43) + (i30 | 43);
        b = i31 % 128;
        int i32 = i31 % 2;
        jSONObject5.put("alternative_contact", this.alternative_contact);
        jSONObject5.put("mother_lang_id", this.mother_lang_id);
        jSONObject5.put("data_collection_modality", this.data_collection_modality);
        jSONObject5.put("bisp_benificiary", this.bisp_benificiary);
        jSONObject5.put("ref_no", this.refNo);
        jSONObject5.put("sub_locality", this.subLocality);
        int i33 = a;
        int i34 = (i33 & (-90)) | ((~i33) & 89);
        int i35 = -(-((i33 & 89) << 1));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        b = i36 % 128;
        int i37 = i36 % 2;
        jSONObject5.put("household_no", this.householdNo);
        jSONObject5.put("structure_no", this.structureNo);
        jSONObject5.put("structure_id", this.structureID);
        jSONObject5.put("block_code", this.blockCode);
        jSONObject5.put("area_code", this.areaCode);
        if (this.visit_status_id == 3) {
            int i38 = a + 90;
            int i39 = (i38 ^ (-1)) + (i38 << 1);
            b = i39 % 128;
            int i40 = i39 % 2;
            jSONObject6.put("occupacy_status_code", this.occupacy_status_code);
            jSONObject6.put("occupacy_status", this.occupacy_status);
            jSONObject6.put("wall_material_code", this.wall_material_code);
            jSONObject6.put("wall_material_status", this.wall_material_status);
            jSONObject6.put("roof_material_code", this.roof_material_code);
            jSONObject6.put("roof_material_status", this.roof_material_status);
            jSONObject6.put("cooking_fuel_code", this.cooking_fuel_code);
            jSONObject6.put("cooking_fuel_status", this.cooking_fuel_status);
            int i41 = b;
            int i42 = i41 & 9;
            int i43 = i41 | 9;
            int i44 = (i42 & i43) + (i43 | i42);
            a = i44 % 128;
            int i45 = i44 % 2;
            jSONObject6.put("toilet_code", this.toilet_code);
            jSONObject6.put("toilet_status", this.toilet_status);
            jSONObject6.put("drinking_water_code", this.drinking_water_code);
            jSONObject6.put("drinking_water_status", this.drinking_water_status);
            jSONObject6.put("electricity_code", this.electricity_code);
            jSONObject6.put("electricity_status", this.electricity_status);
            jSONObject6.put("gas_code", this.gas_code);
            String str3 = this.gas_status;
            int i46 = b;
            int i47 = (-2) - ((((i46 | 114) << 1) - (i46 ^ 114)) ^ (-1));
            a = i47 % 128;
            int i48 = i47 % 2;
            jSONObject6.put("gas_status", str3);
            jSONObject6.put("landline_code", this.landline_code);
            jSONObject6.put("landline_status", this.landline_status);
            jSONObject6.put("land_unit_code", this.land_unit_code);
            jSONObject6.put("land_unit_status", this.land_unit_status);
            jSONObject6.put("number_of_rooms", this.number_of_rooms);
            jSONObject6.put("animal", this.animal);
            jSONObject6.put("buffalo", this.buffalo);
            int i49 = a;
            int i50 = ((i49 | 65) << 1) - (i49 ^ 65);
            b = i50 % 128;
            int i51 = i50 % 2;
            jSONObject6.put("cow", this.cow);
            jSONObject6.put("horse", this.horse);
            jSONObject6.put("camel", this.camel);
            jSONObject6.put("goat", this.goat);
            jSONObject6.put("land_number", this.land_number);
            jSONObject6.put("household_agriculture_land", this.household_agriculture_land);
            jSONObject6.put("heater", this.heater);
            jSONObject6.put("washing_machine", this.washing_machine);
            int i52 = (-2) - ((a + 36) ^ (-1));
            b = i52 % 128;
            int i53 = i52 % 2;
            jSONObject6.put("geyser", this.geyser);
            jSONObject6.put("air_cooler", this.air_cooler);
            jSONObject6.put("air_conditioner", this.air_conditioner);
            jSONObject6.put("fan", this.fan);
            jSONObject6.put("cooking_range", this.cooking_range);
            jSONObject6.put("cooking_stove", this.cooking_stove);
            jSONObject6.put("tv", this.tv);
            jSONObject6.put("vcr", this.vcr);
            int i54 = a;
            int i55 = (i54 ^ 47) + ((i54 & 47) << 1);
            b = i55 % 128;
            int i56 = i55 % 2;
            jSONObject6.put("refrigerator", this.refrigerator);
            jSONObject6.put("freezer", this.freezer);
            jSONObject6.put("generator", this.generator);
            jSONObject6.put("car", this.car);
            jSONObject6.put("mobile", this.mobile);
            jSONObject6.put("tractor", this.tractor);
            jSONObject6.put("motorcycle", this.motorcycle);
            jSONObject6.put("internet", this.internet);
            int i57 = a;
            int i58 = i57 & 31;
            int i59 = (((i57 ^ 31) | i58) << 1) - ((i57 | 31) & (~i58));
            b = i59 % 128;
            int i60 = i59 % 2;
            jSONObject6.put("m_internet", this.m_internet);
            jSONObject6.put("computer", this.computer);
            jSONObject6.put("sewing", this.sewing);
            jSONObject.put("household_info", jSONObject6);
            jSONObject4.put("taken_loan", this.taken_loan);
            jSONObject4.put("monthly_income", this.monthly_income);
            jSONObject4.put("satisfaction_level", this.satisfaction_level);
            jSONObject4.put("resolve_complaint", this.resolve_complaint);
            int i61 = a + 121;
            b = i61 % 128;
            int i62 = i61 % 2;
            jSONObject4.put("resolve_complaint_govt", this.resolve_complaint_govt);
            jSONObject4.put("infant_death", this.infant_death);
            jSONObject4.put("infant_birth", this.infant_birth);
            jSONObject4.put("defence_job", this.defence_job);
            jSONObject4.put("migration", this.migration);
            jSONObject4.put("financial_assistance", this.financial_assistance);
            jSONObject.put("miscellaneous", jSONObject4);
            if (i != 2) {
                int i63 = b + 117;
                a = i63 % 128;
                int i64 = i63 % 2;
                jSONObject8.put("agri_type_option", this.agriTypeOption);
                int i65 = a;
                int i66 = (i65 ^ 107) + ((i65 & 107) << 1);
                b = i66 % 128;
                if (i66 % 2 == 0) {
                    jSONObject8.put("agri_type_option_id", this.agriTypeOptionId);
                    throw null;
                }
                jSONObject8.put("agri_type_option_id", this.agriTypeOptionId);
                int i67 = (-2) - ((a + 70) ^ (-1));
                b = i67 % 128;
                int i68 = i67 % 2;
                jSONObject8.put("agri_json", this.agriJson);
                int i69 = a;
                int i70 = (i69 & 1) + (i69 | 1);
                b = i70 % 128;
                if (i70 % 2 == 0) {
                    jSONObject.put("agri_info", jSONObject8);
                    int i71 = 51 / 0;
                } else {
                    jSONObject.put("agri_info", jSONObject8);
                }
            }
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = new ArrayList();
                int i72 = b;
                int i73 = ((i72 ^ 117) | (i72 & 117)) << 1;
                int i74 = -((i72 & (-118)) | (117 & (~i72)));
                int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                a = i75 % 128;
                int i76 = i75 % 2 != 0 ? 1 : 0;
                int i77 = ((i72 | 117) << 1) - (((~i72) & 117) | (i72 & (-118)));
                a = i77 % 128;
                int i78 = i77 % 2;
                while (i76 < list.size()) {
                    int i79 = b;
                    int i80 = ((((i79 ^ 55) | (i79 & 55)) << 1) - (~(-((i79 & (-56)) | ((~i79) & 55))))) - 1;
                    a = i80 % 128;
                    int i81 = i80 % 2;
                    Roster roster2 = list.get(i76);
                    int i82 = b;
                    int i83 = ((i82 | 67) << 1) - (i82 ^ 67);
                    a = i83 % 128;
                    if (i83 % 2 != 0) {
                        int i84 = 48 / 0;
                        if (roster2.rosterUniqueId != null) {
                            int i85 = a;
                            int i86 = i85 & 11;
                            int i87 = ((i85 ^ 11) | i86) << 1;
                            int i88 = -((i85 | 11) & (~i86));
                            i2 = ((i87 | i88) << 1) - (i88 ^ i87);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                String str4 = list.get(i76).rosterUniqueId;
                                throw null;
                            }
                            if (!(!list.get(i76).rosterUniqueId.equals(BuildConfig.FLAVOR))) {
                            }
                        }
                        roster = list.get(i76);
                        int i89 = b;
                        int i90 = i89 & 115;
                        int i91 = -(-((i89 ^ 115) | i90));
                        i3 = (i90 ^ i91) + ((i91 & i90) << 1);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            jSONArray.put(roster.getJSON(i));
                            i4 = i76 ^ 91;
                            i5 = (i76 & 91) << 1;
                        } else {
                            jSONArray.put(roster.getJSON(i));
                            int i92 = ((i76 | 37) << 1) - (i76 ^ 37);
                            int i93 = (i92 ^ (-1)) + (i92 << 1);
                            i4 = i93 & (-35);
                            i5 = i93 | (-35);
                        }
                        i76 = i4 + i5;
                        int i94 = b;
                        int i95 = i94 & 31;
                        int i96 = i94 | 31;
                        int i97 = (i95 & i96) + (i96 | i95);
                        a = i97 % 128;
                        int i98 = i97 % 2;
                    } else {
                        if (roster2.rosterUniqueId != null) {
                            int i810 = a;
                            int i811 = i810 & 11;
                            int i812 = ((i810 ^ 11) | i811) << 1;
                            int i813 = -((i810 | 11) & (~i811));
                            i2 = ((i812 | i813) << 1) - (i813 ^ i812);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                String str5 = list.get(i76).rosterUniqueId;
                                throw null;
                            }
                            if (!(!list.get(i76).rosterUniqueId.equals(BuildConfig.FLAVOR))) {
                            }
                        }
                        roster = list.get(i76);
                        int i814 = b;
                        int i99 = i814 & 115;
                        int i910 = -(-((i814 ^ 115) | i99));
                        i3 = (i99 ^ i910) + ((i910 & i99) << 1);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            jSONArray.put(roster.getJSON(i));
                            i4 = i76 ^ 91;
                            i5 = (i76 & 91) << 1;
                        } else {
                            jSONArray.put(roster.getJSON(i));
                            int i911 = ((i76 | 37) << 1) - (i76 ^ 37);
                            int i912 = (i911 ^ (-1)) + (i911 << 1);
                            i4 = i912 & (-35);
                            i5 = i912 | (-35);
                        }
                        i76 = i4 + i5;
                        int i913 = b;
                        int i914 = i913 & 31;
                        int i915 = i913 | 31;
                        int i916 = (i914 & i915) + (i915 | i914);
                        a = i916 % 128;
                        int i917 = i916 % 2;
                    }
                    Roster roster3 = list.get(i76);
                    int i100 = a;
                    int i101 = i100 & 15;
                    int i102 = i100 | 15;
                    int i103 = (i101 ^ i102) + ((i102 & i101) << 1);
                    b = i103 % 128;
                    if (i103 % 2 == 0) {
                        roster3.rosterUniqueId = UUID.randomUUID().toString();
                        throw null;
                    }
                    roster3.rosterUniqueId = UUID.randomUUID().toString();
                    Roster roster4 = list.get(i76);
                    int i104 = b + 46;
                    int i105 = (i104 ^ (-1)) + (i104 << 1);
                    a = i105 % 128;
                    if (i105 % 2 != 0) {
                        arrayList.add(roster4);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    arrayList.add(roster4);
                    roster = list.get(i76);
                    int i815 = b;
                    int i918 = i815 & 115;
                    int i919 = -(-((i815 ^ 115) | i918));
                    i3 = (i918 ^ i919) + ((i919 & i918) << 1);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        jSONArray.put(roster.getJSON(i));
                        i4 = i76 ^ 91;
                        i5 = (i76 & 91) << 1;
                    } else {
                        jSONArray.put(roster.getJSON(i));
                        int i9110 = ((i76 | 37) << 1) - (i76 ^ 37);
                        int i9111 = (i9110 ^ (-1)) + (i9110 << 1);
                        i4 = i9111 & (-35);
                        i5 = i9111 | (-35);
                    }
                    i76 = i4 + i5;
                    int i9112 = b;
                    int i9113 = i9112 & 31;
                    int i9114 = i9112 | 31;
                    int i9115 = (i9113 & i9114) + (i9114 | i9113);
                    a = i9115 % 128;
                    int i9116 = i9115 % 2;
                }
                SugarRecord.saveInTx(arrayList);
                jSONObject.put("roster", jSONArray);
                int i106 = a;
                int i107 = ((i106 & 60) + (i106 | 60)) - 1;
                int i108 = i107 % 128;
                b = i108;
                int i109 = i107 % 2;
                int i110 = i108 & 69;
                int i111 = ((((i108 ^ 69) | i110) << 1) - (~(-((i108 | 69) & (~i110))))) - 1;
                a = i111 % 128;
                int i112 = i111 % 2;
            }
        }
        jSONObject3.put("apk_type", "signed");
        jSONObject3.put("is_new_survey", 1);
        jSONObject3.put("date", this.date);
        jSONObject3.put("date_gps", this.dateGPS);
        jSONObject3.put("time", this.time);
        jSONObject3.put("time_gps", this.timeGPS);
        jSONObject3.put("start_time", this.startTime);
        String str6 = this.startTimeGPS;
        int i113 = a;
        int i114 = (i113 ^ 89) + ((i113 & 89) << 1);
        b = i114 % 128;
        int i115 = i114 % 2;
        jSONObject3.put("start_time_gps", str6);
        jSONObject3.put("end_time", this.endTime);
        jSONObject3.put("end_time_gps", this.endTimeGPS);
        jSONObject3.put("imei_number", this.imei_number);
        jSONObject3.put("enumerator_name", this.enumerator_name);
        jSONObject3.put("enumerator_id", this.enumerator_id);
        jSONObject3.put("visit_status_id", this.visit_status_id);
        jSONObject3.put("visit_status_reason", this.visit_status_reason);
        int i116 = a;
        int i117 = i116 & 11;
        int i118 = -(-((i116 ^ 11) | i117));
        int i119 = (i117 & i118) + (i118 | i117);
        b = i119 % 128;
        int i120 = i119 % 2;
        jSONObject3.put("complete_form", this.complete_form);
        jSONObject3.put("comments", this.comments);
        jSONObject3.put("average_roster_time", this.averageRosterTime);
        jSONObject3.put("uuid", this.uuid);
        jSONObject3.put("is_off_hour", this.isOffHour);
        jSONObject3.put("unique_id", this.uniqueID);
        jSONObject3.put("form_no", this.form_no);
        String str7 = this.form_no_old;
        int i121 = b + 43;
        a = i121 % 128;
        int i122 = i121 % 2;
        jSONObject3.put("form_no_old", str7);
        jSONObject3.put("form_no_not_at_home", this.form_no_not_at_home);
        jSONObject3.put("re_collection_flag", this.reCollectionFlag);
        jSONObject3.put("location", this.location);
        jSONObject3.put("longitude", this.longitude);
        jSONObject3.put("latitude", this.latitude);
        jSONObject3.put("location_accuracy", this.locationAccuracy);
        jSONObject3.put("survey_accepted", this.survey_accepted);
        int i123 = a + 15;
        b = i123 % 128;
        int i124 = i123 % 2;
        jSONObject3.put("validation_percentage", this.validation_percentage);
        jSONObject3.put("survey_verified", this.survey_verified);
        jSONObject3.put("app_version", this.appVersion);
        jSONObject3.put("app_version_name", this.appVersionName);
        jSONObject3.put("previous_qr", this.previousQR);
        this.batchName = str;
        jSONObject3.put("batch_name", str);
        jSONObject3.put("is_selected_at_random", this.isSelectedAtRandom);
        int i125 = b + 9;
        a = i125 % 128;
        int i126 = i125 % 2;
        jSONObject3.put("is_selected_for_resurvey", this.isSelectedForReSurvey);
        jSONObject3.put("contact_detail_start", this.contactDetailStart);
        jSONObject3.put("contact_detail_end", this.contactDetailEnd);
        jSONObject3.put("household_start", this.householdStart);
        jSONObject3.put("household_end", this.householdEnd);
        jSONObject3.put("miscellaneous_start", this.miscellaneousStart);
        jSONObject3.put("miscellaneous_end", this.miscellaneousEnd);
        jSONObject3.put("diff_contact_detail", this.diffContactDetail);
        int i127 = b;
        int i128 = ((i127 ^ 4) + ((i127 & 4) << 1)) - 1;
        a = i128 % 128;
        int i129 = i128 % 2;
        jSONObject3.put("diff_household", this.diffHousehold);
        jSONObject3.put("diff_miscellaneous", this.diffMiscellaneous);
        jSONObject7.put("imei_mac", this.imei_number);
        jSONObject7.put("image_benificiary_name", this.image_benificiary_name);
        jSONObject7.put("image_benificiary", Base64.encodeToString(this.image_benificiary, 0));
        jSONObject7.put("image_household_name", this.image_household_name);
        String strEncodeToString = Base64.encodeToString(this.image_household, 0);
        int i130 = b;
        int i131 = ((i130 & 117) - (~(-(-(i130 | 117))))) - 1;
        a = i131 % 128;
        int i132 = i131 % 2;
        jSONObject7.put("image_household", strEncodeToString);
        jSONObject7.put("image_selfie_name", this.image_selfie_name);
        jSONObject7.put("image_selfie", Base64.encodeToString(this.image_selfie, 0));
        jSONObject7.put("image_thumb_imp", this.image_thumb_imp);
        jSONObject.put("geographic_location", jSONObject2);
        jSONObject.put("contact_details", jSONObject5);
        jSONObject.put("pictures", jSONObject7);
        jSONObject.put("survey_information", jSONObject3);
        int i133 = a + 85;
        b = i133 % 128;
        int i134 = i133 % 2;
        return jSONObject;
    }
}
