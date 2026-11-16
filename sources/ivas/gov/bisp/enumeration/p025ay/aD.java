package ivas.gov.bisp.enumeration.p025ay;

import android.view.View;
import androidx.appcompat.app.b;

/* JADX INFO: loaded from: classes.dex */
public class aD implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ b c;

    public aD(aI aIVar, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 30) + (i2 | 30)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.dismiss();
        int i5 = a;
        int i6 = i5 | 31;
        int i7 = i6 << 1;
        int i8 = -((~(i5 & 31)) & i6);
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
    }
}
