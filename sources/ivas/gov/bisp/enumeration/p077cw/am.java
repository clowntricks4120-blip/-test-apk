package ivas.gov.bisp.enumeration.p077cw;

import ivas.gov.bisp.enumeration.p056cb.j;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class am {
    private static int a = 0;
    private static int b = 1;
    public static final am c;
    public static final am d;
    public static final am e;
    public static final am f;
    public static final am g;
    public static Map<Object, am> h;
    public final int i;
    public final int j;
    public final int k;
    public final C0278x l;

    public static final class bBX extends HashMap<Object, am> {
        public bBX() {
            am amVar = am.e;
            put(Integer.valueOf(amVar.i), amVar);
            am amVar2 = am.d;
            put(Integer.valueOf(amVar2.i), amVar2);
            am amVar3 = am.f;
            put(Integer.valueOf(amVar3.i), amVar3);
            am amVar4 = am.g;
            put(Integer.valueOf(amVar4.i), amVar4);
            am amVar5 = am.c;
            put(Integer.valueOf(amVar5.i), amVar5);
        }
    }

    static {
        C0278x c0278x = j.a;
        e = new am(5, 32, 5, c0278x);
        d = new am(6, 32, 10, c0278x);
        f = new am(7, 32, 15, c0278x);
        g = new am(8, 32, 20, c0278x);
        c = new am(9, 32, 25, c0278x);
        h = new bBX();
        int i = b;
        int i2 = (i & 57) + (i | 57);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public am(int i, int i2, int i3, C0278x c0278x) {
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = c0278x;
    }

    public static am c(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 21;
        int i5 = ((((i3 ^ 21) | i4) << 1) - (~(-((i3 | 21) & (~i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        am amVar = (am) ((HashMap) h).get(Integer.valueOf(i));
        int i7 = b;
        int i8 = (i7 & (-52)) | ((~i7) & 51);
        int i9 = -(-((i7 & 51) << 1));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        return amVar;
    }
}
