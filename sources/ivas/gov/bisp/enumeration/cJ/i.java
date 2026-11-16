package ivas.gov.bisp.enumeration.cJ;

/* JADX INFO: loaded from: classes.dex */
public class i implements t {
    private static int a = 1;
    private static int b;
    public final r c;

    public i(r rVar) {
        this.c = rVar;
    }

    public static t c(r rVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 51;
        int i4 = -(-((i2 & 51) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        b = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            boolean z = rVar instanceof u;
            obj.hashCode();
            throw null;
        }
        if (!(!(rVar instanceof u))) {
            t tVar = (t) rVar;
            int i7 = i6 + 37;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return tVar;
            }
            obj.hashCode();
            throw null;
        }
        if (rVar != null) {
            i iVar = new i(rVar);
            int i8 = b;
            int i9 = ((i8 & 22) + (i8 | 22)) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return iVar;
            }
            throw null;
        }
        int i10 = i2 & 89;
        int i11 = (i10 - (~((i2 ^ 89) | i10))) - 1;
        int i12 = i11 % 128;
        b = i12;
        if (i11 % 2 != 0) {
            int i13 = 0 / 0;
        }
        int i14 = ((i12 ^ 66) + ((i12 & 66) << 1)) - 1;
        a = i14 % 128;
        if (i14 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cJ.t
    public int d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.d();
            throw null;
        }
        int iD = this.c.d();
        int i4 = b;
        int i5 = ((((i4 ^ 105) | (i4 & 105)) << 1) - (~(-(((~i4) & 105) | (i4 & (-106)))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return iD;
    }

    @Override // ivas.gov.bisp.enumeration.cJ.t
    public int j(e eVar, CharSequence charSequence, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-32)) | ((~i3) & 31);
        int i5 = (i3 & 31) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        r rVar = this.c;
        String string = charSequence.toString();
        if (i7 == 0) {
            return rVar.a(eVar, string, i);
        }
        rVar.a(eVar, string, i);
        throw null;
    }
}
