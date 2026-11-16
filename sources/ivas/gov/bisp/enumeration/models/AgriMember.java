package ivas.gov.bisp.enumeration.models;

import java.io.Serializable;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AgriMember implements Serializable {
    private static int a = 0;
    private static int b = 1;
    private AgricultureDetail agricultureDetail;
    private int isDetailAdded;
    private int isSelected;
    private String name;
    private int roster_relational_id;

    public AgriMember() {
        setEmptyValues();
    }

    public String encryptName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 109;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 109)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            throw null;
        }
        String str = this.name;
        int i8 = i7 & 109;
        int i9 = i7 | 109;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public AgricultureDetail getAgricultureDetail() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = i3 + ((i2 ^ 105) | i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.agricultureDetail;
        }
        throw null;
    }

    public int getIsDetailAdded() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 33) - (~(-(-(i2 | 33))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.isDetailAdded;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getIsSelected() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 69) << 1) - (i2 ^ 69);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.isSelected;
        int i6 = i2 ^ 31;
        int i7 = ((((i2 & 31) | i6) << 1) - (~(-i6))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = i2 | 15;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        String str = this.name;
        int i8 = i6 + 2;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public int getRoster_relational_id() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 42) ^ (-1));
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.roster_relational_id;
        }
        int i3 = 33 / 0;
        return this.roster_relational_id;
    }

    public void setAgricultureDetail(AgricultureDetail agricultureDetail) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = (((i2 ^ 53) | i3) << 1) - ((~i3) & (i2 | 53));
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.agricultureDetail = agricultureDetail;
            int i5 = 16 / 0;
        } else {
            this.agricultureDetail = agricultureDetail;
        }
        int i6 = i2 + 23;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIsDetailAdded(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 69) | (i3 & 69)) << 1;
        int i5 = -(((~i3) & 69) | (i3 & (-70)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.isDetailAdded = i;
        if (i8 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i9 = ((i7 & 28) + (i7 | 28)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setIsSelected(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 71) + ((i3 & 71) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.isSelected = i;
        int i6 = (i3 & (-72)) | ((~i3) & 71);
        int i7 = (i3 & 71) << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = (i3 - (~(-(-((i2 ^ 73) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.name = str;
        if (i5 == 0) {
            int i6 = 83 / 0;
        }
        int i7 = i2 & 61;
        int i8 = -(-((i2 ^ 61) | i7));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public void setRoster_relational_id(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 & (-70)) | ((~i3) & 69)) - (~(-(-((i3 & 69) << 1))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.roster_relational_id = i;
        } else {
            this.roster_relational_id = i;
            int i5 = 67 / 0;
        }
    }

    public AgriMember(String str, int i, int i2, int i3, AgricultureDetail agricultureDetail) {
        this.name = str;
        this.roster_relational_id = i;
        this.isSelected = i2;
        this.isDetailAdded = i3;
        this.agricultureDetail = agricultureDetail;
    }

    private void setEmptyValues() {
        int i = 2 % 2;
        int i2 = a + 61;
        b = i2 % 128;
        int i3 = i2 % 2;
        setName(BuildConfig.FLAVOR);
        setIsSelected(0);
        setIsDetailAdded(0);
        setRoster_relational_id(0);
        AgricultureDetail agricultureDetail = new AgricultureDetail();
        int i4 = b;
        int i5 = i4 & 73;
        int i6 = ((i4 ^ 73) | i5) << 1;
        int i7 = -((i4 | 73) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        setAgricultureDetail(agricultureDetail);
        int i10 = b;
        int i11 = (i10 | 17) << 1;
        int i12 = -(i10 ^ 17);
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        int i14 = i13 % 2;
    }

    public JSONObject getJson() throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        int i2 = a + 29;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObject.put("name", encryptName());
            throw null;
        }
        jSONObject.put("name", encryptName());
        int i3 = this.roster_relational_id;
        int i4 = b;
        int i5 = i4 & 47;
        int i6 = -(-((i4 ^ 47) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        jSONObject.put("roster_relational_id", i3);
        JSONObject json = this.agricultureDetail.getJson();
        int i9 = b;
        int i10 = (i9 & (-118)) | ((~i9) & 117);
        int i11 = -(-((i9 & 117) << 1));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        jSONObject.put("agri_detail", json);
        int i14 = a;
        int i15 = ((i14 | 65) << 1) - (i14 ^ 65);
        b = i15 % 128;
        int i16 = i15 % 2;
        return jSONObject;
    }

    public JSONObject getDecryptedJson() throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        String str = this.name;
        int i2 = a;
        int i3 = i2 & 13;
        int i4 = (i2 ^ 13) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        jSONObject.put("name", str);
        jSONObject.put("roster_relational_id", this.roster_relational_id);
        int i7 = a + 39;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            jSONObject.put("agri_detail", this.agricultureDetail.getDecryptedJson());
            int i8 = 1 / 0;
        } else {
            jSONObject.put("agri_detail", this.agricultureDetail.getDecryptedJson());
        }
        int i9 = b;
        int i10 = ((i9 ^ 17) | (i9 & 17)) << 1;
        int i11 = -(((~i9) & 17) | (i9 & (-18)));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        return jSONObject;
    }

    public AgriMember(String str, int i) {
        setEmptyValues();
        this.roster_relational_id = i;
        this.name = str;
    }
}
