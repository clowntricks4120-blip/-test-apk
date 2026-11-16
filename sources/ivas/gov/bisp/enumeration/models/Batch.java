package ivas.gov.bisp.enumeration.models;

import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.bK.ag;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Batch extends SugarRecord {
    private static int a = 0;
    private static int b = 1;
    private String baseUrl;
    private String batchDetail;
    private String entryType;
    private int enum_app_version;
    private String enum_app_version_name;
    private String enumeratorCnic;
    private int enumeratorId;
    private String enumeratorImei;
    private String enumeratorName;
    private String enumeratorPhone;
    private int firmId;
    private int isMarked;
    private int isMarkedForCnic;
    private int isMarkedForNH;
    private int isRejectBoxShown;
    private int isRejected;
    private int isSelected;
    private int isSent;
    private String name;
    private double percentage;
    private String sentToServerTimeStamp;
    private int server_app_version;
    private String timeStampEnumerator;
    private String timeStampServer;
    private String timeStampSupervisor;
    private int totalContinueCount;
    private int totalCount;
    private String verified;

    public Batch() {
        setEmptyValues();
    }

    public static ArrayList<Batch> findBatchByIMEI(String str, String str2, String str3) {
        String[] strArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 4) + ((i2 & 4) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            strArr = new String[5];
            strArr[1] = str;
        } else {
            strArr = new String[3];
            strArr[0] = str;
        }
        strArr[1] = str2;
        strArr[2] = str3;
        ArrayList<Batch> arrayList = new ArrayList<>(SugarRecord.find(Batch.class, "enumerator_imei = ? and is_marked = ?and is_sent = ?", strArr));
        int i4 = b + 33;
        a = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    public static ArrayList<Batch> findMarkedBatch(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 115;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 115)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        ArrayList<Batch> arrayList = new ArrayList<>(SugarRecord.find(Batch.class, "is_marked = ? and is_marked_for_cnic=?and is_marked_for_nh=? and is_sent = ?", "1", "1", "1", str));
        int i8 = b;
        int i9 = i8 & 45;
        int i10 = (i9 - (~((i8 ^ 45) | i9))) - 1;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ArrayList<Batch> findMarkedBatchSpotCheck(String str) {
        String[] strArr;
        int i = 2 % 2;
        int i2 = a + 21;
        b = i2 % 128;
        char c = 0;
        if (i2 % 2 == 0) {
            strArr = new String[3];
            strArr[0] = "1";
        } else {
            strArr = new String[4];
            strArr[0] = "1";
            c = 1;
        }
        strArr[c] = "1";
        strArr[2] = "0";
        strArr[3] = str;
        ArrayList<Batch> arrayList = new ArrayList<>(SugarRecord.find(Batch.class, "is_marked = ? and is_marked_for_cnic=?and is_marked_for_nh=? and is_sent = ?", strArr));
        int i3 = b;
        int i4 = i3 ^ 123;
        int i5 = (i3 & 123) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public String getBaseUrl() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = (i3 - (~((i2 ^ 89) | i3))) - 1;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.baseUrl;
        int i6 = ((i5 | 11) << 1) - (i5 ^ 11);
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getBatchDetail() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-56)) | ((~i2) & 55)) - (~(-(-((i2 & 55) << 1))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.batchDetail;
        int i6 = i4 + 109;
        a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getEntryType() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 73) << 1;
        int i4 = -(i2 ^ 73);
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this.entryType;
        }
        throw null;
    }

    public int getEnum_app_version() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 94) << 1) - (i2 ^ 94)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.enum_app_version;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getEnum_app_version_name() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = (~i3) & (i2 | 65);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        String str = this.enum_app_version_name;
        int i8 = (i2 & 101) + (i2 | 101);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 75 / 0;
        }
        return str;
    }

    public String getEnumeratorCnic() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = (i2 ^ 91) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        String str = this.enumeratorCnic;
        int i7 = i2 & 95;
        int i8 = i7 + ((i2 ^ 95) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public int getEnumeratorId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 121;
        int i4 = -(-((i2 ^ 121) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = this.enumeratorId;
        int i9 = ((i6 | 23) << 1) - (i6 ^ 23);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    public String getEnumeratorImei() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 58) << 1) - (i2 ^ 58)) ^ (-1));
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        String str = this.enumeratorImei;
        int i6 = i4 + 43;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return str;
    }

    public String getEnumeratorName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 107;
        int i4 = i2 | 107;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        String str = this.enumeratorName;
        int i7 = i2 & 91;
        int i8 = -(-((i2 ^ 91) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getEnumeratorPhone() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 89;
        int i4 = ((i2 ^ 89) | i3) << 1;
        int i5 = -((i2 | 89) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return this.enumeratorPhone;
        }
        int i7 = 75 / 0;
        return this.enumeratorPhone;
    }

    public int getFirmId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 41) | (i2 & 41)) << 1;
        int i4 = -(((~i2) & 41) | (i2 & (-42)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.firmId;
        if (i6 != 0) {
            int i8 = 74 / 0;
        }
        return i7;
    }

    public int getIsMarked() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = (((i2 ^ 103) | i3) << 1) - ((i2 | 103) & (~i3));
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return this.isMarked;
        }
        int i5 = 80 / 0;
        return this.isMarked;
    }

    public int getIsMarkedForCnic() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-64)) | ((~i2) & 63)) - (~((i2 & 63) << 1))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.isMarkedForCnic;
        int i5 = ((i2 & (-52)) | ((~i2) & 51)) + ((i2 & 51) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public int getIsMarkedForNH() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = ((((i2 ^ 97) | i3) << 1) - (~(-((i2 | 97) & (~i3))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = this.isMarkedForNH;
        int i8 = i5 & 59;
        int i9 = i8 + ((i5 ^ 59) | i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return i7;
        }
        throw null;
    }

    public int getIsRejectBoxShown() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 33) << 1) - (i2 ^ 33);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.isRejectBoxShown;
        int i5 = ((i2 & 1) - (~(i2 | 1))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int getIsRejected() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 21) | (i2 & 21)) << 1) - (((~i2) & 21) | (i2 & (-22)));
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.isRejected;
        if (i4 == 0) {
            int i6 = 61 / 0;
        }
        return i5;
    }

    public int getIsSelected() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 79;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.isSelected;
        int i6 = (i2 ^ 99) + ((i2 & 99) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getIsSent() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 3) - (~(-(-((i3 & 3) << 1))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            i = this.isSent;
            int i6 = 72 / 0;
        } else {
            i = this.isSent;
        }
        int i7 = i5 & 9;
        int i8 = (i7 - (~(-(-((i5 ^ 9) | i7))))) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 56 / 0;
        }
        return i;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 109;
        int i4 = -(-((i2 ^ 109) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        String str = this.name;
        int i6 = ((i2 ^ 113) | (i2 & 113)) << 1;
        int i7 = -(((~i2) & 113) | (i2 & (-114)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public double getPercentage() {
        int i = 2 % 2;
        int i2 = a + 41;
        b = i2 % 128;
        return i2 % 2 == 0 ? ag.m(this.percentage, 4) : ag.m(this.percentage, 2);
    }

    public String getSentToServerTimeStamp() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = i3 + ((i2 ^ 77) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.sentToServerTimeStamp;
        int i6 = i2 + 73;
        b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public int getServer_app_version() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 115;
        int i5 = (i3 ^ 115) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 != 0) {
            i = this.server_app_version;
            int i8 = 57 / 0;
        } else {
            i = this.server_app_version;
        }
        int i9 = ((i7 & 37) - (~(i7 | 37))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return i;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    public String getTimeStampEnumerator() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 46) + (i2 | 46);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.timeStampEnumerator;
        if (str != null) {
            int i6 = ((i2 ^ 68) + ((i2 & 68) << 1)) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                str.equalsIgnoreCase(BuildConfig.FLAVOR);
                throw null;
            }
            if (str.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                this.timeStampEnumerator = "0000-00-00 00:00:00";
                int i7 = b;
                int i8 = (i7 & 69) + (i7 | 69);
                a = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            this.timeStampEnumerator = "0000-00-00 00:00:00";
            int i10 = b;
            int i11 = (i10 & 69) + (i10 | 69);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        String str2 = this.timeStampEnumerator;
        int i13 = b;
        int i14 = (-2) - (((i13 ^ 20) + ((i13 & 20) << 1)) ^ (-1));
        a = i14 % 128;
        int i15 = i14 % 2;
        return str2;
    }

    public int getTotalContinueCount() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 92) + ((i2 & 92) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.totalContinueCount;
        int i7 = i2 + 119;
        a = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public int getTotalCount() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 7;
        int i4 = (i2 ^ 7) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this.totalCount;
        }
        throw null;
    }

    public String getVerified() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = ((i2 ^ 33) | i3) << 1;
        int i5 = -((i2 | 33) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        String str = this.verified;
        if (i7 == 0) {
            int i8 = 3 / 0;
        }
        return str;
    }

    public void setBaseUrl(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 29;
        int i4 = ((i2 & 29) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.baseUrl = str;
        int i9 = (i7 ^ 29) + ((i7 & 29) << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 43 / 0;
        }
    }

    public void setBatchDetail(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 39;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.batchDetail = str;
        int i5 = (i2 & (-20)) | ((~i2) & 19);
        int i6 = -(-((i2 & 19) << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEntryType(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = -(-(i2 | 71));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.entryType = str;
        int i7 = i2 + 95;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setEnum_app_version(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 | 115) << 1;
        int i5 = -((i3 & (-116)) | ((~i3) & 115));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.enum_app_version = i;
        if (i7 != 0) {
            int i8 = 64 / 0;
        }
        int i9 = (((i3 | 85) << 1) - (~(-(((~i3) & 85) | (i3 & (-86)))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setEnum_app_version_name(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 22) + (i2 | 22)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        Object obj = null;
        this.enum_app_version_name = str;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 55;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setEnumeratorCnic(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.enumeratorCnic = str;
        } else {
            this.enumeratorCnic = str;
            int i4 = 6 / 0;
        }
    }

    public void setEnumeratorId(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 61;
        int i5 = -(-((i3 ^ 61) | i4));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.enumeratorId = i;
        int i8 = i3 + 97;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public void setEnumeratorImei(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 80) << 1) - (i2 ^ 80)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.enumeratorImei = str;
            return;
        }
        this.enumeratorImei = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEnumeratorName(String str) {
        int i = 2 % 2;
        int i2 = a + 79;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.enumeratorName = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = ((i3 ^ 123) | (i3 & 123)) << 1;
        int i6 = -((i3 & (-124)) | ((~i3) & 123));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setEnumeratorPhone(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = i2 | 121;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.enumeratorPhone = str;
        if (i6 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i2 & 27;
        int i8 = (((i2 | 27) & (~i7)) - (~(-(-(i7 << 1))))) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 25 / 0;
        }
    }

    public void setFirmId(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 9) | (i3 & 9)) << 1;
        int i5 = -((i3 & (-10)) | ((~i3) & 9));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.firmId = i;
        int i8 = ((i3 ^ 123) | (i3 & 123)) << 1;
        int i9 = -(((~i3) & 123) | (i3 & (-124)));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 93 / 0;
        }
    }

    public void setIsMarked(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 93;
        int i5 = (i3 ^ 93) | i4;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.isMarked = i;
        int i8 = ((i3 ^ 116) + ((i3 & 116) << 1)) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIsMarkedForCnic(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 45) + (i3 | 45);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.isMarkedForCnic = i;
        int i7 = i5 + 25;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setIsMarkedForNH(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 15) + (i3 | 15);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        Object obj = null;
        this.isMarkedForNH = i;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i5 + 11;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setIsRejectBoxShown(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 99) << 1) - (~(-((i3 & (-100)) | ((~i3) & 99))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.isRejectBoxShown = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 & 79;
        int i7 = i3 | 79;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setIsRejected(int i) {
        int i2 = 2 % 2;
        int i3 = a + 5;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.isRejected = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = (i4 & (-10)) | ((~i4) & 9);
        int i7 = -(-((i4 & 9) << 1));
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 45 / 0;
        }
    }

    public void setIsSelected(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 79) | (i3 & 79)) << 1;
        int i5 = -((i3 & (-80)) | ((~i3) & 79));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.isSelected = i;
        int i8 = i3 & 1;
        int i9 = -(-((i3 ^ 1) | i8));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public void setIsSent(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 78) + ((i3 & 78) << 1)) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.isSent = i;
        int i7 = i5 + 115;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 113) << 1) - (~(-((i2 & (-114)) | ((~i2) & 113))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.name = str;
        int i5 = i2 & 83;
        int i6 = ((i2 ^ 83) | i5) << 1;
        int i7 = -((i2 | 83) & (~i5));
        int i8 = (i6 & i7) + (i6 | i7);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 97 / 0;
        }
    }

    public void setPercentage(double d) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 9) << 1) - (i2 ^ 9);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        this.percentage = d;
        int i6 = ((i4 | 89) << 1) - (i4 ^ 89);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setSentToServerTimeStamp(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-92)) | ((~i2) & 91);
        int i4 = -(-((i2 & 91) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.sentToServerTimeStamp = str;
        int i8 = i6 ^ 53;
        int i9 = ((i6 & 53) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public void setServer_app_version(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-92)) | ((~i3) & 91)) + ((i3 & 91) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.server_app_version = i;
        int i6 = (i3 ^ 29) + ((i3 & 29) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setTimeStampEnumerator(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = (i3 - (~((i2 ^ 7) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.timeStampEnumerator = str;
        int i6 = i2 & 45;
        int i7 = ((((i2 ^ 45) | i6) << 1) - (~(-((i2 | 45) & (~i6))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setTimeStampServer(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-12)) | ((~i2) & 11)) - (~((i2 & 11) << 1))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        this.timeStampServer = str;
        int i6 = ((i4 ^ 49) | (i4 & 49)) << 1;
        int i7 = -(((~i4) & 49) | (i4 & (-50)));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 23 / 0;
        }
    }

    public void setTimeStampSupervisor(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 31;
        int i4 = -(-((i2 ^ 31) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.timeStampSupervisor = str;
        if (i6 == 0) {
            int i7 = 34 / 0;
        }
    }

    public void setTotalContinueCount(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 1;
        int i5 = (((i3 ^ 1) | i4) << 1) - ((i3 | 1) & (~i4));
        a = i5 % 128;
        int i6 = i5 % 2;
        this.totalContinueCount = i;
        if (i6 != 0) {
            throw null;
        }
    }

    public void setTotalCount(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 63) | (i3 & 63)) << 1;
        int i5 = -((i3 & (-64)) | ((~i3) & 63));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.totalCount = i;
        int i8 = (i3 & 45) + (i3 | 45);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 4 / 0;
        }
    }

    public void setVerified(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = (i2 ^ 115) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        this.verified = str;
        if (i7 == 0) {
            int i8 = 38 / 0;
        }
        int i9 = i6 ^ 15;
        int i10 = -(-((i6 & 15) << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    public String getTimeStampSupervisor() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = (((i2 ^ 103) | i3) << 1) - ((i2 | 103) & (~i3));
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.timeStampSupervisor;
        if (str != null) {
            int i6 = i5 & 117;
            int i7 = (((i5 ^ 117) | i6) << 1) - ((i5 | 117) & (~i6));
            b = i7 % 128;
            if (i7 % 2 == 0) {
                str.equalsIgnoreCase(BuildConfig.FLAVOR);
                obj.hashCode();
                throw null;
            }
            if (str.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                this.timeStampSupervisor = "0000-00-00 00:00:00";
                int i8 = b;
                int i9 = ((i8 ^ 95) | (i8 & 95)) << 1;
                int i10 = -(((~i8) & 95) | (i8 & (-96)));
                int i11 = (i9 & i10) + (i10 | i9);
                a = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            this.timeStampSupervisor = "0000-00-00 00:00:00";
            int i13 = b;
            int i14 = ((i13 ^ 95) | (i13 & 95)) << 1;
            int i15 = -(((~i13) & 95) | (i13 & (-96)));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        String str2 = this.timeStampSupervisor;
        int i18 = b;
        int i19 = (i18 & (-26)) | ((~i18) & 25);
        int i20 = -(-((i18 & 25) << 1));
        int i21 = (i19 & i20) + (i20 | i19);
        a = i21 % 128;
        int i22 = i21 % 2;
        return str2;
    }

    public Batch(Batch batch) {
        setEnumeratorId(batch.getEnumeratorId());
        setFirmId(batch.getFirmId());
        setEnumeratorName(batch.getEnumeratorName());
        setEnumeratorImei(batch.getEnumeratorImei().toLowerCase());
        setEnumeratorCnic(batch.getEnumeratorCnic());
        setEnumeratorPhone(batch.getEnumeratorPhone());
        setIsMarked(batch.getIsMarked());
        setIsMarkedForCnic(batch.getIsMarkedForCnic());
        setIsMarkedForNH(batch.getIsMarkedForNH());
        setIsSent(batch.getIsSent());
        setName(batch.getName());
        setTimeStampEnumerator(batch.getTimeStampEnumerator());
        setSentToServerTimeStamp(batch.getSentToServerTimeStamp());
        setTotalCount(batch.getTotalCount());
        setTotalContinueCount(batch.getTotalContinueCount());
        setPercentage(batch.getPercentage());
        setVerified(batch.getVerified());
        setIsRejectBoxShown(batch.getIsRejectBoxShown());
        setIsRejected(batch.getIsRejected());
        setIsSelected(batch.getIsSelected());
        setEnum_app_version(batch.getEnum_app_version());
        setServer_app_version(batch.getServer_app_version());
        setEnum_app_version_name(batch.getEnum_app_version_name());
        setBaseUrl(batch.getBaseUrl());
        setEntryType(batch.getEntryType());
        setBatchDetail(batch.getBatchDetail());
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    public String getTimeStampServer() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 65) << 1) - (i3 ^ 65);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        String str = this.timeStampServer;
        if (str != null) {
            int i7 = (i5 & 25) + (i5 | 25);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (!(!str.equalsIgnoreCase(BuildConfig.FLAVOR))) {
                this.timeStampServer = "0000-00-00 00:00:00";
                i = b + 25;
                a = i % 128;
                if (i % 2 != 0) {
                    int i9 = 5 / 5;
                }
            }
        } else {
            this.timeStampServer = "0000-00-00 00:00:00";
            i = b + 25;
            a = i % 128;
            if (i % 2 != 0) {
                int i10 = 5 / 5;
            }
        }
        String str2 = this.timeStampServer;
        int i11 = a + 35;
        b = i11 % 128;
        int i12 = i11 % 2;
        return str2;
    }

    public JSONObject getJson() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", getName());
            jSONObject.put("marked", getIsMarked());
            int isMarkedForCnic = getIsMarkedForCnic();
            int i2 = a;
            int i3 = i2 & 49;
            int i4 = i3 + ((i2 ^ 49) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            jSONObject.put("marked_for_cnic", isMarkedForCnic);
            jSONObject.put("sent", getIsSent());
            jSONObject.put("percentage", getPercentage());
            jSONObject.put("time_stamp_enum", getTimeStampEnumerator());
            int i6 = b;
            int i7 = (((i6 | 120) << 1) - (i6 ^ 120)) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                jSONObject.put("time_stamp_super", getTimeStampSupervisor());
                jSONObject.put("time_stamp_server", getTimeStampServer());
                jSONObject.put("server_sent", getSentToServerTimeStamp());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            jSONObject.put("time_stamp_super", getTimeStampSupervisor());
            jSONObject.put("time_stamp_server", getTimeStampServer());
            jSONObject.put("server_sent", getSentToServerTimeStamp());
            jSONObject.put("batch_detail", getBatchDetail());
            jSONObject.put("total_count", getTotalCount());
            jSONObject.put("verified", getVerified());
            int i8 = a;
            int i9 = i8 & 123;
            int i10 = (i8 | 123) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            b = i12 % 128;
            int i13 = i12 % 2;
            jSONObject.put("enum_id", getEnumeratorId());
            jSONObject.put("firm_id", getFirmId());
            jSONObject.put("entry_type", getEntryType());
            String enumeratorName = getEnumeratorName();
            int i14 = b;
            int i15 = i14 & 53;
            int i16 = -(-(i14 | 53));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            jSONObject.put("enum_name", enumeratorName);
            jSONObject.put("imei_number", getEnumeratorImei().toLowerCase());
            jSONObject.put("cnic", getEnumeratorCnic());
            String enumeratorPhone = getEnumeratorPhone();
            int i19 = a + 57;
            b = i19 % 128;
            int i20 = i19 % 2;
            jSONObject.put("number", enumeratorPhone);
            jSONObject.put("is_selected", getIsSelected());
            jSONObject.put("is_rejected", getIsRejected());
            jSONObject.put("server_app_version", getServer_app_version());
            int i21 = a;
            int i22 = i21 & 65;
            int i23 = -(-((i21 ^ 65) | i22));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            b = i24 % 128;
            if (i24 % 2 == 0) {
                jSONObject.put("enum_app_version", getEnum_app_version());
                jSONObject.put("enum_app_version_name", getEnum_app_version_name());
                int i25 = 5 / 0;
            } else {
                jSONObject.put("enum_app_version", getEnum_app_version());
                jSONObject.put("enum_app_version_name", getEnum_app_version_name());
            }
            int i26 = (-2) - ((b + 116) ^ (-1));
            a = i26 % 128;
            int i27 = i26 % 2;
            int i28 = b;
            int i29 = i28 ^ 23;
            int i30 = (i28 & 23) << 1;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            a = i31 % 128;
            int i32 = i31 % 2;
            return jSONObject;
        } catch (JSONException unused) {
        }
    }

    private void setEmptyValues() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        setEnumeratorId(-1);
        setFirmId(0);
        setEnumeratorName(BuildConfig.FLAVOR);
        setEnumeratorImei(BuildConfig.FLAVOR);
        setEnumeratorCnic(BuildConfig.FLAVOR);
        setEnumeratorPhone(BuildConfig.FLAVOR);
        setBatchDetail(BuildConfig.FLAVOR);
        int i5 = (-2) - ((-1) ^ (a + 20));
        b = i5 % 128;
        if (i5 % 2 == 0) {
            setIsMarkedForCnic(0);
            setIsMarked(1);
        } else {
            setIsMarkedForCnic(0);
            setIsMarked(0);
        }
        setIsMarkedForNH(0);
        setIsSent(0);
        setName(BuildConfig.FLAVOR);
        setTimeStampEnumerator(BuildConfig.FLAVOR);
        setTimeStampSupervisor(BuildConfig.FLAVOR);
        setTimeStampServer(BuildConfig.FLAVOR);
        int i6 = a;
        int i7 = i6 ^ 33;
        int i8 = ((i6 & 33) | i7) << 1;
        int i9 = -i7;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        setSentToServerTimeStamp(BuildConfig.FLAVOR);
        setTotalCount(0);
        setTotalContinueCount(0);
        setPercentage(0.0d);
        int i12 = b;
        int i13 = (i12 & 15) + (i12 | 15);
        a = i13 % 128;
        int i14 = i13 % 2;
        setVerified(BuildConfig.FLAVOR);
        setIsRejectBoxShown(0);
        setIsRejected(0);
        setIsSelected(0);
        int i15 = b;
        int i16 = i15 & 113;
        int i17 = ((i15 | 113) & (~i16)) + (i16 << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        setEnum_app_version(0);
        setServer_app_version(0);
        setEnum_app_version_name(BuildConfig.FLAVOR);
        setBaseUrl(BuildConfig.FLAVOR);
        int i19 = a;
        int i20 = i19 ^ 93;
        int i21 = (((i19 & 93) | i20) << 1) - i20;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            setEntryType(BuildConfig.FLAVOR);
            throw null;
        }
        setEntryType(BuildConfig.FLAVOR);
        int i22 = b;
        int i23 = (i22 & (-94)) | ((~i22) & 93);
        int i24 = -(-((i22 & 93) << 1));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = 34 / 0;
        }
    }
}
