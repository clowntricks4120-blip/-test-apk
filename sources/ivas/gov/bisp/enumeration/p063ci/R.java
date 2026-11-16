package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class R {
    private static int a = 0x00000001;
    private static int b;
    public final InputStream c;
    public final int d;
    public final byte[][] e;

    public R(InputStream inputStream) {
        int iD = az.d(inputStream);
        this.c = inputStream;
        this.d = iD;
        this.e = new byte[11][];
    }

    public R(InputStream inputStream, int i) {
        this.c = inputStream;
        this.d = i;
        this.e = new byte[11][];
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e7, code lost:
    
        if (r6 == 8) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e9, code lost:
    
        if (r6 == 16) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02eb, code lost:
    
        r2 = r3 & 103;
        r3 = (r3 | 103) & (~r2);
        r2 = r2 << 1;
        r4 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.p063ci.R.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fc, code lost:
    
        if ((r4 % 2) != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0300, code lost:
    
        if (r6 != 44) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0303, code lost:
    
        if (r6 != 17) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0305, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.au(new ivas.gov.bisp.enumeration.p063ci.R(r8));
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r4 = (r3 & (-44)) | ((~r3) & 43);
        r3 = -(-((r3 & 43) << 1));
        r5 = ((r4 | r3) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.p063ci.R.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0326, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0327, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("unknown tag ");
        r0.append(r6);
        r0.append(" encountered");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0342, code lost:
    
        throw new java.io.IOException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0343, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.as(new ivas.gov.bisp.enumeration.p063ci.R(r8));
        r3 = ivas.gov.bisp.enumeration.p063ci.R.b;
        r4 = ((r3 & (-6)) | ((~r3) & 5)) + ((r3 & 5) << 1);
        ivas.gov.bisp.enumeration.p063ci.R.a = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x035d, code lost:
    
        if ((r4 % 2) == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x035f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0361, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0362, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.ab(new ivas.gov.bisp.enumeration.p063ci.R(r8));
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r4 = (r3 ^ 41) + ((r3 & 41) << 1);
        ivas.gov.bisp.enumeration.p063ci.R.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0379, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x037a, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.C0279y(new ivas.gov.bisp.enumeration.p063ci.R(r8));
        r3 = ivas.gov.bisp.enumeration.p063ci.R.b;
        r4 = r3 & 101;
        r3 = (r3 ^ 101) | r4;
        r5 = (r4 ^ r3) + ((r3 & r4) << 1);
        ivas.gov.bisp.enumeration.p063ci.R.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r6 = r18.c;
        r7 = r6 instanceof ivas.gov.bisp.enumeration.p063ci.at;
        r8 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r9 = (r8 & (-52)) | ((~r8) & 51);
        r8 = -(-((r8 & 51) << 1));
        r11 = ((r9 | r8) << 1) - (r8 ^ r9);
        r8 = r11 % 128;
        ivas.gov.bisp.enumeration.p063ci.R.b = r8;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0395, code lost:
    
        if ((r5 % 2) == 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0397, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0399, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x039a, code lost:
    
        if (r6 == 4) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x039c, code lost:
    
        r2 = (((r3 | 18) << 1) - (r3 ^ 18)) - 1;
        ivas.gov.bisp.enumeration.p063ci.R.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03a7, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p063ci.C0266l.e(r6, r8, r18.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03ad, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r4 = r3 & 73;
        r4 = r4 + ((r3 ^ 73) | r4);
        r3 = r4 % 128;
        ivas.gov.bisp.enumeration.p063ci.R.b = r3;
        r4 = r4 % 2;
        r4 = r3 & 59;
        r3 = -(-((r3 ^ 59) | r4));
        r5 = ((r4 | r3) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.p063ci.R.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03cb, code lost:
    
        if ((r5 % 2) == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03cd, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r7 == true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03ce, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03d2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03db, code lost:
    
        throw new ivas.gov.bisp.enumeration.p063ci.P("corrupted stream detected", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03e1, code lost:
    
        return new ivas.gov.bisp.enumeration.p063ci.af(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r7 = r8 & 9;
        r8 = r8 | 9;
        r9 = ((r7 | r8) << 1) - (r7 ^ r8);
        ivas.gov.bisp.enumeration.p063ci.R.a = r9 % 128;
        r9 = r9 % 2;
        r6 = (ivas.gov.bisp.enumeration.p063ci.at) r6;
        r6.h = false;
        r7 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r8 = (r7 ^ 83) + ((r7 & 83) << 1);
        ivas.gov.bisp.enumeration.p063ci.R.b = r8 % 128;
        r8 = r8 % 2;
        r6.d();
        r6 = ivas.gov.bisp.enumeration.p063ci.R.b;
        r7 = r6 & 119;
        r6 = -(-((r6 ^ 119) | r7));
        r8 = (r7 ^ r6) + ((r6 & r7) << 1);
        ivas.gov.bisp.enumeration.p063ci.R.a = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p063ci.C0266l.h(r18.c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        if ((r2 & 32) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p063ci.R.b + 41;
        ivas.gov.bisp.enumeration.p063ci.R.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if ((r7 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p063ci.R.b;
        r8 = r7 ^ 29;
        r7 = -(-((r7 & 29) << 1));
        r9 = (r8 ^ r7) + ((r7 & r8) << 1);
        ivas.gov.bisp.enumeration.p063ci.R.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        r8 = r18.c;
        r9 = r18.d;
        r11 = ivas.gov.bisp.enumeration.p063ci.R.b;
        r12 = r11 & 47;
        r13 = (~r12) & (r11 | 47);
        r12 = -(-(r12 << 1));
        r14 = (r13 ^ r12) + ((r12 & r13) << 1);
        ivas.gov.bisp.enumeration.p063ci.R.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
    
        if ((r14 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
    
        if (r6 == 5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        if (r6 == 4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
    
        if (r6 == 16) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        r14 = r11 | 31;
        r3 = ((r14 << 1) - (~(-((~(r11 & 31)) & r14)))) - 1;
        ivas.gov.bisp.enumeration.p063ci.R.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f0, code lost:
    
        if (r6 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f2, code lost:
    
        r3 = ((r11 ^ 85) | (r11 & 85)) << 1;
        r11 = -(((~r11) & 85) | (r11 & (-86)));
        r14 = ((r3 | r11) << 1) - (r3 ^ r11);
        ivas.gov.bisp.enumeration.p063ci.R.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0109, code lost:
    
        if ((r14 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010b, code lost:
    
        if (r6 != 18) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010e, code lost:
    
        if (r6 != 8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0111, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0113, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r14 = r3 & 115;
        r11 = ((r3 ^ 115) | r14) << 1;
        r3 = -((r3 | 115) & (~r14));
        r14 = ((r11 | r3) << 1) - (r3 ^ r11);
        ivas.gov.bisp.enumeration.p063ci.R.b = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        if ((r14 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012e, code lost:
    
        r3 = 3 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0130, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0131, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p063ci.C0266l.g(r8, r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
    
        if (r3 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0137, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p063ci.R.b;
        r8 = (r3 ^ 74) + ((r3 & 74) << 1);
        r3 = (r8 ^ (-1)) + (r8 << 1);
        ivas.gov.bisp.enumeration.p063ci.R.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0148, code lost:
    
        if (r7 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014a, code lost:
    
        r3 = new ivas.gov.bisp.enumeration.p063ci.R(new ivas.gov.bisp.enumeration.p063ci.at(r18.c, r18.d), r18.d);
        r7 = ivas.gov.bisp.enumeration.p063ci.R.b + 89;
        r8 = r7 % 128;
        ivas.gov.bisp.enumeration.p063ci.R.a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0163, code lost:
    
        if ((r7 % 2) != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016b, code lost:
    
        if (((r2 & (-111)) ^ ((~r2) & 110)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0170, code lost:
    
        if ((r2 & 64) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0172, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.V(r6, r3);
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r4 = r3 & 31;
        r4 = (r4 - (~(-(-((r3 ^ 31) | r4))))) - 1;
        ivas.gov.bisp.enumeration.p063ci.R.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0188, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018b, code lost:
    
        if ((r2 & 128) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018d, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.Y(true, r6, r3);
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r4 = ((r3 & (-90)) | ((~r3) & 89)) + ((r3 & 89) << 1);
        ivas.gov.bisp.enumeration.p063ci.R.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a3, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a4, code lost:
    
        if (r6 == 4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r2 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a6, code lost:
    
        r2 = ((r8 | 93) << 1) - (r8 ^ 93);
        r7 = r2 % 128;
        ivas.gov.bisp.enumeration.p063ci.R.b = r7;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b1, code lost:
    
        if (r6 == 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b3, code lost:
    
        r2 = (((r7 & (-116)) | ((~r7) & 115)) - (~((r7 & 115) << 1))) - 1;
        ivas.gov.bisp.enumeration.p063ci.R.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c4, code lost:
    
        if ((r2 % 2) != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c8, code lost:
    
        if (r6 == 117) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01cb, code lost:
    
        if (r6 == 16) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cd, code lost:
    
        if (r6 != 17) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01cf, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.C0268n(r3);
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r4 = r3 & 5;
        r3 = (r3 | 5) & (~r4);
        r4 = r4 << 1;
        r5 = ((r3 | r4) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.p063ci.R.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e8, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p091n.j.w("unknown BER object encountered: 0x");
        r0.append(java.lang.Integer.toHexString(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fe, code lost:
    
        throw new ivas.gov.bisp.enumeration.p063ci.P(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ff, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.al(r3);
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a + 53;
        ivas.gov.bisp.enumeration.p063ci.R.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020e, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.ab(r3);
        r3 = ivas.gov.bisp.enumeration.p063ci.R.b;
        r4 = r3 & 67;
        r3 = -(-((r3 ^ 67) | r4));
        r5 = ((r4 | r3) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.p063ci.R.a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0227, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.C0279y(r3);
        r3 = ivas.gov.bisp.enumeration.p063ci.R.b;
        r3 = (-2) - ((-1) ^ (((r3 | 40) << 1) - (r3 ^ 40)));
        ivas.gov.bisp.enumeration.p063ci.R.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023d, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r4 = (((r3 & (-26)) | ((~r3) & 25)) - (~(-(-((r3 & 25) << 1))))) - 1;
        ivas.gov.bisp.enumeration.p063ci.R.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0252, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x025a, code lost:
    
        throw new java.io.IOException("indefinite-length primitive encoding encountered");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x025b, code lost:
    
        r8 = new ivas.gov.bisp.enumeration.p063ci.C0263g(r18.c, r3, r18.d);
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r9 = r3 & 101;
        r11 = -(-((r3 ^ 101) | r9));
        r14 = ((r9 | r11) << 1) - (r9 ^ r11);
        ivas.gov.bisp.enumeration.p063ci.R.b = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0277, code lost:
    
        if ((r14 % 2) == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0279, code lost:
    
        r9 = (r2 & (-38)) | ((~r2) & 37);
        r11 = r2 & 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0285, code lost:
    
        if (((r9 & r11) | (r9 ^ r11)) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x028a, code lost:
    
        if ((r2 & 64) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x028c, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.H(r7, r6, r8.d());
        r3 = ivas.gov.bisp.enumeration.p063ci.R.b;
        r4 = ((r3 & (-88)) | ((~r3) & 87)) + ((r3 & 87) << 1);
        ivas.gov.bisp.enumeration.p063ci.R.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02a6, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a9, code lost:
    
        if ((r2 & 128) == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ab, code lost:
    
        r2 = new ivas.gov.bisp.enumeration.p063ci.Y(r7, r6, new ivas.gov.bisp.enumeration.p063ci.R(r8));
        r3 = ivas.gov.bisp.enumeration.p063ci.R.a;
        r4 = (r3 & 27) + (r3 | 27);
        ivas.gov.bisp.enumeration.p063ci.R.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c1, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c2, code lost:
    
        if (r7 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02c4, code lost:
    
        r2 = r3 + 125;
        ivas.gov.bisp.enumeration.p063ci.R.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02cb, code lost:
    
        if (r6 == 4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02cd, code lost:
    
        r7 = r3 & 95;
        r2 = ((((r3 ^ 95) | r7) << 1) - (~(-((r3 | 95) & (~r7))))) - 1;
        r3 = r2 % 128;
        ivas.gov.bisp.enumeration.p063ci.R.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02e0, code lost:
    
        if ((r2 % 2) == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02e4, code lost:
    
        if (r6 == 97) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p063ci.R.a + 79;
        ivas.gov.bisp.enumeration.p063ci.R.b = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.p063ci.i d() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p063ci.R.d():ivas.gov.bisp.enumeration.ci.i");
    }

    public C0270p f() throws IOException {
        O oE;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 47) + (i2 | 47);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            d();
            obj.hashCode();
            throw null;
        }
        i iVarD = d();
        if (iVarD == null) {
            C0270p c0270p = new C0270p(0);
            int i4 = b;
            int i5 = i4 & 5;
            int i6 = -(-((i4 ^ 5) | i5));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return c0270p;
            }
            obj.hashCode();
            throw null;
        }
        C0270p c0270p2 = new C0270p(10);
        int i8 = a;
        int i9 = i8 & 45;
        int i10 = (i8 ^ 45) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 2;
        }
        do {
            if (!(iVarD instanceof av)) {
                oE = iVarD.f();
                int i13 = b;
                int i14 = (i13 & 19) + (i13 | 19);
                a = i14 % 128;
                int i15 = i14 % 2;
            } else {
                int i16 = a;
                int i17 = i16 ^ 5;
                int i18 = (((i16 & 5) | i17) << 1) - i17;
                b = i18 % 128;
                int i19 = i18 % 2;
                oE = ((av) iVarD).e();
                int i20 = a;
                int i21 = i20 & 47;
                int i22 = -(-((i20 ^ 47) | i21));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                b = i23 % 128;
                int i24 = i23 % 2;
            }
            c0270p2.c(oE);
            iVarD = d();
        } while (iVarD != null);
        int i25 = a + 51;
        b = i25 % 128;
        if (i25 % 2 == 0) {
            return c0270p2;
        }
        throw null;
    }

    public O e(boolean z, int i) {
        Q q;
        aj ajVar;
        W w;
        X x;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((((i3 ^ 21) | (i3 & 21)) << 1) - (~(-(((~i3) & 21) | (i3 & (-22)))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (!z) {
            aj ajVar2 = new aj(false, i, new B(((C0263g) this.c).d()), 1);
            int i6 = a;
            int i7 = i6 ^ 3;
            int i8 = ((i6 & 3) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 29 / 0;
            }
            return ajVar2;
        }
        C0270p c0270pF = f();
        if (this.c instanceof at) {
            int i12 = a;
            int i13 = i12 & 31;
            int i14 = (i12 | 31) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            b = i16 % 128;
            int i17 = i16 % 2;
            int i18 = c0270pF.e;
            if (i18 == 1) {
                x = new X(true, i, c0270pF.d(0));
                int i19 = b;
                int i20 = ((i19 ^ 105) | (i19 & 105)) << 1;
                int i21 = -(((~i19) & 105) | (i19 & (-106)));
                int i22 = (i20 & i21) + (i21 | i20);
                a = i22 % 128;
                int i23 = i22 % 2;
            } else {
                W w2 = C.c;
                if (i18 <= 0) {
                    int i24 = b;
                    int i25 = (i24 ^ 105) + ((i24 & 105) << 1);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    w = C.c;
                    int i27 = b;
                    int i28 = i27 & 105;
                    int i29 = (i28 - (~((i27 ^ 105) | i28))) - 1;
                    a = i29 % 128;
                    if (i29 % 2 == 0) {
                        int i30 = 2 / 4;
                    }
                } else {
                    W w3 = new W(c0270pF);
                    int i31 = a;
                    int i32 = ((i31 | 19) << 1) - (i31 ^ 19);
                    b = i32 % 128;
                    if (i32 % 2 != 0) {
                        int i33 = 4 / 3;
                    }
                    w = w3;
                }
                x = new X(false, i, w);
                int i34 = b;
                int i35 = ((i34 ^ 9) - (~(-(-((i34 & 9) << 1))))) - 1;
                a = i35 % 128;
                int i36 = i35 % 2;
            }
            int i37 = a;
            int i38 = i37 & 103;
            int i39 = -(-((i37 ^ 103) | i38));
            int i40 = (i38 & i39) + (i39 | i38);
            b = i40 % 128;
            int i41 = i40 % 2;
            return x;
        }
        int i42 = c0270pF.e;
        Object obj = null;
        if (i42 == 1) {
            ajVar = new aj(true, i, c0270pF.d(0), 1);
            int i43 = a;
            int i44 = i43 ^ 71;
            int i45 = -(-((i43 & 71) << 1));
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            int i47 = i46 % 128;
            b = i47;
            int i48 = i46 % 2;
            int i49 = i47 + 83;
            a = i49 % 128;
            int i50 = i49 % 2;
        } else {
            Q q2 = C0262f.c;
            if (i42 <= 0) {
                int i51 = a;
                int i52 = (i51 ^ 121) + ((i51 & 121) << 1);
                b = i52 % 128;
                int i53 = i52 % 2;
                q = C0262f.c;
                if (i53 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i54 = a;
                int i55 = (i54 & 41) + (i54 | 41);
                b = i55 % 128;
                int i56 = i55 % 2;
            } else {
                ar arVar = new ar(c0270pF);
                int i57 = a;
                int i58 = ((i57 & 53) - (~(i57 | 53))) - 1;
                b = i58 % 128;
                int i59 = i58 % 2;
                q = arVar;
            }
            ajVar = new aj(false, i, q, 1);
            int i60 = b;
            int i61 = (i60 | 113) << 1;
            int i62 = -(i60 ^ 113);
            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
            a = i63 % 128;
            if (i63 % 2 == 0) {
                int i64 = 2 % 4;
            }
        }
        int i65 = a;
        int i66 = i65 & 105;
        int i67 = ((i65 | 105) & (~i66)) + (i66 << 1);
        b = i67 % 128;
        if (i67 % 2 == 0) {
            return ajVar;
        }
        obj.hashCode();
        throw null;
    }
}
