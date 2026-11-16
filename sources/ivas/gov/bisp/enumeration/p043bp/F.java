package ivas.gov.bisp.enumeration.p043bp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.ActivityRoster;
import java.util.Date;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class F implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityRoster c;

    public F(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = ((i2 ^ 89) | i3) << 1;
        int i5 = -((i2 | 89) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            this.c.bz.hide();
            EditText editText = this.c.et_RosterCNICRepeat;
            throw null;
        }
        this.c.bz.hide();
        String strReplaceAll = this.c.et_RosterCNICRepeat.getText().toString().trim().replaceAll("-", BuildConfig.FLAVOR);
        int i7 = b;
        int i8 = (i7 ^ 43) + ((i7 & 43) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        if (strReplaceAll.length() <= 0) {
            Toast.makeText(this.c.getApplicationContext(), "Please enter valid CNIC!", 0).show();
            int i10 = a;
            int i11 = i10 & 5;
            int i12 = -(-(i10 | 5));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        new Date();
        ActivityRoster activityRoster = this.c;
        if (activityRoster.bF) {
            int i14 = a + 67;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                activityRoster.bF = false;
            } else {
                activityRoster.bF = false;
            }
            activityRoster.al.shutdownNow();
            ActivityRoster activityRoster2 = this.c;
            activityRoster2.al = null;
            int i15 = a + 47;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                activityRoster2.ak.e();
                int i16 = 83 / 0;
            } else {
                activityRoster2.ak.e();
            }
        }
        ActivityRoster activityRoster3 = this.c;
        ImageView imageView = activityRoster3.aK;
        Bitmap bitmap = activityRoster3.bA;
        int i17 = a;
        int i18 = ((i17 ^ 112) + ((i17 & 112) << 1)) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
        imageView.setImageBitmap(bitmap);
        Context applicationContext = this.c.getApplicationContext();
        int i20 = b;
        int i21 = ((i20 & 90) + (i20 | 90)) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
        Toast.makeText(applicationContext, "Fingerprint Captured", 1).show();
        TextView textView = this.c.vald_txt_view;
        int i23 = a;
        int i24 = i23 & 1;
        int i25 = (i23 ^ 1) | i24;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        b = i26 % 128;
        int i27 = i26 % 2;
        textView.setText(BuildConfig.FLAVOR);
        int i28 = a;
        int i29 = i28 & 117;
        int i30 = (((i28 | 117) & (~i29)) - (~(-(-(i29 << 1))))) - 1;
        b = i30 % 128;
        int i31 = i30 % 2;
    }
}
