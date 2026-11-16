package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.ad;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class N implements E {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Class c;
    public final /* synthetic */ Class d;
    public final /* synthetic */ ad e;

    public N(Class cls, Class cls2, ad adVar) {
        this.c = cls;
        this.d = cls2;
        this.e = adVar;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 53) + (i2 | 53);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            j.w("Factory[type=");
            this.c.getName();
            throw null;
        }
        StringBuilder sbW = j.w("Factory[type=");
        sbW.append(this.c.getName());
        sbW.append("+");
        Class cls = this.d;
        int i4 = b;
        int i5 = (-2) - (((i4 ^ 32) + ((i4 & 32) << 1)) ^ (-1));
        a = i5 % 128;
        int i6 = i5 % 2;
        sbW.append(cls.getName());
        sbW.append(",adapter=");
        int i7 = a;
        int i8 = (i7 & 41) + (i7 | 41);
        b = i8 % 128;
        int i9 = i8 % 2;
        sbW.append(this.e);
        sbW.append("]");
        int i10 = a;
        int i11 = i10 & 21;
        int i12 = ((((i10 ^ 21) | i11) << 1) - (~(-((i10 | 21) & (~i11))))) - 1;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            sbW.toString();
            throw null;
        }
        String string = sbW.toString();
        int i13 = a + 27;
        b = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    @Override // ivas.gov.bisp.enumeration.p035bh.E
    public <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
        o000O000<T> o000o000;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 117;
        int i4 = i3 + ((i2 ^ 117) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        Class<? super T> cls = typeToken.a;
        if (cls != this.c) {
            int i6 = a;
            int i7 = i6 & 13;
            int i8 = (i6 ^ 13) | i7;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            if (cls != this.d) {
                int i11 = i6 + 33;
                int i12 = i11 % 128;
                b = i12;
                int i13 = i11 % 2;
                int i14 = i12 + 69;
                a = i14 % 128;
                int i15 = i14 % 2;
                o000o000 = null;
            } else {
                o000o000 = this.e;
                int i16 = a;
                int i17 = i16 & 93;
                int i18 = i17 + ((i16 ^ 93) | i17);
                b = i18 % 128;
                int i19 = i18 % 2;
            }
        } else {
            o000o000 = this.e;
            int i110 = a;
            int i111 = i110 & 93;
            int i112 = i111 + ((i110 ^ 93) | i111);
            b = i112 % 128;
            int i113 = i112 % 2;
        }
        int i20 = a + 110;
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return o000o000;
        }
        throw null;
    }
}
