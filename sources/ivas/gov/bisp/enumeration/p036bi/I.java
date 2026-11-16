package ivas.gov.bisp.enumeration.p036bi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.SimConfirmationActivity;
import ivas.gov.bisp.enumeration.dialogs.DialogMapListing;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ I(Object obj, Object obj2, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 5;
        int i4 = i2 | 5;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        a = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = this.c;
        if (i7 == 0) {
            AlertDialog alertDialog = (AlertDialog) this.d;
            Object obj2 = this.e;
            int i8 = i2 + 63;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = SimConfirmationActivity.r;
                alertDialog.dismiss();
                obj.hashCode();
                throw null;
            }
            Runnable runnable = (Runnable) obj2;
            int i10 = SimConfirmationActivity.r;
            alertDialog.dismiss();
            int i11 = b;
            int i12 = ((i11 | 63) << 1) - ((i11 & (-64)) | ((~i11) & 63));
            a = i12 % 128;
            if (i12 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (runnable != null) {
                int i13 = (i11 | 115) << 1;
                int i14 = -(((~i11) & 115) | (i11 & (-116)));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                a = i15 % 128;
                int i16 = i15 % 2;
                runnable.run();
                int i17 = a + 115;
                b = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = b;
            int i20 = i19 & 77;
            int i21 = ((i19 | 77) & (~i20)) + (i20 << 1);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (i7 == 1) {
            DialogMapListing dialogMapListing = (DialogMapListing) this.d;
            DialogInterface dialogInterface = (DialogInterface) this.e;
            int i22 = i6 & 105;
            int i23 = i22 + ((i6 ^ 105) | i22);
            b = i23 % 128;
            int i24 = i23 % 2;
            dialogMapListing.d.onSubmit();
            dialogInterface.dismiss();
            int i25 = b;
            int i26 = (i25 & 65) + (i25 | 65);
            a = i26 % 128;
            int i27 = i26 % 2;
            return;
        }
        int i28 = i6 & 55;
        int i29 = (i6 ^ 55) | i28;
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        b = i30 % 128;
        int i31 = i30 % 2;
        int i32 = i6 & 91;
        int i33 = ((i6 | 91) & (~i32)) + (i32 << 1);
        b = i33 % 128;
        if (i33 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        EditText editText = (EditText) this.d;
        ImageView imageView = (ImageView) this.e;
        Pattern pattern = ChangePasswordActivity.r;
        if (!(!(editText.getTransformationMethod() instanceof PasswordTransformationMethod))) {
            int i34 = b + 109;
            a = i34 % 128;
            int i35 = i34 % 2;
            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            imageView.setImageResource(R.drawable.ic_eye_visible);
            int i36 = a;
            int i37 = i36 & 59;
            int i38 = ((((i36 ^ 59) | i37) << 1) - (~(-((i36 | 59) & (~i37))))) - 1;
            b = i38 % 128;
            if (i38 % 2 == 0) {
                int i39 = 4 / 3;
            }
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            imageView.setImageResource(R.drawable.ic_eye_hidden);
            int i40 = a;
            int i41 = i40 & 77;
            int i42 = -(-(i40 | 77));
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            b = i43 % 128;
            int i44 = i43 % 2;
        }
        if (editText.getText() != null) {
            int i45 = b;
            int i46 = i45 & 49;
            int i47 = (i45 | 49) & (~i46);
            int i48 = i46 << 1;
            int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
            a = i49 % 128;
            int i50 = i49 % 2;
            editText.setSelection(editText.getText().length());
            int i51 = b;
            int i52 = i51 ^ 13;
            int i53 = -(-((i51 & 13) << 1));
            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
            a = i54 % 128;
            if (i54 % 2 != 0) {
                int i55 = 3 / 4;
            }
        }
        int i56 = b;
        int i57 = i56 & 75;
        int i58 = ((i56 ^ 75) | i57) << 1;
        int i59 = -((i56 | 75) & (~i57));
        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
        a = i60 % 128;
        if (i60 % 2 != 0) {
            throw null;
        }
    }
}
