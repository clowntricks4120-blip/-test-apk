package ivas.gov.bisp.enumeration.p063ci;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class S implements Enumeration {
    private static int a = 0;
    private static int b = 1;
    public int c = 0;
    public final /* synthetic */ L d;

    public S(L l) {
        this.d = l;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = (i2 ^ 57) | i3;
        int i5 = i3 ^ i4;
        int i6 = i4 & i3;
        boolean z = true;
        int i7 = i5 + (i6 << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int length = this.d.c.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.c < this.d.c.length) {
            int i8 = b;
            int i9 = i8 & 45;
            int i10 = ((i8 ^ 45) | i9) << 1;
            int i11 = -((i8 | 45) & (~i9));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = b;
            int i15 = i14 ^ 81;
            int i16 = -(-((i14 & 81) << 1));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 4 % 5;
            }
            z = false;
        }
        int i19 = b;
        int i20 = (i19 & 47) + (i19 | 47);
        a = i20 % 128;
        int i21 = i20 % 2;
        return z;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 46) << 1) - (i2 ^ 46)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.c;
        i[] iVarArr = this.d.c;
        int i6 = a;
        int i7 = i6 & 51;
        int i8 = (i6 ^ 51) | i7;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            int length = iVarArr.length;
            throw null;
        }
        if (i5 >= iVarArr.length) {
            throw new NoSuchElementException();
        }
        int i10 = ((i6 | 111) << 1) - (i6 ^ 111);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        int i13 = i5 & 1;
        int i14 = -(-(i5 | 1));
        this.c = ((i13 | i14) << 1) - (i13 ^ i14);
        i iVar = iVarArr[i5];
        int i15 = ((i11 ^ 35) - (~(-(-((i11 & 35) << 1))))) - 1;
        a = i15 % 128;
        if (i15 % 2 == 0) {
            return iVar;
        }
        obj.hashCode();
        throw null;
    }
}
