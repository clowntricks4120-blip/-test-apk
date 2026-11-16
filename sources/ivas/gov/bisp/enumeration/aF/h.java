package ivas.gov.bisp.enumeration.aF;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ivas.gov.bisp.enumeration.M.n;

/* JADX INFO: loaded from: classes.dex */
public class h implements n {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ BottomSheetBehavior d;

    public h(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.d = bottomSheetBehavior;
        this.c = i;
    }

    @Override // ivas.gov.bisp.enumeration.M.n
    public boolean b(View view, n.aXs axs) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 41) + ((i2 & 41) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.d.E(this.c);
        int i5 = a;
        int i6 = (i5 & (-46)) | ((~i5) & 45);
        int i7 = (i5 & 45) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
