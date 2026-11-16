package ivas.gov.bisp.enumeration.bN;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z implements Iterator<Integer> {
    private static int a = 0;
    private static int b = 1;

    public abstract int c();

    @Override // java.util.Iterator
    public /* synthetic */ Integer next() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = (i2 | 123) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        Integer numValueOf = Integer.valueOf(c());
        int i8 = a;
        int i9 = (i8 ^ 105) + ((i8 & 105) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return numValueOf;
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
