package ivas.gov.bisp.enumeration.cJ;

/* JADX INFO: loaded from: classes.dex */
public class u implements r, t {
    private static int a = 1;
    private static int b;
    public final t c;

    public u(t tVar) {
        this.c = tVar;
    }

    @Override // ivas.gov.bisp.enumeration.cJ.r
    public int a(e eVar, String str, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 117;
        int i5 = ((((i3 & 117) | i4) << 1) - (~(-i4))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        t tVar = this.c;
        if (i6 == 0) {
            return tVar.j(eVar, str, i);
        }
        tVar.j(eVar, str, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cJ.r, ivas.gov.bisp.enumeration.cJ.t
    public int d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 111) << 1;
        int i4 = -(((~i2) & 111) | (i2 & (-112)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iD = this.c.d();
        int i7 = b;
        int i8 = ((i7 ^ 91) | (i7 & 91)) << 1;
        int i9 = -(((~i7) & 91) | (i7 & (-92)));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return iD;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = (~i3) & (i2 | 103);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (obj == this) {
            int i9 = i7 & 15;
            int i10 = -(-((i7 ^ 15) | i9));
            int i11 = (i9 & i10) + (i9 | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i7 + 11;
            a = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 51 / 0;
            }
            return true;
        }
        if (!(!(obj instanceof u))) {
            int i15 = ((i2 & 18) + (i2 | 18)) - 1;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                return this.c.equals(((u) obj).c);
            }
            int i16 = 61 / 0;
            return this.c.equals(((u) obj).c);
        }
        int i17 = (i7 & (-82)) | ((~i7) & 81);
        int i18 = (i7 & 81) << 1;
        int i19 = (i17 & i18) + (i17 | i18);
        a = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.cJ.t
    public int j(e eVar, CharSequence charSequence, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-32)) | ((~i3) & 31);
        int i5 = -(-((i3 & 31) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iJ = this.c.j(eVar, charSequence, i);
        int i8 = a + 23;
        b = i8 % 128;
        int i9 = i8 % 2;
        return iJ;
    }

    public static r c(t tVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = (((~i3) & (i2 | 119)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            boolean z = tVar instanceof i;
            throw null;
        }
        if (tVar instanceof i) {
            r rVar = ((i) tVar).c;
            int i5 = b;
            int i6 = i5 ^ 59;
            int i7 = (i5 & 59) << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return rVar;
        }
        if (!(!(tVar instanceof r))) {
            int i10 = i2 + 87;
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            r rVar2 = (r) tVar;
            int i13 = i11 + 5;
            a = i13 % 128;
            int i14 = i13 % 2;
            return rVar2;
        }
        if (tVar == null) {
            int i15 = ((i2 & 68) + (i2 | 68)) - 1;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        u uVar = new u(tVar);
        int i16 = b + 103;
        a = i16 % 128;
        if (i16 % 2 != 0) {
            return uVar;
        }
        obj.hashCode();
        throw null;
    }
}
