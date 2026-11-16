package ivas.gov.bisp.enumeration.fragments;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class FragmentPictures_ViewBinding implements Unbinder {
    private static int a = 1;
    private static int b;
    private FragmentPictures target;

    public FragmentPictures_ViewBinding(FragmentPictures fragmentPictures, View view) {
        this.target = fragmentPictures;
        fragmentPictures.imageButtonBeneficiary = (ImageView) u.b(u.c(view, R.id.imgbtn_beneficiary, "field 'imageButtonBeneficiary'"), R.id.imgbtn_beneficiary, "field 'imageButtonBeneficiary'", ImageView.class);
        fragmentPictures.imageButtonSelfie = (ImageView) u.b(u.c(view, R.id.imgbtn_selfie, "field 'imageButtonSelfie'"), R.id.imgbtn_selfie, "field 'imageButtonSelfie'", ImageView.class);
        fragmentPictures.linearLayoutThumb = (LinearLayout) u.b(u.c(view, R.id.ll_thumb, "field 'linearLayoutThumb'"), R.id.ll_thumb, "field 'linearLayoutThumb'", LinearLayout.class);
        fragmentPictures.buttonThumb = (Button) u.b(u.c(view, R.id.btn_take_pic_thumb, "field 'buttonThumb'"), R.id.btn_take_pic_thumb, "field 'buttonThumb'", Button.class);
        fragmentPictures.buttonSelfie = (Button) u.b(u.c(view, R.id.btn_take_pic_selfie, "field 'buttonSelfie'"), R.id.btn_take_pic_selfie, "field 'buttonSelfie'", Button.class);
        fragmentPictures.linearLayoutSelfie = (LinearLayout) u.b(u.c(view, R.id.ll_selfie, "field 'linearLayoutSelfie'"), R.id.ll_selfie, "field 'linearLayoutSelfie'", LinearLayout.class);
        fragmentPictures.editTextFormNo = (TextView) u.b(u.c(view, R.id.form_no, "field 'editTextFormNo'"), R.id.form_no, "field 'editTextFormNo'", TextView.class);
        fragmentPictures.editTextComments = (EditText) u.b(u.c(view, R.id.et_comments, "field 'editTextComments'"), R.id.et_comments, "field 'editTextComments'", EditText.class);
        fragmentPictures.btn_qr_code = (Button) u.b(u.c(view, R.id.btn_qr_code, "field 'btn_qr_code'"), R.id.btn_qr_code, "field 'btn_qr_code'", Button.class);
        fragmentPictures.btn_generate_code = (Button) u.b(u.c(view, R.id.btn_generate_code, "field 'btn_generate_code'"), R.id.btn_generate_code, "field 'btn_generate_code'", Button.class);
        fragmentPictures.editTextFormNoOld = (TextView) u.b(u.c(view, R.id.form_no_old, "field 'editTextFormNoOld'"), R.id.form_no_old, "field 'editTextFormNoOld'", TextView.class);
        fragmentPictures.editTextFormOldNoReenter = (TextView) u.b(u.c(view, R.id.form_no_renter_old, "field 'editTextFormOldNoReenter'"), R.id.form_no_renter_old, "field 'editTextFormOldNoReenter'", TextView.class);
        fragmentPictures.checkBoxOldRec = (CheckBox) u.b(u.c(view, R.id.cb_old_recipient, "field 'checkBoxOldRec'"), R.id.cb_old_recipient, "field 'checkBoxOldRec'", CheckBox.class);
        fragmentPictures.btn_old_qr_code = (Button) u.b(u.c(view, R.id.btn_qr_code_old, "field 'btn_old_qr_code'"), R.id.btn_qr_code_old, "field 'btn_old_qr_code'", Button.class);
        fragmentPictures.linearLayoutOld = (LinearLayout) u.b(u.c(view, R.id.ll_old_qr_code, "field 'linearLayoutOld'"), R.id.ll_old_qr_code, "field 'linearLayoutOld'", LinearLayout.class);
        fragmentPictures.checkBoxRecollection = (CheckBox) u.b(u.c(view, R.id.cb_recollection, "field 'checkBoxRecollection'"), R.id.cb_recollection, "field 'checkBoxRecollection'", CheckBox.class);
        fragmentPictures.checkBoxMultistory = (CheckBox) u.b(u.c(view, R.id.cb_is_multistory, "field 'checkBoxMultistory'"), R.id.cb_is_multistory, "field 'checkBoxMultistory'", CheckBox.class);
        fragmentPictures.textViewTitle = (TextView) u.b(u.c(view, R.id.tv_title, "field 'textViewTitle'"), R.id.tv_title, "field 'textViewTitle'", TextView.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        r2.btn_generate_code = null;
        r2.editTextFormNoOld = null;
        r3 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
    
        r2.btn_generate_code = null;
        r2.editTextFormNoOld = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009b, code lost:
    
        r2.editTextFormOldNoReenter = null;
        r2.checkBoxOldRec = null;
        r2.btn_old_qr_code = null;
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.b;
        r4 = r3 ^ 73;
        r3 = ((r3 & 73) | r4) << 1;
        r4 = -r4;
        r5 = (r3 ^ r4) + ((r3 & r4) << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b6, code lost:
    
        if ((r5 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        r2.linearLayoutOld = null;
        r2.checkBoxRecollection = null;
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.a + 51;
        ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c5, code lost:
    
        if ((r3 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c7, code lost:
    
        r2.checkBoxMultistory = null;
        r2.textViewTitle = null;
        r2 = ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.b;
        r3 = ((r2 & 103) - (~(-(-(r2 | 103))))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
    
        if ((r3 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00de, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00df, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e0, code lost:
    
        r2.checkBoxMultistory = null;
        r2.textViewTitle = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
    
        r2.linearLayoutOld = null;
        r2.checkBoxRecollection = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ec, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
    
        throw new java.lang.IllegalStateException("Bindings already cleared.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r3 = (r1 ^ 18) + ((r1 & 18) << 1);
        r1 = (r3 ^ (-1)) + (r3 << 1);
        ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.b = r1 % 128;
        r1 = r1 % 2;
        r1 = null;
        r7.target = null;
        r2.imageButtonBeneficiary = null;
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.b;
        r4 = ((r3 ^ 47) - (~((r3 & 47) << 1))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.a = r4 % 128;
        r4 = r4 % 2;
        r2.imageButtonSelfie = null;
        r2.linearLayoutThumb = null;
        r2.buttonThumb = null;
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.a;
        r4 = (r3 & 25) + (r3 | 25);
        ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.b = r4 % 128;
        r4 = r4 % 2;
        r2.buttonSelfie = null;
        r2.linearLayoutSelfie = null;
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.a;
        r4 = ((r3 | 103) << 1) - (r3 ^ 103);
        ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.b = r4 % 128;
        r4 = r4 % 2;
        r2.editTextFormNo = null;
        r2.editTextComments = null;
        r2.btn_qr_code = null;
        r3 = ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.a;
        r4 = ((((r3 ^ 31) | (r3 & 31)) << 1) - (~(-(((~r3) & 31) | (r3 & (-32)))))) - 1;
        ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008c, code lost:
    
        if ((r4 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void unbind() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.fragments.FragmentPictures_ViewBinding.unbind():void");
    }
}
