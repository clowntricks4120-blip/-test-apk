package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class vilages {
    public String locality;
    public long localitycode;
    public String localitytype;
    public int uccode;

    public vilages(int i, long j, String str, String str2) {
        this.uccode = i;
        this.localitycode = j;
        this.localitytype = str;
        this.locality = str2;
    }
}
