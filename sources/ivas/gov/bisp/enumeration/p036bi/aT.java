package ivas.gov.bisp.enumeration.p036bi;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.CitizenData;
import ivas.gov.bisp.enumeration.p044bq.w;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class aT implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateRosterActivity c;

    public class bnv implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public bnv() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            UpdateRosterActivity updateRosterActivity = aT.this.c;
            w wVar = new w(updateRosterActivity, updateRosterActivity.bg);
            int i3 = a;
            int i4 = (((i3 | 32) << 1) - (i3 ^ 32)) - 1;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                wVar.execute(new Void[0]);
            } else {
                wVar.execute(new Void[0]);
            }
            dialogInterface.cancel();
        }
    }

    public aT(UpdateRosterActivity updateRosterActivity) {
        this.c = updateRosterActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b + 33;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.c.bj.getText().toString();
            throw null;
        }
        if (this.c.bj.getText().toString().length() <= 0) {
            Toast.makeText(this.c, "Please Enter CNIC.", 0).show();
            int i3 = a;
            int i4 = (i3 & 7) + (i3 | 7);
            b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = b;
        int i7 = (i6 ^ 113) + ((i6 & 113) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        if (this.c.bg.k().length() <= 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.c);
            int i9 = b;
            int i10 = (i9 & 49) + (i9 | 49);
            a = i10 % 128;
            int i11 = i10 % 2;
            builder.setTitle("Session Expire");
            builder.setMessage("Session Expire Please Login Again.!");
            builder.setCancelable(true);
            bnv bnvVar = new bnv();
            int i12 = a;
            int i13 = (i12 & 11) + (i12 | 11);
            b = i13 % 128;
            int i14 = i13 % 2;
            builder.setPositiveButton("Confirm", bnvVar);
            builder.create().show();
            int i15 = a;
            int i16 = (-2) - (((i15 & 70) + (i15 | 70)) ^ (-1));
            b = i16 % 128;
            if (i16 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i17 = a;
        int i18 = (i17 ^ 31) + ((i17 & 31) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        UpdateRosterActivity updateRosterActivity = this.c;
        String strP = updateRosterActivity.bg.p();
        int i20 = b;
        int i21 = (((i20 & (-92)) | ((~i20) & 91)) - (~(-(-((i20 & 91) << 1))))) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
        updateRosterActivity.bx = strP;
        UpdateRosterActivity updateRosterActivity2 = this.c;
        ProgressDialog progressDialog = updateRosterActivity2.bu;
        int i23 = a;
        int i24 = ((i23 ^ 25) | (i23 & 25)) << 1;
        int i25 = -((i23 & (-26)) | ((~i23) & 25));
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        b = i26 % 128;
        int i27 = i26 % 2;
        if (progressDialog != null) {
            int i28 = (i23 & 48) + (i23 | 48);
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            b = i29 % 128;
            int i30 = i29 % 2;
            if (progressDialog.isShowing()) {
                int i31 = a;
                int i32 = ((i31 | 33) << 1) - (i31 ^ 33);
                b = i32 % 128;
                int i33 = i32 % 2;
                this.c.bu.dismiss();
                int i34 = b;
                int i35 = ((i34 | 107) << 1) - (i34 ^ 107);
                a = i35 % 128;
                int i36 = i35 % 2;
            }
        } else {
            ProgressDialog progressDialog2 = new ProgressDialog(this.c);
            int i37 = a;
            int i38 = i37 & 67;
            int i39 = i38 + ((i37 ^ 67) | i38);
            b = i39 % 128;
            if (i39 % 2 != 0) {
                updateRosterActivity2.bu = progressDialog2;
                throw null;
            }
            updateRosterActivity2.bu = progressDialog2;
            int i40 = a;
            int i41 = i40 & 83;
            int i42 = ((i40 | 83) & (~i41)) + (i41 << 1);
            b = i42 % 128;
            int i43 = i42 % 2;
        }
        this.c.bu.setCancelable(false);
        int i44 = b;
        int i45 = ((i44 ^ 3) | (i44 & 3)) << 1;
        int i46 = -(((~i44) & 3) | (i44 & (-4)));
        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
        a = i47 % 128;
        if (i47 % 2 == 0) {
            this.c.bu.setMessage("Please Wait...");
            int i48 = 26 / 0;
        } else {
            this.c.bu.setMessage("Please Wait...");
        }
        int i49 = b;
        int i50 = ((i49 ^ 17) - (~((i49 & 17) << 1))) - 1;
        a = i50 % 128;
        if (i50 % 2 == 0) {
            this.c.bu.setProgressStyle(1);
        } else {
            this.c.bu.setProgressStyle(0);
        }
        int i51 = b;
        int i52 = i51 & 37;
        int i53 = ((((i51 ^ 37) | i52) << 1) - (~(-((i51 | 37) & (~i52))))) - 1;
        int i54 = i53 % 128;
        a = i54;
        boolean z = i53 % 2 == 0;
        int i55 = i54 + 87;
        b = i55 % 128;
        int i56 = i55 % 2;
        String str = BuildConfig.FLAVOR;
        for (CitizenData citizenData : this.c.bg.f()) {
            int i57 = b;
            int i58 = i57 & 93;
            int i59 = (((i57 | 93) & (~i58)) - (~(-(-(i58 << 1))))) - 1;
            a = i59 % 128;
            int i60 = i59 % 2;
            int i61 = b;
            int i62 = i61 & 91;
            int i63 = i62 + ((i61 ^ 91) | i62);
            a = i63 % 128;
            int i64 = i63 % 2;
            String str2 = citizenData.cnic;
            String str3 = this.c.bo;
            int i65 = a;
            int i66 = i65 & 63;
            int i67 = (i65 | 63) & (~i66);
            int i68 = -(-(i66 << 1));
            int i69 = (i67 & i68) + (i67 | i68);
            b = i69 % 128;
            if (i69 % 2 != 0) {
                str2.equals(str3);
                obj.hashCode();
                throw null;
            }
            if (str2.equals(str3)) {
                str = citizenData.data;
                int i70 = a;
                int i71 = (i70 & 27) + (i70 | 27);
                b = i71 % 128;
                int i72 = i71 % 2;
                z = true;
            }
        }
        if (!z) {
            UpdateRosterActivity updateRosterActivity3 = this.c;
            UpdateRosterActivity.v(updateRosterActivity3, updateRosterActivity3.bo);
            int i73 = b + 117;
            a = i73 % 128;
            int i74 = i73 % 2;
            return;
        }
        int i75 = b;
        int i76 = (i75 & (-100)) | ((~i75) & 99);
        int i77 = -(-((i75 & 99) << 1));
        int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
        a = i78 % 128;
        int i79 = i78 % 2;
        UpdateRosterActivity.u(this.c, str, false);
        int i80 = b;
        int i81 = ((i80 | 31) << 1) - (i80 ^ 31);
        a = i81 % 128;
        if (i81 % 2 == 0) {
            int i82 = 37 / 0;
        }
    }
}
