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
public class bc implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ bs c;

    public bc(bs bsVar) {
        this.c = bsVar;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = -(-(i2 | 13));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                ((JSONObject) obj).getString("result");
                throw null;
            }
            try {
                JSONObject jSONObject = new JSONObject(b.c(((JSONObject) obj).getString("result"), b.b(this.c.g.k()), b.b(this.c.g.m())));
                int i6 = a;
                int i7 = i6 & 105;
                int i8 = (i6 | 105) & (~i7);
                int i9 = -(-(i7 << 1));
                int i10 = (i8 & i9) + (i8 | i9);
                b = i10 % 128;
                int i11 = i10 % 2;
                String string = jSONObject.getString("message");
                if (!string.contains("Invalid Cnic")) {
                    if (string.equalsIgnoreCase("Cnic Data Found In Nadra")) {
                        int i12 = a;
                        int i13 = i12 | 57;
                        int i14 = ((i13 << 1) - (~(-((~(i12 & 57)) & i13)))) - 1;
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        Toast.makeText(this.c.h, "message", 0).show();
                        Intent intent = new Intent(this.c.h, (Class<?>) TokenActivity.class);
                        int i16 = a;
                        int i17 = ((i16 & 74) + (i16 | 74)) - 1;
                        b = i17 % 128;
                        if (i17 % 2 == 0) {
                            Activity activity = this.c.h;
                            throw null;
                        }
                        this.c.h.startActivity(intent);
                        int i18 = a;
                        int i19 = i18 & 107;
                        int i20 = -(-((i18 ^ 107) | i19));
                        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        return;
                    }
                    int i23 = b;
                    int i24 = i23 & 91;
                    int i25 = ((i23 ^ 91) | i24) << 1;
                    int i26 = -((i23 | 91) & (~i24));
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    return;
                }
                bs bsVar = this.c;
                Objects.requireNonNull(bsVar);
                AlertDialog.Builder builder = new AlertDialog.Builder(bsVar.h.getApplicationContext());
                int i29 = a;
                int i30 = i29 & 85;
                int i31 = (i29 | 85) & (~i30);
                int i32 = -(-(i30 << 1));
                int i33 = (i31 & i32) + (i31 | i32);
                b = i33 % 128;
                if (i33 % 2 == 0) {
                    builder.setTitle("Alert.!");
                    builder.setMessage(string);
                    throw null;
                }
                builder.setTitle("Alert.!");
                builder.setMessage(string);
                builder.setCancelable(true);
                bf bfVar = new bf(bsVar);
                int i34 = a;
                int i35 = i34 & 99;
                int i36 = (i35 - (~((i34 ^ 99) | i35))) - 1;
                b = i36 % 128;
                int i37 = i36 % 2;
                builder.setPositiveButton("Ok", bfVar);
                AlertDialog alertDialogCreate = builder.create();
                int i38 = a;
                int i39 = ((i38 & 68) + (i38 | 68)) - 1;
                b = i39 % 128;
                int i40 = i39 % 2;
                alertDialogCreate.show();
                int i41 = b;
                int i42 = i41 & 45;
                int i43 = ((i41 ^ 45) | i42) << 1;
                int i44 = -((i41 | 45) & (~i42));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                a = i45 % 128;
                if (i45 % 2 != 0) {
                    throw null;
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        } catch (JSONException unused) {
        }
    }
}
