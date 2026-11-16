package ivas.gov.bisp.enumeration.aM;

/* JADX INFO: loaded from: classes.dex */
public class N implements J.InterfaceC0070bHc {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
    public void a(J j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-38)) | ((~i2) & 37)) + ((i2 & 37) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
    public void c(J j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 103;
        int i4 = ((i2 & 103) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
    public void d(J j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 23;
        int i4 = (i3 << 1) - ((~(i2 & 23)) & i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aM.J.InterfaceC0070bHc
    public void e(J j) {
        int i = 2 % 2;
        int i2 = b + 79;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
