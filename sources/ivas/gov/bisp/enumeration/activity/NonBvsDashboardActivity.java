package ivas.gov.bisp.enumeration.activity;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activitybase.BaseAuth;
import ivas.gov.bisp.enumeration.bK.an;
import ivas.gov.bisp.enumeration.p036bi.DialogInterfaceOnDismissListenerC0187p;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0191t;
import ivas.gov.bisp.enumeration.p043bp.T;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class NonBvsDashboardActivity extends BaseAuth {
    public static final /* synthetic */ int ac = 0;
    private static int p = 1;
    private static int q;
    public EditText ad;
    public EditText ae;
    public Button af;
    public Button ag;
    public LinearLayout ah;
    public String aj = BuildConfig.FLAVOR;
    public AlertDialog ai = null;

    public class OooO00o implements View.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            ArrayList<String> arrayList = new ArrayList<>();
            NonBvsDashboardActivity nonBvsDashboardActivity = NonBvsDashboardActivity.this;
            int i2 = NonBvsDashboardActivity.ac;
            int i3 = b;
            int i4 = ((i3 ^ 39) | (i3 & 39)) << 1;
            int i5 = -(((~i3) & 39) | (i3 & (-40)));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            nonBvsDashboardActivity.q("0", arrayList);
            if (i7 == 0) {
                int i8 = 10 / 0;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((i2 | 111) << 1) - (i2 ^ 111);
        int i4 = i3 % 128;
        p = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 111;
        int i7 = i6 + ((i4 ^ 111) | i6);
        q = i7 % 128;
        if (i7 % 2 == 0) {
            return R.layout.activity_non_bvs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class OooO0OO implements BaseAuth.OooOO0 {
        private static int a = 1;
        private static int b;

        public OooO0OO() {
        }

        @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth.OooOO0
        public void actionPerform() {
            NonBvsDashboardActivity nonBvsDashboardActivity;
            LinearLayout linearLayout;
            int i;
            int i2 = 2 % 2;
            int i3 = a + 27;
            b = i3 % 128;
            int i4 = i3 % 2;
            NonBvsDashboardActivity nonBvsDashboardActivity2 = NonBvsDashboardActivity.this;
            int i5 = NonBvsDashboardActivity.ac;
            nonBvsDashboardActivity2.x.dismiss();
            int i6 = b;
            int i7 = (((i6 & (-50)) | ((~i6) & 49)) - (~((i6 & 49) << 1))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                nonBvsDashboardActivity = NonBvsDashboardActivity.this;
                linearLayout = nonBvsDashboardActivity.ah;
                i = 103;
            } else {
                nonBvsDashboardActivity = NonBvsDashboardActivity.this;
                linearLayout = nonBvsDashboardActivity.ah;
                i = 8;
            }
            linearLayout.setVisibility(i);
            Button button = nonBvsDashboardActivity.af;
            int i8 = a;
            int i9 = i8 & 109;
            int i10 = -(-((i8 ^ 109) | i9));
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                button.setVisibility(1);
            } else {
                button.setVisibility(0);
            }
            nonBvsDashboardActivity.ad.setText(BuildConfig.FLAVOR);
            nonBvsDashboardActivity.ae.setText(BuildConfig.FLAVOR);
            nonBvsDashboardActivity.u("POS Agent Biometric Verified", "Fingerprint verified successfully. Proceed to payment.");
            int i12 = b;
            int i13 = (i12 & 31) + (i12 | 31);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void r() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (-2) - (((i2 & 112) + (i2 | 112)) ^ (-1));
        q = i3 % 128;
        int i4 = i3 % 2;
        if (this.P == null) {
            int i5 = p;
            int i6 = (i5 | 63) << 1;
            int i7 = -(i5 ^ 63);
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            q = i8 % 128;
            int i9 = i8 % 2;
            Toast.makeText(this, "Please Place Finger", 0).show();
            return;
        }
        this.O = BuildConfig.FLAVOR;
        an anVarC = an.c();
        Bitmap bitmap = this.P;
        int i10 = q;
        int i11 = i10 & 107;
        int i12 = (((i10 ^ 107) | i11) << 1) - ((i10 | 107) & (~i11));
        p = i12 % 128;
        int i13 = i12 % 2;
        this.O = Base64.encodeToString(anVarC.d(bitmap), 0);
        BaseAuth.OooOOO0 oooOOO0 = new BaseAuth.OooOOO0(this.T.z(), Boolean.FALSE, new OooO0OO());
        int i14 = q;
        int i15 = i14 & 33;
        int i16 = -(-((i14 ^ 33) | i15));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        p = i17 % 128;
        if (i17 % 2 == 0) {
            oooOOO0.execute(new Void[1]);
        } else {
            oooOOO0.execute(new Void[0]);
        }
        int i18 = q;
        int i19 = i18 ^ 1;
        int i20 = ((i18 & 1) | i19) << 1;
        int i21 = -i19;
        int i22 = (i20 & i21) + (i20 | i21);
        p = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 | 37) << 1) - (i2 ^ 37);
        q = i3 % 128;
        int i4 = i3 % 2;
        this.ad = (EditText) findViewById(R.id.et_cnic);
        View viewFindViewById = findViewById(R.id.btn_verify_pos_agent);
        int i5 = p + 91;
        q = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            this.ag = (Button) viewFindViewById;
            this.ah = (LinearLayout) findViewById(R.id.btn_verify_pos_agent_parent);
            obj.hashCode();
            throw null;
        }
        this.ag = (Button) viewFindViewById;
        this.ah = (LinearLayout) findViewById(R.id.btn_verify_pos_agent_parent);
        int i6 = p;
        int i7 = i6 & 121;
        int i8 = -(-((i6 ^ 121) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        q = i9 % 128;
        int i10 = i9 % 2;
        this.ae = (EditText) findViewById(R.id.et_doc_id);
        View viewFindViewById2 = findViewById(R.id.btn_verify_cnic);
        int i11 = p;
        int i12 = i11 & 43;
        int i13 = i12 + ((i11 ^ 43) | i12);
        q = i13 % 128;
        if (i13 % 2 != 0) {
            this.af = (Button) viewFindViewById2;
            throw null;
        }
        this.af = (Button) viewFindViewById2;
        this.af.setOnClickListener(new T(this, 2));
        this.ag.setOnClickListener(new OooO00o());
        EditText editText = this.ad;
        OooO0O0 oooO0O0 = new OooO0O0();
        int i14 = p + 65;
        q = i14 % 128;
        if (i14 % 2 != 0) {
            editText.addTextChangedListener(oooO0O0);
            int i15 = 8 / 0;
        } else {
            editText.addTextChangedListener(oooO0O0);
        }
        int i16 = p;
        int i17 = i16 & 45;
        int i18 = -(-(i16 | 45));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        q = i19 % 128;
        if (i19 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public class OooO0O0 implements TextWatcher {
        private static int a = 1;
        private static int b;

        public OooO0O0() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = i5 & 53;
            int i7 = (((i5 ^ 53) | i6) << 1) - ((i5 | 53) & (~i6));
            b = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (i5 | 7) << 1;
            int i7 = -(i5 ^ 7);
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:46:0x0141  */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strReplaceAll;
            int length;
            EditText editText;
            int length2;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 40) + (i2 | 40);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                strReplaceAll = editable.toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
                length = strReplaceAll.length();
                int i5 = 42 / 0;
            } else {
                strReplaceAll = editable.toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
                length = strReplaceAll.length();
            }
            if (length > 13) {
                int i6 = b + 69;
                a = i6 % 128;
                int i7 = i6 % 2;
                strReplaceAll = strReplaceAll.substring(0, 13);
                int i8 = b;
                int i9 = ((i8 | 11) << 1) - (i8 ^ 11);
                a = i9 % 128;
                int i10 = i9 % 2;
            }
            StringBuilder sb = new StringBuilder();
            String string = editable.toString();
            int i11 = a;
            int i12 = i11 & 87;
            int i13 = (i11 ^ 87) | i12;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            Object obj = null;
            if (i14 % 2 == 0 ? string.length() == 5 : string.length() == 5) {
                NonBvsDashboardActivity.this.aj = editable.toString();
                int i15 = b;
                int i16 = ((i15 ^ 117) | (i15 & 117)) << 1;
                int i17 = -(((~i15) & 117) | (i15 & (-118)));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
            } else if (editable.toString().length() != 13) {
                int i20 = a;
                int i21 = ((i20 ^ 20) + ((i20 & 20) << 1)) - 1;
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    NonBvsDashboardActivity.this.aj = BuildConfig.FLAVOR;
                    obj.hashCode();
                    throw null;
                }
                NonBvsDashboardActivity.this.aj = BuildConfig.FLAVOR;
            } else {
                NonBvsDashboardActivity.this.aj = editable.toString();
                int i110 = b;
                int i111 = ((i110 ^ 117) | (i110 & 117)) << 1;
                int i112 = -(((~i110) & 117) | (i110 & (-118)));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                a = i113 % 128;
                int i114 = i113 % 2;
            }
            if (NonBvsDashboardActivity.this.aj.length() != 5) {
                int i22 = b;
                int i23 = i22 & 45;
                int i24 = -(-((i22 ^ 45) | i23));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                a = i25 % 128;
                if (i25 % 2 != 0 ? NonBvsDashboardActivity.this.aj.length() != 13 : NonBvsDashboardActivity.this.aj.length() != 104) {
                    int i26 = 0;
                    while (i26 < strReplaceAll.length()) {
                        int i27 = a;
                        int i28 = i27 & 27;
                        int i29 = (i28 - (~(-(-((i27 ^ 27) | i28))))) - 1;
                        b = i29 % 128;
                        if (i29 % 2 != 0) {
                            sb.append(strReplaceAll.charAt(i26));
                            throw null;
                        }
                        sb.append(strReplaceAll.charAt(i26));
                        if (i26 != 4) {
                            int i30 = b;
                            int i31 = (i30 & 95) + (i30 | 95);
                            a = i31 % 128;
                            if (i31 % 2 == 0) {
                                if (i26 == 31) {
                                    sb.append("-");
                                    int i32 = b;
                                    int i33 = i32 & 71;
                                    int i34 = ((i32 ^ 71) | i33) << 1;
                                    int i35 = -((i32 | 71) & (~i33));
                                    int i36 = (i34 & i35) + (i35 | i34);
                                    a = i36 % 128;
                                    int i37 = i36 % 2;
                                }
                            } else if (i26 == 11) {
                                sb.append("-");
                                int i38 = b;
                                int i39 = i38 & 71;
                                int i310 = ((i38 ^ 71) | i39) << 1;
                                int i311 = -((i38 | 71) & (~i39));
                                int i312 = (i310 & i311) + (i311 | i310);
                                a = i312 % 128;
                                int i313 = i312 % 2;
                            }
                        } else {
                            sb.append("-");
                            int i314 = b;
                            int i315 = i314 & 71;
                            int i316 = ((i314 ^ 71) | i315) << 1;
                            int i317 = -((i314 | 71) & (~i315));
                            int i318 = (i316 & i317) + (i317 | i316);
                            a = i318 % 128;
                            int i319 = i318 % 2;
                        }
                        int i40 = (-2) - ((((i26 | (-23)) << 1) - (i26 ^ (-23))) ^ (-1));
                        i26 = ((i40 ^ 26) + ((i40 & 26) << 1)) - 1;
                        int i41 = a;
                        int i42 = (((i41 & (-126)) | ((~i41) & 125)) - (~(-(-((i41 & 125) << 1))))) - 1;
                        b = i42 % 128;
                        int i43 = i42 % 2;
                    }
                    NonBvsDashboardActivity.this.ad.removeTextChangedListener(this);
                    EditText editText2 = NonBvsDashboardActivity.this.ad;
                    int i44 = b;
                    int i45 = (-2) - (((i44 ^ 66) + ((i44 & 66) << 1)) ^ (-1));
                    a = i45 % 128;
                    if (i45 % 2 == 0) {
                        editText2.setText(sb);
                        editText = NonBvsDashboardActivity.this.ad;
                        length2 = sb.length();
                        int i46 = 92 / 0;
                    } else {
                        editText2.setText(sb);
                        editText = NonBvsDashboardActivity.this.ad;
                        length2 = sb.length();
                    }
                    editText.setSelection(length2);
                    NonBvsDashboardActivity.this.ad.addTextChangedListener(this);
                    int i47 = b;
                    int i48 = i47 & 29;
                    int i49 = (i47 | 29) & (~i48);
                    int i50 = i48 << 1;
                    int i51 = (i49 & i50) + (i49 | i50);
                    a = i51 % 128;
                    int i52 = i51 % 2;
                }
            }
            int i53 = (-2) - ((a + 70) ^ (-1));
            b = i53 % 128;
            int i54 = i53 % 2;
        }
    }

    public final void u(String str, String str2) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (((i2 ^ 49) | (i2 & 49)) << 1) - (((~i2) & 49) | (i2 & (-50)));
        int i4 = i3 % 128;
        q = i4;
        int i5 = i3 % 2;
        AlertDialog alertDialog = this.ai;
        Object obj = null;
        if (alertDialog != null) {
            int i6 = i4 & 111;
            int i7 = (i4 ^ 111) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            p = i8 % 128;
            if (i8 % 2 == 0) {
                alertDialog.isShowing();
                obj.hashCode();
                throw null;
            }
            if (alertDialog.isShowing()) {
                int i9 = p;
                int i10 = (i9 & 29) + (i9 | 29);
                q = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        int i11 = q;
        int i12 = i11 & 7;
        int i13 = (((i11 | 7) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
        p = i13 % 128;
        int i14 = i13 % 2;
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.custom_dialog_new, viewGroup, false);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        int i15 = q;
        int i16 = i15 ^ 71;
        int i17 = ((i15 & 71) | i16) << 1;
        int i18 = -i16;
        int i19 = (i17 & i18) + (i17 | i18);
        p = i19 % 128;
        int i20 = i19 % 2;
        this.ai = alertDialogCreate;
        alertDialogCreate.setCancelable(false);
        this.ai.setCanceledOnTouchOutside(false);
        this.ai.setOnDismissListener(new DialogInterfaceOnDismissListenerC0187p(this, 1));
        this.ai.show();
        int i21 = p;
        int i22 = i21 & 95;
        int i23 = -(-(i21 | 95));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        q = i24 % 128;
        if (i24 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        int i25 = q + 85;
        p = i25 % 128;
        int i26 = i25 % 2;
        ((TextView) viewInflate.findViewById(R.id.btn_no)).setVisibility(8);
        textView3.setText("OK");
        textView3.setOnClickListener(new ViewOnClickListenerC0191t(this, 1));
        int i27 = q;
        int i28 = (i27 & (-58)) | ((~i27) & 57);
        int i29 = -(-((i27 & 57) << 1));
        int i30 = (i28 & i29) + (i29 | i28);
        p = i30 % 128;
        int i31 = i30 % 2;
    }
}
