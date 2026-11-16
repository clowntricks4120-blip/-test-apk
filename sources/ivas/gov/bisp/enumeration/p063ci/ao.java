package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class ao extends a {
    private static int a = 0;
    private static int b = 1;

    public ao(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // ivas.gov.bisp.enumeration.p086i.a
    public void A(O o2, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 73;
        int i4 = i3 + ((i2 ^ 73) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        o2.m().i(this, z);
        if (i5 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p086i.a
    public a i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 69;
        int i4 = (((i2 & 69) | i3) << 1) - i3;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = ((i5 ^ 107) - (~(-(-((i5 & 107) << 1))))) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 91 / 0;
        }
        return this;
    }
}
