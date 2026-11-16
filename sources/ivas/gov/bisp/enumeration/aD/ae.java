package ivas.gov.bisp.enumeration.aD;

/* JADX INFO: loaded from: classes.dex */
public final class ae implements ai {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.aD.ai
    public final Object b(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 104) + (i2 | 104)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        Object objC = ((S) obj).C(S.bkM.h, null, null);
        int i5 = b + 10;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return objC;
        }
        throw null;
    }
}
