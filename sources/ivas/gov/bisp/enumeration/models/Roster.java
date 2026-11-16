package ivas.gov.bisp.enumeration.models;

import com.orm.SugarRecord;
import com.orm.annotation.Unique;
import ivas.gov.bisp.enumeration.p026az.P;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.Serializable;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Roster extends SugarRecord implements Serializable {
    private static int a = 1;
    private static int b;
    public String account_number;
    public String account_title;
    public double age;
    public int age_month;
    public int age_year;
    public int attended_school;
    public int attended_school_flag;
    public String attended_school_name;
    public String bank_address;
    public String banks_name;
    public String bform;
    public String bformRepeat;
    public int bform_flag;
    public byte[] bioImage;
    public int branch_code;
    public int chronic_disease;
    public int chronic_disease_flag;
    public String chronic_disease_name;
    public String cnic;
    public byte[] cnicArray;
    public int cnicOption;
    public String cnicPic;
    public String cnicPicName;
    public String cnicRepeat;
    public int cnic_flag;
    public int cnic_option_flag;
    public Boolean cnic_valid;
    public String cnic_valid_current_address;
    public String cnic_valid_dob;
    public String cnic_valid_english_name;
    public String cnic_valid_father_Name;
    public String cnic_valid_gender;
    public String cnic_valid_identification_mark;
    public String cnic_valid_name;
    public String cnic_valid_permanent_address;
    public String cnic_valid_religion;
    public int countOfSpouse;
    public String date_of_birth;
    public int date_of_birth_flag;
    public String date_of_birth_var;
    public double diff;
    public int disability;
    public int disability_flag;
    public String disability_name;
    public int employment_status;
    public int employment_status_flag;
    public String employment_status_name;
    public String end;
    public boolean firstTime;
    public long fk_id;
    public String gender;
    public int gender_flag;
    public String height_of_child;
    public int higher_education;
    public int higher_education_flag;
    public String higher_education_name;
    public double hours_worked;
    public int hours_worked_flag;
    public int id_father;
    public int id_mother;
    public String id_spouse;
    public String isBispBenif;
    public String isImmunized;
    public int isRespondent;
    private boolean isValidatedFromNadra;
    public int is_bisp_flag;
    public int language;
    public int language_flag;
    public String latitude;
    public String longitude;
    public int marital_status;
    public int merital_status_flag;
    public String merital_status_name;
    public String mobile_network_name;
    public String mobile_no;
    public String name_of_member;
    public int name_of_member_flag;
    public int radioGroupCalendarId;
    public int relation_to_household_flag;
    public int relation_to_household_id;
    public String relation_to_household_name;

    @Unique
    public String rosterUniqueId;
    public String rosterVaccinationsJson;
    public int roster_relational_id;
    public String start;
    public String surveyFormNo;
    public String surveyType;
    public String surveyUuid;
    public String urdu_name_of_member;
    public String weight_of_child;
    public int work_activity;
    public int work_activity_flag;
    public String work_activity_name;

    public Roster() {
        this.isImmunized = BuildConfig.FLAVOR;
        this.weight_of_child = BuildConfig.FLAVOR;
        this.height_of_child = BuildConfig.FLAVOR;
        this.rosterVaccinationsJson = "[]";
        this.countOfSpouse = 0;
        this.firstTime = true;
        this.isValidatedFromNadra = false;
        setEmptyValues();
    }

    public String getCnic() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = -(-(i2 | 111));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        String str = this.cnic;
        if (i7 == 0) {
            int i8 = 67 / 0;
        }
        int i9 = ((i6 & 122) + (i6 | 122)) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    public String getCnicRepeat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 101;
        int i4 = ((i2 & 101) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            throw null;
        }
        String str = this.cnicRepeat;
        int i8 = i7 & 69;
        int i9 = (i7 ^ 69) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        return str;
    }

    public String getNameOfMember() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = ((i2 | 79) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        try {
            return this.name_of_member;
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public boolean isValidatedFromNadra() {
        int i = 2 % 2;
        int i2 = b + 93;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isValidatedFromNadra;
        }
        throw null;
    }

    public void setValidatedFromNadra(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.isValidatedFromNadra = z;
        int i6 = ((i4 | 61) << 1) - (i4 ^ 61);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 99 / 0;
        }
    }

    public String toString() {
        String str;
        char c;
        int length;
        byte[] bArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = ((((i2 ^ 55) | i3) << 1) - (~(-((i2 | 55) & (~i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        StringBuilder sbW = j.w("Roster{fk_id=");
        sbW.append(this.fk_id);
        sbW.append(", roster_relational_id=");
        sbW.append(this.roster_relational_id);
        sbW.append(", rosterUniqueId='");
        int i6 = a;
        int i7 = i6 & 85;
        int i8 = ((i6 ^ 85) | i7) << 1;
        int i9 = -((i6 | 85) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            j.v(sbW, this.rosterUniqueId, ')', ", name_of_member='");
            j.v(sbW, this.name_of_member, 'd', ", urdu_name_of_member='");
            j.v(sbW, this.urdu_name_of_member, 'd', ", relation_to_household_id=");
        } else {
            j.v(sbW, this.rosterUniqueId, '\'', ", name_of_member='");
            j.v(sbW, this.name_of_member, '\'', ", urdu_name_of_member='");
            j.v(sbW, this.urdu_name_of_member, '\'', ", relation_to_household_id=");
        }
        sbW.append(this.relation_to_household_id);
        sbW.append(", relation_to_household_name='");
        j.v(sbW, this.relation_to_household_name, '\'', ", gender='");
        String str2 = this.gender;
        int i11 = b;
        int i12 = (i11 & 8) + (i11 | 8);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            j.v(sbW, str2, '\'', ", date_of_birth='");
            j.v(sbW, this.date_of_birth, (char) 25, ", date_of_birth_var='");
            j.v(sbW, this.date_of_birth_var, 'E', ", age=");
            sbW.append(this.age);
        } else {
            j.v(sbW, str2, '\'', ", date_of_birth='");
            j.v(sbW, this.date_of_birth, '\'', ", date_of_birth_var='");
            j.v(sbW, this.date_of_birth_var, '\'', ", age=");
            sbW.append(this.age);
        }
        sbW.append(", age_month=");
        sbW.append(this.age_month);
        sbW.append(", age_year=");
        sbW.append(this.age_year);
        sbW.append(", marital_status=");
        int i14 = b + 75;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            sbW.append(this.marital_status);
            sbW.append(", merital_status_name='");
            j.v(sbW, this.merital_status_name, ':', ", cnic='");
            str = this.cnic;
            c = '_';
        } else {
            sbW.append(this.marital_status);
            sbW.append(", merital_status_name='");
            j.v(sbW, this.merital_status_name, '\'', ", cnic='");
            str = this.cnic;
            c = '\'';
        }
        j.v(sbW, str, c, ", cnicRepeat='");
        j.v(sbW, this.cnicRepeat, '\'', ", cnicPic='");
        j.v(sbW, this.cnicPic, '\'', ", cnicPicName='");
        String str3 = this.cnicPicName;
        int i15 = b;
        int i16 = ((i15 | 101) << 1) - (i15 ^ 101);
        a = i16 % 128;
        int i17 = i16 % 2;
        j.v(sbW, str3, '\'', ", cnicOption=");
        sbW.append(this.cnicOption);
        sbW.append(", cnicArrayLength=");
        byte[] bArr2 = this.cnicArray;
        int length2 = 0;
        if (bArr2 != null) {
            int i18 = b;
            int i19 = i18 & 107;
            int i20 = i19 + ((i18 ^ 107) | i19);
            a = i20 % 128;
            int i21 = i20 % 2;
            length = bArr2.length;
            int i22 = (i18 & (-30)) | ((~i18) & 29);
            int i23 = (i18 & 29) << 1;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            a = i24 % 128;
            int i25 = i24 % 2;
        } else {
            int i26 = a;
            int i27 = i26 & 101;
            int i28 = (i26 ^ 101) | i27;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            b = i29 % 128;
            int i30 = i29 % 2;
            length = 0;
        }
        sbW.append(length);
        sbW.append(", bioImageLength=");
        int i31 = a;
        int i32 = (i31 ^ 111) + ((i31 & 111) << 1);
        int i33 = i32 % 128;
        b = i33;
        if (i32 % 2 != 0) {
            bArr = this.bioImage;
            if (bArr != null) {
                length2 = bArr.length;
                int i34 = i33 & 87;
                int i35 = (i33 ^ 87) | i34;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                a = i36 % 128;
                int i37 = i36 % 2;
            } else {
                length2 = 1;
            }
        } else {
            byte[] bArr3 = this.bioImage;
            if (bArr3 != null) {
                bArr = bArr3;
                length2 = bArr.length;
                int i38 = i33 & 87;
                int i39 = (i33 ^ 87) | i38;
                int i310 = (i38 ^ i39) + ((i39 & i38) << 1);
                a = i310 % 128;
                int i311 = i310 % 2;
            }
        }
        sbW.append(length2);
        sbW.append(", bform='");
        j.v(sbW, this.bform, '\'', ", bformRepeat='");
        j.v(sbW, this.bformRepeat, '\'', ", id_spouse='");
        j.v(sbW, this.id_spouse, '\'', ", id_father=");
        sbW.append(this.id_father);
        sbW.append(", id_mother=");
        sbW.append(this.id_mother);
        sbW.append(", disability=");
        sbW.append(this.disability);
        sbW.append(", disability_name='");
        j.v(sbW, this.disability_name, '\'', ", chronic_disease=");
        sbW.append(this.chronic_disease);
        sbW.append(", chronic_disease_name='");
        int i40 = b;
        int i41 = (i40 & (-80)) | ((~i40) & 79);
        int i42 = (i40 & 79) << 1;
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        a = i43 % 128;
        int i44 = i43 % 2;
        j.v(sbW, this.chronic_disease_name, '\'', ", language=");
        sbW.append(this.language);
        sbW.append(", attended_school=");
        sbW.append(this.attended_school);
        sbW.append(", attended_school_name='");
        j.v(sbW, this.attended_school_name, '\'', ", higher_education=");
        sbW.append(this.higher_education);
        sbW.append(", higher_education_name='");
        j.v(sbW, this.higher_education_name, '\'', ", work_activity=");
        sbW.append(this.work_activity);
        sbW.append(", work_activity_name='");
        j.v(sbW, this.work_activity_name, '\'', ", hours_worked=");
        sbW.append(this.hours_worked);
        sbW.append(", employment_status=");
        int i45 = a;
        int i46 = (i45 ^ 93) + ((i45 & 93) << 1);
        b = i46 % 128;
        int i47 = i46 % 2;
        sbW.append(this.employment_status);
        sbW.append(", employment_status_name='");
        j.v(sbW, this.employment_status_name, '\'', ", isBispBenif='");
        j.v(sbW, this.isBispBenif, '\'', ", isRespondent=");
        sbW.append(this.isRespondent);
        sbW.append(", mobile_no='");
        j.v(sbW, this.mobile_no, '\'', ", mobile_network_name='");
        j.v(sbW, this.mobile_network_name, '\'', ", banks_name='");
        j.v(sbW, this.banks_name, '\'', ", account_title='");
        j.v(sbW, this.account_title, '\'', ", account_number='");
        j.v(sbW, this.account_number, '\'', ", branch_code=");
        sbW.append(this.branch_code);
        int i48 = b;
        int i49 = ((i48 ^ 27) | (i48 & 27)) << 1;
        int i50 = -(((~i48) & 27) | (i48 & (-28)));
        int i51 = (i49 & i50) + (i50 | i49);
        a = i51 % 128;
        int i52 = i51 % 2;
        sbW.append(", bank_address='");
        j.v(sbW, this.bank_address, '\'', ", cnic_valid=");
        sbW.append(this.cnic_valid);
        sbW.append(", cnic_valid_name='");
        j.v(sbW, this.cnic_valid_name, '\'', ", cnic_valid_english_name='");
        j.v(sbW, this.cnic_valid_english_name, '\'', ", cnic_valid_father_Name='");
        j.v(sbW, this.cnic_valid_father_Name, '\'', ", cnic_valid_dob='");
        j.v(sbW, this.cnic_valid_dob, '\'', ", cnic_valid_gender='");
        j.v(sbW, this.cnic_valid_gender, '\'', ", cnic_valid_current_address='");
        j.v(sbW, this.cnic_valid_current_address, '\'', ", cnic_valid_permanent_address='");
        j.v(sbW, this.cnic_valid_permanent_address, '\'', ", cnic_valid_identification_mark='");
        j.v(sbW, this.cnic_valid_identification_mark, '\'', ", cnic_valid_religion='");
        int i53 = b;
        int i54 = i53 & 59;
        int i55 = (i54 - (~((i53 ^ 59) | i54))) - 1;
        a = i55 % 128;
        int i56 = i55 % 2;
        j.v(sbW, this.cnic_valid_religion, '\'', ", surveyFormNo='");
        j.v(sbW, this.surveyFormNo, '\'', ", surveyUuid='");
        j.v(sbW, this.surveyUuid, '\'', ", surveyType='");
        j.v(sbW, this.surveyType, '\'', ", latitude='");
        j.v(sbW, this.latitude, '\'', ", longitude='");
        j.v(sbW, this.longitude, '\'', ", start='");
        j.v(sbW, this.start, '\'', ", end='");
        j.v(sbW, this.end, '\'', ", diff=");
        sbW.append(this.diff);
        sbW.append(", isImmunized='");
        j.v(sbW, this.isImmunized, '\'', ", weight_of_child='");
        int i57 = b + 35;
        a = i57 % 128;
        int i58 = i57 % 2;
        j.v(sbW, this.weight_of_child, '\'', ", height_of_child='");
        j.v(sbW, this.height_of_child, '\'', ", rosterVaccinationsJson='");
        j.v(sbW, this.rosterVaccinationsJson, '\'', ", name_of_member_flag=");
        sbW.append(this.name_of_member_flag);
        sbW.append(", relation_to_household_flag=");
        sbW.append(this.relation_to_household_flag);
        sbW.append(", gender_flag=");
        sbW.append(this.gender_flag);
        sbW.append(", radioGroupCalendarId=");
        sbW.append(this.radioGroupCalendarId);
        sbW.append(", date_of_birth_flag=");
        sbW.append(this.date_of_birth_flag);
        sbW.append(", merital_status_flag=");
        sbW.append(this.merital_status_flag);
        sbW.append(", cnic_flag=");
        int i59 = b;
        int i60 = i59 ^ 5;
        int i61 = -(-((i59 & 5) << 1));
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        a = i62 % 128;
        int i63 = i62 % 2;
        sbW.append(this.cnic_flag);
        sbW.append(", cnic_option_flag=");
        sbW.append(this.cnic_option_flag);
        sbW.append(", is_bisp_flag=");
        sbW.append(this.is_bisp_flag);
        sbW.append(", bform_flag=");
        sbW.append(this.bform_flag);
        sbW.append(", disability_flag=");
        sbW.append(this.disability_flag);
        sbW.append(", chronic_disease_flag=");
        sbW.append(this.chronic_disease_flag);
        sbW.append(", language_flag=");
        sbW.append(this.language_flag);
        sbW.append(", attended_school_flag=");
        sbW.append(this.attended_school_flag);
        sbW.append(", higher_education_flag=");
        int i64 = b;
        int i65 = i64 & 7;
        int i66 = (i64 ^ 7) | i65;
        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
        a = i67 % 128;
        int i68 = i67 % 2;
        sbW.append(this.higher_education_flag);
        sbW.append(", work_activity_flag=");
        sbW.append(this.work_activity_flag);
        sbW.append(", hours_worked_flag=");
        sbW.append(this.hours_worked_flag);
        sbW.append(", employment_status_flag=");
        sbW.append(this.employment_status_flag);
        sbW.append(", countOfSpouse=");
        sbW.append(this.countOfSpouse);
        sbW.append(", firstTime=");
        sbW.append(this.firstTime);
        sbW.append(", isValidatedFromNadra=");
        sbW.append(this.isValidatedFromNadra);
        sbW.append('}');
        String string = sbW.toString();
        int i69 = a;
        int i70 = (i69 | 67) << 1;
        int i71 = -(((~i69) & 67) | (i69 & (-68)));
        int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
        b = i72 % 128;
        if (i72 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Roster(JSONObject jSONObject) {
        this.isImmunized = BuildConfig.FLAVOR;
        this.weight_of_child = BuildConfig.FLAVOR;
        this.height_of_child = BuildConfig.FLAVOR;
        this.rosterVaccinationsJson = "[]";
        this.countOfSpouse = 0;
        this.firstTime = true;
        this.isValidatedFromNadra = false;
        this.fk_id = 0L;
        setFromJSON(jSONObject);
    }

    public JSONObject getJSONForCnicVerified() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("roster_unique_id", this.rosterUniqueId);
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = -(-((i2 ^ 27) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        jSONObject.put("roster_relational_id", this.roster_relational_id);
        jSONObject.put("name_of_member", this.name_of_member);
        int i7 = a + 107;
        b = i7 % 128;
        int i8 = i7 % 2;
        jSONObject.put("relation_to_household_id", this.relation_to_household_id);
        jSONObject.put("gender", this.gender);
        int i9 = b;
        int i10 = i9 & 27;
        int i11 = (((i9 | 27) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        jSONObject.put("age", this.age);
        jSONObject.put("cnic", this.cnic);
        int i13 = a;
        int i14 = (i13 & (-88)) | ((~i13) & 87);
        int i15 = -(-((i13 & 87) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            jSONObject.put("cnic_option", this.cnicOption);
            throw null;
        }
        jSONObject.put("cnic_option", this.cnicOption);
        jSONObject.put("survey_type", this.surveyType);
        jSONObject.put("survey_form_no", this.surveyFormNo);
        int i17 = b + 62;
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        jSONObject.put("survey_uuid", this.surveyUuid);
        jSONObject.put("latitude", this.latitude);
        int i20 = b;
        int i21 = (((i20 ^ 125) | (i20 & 125)) << 1) - (((~i20) & 125) | (i20 & (-126)));
        a = i21 % 128;
        int i22 = i21 % 2;
        jSONObject.put("longitude", this.longitude);
        int i23 = b;
        int i24 = (-2) - (((i23 & 100) + (i23 | 100)) ^ (-1));
        a = i24 % 128;
        int i25 = i24 % 2;
        return jSONObject;
    }

    public void setFromJSON(JSONObject jSONObject) {
        String string;
        String string2;
        String string3;
        String string4;
        int i;
        String string5;
        String string6;
        String string7;
        int i2;
        int i3;
        String string8;
        String string9;
        String string10;
        int i4;
        int i5;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        int i6;
        int i7;
        int i8;
        int i9;
        String string16;
        int i10;
        int i11;
        int i12;
        String string17;
        String string18;
        int i13;
        int i14;
        String string19;
        String string20;
        String string21;
        String string22;
        String string23;
        String string24;
        int i15 = 2 % 2;
        int i16 = b;
        int i17 = i16 + 117;
        a = i17 % 128;
        int i18 = i17 % 2;
        if (jSONObject == null) {
            int i19 = ((i16 | 37) << 1) - ((i16 & (-38)) | ((~i16) & 37));
            a = i19 % 128;
            int i20 = i19 % 2;
            setEmptyValues();
            int i21 = a;
            int i22 = i21 & 89;
            int i23 = -(-((i21 ^ 89) | i22));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
            return;
        }
        try {
            if (jSONObject.has("is_immunized")) {
                int i26 = a;
                int i27 = i26 & 55;
                int i28 = (i27 - (~(-(-((i26 ^ 55) | i27))))) - 1;
                b = i28 % 128;
                int i29 = i28 % 2;
                this.isImmunized = jSONObject.getString("is_immunized");
            }
            if (jSONObject.has("RosterVaccinations")) {
                int i30 = a;
                int i31 = i30 & 121;
                int i32 = (~i31) & (i30 | 121);
                int i33 = -(-(i31 << 1));
                int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                b = i34 % 128;
                if (i34 % 2 != 0) {
                    this.rosterVaccinationsJson = jSONObject.getJSONArray("RosterVaccinations").toString();
                    int i35 = 86 / 0;
                } else {
                    this.rosterVaccinationsJson = jSONObject.getJSONArray("RosterVaccinations").toString();
                }
            }
            boolean zHas = jSONObject.has("mobile_network_name");
            String string25 = BuildConfig.FLAVOR;
            if (zHas) {
                string = jSONObject.getString("mobile_network_name");
                int i36 = a;
                int i37 = (((i36 | 60) << 1) - (i36 ^ 60)) - 1;
                b = i37 % 128;
                int i38 = i37 % 2;
            } else {
                string = BuildConfig.FLAVOR;
            }
            this.mobile_network_name = string;
            if (jSONObject.has("mobile_no")) {
                int i39 = b;
                int i40 = i39 & 121;
                int i41 = (i40 - (~(-(-((i39 ^ 121) | i40))))) - 1;
                a = i41 % 128;
                int i42 = i41 % 2;
                string2 = jSONObject.getString("mobile_no");
                int i43 = a;
                int i44 = ((i43 ^ 58) + ((i43 & 58) << 1)) - 1;
                b = i44 % 128;
                int i45 = i44 % 2;
            } else {
                string2 = BuildConfig.FLAVOR;
            }
            this.mobile_no = string2;
            this.banks_name = jSONObject.has("banks_name") ? jSONObject.getString("banks_name") : BuildConfig.FLAVOR;
            if (jSONObject.has("weight_of_child")) {
                int i46 = a + 39;
                b = i46 % 128;
                int i47 = i46 % 2;
                string3 = jSONObject.getString("weight_of_child");
            } else {
                string3 = BuildConfig.FLAVOR;
            }
            this.weight_of_child = string3;
            Object obj = null;
            if (jSONObject.has("height_of_child")) {
                int i48 = b + 98;
                int i49 = (i48 ^ (-1)) + (i48 << 1);
                a = i49 % 128;
                if (i49 % 2 == 0) {
                    jSONObject.getString("height_of_child");
                    obj.hashCode();
                    throw null;
                }
                string4 = jSONObject.getString("height_of_child");
            } else {
                string4 = BuildConfig.FLAVOR;
            }
            this.height_of_child = string4;
            boolean zHas2 = jSONObject.has("branch_code");
            int i50 = a;
            int i51 = (i50 & 73) + (i50 | 73);
            b = i51 % 128;
            int i52 = i51 % 2;
            if (!zHas2) {
                i = 0;
            } else {
                int i53 = ((i50 & (-120)) | ((~i50) & 119)) + ((i50 & 119) << 1);
                b = i53 % 128;
                int i54 = i53 % 2;
                i = jSONObject.getInt("branch_code");
            }
            this.branch_code = i;
            this.bank_address = jSONObject.has("bank_address") ? jSONObject.getString("bank_address") : BuildConfig.FLAVOR;
            if (jSONObject.has("account_title")) {
                int i55 = b;
                int i56 = (i55 & 24) + (i55 | 24);
                int i57 = (i56 ^ (-1)) + (i56 << 1);
                a = i57 % 128;
                if (i57 % 2 == 0) {
                    jSONObject.getString("account_title");
                    throw null;
                }
                string5 = jSONObject.getString("account_title");
            } else {
                string5 = BuildConfig.FLAVOR;
            }
            this.account_title = string5;
            if (jSONObject.has("account_number")) {
                int i58 = a;
                int i59 = i58 ^ 45;
                int i60 = ((i58 & 45) | i59) << 1;
                int i61 = -i59;
                int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                b = i62 % 128;
                int i63 = i62 % 2;
                string6 = jSONObject.getString("account_number");
            } else {
                string6 = BuildConfig.FLAVOR;
            }
            this.account_number = string6;
            if (!jSONObject.has("roster_unique_id")) {
                string7 = BuildConfig.FLAVOR;
            } else {
                int i64 = b;
                int i65 = (i64 | 47) << 1;
                int i66 = -(((~i64) & 47) | (i64 & (-48)));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                a = i67 % 128;
                if (i67 % 2 == 0) {
                    jSONObject.getString("roster_unique_id");
                    throw null;
                }
                string7 = jSONObject.getString("roster_unique_id");
            }
            this.rosterUniqueId = string7;
            if (jSONObject.has("roster_relational_id")) {
                int i68 = b;
                int i69 = i68 & 3;
                int i70 = (i68 | 3) & (~i69);
                int i71 = i69 << 1;
                int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
                a = i72 % 128;
                int i73 = i72 % 2;
                i2 = jSONObject.getInt("roster_relational_id");
            } else {
                i2 = 0;
            }
            this.roster_relational_id = i2;
            this.name_of_member = jSONObject.has("name_of_member") ? jSONObject.getString("name_of_member") : BuildConfig.FLAVOR;
            if (jSONObject.has("relation_to_household_id")) {
                int i74 = b;
                int i75 = (i74 & 51) + (i74 | 51);
                a = i75 % 128;
                if (i75 % 2 == 0) {
                    jSONObject.getInt("relation_to_household_id");
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                i3 = jSONObject.getInt("relation_to_household_id");
            } else {
                i3 = 0;
            }
            this.relation_to_household_id = i3;
            this.relation_to_household_name = jSONObject.has("relation_to_household_name") ? jSONObject.getString("relation_to_household_name") : BuildConfig.FLAVOR;
            if (jSONObject.has("gender")) {
                int i76 = b;
                int i77 = i76 & 95;
                int i78 = -(-((i76 ^ 95) | i77));
                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                a = i79 % 128;
                int i80 = i79 % 2;
                string8 = jSONObject.getString("gender");
            } else {
                string8 = BuildConfig.FLAVOR;
            }
            this.gender = string8;
            if (!jSONObject.has("date_of_birth")) {
                string9 = BuildConfig.FLAVOR;
            } else {
                int i81 = a;
                int i82 = i81 ^ 95;
                int i83 = (i81 & 95) << 1;
                int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                b = i84 % 128;
                int i85 = i84 % 2;
                string9 = jSONObject.getString("date_of_birth");
            }
            this.date_of_birth = string9;
            if (jSONObject.has("date_of_birth_var")) {
                int i86 = a;
                int i87 = ((i86 ^ 69) | (i86 & 69)) << 1;
                int i88 = -(((~i86) & 69) | (i86 & (-70)));
                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                b = i89 % 128;
                int i90 = i89 % 2;
                string10 = jSONObject.getString("date_of_birth_var");
            } else {
                string10 = BuildConfig.FLAVOR;
            }
            this.date_of_birth_var = string10;
            this.age_month = jSONObject.has("age_month") ? jSONObject.getInt("age_month") : 0;
            if (jSONObject.has("age_year")) {
                int i91 = a;
                int i92 = ((i91 | 11) << 1) - (i91 ^ 11);
                b = i92 % 128;
                int i93 = i92 % 2;
                i4 = jSONObject.getInt("age_year");
            } else {
                i4 = 0;
            }
            this.age_year = i4;
            this.age = jSONObject.has("age") ? jSONObject.getInt("age") : 0.0d;
            if (jSONObject.has("marital_status")) {
                i5 = jSONObject.getInt("marital_status");
                int i94 = b;
                int i95 = i94 & 59;
                int i96 = (((i94 | 59) & (~i95)) - (~(-(-(i95 << 1))))) - 1;
                a = i96 % 128;
                int i97 = i96 % 2;
            } else {
                i5 = 200;
            }
            this.marital_status = i5;
            if (jSONObject.has("merital_status_name")) {
                int i98 = a;
                int i99 = i98 & 55;
                int i100 = -(-((i98 ^ 55) | i99));
                int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
                b = i101 % 128;
                int i102 = i101 % 2;
                string11 = jSONObject.getString("merital_status_name");
            } else {
                int i103 = b;
                int i104 = i103 ^ 3;
                int i105 = ((i103 & 3) | i104) << 1;
                int i106 = -i104;
                int i107 = (i105 & i106) + (i105 | i106);
                a = i107 % 128;
                int i108 = i107 % 2;
                string11 = BuildConfig.FLAVOR;
            }
            this.merital_status_name = string11;
            this.cnic = jSONObject.has("cnic") ? jSONObject.getString("cnic") : BuildConfig.FLAVOR;
            this.cnicPic = jSONObject.has("cnic_pic") ^ true ? BuildConfig.FLAVOR : jSONObject.getString("cnic_pic");
            if (jSONObject.has("cnic_pic_name")) {
                int i109 = a;
                int i110 = (i109 ^ 119) + ((i109 & 119) << 1);
                b = i110 % 128;
                if (i110 % 2 != 0) {
                    jSONObject.getString("cnic_pic_name");
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                string12 = jSONObject.getString("cnic_pic_name");
            } else {
                string12 = BuildConfig.FLAVOR;
            }
            this.cnicPicName = string12;
            if (jSONObject.has("is_bisp_beneficiary")) {
                int i111 = b;
                int i112 = ((i111 ^ 19) | (i111 & 19)) << 1;
                int i113 = -(((~i111) & 19) | (i111 & (-20)));
                int i114 = (i112 & i113) + (i113 | i112);
                a = i114 % 128;
                int i115 = i114 % 2;
                string13 = jSONObject.getString("is_bisp_beneficiary");
            } else {
                string13 = BuildConfig.FLAVOR;
            }
            this.isBispBenif = string13;
            this.cnicOption = jSONObject.has("cnic_option") ? jSONObject.getInt("cnic_option") : 1;
            if (jSONObject.has("bform")) {
                int i116 = b;
                int i117 = ((i116 | 77) << 1) - (i116 ^ 77);
                a = i117 % 128;
                if (i117 % 2 == 0) {
                    string14 = jSONObject.getString("bform");
                    int i118 = 54 / 0;
                } else {
                    string14 = jSONObject.getString("bform");
                }
            } else {
                int i119 = b;
                int i120 = ((i119 | 13) << 1) - (i119 ^ 13);
                a = i120 % 128;
                int i121 = i120 % 2;
                string14 = BuildConfig.FLAVOR;
            }
            this.bform = string14;
            if (!(!jSONObject.has("id_spouse"))) {
                int i122 = a;
                int i123 = i122 & 103;
                int i124 = (i123 - (~((i122 ^ 103) | i123))) - 1;
                b = i124 % 128;
                int i125 = i124 % 2;
                string15 = jSONObject.getString("id_spouse");
            } else {
                string15 = "0";
            }
            this.id_spouse = string15;
            if (jSONObject.has("id_father")) {
                int i126 = b;
                int i127 = (i126 & (-120)) | ((~i126) & 119);
                int i128 = -(-((i126 & 119) << 1));
                int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
                a = i129 % 128;
                if (i129 % 2 == 0) {
                    i6 = jSONObject.getInt("id_father");
                    int i130 = 71 / 0;
                } else {
                    i6 = jSONObject.getInt("id_father");
                }
            } else {
                i6 = 0;
            }
            this.id_father = i6;
            if (jSONObject.has("id_mother")) {
                int i131 = b;
                int i132 = (i131 & 93) + (i131 | 93);
                a = i132 % 128;
                int i133 = i132 % 2;
                i7 = jSONObject.getInt("id_mother");
                int i134 = a + 77;
                b = i134 % 128;
                int i135 = i134 % 2;
            } else {
                i7 = 0;
            }
            this.id_mother = i7;
            if (jSONObject.has("respondant")) {
                int i136 = b;
                int i137 = ((i136 & (-82)) | ((~i136) & 81)) + ((i136 & 81) << 1);
                a = i137 % 128;
                int i138 = i137 % 2;
                i8 = jSONObject.getInt("respondant");
            } else {
                i8 = 0;
            }
            this.isRespondent = i8;
            if (jSONObject.has("disability")) {
                int i139 = a;
                int i140 = (((i139 ^ 65) | (i139 & 65)) << 1) - (((~i139) & 65) | (i139 & (-66)));
                b = i140 % 128;
                int i141 = i140 % 2;
                i9 = jSONObject.getInt("disability");
            } else {
                i9 = 0;
            }
            this.disability = i9;
            if (jSONObject.has("disability_name")) {
                int i142 = a;
                int i143 = i142 & 7;
                int i144 = ((((i142 ^ 7) | i143) << 1) - (~(-((i142 | 7) & (~i143))))) - 1;
                b = i144 % 128;
                if (i144 % 2 != 0) {
                    string16 = jSONObject.getString("disability_name");
                    int i145 = 69 / 0;
                } else {
                    string16 = jSONObject.getString("disability_name");
                }
            } else {
                string16 = BuildConfig.FLAVOR;
            }
            this.disability_name = string16;
            if (jSONObject.has("chronic_disease")) {
                int i146 = b;
                int i147 = i146 | 113;
                int i148 = i147 << 1;
                int i149 = -((~(i146 & 113)) & i147);
                int i150 = (i148 & i149) + (i149 | i148);
                a = i150 % 128;
                if (i150 % 2 == 0) {
                    jSONObject.getInt("chronic_disease");
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                i10 = jSONObject.getInt("chronic_disease");
            } else {
                i10 = 0;
            }
            this.chronic_disease = i10;
            this.chronic_disease_name = jSONObject.has("chronic_disease_name") ? jSONObject.getString("chronic_disease_name") : BuildConfig.FLAVOR;
            this.language = jSONObject.has("language") ^ true ? -1 : jSONObject.getInt("language");
            if (jSONObject.has("attended_school")) {
                int i151 = a;
                int i152 = ((i151 ^ 121) | (i151 & 121)) << 1;
                int i153 = -(((~i151) & 121) | (i151 & (-122)));
                int i154 = (i152 ^ i153) + ((i153 & i152) << 1);
                b = i154 % 128;
                if (i154 % 2 != 0) {
                    jSONObject.getInt("attended_school");
                    throw null;
                }
                i11 = jSONObject.getInt("attended_school");
            } else {
                int i155 = a;
                int i156 = i155 & 13;
                int i157 = ((i155 ^ 13) | i156) << 1;
                int i158 = -((i155 | 13) & (~i156));
                int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
                b = i159 % 128;
                int i160 = i159 % 2;
                i11 = 0;
            }
            this.attended_school = i11;
            if (jSONObject.has("attended_school_name")) {
                int i161 = a + 117;
                b = i161 % 128;
                if (i161 % 2 != 0) {
                    string17 = jSONObject.getString("attended_school_name");
                    i12 = 0;
                    int i162 = 71 / 0;
                } else {
                    i12 = 0;
                    string17 = jSONObject.getString("attended_school_name");
                }
            } else {
                i12 = 0;
                string17 = BuildConfig.FLAVOR;
            }
            this.attended_school_name = string17;
            this.higher_education = jSONObject.has("higher_education") ? jSONObject.getInt("higher_education") : i12;
            if (jSONObject.has("higher_education_name")) {
                int i163 = b;
                int i164 = (i163 ^ 103) + ((i163 & 103) << 1);
                a = i164 % 128;
                int i165 = i164 % 2;
                string18 = jSONObject.getString("higher_education_name");
            } else {
                string18 = BuildConfig.FLAVOR;
            }
            this.higher_education_name = string18;
            if (jSONObject.has("work_activity")) {
                i13 = jSONObject.getInt("work_activity");
                int i166 = b + 25;
                a = i166 % 128;
                int i167 = i166 % 2;
            } else {
                i13 = i12;
            }
            this.work_activity = i13;
            this.work_activity_name = jSONObject.has("work_activity_name") ? jSONObject.getString("work_activity_name") : BuildConfig.FLAVOR;
            this.hours_worked = jSONObject.has("hours_worked") ? jSONObject.getInt("hours_worked") : 0.0d;
            if (jSONObject.has("employment_status")) {
                int i168 = b;
                int i169 = i168 & 63;
                int i170 = (i168 | 63) & (~i169);
                int i171 = -(-(i169 << 1));
                int i172 = (i170 & i171) + (i170 | i171);
                a = i172 % 128;
                if (i172 % 2 == 0) {
                    jSONObject.getInt("employment_status");
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
                i14 = jSONObject.getInt("employment_status");
            } else {
                i14 = i12;
            }
            this.employment_status = i14;
            if (jSONObject.has("employment_status_name")) {
                int i173 = a;
                int i174 = (((i173 | 34) << 1) - (i173 ^ 34)) - 1;
                b = i174 % 128;
                int i175 = i174 % 2;
                string19 = jSONObject.getString("employment_status_name");
            } else {
                string19 = BuildConfig.FLAVOR;
            }
            this.employment_status_name = string19;
            if (jSONObject.has("survey_form_no")) {
                int i176 = (-2) - ((b + 64) ^ (-1));
                a = i176 % 128;
                if (i176 % 2 == 0) {
                    jSONObject.getString("survey_form_no");
                    throw null;
                }
                string20 = jSONObject.getString("survey_form_no");
            } else {
                string20 = BuildConfig.FLAVOR;
            }
            this.surveyFormNo = string20;
            if (jSONObject.has("survey_uuid")) {
                int i177 = b;
                int i178 = i177 | 73;
                int i179 = i178 << 1;
                int i180 = -((~(i177 & 73)) & i178);
                int i181 = (i179 ^ i180) + ((i180 & i179) << 1);
                a = i181 % 128;
                if (i181 % 2 == 0) {
                    jSONObject.getString("survey_uuid");
                    throw null;
                }
                string21 = jSONObject.getString("survey_uuid");
            } else {
                string21 = BuildConfig.FLAVOR;
            }
            this.surveyUuid = string21;
            this.surveyType = jSONObject.has("survey_type") ^ true ? BuildConfig.FLAVOR : jSONObject.getString("survey_type");
            if (jSONObject.has("start")) {
                int i182 = b;
                int i183 = i182 & 91;
                int i184 = (((i182 | 91) & (~i183)) - (~(-(-(i183 << 1))))) - 1;
                a = i184 % 128;
                int i185 = i184 % 2;
                string22 = jSONObject.getString("start");
            } else {
                string22 = BuildConfig.FLAVOR;
            }
            this.start = string22;
            if (jSONObject.has("end")) {
                int i186 = b;
                int i187 = i186 & 91;
                int i188 = -(-((i186 ^ 91) | i187));
                int i189 = (i187 ^ i188) + ((i188 & i187) << 1);
                a = i189 % 128;
                int i190 = i189 % 2;
                string23 = jSONObject.getString("end");
            } else {
                string23 = BuildConfig.FLAVOR;
            }
            this.end = string23;
            this.diff = jSONObject.has("diff") ? jSONObject.getInt("diff") : 0.0d;
            if (jSONObject.has("latitude")) {
                string24 = jSONObject.getString("latitude");
            } else {
                int i191 = b;
                int i192 = i191 & 113;
                int i193 = (((i191 | 113) & (~i192)) - (~(i192 << 1))) - 1;
                a = i193 % 128;
                int i194 = i193 % 2;
                string24 = BuildConfig.FLAVOR;
            }
            this.latitude = string24;
            if (jSONObject.has("longitude")) {
                int i195 = b;
                int i196 = i195 & 1;
                int i197 = i196 + ((i195 ^ 1) | i196);
                a = i197 % 128;
                if (i197 % 2 == 0) {
                    jSONObject.getString("longitude");
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
                string25 = jSONObject.getString("longitude");
            }
            this.longitude = string25;
            int i198 = b;
            int i199 = (i198 ^ 79) + ((i198 & 79) << 1);
            a = i199 % 128;
            int i200 = i199 % 2;
        } catch (Exception unused) {
        }
    }

    public void setEmptyValues() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.cnic_valid = Boolean.FALSE;
        this.cnic_valid_name = BuildConfig.FLAVOR;
        this.weight_of_child = BuildConfig.FLAVOR;
        this.height_of_child = BuildConfig.FLAVOR;
        this.cnic_valid_english_name = BuildConfig.FLAVOR;
        this.cnic_valid_father_Name = BuildConfig.FLAVOR;
        this.cnic_valid_dob = BuildConfig.FLAVOR;
        this.cnic_valid_gender = BuildConfig.FLAVOR;
        this.cnic_valid_current_address = BuildConfig.FLAVOR;
        this.cnic_valid_permanent_address = BuildConfig.FLAVOR;
        int i5 = b;
        int i6 = i5 & 117;
        int i7 = ((~i6) & (i5 | 117)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.cnic_valid_identification_mark = BuildConfig.FLAVOR;
        this.cnic_valid_religion = BuildConfig.FLAVOR;
        this.mobile_network_name = BuildConfig.FLAVOR;
        this.mobile_no = BuildConfig.FLAVOR;
        this.banks_name = BuildConfig.FLAVOR;
        this.branch_code = 0;
        this.bank_address = BuildConfig.FLAVOR;
        this.account_title = BuildConfig.FLAVOR;
        this.account_number = BuildConfig.FLAVOR;
        this.rosterUniqueId = BuildConfig.FLAVOR;
        this.fk_id = 0L;
        int i9 = i5 + 66;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        this.name_of_member = BuildConfig.FLAVOR;
        this.urdu_name_of_member = BuildConfig.FLAVOR;
        this.roster_relational_id = 0;
        this.relation_to_household_id = 0;
        this.relation_to_household_name = BuildConfig.FLAVOR;
        this.gender = BuildConfig.FLAVOR;
        this.date_of_birth = BuildConfig.FLAVOR;
        this.date_of_birth_var = BuildConfig.FLAVOR;
        this.age_month = 0;
        this.age_year = 0;
        this.age = 0.0d;
        int i12 = i5 & 39;
        int i13 = ((i5 | 39) & (~i12)) + (i12 << 1);
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        this.marital_status = 0;
        this.merital_status_name = BuildConfig.FLAVOR;
        this.cnic = BuildConfig.FLAVOR;
        this.cnicPic = BuildConfig.FLAVOR;
        this.cnicPicName = BuildConfig.FLAVOR;
        this.cnicRepeat = BuildConfig.FLAVOR;
        this.cnicOption = -1;
        this.isBispBenif = BuildConfig.FLAVOR;
        this.bform = BuildConfig.FLAVOR;
        this.bformRepeat = BuildConfig.FLAVOR;
        this.id_spouse = "0";
        int i16 = (-2) - (((i14 ^ 94) + ((i14 & 94) << 1)) ^ (-1));
        int i17 = i16 % 128;
        b = i17;
        int i18 = i16 % 2;
        this.id_father = 0;
        this.id_mother = 0;
        this.disability = 6;
        this.disability_name = BuildConfig.FLAVOR;
        this.chronic_disease = 0;
        this.chronic_disease_name = BuildConfig.FLAVOR;
        this.language = -1;
        this.attended_school = 0;
        this.attended_school_name = BuildConfig.FLAVOR;
        this.higher_education = 0;
        this.higher_education_name = BuildConfig.FLAVOR;
        int i19 = i17 & 65;
        int i20 = -(-((i17 ^ 65) | i19));
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        a = i21 % 128;
        int i22 = i21 % 2;
        this.work_activity = 0;
        this.work_activity_name = BuildConfig.FLAVOR;
        this.hours_worked = 0.0d;
        this.employment_status = 0;
        this.employment_status_name = BuildConfig.FLAVOR;
        this.name_of_member_flag = 1;
        this.relation_to_household_flag = -1;
        this.gender_flag = -1;
        this.date_of_birth_flag = -1;
        this.merital_status_flag = -1;
        this.cnic_flag = -1;
        this.cnic_option_flag = -1;
        int i23 = ((i17 | 13) << 1) - (i17 ^ 13);
        int i24 = i23 % 128;
        a = i24;
        int i25 = i23 % 2;
        this.is_bisp_flag = -1;
        this.bform_flag = -1;
        this.disability_flag = -1;
        this.chronic_disease_flag = -1;
        this.language_flag = -1;
        this.attended_school_flag = -1;
        this.higher_education_flag = -1;
        this.work_activity_flag = -1;
        this.hours_worked_flag = -1;
        this.employment_status_flag = -1;
        this.countOfSpouse = 0;
        this.isRespondent = 0;
        this.surveyFormNo = BuildConfig.FLAVOR;
        int i26 = (i24 & (-106)) | ((~i24) & 105);
        int i27 = -(-((i24 & 105) << 1));
        int i28 = (i26 & i27) + (i26 | i27);
        b = i28 % 128;
        int i29 = i28 % 2;
        this.surveyUuid = BuildConfig.FLAVOR;
        this.surveyType = BuildConfig.FLAVOR;
        this.start = "0000-00-00 00:00:00";
        this.end = "0000-00-00 00:00:00";
        this.diff = 0.0d;
        this.latitude = BuildConfig.FLAVOR;
        this.longitude = BuildConfig.FLAVOR;
        this.isImmunized = BuildConfig.FLAVOR;
        this.rosterVaccinationsJson = "[]";
        int i30 = ((i24 ^ 8) + ((i24 & 8) << 1)) - 1;
        b = i30 % 128;
        int i31 = i30 % 2;
    }

    public JSONObject getJSON(int i) {
        JSONArray jSONArray;
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mobile_network_name", this.mobile_network_name);
        jSONObject.put("mobile_no", this.mobile_no);
        jSONObject.put("banks_name", this.banks_name);
        jSONObject.put("branch_code", this.branch_code);
        jSONObject.put("bank_address", this.bank_address);
        jSONObject.put("account_title", this.account_title);
        int i3 = b + 59;
        a = i3 % 128;
        int i4 = i3 % 2;
        jSONObject.put("account_number", this.account_number);
        jSONObject.put("roster_unique_id", this.rosterUniqueId);
        jSONObject.put("roster_relational_id", this.roster_relational_id);
        jSONObject.put("name_of_member", this.name_of_member);
        jSONObject.put("urdu_name_of_member", this.urdu_name_of_member);
        jSONObject.put("relation_to_household_id", this.relation_to_household_id);
        jSONObject.put("gender", this.gender);
        int i5 = b + 125;
        a = i5 % 128;
        int i6 = i5 % 2;
        jSONObject.put("date_of_birth", this.date_of_birth);
        jSONObject.put("date_of_birth_var", this.date_of_birth_var);
        jSONObject.put("age_month", this.age_month);
        jSONObject.put("age_year", this.age_year);
        jSONObject.put("age", this.age);
        jSONObject.put("marital_status", this.marital_status);
        jSONObject.put("cnic", this.cnic);
        int i7 = a + 111;
        b = i7 % 128;
        int i8 = i7 % 2;
        P.e();
        jSONObject.put("cnic_pic", P.d(this.cnicArray));
        P.e();
        jSONObject.put("biometric_pic", P.d(this.bioImage));
        jSONObject.put("cnic_pic_name", this.cnicPicName);
        jSONObject.put("cnic_option", this.cnicOption);
        jSONObject.put("is_bisp_beneficiary", this.isBispBenif);
        String str = this.bform;
        int i9 = a;
        int i10 = i9 ^ 103;
        int i11 = ((i9 & 103) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        jSONObject.put("bform", str);
        jSONObject.put("id_spouse", this.id_spouse);
        jSONObject.put("id_father", this.id_father);
        jSONObject.put("id_mother", this.id_mother);
        jSONObject.put("respondant", this.isRespondent);
        jSONObject.put("disability", this.disability);
        jSONObject.put("chronic_disease", this.chronic_disease);
        int i15 = a;
        int i16 = (i15 ^ 31) + ((i15 & 31) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        jSONObject.put("language", this.language);
        jSONObject.put("attended_school", this.attended_school);
        jSONObject.put("higher_education", this.higher_education);
        jSONObject.put("work_activity", this.work_activity);
        jSONObject.put("hours_worked", this.hours_worked);
        jSONObject.put("employment_status", this.employment_status);
        int i18 = b;
        int i19 = (-2) - (((i18 & 46) + (i18 | 46)) ^ (-1));
        a = i19 % 128;
        int i20 = i19 % 2;
        jSONObject.put("survey_type", this.surveyType);
        jSONObject.put("survey_form_no", this.surveyFormNo);
        jSONObject.put("survey_uuid", this.surveyUuid);
        jSONObject.put("start", this.start);
        jSONObject.put("end", this.end);
        jSONObject.put("diff", this.diff);
        jSONObject.put("latitude", this.latitude);
        jSONObject.put("longitude", this.longitude);
        jSONObject.put("isImmunized", this.isImmunized);
        jSONObject.put("weight_of_child", this.weight_of_child);
        jSONObject.put("height_of_child", this.height_of_child);
        try {
            jSONArray = new JSONArray(this.rosterVaccinationsJson);
            int i21 = a;
            int i22 = i21 ^ 13;
            int i23 = -(-((i21 & 13) << 1));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            b = i24 % 128;
            int i25 = i24 % 2;
        } catch (Exception unused) {
            jSONArray = new JSONArray();
        }
        jSONObject.put("RosterVaccinations", jSONArray);
        if (i == 0) {
            int i26 = b;
            int i27 = (i26 | 59) << 1;
            int i28 = -(((~i26) & 59) | (i26 & (-60)));
            int i29 = (i27 & i28) + (i28 | i27);
            a = i29 % 128;
            if (i29 % 2 == 0) {
                jSONObject.put("name_of_member_flag", this.name_of_member_flag);
                jSONObject.put("relation_to_household_id_flag", this.relation_to_household_flag);
                throw null;
            }
            jSONObject.put("name_of_member_flag", this.name_of_member_flag);
            jSONObject.put("relation_to_household_id_flag", this.relation_to_household_flag);
            int i30 = a + 15;
            b = i30 % 128;
            int i31 = i30 % 2;
            jSONObject.put("gender_flag", this.gender_flag);
            jSONObject.put("date_of_birth_flag", this.date_of_birth_flag);
            int i32 = this.merital_status_flag;
            int i33 = a;
            int i34 = i33 & 61;
            int i35 = (((i33 | 61) & (~i34)) - (~(-(-(i34 << 1))))) - 1;
            b = i35 % 128;
            if (i35 % 2 != 0) {
                jSONObject.put("merital_status_flag", i32);
                jSONObject.put("cnic_flag", this.cnic_flag);
                jSONObject.put("cnic_option_flag", this.cnic_option_flag);
                int i36 = 75 / 0;
            } else {
                jSONObject.put("merital_status_flag", i32);
                jSONObject.put("cnic_flag", this.cnic_flag);
                jSONObject.put("cnic_option_flag", this.cnic_option_flag);
            }
            int i37 = a;
            int i38 = (i37 & 51) + (i37 | 51);
            b = i38 % 128;
            if (i38 % 2 != 0) {
                jSONObject.put("is_bisp_benif_flag", this.is_bisp_flag);
                jSONObject.put("bform_flag", this.bform_flag);
                int i39 = 63 / 0;
            } else {
                jSONObject.put("is_bisp_benif_flag", this.is_bisp_flag);
                jSONObject.put("bform_flag", this.bform_flag);
            }
            jSONObject.put("disability_flag", this.disability_flag);
            jSONObject.put("chronic_disease_flag", this.chronic_disease_flag);
            int i40 = a;
            int i41 = i40 & 93;
            int i42 = -(-((i40 ^ 93) | i41));
            int i43 = (i41 & i42) + (i42 | i41);
            b = i43 % 128;
            int i44 = i43 % 2;
            jSONObject.put("language_flag", this.language_flag);
            jSONObject.put("attended_school_flag", this.attended_school_flag);
            int i45 = this.higher_education_flag;
            int i46 = a;
            int i47 = ((i46 ^ 84) + ((i46 & 84) << 1)) - 1;
            b = i47 % 128;
            if (i47 % 2 != 0) {
                jSONObject.put("higher_education_flag", i45);
                jSONObject.put("work_activity_flag", this.work_activity_flag);
                jSONObject.put("hours_worked_flag", this.hours_worked_flag);
                int i48 = 34 / 0;
            } else {
                jSONObject.put("higher_education_flag", i45);
                jSONObject.put("work_activity_flag", this.work_activity_flag);
                jSONObject.put("hours_worked_flag", this.hours_worked_flag);
            }
            jSONObject.put("employment_status_flag", this.employment_status_flag);
            int i49 = b;
            int i50 = (-2) - ((((i49 | 66) << 1) - (i49 ^ 66)) ^ (-1));
            a = i50 % 128;
            int i51 = i50 % 2;
        }
        int i52 = a;
        int i53 = i52 & 3;
        int i54 = (i52 | 3) & (~i53);
        int i55 = -(-(i53 << 1));
        int i56 = (i54 & i55) + (i54 | i55);
        b = i56 % 128;
        int i57 = i56 % 2;
        return jSONObject;
    }
}
