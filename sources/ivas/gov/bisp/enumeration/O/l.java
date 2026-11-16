package ivas.gov.bisp.enumeration.O;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l extends a.bfx {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ List d;
    public final /* synthetic */ Matrix e;

    public l(a aVar, List list, Matrix matrix) {
        this.d = list;
        this.e = matrix;
    }

    @Override // ivas.gov.bisp.enumeration.O.a.bfx
    public void c(Matrix matrix, ivas.gov.bisp.enumeration.R.j jVar, int i, Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = a + 43;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = a;
        int i6 = ((i5 & 16) + (i5 | 16)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        for (a.bfx bfxVar : this.d) {
            int i8 = b;
            int i9 = i8 | 31;
            int i10 = i9 << 1;
            int i11 = -((~(i8 & 31)) & i9);
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            Matrix matrix2 = this.e;
            int i14 = a;
            int i15 = (i14 & (-82)) | ((~i14) & 81);
            int i16 = -(-((i14 & 81) << 1));
            int i17 = (i15 & i16) + (i16 | i15);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                bfxVar.c(matrix2, jVar, i, canvas);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            bfxVar.c(matrix2, jVar, i, canvas);
        }
        int i18 = b;
        int i19 = (i18 & 89) + (i18 | 89);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 33 / 0;
        }
    }
}
