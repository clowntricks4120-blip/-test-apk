package ivas.gov.bisp.enumeration.df;

import android.content.Context;
import java.io.InputStream;
import org.acra.security.BaseKeyStoreFactory;

/* JADX INFO: loaded from: classes.dex */
public final class i extends BaseKeyStoreFactory {
    private static int b = 0;
    private static int c = 1;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, int i) {
        super(str);
        ivas.gov.bisp.enumeration.O.r.n(str, "certificateType");
        this.d = i;
    }

    @Override // org.acra.security.BaseKeyStoreFactory
    public final InputStream b(Context context) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 & (-12)) | ((~i2) & 11)) + ((i2 & 11) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(this.d);
        int i5 = c;
        int i6 = (i5 ^ 55) + ((i5 & 55) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            ivas.gov.bisp.enumeration.O.r.m(inputStreamOpenRawResource, "context.resources.openRawResource(rawRes)");
            int i7 = 5 / 0;
        } else {
            ivas.gov.bisp.enumeration.O.r.m(inputStreamOpenRawResource, "context.resources.openRawResource(rawRes)");
        }
        return inputStreamOpenRawResource;
    }
}
