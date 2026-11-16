package ivas.gov.bisp.enumeration.bK;

import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class d {
    private static int a = 1;
    private static int b;
    public int c;
    public int d;
    public int e;

    public d(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        int i2 = a;
        int i3 = (i2 & (-22)) | ((~i2) & 21);
        int i4 = -(-((i2 & 21) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            sb.append(" Years, ");
            sb.append(this.d);
            obj.hashCode();
            throw null;
        }
        sb.append(" Years, ");
        sb.append(this.d);
        sb.append(" Months, ");
        int i6 = this.c;
        int i7 = b + 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return j.s(sb, i6, " Days");
        }
        j.s(sb, i6, " Days");
        throw null;
    }
}
