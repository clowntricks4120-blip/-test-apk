package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0279y implements N {
    private static int a = 1;
    private static int b;
    public R c;

    public C0279y(R r) {
        this.c = r;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.N
    public InputStream a() {
        int i = 2 % 2;
        C0271q c0271q = new C0271q(this.c);
        int i2 = b;
        int i3 = ((i2 ^ 118) + ((i2 & 118) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        return c0271q;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        C0273s c0273s = new C0273s(i.q(a()));
        int i2 = b;
        int i3 = i2 & 5;
        int i4 = ((i2 ^ 5) | i3) << 1;
        int i5 = -((i2 | 5) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        return c0273s;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 121;
        int i4 = -(-(i2 | 121));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        try {
            O oE = e();
            int i7 = b;
            int i8 = i7 & 49;
            int i9 = (i7 | 49) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return oE;
        } catch (IOException e) {
            StringBuilder sbW = j.w("IOException converting stream to byte array: ");
            sbW.append(e.getMessage());
            throw new C0267m(sbW.toString(), e);
        }
    }
}
