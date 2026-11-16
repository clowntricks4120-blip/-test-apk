package ivas.gov.bisp.enumeration.F;

import androidx.fragment.app.w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Y implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ArrayList c;

    public Y(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-44)) | ((~i3) & 43);
        int i5 = -(-((i3 & 43) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            arrayList = this.c;
            i = 5;
        } else {
            arrayList = this.c;
            i = 4;
        }
        w.q(arrayList, i);
    }
}
