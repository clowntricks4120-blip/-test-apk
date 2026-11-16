package ivas.gov.bisp.enumeration.p049bv;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;

/* JADX INFO: loaded from: classes.dex */
public class t implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityEnumeratorMain c;

    public t(ActivityEnumeratorMain activityEnumeratorMain) {
        this.c = activityEnumeratorMain;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 41) + (i2 | 41);
        a = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                this.c.getPackageManager().getLaunchIntentForPackage("com.bisp.nsersupportapp");
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                Intent launchIntentForPackage = this.c.getPackageManager().getLaunchIntentForPackage("com.bisp.nsersupportapp");
                if (launchIntentForPackage == null) {
                    Toast.makeText(this.c, "Support Application is not installed.", 0).show();
                    int i4 = b + 67;
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 32 / 0;
                        return;
                    }
                    return;
                }
                int i6 = b + 71;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                this.c.startActivity(launchIntentForPackage);
                int i7 = b;
                int i8 = (((i7 ^ 111) | (i7 & 111)) << 1) - (((~i7) & 111) | (i7 & (-112)));
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            } catch (ArrayStoreException e) {
                throw e;
            }
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.c, "Support Application is not installed.", 0).show();
        } catch (Exception unused2) {
            Toast.makeText(this.c, "Support Application not installed.", 0).show();
        }
    }
}
