package ivas.gov.bisp.enumeration.cC;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class i implements Serializable, Cloneable {
    private static int a = 1;
    private static int b;
    public O c;
    public final int d;
    public int e;
    public int g;
    public boolean f = false;
    public boolean h = false;

    public i(int i) {
        this.d = i;
    }

    public i c() {
        int i = 2 % 2;
        i iVar = new i(this.d);
        int i2 = b;
        int i3 = (i2 & 123) + (i2 | 123);
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            iVar.c = this.c;
            obj.hashCode();
            throw null;
        }
        iVar.c = this.c;
        int i5 = this.e;
        int i6 = i4 & 27;
        int i7 = i6 + ((i4 ^ 27) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        iVar.e = i5;
        int i9 = this.g;
        if (i8 != 0) {
            iVar.g = i9;
            int i10 = 48 / 0;
        } else {
            iVar.g = i9;
        }
        iVar.f = this.f;
        boolean z = this.h;
        int i11 = i4 + 39;
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        iVar.h = z;
        int i14 = ((i12 ^ 17) | (i12 & 17)) << 1;
        int i15 = -((i12 & (-18)) | ((~i12) & 17));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            return iVar;
        }
        throw null;
    }

    public /* synthetic */ Object clone() {
        int i = 2 % 2;
        int i2 = a + 33;
        b = i2 % 128;
        int i3 = i2 % 2;
        i iVarC = c();
        int i4 = a;
        int i5 = i4 & 125;
        int i6 = (i4 ^ 125) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return iVarC;
        }
        throw null;
    }

    public int d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.f) {
            int i5 = i4 & 103;
            int i6 = -(-((i4 ^ 103) | i5));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            if (!this.h) {
                int i10 = i8 & 49;
                int i11 = (i8 | 49) & (~i10);
                int i12 = i10 << 1;
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                int i14 = i13 % 128;
                b = i14;
                int i15 = i13 % 2;
                int i16 = this.e;
                int i17 = (i14 | 97) << 1;
                int i18 = -(i14 ^ 97);
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                a = i19 % 128;
                int i20 = i19 % 2;
                return i16;
            }
        }
        int i21 = a;
        int i22 = ((i21 & (-80)) | ((~i21) & 79)) + ((i21 & 79) << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
        return Integer.MAX_VALUE;
    }
}
