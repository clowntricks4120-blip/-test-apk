package ivas.gov.bisp.enumeration.aL;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ivas.gov.bisp.enumeration.p096p.h {
    private static int a = 0;
    private static int b = 1;
    public final Typeface d;
    public final beB e;
    public boolean f;

    public interface beB {
    }

    public j(beB beb, Typeface typeface) {
        this.d = typeface;
        this.e = beb;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void aG(Typeface typeface, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
        b = i3 % 128;
        int i4 = i3 % 2;
        bx(typeface);
        if (i4 == 0) {
            throw null;
        }
        int i5 = b + 79;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final void aH(int i) {
        int i2 = 2 % 2;
        int i3 = b + 21;
        a = i3 % 128;
        int i4 = i3 % 2;
        bx(this.d);
        if (i4 != 0) {
            throw null;
        }
    }

    public final void bx(Typeface typeface) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 55;
        int i4 = ((i2 | 55) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.f) {
            ivas.gov.bisp.enumeration.P.h hVar = ((ivas.gov.bisp.enumeration.P.c) this.e).a;
            j jVar = hVar.z;
            int i5 = a;
            int i6 = i5 & 19;
            int i7 = (i6 - (~(-(-((i5 ^ 19) | i6))))) - 1;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            if (jVar != null) {
                int i10 = (-2) - (((i8 & 60) + (i8 | 60)) ^ (-1));
                int i11 = i10 % 128;
                a = i11;
                int i12 = i10 % 2;
                jVar.f = true;
                int i13 = i11 + 61;
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            if (hVar.x != typeface) {
                int i15 = b + 13;
                a = i15 % 128;
                int i16 = i15 % 2;
                hVar.x = typeface;
                int i17 = b;
                int i18 = (i17 & 99) + (i17 | 99);
                a = i18 % 128;
                int i19 = i18 % 2;
                z = true;
            } else {
                int i20 = b + 92;
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                a = i21 % 128;
                int i22 = i21 % 2;
                z = false;
            }
            if (z) {
                int i23 = a + 107;
                b = i23 % 128;
                int i24 = i23 % 2;
                hVar.m();
                int i25 = a;
                int i26 = ((i25 ^ 24) + ((i25 & 24) << 1)) - 1;
                b = i26 % 128;
                if (i26 % 2 == 0) {
                    int i27 = 4 / 4;
                }
            }
        }
        int i28 = a;
        int i29 = i28 & 117;
        int i30 = i29 + ((i28 ^ 117) | i29);
        b = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 95 / 0;
        }
    }
}
