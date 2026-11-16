package ivas.gov.bisp.enumeration.bI;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import java.util.Date;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bI.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0124s implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityRoster c;

    public ViewOnClickListenerC0124s(ActivityRoster activityRoster) {
        this.c = activityRoster;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ActivityRoster activityRoster;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 39) << 1;
        int i4 = -(i2 ^ 39);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.c.bQ.hide();
            activityRoster = this.c;
            int i6 = 34 / 0;
        } else {
            this.c.bQ.hide();
            activityRoster = this.c;
        }
        int i7 = b;
        int i8 = ((i7 | 49) << 1) - (i7 ^ 49);
        a = i8 % 128;
        int i9 = i8 % 2;
        String strTrim = activityRoster.et_RosterCNICRepeat.getText().toString().trim();
        int i10 = a + 109;
        b = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            strTrim.replaceAll("-", BuildConfig.FLAVOR).length();
            throw null;
        }
        if (strTrim.replaceAll("-", BuildConfig.FLAVOR).length() <= 0) {
            Toast.makeText(this.c.getApplicationContext(), "Please enter valid CNIC!", 0).show();
            int i11 = b;
            int i12 = i11 & 43;
            int i13 = (i11 | 43) & (~i12);
            int i14 = i12 << 1;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        new Date();
        ActivityRoster activityRoster2 = this.c;
        if (activityRoster2.bX) {
            int i16 = b;
            int i17 = i16 & 21;
            int i18 = -(-((i16 ^ 21) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            activityRoster2.bX = false;
            activityRoster2.al.shutdownNow();
            int i21 = b;
            int i22 = ((i21 & 40) + (i21 | 40)) - 1;
            a = i22 % 128;
            if (i22 % 2 == 0) {
                this.c.al = null;
                obj.hashCode();
                throw null;
            }
            ActivityRoster activityRoster3 = this.c;
            activityRoster3.al = null;
            int i23 = a;
            int i24 = i23 & 119;
            int i25 = ((((i23 ^ 119) | i24) << 1) - (~(-((i23 | 119) & (~i24))))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            activityRoster3.ak.e();
            int i27 = a;
            int i28 = ((i27 ^ 32) + ((i27 & 32) << 1)) - 1;
            b = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 5 / 3;
            }
        }
        ActivityRoster activityRoster4 = this.c;
        ImageView imageView = activityRoster4.aL;
        Bitmap bitmap = activityRoster4.bR;
        int i30 = b + 29;
        a = i30 % 128;
        if (i30 % 2 == 0) {
            imageView.setImageBitmap(bitmap);
            this.c.getApplicationContext();
            throw null;
        }
        imageView.setImageBitmap(bitmap);
        Context applicationContext = this.c.getApplicationContext();
        int i31 = a;
        int i32 = ((i31 & (-106)) | ((~i31) & 105)) + ((i31 & 105) << 1);
        b = i32 % 128;
        if (i32 % 2 != 0) {
            Toast.makeText(applicationContext, "Fingerprint Captured", 1).show();
        } else {
            Toast.makeText(applicationContext, "Fingerprint Captured", 1).show();
        }
        TextView textView = this.c.vald_txt_view;
        int i33 = a + 47;
        b = i33 % 128;
        if (i33 % 2 == 0) {
            textView.setText(BuildConfig.FLAVOR);
        } else {
            textView.setText(BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
    }
}
