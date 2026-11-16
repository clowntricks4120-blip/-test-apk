package ivas.gov.bisp.enumeration;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import ivas.gov.bisp.enumeration.V.u;

/* JADX INFO: loaded from: classes.dex */
public class ProfileActivity_ViewBinding implements Unbinder {

    public class OooO00o extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ ProfileActivity c;

        public OooO00o(ProfileActivity_ViewBinding profileActivity_ViewBinding, ProfileActivity profileActivity) {
            this.c = profileActivity;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 43;
            int i4 = (((i2 & 43) | i3) << 1) - i3;
            b = i4 % 128;
            int i5 = i4 % 2;
            this.c.onImageClick(view);
            if (i5 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0O0 extends ivas.gov.bisp.enumeration.V.t {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ProfileActivity c;

        public OooO0O0(ProfileActivity_ViewBinding profileActivity_ViewBinding, ProfileActivity profileActivity) {
            this.c = profileActivity;
        }

        @Override // ivas.gov.bisp.enumeration.V.t
        public void doClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((((i2 ^ 101) | (i2 & 101)) << 1) - (~(-(((~i2) & 101) | (i2 & (-102)))))) - 1;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                this.c.onSaveClick(view);
                int i4 = 51 / 0;
            } else {
                this.c.onSaveClick(view);
            }
            int i5 = b;
            int i6 = i5 & 11;
            int i7 = i6 + ((i5 ^ 11) | i6);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
    }

    public ProfileActivity_ViewBinding(ProfileActivity profileActivity, View view) {
        profileActivity.et_name = (EditText) u.b(u.c(view, R.id.Edittext_name, "field 'et_name'"), R.id.Edittext_name, "field 'et_name'", EditText.class);
        profileActivity.et_cnic = (EditText) u.b(u.c(view, R.id.Edittext_cnic, "field 'et_cnic'"), R.id.Edittext_cnic, "field 'et_cnic'", EditText.class);
        profileActivity.et_contact = (EditText) u.b(u.c(view, R.id.Edittext_contact, "field 'et_contact'"), R.id.Edittext_contact, "field 'et_contact'", EditText.class);
        View viewC = u.c(view, R.id.imgbtn_surveyer, "field 'imageButtonSurveyor' and method 'onImageClick'");
        profileActivity.imageButtonSurveyor = (ImageView) u.b(viewC, R.id.imgbtn_surveyer, "field 'imageButtonSurveyor'", ImageView.class);
        viewC.setOnClickListener(new OooO00o(this, profileActivity));
        u.c(view, R.id.btn_save, "method 'onSaveClick'").setOnClickListener(new OooO0O0(this, profileActivity));
    }
}
