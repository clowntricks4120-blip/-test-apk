package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class User {
    private static int a = 1;
    private static int b;

    @o0OO00O("batch_recover")
    private int batchRecover;

    @o0OO00O("cnic")
    private String cnic;

    @o0OO00O("firm_id")
    private int firmId;

    @o0OO00O("first_name")
    private String firstName;

    @o0OO00O("force_update")
    private String forceUpdate;

    @o0OO00O("id")
    private int id;

    @o0OO00O("imei_mac")
    private String imeiMac;

    @o0OO00O("imei_no")
    private String imeiNo;

    @o0OO00O("is_sms_activated")
    private int isSmsActivated;

    @o0OO00O("is_validate")
    private int isValidate;

    @o0OO00O("last_name")
    private String lastName;

    @o0OO00O("mac_no")
    private String macNo;

    @o0OO00O("message")
    private String message;

    @o0OO00O("phone")
    private String phone;

    @o0OO00O("recover")
    private int recover;

    @o0OO00O("status")
    private String status;

    @o0OO00O("supervisor_id")
    private int supervisorId;

    @o0OO00O("survey_limit_total")
    private String surveyLimitTotal;

    @o0OO00O("user_role_id")
    private int userRoleId;

    @o0OO00O("username")
    private String username;

    public int getBatchRecover() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = (i2 ^ 91) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = this.batchRecover;
        int i9 = ((i6 | 111) << 1) - (i6 ^ 111);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    public String getCnic() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 117;
        int i4 = (i2 ^ 117) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this.cnic;
        }
        throw null;
    }

    public int getFirmId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (((i2 ^ 47) | i3) << 1) - ((i2 | 47) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.firmId;
        if (i5 == 0) {
            int i7 = 39 / 0;
        }
        return i6;
    }

    public String getFirstName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = -(-(i2 | 99));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        String str = this.firstName;
        int i8 = ((i6 | 27) << 1) - (i6 ^ 27);
        a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getForceUpdate() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = (i2 | 117) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.forceUpdate;
        int i8 = (i7 & (-112)) | ((~i7) & 111);
        int i9 = -(-((i7 & 111) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return str;
    }

    public int getId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 60) + (i2 | 60);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.id;
        int i8 = i5 & 35;
        int i9 = ((i5 ^ 35) | i8) << 1;
        int i10 = -((i5 | 35) & (~i8));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getImeiMac() {
        int i = 2 % 2;
        int i2 = a + 38;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.imeiMac;
        int i6 = i4 & 117;
        int i7 = (i4 | 117) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getImeiNo() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = (i3 - (~(-(-((i2 ^ 75) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return this.imeiNo;
        }
        throw null;
    }

    public int getIsSmsActivated() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 124) + ((i3 & 124) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            i = this.isSmsActivated;
            int i7 = 5 / 0;
        } else {
            i = this.isSmsActivated;
        }
        int i8 = ((i6 ^ 45) | (i6 & 45)) << 1;
        int i9 = -(((~i6) & 45) | (i6 & (-46)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getIsValidate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = ((i2 ^ 77) | i3) << 1;
        int i5 = -((i2 | 77) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return this.isValidate;
        }
        throw null;
    }

    public String getLastName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 95) + ((i2 & 95) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.lastName;
        int i6 = (i4 ^ 61) + ((i4 & 61) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getMacNo() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 29) + (i2 | 29);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.macNo;
        int i6 = (-2) - ((i4 + 66) ^ (-1));
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getMessage() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = -(-((i2 ^ 91) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        String str = this.message;
        if (i6 != 0) {
            int i7 = 79 / 0;
        }
        int i8 = (i2 | 85) << 1;
        int i9 = -(((~i2) & 85) | (i2 & (-86)));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPhone() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 61) + (i2 | 61);
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.phone;
        if (i4 != 0) {
            int i5 = 51 / 0;
        }
        return str;
    }

    public int getRecover() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 63;
        int i4 = (i2 ^ 63) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.recover;
        int i8 = i2 + 3;
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String getStatus() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-64)) | ((~i2) & 63);
        int i4 = -(-((i2 & 63) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        String str = this.status;
        if (i7 != 0) {
            int i8 = 24 / 0;
        }
        int i9 = (i6 | 1) << 1;
        int i10 = -(i6 ^ 1);
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return str;
    }

    public int getSupervisorId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = (i2 ^ 53) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = this.supervisorId;
        int i8 = i6 + 23;
        a = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String getSurveyLimitTotal() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 46) << 1) - (i2 ^ 46)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.surveyLimitTotal;
        int i5 = i2 & 15;
        int i6 = i2 | 15;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getUserRoleId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-108)) | ((~i2) & 107)) + ((i2 & 107) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.userRoleId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getUsername() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 70) + ((i2 & 70) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return this.username;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBatchRecover(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 80) + (i3 | 80)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        this.batchRecover = i;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = ((i3 ^ 40) + ((i3 & 40) << 1)) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setCnic(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 52) + (i2 | 52)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.cnic = str;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setFirmId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 87) + (i3 | 87);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.firmId = i;
        if (i5 == 0) {
            int i6 = 40 / 0;
        }
        int i7 = i3 + 10;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setFirstName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 106) + (i2 | 106);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.firstName = str;
        int i6 = i2 + 87;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setForceUpdate(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 3) << 1) - (i2 ^ 3);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.forceUpdate = str;
        int i5 = ((i2 ^ 93) | (i2 & 93)) << 1;
        int i6 = -(((~i2) & 93) | (i2 & (-94)));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 79 / 0;
        }
    }

    public void setId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 & (-74)) | ((~i3) & 73)) - (~(-(-((i3 & 73) << 1))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.id = i;
        int i6 = i3 & 65;
        int i7 = (i3 ^ 65) | i6;
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setImeiMac(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 33) << 1) - (i2 ^ 33);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.imeiMac = str;
        int i5 = (i2 & (-46)) | ((~i2) & 45);
        int i6 = (i2 & 45) << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setImeiNo(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.imeiNo = str;
        if (i5 != 0) {
            int i6 = 80 / 0;
        }
        int i7 = (i4 | 31) << 1;
        int i8 = -(i4 ^ 31);
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 0 / 0;
        }
    }

    public void setIsSmsActivated(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 85;
        int i5 = (i3 & 85) << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.isSmsActivated = i;
            throw null;
        }
        this.isSmsActivated = i;
        int i7 = i3 + 13;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public void setIsValidate(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 3;
        int i5 = ((i3 | 3) & (~i4)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.isValidate = i;
        if (i6 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLastName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 5;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 5)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.lastName = str;
        if (i7 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMacNo(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 62) << 1) - (i2 ^ 62)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.macNo = str;
        int i6 = i4 + 23;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setMessage(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 15) + ((i2 & 15) << 1);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            this.message = str;
            throw null;
        }
        this.message = str;
        int i5 = (((i4 | 40) << 1) - (i4 ^ 40)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setPhone(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 46) + (i2 | 46);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.phone = str;
        int i7 = i5 & 9;
        int i8 = (~i7) & (i5 | 9);
        int i9 = i7 << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public void setRecover(int i) {
        int i2 = 2 % 2;
        int i3 = a + 15;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.recover = i;
        } else {
            this.recover = i;
            throw null;
        }
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = ((i2 ^ 3) | i3) << 1;
        int i5 = -((~i3) & (i2 | 3));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.status = str;
        int i8 = i2 & 3;
        int i9 = -(-((i2 ^ 3) | i8));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 47 / 0;
        }
    }

    public void setSupervisorId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-12)) | ((~i3) & 11)) + ((i3 & 11) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.supervisorId = i;
        int i6 = (-2) - (((i3 & 56) + (i3 | 56)) ^ (-1));
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setSurveyLimitTotal(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = ((i2 ^ 3) | i3) << 1;
        int i5 = -((~i3) & (i2 | 3));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.surveyLimitTotal = str;
        int i8 = i2 + 7;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public void setUserRoleId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 119;
        int i5 = ((i3 | 119) & (~i4)) + (i4 << 1);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            this.userRoleId = i;
            throw null;
        }
        this.userRoleId = i;
        int i7 = ((i6 | 121) << 1) - (i6 ^ 121);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setUsername(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 37) + (i2 | 37);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.username = str;
        if (i4 == 0) {
            throw null;
        }
    }
}
