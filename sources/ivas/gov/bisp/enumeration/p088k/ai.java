package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public class ai extends ContextWrapper {
    private static int a = 0;
    private static int b = 1;
    public static final Object c = new Object();

    static {
        int i = a;
        int i2 = (((i & (-78)) | ((~i) & 77)) - (~((i & 77) << 1))) - 1;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public static Context b(Context context) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 55) + (i2 | 55);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = context instanceof ai;
            obj.hashCode();
            throw null;
        }
        if (!(context instanceof ai)) {
            int i4 = i2 & 29;
            int i5 = -(-(i2 | 29));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z2 = context.getResources() instanceof F;
                throw null;
            }
            if (!(context.getResources() instanceof F)) {
                int i7 = ah.a;
                int i8 = b;
                int i9 = i8 & 43;
                int i10 = ((i8 ^ 43) | i9) << 1;
                int i11 = -((i8 | 43) & (~i9));
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        int i14 = b;
        int i15 = (i14 | 119) << 1;
        int i16 = -(((~i14) & 119) | (i14 & (-120)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            return context;
        }
        throw null;
    }
}
