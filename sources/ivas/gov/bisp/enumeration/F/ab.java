package ivas.gov.bisp.enumeration.F;

import android.view.View;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ab implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Map d;

    public ab(K k, ArrayList arrayList, Map map) {
        this.c = arrayList;
        this.d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 73;
        int i5 = (i3 ^ 73) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            size = this.c.size();
            i = 1;
        } else {
            size = this.c.size();
            i = 0;
        }
        while (true) {
            Object obj = null;
            if (i >= size) {
                int i7 = b;
                int i8 = (i7 & 4) + (i7 | 4);
                int i9 = (i8 ^ (-1)) + (i8 << 1);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i10 = a;
            int i11 = i10 ^ 45;
            int i12 = (((i10 & 45) | i11) << 1) - i11;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            View view = (View) this.c.get(i);
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            String strL = T.aXb.l(view);
            int i13 = b;
            int i14 = i13 & 57;
            int i15 = ((i13 | 57) & (~i14)) + (i14 << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            Object obj2 = this.d.get(strL);
            int i17 = b;
            int i18 = (i17 ^ 93) + ((i17 & 93) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            T.aXb.x(view, (String) obj2);
            int i20 = a;
            int i21 = (i20 ^ 69) + ((i20 & 69) << 1);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = i & 30;
                i = i22 + ((i ^ 30) | i22);
            } else {
                int i23 = i & (-4);
                int i24 = i23 + ((i ^ (-4)) | i23);
                int i25 = i24 & 5;
                int i26 = (i24 ^ 5) | i25;
                i = (i25 & i26) + (i25 | i26);
            }
        }
    }
}
