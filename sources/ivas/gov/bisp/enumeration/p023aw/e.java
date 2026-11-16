package ivas.gov.bisp.enumeration.p023aw;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static int a = 0;
    private static int b = 1;
    public int c;
    public int d;
    public final Object e;
    public final Object f;

    public /* synthetic */ e(int i, List list, int i2, InputStream inputStream) {
        this.c = i;
        this.e = list;
        this.d = i2;
        this.f = inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r2 = ((r1 & (-34)) | ((~r1) & 33)) + ((r1 & 33) << 1);
        ivas.gov.bisp.enumeration.p023aw.e.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r1 = 31 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r1 = (-2) - ((r1 + 76) ^ (-1));
        ivas.gov.bisp.enumeration.p023aw.e.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.InputStream c() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p023aw.e.b
            r2 = r1 & 117(0x75, float:1.64E-43)
            r3 = r1 ^ 117(0x75, float:1.64E-43)
            r3 = r3 | r2
            int r3 = -r3
            int r3 = -r3
            r4 = r2 | r3
            int r4 = r4 << 1
            r2 = r2 ^ r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p023aw.e.a = r2
            int r4 = r4 % r0
            java.lang.Object r2 = r5.f
            java.io.InputStream r2 = (java.io.InputStream) r2
            if (r4 == 0) goto L24
            r3 = 89
            int r3 = r3 / 0
            if (r2 == 0) goto L32
            goto L26
        L24:
            if (r2 == 0) goto L32
        L26:
            int r1 = r1 + 76
            r1 = r1 ^ (-1)
            int r1 = (-2) - r1
            int r3 = r1 % 128
            ivas.gov.bisp.enumeration.p023aw.e.a = r3
            int r1 = r1 % r0
            return r2
        L32:
            r2 = r1 & (-34)
            int r3 = ~r1
            r3 = r3 & 33
            r2 = r2 | r3
            r1 = r1 & 33
            int r1 = r1 << 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p023aw.e.a = r1
            int r2 = r2 % r0
            r0 = 0
            if (r2 == 0) goto L49
            r1 = 31
            int r1 = r1 / 0
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p023aw.e.c():java.io.InputStream");
    }

    public List d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 9) | (i2 & 9)) << 1) - (((~i2) & 9) | (i2 & (-10)));
        a = i3 % 128;
        int i4 = i3 % 2;
        List listUnmodifiableList = Collections.unmodifiableList((List) this.e);
        int i5 = b + 103;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return listUnmodifiableList;
    }
}
