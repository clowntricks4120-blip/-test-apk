package ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema;

import androidx.annotation.Keep;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class survey {
    private static int a = 1;
    private static int b;
    public String data;
    public long id;

    public survey(long j, String str) {
        this.id = j;
        this.data = str;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 49) | (i2 & 49)) << 1;
        int i4 = -(((~i2) & 49) | (i2 & (-50)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        StringBuilder sbW = j.w("survey{id=");
        sbW.append(this.id);
        int i7 = a + 89;
        b = i7 % 128;
        int i8 = i7 % 2;
        sbW.append(", data='");
        sbW.append(this.data);
        int i9 = b + 33;
        a = i9 % 128;
        int i10 = i9 % 2;
        sbW.append('\'');
        sbW.append('}');
        int i11 = b + 91;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            return sbW.toString();
        }
        sbW.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
