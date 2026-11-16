package ivas.gov.bisp.enumeration.dd;

import android.content.DialogInterface;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdatePhoneNoActivity;

/* JADX INFO: loaded from: classes.dex */
public class ab implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ U c;

    public ab(U u) {
        this.c = u;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        UpdatePhoneNoActivity updatePhoneNoActivity;
        int i2 = 2 % 2;
        UpdatePhoneNoActivity updatePhoneNoActivity2 = this.c.c;
        Intent intent = new Intent(this.c.c, (Class<?>) DashboardActivity.class);
        int i3 = b;
        int i4 = i3 & 33;
        int i5 = i4 + ((i3 ^ 33) | i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            updatePhoneNoActivity2.startActivity(intent);
            dialogInterface.cancel();
            updatePhoneNoActivity = this.c.c;
            int i6 = 17 / 0;
        } else {
            updatePhoneNoActivity2.startActivity(intent);
            dialogInterface.cancel();
            updatePhoneNoActivity = this.c.c;
        }
        updatePhoneNoActivity.finish();
        int i7 = b + 76;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
