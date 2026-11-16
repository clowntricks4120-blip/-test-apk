package ivas.gov.bisp.enumeration.bW;

import android.content.Context;
import android.net.Uri;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.aO.j;
import ivas.gov.bisp.enumeration.bX.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W implements y {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.bW.y
    public final List<Uri> b(Context context, r rVar) {
        Uri uri;
        int i = 2 % 2;
        ivas.gov.bisp.enumeration.O.r.n(rVar, "configuration");
        List<String> list = rVar.w;
        ArrayList arrayList = new ArrayList();
        int i2 = a;
        int i3 = i2 ^ 101;
        int i4 = -(-((i2 & 101) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Iterator<T> it = list.iterator();
        int i7 = b + 55;
        a = i7 % 128;
        int i8 = i7 % 2;
        while (true) {
            uri = null;
            if (!it.hasNext()) {
                break;
            }
            int i9 = a;
            int i10 = ((i9 ^ 110) + ((i9 & 110) << 1)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            String str = (String) it.next();
            int i12 = a;
            int i13 = ((i12 & 108) + (i12 | 108)) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            try {
                uri = Uri.parse(str);
                int i15 = a + 119;
                b = i15 % 128;
                int i16 = i15 % 2;
            } catch (Exception e) {
                j jVar = P.c;
                j jVar2 = P.c;
                ((i) jVar).w("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r("Failed to parse Uri ", str), e);
            }
            if (uri != null) {
                int i17 = b;
                int i18 = i17 & 45;
                int i19 = i17 | 45;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                arrayList.add(uri);
                int i22 = a;
                int i23 = ((i22 & 64) + (i22 | 64)) - 1;
                b = i23 % 128;
                int i24 = i23 % 2;
            }
        }
        int i25 = a;
        int i26 = i25 | 37;
        int i27 = i26 << 1;
        int i28 = -((~(i25 & 37)) & i26);
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        b = i29 % 128;
        if (i29 % 2 == 0) {
            return arrayList;
        }
        uri.hashCode();
        throw null;
    }
}
