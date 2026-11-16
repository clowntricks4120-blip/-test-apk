package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.OutputStream;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0259b extends a {
    private static int a = 0;
    private static int b = 1;

    public C0259b(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // ivas.gov.bisp.enumeration.p086i.a
    public void A(O o2, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (i2 | 51) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        o2.n().i(this, z);
        if (i7 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p086i.a
    public a i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 70) + ((i2 & 70) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 103;
        int i6 = -(-((i2 ^ 103) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p086i.a
    public C0259b o() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 53;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = (((i2 | 62) << 1) - (i2 ^ 62)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }
}
