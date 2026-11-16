package ivas.gov.bisp.enumeration.df;

import android.content.Context;
import ivas.gov.bisp.enumeration.bX.P;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.acra.security.BaseKeyStoreFactory;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BaseKeyStoreFactory {
    private static int b = 0;
    private static int c = 1;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        super(str);
        ivas.gov.bisp.enumeration.O.r.l(str);
        this.d = str2;
    }

    @Override // org.acra.security.BaseKeyStoreFactory
    public final InputStream b(Context context) {
        int i = 2 % 2;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.d);
            int i2 = b + 69;
            c = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 32 / 0;
            }
            return fileInputStream;
        } catch (FileNotFoundException e) {
            ivas.gov.bisp.enumeration.aO.j jVar = P.c;
            ivas.gov.bisp.enumeration.aO.j jVar2 = P.c;
            ((ivas.gov.bisp.enumeration.O.i) jVar).w("OooOOO", ivas.gov.bisp.enumeration.p091n.j.r("Could not find File ", this.d), e);
            return null;
        }
    }
}
