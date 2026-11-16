package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.o000Ooo.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class lib_mobile {

    @o0OO00O("idate")
    public String idate;

    @o0OO00O("operator_code")
    public int operatorCode;

    @o0OO00O("prefix")
    public String prefix;

    @o0OO00O("provider")
    public String provider;

    public lib_mobile(String str, String str2, int i, String str3) {
        this.prefix = str;
        this.provider = str2;
        this.operatorCode = i;
        this.idate = str3;
    }
}
