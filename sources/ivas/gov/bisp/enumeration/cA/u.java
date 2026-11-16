package ivas.gov.bisp.enumeration.cA;

import ivas.gov.bisp.enumeration.O.r;

/* JADX INFO: loaded from: classes.dex */
public class u extends r {
    private static int a = 0;
    private static int b = 1;
    public Object R;
    public final /* synthetic */ int S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z) {
        super(z);
        this.S = 2;
        this.R = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(boolean z, String str, int i) {
        super(z);
        this.S = i;
        this.R = str;
    }

    public String F() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = ((~i3) & (i2 | 47)) + (i3 << 1);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (this.S == 0) {
            String str = (String) this.R;
            int i7 = (((i5 | 4) << 1) - (i5 ^ 4)) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            return str;
        }
        int i9 = i2 & 63;
        int i10 = (i9 - (~(-(-((i2 ^ 63) | i9))))) - 1;
        int i11 = i10 % 128;
        a = i11;
        int i12 = i10 % 2;
        int i13 = (i11 ^ 47) + ((i11 & 47) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return (String) this.R;
        }
        throw null;
    }
}
