package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.ad;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class x implements E {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Class c;
    public final /* synthetic */ ad d;

    public x(Class cls, ad adVar) {
        this.c = cls;
        this.d = adVar;
    }

    @Override // ivas.gov.bisp.enumeration.p035bh.E
    public <T> o000O000<T> b(C c, TypeToken<T> typeToken) {
        ad adVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 34) << 1) - (i2 ^ 34);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (typeToken.a == this.c) {
            int i6 = a;
            int i7 = i6 + 57;
            b = i7 % 128;
            int i8 = i7 % 2;
            adVar = this.d;
            int i9 = i6 + 29;
            b = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = b;
            int i12 = (i11 & (-30)) | ((~i11) & 29);
            int i13 = (i11 & 29) << 1;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            adVar = null;
        }
        int i16 = b;
        int i17 = ((i16 | 57) << 1) - (i16 ^ 57);
        a = i17 % 128;
        int i18 = i17 % 2;
        return adVar;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 113) + (i2 | 113);
        b = i3 % 128;
        int i4 = i3 % 2;
        StringBuilder sbW = j.w("Factory[type=");
        sbW.append(this.c.getName());
        int i5 = a + 71;
        b = i5 % 128;
        int i6 = i5 % 2;
        sbW.append(",adapter=");
        sbW.append(this.d);
        int i7 = b + 9;
        a = i7 % 128;
        int i8 = i7 % 2;
        sbW.append("]");
        String string = sbW.toString();
        int i9 = b;
        int i10 = ((i9 | 29) << 1) - (i9 ^ 29);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
