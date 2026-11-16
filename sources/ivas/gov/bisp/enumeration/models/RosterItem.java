package ivas.gov.bisp.enumeration.models;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class RosterItem implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public int _educationLevelCode;
    public int _employmentCode;
    public int _goneToSchoolCode;
    public int _lastWeekWorkingHours;
    public int _workStatusCode;
    public String acc_number;
    public String acc_title;
    public String bank_address;
    public String bank_name;
    public int branch_code;
    public String cnic;
    public int disabilityCode;
    public String disabilityStatus;
    public String discrepancy_status;
    public String dob;
    public String dupRosterList;
    public String employment_status;
    public String form_no;
    public String gender;
    public String hH_Name;
    public int havingChronicDiseaseCode;
    public String hhMemberNames;
    public String hhid;
    public boolean isLiterate;
    public boolean is_Benificiary;
    public String maritalStatus;
    public int maritalStatusCode;
    public String message;
    public String mobile_network;
    public String mobilenumber;
    public long rId;
    public int relationToHouseholdHead;
    public String relationToHouseholdHeadName;
    public String roster_message;
    public String workStatus;

    public RosterItem(String str, boolean z, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2, int i3, String str8, String str9, String str10, int i4, int i5, String str11, boolean z2, int i6, String str12, int i7, String str13, int i8, long j, String str14, int i9, String str15, String str16, String str17, String str18, int i10, String str19, String str20, String str21) {
        this.hhid = str;
        this.is_Benificiary = z;
        this.message = str2;
        this.hH_Name = str3;
        this.mobilenumber = str16;
        this.mobile_network = str17;
        this.bank_name = str18;
        this.branch_code = i10;
        this.bank_address = str19;
        this.acc_title = str20;
        this.acc_number = str21;
        this.cnic = str4;
        this.disabilityCode = i;
        this.disabilityStatus = str5;
        this.discrepancy_status = str6;
        this.dob = str7;
        this._educationLevelCode = i2;
        this._employmentCode = i3;
        this.employment_status = str8;
        this.form_no = str9;
        this.gender = str10;
        this._goneToSchoolCode = i4;
        this.havingChronicDiseaseCode = i5;
        this.hhMemberNames = str11;
        this.isLiterate = z2;
        this._lastWeekWorkingHours = i6;
        this.maritalStatus = str12;
        this.maritalStatusCode = i7;
        this.roster_message = str13;
        this.relationToHouseholdHead = i8;
        this.rId = j;
        this.workStatus = str14;
        this._workStatusCode = i9;
        this.dupRosterList = str15;
    }

    public String getAcc_number() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 45;
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.acc_number;
        int i5 = ((i2 & (-60)) | ((~i2) & 59)) + ((i2 & 59) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getAcc_title() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-120)) | ((~i2) & 119);
        int i4 = -(-((i2 & 119) << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.acc_title;
        int i7 = ((i2 ^ 31) | (i2 & 31)) << 1;
        int i8 = -(((~i2) & 31) | (i2 & (-32)));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    public String getBank_address() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = -(-(i2 | 89));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        String str = this.bank_address;
        if (i7 == 0) {
            int i8 = 60 / 0;
        }
        int i9 = (-2) - ((((i6 | 44) << 1) - (i6 ^ 44)) ^ (-1));
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getBank_name() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 102) + ((i2 & 102) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        String str = this.bank_name;
        int i7 = i5 & 69;
        int i8 = (i7 - (~((i5 ^ 69) | i7))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public int getBranch_code() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 6) + (i2 | 6)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.branch_code;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getCnic() {
        int i = 2 % 2;
        int i2 = b + 49;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cnic;
        }
        throw null;
    }

    public int getDisabilityCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = ((i2 ^ 19) | i3) << 1;
        int i5 = -((i2 | 19) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return this.disabilityCode;
        }
        throw null;
    }

    public String getDisabilityStatus() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 15) + (i2 | 15);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.disabilityStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getDiscrepancy_status() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.discrepancy_status;
        int i5 = i2 & 39;
        int i6 = (i5 - (~((i2 ^ 39) | i5))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getDob() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 11) - (~(-(-(i2 | 11))))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.dob;
        int i4 = i2 + 62;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return str;
    }

    public String getDupRosterList() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 111) + (i2 | 111);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.dupRosterList;
        int i5 = (i4 & 75) + (i4 | 75);
        a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getEmployment_status() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 73) + (i2 | 73);
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.employment_status;
        int i5 = i2 + 59;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getForm_no() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = -(-((i2 ^ 57) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.form_no;
        int i7 = i2 ^ 119;
        int i8 = -(-((i2 & 119) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    public String getGender() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 109) + ((i2 & 109) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.gender;
        int i5 = (-2) - (((i2 & 80) + (i2 | 80)) ^ (-1));
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int getHavingChronicDiseaseCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 97) << 1) - ((i2 & (-98)) | ((~i2) & 97));
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.havingChronicDiseaseCode;
        int i6 = i2 & 11;
        int i7 = (i2 ^ 11) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 1 / 0;
        }
        return i5;
    }

    public String getHhMemberNames() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 113) + ((i2 & 113) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.hhMemberNames;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getHhid() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = ((i2 | 49) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            str = this.hhid;
            int i6 = 85 / 0;
        } else {
            str = this.hhid;
        }
        int i7 = i5 & 79;
        int i8 = (i7 - (~(-(-((i5 ^ 79) | i7))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getMaritalStatus() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 5) << 1;
        int i4 = -(((~i2) & 5) | (i2 & (-6)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.maritalStatus;
        }
        int i6 = 34 / 0;
        return this.maritalStatus;
    }

    public int getMaritalStatusCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (i3 - (~(-(-((i2 ^ 47) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.maritalStatusCode;
        int i7 = i2 & 85;
        int i8 = (i2 | 85) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getMessage() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 20) << 1) - (i2 ^ 20)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.message;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getMobile_network() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 71;
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mobile_network;
        int i5 = i2 & 45;
        int i6 = -(-((i2 ^ 45) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 13 / 0;
        }
        return str;
    }

    public String getMobilenumber() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 68) + ((i2 & 68) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mobilenumber;
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        return str;
    }

    public int getRelationToHouseholdHead() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 112) << 1) - (i2 ^ 112);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = this.relationToHouseholdHead;
        int i6 = ((i2 & 124) + (i2 | 124)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String getRelationToHouseholdHeadName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-48)) | ((~i2) & 47)) + ((i2 & 47) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.relationToHouseholdHeadName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getRoster_message() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-60)) | ((~i2) & 59);
        int i4 = (i2 & 59) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        String str = this.roster_message;
        int i8 = i6 + 23;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 66 / 0;
        }
        return str;
    }

    public String getWorkStatus() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 15) | (i2 & 15)) << 1;
        int i4 = -((i2 & (-16)) | ((~i2) & 15));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.workStatus;
        int i7 = i2 & 5;
        int i8 = (i2 | 5) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 55 / 0;
        }
        return str;
    }

    public int get_educationLevelCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 53;
        int i4 = ((i2 & 53) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        int i7 = this._educationLevelCode;
        int i8 = (-2) - (((i2 ^ 58) + ((i2 & 58) << 1)) ^ (-1));
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public int get_employmentCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 119) + (i2 | 119);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = this._employmentCode;
        int i6 = i4 + 75;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public int get_goneToSchoolCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 51) - (~((i2 & 51) << 1))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = this._goneToSchoolCode;
        int i7 = ((i4 & 21) - (~(i4 | 21))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public int get_lastWeekWorkingHours() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 8) + ((i2 & 8) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this._lastWeekWorkingHours;
        int i6 = ((i2 ^ 29) | (i2 & 29)) << 1;
        int i7 = -(((~i2) & 29) | (i2 & (-30)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int get_workStatusCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 96) + ((i2 & 96) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this._workStatusCode;
        int i6 = ((i2 & 70) + (i2 | 70)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String gethH_Name() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 125) | (i2 & 125)) << 1;
        int i4 = -(((~i2) & 125) | (i2 & (-126)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        String str = this.hH_Name;
        int i7 = ((i6 & (-46)) | ((~i6) & 45)) + ((i6 & 45) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public long getrId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 76) + (i2 | 76);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        long j = this.rId;
        int i6 = ((((i2 ^ 101) | (i2 & 101)) << 1) - (~(-(((~i2) & 101) | (i2 & (-102)))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public boolean isIs_Benificiary() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 49;
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.is_Benificiary;
        int i5 = (i2 & 81) + (i2 | 81);
        a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean isLiterate() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = (i2 | 65) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return this.isLiterate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAcc_number(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = (((i2 | 85) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            this.acc_number = str;
            throw null;
        }
        this.acc_number = str;
        int i6 = (((i5 & (-28)) | ((~i5) & 27)) - (~((i5 & 27) << 1))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
    }

    public void setAcc_title(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 97) | (i2 & 97)) << 1) - (((~i2) & 97) | (i2 & (-98)));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.acc_title = str;
            return;
        }
        this.acc_title = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBank_address(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 21;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.bank_address = str;
        int i5 = i2 & 7;
        int i6 = ((i2 | 7) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBank_name(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 9) + (i2 | 9);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.bank_name = str;
        int i5 = (i2 & (-58)) | ((~i2) & 57);
        int i6 = -(-((i2 & 57) << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setBranch_code(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 9;
        int i5 = (~i4) & (i3 | 9);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.branch_code = i;
        if (i8 != 0) {
            int i9 = 10 / 0;
        }
        int i10 = i3 & 31;
        int i11 = (((i3 | 31) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCnic(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 95;
        int i4 = -(-((i2 ^ 95) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        this.cnic = str;
        int i8 = ((i6 | 42) << 1) - (i6 ^ 42);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setDisabilityCode(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 99;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            this.disabilityCode = i;
            obj.hashCode();
            throw null;
        }
        this.disabilityCode = i;
        int i5 = i3 & 101;
        int i6 = ((i3 ^ 101) | i5) << 1;
        int i7 = -((i3 | 101) & (~i5));
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public void setDisabilityStatus(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.disabilityStatus = str;
        int i5 = (((i2 & (-80)) | ((~i2) & 79)) - (~((i2 & 79) << 1))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setDiscrepancy_status(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 57;
        int i4 = (((i2 ^ 57) | i3) << 1) - ((i2 | 57) & (~i3));
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.discrepancy_status = str;
        } else {
            this.discrepancy_status = str;
            int i5 = 31 / 0;
        }
    }

    public void setDob(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-76)) | ((~i2) & 75)) + ((i2 & 75) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.dob = str;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 & 81;
        int i7 = i6 + ((i4 ^ 81) | i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 53 / 0;
        }
    }

    public void setDupRosterList(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 53;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.dupRosterList = str;
        int i5 = (i2 & 121) + (i2 | 121);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setEmployment_status(String str) {
        int i = 2 % 2;
        int i2 = b + 61;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.employment_status = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public void setForm_no(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 28) << 1) - (i2 ^ 28)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.form_no = str;
        if (i4 != 0) {
            throw null;
        }
    }

    public void setGender(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-12)) | ((~i2) & 11);
        int i4 = -(-((i2 & 11) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.gender = str;
        int i7 = (((i2 ^ 31) | (i2 & 31)) << 1) - (((~i2) & 31) | (i2 & (-32)));
        a = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public void setHavingChronicDiseaseCode(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 5;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.havingChronicDiseaseCode = i;
        int i6 = (((i3 & (-120)) | ((~i3) & 119)) - (~(-(-((i3 & 119) << 1))))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 25 / 0;
        }
    }

    public void setHhMemberNames(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.hhMemberNames = str;
        int i6 = (((i4 | 45) << 1) - (~(-(((~i4) & 45) | (i4 & (-46)))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setHhid(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 33;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.hhid = str;
        int i5 = (i2 | 19) << 1;
        int i6 = -(((~i2) & 19) | (i2 & (-20)));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setIs_Benificiary(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 47;
        int i4 = -(-((i2 ^ 47) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.is_Benificiary = z;
            return;
        }
        this.is_Benificiary = z;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLiterate(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = (i3 - (~(-(-((i2 ^ 71) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.isLiterate = z;
        int i6 = i2 ^ 45;
        int i7 = (i2 & 45) << 1;
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setMaritalStatus(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 51) + (i2 | 51);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.maritalStatus = str;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = (i4 & (-76)) | ((~i4) & 75);
        int i7 = -(-((i4 & 75) << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setMaritalStatusCode(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 55;
        int i5 = (i3 ^ 55) | i4;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.maritalStatusCode = i;
        int i8 = (((i3 | 18) << 1) - (i3 ^ 18)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setMessage(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-10)) | ((~i2) & 9);
        int i4 = -(-((i2 & 9) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.message = str;
        int i7 = i2 & 55;
        int i8 = (i2 | 55) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public void setMobile_network(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 117;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 117)));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.mobile_network = str;
        if (i7 == 0) {
            throw null;
        }
        int i8 = (i2 & (-96)) | ((~i2) & 95);
        int i9 = (i2 & 95) << 1;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public void setMobilenumber(String str) {
        int i = 2 % 2;
        int i2 = b + 9;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        this.mobilenumber = str;
        int i5 = (i3 ^ 63) + ((i3 & 63) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setRelationToHouseholdHead(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 63) + ((i3 & 63) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.relationToHouseholdHead = i;
        int i6 = i3 & 63;
        int i7 = i6 + ((i3 ^ 63) | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRelationToHouseholdHeadName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = (i2 | 121) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.relationToHouseholdHeadName = str;
        int i9 = (i7 | 5) << 1;
        int i10 = -(((~i7) & 5) | (i7 & (-6)));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 77 / 0;
        }
    }

    public void setRoster_message(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 57;
        int i4 = -(-((i2 ^ 57) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.roster_message = str;
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setWorkStatus(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 71) | (i2 & 71)) << 1;
        int i4 = -(((~i2) & 71) | (i2 & (-72)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        this.workStatus = str;
        int i8 = i6 + 15;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 79 / 0;
        }
    }

    public void set_educationLevelCode(int i) {
        int i2 = 2 % 2;
        int i3 = b + 63;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this._educationLevelCode = i;
        } else {
            this._educationLevelCode = i;
            throw null;
        }
    }

    public void set_employmentCode(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((((i3 ^ 119) | (i3 & 119)) << 1) - (~(-(((~i3) & 119) | (i3 & (-120)))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this._employmentCode = i;
            return;
        }
        this._employmentCode = i;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void set_goneToSchoolCode(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 119) + ((i3 & 119) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this._goneToSchoolCode = i;
        int i6 = i3 & 117;
        int i7 = i6 + ((i3 ^ 117) | i6);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 25 / 0;
        }
    }

    public void set_lastWeekWorkingHours(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 31;
        int i5 = (i3 | 31) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        this._lastWeekWorkingHours = i;
        if (i9 != 0) {
            throw null;
        }
        int i10 = i8 + 93;
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public void set_workStatusCode(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 56) + (i3 | 56);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this._workStatusCode = i;
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void sethH_Name(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 95;
        int i4 = i3 + ((i2 ^ 95) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.hH_Name = str;
        if (i5 == 0) {
            int i6 = 40 / 0;
        }
    }

    public void setrId(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = (i2 ^ 97) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.rId = j;
        if (i7 == 0) {
            throw null;
        }
        int i8 = (i6 | 57) << 1;
        int i9 = -((i6 & (-58)) | ((~i6) & 57));
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        int i11 = i10 % 2;
    }
}
