package ivas.gov.bisp.enumeration.p038bk;

import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class bo {
    private static int a = 1;
    private static int b;
    public String c;
    public String d;

    public bo(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        String str = this.c;
        int i2 = b;
        int i3 = i2 & 89;
        int i4 = ((i2 ^ 89) | i3) << 1;
        int i5 = -((i2 | 89) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            sb.append(str);
            sb.append(" (");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sb.append(str);
        sb.append(" (");
        String strU = j.u(sb, this.d, ")");
        int i7 = a + 105;
        b = i7 % 128;
        int i8 = i7 % 2;
        return strU;
    }
}
