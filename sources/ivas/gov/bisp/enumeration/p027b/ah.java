package ivas.gov.bisp.enumeration.p027b;

import androidx.lifecycle.LiveData;

/* JADX INFO: loaded from: classes.dex */
public class ah<T> extends LiveData<T> {
    private static int k = 1;
    private static int l;

    public void j(T t) {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 ^ 25;
        int i4 = ((i2 & 25) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        k = i6 % 128;
        int i7 = i6 % 2;
        LiveData.c("setValue");
        int i8 = this.i;
        int i9 = i8 ^ 1;
        this.i = ((((i8 & 1) | i9) << 1) - (~(-i9))) - 1;
        int i10 = k;
        int i11 = i10 & 11;
        int i12 = -(-(i10 | 11));
        int i13 = (i11 & i12) + (i12 | i11);
        l = i13 % 128;
        Object obj = null;
        if (i13 % 2 == 0) {
            this.h = t;
            e(null);
        } else {
            this.h = t;
            e(null);
            obj.hashCode();
            throw null;
        }
    }
}
