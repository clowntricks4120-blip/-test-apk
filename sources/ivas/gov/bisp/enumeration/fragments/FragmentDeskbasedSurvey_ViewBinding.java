package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentDeskbasedSurvey_ViewBinding implements Unbinder {
    private static int a = 0;
    private static int b = 1;
    private FragmentDeskbasedSurvey target;

    public FragmentDeskbasedSurvey_ViewBinding(FragmentDeskbasedSurvey fragmentDeskbasedSurvey, View view) {
        this.target = fragmentDeskbasedSurvey;
        fragmentDeskbasedSurvey.radioGroupDeskBased = (RadioGroup) u.b(u.c(view, R.id.rg_desk_based, "field 'radioGroupDeskBased'"), R.id.rg_desk_based, "field 'radioGroupDeskBased'", RadioGroup.class);
        fragmentDeskbasedSurvey.radioButtonDeskBasedYes = (RadioButton) u.b(u.c(view, R.id.rb_desk_based_yes, "field 'radioButtonDeskBasedYes'"), R.id.rb_desk_based_yes, "field 'radioButtonDeskBasedYes'", RadioButton.class);
        fragmentDeskbasedSurvey.radioButtonDeskBasedNo = (RadioButton) u.b(u.c(view, R.id.rb_desk_based_no, "field 'radioButtonDeskBasedNo'"), R.id.rb_desk_based_no, "field 'radioButtonDeskBasedNo'", RadioButton.class);
        fragmentDeskbasedSurvey.radioGroupReceipt = (RadioGroup) u.b(u.c(view, R.id.rg_receipt, "field 'radioGroupReceipt'"), R.id.rg_receipt, "field 'radioGroupReceipt'", RadioGroup.class);
        fragmentDeskbasedSurvey.radioButtonReceiptYes = (RadioButton) u.b(u.c(view, R.id.rb_receipt_yes, "field 'radioButtonReceiptYes'"), R.id.rb_receipt_yes, "field 'radioButtonReceiptYes'", RadioButton.class);
        fragmentDeskbasedSurvey.radioButtonReceiptNo = (RadioButton) u.b(u.c(view, R.id.rb_receipt_no, "field 'radioButtonReceiptNo'"), R.id.rb_receipt_no, "field 'radioButtonReceiptNo'", RadioButton.class);
        fragmentDeskbasedSurvey.linearLayoutLost = (LinearLayout) u.b(u.c(view, R.id.ll_lost_receipt, "field 'linearLayoutLost'"), R.id.ll_lost_receipt, "field 'linearLayoutLost'", LinearLayout.class);
        fragmentDeskbasedSurvey.linearLayoutQR = (LinearLayout) u.b(u.c(view, R.id.ll_qr_code, "field 'linearLayoutQR'"), R.id.ll_qr_code, "field 'linearLayoutQR'", LinearLayout.class);
        fragmentDeskbasedSurvey.editTextPreviousFormNo = (EditText) u.b(u.c(view, R.id.previous_form_no, "field 'editTextPreviousFormNo'"), R.id.previous_form_no, "field 'editTextPreviousFormNo'", EditText.class);
        fragmentDeskbasedSurvey.btn_qr_code = (Button) u.b(u.c(view, R.id.btn_qr_code, "field 'btn_qr_code'"), R.id.btn_qr_code, "field 'btn_qr_code'", Button.class);
    }

    public void unbind() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = (i2 ^ 23) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        FragmentDeskbasedSurvey fragmentDeskbasedSurvey = this.target;
        if (fragmentDeskbasedSurvey == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        int i7 = i2 ^ 49;
        int i8 = (i2 & 49) << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            this.target = null;
            fragmentDeskbasedSurvey.radioGroupDeskBased = null;
            fragmentDeskbasedSurvey.radioButtonDeskBasedYes = null;
            throw null;
        }
        this.target = null;
        fragmentDeskbasedSurvey.radioGroupDeskBased = null;
        fragmentDeskbasedSurvey.radioButtonDeskBasedYes = null;
        int i10 = a;
        int i11 = (i10 ^ 111) + ((i10 & 111) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        fragmentDeskbasedSurvey.radioButtonDeskBasedNo = null;
        fragmentDeskbasedSurvey.radioGroupReceipt = null;
        fragmentDeskbasedSurvey.radioButtonReceiptYes = null;
        int i13 = a;
        int i14 = i13 & 37;
        int i15 = -(-((i13 ^ 37) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            fragmentDeskbasedSurvey.radioButtonReceiptNo = null;
            fragmentDeskbasedSurvey.linearLayoutLost = null;
            fragmentDeskbasedSurvey.linearLayoutQR = null;
            int i17 = 73 / 0;
        } else {
            fragmentDeskbasedSurvey.radioButtonReceiptNo = null;
            fragmentDeskbasedSurvey.linearLayoutLost = null;
            fragmentDeskbasedSurvey.linearLayoutQR = null;
        }
        fragmentDeskbasedSurvey.editTextPreviousFormNo = null;
        fragmentDeskbasedSurvey.btn_qr_code = null;
        int i18 = b;
        int i19 = (i18 & 69) + (i18 | 69);
        a = i19 % 128;
        int i20 = i19 % 2;
    }
}
