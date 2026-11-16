package ivas.gov.bisp.enumeration.models;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ProvinceItem implements Serializable {
    public String id;
    public int province_id;
    public String province_name;

    public ProvinceItem(String str, int i, String str2) {
        this.id = str;
        this.province_id = i;
        this.province_name = str2;
    }
}
