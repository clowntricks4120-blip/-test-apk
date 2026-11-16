package ivas.gov.bisp.enumeration.p023aw;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class l implements h.bKv {
    private static int a = 0;
    private static int b = 1;
    public File c = null;
    public final /* synthetic */ Context d;

    public l(Context context) {
        this.d = context;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public File c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-106)) | ((~i2) & 105);
        int i4 = (i2 & 105) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
            if (this.c == null) {
                File file = new File(this.d.getCacheDir(), "volley");
                int i7 = b + 121;
                int i8 = i7 % 128;
                a = i8;
                int i9 = i7 % 2;
                this.c = file;
                int i10 = i8 & 45;
                int i11 = (i8 ^ 45) | i10;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        } else if (this.c == null) {
            File file2 = new File(this.d.getCacheDir(), "volley");
            int i14 = b + 121;
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            this.c = file2;
            int i17 = i15 & 45;
            int i18 = (i15 ^ 45) | i17;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            b = i19 % 128;
            int i110 = i19 % 2;
        }
        File file3 = this.c;
        int i20 = b;
        int i21 = i20 & 19;
        int i22 = (i20 | 19) & (~i21);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
        return file3;
    }
}
