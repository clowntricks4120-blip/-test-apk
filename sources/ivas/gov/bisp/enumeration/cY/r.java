package ivas.gov.bisp.enumeration.cY;

import android.content.Context;
import android.net.Uri;
import ivas.gov.bisp.enumeration.o00oOoo.OooO0OO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import org.acra.attachment.AcraContentProvider;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes.dex */
public final class r extends OooO0OO<Uri> {
    private static int a = 1;
    private static int b;
    public final Context l;

    public r(ivas.gov.bisp.enumeration.aB.r rVar, Context context, String str, String str2, int i, int i2, Map<String, String> map) {
        super(rVar, context, HttpSender.Method.PUT, str, str2, i, i2, map);
        this.l = context;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0058  */
    public final String d(Context context, Object obj) {
        Uri uri;
        String strB;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 125) - (~((i2 & 125) << 1))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            uri = (Uri) obj;
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
            int i4 = 94 / 0;
        } else {
            uri = (Uri) obj;
            ivas.gov.bisp.enumeration.O.r.n(context, "context");
        }
        int i5 = b;
        int i6 = i5 & 39;
        int i7 = i6 + ((i5 ^ 39) | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        ivas.gov.bisp.enumeration.O.r.n(uri, "uri");
        if (!(!ivas.gov.bisp.enumeration.O.r.f(uri.getScheme(), "content"))) {
            int i9 = b + 9;
            a = i9 % 128;
            int i10 = i9 % 2;
            strB = context.getContentResolver().getType(uri);
            if (strB == null) {
                strB = AcraContentProvider.a.b(uri);
                int i11 = a + 57;
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            strB = AcraContentProvider.a.b(uri);
            int i13 = a + 57;
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = b;
        int i16 = i15 & 51;
        int i17 = (((i15 ^ 51) | i16) << 1) - ((i15 | 51) & (~i16));
        a = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 52 / 0;
        }
        return strB;
    }

    public final void h(OutputStream outputStream, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = b + 87;
        a = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            ivas.gov.bisp.enumeration.O.r.n((Uri) obj, "content");
            obj2.hashCode();
            throw null;
        }
        Uri uri = (Uri) obj;
        ivas.gov.bisp.enumeration.O.r.n(uri, "content");
        Context context = this.l;
        ivas.gov.bisp.enumeration.O.r.n(context, "context");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        int i3 = a;
        int i4 = ((i3 ^ 14) + ((i3 & 14) << 1)) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (inputStreamOpenInputStream == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not open ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
        byte[] bArr = new byte[8192];
        int i5 = inputStreamOpenInputStream.read(bArr);
        int i6 = b;
        int i7 = i6 & 113;
        int i8 = i7 + ((i6 ^ 113) | i7);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 5 / 2;
        }
        while (i5 >= 0) {
            int i10 = a;
            int i11 = i10 & 29;
            int i12 = (i10 ^ 29) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            outputStream.write(bArr, 0, i5);
            i5 = inputStreamOpenInputStream.read(bArr);
            int i15 = a + 97;
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            int i18 = i16 & 57;
            int i19 = i18 + ((i16 ^ 57) | i18);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = b;
        int i22 = i21 & 117;
        int i23 = -(-((i21 ^ 117) | i22));
        int i24 = (i22 & i23) + (i23 | i22);
        a = i24 % 128;
        int i25 = i24 % 2;
    }
}
