package ivas.gov.bisp.enumeration.O;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h {
    private static int a = 0;
    private static int b = 1;
    public final h c;
    public final float d;

    public c(float f, h hVar) {
        int i = 2 % 2;
        while (hVar instanceof c) {
            int i2 = a + 67;
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            hVar = ((c) hVar).c;
            float f2 = ((c) hVar).d;
            int i5 = i3 + 55;
            int i6 = i5 % 128;
            a = i6;
            f = i5 % 2 != 0 ? f - f2 : f + f2;
            int i7 = i6 + 95;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        this.c = hVar;
        this.d = f;
        int i9 = b + 41;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.O.h
    public final float b(RectF rectF) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 95) << 1) - (((~i2) & 95) | (i2 & (-96)));
        a = i3 % 128;
        int i4 = i3 % 2;
        float fB = this.c.b(rectF) + this.d;
        int i5 = b;
        int i6 = i5 & 75;
        int i7 = (i6 - (~((i5 ^ 75) | i6))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        float fMax = Math.max(0.0f, fB);
        int i9 = b;
        int i10 = (i9 & (-78)) | ((~i9) & 77);
        int i11 = -(-((i9 & 77) << 1));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        return fMax;
    }

    public final int hashCode() {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 69) << 1) - (i2 ^ 69);
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 != 0) {
            objArr = new Object[2];
            objArr[1] = this.c;
        } else {
            objArr = new Object[2];
            objArr[0] = this.c;
        }
        int i5 = i4 + 61;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            objArr[1] = Float.valueOf(this.d);
            Arrays.hashCode(objArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[1] = Float.valueOf(this.d);
        int iHashCode = Arrays.hashCode(objArr);
        int i6 = a;
        int i7 = (i6 & 47) + (i6 | 47);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 1 / 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 117;
        int i4 = i3 + ((i2 ^ 117) | i3);
        a = i4 % 128;
        boolean z = true;
        if (i4 % 2 == 0 ? this == obj : this == obj) {
            int i5 = (-2) - (((i2 & 22) + (i2 | 22)) ^ (-1));
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof c)) {
            int i6 = (((i2 | 85) << 1) - (~(-(((~i2) & 85) | (i2 & (-86)))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        c cVar = (c) obj;
        if (!(!this.c.equals(cVar.c))) {
            int i8 = a + 113;
            b = i8 % 128;
            int i9 = i8 % 2;
            if (this.d != cVar.d) {
                int i10 = a;
                int i11 = (i10 ^ 57) + ((i10 & 57) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                z = false;
            }
        } else {
            int i13 = a;
            int i14 = (i13 ^ 57) + ((i13 & 57) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            z = false;
        }
        int i16 = b + 69;
        a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 31 / 0;
        }
        return z;
    }
}
