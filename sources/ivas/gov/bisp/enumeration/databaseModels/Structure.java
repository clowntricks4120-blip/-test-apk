package ivas.gov.bisp.enumeration.databaseModels;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Structure {
    private static int a = 1;
    private static int b;

    @o0OO00O("batch_size")
    private int batchSize;

    @o0OO00O("enum_survey_limit")
    private int enumSurveyLimit;

    @o0OO00O("enumerator")
    private Enumerator enumerator;

    @o0OO00O("error_code")
    private int errorCode;

    @o0OO00O("imei_mac")
    private String imeiMac;

    @o0OO00O("message")
    private String message;

    @o0OO00O("status")
    private String status;

    @o0OO00O("structural_version")
    private int structuralVersion;

    @o0OO00O("supervisor")
    private Supervisor supervisor;

    @o0OO00O("sync_days")
    private int syncDays;

    public int getBatchSize() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 29) << 1) - (((~i2) & 29) | (i2 & (-30)));
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = this.batchSize;
        int i6 = ((i4 | 107) << 1) - (i4 ^ 107);
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getEnumSurveyLimit() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 16) + ((i2 & 16) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.enumSurveyLimit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Enumerator getEnumerator() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = (i2 ^ 83) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        Enumerator enumerator = this.enumerator;
        int i7 = ((i2 | 82) << 1) - (i2 ^ 82);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return enumerator;
    }

    public int getErrorCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-12)) | ((~i2) & 11);
        int i4 = (i2 & 11) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = this.errorCode;
        int i9 = i6 + 103;
        a = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    public String getImeiMac() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 47;
        int i4 = i2 | 47;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        String str = this.imeiMac;
        int i8 = (i6 & 27) + (i6 | 27);
        a = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public String getMessage() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-76)) | ((~i2) & 75)) - (~((i2 & 75) << 1))) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        String str = this.message;
        int i6 = i4 + 101;
        b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getStatus() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 21) | (i2 & 21)) << 1;
        int i4 = -((i2 & (-22)) | ((~i2) & 21));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.status;
        int i7 = ((i2 & 78) + (i2 | 78)) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 72 / 0;
        }
        return str;
    }

    public int getStructuralVersion() {
        int i = 2 % 2;
        int i2 = a + 25;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.structuralVersion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Supervisor getSupervisor() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-74)) | ((~i2) & 73);
        int i4 = -(-((i2 & 73) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this.supervisor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getSyncDays() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = (i2 ^ 75) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.syncDays;
        if (i6 != 0) {
            int i8 = 81 / 0;
        }
        return i7;
    }

    public void setBatchSize(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 & (-58)) | ((~i3) & 57)) - (~((i3 & 57) << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.batchSize = i;
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEnumSurveyLimit(int i) {
        int i2 = 2 % 2;
        int i3 = b + 43;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.enumSurveyLimit = i;
        if (i5 == 0) {
            int i6 = 49 / 0;
        }
        int i7 = i4 & 85;
        int i8 = i7 + ((i4 ^ 85) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setEnumerator(Enumerator enumerator) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = i3 + ((i2 ^ 53) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.enumerator = enumerator;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i2 + 80;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 38 / 0;
        }
    }

    public void setErrorCode(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 13) + ((i3 & 13) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.errorCode = i;
        if (i5 != 0) {
            throw null;
        }
    }

    public void setImeiMac(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 63) | (i2 & 63)) << 1) - (((~i2) & 63) | (i2 & (-64)));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.imeiMac = str;
        int i6 = i4 + 69;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setMessage(String str) {
        int i = 2 % 2;
        int i2 = b + 69;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.message = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 95;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setStatus(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 84) + ((i2 & 84) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.status = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.status = str;
        int i4 = i2 + 75;
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setStructuralVersion(int i) {
        int i2 = 2 % 2;
        int i3 = (-2) - ((b + 68) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.structuralVersion = i;
        int i6 = i4 + 18;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setSupervisor(Supervisor supervisor) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 99;
        int i4 = ((i2 ^ 99) | i3) << 1;
        int i5 = -((~i3) & (i2 | 99));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.supervisor = supervisor;
        int i8 = i2 + 43;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setSyncDays(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 43;
        int i5 = -(-((i3 & 43) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.syncDays = i;
        if (i7 == 0) {
            int i8 = 69 / 0;
        }
    }
}
