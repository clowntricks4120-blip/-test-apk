package ivas.gov.bisp.enumeration.p053bz;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.bN.C0130y;
import ivas.gov.bisp.enumeration.bV.B;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.bX.t;
import ivas.gov.bisp.enumeration.db.j;
import ivas.gov.bisp.enumeration.p030bc.A;
import ivas.gov.bisp.enumeration.p057cc.c;
import ivas.gov.bisp.enumeration.p061cg.h;
import java.io.File;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.sqlcipher.BuildConfig;
import org.acra.sender.ReportSenderFactory;

/* JADX INFO: loaded from: classes.dex */
public final class N implements A {
    private static int a = 0;
    private static int b = 1;
    public final Object c;
    public Object d;
    public Object e;

    public /* synthetic */ N(Context context, r rVar) {
        ivas.gov.bisp.enumeration.O.r.n(rVar, "config");
        this.c = context;
        this.d = rVar;
        this.e = new j(context);
    }

    public N(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        T.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.c = secretKeySpec;
        Cipher cipher = (Cipher) J.f.c("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrJ = i.j(cipher.doFinal(new byte[16]));
        this.d = bArrJ;
        this.e = i.j(bArrJ);
    }

    public final List e(boolean z) {
        List<ReportSenderFactory> listI;
        boolean z2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 67) << 1;
        int i4 = -(((~i2) & 67) | (i2 & (-68)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.aO.j jVar = P.c;
        r rVar = (r) this.d;
        c cVar = rVar.A;
        int i7 = b;
        int i8 = i7 ^ 121;
        int i9 = (i7 & 121) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            listI = cVar.i(rVar, ReportSenderFactory.class);
            int i11 = 12 / 0;
        } else {
            listI = cVar.i(rVar, ReportSenderFactory.class);
        }
        ArrayList arrayList = new ArrayList(C0130y.an(listI, 10));
        int i12 = a;
        int i13 = ((i12 | 67) << 1) - (i12 ^ 67);
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = a;
        int i16 = (((i15 & (-30)) | ((~i15) & 29)) - (~(-(-((i15 & 29) << 1))))) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
        for (ReportSenderFactory reportSenderFactory : listI) {
            int i18 = b;
            int i19 = ((i18 ^ 6) + ((i18 & 6) << 1)) - 1;
            a = i19 % 128;
            int i20 = i19 % 2;
            Context context = (Context) this.c;
            int i21 = a;
            int i22 = (i21 & 2) + (i21 | 2);
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
            ivas.gov.bisp.enumeration.p061cg.r rVarCreate = reportSenderFactory.create(context, (r) this.d);
            ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
            int i25 = a;
            int i26 = ((i25 ^ 72) + ((i25 & 72) << 1)) - 1;
            b = i26 % 128;
            if (i26 % 2 == 0) {
                arrayList.add(rVarCreate);
                throw null;
            }
            arrayList.add(rVarCreate);
            int i27 = b;
            int i28 = i27 & 109;
            int i29 = (i27 ^ 109) | i28;
            int i30 = (i28 & i29) + (i29 | i28);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        ArrayList arrayList2 = new ArrayList();
        int i32 = a;
        int i33 = ((i32 & 19) - (~(i32 | 19))) - 1;
        b = i33 % 128;
        int i34 = i33 % 2;
        for (Object obj : arrayList) {
            int i35 = a;
            int i36 = (i35 ^ 3) + ((i35 & 3) << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
            if (z == ((ivas.gov.bisp.enumeration.p061cg.r) obj).e()) {
                int i38 = a;
                int i39 = ((i38 ^ 55) | (i38 & 55)) << 1;
                int i40 = -((i38 & (-56)) | ((~i38) & 55));
                int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
                b = i41 % 128;
                z2 = !(i41 % 2 == 0);
                int i42 = i38 + 103;
                b = i42 % 128;
                int i43 = i42 % 2;
            } else {
                int i44 = a;
                int i45 = (i44 & (-2)) | ((~i44) & 1);
                int i46 = (i44 & 1) << 1;
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                b = i47 % 128;
                int i48 = i47 % 2;
                z2 = false;
            }
            if (!(!z2)) {
                int i49 = a;
                int i50 = i49 | 9;
                int i51 = ((i50 << 1) - (~(-((~(i49 & 9)) & i50)))) - 1;
                b = i51 % 128;
                int i52 = i51 % 2;
                arrayList2.add(obj);
                int i53 = a;
                int i54 = ((i53 ^ 105) | (i53 & 105)) << 1;
                int i55 = -(((~i53) & 105) | (i53 & (-106)));
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                b = i56 % 128;
                int i57 = i56 % 2;
            }
        }
        int i58 = a;
        int i59 = (i58 ^ 111) + ((i58 & 111) << 1);
        b = i59 % 128;
        int i60 = i59 % 2;
        return arrayList2;
    }

    @Override // ivas.gov.bisp.enumeration.p030bc.A
    public final byte[] b(byte[] bArr, int i) {
        SecretKey secretKey;
        int i2;
        byte[] bArrAk;
        byte[] bArrAk2;
        byte[] bArrH;
        Object obj;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 23;
        int i6 = (~i5) & (i4 | 23);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        int i10 = i4 & 79;
        int i11 = (i10 - (~(-(-((i4 ^ 79) | i10))))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        Cipher cipher = (Cipher) J.f.c("AES/ECB/NoPadding");
        int i13 = b;
        int i14 = i13 ^ 107;
        int i15 = ((i13 & 107) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            secretKey = (SecretKey) this.c;
            i2 = 0;
        } else {
            secretKey = (SecretKey) this.c;
            i2 = 1;
        }
        cipher.init(i2, secretKey);
        double dCeil = Math.ceil(((double) bArr.length) / 16.0d);
        int i18 = a;
        int i19 = i18 & 23;
        int i20 = ((i18 | 23) & (~i19)) + (i19 << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        int iMax = Math.max(1, (int) dCeil);
        Object obj2 = null;
        if (iMax * 16 != bArr.length) {
            int i22 = b + 117;
            int i23 = i22 % 128;
            a = i23;
            int i24 = i22 % 2;
            int i25 = i23 & 45;
            int i26 = (((i23 ^ 45) | i25) << 1) - ((i23 | 45) & (~i25));
            int i27 = i26 % 128;
            b = i27;
            int i28 = i26 % 2;
            int length = bArr.length;
            int i29 = ~iMax;
            int i30 = iMax << 1;
            int i31 = (((i29 | i30) << 1) - (i29 ^ i30)) * 16;
            int i32 = (-2) - (((i27 ^ 120) + ((i27 & 120) << 1)) ^ (-1));
            a = i32 % 128;
            if (i32 % 2 != 0) {
                bArrH = i.h(Arrays.copyOfRange(bArr, i31, length));
                obj = this.e;
                int i33 = 85 / 0;
            } else {
                bArrH = i.h(Arrays.copyOfRange(bArr, i31, length));
                obj = this.e;
            }
            int i34 = b + 123;
            a = i34 % 128;
            if (i34 % 2 != 0) {
                ivas.gov.bisp.enumeration.p100w.r.al(bArrH, (byte[]) obj);
                obj2.hashCode();
                throw null;
            }
            bArrAk = ivas.gov.bisp.enumeration.p100w.r.al(bArrH, (byte[]) obj);
            int i35 = b;
            int i36 = (((i35 | 22) << 1) - (i35 ^ 22)) - 1;
            a = i36 % 128;
            int i37 = i36 % 2;
        } else {
            int i38 = b;
            int i39 = (i38 & 3) + (i38 | 3);
            int i40 = i39 % 128;
            a = i40;
            int i41 = i39 % 2;
            byte[] bArr2 = (byte[]) this.d;
            int i42 = i40 + 65;
            b = i42 % 128;
            int i43 = i42 % 2;
            bArrAk = ivas.gov.bisp.enumeration.p100w.r.ak(bArr, ((-2) - (iMax ^ (-1))) * 16, bArr2, 0, 16);
            int i44 = b;
            int i45 = i44 & 123;
            int i46 = ((((i44 ^ 123) | i45) << 1) - (~(-((i44 | 123) & (~i45))))) - 1;
            a = i46 % 128;
            int i47 = i46 % 2;
        }
        byte[] bArrDoFinal = new byte[16];
        int i48 = a + 69;
        b = i48 % 128;
        int i49 = i48 % 2;
        int i50 = 0;
        while (i50 < iMax - 1) {
            int i51 = a;
            int i52 = i51 & 83;
            int i53 = i51 | 83;
            int i54 = (i52 & i53) + (i53 | i52);
            b = i54 % 128;
            if (i54 % 2 == 0) {
                int i55 = (i50 & (-65)) + (i50 | (-65));
                bArrAk2 = ivas.gov.bisp.enumeration.p100w.r.ak(bArrDoFinal, 0, bArr, (i55 ^ (-1)) + (i55 << 1), 40);
            } else {
                bArrAk2 = ivas.gov.bisp.enumeration.p100w.r.ak(bArrDoFinal, 0, bArr, i50 * 16, 16);
            }
            bArrDoFinal = cipher.doFinal(bArrAk2);
            int i56 = i50 ^ 1;
            int i57 = (i50 & 1) << 1;
            i50 = (i57 | i56) + (i56 & i57);
            int i58 = a;
            int i59 = i58 ^ 77;
            int i60 = ((i58 & 77) | i59) << 1;
            int i61 = -i59;
            int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
            b = i62 % 128;
            int i63 = i62 % 2;
        }
        byte[] bArrDoFinal2 = cipher.doFinal(ivas.gov.bisp.enumeration.p100w.r.al(bArrAk, bArrDoFinal));
        int i64 = a;
        int i65 = ((i64 | 99) << 1) - (i64 ^ 99);
        b = i65 % 128;
        if (i65 % 2 != 0) {
            return Arrays.copyOf(bArrDoFinal2, i);
        }
        Arrays.copyOf(bArrDoFinal2, i);
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01da A[EDGE_INSN: B:114:0x01da->B:67:0x01da BREAK  A[LOOP:0: B:18:0x009d->B:60:0x01a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0108  */
    /* JADX WARN: Code duplicated, block: B:35:0x011e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0128  */
    /* JADX WARN: Code duplicated, block: B:39:0x013b A[Catch: Exception -> 0x02b6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x02b6, blocks: (B:3:0x0019, B:5:0x0033, B:7:0x003c, B:11:0x0061, B:14:0x0081, B:22:0x00b8, B:30:0x00ff, B:39:0x013b, B:41:0x0141, B:48:0x0149, B:61:0x01ce, B:63:0x01d4, B:64:0x01d7, B:69:0x01f1, B:73:0x020f, B:89:0x0272, B:95:0x0288, B:97:0x02a6, B:92:0x0279, B:81:0x0227, B:15:0x0084), top: B:111:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0149 A[Catch: Exception -> 0x02b6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x02b6, blocks: (B:3:0x0019, B:5:0x0033, B:7:0x003c, B:11:0x0061, B:14:0x0081, B:22:0x00b8, B:30:0x00ff, B:39:0x013b, B:41:0x0141, B:48:0x0149, B:61:0x01ce, B:63:0x01d4, B:64:0x01d7, B:69:0x01f1, B:73:0x020f, B:89:0x0272, B:95:0x0288, B:97:0x02a6, B:92:0x0279, B:81:0x0227, B:15:0x0084), top: B:111:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x014f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0163  */
    /* JADX WARN: Code duplicated, block: B:53:0x0166  */
    /* JADX WARN: Code duplicated, block: B:56:0x0187  */
    /* JADX WARN: Code duplicated, block: B:57:0x018b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a5  */
    public final void f(boolean z, Bundle bundle) {
        int length;
        int i;
        String str;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = b;
        int i9 = ((i8 ^ 64) + ((i8 & 64) << 1)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        ivas.gov.bisp.enumeration.aO.j jVar = P.c;
        boolean z3 = false;
        try {
            ArrayList arrayList = new ArrayList(e(z));
            int i11 = a;
            int i12 = (-2) - (((i11 ^ 98) + ((i11 & 98) << 1)) ^ (-1));
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 117;
            if (arrayList.isEmpty()) {
                arrayList.add(new ivas.gov.bisp.enumeration.p061cg.c());
                int i15 = a + 97;
                int i16 = i15 % 128;
                b = i16;
                int i17 = i15 % 2;
                int i18 = i16 & 117;
                int i19 = (i16 | 117) & (~i18);
                int i20 = i18 << 1;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 5 / 3;
                }
            }
            File[] fileArrC = ((j) this.e).c();
            h hVar = new h((Context) this.c, (r) this.d, arrayList, bundle);
            int i23 = b;
            int i24 = i23 + 11;
            a = i24 % 128;
            if (i24 % 2 != 0) {
                length = fileArrC.length;
                i = 1;
            } else {
                length = fileArrC.length;
                i = 0;
            }
            int i25 = i;
            int i26 = (i23 | 101) << 1;
            int i27 = -(((~i23) & 101) | (i23 & (-102)));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            a = i28 % 128;
            int i29 = i28 % 2;
            boolean z4 = false;
            while (i < length) {
                int i30 = a;
                int i31 = i30 & 13;
                int i32 = (~i31) & (i30 | 13);
                int i33 = -(-(i31 << 1));
                int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                b = i34 % 128;
                if (i34 % 2 == 0) {
                    fileArrC[i].getName();
                    Object obj = null;
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                File file = fileArrC[i];
                String name = file.getName();
                ivas.gov.bisp.enumeration.O.r.m(name, "report.name");
                if (B.at(name, t.c, z3, 2)) {
                    int i35 = a;
                    int i36 = i35 & 51;
                    int i37 = (~i36) & (i35 | 51);
                    int i38 = -(-(i36 << 1));
                    int i39 = (i37 & i38) + (i37 | i38);
                    b = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    int i41 = a;
                    int i42 = ((((i41 ^ 117) | (i41 & 117)) << 1) - (~(-((i41 & (-118)) | ((~i41) & i14))))) - 1;
                    b = i42 % 128;
                    if (i42 % 2 != 0) {
                        z2 = true;
                    }
                    if (!bundle.getBoolean("onlySendSilentReports")) {
                        boolean z5 = z4 ^ z2;
                        boolean z6 = z4 & z2;
                        z4 = (z5 ^ z6) | (z5 & z6);
                        if (i25 < 5) {
                            break;
                        }
                        int i43 = a;
                        int i44 = i43 & 21;
                        i2 = (((i43 | 21) & (~i44)) - (~(i44 << 1))) - 1;
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i45 = 6 / 0;
                            if (!(!hVar.c(file))) {
                                int i46 = b;
                                i3 = (-2) - ((((i46 | 82) << 1) - (i46 ^ 82)) ^ (-1));
                                int i47 = i3 % 128;
                                a = i47;
                                if (i3 % 2 != 0) {
                                    i25 %= 1;
                                } else {
                                    i25 = ((i25 & 1) - (~(-(-(i25 | 1))))) - 1;
                                }
                                int i48 = (i47 & (-78)) | ((~i47) & 77);
                                int i49 = -(-((i47 & 77) << 1));
                                i4 = (i48 ^ i49) + ((i48 & i49) << 1);
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i50 = 3 / 3;
                                }
                            }
                        } else if (hVar.c(file)) {
                            int i410 = b;
                            i3 = (-2) - ((((i410 | 82) << 1) - (i410 ^ 82)) ^ (-1));
                            int i411 = i3 % 128;
                            a = i411;
                            if (i3 % 2 != 0) {
                                i25 %= 1;
                            } else {
                                i25 = ((i25 & 1) - (~(-(-(i25 | 1))))) - 1;
                            }
                            int i412 = (i411 & (-78)) | ((~i411) & 77);
                            int i413 = -(-((i411 & 77) << 1));
                            i4 = (i412 ^ i413) + ((i412 & i413) << 1);
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i51 = 3 / 3;
                            }
                        }
                    } else {
                        int i52 = b;
                        int i53 = i52 & 45;
                        int i54 = (~i53) & (i52 | 45);
                        int i55 = i53 << 1;
                        int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                        i5 = i56 % 128;
                        a = i5;
                        int i57 = i56 % 2;
                        if (!z2) {
                            boolean z7 = z4 ^ z2;
                            boolean z8 = z4 & z2;
                            z4 = (z7 ^ z8) | (z7 & z8);
                            if (i25 < 5) {
                                break;
                                break;
                            }
                            int i414 = a;
                            int i415 = i414 & 21;
                            i2 = (((i414 | 21) & (~i415)) - (~(i415 << 1))) - 1;
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i416 = 6 / 0;
                                if (!(!hVar.c(file))) {
                                    int i417 = b;
                                    i3 = (-2) - ((((i417 | 82) << 1) - (i417 ^ 82)) ^ (-1));
                                    int i418 = i3 % 128;
                                    a = i418;
                                    if (i3 % 2 != 0) {
                                        i25 %= 1;
                                    } else {
                                        i25 = ((i25 & 1) - (~(-(-(i25 | 1))))) - 1;
                                    }
                                    int i419 = (i418 & (-78)) | ((~i418) & 77);
                                    int i4110 = -(-((i418 & 77) << 1));
                                    i4 = (i419 ^ i4110) + ((i419 & i4110) << 1);
                                    b = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        int i58 = 3 / 3;
                                    }
                                }
                            } else if (hVar.c(file)) {
                                int i4111 = b;
                                i3 = (-2) - ((((i4111 | 82) << 1) - (i4111 ^ 82)) ^ (-1));
                                int i4112 = i3 % 128;
                                a = i4112;
                                if (i3 % 2 != 0) {
                                    i25 %= 1;
                                } else {
                                    i25 = ((i25 & 1) - (~(-(-(i25 | 1))))) - 1;
                                }
                                int i4113 = (i4112 & (-78)) | ((~i4112) & 77);
                                int i4114 = -(-((i4112 & 77) << 1));
                                i4 = (i4113 ^ i4114) + ((i4113 & i4114) << 1);
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i59 = 3 / 3;
                                }
                            }
                        } else {
                            int i60 = ((i5 ^ 75) | (i5 & 75)) << 1;
                            int i61 = -(((~i5) & 75) | (i5 & (-76)));
                            i6 = ((i60 | i61) << 1) - (i61 ^ i60);
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i62 = 53 / 0;
                            }
                        }
                    }
                    int i63 = i + 2;
                    i = (i63 ^ (-1)) + (i63 << 1);
                    int i64 = b;
                    int i65 = i64 & 11;
                    int i66 = ((i64 ^ 11) | i65) << 1;
                    int i67 = -((i64 | 11) & (~i65));
                    int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                    a = i68 % 128;
                    int i69 = i68 % 2;
                    z3 = false;
                    i14 = 117;
                }
                z2 = z3;
                if (!bundle.getBoolean("onlySendSilentReports")) {
                    boolean z9 = z4 ^ z2;
                    boolean z10 = z4 & z2;
                    z4 = (z9 ^ z10) | (z9 & z10);
                    if (i25 < 5) {
                        break;
                        break;
                    }
                    int i4115 = a;
                    int i4116 = i4115 & 21;
                    i2 = (((i4115 | 21) & (~i4116)) - (~(i4116 << 1))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i4117 = 6 / 0;
                        if (!(!hVar.c(file))) {
                            int i4118 = b;
                            i3 = (-2) - ((((i4118 | 82) << 1) - (i4118 ^ 82)) ^ (-1));
                            int i4119 = i3 % 128;
                            a = i4119;
                            if (i3 % 2 != 0) {
                                i25 %= 1;
                            } else {
                                i25 = ((i25 & 1) - (~(-(-(i25 | 1))))) - 1;
                            }
                            int i41110 = (i4119 & (-78)) | ((~i4119) & 77);
                            int i41111 = -(-((i4119 & 77) << 1));
                            i4 = (i41110 ^ i41111) + ((i41110 & i41111) << 1);
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i510 = 3 / 3;
                            }
                        }
                    } else if (hVar.c(file)) {
                        int i41112 = b;
                        i3 = (-2) - ((((i41112 | 82) << 1) - (i41112 ^ 82)) ^ (-1));
                        int i41113 = i3 % 128;
                        a = i41113;
                        if (i3 % 2 != 0) {
                            i25 %= 1;
                        } else {
                            i25 = ((i25 & 1) - (~(-(-(i25 | 1))))) - 1;
                        }
                        int i41114 = (i41113 & (-78)) | ((~i41113) & 77);
                        int i41115 = -(-((i41113 & 77) << 1));
                        i4 = (i41114 ^ i41115) + ((i41114 & i41115) << 1);
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i511 = 3 / 3;
                        }
                    }
                } else {
                    int i512 = b;
                    int i513 = i512 & 45;
                    int i514 = (~i513) & (i512 | 45);
                    int i515 = i513 << 1;
                    int i516 = ((i514 | i515) << 1) - (i514 ^ i515);
                    i5 = i516 % 128;
                    a = i5;
                    int i517 = i516 % 2;
                    if (!z2) {
                        boolean z11 = z4 ^ z2;
                        boolean z12 = z4 & z2;
                        z4 = (z11 ^ z12) | (z11 & z12);
                        if (i25 < 5) {
                            break;
                            break;
                        }
                        int i41116 = a;
                        int i41117 = i41116 & 21;
                        i2 = (((i41116 | 21) & (~i41117)) - (~(i41117 << 1))) - 1;
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i41118 = 6 / 0;
                            if (!(!hVar.c(file))) {
                                int i41119 = b;
                                i3 = (-2) - ((((i41119 | 82) << 1) - (i41119 ^ 82)) ^ (-1));
                                int i411110 = i3 % 128;
                                a = i411110;
                                if (i3 % 2 != 0) {
                                    i25 %= 1;
                                } else {
                                    i25 = ((i25 & 1) - (~(-(-(i25 | 1))))) - 1;
                                }
                                int i411111 = (i411110 & (-78)) | ((~i411110) & 77);
                                int i411112 = -(-((i411110 & 77) << 1));
                                i4 = (i411111 ^ i411112) + ((i411111 & i411112) << 1);
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i518 = 3 / 3;
                                }
                            }
                        } else if (hVar.c(file)) {
                            int i411113 = b;
                            i3 = (-2) - ((((i411113 | 82) << 1) - (i411113 ^ 82)) ^ (-1));
                            int i411114 = i3 % 128;
                            a = i411114;
                            if (i3 % 2 != 0) {
                                i25 %= 1;
                            } else {
                                i25 = ((i25 & 1) - (~(-(-(i25 | 1))))) - 1;
                            }
                            int i411115 = (i411114 & (-78)) | ((~i411114) & 77);
                            int i411116 = -(-((i411114 & 77) << 1));
                            i4 = (i411115 ^ i411116) + ((i411115 & i411116) << 1);
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i519 = 3 / 3;
                            }
                        }
                    } else {
                        int i610 = ((i5 ^ 75) | (i5 & 75)) << 1;
                        int i611 = -(((~i5) & 75) | (i5 & (-76)));
                        i6 = ((i610 | i611) << 1) - (i611 ^ i610);
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i612 = 53 / 0;
                        }
                    }
                }
                int i613 = i + 2;
                i = (i613 ^ (-1)) + (i613 << 1);
                int i614 = b;
                int i615 = i614 & 11;
                int i616 = ((i614 ^ 11) | i615) << 1;
                int i617 = -((i614 | 11) & (~i615));
                int i618 = (i616 ^ i617) + ((i617 & i616) << 1);
                a = i618 % 128;
                int i619 = i618 % 2;
                z3 = false;
                i14 = 117;
            }
            if (i25 > 0) {
                int i70 = b;
                int i71 = i70 | 13;
                int i72 = i71 << 1;
                int i73 = -((~(i70 & 13)) & i71);
                int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                a = i74 % 128;
                int i75 = i74 % 2;
                str = ((r) this.d).x;
                int i76 = a;
                int i77 = i76 ^ 97;
                int i78 = ((i76 & 97) | i77) << 1;
                int i79 = -i77;
                int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                b = i80 % 128;
                if (i80 % 2 == 0) {
                    int i81 = 61 / 0;
                }
                int i82 = i76 & 37;
                int i83 = ((i76 | 37) & (~i82)) + (i82 << 1);
                b = i83 % 128;
                if (i83 % 2 == 0) {
                    int i84 = 3 % 5;
                }
            } else {
                str = ((r) this.d).y;
                int i85 = a;
                int i86 = i85 & 23;
                int i87 = (i85 | 23) & (~i86);
                int i88 = -(-(i86 << 1));
                int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
                b = i89 % 128;
                int i90 = i89 % 2;
            }
            if (!(!z4)) {
                int i91 = a;
                int i92 = i91 & 57;
                int i93 = (i91 | 57) & (~i92);
                int i94 = i92 << 1;
                int i95 = (i93 & i94) + (i93 | i94);
                int i96 = i95 % 128;
                b = i96;
                int i97 = i95 % 2;
                if (str != null) {
                    int i98 = i96 & 107;
                    int i99 = ((i96 ^ 107) | i98) << 1;
                    int i100 = -((i96 | 107) & (~i98));
                    int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                    a = i101 % 128;
                    if (i101 % 2 != 0) {
                        if (str.length() > 0) {
                            int i102 = b + 3;
                            a = i102 % 128;
                            int i103 = i102 % 2;
                            ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
                            Handler handler = new Handler(Looper.getMainLooper());
                            ivas.gov.bisp.enumeration.p042bo.j jVar3 = new ivas.gov.bisp.enumeration.p042bo.j(this, str, 6);
                            int i104 = a;
                            int i105 = i104 & 97;
                            int i106 = i105 + ((i104 ^ 97) | i105);
                            b = i106 % 128;
                            int i107 = i106 % 2;
                            handler.post(jVar3);
                            int i108 = b;
                            int i109 = (i108 & 29) + (i108 | 29);
                            a = i109 % 128;
                            int i110 = i109 % 2;
                        }
                    } else if (str.length() > 0) {
                        int i1010 = b + 3;
                        a = i1010 % 128;
                        int i1011 = i1010 % 2;
                        ivas.gov.bisp.enumeration.aO.j jVar4 = P.c;
                        Handler handler2 = new Handler(Looper.getMainLooper());
                        ivas.gov.bisp.enumeration.p042bo.j jVar5 = new ivas.gov.bisp.enumeration.p042bo.j(this, str, 6);
                        int i1012 = a;
                        int i1013 = i1012 & 97;
                        int i1014 = i1013 + ((i1012 ^ 97) | i1013);
                        b = i1014 % 128;
                        int i1015 = i1014 % 2;
                        handler2.post(jVar5);
                        int i1016 = b;
                        int i1017 = (i1016 & 29) + (i1016 | 29);
                        a = i1017 % 128;
                        int i111 = i1017 % 2;
                    }
                }
            }
        } catch (Exception e) {
            ivas.gov.bisp.enumeration.aO.j jVar6 = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar7 = P.c;
            ((i) jVar6).w("OooOOO", BuildConfig.FLAVOR, e);
        }
        ivas.gov.bisp.enumeration.aO.j jVar8 = P.c;
        int i112 = b;
        int i113 = i112 & 87;
        int i114 = -(-((i112 ^ 87) | i113));
        int i115 = (i113 & i114) + (i114 | i113);
        a = i115 % 128;
        if (i115 % 2 != 0) {
            int i116 = 68 / 0;
        }
    }
}
