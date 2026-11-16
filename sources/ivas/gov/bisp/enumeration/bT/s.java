package ivas.gov.bisp.enumeration.bT;

import ivas.gov.bisp.enumeration.o000oo0o.o0OoOoOo;
import ivas.gov.bisp.enumeration.o000ooO.o00000;
import ivas.gov.bisp.enumeration.o000ooO.o0O0O00;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s<T, R> implements o0O0O00<R> {
    private static int a = 1;
    private static int b;
    public final o0O0O00<T> c;
    public final o0OoOoOo<T, R> d;

    /* JADX WARN: Multi-variable type inference failed */
    public s(o0O0O00<? extends T> o0o0o00, o0OoOoOo<? super T, ? extends R> o0oooooo) {
        this.c = o0o0o00;
        this.d = o0oooooo;
    }

    public final Iterator<R> iterator() {
        int i = 2 % 2;
        byx byxVar = new byx(this);
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = -(-((i2 ^ 123) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return byxVar;
    }

    public static final class byx implements Iterator<R> {
        private static int a = 1;
        private static int b;
        public final Iterator<T> c;
        public final /* synthetic */ o00000<T, R> d;

        public byx(o00000<T, R> o00000Var) {
            this.d = o00000Var;
            this.c = o00000Var.c.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-80)) | ((~i2) & 79);
            int i4 = -(-((i2 & 79) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            boolean zHasNext = this.c.hasNext();
            int i7 = b;
            int i8 = i7 & 23;
            int i9 = -(-((i7 ^ 23) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            return zHasNext;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public final R next() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 55) << 1;
            int i4 = -(((~i2) & 55) | (i2 & (-56)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                o0OoOoOo<T, R> o0oooooo = this.d.d;
                this.c.next();
                obj.hashCode();
                throw null;
            }
            R r = (R) this.d.d.e(this.c.next());
            int i6 = a + 61;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return r;
            }
            throw null;
        }
    }
}
