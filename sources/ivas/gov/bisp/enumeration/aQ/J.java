package ivas.gov.bisp.enumeration.aQ;

import android.R;

/* JADX INFO: loaded from: classes.dex */
public class J {
    private static int a = 0;
    private static int b = 1;
    public static final int[] c = {R.attr.theme, ivas.gov.bisp.enumeration.R.attr.theme};
    public static final int[] d;

    static {
        int i = 1 & 43;
        int i2 = (~i) & (1 | 43);
        int i3 = i << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        d = new int[]{ivas.gov.bisp.enumeration.R.attr.materialThemeOverlay};
        int i7 = i5 + 47;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x006a  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0094, code lost:
    
        if (r9 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        if (r9 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r9 = new ivas.gov.bisp.enumeration.p099u.h(r7, r1);
        r1 = ivas.gov.bisp.enumeration.aQ.J.c;
        r3 = ivas.gov.bisp.enumeration.aQ.J.b;
        r4 = r3 & 67;
        r3 = -(-((r3 ^ 67) | r4));
        r5 = ((r4 | r3) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.aQ.J.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b3, code lost:
    
        if ((r5 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
    
        r7 = r7.obtainStyledAttributes(r8, r1);
        r8 = r7.getResourceId(1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bd, code lost:
    
        r1 = r7.getResourceId(1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c2, code lost:
    
        r7 = r7.obtainStyledAttributes(r8, r1);
        r8 = r7.getResourceId(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        r7.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r8 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d0, code lost:
    
        r7 = ivas.gov.bisp.enumeration.aQ.J.b;
        r8 = r7 + 107;
        ivas.gov.bisp.enumeration.aQ.J.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        if ((r8 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        r7 = r7 + 121;
        ivas.gov.bisp.enumeration.aQ.J.a = r7 % 128;
        r7 = r7 % 2;
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        if (r8 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        r7 = ivas.gov.bisp.enumeration.aQ.J.a;
        r1 = r7 & 85;
        r7 = (r7 | 85) & (~r1);
        r1 = r1 << 1;
        r3 = (r7 ^ r1) + ((r7 & r1) << 1);
        ivas.gov.bisp.enumeration.aQ.J.b = r3 % 128;
        r3 = r3 % 2;
        r7 = r9.getTheme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ff, code lost:
    
        if (r3 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0101, code lost:
    
        r7.applyStyle(r8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        r7.applyStyle(r8, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0108, code lost:
    
        r7 = ivas.gov.bisp.enumeration.aQ.J.a;
        r8 = r7 & 71;
        r7 = (((r7 | 71) & (~r8)) - (~(r8 << 1))) - 1;
        ivas.gov.bisp.enumeration.aQ.J.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0119, code lost:
    
        if ((r7 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
    
        r7 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011e, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context b(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aQ.J.b(android.content.Context, android.util.AttributeSet, int, int):android.content.Context");
    }
}
