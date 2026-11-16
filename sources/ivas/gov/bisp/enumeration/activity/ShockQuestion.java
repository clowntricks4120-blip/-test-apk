package ivas.gov.bisp.enumeration.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.ShockQuestion;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.ak;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.p036bi.C0162ao;
import ivas.gov.bisp.enumeration.p036bi.C0164aq;
import ivas.gov.bisp.enumeration.p036bi.C0165ar;
import ivas.gov.bisp.enumeration.p036bi.C0166as;
import ivas.gov.bisp.enumeration.p036bi.C0167at;
import ivas.gov.bisp.enumeration.p036bi.C0168au;
import ivas.gov.bisp.enumeration.p036bi.C0169av;
import ivas.gov.bisp.enumeration.p036bi.C0170aw;
import ivas.gov.bisp.enumeration.p036bi.C0171ax;
import ivas.gov.bisp.enumeration.p036bi.C0172ay;
import ivas.gov.bisp.enumeration.p036bi.C0178g;
import ivas.gov.bisp.enumeration.p036bi.aA;
import ivas.gov.bisp.enumeration.p036bi.az;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ShockQuestion extends BaseTouch implements RadioGroup.OnCheckedChangeListener {
    public static final /* synthetic */ int ac = 0;
    private static int p = 0;
    private static int q = 1;
    public Spinner aA;
    public Spinner aB;
    public Spinner aC;
    public Spinner aD;
    public CheckBox aE;
    public CardView aF;
    public CheckBox aG;
    public CheckBox aH;
    public CheckBox aI;
    public CheckBox aJ;
    public CheckBox aK;
    public Spinner aL;
    public EditText aM;
    public CheckBox aN;
    public CheckBox aO;
    public EditText aP;
    public Spinner aQ;
    public EditText aR;
    public EditText aS;
    public EditText aT;
    public Spinner aU;
    public EditText aV;
    public EditText aW;
    public ImageView aY;
    public ImageView aZ;
    public RadioGroup ad;
    public RadioButton ae;
    public RadioButton af;
    public RadioGroup ag;
    public RadioButton ah;
    public RadioButton ai;
    public RadioButton aj;
    public String ak;
    public SessionManager al;
    public ArrayList<String> am;
    public ImageView an;
    public Spinner ao;
    public Spinner ap;
    public Spinner aq;
    public Spinner ar;
    public Spinner as;
    public Spinner at;
    public Spinner au;
    public Spinner av;
    public Spinner aw;
    public Spinner ax;
    public Spinner ay;
    public Spinner az;
    public String bQ;
    public String bR;
    public String bT;
    public String bU;
    public ArrayList<String> bV;
    public String bW;
    public ArrayList<String> bX;
    public ArrayList<String> bY;
    public ArrayList<String> bZ;
    public ImageView ba;
    public ImageView bb;
    public ImageView bc;
    public ImageView bd;
    public ImageView be;
    public ImageView bf;
    public ImageView bg;
    public Button bh;
    public Boolean bi;
    public Spinner bj;
    public ImageView bl;
    public Spinner bo;
    public ImageView bs;
    public ImageView bw;
    public ImageView bz;
    public ArrayList<String> ca;
    public ArrayList<String> cb;
    public ArrayList<String> cc;
    public LinearLayout cd;
    public LinearLayout ce;
    public LinearLayout cf;
    public LinearLayout cg;
    public LinearLayout ch;
    public LinearLayout ci;
    public JSONObject cj;
    public LinearLayout ck;
    public Spinner cl;
    public ArrayList<String> cm;
    public LinearLayout cn;
    public LinearLayout co;
    public LinearLayout cp;
    public ScrollView cr;
    public LinearLayout cs;
    public LinearLayout ct;
    public LinearLayout cu;
    public LinearLayout cv;
    public LinearLayout cw;
    public LinearLayout cx;
    public int aX = 0;
    public int bk = 0;
    public int cq = 0;
    public int bm = 0;
    public int bn = 0;
    public int bp = 0;
    public int bq = 0;
    public int bt = 0;
    public int bu = 0;
    public int bv = 0;
    public int br = 0;
    public int bx = 0;
    public int by = 0;
    public int bA = 0;
    public int bB = 0;
    public int bC = 0;
    public int bE = 0;
    public int bD = 0;
    public int bF = 0;
    public int bG = 0;
    public int cy = 0;
    public int bI = 0;
    public int bH = 0;
    public int bJ = 0;
    public boolean bK = false;
    public boolean bM = false;
    public boolean bL = false;
    public boolean bN = false;
    public boolean bO = false;
    public boolean bP = false;
    public boolean bS = false;

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 51;
        int i4 = ((i2 ^ 51) | i3) << 1;
        int i5 = -((i2 | 51) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        q = i7;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i8 = i7 & 13;
        int i9 = (i7 ^ 13) | i8;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        p = i10 % 128;
        int i11 = i10 % 2;
        return R.layout.activity_shock_question;
    }

    public final void y() {
        boolean z;
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 75;
        int i4 = (i2 | 75) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        p = i6 % 128;
        int i7 = i6 % 2;
        if (!ak.g(this)) {
            Toast.makeText(this, "You need to sync your application in order to proceed.", 1).show();
            int i8 = p;
            int i9 = i8 & 35;
            int i10 = (i8 | 35) & (~i9);
            int i11 = i9 << 1;
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            q = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        int i14 = q;
        int i15 = i14 ^ 89;
        int i16 = (((i14 & 89) | i15) << 1) - i15;
        p = i16 % 128;
        int i17 = i16 % 2;
        SharedPreferences sharedPreferences = ah.c.d;
        int i18 = q;
        int i19 = (i18 ^ 25) + ((i18 & 25) << 1);
        p = i19 % 128;
        Object obj = null;
        if (i19 % 2 != 0) {
            sharedPreferences.getInt("enum_survey_limit", 100);
            obj.hashCode();
            throw null;
        }
        if (sharedPreferences.getInt("enum_survey_limit", 100) <= 0) {
            Toast.makeText(this, "Maximum survey limit reached. Sync with supervisor to proceed", 1).show();
            int i20 = q;
            int i21 = ((i20 ^ 118) + ((i20 & 118) << 1)) - 1;
            p = i21 % 128;
            int i22 = i21 % 2;
            return;
        }
        int i23 = q;
        int i24 = ((i23 & 36) + (i23 | 36)) - 1;
        p = i24 % 128;
        if (i24 % 2 != 0) {
            Objects.requireNonNull((BISPApplication) getApplicationContext());
            z = true;
        } else {
            Objects.requireNonNull((BISPApplication) getApplicationContext());
            z = false;
        }
        BISPApplication.f = z;
        Intent intent = new Intent(this, (Class<?>) ActivityBeginSurvey.class);
        int i25 = p;
        int i26 = i25 & 39;
        int i27 = (((i25 | 39) & (~i26)) - (~(i26 << 1))) - 1;
        q = i27 % 128;
        if (i27 % 2 != 0) {
            startActivity(intent);
            finish();
        } else {
            startActivity(intent);
            finish();
            throw null;
        }
    }

    public static void u(final ScrollView scrollView, View view) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 | 81;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 81)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        p = i6 % 128;
        int i7 = i6 % 2;
        final int top = view.getTop();
        int i8 = p;
        int i9 = i8 & 31;
        int i10 = (((i8 | 31) & (~i9)) - (~(i9 << 1))) - 1;
        q = i10 % 128;
        int i11 = i10 % 2;
        while (!(view.getParent() instanceof ScrollView)) {
            int i12 = q;
            int i13 = ((((i12 ^ 39) | (i12 & 39)) << 1) - (~(-(((~i12) & 39) | (i12 & (-40)))))) - 1;
            p = i13 % 128;
            int i14 = i13 % 2;
            view = (View) view.getParent();
            int top2 = view.getTop();
            int i15 = q + 29;
            int i16 = i15 % 128;
            p = i16;
            int i17 = i15 % 2;
            top = (-2) - ((top - (~top2)) ^ (-1));
            int i18 = i16 + 69;
            q = i18 % 128;
            int i19 = i18 % 2;
        }
        Handler handler = new Handler();
        Runnable runnable = new Runnable() { // from class: ivas.gov.bisp.enumeration.bi.f
            private static int a = 1;
            private static int b;

            @Override // java.lang.Runnable
            public final void run() {
                ScrollView scrollView2;
                int i20;
                int i21 = 2 % 2;
                int i22 = b + 31;
                a = i22 % 128;
                if (i22 % 2 == 0) {
                    scrollView2 = scrollView;
                    i20 = top;
                    int i23 = ShockQuestion.ac;
                } else {
                    scrollView2 = scrollView;
                    i20 = top;
                    int i24 = ShockQuestion.ac;
                }
                scrollView2.smoothScrollTo(0, (i20 ^ (-50)) + ((i20 & (-50)) << 1));
                int i25 = (-2) - ((b + 66) ^ (-1));
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    int i26 = 51 / 0;
                }
            }
        };
        int i20 = q;
        int i21 = ((i20 ^ 77) | (i20 & 77)) << 1;
        int i22 = -(((~i20) & 77) | (i20 & (-78)));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        p = i23 % 128;
        int i24 = i23 % 2;
        handler.post(runnable);
        if (i24 != 0) {
            int i25 = 65 / 0;
        }
    }

    public void w() {
        int i;
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = i3 ^ 39;
        int i5 = -(-((i3 & 39) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        q = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            ((ivas.gov.bisp.enumeration.de.j) this.al.h(this)).getInt("last_time_started", -1);
            throw null;
        }
        int i7 = ((ivas.gov.bisp.enumeration.de.j) this.al.h(this)).getInt("last_time_started", -1);
        int i8 = q + 115;
        p = i8 % 128;
        if (i8 % 2 == 0 ? (i = Calendar.getInstance().get(6)) != i7 : (i = Calendar.getInstance().get(18)) != i7) {
            SharedPreferences.Editor editorEdit = ((ivas.gov.bisp.enumeration.de.j) this.al.h(this)).edit();
            int i9 = p + 95;
            q = i9 % 128;
            if (i9 % 2 == 0) {
                editorEdit.putInt("last_time_started", i).apply();
                obj.hashCode();
                throw null;
            }
            editorEdit.putInt("last_time_started", i).apply();
            SessionManager sessionManager = this.al;
            int i10 = q;
            int i11 = i10 & 121;
            int i12 = (i11 - (~((i10 ^ 121) | i11))) - 1;
            p = i12 % 128;
            int i13 = i12 % 2;
            SharedPreferences.Editor editorPutInt = ((ivas.gov.bisp.enumeration.de.j) sessionManager.h(this)).edit().putInt("survey_count", 0);
            int i14 = q;
            int i15 = (((i14 ^ 117) | (i14 & 117)) << 1) - (((~i14) & 117) | (i14 & (-118)));
            p = i15 % 128;
            int i16 = i15 % 2;
            editorPutInt.apply();
            int i17 = p - (-1);
            q = i17 % 128;
            int i18 = i17 % 2;
        }
        y();
        int i19 = p + 103;
        q = i19 % 128;
        if (i19 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void z(ArrayList<String> arrayList, Spinner spinner) {
        int i = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setSelection(0);
        AdapterView.OnItemSelectedListener oooO00o = new OooO00o(spinner);
        int i2 = q;
        int i3 = i2 & 23;
        int i4 = (i3 - (~((i2 ^ 23) | i3))) - 1;
        p = i4 % 128;
        if (i4 % 2 != 0) {
            spinner.setOnItemSelectedListener(oooO00o);
            int i5 = 68 / 0;
        } else {
            spinner.setOnItemSelectedListener(oooO00o);
        }
        int i6 = q;
        int i7 = i6 ^ 85;
        int i8 = ((((i6 & 85) | i7) << 1) - (~(-i7))) - 1;
        p = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:13:0x0059  */
    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00de  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:35:0x0130  */
    /* JADX WARN: Code duplicated, block: B:37:0x0138  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Code duplicated, block: B:41:0x014c  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r7
  0x002d: PHI (r7v2 int) = (r7v1 int), (r7v70 int) binds: [B:8:0x002b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int id;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = p;
        int i9 = (-2) - ((((i8 | 16) << 1) - (i8 ^ 16)) ^ (-1));
        q = i9 % 128;
        if (i9 % 2 == 0) {
            id = radioGroup.getId();
            int i10 = 33 / 0;
            if (id != R.id.rg_hh_displaced) {
                int i11 = p;
                int i12 = i11 ^ 21;
                int i13 = ((i11 & 21) | i12) << 1;
                int i14 = -i12;
                int i15 = (i13 & i14) + (i13 | i14);
                i2 = i15 % 128;
                q = i2;
                int i16 = i15 % 2;
                if (id == R.id.rg_house) {
                    int i17 = i2 & 73;
                    int i18 = -(-((i2 ^ 73) | i17));
                    i3 = ((i17 | i18) << 1) - (i17 ^ i18);
                    p = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.ah.getId();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (i == this.ah.getId()) {
                        this.ak = "destroyed";
                        this.aF.setVisibility(0);
                        i5 = p + 121;
                        q = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i19 = 23 / 0;
                            return;
                        }
                        return;
                    }
                    if (i == this.aj.getId()) {
                        int i20 = q;
                        int i21 = i20 & 71;
                        int i22 = (i20 | 71) & (~i21);
                        int i23 = -(-(i21 << 1));
                        int i24 = (i22 & i23) + (i22 | i23);
                        p = i24 % 128;
                        int i25 = i24 % 2;
                        this.ak = "partial damage";
                        this.aF.setVisibility(0);
                        return;
                    }
                    if (i == this.ai.getId()) {
                        int i26 = q;
                        int i27 = i26 & 49;
                        int i28 = i26 | 49;
                        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                        p = i29 % 128;
                        int i30 = i29 % 2;
                        this.ak = "no damage";
                        CardView cardView = this.aF;
                        int i31 = i26 + 106;
                        int i32 = (i31 ^ (-1)) + (i31 << 1);
                        p = i32 % 128;
                        int i33 = i32 % 2;
                        cardView.setVisibility(8);
                        int i34 = q;
                        i4 = (i34 ^ 93) + ((i34 & 93) << 1);
                        p = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i35 = 32 / 0;
                            return;
                        }
                        return;
                    }
                }
            } else {
                if (i == this.ae.getId()) {
                    int i36 = q;
                    int i37 = ((i36 | 1) << 1) - (i36 ^ 1);
                    p = i37 % 128;
                    int i38 = i37 % 2;
                    this.cx.setVisibility(0);
                    this.bi = Boolean.TRUE;
                    int i39 = p;
                    int i40 = ((i39 & (-30)) | ((~i39) & 29)) + ((i39 & 29) << 1);
                    q = i40 % 128;
                    int i41 = i40 % 2;
                    Toast.makeText(this, "yes", 0).show();
                    int i42 = q + 21;
                    p = i42 % 128;
                    int i43 = i42 % 2;
                    return;
                }
                if (i == this.af.getId()) {
                    i6 = p + 89;
                    q = i6 % 128;
                    if (i6 % 2 == 0) {
                        this.cx.setVisibility(3);
                    } else {
                        this.cx.setVisibility(8);
                    }
                    this.bi = Boolean.FALSE;
                    Toast.makeText(this, "no", 0).show();
                    int i44 = p + 53;
                    q = i44 % 128;
                    int i45 = i44 % 2;
                }
            }
        } else {
            id = radioGroup.getId();
            if (id != R.id.rg_hh_displaced) {
                int i110 = p;
                int i111 = i110 ^ 21;
                int i112 = ((i110 & 21) | i111) << 1;
                int i113 = -i111;
                int i114 = (i112 & i113) + (i112 | i113);
                i2 = i114 % 128;
                q = i2;
                int i115 = i114 % 2;
                if (id == R.id.rg_house) {
                    int i116 = i2 & 73;
                    int i117 = -(-((i2 ^ 73) | i116));
                    i3 = ((i116 | i117) << 1) - (i116 ^ i117);
                    p = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.ah.getId();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (i == this.ah.getId()) {
                        this.ak = "destroyed";
                        this.aF.setVisibility(0);
                        i5 = p + 121;
                        q = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i118 = 23 / 0;
                            return;
                        }
                        return;
                    }
                    if (i == this.aj.getId()) {
                        int i210 = q;
                        int i211 = i210 & 71;
                        int i212 = (i210 | 71) & (~i211);
                        int i213 = -(-(i211 << 1));
                        int i214 = (i212 & i213) + (i212 | i213);
                        p = i214 % 128;
                        int i215 = i214 % 2;
                        this.ak = "partial damage";
                        this.aF.setVisibility(0);
                        return;
                    }
                    if (i == this.ai.getId()) {
                        int i216 = q;
                        int i217 = i216 & 49;
                        int i218 = i216 | 49;
                        int i219 = ((i217 | i218) << 1) - (i217 ^ i218);
                        p = i219 % 128;
                        int i310 = i219 % 2;
                        this.ak = "no damage";
                        CardView cardView2 = this.aF;
                        int i311 = i216 + 106;
                        int i312 = (i311 ^ (-1)) + (i311 << 1);
                        p = i312 % 128;
                        int i313 = i312 % 2;
                        cardView2.setVisibility(8);
                        int i314 = q;
                        i4 = (i314 ^ 93) + ((i314 & 93) << 1);
                        p = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i315 = 32 / 0;
                            return;
                        }
                        return;
                    }
                }
            } else {
                if (i == this.ae.getId()) {
                    int i316 = q;
                    int i317 = ((i316 | 1) << 1) - (i316 ^ 1);
                    p = i317 % 128;
                    int i318 = i317 % 2;
                    this.cx.setVisibility(0);
                    this.bi = Boolean.TRUE;
                    int i319 = p;
                    int i46 = ((i319 & (-30)) | ((~i319) & 29)) + ((i319 & 29) << 1);
                    q = i46 % 128;
                    int i47 = i46 % 2;
                    Toast.makeText(this, "yes", 0).show();
                    int i48 = q + 21;
                    p = i48 % 128;
                    int i49 = i48 % 2;
                    return;
                }
                if (i == this.af.getId()) {
                    i6 = p + 89;
                    q = i6 % 128;
                    if (i6 % 2 == 0) {
                        this.cx.setVisibility(3);
                    } else {
                        this.cx.setVisibility(8);
                    }
                    this.bi = Boolean.FALSE;
                    Toast.makeText(this, "no", 0).show();
                    int i410 = p + 53;
                    q = i410 % 128;
                    int i411 = i410 % 2;
                }
            }
        }
        int i50 = q;
        int i51 = ((i50 & 28) + (i50 | 28)) - 1;
        p = i51 % 128;
        int i52 = i51 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b4 A[LOOP:9: B:48:0x01b0->B:50:0x01b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ed  */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = 1;
        int i4 = (((i2 | 84) << 1) - (i2 ^ 84)) - 1;
        q = i4 % 128;
        int i5 = i4 % 2;
        int id = view.getId();
        Object obj = null;
        int i6 = 0;
        if (id == R.id.btn_save) {
            if (this.aE.isChecked() && ivas.gov.bisp.enumeration.p091n.j.A(this.aP, "0")) {
                this.aP.setError("Please enter injured members");
                ScrollView scrollView = this.cr;
                EditText editText = this.aP;
                int i7 = p;
                int i8 = ((i7 ^ 123) | (i7 & 123)) << 1;
                int i9 = -(((~i7) & 123) | (i7 & (-124)));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                q = i10 % 128;
                if (i10 % 2 != 0) {
                    u(scrollView, editText);
                    return;
                } else {
                    u(scrollView, editText);
                    obj.hashCode();
                    throw null;
                }
            }
            if (this.aE.isChecked()) {
                int i11 = p;
                int i12 = ((i11 ^ 86) + ((i11 & 86) << 1)) - 1;
                q = i12 % 128;
                int i13 = i12 % 2;
                if (this.bo.getSelectedItemPosition() == 0 && this.cl.getSelectedItemPosition() == 0) {
                    Toast.makeText(this, "PLease fill data", 0).show();
                    u(this.cr, this.aP);
                    return;
                }
            }
            if (this.aG.isChecked() && ivas.gov.bisp.enumeration.p091n.j.A(this.aM, "0")) {
                this.aM.setError("Please enter injured members");
                u(this.cr, this.aM);
                int i14 = p;
                int i15 = ((i14 & (-72)) | ((~i14) & 71)) + ((i14 & 71) << 1);
                q = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 65 / 0;
                    return;
                }
                return;
            }
            if (this.aG.isChecked() && this.ar.getSelectedItemPosition() == 0 && this.aq.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "PLease fill data", 0).show();
                u(this.cr, this.aP);
                return;
            }
            if (this.aH.isChecked() && ivas.gov.bisp.enumeration.p091n.j.A(this.aR, "0")) {
                int i17 = p;
                int i18 = i17 & 19;
                int i19 = ((i17 ^ 19) | i18) << 1;
                int i20 = -((i17 | 19) & (~i18));
                int i21 = (i19 & i20) + (i20 | i19);
                q = i21 % 128;
                if (i21 % 2 == 0) {
                    this.aR.setError("Please enter disabled members");
                    throw null;
                }
                this.aR.setError("Please enter disabled members");
                u(this.cr, this.aR);
                return;
            }
            if (this.aH.isChecked() && this.as.getSelectedItemPosition() == 0 && this.ap.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "PLease fill data", 0).show();
                int i22 = p;
                int i23 = i22 & 79;
                int i24 = i23 + ((i22 ^ 79) | i23);
                q = i24 % 128;
                int i25 = i24 % 2;
                u(this.cr, this.aR);
                return;
            }
            if (this.aJ.isChecked() && !(!ivas.gov.bisp.enumeration.p091n.j.A(this.aS, "0"))) {
                this.aS.setError("Please enter Died members");
                ScrollView scrollView2 = this.cr;
                int i26 = p;
                int i27 = ((i26 ^ 19) - (~(-(-((i26 & 19) << 1))))) - 1;
                q = i27 % 128;
                int i28 = i27 % 2;
                u(scrollView2, this.aS);
                return;
            }
            if (this.aJ.isChecked() && this.au.getSelectedItemPosition() == 0 && this.at.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "PLease fill data", 0).show();
                int i29 = p;
                int i30 = i29 & 121;
                int i31 = (i30 - (~((i29 ^ 121) | i30))) - 1;
                q = i31 % 128;
                if (i31 % 2 != 0) {
                    u(this.cr, this.aS);
                    return;
                } else {
                    u(this.cr, this.aS);
                    throw null;
                }
            }
            if (this.aj.isChecked() && this.aB.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "PLease fill data", 0).show();
                u(this.cr, this.aB);
                int i32 = q + 41;
                p = i32 % 128;
                int i33 = i32 % 2;
                return;
            }
            this.ah.isChecked();
            if (this.aI.isChecked() && ivas.gov.bisp.enumeration.p091n.j.A(this.aT, "0")) {
                this.aT.setError("Please enter died animals");
                u(this.cr, this.aT);
                return;
            }
            if (!ivas.gov.bisp.enumeration.p091n.j.A(this.aT, "0") && this.aw.getSelectedItemPosition() == 0 && this.av.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "Please select number of animals", 0).show();
                u(this.cr, this.aT);
                int i34 = p + 71;
                q = i34 % 128;
                if (i34 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            if (this.aK.isChecked() && ivas.gov.bisp.enumeration.p091n.j.A(this.aV, "0")) {
                this.aV.setError("Please enter injured animals");
                u(this.cr, this.aV);
                return;
            }
            if (!ivas.gov.bisp.enumeration.p091n.j.A(this.aV, "0") && this.ax.getSelectedItemPosition() == 0 && this.aL.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "Please select number of animals", 0).show();
                u(this.cr, this.ax);
                return;
            }
            if (this.aN.isChecked() && ivas.gov.bisp.enumeration.p091n.j.A(this.aW, "0")) {
                this.aW.setError("Please enter land");
                u(this.cr, this.aW);
                return;
            }
            if (this.aN.isChecked() && this.aA.getSelectedItemPosition() == 0) {
                int i35 = q;
                int i36 = ((i35 | 89) << 1) - (((~i35) & 89) | (i35 & (-90)));
                p = i36 % 128;
                int i37 = i36 % 2;
                Toast.makeText(this, "Please select land unit", 0).show();
                u(this.cr, this.aA);
                return;
            }
            if (this.aN.isChecked() && (!ivas.gov.bisp.enumeration.p091n.j.A(this.aW, "0"))) {
                int i38 = q;
                int i39 = ((i38 | 67) << 1) - (i38 ^ 67);
                p = i39 % 128;
                if (i39 % 2 != 0) {
                    this.ay.getSelectedItemPosition();
                    obj.hashCode();
                    throw null;
                }
                if (this.ay.getSelectedItemPosition() == 0 && this.az.getSelectedItemPosition() == 0) {
                    Toast.makeText(this, "Please select damaged land area", 0).show();
                    u(this.cr, this.aW);
                    int i40 = p;
                    int i41 = i40 & 21;
                    int i42 = (i41 - (~((i40 ^ 21) | i41))) - 1;
                    q = i42 % 128;
                    int i43 = i42 % 2;
                    return;
                }
            }
            if (!(!this.bK)) {
                u(this.cr, this.aP);
                int i44 = p;
                int i45 = ((i44 | 78) << 1) - (i44 ^ 78);
                int i46 = (i45 ^ (-1)) + (i45 << 1);
                q = i46 % 128;
                if (i46 % 2 != 0) {
                    Toast.makeText(this, "Something is wrong", 0).show();
                    return;
                } else {
                    Toast.makeText(this, "Something is wrong", 0).show();
                    obj.hashCode();
                    throw null;
                }
            }
            if (this.bM) {
                int i47 = p;
                int i48 = i47 & 23;
                int i49 = ((i47 | 23) & (~i48)) + (i48 << 1);
                q = i49 % 128;
                if (i49 % 2 == 0) {
                    u(this.cr, this.aP);
                } else {
                    u(this.cr, this.aP);
                    i3 = 0;
                }
                Toast.makeText(this, "Something is wrong", i3).show();
                return;
            }
            if (this.bL) {
                u(this.cr, this.aR);
                Toast.makeText(this, "Something is wrong", 0).show();
                return;
            }
            if (!(!this.bN)) {
                u(this.cr, this.aS);
                Toast.makeText(this, "Something is wrong", 0).show();
                return;
            }
            if (this.bO) {
                u(this.cr, this.aT);
                Toast.makeText(this, "Something is wrong", 0).show();
                return;
            }
            if (this.bP) {
                u(this.cr, this.ax);
                int i50 = p;
                int i51 = i50 & 109;
                int i52 = i50 | 109;
                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                q = i53 % 128;
                int i54 = i53 % 2;
                Toast.makeText(this, "Something is wrong", 0).show();
                return;
            }
            if (this.bS) {
                u(this.cr, this.aA);
                Toast.makeText(this, "Something is wrong", 0).show();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            this.cj = jSONObject;
            try {
                jSONObject.put("hh_displayed", this.bi);
                this.cj.put("serious_injured_members", this.aX);
                this.cj.put("serious_injured_male_members", this.bk);
                this.cj.put("serious_injured_female_members", this.cq);
                this.cj.put("partial_injured_members", this.bm);
                this.cj.put("partial_injured_male_members", this.bn);
                this.cj.put("partial_injured_female_members", this.bp);
                this.cj.put("disable_members", this.bq);
                this.cj.put("disable_male_members", this.bt);
                this.cj.put("disable_female_members", this.bu);
                this.cj.put("died_members", this.bv);
                this.cj.put("died_male_members", this.br);
                this.cj.put("died_female_members", this.bx);
                this.cj.put("house_damage", this.ak);
                this.cj.put("house_ground_story_damage", this.by);
                this.cj.put("house_first_second_story_damage", this.bA);
                this.cj.put("house_third_story_damage", this.bB);
                this.cj.put("died_animal", this.bC);
                this.cj.put("died_small_animal", this.bE);
                this.cj.put("died_large_animal", this.bD);
                this.cj.put("injured_animal", this.bF);
                this.cj.put("injured_small_animal", this.bG);
                this.cj.put("injured_large_animal", this.cy);
                this.cj.put("land_unit", this.bR);
                this.cj.put("total_land", this.bI);
                this.cj.put("cultivated_land", this.bH);
                this.cj.put("damaged_land", this.bJ);
                this.cj.put("food_crops_unit", this.bT);
                JSONObject jSONObject2 = this.cj;
                int i55 = q;
                int i56 = ((((i55 ^ 49) | (i55 & 49)) << 1) - (~(-(((~i55) & 49) | (i55 & (-50)))))) - 1;
                p = i56 % 128;
                int i57 = i56 % 2;
                jSONObject2.put("food_crops", 0);
                this.cj.put("cash_crops_unit", this.bU);
                this.cj.put("cash_crops", 0);
                this.cj.put("damaged_cash_crops_unit", this.bW);
                this.cj.put("damaged_cash_crops", 0);
                this.cj.put("damaged_food_crops_unit", this.bQ);
                this.cj.put("damaged_food_crops", 0);
                ivas.gov.bisp.enumeration.de.j.bJI bji = (ivas.gov.bisp.enumeration.de.j.bJI) ((ivas.gov.bisp.enumeration.de.j) this.al.h(this)).edit();
                bji.putString("shock_json", this.cj.toString());
                bji.apply();
                w();
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        int i58 = q;
        int i59 = i58 ^ 113;
        int i60 = ((i58 & 113) | i59) << 1;
        int i61 = -i59;
        int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
        p = i62 % 128;
        if (i62 % 2 != 0) {
            throw null;
        }
        switch (id) {
            case R.id.iv_add_animals_died /* 2131362298 */:
                this.bC = ivas.gov.bisp.enumeration.p091n.j.g(this.aT) + 1;
                ArrayList<String> arrayList = new ArrayList<>();
                int i63 = q;
                int i64 = (i63 ^ 41) + ((i63 & 41) << 1);
                int i65 = i64 % 128;
                p = i65;
                int i66 = i64 % 2;
                this.cb = arrayList;
                if (this.bC > 0) {
                    int i67 = (i65 & 19) + (i65 | 19);
                    q = i67 % 128;
                    int i68 = i67 % 2 == 0 ? 1 : 0;
                    while (i68 <= this.bC) {
                        ArrayList<String> arrayList2 = this.cb;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i68);
                        arrayList2.add(sb.toString());
                        int i69 = (i68 ^ 2) + ((i68 & 2) << 1);
                        i68 = (i69 ^ (-1)) + (i69 << 1);
                    }
                    z(this.cb, this.aw);
                    z(this.cb, this.av);
                }
                this.ct.setVisibility(0);
                this.aT.setText(String.valueOf(this.bC));
                return;
            case R.id.iv_add_animals_injured /* 2131362299 */:
                int iG = ivas.gov.bisp.enumeration.p091n.j.g(this.aV);
                int i70 = iG & 1;
                int i71 = iG | 1;
                this.bF = (i70 & i71) + (i71 | i70);
                ArrayList<String> arrayList3 = new ArrayList<>();
                int i72 = q + 83;
                p = i72 % 128;
                if (i72 % 2 != 0) {
                    this.am = arrayList3;
                    throw null;
                }
                this.am = arrayList3;
                if (this.bF > 0) {
                    for (int i73 = 0; i73 <= this.bF; i73++) {
                        ArrayList<String> arrayList4 = this.am;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i73);
                        arrayList4.add(sb2.toString());
                    }
                    z(this.am, this.ax);
                    ArrayList<String> arrayList5 = this.am;
                    int i74 = q;
                    int i75 = i74 & 121;
                    int i76 = -(-((i74 ^ 121) | i75));
                    int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                    p = i77 % 128;
                    if (i77 % 2 != 0) {
                        z(arrayList5, this.aL);
                        int i78 = 83 / 0;
                    } else {
                        z(arrayList5, this.aL);
                    }
                }
                this.co.setVisibility(0);
                this.aV.setText(String.valueOf(this.bF));
                return;
            case R.id.iv_add_died_member /* 2131362300 */:
                int iG2 = ivas.gov.bisp.enumeration.p091n.j.g(this.aS);
                int i79 = iG2 & 1;
                int i80 = -(-((iG2 ^ 1) | i79));
                this.bv = (i79 ^ i80) + ((i80 & i79) << 1);
                ArrayList<String> arrayList6 = new ArrayList<>();
                int i81 = p;
                int i82 = i81 & 47;
                int i83 = (~i82) & (i81 | 47);
                int i84 = i82 << 1;
                int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                q = i85 % 128;
                int i86 = i85 % 2;
                this.ca = arrayList6;
                if (this.bv > 0) {
                    int i87 = i81 ^ 61;
                    int i88 = (((i81 & 61) | i87) << 1) - i87;
                    q = i88 % 128;
                    int i89 = i88 % 2;
                    int i90 = 0;
                    while (i90 <= this.bv) {
                        ArrayList<String> arrayList7 = this.ca;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i90);
                        arrayList7.add(sb3.toString());
                        int i91 = q + 3;
                        p = i91 % 128;
                        int i92 = i91 % 2;
                        int i93 = (((i90 ^ 48) | (i90 & 48)) << 1) - (((~i90) & 48) | (i90 & (-49)));
                        int i94 = i93 & (-47);
                        int i95 = (i93 | (-47)) & (~i94);
                        int i96 = -(-(i94 << 1));
                        i90 = ((i95 | i96) << 1) - (i96 ^ i95);
                    }
                    z(this.ca, this.au);
                    z(this.ca, this.at);
                }
                this.ch.setVisibility(0);
                this.aS.setText(String.valueOf(this.bv));
                return;
            case R.id.iv_add_disable_mem /* 2131362301 */:
                this.bq = ivas.gov.bisp.enumeration.p091n.j.g(this.aR) + 1;
                this.bY = new ArrayList<>();
                if (this.bq > 0) {
                    int i97 = p + 83;
                    q = i97 % 128;
                    int i98 = i97 % 2;
                    int i99 = 0;
                    while (i99 <= this.bq) {
                        ArrayList<String> arrayList8 = this.bY;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i99);
                        arrayList8.add(sb4.toString());
                        int i100 = q;
                        int i101 = i100 ^ 87;
                        int i102 = ((i100 & 87) | i101) << 1;
                        int i103 = -i101;
                        int i104 = (i102 & i103) + (i102 | i103);
                        p = i104 % 128;
                        int i105 = i104 % 2;
                        int i106 = i99 & (-23);
                        int i107 = ((((i99 ^ (-23)) | i106) << 1) - (~(-((i99 | (-23)) & (~i106))))) - 1;
                        i99 = ((i107 ^ 25) + ((i107 & 25) << 1)) - 1;
                    }
                    z(this.bY, this.as);
                    ArrayList<String> arrayList9 = this.bY;
                    int i108 = p;
                    int i109 = ((i108 | 113) << 1) - (i108 ^ 113);
                    q = i109 % 128;
                    int i110 = i109 % 2;
                    z(arrayList9, this.ap);
                }
                this.cv.setVisibility(0);
                this.aR.setText(String.valueOf(this.bq));
                return;
            case R.id.iv_add_land /* 2131362302 */:
                this.bI = (-2) - ((ivas.gov.bisp.enumeration.p091n.j.g(this.aW) + 2) ^ (-1));
                this.cc = new ArrayList<>();
                this.cm = new ArrayList<>();
                int i111 = q + 7;
                p = i111 % 128;
                if (i111 % 2 != 0) {
                    int i112 = 81 / 0;
                    if (this.bI > 0) {
                        this.cn.setVisibility(0);
                        while (i6 <= this.bI) {
                            ArrayList<String> arrayList10 = this.cc;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(i6);
                            arrayList10.add(sb5.toString());
                            ArrayList<String> arrayList11 = this.cm;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(i6);
                            arrayList11.add(sb6.toString());
                            i6 = (i6 ^ 1) + ((i6 & 1) << 1);
                        }
                        z(this.cc, this.ay);
                        z(this.cm, this.az);
                    } else {
                        this.cn.setVisibility(8);
                    }
                } else if (this.bI > 0) {
                    this.cn.setVisibility(0);
                    while (i6 <= this.bI) {
                        ArrayList<String> arrayList12 = this.cc;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(i6);
                        arrayList12.add(sb7.toString());
                        ArrayList<String> arrayList13 = this.cm;
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(i6);
                        arrayList13.add(sb8.toString());
                        i6 = (i6 ^ 1) + ((i6 & 1) << 1);
                    }
                    z(this.cc, this.ay);
                    z(this.cm, this.az);
                } else {
                    this.cn.setVisibility(8);
                }
                this.aW.setText(String.valueOf(this.bI));
                return;
            case R.id.iv_add_m_injured_member /* 2131362303 */:
                this.bm = ivas.gov.bisp.enumeration.p091n.j.g(this.aM) + 1;
                this.bZ = new ArrayList<>();
                if (this.bm > 0) {
                    int i113 = q;
                    int i114 = i113 ^ 87;
                    int i115 = (((i113 & 87) | i114) << 1) - i114;
                    p = i115 % 128;
                    int i116 = i115 % 2 != 0 ? 1 : 0;
                    while (i116 <= this.bm) {
                        ArrayList<String> arrayList14 = this.bZ;
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(i116);
                        arrayList14.add(sb9.toString());
                        int i117 = q;
                        int i118 = ((i117 & (-44)) | ((~i117) & 43)) + ((i117 & 43) << 1);
                        p = i118 % 128;
                        i116 = i118 % 2 != 0 ? ((i116 ^ 68) + ((i116 & 68) << 1)) - 1 : ((i116 & 2) + (i116 | 2)) - 1;
                    }
                    z(this.bZ, this.aq);
                    int i119 = p;
                    int i120 = (i119 ^ 23) + ((i119 & 23) << 1);
                    q = i120 % 128;
                    int i121 = i120 % 2;
                    z(this.bZ, this.ar);
                }
                this.cg.setVisibility(0);
                this.aM.setText(String.valueOf(this.bm));
                return;
            case R.id.iv_add_member /* 2131362304 */:
                this.aX = ivas.gov.bisp.enumeration.p091n.j.g(this.aP) + 1;
                this.bX = new ArrayList<>();
                if (this.aX > 0) {
                    int i122 = 0;
                    while (i122 <= this.aX) {
                        ArrayList<String> arrayList15 = this.bX;
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(i122);
                        String string = sb10.toString();
                        int i123 = p;
                        int i124 = i123 & 57;
                        int i125 = i123 | 57;
                        int i126 = ((i124 | i125) << 1) - (i125 ^ i124);
                        q = i126 % 128;
                        if (i126 % 2 == 0) {
                            arrayList15.add(string);
                            int i127 = (i122 | 54) << 1;
                            int i128 = -(i122 ^ 54);
                            i122 = (i127 & i128) + (i128 | i127) + 34;
                        } else {
                            arrayList15.add(string);
                            int i129 = i122 & (-43);
                            int i130 = (i122 ^ (-43)) | i129;
                            int i131 = (i129 ^ i130) + ((i130 & i129) << 1);
                            int i132 = i131 & 44;
                            int i133 = ((i131 ^ 44) | i132) << 1;
                            int i134 = -((~i132) & (i131 | 44));
                            i122 = (i133 | i134) + (i133 & i134);
                        }
                    }
                    z(this.bX, this.cl);
                    z(this.bX, this.bo);
                }
                this.ce.setVisibility(0);
                EditText editText2 = this.aP;
                int i135 = this.aX;
                int i136 = q;
                int i137 = (i136 & 53) + (i136 | 53);
                p = i137 % 128;
                int i138 = i137 % 2;
                editText2.setText(String.valueOf(i135));
                this.aP.setError(null);
                int i139 = p;
                int i140 = i139 ^ 71;
                int i141 = ((i139 & 71) | i140) << 1;
                int i142 = -i140;
                int i143 = (i141 & i142) + (i141 | i142);
                q = i143 % 128;
                if (i143 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            default:
                switch (id) {
                    case R.id.iv_delete_animals_died /* 2131362308 */:
                        this.bC = ivas.gov.bisp.enumeration.p091n.j.g(this.aT);
                        if (ivas.gov.bisp.enumeration.p091n.j.g(this.aT) > 0) {
                            int i144 = p;
                            int i145 = ((i144 | 65) << 1) - (i144 ^ 65);
                            q = i145 % 128;
                            this.bC = i145 % 2 == 0 ? this.bC >>> 1 : (-2) - (this.bC ^ (-1));
                            this.cb = new ArrayList<>();
                            if (this.bC > 0) {
                                int i146 = 0;
                                while (i146 <= this.bC) {
                                    ArrayList<String> arrayList16 = this.cb;
                                    StringBuilder sb11 = new StringBuilder();
                                    sb11.append(i146);
                                    arrayList16.add(sb11.toString());
                                    int i147 = i146 ^ 98;
                                    int i148 = ((i146 & 98) | i147) << 1;
                                    int i149 = -i147;
                                    int i150 = ((i148 | i149) << 1) - (i148 ^ i149);
                                    int i151 = i150 & (-97);
                                    i146 = (i151 - (~((i150 ^ (-97)) | i151))) - 1;
                                }
                                z(this.cb, this.aw);
                                int i152 = q;
                                int i153 = (i152 & 59) + (i152 | 59);
                                p = i153 % 128;
                                int i154 = i153 % 2;
                                z(this.cb, this.av);
                                this.ct.setVisibility(0);
                            } else {
                                this.ct.setVisibility(8);
                                int i155 = q;
                                int i156 = i155 & 5;
                                int i157 = i156 + ((i155 ^ 5) | i156);
                                p = i157 % 128;
                                int i158 = i157 % 2;
                            }
                            this.aT.setText(String.valueOf(this.bC));
                            return;
                        }
                        return;
                    case R.id.iv_delete_animals_injured /* 2131362309 */:
                        this.bF = ivas.gov.bisp.enumeration.p091n.j.g(this.aV);
                        if (ivas.gov.bisp.enumeration.p091n.j.g(this.aV) > 0) {
                            int i159 = this.bF;
                            this.bF = (~i159) + (i159 << 1);
                            this.am = new ArrayList<>();
                            if (this.bF > 0) {
                                int i160 = 0;
                                while (i160 <= this.bF) {
                                    ArrayList<String> arrayList17 = this.am;
                                    StringBuilder sb12 = new StringBuilder();
                                    sb12.append(i160);
                                    arrayList17.add(sb12.toString());
                                    int i161 = q;
                                    int i162 = (i161 & 102) + (i161 | 102);
                                    int i163 = (i162 ^ (-1)) + (i162 << 1);
                                    p = i163 % 128;
                                    if (i163 % 2 != 0) {
                                        int i164 = i160 & 58;
                                        i160 = (-2) - (((((i160 | 58) & (~i164)) - (~(i164 << 1))) + 44) ^ (-1));
                                    } else {
                                        int i165 = i160 & (-26);
                                        int i166 = -(-(i160 | (-26)));
                                        int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                                        int i168 = i167 & 27;
                                        int i169 = ((i167 ^ 27) | i168) << 1;
                                        int i170 = -((~i168) & (i167 | 27));
                                        i160 = ((i169 & i170) << 1) + (i169 ^ i170);
                                    }
                                }
                                z(this.am, this.ax);
                                int i171 = q;
                                int i172 = (i171 ^ 115) + ((i171 & 115) << 1);
                                p = i172 % 128;
                                if (i172 % 2 != 0) {
                                    z(this.am, this.aL);
                                    obj.hashCode();
                                    throw null;
                                }
                                z(this.am, this.aL);
                                this.co.setVisibility(0);
                            } else {
                                this.co.setVisibility(8);
                            }
                            this.aV.setText(String.valueOf(this.bF));
                            return;
                        }
                        return;
                    case R.id.iv_delete_died_member /* 2131362310 */:
                        this.bv = ivas.gov.bisp.enumeration.p091n.j.g(this.aS);
                        if (ivas.gov.bisp.enumeration.p091n.j.g(this.aS) > 0) {
                            int i173 = q + 75;
                            p = i173 % 128;
                            if (i173 % 2 != 0) {
                                this.bv = (-2) - (this.bv ^ (-1));
                            } else {
                                int i174 = this.bv;
                                int i175 = -(-((i174 ^ (-1)) | i174));
                                this.bv = (i174 ^ i175) + ((i174 & i175) << 1);
                            }
                            this.ca = new ArrayList<>();
                            if (this.bv > 0) {
                                int i176 = 0;
                                while (i176 <= this.bv) {
                                    ArrayList<String> arrayList18 = this.ca;
                                    StringBuilder sb13 = new StringBuilder();
                                    sb13.append(i176);
                                    arrayList18.add(sb13.toString());
                                    int i177 = (i176 & (-99)) + (i176 | (-99));
                                    i176 = (i177 ^ 100) + ((i177 & 100) << 1);
                                }
                                z(this.ca, this.au);
                                z(this.ca, this.at);
                                this.ch.setVisibility(0);
                            } else {
                                this.ch.setVisibility(8);
                            }
                            this.aS.setText(String.valueOf(this.bv));
                            return;
                        }
                        return;
                    case R.id.iv_delete_disable_mem /* 2131362311 */:
                        this.bq = ivas.gov.bisp.enumeration.p091n.j.g(this.aR);
                        int i178 = q;
                        int i179 = (-2) - (((i178 & 32) + (i178 | 32)) ^ (-1));
                        p = i179 % 128;
                        int i180 = i179 % 2;
                        if (ivas.gov.bisp.enumeration.p091n.j.g(this.aR) > 0) {
                            this.bq--;
                            this.bY = new ArrayList<>();
                            if (this.bq > 0) {
                                int i181 = q;
                                int i182 = (i181 & 3) + (i181 | 3);
                                p = i182 % 128;
                                int i183 = i182 % 2 != 0 ? 1 : 0;
                                while (i183 <= this.bq) {
                                    ArrayList<String> arrayList19 = this.bY;
                                    StringBuilder sb14 = new StringBuilder();
                                    int i184 = (-2) - ((p + 74) ^ (-1));
                                    q = i184 % 128;
                                    if (i184 % 2 == 0) {
                                        sb14.append(i183);
                                        arrayList19.add(sb14.toString());
                                        int i185 = ((i183 ^ 100) | (i183 & 100)) << 1;
                                        int i186 = -(((~i183) & 100) | (i183 & (-101)));
                                        i183 = ((i186 & i185) << 1) + (i185 ^ i186);
                                    } else {
                                        sb14.append(i183);
                                        arrayList19.add(sb14.toString());
                                        i183++;
                                    }
                                }
                                z(this.bY, this.as);
                                z(this.bY, this.ap);
                                int i187 = q;
                                int i188 = i187 & 95;
                                int i189 = ((i187 ^ 95) | i188) << 1;
                                int i190 = -((i187 | 95) & (~i188));
                                int i191 = (i189 & i190) + (i190 | i189);
                                p = i191 % 128;
                                int i192 = i191 % 2;
                                this.cv.setVisibility(0);
                            } else {
                                this.cv.setVisibility(8);
                            }
                            this.aR.setText(String.valueOf(this.bq));
                            return;
                        }
                        return;
                    case R.id.iv_delete_land /* 2131362312 */:
                        this.bI = ivas.gov.bisp.enumeration.p091n.j.g(this.aW);
                        if (ivas.gov.bisp.enumeration.p091n.j.g(this.aW) > 0) {
                            this.bI = (-2) - (this.bI ^ (-1));
                            this.cc = new ArrayList<>();
                            this.cm = new ArrayList<>();
                            if (this.bI > 0) {
                                this.cn.setVisibility(0);
                                while (i6 <= this.bI) {
                                    ArrayList<String> arrayList20 = this.cc;
                                    StringBuilder sb15 = new StringBuilder();
                                    sb15.append(i6);
                                    arrayList20.add(sb15.toString());
                                    ArrayList<String> arrayList21 = this.cm;
                                    StringBuilder sb16 = new StringBuilder();
                                    sb16.append(i6);
                                    arrayList21.add(sb16.toString());
                                    int i193 = i6 & 1;
                                    i6 = (((~i193) & (i6 | 1)) - (~(i193 << 1))) - 1;
                                }
                                z(this.cc, this.ay);
                                z(this.cm, this.az);
                            } else {
                                this.cn.setVisibility(8);
                            }
                            this.aW.setText(String.valueOf(this.bI));
                            return;
                        }
                        return;
                    case R.id.iv_delete_m_injured_member /* 2131362313 */:
                        this.bm = ivas.gov.bisp.enumeration.p091n.j.g(this.aM);
                        if (ivas.gov.bisp.enumeration.p091n.j.g(this.aM) > 0) {
                            int i194 = p;
                            int i195 = ((i194 | 35) << 1) - (i194 ^ 35);
                            q = i195 % 128;
                            int i196 = i195 % 2;
                            int i197 = this.bm;
                            int i198 = -(-((i197 ^ (-1)) | i197));
                            this.bm = (i197 ^ i198) + ((i197 & i198) << 1);
                            this.bZ = new ArrayList<>();
                            if (this.bm > 0) {
                                for (int i199 = 0; i199 <= this.bm; i199 = (((i199 | 2) << 1) - (i199 ^ 2)) - 1) {
                                    ArrayList<String> arrayList22 = this.bZ;
                                    StringBuilder sb17 = new StringBuilder();
                                    sb17.append(i199);
                                    arrayList22.add(sb17.toString());
                                }
                                z(this.bZ, this.aq);
                                z(this.bZ, this.ar);
                                this.cg.setVisibility(0);
                            } else {
                                this.cg.setVisibility(8);
                            }
                            this.aM.setText(String.valueOf(this.bm));
                            return;
                        }
                        return;
                    case R.id.iv_delete_member /* 2131362314 */:
                        this.aX = ivas.gov.bisp.enumeration.p091n.j.g(this.aP);
                        if (ivas.gov.bisp.enumeration.p091n.j.g(this.aP) > 0) {
                            this.aX = (-2) - (this.aX ^ (-1));
                            this.bX = new ArrayList<>();
                            if (this.aX > 0) {
                                int i200 = q;
                                int i201 = i200 & 19;
                                int i202 = ((i200 ^ 19) | i201) << 1;
                                int i203 = -((i200 | 19) & (~i201));
                                int i204 = (i202 & i203) + (i203 | i202);
                                p = i204 % 128;
                                int i205 = i204 % 2;
                                int i206 = 0;
                                while (i206 <= this.aX) {
                                    ArrayList<String> arrayList23 = this.bX;
                                    StringBuilder sb18 = new StringBuilder();
                                    sb18.append(i206);
                                    int i207 = p;
                                    int i208 = i207 & 45;
                                    int i209 = ((((i207 ^ 45) | i208) << 1) - (~(-((i207 | 45) & (~i208))))) - 1;
                                    q = i209 % 128;
                                    if (i209 % 2 == 0) {
                                        arrayList23.add(sb18.toString());
                                        int i210 = i206 & 106;
                                        i206 = (i210 - (~(-(-((i206 ^ 106) | i210))))) - 1;
                                    } else {
                                        arrayList23.add(sb18.toString());
                                        int i211 = i206 & 1;
                                        int i212 = i206 | 1;
                                        i206 = ((i212 & i211) << 1) + (i211 ^ i212);
                                    }
                                }
                                z(this.bX, this.cl);
                                z(this.bX, this.bo);
                                this.ce.setVisibility(0);
                            } else {
                                this.ce.setVisibility(8);
                            }
                            this.aP.setText(String.valueOf(this.aX));
                            EditText editText3 = this.aP;
                            int i213 = p;
                            int i214 = i213 & 17;
                            int i215 = (i213 | 17) & (~i214);
                            int i216 = i214 << 1;
                            int i217 = ((i215 | i216) << 1) - (i215 ^ i216);
                            q = i217 % 128;
                            if (i217 % 2 == 0) {
                                editText3.setError(null);
                                obj.hashCode();
                                throw null;
                            }
                            editText3.setError(null);
                            int i218 = q;
                            int i219 = ((i218 & (-10)) | ((~i218) & 9)) + ((i218 & 9) << 1);
                            p = i219 % 128;
                            if (i219 % 2 == 0) {
                                return;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.al = new SessionManager(this);
        this.cr = (ScrollView) findViewById(R.id.sv_main);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.aF = (CardView) findViewById(R.id.cv_liveable_rooms);
        this.ad = (RadioGroup) findViewById(R.id.rg_hh_displaced);
        this.ae = (RadioButton) findViewById(R.id.rb_hh_displaced_yes);
        this.af = (RadioButton) findViewById(R.id.rb_hh_displaced_no);
        this.ag = (RadioGroup) findViewById(R.id.rg_house);
        this.ah = (RadioButton) findViewById(R.id.rb_destroyed);
        this.aj = (RadioButton) findViewById(R.id.rb_partial_damage_yes);
        this.ai = (RadioButton) findViewById(R.id.rb_no_damage);
        RadioGroup radioGroup = this.ag;
        int i2 = p;
        int i3 = i2 & 45;
        int i4 = i2 | 45;
        int i5 = (i3 & i4) + (i4 | i3);
        q = i5 % 128;
        int i6 = i5 % 2;
        radioGroup.setOnCheckedChangeListener(this);
        this.cx = (LinearLayout) findViewById(R.id.questions);
        this.cd = (LinearLayout) findViewById(R.id.ll_s_injured_members);
        this.ce = (LinearLayout) findViewById(R.id.ll_s_inj_member);
        this.cf = (LinearLayout) findViewById(R.id.ll_m_injured_members);
        this.cg = (LinearLayout) findViewById(R.id.ll_m_inj_member);
        this.ck = (LinearLayout) findViewById(R.id.ll_main_disable);
        this.cv = (LinearLayout) findViewById(R.id.ll_disable_mem);
        this.ci = (LinearLayout) findViewById(R.id.ll_main_died);
        this.ch = (LinearLayout) findViewById(R.id.ll_died_member);
        this.cs = (LinearLayout) findViewById(R.id.ll_main_animal_died);
        this.ct = (LinearLayout) findViewById(R.id.ll_animals_died);
        int i7 = p;
        int i8 = (i7 ^ 89) + ((i7 & 89) << 1);
        q = i8 % 128;
        int i9 = i8 % 2;
        this.cu = (LinearLayout) findViewById(R.id.ll_main_animal_inj);
        this.co = (LinearLayout) findViewById(R.id.ll_animals_injured);
        this.cp = (LinearLayout) findViewById(R.id.ll_main_land_inq);
        this.cn = (LinearLayout) findViewById(R.id.ll_land_inq);
        this.cw = (LinearLayout) findViewById(R.id.ll_main_crop_inq);
        this.aP = (EditText) findViewById(R.id.number_injured_members);
        this.aM = (EditText) findViewById(R.id.et_m_injured_members);
        this.aR = (EditText) findViewById(R.id.et_disable_members);
        this.aS = (EditText) findViewById(R.id.et_died_mem);
        this.aT = (EditText) findViewById(R.id.et_animals_died);
        this.aV = (EditText) findViewById(R.id.et_animals_injured);
        this.aW = (EditText) findViewById(R.id.number_of_land);
        int i10 = p;
        int i11 = ((i10 & 96) + (i10 | 96)) - 1;
        q = i11 % 128;
        int i12 = i11 % 2;
        this.an = (ImageView) findViewById(R.id.iv_add_member);
        this.bw = (ImageView) findViewById(R.id.iv_add_m_injured_member);
        this.ba = (ImageView) findViewById(R.id.iv_delete_member);
        this.bf = (ImageView) findViewById(R.id.iv_delete_m_injured_member);
        this.bz = (ImageView) findViewById(R.id.iv_add_disable_mem);
        this.bc = (ImageView) findViewById(R.id.iv_delete_disable_mem);
        this.bs = (ImageView) findViewById(R.id.iv_add_died_member);
        this.aZ = (ImageView) findViewById(R.id.iv_delete_died_member);
        this.bb = (ImageView) findViewById(R.id.iv_add_animals_died);
        this.aY = (ImageView) findViewById(R.id.iv_delete_animals_died);
        this.be = (ImageView) findViewById(R.id.iv_add_animals_injured);
        View viewFindViewById = findViewById(R.id.iv_delete_animals_injured);
        int i13 = q;
        int i14 = i13 & 25;
        int i15 = (i14 - (~(-(-((i13 ^ 25) | i14))))) - 1;
        p = i15 % 128;
        int i16 = i15 % 2;
        this.bl = (ImageView) viewFindViewById;
        this.bd = (ImageView) findViewById(R.id.iv_add_land);
        this.bg = (ImageView) findViewById(R.id.iv_delete_land);
        this.cl = (Spinner) findViewById(R.id.sp_injured_female_unit);
        this.bo = (Spinner) findViewById(R.id.sp_injured_male_unit);
        this.aq = (Spinner) findViewById(R.id.sp_m_injured_f);
        this.ar = (Spinner) findViewById(R.id.sp_m_injured_male);
        this.aB = (Spinner) findViewById(R.id.sp_gf_rooms_unit);
        this.aD = (Spinner) findViewById(R.id.sp_ff_rooms_unit);
        this.bj = (Spinner) findViewById(R.id.sp_tf_rooms_unit);
        this.aA = (Spinner) findViewById(R.id.sp_land_unit);
        this.as = (Spinner) findViewById(R.id.sp_disable_m);
        int i17 = p;
        int i18 = (i17 | 87) << 1;
        int i19 = -(((~i17) & 87) | (i17 & (-88)));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        q = i20 % 128;
        int i21 = i20 % 2;
        this.ap = (Spinner) findViewById(R.id.sp_disable_f);
        this.au = (Spinner) findViewById(R.id.sp_died_m);
        this.at = (Spinner) findViewById(R.id.sp_died_f);
        this.av = (Spinner) findViewById(R.id.sp_animals_died_l);
        this.aw = (Spinner) findViewById(R.id.sp_animals_died_s);
        this.ax = (Spinner) findViewById(R.id.sp_animals_inj_s);
        this.aL = (Spinner) findViewById(R.id.sp_animals_inj_l);
        this.ay = (Spinner) findViewById(R.id.sp_land_cultivated);
        this.az = (Spinner) findViewById(R.id.sp_land_damage);
        this.ao = (Spinner) findViewById(R.id.sp_food_crops_unit);
        this.aC = (Spinner) findViewById(R.id.sp_cash_crops_unit);
        View viewFindViewById2 = findViewById(R.id.sp_damage_food_crops_unit);
        int i22 = q;
        int i23 = i22 & 119;
        int i24 = (i22 | 119) & (~i23);
        int i25 = -(-(i23 << 1));
        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
        p = i26 % 128;
        int i27 = i26 % 2;
        this.aU = (Spinner) viewFindViewById2;
        this.aQ = (Spinner) findViewById(R.id.sp_damage_cash_crops_unit);
        this.aE = (CheckBox) findViewById(R.id.check_injured_mem);
        this.aG = (CheckBox) findViewById(R.id.check_m_injured_mem);
        this.aH = (CheckBox) findViewById(R.id.check_disable_mem);
        this.aJ = (CheckBox) findViewById(R.id.check_died_mem);
        this.aI = (CheckBox) findViewById(R.id.check_animals_died);
        this.aK = (CheckBox) findViewById(R.id.check_animals_inj);
        this.aN = (CheckBox) findViewById(R.id.check_land_inq);
        this.aO = (CheckBox) findViewById(R.id.check_crop_inq);
        this.bh = (Button) findViewById(R.id.btn_save);
        this.af.setChecked(true);
        this.cx.setVisibility(8);
        this.cd.setVisibility(8);
        this.cf.setVisibility(8);
        this.ce.setVisibility(8);
        this.cg.setVisibility(8);
        this.ck.setVisibility(8);
        this.cv.setVisibility(8);
        this.ci.setVisibility(8);
        this.ch.setVisibility(8);
        this.cs.setVisibility(8);
        this.cu.setVisibility(8);
        this.co.setVisibility(8);
        this.cp.setVisibility(8);
        this.cn.setVisibility(8);
        this.cw.setVisibility(8);
        this.aF.setVisibility(8);
        this.bV = new ArrayList<>();
        int i28 = q;
        int i29 = (((i28 ^ 61) | (i28 & 61)) << 1) - (((~i28) & 61) | (i28 & (-62)));
        p = i29 % 128;
        int i30 = i29 % 2;
        int i31 = 0;
        while (i31 <= 6) {
            int i32 = p;
            int i33 = (((i32 | 54) << 1) - (i32 ^ 54)) - 1;
            q = i33 % 128;
            int i34 = i33 % 2;
            ArrayList<String> arrayList = this.bV;
            if (i34 == 0) {
                arrayList.add(String.valueOf(i31));
                int i35 = ((i31 ^ 13) | (i31 & 13)) << 1;
                int i36 = -(((~i31) & 13) | (i31 & (-14)));
                i31 = (i35 & i36) + (i36 | i35);
            } else {
                arrayList.add(String.valueOf(i31));
                int i37 = i31 & (-61);
                int i38 = (i37 - (~((i31 ^ (-61)) | i37))) - 1;
                int i39 = (i38 & 63) + (i38 | 63);
                i31 = (i39 ^ (-1)) + (i39 << 1);
            }
            int i40 = q + 13;
            p = i40 % 128;
            if (i40 % 2 != 0) {
                int i41 = 3 / 3;
            }
        }
        z(this.bV, this.aB);
        z(this.bV, this.aD);
        z(this.bV, this.bj);
        new au(this, "unit_of_land", getResources().getString(R.string.unit), this.aA, new C0162ao(this)).execute(new Void[0]);
        new au(this, "unit_of_land", getResources().getString(R.string.unit), this.ao, new C0178g(this)).execute(new Void[0]);
        new au(this, "unit_of_land", getResources().getString(R.string.unit), this.aC, new C0169av(this)).execute(new Void[0]);
        new au(this, "unit_of_land", getResources().getString(R.string.unit), this.aU, new C0167at(this)).execute(new Void[0]);
        au auVar = new au(this, "unit_of_land", getResources().getString(R.string.unit), this.aQ, new C0172ay(this));
        int i42 = q;
        int i43 = i42 & 11;
        int i44 = (i42 | 11) & (~i43);
        int i45 = -(-(i43 << 1));
        int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
        p = i46 % 128;
        int i47 = i46 % 2;
        auVar.execute(new Void[0]);
        this.ad.setOnCheckedChangeListener(this);
        this.an.setOnClickListener(this);
        this.ba.setOnClickListener(this);
        this.bw.setOnClickListener(this);
        this.bf.setOnClickListener(this);
        this.bz.setOnClickListener(this);
        ImageView imageView = this.bc;
        int i48 = q;
        int i49 = i48 & 35;
        int i50 = -(-((i48 ^ 35) | i49));
        int i51 = (i49 & i50) + (i50 | i49);
        p = i51 % 128;
        int i52 = i51 % 2;
        imageView.setOnClickListener(this);
        this.bs.setOnClickListener(this);
        this.aZ.setOnClickListener(this);
        this.bb.setOnClickListener(this);
        this.aY.setOnClickListener(this);
        this.be.setOnClickListener(this);
        this.bl.setOnClickListener(this);
        this.bd.setOnClickListener(this);
        this.bg.setOnClickListener(this);
        this.bh.setOnClickListener(this);
        this.aO.setOnCheckedChangeListener(new C0170aw(this));
        this.aN.setOnCheckedChangeListener(new C0171ax(this));
        this.aK.setOnCheckedChangeListener(new az(this));
        this.aI.setOnCheckedChangeListener(new aA(this));
        this.aJ.setOnCheckedChangeListener(new C0165ar(this));
        this.aH.setOnCheckedChangeListener(new C0166as(this));
        this.aG.setOnCheckedChangeListener(new C0164aq(this));
        this.aE.setOnCheckedChangeListener(new C0168au(this));
        int i53 = q;
        int i54 = ((i53 ^ 14) + ((i53 & 14) << 1)) - 1;
        p = i54 % 128;
        int i55 = i54 % 2;
    }

    public class OooO00o implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Spinner c;

        public OooO00o(Spinner spinner) {
            this.c = spinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 39) + (i2 | 39);
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0110, code lost:
        
            if (r12 != (r13 % r11.bp)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x011c, code lost:
        
            if (r12 != ((r13 ^ r0) + ((r13 & r0) << 1))) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x011e, code lost:
        
            r11.bM = true;
            ((android.widget.TextView) r11.ar.getSelectedView()).setError("Please enter valid numbers");
            r10 = r8.d;
            r11 = ivas.gov.bisp.enumeration.activity.ShockQuestion.OooO00o.a;
            r12 = r11 | 107;
            r13 = (r12 << 1) - ((~(r11 & 107)) & r12);
            ivas.gov.bisp.enumeration.activity.ShockQuestion.OooO00o.b = r13 % 128;
            r13 = r13 % 2;
            ((android.widget.TextView) r10.aq.getSelectedView()).setError("Please enter valid numbers");
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
        
            r11.bM = false;
            ((android.widget.TextView) r11.ar.getSelectedView()).setError(null);
            ((android.widget.TextView) r8.d.aq.getSelectedView()).setError(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0163, code lost:
        
            return;
         */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemSelected(android.widget.AdapterView<?> r9, android.view.View r10, int r11, long r12) {
            /*
                Method dump skipped, instruction units count: 2248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.ShockQuestion.OooO00o.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }
}
