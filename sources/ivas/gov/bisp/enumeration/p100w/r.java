package ivas.gov.bisp.enumeration.p100w;

import android.R;
import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import ivas.gov.bisp.enumeration.aB.j;
import ivas.gov.bisp.enumeration.bN.C0130y;
import ivas.gov.bisp.enumeration.bN.X;
import ivas.gov.bisp.enumeration.bN.aa;
import ivas.gov.bisp.enumeration.bN.ab;
import ivas.gov.bisp.enumeration.bQ.Q;
import ivas.gov.bisp.enumeration.bS.aU;
import ivas.gov.bisp.enumeration.cA.l;
import ivas.gov.bisp.enumeration.cC.C0238r;
import ivas.gov.bisp.enumeration.cC.N;
import ivas.gov.bisp.enumeration.cC.S;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import ivas.gov.bisp.enumeration.p003ac.e;
import ivas.gov.bisp.enumeration.p027b.ap;
import ivas.gov.bisp.enumeration.p027b.w;
import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p063ci.L;
import ivas.gov.bisp.enumeration.p063ci.ae;
import ivas.gov.bisp.enumeration.p067cm.c;
import ivas.gov.bisp.enumeration.p071cq.p;
import ivas.gov.bisp.enumeration.p076cv.J;
import ivas.gov.bisp.enumeration.p076cv.M;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p076cv.o;
import ivas.gov.bisp.enumeration.p077cw.O;
import ivas.gov.bisp.enumeration.p078cx.z;
import ivas.gov.bisp.enumeration.p081d.v;
import ivas.gov.bisp.enumeration.p085h.an;
import ivas.gov.bisp.enumeration.p086i.a;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.p101x.i;
import ivas.gov.bisp.enumeration.p102y.x;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import org.acra.attachment.AcraContentProvider;

/* JADX INFO: loaded from: classes.dex */
public class r implements v, w, ivas.gov.bisp.enumeration.p101x.r, x {
    private static int a = 1;
    private static int b;
    public static final int[] c;
    public static final int[] d = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};
    public static final int[] e = {R.attr.id, R.attr.drawable};
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f111o;
    public static final int[] p;
    public static final int[] q;
    public static e r;
    public static r s;
    public static byte[] t;

    public /* synthetic */ r() {
    }

    public static String A(byte[] bArr) {
        int length;
        int i2;
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        int i4 = a;
        int i5 = i4 & 43;
        int i6 = i5 + ((i4 ^ 43) | i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            length = bArr.length;
            i2 = 1;
        } else {
            length = bArr.length;
            i2 = 0;
        }
        while (i2 < length) {
            int i7 = a + 101;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = bArr[i2] & 255;
            int i11 = (((i8 & (-54)) | ((~i8) & 53)) - (~(-(-((i8 & 53) << 1))))) - 1;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                sb.append("0123456789abcdef".charAt(i10 * 22));
            } else {
                sb.append("0123456789abcdef".charAt(i10 / 16));
            }
            sb.append("0123456789abcdef".charAt(i10 % 16));
            int i12 = i2 + 55;
            i2 = (i12 | (-54)) + (i12 & (-54));
            int i13 = a;
            int i14 = i13 & 53;
            int i15 = -(-((i13 ^ 53) | i14));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        String string = sb.toString();
        int i18 = b;
        int i19 = i18 & 57;
        int i20 = (((i18 | 57) & (~i19)) - (~(i19 << 1))) - 1;
        a = i20 % 128;
        int i21 = i20 % 2;
        return string;
    }

    public static boolean D(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 101) + (i3 | 101);
        int i5 = i4 % 128;
        a = i5;
        Object obj3 = null;
        if (i4 % 2 == 0) {
            obj3.hashCode();
            throw null;
        }
        if (obj == obj2) {
            int i6 = ((i5 ^ 44) + ((i5 & 44) << 1)) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 10 / 0;
            }
            return true;
        }
        if (obj != null) {
            int i8 = ((i3 | 31) << 1) - (i3 ^ 31);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            if (obj2 != null) {
                int i11 = ((i9 ^ 106) + ((i9 & 106) << 1)) - 1;
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    obj.equals(obj2);
                    throw null;
                }
                boolean zEquals = obj.equals(obj2);
                int i12 = a;
                int i13 = i12 ^ 95;
                int i14 = -(-((i12 & 95) << 1));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    return zEquals;
                }
                throw null;
            }
        }
        int i16 = (i3 & 35) + (i3 | 35);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 75 / 0;
        }
        return false;
    }

    public static boolean E(int[] iArr, int[] iArr2) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 53;
        int i5 = ((~i4) & (i3 | 53)) + (i4 << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (iArr.length != iArr2.length) {
            int i8 = i6 + 5;
            int i9 = i8 % 128;
            a = i9;
            boolean z2 = i8 % 2 == 0;
            int i10 = i9 & 7;
            int i11 = i10 + ((i9 ^ 7) | i10);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 93 / 0;
            }
            return z2;
        }
        int length = iArr.length;
        int i13 = (length ^ (-1)) + (length << 1);
        int i14 = ((((i3 ^ 15) | (i3 & 15)) << 1) - (~(-(((~i3) & 15) | (i3 & (-16)))))) - 1;
        b = i14 % 128;
        int i15 = i14 % 2;
        boolean z3 = true;
        while (i13 >= 0) {
            int i16 = b;
            int i17 = ((i16 ^ 121) - (~((i16 & 121) << 1))) - 1;
            int i18 = i17 % 128;
            a = i18;
            int i19 = i17 % 2;
            if (iArr[i13] == iArr2[i13]) {
                int i20 = (i18 & (-4)) | ((~i18) & 3);
                int i21 = -(-((i18 & 3) << 1));
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                b = i22 % 128;
                int i23 = i22 % 2;
                int i24 = ((i18 ^ 3) - (~(-(-((i18 & 3) << 1))))) - 1;
                b = i24 % 128;
                int i25 = i24 % 2;
                z = true;
            } else {
                int i26 = i16 & 3;
                int i27 = (i16 ^ 3) | i26;
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                a = i28 % 128;
                int i29 = i28 % 2;
                z = false;
            }
            z3 &= z;
            int i30 = ~i13;
            int i31 = -(-(i13 << 1));
            i13 = (i30 & i31) + (i30 | i31);
            int i32 = a;
            int i33 = i32 & 35;
            int i34 = -(-((i32 ^ 35) | i33));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            b = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = b;
        int i38 = i37 & 73;
        int i39 = (i38 - (~(-(-((i37 ^ 73) | i38))))) - 1;
        a = i39 % 128;
        if (i39 % 2 == 0) {
            int i40 = 62 / 0;
        }
        return z3;
    }

    public static final j F(ivas.gov.bisp.enumeration.aB.r rVar, Class cls) {
        int i2 = 2 % 2;
        int i3 = (-2) - ((a + 32) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            K(rVar, cls);
            throw null;
        }
        j jVarK = K(rVar, cls);
        if (jVarK == null) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.r(cls.getName(), " is no registered configuration"));
        }
        int i4 = a + 65;
        b = i4 % 128;
        int i5 = i4 % 2;
        return jVarK;
    }

    public static void G(long j2, long[] jArr, int i2) {
        long jG;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 & 3) + (i5 | 3);
        a = i6 % 128;
        int i7 = i6 % 2;
        long jG2 = h.g(h.g(j2, 4294901760L, 16), 280375465148160L, 8);
        int i8 = a;
        int i9 = (i8 & 1) + (i8 | 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        long jG3 = h.g(h.g(jG2, 67555025218437360L, 4), 868082074056920076L, 2);
        int i11 = a;
        int i12 = i11 & 57;
        int i13 = (i11 ^ 57) | i12;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            jG = h.g(jG3, 2459565876494606882L, 0);
            jArr[i2] = jG | (-6148914691236517206L);
            i3 = 0;
        } else {
            jG = h.g(jG3, 2459565876494606882L, 1);
            jArr[i2] = jG & (-6148914691236517206L);
            i3 = 1;
        }
        int i15 = i2 ^ i3;
        int i16 = -(-((i2 & i3) << 1));
        jArr[(i15 ^ i16) + ((i16 & i15) << 1)] = (jG << 1) & (-6148914691236517206L);
        int i17 = b;
        int i18 = ((i17 ^ 46) + ((i17 & 46) << 1)) - 1;
        a = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 51 / 0;
        }
    }

    public static boolean H(short[] sArr, short[] sArr2) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 89) + ((i3 & 89) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (sArr.length != sArr2.length) {
            int i6 = i3 & 75;
            int i7 = (i3 ^ 75) | i6;
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = ((i3 & 66) + (i3 | 66)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int length = sArr.length;
        int i12 = length ^ (-1);
        int i13 = (length | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        int i16 = ((i3 & 68) + (i3 | 68)) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
        boolean z2 = true;
        while (i15 >= 0) {
            int i18 = a;
            int i19 = i18 & 81;
            int i20 = (((~i19) & (i18 | 81)) - (~(i19 << 1))) - 1;
            int i21 = i20 % 128;
            b = i21;
            int i22 = i20 % 2;
            if (sArr[i15] == sArr2[i15]) {
                int i23 = i21 + 83;
                a = i23 % 128;
                int i24 = i23 % 2;
                z = true;
            } else {
                int i25 = ((i18 | 69) << 1) - (i18 ^ 69);
                b = i25 % 128;
                int i26 = i25 % 2;
                z = false;
            }
            z2 &= z;
            int i27 = ~i15;
            int i28 = -(-(i15 << 1));
            i15 = ((i27 | i28) << 1) - (i27 ^ i28);
            int i29 = a;
            int i30 = i29 & 123;
            int i31 = (i29 | 123) & (~i30);
            int i32 = -(-(i30 << 1));
            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
            b = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = b;
        int i36 = i35 & 117;
        int i37 = (i35 ^ 117) | i36;
        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
        a = i38 % 128;
        if (i38 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean I(short[][] sArr, short[][] sArr2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 111;
        int i5 = (i4 - (~(-(-((i3 ^ 111) | i4))))) - 1;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (sArr.length != sArr2.length) {
            int i8 = ((i6 ^ 43) | (i6 & 43)) << 1;
            int i9 = -((i6 & (-44)) | ((~i6) & 43));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = (i11 & 125) + (i11 | 125);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int length = sArr.length;
        int i14 = ~length;
        int i15 = -(-(length << 1));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = ((i6 | 93) << 1) - (i6 ^ 93);
        a = i17 % 128;
        int i18 = i17 % 2;
        boolean zH = true;
        while (i16 >= 0) {
            int i19 = a;
            int i20 = ((i19 | 53) << 1) - (i19 ^ 53);
            b = i20 % 128;
            int i21 = i20 % 2;
            zH &= H(sArr[i16], sArr2[i16]);
            int i22 = -(~i16);
            i16 = ((-2) ^ i22) + ((i22 & (-2)) << 1);
            int i23 = b;
            int i24 = (i23 | 87) << 1;
            int i25 = -(((~i23) & 87) | (i23 & (-88)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = a + 23;
        b = i28 % 128;
        if (i28 % 2 == 0) {
            return zH;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r8 = null;
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        r3 = r8.length;
        r5 = -(-((~r3) | r3));
        r6 = ((r3 | r5) << 1) - (r3 ^ r5);
        r3 = r1 & 105;
        r1 = (r1 ^ 105) | r3;
        r5 = ((r3 | r1) << 1) - (r1 ^ r3);
        ivas.gov.bisp.enumeration.p100w.r.a = r5 % 128;
        r5 = r5 % 2;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r6 < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p100w.r.b;
        r5 = r3 | 81;
        r7 = (r5 << 1) - ((~(r3 & 81)) & r5);
        ivas.gov.bisp.enumeration.p100w.r.a = r7 % 128;
        r7 = r7 % 2;
        r1 = r1 & I(r8[r6], r9[r6]);
        r6 = r6 - 1;
        r3 = ivas.gov.bisp.enumeration.p100w.r.a;
        r5 = r3 ^ 45;
        r3 = ((((r3 & 45) | r5) << 1) - (~(-r5))) - 1;
        ivas.gov.bisp.enumeration.p100w.r.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if ((r3 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        r3 = 2 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p100w.r.b + 55;
        ivas.gov.bisp.enumeration.p100w.r.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if ((r8 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        r8 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r8.length != r9.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r8.length != r9.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r8 = r1 & 35;
        r9 = (~r8) & (r1 | 35);
        r8 = r8 << 1;
        r1 = (r9 ^ r8) + ((r8 & r9) << 1);
        r8 = r1 % 128;
        ivas.gov.bisp.enumeration.p100w.r.a = r8;
        r1 = r1 % 2;
        r9 = r8 & 107;
        r8 = -(-((r8 ^ 107) | r9));
        r1 = ((r9 | r8) << 1) - (r8 ^ r9);
        ivas.gov.bisp.enumeration.p100w.r.b = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean J(short[][][] r8, short[][][] r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p100w.r.a
            r2 = r1 & 73
            r1 = r1 ^ 73
            r1 = r1 | r2
            r3 = r2 | r1
            r4 = 1
            int r3 = r3 << r4
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.p100w.r.b = r1
            int r3 = r3 % r0
            r2 = 0
            if (r3 == 0) goto L20
            int r3 = r8.length
            int r5 = r9.length
            r6 = 67
            int r6 = r6 / r2
            if (r3 == r5) goto L4e
            goto L24
        L20:
            int r3 = r8.length
            int r5 = r9.length
            if (r3 == r5) goto L4e
        L24:
            r8 = r1 & 35
            int r9 = ~r8
            r1 = r1 | 35
            r9 = r9 & r1
            int r8 = r8 << r4
            r1 = r9 ^ r8
            r8 = r8 & r9
            int r8 = r8 << r4
            int r1 = r1 + r8
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.p100w.r.a = r8
            int r1 = r1 % r0
            r9 = r8 & 107(0x6b, float:1.5E-43)
            r8 = r8 ^ 107(0x6b, float:1.5E-43)
            r8 = r8 | r9
            int r8 = -r8
            int r8 = -r8
            r1 = r9 | r8
            int r1 = r1 << r4
            r8 = r8 ^ r9
            int r1 = r1 - r8
            int r8 = r1 % 128
            ivas.gov.bisp.enumeration.p100w.r.b = r8
            int r1 = r1 % r0
            if (r1 != 0) goto L49
            return r2
        L49:
            r8 = 0
            r8.hashCode()
            throw r8
        L4e:
            int r3 = r8.length
            int r5 = ~r3
            r5 = r5 | r3
            int r5 = -r5
            int r5 = -r5
            r6 = r3 | r5
            int r6 = r6 << r4
            r3 = r3 ^ r5
            int r6 = r6 - r3
            r3 = r1 & 105(0x69, float:1.47E-43)
            r1 = r1 ^ 105(0x69, float:1.47E-43)
            r1 = r1 | r3
            r5 = r3 | r1
            int r5 = r5 << r4
            r1 = r1 ^ r3
            int r5 = r5 - r1
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.p100w.r.a = r1
            int r5 = r5 % r0
            r1 = r4
        L68:
            if (r6 < 0) goto L9d
            int r3 = ivas.gov.bisp.enumeration.p100w.r.b
            r5 = r3 | 81
            int r7 = r5 << 1
            r3 = r3 & 81
            int r3 = ~r3
            r3 = r3 & r5
            int r7 = r7 - r3
            int r3 = r7 % 128
            ivas.gov.bisp.enumeration.p100w.r.a = r3
            int r7 = r7 % 2
            r3 = r8[r6]
            r5 = r9[r6]
            boolean r3 = I(r3, r5)
            r1 = r1 & r3
            int r6 = r6 + (-1)
            int r3 = ivas.gov.bisp.enumeration.p100w.r.a
            r5 = r3 ^ 45
            r3 = r3 & 45
            r3 = r3 | r5
            int r3 = r3 << r4
            int r5 = -r5
            int r5 = ~r5
            int r3 = r3 - r5
            int r3 = r3 - r4
            int r5 = r3 % 128
            ivas.gov.bisp.enumeration.p100w.r.b = r5
            int r3 = r3 % 2
            if (r3 == 0) goto L68
            int r3 = r0 % 4
            goto L68
        L9d:
            int r8 = ivas.gov.bisp.enumeration.p100w.r.b
            int r8 = r8 + 55
            int r9 = r8 % 128
            ivas.gov.bisp.enumeration.p100w.r.a = r9
            int r8 = r8 % r0
            if (r8 != 0) goto Lab
            r8 = 25
            int r8 = r8 / r2
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p100w.r.J(short[][][], short[][][]):boolean");
    }

    public static ivas.gov.bisp.enumeration.p069co.j L(String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 51;
        int i5 = (i4 - (~((i3 ^ 51) | i4))) - 1;
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            str.equals("SHA-1");
            throw null;
        }
        if (str.equals("SHA-1")) {
            ivas.gov.bisp.enumeration.p069co.j jVar = new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p068cn.j.a, ae.c);
            int i6 = a;
            int i7 = i6 ^ 89;
            int i8 = -(-((i6 & 89) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                return jVar;
            }
            obj.hashCode();
            throw null;
        }
        if (str.equals("SHA-224")) {
            ivas.gov.bisp.enumeration.p069co.j jVar2 = new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p056cb.j.d, ae.c);
            int i10 = a;
            int i11 = ((i10 | 117) << 1) - (i10 ^ 117);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return jVar2;
            }
            throw null;
        }
        if (str.equals("SHA-256")) {
            ivas.gov.bisp.enumeration.p069co.j jVar3 = new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p056cb.j.a, ae.c);
            int i12 = a;
            int i13 = (i12 ^ 52) + ((i12 & 52) << 1);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            return jVar3;
        }
        if (str.equals("SHA-384")) {
            ivas.gov.bisp.enumeration.p069co.j jVar4 = new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p056cb.j.b, ae.c);
            int i16 = a + 117;
            b = i16 % 128;
            int i17 = i16 % 2;
            return jVar4;
        }
        if (!str.equals("SHA-512")) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.r("unrecognised digest algorithm: ", str));
        }
        ivas.gov.bisp.enumeration.p069co.j jVar5 = new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p056cb.j.c, ae.c);
        int i18 = a;
        int i19 = (((i18 & (-4)) | ((~i18) & 3)) - (~((i18 & 3) << 1))) - 1;
        b = i19 % 128;
        int i20 = i19 % 2;
        return jVar5;
    }

    public static C0278x M(String str) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 52) << 1) - (i3 ^ 52)) - 1;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            str.equals("SHA-256");
            obj.hashCode();
            throw null;
        }
        if (str.equals("SHA-256")) {
            int i5 = b + 27;
            a = i5 % 128;
            int i6 = i5 % 2;
            C0278x c0278x = ivas.gov.bisp.enumeration.p056cb.j.a;
            int i7 = a;
            int i8 = (((i7 ^ 47) | (i7 & 47)) << 1) - (((~i7) & 47) | (i7 & (-48)));
            b = i8 % 128;
            int i9 = i8 % 2;
            return c0278x;
        }
        if (str.equals("SHA-512")) {
            int i10 = b + 97;
            a = i10 % 128;
            int i11 = i10 % 2;
            C0278x c0278x2 = ivas.gov.bisp.enumeration.p056cb.j.c;
            int i12 = a;
            int i13 = ((i12 | 68) << 1) - (i12 ^ 68);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            return c0278x2;
        }
        if (!str.equals("SHAKE128")) {
            if (!str.equals("SHAKE256")) {
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.r("unrecognized digest: ", str));
            }
            int i16 = b + 3;
            a = i16 % 128;
            if (i16 % 2 != 0) {
                return ivas.gov.bisp.enumeration.p056cb.j.h;
            }
            int i17 = 3 / 0;
            return ivas.gov.bisp.enumeration.p056cb.j.h;
        }
        int i18 = a;
        int i19 = ((i18 ^ 45) | (i18 & 45)) << 1;
        int i20 = -(((~i18) & 45) | (i18 & (-46)));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        b = i21 % 128;
        int i22 = i21 % 2;
        C0278x c0278x3 = ivas.gov.bisp.enumeration.p056cb.j.g;
        if (i22 == 0) {
            return c0278x3;
        }
        throw null;
    }

    public static final String P(Context context, Uri uri) {
        String type;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-68)) | ((~i3) & 67);
        int i5 = -(-((i3 & 67) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            ivas.gov.bisp.enumeration.O.r.f(uri.getScheme(), "content");
            throw null;
        }
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        if (!ivas.gov.bisp.enumeration.O.r.f(uri.getScheme(), "content") || (type = context.getContentResolver().getType(uri)) == null) {
            String strB = AcraContentProvider.a.b(uri);
            int i7 = a;
            int i8 = i7 & 95;
            int i9 = i8 + ((i7 ^ 95) | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            return strB;
        }
        int i11 = b;
        int i12 = i11 & 121;
        int i13 = (i12 - (~(-(-((i11 ^ 121) | i12))))) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return type;
        }
        throw null;
    }

    public static final List Q(Object... objArr) {
        List listAm;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 111) | (i3 & 111)) << 1) - (((~i3) & 111) | (i3 & (-112)));
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.O.r.n(objArr, "elements");
        if (objArr.length > 0) {
            int i6 = b;
            int i7 = i6 & 95;
            int i8 = (i6 | 95) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                C0130y.am(objArr);
                throw null;
            }
            listAm = C0130y.am(objArr);
        } else {
            listAm = X.c;
            int i11 = a;
            int i12 = (i11 ^ 19) + ((i11 & 19) << 1);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 % 4;
            }
        }
        int i14 = b;
        int i15 = ((i14 ^ 8) + ((i14 & 8) << 1)) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        return listAm;
    }

    public static boolean R() {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 109) | (i3 & 109)) << 1;
        int i5 = -(((~i3) & 109) | (i3 & (-110)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        boolean z = false;
        if (i6 % 2 == 0) {
            try {
                Class.forName("android.app.Application", true, null);
            } catch (Exception unused) {
                z = true;
            }
        } else {
            try {
                Class.forName("android.app.Application", false, null);
                z = true;
            } catch (Exception unused2) {
            }
        }
        int i7 = a + 5;
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = b;
        int i10 = i9 & 47;
        int i11 = (i9 ^ 47) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
    public static DateFormat S(int i2, int i3) {
        String str;
        String str2;
        int i4 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (i2 != 0) {
            int i5 = b;
            int i6 = i5 + 27;
            int i7 = i6 % 128;
            a = i7;
            if (i6 % 2 != 0 ? i2 == 1 : i2 == 0) {
                int i8 = i5 & 91;
                int i9 = -(-(i5 | 91));
                int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                str = "MMMM d, yyyy";
            } else {
                int i12 = (i7 & 11) + (i7 | 11);
                int i13 = i12 % 128;
                b = i13;
                if (i12 % 2 == 0 ? i2 == 2 : i2 == 3) {
                    str = "MMM d, yyyy";
                    int i14 = (i13 & (-82)) | ((~i13) & 81);
                    int i15 = -(-((i13 & 81) << 1));
                    int i16 = (i14 & i15) + (i14 | i15);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    if (i2 != 3) {
                        throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("Unknown DateFormat style: ", i2));
                    }
                    int i18 = i7 ^ 37;
                    int i19 = ((i7 & 37) | i18) << 1;
                    int i20 = -i18;
                    int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                    int i22 = i21 % 128;
                    b = i22;
                    if (i21 % 2 != 0) {
                        int i23 = 48 / 0;
                    }
                    int i24 = i22 + 73;
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    str = "M/d/yy";
                }
            }
        } else {
            int i26 = a;
            int i27 = i26 ^ 49;
            int i28 = ((i26 & 49) | i27) << 1;
            int i29 = -i27;
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            b = i30 % 128;
            int i31 = i30 % 2;
            str = "EEEE, MMMM d, yyyy";
        }
        sb.append(str);
        sb.append(" ");
        int i32 = b;
        int i33 = i32 & 49;
        int i34 = -(-((i32 ^ 49) | i33));
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        int i36 = i35 % 128;
        a = i36;
        Object obj = null;
        if (i35 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i3 != 0) {
            int i37 = (i36 & 21) + (i36 | 21);
            b = i37 % 128;
            int i38 = i37 % 2;
            if (i3 != 1) {
                int i39 = i36 & 99;
                int i40 = ((~i39) & (i36 | 99)) + (i39 << 1);
                int i41 = i40 % 128;
                b = i41;
                int i42 = i40 % 2;
                if (i3 != 2) {
                    int i43 = i41 & 21;
                    int i44 = -(-((i41 ^ 21) | i43));
                    int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
                    int i46 = i45 % 128;
                    a = i46;
                    int i47 = i45 % 2;
                    if (i3 != 3) {
                        throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("Unknown DateFormat style: ", i3));
                    }
                    int i48 = i46 & 43;
                    int i49 = (i48 - (~(-(-((i46 ^ 43) | i48))))) - 1;
                    b = i49 % 128;
                    if (i49 % 2 != 0) {
                        throw null;
                    }
                    str2 = "h:mm a";
                } else {
                    int i50 = (-2) - (((i36 ^ 80) + ((i36 & 80) << 1)) ^ (-1));
                    b = i50 % 128;
                    int i51 = i50 % 2;
                    str2 = "h:mm:ss a";
                }
            } else {
                str2 = "h:mm:ss a z";
                int i52 = b + 17;
                a = i52 % 128;
                int i53 = i52 % 2;
            }
        } else {
            str2 = "h:mm:ss a z";
            int i54 = b + 17;
            a = i54 % 128;
            int i55 = i54 % 2;
        }
        sb.append(str2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sb.toString(), Locale.US);
        int i56 = a;
        int i57 = (i56 & 21) + (i56 | 21);
        b = i57 % 128;
        int i58 = i57 % 2;
        return simpleDateFormat;
    }

    public static final List T(Object obj) {
        int i2 = 2 % 2;
        int i3 = a + 81;
        b = i3 % 128;
        int i4 = i3 % 2;
        List listSingletonList = Collections.singletonList(obj);
        ivas.gov.bisp.enumeration.O.r.m(listSingletonList, "singletonList(element)");
        int i5 = a;
        int i6 = i5 & 29;
        int i7 = i6 + ((i5 ^ 29) | i6);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return listSingletonList;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static long U(byte[] bArr, int i2) {
        byte b2;
        byte b3;
        byte b4;
        int i3;
        byte b5;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 ^ 111) + ((i5 & 111) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            b2 = bArr[i2];
            b3 = bArr[((i2 ^ (-1)) | i2) + i2];
            b4 = bArr[i2 >>> 2];
        } else {
            b2 = bArr[i2];
            b3 = bArr[((i2 & 2) + (i2 | 2)) - 1];
            int i7 = i2 & 2;
            b4 = bArr[i7 + ((i2 ^ 2) | i7)];
        }
        int i8 = i5 + 83;
        int i9 = i8 % 128;
        b = i9;
        if (i8 % 2 != 0) {
            byte b6 = bArr[i2 / 2];
            int i10 = b6 ^ 13218;
            int i11 = b6 & 13218;
            i3 = ((i11 & i10) | (i10 ^ i11)) >> 5;
            b5 = 27666;
        } else {
            i3 = (bArr[(i2 ^ 3) + ((i2 & 3) << 1)] & 255) << 24;
            b5 = 255;
        }
        int i12 = b5 & b2;
        int i13 = (b3 & 255) << 8;
        int i14 = i12 ^ i13;
        int i15 = i12 & i13;
        int i16 = (i15 & i14) | (i14 ^ i15);
        int i17 = i9 ^ 45;
        int i18 = (((i9 & 45) | i17) << 1) - i17;
        a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = i16 | ((b4 & 255) << 16);
        long j2 = ((long) ((i3 & i20) | (i3 ^ i20))) & 4294967295L;
        int i21 = ((i9 & 60) + (i9 | 60)) - 1;
        a = i21 % 128;
        if (i21 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final List V(List list) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 ^ 25) | (i3 & 25)) << 1) - (((~i3) & 25) | (i3 & (-26)));
        a = i4 % 128;
        int i5 = i4 % 2;
        int size = list.size();
        if (size != 0) {
            int i6 = b;
            int i7 = i6 & 97;
            int i8 = (((i6 ^ 97) | i7) << 1) - ((i6 | 97) & (~i7));
            a = i8 % 128;
            if (i8 % 2 != 0 ? size == 1 : size == 1) {
                list = T(list.get(0));
                int i9 = a;
                int i10 = ((i9 | 60) << 1) - (i9 ^ 60);
                int i11 = (i10 ^ (-1)) + (i10 << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            list = X.c;
            int i13 = b;
            int i14 = ((i13 ^ 73) | (i13 & 73)) << 1;
            int i15 = -(((~i13) & 73) | (i13 & (-74)));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = a + 77;
        b = i18 % 128;
        if (i18 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static final String W(Reader reader) throws IOException {
        int i2 = 2 % 2;
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i3 = b;
        int i4 = i3 & 115;
        int i5 = ((i3 | 115) & (~i4)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = reader.read(cArr);
        int i8 = b;
        int i9 = i8 & 17;
        int i10 = i9 + ((i8 ^ 17) | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        while (i7 >= 0) {
            int i12 = a;
            int i13 = i12 ^ 61;
            int i14 = (i12 & 61) << 1;
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            int i16 = i15 % 2;
            stringWriter.write(cArr, 0, i7);
            i7 = reader.read(cArr);
            int i17 = a;
            int i18 = (i17 ^ 53) + ((i17 & 53) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i17 & 113;
            int i21 = i20 + ((i17 ^ 113) | i20);
            b = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 2 / 5;
            }
        }
        String string = stringWriter.toString();
        ivas.gov.bisp.enumeration.O.r.m(string, "buffer.toString()");
        int i23 = a;
        int i24 = i23 & 33;
        int i25 = (i24 - (~(-(-((i23 ^ 33) | i24))))) - 1;
        b = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = 67 / 0;
        }
        return string;
    }

    public static int X(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & (-88)) | ((~i5) & 87);
        int i7 = -(-((i5 & 87) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        if (i3 == 0) {
            int i11 = (-2) - ((i9 + 38) ^ (-1));
            a = i11 % 128;
            int i12 = i11 % 2;
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (y(i2) >= y(i3)) {
            int i13 = b;
            int i14 = ((i13 ^ 73) | (i13 & 73)) << 1;
            int i15 = -(((~i13) & 73) | (i13 & (-74)));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            a = i16 % 128;
            int i17 = i16 % 2;
            int iY = y(i2);
            int iY2 = y(i3);
            if (i17 == 0) {
                int i18 = -(~(-iY2));
                int i19 = i3 >> ((((iY | i18) << 1) - (iY ^ i18)) - 1);
                int i20 = (~i19) & i2;
                int i21 = (~i2) & i19;
                i2 = (i21 & i20) | (i20 ^ i21);
            } else {
                int i22 = -(~(-iY2));
                int i23 = i3 << (((iY & i22) + (iY | i22)) - 1);
                int i24 = i2 & i23;
                i2 = ((i2 ^ i23) | i24) & (~i24);
            }
        }
        int i25 = a;
        int i26 = (i25 ^ 109) + ((i25 & 109) << 1);
        b = i26 % 128;
        if (i26 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    public static long Y(long j2, long j3) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 33;
        int i5 = (i3 | 33) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        long j4 = j2 + j3;
        if ((j2 ^ j4) < 0) {
            int i10 = ((i8 ^ 73) | (i8 & 73)) << 1;
            int i11 = -(((~i8) & 73) | (i8 & (-74)));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            if ((j2 ^ j3) >= 0) {
                StringBuilder sb = new StringBuilder();
                int i14 = b;
                int i15 = ((i14 & (-84)) | ((~i14) & 83)) + ((i14 & 83) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                sb.append("The calculation caused an overflow: ");
                sb.append(j2);
                int i17 = a;
                int i18 = i17 & 55;
                int i19 = (((i17 | 55) & (~i18)) - (~(i18 << 1))) - 1;
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    sb.append(" + ");
                    sb.append(j3);
                    int i20 = 57 / 0;
                } else {
                    sb.append(" + ");
                    sb.append(j3);
                }
                throw new ArithmeticException(sb.toString());
            }
        }
        int i21 = b + 61;
        a = i21 % 128;
        int i22 = i21 % 2;
        return j4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r2
  0x0031: PHI (r2v4 long) = (r2v3 long), (r2v7 long) binds: [B:8:0x002f, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    public static long Z(long j2, long j3) {
        long j4;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 63;
        int i6 = ((i4 ^ 63) | i5) << 1;
        int i7 = -((i4 | 63) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        int i9 = i8 % 128;
        a = i9;
        if (i8 % 2 == 0) {
            j4 = j2 % j3;
            if (j2 % j4 < 1) {
                if ((j2 ^ j3) < 0) {
                    StringBuilder sb = new StringBuilder();
                    int i10 = b + 15;
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    sb.append("The calculation caused an overflow: ");
                    sb.append(j2);
                    int i12 = b + 17;
                    a = i12 % 128;
                    i2 = i12 % 2;
                    sb.append(" - ");
                    sb.append(j3);
                    if (i2 == 0) {
                        int i13 = 40 / 0;
                    }
                    throw new ArithmeticException(sb.toString());
                }
            }
        } else {
            j4 = j2 - j3;
            if ((j2 ^ j4) < 0) {
                if ((j2 ^ j3) < 0) {
                    StringBuilder sb2 = new StringBuilder();
                    int i14 = b + 15;
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    sb2.append("The calculation caused an overflow: ");
                    sb2.append(j2);
                    int i16 = b + 17;
                    a = i16 % 128;
                    i2 = i16 % 2;
                    sb2.append(" - ");
                    sb2.append(j3);
                    if (i2 == 0) {
                        int i17 = 40 / 0;
                    }
                    throw new ArithmeticException(sb2.toString());
                }
            }
        }
        int i18 = i9 & 37;
        int i19 = (~i18) & (i9 | 37);
        int i20 = i18 << 1;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        b = i21 % 128;
        int i22 = i21 % 2;
        return j4;
    }

    public static int aa(long j2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 13;
        int i5 = (~i4) & (i3 | 13);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        if (-2147483648L <= j2) {
            int i9 = ((i3 | 59) << 1) - (i3 ^ 59);
            int i10 = i9 % 128;
            b = i10;
            if (i9 % 2 != 0) {
                throw null;
            }
            if (j2 <= 2147483647L) {
                int i11 = (int) j2;
                int i12 = i10 & 7;
                int i13 = ((i10 ^ 7) | i12) << 1;
                int i14 = -((i10 | 7) & (~i12));
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                return i11;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Value cannot fit in an int: ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static void ac(byte[] bArr, long j2, int i2) {
        byte b2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a + 1;
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 75;
        int i9 = i6 | 75;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (i12 < 4) {
            int i13 = a;
            int i14 = i13 & 71;
            int i15 = (((i13 ^ 71) | i14) << 1) - ((i13 | 71) & (~i14));
            int i16 = i15 % 128;
            b = i16;
            if (i15 % 2 != 0) {
                b2 = (byte) (j2 | 255);
                i3 = i2 >>> i12;
            } else {
                b2 = (byte) (j2 & 255);
                int i17 = i2 & i12;
                int i18 = (i2 ^ i12) | i17;
                i3 = (i17 | i18) + (i17 & i18);
            }
            int i19 = i16 & 21;
            int i20 = (i16 ^ 21) | i19;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            int i22 = i21 % 128;
            a = i22;
            int i23 = i21 % 2;
            bArr[i3] = b2;
            i12 = ((i12 ^ 40) + ((i12 & 40) << 1)) - 39;
            j2 >>= 8;
            int i24 = (i22 & 63) + (i22 | 63);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = a;
        int i27 = ((i26 & 38) + (i26 | 38)) - 1;
        b = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 33 / 0;
        }
    }

    public static final Map ad(Map map) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 43;
        int i5 = ((i3 & 43) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            map.entrySet().iterator().next();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object next = map.entrySet().iterator().next();
        int i8 = b;
        int i9 = i8 & 11;
        int i10 = (i9 - (~((i8 ^ 11) | i9))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        Map.Entry entry = (Map.Entry) next;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int i12 = b;
        int i13 = i12 ^ 57;
        int i14 = ((i12 & 57) | i13) << 1;
        int i15 = -i13;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        a = i16 % 128;
        int i17 = i16 % 2;
        Map mapSingletonMap = Collections.singletonMap(key, value);
        ivas.gov.bisp.enumeration.O.r.m(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        int i18 = a;
        int i19 = i18 & 117;
        int i20 = -(-((i18 ^ 117) | i19));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        b = i21 % 128;
        int i22 = i21 % 2;
        return mapSingletonMap;
    }

    public static void ae(int i2, i iVar) {
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 | 85) << 1) - (i5 ^ 85);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            iVar.e((byte) (i2 % 2));
            i3 = 47;
        } else {
            iVar.e((byte) (i2 >>> 24));
            i3 = 16;
        }
        int i7 = b;
        int i8 = (i7 | 109) << 1;
        int i9 = -(((~i7) & 109) | (i7 & (-110)));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        iVar.e((byte) (i2 >>> i3));
        iVar.e((byte) (i11 == 0 ? i2 << 56 : i2 >>> 8));
        iVar.e((byte) i2);
        int i12 = a;
        int i13 = ((i12 ^ 69) | (i12 & 69)) << 1;
        int i14 = -(((~i12) & 69) | (i12 & (-70)));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    public static int aj(int i2, int i3, int i4) {
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 ^ 41;
        int i9 = (((i7 & 41) | i8) << 1) - i8;
        b = i9 % 128;
        int i10 = i9 % 2;
        int iX = X(i2, i4);
        int iX2 = X(i3, i4);
        int i11 = b;
        int i12 = (i11 ^ 39) + ((i11 & 39) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        if (iX2 != 0) {
            int i15 = i11 & 81;
            int i16 = (((i11 ^ 81) | i15) << 1) - ((i11 | 81) & (~i15));
            a = i16 % 128;
            int i17 = i16 % 2;
            int iY = y(i4);
            int i18 = b;
            int i19 = i18 & 35;
            int i20 = i19 + ((i18 ^ 35) | i19);
            a = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (iX != 0) {
                int i23 = a;
                int i24 = i23 & 7;
                int i25 = ((i23 ^ 7) | i24) << 1;
                int i26 = -((~i24) & (i23 | 7));
                int i27 = (i25 & i26) + (i25 | i26);
                b = i27 % 128;
                if (i27 % 2 == 0 ? ((byte) (iX & 1)) == 1 : ((byte) iX) == 0) {
                    i22 = ((~i22) & iX2) | ((~iX2) & i22);
                    int i28 = i23 + 11;
                    b = i28 % 128;
                    if (i28 % 2 != 0) {
                        int i29 = 4 % 3;
                    }
                }
                iX >>>= 1;
                iX2 <<= 1;
                int i30 = b;
                int i31 = (i30 ^ 19) + ((i30 & 19) << 1);
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    if (iX2 >= 0 % iY) {
                        i5 = i30 + 87;
                        a = i5 % 128;
                        if (i5 % 2 == 0) {
                            iX2 &= i4;
                        } else {
                            int i32 = iX2 & i4;
                            iX2 = ((iX2 ^ i4) | i32) & (~i32);
                        }
                        int i33 = (i30 ^ 25) + ((i30 & 25) << 1);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                    }
                } else if (iX2 >= (1 << iY)) {
                    i5 = i30 + 87;
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        iX2 &= i4;
                    } else {
                        int i35 = iX2 & i4;
                        iX2 = ((iX2 ^ i4) | i35) & (~i35);
                    }
                    int i36 = (i30 ^ 25) + ((i30 & 25) << 1);
                    a = i36 % 128;
                    int i37 = i36 % 2;
                }
            }
            i14 = i22;
        }
        int i38 = a;
        int i39 = i38 & 37;
        int i40 = ((((i38 ^ 37) | i39) << 1) - (~(-((i38 | 37) & (~i39))))) - 1;
        b = i40 % 128;
        if (i40 % 2 == 0) {
            return i14;
        }
        throw null;
    }

    public static final byte[] al(byte[] bArr, byte[] bArr2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 118) + ((i3 & 118) << 1)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("The lengths of x and y should match.");
        }
        int i6 = i3 & 91;
        int i7 = -(-((i3 ^ 91) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return ak(bArr, 0, bArr2, 0, bArr.length);
    }

    public static void f() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 26) + ((i3 & 26) << 1)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 & 29;
        int i7 = -(-((i3 ^ 29) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 8;
        while (i10 < 64) {
            int i11 = a;
            int i12 = i11 + 11;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                t[i10] = 0;
                int i13 = (i10 & 40) + (i10 | 40);
                i10 = (i13 ^ 14) + ((i13 & 14) << 1);
            } else {
                t[i10] = 0;
                int i14 = i10 & 1;
                int i15 = (i10 ^ 1) | i14;
                i10 = ((i14 | i15) << 1) - (i15 ^ i14);
            }
            int i16 = i11 + 9;
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b;
        int i19 = (i18 | 3) << 1;
        int i20 = -(((~i18) & 3) | (i18 & (-4)));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
    }

    public static void h(byte[] bArr, i iVar) {
        int i2 = 2 % 2;
        int i3 = b + 29;
        a = i3 % 128;
        int i4 = i3 % 2;
        iVar.f(bArr, 0, bArr.length);
    }

    public static int[] j(int[] iArr) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 95;
        int i5 = i4 + ((i3 ^ 95) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int i7 = b;
        int i8 = i7 ^ 101;
        int i9 = (((i7 & 101) | i8) << 1) - i8;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return iArr2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int l(Comparable comparable, Comparable comparable2) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 107;
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (comparable == comparable2) {
            int i6 = (i5 & (-28)) | ((~i5) & 27);
            int i7 = -(-((i5 & 27) << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = (((i5 | 16) << 1) - (i5 ^ 16)) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }
        if (comparable == null) {
            int i11 = i5 + 65;
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 17;
            a = i14 % 128;
            int i15 = i14 % 2;
            return -1;
        }
        if (comparable2 != null) {
            int iCompareTo = comparable.compareTo(comparable2);
            int i16 = b + 123;
            a = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 65 / 0;
            }
            return iCompareTo;
        }
        int i18 = i3 + 8;
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        a = i19 % 128;
        int i20 = i19 % 2;
        int i21 = (i3 & 69) + (i3 | 69);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            return 1;
        }
        obj.hashCode();
        throw null;
    }

    public static byte[] o(short[] sArr) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 35;
        int i5 = (i3 ^ 35) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        byte[] bArr = new byte[sArr.length];
        int i9 = i7 + 117;
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < sArr.length) {
            int i12 = b;
            int i13 = (i12 & 121) + (i12 | 121);
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            bArr[i11] = (byte) sArr[i11];
            int i16 = (((i11 & 4) | ((~i11) & (-5))) - (~((i11 & (-5)) << 1))) - 1;
            int i17 = (i16 & (-7)) | ((~i16) & 6);
            int i18 = (i16 & 6) << 1;
            i11 = ((i17 & i18) << 1) + (i17 ^ i18);
            int i19 = i14 & 69;
            int i20 = (i19 - (~(-(-((i14 ^ 69) | i19))))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = b;
        int i23 = ((i22 ^ 117) - (~((i22 & 117) << 1))) - 1;
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static short[] p(byte[] bArr) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 | 105) << 1) - (i5 ^ 105);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        short[] sArr = new short[bArr.length];
        int i9 = i7 & 1;
        int i10 = (i9 - (~(-(-((i7 ^ 1) | i9))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (i12 < bArr.length) {
            int i13 = a + 57;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                byte b2 = bArr[i12];
                int i14 = b2 & 178;
                sArr[i12] = (short) (((b2 ^ 178) | i14) & (~i14));
                int i15 = (-2) - (((i12 ^ 196) + ((i12 & 196) << 1)) ^ (-1));
                int i16 = i15 & (-114);
                int i17 = (i15 | (-114)) & (~i16);
                int i18 = i16 << 1;
                i2 = i17 ^ i18;
                i3 = (i17 & i18) << 1;
            } else {
                sArr[i12] = (short) (bArr[i12] & 255);
                int i19 = i12 + 95;
                int i20 = i19 & (-94);
                int i21 = (i19 ^ (-94)) | i20;
                i2 = i20 & i21;
                i3 = i21 | i20;
            }
            i12 = i2 + i3;
        }
        int i22 = b;
        int i23 = ((i22 ^ 97) | (i22 & 97)) << 1;
        int i24 = -(((~i22) & 97) | (i22 & (-98)));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        int i26 = i25 % 2;
        return sArr;
    }

    public static short[][] q(byte[][] bArr) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 53;
        int i7 = (i5 ^ 53) | i6;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        int length = bArr.length;
        int length2 = bArr[0].length;
        int i10 = (i5 & 101) + (i5 | 101);
        a = i10 % 128;
        int i11 = i10 % 2;
        int[] iArr = {length, length2};
        Class cls = Short.TYPE;
        int i12 = b + 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) cls, iArr);
        int i14 = 0;
        while (i14 < bArr.length) {
            int i15 = b + 113;
            a = i15 % 128;
            int i16 = i15 % 2 == 0 ? 1 : 0;
            while (i16 < bArr[0].length) {
                int i17 = a;
                int i18 = i17 & 99;
                int i19 = (i17 ^ 99) | i18;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                int i21 = i20 % 128;
                b = i21;
                if (i20 % 2 != 0) {
                    sArr[i14][i16] = (short) (bArr[i14][i16] & 16382);
                    int i22 = i16 & (-34);
                    int i23 = (((i16 ^ (-34)) | i22) << 1) - ((i16 | (-34)) & (~i22));
                    int i24 = i23 ^ 118;
                    int i25 = -(-((i23 & 118) << 1));
                    i2 = i24 ^ i25;
                    i3 = (i24 & i25) << 1;
                } else {
                    sArr[i14][i16] = (short) (bArr[i14][i16] & 255);
                    int i26 = (i16 ^ (-3)) + ((i16 & (-3)) << 1);
                    int i27 = i26 & 4;
                    int i28 = (i26 | 4) & (~i27);
                    int i29 = -(-(i27 << 1));
                    i2 = i28 & i29;
                    i3 = i29 | i28;
                }
                i16 = i2 + i3;
                int i30 = (i21 & 47) + (i21 | 47);
                a = i30 % 128;
                int i31 = i30 % 2;
            }
            int i32 = (((i14 & (-91)) | ((~i14) & 90)) - (~(-(-((i14 & 90) << 1))))) - 1;
            int i33 = i32 & (-89);
            i14 = i33 + ((i32 ^ (-89)) | i33);
            int i34 = a + 45;
            b = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = b;
        int i37 = (((i36 ^ 31) | (i36 & 31)) << 1) - (((~i36) & 31) | (i36 & (-32)));
        a = i37 % 128;
        int i38 = i37 % 2;
        return sArr;
    }

    public static byte[][] r(short[][] sArr) {
        Class cls;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((((i3 ^ 93) | (i3 & 93)) << 1) - (~(-(((~i3) & 93) | (i3 & (-94)))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int length = sArr.length;
        int[] iArr = new int[2];
        iArr[1] = sArr[0].length;
        int i7 = i5 + 125;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            iArr[0] = length;
            cls = Byte.TYPE;
        } else {
            iArr[0] = length;
            cls = Byte.TYPE;
        }
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
        int i8 = b;
        int i9 = ((i8 | 75) << 1) - (i8 ^ 75);
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        int i12 = ((i10 ^ 93) | (i10 & 93)) << 1;
        int i13 = -(((~i10) & 93) | (i10 & (-94)));
        int i14 = (i12 & i13) + (i13 | i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i16 < sArr.length) {
            int i17 = a + 123;
            int i18 = i17 % 128;
            b = i18;
            int i19 = i17 % 2;
            int i20 = i18 & 95;
            int i21 = ((i18 ^ 95) | i20) << 1;
            int i22 = -((i18 | 95) & (~i20));
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            a = i23 % 128;
            int i24 = i23 % 2;
            int i25 = 0;
            while (i25 < sArr[0].length) {
                int i26 = b;
                int i27 = i26 & 111;
                int i28 = -(-(i26 | 111));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                a = i29 % 128;
                int i30 = i29 % 2;
                bArr[i16][i25] = (byte) sArr[i16][i25];
                int i31 = i25 & 1;
                i25 = ((i25 | 1) & (~i31)) + (i31 << 1);
                int i32 = i26 & 35;
                int i33 = (i26 ^ 35) | i32;
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                a = i34 % 128;
                int i35 = i34 % 2;
            }
            i16++;
            int i36 = b + 113;
            a = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = b;
        int i39 = (i38 & (-14)) | ((~i38) & 13);
        int i40 = (i38 & 13) << 1;
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        a = i41 % 128;
        int i42 = i41 % 2;
        return bArr;
    }

    public static byte[][][] s(short[][][] sArr) {
        int length;
        short[] sArr2;
        int length2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-30)) | ((~i3) & 29)) + ((i3 & 29) << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            length = sArr.length;
            length2 = sArr[0].length;
            sArr2 = sArr[1][1];
        } else {
            length = sArr.length;
            short[][] sArr3 = sArr[0];
            int length3 = sArr3.length;
            sArr2 = sArr3[0];
            length2 = length3;
        }
        int[] iArr = {length, length2, sArr2.length};
        int i5 = i3 & 123;
        int i6 = ((i3 | 123) & (~i5)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        Class cls = Byte.TYPE;
        int i8 = b;
        int i9 = i8 & 43;
        int i10 = ((i8 ^ 43) | i9) << 1;
        int i11 = -((i8 | 43) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        byte[][][] bArr = (byte[][][]) Array.newInstance((Class<?>) cls, iArr);
        int i14 = i13 == 0 ? 1 : 0;
        int i15 = b + 37;
        a = i15 % 128;
        int i16 = i15 % 2;
        while (i14 < sArr.length) {
            int i17 = a;
            int i18 = ((i17 ^ 24) + ((i17 & 24) << 1)) - 1;
            int i19 = i18 % 128;
            b = i19;
            int i20 = i18 % 2;
            int i21 = i19 | 45;
            int i22 = (i21 << 1) - ((~(i19 & 45)) & i21);
            a = i22 % 128;
            int i23 = i22 % 2;
            int i24 = 0;
            while (i24 < sArr[0].length) {
                int i25 = a;
                int i26 = i25 + 21;
                b = i26 % 128;
                int i27 = i26 % 2;
                int i28 = i25 & 83;
                int i29 = -(-((i25 ^ 83) | i28));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                b = i30 % 128;
                int i31 = i30 % 2;
                int i32 = 0;
                while (i32 < sArr[0][0].length) {
                    int i33 = a;
                    int i34 = ((i33 | 123) << 1) - (i33 ^ 123);
                    int i35 = i34 % 128;
                    b = i35;
                    int i36 = i34 % 2;
                    byte[] bArr2 = bArr[i14][i24];
                    short[] sArr4 = sArr[i14][i24];
                    int i37 = ((i35 ^ 64) + ((i35 & 64) << 1)) - 1;
                    int i38 = i37 % 128;
                    a = i38;
                    int i39 = i37 % 2;
                    bArr2[i32] = (byte) sArr4[i32];
                    int i40 = i32 ^ 1;
                    int i41 = -(-((i32 & 1) << 1));
                    i32 = ((i41 & i40) << 1) + (i40 ^ i41);
                    int i42 = i38 & 53;
                    int i43 = -(-((i38 ^ 53) | i42));
                    int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                    b = i44 % 128;
                    int i45 = i44 % 2;
                }
                int i46 = i24 & 16;
                int i47 = ((i24 | 16) & (~i46)) + (i46 << 1);
                int i48 = i47 & (-15);
                int i49 = -(-(i47 | (-15)));
                i24 = ((i48 | i49) << 1) - (i49 ^ i48);
                int i50 = b;
                int i51 = i50 & 3;
                int i52 = (i50 ^ 3) | i51;
                int i53 = (i51 & i52) + (i52 | i51);
                a = i53 % 128;
                if (i53 % 2 == 0) {
                    int i54 = 2 / 5;
                }
            }
            int i55 = (i14 ^ 4) + ((i14 & 4) << 1);
            int i56 = i55 & (-3);
            int i57 = i55 | (-3);
            i14 = ((i56 | i57) << 1) - (i56 ^ i57);
            int i58 = b;
            int i59 = i58 ^ 125;
            int i60 = ((i58 & 125) | i59) << 1;
            int i61 = -i59;
            int i62 = (i60 & i61) + (i60 | i61);
            a = i62 % 128;
            int i63 = i62 % 2;
        }
        int i64 = a;
        int i65 = i64 ^ 9;
        int i66 = (i64 & 9) << 1;
        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
        b = i67 % 128;
        int i68 = i67 % 2;
        return bArr;
    }

    public static final void u(Context context, OutputStream outputStream, Uri uri) throws IOException {
        ContentResolver contentResolver;
        byte[] bArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 13;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            contentResolver = context.getContentResolver();
            int i5 = 16 / 0;
        } else {
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            contentResolver = context.getContentResolver();
        }
        int i6 = a;
        int i7 = i6 & 11;
        int i8 = i6 | 11;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not open ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
        int i11 = b;
        int i12 = ((i11 | 105) << 1) - (i11 ^ 105);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            bArr = new byte[23846];
            i2 = inputStreamOpenInputStream.read(bArr);
        } else {
            bArr = new byte[8192];
            i2 = inputStreamOpenInputStream.read(bArr);
        }
        int i13 = a;
        int i14 = i13 & 53;
        int i15 = (((i13 | 53) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
        while (i2 >= 0) {
            int i17 = b;
            int i18 = (-2) - ((((i17 | 24) << 1) - (i17 ^ 24)) ^ (-1));
            a = i18 % 128;
            if (i18 % 2 == 0) {
                outputStream.write(bArr, 1, i2);
            } else {
                outputStream.write(bArr, 0, i2);
            }
            i2 = inputStreamOpenInputStream.read(bArr);
            int i19 = a;
            int i20 = i19 & 111;
            int i21 = ((((i19 ^ 111) | i20) << 1) - (~(-((i19 | 111) & (~i20))))) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = b;
        int i24 = i23 ^ 49;
        int i25 = ((((i23 & 49) | i24) << 1) - (~(-i24))) - 1;
        a = i25 % 128;
        if (i25 % 2 == 0) {
            throw null;
        }
    }

    public static short[][][] v(byte[][][] bArr) {
        int length;
        byte[][] bArr2;
        int length2;
        char c2;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 95;
        int i5 = i4 + ((i3 ^ 95) | i4);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            length = bArr.length;
            bArr2 = bArr[0];
            length2 = bArr2.length;
        } else {
            length = bArr.length;
            bArr2 = bArr[0];
            length2 = bArr2.length;
        }
        int i6 = ((i3 & (-58)) | ((~i3) & 57)) + ((i3 & 57) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int length3 = bArr2[0].length;
        int[] iArr = new int[3];
        int i9 = ((i7 ^ 107) | (i7 & 107)) << 1;
        int i10 = -(((~i7) & 107) | (i7 & (-108)));
        int i11 = (i9 & i10) + (i10 | i9);
        int i12 = i11 % 128;
        a = i12;
        if (i11 % 2 == 0) {
            iArr[2] = length3;
            iArr[1] = length2;
            c2 = 1;
        } else {
            iArr[2] = length3;
            iArr[1] = length2;
            c2 = 0;
        }
        int i13 = i12 + 119;
        b = i13 % 128;
        int i14 = i13 % 2;
        iArr[c2] = length;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, iArr);
        int i15 = b;
        int i16 = i15 & 61;
        int i17 = -(-(i15 | 61));
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = (i15 ^ 3) + ((i15 & 3) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
        int i22 = 0;
        while (i22 < bArr.length) {
            int i23 = a;
            int i24 = i23 ^ 45;
            int i25 = (((i23 & 45) | i24) << 1) - i24;
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            int i28 = i26 & 37;
            int i29 = ((i26 | 37) & (~i28)) + (i28 << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 0;
            while (i31 < bArr[0].length) {
                int i32 = a;
                int i33 = ((((i32 ^ 61) | (i32 & 61)) << 1) - (~(-(((~i32) & 61) | (i32 & (-62)))))) - 1;
                b = i33 % 128;
                int i34 = i33 % 2 != 0 ? 1 : 0;
                while (i34 < bArr[0][0].length) {
                    int i35 = b;
                    int i36 = (i35 & (-96)) | ((~i35) & 95);
                    int i37 = (i35 & 95) << 1;
                    int i38 = (i36 & i37) + (i37 | i36);
                    int i39 = i38 % 128;
                    a = i39;
                    if (i38 % 2 == 0) {
                        short[] sArr2 = sArr[i22][i31];
                        byte[][] bArr3 = bArr[i22];
                        throw null;
                    }
                    short[] sArr3 = sArr[i22][i31];
                    byte[][] bArr4 = bArr[i22];
                    int i40 = ((i39 ^ 95) - (~(-(-((i39 & 95) << 1))))) - 1;
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    sArr3[i34] = (short) (bArr4[i31][i34] & 255);
                    int i42 = i34 ^ 1;
                    int i43 = -(-((i34 & 1) << 1));
                    i34 = (i43 | i42) + (i42 & i43);
                    int i44 = i39 & 29;
                    int i45 = ((i39 | 29) & (~i44)) + (i44 << 1);
                    b = i45 % 128;
                    int i46 = i45 % 2;
                }
                int i47 = i31 & 115;
                int i48 = -(-((i31 ^ 115) | i47));
                int i49 = (i47 & i48) + (i48 | i47);
                int i50 = (i49 | (-114)) << 1;
                int i51 = -(i49 ^ (-114));
                i31 = ((i50 & i51) << 1) + (i50 ^ i51);
                int i52 = b;
                int i53 = i52 & 73;
                int i54 = ((i52 ^ 73) | i53) << 1;
                int i55 = -((i52 | 73) & (~i53));
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                a = i56 % 128;
                int i57 = i56 % 2;
            }
            int i58 = i22 & (-108);
            int i59 = (i22 | (-108)) & (~i58);
            int i60 = -(-(i58 << 1));
            int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
            int i62 = i61 ^ 109;
            int i63 = ((i61 & 109) | i62) << 1;
            int i64 = -i62;
            i22 = ((i63 | i64) << 1) - (i64 ^ i63);
            int i65 = b + 21;
            a = i65 % 128;
            int i66 = i65 % 2;
        }
        int i67 = a;
        int i68 = i67 & 115;
        int i69 = -(-((i67 ^ 115) | i68));
        int i70 = (i68 & i69) + (i69 | i68);
        b = i70 % 128;
        int i71 = i70 % 2;
        return sArr;
    }

    public static c x(ivas.gov.bisp.enumeration.O.r rVar, L l2) throws IOException {
        ivas.gov.bisp.enumeration.p077cw.v vVarO;
        if (rVar instanceof ivas.gov.bisp.enumeration.p079cy.h) {
            ivas.gov.bisp.enumeration.p079cy.h hVar = (ivas.gov.bisp.enumeration.p079cy.h) rVar;
            return new c(z.c(hVar.S), new B(hVar.c()), l2, null);
        }
        if (rVar instanceof l) {
            l lVar = (l) rVar;
            return new c(new ivas.gov.bisp.enumeration.p069co.j(P.e, new ivas.gov.bisp.enumeration.p076cv.l(z.d(lVar.F()))), new B(lVar.c()), null, null);
        }
        if (rVar instanceof ivas.gov.bisp.enumeration.cX.j) {
            ivas.gov.bisp.enumeration.p069co.j jVar = new ivas.gov.bisp.enumeration.p069co.j(P.g);
            short[] sArrC = ((ivas.gov.bisp.enumeration.cX.j) rVar).c();
            byte[] bArr = new byte[sArrC.length * 2];
            for (int i2 = 0; i2 != sArrC.length; i2 = ((i2 | 1) << 1) - (i2 ^ 1)) {
                short s2 = sArrC[i2];
                int i3 = i2 * 2;
                bArr[i3] = (byte) s2;
                int i4 = i3 & 1;
                int i5 = i3 | 1;
                bArr[(i4 & i5) + (i5 | i4)] = (byte) (s2 >>> 8);
            }
            return new c(jVar, new B(bArr), null, null);
        }
        if (rVar instanceof ivas.gov.bisp.enumeration.p077cw.R) {
            ivas.gov.bisp.enumeration.p077cw.R r2 = (ivas.gov.bisp.enumeration.p077cw.R) rVar;
            a aVarH = a.h();
            aVarH.p(1);
            aVarH.k(r2);
            byte[] bArrJ = aVarH.j();
            a aVarH2 = a.h();
            aVarH2.p(1);
            aVarH2.k(r2.O());
            return new c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p067cm.j.a), new B(bArrJ), l2, aVarH2.j());
        }
        if (rVar instanceof O) {
            O o2 = (O) rVar;
            a aVarH3 = a.h();
            aVarH3.p(o2.T);
            aVarH3.k(o2);
            byte[] bArrJ2 = aVarH3.j();
            a aVarH4 = a.h();
            aVarH4.p(o2.T);
            synchronized (o2) {
                vVarO = o2.U.get(0).O();
            }
            aVarH4.k(vVarO);
            return new c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p067cm.j.a), new B(bArrJ2), l2, aVarH4.j());
        }
        if (rVar instanceof ivas.gov.bisp.enumeration.cC.L) {
            ivas.gov.bisp.enumeration.cC.L l3 = (ivas.gov.bisp.enumeration.cC.L) rVar;
            ivas.gov.bisp.enumeration.p069co.j jVar2 = new ivas.gov.bisp.enumeration.p069co.j(P.f, new ivas.gov.bisp.enumeration.p076cv.a(l3.U.e, z.f(l3.F())));
            byte[] encoded = l3.getEncoded();
            S s3 = l3.U;
            int i6 = s3.j;
            int i7 = s3.e;
            int iC = (int) ivas.gov.bisp.enumeration.cC.v.c(encoded, 0, 4);
            if (!ivas.gov.bisp.enumeration.cC.v.j(i7, iC)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            byte[] bArrG = ivas.gov.bisp.enumeration.cC.v.g(encoded, 4, i6);
            int i8 = ((i6 | 4) << 1) - (i6 ^ 4);
            byte[] bArrG2 = ivas.gov.bisp.enumeration.cC.v.g(encoded, i8, i6);
            int i9 = -(-i6);
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            byte[] bArrG3 = ivas.gov.bisp.enumeration.cC.v.g(encoded, i10, i6);
            int i11 = (i10 - (~i9)) - 1;
            byte[] bArrG4 = ivas.gov.bisp.enumeration.cC.v.g(encoded, i11, i6);
            int i12 = i11 + i6;
            int length = encoded.length;
            int i13 = -i12;
            int i14 = length ^ i13;
            int i15 = (length & i13) << 1;
            byte[] bArrG5 = ivas.gov.bisp.enumeration.cC.v.g(encoded, i12, ((i14 | i15) << 1) - (i15 ^ i14));
            try {
                int i16 = ((C0238r) ivas.gov.bisp.enumeration.cC.v.h(bArrG5, C0238r.class)).n;
                return new c(jVar2, i16 != (1 << i7) - 1 ? new M(iC, bArrG, bArrG2, bArrG3, bArrG4, bArrG5, i16) : new M(iC, bArrG, bArrG2, bArrG3, bArrG4, bArrG5), l2, null);
            } catch (ClassNotFoundException e2) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("cannot parse BDS: ");
                sbW.append(e2.getMessage());
                throw new IOException(sbW.toString());
            }
        }
        if (!(rVar instanceof N)) {
            throw new IOException("key parameters not recognized");
        }
        N n2 = (N) rVar;
        C0278x c0278x = P.h;
        ivas.gov.bisp.enumeration.cC.M m2 = n2.T;
        ivas.gov.bisp.enumeration.p069co.j jVar3 = new ivas.gov.bisp.enumeration.p069co.j(c0278x, new o(m2.f, m2.g, z.f(n2.a)));
        byte[] encoded2 = n2.getEncoded();
        ivas.gov.bisp.enumeration.cC.M m3 = n2.T;
        int i17 = m3.e.j;
        int i18 = m3.f;
        int i19 = i18 & 7;
        int i20 = (~i19) & (i18 | 7);
        int i21 = -(-(i19 << 1));
        int i22 = ((i20 ^ i21) + ((i21 & i20) << 1)) / 8;
        long jC = (int) ivas.gov.bisp.enumeration.cC.v.c(encoded2, 0, i22);
        if (!ivas.gov.bisp.enumeration.cC.v.j(i18, jC)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrG6 = ivas.gov.bisp.enumeration.cC.v.g(encoded2, i22, i17);
        int i23 = i22 & i17;
        int i24 = i22 | i17;
        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
        byte[] bArrG7 = ivas.gov.bisp.enumeration.cC.v.g(encoded2, i25, i17);
        int i26 = i25 | i17;
        int i27 = i26 << 1;
        int i28 = -(i26 & (~(i25 & i17)));
        int i29 = (i27 & i28) + (i28 | i27);
        byte[] bArrG8 = ivas.gov.bisp.enumeration.cC.v.g(encoded2, i29, i17);
        int i30 = i29 | i17;
        int i31 = (i30 << 1) - (i30 & (~(i29 & i17)));
        byte[] bArrG9 = ivas.gov.bisp.enumeration.cC.v.g(encoded2, i31, i17);
        int i32 = i31 & i17;
        int i33 = (i17 ^ i31) | i32;
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        int length2 = encoded2.length;
        int i35 = -i34;
        byte[] bArrG10 = ivas.gov.bisp.enumeration.cC.v.g(encoded2, i34, (length2 ^ i35) + ((length2 & i35) << 1));
        try {
            long j2 = ((ivas.gov.bisp.enumeration.cC.e) ivas.gov.bisp.enumeration.cC.v.h(bArrG10, ivas.gov.bisp.enumeration.cC.e.class)).d;
            return new c(jVar3, j2 != (1 << i18) - 1 ? new J(jC, bArrG6, bArrG7, bArrG8, bArrG9, bArrG10, j2) : new J(jC, bArrG6, bArrG7, bArrG8, bArrG9, bArrG10), l2, null);
        } catch (ClassNotFoundException e3) {
            StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("cannot parse BDSStateMap: ");
            sbW2.append(e3.getMessage());
            throw new IOException(sbW2.toString());
        }
    }

    public static int y(int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 107;
        int i6 = (i4 | 107) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        int i9 = -1;
        while (i2 != 0) {
            int i10 = a;
            int i11 = (((i10 | 20) << 1) - (i10 ^ 20)) - 1;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = i9 - 78;
                i9 = (i12 ^ 118) + ((i12 & 118) << 1);
            } else {
                int i13 = i9 ^ (-6);
                int i14 = ((i9 & (-6)) | i13) << 1;
                int i15 = -i13;
                int i16 = (i14 & i15) + (i14 | i15);
                int i17 = (i16 & (-8)) | ((~i16) & 7);
                int i18 = (i16 & 7) << 1;
                i2 >>>= 1;
                i9 = (i17 ^ i18) + ((i17 & i18) << 1);
            }
        }
        int i19 = a;
        int i20 = ((i19 ^ 9) - (~(-(-((i19 & 9) << 1))))) - 1;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 34 / 0;
        }
        return i9;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.v
    public void a(View view) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 | 12) << 1) - (i3 ^ 12)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public ap b(Class cls) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 87) | (i3 & 87)) << 1;
        int i5 = -(((~i3) & 87) | (i3 & (-88)));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        try {
            ap apVar = (ap) cls.newInstance();
            int i8 = b;
            int i9 = i8 & 73;
            int i10 = (i8 ^ 73) | i9;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            return apVar;
        } catch (IllegalAccessException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e2);
        } catch (InstantiationException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e3);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p081d.v
    public void c(View view) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 55;
        int i5 = -(-((i3 ^ 55) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p102y.x
    public Object d() {
        int i2 = 2 % 2;
        TreeMap treeMap = new TreeMap();
        int i3 = a + 55;
        b = i3 % 128;
        int i4 = i3 % 2;
        return treeMap;
    }

    static {
        int[] iArr = {R.attr.drawable, R.attr.toId, R.attr.fromId, R.attr.reversible};
        int i2 = 1 & 71;
        int i3 = (~i2) & (1 | 71);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        f = iArr;
        h = new int[]{R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.animate_relativeTo, ivas.gov.bisp.enumeration.R.attr.barrierAllowsGoneWidgets, ivas.gov.bisp.enumeration.R.attr.barrierDirection, ivas.gov.bisp.enumeration.R.attr.barrierMargin, ivas.gov.bisp.enumeration.R.attr.chainUseRtl, ivas.gov.bisp.enumeration.R.attr.constraint_referenced_ids, ivas.gov.bisp.enumeration.R.attr.drawPath, ivas.gov.bisp.enumeration.R.attr.flow_firstHorizontalBias, ivas.gov.bisp.enumeration.R.attr.flow_firstHorizontalStyle, ivas.gov.bisp.enumeration.R.attr.flow_firstVerticalBias, ivas.gov.bisp.enumeration.R.attr.flow_firstVerticalStyle, ivas.gov.bisp.enumeration.R.attr.flow_horizontalAlign, ivas.gov.bisp.enumeration.R.attr.flow_horizontalBias, ivas.gov.bisp.enumeration.R.attr.flow_horizontalGap, ivas.gov.bisp.enumeration.R.attr.flow_horizontalStyle, ivas.gov.bisp.enumeration.R.attr.flow_lastHorizontalBias, ivas.gov.bisp.enumeration.R.attr.flow_lastHorizontalStyle, ivas.gov.bisp.enumeration.R.attr.flow_lastVerticalBias, ivas.gov.bisp.enumeration.R.attr.flow_lastVerticalStyle, ivas.gov.bisp.enumeration.R.attr.flow_maxElementsWrap, ivas.gov.bisp.enumeration.R.attr.flow_verticalAlign, ivas.gov.bisp.enumeration.R.attr.flow_verticalBias, ivas.gov.bisp.enumeration.R.attr.flow_verticalGap, ivas.gov.bisp.enumeration.R.attr.flow_verticalStyle, ivas.gov.bisp.enumeration.R.attr.flow_wrapMode, ivas.gov.bisp.enumeration.R.attr.layout_constrainedHeight, ivas.gov.bisp.enumeration.R.attr.layout_constrainedWidth, ivas.gov.bisp.enumeration.R.attr.layout_constraintBaseline_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintBaseline_toBaselineOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_toBottomOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_toTopOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircle, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircleAngle, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircleRadius, ivas.gov.bisp.enumeration.R.attr.layout_constraintDimensionRatio, ivas.gov.bisp.enumeration.R.attr.layout_constraintEnd_toEndOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintEnd_toStartOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_begin, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_end, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_percent, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_default, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_max, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_min, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_percent, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_bias, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_chainStyle, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_weight, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_toLeftOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_toRightOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_toLeftOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_toRightOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintStart_toEndOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintStart_toStartOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintTag, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_toBottomOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_toTopOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_bias, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_chainStyle, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_weight, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_default, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_max, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_min, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_percent, ivas.gov.bisp.enumeration.R.attr.layout_editor_absoluteX, ivas.gov.bisp.enumeration.R.attr.layout_editor_absoluteY, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginBottom, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginEnd, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginLeft, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginRight, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginStart, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginTop, ivas.gov.bisp.enumeration.R.attr.motionProgress, ivas.gov.bisp.enumeration.R.attr.motionStagger, ivas.gov.bisp.enumeration.R.attr.pathMotionArc, ivas.gov.bisp.enumeration.R.attr.pivotAnchor, ivas.gov.bisp.enumeration.R.attr.transitionEasing, ivas.gov.bisp.enumeration.R.attr.transitionPathRotate, ivas.gov.bisp.enumeration.R.attr.visibilityMode};
        g = new int[]{R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.barrierAllowsGoneWidgets, ivas.gov.bisp.enumeration.R.attr.barrierDirection, ivas.gov.bisp.enumeration.R.attr.barrierMargin, ivas.gov.bisp.enumeration.R.attr.chainUseRtl, ivas.gov.bisp.enumeration.R.attr.constraintSet, ivas.gov.bisp.enumeration.R.attr.constraint_referenced_ids, ivas.gov.bisp.enumeration.R.attr.flow_firstHorizontalBias, ivas.gov.bisp.enumeration.R.attr.flow_firstHorizontalStyle, ivas.gov.bisp.enumeration.R.attr.flow_firstVerticalBias, ivas.gov.bisp.enumeration.R.attr.flow_firstVerticalStyle, ivas.gov.bisp.enumeration.R.attr.flow_horizontalAlign, ivas.gov.bisp.enumeration.R.attr.flow_horizontalBias, ivas.gov.bisp.enumeration.R.attr.flow_horizontalGap, ivas.gov.bisp.enumeration.R.attr.flow_horizontalStyle, ivas.gov.bisp.enumeration.R.attr.flow_lastHorizontalBias, ivas.gov.bisp.enumeration.R.attr.flow_lastHorizontalStyle, ivas.gov.bisp.enumeration.R.attr.flow_lastVerticalBias, ivas.gov.bisp.enumeration.R.attr.flow_lastVerticalStyle, ivas.gov.bisp.enumeration.R.attr.flow_maxElementsWrap, ivas.gov.bisp.enumeration.R.attr.flow_verticalAlign, ivas.gov.bisp.enumeration.R.attr.flow_verticalBias, ivas.gov.bisp.enumeration.R.attr.flow_verticalGap, ivas.gov.bisp.enumeration.R.attr.flow_verticalStyle, ivas.gov.bisp.enumeration.R.attr.flow_wrapMode, ivas.gov.bisp.enumeration.R.attr.layoutDescription, ivas.gov.bisp.enumeration.R.attr.layout_constrainedHeight, ivas.gov.bisp.enumeration.R.attr.layout_constrainedWidth, ivas.gov.bisp.enumeration.R.attr.layout_constraintBaseline_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintBaseline_toBaselineOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_toBottomOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_toTopOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircle, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircleAngle, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircleRadius, ivas.gov.bisp.enumeration.R.attr.layout_constraintDimensionRatio, ivas.gov.bisp.enumeration.R.attr.layout_constraintEnd_toEndOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintEnd_toStartOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_begin, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_end, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_percent, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_default, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_max, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_min, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_percent, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_bias, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_chainStyle, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_weight, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_toLeftOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_toRightOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_toLeftOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_toRightOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintStart_toEndOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintStart_toStartOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintTag, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_toBottomOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_toTopOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_bias, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_chainStyle, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_weight, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_default, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_max, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_min, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_percent, ivas.gov.bisp.enumeration.R.attr.layout_editor_absoluteX, ivas.gov.bisp.enumeration.R.attr.layout_editor_absoluteY, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginBottom, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginEnd, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginLeft, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginRight, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginStart, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginTop, ivas.gov.bisp.enumeration.R.attr.layout_optimizationLevel};
        int i7 = 1 & 105;
        int i8 = (~i7) & (1 | 105);
        int i9 = i7 << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        i = new int[]{R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.pivotX, R.attr.pivotY, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, ivas.gov.bisp.enumeration.R.attr.animate_relativeTo, ivas.gov.bisp.enumeration.R.attr.barrierAllowsGoneWidgets, ivas.gov.bisp.enumeration.R.attr.barrierDirection, ivas.gov.bisp.enumeration.R.attr.barrierMargin, ivas.gov.bisp.enumeration.R.attr.chainUseRtl, ivas.gov.bisp.enumeration.R.attr.constraint_referenced_ids, ivas.gov.bisp.enumeration.R.attr.deriveConstraintsFrom, ivas.gov.bisp.enumeration.R.attr.drawPath, ivas.gov.bisp.enumeration.R.attr.flow_firstHorizontalBias, ivas.gov.bisp.enumeration.R.attr.flow_firstHorizontalStyle, ivas.gov.bisp.enumeration.R.attr.flow_firstVerticalBias, ivas.gov.bisp.enumeration.R.attr.flow_firstVerticalStyle, ivas.gov.bisp.enumeration.R.attr.flow_horizontalAlign, ivas.gov.bisp.enumeration.R.attr.flow_horizontalBias, ivas.gov.bisp.enumeration.R.attr.flow_horizontalGap, ivas.gov.bisp.enumeration.R.attr.flow_horizontalStyle, ivas.gov.bisp.enumeration.R.attr.flow_lastHorizontalBias, ivas.gov.bisp.enumeration.R.attr.flow_lastHorizontalStyle, ivas.gov.bisp.enumeration.R.attr.flow_lastVerticalBias, ivas.gov.bisp.enumeration.R.attr.flow_lastVerticalStyle, ivas.gov.bisp.enumeration.R.attr.flow_maxElementsWrap, ivas.gov.bisp.enumeration.R.attr.flow_verticalAlign, ivas.gov.bisp.enumeration.R.attr.flow_verticalBias, ivas.gov.bisp.enumeration.R.attr.flow_verticalGap, ivas.gov.bisp.enumeration.R.attr.flow_verticalStyle, ivas.gov.bisp.enumeration.R.attr.flow_wrapMode, ivas.gov.bisp.enumeration.R.attr.layout_constrainedHeight, ivas.gov.bisp.enumeration.R.attr.layout_constrainedWidth, ivas.gov.bisp.enumeration.R.attr.layout_constraintBaseline_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintBaseline_toBaselineOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_toBottomOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_toTopOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircle, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircleAngle, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircleRadius, ivas.gov.bisp.enumeration.R.attr.layout_constraintDimensionRatio, ivas.gov.bisp.enumeration.R.attr.layout_constraintEnd_toEndOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintEnd_toStartOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_begin, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_end, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_percent, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_default, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_max, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_min, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_percent, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_bias, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_chainStyle, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_weight, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_toLeftOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_toRightOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_toLeftOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_toRightOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintStart_toEndOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintStart_toStartOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintTag, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_toBottomOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_toTopOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_bias, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_chainStyle, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_weight, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_default, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_max, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_min, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_percent, ivas.gov.bisp.enumeration.R.attr.layout_editor_absoluteX, ivas.gov.bisp.enumeration.R.attr.layout_editor_absoluteY, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginBottom, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginEnd, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginLeft, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginRight, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginStart, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginTop, ivas.gov.bisp.enumeration.R.attr.motionProgress, ivas.gov.bisp.enumeration.R.attr.motionStagger, ivas.gov.bisp.enumeration.R.attr.pathMotionArc, ivas.gov.bisp.enumeration.R.attr.pivotAnchor, ivas.gov.bisp.enumeration.R.attr.transitionEasing, ivas.gov.bisp.enumeration.R.attr.transitionPathRotate};
        j = new int[]{ivas.gov.bisp.enumeration.R.attr.attributeName, ivas.gov.bisp.enumeration.R.attr.customBoolean, ivas.gov.bisp.enumeration.R.attr.customColorDrawableValue, ivas.gov.bisp.enumeration.R.attr.customColorValue, ivas.gov.bisp.enumeration.R.attr.customDimension, ivas.gov.bisp.enumeration.R.attr.customFloatValue, ivas.gov.bisp.enumeration.R.attr.customIntegerValue, ivas.gov.bisp.enumeration.R.attr.customPixelDimension, ivas.gov.bisp.enumeration.R.attr.customStringValue};
        int[] iArr2 = {R.attr.orientation, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.layout_marginStart, R.attr.layout_marginEnd, ivas.gov.bisp.enumeration.R.attr.barrierAllowsGoneWidgets, ivas.gov.bisp.enumeration.R.attr.barrierDirection, ivas.gov.bisp.enumeration.R.attr.barrierMargin, ivas.gov.bisp.enumeration.R.attr.chainUseRtl, ivas.gov.bisp.enumeration.R.attr.constraint_referenced_ids, ivas.gov.bisp.enumeration.R.attr.layout_constrainedHeight, ivas.gov.bisp.enumeration.R.attr.layout_constrainedWidth, ivas.gov.bisp.enumeration.R.attr.layout_constraintBaseline_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintBaseline_toBaselineOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_toBottomOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintBottom_toTopOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircle, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircleAngle, ivas.gov.bisp.enumeration.R.attr.layout_constraintCircleRadius, ivas.gov.bisp.enumeration.R.attr.layout_constraintDimensionRatio, ivas.gov.bisp.enumeration.R.attr.layout_constraintEnd_toEndOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintEnd_toStartOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_begin, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_end, ivas.gov.bisp.enumeration.R.attr.layout_constraintGuide_percent, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_default, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_max, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_min, ivas.gov.bisp.enumeration.R.attr.layout_constraintHeight_percent, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_bias, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_chainStyle, ivas.gov.bisp.enumeration.R.attr.layout_constraintHorizontal_weight, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_toLeftOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintLeft_toRightOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_toLeftOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintRight_toRightOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintStart_toEndOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintStart_toStartOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_creator, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_toBottomOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintTop_toTopOf, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_bias, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_chainStyle, ivas.gov.bisp.enumeration.R.attr.layout_constraintVertical_weight, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_default, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_max, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_min, ivas.gov.bisp.enumeration.R.attr.layout_constraintWidth_percent, ivas.gov.bisp.enumeration.R.attr.layout_editor_absoluteX, ivas.gov.bisp.enumeration.R.attr.layout_editor_absoluteY, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginBottom, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginEnd, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginLeft, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginRight, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginStart, ivas.gov.bisp.enumeration.R.attr.layout_goneMarginTop, ivas.gov.bisp.enumeration.R.attr.maxHeight, ivas.gov.bisp.enumeration.R.attr.maxWidth, ivas.gov.bisp.enumeration.R.attr.minHeight, ivas.gov.bisp.enumeration.R.attr.minWidth};
        int i13 = (((i11 ^ 41) | (i11 & 41)) << 1) - ((i11 & (-42)) | ((~i11) & 41));
        a = i13 % 128;
        int i14 = i13 % 2;
        c = iArr2;
        k = new int[]{ivas.gov.bisp.enumeration.R.attr.animate_relativeTo, ivas.gov.bisp.enumeration.R.attr.drawPath, ivas.gov.bisp.enumeration.R.attr.motionPathRotate, ivas.gov.bisp.enumeration.R.attr.motionStagger, ivas.gov.bisp.enumeration.R.attr.pathMotionArc, ivas.gov.bisp.enumeration.R.attr.transitionEasing};
        l = new int[]{R.attr.visibility, R.attr.alpha, ivas.gov.bisp.enumeration.R.attr.layout_constraintTag, ivas.gov.bisp.enumeration.R.attr.motionProgress, ivas.gov.bisp.enumeration.R.attr.visibilityMode};
        int i15 = i11 & 109;
        int i16 = (i11 ^ 109) | i15;
        int i17 = (i15 & i16) + (i15 | i16);
        a = i17 % 128;
        int i18 = i17 % 2;
        m = new int[]{R.attr.id, ivas.gov.bisp.enumeration.R.attr.constraints};
        f111o = new int[]{R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation};
        int[] iArr3 = {ivas.gov.bisp.enumeration.R.attr.constraints, ivas.gov.bisp.enumeration.R.attr.region_heightLessThan, ivas.gov.bisp.enumeration.R.attr.region_heightMoreThan, ivas.gov.bisp.enumeration.R.attr.region_widthLessThan, ivas.gov.bisp.enumeration.R.attr.region_widthMoreThan};
        int i19 = (-2) - ((i11 + 4) ^ (-1));
        a = i19 % 128;
        if (i19 % 2 == 0) {
            n = iArr3;
            p = new int[]{ivas.gov.bisp.enumeration.R.attr.keylines, ivas.gov.bisp.enumeration.R.attr.statusBarBackground};
            q = new int[]{R.attr.layout_gravity, ivas.gov.bisp.enumeration.R.attr.layout_anchor, ivas.gov.bisp.enumeration.R.attr.layout_anchorGravity, ivas.gov.bisp.enumeration.R.attr.layout_behavior, ivas.gov.bisp.enumeration.R.attr.layout_dodgeInsetEdges, ivas.gov.bisp.enumeration.R.attr.layout_insetEdge, ivas.gov.bisp.enumeration.R.attr.layout_keyline};
            int i20 = 93 / 0;
        } else {
            n = iArr3;
            p = new int[]{ivas.gov.bisp.enumeration.R.attr.keylines, ivas.gov.bisp.enumeration.R.attr.statusBarBackground};
            q = new int[]{R.attr.layout_gravity, ivas.gov.bisp.enumeration.R.attr.layout_anchor, ivas.gov.bisp.enumeration.R.attr.layout_anchorGravity, ivas.gov.bisp.enumeration.R.attr.layout_behavior, ivas.gov.bisp.enumeration.R.attr.layout_dodgeInsetEdges, ivas.gov.bisp.enumeration.R.attr.layout_insetEdge, ivas.gov.bisp.enumeration.R.attr.layout_keyline};
        }
        t = new byte[64];
        int i21 = (((i11 | 68) << 1) - (i11 ^ 68)) - 1;
        a = i21 % 128;
        if (i21 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ r(int i2, float f2, float f3) {
    }

    public static i N(ivas.gov.bisp.enumeration.p069co.j jVar) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 13;
        int i5 = -(-(i3 | 13));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (jVar.c.k(ivas.gov.bisp.enumeration.p068cn.j.a)) {
            ivas.gov.bisp.enumeration.p071cq.h hVar = new ivas.gov.bisp.enumeration.p071cq.h();
            int i8 = a;
            int i9 = i8 & 41;
            int i10 = ((i8 ^ 41) | i9) << 1;
            int i11 = -((i8 | 41) & (~i9));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            return hVar;
        }
        if (jVar.c.k(ivas.gov.bisp.enumeration.p056cb.j.d)) {
            ivas.gov.bisp.enumeration.p071cq.r rVar = new ivas.gov.bisp.enumeration.p071cq.r();
            int i14 = a + 113;
            b = i14 % 128;
            int i15 = i14 % 2;
            return rVar;
        }
        if (jVar.c.k(ivas.gov.bisp.enumeration.p056cb.j.a)) {
            ivas.gov.bisp.enumeration.p071cq.e eVar = new ivas.gov.bisp.enumeration.p071cq.e();
            int i16 = b + 29;
            a = i16 % 128;
            int i17 = i16 % 2;
            return eVar;
        }
        if (jVar.c.k(ivas.gov.bisp.enumeration.p056cb.j.b)) {
            ivas.gov.bisp.enumeration.p071cq.i iVar = new ivas.gov.bisp.enumeration.p071cq.i();
            int i18 = a;
            int i19 = i18 & 47;
            int i20 = ((((i18 ^ 47) | i19) << 1) - (~(-((i18 | 47) & (~i19))))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
            return iVar;
        }
        if (!jVar.c.k(ivas.gov.bisp.enumeration.p056cb.j.c)) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("unrecognised OID in digest algorithm identifier: ");
            sbW.append(jVar.c);
            throw new IllegalArgumentException(sbW.toString());
        }
        p pVar = new p();
        int i22 = a + 109;
        b = i22 % 128;
        int i23 = i22 % 2;
        return pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r5 = r1 & 117;
        r6 = r1 | 117;
        r7 = (r5 & r6) + (r5 | r6);
        ivas.gov.bisp.enumeration.p100w.r.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r6 <= r8) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6 <= r8) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ag(ivas.gov.bisp.enumeration.cP.P r5, int r6, int r7, int r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p100w.r.b
            r2 = r1 & 81
            r3 = r1 ^ 81
            r3 = r3 | r2
            r4 = r2 ^ r3
            r2 = r2 & r3
            int r2 = r2 << 1
            int r4 = r4 + r2
            int r2 = r4 % 128
            ivas.gov.bisp.enumeration.p100w.r.a = r2
            int r4 = r4 % r0
            if (r6 < r7) goto L37
            int r2 = r1 + 3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p100w.r.a = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L27
            r2 = 56
            int r2 = r2 / 0
            if (r6 > r8) goto L37
            goto L29
        L27:
            if (r6 > r8) goto L37
        L29:
            r5 = r1 & 117(0x75, float:1.64E-43)
            r6 = r1 | 117(0x75, float:1.64E-43)
            r7 = r5 & r6
            r5 = r5 | r6
            int r7 = r7 + r5
            int r5 = r7 % 128
            ivas.gov.bisp.enumeration.p100w.r.a = r5
            int r7 = r7 % r0
            return
        L37:
            ivas.gov.bisp.enumeration.cP.t r5 = r5.v()
            ivas.gov.bisp.enumeration.cP.M r0 = new ivas.gov.bisp.enumeration.cP.M
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.<init>(r5, r6, r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p100w.r.ag(ivas.gov.bisp.enumeration.cP.P, int, int, int):void");
    }

    public static final Map ah(Map map, aU aUVar) {
        Map mapAh;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 99;
        int i5 = i4 + ((i3 ^ 99) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.O.r.n(map, "<this>");
        if (map instanceof aa) {
            int i7 = b;
            int i8 = i7 & 23;
            int i9 = -(-(i7 | 23));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                mapAh = ah(((aa) map).b(), aUVar);
                int i11 = 12 / 0;
            } else {
                mapAh = ah(((aa) map).b(), aUVar);
            }
            int i12 = b;
            int i13 = i12 & 125;
            int i14 = -(-((i12 ^ 125) | i13));
            int i15 = (i13 & i14) + (i14 | i13);
            a = i15 % 128;
            int i16 = i15 % 2;
        } else {
            ab abVar = new ab(map, aUVar);
            int i17 = b;
            int i18 = ((i17 | 43) << 1) - (i17 ^ 43);
            a = i18 % 128;
            int i19 = i18 % 2;
            mapAh = abVar;
        }
        int i20 = a + 77;
        b = i20 % 128;
        if (i20 % 2 == 0) {
            return mapAh;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e4  */
    public static int i(Context context, String str) {
        int iMyPid;
        int iMyUid;
        String packageName;
        int iNoteProxyOpNoThrow;
        int iB;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 | 25;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 25)) & i4);
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        int i8 = 0;
        if (i7 % 2 != 0) {
            iMyPid = Process.myPid();
            iMyUid = Process.myUid();
            packageName = context.getPackageName();
            int i9 = 44 / 0;
        } else {
            iMyPid = Process.myPid();
            iMyUid = Process.myUid();
            packageName = context.getPackageName();
        }
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                int i10 = a;
                int i11 = ((i10 ^ 103) - (~(-(-((i10 & 103) << 1))))) - 1;
                int i12 = i11 % 128;
                b = i12;
                int i13 = i11 % 2;
                Object obj = null;
                if (packageName == null) {
                    int i14 = ((i12 & 28) + (i12 | 28)) - 1;
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null) {
                        int i16 = a;
                        int i17 = i16 & 33;
                        int i18 = i17 + ((i16 ^ 33) | i17);
                        int i19 = i18 % 128;
                        b = i19;
                        if (i18 % 2 != 0) {
                            int length = packagesForUid.length;
                            obj.hashCode();
                            throw null;
                        }
                        if (packagesForUid.length <= 0) {
                            int i20 = ((i19 & 93) - (~(-(-(i19 | 93))))) - 1;
                            a = i20 % 128;
                            int i21 = i20 % 2;
                        } else {
                            String str2 = packagesForUid[0];
                            int i22 = i16 & 119;
                            int i23 = ((i16 | 119) & (~i22)) + (i22 << 1);
                            b = i23 % 128;
                            int i24 = i23 % 2;
                            packageName = str2;
                        }
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid) {
                    int i25 = b;
                    int i26 = i25 ^ 13;
                    int i27 = ((((i25 & 13) | i26) << 1) - (~(-i26))) - 1;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    if (!(!Objects.equals(packageName2, packageName))) {
                        int i29 = a;
                        int i30 = i29 + 87;
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        int i32 = i29 & 53;
                        int i33 = ((i29 ^ 53) | i32) << 1;
                        int i34 = -((~i32) & (i29 | 53));
                        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        int i37 = i29 & 49;
                        int i38 = i29 | 49;
                        int i39 = (i37 & i38) + (i38 | i37);
                        b = i39 % 128;
                        int i40 = i39 % 2;
                        if (Build.VERSION.SDK_INT >= 29) {
                            int i41 = a;
                            int i42 = ((((i41 ^ 65) | (i41 & 65)) << 1) - (~(-(((~i41) & 65) | (i41 & (-66)))))) - 1;
                            b = i42 % 128;
                            if (i42 % 2 != 0) {
                                an.d(context);
                                Binder.getCallingUid();
                                obj.hashCode();
                                throw null;
                            }
                            AppOpsManager appOpsManagerD = an.d(context);
                            iNoteProxyOpNoThrow = an.b(appOpsManagerD, strPermissionToOp, Binder.getCallingUid(), packageName);
                            if (iNoteProxyOpNoThrow == 0) {
                                int i43 = b;
                                int i44 = (i43 & 61) + (i43 | 61);
                                a = i44 % 128;
                                if (i44 % 2 == 0) {
                                    iB = an.b(appOpsManagerD, strPermissionToOp, iMyUid, an.c(context));
                                    int i45 = 15 / 0;
                                } else {
                                    iB = an.b(appOpsManagerD, strPermissionToOp, iMyUid, an.c(context));
                                }
                                iNoteProxyOpNoThrow = iB;
                                int i46 = a;
                                int i47 = (i46 & 93) + (i46 | 93);
                                b = i47 % 128;
                                int i48 = i47 % 2;
                            }
                        } else {
                            iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                            int i49 = a;
                            int i50 = i49 & 85;
                            int i51 = (i49 | 85) & (~i50);
                            int i52 = -(-(i50 << 1));
                            int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
                            b = i53 % 128;
                            if (i53 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                        }
                    } else {
                        int i54 = b;
                        int i55 = i54 | 65;
                        int i56 = i55 << 1;
                        int i57 = -((~(i54 & 65)) & i55);
                        int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                        a = i58 % 128;
                        int i59 = i58 % 2;
                        iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                        int i60 = a;
                        int i61 = (((i60 | 88) << 1) - (i60 ^ 88)) - 1;
                        b = i61 % 128;
                        int i62 = i61 % 2;
                    }
                } else {
                    int i510 = b;
                    int i511 = i510 | 65;
                    int i512 = i511 << 1;
                    int i513 = -((~(i510 & 65)) & i511);
                    int i514 = (i512 ^ i513) + ((i513 & i512) << 1);
                    a = i514 % 128;
                    int i515 = i514 % 2;
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                    int i63 = a;
                    int i64 = (((i63 | 88) << 1) - (i63 ^ 88)) - 1;
                    b = i64 % 128;
                    int i65 = i64 % 2;
                }
                if (iNoteProxyOpNoThrow == 0) {
                    int i66 = a;
                    int i67 = ((i66 & 126) + (i66 | 126)) - 1;
                    b = i67 % 128;
                    int i68 = i67 % 2;
                } else {
                    int i69 = b;
                    int i70 = ((i69 & 74) + (i69 | 74)) - 1;
                    a = i70 % 128;
                    int i71 = i70 % 2;
                    i8 = -2;
                }
            } else {
                int i610 = a;
                int i611 = ((i610 & 126) + (i610 | 126)) - 1;
                b = i611 % 128;
                int i612 = i611 % 2;
            }
            int i72 = b;
            int i73 = (i72 ^ 45) + ((i72 & 45) << 1);
            a = i73 % 128;
            int i74 = i73 % 2;
            return i8;
        }
        int i75 = b;
        int i76 = (i75 & 21) + (i75 | 21);
        a = i76 % 128;
        int i77 = i76 % 2;
        int i78 = i75 & 115;
        int i79 = (i75 ^ 115) | i78;
        int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
        a = i80 % 128;
        if (i80 % 2 == 0) {
            int i81 = 2 % 4;
        }
        i8 = -1;
        int i710 = b;
        int i711 = (i710 ^ 45) + ((i710 & 45) << 1);
        a = i711 % 128;
        int i712 = i711 % 2;
        return i8;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public static final void k(Closeable closeable, Throwable th) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 73;
        int i7 = (i6 - (~((i5 ^ 73) | i6))) - 1;
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 == 0) {
            int i9 = 55 / 0;
            if (closeable != null) {
                if (th != null) {
                    int i10 = i8 ^ 45;
                    int i11 = -(-((i8 & 45) << 1));
                    i3 = ((i10 | i11) << 1) - (i10 ^ i11);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        closeable.close();
                        int i12 = 51 / 0;
                    } else {
                        closeable.close();
                    }
                    int i13 = a;
                    int i14 = i13 & 67;
                    int i15 = ((i13 ^ 67) | i14) << 1;
                    int i16 = -((i13 | 67) & (~i14));
                    int i17 = (i15 & i16) + (i16 | i15);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    return;
                }
                try {
                    closeable.close();
                    int i19 = b;
                    i2 = ((i19 | 17) << 1) - (i19 ^ 17);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i20 = 41 / 0;
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (th != th2) {
                        Q.c.c(th, th2);
                        int i21 = a;
                        int i22 = i21 ^ 47;
                        int i23 = ((i21 & 47) | i22) << 1;
                        int i24 = -i22;
                        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                    }
                }
            }
        } else if (closeable != null) {
            if (th != null) {
                closeable.close();
                int i110 = b;
                i2 = ((i110 | 17) << 1) - (i110 ^ 17);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i27 = 41 / 0;
                    return;
                }
                return;
            }
            int i111 = i8 ^ 45;
            int i112 = -(-((i8 & 45) << 1));
            i3 = ((i111 | i112) << 1) - (i111 ^ i112);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                closeable.close();
                int i113 = 51 / 0;
            } else {
                closeable.close();
            }
            int i114 = a;
            int i115 = i114 & 67;
            int i116 = ((i114 ^ 67) | i115) << 1;
            int i117 = -((i114 | 67) & (~i115));
            int i118 = (i116 & i117) + (i117 | i116);
            b = i118 % 128;
            int i119 = i118 % 2;
            return;
        }
        int i28 = a;
        int i29 = i28 & 113;
        int i30 = i29 + ((i28 ^ 113) | i29);
        b = i30 % 128;
        int i31 = i30 % 2;
    }

    public static ivas.gov.bisp.enumeration.cK.j w(ivas.gov.bisp.enumeration.cK.c cVar, ivas.gov.bisp.enumeration.cK.e eVar) {
        Object objNewInstance;
        int i2;
        int[][] iArr;
        int[] iArr2;
        int i3;
        int iJ;
        int[] iArr3;
        int[] iArr4;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 ^ 107;
        int i8 = 1;
        int i9 = (((i6 & 107) | i7) << 1) - i7;
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = cVar.c;
        int i12 = 1 << i11;
        int i13 = b;
        int i14 = i13 & 49;
        int i15 = (i13 | 49) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        int iL = eVar.l();
        int i19 = b;
        int i20 = (-2) - (((i19 ^ 112) + ((i19 & 112) << 1)) ^ (-1));
        a = i20 % 128;
        int i21 = i20 % 2;
        char c2 = 0;
        Object objNewInstance2 = Array.newInstance((Class<?>) Integer.TYPE, iL, i12);
        int i22 = b;
        int i23 = i22 & 77;
        int i24 = ((i22 ^ 77) | i23) << 1;
        int i25 = -((i22 | 77) & (~i23));
        int i26 = (i24 & i25) + (i25 | i24);
        int i27 = i26 % 128;
        a = i27;
        int i28 = i26 % 2;
        int[][] iArr5 = (int[][]) objNewInstance2;
        int[] iArr6 = new int[2];
        int i29 = i27 | 65;
        int i30 = i29 << 1;
        int i31 = -((~(i27 & 65)) & i29);
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        b = i32 % 128;
        if (i32 % 2 != 0) {
            iArr6[1] = i12;
            iArr6[0] = iL;
            objNewInstance = Array.newInstance((Class<?>) Integer.TYPE, iArr6);
        } else {
            iArr6[1] = i12;
            iArr6[0] = iL;
            objNewInstance = Array.newInstance((Class<?>) Integer.TYPE, iArr6);
        }
        int[][] iArr7 = (int[][]) objNewInstance;
        int i33 = b;
        int i34 = (i33 & 10) + (i33 | 10);
        int i35 = (i34 ^ (-1)) + (i34 << 1);
        a = i35 % 128;
        int i36 = i35 % 2;
        int i37 = 0;
        while (i37 < i12) {
            int i38 = a;
            int i39 = ((i38 ^ 33) | (i38 & 33)) << 1;
            int i40 = -(((~i38) & 33) | (i38 & (-34)));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            b = i41 % 128;
            int[] iArr8 = i41 % 2 != 0 ? iArr7[1] : iArr7[c2];
            int[] iArr9 = eVar.e;
            int i42 = eVar.d;
            int i43 = b;
            int i44 = i43 & 101;
            int i45 = (~i44) & (i43 | 101);
            int i46 = -(-(i44 << 1));
            int i47 = (i45 & i46) + (i45 | i46);
            int i48 = i47 % 128;
            a = i48;
            int i49 = i47 % 2;
            int i50 = iArr9[i42];
            int i51 = i48 & 1;
            int i52 = -(-(i48 | 1));
            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
            b = i53 % 128;
            int i54 = i53 % 2;
            while (true) {
                i42 = (i42 - (~((~i42) | i42))) - 1;
                if (i42 >= 0) {
                    int i55 = b;
                    int i56 = i55 & 63;
                    int i57 = (i55 ^ 63) | i56;
                    int i58 = (i56 & i57) + (i57 | i56);
                    a = i58 % 128;
                    int i59 = i58 % 2;
                    int iF = eVar.c.f(i50, i37);
                    int[] iArr10 = eVar.e;
                    int i60 = a;
                    int i61 = i60 & 101;
                    int i62 = (i61 - (~(-(-((i60 ^ 101) | i61))))) - 1;
                    int i63 = i62 % 128;
                    b = i63;
                    int i64 = i62 % 2;
                    int i65 = iArr10[i42];
                    i50 = ((~i65) & iF) | ((~iF) & i65);
                    int i66 = (-2) - (((i63 & 62) + (i63 | 62)) ^ (-1));
                    a = i66 % 128;
                    int i67 = i66 % 2;
                }
            }
            iArr8[i37] = cVar.d(i50);
            int i68 = i37 | 1;
            i37 = (i68 << 1) - (i68 & (~(i37 & 1)));
            int i69 = a;
            int i70 = i69 & 125;
            int i71 = (i69 | 125) & (~i70);
            int i72 = i70 << 1;
            int i73 = (i71 & i72) + (i71 | i72);
            b = i73 % 128;
            int i74 = i73 % 2;
            c2 = 0;
        }
        int i75 = 1;
        while (i75 < iL) {
            int i76 = b;
            int i77 = i76 & 67;
            int i78 = (i76 ^ 67) | i77;
            int i79 = (i77 ^ i78) + ((i77 & i78) << 1);
            a = i79 % 128;
            int i80 = i79 % 2;
            int i81 = i76 + 22;
            int i82 = (i81 ^ (-1)) + (i81 << 1);
            a = i82 % 128;
            int i83 = i82 % 2;
            int i84 = 0;
            while (i84 < i12) {
                int i85 = a;
                int i86 = ((i85 & 88) + (i85 | 88)) - 1;
                b = i86 % 128;
                if (i86 % 2 != 0) {
                    iArr3 = iArr7[i75];
                    iArr4 = iArr7[(((i75 ^ 1) | (i75 & 1)) << 1) - ((i75 & (-2)) | ((~i75) & 1))];
                } else {
                    iArr3 = iArr7[i75];
                    iArr4 = iArr7[(i75 ^ (-1)) + (i75 << 1)];
                }
                iArr3[i84] = cVar.f(iArr4[i84], i84);
                int i87 = i84 & 98;
                int i88 = (i84 | 98) & (~i87);
                int i89 = i87 << 1;
                int i90 = (i88 & i89) + (i88 | i89);
                int i91 = i90 & (-97);
                int i92 = i90 | (-97);
                i84 = ((i91 & i92) << 1) + (i91 ^ i92);
                int i93 = b;
                int i94 = i93 & 109;
                int i95 = -(-((i93 ^ 109) | i94));
                int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                a = i96 % 128;
                int i97 = i96 % 2;
            }
            int i98 = i75 | 1;
            int i99 = i98 << 1;
            int i100 = -((~(i75 & 1)) & i98);
            i75 = (i100 | i99) + (i99 & i100);
            int i101 = (-2) - ((b + 50) ^ (-1));
            a = i101 % 128;
            int i102 = i101 % 2;
        }
        int i103 = b;
        int i104 = i103 & 27;
        int i105 = (i103 | 27) & (~i104);
        int i106 = -(-(i104 << 1));
        int i107 = (i105 & i106) + (i105 | i106);
        a = i107 % 128;
        int i108 = i107 % 2;
        int i109 = 0;
        while (i109 < iL) {
            int i110 = a;
            int i111 = ((i110 ^ 20) + ((i110 & 20) << i8)) - i8;
            b = i111 % 128;
            int i112 = i111 % i4;
            int i113 = i110 & 65;
            int i114 = i110 | 65;
            int i115 = (i113 & i114) + (i114 | i113);
            b = i115 % 128;
            int i116 = i115 % i4;
            int i117 = 0;
            while (i117 < i12) {
                int i118 = b + 51;
                a = i118 % 128;
                int i119 = i118 % i4;
                int i120 = 0;
                while (i120 <= i109) {
                    int i121 = a;
                    int i122 = i121 & 53;
                    int i123 = (~i122) & (i121 | 53);
                    int i124 = -(-(i122 << i8));
                    int i125 = (i123 ^ i124) + ((i124 & i123) << i8);
                    b = i125 % 128;
                    if (i125 % i4 != 0) {
                        int i126 = iArr5[i109][i117];
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int[] iArr11 = iArr5[i109];
                    int i127 = iArr11[i117];
                    int[] iArr12 = iArr7[i120];
                    int i128 = i121 + 97;
                    b = i128 % 128;
                    if (i128 % i4 != 0) {
                        i3 = iArr12[i117];
                        iJ = eVar.j((iL << i120) << i109);
                    } else {
                        i3 = iArr12[i117];
                        int i129 = -(-i120);
                        int i130 = iL & i129;
                        iJ = eVar.j((-2) - ((((((iL ^ i129) | i130) << 1) - ((~i130) & (i129 | iL))) - (~(-i109))) ^ (-1)));
                    }
                    int i131 = b;
                    int i132 = i131 & 119;
                    int i133 = (i131 ^ 119) | i132;
                    int i134 = (i132 & i133) + (i132 | i133);
                    a = i134 % 128;
                    int i135 = i134 % 2;
                    int iF2 = cVar.f(i3, iJ);
                    iArr11[i117] = ((~iF2) & i127) | ((~i127) & iF2);
                    int i136 = i120 | 1;
                    int i137 = i136 << 1;
                    int i138 = -(i136 & (~(i120 & 1)));
                    i120 = (i137 ^ i138) + ((i138 & i137) << 1);
                    int i139 = b;
                    int i140 = (i139 & 105) + (i139 | 105);
                    a = i140 % 128;
                    int i141 = i140 % 2;
                    i4 = 2;
                    i8 = 1;
                }
                int i142 = (i117 ^ 122) + ((i117 & 122) << 1);
                int i143 = (i142 ^ (-1)) + (i142 << 1);
                int i144 = i143 & (-120);
                int i145 = -(-((i143 ^ (-120)) | i144));
                i117 = (i144 ^ i145) + ((i144 & i145) << 1);
                int i146 = a;
                int i147 = (i146 & 100) + (i146 | 100);
                int i148 = (i147 ^ (-1)) + (i147 << 1);
                b = i148 % 128;
                int i149 = i148 % 2;
                i4 = 2;
                i8 = 1;
            }
            i109 = (i109 & 1) + (i109 | 1);
            int i150 = b;
            int i151 = (i150 ^ 73) + ((i150 & 73) << 1);
            a = i151 % 128;
            i4 = 2;
            int i152 = i151 % 2;
            i8 = 1;
        }
        int[] iArr13 = new int[i4];
        int i153 = a;
        int i154 = ((i153 ^ 5) | (i153 & 5)) << 1;
        int i155 = -(((~i153) & 5) | (i153 & (-6)));
        int i156 = (i154 & i155) + (i155 | i154);
        int i157 = i156 % 128;
        b = i157;
        int i158 = i156 % 2;
        iArr13[1] = (i12 + 31) >>> 5;
        iArr13[0] = iL * i11;
        int i159 = i157 + 61;
        a = i159 % 128;
        if (i159 % 2 == 0) {
            iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr13);
            i2 = 0;
            int i160 = 94 / 0;
        } else {
            i2 = 0;
            iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr13);
        }
        int i161 = i2;
        while (i161 < i12) {
            int i162 = a;
            int i163 = ((i162 & 101) - (~(i162 | 101))) - 1;
            int i164 = i163 % 128;
            b = i164;
            int i165 = i163 % 2 != 0 ? i161 % 5 : i161 >>> 5;
            int i166 = i164 + 3;
            a = i166 % 128;
            int i167 = i166 % 2;
            int i168 = i2;
            while (i168 < iL) {
                int i169 = a;
                int i170 = (i169 & 41) + (i169 | 41);
                int i171 = i170 % 128;
                b = i171;
                int i172 = i170 % 2;
                int i173 = iArr5[i168][i161];
                int i174 = ((i171 | 97) << 1) - (i171 ^ 97);
                a = i174 % 128;
                int i175 = i174 % 2;
                int i176 = i2;
                while (i176 < i11) {
                    int i177 = b;
                    int i178 = ((i177 & (-58)) | ((~i177) & 57)) + ((i177 & 57) << 1);
                    a = i178 % 128;
                    if (i178 % 2 == 0) {
                        int i179 = i173 / i176;
                    } else if (((i173 >>> i176) & 1) != 0) {
                        int i180 = i177 & 27;
                        int i181 = (i177 ^ 27) | i180;
                        int i182 = (i180 ^ i181) + ((i180 & i181) << 1);
                        a = i182 % 128;
                        if (i182 % 2 == 0) {
                            iArr2 = iArr[((i168 / 0) * i11) >>> i176];
                        } else {
                            int i183 = i168 & 1;
                            int i184 = (i168 ^ 1) | i183;
                            iArr2 = iArr[((((i183 & i184) + (i183 | i184)) * i11) - (~(-(~(-i176))))) - 3];
                        }
                        int i185 = iArr2[i165];
                        int i186 = 1 << (i161 & 31);
                        int i187 = (~i186) & i185;
                        int i188 = (~i185) & i186;
                        int i189 = (i187 & i188) | (i187 ^ i188);
                        int i190 = ((i177 | 23) << 1) - (i177 ^ 23);
                        a = i190 % 128;
                        if (i190 % 2 == 0) {
                            iArr2[i165] = i189;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        iArr2[i165] = i189;
                        int i191 = i177 + 93;
                        a = i191 % 128;
                        int i192 = i191 % 2;
                    } else {
                        continue;
                    }
                    int i193 = i176 ^ (-37);
                    int i194 = -(-((i176 & (-37)) << 1));
                    i176 = (-2) - (((((i193 | i194) << 1) - (i193 ^ i194)) + 39) ^ (-1));
                    int i195 = i177 ^ 123;
                    int i196 = (((i177 & 123) | i195) << 1) - i195;
                    a = i196 % 128;
                    int i197 = i196 % 2;
                }
                int i198 = i168 & 1;
                int i199 = -(-((i168 ^ 1) | i198));
                i168 = ((i198 | i199) << 1) - (i199 ^ i198);
                int i200 = b + 57;
                a = i200 % 128;
                if (i200 % 2 == 0) {
                    int i201 = 2 / 5;
                }
                i2 = 0;
            }
            i161 = (i161 | 1) + (i161 & 1);
            i2 = 0;
        }
        ivas.gov.bisp.enumeration.cK.j jVar = new ivas.gov.bisp.enumeration.cK.j(i12, iArr);
        int i202 = b;
        int i203 = (i202 & 45) + (i202 | 45);
        a = i203 % 128;
        if (i203 % 2 != 0) {
            return jVar;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public /* synthetic */ r(ivas.gov.bisp.enumeration.p102y.r rVar) {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    public static final boolean B(char c2, char c3, boolean z) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 37;
        int i5 = (i3 ^ 37) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (c2 == c3) {
            int i8 = (i7 & (-32)) | ((~i7) & 31);
            int i9 = -(-((i7 & 31) << 1));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return true;
            }
            throw null;
        }
        boolean z2 = false;
        if (!z) {
            int i11 = (i7 ^ 89) + ((i7 & 89) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        if (upperCase != upperCase2) {
            int i13 = b;
            int i14 = ((((i13 ^ 17) | (i13 & 17)) << 1) - (~(-(((~i13) & 17) | (i13 & (-18)))))) - 1;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 81 / 0;
                if (Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
                    int i16 = a;
                    int i17 = (-2) - (((i16 & 40) + (i16 | 40)) ^ (-1));
                    int i18 = i17 % 128;
                    b = i18;
                    int i19 = i17 % 2;
                    int i20 = i18 + 89;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = true;
                } else {
                    int i22 = b;
                    int i23 = ((i22 ^ 15) | (i22 & 15)) << 1;
                    int i24 = -(((~i22) & 15) | (i22 & (-16)));
                    int i25 = (i23 & i24) + (i24 | i23);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                }
            } else if (Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
                int i110 = a;
                int i111 = (-2) - (((i110 & 40) + (i110 | 40)) ^ (-1));
                int i112 = i111 % 128;
                b = i112;
                int i113 = i111 % 2;
                int i27 = i112 + 89;
                a = i27 % 128;
                int i28 = i27 % 2;
                z2 = true;
            } else {
                int i29 = b;
                int i210 = ((i29 ^ 15) | (i29 & 15)) << 1;
                int i211 = -(((~i29) & 15) | (i29 & (-16)));
                int i212 = (i210 & i211) + (i211 | i210);
                a = i212 % 128;
                int i213 = i212 % 2;
            }
        } else {
            z2 = true;
        }
        int i30 = a;
        int i31 = (i30 ^ 119) + ((i30 & 119) << 1);
        b = i31 % 128;
        if (i31 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public static final boolean C(byte[] bArr, byte[] bArr2) {
        int i2 = 2 % 2;
        int i3 = a;
        boolean z = true;
        int i4 = (i3 | 113) << 1;
        int i5 = -(((~i3) & 113) | (i3 & (-114)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        Object obj = null;
        if (bArr != null) {
            int i9 = i7 ^ 77;
            int i10 = -(-((i7 & 77) << 1));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            int i12 = i11 % 128;
            a = i12;
            if (i11 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (bArr2 == null) {
                int i13 = (i7 ^ 47) + ((i7 & 47) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            } else {
                if (bArr.length != bArr2.length) {
                    int i15 = i12 + 79;
                    b = i15 % 128;
                    z = i15 % 2 != 0;
                    int i16 = i12 & 65;
                    int i17 = i16 + ((i12 ^ 65) | i16);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    return z;
                }
                int i19 = i7 + 121;
                a = i19 % 128;
                int i20 = i19 % 2;
                int i21 = 0;
                int i22 = 0;
                while (i21 < bArr.length) {
                    int i23 = b;
                    int i24 = ((i23 & (-116)) | ((~i23) & 115)) + ((i23 & 115) << 1);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    byte b2 = bArr[i21];
                    byte b3 = bArr2[i21];
                    int i26 = (b2 | b3) & (~(b2 & b3));
                    int i27 = ((~i26) & i22) | ((~i22) & i26);
                    int i28 = i22 & i26;
                    i22 = (i28 & i27) | (i27 ^ i28);
                    i21 = ((i21 ^ 1) - (~(-(-((i21 & 1) << 1))))) - 1;
                    int i29 = (((i23 | 101) << 1) - (~(-(i23 ^ 101)))) - 1;
                    a = i29 % 128;
                    int i30 = i29 % 2;
                }
                if (i22 == 0) {
                    int i31 = b;
                    int i32 = i31 & 125;
                    int i33 = (i32 - (~(-(-((i31 ^ 125) | i32))))) - 1;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                }
            }
            z = false;
        } else {
            z = false;
        }
        int i35 = a + 51;
        b = i35 % 128;
        if (i35 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public static void af(AbstractC0246t abstractC0246t, int i2, int i3, int i4) {
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 ^ 23;
        int i9 = (i7 & 23) << 1;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 84 / 0;
            if (i2 >= i3) {
                int i12 = (i7 & 125) + (i7 | 125);
                i5 = i12 % 128;
                a = i5;
                int i13 = i12 % 2;
                if (i2 <= i4) {
                    int i14 = i5 & 107;
                    int i15 = (i5 ^ 107) | i14;
                    int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    return;
                }
            }
        } else if (i2 >= i3) {
            int i18 = (i7 & 125) + (i7 | 125);
            i5 = i18 % 128;
            a = i5;
            int i19 = i18 % 2;
            if (i2 <= i4) {
                int i110 = i5 & 107;
                int i111 = (i5 ^ 107) | i110;
                int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                b = i112 % 128;
                int i113 = i112 % 2;
                return;
            }
        }
        throw new ivas.gov.bisp.enumeration.cP.M(abstractC0246t, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static final void ai(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (((i4 ^ 99) | (i4 & 99)) << 1) - (((~i4) & 99) | (i4 & (-100)));
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (i2 >= 0) {
            int i8 = i6 ^ 13;
            int i9 = -(-((i6 & 13) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            Object obj = null;
            if (i10 % 2 != 0) {
                byteBuffer2.remaining();
                obj.hashCode();
                throw null;
            }
            if (byteBuffer2.remaining() >= i2 && byteBuffer3.remaining() >= i2) {
                int i11 = b;
                int i12 = ((i11 | 109) << 1) - (i11 ^ 109);
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    byteBuffer.remaining();
                    obj.hashCode();
                    throw null;
                }
                if (byteBuffer.remaining() >= i2) {
                    int i13 = b;
                    int i14 = i13 ^ 49;
                    int i15 = ((i13 & 49) | i14) << 1;
                    int i16 = -i14;
                    int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                    int i18 = i17 % 128;
                    a = i18;
                    int i19 = i17 % 2;
                    int i20 = ((i18 & 38) + (i18 | 38)) - 1;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = 0;
                    while (i22 < i2) {
                        int i23 = b + 59;
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        byte b2 = byteBuffer2.get();
                        byte b3 = byteBuffer3.get();
                        int i25 = (~b3) & b2;
                        int i26 = (~b2) & b3;
                        byteBuffer.put((byte) ((i26 & i25) | (i25 ^ i26)));
                        int i27 = a;
                        int i28 = (((i27 & (-122)) | ((~i27) & 121)) - (~((i27 & 121) << 1))) - 1;
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        int i30 = (i22 & 87) + (i22 | 87);
                        i22 = ((i30 | (-86)) << 1) - (i30 ^ (-86));
                        int i31 = (i27 & 1) + (i27 | 1);
                        b = i31 % 128;
                        int i32 = i31 % 2;
                    }
                    int i33 = a;
                    int i34 = i33 & 67;
                    int i35 = -(-(i33 | 67));
                    int i36 = (i34 & i35) + (i35 | i34);
                    b = i36 % 128;
                    if (i36 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final String O(Context context, Uri uri) throws FileNotFoundException {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 39;
        int i5 = ((i3 | 39) & (~i4)) + (i4 << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            ivas.gov.bisp.enumeration.O.r.n(uri, "uri");
            int i6 = 26 / 0;
        } else {
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            ivas.gov.bisp.enumeration.O.r.n(uri, "uri");
        }
        ContentResolver contentResolver = context.getContentResolver();
        int i7 = b;
        int i8 = ((i7 ^ 41) | (i7 & 41)) << 1;
        int i9 = -(((~i7) & 41) | (i7 & (-42)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            int i12 = b;
            int i13 = i12 & 41;
            int i14 = i13 + ((i12 ^ 41) | i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            try {
                if (cursorQuery.moveToFirst()) {
                    int i16 = b;
                    int i17 = i16 & 29;
                    int i18 = -(-((i16 ^ 29) | i17));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    int i21 = a + 31;
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    ivas.gov.bisp.enumeration.O.r.m(string, "cursor.getString(cursor.…bleColumns.DISPLAY_NAME))");
                    k(cursorQuery, null);
                    int i23 = a;
                    int i24 = i23 & 91;
                    int i25 = -(-(i23 | 91));
                    int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    int i28 = ((i23 ^ 14) + ((i23 & 14) << 1)) - 1;
                    b = i28 % 128;
                    if (i28 % 2 != 0) {
                        int i29 = 35 / 0;
                    }
                    return string;
                }
                k(cursorQuery, null);
                int i30 = b;
                int i31 = i30 & 9;
                int i32 = (i31 - (~((i30 ^ 9) | i31))) - 1;
                a = i32 % 128;
                int i33 = i32 % 2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    k(cursorQuery, th);
                    throw th2;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not resolve filename of ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (((r4 ^ r3) + ((r3 & r4) << 1)) >= r11) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (((r5 ^ r3) + ((r3 & r5) << 1)) >= r11) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        r3 = new byte[r12];
        r4 = r1 & 3;
        r4 = r4 + ((r1 ^ 3) | r4);
        ivas.gov.bisp.enumeration.p100w.r.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r2 >= r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p100w.r.a;
        r4 = ((r1 & (-108)) | ((~r1) & 107)) + ((r1 & 107) << 1);
        ivas.gov.bisp.enumeration.p100w.r.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if ((r4 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        r4 = r8[r2 / r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        r4 = (r2 | r9) << 1;
        r5 = -(((~r9) & r2) | ((~r2) & r9));
        r4 = r8[(r4 & r5) + (r4 | r5)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        r5 = -(-r11);
        r5 = r10[((((~r5) & r2) | ((~r2) & r5)) - (~(-(-((r5 & r2) << 1))))) - 1];
        r6 = (~r5) & r4;
        r4 = (~r4) & r5;
        r3[r2] = (byte) ((r4 & r6) | (r6 ^ r4));
        r4 = (r2 & 26) + (r2 | 26);
        r2 = r4 & (-25);
        r4 = (r4 ^ (-25)) | r2;
        r2 = (r2 | r4) + (r2 & r4);
        r4 = ((r1 | 53) << 1) - (r1 ^ 53);
        ivas.gov.bisp.enumeration.p100w.r.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        if ((r4 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
    
        r1 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p100w.r.a;
        r9 = r8 & 7;
        r9 = r9 + ((r8 ^ 7) | r9);
        ivas.gov.bisp.enumeration.p100w.r.b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte[] ak(byte[] r8, int r9, byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p100w.r.ak(byte[], int, byte[], int, int):byte[]");
    }

    public static byte[] m(byte[]... bArr) throws GeneralSecurityException {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 42) + ((i4 & 42) << 1)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        int length = bArr.length;
        int i7 = ((i4 | 115) << 1) - (i4 ^ 115);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = a;
            int i12 = (((i11 | 24) << 1) - (i11 ^ 24)) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            byte[] bArr2 = bArr[i9];
            int length2 = bArr2.length;
            int i14 = (i11 & 27) + (i11 | 27);
            int i15 = i14 % 128;
            b = i15;
            int i16 = i14 % 2;
            int i17 = -(~(-length2));
            if (i10 > (-2) - (((Integer.MAX_VALUE ^ i17) + ((i17 & Integer.MAX_VALUE) << 1)) ^ (-1))) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            int i18 = (i15 & (-92)) | ((~i15) & 91);
            int i19 = (i15 & 91) << 1;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            int length3 = bArr2.length;
            if (i21 == 0) {
                i10 <<= length3;
                int i22 = (i9 & (-20)) | ((~i9) & 19);
                int i23 = (i9 & 19) << 1;
                i2 = (i22 ^ i23) + ((i23 & i22) << 1);
            } else {
                int i24 = -(-length3);
                int i25 = i10 & i24;
                int i26 = ((i10 ^ i24) | i25) << 1;
                int i27 = -((i10 | i24) & (~i25));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                int i29 = i9 ^ 1;
                int i30 = ((i9 & 1) | i29) << 1;
                int i31 = -i29;
                i2 = (i30 ^ i31) + ((i30 & i31) << 1);
                i10 = i28;
            }
            i9 = i2;
        }
        byte[] bArr3 = new byte[i10];
        int length4 = bArr.length;
        int i32 = a;
        int i33 = ((i32 | 94) << 1) - (i32 ^ 94);
        int i34 = (i33 ^ (-1)) + (i33 << 1);
        b = i34 % 128;
        int i35 = i34 % 2;
        int i36 = 0;
        int i37 = 0;
        while (i36 < length4) {
            int i38 = b;
            int i39 = (i38 ^ 59) + ((i38 & 59) << 1);
            a = i39 % 128;
            byte[] bArr4 = i39 % 2 == 0 ? bArr[i36] : bArr[i36];
            int i40 = i38 & 95;
            int i41 = (i38 ^ 95) | i40;
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            a = i42 % 128;
            int i43 = i42 % 2;
            System.arraycopy(bArr4, 0, bArr3, i37, bArr4.length);
            int i44 = -(-bArr4.length);
            int i45 = i37 & i44;
            int i46 = (i37 | i44) & (~i45);
            int i47 = i45 << 1;
            i37 = ((i46 | i47) << 1) - (i46 ^ i47);
            i36 = (i36 | 1) + (i36 & 1);
            int i48 = b + 49;
            a = i48 % 128;
            int i49 = i48 % 2;
        }
        int i50 = a;
        int i51 = i50 & 15;
        int i52 = (((i50 ^ 15) | i51) << 1) - ((i50 | 15) & (~i51));
        b = i52 % 128;
        int i53 = i52 % 2;
        return bArr3;
    }

    public static final j K(ivas.gov.bisp.enumeration.aB.r rVar, Class cls) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 45) << 1) - (i3 ^ 45);
        a = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.O.r.n(cls, "c");
        ivas.gov.bisp.enumeration.aO.j jVar = ivas.gov.bisp.enumeration.bX.P.c;
        List<j> list = rVar.z;
        int i6 = a;
        int i7 = i6 & 67;
        int i8 = ((i6 ^ 67) | i7) << 1;
        int i9 = -((i6 | 67) & (~i7));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = b;
        int i13 = (((i12 & (-42)) | ((~i12) & 41)) - (~(-(-((i12 & 41) << 1))))) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        for (j jVar2 : list) {
            int i15 = a;
            int i16 = (((i15 | 78) << 1) - (i15 ^ 78)) - 1;
            b = i16 % 128;
            int i17 = i16 % 2;
            ivas.gov.bisp.enumeration.aO.j jVar3 = ivas.gov.bisp.enumeration.bX.P.c;
            int i18 = a;
            int i19 = i18 & 7;
            int i20 = ((((i18 ^ 7) | i19) << 1) - (~(-((i18 | 7) & (~i19))))) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
            if (cls.isAssignableFrom(jVar2.getClass())) {
                int i22 = a;
                int i23 = i22 & 59;
                int i24 = ((i22 ^ 59) | i23) << 1;
                int i25 = -((i22 | 59) & (~i23));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                int i27 = i26 % 128;
                b = i27;
                int i28 = i26 % 2;
                int i29 = i27 ^ 81;
                int i30 = ((i27 & 81) | i29) << 1;
                int i31 = -i29;
                int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                a = i32 % 128;
                if (i32 % 2 == 0) {
                    int i33 = 8 / 0;
                }
                return jVar2;
            }
        }
        int i34 = a;
        int i35 = (i34 ^ 89) + ((i34 & 89) << 1);
        b = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 78 / 0;
        }
        return null;
    }

    public static byte[] z(String str) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & 15) + (i4 | 15);
        b = i5 % 128;
        if (i5 % 2 == 0 ? str.length() % 2 != 0 : str.length() % 4 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i6 = b;
        int i7 = (i6 & (-2)) | ((~i6) & 1);
        int i8 = (i6 & 1) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < length) {
            int i12 = a;
            int i13 = ((i12 | 116) << 1) - (i12 ^ 116);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i11 * 2;
            int iDigit = Character.digit(str.charAt(i16), 16);
            int i17 = a;
            int i18 = (i17 & 21) + (i17 | 21);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i16 & 1;
            int i21 = (i16 ^ 1) | i20;
            int iDigit2 = Character.digit(str.charAt((i20 & i21) + (i21 | i20)), 16);
            int i22 = a;
            int i23 = i22 & 27;
            int i24 = (~i23) & (i22 | 27);
            int i25 = i23 << 1;
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            int i27 = i26 % 2;
            if (iDigit != -1) {
                int i28 = i22 + 95;
                b = i28 % 128;
                int i29 = i28 % 2;
                if (iDigit2 != -1) {
                    int i30 = i22 + 37;
                    int i31 = i30 % 128;
                    b = i31;
                    int i32 = i30 % 2;
                    byte b2 = (byte) (((iDigit * 16) - (~(-(~(-(-iDigit2)))))) - 2);
                    int i33 = i31 + 59;
                    a = i33 % 128;
                    if (i33 % 2 == 0) {
                        bArr[i11] = b2;
                        int i34 = i11 & (-91);
                        int i35 = (i11 ^ (-91)) | i34;
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        int i37 = i36 & 114;
                        int i38 = ((i36 ^ 114) | i37) << 1;
                        int i39 = -((~i37) & (i36 | 114));
                        i2 = (i38 & i39) + (i38 | i39);
                    } else {
                        bArr[i11] = b2;
                        int i40 = (((i11 & 52) | ((~i11) & (-53))) - (~(-(-((i11 & (-53)) << 1))))) - 1;
                        int i41 = i40 & 54;
                        int i42 = (i40 ^ 54) | i41;
                        i2 = ((i41 | i42) << 1) - (i41 ^ i42);
                    }
                    i11 = i2;
                    int i43 = i31 & 7;
                    int i44 = i43 + ((i31 ^ 7) | i43);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                }
            }
            throw new IllegalArgumentException("input is not hexadecimal");
        }
        int i46 = b;
        int i47 = i46 & 15;
        int i48 = (i46 ^ 15) | i47;
        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
        a = i49 % 128;
        int i50 = i49 % 2;
        return bArr;
    }

    public static void g(Object obj, StringBuilder sb) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 81;
        int i6 = i5 + ((i4 ^ 81) | i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (obj == null) {
            sb.append("null");
            int i7 = a;
            int i8 = i7 & 13;
            int i9 = (i7 ^ 13) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        int i12 = b;
        int i13 = i12 & 47;
        int i14 = (i12 | 47) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        a = i16 % 128;
        int i17 = i16 % 2;
        if (simpleName.length() <= 0) {
            int i18 = a;
            int i19 = ((i18 & 38) + (i18 | 38)) - 1;
            b = i19 % 128;
            if (i19 % 2 != 0) {
                simpleName = obj.getClass().getName();
                i2 = 19;
            } else {
                simpleName = obj.getClass().getName();
                i2 = 46;
            }
            int iLastIndexOf = simpleName.lastIndexOf(i2);
            if (iLastIndexOf > 0) {
                int i20 = a;
                int i21 = ((i20 & 67) - (~(i20 | 67))) - 1;
                b = i21 % 128;
                int i22 = i21 % 2;
                int i23 = iLastIndexOf ^ 1;
                simpleName = simpleName.substring((((iLastIndexOf & 1) | i23) << 1) - i23);
                int i24 = b + 19;
                a = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        sb.append(simpleName);
        sb.append('{');
        int i26 = a;
        int i27 = (i26 ^ 95) + ((i26 & 95) << 1);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            int i28 = 95 / 0;
        } else {
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        int i29 = b;
        int i30 = i29 ^ 11;
        int i31 = ((((i29 & 11) | i30) << 1) - (~(-i30))) - 1;
        a = i31 % 128;
        if (i31 % 2 == 0) {
            throw null;
        }
    }

    public static byte[] n(byte[] bArr, byte[] bArr2) {
        long j2;
        byte[] bArr3;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long jU;
        int iMin;
        char c2;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = 1;
        int i5 = (((i3 & (-10)) | ((~i3) & 9)) - (~(-(-((i3 & 9) << 1))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i7 = (i3 ^ 39) + ((i3 & 39) << 1);
        a = i7 % 128;
        long jU2 = i7 % 2 == 0 ? ((U(bArr, 0) >>> 1) | 67108863) ^ 67108863 : U(bArr, 0) & 67108863;
        int i8 = b + 107;
        a = i8 % 128;
        int i9 = i8 % 2;
        long jU3 = (U(bArr, 3) >> 2) & 67108611;
        int i10 = b + 103;
        a = i10 % 128;
        int i11 = i10 % 2;
        long jU4 = (U(bArr, 6) >> 4) & 67092735;
        int i12 = a + 9;
        b = i12 % 128;
        int i13 = i12 % 2;
        long jU5 = (U(bArr, 9) >> 6) & 66076671;
        int i14 = a;
        int i15 = (i14 & 14) + (i14 | 14);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        b = i16 % 128;
        long jU6 = i16 % 2 != 0 ? ((U(bArr, 12) >> 65) % 67108863) + 1048575 : (U(bArr, 12) >> 8) & 1048575;
        long j17 = jU4 * 5;
        long j18 = jU5 * 5;
        int i17 = a;
        int i18 = i17 & 83;
        int i19 = i18 + ((i17 ^ 83) | i18);
        b = i19 % 128;
        long j19 = 0;
        if (i19 % 2 != 0) {
            j2 = jU6 / 5;
            bArr3 = new byte[122];
            j3 = 1;
            j4 = 1;
        } else {
            j2 = jU6 * 5;
            bArr3 = new byte[17];
            j3 = 0;
            j4 = 0;
        }
        int i20 = ((i17 & 66) + (i17 | 66)) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        long j20 = 0;
        long j21 = j4;
        int i22 = 0;
        long j22 = j3;
        long j23 = 0;
        while (i22 < bArr2.length) {
            int i23 = a;
            int i24 = (i23 ^ 101) + ((i23 & 101) << i4);
            b = i24 % 128;
            if (i24 % 2 != 0) {
                iMin = Math.min(22, bArr2.length >> i22);
            } else {
                int length = bArr2.length;
                int i25 = -i22;
                int i26 = length & i25;
                int i27 = (length ^ i25) | i26;
                iMin = Math.min(16, (i26 & i27) + (i26 | i27));
            }
            System.arraycopy(bArr2, i22, bArr3, 0, iMin);
            int i28 = b;
            int i29 = i28 & 67;
            int i30 = (i29 - (~((i28 ^ 67) | i29))) - 1;
            a = i30 % 128;
            int i31 = i30 % 2;
            bArr3[iMin] = 1;
            if (iMin != 16) {
                int i32 = (-2) - (((i28 & 94) + (i28 | 94)) ^ (-1));
                a = i32 % 128;
                int i33 = i32 % 2;
                Arrays.fill(bArr3, (((iMin | 1) << 1) - (~(-(iMin ^ 1)))) - 1, 17, (byte) 0);
                int i34 = a;
                int i35 = i34 ^ 3;
                int i36 = ((((i34 & 3) | i35) << 1) - (~(-i35))) - 1;
                b = i36 % 128;
                c2 = 2;
                int i37 = i36 % 2;
            } else {
                c2 = 2;
            }
            long jU7 = j23 + (U(bArr3, 0) & 67108863);
            long jU8 = j19 + ((U(bArr3, 3) >> c2) & 67108863);
            long jU9 = U(bArr3, 6) >> 4;
            int i38 = a;
            int i39 = i38 ^ 83;
            int i40 = ((((i38 & 83) | i39) << 1) - (~(-i39))) - 1;
            b = i40 % 128;
            int i41 = i40 % 2;
            long j24 = j22 + (jU9 & 67108863);
            long jU10 = j20 + ((U(bArr3, 9) >> 6) & 67108863);
            long jU11 = U(bArr3, 12) >> 8;
            int i42 = b;
            int i43 = ((i42 & 76) + (i42 | 76)) - 1;
            int i44 = i43 % 128;
            a = i44;
            int i45 = i43 % 2;
            long j25 = j21 + ((jU11 & 67108863) | ((long) (bArr3[16] << 24)));
            long j26 = jU3 * 5 * j25;
            long j27 = (jU10 * j17) + (j24 * j18) + (jU8 * j2) + (jU7 * jU2);
            int i46 = i44 & 25;
            int i47 = -(-((i44 ^ 25) | i46));
            int i48 = (i46 & i47) + (i46 | i47);
            int i49 = i48 % 128;
            b = i49;
            if (i48 % 2 != 0) {
                j9 = j26 * j27;
                j10 = ((j25 * j17) & ((jU10 - j18) - ((j24 | j2) % ((jU8 & jU2) + (jU7 - jU3))))) % (j9 >>> 89);
                j11 = j25 - j18;
            } else {
                j9 = j26 + j27;
                j10 = (j25 * j17) + (jU10 * j18) + (j24 * j2) + (jU8 * jU2) + (jU7 * jU3) + (j9 >> 26);
                j11 = j25 * j18;
            }
            int i50 = (i49 & 75) + (i49 | 75);
            int i51 = i50 % 128;
            a = i51;
            int i52 = i50 % 2;
            long j28 = j11 + (jU10 * j2) + (j24 * jU2) + (jU8 * jU3) + (jU7 * jU4) + (j10 >> 26);
            long j29 = j25 * j2;
            long j30 = jU10 * jU2;
            int i53 = i51 + 103;
            byte[] bArr4 = bArr3;
            b = i53 % 128;
            if (i53 % 2 != 0) {
                j12 = (j29 + (j30 ^ ((j24 / jU3) * ((jU8 / jU4) ^ (jU7 * jU5))))) | (j28 >>> 75);
                j13 = j25 / jU2;
                j14 = jU10 * jU3;
                j15 = j24 ^ jU4;
                j16 = jU8 | jU5;
            } else {
                j12 = j29 + j30 + (j24 * jU3) + (jU8 * jU4) + (jU7 * jU5) + (j28 >> 26);
                j13 = j25 * jU2;
                j14 = jU10 * jU3;
                j15 = j24 * jU4;
                j16 = jU8 * jU5;
            }
            Long.signum(jU7);
            long j31 = j13 + j14 + j15 + j16 + (jU7 * jU6) + (j12 >> 26);
            long j32 = ((j31 >> 26) * 5) + (j9 & 67108863);
            int i54 = i22 & 16;
            i22 = ((~i54) & (i22 | 16)) + (i54 << 1);
            int i55 = ((i51 & (-26)) | ((~i51) & 25)) + ((i51 & 25) << 1);
            int i56 = i55 % 128;
            b = i56;
            int i57 = i55 % 2;
            j22 = j28 & 67108863;
            long j33 = (j10 & 67108863) + (j32 >> 26);
            int i58 = i56 + 29;
            a = i58 % 128;
            int i59 = i58 % 2;
            j23 = j32 & 67108863;
            bArr3 = bArr4;
            i4 = 1;
            j20 = j12 & 67108863;
            j21 = j31 & 67108863;
            j19 = j33;
        }
        long j34 = j22 + (j19 >> 26);
        long j35 = j34 & 67108863;
        long j36 = j20 + (j34 >> 26);
        long j37 = j36 & 67108863;
        long j38 = j21 + (j36 >> 26);
        long j39 = j38 & 67108863;
        int i60 = a;
        int i61 = ((i60 & (-62)) | ((~i60) & 61)) + ((i60 & 61) << 1);
        b = i61 % 128;
        if (i61 % 2 != 0) {
            long j40 = ((j38 >>> 2) / 5) - j23;
            j5 = j40 + 67108863;
            j6 = (j19 / 67108863) % (j40 >>> 127);
            j7 = j5 | 5;
        } else {
            long j41 = ((j38 >> 26) * 5) + j23;
            j5 = j41 & 67108863;
            j6 = (j19 & 67108863) + (j41 >> 26);
            j7 = j5 + 5;
        }
        long j42 = j6 + (j7 >> 26);
        long j43 = j35 + (j42 >> 26);
        long j44 = j37 + (j43 >> 26);
        long j45 = (j39 + (j44 >> 26)) - 67108864;
        long j46 = j45 >> 63;
        int i62 = i60 + 48;
        int i63 = (i62 ^ (-1)) + (i62 << 1);
        int i64 = i63 % 128;
        b = i64;
        int i65 = i63 % 2;
        long j47 = j46 ^ (-1);
        long j48 = (j6 & j46) | (j42 & 67108863 & j47);
        long j49 = (j35 & j46) | (j43 & 67108863 & j47);
        int i66 = (i64 & (-108)) | ((~i64) & 107);
        int i67 = (i64 & 107) << 1;
        int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
        a = i68 % 128;
        int i69 = i68 % 2;
        long j50 = (j44 & 67108863 & j47) | (j37 & j46);
        long jU12 = U(bArr, 16) + (((j7 & 67108863 & j47) | (j5 & j46) | (j48 << 26)) & 4294967295L);
        long jU13 = U(bArr, 20);
        long j51 = j48 >> 6;
        int i70 = a;
        int i71 = ((((i70 ^ 83) | (i70 & 83)) << 1) - (~(-((i70 & (-84)) | (83 & (~i70)))))) - 1;
        b = i71 % 128;
        if (i71 % 2 != 0) {
            j8 = (jU13 - ((j51 - (j49 << 63)) ^ 4294967295L)) % (jU12 >>> 6);
            jU = (U(bArr, 66) % (((j49 >>> 91) * (j50 << 51)) * 4294967295L)) / (j8 << 14);
        } else {
            j8 = jU13 + ((j51 | (j49 << 20)) & 4294967295L) + (jU12 >> 32);
            jU = U(bArr, 24) + (((j49 >> 12) | (j50 << 14)) & 4294967295L) + (j8 >> 32);
        }
        int i72 = b;
        int i73 = i72 & 55;
        int i74 = i72 | 55;
        int i75 = (i73 & i74) + (i74 | i73);
        a = i75 % 128;
        int i76 = i75 % 2;
        long jU14 = U(bArr, 28);
        byte[] bArr5 = new byte[16];
        ac(bArr5, jU12 & 4294967295L, 0);
        ac(bArr5, j8 & 4294967295L, 4);
        ac(bArr5, jU & 4294967295L, 8);
        int i77 = a;
        int i78 = i77 & 59;
        int i79 = -(-((i77 ^ 59) | i78));
        int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
        b = i80 % 128;
        if (i80 % 2 != 0) {
            ac(bArr5, (((((j50 >> 1) | (((j45 ^ j47) - (j39 / j46)) << 22)) / 4294967295L) + jU14) - (jU >>> 82)) - 4294967295L, 108);
        } else {
            ac(bArr5, ((((j50 >> 18) | (((j45 & j47) | (j39 & j46)) << 8)) & 4294967295L) + jU14 + (jU >> 32)) & 4294967295L, 12);
        }
        return bArr5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.cA.a) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        r10 = (ivas.gov.bisp.enumeration.cA.a) r10;
        r1 = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p076cv.P.e, new ivas.gov.bisp.enumeration.p076cv.l(ivas.gov.bisp.enumeration.p078cx.z.d(r10.F()))), r10.c());
        r10 = ivas.gov.bisp.enumeration.p100w.r.b;
        r2 = (r10 ^ 49) + ((r10 & 49) << 1);
        ivas.gov.bisp.enumeration.p100w.r.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.cX.c) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p076cv.P.g), ((ivas.gov.bisp.enumeration.cX.c) r10).c());
        r10 = ivas.gov.bisp.enumeration.p100w.r.b;
        r2 = r10 & 63;
        r2 = r2 + ((r10 ^ 63) | r2);
        ivas.gov.bisp.enumeration.p100w.r.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.p077cw.v) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        r2 = r1 ^ 63;
        r1 = ((r1 & 63) | r2) << 1;
        r2 = -r2;
        r3 = ((r1 | r2) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.p100w.r.b = r3 % 128;
        r3 = r3 % 2;
        r1 = ivas.gov.bisp.enumeration.p086i.a.h();
        r1.p(1);
        r1.k((ivas.gov.bisp.enumeration.p077cw.v) r10);
        r1 = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p067cm.j.a), new ivas.gov.bisp.enumeration.p063ci.B(r1.j()));
        r10 = ivas.gov.bisp.enumeration.p100w.r.a + 21;
        ivas.gov.bisp.enumeration.p100w.r.b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00df, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.p077cw.Q) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
    
        r1 = r2 ^ 97;
        r2 = ((r2 & 97) | r1) << 1;
        r1 = -r1;
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.p100w.r.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        if ((r3 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        r10 = (ivas.gov.bisp.enumeration.p077cw.Q) r10;
        r1 = ivas.gov.bisp.enumeration.p086i.a.h();
        r1.p(r10.S);
        r1.k(r10.R);
        r1 = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p067cm.j.a), new ivas.gov.bisp.enumeration.p063ci.B(r1.j()));
        r10 = ivas.gov.bisp.enumeration.p100w.r.b;
        r2 = (((r10 & (-8)) | ((~r10) & 7)) - (~((r10 & 7) << 1))) - 1;
        ivas.gov.bisp.enumeration.p100w.r.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x012f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0130, code lost:
    
        ivas.gov.bisp.enumeration.p086i.a.h();
        r10 = ((ivas.gov.bisp.enumeration.p077cw.Q) r10).S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0137, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013a, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.cC.R) == true) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013e, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.cC.C0235m) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0140, code lost:
    
        r1 = (r2 & 27) + (r2 | 27);
        ivas.gov.bisp.enumeration.p100w.r.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014a, code lost:
    
        if ((r1 % 2) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014c, code lost:
    
        r10 = (ivas.gov.bisp.enumeration.cC.C0235m) r10;
        r1 = ivas.gov.bisp.enumeration.cC.v.d(r10.V);
        r2 = ivas.gov.bisp.enumeration.cC.v.d(r10.S);
        r3 = r10.c();
        r6 = r3.length;
        r1 = r1.length;
        r7 = ivas.gov.bisp.enumeration.p100w.r.b;
        r8 = r7 & 113;
        r7 = (r7 | 113) & (~r8);
        r8 = -(-(r8 << 1));
        r9 = (r7 ^ r8) + ((r7 & r8) << 1);
        ivas.gov.bisp.enumeration.p100w.r.a = r9 % 128;
        r9 = r9 % 2;
        r2 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017b, code lost:
    
        if (r6 <= ((r1 ^ r2) + ((r1 & r2) << 1))) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017d, code lost:
    
        r10 = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.dg.j.b), new ivas.gov.bisp.enumeration.p063ci.B(r3));
        r1 = ivas.gov.bisp.enumeration.p100w.r.b;
        r2 = (((r1 ^ 11) | (r1 & 11)) << 1) - (((~r1) & 11) | (r1 & (-12)));
        ivas.gov.bisp.enumeration.p100w.r.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a2, code lost:
    
        if ((r2 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a4, code lost:
    
        r0 = 36 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a8, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a9, code lost:
    
        r1 = ivas.gov.bisp.enumeration.p076cv.P.h;
        r2 = r10.T;
        r3 = r2.f;
        r6 = ivas.gov.bisp.enumeration.p100w.r.b;
        r7 = r6 ^ 11;
        r6 = ((r6 & 11) | r7) << 1;
        r7 = -r7;
        r8 = ((r6 | r7) << 1) - (r6 ^ r7);
        ivas.gov.bisp.enumeration.p100w.r.a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c2, code lost:
    
        if ((r8 % 2) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c4, code lost:
    
        r7 = new ivas.gov.bisp.enumeration.p069co.j(r1, new ivas.gov.bisp.enumeration.p076cv.o(r3, r2.g, ivas.gov.bisp.enumeration.p078cx.z.f(r10.a)));
        r1 = ivas.gov.bisp.enumeration.p100w.r.b;
        r2 = (r1 ^ 12) + ((r1 & 12) << 1);
        r1 = (r2 ^ (-1)) + (r2 << 1);
        ivas.gov.bisp.enumeration.p100w.r.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e7, code lost:
    
        if ((r1 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e9, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p069co.c(r7, new ivas.gov.bisp.enumeration.p076cv.x(ivas.gov.bisp.enumeration.cC.v.d(r10.V), ivas.gov.bisp.enumeration.cC.v.d(r10.S)));
        r10 = ivas.gov.bisp.enumeration.p100w.r.b;
        r1 = (r10 & (-118)) | ((~r10) & 117);
        r10 = -(-((r10 & 117) << 1));
        r3 = ((r1 | r10) << 1) - (r10 ^ r1);
        ivas.gov.bisp.enumeration.p100w.r.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0216, code lost:
    
        if ((r3 % 2) != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0218, code lost:
    
        r10 = 70 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x021c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x021d, code lost:
    
        ivas.gov.bisp.enumeration.cC.v.d(r10.V);
        r10 = r10.S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0224, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0225, code lost:
    
        r0 = r2.g;
        r10 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0229, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022a, code lost:
    
        r10 = (ivas.gov.bisp.enumeration.cC.C0235m) r10;
        ivas.gov.bisp.enumeration.cC.v.d(r10.V);
        r10 = r10.S;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0236, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x023e, code lost:
    
        throw new java.io.IOException("key parameters not recognized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x023f, code lost:
    
        r2 = r1 & 39;
        r1 = (r1 ^ 39) | r2;
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.p100w.r.b = r3 % 128;
        r3 = r3 % 2;
        r10 = (ivas.gov.bisp.enumeration.cC.R) r10;
        r1 = ivas.gov.bisp.enumeration.cC.v.d(r10.W);
        r2 = r10.V;
        r3 = ivas.gov.bisp.enumeration.p100w.r.a;
        r6 = (r3 & (-88)) | ((~r3) & 87);
        r3 = -(-((r3 & 87) << 1));
        r7 = (r6 & r3) + (r3 | r6);
        ivas.gov.bisp.enumeration.p100w.r.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.p079cy.r) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026e, code lost:
    
        if ((r7 % 2) != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0270, code lost:
    
        r2 = ivas.gov.bisp.enumeration.cC.v.d(r2);
        r3 = r10.getEncoded();
        r5 = r3.length;
        r6 = r1.length;
        r7 = -(-r2.length);
        r8 = r6 | r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0288, code lost:
    
        if (r5 <= (((r8 << 1) - (~(-((~(r6 & r7)) & r8)))) - 1)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028a, code lost:
    
        r10 = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.dg.j.a), new ivas.gov.bisp.enumeration.p063ci.B(r3));
        r1 = ivas.gov.bisp.enumeration.p100w.r.a;
        r2 = r1 ^ 15;
        r1 = -(-((r1 & 15) << 1));
        r3 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.p100w.r.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02ad, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02ae, code lost:
    
        r5 = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(ivas.gov.bisp.enumeration.p076cv.P.f, new ivas.gov.bisp.enumeration.p076cv.a(r10.U.e, ivas.gov.bisp.enumeration.p078cx.z.f(r10.F()))), new ivas.gov.bisp.enumeration.p076cv.N(r1, r2));
        r10 = ivas.gov.bisp.enumeration.p100w.r.a;
        r1 = (r10 & 97) + (r10 | 97);
        ivas.gov.bisp.enumeration.p100w.r.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02dc, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02dd, code lost:
    
        ivas.gov.bisp.enumeration.cC.v.d(r2);
        r10 = r10.getEncoded().length;
        r10 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02e6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((r10 instanceof ivas.gov.bisp.enumeration.p079cy.r) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r10 = (ivas.gov.bisp.enumeration.p079cy.r) r10;
        r2 = new ivas.gov.bisp.enumeration.p069co.c(ivas.gov.bisp.enumeration.p078cx.z.c(r10.S), r10.c());
        r10 = ivas.gov.bisp.enumeration.p100w.r.b;
        r1 = (((r10 | 92) << 1) - (r10 ^ 92)) - 1;
        ivas.gov.bisp.enumeration.p100w.r.a = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.p069co.c t(ivas.gov.bisp.enumeration.O.r r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p100w.r.t(ivas.gov.bisp.enumeration.O.r):ivas.gov.bisp.enumeration.co.c");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0114  */
    /* JADX WARN: Code duplicated, block: B:30:0x0159  */
    /* JADX WARN: Code duplicated, block: B:31:0x015c  */
    /* JADX WARN: Code duplicated, block: B:61:0x02af A[PHI: r9
  0x02af: PHI (r9v22 ivas.gov.bisp.enumeration.cJ.a$bEr) = (r9v21 ivas.gov.bisp.enumeration.cJ.a$bEr), (r9v28 ivas.gov.bisp.enumeration.cJ.a$bEr) binds: [B:60:0x02ad, B:57:0x02a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:70:0x02f8 A[PHI: r4
  0x02f8: PHI (r4v10 ivas.gov.bisp.enumeration.cJ.a$bEr) = (r4v9 ivas.gov.bisp.enumeration.cJ.a$bEr), (r4v17 ivas.gov.bisp.enumeration.cJ.a$bEr) binds: [B:69:0x02f6, B:66:0x02f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x030d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0316  */
    /* JADX WARN: Code duplicated, block: B:78:0x0341  */
    /* JADX WARN: Code duplicated, block: B:83:0x035e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0373  */
    /* JADX WARN: Code duplicated, block: B:90:0x0383  */
    public static e ab() {
        ivas.gov.bisp.enumeration.cJ.a.bEt bet;
        int i2;
        int i3;
        ivas.gov.bisp.enumeration.cJ.a.bEr ber;
        ivas.gov.bisp.enumeration.cJ.a.bEr[] berArr;
        HashSet hashSet;
        HashSet hashSet2;
        int length;
        int i4;
        ivas.gov.bisp.enumeration.cJ.a.bEo beo;
        ivas.gov.bisp.enumeration.cJ.a.bEo beo2;
        int i5;
        int i6;
        ivas.gov.bisp.enumeration.cJ.a.bEr ber2;
        int i7;
        int i8;
        char c2;
        int i9 = 2 % 2;
        int i10 = a;
        int i11 = ((i10 & 22) + (i10 | 22)) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        if (r == null) {
            ivas.gov.bisp.enumeration.cJ.a aVar = new ivas.gov.bisp.enumeration.cJ.a();
            aVar.h();
            ivas.gov.bisp.enumeration.cJ.a.bEs bes = new ivas.gov.bisp.enumeration.cJ.a.bEs("P");
            int i13 = a;
            int i14 = 1;
            int i15 = ((i13 | 31) << 1) - (i13 ^ 31);
            b = i15 % 128;
            int i16 = i15 % 2;
            aVar.e(bes, bes);
            aVar.f(0);
            int i17 = b;
            int i18 = i17 & 35;
            int i19 = (i17 ^ 35) | i18;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            aVar.g("Y");
            aVar.f(1);
            int i22 = b + 111;
            a = i22 % 128;
            if (i22 % 2 == 0) {
                aVar.g("M");
                aVar.f(5);
            } else {
                aVar.g("M");
                aVar.f(2);
            }
            aVar.g("W");
            aVar.f(3);
            int i23 = b;
            int i24 = (((i23 | 106) << 1) - (i23 ^ 106)) - 1;
            a = i24 % 128;
            Object obj = null;
            if (i24 % 2 == 0) {
                aVar.g("D");
                aVar.h();
                throw null;
            }
            aVar.g("D");
            aVar.h();
            List<Object> listSubList = aVar.f;
            if (listSubList.size() == 0) {
                ivas.gov.bisp.enumeration.cJ.a.bEs bes2 = ivas.gov.bisp.enumeration.cJ.a.bEs.c;
                ivas.gov.bisp.enumeration.cJ.a.bEt bet2 = new ivas.gov.bisp.enumeration.cJ.a.bEt("T", "T", null, bes2, bes2, false, true);
                int i25 = b + 59;
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    aVar.e(bet2, bet2);
                    int i26 = 48 / 0;
                } else {
                    aVar.e(bet2, bet2);
                }
            } else {
                int size = listSubList.size();
                int i27 = (-2) - ((b + 94) ^ (-1));
                a = i27 % 128;
                int i28 = i27 % 2;
                while (true) {
                    int i29 = ~size;
                    int i30 = size << 1;
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    if (i31 >= 0) {
                        int i32 = a;
                        int i33 = i32 & 21;
                        int i34 = -(-((i32 ^ 21) | i33));
                        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                        b = i35 % 128;
                        if (i35 % 2 != 0) {
                            int i36 = 64 / 0;
                            if (!(!(listSubList.get(i31) instanceof ivas.gov.bisp.enumeration.cJ.a.bEt))) {
                                int i37 = b;
                                i2 = (i37 ^ 59) + ((i37 & 59) << 1);
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                bet = (ivas.gov.bisp.enumeration.cJ.a.bEt) listSubList.get(i31);
                                int i38 = b;
                                int i39 = (((i38 | 98) << 1) - (i38 ^ 98)) - 1;
                                a = i39 % 128;
                                int i40 = i39 % 2;
                                int size2 = listSubList.size();
                                int i41 = b;
                                int i42 = i41 ^ 123;
                                int i43 = (i41 & 123) << 1;
                                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                                a = i44 % 128;
                                int i45 = i44 % 2;
                                listSubList = listSubList.subList(i31 + 1, size2);
                                int i46 = a;
                                int i47 = i46 & 67;
                                int i48 = -(-((i46 ^ 67) | i47));
                                i3 = (i47 ^ i48) + ((i48 & i47) << 1);
                                b = i3 % 128;
                                if (i3 % 2 != 0) {
                                    int i49 = 3 / 2;
                                }
                            } else {
                                int i50 = i31 ^ 13;
                                int i51 = -(-((i31 & 13) << 1));
                                int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                                int i53 = i52 & (-14);
                                size = (i53 - (~((i52 ^ (-14)) | i53))) - 1;
                                int i54 = b;
                                int i55 = (i54 ^ 51) + ((i54 & 51) << 1);
                                a = i55 % 128;
                                int i56 = i55 % 2;
                            }
                        } else if (listSubList.get(i31) instanceof ivas.gov.bisp.enumeration.cJ.a.bEt) {
                            int i310 = b;
                            i2 = (i310 ^ 59) + ((i310 & 59) << 1);
                            a = i2 % 128;
                            if (i2 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            bet = (ivas.gov.bisp.enumeration.cJ.a.bEt) listSubList.get(i31);
                            int i311 = b;
                            int i312 = (((i311 | 98) << 1) - (i311 ^ 98)) - 1;
                            a = i312 % 128;
                            int i410 = i312 % 2;
                            int size3 = listSubList.size();
                            int i411 = b;
                            int i412 = i411 ^ 123;
                            int i413 = (i411 & 123) << 1;
                            int i414 = ((i412 | i413) << 1) - (i413 ^ i412);
                            a = i414 % 128;
                            int i415 = i414 % 2;
                            listSubList = listSubList.subList(i31 + 1, size3);
                            int i416 = a;
                            int i417 = i416 & 67;
                            int i418 = -(-((i416 ^ 67) | i417));
                            i3 = (i417 ^ i418) + ((i418 & i417) << 1);
                            b = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i419 = 3 / 2;
                            }
                        } else {
                            int i57 = i31 ^ 13;
                            int i58 = -(-((i31 & 13) << 1));
                            int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
                            int i510 = i59 & (-14);
                            size = (i510 - (~((i59 ^ (-14)) | i510))) - 1;
                            int i511 = b;
                            int i512 = (i511 ^ 51) + ((i511 & 51) << 1);
                            a = i512 % 128;
                            int i513 = i512 % 2;
                        }
                    } else {
                        bet = null;
                    }
                    if (bet != null) {
                        int i60 = b;
                        int i61 = i60 | 93;
                        int i62 = i61 << 1;
                        int i63 = -((~(i60 & 93)) & i61);
                        int i64 = (i62 & i63) + (i63 | i62);
                        a = i64 % 128;
                        int i65 = i64 % 2;
                        if (listSubList.size() == 0) {
                            throw new IllegalStateException("Cannot have two adjacent separators");
                        }
                    }
                    Object[] objArrD = ivas.gov.bisp.enumeration.cJ.a.d(listSubList);
                    listSubList.clear();
                    ivas.gov.bisp.enumeration.cJ.a.bEt bet3 = new ivas.gov.bisp.enumeration.cJ.a.bEt("T", "T", null, (ivas.gov.bisp.enumeration.cJ.J) objArrD[0], (ivas.gov.bisp.enumeration.cJ.o) objArrD[1], false, true);
                    int i66 = b;
                    int i67 = ((i66 & 64) + (i66 | 64)) - 1;
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    listSubList.add(bet3);
                    int i69 = a;
                    int i70 = (((i69 | 34) << 1) - (i69 ^ 34)) - 1;
                    b = i70 % 128;
                    int i71 = i70 % 2;
                    listSubList.add(bet3);
                    int i72 = a;
                    int i73 = ((i72 | 51) << 1) - (i72 ^ 51);
                    b = i73 % 128;
                    int i74 = i73 % 2;
                }
            }
            aVar.f(4);
            aVar.g("H");
            int i75 = a;
            int i76 = i75 | 1;
            int i77 = (i76 << 1) - ((~(i75 & 1)) & i76);
            b = i77 % 128;
            if (i77 % 2 != 0) {
                aVar.f(3);
            } else {
                aVar.f(5);
            }
            aVar.g("M");
            aVar.f(9);
            int i78 = a;
            int i79 = ((i78 & (-50)) | ((~i78) & 49)) + ((i78 & 49) << 1);
            b = i79 % 128;
            int i80 = i79 % 2;
            aVar.g("S");
            List<Object> list = aVar.f;
            int i81 = a;
            int i82 = i81 & 123;
            int i83 = i82 + ((i81 ^ 123) | i82);
            b = i83 % 128;
            if (i83 % 2 != 0) {
                ivas.gov.bisp.enumeration.cJ.a.c(list, aVar.h, aVar.g);
                throw null;
            }
            e eVarC = ivas.gov.bisp.enumeration.cJ.a.c(list, aVar.h, aVar.g);
            int i84 = b;
            int i85 = i84 ^ 71;
            int i86 = -(-((i84 & 71) << 1));
            int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
            a = i87 % 128;
            int i88 = i87 % 2;
            ivas.gov.bisp.enumeration.cJ.a.bEr[] berArr2 = aVar.i;
            int length2 = berArr2.length;
            int i89 = b;
            int i90 = i89 + 63;
            a = i90 % 128;
            int i91 = i90 % 2 == 0 ? 1 : 0;
            int i92 = i89 | 115;
            int i93 = ((i92 << 1) - (~(-((~(i89 & 115)) & i92)))) - 1;
            a = i93 % 128;
            int i94 = i93 % 2;
            while (i91 < length2) {
                int i95 = b;
                int i96 = i95 | 1;
                int i97 = i96 << 1;
                int i98 = -((~(i95 & i14)) & i96);
                int i99 = (i97 & i98) + (i98 | i97);
                a = i99 % 128;
                if (i99 % 2 == 0) {
                    ber = berArr2[i91];
                    int i100 = 17 / 0;
                    if (ber != null) {
                        berArr = aVar.i;
                        hashSet = new HashSet();
                        hashSet2 = new HashSet();
                        length = berArr.length;
                        int i101 = b;
                        int i102 = i101 & 125;
                        int i103 = i102 + ((i101 ^ 125) | i102);
                        a = i103 % 128;
                        int i104 = i103 % 2;
                        i4 = 0;
                        while (i4 < length) {
                            int i105 = b;
                            int i106 = (i105 | 103) << 1;
                            int i107 = -((i105 & (-104)) | (103 & (~i105)));
                            i6 = (i106 ^ i107) + ((i106 & i107) << i14);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                ber2 = berArr[i4];
                                int i108 = 39 / 0;
                                if (ber2 != null) {
                                    if (!ber.equals(ber2)) {
                                        int i109 = a;
                                        i7 = (i109 & 19) + (i109 | 19);
                                        b = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            hashSet.add(ber2.i);
                                            int i110 = 9 / 0;
                                        } else {
                                            hashSet.add(ber2.i);
                                        }
                                        int i111 = b;
                                        int i112 = i111 & 117;
                                        int i113 = i111 | 117;
                                        int i114 = (i112 & i113) + (i113 | i112);
                                        a = i114 % 128;
                                        int i115 = i114 % 2;
                                        hashSet2.add(ber2.j);
                                        int i116 = a;
                                        i8 = (((i116 | 80) << 1) - (i116 ^ 80)) - 1;
                                        b = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            int i117 = 5 % 5;
                                        }
                                    }
                                }
                                i4 = ((i4 | 1) << 1) - (i4 ^ 1);
                                int i118 = a + 65;
                                b = i118 % 128;
                                int i119 = i118 % 2;
                                i14 = 1;
                            } else {
                                ber2 = berArr[i4];
                                if (ber2 != null) {
                                    if (!ber.equals(ber2)) {
                                        int i1010 = a;
                                        i7 = (i1010 & 19) + (i1010 | 19);
                                        b = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            hashSet.add(ber2.i);
                                            int i1110 = 9 / 0;
                                        } else {
                                            hashSet.add(ber2.i);
                                        }
                                        int i1111 = b;
                                        int i1112 = i1111 & 117;
                                        int i1113 = i1111 | 117;
                                        int i1114 = (i1112 & i1113) + (i1113 | i1112);
                                        a = i1114 % 128;
                                        int i1115 = i1114 % 2;
                                        hashSet2.add(ber2.j);
                                        int i1116 = a;
                                        i8 = (((i1116 | 80) << 1) - (i1116 ^ 80)) - 1;
                                        b = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            int i1117 = 5 % 5;
                                        }
                                    }
                                }
                                i4 = ((i4 | 1) << 1) - (i4 ^ 1);
                                int i1118 = a + 65;
                                b = i1118 % 128;
                                int i1119 = i1118 % 2;
                                i14 = 1;
                            }
                            i4 = ((i4 | 1) << 1) - (i4 ^ 1);
                            int i11110 = a + 65;
                            b = i11110 % 128;
                            int i11111 = i11110 % 2;
                            i14 = 1;
                        }
                        beo = ber.i;
                        if (beo != null) {
                            int i120 = b;
                            int i121 = i120 ^ 1;
                            int i122 = ((i120 & 1) | i121) << 1;
                            int i123 = -i121;
                            i5 = (i122 ^ i123) + ((i122 & i123) << 1);
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                beo.b(hashSet);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            beo.b(hashSet);
                        }
                        beo2 = ber.j;
                        if (beo2 != null) {
                            int i124 = b + 1;
                            a = i124 % 128;
                            int i125 = i124 % 2;
                            beo2.b(hashSet2);
                            int i126 = b;
                            int i127 = i126 & 41;
                            int i128 = ((i126 | 41) & (~i127)) + (i127 << 1);
                            a = i128 % 128;
                            int i129 = i128 % 2;
                        }
                    }
                } else {
                    ber = berArr2[i91];
                    if (ber != null) {
                        berArr = aVar.i;
                        hashSet = new HashSet();
                        hashSet2 = new HashSet();
                        length = berArr.length;
                        int i1011 = b;
                        int i1012 = i1011 & 125;
                        int i1013 = i1012 + ((i1011 ^ 125) | i1012);
                        a = i1013 % 128;
                        int i1014 = i1013 % 2;
                        i4 = 0;
                        while (i4 < length) {
                            int i1015 = b;
                            int i1016 = (i1015 | 103) << 1;
                            int i1017 = -((i1015 & (-104)) | (103 & (~i1015)));
                            i6 = (i1016 ^ i1017) + ((i1016 & i1017) << i14);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                ber2 = berArr[i4];
                                int i1018 = 39 / 0;
                                if (ber2 != null) {
                                    if (!ber.equals(ber2)) {
                                        int i1019 = a;
                                        i7 = (i1019 & 19) + (i1019 | 19);
                                        b = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            hashSet.add(ber2.i);
                                            int i11112 = 9 / 0;
                                        } else {
                                            hashSet.add(ber2.i);
                                        }
                                        int i11113 = b;
                                        int i11114 = i11113 & 117;
                                        int i11115 = i11113 | 117;
                                        int i11116 = (i11114 & i11115) + (i11115 | i11114);
                                        a = i11116 % 128;
                                        int i11117 = i11116 % 2;
                                        hashSet2.add(ber2.j);
                                        int i11118 = a;
                                        i8 = (((i11118 | 80) << 1) - (i11118 ^ 80)) - 1;
                                        b = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            int i11119 = 5 % 5;
                                        }
                                    }
                                }
                                i4 = ((i4 | 1) << 1) - (i4 ^ 1);
                                int i111110 = a + 65;
                                b = i111110 % 128;
                                int i111111 = i111110 % 2;
                                i14 = 1;
                            } else {
                                ber2 = berArr[i4];
                                if (ber2 != null) {
                                    if (!ber.equals(ber2)) {
                                        int i10110 = a;
                                        i7 = (i10110 & 19) + (i10110 | 19);
                                        b = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            hashSet.add(ber2.i);
                                            int i111112 = 9 / 0;
                                        } else {
                                            hashSet.add(ber2.i);
                                        }
                                        int i111113 = b;
                                        int i111114 = i111113 & 117;
                                        int i111115 = i111113 | 117;
                                        int i111116 = (i111114 & i111115) + (i111115 | i111114);
                                        a = i111116 % 128;
                                        int i111117 = i111116 % 2;
                                        hashSet2.add(ber2.j);
                                        int i111118 = a;
                                        i8 = (((i111118 | 80) << 1) - (i111118 ^ 80)) - 1;
                                        b = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            int i111119 = 5 % 5;
                                        }
                                    }
                                }
                                i4 = ((i4 | 1) << 1) - (i4 ^ 1);
                                int i1111110 = a + 65;
                                b = i1111110 % 128;
                                int i1111111 = i1111110 % 2;
                                i14 = 1;
                            }
                            i4 = ((i4 | 1) << 1) - (i4 ^ 1);
                            int i1111112 = a + 65;
                            b = i1111112 % 128;
                            int i1111113 = i1111112 % 2;
                            i14 = 1;
                        }
                        beo = ber.i;
                        if (beo != null) {
                            int i1210 = b;
                            int i1211 = i1210 ^ 1;
                            int i1212 = ((i1210 & 1) | i1211) << 1;
                            int i1213 = -i1211;
                            i5 = (i1212 ^ i1213) + ((i1212 & i1213) << 1);
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                beo.b(hashSet);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            beo.b(hashSet);
                        }
                        beo2 = ber.j;
                        if (beo2 != null) {
                            int i1214 = b + 1;
                            a = i1214 % 128;
                            int i1215 = i1214 % 2;
                            beo2.b(hashSet2);
                            int i1216 = b;
                            int i1217 = i1216 & 41;
                            int i1218 = ((i1216 | 41) & (~i1217)) + (i1217 << 1);
                            a = i1218 % 128;
                            int i1219 = i1218 % 2;
                        }
                    }
                }
                int i130 = ((i91 ^ (-4)) + ((i91 & (-4)) << 1)) - 1;
                int i131 = (i130 & (-7)) | ((~i130) & 6);
                int i132 = -(-((i130 & 6) << 1));
                i91 = ((i131 | i132) << 1) - (i132 ^ i131);
                int i133 = b;
                int i134 = i133 & 95;
                int i135 = i134 + ((i133 ^ 95) | i134);
                a = i135 % 128;
                if (i135 % 2 == 0) {
                    c2 = 4;
                    int i136 = 4 % 4;
                } else {
                    c2 = 4;
                }
                i14 = 1;
            }
            aVar.i = (ivas.gov.bisp.enumeration.cJ.a.bEr[]) aVar.i.clone();
            int i137 = a;
            int i138 = ((i137 ^ 75) - (~((i137 & 75) << 1))) - 1;
            int i139 = i138 % 128;
            b = i139;
            int i140 = i138 % 2;
            r = eVarC;
            int i141 = (i139 ^ 61) + ((i139 & 61) << 1);
            a = i141 % 128;
            int i142 = i141 % 2;
        }
        e eVar = r;
        int i143 = b + 85;
        a = i143 % 128;
        int i144 = i143 % 2;
        return eVar;
    }
}
