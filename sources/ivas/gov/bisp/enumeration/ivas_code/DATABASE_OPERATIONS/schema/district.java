package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class district {
    public int distcode;
    public String district;
    public int divcode;
    public String id;
    public int provcode;

    public district(String str, int i, int i2, int i3, String str2) {
        this.id = str;
        this.distcode = i;
        this.divcode = i2;
        this.provcode = i3;
        this.district = str2;
    }
}
