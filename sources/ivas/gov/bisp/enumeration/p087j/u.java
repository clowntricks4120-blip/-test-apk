package ivas.gov.bisp.enumeration.p087j;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.savedstate.b;
import ivas.gov.bisp.enumeration.p054c.c;

/* JADX INFO: loaded from: classes.dex */
public class u implements c {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ AppCompatActivity c;

    public u(AppCompatActivity appCompatActivity) {
        this.c = appCompatActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p054c.c
    public void b(Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 83;
        int i4 = (((i2 & 83) | i3) << 1) - i3;
        b = i4 % 128;
        int i5 = i4 % 2;
        a aVarM = this.c.m();
        aVarM.d();
        int i6 = b;
        int i7 = i6 & 85;
        int i8 = ((((i6 ^ 85) | i7) << 1) - (~(-((i6 | 85) & (~i7))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        b bVar = this.c.e.b;
        int i10 = a;
        int i11 = i10 & 67;
        int i12 = (((i10 ^ 67) | i11) << 1) - ((i10 | 67) & (~i11));
        b = i12 % 128;
        int i13 = i12 % 2;
        aVarM.m(bVar.b("androidx:appcompat"));
        int i14 = b;
        int i15 = i14 & 121;
        int i16 = (i14 ^ 121) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
    }
}
