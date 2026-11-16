package ivas.gov.bisp.enumeration.models;

import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public class BatchInfo {
    private static int a = 0;
    private static int b = 1;

    @o0OO00O("base_url")
    private String baseUrl;

    @o0OO00O("batch_name")
    private String batchName;

    @o0OO00O("cnic")
    private String cnic;

    @o0OO00O("enum_app_version")
    private int enumAppVersion;

    @o0OO00O("enum_app_version_name")
    private String enumAppVersionName;

    @o0OO00O("enum_validate")
    private int enumValidate;

    @o0OO00O("firm_id")
    private int firmId;

    @o0OO00O("hard_area_batch_size")
    private int hardAreaBatchSize;

    @o0OO00O("id")
    private int id;

    @o0OO00O("imei_number")
    private String imeiNumber;

    @o0OO00O("is_hard_locality")
    private int isHardLocality;

    @o0OO00O("is_validate_locality")
    private int isValidateLocality;

    @o0OO00O("name")
    private String name;

    @o0OO00O("number")
    private String number;

    @o0OO00O("server_app_version")
    private int serverAppVersion;

    @o0OO00O("supervisor_id")
    private int supervisorId;

    public String getBaseUrl() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = i3 + ((i2 ^ 125) | i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.baseUrl;
        }
        throw null;
    }

    public String getBatchName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-98)) | ((~i2) & 97)) - (~((i2 & 97) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.batchName;
        int i5 = i2 & 11;
        int i6 = i2 | 11;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getCnic() {
        String str;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = i3 + ((i2 ^ 65) | i3);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.cnic;
            int i5 = 80 / 0;
        } else {
            str = this.cnic;
        }
        int i6 = (i2 & (-56)) | ((~i2) & 55);
        int i7 = -(-((i2 & 55) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public int getEnumAppVersion() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = i3 + ((i2 ^ 33) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.enumAppVersion;
        if (i5 == 0) {
            int i7 = 5 / 0;
        }
        return i6;
    }

    public String getEnumAppVersionName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = (i2 | 119) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        String str = this.enumAppVersionName;
        if (i7 != 0) {
            int i8 = 85 / 0;
        }
        return str;
    }

    public int getEnumValidate() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 86) + (i2 | 86)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.enumValidate;
        int i6 = i2 + 71;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getFirmId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 83;
        int i4 = (i3 << 1) - ((~(i2 & 83)) & i3);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return this.firmId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getHardAreaBatchSize() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 113;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.hardAreaBatchSize;
        int i6 = i2 & 91;
        int i7 = (i2 ^ 91) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return i5;
    }

    public int getId() {
        int i = 2 % 2;
        int i2 = a + 23;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.id;
        int i6 = ((i3 ^ 47) - (~(-(-((i3 & 47) << 1))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String getImeiNumber() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 27) - (~(i2 | 27))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.imeiNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getIsHardLocality() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 79;
        int i4 = -(-((i2 ^ 79) | i3));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.isHardLocality;
        int i8 = i2 & 109;
        int i9 = i2 | 109;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 63 / 0;
        }
        return i7;
    }

    public int getIsValidateLocality() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 59) << 1) - (i2 ^ 59);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.isValidateLocality;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 89) << 1) - (i2 ^ 89);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.name;
        int i6 = i4 & 67;
        int i7 = -(-((i4 ^ 67) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getNumber() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 49;
        int i4 = (i2 & 49) << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        String str = this.number;
        int i7 = (i2 ^ 107) + ((i2 & 107) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public int getServerAppVersion() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 93;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 93)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return this.serverAppVersion;
        }
        throw null;
    }

    public int getSupervisorId() {
        int i = 2 % 2;
        int i2 = a + 121;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.supervisorId;
        int i6 = i3 & 113;
        int i7 = (i3 | 113) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        return i5;
    }

    public void setBaseUrl(String str) {
        int i = 2 % 2;
        int i2 = a + 103;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.baseUrl = str;
        int i5 = ((i3 | 87) << 1) - (i3 ^ 87);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setBatchName(String str) {
        int i = 2 % 2;
        int i2 = b + 93;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.batchName = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCnic(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.cnic = str;
        if (i4 != 0) {
            throw null;
        }
    }

    public void setEnumAppVersion(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 121;
        int i5 = ((~i4) & (i3 | 121)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.enumAppVersion = i;
        int i7 = i3 + 14;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setEnumAppVersionName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-124)) | ((~i2) & 123)) - (~(-(-((i2 & 123) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.enumAppVersionName = str;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEnumValidate(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 27;
        int i5 = ((i3 ^ 27) | i4) << 1;
        int i6 = -((i3 | 27) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        this.enumValidate = i;
        int i10 = i8 & 115;
        int i11 = (i8 | 115) & (~i10);
        int i12 = i10 << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public void setFirmId(int i) {
        int i2 = 2 % 2;
        int i3 = a + 3;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.firmId = i;
        if (i5 == 0) {
            int i6 = 93 / 0;
        }
        int i7 = i4 & 5;
        int i8 = (i7 - (~(-(-((i4 ^ 5) | i7))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setHardAreaBatchSize(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 123;
        int i5 = i4 << 1;
        int i6 = -(i4 & (~(i3 & 123)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.hardAreaBatchSize = i;
        int i9 = i3 & 91;
        int i10 = i9 + ((i3 ^ 91) | i9);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 83 / 0;
        }
    }

    public void setId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 59;
        int i5 = (i4 - (~((i3 ^ 59) | i4))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        this.id = i;
        int i7 = i3 & 7;
        int i8 = -(-((i3 ^ 7) | i7));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setImeiNumber(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 113) | (i2 & 113)) << 1;
        int i4 = -((i2 & (-114)) | ((~i2) & 113));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.imeiNumber = str;
        if (i6 != 0) {
            int i7 = 70 / 0;
        }
        int i8 = (i2 & (-34)) | ((~i2) & 33);
        int i9 = (i2 & 33) << 1;
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public void setIsHardLocality(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 71) | (i3 & 71)) << 1;
        int i5 = -(((~i3) & 71) | (i3 & (-72)));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.isHardLocality = i;
            return;
        }
        this.isHardLocality = i;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIsValidateLocality(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 101;
        int i5 = -(-((i3 ^ 101) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.isValidateLocality = i;
        if (i7 != 0) {
            int i8 = 31 / 0;
        }
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = -(-((i2 ^ 55) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        this.name = str;
        int i8 = i6 ^ 55;
        int i9 = ((i6 & 55) | i8) << 1;
        int i10 = -i8;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    public void setNumber(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 43) | (i2 & 43)) << 1) - (~(-(((~i2) & 43) | (i2 & (-44)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.number = str;
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
    }

    public void setServerAppVersion(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 69;
        int i5 = i4 + ((i3 ^ 69) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.serverAppVersion = i;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i3 & 45;
        int i8 = (i3 | 45) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public void setSupervisorId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-32)) | ((~i3) & 31);
        int i5 = (i3 & 31) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        this.supervisorId = i;
        int i9 = i7 & 33;
        int i10 = (((i7 | 33) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
    }
}
