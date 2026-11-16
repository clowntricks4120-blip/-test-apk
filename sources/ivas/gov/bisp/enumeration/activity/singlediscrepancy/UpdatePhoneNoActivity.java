package ivas.gov.bisp.enumeration.activity.singlediscrepancy;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.dd.E;
import ivas.gov.bisp.enumeration.dd.U;
import ivas.gov.bisp.enumeration.dd.ad;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdatePhoneNoActivity extends BaseTouch {
    private static int p = 1;
    private static int q;
    public ImageView ac;
    public EditText ad;
    public EditText ae;
    public TextView af;
    public ProgressDialog ag;
    public String ah;
    public RosterItem ai;
    public String aj;
    public String ak;
    public ArrayList<String> al;
    public SessionManager am;
    public Spinner an;

    public class OooO00o implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b + 109;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 2) + ((i3 & 2) << 1)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (i != 0) {
                UpdatePhoneNoActivity updatePhoneNoActivity = UpdatePhoneNoActivity.this;
                String string = updatePhoneNoActivity.an.getSelectedItem().toString();
                int i6 = b;
                int i7 = (((i6 | 22) << 1) - (i6 ^ 22)) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                updatePhoneNoActivity.ak = string;
                UpdatePhoneNoActivity.this.an.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i9 = b;
                int i10 = (i9 ^ 3) + ((i9 & 3) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            int i12 = i3 + 17;
            b = i12 % 128;
            int i13 = i12 % 2;
            UpdatePhoneNoActivity.this.an.setBackgroundResource(R.drawable.spinner_bg);
            UpdatePhoneNoActivity updatePhoneNoActivity2 = UpdatePhoneNoActivity.this;
            int i14 = a;
            int i15 = (i14 & (-66)) | ((~i14) & 65);
            int i16 = -(-((i14 & 65) << 1));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            updatePhoneNoActivity2.ak = BuildConfig.FLAVOR;
            int i19 = a;
            int i20 = i19 & 73;
            int i21 = i20 + ((i19 ^ 73) | i20);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 3 / 0;
            }
        }
    }

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO(UpdatePhoneNoActivity updatePhoneNoActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 77;
            int i5 = ((i3 ^ 77) | i4) << 1;
            int i6 = -((i3 | 77) & (~i4));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            dialogInterface.cancel();
            int i9 = a;
            int i10 = i9 & 11;
            int i11 = (i9 | 11) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = (i11 & i12) + (i11 | i12);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 61;
        int i4 = ((i2 ^ 61) | i3) << 1;
        int i5 = -((i2 | 61) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        q = i6 % 128;
        int i7 = i6 % 2;
        finish();
        int i8 = p;
        int i9 = i8 & 45;
        int i10 = ((i8 ^ 45) | i9) << 1;
        int i11 = -((i8 | 45) & (~i9));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        q = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 73;
        int i3 = i2 % 128;
        q = i3;
        int i4 = i2 % 2;
        int i5 = i3 & 99;
        int i6 = (((i3 ^ 99) | i5) << 1) - ((i3 | 99) & (~i5));
        p = i6 % 128;
        if (i6 % 2 != 0) {
            return R.layout.activity_update_phone_no;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 | 23) << 1) - (i2 ^ 23);
        q = i3 % 128;
        int i4 = i3 % 2;
        int id = view.getId();
        Object obj = null;
        if (id != R.id.btn_update) {
            int i5 = p;
            int i6 = i5 + 123;
            q = i6 % 128;
            int i7 = i6 % 2;
            if (id == R.id.iv_back) {
                int i8 = (i5 ^ 21) + ((i5 & 21) << 1);
                q = i8 % 128;
                if (i8 % 2 == 0) {
                    onBackPressed();
                    return;
                } else {
                    onBackPressed();
                    throw null;
                }
            }
        } else {
            if (this.an.getSelectedItemPosition() == 0) {
                int i9 = q;
                int i10 = ((i9 | 62) << 1) - (i9 ^ 62);
                int i11 = (i10 ^ (-1)) + (i10 << 1);
                p = i11 % 128;
                int i12 = i11 % 2;
                z.o(this, this.an, "Please Select Network");
                int i13 = p;
                int i14 = i13 & 95;
                int i15 = ((i13 | 95) & (~i14)) + (i14 << 1);
                q = i15 % 128;
                int i16 = i15 % 2;
                return;
            }
            if (!j.A(this.ae, BuildConfig.FLAVOR)) {
                this.am.p();
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                int i17 = q;
                int i18 = ((i17 | 27) << 1) - (i17 ^ 27);
                p = i18 % 128;
                if (i18 % 2 == 0) {
                    builder.setTitle("Phone Number.!");
                    j.w("Please Comfirm your Phone # ");
                    obj.hashCode();
                    throw null;
                }
                builder.setTitle("Phone Number.!");
                StringBuilder sbW = j.w("Please Comfirm your Phone # ");
                sbW.append(this.ae.getText().toString());
                int i19 = q;
                int i20 = (i19 | 87) << 1;
                int i21 = -(((~i19) & 87) | (i19 & (-88)));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                p = i22 % 128;
                if (i22 % 2 == 0) {
                    builder.setMessage(sbW.toString());
                } else {
                    builder.setMessage(sbW.toString());
                }
                builder.setCancelable(true);
                builder.setPositiveButton("Confirm", new OooO0O0());
                OooO0OO oooO0OO = new OooO0OO(this);
                int i23 = q + 113;
                p = i23 % 128;
                if (i23 % 2 != 0) {
                    builder.setNegativeButton("No", oooO0OO);
                    builder.create().show();
                    return;
                } else {
                    builder.setNegativeButton("No", oooO0OO);
                    builder.create().show();
                    throw null;
                }
            }
            Toast.makeText(this, "Please Enter Phone Number", 0).show();
            int i24 = q;
            int i25 = ((i24 & (-6)) | ((~i24) & 5)) + ((i24 & 5) << 1);
            p = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = q + 117;
        p = i27 % 128;
        int i28 = i27 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ag = new ProgressDialog(this);
        this.am = new SessionManager(this);
        this.an = (Spinner) findViewById(R.id.sp_networks);
        this.ac = (ImageView) findViewById(R.id.iv_back);
        int i2 = p;
        int i3 = i2 & 71;
        int i4 = -(-(i2 | 71));
        int i5 = (i3 & i4) + (i4 | i3);
        q = i5 % 128;
        int i6 = i5 % 2;
        this.ad = (EditText) findViewById(R.id.et_cnic);
        this.ae = (EditText) findViewById(R.id.et_phone);
        this.af = (TextView) findViewById(R.id.btn_update);
        ((TextView) findViewById(R.id.tv_heading)).setText("Phone Number");
        Intent intent = getIntent();
        int i7 = p;
        int i8 = ((i7 & 103) - (~(-(-(i7 | 103))))) - 1;
        q = i8 % 128;
        int i9 = i8 % 2;
        this.ai = (RosterItem) intent.getSerializableExtra("roster_data");
        this.ah = intent.getStringExtra("roster_cnic");
        this.ac.setOnClickListener(this);
        this.af.setOnClickListener(this);
        this.ag.setCancelable(false);
        this.ag.setMessage("Please Wait...");
        this.ag.setProgressStyle(0);
        this.al = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.networks)));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, this.al);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this.an.setAdapter((SpinnerAdapter) arrayAdapter);
        Spinner spinner = this.an;
        OooO00o oooO00o = new OooO00o();
        int i10 = p + 70;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        q = i11 % 128;
        int i12 = i11 % 2;
        spinner.setOnItemSelectedListener(oooO00o);
        this.ai.getHhid();
        this.ai.isIs_Benificiary();
        this.ai.getMessage();
        this.aj = this.ai.getCnic();
        this.ai.getDisabilityCode();
        this.ai.getDisabilityStatus();
        this.ai.getDiscrepancy_status();
        int i13 = q;
        int i14 = i13 & 47;
        int i15 = ((i13 | 47) & (~i14)) + (i14 << 1);
        p = i15 % 128;
        int i16 = i15 % 2;
        this.ai.getDob();
        this.ai.get_educationLevelCode();
        this.ai.get_employmentCode();
        this.ai.getEmployment_status();
        this.ai.getForm_no();
        this.ai.getGender();
        this.ai.get_goneToSchoolCode();
        RosterItem rosterItem = this.ai;
        int i17 = q;
        int i18 = (i17 ^ 17) + ((i17 & 17) << 1);
        p = i18 % 128;
        int i19 = i18 % 2;
        rosterItem.getHavingChronicDiseaseCode();
        this.ai.getHhMemberNames();
        this.ai.isLiterate();
        this.ai.get_lastWeekWorkingHours();
        this.ai.getMaritalStatus();
        this.ai.getMaritalStatusCode();
        this.ai.getMessage();
        this.ai.getRelationToHouseholdHead();
        int i20 = q;
        int i21 = (((i20 ^ 7) | (i20 & 7)) << 1) - (((~i20) & 7) | (i20 & (-8)));
        p = i21 % 128;
        int i22 = i21 % 2;
        this.ai.getrId();
        this.ai.getWorkStatus();
        this.ai.get_workStatusCode();
        this.ai.getDupRosterList();
        Object obj = null;
        if (this.aj.equals(BuildConfig.FLAVOR)) {
            this.ad.setText(this.ah);
            int i23 = q;
            int i24 = i23 & 25;
            int i25 = i24 + ((i23 ^ 25) | i24);
            p = i25 % 128;
            int i26 = i25 % 2;
        } else {
            int i27 = q;
            int i28 = i27 & 25;
            int i29 = (i27 | 25) & (~i28);
            int i30 = -(-(i28 << 1));
            int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
            p = i31 % 128;
            if (i31 % 2 == 0) {
                this.ad.setText(this.aj);
                throw null;
            }
            this.ad.setText(this.aj);
        }
        this.ae.setText(this.am.p());
        int i32 = q;
        int i33 = (i32 & 37) + (i32 | 37);
        p = i33 % 128;
        if (i33 % 2 == 0) {
            ac.n(this.ae);
            throw null;
        }
        ac.n(this.ae);
        int i34 = q + 109;
        p = i34 % 128;
        if (i34 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int c = 0;
        private static int d = 1;
        private static char[] e$s2$33 = {31022, 59392, 23305, 51771, 15651, 44073, 8049, 36441, 61782, 24683, 54128, 16970, 46480, 9368, 38789, 1678, 27043, 55471, 19411, 47823, 11753, 40169, 4068, 32484, 57366, 21274};
        private static long d$s3$33 = 731931586547607664L;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String string = UpdatePhoneNoActivity.this.ae.getText().toString();
            try {
                jSONObject.put("HH_ID", UpdatePhoneNoActivity.this.am.c());
                jSONObject.put("phone_number", string);
                jSONObject.put("mobile_network", UpdatePhoneNoActivity.this.ak);
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(UpdatePhoneNoActivity.this.am.k()), b.b(UpdatePhoneNoActivity.this.am.m())));
                byte[] bArrB = b.b(UpdatePhoneNoActivity.this.am.k());
                byte[] bArrB2 = b.b(UpdatePhoneNoActivity.this.am.m());
                Object[] objArr = new Object[1];
                a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), KeyEvent.getMaxKeyCode() >> 16, objArr);
                jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                UpdatePhoneNoActivity updatePhoneNoActivity = UpdatePhoneNoActivity.this;
                Objects.requireNonNull(updatePhoneNoActivity);
                E e = new E(updatePhoneNoActivity, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new U(updatePhoneNoActivity), new ad(updatePhoneNoActivity));
                e.m = new ivas.gov.bisp.enumeration.p022av.z(130000, 0, 0.0f);
                e.k = false;
                a.b(updatePhoneNoActivity).c(e);
                int i3 = c + 125;
                d = i3 % 128;
                int i4 = i3 % 2;
            } catch (JSONException unused) {
            }
            Toast.makeText(UpdatePhoneNoActivity.this, "Phone # is updated ", 0).show();
            dialogInterface.cancel();
            int i5 = d + 85;
            c = i5 % 128;
            int i6 = i5 % 2;
        }

        private static void a(int i, char c2, int i2, Object[] objArr) {
            int i3 = 2 % 2;
            e eVar = new e();
            long[] jArr = new long[i];
            eVar.d = 0;
            while (eVar.d < i) {
                int i4 = $11 + 15;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                jArr[eVar.d] = (((long) ((char) (((long) e$s2$33[i2 + eVar.d]) ^ (-9150281428767639173L)))) ^ (((long) eVar.d) * ((-9150281428767639173L) ^ d$s3$33))) ^ ((long) c2);
                eVar.d++;
                int i6 = $11 + 15;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }
            char[] cArr = new char[i];
            eVar.d = 0;
            while (eVar.d < i) {
                int i8 = $11 + 65;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr[eVar.d] = (char) jArr[eVar.d];
                eVar.d++;
            }
            objArr[0] = new String(cArr);
        }
    }
}
