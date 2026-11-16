package ivas.gov.bisp.enumeration.activity;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ivas.gov.bisp.enumeration.I.i;
import ivas.gov.bisp.enumeration.OooO0Oo.OooO;
import ivas.gov.bisp.enumeration.activity.BikeRegistryActivity;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.DialogInterfaceOnDismissListenerC0187p;
import ivas.gov.bisp.enumeration.p036bi.P;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0191t;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0192u;
import ivas.gov.bisp.enumeration.p038bk.aZ;
import ivas.gov.bisp.enumeration.p038bk.ba;
import ivas.gov.bisp.enumeration.p038bk.bo;
import ivas.gov.bisp.enumeration.p043bp.C0203e;
import ivas.gov.bisp.enumeration.p043bp.h;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class BikeRegistryActivity extends AppCompatActivity {
    private static int p = 0;
    private static int q = 1;
    public static final /* synthetic */ int r = 0;
    public LinearLayout A;
    public FloatingActionButton B;
    public RadioButton C;
    public RecyclerView D;
    public RadioButton E;
    public ImageView G;
    public Spinner J;
    public LinearLayout K;
    public LinearLayout L;
    public Bitmap N;
    public Button O;
    public SessionManager Q;
    public ProgressBar R;
    public EditText u;
    public RadioGroup v;
    public EditText w;
    public EditText x;
    public Button y;
    public Button z;
    public String t = "HBL";
    public String s = "1234567890";
    public List<aZ> F = new ArrayList();
    public String I = BuildConfig.FLAVOR;
    public String M = BuildConfig.FLAVOR;
    public OooO<Intent> P = h(new i(), new C0203e(this, 5));
    public List<bo> H = new ArrayList();
    public AlertDialog S = null;

    public class OooO00o implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;
        public boolean c = true;

        public OooO00o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 51;
            int i4 = (i2 ^ 51) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = (-2) - ((b + 126) ^ (-1));
            int i4 = i3 % 128;
            a = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.c) {
                this.c = false;
                int i5 = i4 + 71;
                b = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            BikeRegistryActivity.this.x.setText(BuildConfig.FLAVOR);
            BikeRegistryActivity bikeRegistryActivity = BikeRegistryActivity.this;
            int i7 = a;
            int i8 = (i7 ^ 99) + ((i7 & 99) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                bikeRegistryActivity.x.setError("Please enter account number for selected bank");
            } else {
                bikeRegistryActivity.x.setError("Please enter account number for selected bank");
                throw null;
            }
        }
    }

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            BikeRegistryActivity bikeRegistryActivity = BikeRegistryActivity.this;
            w wVar = new w(bikeRegistryActivity, bikeRegistryActivity.Q);
            int i3 = b;
            int i4 = (i3 & 47) + (i3 | 47);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                wVar.execute(new Void[1]);
            } else {
                wVar.execute(new Void[0]);
            }
            dialogInterface.cancel();
        }
    }

    public final void r(String str, Runnable runnable) {
        int i = 2 % 2;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        int i2 = q;
        int i3 = i2 ^ 57;
        int i4 = ((i2 & 57) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        p = i6 % 128;
        int i7 = 0;
        View viewInflate = i6 % 2 != 0 ? LayoutInflater.from(this).inflate(ivas.gov.bisp.enumeration.R.layout.custom_dialog_bike, viewGroup, false) : LayoutInflater.from(this).inflate(ivas.gov.bisp.enumeration.R.layout.custom_dialog_bike, viewGroup, false);
        builder.setView(viewInflate);
        int i8 = q;
        int i9 = (i8 & 111) + (i8 | 111);
        p = i9 % 128;
        AlertDialog alertDialogCreate = i9 % 2 != 0 ? builder.create() : builder.create();
        alertDialogCreate.setCancelable(false);
        alertDialogCreate.show();
        View viewFindViewById = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tv_heading);
        int i10 = p;
        int i11 = (i10 & (-30)) | ((~i10) & 29);
        int i12 = -(-((i10 & 29) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        q = i13 % 128;
        int i14 = i13 % 2;
        TextView textView = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tv_message);
        View viewFindViewById2 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btn_ok);
        int i15 = q;
        int i16 = i15 & 85;
        int i17 = (i15 ^ 85) | i16;
        int i18 = (i16 & i17) + (i17 | i16);
        p = i18 % 128;
        int i19 = i18 % 2;
        TextView textView2 = (TextView) viewFindViewById2;
        TextView textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btn_no);
        ((TextView) viewFindViewById).setText("Confirm Submission");
        int i20 = p;
        int i21 = ((i20 | 119) << 1) - (i20 ^ 119);
        q = i21 % 128;
        int i22 = i21 % 2;
        textView.setText(str);
        textView3.setVisibility(0);
        textView2.setText("YES");
        textView3.setText("NO");
        textView2.setOnClickListener(new ViewOnClickListenerC0192u(alertDialogCreate, runnable, i7));
        ViewOnClickListenerC0191t viewOnClickListenerC0191t = new ViewOnClickListenerC0191t(alertDialogCreate, i7);
        int i23 = p + 123;
        q = i23 % 128;
        int i24 = i23 % 2;
        textView3.setOnClickListener(viewOnClickListenerC0191t);
        int i25 = p;
        int i26 = i25 & 35;
        int i27 = (i26 - (~(-(-((i25 ^ 35) | i26))))) - 1;
        q = i27 % 128;
        if (i27 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void o(BikeRegistryActivity bikeRegistryActivity, String str, String str2) {
        TextView textView;
        int i = 2 % 2;
        int i2 = p + 15;
        q = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AlertDialog alertDialog = bikeRegistryActivity.S;
            obj.hashCode();
            throw null;
        }
        AlertDialog alertDialog2 = bikeRegistryActivity.S;
        int i3 = 1;
        if (alertDialog2 == null || !alertDialog2.isShowing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(bikeRegistryActivity);
            ViewGroup viewGroup = (ViewGroup) bikeRegistryActivity.findViewById(R.id.content);
            int i4 = p;
            int i5 = i4 ^ 89;
            int i6 = (i4 & 89) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            q = i7 % 128;
            View viewInflate = i7 % 2 == 0 ? LayoutInflater.from(bikeRegistryActivity).inflate(ivas.gov.bisp.enumeration.R.layout.custom_dialog_new, viewGroup, false) : LayoutInflater.from(bikeRegistryActivity).inflate(ivas.gov.bisp.enumeration.R.layout.custom_dialog_new, viewGroup, false);
            builder.setView(viewInflate);
            AlertDialog alertDialogCreate = builder.create();
            int i8 = p;
            int i9 = (i8 | 39) << 1;
            int i10 = -(i8 ^ 39);
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            q = i11 % 128;
            int i12 = i11 % 2;
            bikeRegistryActivity.S = alertDialogCreate;
            alertDialogCreate.setCancelable(false);
            bikeRegistryActivity.S.setCanceledOnTouchOutside(false);
            bikeRegistryActivity.S.setOnDismissListener(new DialogInterfaceOnDismissListenerC0187p(bikeRegistryActivity, 0));
            bikeRegistryActivity.S.show();
            int i13 = q + 97;
            p = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            TextView textView2 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tv_heading);
            TextView textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tv_message);
            int i14 = p;
            int i15 = i14 & 73;
            int i16 = ((i14 ^ 73) | i15) << 1;
            int i17 = -((i14 | 73) & (~i15));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            q = i18 % 128;
            if (i18 % 2 == 0) {
                textView2.setText(str);
                textView3.setText(str2);
                textView = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btn_ok);
                int i19 = 54 / 0;
            } else {
                textView2.setText(str);
                textView3.setText(str2);
                textView = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btn_ok);
            }
            ((TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btn_no)).setVisibility(8);
            textView.setText("OK");
            textView.setOnClickListener(new P(bikeRegistryActivity, i3));
            int i20 = p;
            int i21 = i20 & 83;
            int i22 = (i20 ^ 83) | i21;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            q = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = p;
        int i26 = (i25 ^ 42) + ((i25 & 42) << 1);
        int i27 = (i26 ^ (-1)) + (i26 << 1);
        q = i27 % 128;
        int i28 = i27 % 2;
    }

    public final String p() {
        int size;
        int i;
        int i2 = 2 % 2;
        int i3 = q;
        int i4 = (i3 & 7) + (i3 | 7);
        p = i4 % 128;
        int i5 = i4 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("CNIC: ");
        String string = this.M;
        int i6 = p;
        int i7 = i6 & 79;
        int i8 = i7 + ((i6 ^ 79) | i7);
        q = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            string.replaceAll("\\D", BuildConfig.FLAVOR).length();
            throw null;
        }
        String strReplaceAll = string.replaceAll("\\D", BuildConfig.FLAVOR);
        if (strReplaceAll.length() == 13) {
            StringBuilder sb = new StringBuilder();
            String strSubstring = strReplaceAll.substring(0, 5);
            int i9 = q;
            int i10 = i9 & 41;
            int i11 = -(-((i9 ^ 41) | i10));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            p = i12 % 128;
            if (i12 % 2 != 0) {
                sb.append(strSubstring);
                sb.append("-");
                i = 4;
            } else {
                sb.append(strSubstring);
                sb.append("-");
                i = 5;
            }
            int i13 = p;
            int i14 = (i13 ^ 99) + ((i13 & 99) << 1);
            q = i14 % 128;
            if (i14 % 2 == 0) {
                sb.append(strReplaceAll.substring(i, 118));
                sb.append("-");
            } else {
                sb.append(strReplaceAll.substring(i, 12));
                sb.append("-");
            }
            sb.append(strReplaceAll.substring(12));
            string = sb.toString();
            int i15 = p;
            int i16 = i15 & 63;
            int i17 = (i16 - (~((i15 ^ 63) | i16))) - 1;
            q = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i15 ^ 25;
            int i20 = -(-((i15 & 25) << 1));
            int i21 = (i19 & i20) + (i20 | i19);
            q = i21 % 128;
            int i22 = i21 % 2;
        }
        sbW.append(string);
        sbW.append("\n\n");
        int i23 = p;
        int i24 = (i23 & 79) + (i23 | 79);
        q = i24 % 128;
        int i25 = i24 % 2;
        int size2 = this.F.size();
        int iMin = i25 == 0 ? Math.min(size2, 5) : Math.min(size2, 2);
        int i26 = p;
        int i27 = ((i26 & (-22)) | ((~i26) & 21)) + ((i26 & 21) << 1);
        q = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 85 / 0;
        }
        int i29 = 0;
        while (i29 < iMin) {
            int i30 = q;
            int i31 = ((i30 ^ 75) | (i30 & 75)) << 1;
            int i32 = -(((~i30) & 75) | (i30 & (-76)));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            p = i33 % 128;
            if (i33 % 2 != 0) {
                this.F.get(i29);
                obj.hashCode();
                throw null;
            }
            aZ aZVar = this.F.get(i29);
            sbW.append("Bike ");
            int i34 = ((i29 ^ 16) | (i29 & 16)) << 1;
            int i35 = -(((~i29) & 16) | (i29 & (-17)));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            i29 = (-2) - (((i36 & (-14)) + (i36 | (-14))) ^ (-1));
            sbW.append(i29);
            int i37 = q + 3;
            p = i37 % 128;
            if (i37 % 2 != 0) {
                sbW.append("\n");
                sbW.append("────────────\n");
                throw null;
            }
            sbW.append("\n");
            sbW.append("────────────\n");
            sbW.append("Owner   : ");
            String str = aZVar.e;
            int i38 = p;
            int i39 = i38 & 105;
            int i40 = -(-((i38 ^ 105) | i39));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            q = i41 % 128;
            if (i41 % 2 == 0) {
                sbW.append(str);
                sbW.append("\n");
                throw null;
            }
            sbW.append(str);
            sbW.append("\n");
            sbW.append("Number  : ");
            String upperCase = aZVar.a.toUpperCase();
            int i42 = q + 97;
            p = i42 % 128;
            if (i42 % 2 != 0) {
                sbW.append(upperCase);
                sbW.append("\n");
                int i43 = 83 / 0;
            } else {
                sbW.append(upperCase);
                sbW.append("\n");
            }
            int i44 = q;
            int i45 = ((i44 ^ 115) | (i44 & 115)) << 1;
            int i46 = -(((~i44) & 115) | (i44 & (-116)));
            int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
            p = i47 % 128;
            int i48 = i47 % 2;
            sbW.append("\n");
            int i49 = p;
            int i50 = ((i49 ^ 19) | (i49 & 19)) << 1;
            int i51 = -(((~i49) & 19) | (i49 & (-20)));
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            q = i52 % 128;
            int i53 = i52 % 2;
        }
        if (this.F.size() > 2) {
            int i54 = q;
            int i55 = (i54 & 21) + (i54 | 21);
            p = i55 % 128;
            if (i55 % 2 != 0) {
                sbW.append("...and ");
                size = this.F.size();
                int i56 = 39 / 0;
            } else {
                sbW.append("...and ");
                size = this.F.size();
            }
            sbW.append(size - 2);
            sbW.append(" more bike(s)\n\n");
            int i57 = p + 47;
            q = i57 % 128;
            int i58 = i57 % 2;
        }
        sbW.append("Do you want to submit?");
        int i59 = q;
        int i60 = (i59 | 13) << 1;
        int i61 = -(((~i59) & 13) | (i59 & (-14)));
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        p = i62 % 128;
        if (i62 % 2 != 0) {
            sbW.toString();
            obj.hashCode();
            throw null;
        }
        String string2 = sbW.toString();
        int i63 = q + 69;
        p = i63 % 128;
        if (i63 % 2 == 0) {
            return string2;
        }
        throw null;
    }

    public void q() {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        int i2 = p;
        int i3 = i2 ^ 113;
        int i4 = (i2 & 113) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        q = i5 % 128;
        int i6 = i5 % 2;
        oooO0O0.e = "Session Expire";
        oooO0O0.f = "Session Expire Please Login Again.!";
        oooO0O0.k = false;
        OooO0OO oooO0OO = new OooO0OO();
        int i7 = p + 21;
        q = i7 % 128;
        if (i7 % 2 == 0) {
            oooO0O0.h = "Confirm";
            oooO0O0.i = oooO0OO;
            throw null;
        }
        oooO0O0.h = "Confirm";
        oooO0O0.i = oooO0OO;
        aiz.b().show();
        int i8 = p + 59;
        q = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = q + 125;
        p = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            setContentView(ivas.gov.bisp.enumeration.R.layout.activity_bike_registry);
            this.R = (ProgressBar) findViewById(ivas.gov.bisp.enumeration.R.id.progress_loading);
            this.u = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etCnic);
            obj.hashCode();
            throw null;
        }
        super.onCreate(bundle);
        setContentView(ivas.gov.bisp.enumeration.R.layout.activity_bike_registry);
        this.R = (ProgressBar) findViewById(ivas.gov.bisp.enumeration.R.id.progress_loading);
        this.u = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etCnic);
        int i3 = q;
        final int i4 = 1;
        int i5 = (((i3 ^ 47) | (i3 & 47)) << 1) - (((~i3) & 47) | (i3 & (-48)));
        p = i5 % 128;
        int i6 = i5 % 2;
        this.z = (Button) findViewById(ivas.gov.bisp.enumeration.R.id.btnSubmit);
        this.w = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etPhone);
        this.y = (Button) findViewById(ivas.gov.bisp.enumeration.R.id.btnVerify);
        View viewFindViewById = findViewById(ivas.gov.bisp.enumeration.R.id.rgBikeAvailable);
        int i7 = p;
        int i8 = i7 | 99;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 99)) & i8);
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        q = i11 % 128;
        if (i11 % 2 == 0) {
            this.v = (RadioGroup) viewFindViewById;
            this.B = (FloatingActionButton) findViewById(ivas.gov.bisp.enumeration.R.id.fabAddBike);
            this.A = (LinearLayout) findViewById(ivas.gov.bisp.enumeration.R.id.fabAddBikeParent);
            obj.hashCode();
            throw null;
        }
        this.v = (RadioGroup) viewFindViewById;
        this.B = (FloatingActionButton) findViewById(ivas.gov.bisp.enumeration.R.id.fabAddBike);
        this.A = (LinearLayout) findViewById(ivas.gov.bisp.enumeration.R.id.fabAddBikeParent);
        LinearLayout linearLayout = (LinearLayout) findViewById(ivas.gov.bisp.enumeration.R.id.phoneParent);
        int i12 = p;
        int i13 = (i12 & 61) + (i12 | 61);
        q = i13 % 128;
        int i14 = i13 % 2;
        this.L = linearLayout;
        this.D = (RecyclerView) findViewById(ivas.gov.bisp.enumeration.R.id.recyclerBikes);
        this.K = (LinearLayout) findViewById(ivas.gov.bisp.enumeration.R.id.layoutAddBike);
        this.J = (Spinner) findViewById(ivas.gov.bisp.enumeration.R.id.spBank);
        this.x = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etAcc);
        this.J.setOnItemSelectedListener(new OooO00o());
        this.C = (RadioButton) findViewById(ivas.gov.bisp.enumeration.R.id.rbYes);
        this.E = (RadioButton) findViewById(ivas.gov.bisp.enumeration.R.id.rbNo);
        final int i15 = 0;
        this.D.setLayoutManager(new LinearLayoutManager(1, false));
        this.D.setAdapter(new ba(this, this.F));
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bi.z
            private static int a = 1;
            private static int b;
            public final /* synthetic */ BikeRegistryActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = 2 % 2;
                int i17 = b;
                int i18 = ((i17 ^ 116) + ((i17 & 116) << 1)) - 1;
                int i19 = i18 % 128;
                a = i19;
                int i20 = i18 % 2;
                if (i15 == 0) {
                    BikeRegistryActivity bikeRegistryActivity = this.d;
                    String strReplaceAll = bikeRegistryActivity.u.getText().toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
                    bikeRegistryActivity.M = strReplaceAll;
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("cnic", Long.parseLong(strReplaceAll));
                        bikeRegistryActivity.Q = new SessionManager(bikeRegistryActivity);
                        String string = jSONObject.toString();
                        SessionManager sessionManager = bikeRegistryActivity.Q;
                        int i21 = a;
                        int i22 = ((i21 | 67) << 1) - (i21 ^ 67);
                        b = i22 % 128;
                        if (i22 % 2 != 0) {
                            ivas.gov.bisp.enumeration.bK.b.b(sessionManager.k());
                            ivas.gov.bisp.enumeration.bK.b.b(bikeRegistryActivity.Q.m());
                            Object obj2 = null;
                            try {
                                obj2.hashCode();
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(string, ivas.gov.bisp.enumeration.bK.b.b(sessionManager.k()), ivas.gov.bisp.enumeration.bK.b.b(bikeRegistryActivity.Q.m())));
                        SessionManager sessionManager2 = bikeRegistryActivity.Q;
                        int i23 = b;
                        int i24 = i23 & 71;
                        int i25 = (((i23 | 71) & (~i24)) - (~(i24 << 1))) - 1;
                        a = i25 % 128;
                        int i26 = i25 % 2;
                        byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(sessionManager2.k());
                        byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(bikeRegistryActivity.Q.m());
                        int i27 = a;
                        int i28 = i27 & 29;
                        int i29 = -(-((i27 ^ 29) | i28));
                        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d("VerifyCNIC", bArrB, bArrB2));
                        bikeRegistryActivity.z.setEnabled(false);
                        bikeRegistryActivity.R.setVisibility(0);
                        ax.e(jSONObject2, bikeRegistryActivity, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new C0195x(bikeRegistryActivity));
                        int i32 = b;
                        int i33 = i32 & 41;
                        int i34 = (i32 ^ 41) | i33;
                        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                        a = i35 % 128;
                        if (i35 % 2 == 0) {
                            int i36 = 91 / 0;
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                int i37 = (i19 ^ 55) + ((i19 & 55) << 1);
                int i38 = i37 % 128;
                b = i38;
                int i39 = i37 % 2;
                int i40 = i38 & 37;
                int i41 = i38 | 37;
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                a = i42 % 128;
                int i43 = i42 % 2;
                final BikeRegistryActivity bikeRegistryActivity2 = this.d;
                int i44 = BikeRegistryActivity.r;
                Objects.requireNonNull(bikeRegistryActivity2);
                final Dialog dialog = new Dialog(bikeRegistryActivity2);
                int i45 = a;
                int i46 = ((i45 & 122) + (i45 | 122)) - 1;
                b = i46 % 128;
                int i47 = i46 % 2;
                dialog.setContentView(ivas.gov.bisp.enumeration.R.layout.dialog_add_bike);
                final EditText editText = (EditText) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.etBikeNumber);
                int i48 = b;
                int i49 = i48 & 23;
                int i50 = (i49 - (~((i48 ^ 23) | i49))) - 1;
                a = i50 % 128;
                if (i50 % 2 == 0) {
                    throw null;
                }
                final Spinner spinner = (Spinner) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.spBikeType);
                int i51 = (-2) - ((b + 68) ^ (-1));
                a = i51 % 128;
                int i52 = i51 % 2;
                final Spinner spinner2 = (Spinner) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.spProvince);
                final Spinner spinner3 = (Spinner) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.spRegistrationYear);
                ArrayList arrayList = new ArrayList();
                int i53 = a;
                int i54 = i53 & 59;
                int i55 = (i53 ^ 59) | i54;
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                b = i56 % 128;
                int i57 = i56 % 2;
                int i58 = Calendar.getInstance().get(1);
                int i59 = b;
                int i60 = ((i59 | 99) << 1) - (i59 ^ 99);
                a = i60 % 128;
                int i61 = i60 % 2;
                while (i58 >= 1947) {
                    int i62 = a;
                    int i63 = i62 & 39;
                    int i64 = -(-((i62 ^ 39) | i63));
                    int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                    b = i65 % 128;
                    if (i65 % 2 != 0) {
                        arrayList.add(String.valueOf(i58));
                        i58 += 72;
                    } else {
                        arrayList.add(String.valueOf(i58));
                        i58 = (-2) - (i58 ^ (-1));
                    }
                }
                final ArrayAdapter arrayAdapter = new ArrayAdapter(bikeRegistryActivity2, R.layout.simple_spinner_item, arrayList);
                arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                int i66 = a;
                int i67 = i66 & 3;
                int i68 = (i67 - (~((i66 ^ 3) | i67))) - 1;
                b = i68 % 128;
                int i69 = i68 % 2;
                spinner3.setAdapter((SpinnerAdapter) arrayAdapter);
                bikeRegistryActivity2.O = (Button) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.btnCamera);
                bikeRegistryActivity2.G = (ImageView) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.imgCamera);
                bikeRegistryActivity2.O.setOnClickListener(new ViewOnClickListenerC0186o(bikeRegistryActivity2));
                View viewFindViewById2 = dialog.findViewById(ivas.gov.bisp.enumeration.R.id.spOwner);
                int i70 = a;
                int i71 = i70 & 115;
                int i72 = -(-((i70 ^ 115) | i71));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                b = i73 % 128;
                int i74 = i73 % 2;
                final Spinner spinner4 = (Spinner) viewFindViewById2;
                LinearLayout linearLayout2 = (LinearLayout) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.layoutOtherOwner);
                final EditText editText2 = (EditText) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.etOwnerName);
                final EditText editText3 = (EditText) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.etOwnerCnic);
                spinner4.setAdapter((SpinnerAdapter) new ArrayAdapter(bikeRegistryActivity2, R.layout.simple_spinner_dropdown_item, bikeRegistryActivity2.H));
                spinner4.setOnItemSelectedListener(new J(bikeRegistryActivity2, linearLayout2));
                Button button = (Button) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.btnSave);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.bi.l
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String string2;
                        String str;
                        int i75 = 2 % 2;
                        int i76 = b;
                        int i77 = (-2) - ((i76 + 38) ^ (-1));
                        a = i77 % 128;
                        int i78 = i77 % 2;
                        BikeRegistryActivity bikeRegistryActivity3 = bikeRegistryActivity2;
                        Spinner spinner5 = spinner4;
                        EditText editText4 = editText2;
                        int i79 = i76 & 63;
                        int i80 = ((((i76 ^ 63) | i79) << 1) - (~(-((~i79) & (i76 | 63))))) - 1;
                        a = i80 % 128;
                        int i81 = i80 % 2;
                        EditText editText5 = editText3;
                        Spinner spinner6 = spinner3;
                        EditText editText6 = editText;
                        int i82 = i76 + 115;
                        a = i82 % 128;
                        if (i82 % 2 != 0) {
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Spinner spinner7 = spinner;
                        Spinner spinner8 = spinner2;
                        int i83 = (i76 & 44) + (i76 | 44);
                        int i84 = (i83 ^ (-1)) + (i83 << 1);
                        a = i84 % 128;
                        int i85 = i84 % 2;
                        ArrayAdapter arrayAdapter2 = arrayAdapter;
                        Dialog dialog2 = dialog;
                        int i86 = BikeRegistryActivity.r;
                        int i87 = b + 43;
                        a = i87 % 128;
                        if (i87 % 2 != 0) {
                            Objects.requireNonNull(bikeRegistryActivity3);
                            String str2 = ((bo) spinner5.getSelectedItem()).c;
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        Objects.requireNonNull(bikeRegistryActivity3);
                        bo boVar = (bo) spinner5.getSelectedItem();
                        if (boVar.c.equals("Other")) {
                            int i88 = a;
                            int i89 = i88 & 115;
                            int i90 = i88 | 115;
                            int i91 = (i89 & i90) + (i90 | i89);
                            b = i91 % 128;
                            int i92 = i91 % 2;
                            String string3 = editText4.getText().toString();
                            int i93 = a;
                            int i94 = (i93 ^ 115) + ((i93 & 115) << 1);
                            b = i94 % 128;
                            if (i94 % 2 == 0) {
                                editText5.getText().toString();
                                string3.isEmpty();
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            string2 = editText5.getText().toString();
                            if (!string3.isEmpty()) {
                                int i95 = b + 23;
                                a = i95 % 128;
                                if (i95 % 2 == 0 ? string2.length() == 13 : string2.length() == 73) {
                                    str = string3;
                                }
                            }
                            Toast.makeText(bikeRegistryActivity3, "Enter valid owner details", 0).show();
                            int i96 = b;
                            int i97 = i96 & 107;
                            int i98 = -(-((i96 ^ 107) | i97));
                            int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                            a = i99 % 128;
                            int i100 = i99 % 2;
                            return;
                        }
                        String str3 = boVar.c;
                        string2 = boVar.d;
                        int i101 = a;
                        int i102 = ((i101 ^ 58) + ((i101 & 58) << 1)) - 1;
                        b = i102 % 128;
                        int i103 = i102 % 2;
                        str = str3;
                        String str4 = string2;
                        String string4 = spinner6.getSelectedItem().toString();
                        String string5 = editText6.getText().toString();
                        int i104 = a;
                        int i105 = i104 ^ 49;
                        int i106 = (i104 & 49) << 1;
                        int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                        b = i107 % 128;
                        int i108 = i107 % 2;
                        if (string5.trim().isEmpty()) {
                            int i109 = a;
                            int i110 = i109 ^ 117;
                            int i111 = ((((i109 & 117) | i110) << 1) - (~(-i110))) - 1;
                            b = i111 % 128;
                            if (i111 % 2 != 0) {
                                editText6.setError("Bike number is required");
                                editText6.requestFocus();
                                return;
                            } else {
                                editText6.setError("Bike number is required");
                                editText6.requestFocus();
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                        }
                        if (str.isEmpty()) {
                            int i112 = b;
                            int i113 = (-2) - (((i112 & 118) + (i112 | 118)) ^ (-1));
                            a = i113 % 128;
                            int i114 = i113 % 2;
                            editText4.setError("Owner name is required");
                            editText4.requestFocus();
                            int i115 = a;
                            int i116 = (i115 ^ 3) + ((i115 & 3) << 1);
                            b = i116 % 128;
                            if (i116 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        if (str4.isEmpty()) {
                            int i117 = a;
                            int i118 = i117 & 29;
                            int i119 = (i118 - (~((i117 ^ 29) | i118))) - 1;
                            b = i119 % 128;
                            if (i119 % 2 == 0) {
                                editText5.setError("CNIC is required");
                                editText5.requestFocus();
                                int i120 = 21 / 0;
                            } else {
                                editText5.setError("CNIC is required");
                                editText5.requestFocus();
                            }
                            int i121 = a;
                            int i122 = ((i121 | 23) << 1) - (((~i121) & 23) | (i121 & (-24)));
                            b = i122 % 128;
                            if (i122 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        aZ aZVar = new aZ(editText6.getText().toString(), string4, spinner7.getSelectedItem().toString(), spinner8.getSelectedItem().toString(), str, str4, bikeRegistryActivity3.N);
                        int i123 = a;
                        int i124 = i123 & 121;
                        int i125 = -(-(i123 | 121));
                        int i126 = (i124 & i125) + (i125 | i124);
                        b = i126 % 128;
                        int i127 = i126 % 2;
                        bikeRegistryActivity3.F.add(aZVar);
                        int i128 = a;
                        int i129 = ((i128 ^ 101) - (~((i128 & 101) << 1))) - 1;
                        b = i129 % 128;
                        int i130 = i129 % 2;
                        arrayAdapter2.notifyDataSetChanged();
                        if (bikeRegistryActivity3.F.size() > 0) {
                            int i131 = b;
                            int i132 = i131 & 87;
                            int i133 = i131 | 87;
                            int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                            a = i134 % 128;
                            if (i134 % 2 != 0) {
                                bikeRegistryActivity3.L.setVisibility(1);
                                bikeRegistryActivity3.z.setVisibility(1);
                            } else {
                                bikeRegistryActivity3.L.setVisibility(0);
                                bikeRegistryActivity3.z.setVisibility(0);
                            }
                            int i135 = b;
                            int i136 = i135 & 61;
                            int i137 = (i135 | 61) & (~i136);
                            int i138 = i136 << 1;
                            int i139 = (i137 ^ i138) + ((i137 & i138) << 1);
                            a = i139 % 128;
                            int i140 = i139 % 2;
                        }
                        bikeRegistryActivity3.N = null;
                        dialog2.dismiss();
                        int i141 = a;
                        int i142 = i141 & 27;
                        int i143 = ((((i141 ^ 27) | i142) << 1) - (~(-((i141 | 27) & (~i142))))) - 1;
                        b = i143 % 128;
                        int i144 = i143 % 2;
                    }
                };
                int i75 = b;
                int i76 = i75 ^ 105;
                int i77 = (((i75 & 105) | i76) << 1) - i76;
                a = i77 % 128;
                if (i77 % 2 != 0) {
                    button.setOnClickListener(onClickListener);
                    dialog.show();
                } else {
                    button.setOnClickListener(onClickListener);
                    dialog.show();
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }
        });
        this.v.setOnCheckedChangeListener(new h(this, i4));
        this.B.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bi.z
            private static int a = 1;
            private static int b;
            public final /* synthetic */ BikeRegistryActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = 2 % 2;
                int i17 = b;
                int i18 = ((i17 ^ 116) + ((i17 & 116) << 1)) - 1;
                int i19 = i18 % 128;
                a = i19;
                int i20 = i18 % 2;
                if (i4 == 0) {
                    BikeRegistryActivity bikeRegistryActivity = this.d;
                    String strReplaceAll = bikeRegistryActivity.u.getText().toString().replaceAll("[^\\d]", BuildConfig.FLAVOR);
                    bikeRegistryActivity.M = strReplaceAll;
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("cnic", Long.parseLong(strReplaceAll));
                        bikeRegistryActivity.Q = new SessionManager(bikeRegistryActivity);
                        String string = jSONObject.toString();
                        SessionManager sessionManager = bikeRegistryActivity.Q;
                        int i21 = a;
                        int i22 = ((i21 | 67) << 1) - (i21 ^ 67);
                        b = i22 % 128;
                        if (i22 % 2 != 0) {
                            ivas.gov.bisp.enumeration.bK.b.b(sessionManager.k());
                            ivas.gov.bisp.enumeration.bK.b.b(bikeRegistryActivity.Q.m());
                            Object obj2 = null;
                            try {
                                obj2.hashCode();
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(string, ivas.gov.bisp.enumeration.bK.b.b(sessionManager.k()), ivas.gov.bisp.enumeration.bK.b.b(bikeRegistryActivity.Q.m())));
                        SessionManager sessionManager2 = bikeRegistryActivity.Q;
                        int i23 = b;
                        int i24 = i23 & 71;
                        int i25 = (((i23 | 71) & (~i24)) - (~(i24 << 1))) - 1;
                        a = i25 % 128;
                        int i26 = i25 % 2;
                        byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(sessionManager2.k());
                        byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(bikeRegistryActivity.Q.m());
                        int i27 = a;
                        int i28 = i27 & 29;
                        int i29 = -(-((i27 ^ 29) | i28));
                        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d("VerifyCNIC", bArrB, bArrB2));
                        bikeRegistryActivity.z.setEnabled(false);
                        bikeRegistryActivity.R.setVisibility(0);
                        ax.e(jSONObject2, bikeRegistryActivity, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new C0195x(bikeRegistryActivity));
                        int i32 = b;
                        int i33 = i32 & 41;
                        int i34 = (i32 ^ 41) | i33;
                        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                        a = i35 % 128;
                        if (i35 % 2 == 0) {
                            int i36 = 91 / 0;
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                int i37 = (i19 ^ 55) + ((i19 & 55) << 1);
                int i38 = i37 % 128;
                b = i38;
                int i39 = i37 % 2;
                int i40 = i38 & 37;
                int i41 = i38 | 37;
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                a = i42 % 128;
                int i43 = i42 % 2;
                final BikeRegistryActivity bikeRegistryActivity2 = this.d;
                int i44 = BikeRegistryActivity.r;
                Objects.requireNonNull(bikeRegistryActivity2);
                final Dialog dialog = new Dialog(bikeRegistryActivity2);
                int i45 = a;
                int i46 = ((i45 & 122) + (i45 | 122)) - 1;
                b = i46 % 128;
                int i47 = i46 % 2;
                dialog.setContentView(ivas.gov.bisp.enumeration.R.layout.dialog_add_bike);
                final EditText editText = (EditText) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.etBikeNumber);
                int i48 = b;
                int i49 = i48 & 23;
                int i50 = (i49 - (~((i48 ^ 23) | i49))) - 1;
                a = i50 % 128;
                if (i50 % 2 == 0) {
                    throw null;
                }
                final Spinner spinner = (Spinner) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.spBikeType);
                int i51 = (-2) - ((b + 68) ^ (-1));
                a = i51 % 128;
                int i52 = i51 % 2;
                final Spinner spinner2 = (Spinner) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.spProvince);
                final Spinner spinner3 = (Spinner) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.spRegistrationYear);
                ArrayList arrayList = new ArrayList();
                int i53 = a;
                int i54 = i53 & 59;
                int i55 = (i53 ^ 59) | i54;
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                b = i56 % 128;
                int i57 = i56 % 2;
                int i58 = Calendar.getInstance().get(1);
                int i59 = b;
                int i60 = ((i59 | 99) << 1) - (i59 ^ 99);
                a = i60 % 128;
                int i61 = i60 % 2;
                while (i58 >= 1947) {
                    int i62 = a;
                    int i63 = i62 & 39;
                    int i64 = -(-((i62 ^ 39) | i63));
                    int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                    b = i65 % 128;
                    if (i65 % 2 != 0) {
                        arrayList.add(String.valueOf(i58));
                        i58 += 72;
                    } else {
                        arrayList.add(String.valueOf(i58));
                        i58 = (-2) - (i58 ^ (-1));
                    }
                }
                final ArrayAdapter arrayAdapter = new ArrayAdapter(bikeRegistryActivity2, R.layout.simple_spinner_item, arrayList);
                arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                int i66 = a;
                int i67 = i66 & 3;
                int i68 = (i67 - (~((i66 ^ 3) | i67))) - 1;
                b = i68 % 128;
                int i69 = i68 % 2;
                spinner3.setAdapter((SpinnerAdapter) arrayAdapter);
                bikeRegistryActivity2.O = (Button) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.btnCamera);
                bikeRegistryActivity2.G = (ImageView) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.imgCamera);
                bikeRegistryActivity2.O.setOnClickListener(new ViewOnClickListenerC0186o(bikeRegistryActivity2));
                View viewFindViewById2 = dialog.findViewById(ivas.gov.bisp.enumeration.R.id.spOwner);
                int i70 = a;
                int i71 = i70 & 115;
                int i72 = -(-((i70 ^ 115) | i71));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                b = i73 % 128;
                int i74 = i73 % 2;
                final Spinner spinner4 = (Spinner) viewFindViewById2;
                LinearLayout linearLayout2 = (LinearLayout) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.layoutOtherOwner);
                final EditText editText2 = (EditText) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.etOwnerName);
                final EditText editText3 = (EditText) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.etOwnerCnic);
                spinner4.setAdapter((SpinnerAdapter) new ArrayAdapter(bikeRegistryActivity2, R.layout.simple_spinner_dropdown_item, bikeRegistryActivity2.H));
                spinner4.setOnItemSelectedListener(new J(bikeRegistryActivity2, linearLayout2));
                Button button = (Button) dialog.findViewById(ivas.gov.bisp.enumeration.R.id.btnSave);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.bi.l
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String string2;
                        String str;
                        int i75 = 2 % 2;
                        int i76 = b;
                        int i77 = (-2) - ((i76 + 38) ^ (-1));
                        a = i77 % 128;
                        int i78 = i77 % 2;
                        BikeRegistryActivity bikeRegistryActivity3 = bikeRegistryActivity2;
                        Spinner spinner5 = spinner4;
                        EditText editText4 = editText2;
                        int i79 = i76 & 63;
                        int i80 = ((((i76 ^ 63) | i79) << 1) - (~(-((~i79) & (i76 | 63))))) - 1;
                        a = i80 % 128;
                        int i81 = i80 % 2;
                        EditText editText5 = editText3;
                        Spinner spinner6 = spinner3;
                        EditText editText6 = editText;
                        int i82 = i76 + 115;
                        a = i82 % 128;
                        if (i82 % 2 != 0) {
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Spinner spinner7 = spinner;
                        Spinner spinner8 = spinner2;
                        int i83 = (i76 & 44) + (i76 | 44);
                        int i84 = (i83 ^ (-1)) + (i83 << 1);
                        a = i84 % 128;
                        int i85 = i84 % 2;
                        ArrayAdapter arrayAdapter2 = arrayAdapter;
                        Dialog dialog2 = dialog;
                        int i86 = BikeRegistryActivity.r;
                        int i87 = b + 43;
                        a = i87 % 128;
                        if (i87 % 2 != 0) {
                            Objects.requireNonNull(bikeRegistryActivity3);
                            String str2 = ((bo) spinner5.getSelectedItem()).c;
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        Objects.requireNonNull(bikeRegistryActivity3);
                        bo boVar = (bo) spinner5.getSelectedItem();
                        if (boVar.c.equals("Other")) {
                            int i88 = a;
                            int i89 = i88 & 115;
                            int i90 = i88 | 115;
                            int i91 = (i89 & i90) + (i90 | i89);
                            b = i91 % 128;
                            int i92 = i91 % 2;
                            String string3 = editText4.getText().toString();
                            int i93 = a;
                            int i94 = (i93 ^ 115) + ((i93 & 115) << 1);
                            b = i94 % 128;
                            if (i94 % 2 == 0) {
                                editText5.getText().toString();
                                string3.isEmpty();
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            string2 = editText5.getText().toString();
                            if (!string3.isEmpty()) {
                                int i95 = b + 23;
                                a = i95 % 128;
                                if (i95 % 2 == 0 ? string2.length() == 13 : string2.length() == 73) {
                                    str = string3;
                                }
                            }
                            Toast.makeText(bikeRegistryActivity3, "Enter valid owner details", 0).show();
                            int i96 = b;
                            int i97 = i96 & 107;
                            int i98 = -(-((i96 ^ 107) | i97));
                            int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                            a = i99 % 128;
                            int i100 = i99 % 2;
                            return;
                        }
                        String str3 = boVar.c;
                        string2 = boVar.d;
                        int i101 = a;
                        int i102 = ((i101 ^ 58) + ((i101 & 58) << 1)) - 1;
                        b = i102 % 128;
                        int i103 = i102 % 2;
                        str = str3;
                        String str4 = string2;
                        String string4 = spinner6.getSelectedItem().toString();
                        String string5 = editText6.getText().toString();
                        int i104 = a;
                        int i105 = i104 ^ 49;
                        int i106 = (i104 & 49) << 1;
                        int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                        b = i107 % 128;
                        int i108 = i107 % 2;
                        if (string5.trim().isEmpty()) {
                            int i109 = a;
                            int i110 = i109 ^ 117;
                            int i111 = ((((i109 & 117) | i110) << 1) - (~(-i110))) - 1;
                            b = i111 % 128;
                            if (i111 % 2 != 0) {
                                editText6.setError("Bike number is required");
                                editText6.requestFocus();
                                return;
                            } else {
                                editText6.setError("Bike number is required");
                                editText6.requestFocus();
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                        }
                        if (str.isEmpty()) {
                            int i112 = b;
                            int i113 = (-2) - (((i112 & 118) + (i112 | 118)) ^ (-1));
                            a = i113 % 128;
                            int i114 = i113 % 2;
                            editText4.setError("Owner name is required");
                            editText4.requestFocus();
                            int i115 = a;
                            int i116 = (i115 ^ 3) + ((i115 & 3) << 1);
                            b = i116 % 128;
                            if (i116 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        if (str4.isEmpty()) {
                            int i117 = a;
                            int i118 = i117 & 29;
                            int i119 = (i118 - (~((i117 ^ 29) | i118))) - 1;
                            b = i119 % 128;
                            if (i119 % 2 == 0) {
                                editText5.setError("CNIC is required");
                                editText5.requestFocus();
                                int i120 = 21 / 0;
                            } else {
                                editText5.setError("CNIC is required");
                                editText5.requestFocus();
                            }
                            int i121 = a;
                            int i122 = ((i121 | 23) << 1) - (((~i121) & 23) | (i121 & (-24)));
                            b = i122 % 128;
                            if (i122 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        aZ aZVar = new aZ(editText6.getText().toString(), string4, spinner7.getSelectedItem().toString(), spinner8.getSelectedItem().toString(), str, str4, bikeRegistryActivity3.N);
                        int i123 = a;
                        int i124 = i123 & 121;
                        int i125 = -(-(i123 | 121));
                        int i126 = (i124 & i125) + (i125 | i124);
                        b = i126 % 128;
                        int i127 = i126 % 2;
                        bikeRegistryActivity3.F.add(aZVar);
                        int i128 = a;
                        int i129 = ((i128 ^ 101) - (~((i128 & 101) << 1))) - 1;
                        b = i129 % 128;
                        int i130 = i129 % 2;
                        arrayAdapter2.notifyDataSetChanged();
                        if (bikeRegistryActivity3.F.size() > 0) {
                            int i131 = b;
                            int i132 = i131 & 87;
                            int i133 = i131 | 87;
                            int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                            a = i134 % 128;
                            if (i134 % 2 != 0) {
                                bikeRegistryActivity3.L.setVisibility(1);
                                bikeRegistryActivity3.z.setVisibility(1);
                            } else {
                                bikeRegistryActivity3.L.setVisibility(0);
                                bikeRegistryActivity3.z.setVisibility(0);
                            }
                            int i135 = b;
                            int i136 = i135 & 61;
                            int i137 = (i135 | 61) & (~i136);
                            int i138 = i136 << 1;
                            int i139 = (i137 ^ i138) + ((i137 & i138) << 1);
                            a = i139 % 128;
                            int i140 = i139 % 2;
                        }
                        bikeRegistryActivity3.N = null;
                        dialog2.dismiss();
                        int i141 = a;
                        int i142 = i141 & 27;
                        int i143 = ((((i141 ^ 27) | i142) << 1) - (~(-((i141 | 27) & (~i142))))) - 1;
                        b = i143 % 128;
                        int i144 = i143 % 2;
                    }
                };
                int i75 = b;
                int i76 = i75 ^ 105;
                int i77 = (((i75 & 105) | i76) << 1) - i76;
                a = i77 % 128;
                if (i77 % 2 != 0) {
                    button.setOnClickListener(onClickListener);
                    dialog.show();
                } else {
                    button.setOnClickListener(onClickListener);
                    dialog.show();
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }
        });
        this.z.setOnClickListener(new P(this, i15));
        this.u.addTextChangedListener(new OooO0O0());
        int i16 = p;
        int i17 = (i16 & 77) + (i16 | 77);
        q = i17 % 128;
        int i18 = i17 % 2;
    }

    public class OooO0O0 implements TextWatcher {
        private static int a = 1;
        private static int b;
        public boolean c;

        public OooO0O0() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a + 67;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 0;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = i5 & 105;
            int i7 = -(-((i5 ^ 105) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x013b  */
        /* JADX WARN: Code duplicated, block: B:43:0x01d6  */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z;
            String str;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 105;
            int i4 = (((i2 ^ 105) | i3) << 1) - ((~i3) & (i2 | 105));
            b = i4 % 128;
            int i5 = i4 % 2;
            if (this.c) {
                int i6 = ((i2 | 92) << 1) - (i2 ^ 92);
                int i7 = (i6 ^ (-1)) + (i6 << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            this.c = true;
            String string = editable.toString();
            int i9 = b + 57;
            a = i9 % 128;
            int i10 = i9 % 2;
            String strReplaceAll = string.replaceAll("[^\\d]", BuildConfig.FLAVOR);
            Object obj = null;
            if (!(!strReplaceAll.isEmpty())) {
                int i11 = b;
                int i12 = ((i11 & 5) - (~(i11 | 5))) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
                BikeRegistryActivity.this.u.removeTextChangedListener(this);
                EditText editText = BikeRegistryActivity.this.u;
                int i14 = a + 56;
                int i15 = (i14 ^ (-1)) + (i14 << 1);
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    editText.setText(BuildConfig.FLAVOR);
                    BikeRegistryActivity.this.u.addTextChangedListener(this);
                    obj.hashCode();
                    throw null;
                }
                editText.setText(BuildConfig.FLAVOR);
                BikeRegistryActivity.this.u.addTextChangedListener(this);
                int i16 = b + 119;
                int i17 = i16 % 128;
                a = i17;
                int i18 = i16 % 2;
                this.c = false;
                int i19 = i17 & 25;
                int i20 = (i17 | 25) & (~i19);
                int i21 = -(-(i19 << 1));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
                return;
            }
            if (strReplaceAll.length() < 13) {
                int i24 = b;
                int i25 = ((i24 ^ 65) | (i24 & 65)) << 1;
                int i26 = -(((~i24) & 65) | (i24 & (-66)));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                a = i27 % 128;
                int i28 = i27 % 2;
                BikeRegistryActivity.this.K.setVisibility(8);
                int i29 = b;
                int i30 = (i29 & (-72)) | ((~i29) & 71);
                int i31 = -(-((i29 & 71) << 1));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                a = i32 % 128;
                int i33 = i32 % 2;
            }
            if (strReplaceAll.length() > 13) {
                int i34 = b;
                int i35 = (((i34 ^ 73) | (i34 & 73)) << 1) - (((~i34) & 73) | (i34 & (-74)));
                a = i35 % 128;
                int i36 = i35 % 2;
                strReplaceAll = strReplaceAll.substring(0, 13);
                int i37 = b;
                int i38 = i37 & 95;
                int i39 = (i37 ^ 95) | i38;
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                a = i40 % 128;
                int i41 = i40 % 2;
            }
            StringBuilder sb = new StringBuilder();
            String string2 = editable.toString();
            int i42 = b;
            int i43 = i42 & 1;
            int i44 = (i42 | 1) & (~i43);
            int i45 = -(-(i43 << 1));
            int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
            a = i46 % 128;
            int i47 = i46 % 2;
            if (string2.length() != 5) {
                int i48 = a;
                int i49 = i48 & 23;
                int i50 = ((((i48 ^ 23) | i49) << 1) - (~(-((i48 | 23) & (~i49))))) - 1;
                b = i50 % 128;
                if (i50 % 2 == 0 ? editable.toString().length() == 13 : editable.toString().length() == 111) {
                    BikeRegistryActivity bikeRegistryActivity = BikeRegistryActivity.this;
                    String string3 = editable.toString();
                    int i51 = a + 93;
                    b = i51 % 128;
                    int i52 = i51 % 2;
                    bikeRegistryActivity.I = string3;
                    int i53 = a;
                    int i54 = ((i53 | 93) << 1) - (i53 ^ 93);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                } else {
                    int i56 = a;
                    int i57 = i56 & 105;
                    int i58 = i57 + ((i56 ^ 105) | i57);
                    b = i58 % 128;
                    int i59 = i58 % 2;
                    BikeRegistryActivity.this.I = BuildConfig.FLAVOR;
                    int i60 = b;
                    int i61 = ((i60 ^ 89) | (i60 & 89)) << 1;
                    int i62 = -(((~i60) & 89) | (i60 & (-90)));
                    int i63 = (i61 & i62) + (i62 | i61);
                    a = i63 % 128;
                    int i64 = i63 % 2;
                }
            } else {
                BikeRegistryActivity bikeRegistryActivity2 = BikeRegistryActivity.this;
                String string4 = editable.toString();
                int i510 = a + 93;
                b = i510 % 128;
                int i511 = i510 % 2;
                bikeRegistryActivity2.I = string4;
                int i512 = a;
                int i513 = ((i512 | 93) << 1) - (i512 ^ 93);
                b = i513 % 128;
                int i514 = i513 % 2;
            }
            if (BikeRegistryActivity.this.I.length() != 5) {
                int i65 = b;
                int i66 = (i65 ^ 115) + ((i65 & 115) << 1);
                a = i66 % 128;
                int i67 = i66 % 2;
                if (BikeRegistryActivity.this.I.length() != 13) {
                    int i68 = a;
                    int i69 = i68 & 21;
                    int i70 = ((i68 ^ 21) | i69) << 1;
                    int i71 = -((i68 | 21) & (~i69));
                    int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                    int i73 = i72 % 128;
                    b = i73;
                    int i74 = i72 % 2;
                    int i75 = i73 + 91;
                    a = i75 % 128;
                    int i76 = 4;
                    if (i75 % 2 == 0) {
                        int i77 = 4 / 4;
                    }
                    int i78 = 0;
                    while (i78 < strReplaceAll.length()) {
                        int i79 = a + 11;
                        b = i79 % 128;
                        int i80 = i79 % 2;
                        sb.append(strReplaceAll.charAt(i78));
                        if (i78 != i76) {
                            int i81 = b;
                            int i82 = i81 & 89;
                            int i83 = (~i82) & (i81 | 89);
                            int i84 = i82 << 1;
                            int i85 = (i83 ^ i84) + ((i83 & i84) << 1);
                            a = i85 % 128;
                            if (i85 % 2 == 0) {
                                if (i78 == 79) {
                                    sb.append("-");
                                    int i86 = (-2) - ((a + 108) ^ (-1));
                                    b = i86 % 128;
                                    int i87 = i86 % 2;
                                }
                            } else if (i78 == 11) {
                                sb.append("-");
                                int i88 = (-2) - ((a + 108) ^ (-1));
                                b = i88 % 128;
                                int i89 = i88 % 2;
                            }
                        } else {
                            sb.append("-");
                            int i810 = (-2) - ((a + 108) ^ (-1));
                            b = i810 % 128;
                            int i811 = i810 % 2;
                        }
                        i78 = ((i78 ^ 1) - (~(-(-((i78 & 1) << 1))))) - 1;
                        int i90 = a;
                        int i91 = ((i90 ^ 85) | (i90 & 85)) << 1;
                        int i92 = -((85 & (~i90)) | (i90 & (-86)));
                        int i93 = (i91 & i92) + (i92 | i91);
                        b = i93 % 128;
                        int i94 = i93 % 2;
                        i76 = 4;
                    }
                    BikeRegistryActivity.this.u.removeTextChangedListener(this);
                    int i95 = b;
                    int i96 = ((i95 ^ 91) | (i95 & 91)) << 1;
                    int i97 = -(((~i95) & 91) | (i95 & (-92)));
                    int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
                    a = i98 % 128;
                    if (i98 % 2 == 0) {
                        BikeRegistryActivity.this.u.setText(sb);
                        obj.hashCode();
                        throw null;
                    }
                    BikeRegistryActivity.this.u.setText(sb);
                    BikeRegistryActivity.this.u.setSelection(sb.length());
                    int i99 = b + 65;
                    a = i99 % 128;
                    int i100 = i99 % 2;
                    BikeRegistryActivity.this.u.addTextChangedListener(this);
                    int i101 = b;
                    int i102 = i101 & 55;
                    int i103 = i101 | 55;
                    int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                    a = i104 % 128;
                    int i105 = i104 % 2;
                }
            }
            Button button = BikeRegistryActivity.this.y;
            if (strReplaceAll.length() != 13) {
                int i106 = a;
                int i107 = i106 & 125;
                int i108 = (i106 | 125) & (~i107);
                int i109 = i107 << 1;
                int i110 = (i108 ^ i109) + ((i108 & i109) << 1);
                b = i110 % 128;
                z = !(i110 % 2 == 0);
            } else {
                z = true;
            }
            button.setEnabled(z);
            Button button2 = BikeRegistryActivity.this.y;
            int length = strReplaceAll.length();
            int i111 = a;
            int i112 = (i111 ^ 11) + ((i111 & 11) << 1);
            int i113 = i112 % 128;
            b = i113;
            if (i112 % 2 == 0 ? length != 13 : length != 58) {
                int i114 = i113 + 75;
                a = i114 % 128;
                int i115 = i114 % 2;
                str = "#9E9E9E";
            } else {
                int i116 = i113 + 83;
                a = i116 % 128;
                int i117 = i116 % 2;
                str = "#4CAF50";
            }
            button2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str)));
            int i118 = a;
            int i119 = (((i118 & (-26)) | ((~i118) & 25)) - (~((i118 & 25) << 1))) - 1;
            int i120 = i119 % 128;
            b = i120;
            int i121 = i119 % 2;
            this.c = false;
            int i122 = ((i120 & (-100)) | ((~i120) & 99)) + ((i120 & 99) << 1);
            a = i122 % 128;
            int i123 = i122 % 2;
        }
    }
}
