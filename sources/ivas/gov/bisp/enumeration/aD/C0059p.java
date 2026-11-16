package ivas.gov.bisp.enumeration.aD;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0059p extends AbstractC0069z.biT {
    private static int a = 1;
    private static int b;
    public int c = 0;
    public final int d;
    public final /* synthetic */ AbstractC0069z e;

    public C0059p(AbstractC0069z abstractC0069z) {
        this.e = abstractC0069z;
        this.d = abstractC0069z.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = 2 % 2;
        int i2 = b;
        boolean z = true;
        int i3 = (i2 ^ 37) + ((i2 & 37) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.c < this.d) {
            int i4 = (i2 & 70) + (i2 | 70);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = i2 & 103;
            int i8 = ((~i7) & (i2 | 103)) + (i7 << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        int i10 = (-2) - ((i2 + 58) ^ (-1));
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r1 = r3.h(r2);
        r2 = 83 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r1 = r3.h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r2 = ivas.gov.bisp.enumeration.aD.C0059p.b;
        r3 = r2 & 75;
        r2 = r2 | 75;
        r4 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.aD.C0059p.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        throw new java.util.NoSuchElementException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r2 < r6.d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r2 < r6.d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r3 = r2 & 1;
        r4 = (r2 ^ 1) | r3;
        r6.c = (r3 & r4) + (r3 | r4);
        r3 = r6.e;
        r1 = r1 + 75;
        ivas.gov.bisp.enumeration.aD.C0059p.a = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte c() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.C0059p.b
            r2 = r1 & 67
            int r3 = ~r2
            r4 = r1 | 67
            r3 = r3 & r4
            int r2 = r2 << 1
            int r2 = -r2
            int r2 = -r2
            int r2 = ~r2
            int r3 = r3 - r2
            int r3 = r3 + (-1)
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.aD.C0059p.a = r2
            int r3 = r3 % r0
            if (r3 != 0) goto L24
            int r2 = r6.c
            int r3 = r6.d
            r4 = 3
            int r4 = r4 / 0
            if (r2 >= r3) goto L5f
            goto L2a
        L24:
            int r2 = r6.c
            int r3 = r6.d
            if (r2 >= r3) goto L5f
        L2a:
            r3 = r2 & 1
            r4 = r2 ^ 1
            r4 = r4 | r3
            r5 = r3 & r4
            r3 = r3 | r4
            int r5 = r5 + r3
            r6.c = r5
            ivas.gov.bisp.enumeration.aD.z r3 = r6.e
            int r1 = r1 + 75
            int r4 = r1 % 128
            ivas.gov.bisp.enumeration.aD.C0059p.a = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L49
            byte r1 = r3.h(r2)
            r2 = 83
            int r2 = r2 / 0
            goto L4d
        L49:
            byte r1 = r3.h(r2)
        L4d:
            int r2 = ivas.gov.bisp.enumeration.aD.C0059p.b
            r3 = r2 & 75
            r2 = r2 | 75
            r4 = r3 | r2
            int r4 = r4 << 1
            r2 = r2 ^ r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.aD.C0059p.a = r2
            int r4 = r4 % r0
            return r1
        L5f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0059p.c():byte");
    }
}
