package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class province {
    public String id;
    public int province_id;
    public String province_name;

    public province(String str, int i, String str2) {
        this.id = str;
        this.province_id = i;
        this.province_name = str2;
    }
}
