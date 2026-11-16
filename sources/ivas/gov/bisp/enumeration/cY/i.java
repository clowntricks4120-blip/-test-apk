package ivas.gov.bisp.enumeration.cY;

import android.content.Context;
import android.net.Uri;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bL.aE;
import ivas.gov.bisp.enumeration.bX.P;
import ivas.gov.bisp.enumeration.o000o0oo.o00OO00O;
import ivas.gov.bisp.enumeration.o00oOoo.OooO0OO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import net.sqlcipher.BuildConfig;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes.dex */
public final class i extends OooO0OO<o00OO00O<? extends String, ? extends List<? extends Uri>>> {
    private static int a = 0;
    private static int b = 1;
    public final Context l;
    public final String m;

    public i(ivas.gov.bisp.enumeration.aB.r rVar, Context context, String str, String str2, String str3, int i, int i2, Map<String, String> map) {
        super(rVar, context, HttpSender.Method.POST, str2, str3, i, i2, map);
        this.l = context;
        this.m = str;
    }

    public final String d(Context context, Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 103) - (~(i2 | 103))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        aE aEVar = (aE) obj;
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        int i5 = b;
        int i6 = i5 | 71;
        int i7 = ((i6 << 1) - (~(-((~(i5 & 71)) & i6)))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n(aEVar, "t");
            return "multipart/form-data; boundary=%&ACRA_REPORT_DIVIDER&%";
        }
        ivas.gov.bisp.enumeration.O.r.n(aEVar, "t");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x014a A[Catch: FileNotFoundException -> 0x018c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x018c, blocks: (B:29:0x0139, B:32:0x014a, B:34:0x0157, B:36:0x0174, B:38:0x0184, B:40:0x0188), top: B:66:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0184 A[Catch: FileNotFoundException -> 0x018c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x018c, blocks: (B:29:0x0139, B:32:0x014a, B:34:0x0157, B:36:0x0174, B:38:0x0184, B:40:0x0188), top: B:66:0x0139 }] */
    public final void h(OutputStream outputStream, Object obj) throws IOException {
        PrintWriter printWriterAppend;
        Object[] objArr;
        PrintWriter printWriter;
        Object[] objArr2;
        String str;
        char c;
        boolean z;
        Object[] objArr3;
        PrintWriter printWriter2;
        Object[] objArr4;
        int i;
        int i2 = 2 % 2;
        aE aEVar = (aE) obj;
        ivas.gov.bisp.enumeration.O.r.n(aEVar, "content");
        PrintWriter printWriter3 = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        int i3 = a;
        int i4 = (i3 & 55) + (i3 | 55);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            printWriterAppend = printWriter3.append((CharSequence) "\r\n--%&ACRA_REPORT_DIVIDER&%\r\n");
            objArr = new Object[4];
        } else {
            printWriterAppend = printWriter3.append((CharSequence) "\r\n--%&ACRA_REPORT_DIVIDER&%\r\n");
            objArr = new Object[2];
        }
        boolean z2 = false;
        objArr[0] = "ACRA_REPORT";
        objArr[1] = BuildConfig.FLAVOR;
        int i5 = b;
        int i6 = ((i5 & (-72)) | ((~i5) & 71)) + ((i5 & 71) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            printWriter = printWriterAppend.format("Content-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\n", objArr);
            objArr2 = new Object[0];
            str = this.m;
            c = 1;
        } else {
            printWriter = printWriterAppend.format("Content-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\n", objArr);
            objArr2 = new Object[1];
            str = this.m;
            c = 0;
        }
        int i7 = b + 51;
        a = i7 % 128;
        int i8 = i7 % 2;
        objArr2[c] = str;
        PrintWriter printWriterAppend2 = printWriter.format("Content-Type: %s\r\n", objArr2).append((CharSequence) "\r\n");
        int i9 = a + 61;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            printWriterAppend2.append((CharSequence) aEVar.c);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        printWriterAppend2.append((CharSequence) aEVar.c);
        int i10 = a;
        int i11 = (i10 & (-54)) | ((~i10) & 53);
        int i12 = (i10 & 53) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = b;
        int i16 = i15 ^ 41;
        int i17 = (i15 & 41) << 1;
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        for (Uri uri : (List) aEVar.d) {
            int i20 = b;
            int i21 = ((i20 ^ 82) + ((i20 & 82) << 1)) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
            try {
                Context context = this.l;
                int i23 = a;
                int i24 = ((i23 | 111) << 1) - (i23 ^ 111);
                b = i24 % 128;
                int i25 = i24 % 2;
                String strO = ivas.gov.bisp.enumeration.p100w.r.O(context, uri);
                PrintWriter printWriterAppend3 = printWriter3.append((CharSequence) "\r\n--%&ACRA_REPORT_DIVIDER&%\r\n");
                int i26 = b;
                int i27 = i26 & 29;
                int i28 = (~i27) & (i26 | 29);
                int i29 = -(-(i27 << 1));
                int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                a = i30 % 128;
                if (i30 % 2 != 0) {
                    try {
                        objArr3 = new Object[2];
                        objArr3[1] = "ACRA_ATTACHMENT";
                        objArr3[1] = strO;
                        printWriter2 = printWriterAppend3.format("Content-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\n", objArr3);
                        objArr4 = new Object[1];
                        int i31 = b;
                        int i32 = ((i31 & (-120)) | (119 & (~i31))) + ((i31 & 119) << 1);
                        a = i32 % 128;
                        int i33 = i32 % 2;
                        z = false;
                        try {
                            objArr4[0] = ivas.gov.bisp.enumeration.p100w.r.P(this.l, uri);
                            int i34 = a;
                            i = ((i34 | 117) << 1) - (i34 ^ 117);
                            b = i % 128;
                            if (i % 2 != 0) {
                                printWriter2.format("Content-Type: %s\r\n", objArr4);
                                throw null;
                            }
                            PrintWriter printWriter4 = printWriter2.format("Content-Type: %s\r\n", objArr4);
                            int i35 = b + 45;
                            a = i35 % 128;
                            int i36 = i35 % 2;
                            printWriter4.append((CharSequence) "\r\n").flush();
                            Context context2 = this.l;
                            int i37 = a;
                            int i38 = i37 | 27;
                            int i39 = ((i38 << 1) - (~(-((~(i37 & 27)) & i38)))) - 1;
                            b = i39 % 128;
                            int i40 = i39 % 2;
                            ivas.gov.bisp.enumeration.p100w.r.u(context2, outputStream, uri);
                            int i41 = a;
                            int i42 = (i41 & 81) + (i41 | 81);
                            b = i42 % 128;
                            int i43 = i42 % 2;
                        } catch (FileNotFoundException e) {
                            e = e;
                            j jVar = P.c;
                            j jVar2 = P.c;
                            ((ivas.gov.bisp.enumeration.O.i) jVar).y("OooOOO", "Not sending attachment", e);
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        z = false;
                        j jVar3 = P.c;
                        j jVar4 = P.c;
                        ((ivas.gov.bisp.enumeration.O.i) jVar3).y("OooOOO", "Not sending attachment", e);
                        z2 = z;
                    }
                } else {
                    objArr3 = new Object[2];
                    try {
                        objArr3[0] = "ACRA_ATTACHMENT";
                        objArr3[1] = strO;
                        printWriter2 = printWriterAppend3.format("Content-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\n", objArr3);
                        objArr4 = new Object[1];
                        int i310 = b;
                        int i311 = ((i310 & (-120)) | (119 & (~i310))) + ((i310 & 119) << 1);
                        a = i311 % 128;
                        int i312 = i311 % 2;
                        z = false;
                        objArr4[0] = ivas.gov.bisp.enumeration.p100w.r.P(this.l, uri);
                        int i313 = a;
                        i = ((i313 | 117) << 1) - (i313 ^ 117);
                        b = i % 128;
                        if (i % 2 != 0) {
                            printWriter2.format("Content-Type: %s\r\n", objArr4);
                            throw null;
                        }
                        PrintWriter printWriter5 = printWriter2.format("Content-Type: %s\r\n", objArr4);
                        int i314 = b + 45;
                        a = i314 % 128;
                        int i315 = i314 % 2;
                        printWriter5.append((CharSequence) "\r\n").flush();
                        Context context3 = this.l;
                        int i316 = a;
                        int i317 = i316 | 27;
                        int i318 = ((i317 << 1) - (~(-((~(i316 & 27)) & i317)))) - 1;
                        b = i318 % 128;
                        int i44 = i318 % 2;
                        ivas.gov.bisp.enumeration.p100w.r.u(context3, outputStream, uri);
                        int i45 = a;
                        int i46 = (i45 & 81) + (i45 | 81);
                        b = i46 % 128;
                        int i47 = i46 % 2;
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        z = false;
                        j jVar5 = P.c;
                        j jVar6 = P.c;
                        ((ivas.gov.bisp.enumeration.O.i) jVar5).y("OooOOO", "Not sending attachment", e);
                        z2 = z;
                    }
                }
            } catch (FileNotFoundException e4) {
                e = e4;
                z = z2;
            }
            z2 = z;
        }
        printWriter3.append((CharSequence) "\r\n--%&ACRA_REPORT_DIVIDER&%--\r\n").flush();
        int i48 = a;
        int i49 = i48 ^ 35;
        int i50 = ((i48 & 35) | i49) << 1;
        int i51 = -i49;
        int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
        b = i52 % 128;
        int i53 = i52 % 2;
    }
}
