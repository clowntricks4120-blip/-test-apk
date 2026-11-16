package ivas.gov.bisp.enumeration.df;

import android.content.Context;
import ivas.gov.bisp.enumeration.bX.P;
import java.io.IOException;
import java.io.InputStream;
import org.acra.security.BaseKeyStoreFactory;

/* JADX INFO: loaded from: classes.dex */
public final class j extends BaseKeyStoreFactory {
    private static int b = 1;
    private static int c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String str2) {
        super(str);
        ivas.gov.bisp.enumeration.O.r.n(str, "certificateType");
        this.d = str2;
    }

    @Override // org.acra.security.BaseKeyStoreFactory
    public final InputStream b(Context context) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 | 95) << 1;
        int i4 = -(i2 ^ 95);
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        try {
            InputStream inputStreamOpen = context.getAssets().open(this.d);
            int i7 = b;
            int i8 = i7 & 29;
            int i9 = (i7 ^ 29) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            c = i10 % 128;
            int i11 = i10 % 2;
            return inputStreamOpen;
        } catch (IOException e) {
            ivas.gov.bisp.enumeration.aO.j jVar = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
            ((ivas.gov.bisp.enumeration.O.i) jVar).w("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r("Could not open certificate in asset://", this.d), e);
            return null;
        }
    }
}
