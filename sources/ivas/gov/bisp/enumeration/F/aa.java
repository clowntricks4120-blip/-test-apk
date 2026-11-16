package ivas.gov.bisp.enumeration.F;

import android.view.View;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class aa implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Map d;

    public aa(K k, ArrayList arrayList, Map map) {
        this.c = arrayList;
        this.d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
        b = i3 % 128;
        int i4 = i3 % 2;
        int size = this.c.size();
        int i5 = a;
        int i6 = i5 & 33;
        int i7 = i5 | 33;
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (i10 < size) {
            int i11 = a;
            int i12 = (i11 & (-34)) | ((~i11) & 33);
            int i13 = (i11 & 33) << 1;
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            String str = null;
            if (i14 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            View view = (View) this.c.get(i10);
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            String strL = T.aXb.l(view);
            if (strL != null) {
                int i15 = a;
                int i16 = i15 & 123;
                int i17 = -(-((i15 ^ 123) | i16));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                Iterator it = this.d.entrySet().iterator();
                int i20 = b;
                int i21 = ((i20 ^ 46) + ((i20 & 46) << 1)) - 1;
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    throw null;
                }
                while (true) {
                    if (!it.hasNext()) {
                        int i22 = a;
                        int i23 = (-2) - ((((i22 | 72) << 1) - (i22 ^ 72)) ^ (-1));
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        break;
                    }
                    int i25 = a;
                    int i26 = (i25 & 97) + (i25 | 97);
                    b = i26 % 128;
                    if (i26 % 2 == 0) {
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    int i27 = a;
                    int i28 = i27 & 123;
                    int i29 = (i27 ^ 123) | i28;
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    b = i30 % 128;
                    if (i30 % 2 == 0) {
                        strL.equals(entry.getValue());
                        str.hashCode();
                        throw null;
                    }
                    if (strL.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        int i31 = a;
                        int i32 = (i31 & 49) + (i31 | 49);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        break;
                    }
                }
                T.aXb.x(view, str);
                int i34 = b + 49;
                a = i34 % 128;
                int i35 = i34 % 2;
            }
            i10++;
            int i36 = a;
            int i37 = i36 & 91;
            int i38 = ((((i36 ^ 91) | i37) << 1) - (~(-((i36 | 91) & (~i37))))) - 1;
            b = i38 % 128;
            if (i38 % 2 == 0) {
                int i39 = 3 / 5;
            }
        }
        int i40 = a;
        int i41 = i40 ^ 5;
        int i42 = (i40 & 5) << 1;
        int i43 = (i41 & i42) + (i42 | i41);
        b = i43 % 128;
        int i44 = i43 % 2;
    }
}
