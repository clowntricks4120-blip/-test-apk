package ivas.gov.bisp.enumeration.p031bd;

import android.content.DialogInterface;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy;

/* JADX INFO: loaded from: classes.dex */
public class Q implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ T c;

    public Q(T t) {
        this.c = t;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        GenderDiscrepancy genderDiscrepancy = this.c.c;
        Intent intent = new Intent(this.c.c, (Class<?>) DiscrepancyRosterListActivity.class);
        int i3 = a;
        int i4 = i3 & 55;
        int i5 = ((((i3 ^ 55) | i4) << 1) - (~(-((i3 | 55) & (~i4))))) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            genderDiscrepancy.startActivity(intent);
            this.c.c.finish();
            throw null;
        }
        genderDiscrepancy.startActivity(intent);
        this.c.c.finish();
        int i6 = a;
        int i7 = ((i6 ^ 108) + ((i6 & 108) << 1)) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        dialogInterface.cancel();
        int i9 = b;
        int i10 = i9 & 31;
        int i11 = ((i9 ^ 31) | i10) << 1;
        int i12 = -((i9 | 31) & (~i10));
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        int i14 = i13 % 2;
    }
}
