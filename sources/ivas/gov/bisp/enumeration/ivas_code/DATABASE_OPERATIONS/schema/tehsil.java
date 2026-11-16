package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class tehsil {
    public int distcode;
    public String id;
    public String tehsil;
    public int tehsilcode;

    public tehsil(String str, int i, int i2, String str2) {
        this.id = str;
        this.tehsilcode = i;
        this.distcode = i2;
        this.tehsil = str2;
    }
}
