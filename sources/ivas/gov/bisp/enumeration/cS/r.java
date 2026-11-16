package ivas.gov.bisp.enumeration.cS;

/* JADX INFO: loaded from: classes.dex */
public class r extends c {
    private static int a = 0;
    private static int b = 1;
    public final ivas.gov.bisp.enumeration.cP.J d;

    public r(ivas.gov.bisp.enumeration.cP.J j, ivas.gov.bisp.enumeration.cP.x xVar) {
        super(xVar);
        if (j == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!j.j()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        int i = b;
        int i2 = i ^ 93;
        int i3 = ((i & 93) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d = j;
        int i7 = (i ^ 25) + ((i & 25) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public long h() {
        int i = 2 % 2;
        int i2 = b + 67;
        a = i2 % 128;
        int i3 = i2 % 2;
        long jH = this.d.h();
        int i4 = b;
        int i5 = i4 & 15;
        int i6 = ((i4 ^ 15) | i5) << 1;
        int i7 = -((i4 | 15) & (~i5));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return jH;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public boolean i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 89) - (~(-(-(i2 | 89))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zI = this.d.i();
        int i5 = a;
        int i6 = i5 ^ 123;
        int i7 = (((i5 & 123) | i6) << 1) - i6;
        b = i7 % 128;
        int i8 = i7 % 2;
        return zI;
    }
}
