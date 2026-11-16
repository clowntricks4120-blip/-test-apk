package ivas.gov.bisp.enumeration.aD;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class ao extends AbstractList<String> implements InterfaceC0062s, RandomAccess {
    private static int a = 0;
    private static int b = 1;
    public final InterfaceC0062s c;

    public class bkj implements ListIterator<String> {
        private static int a = 0;
        private static int b = 1;
        public ListIterator<String> c;

        public bkj(ao aoVar, int i) {
            this.c = aoVar.c.listIterator(i);
        }

        @Override // java.util.ListIterator
        public void add(String str) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            int i = 2 % 2;
            int i2 = a + 117;
            b = i2 % 128;
            int i3 = i2 % 2;
            boolean zHasNext = this.c.hasNext();
            int i4 = b;
            int i5 = (i4 & 79) + (i4 | 79);
            a = i5 % 128;
            int i6 = i5 % 2;
            return zHasNext;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            boolean zHasPrevious;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                zHasPrevious = this.c.hasPrevious();
                int i4 = 55 / 0;
            } else {
                zHasPrevious = this.c.hasPrevious();
            }
            int i5 = a + 22;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 87 / 0;
            }
            return zHasPrevious;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 56) << 1) - (i2 ^ 56);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            String next = this.c.next();
            int i6 = a;
            int i7 = i6 & 47;
            int i8 = (i6 ^ 47) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return next;
            }
            throw null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 39) + (i2 | 39);
            a = i3 % 128;
            int i4 = i3 % 2;
            int iNextIndex = this.c.nextIndex();
            int i5 = b;
            int i6 = (i5 | 105) << 1;
            int i7 = -(i5 ^ 105);
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return iNextIndex;
        }

        @Override // java.util.ListIterator
        public String previous() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 125;
            int i4 = (((i2 & 125) | i3) << 1) - i3;
            a = i4 % 128;
            int i5 = i4 % 2;
            String strPrevious = this.c.previous();
            if (i5 == 0) {
                return strPrevious;
            }
            int i6 = 45 / 0;
            return strPrevious;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 17) + (i2 | 17);
            b = i3 % 128;
            int i4 = i3 % 2;
            int iPreviousIndex = this.c.previousIndex();
            int i5 = a + 73;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return iPreviousIndex;
            }
            throw null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(String str) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }
    }

    public class bkk implements Iterator<String> {
        private static int a = 1;
        private static int b;
        public Iterator<String> c;

        public bkk(ao aoVar) {
            this.c = aoVar.c.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 7;
            int i4 = (i2 | 7) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return this.c.hasNext();
            }
            this.c.hasNext();
            throw null;
        }

        @Override // java.util.Iterator
        public String next() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-98)) | ((~i2) & 97)) + ((i2 & 97) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            String next = this.c.next();
            int i5 = b;
            int i6 = i5 & 109;
            int i7 = (i5 | 109) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }
    }

    public ao(InterfaceC0062s interfaceC0062s) {
        this.c = interfaceC0062s;
    }

    @Override // ivas.gov.bisp.enumeration.aD.InterfaceC0062s
    public InterfaceC0062s b() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = (i2 ^ 35) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 17;
        int i9 = (((i6 ^ 17) | i8) << 1) - ((i6 | 17) & (~i8));
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.InterfaceC0062s
    public Object d(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 1;
        int i5 = (i3 ^ 1) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return this.c.d(i);
        }
        int i7 = 14 / 0;
        return this.c.d(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 35;
        int i5 = ((i3 | 35) & (~i4)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj = this.c.get(i);
        if (i6 == 0) {
            return (String) obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.InterfaceC0062s
    public void h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        int i = 2 % 2;
        bkk bkkVar = new bkk(this);
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (i2 ^ 67) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        return bkkVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        int i2 = 2 % 2;
        bkj bkjVar = new bkj(this, i);
        int i3 = a + 17;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return bkjVar;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.InterfaceC0062s
    public List<?> n() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 99;
        int i4 = ((i2 & 99) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        List<?> listN = this.c.n();
        int i8 = b;
        int i9 = i8 & 77;
        int i10 = (((i8 | 77) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        return listN;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 11;
        int i4 = (i2 & 11) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.c.size();
            throw null;
        }
        int size = this.c.size();
        int i6 = b;
        int i7 = ((i6 & 110) + (i6 | 110)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return size;
    }
}
