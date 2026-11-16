package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.A;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.aS.C0078l;
import ivas.gov.bisp.enumeration.aS.R;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ivas.gov.bisp.enumeration.aS.z {
    private static int a = 0;
    private static int b = 1;
    public static final byte[] c = new byte[0];
    public final A d;
    public final ivas.gov.bisp.enumeration.aS.z e;

    static {
        int i = (-1) - (~119);
        b = i % 128;
        int i2 = i % 2;
    }

    public l(A a2, ivas.gov.bisp.enumeration.aS.z zVar) {
        this.d = a2;
        this.e = zVar;
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        aa aaVarD;
        A a2 = this.d;
        Logger logger = R.c;
        synchronized (R.class) {
            C0078l c0078lC = R.d(a2.A()).c();
            if (!((Boolean) ((ConcurrentHashMap) R.f).get(a2.A())).booleanValue()) {
                StringBuilder sb = new StringBuilder();
                sb.append("newKey-operation not permitted for key type ");
                sb.append(a2.A());
                throw new GeneralSecurityException(sb.toString());
            }
            aaVarD = c0078lC.d(a2.F());
        }
        byte[] bArrE = aaVarD.e();
        byte[] bArrB = this.e.b(bArrE, c);
        String strA = this.d.A();
        AbstractC0069z abstractC0069z = AbstractC0069z.c;
        byte[] bArrB2 = ((ivas.gov.bisp.enumeration.aS.z) R.f(strA, AbstractC0069z.e(bArrE, 0, bArrE.length), ivas.gov.bisp.enumeration.aS.z.class)).b(bArr, bArr2);
        int length = bArrB.length;
        int i = length & 4;
        return ByteBuffer.allocate((((((length ^ 4) | i) << 1) - (~(-((length | 4) & (~i))))) - 1) + bArrB2.length).putInt(bArrB.length).put(bArrB).put(bArrB2).array();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r3 <= (r4 + ((r8 ^ (-4)) | r4))) goto L12;
     */
    @Override // ivas.gov.bisp.enumeration.aS.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] e(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aT.l.e(byte[], byte[]):byte[]");
    }
}
