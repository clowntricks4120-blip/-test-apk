package ivas.gov.bisp.enumeration.p043bp;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.W.z;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0200b implements C0094m.bas {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ z c;
    public final /* synthetic */ ProgressDialog d;
    public final /* synthetic */ Context e;

    public C0200b(BISPApplication bISPApplication, z zVar, ProgressDialog progressDialog, Context context) {
        this.c = zVar;
        this.d = progressDialog;
        this.e = context;
    }

    @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
    public void b(T t) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 3;
        int i4 = ((((i2 & 3) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.c.failureCall();
            this.d.isShowing();
            obj.hashCode();
            throw null;
        }
        this.c.failureCall();
        if (this.d.isShowing()) {
            int i5 = a;
            int i6 = i5 & 113;
            int i7 = (i5 | 113) & (~i6);
            int i8 = i6 << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                this.d.dismiss();
                int i10 = 5 / 0;
            } else {
                this.d.dismiss();
            }
        }
        ResponseMessage responseMessageE = ag.e(t);
        Log.e("error", t.toString());
        int i11 = b;
        int i12 = i11 & 109;
        int i13 = -(-((i11 ^ 109) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        Context context = this.e;
        String string = responseMessageE.getErrorMessage().toString();
        int i16 = a;
        int i17 = ((i16 | 58) << 1) - (i16 ^ 58);
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            Toast.makeText(context, string, 0).show();
            throw null;
        }
        Toast.makeText(context, string, 0).show();
        int i19 = b;
        int i20 = i19 & 37;
        int i21 = i20 + ((i19 ^ 37) | i20);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
