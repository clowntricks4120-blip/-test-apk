package ivas.gov.bisp.enumeration.p077cw;

import ivas.gov.bisp.enumeration.p056cb.j;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class T {
    private static int a = 0;
    private static int b = 1;
    public static final T c;
    public static final T d;
    public static final T e;
    public static final T f;
    public static final Map<Object, T> g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final C0278x l;

    public static final class bCg extends HashMap<Object, T> {
        public bCg() {
            T t = T.d;
            put(Integer.valueOf(t.h), t);
            T t2 = T.e;
            put(Integer.valueOf(t2.h), t2);
            T t3 = T.f;
            put(Integer.valueOf(t3.h), t3);
            T t4 = T.c;
            put(Integer.valueOf(t4.h), t4);
        }
    }

    static {
        C0278x c0278x = j.a;
        d = new T(1, 32, 1, 265, 7, 8516, c0278x);
        e = new T(2, 32, 2, 133, 6, 4292, c0278x);
        f = new T(3, 32, 4, 67, 4, 2180, c0278x);
        c = new T(4, 32, 8, 34, 0, 1124, c0278x);
        g = new bCg();
        int i = a + 97;
        b = i % 128;
        int i2 = i % 2;
    }

    public T(int i, int i2, int i3, int i4, int i5, int i6, C0278x c0278x) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = c0278x;
    }

    public static T c(int i) {
        int i2 = 2 % 2;
        int i3 = a + 63;
        b = i3 % 128;
        int i4 = i3 % 2;
        T t = (T) ((HashMap) g).get(Integer.valueOf(i));
        int i5 = b;
        int i6 = i5 & 31;
        int i7 = -(-(i5 | 31));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return t;
    }
}
