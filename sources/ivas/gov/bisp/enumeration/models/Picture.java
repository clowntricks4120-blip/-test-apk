package ivas.gov.bisp.enumeration.models;

import com.orm.SugarRecord;

/* JADX INFO: loaded from: classes.dex */
public class Picture extends SugarRecord {
    public String batchName;
    public String formNo;
    public String formNoNotAtHome;
    public String image;
    public String imei;
    public String name;
    public String uniqueId;

    public Picture() {
    }

    public Picture(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.name = str;
        this.image = str2;
        this.imei = str3;
        this.formNoNotAtHome = str4;
        this.formNo = str5;
        this.uniqueId = str6;
        this.batchName = str7;
    }
}
