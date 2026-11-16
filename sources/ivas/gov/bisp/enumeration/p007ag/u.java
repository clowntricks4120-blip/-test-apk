package ivas.gov.bisp.enumeration.p007ag;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import ivas.gov.bisp.enumeration.p002ab.M;
import ivas.gov.bisp.enumeration.p009ai.N;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class u {
    private static int a = 0;
    private static int b = 1;

    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, M.aUO> c = new ConcurrentHashMap<>();

    public Typeface c(Context context, M.aUO auo, Resources resources, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 27;
        int i5 = ((((i3 ^ 27) | i4) << 1) - (~(-((i3 | 27) & (~i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        throw null;
    }

    public Typeface d(Context context, CancellationSignal cancellationSignal, N[] nArr, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 43;
        int i5 = -(-(i3 | 43));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i7 = 50 / 0;
        throw null;
    }

    public Typeface e(Context context, InputStream inputStream) {
        int i = 2 % 2;
        int i2 = a + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        File fileD = l.d(context);
        Object obj = null;
        if (fileD == null) {
            int i4 = b + 35;
            int i5 = i4 % 128;
            a = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i6 = (i5 & 95) + (i5 | 95);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 31 / 0;
            }
            return null;
        }
        try {
            if (l.c(fileD, inputStream)) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(fileD.getPath());
                fileD.delete();
                int i8 = b;
                int i9 = (i8 & 52) + (i8 | 52);
                int i10 = (i9 ^ (-1)) + (i9 << 1);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    return typefaceCreateFromFile;
                }
                obj.hashCode();
                throw null;
            }
            int i11 = b;
            int i12 = i11 ^ 39;
            int i13 = ((i11 & 39) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            int i16 = i15 % 2;
            fileD.delete();
            int i17 = b;
            int i18 = i17 & 31;
            int i19 = (i17 ^ 31) | i18;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
            return null;
        } catch (RuntimeException unused) {
            fileD.delete();
            return null;
        } catch (Throwable th) {
            fileD.delete();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0158  */
    public N g(N[] nArr, int i) {
        int i2;
        boolean z;
        N n;
        int iAbs;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 ^ 35) + ((i5 & 35) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0 ? (i & 1) != 0 : i != 0) {
            int i7 = i5 & 19;
            int i8 = ((i5 ^ 19) | i7) << 1;
            int i9 = -((i5 | 19) & (~i7));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            i2 = 700;
        } else {
            int i12 = i5 & 43;
            int i13 = (i12 - (~(-(-((i5 ^ 43) | i12))))) - 1;
            int i14 = i13 % 128;
            b = i14;
            int i15 = i13 % 2;
            int i16 = i14 + 81;
            a = i16 % 128;
            int i17 = i16 % 2;
            i2 = 400;
        }
        if ((i & 2) != 0) {
            int i18 = a;
            int i19 = (((i18 ^ 39) | (i18 & 39)) << 1) - ((i18 & (-40)) | ((~i18) & 39));
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i18 & 67;
            int i22 = (i18 | 67) & (~i21);
            int i23 = -(-(i21 << 1));
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            b = i24 % 128;
            int i25 = i24 % 2;
            z = true;
        } else {
            int i26 = a + 49;
            b = i26 % 128;
            int i27 = i26 % 2;
            z = false;
        }
        int length = nArr.length;
        int i28 = a;
        int i29 = (i28 | 121) << 1;
        int i30 = -(((~i28) & 121) | (i28 & (-122)));
        int i31 = (i29 & i30) + (i30 | i29);
        b = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 4 / 3;
        }
        int i33 = Integer.MAX_VALUE;
        int i34 = 0;
        N n2 = null;
        while (i34 < length) {
            int i35 = b;
            int i36 = i35 & 61;
            int i37 = ((i35 ^ 61) | i36) << 1;
            int i38 = -((i35 | 61) & (~i36));
            int i39 = (i37 & i38) + (i38 | i37);
            a = i39 % 128;
            if (i39 % 2 != 0) {
                n = nArr[i34];
                iAbs = Math.abs(n.c >>> i2);
            } else {
                n = nArr[i34];
                int i40 = n.c;
                int i41 = -i2;
                int i42 = ((i40 ^ i41) | (i40 & i41)) << 1;
                int i43 = -(((~i40) & i41) | ((~i41) & i40));
                iAbs = Math.abs((i42 ^ i43) + ((i43 & i42) << 1));
            }
            int i44 = b;
            int i45 = i44 & 11;
            int i46 = (i45 - (~(-(-((i44 ^ 11) | i45))))) - 1;
            a = i46 % 128;
            int i47 = i46 % 2;
            if (n.d == z) {
                int i48 = b;
                int i49 = i48 | 73;
                int i50 = i49 << 1;
                int i51 = -((~(i48 & 73)) & i49);
                int i52 = (i50 & i51) + (i51 | i50);
                a = i52 % 128;
                int i53 = i52 % 2;
                int i54 = ((i48 | 62) << 1) - (i48 ^ 62);
                int i55 = (i54 ^ (-1)) + (i54 << 1);
                a = i55 % 128;
                int i56 = i55 % 2;
                i3 = 0;
            } else {
                int i57 = a;
                int i58 = (i57 & (-92)) | ((~i57) & 91);
                int i59 = (i57 & 91) << 1;
                int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
                b = i60 % 128;
                int i61 = i60 % 2;
                i3 = 1;
            }
            int i62 = iAbs * 2;
            int i63 = i62 & i3;
            int i64 = (i3 ^ i62) | i63;
            int i65 = (i63 & i64) + (i64 | i63);
            if (n2 != null) {
                int i66 = b;
                int i67 = i66 & 11;
                int i68 = ((i66 | 11) & (~i67)) + (i67 << 1);
                a = i68 % 128;
                if (i68 % 2 != 0) {
                    int i69 = 18 / 0;
                    if (i33 > i65) {
                        int i70 = b;
                        int i71 = i70 & 125;
                        int i72 = (i70 | 125) & (~i71);
                        int i73 = -(-(i71 << 1));
                        int i74 = (i72 & i73) + (i72 | i73);
                        a = i74 % 128;
                        int i75 = i74 % 2;
                        n2 = n;
                        i33 = i65;
                    }
                } else if (i33 > i65) {
                    int i76 = b;
                    int i77 = i76 & 125;
                    int i78 = (i76 | 125) & (~i77);
                    int i79 = -(-(i77 << 1));
                    int i710 = (i78 & i79) + (i78 | i79);
                    a = i710 % 128;
                    int i711 = i710 % 2;
                    n2 = n;
                    i33 = i65;
                }
            } else {
                int i712 = b;
                int i713 = i712 & 125;
                int i714 = (i712 | 125) & (~i713);
                int i715 = -(-(i713 << 1));
                int i716 = (i714 & i715) + (i714 | i715);
                a = i716 % 128;
                int i717 = i716 % 2;
                n2 = n;
                i33 = i65;
            }
            int i80 = i34 ^ 1;
            int i81 = -(-((i34 & 1) << 1));
            i34 = ((i80 | i81) << 1) - (i80 ^ i81);
            int i82 = b;
            int i83 = i82 & 57;
            int i84 = (i82 | 57) & (~i83);
            int i85 = i83 << 1;
            int i86 = (i84 & i85) + (i84 | i85);
            a = i86 % 128;
            int i87 = i86 % 2;
        }
        int i88 = a;
        int i89 = i88 | 71;
        int i90 = i89 << 1;
        int i91 = -((~(i88 & 71)) & i89);
        int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
        b = i92 % 128;
        if (i92 % 2 != 0) {
            return n2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (ivas.gov.bisp.enumeration.p007ag.l.b(r3, r4, r5) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r4 = ivas.gov.bisp.enumeration.p007ag.u.a;
        r5 = r4 & 47;
        r4 = (r4 | 47) & (~r5);
        r5 = -(-(r5 << 1));
        r7 = (r4 ^ r5) + ((r4 & r5) << 1);
        ivas.gov.bisp.enumeration.p007ag.u.b = r7 % 128;
        r7 = r7 % 2;
        r3.delete();
        r3 = ivas.gov.bisp.enumeration.p007ag.u.b;
        r4 = r3 & 61;
        r3 = (r3 | 61) & (~r4);
        r4 = -(-(r4 << 1));
        r5 = (r3 ^ r4) + ((r3 & r4) << 1);
        ivas.gov.bisp.enumeration.p007ag.u.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if ((r5 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r1 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r4 = android.graphics.Typeface.createFromFile(r3.getPath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r3.delete();
        r3 = ivas.gov.bisp.enumeration.p007ag.u.b;
        r5 = r3 & 5;
        r3 = (r3 | 5) & (~r5);
        r5 = -(-(r5 << 1));
        r7 = ((r3 | r5) << 1) - (r3 ^ r5);
        r3 = r7 % 128;
        ivas.gov.bisp.enumeration.p007ag.u.a = r3;
        r7 = r7 % 2;
        r5 = (r3 & 43) + (r3 | 43);
        ivas.gov.bisp.enumeration.p007ag.u.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        r3.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        r3.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p007ag.u.b;
        r4 = r3 & 65;
        r3 = ((r3 | 65) & (~r4)) + (r4 << 1);
        ivas.gov.bisp.enumeration.p007ag.u.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if ((r3 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface f(android.content.Context r3, android.content.res.Resources r4, int r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r6 = 2
            int r7 = r6 % r6
            int r7 = ivas.gov.bisp.enumeration.p007ag.u.b
            int r7 = r7 + 4
            r7 = r7 ^ (-1)
            int r7 = (-2) - r7
            int r0 = r7 % 128
            ivas.gov.bisp.enumeration.p007ag.u.a = r0
            int r7 = r7 % r6
            r0 = 0
            java.io.File r3 = ivas.gov.bisp.enumeration.p007ag.l.d(r3)
            if (r7 == 0) goto L1d
            r7 = 6
            int r7 = r7 / 0
            if (r3 != 0) goto L33
            goto L1f
        L1d:
            if (r3 != 0) goto L33
        L1f:
            int r3 = ivas.gov.bisp.enumeration.p007ag.u.b
            r4 = r3 & 65
            int r5 = ~r4
            r3 = r3 | 65
            r3 = r3 & r5
            int r4 = r4 << 1
            int r3 = r3 + r4
            int r4 = r3 % 128
            ivas.gov.bisp.enumeration.p007ag.u.a = r4
            int r3 = r3 % r6
            if (r3 != 0) goto L32
            return r0
        L32:
            throw r0
        L33:
            boolean r4 = ivas.gov.bisp.enumeration.p007ag.l.b(r3, r4, r5)     // Catch: java.lang.Throwable -> L9d java.lang.RuntimeException -> La2
            if (r4 != 0) goto L70
            int r4 = ivas.gov.bisp.enumeration.p007ag.u.a
            r5 = r4 & 47
            int r7 = ~r5
            r1 = 47
            r4 = r4 | r1
            r4 = r4 & r7
            int r5 = r5 << 1
            int r5 = -r5
            int r5 = -r5
            r7 = r4 ^ r5
            r4 = r4 & r5
            int r4 = r4 << 1
            int r7 = r7 + r4
            int r4 = r7 % 128
            ivas.gov.bisp.enumeration.p007ag.u.b = r4
            int r7 = r7 % r6
            r3.delete()
            int r3 = ivas.gov.bisp.enumeration.p007ag.u.b
            r4 = r3 & 61
            int r5 = ~r4
            r3 = r3 | 61
            r3 = r3 & r5
            int r4 = r4 << 1
            int r4 = -r4
            int r4 = -r4
            r5 = r3 ^ r4
            r3 = r3 & r4
            int r3 = r3 << 1
            int r5 = r5 + r3
            int r3 = r5 % 128
            ivas.gov.bisp.enumeration.p007ag.u.a = r3
            int r5 = r5 % r6
            if (r5 == 0) goto L6f
            int r1 = r1 / 0
        L6f:
            return r0
        L70:
            java.lang.String r4 = r3.getPath()     // Catch: java.lang.Throwable -> L9d java.lang.RuntimeException -> La2
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r4)     // Catch: java.lang.Throwable -> L9d java.lang.RuntimeException -> La2
            r3.delete()
            int r3 = ivas.gov.bisp.enumeration.p007ag.u.b
            r5 = r3 & 5
            int r7 = ~r5
            r3 = r3 | 5
            r3 = r3 & r7
            int r5 = r5 << 1
            int r5 = -r5
            int r5 = -r5
            r7 = r3 | r5
            int r7 = r7 << 1
            r3 = r3 ^ r5
            int r7 = r7 - r3
            int r3 = r7 % 128
            ivas.gov.bisp.enumeration.p007ag.u.a = r3
            int r7 = r7 % r6
            r5 = r3 & 43
            r3 = r3 | 43
            int r5 = r5 + r3
            int r3 = r5 % 128
            ivas.gov.bisp.enumeration.p007ag.u.b = r3
            int r5 = r5 % r6
            return r4
        L9d:
            r4 = move-exception
            r3.delete()
            throw r4
        La2:
            r3.delete()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p007ag.u.f(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }
}
