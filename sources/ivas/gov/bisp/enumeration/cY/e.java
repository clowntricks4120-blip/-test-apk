package ivas.gov.bisp.enumeration.cY;

import android.content.Context;
import ivas.gov.bisp.enumeration.bV.U;
import ivas.gov.bisp.enumeration.o00oOoo.OooO0OO;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Map;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes.dex */
public final class e extends OooO0OO<String> {
    private static int a = 1;
    private static int b;
    public final String l;

    public e(ivas.gov.bisp.enumeration.aB.r rVar, Context context, HttpSender.Method method, String str, String str2, String str3, int i, int i2, Map<String, String> map) {
        super(rVar, context, method, str2, str3, i, i2, map);
        this.l = str;
    }

    public final String d(Context context, Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = (i3 - (~(-(-((i2 ^ 115) | i3))))) - 1;
        b = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            obj2.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        int i5 = b;
        int i6 = (i5 & (-98)) | ((~i5) & 97);
        int i7 = (i5 & 97) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        ivas.gov.bisp.enumeration.O.r.n((String) obj, "t");
        String str = this.l;
        int i10 = b;
        int i11 = i10 & 39;
        int i12 = ((((i10 ^ 39) | i11) << 1) - (~(-((i10 | 39) & (~i11))))) - 1;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        obj2.hashCode();
        throw null;
    }

    public final void h(OutputStream outputStream, Object obj) throws IOException {
        String str;
        Charset charset;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 63) + ((i2 & 63) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            str = (String) obj;
            ivas.gov.bisp.enumeration.O.r.n(str, "content");
            charset = U.c;
            int i4 = 99 / 0;
        } else {
            str = (String) obj;
            ivas.gov.bisp.enumeration.O.r.n(str, "content");
            charset = U.c;
        }
        byte[] bytes = str.getBytes(charset);
        ivas.gov.bisp.enumeration.O.r.m(bytes, "this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes);
        int i5 = a + 113;
        b = i5 % 128;
        int i6 = i5 % 2;
    }
}
