package ivas.gov.bisp.enumeration.bN;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class n implements ListIterator {
    private static int a = 0;
    private static int b = 1;
    public static final n c = new n();

    static {
        int i = a;
        int i2 = (((i ^ 79) | (i & 79)) << 1) - (((~i) & 79) | (i & (-80)));
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = (i2 & 75) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        return i5 % 2 == 0;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = 2 % 2;
        int i2 = a + 111;
        b = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = 2 % 2;
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2 != 0 ? 1 : 0;
        int i6 = (i4 ^ 49) + ((i4 & 49) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = 2 % 2;
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 1;
        int i6 = (i2 ^ 1) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
