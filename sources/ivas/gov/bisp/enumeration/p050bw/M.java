package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.ad;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class M implements E {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Class c;
    public final /* synthetic */ Class d;
    public final /* synthetic */ ad e;

    public M(Class cls, Class cls2, ad adVar) {
        this.c = cls;
        this.d = cls2;
        this.e = adVar;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 72) + (i2 | 72)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        StringBuilder sbW = j.w("Factory[type=");
        if (i4 != 0) {
            sbW.append(this.d.getName());
            int i5 = 27 / 0;
        } else {
            sbW.append(this.d.getName());
        }
        sbW.append("+");
        Class cls = this.c;
        int i6 = a;
        int i7 = (i6 & 91) + (i6 | 91);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            sbW.append(cls.getName());
            sbW.append(",adapter=");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sbW.append(cls.getName());
        sbW.append(",adapter=");
        sbW.append(this.e);
        sbW.append("]");
        int i8 = a;
        int i9 = i8 & 91;
        int i10 = -(-((i8 ^ 91) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        String string = sbW.toString();
        int i13 = b;
        int i14 = i13 | 1;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 1)) & i14);
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        int i18 = i17 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    @Override // ivas.gov.bisp.enumeration.p035bh.E
    public <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
        o000O000<T> o000o000;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 53) | (i2 & 53)) << 1;
        int i4 = -(((~i2) & 53) | (i2 & (-54)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Class<? super T> cls = typeToken.a;
        Object obj = null;
        if (cls != this.c) {
            int i7 = b + 67;
            int i8 = i7 % 128;
            a = i8;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (cls != this.d) {
                int i9 = ((i8 ^ 93) | (i8 & 93)) << 1;
                int i10 = -((i8 & (-94)) | ((~i8) & 93));
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                o000o000 = null;
            } else {
                o000o000 = this.e;
                int i13 = b;
                int i14 = (i13 & 25) + (i13 | 25);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        } else {
            o000o000 = this.e;
            int i16 = b;
            int i17 = (i16 & 25) + (i16 | 25);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = b;
        int i20 = (i19 & (-2)) | ((~i19) & 1);
        int i21 = (i19 & 1) << 1;
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        if (i22 % 2 == 0) {
            return o000o000;
        }
        throw null;
    }
}
