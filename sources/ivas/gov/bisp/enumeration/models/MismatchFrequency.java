package ivas.gov.bisp.enumeration.models;

import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.p091n.j;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class MismatchFrequency {
    private static int a = 0;
    private static int b = 1;
    public double count;
    public String name;
    public double percentage;
    public double totalVerification;

    public MismatchFrequency(String str, double d, double d2) {
        this.name = str;
        this.count = d2;
        this.totalVerification = d;
        if (d != 0.0d) {
            this.percentage = (d2 / d) * 100.0d;
            int i = b;
            int i2 = ((((i ^ 61) | (i & 61)) << 1) - (~(-(((~i) & 61) | (i & (-62)))))) - 1;
            a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.percentage = ag.m(this.percentage, 2);
        int i5 = b;
        int i6 = i5 & 67;
        int i7 = i6 + ((i5 ^ 67) | i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public String toString() {
        String string;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 101;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 101)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        StringBuilder sbW = j.w("MismatchFrequency{name='");
        String str = this.name;
        int i8 = a;
        int i9 = ((i8 ^ 119) - (~(-(-((i8 & 119) << 1))))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        j.v(sbW, str, '\'', ", count=");
        sbW.append(this.count);
        int i11 = a + 89;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            sbW.append(", totalVerification=");
            sbW.append(this.totalVerification);
            int i12 = 82 / 0;
        } else {
            sbW.append(", totalVerification=");
            sbW.append(this.totalVerification);
        }
        sbW.append(", percentage=");
        sbW.append(this.percentage);
        int i13 = a;
        int i14 = (i13 & (-44)) | ((~i13) & 43);
        int i15 = (i13 & 43) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            sbW.append('v');
            string = sbW.toString();
        } else {
            sbW.append('}');
            string = sbW.toString();
        }
        int i17 = a + 63;
        b = i17 % 128;
        int i18 = i17 % 2;
        return string;
    }

    public MismatchFrequency() {
        this.name = BuildConfig.FLAVOR;
    }
}
