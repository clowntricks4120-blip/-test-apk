package ivas.gov.bisp.enumeration.p036bi;

import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.AddressActivity;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0176e implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ AddressActivity c;

    public C0176e(AddressActivity addressActivity) {
        this.c = addressActivity;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 89;
        int i4 = (i2 & 89) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        try {
            try {
                String string = ((JSONObject) obj).getString("message");
                int i7 = a;
                int i8 = i7 | 83;
                int i9 = (i8 << 1) - ((~(i7 & 83)) & i8);
                b = i9 % 128;
                int i10 = i9 % 2;
                this.c.af.dismiss();
                int i11 = a;
                int i12 = (((i11 & (-76)) | ((~i11) & 75)) - (~((i11 & 75) << 1))) - 1;
                b = i12 % 128;
                int i13 = i12 % 2;
                Toast.makeText(this.c, string, 0).show();
                int i14 = a;
                int i15 = i14 & 55;
                int i16 = -(-(i14 | 55));
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    this.c.onBackPressed();
                } else {
                    this.c.onBackPressed();
                    throw null;
                }
            } catch (JSONException unused) {
                this.c.finish();
                this.c.af.dismiss();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
