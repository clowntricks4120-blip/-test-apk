package ivas.gov.bisp.enumeration.bK;

import android.os.AsyncTask;
import ivas.gov.bisp.enumeration.bF.c;
import ivas.gov.bisp.enumeration.databaseModels.Structure;
import ivas.gov.bisp.enumeration.databaseModels.Villagemaps;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class aj extends AsyncTask<Void, c, c> {
    private static int a = 1;
    private static int b;
    public h c;
    public Structure d = this.d;
    public Structure d = this.d;
    public List<Villagemaps> e = this.e;
    public List<Villagemaps> e = this.e;

    public aj(h hVar) {
        this.c = hVar;
    }

    @Override // android.os.AsyncTask
    public c doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        c cVar = new c();
        int i2 = a;
        int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
        b = i3 % 128;
        cVar.a = i3 % 2 != 0 ? 4 : 2;
        return cVar;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(c cVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (i2 | 67) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        c cVar2 = cVar;
        Object obj = null;
        if (cVar2 != null) {
            if (cVar2.a != 2) {
                this.c.aI(cVar2);
                int i8 = b + 95;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i9 = a;
            int i10 = (((i9 | 44) << 1) - (i9 ^ 44)) - 1;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                this.c.aJ(false, BuildConfig.FLAVOR);
            } else {
                this.c.aJ(true, BuildConfig.FLAVOR);
            }
            int i11 = b;
            int i12 = ((i11 | 25) << 1) - (i11 ^ 25);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        h hVar = this.c;
        c cVar3 = new c();
        int i13 = b;
        int i14 = i13 & 111;
        int i15 = -(-(i13 | 111));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            hVar.aI(cVar3);
            obj.hashCode();
            throw null;
        }
        hVar.aI(cVar3);
        int i17 = b;
        int i18 = i17 & 33;
        int i19 = (i17 | 33) & (~i18);
        int i20 = i18 << 1;
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        a = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 85 / 0;
        }
    }
}
