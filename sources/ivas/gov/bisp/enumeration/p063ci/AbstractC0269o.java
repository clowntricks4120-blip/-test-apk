package ivas.gov.bisp.enumeration.p063ci;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0269o extends O {
    private static int a = 1;
    private static int b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7 = (r1 ^ 77) + ((r1 & 77) << 1);
        ivas.gov.bisp.enumeration.p063ci.AbstractC0269o.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if ((!r7) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r7 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2 = r2 + 105;
        ivas.gov.bisp.enumeration.p063ci.AbstractC0269o.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return false;
     */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(ivas.gov.bisp.enumeration.p063ci.O r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p063ci.AbstractC0269o.b
            r2 = r1 ^ 11
            r3 = r1 & 11
            r2 = r2 | r3
            r4 = 1
            int r2 = r2 << r4
            int r3 = ~r3
            r5 = r1 | 11
            r3 = r3 & r5
            int r3 = -r3
            r5 = r2 ^ r3
            r2 = r2 & r3
            int r2 = r2 << r4
            int r5 = r5 + r2
            int r2 = r5 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0269o.a = r2
            int r5 = r5 % r0
            r3 = 0
            boolean r7 = r7 instanceof ivas.gov.bisp.enumeration.p063ci.AbstractC0269o
            if (r5 != 0) goto L26
            r5 = 7
            int r5 = r5 / r3
            r7 = r7 ^ r4
            if (r7 == r4) goto L28
            goto L30
        L26:
            if (r7 != 0) goto L30
        L28:
            int r2 = r2 + 105
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0269o.b = r7
            int r2 = r2 % r0
            return r3
        L30:
            r7 = r1 ^ 77
            r1 = r1 & 77
            int r1 = r1 << r4
            int r7 = r7 + r1
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.p063ci.AbstractC0269o.a = r1
            int r7 = r7 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.AbstractC0269o.h(ivas.gov.bisp.enumeration.ci.O):boolean");
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 30) + ((i2 & 30) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return -1;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-100)) | ((~i2) & 99);
        int i4 = -(-((i2 & 99) << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (((i2 | 80) << 1) - (i2 ^ 80)) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return "NULL";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
