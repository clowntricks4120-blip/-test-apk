package ivas.gov.bisp.enumeration.bG;

import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class B {
    private static int a = 0;
    private static int b = 1;
    public B c;
    public int d;
    public String e;
    public int f;
    public int g;
    public String h;
    public String i;
    public int j;
    public B k;

    public B() {
        this.d = 0;
    }

    public B(int i, String str, String str2, int i2, int i3, String str3, int i4, B b2, B b3) {
        this.d = i;
        this.e = str;
        this.i = str2;
        this.f = i2;
        this.g = i3;
        this.h = str3;
        this.j = i4;
        this.k = b2;
        this.c = b3;
    }

    public String toString() {
        char c;
        int i = 2 % 2;
        int i2 = (-2) - ((a + 110) ^ (-1));
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            j.w("Person{id=").append(this.d);
            throw null;
        }
        StringBuilder sbW = j.w("Person{id=");
        sbW.append(this.d);
        sbW.append(", name='");
        String str = this.e;
        int i3 = b;
        int i4 = i3 & 35;
        int i5 = -(-((i3 ^ 35) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        j.v(sbW, str, '\'', ", gender='");
        String str2 = this.h;
        int i8 = b;
        int i9 = (i8 & (-94)) | ((~i8) & 93);
        int i10 = -(-((i8 & 93) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        j.v(sbW, str2, '\'', ", maritalStatus=");
        sbW.append(this.j);
        int i13 = a;
        int i14 = i13 & 9;
        int i15 = (((i13 ^ 9) | i14) << 1) - ((i13 | 9) & (~i14));
        b = i15 % 128;
        if (i15 % 2 == 0) {
            sbW.append(", fatherRoster=");
            String str3 = this.k.e;
            obj.hashCode();
            throw null;
        }
        sbW.append(", fatherRoster=");
        sbW.append(this.k.e);
        sbW.append(", motherRoster=");
        B b2 = this.c;
        int i16 = a;
        int i17 = i16 & 93;
        int i18 = -(-((i16 ^ 93) | i17));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            sbW.append(b2.e);
            c = 'D';
        } else {
            sbW.append(b2.e);
            c = '}';
        }
        sbW.append(c);
        String string = sbW.toString();
        int i20 = b + 41;
        a = i20 % 128;
        int i21 = i20 % 2;
        return string;
    }
}
