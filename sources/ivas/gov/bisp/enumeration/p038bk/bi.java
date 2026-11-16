package ivas.gov.bisp.enumeration.p038bk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.TokenActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bi implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ bk c;

    public bi(bk bkVar) {
        this.c = bkVar;
    }

    public void b(Object obj) {
        String strM;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = (i2 | 71) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        try {
            try {
                String string = ((JSONObject) obj).getString("result");
                bk bkVar = this.c;
                int i8 = a;
                int i9 = ((i8 & 64) + (i8 | 64)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArrB = b.b(bkVar.g.k());
                int i11 = b;
                int i12 = (i11 & 1) + (i11 | 1);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    strM = this.c.g.m();
                    int i13 = 5 / 0;
                } else {
                    strM = this.c.g.m();
                }
                JSONObject jSONObject = new JSONObject(b.c(string, bArrB, b.b(strM)));
                int i14 = (-2) - ((a + 92) ^ (-1));
                b = i14 % 128;
                int i15 = i14 % 2;
                String string2 = jSONObject.getString("message");
                if (string2.contains("Invalid Cnic")) {
                    bk bkVar2 = this.c;
                    Objects.requireNonNull(bkVar2);
                    AlertDialog.Builder builder = new AlertDialog.Builder(bkVar2.h.getApplicationContext());
                    int i16 = b + 113;
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    builder.setTitle("Alert.!");
                    builder.setMessage(string2);
                    builder.setCancelable(true);
                    bj bjVar = new bj(bkVar2);
                    int i18 = b;
                    int i19 = i18 ^ 85;
                    int i20 = -(-((i18 & 85) << 1));
                    int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                    a = i21 % 128;
                    if (i21 % 2 == 0) {
                        builder.setPositiveButton("Ok", bjVar);
                        builder.create().show();
                        return;
                    } else {
                        builder.setPositiveButton("Ok", bjVar);
                        builder.create().show();
                        int i22 = 77 / 0;
                        return;
                    }
                }
                if (string2.equalsIgnoreCase("Cnic Data Found In Nadra")) {
                    int i23 = a;
                    int i24 = i23 & 111;
                    int i25 = i24 + ((i23 ^ 111) | i24);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    Toast.makeText(this.c.h, "message", 0).show();
                    Intent intent = new Intent(this.c.h, (Class<?>) TokenActivity.class);
                    int i27 = b;
                    int i28 = i27 & 93;
                    int i29 = -(-((i27 ^ 93) | i28));
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    Activity activity = this.c.h;
                    int i32 = b;
                    int i33 = ((i32 & 95) - (~(-(-(i32 | 95))))) - 1;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    activity.startActivity(intent);
                    int i35 = (-2) - ((b + 100) ^ (-1));
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    return;
                }
                int i37 = a;
                int i38 = ((i37 ^ 54) + ((i37 & 54) << 1)) - 1;
                b = i38 % 128;
                int i39 = i38 % 2;
            } catch (JSONException unused) {
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
