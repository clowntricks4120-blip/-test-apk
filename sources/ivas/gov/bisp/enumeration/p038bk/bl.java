package ivas.gov.bisp.enumeration.p038bk;

import android.view.View;
import ivas.gov.bisp.enumeration.p040bm.p;
import ivas.gov.bisp.enumeration.p091n.j;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class bl implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ bm f;

    public bl(bm bmVar, String str, String str2, String str3) {
        this.f = bmVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        p pVar = new p(this.f.g, "House Hold", j.u(j.w("Do you want to add "), this.c, " as house hold Head?"), this.c, BuildConfig.FLAVOR, this.d, this.e, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        int i2 = a;
        int i3 = i2 & 47;
        int i4 = (i2 ^ 47) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        pVar.show();
        pVar.setCancelable(false);
        int i7 = a;
        int i8 = i7 & 107;
        int i9 = (i7 ^ 107) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }
}
