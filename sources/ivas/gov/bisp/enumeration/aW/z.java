package ivas.gov.bisp.enumeration.aW;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.n;

/* JADX INFO: loaded from: classes.dex */
public final class z extends n {
    private static int A = 1;
    private static int z;
    public final Class<?> B;
    public final int C;

    public z(Context context, Class<?> cls, int i) {
        super(context);
        this.B = cls;
        this.C = i;
    }

    @Override // androidx.appcompat.view.menu.n, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Class<?> cls = this.B;
        int i5 = z;
        int i6 = (i5 ^ 115) + ((i5 & 115) << 1);
        A = i6 % 128;
        int i7 = i6 % 2;
        sb.append(cls.getSimpleName());
        sb.append(" does not support submenus");
        throw new UnsupportedOperationException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if ((r8 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r7 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        r6 = r5.B.getSimpleName();
        r7 = new java.lang.StringBuilder();
        r8 = ivas.gov.bisp.enumeration.aW.z.A;
        r9 = ((r8 | 117) << 1) - (r8 ^ 117);
        ivas.gov.bisp.enumeration.aW.z.z = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if ((r9 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        r7.append("Maximum number of items supported by ");
        r7.append(r6);
        r8 = ivas.gov.bisp.enumeration.aW.z.z;
        r9 = (r8 & (-106)) | ((~r8) & 105);
        r8 = -(-((r8 & 105) << 1));
        r2 = (r9 ^ r8) + ((r8 & r9) << 1);
        ivas.gov.bisp.enumeration.aW.z.A = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        r7.append(" is ");
        r8 = r5.C;
        r9 = 60 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        r7.append(" is ");
        r8 = r5.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        r9 = ivas.gov.bisp.enumeration.aW.z.z;
        r2 = (r9 ^ 88) + ((r9 & 88) << 1);
        r9 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.aW.z.A = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if ((r9 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        r7.append(r8);
        r7.append(". Limit can be checked with ");
        r3 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        r7.append(r8);
        r7.append(". Limit can be checked with ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        r7.append(r6);
        r7.append("#getMaxItemCount()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        throw new java.lang.IllegalArgumentException(r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e4, code lost:
    
        r7.append("Maximum number of items supported by ");
        r7.append(r6);
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if ((size() % 1) <= r5.C) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (((r2 ^ 1) + ((r2 & 1) << 1)) <= r5.C) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        A();
        r6 = super.d(r6, r7, r8, r9);
        r7 = ivas.gov.bisp.enumeration.aW.z.A;
        r8 = r7 & 73;
        r7 = ((r7 | 73) & (~r8)) + (r8 << 1);
        ivas.gov.bisp.enumeration.aW.z.z = r7 % 128;
        r7 = r7 % 2;
        ((androidx.appcompat.view.menu.u) r6).m(true);
        v();
        r7 = ivas.gov.bisp.enumeration.aW.z.A;
        r8 = ((r7 | 53) << 1) - (r7 ^ 53);
        ivas.gov.bisp.enumeration.aW.z.z = r8 % 128;
     */
    @Override // androidx.appcompat.view.menu.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.MenuItem d(int r6, int r7, int r8, java.lang.CharSequence r9) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aW.z.d(int, int, int, java.lang.CharSequence):android.view.MenuItem");
    }
}
