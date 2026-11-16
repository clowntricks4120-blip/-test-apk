package ivas.gov.bisp.enumeration.rosterActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import butterknife.BindView;
import butterknife.OnClick;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.BarCodeReader;
import ivas.gov.bisp.enumeration.BaseActivity;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.W.a;
import ivas.gov.bisp.enumeration.bI.A;
import ivas.gov.bisp.enumeration.bI.C;
import ivas.gov.bisp.enumeration.bI.C0120m;
import ivas.gov.bisp.enumeration.bI.C0125v;
import ivas.gov.bisp.enumeration.bI.C0127y;
import ivas.gov.bisp.enumeration.bI.DialogInterfaceOnClickListenerC0119a;
import ivas.gov.bisp.enumeration.bI.DialogInterfaceOnClickListenerC0122o;
import ivas.gov.bisp.enumeration.bI.L;
import ivas.gov.bisp.enumeration.bI.O;
import ivas.gov.bisp.enumeration.bI.Q;
import ivas.gov.bisp.enumeration.bI.S;
import ivas.gov.bisp.enumeration.bI.T;
import ivas.gov.bisp.enumeration.bI.V;
import ivas.gov.bisp.enumeration.bI.ViewOnClickListenerC0124s;
import ivas.gov.bisp.enumeration.bI.W;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.dd.N;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.question_options;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p035bh.C0145s;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0217y;
import ivas.gov.bisp.enumeration.p043bp.am;
import ivas.gov.bisp.enumeration.p051bx.o;
import ivas.gov.bisp.enumeration.p085h.k;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRoster extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final /* synthetic */ int af = 0;
    private static long d$s3$41144 = 0;
    private static char[] e$s2$41144 = null;
    private static int p = 0;
    private static int q = 1;
    public ArrayList<question_options> aH;
    public o aI;
    public ArrayList<Item> aJ;
    public ImageView aL;
    public ArrayList<Item> aM;
    public ArrayList<Item> aN;
    public ArrayList<Item> aO;
    public ArrayList<Item> aP;
    public ArrayList<Item> aQ;
    public ArrayList<Item> aR;
    public ArrayList<String> aS;
    public ArrayList<String> aT;
    public ArrayList<Roster> aV;
    public boolean aX;
    public RadioButton ag;
    public RadioButton ah;
    public ImageView ai;
    public Button aj;
    public ivas.gov.bisp.enumeration.p037bj.c ak;
    public ExecutorService al;
    public int bB;
    public int bC;
    public boolean bD;
    public String bE;
    public LinearLayout bJ;
    public Spinner bK;
    public BISPApplication bN;
    public byte[] bO;
    public Dialog bQ;
    public Bitmap bR;
    public String bW;
    public boolean bX;
    public CountDownTimer ba;
    public byte[] bb;
    public ArrayList<Item> bf;
    public Roster bk;
    public ArrayList<question_options> bm;
    public ArrayList<question_options> bn;
    public ArrayList<question_options> bp;
    public ArrayList<question_options> bq;
    public int br;

    @BindView
    public Button btn_bio_cnic;

    @BindView
    public Button btn_save;

    @BindView
    public Button btn_vald_cnic;
    public ArrayList<question_options> bu;

    @BindView
    public Button buttonScanCNIC;
    public Spinner bz;

    @BindView
    public CheckBox checkBoxBispBenif;

    @BindView
    public EditText et_MemberName;

    @BindView
    public EditText et_RosterBForm;

    @BindView
    public EditText et_RosterBFormRepeat;

    @BindView
    public EditText et_RosterCNIC;

    @BindView
    public EditText et_RosterCNICRepeat;

    @BindView
    public EditText et_account_number;

    @BindView
    public EditText et_account_title;

    @BindView
    public EditText et_easypaisa_number;

    @BindView
    public EditText et_hoursWorked;

    @BindView
    public EditText et_mobile_number;

    @BindView
    public ImageView imageViewCnic;

    @BindView
    public LinearLayout linearLayoutCNIC;

    @BindView
    public LinearLayout linearLayoutCNICPic;

    @BindView
    public LinearLayout llVaccinationDynamic;

    @BindView
    public LinearLayout ll_bank_info;

    @BindView
    public LinearLayout ll_nadra_name;

    @BindView
    public EditText por_roster;

    @BindView
    public RadioButton radioButtonCNICAbsent;

    @BindView
    public RadioButton radioButtonCNICNotMade;

    @BindView
    public RadioButton radioButtonCNICPresent;

    @BindView
    public RadioButton radioButtonCalendarNo;

    @BindView
    public RadioButton radioButtonCalendarYes;

    @BindView
    public RadioButton radioButtonFemale;

    @BindView
    public RadioButton radioButtonLanguage_no;

    @BindView
    public RadioButton radioButtonLanguage_yes;

    @BindView
    public RadioButton radioButtonMale;

    @BindView
    public RadioButton radioButtonTrans;

    @BindView
    public RadioGroup radioGroupCNICOptions;

    @BindView
    public RadioGroup radioGroupCalendar;

    @BindView
    public RadioGroup radioGroupGender;

    @BindView
    public RadioGroup radioGroupLanguage;

    @BindView
    public RadioButton rb_afghani_acc;

    @BindView
    public RadioButton rb_afghani_por;

    @BindView
    public RadioButton rb_no_bank;

    @BindView
    public RadioButton rb_yes_bank;

    @BindView
    public RadioGroup rg_bank_info;

    @BindView
    public Spinner sp_attended_school;

    @BindView
    public Spinner sp_banks;

    @BindView
    public Spinner sp_chronic_disease;

    @BindView
    public Spinner sp_disability;

    @BindView
    public Spinner sp_employment_status;

    @BindView
    public Spinner sp_highest_education;

    @BindView
    public Spinner sp_marital_status;

    @BindView
    public Spinner sp_networks;

    @BindView
    public Spinner sp_relation_to_household;

    @BindView
    public Spinner sp_work_activity;

    @BindView
    public Spinner spinnerMonth;

    @BindView
    public Spinner spinnerYear;

    @BindView
    public TextView textViewTimeRemaining;

    @BindView
    public TextView tv_dob;

    @BindView
    public TextView tv_languageQuestion;

    @BindView
    public TextView tv_workingHourQuestion;

    @BindView
    public TextView vald_name_txt_view;

    @BindView
    public TextView vald_txt_view;

    @BindView
    public TextView vald_txt_view_caption;
    public int cd = 0;
    public int bL = 256;
    public int bM = 360;
    public final byte[] cb = new byte[92160];
    public String[] bP = new String[0];
    public String bY = BuildConfig.FLAVOR;
    public String bZ = BuildConfig.FLAVOR;
    public String ca = BuildConfig.FLAVOR;
    public String bU = BuildConfig.FLAVOR;
    public String bV = BuildConfig.FLAVOR;
    public String bT = BuildConfig.FLAVOR;
    public String cc = BuildConfig.FLAVOR;
    public String bS = BuildConfig.FLAVOR;
    public boolean bH = false;
    public boolean aK = false;
    public int aW = -1;
    public String bo = BuildConfig.FLAVOR;
    public double aU = 0.0d;
    public int aZ = 0;
    public boolean aY = false;
    public Survey bd = null;
    public boolean bc = false;
    public boolean be = false;
    public String bh = BuildConfig.FLAVOR;
    public boolean bi = true;
    public Spinner bj = null;
    public Spinner bg = null;
    public TextView bl = null;
    public int bw = 5;
    public int bI = 14;
    public AdapterView.OnItemSelectedListener bt = new OooOO0();
    public AdapterView.OnItemSelectedListener bv = new OooOO0O();
    public AdapterView.OnItemSelectedListener bs = new OooOOO0();
    public AdapterView.OnItemSelectedListener by = new OooOOO();
    public AdapterView.OnItemSelectedListener bF = new OooOOOO();
    public AdapterView.OnItemSelectedListener bx = new OooOo00();
    public boolean bA = false;
    public Handler bG = new o0OoOo0();

    public class OooO0O0 implements J {
        private static int a = 1;
        private static int b;

        public OooO0O0() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            Object obj;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 45;
            int i4 = (i2 ^ 45) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            ActivityRoster activityRoster = ActivityRoster.this;
            activityRoster.aR = arrayList;
            int i7 = b;
            int i8 = ((i7 & (-112)) | ((~i7) & 111)) + ((i7 & 111) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            activityRoster.bN.O = arrayList;
            int i10 = a;
            int i11 = ((i10 | 124) << 1) - (i10 ^ 124);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                obj = null;
                if (i15 >= ActivityRoster.this.aR.size()) {
                    break;
                }
                int i16 = a;
                int i17 = (i16 | 65) << 1;
                int i18 = -(i16 ^ 65);
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
                Item item = ActivityRoster.this.aR.get(i15);
                int i21 = b;
                int i22 = i21 & 29;
                int i23 = -(-(i21 | 29));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    item.getOptionId();
                    obj.hashCode();
                    throw null;
                }
                if (item.getOptionId() == ActivityRoster.this.bk.work_activity) {
                    int i25 = a + 61;
                    int i26 = i25 % 128;
                    b = i26;
                    int i27 = i25 % 2;
                    int i28 = i26 & 119;
                    int i29 = (i26 ^ 119) | i28;
                    int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    i14 = i15;
                    break;
                }
                int i32 = i15 ^ 1;
                int i33 = (i15 & 1) << 1;
                i15 = (i33 | i32) + (i32 & i33);
                int i34 = a;
                int i35 = ((i34 ^ 61) | (i34 & 61)) << 1;
                int i36 = -(((~i34) & 61) | (i34 & (-62)));
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                b = i37 % 128;
                int i38 = i37 % 2;
            }
            ActivityRoster.this.sp_work_activity.setSelection(i14);
            ActivityRoster activityRoster2 = ActivityRoster.this;
            int i39 = a;
            int i40 = (i39 & (-38)) | ((~i39) & 37);
            int i41 = -(-((i39 & 37) << 1));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            b = i42 % 128;
            if (i42 % 2 == 0) {
                activityRoster2.sp_work_activity.setOnItemSelectedListener(activityRoster2.bv);
            } else {
                activityRoster2.sp_work_activity.setOnItemSelectedListener(activityRoster2.bv);
                obj.hashCode();
                throw null;
            }
        }
    }

    public class OooO0o implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & 55) + (i3 | 55);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                ActivityRoster.this.sp_highest_education.setSelection(i);
            } else {
                ActivityRoster.this.sp_highest_education.setSelection(i);
                int i5 = 81 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 47;
            int i4 = ((i2 | 47) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public class OooOO0O implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0O() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 91) << 1) - (((~i3) & 91) | (i3 & (-92)));
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            if (i == 0) {
                int i7 = (((i5 | 120) << 1) - (i5 ^ 120)) - 1;
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    ActivityRoster.this.sp_work_activity.setBackgroundResource(R.drawable.spinner_bg);
                    throw null;
                }
                ActivityRoster.this.sp_work_activity.setBackgroundResource(R.drawable.spinner_bg);
            } else {
                ActivityRoster.this.sp_work_activity.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i8 = a;
                int i9 = i8 & 45;
                int i10 = (i8 ^ 45) | i9;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
            }
            if (i == 1) {
                int i13 = a;
                int i14 = i13 & 67;
                int i15 = -(-((i13 ^ 67) | i14));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                b = i16 % 128;
                int i17 = i16 % 2;
                ActivityRoster.this.tv_workingHourQuestion.setVisibility(0);
                ActivityRoster.this.et_hoursWorked.setVisibility(0);
                int i18 = a + 41;
                b = i18 % 128;
                int i19 = i18 % 2;
                return;
            }
            ActivityRoster.this.tv_workingHourQuestion.setVisibility(8);
            ActivityRoster activityRoster = ActivityRoster.this;
            int i20 = a + 29;
            b = i20 % 128;
            int i21 = i20 % 2;
            activityRoster.et_hoursWorked.setVisibility(8);
            int i22 = b;
            int i23 = (i22 & (-106)) | ((~i22) & 105);
            int i24 = -(-((i22 & 105) << 1));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            a = i25 % 128;
            int i26 = i25 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 19) + ((i2 & 19) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public class OooOo implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooOo(ActivityRoster activityRoster) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a + 75;
            b = i3 % 128;
            int i4 = i3 % 2;
            dialogInterface.dismiss();
            if (i4 != 0) {
                throw null;
            }
        }
    }

    public class OooOo00 implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public OooOo00() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 91;
            int i4 = -(-((i2 ^ 91) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x009f  */
        /* JADX WARN: Code duplicated, block: B:30:0x0127  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int checkedRadioButtonId;
            ActivityRoster activityRoster;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 ^ 70) + ((i3 & 70) << 1)) - 1;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                checkedRadioButtonId = ActivityRoster.this.radioGroupCalendar.getCheckedRadioButtonId();
                activityRoster = ActivityRoster.this;
                int i5 = 10 / 0;
            } else {
                checkedRadioButtonId = ActivityRoster.this.radioGroupCalendar.getCheckedRadioButtonId();
                activityRoster = ActivityRoster.this;
            }
            int i6 = b;
            int i7 = ((i6 ^ 41) | (i6 & 41)) << 1;
            int i8 = -(((~i6) & 41) | (i6 & (-42)));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (checkedRadioButtonId == activityRoster.radioButtonCalendarNo.getId()) {
                int i11 = b;
                int i12 = ((i11 ^ 109) - (~(-(-((i11 & 109) << 1))))) - 1;
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    ActivityRoster.this.spinnerYear.getSelectedItemPosition();
                    throw null;
                }
                ActivityRoster activityRoster2 = ActivityRoster.this;
                activityRoster2.aU = activityRoster2.spinnerYear.getSelectedItemPosition();
                ActivityRoster activityRoster3 = ActivityRoster.this;
                double d = activityRoster3.aU;
                int i13 = b;
                int i14 = i13 & 1;
                int i15 = (i13 ^ 1) | i14;
                int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                a = i16 % 128;
                int i17 = i16 % 2;
                if (d <= 0.0d) {
                    int i18 = i13 & 53;
                    int i19 = i18 + ((i13 ^ 53) | i18);
                    a = i19 % 128;
                    if (i19 % 2 != 0 ? d == 0.0d : d == 1.0d) {
                        if (i > 0) {
                            int selectedItemPosition = activityRoster3.spinnerMonth.getSelectedItemPosition();
                            Spinner spinner = ActivityRoster.this.spinnerYear;
                            int i20 = a;
                            int i21 = ((i20 ^ 77) - (~(-(-((i20 & 77) << 1))))) - 1;
                            b = i21 % 128;
                            int i22 = i21 % 2;
                            ActivityRoster.u(activityRoster3, 1, selectedItemPosition, spinner.getSelectedItemPosition());
                            int i23 = b;
                            int i24 = ((i23 ^ 8) + ((i23 & 8) << 1)) - 1;
                            a = i24 % 128;
                            int i25 = i24 % 2;
                        }
                    }
                } else {
                    int selectedItemPosition2 = activityRoster3.spinnerMonth.getSelectedItemPosition();
                    Spinner spinner2 = ActivityRoster.this.spinnerYear;
                    int i26 = a;
                    int i27 = ((i26 ^ 77) - (~(-(-((i26 & 77) << 1))))) - 1;
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    ActivityRoster.u(activityRoster3, 1, selectedItemPosition2, spinner2.getSelectedItemPosition());
                    int i29 = b;
                    int i210 = ((i29 ^ 8) + ((i29 & 8) << 1)) - 1;
                    a = i210 % 128;
                    int i211 = i210 % 2;
                }
                ActivityRoster activityRoster4 = ActivityRoster.this;
                activityRoster4.P(activityRoster4.aU);
                int i30 = a + 103;
                b = i30 % 128;
                int i31 = i30 % 2;
                ActivityRoster activityRoster5 = ActivityRoster.this;
                double d2 = activityRoster5.aU;
                int i32 = b;
                int i33 = i32 & 65;
                int i34 = (((i32 | 65) & (~i33)) - (~(-(-(i33 << 1))))) - 1;
                int i35 = i34 % 128;
                a = i35;
                int i36 = i34 % 2;
                if (d2 <= 0.0d) {
                    int i37 = ((i35 | 25) << 1) - (i35 ^ 25);
                    b = i37 % 128;
                    int i38 = i37 % 2;
                    if (d2 == 0.0d) {
                        int i39 = (((i35 & (-60)) | ((~i35) & 59)) - (~(-(-((i35 & 59) << 1))))) - 1;
                        b = i39 % 128;
                        if (i39 % 2 != 0) {
                            int i40 = 86 / 0;
                            if (i > 0) {
                                activityRoster5.I(d2);
                                int i41 = b + 109;
                                a = i41 % 128;
                                int i42 = i41 % 2;
                            }
                        } else if (i > 0) {
                            activityRoster5.I(d2);
                            int i43 = b + 109;
                            a = i43 % 128;
                            int i44 = i43 % 2;
                        }
                    }
                } else {
                    activityRoster5.I(d2);
                    int i45 = b + 109;
                    a = i45 % 128;
                    int i46 = i45 % 2;
                }
            }
            int i47 = a;
            int i48 = (((i47 | 90) << 1) - (i47 ^ 90)) - 1;
            b = i48 % 128;
            int i49 = i48 % 2;
        }
    }

    public class Oooo0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public Oooo0(ActivityRoster activityRoster) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 & (-8)) | ((~i3) & 7)) - (~(-(-((i3 & 7) << 1))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            dialogInterface.cancel();
            dialogInterface.dismiss();
            int i6 = b + 33;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public class Oooo000 extends CountDownTimer {
        private static int a = 0;
        private static int b = 1;

        public Oooo000(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            int i = 2 % 2;
            int i2 = a + 3;
            b = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    ActivityRoster.this.textViewTimeRemaining.setVisibility(76);
                } else {
                    ActivityRoster.this.textViewTimeRemaining.setVisibility(8);
                }
                int i3 = a;
                int i4 = i3 ^ 77;
                int i5 = (((i3 & 77) | i4) << 1) - i4;
                b = i5 % 128;
                int i6 = i5 % 2;
                ActivityRoster.this.btn_save.setEnabled(true);
                int i7 = b;
                int i8 = (i7 ^ 13) + ((i7 & 13) << 1);
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 28 / 0;
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int i = 2 % 2;
            try {
                TextView textView = ActivityRoster.this.textViewTimeRemaining;
                StringBuilder sb = new StringBuilder();
                int i2 = b;
                int i3 = i2 & 5;
                int i4 = (((i2 | 5) & (~i3)) - (~(i3 << 1))) - 1;
                a = i4 % 128;
                int i5 = i4 % 2;
                sb.append("Time Remaining : ");
                long j2 = j / 1000;
                int i6 = a;
                int i7 = (i6 & (-94)) | ((~i6) & 93);
                int i8 = -(-((i6 & 93) << 1));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                b = i9 % 128;
                Object obj = null;
                if (i9 % 2 == 0) {
                    sb.append((int) j2);
                    textView.setText(sb.toString());
                    throw null;
                }
                sb.append((int) j2);
                textView.setText(sb.toString());
                int i10 = a;
                int i11 = i10 & 69;
                int i12 = ((((i10 ^ 69) | i11) << 1) - (~(-((i10 | 69) & (~i11))))) - 1;
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    ActivityRoster.this.btn_save.setEnabled(false);
                } else {
                    ActivityRoster.this.btn_save.setEnabled(false);
                }
                ActivityRoster activityRoster = ActivityRoster.this;
                int i13 = a;
                int i14 = (i13 ^ 1) + ((i13 & 1) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                activityRoster.bc = true;
                int i16 = b;
                int i17 = i16 & 103;
                int i18 = (i16 | 103) & (~i17);
                int i19 = -(-(i17 << 1));
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (Exception unused) {
            }
        }
    }

    public class o00000 extends AsyncTask<Void, Void, Void> {
        private static int a = 0;
        private static int b = 1;
        public ArrayList<question_options> c = new ArrayList<>();
        public int d;
        public a e;

        public o00000(int i, a aVar) {
            this.d = i;
            this.e = aVar;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 49) << 1) - (i2 ^ 49);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                AppDatabase.l(ActivityRoster.this.getApplicationContext());
                throw null;
            }
            ArrayList<question_options> arrayList = new ArrayList<>(AppDatabase.l(ActivityRoster.this.getApplicationContext()).m().ah("martial_status"));
            int i4 = b;
            int i5 = (i4 & (-60)) | ((~i4) & 59);
            int i6 = -(-((i4 & 59) << 1));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                this.c = arrayList;
                return null;
            }
            this.c = arrayList;
            throw null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r5) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 41;
            int i4 = (i2 ^ 41) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            super.onPostExecute(r5);
            a aVar = this.e;
            int i7 = a;
            int i8 = i7 & 5;
            int i9 = (i7 ^ 5) | i8;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            aVar.b(this.c, this.d);
            int i12 = b + 61;
            a = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public class o000OOo implements Runnable {
        private static int a = 1;
        private static int b;

        public o000OOo() {
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0079  */
        /* JADX WARN: Code duplicated, block: B:16:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:18:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:19:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:33:0x0114 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x0109 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr;
            int i;
            int i2;
            int i3;
            Message message;
            Bundle bundle;
            StringBuilder sbW;
            int i4;
            int i5;
            int i6 = 2 % 2;
            while (true) {
                ActivityRoster activityRoster = ActivityRoster.this;
                if (!activityRoster.bX) {
                    int i7 = a;
                    int i8 = (i7 ^ 11) + ((i7 & 11) << 1);
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    return;
                }
                int i10 = b;
                int i11 = (i10 & (-102)) | ((~i10) & 101);
                int i12 = -(-((i10 & 101) << 1));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                Objects.requireNonNull(activityRoster.ak);
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i15 = a;
                int i16 = (i15 ^ 25) + ((i15 & 25) << 1);
                b = i16 % 128;
                if (i16 % 2 != 0) {
                    ivas.gov.bisp.enumeration.p037bj.c cVar = ActivityRoster.this.ak;
                    throw null;
                }
                ActivityRoster activityRoster2 = ActivityRoster.this;
                int i17 = activityRoster2.ak.i(activityRoster2.cb);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                int i18 = b;
                int i19 = i18 & 41;
                int i20 = -(-((i18 ^ 41) | i19));
                int i21 = (i19 & i20) + (i20 | i19);
                a = i21 % 128;
                if (i21 % 2 == 0) {
                    if (i17 == 1) {
                        ActivityRoster activityRoster3 = ActivityRoster.this;
                        bArr = activityRoster3.cb;
                        i = activityRoster3.bL;
                        i2 = activityRoster3.bM;
                        int i22 = b;
                        i3 = ((i22 | 35) << 1) - (i22 ^ 35);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            ivas.gov.bisp.enumeration.bC.e.d(bArr, i, i2);
                            ActivityRoster activityRoster4 = ActivityRoster.this;
                            byte[] bArr2 = activityRoster4.cb;
                            int i23 = activityRoster4.bL;
                            throw null;
                        }
                        ivas.gov.bisp.enumeration.bC.e.d(bArr, i, i2);
                        ActivityRoster activityRoster5 = ActivityRoster.this;
                        activityRoster5.bO = ivas.gov.bisp.enumeration.bC.e.b(activityRoster5.cb, activityRoster5.bL, activityRoster5.bM);
                        message = new Message();
                        message.what = 0;
                        bundle = new Bundle();
                        int i24 = b;
                        int i25 = (i24 | 29) << 1;
                        int i26 = -(i24 ^ 29);
                        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                        sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
                        sbW.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                        int i29 = b;
                        int i30 = ((i29 | 12) << 1) - (i29 ^ 12);
                        i4 = (i30 ^ (-1)) + (i30 << 1);
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            bundle.putString("time", sbW.toString());
                            message.setData(bundle);
                            throw null;
                        }
                        bundle.putString("time", sbW.toString());
                        message.setData(bundle);
                        int i31 = b;
                        int i32 = i31 & 29;
                        int i33 = (i31 | 29) & (~i32);
                        int i34 = i32 << 1;
                        i5 = (i33 & i34) + (i33 | i34);
                        a = i5 % 128;
                        if (i5 % 2 == 0) {
                            ActivityRoster.this.bG.sendMessage(message);
                            int i35 = 46 / 0;
                        } else {
                            ActivityRoster.this.bG.sendMessage(message);
                        }
                        int i36 = a;
                        int i37 = i36 & 53;
                        int i38 = ((i36 | 53) & (~i37)) + (i37 << 1);
                        b = i38 % 128;
                        int i39 = i38 % 2;
                    } else {
                        continue;
                    }
                } else if (i17 == 1) {
                    ActivityRoster activityRoster6 = ActivityRoster.this;
                    bArr = activityRoster6.cb;
                    i = activityRoster6.bL;
                    i2 = activityRoster6.bM;
                    int i210 = b;
                    i3 = ((i210 | 35) << 1) - (i210 ^ 35);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        ivas.gov.bisp.enumeration.bC.e.d(bArr, i, i2);
                        ActivityRoster activityRoster7 = ActivityRoster.this;
                        byte[] bArr3 = activityRoster7.cb;
                        int i211 = activityRoster7.bL;
                        throw null;
                    }
                    ivas.gov.bisp.enumeration.bC.e.d(bArr, i, i2);
                    ActivityRoster activityRoster8 = ActivityRoster.this;
                    activityRoster8.bO = ivas.gov.bisp.enumeration.bC.e.b(activityRoster8.cb, activityRoster8.bL, activityRoster8.bM);
                    message = new Message();
                    message.what = 0;
                    bundle = new Bundle();
                    int i212 = b;
                    int i213 = (i212 | 29) << 1;
                    int i214 = -(i212 ^ 29);
                    int i215 = ((i213 | i214) << 1) - (i214 ^ i213);
                    a = i215 % 128;
                    int i216 = i215 % 2;
                    sbW = ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR);
                    sbW.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                    int i217 = b;
                    int i310 = ((i217 | 12) << 1) - (i217 ^ 12);
                    i4 = (i310 ^ (-1)) + (i310 << 1);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        bundle.putString("time", sbW.toString());
                        message.setData(bundle);
                        throw null;
                    }
                    bundle.putString("time", sbW.toString());
                    message.setData(bundle);
                    int i311 = b;
                    int i312 = i311 & 29;
                    int i313 = (i311 | 29) & (~i312);
                    int i314 = i312 << 1;
                    i5 = (i313 & i314) + (i313 | i314);
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        ActivityRoster.this.bG.sendMessage(message);
                        int i315 = 46 / 0;
                    } else {
                        ActivityRoster.this.bG.sendMessage(message);
                    }
                    int i316 = a;
                    int i317 = i316 & 53;
                    int i318 = ((i316 | 53) & (~i317)) + (i317 << 1);
                    b = i318 % 128;
                    int i319 = i318 % 2;
                } else {
                    continue;
                }
            }
        }
    }

    public class o00O0O implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public o00O0O() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 42) << 1) - (i3 ^ 42);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            Toast toastMakeText = i5 % 2 != 0 ? Toast.makeText(ActivityRoster.this.getApplicationContext(), "Application will not work correctly without permissions.", 0) : Toast.makeText(ActivityRoster.this.getApplicationContext(), "Application will not work correctly without permissions.", 1);
            int i6 = a;
            int i7 = i6 & 53;
            int i8 = -(-((i6 ^ 53) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            toastMakeText.show();
            int i11 = a;
            int i12 = (i11 & (-58)) | ((~i11) & 57);
            int i13 = -(-((i11 & 57) << 1));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        }
    }

    public class o00Oo0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public o00Oo0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & (-12)) | ((~i3) & 11);
            int i5 = -(-((i3 & 11) << 1));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            ActivityRoster.B(ActivityRoster.this);
            int i8 = a;
            int i9 = i8 & 53;
            int i10 = (i8 | 53) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 55 / 0;
            }
        }
    }

    public class o00Ooo implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public o00Ooo() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a + 123;
            b = i3 % 128;
            int i4 = i3 % 2;
            Toast toastMakeText = Toast.makeText(ActivityRoster.this.getApplicationContext(), "Application will not work correctly without permissions.", 1);
            int i5 = a;
            int i6 = ((i5 ^ 35) | (i5 & 35)) << 1;
            int i7 = -(((~i5) & 35) | (i5 & (-36)));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            toastMakeText.show();
            if (i9 == 0) {
                throw null;
            }
        }
    }

    public class o00oO0o implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ Spinner c;

        public o00oO0o(ActivityRoster activityRoster, Spinner spinner) {
            this.c = spinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (((i3 & (-16)) | ((~i3) & 15)) - (~(-(-((i3 & 15) << 1))))) - 1;
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            if (i != 0) {
                this.c.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i7 = a;
                int i8 = i7 & 105;
                int i9 = -(-((i7 ^ 105) | i8));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 91 / 0;
                    return;
                }
                return;
            }
            int i12 = i5 | 115;
            int i13 = i12 << 1;
            int i14 = -((~(i5 & 115)) & i12);
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                this.c.setBackgroundResource(R.drawable.spinner_bg);
                return;
            }
            this.c.setBackgroundResource(R.drawable.spinner_bg);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a + 19;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class o0OOO0o implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public o0OOO0o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b + 42;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (i != 0) {
                ActivityRoster.this.bz.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i5 = b;
                int i6 = ((i5 ^ 112) + ((i5 & 112) << 1)) - 1;
                a = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            ActivityRoster.this.bz.setBackgroundResource(R.drawable.spinner_bg);
            int i8 = a;
            int i9 = i8 ^ 119;
            int i10 = ((i8 & 119) | i9) << 1;
            int i11 = -i9;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 67;
            int i4 = (i2 & 67) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public class o0OoOo0 extends Handler {
        private static int a = 1;
        private static int b;

        public o0OoOo0() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 24) + ((i2 & 24) << 1)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = message.what;
            if (i4 != 0) {
                throw null;
            }
            if (i5 == 0) {
                ActivityRoster activityRoster = ActivityRoster.this;
                if (activityRoster.bX) {
                    int i6 = a;
                    int i7 = i6 & 27;
                    int i8 = i6 | 27;
                    int i9 = (i7 & i8) + (i8 | i7);
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    activityRoster.bR = ivas.gov.bisp.enumeration.bC.e.c(activityRoster.bO);
                    ActivityRoster activityRoster2 = ActivityRoster.this;
                    int i11 = a;
                    int i12 = ((i11 ^ 12) + ((i11 & 12) << 1)) - 1;
                    b = i12 % 128;
                    if (i12 % 2 != 0) {
                        activityRoster2.ai.setImageBitmap(activityRoster2.bR);
                        int i13 = 57 / 0;
                    } else {
                        activityRoster2.ai.setImageBitmap(activityRoster2.bR);
                    }
                    int i14 = a;
                    int i15 = ((i14 & 49) - (~(i14 | 49))) - 1;
                    b = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 5 / 3;
                    }
                }
            }
            int i17 = b + 41;
            a = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 94 / 0;
            }
        }
    }

    public class o0ooOOo implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public o0ooOOo() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 109;
            int i4 = i3 + ((i2 ^ 109) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 69;
            int i5 = (~i4) & (i3 | 69);
            int i6 = i4 << 1;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i != 0) {
                ActivityRoster.this.bK.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i8 = b;
                int i9 = ((((i8 ^ 25) | (i8 & 25)) << 1) - (~(-(((~i8) & 25) | (i8 & (-26)))))) - 1;
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 68 / 0;
                    return;
                }
                return;
            }
            int i11 = (i3 & 61) + (i3 | 61);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                ActivityRoster.this.bK.setBackgroundResource(R.drawable.spinner_bg);
                obj.hashCode();
                throw null;
            }
            ActivityRoster.this.bK.setBackgroundResource(R.drawable.spinner_bg);
            int i12 = b;
            int i13 = (i12 & 95) + (i12 | 95);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }
    }

    public class oo000o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public oo000o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 45;
            int i5 = i4 + ((i3 ^ 45) | i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            ActivityRoster.B(ActivityRoster.this);
            int i7 = a;
            int i8 = (i7 | 117) << 1;
            int i9 = -(((~i7) & 117) | (i7 & (-118)));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    static {
        char[] cArr = new char[1723];
        ByteBuffer.wrap("\u0011\u009cy\u001aÜÝ2\u008f\u0088Qî4Eú\u009b¯ñ-WH\u00ad\u0016\u0000ßf\u0097¼r\u0012=iìÏ°%Õ{rÑ;4ó\u008a\u0097àZF\b\u009dÂóïIº¯d\u0005-XÄ¾\u0097\u0014Nj\u0017À:'ú}§Óp)\u0004\u008cÀâ\u008e8W\u009eoô:Kå¡¤\u0007Hy\u000bÜÒ2\u0088\u0088Hî:Eô\u009b®y\rÜ\u00842Å\u0088\u0015î{E»\u009b\u0087ñJWm\u00ad6\u0000\u0082y\u001aÜÝ2\u008f\u0088Qî4Eú\u009b¯ñ-WK\u00ad\u0016\u0000Ùf\u008e¼r\u0012 iøÏª%\u0094{]ÑE4ô\u008a\u0089àZF\u001f\u009dÆóäI¶¯s\u00057XÞ¾\u0081\u0014Ej\u0002À7'ì}¸Ów)\u0014\u008cÁâ\u008a8D\u009e~y\u001aÜÝ2\u008f\u0088Qî4Eú\u009b¯ñ-WK\u00ad\u0016\u0000Ùf\u008e¼r\u0012 iøÏª%\u0094{]ÑE4ñ\u008a\u009eàRF\u000f\u009dÜóþI«¯\u007f\u0005&XÉ¾\u009d\u0014Jj\u000fÀ$'à}¿Ól)\t\u008cÒâ\u008c8F,O\u0089±gàÝ!»_\u0010\u0080'¶\u0082xl'Öë°\u0080\u001bTy\tÜÜ2\u0098\u0088Wî>Eá\u009b\u0094ñoWR\u00ad\u0000\u0000ß\u000b\u000e®Ü@¨úZ\u009c#7æé£éðL%¢a\u0018®~ÇÕ\u0018\u000bba\u0095Ç±=ã\u0090&ös,\u008d\u0082Äy\tÜÜ2\u0098\u0088Wî>Eá\u009b\u009bñlWH\u00ad\u001a\u0000ßf\u008a¼t\u0012=iÈÏ\u00ad%\u0092{Py\u0012ÜÝ2\u009b\u0088Vî/EÌ\u009b¦ñfWO\u00ad\u001b\u0000Äf\u0087y?ÜÒ2\u009f\u0088Fî{Eü\u009b\u00adñ#Wy\u00ad\u001a\u0000Ùf\u0097¼sy\u001fÜ×2Æ\u0088nî\u0016E¾\u009b²ñzWB\u00ad\nòñW\u000f¹D\u0003\u0090eïÎ \u0010qy\"ÜÜ2\u009e\u0088\u0003î8Eò\u009b¥ñ$WO\u00adS\u0000Êf\u0087¼\u007f\u0012siãÏ¬%\u008e{@Ñ\u000e4Ë\u008a´à\u007fF/\u009d£óÔI\u0095¯\u000b\u0005\u0002Xü¾¶\u0014+j/À\u001e'À}\u0098Ó\u0003)/\u008cûâª8m\u009e\u001bôBK\u0093¡Ã\u0007b]6°ê\u0016±l\u0088Â\f\\sù¬\u0017ý\u00ad8ËU`\u0080¾ÞÔ\u0017r\u001e\u0088}%¾CÆ\u0099\t7FL\u0084êÊ\u0000ä^!ô~\u0011µ¯ÅÅ6cY¸\u009cÖ líÕÃp=\u009el$\u00adBÓé\f7\u0000]¥û¿\u0001ö¬4Ê`\u001cØ¹&Wwí¶\u008bÈ \u0017þ\u001b\u0094ª2®Èâe)Â2gö\u0089£3b$B\u0081\u0089oÙÕ\u001d³h\u0018©y\u000fÜÁ2\u008a\u0088Mî(Eô\u009b®ñmW_\u00ad\u0016\u0000Ùy\u001eÜÆ2\u0085\u0088Vî8Eû\u009bëñnWZ\u00ad\u001f\u0000Î\u000f\u0007ªÂD\u0080þZ\u0098!3âí¿\u0087r!WÛ\u0012vì\u0010\u0088Êwd*\u001fç¹®S\u0090y\u0016ÜÒ2\u0099\u0088Jî/Eò\u009b§ñ\\WH\u00ad\u0007\u0000Êf\u0097¼n\u0012 y\u0013ÜÒ2\u009d\u0088Jî5Eô\u009b\u0094ñ`WS\u00ad\u0001\u0000Äf\u008d¼r\u00120iÔÏ§%\u0092{@Ñ\u000e4Â\u008a¨àvy\u001cÜÜ2\u0085\u0088Fî\u0004Eç\u009b¤ñ\\WH\u00ad\u0010\u0000Ãf\u008c¼t\u0012?y\u0013ÜÚ2\u008c\u0088Kî>Eà\u009b¿ñ\\WX\u00ad\u001c\u0000Æf\u0093¼w\u00126iÿÏ¦%\u009f{lÑ\u000e4Ç\u008a®àpF*\u009d÷óÒI\u009c¯Ey\u001eÜÞ2\u009b\u0088Oî4Eê\u009b¦ñfWU\u00ad\u0007\u0000ôf\u0090¼o\u00122iÿÏ¶%\u0088\u001f\u0005ºìTûî|\u0088\u001b#×ý\u0092\u0097\\1eË0f»\u0000²Ú]t\u0002\u000fÒ©\u009fCª\u001da·7Rö ¶\u0085dk\u0006Ñê·\u0092\u001cBÂ\u0001¨Î\u000eåô²Yky)ÜÜ2\u0098\u0088Wî>Eá\u009b\u009dñbWX\u00ad\u0010\u0000Âf\u008d¼z\u0012'iâÏ¬%\u0095{@\u000e\u008a«BE\u001a¬\u007f\t\u0096çÕ]I;X\u0090´Nì$<\u0082\u001fxPÕ\u009b³Ìi5y5ÜÜØõ}\u001c\u0093E)ÎOÒä>:fP¶ö\u0095\fÚ¡\u0011ÇF\u001d¿Ì|i\u0090\u0087È=\u0018[{ð´.ÿD,â\u0001\u0018Tµ\u008aÓÃ\t\u0010§kÜ zã\u0090Á]êø\u0006\u0016^¬\u008eÊía\"¿iÕºs\u0097\u0089Â$\u001cBU\u0098\u00916îM ëk\u0001L_\u0085õÀ\u0010\u001e\u0007\u001d¢éL§ö<\u0090I;\u008cå·\u008f])vÓ(~´\u0018\u009dÂRl\r\u0017Ý±\u0090[¥\u0005n¯8Jù\u0080÷%\u0003ËMqÖ\u0017£¼fbL\b³®\u008dTÇù\u0012\u009fZö¸SG½\u001b\u0007Áa¥Êly\"ÜÜ2\u009e\u0088\u0003î8Eò\u009b¥ñmWT\u00ad\u0007\u0000\u008bf\u0090¼~\u0012?iîÏ %\u008f{\u0013ÑL4í\u008a´à4Fk\u009dåóÔI\u0081¯\u000b\u0005\u0002X÷¾¿\u0014+j5À\u001a'Ð}\u0088ÓJ)5\u008cöâ¸8#\u009eRô\u0015K\u008b¡Ä\u0007^]%°î\u0016±lÛÂz\u0018\u0006\u007fÎÕ®+}\u0081\"äù:Þ\u0090\u0097ö\fLC£òù _+µ\u001a\u000b\u001enÀÄÅé2LÆ¢\u0097\u0018[~1Õï\u000bòaiÇG=\u0006\u0090×ö\u0099,v\u0082jùó_®µÂëFA\u0017¤Û\u001a±p~Ör\rõcÌÙ\u008f?\u0012\u0095\fÈã.©\u0084qú3P\f·ÏíÜy\u001eÜ×2\u009e\u0088@î:Eç\u009b¢ñlWU\u00ad,\u0000Þf\u0093¼\u007f\u00122iÿÏ¦y>ÜÁ2\u0099\u0088Lî)\u001fèº\u001dTYî\u0096\u0088ÿ# ý*\u0097¦1\u009bËÆf\u000b\u0000\u0002Ú¸t÷\u000f&©mCT\u001d\u0095·ÙRBìn\u0086½ ªû#\u0095\u0014/]É\u009ecÊ>?Ø`rê\fê¦ÕA\u0007\u001bYµ\u0087Oòê=\u0084f^¦øÔ\u0092\u0092-:ÇNa¿;óÖ9pg\n\u001a¤\u009b~Ä\u0019\u000b³nM»çë\u00826\\\u001fö\u0012\u0090\u008b*\u0082Å4\u009fw9½Ó¢mÉ\b\u0007¢X|\u0094\u0016ÿ±+K$y\u0002ÜÖ2\u0098y\u0015ÜÜy\u0018ÜÝ2\u0082\u0088@î\u0004yWy3ÜÖ2\u0082\u0088Dî3Eç\u009bëñbWU\u00ad\u0017\u0000\u008bf´¼~\u0012:iìÏ«%\u008f{\u0013Ñ\u00024Ð\u008aûà~F*\u009díóßI\u0092¯_\u0005\fXé¾ª¤w\u0001¹y\u0013ÜÜ2\u009e\u0088Pî>Eû\u009b¤ñoW_\u00ad,\u0000Êf\u0084¼~y\u000bÜÜ2\u0098\u0088Jî/Eú\u009b¤ñmy\u000bÜÜ2\u0098\u0088Jî/Eú\u009b¤ñmWu\u00ad\u001a\u0000ÈVïó:\u001d~§±ÁØj\u0007;\u000b\u009eÙp\u00adÊS¬/\u0007çÙ§³t\u0015Kï\u0010B×$\u009eûM^\u0081°Ù\n\tljÇ¥\u0019îs=Õ\u0010/E\u0082\u009bäÒ>\u001b\u0090ië¢Mù§Êù\u0018SGy\u0012ÜÞ2\u0086\u0088Vî5Eú\u009b±ñbWO\u00ad\u001a\u0000Äf\u008d¼D\u0012!iîÏ°%\u008b{\\Ñ\u00054Ð\u008a¾y\u0012ÜÞ2\u0086\u0088Vî5Eú\u009b±ñbWO\u00ad\u001a\u0000Äf\u008d¼D\u0012!iîÏ¢%\u0088{\\Ñ\u0005y\u0013ÜÖ2\u0082\u0088Dî3Eç\u009b\u0094ñlW]\u00ad,\u0000Èf\u008b¼r\u0012?iïy\fÜÖ2\u0082\u0088Dî3Eç\u009b\u0094ñlW]\u00ad,\u0000Èf\u008b¼r\u0012?iïÔ~q\u00ad\u009fì%$Njëº\u0005ÿ¿.Ùbr\u0086¬ÙÆ\u0004`)\u009a`7¾yLÜ¨2ñ\u00881îFE\u0095\u009bÒFÎã-\r:·«ÑÅz\u0017¤\u001aÎ\u0085h«\u0092ì?.Y2\u0083\u009e-ÍVZðA\u001aiD£îô\u000brµiß¬yó¢1Ìjvc\u0090½:óg\u0003\u0081L+ÅK\u00adîf\u0000-ºôÜ\u0080wC©\u001aÃèeä\u009f¢2fáøD\rªN\u0010\u0080víÝ!\u0003diªÏ\u00935\u0095\u0098>þF$¼\u008aûñ#Wl½Sã\u0092I\u0097¬oÿõZ\u0019´M\u000e\u0083hùÃt\u001dXw¥Ñ\u0097+Ñ\u0086\u0002à\u0005y>ÜË2\u0088\u0088Fî+Eç\u009b¢ñlWU\u00adS\u0000ûf\u008a¼x\u0012'iþÏ±%\u009e{\tÑa`~Å\u008f+Ý\u0091\u0002÷{\\´\u0082ûy2ÜÕ2Ë\u0088Zî4Eæ\u009bëñ`WS\u00ad\u0012\u0000Åf\u0084¼~\u0012siêÏ¤%\u009e{\u0013Ñ\u00044Å\u008aûà{F$\u009döóÈI\u0096¯C\u0005\fX÷¾·\u0014+j7À\u0013'Ö}\u0085Ó\u0003):\u008cÿâ§8#\u009eZô\u0017KÏ¡\u0086\u0007\u007f]s°ù\u0016¬l\u0088ÂG\u0018\u000e\u007fÑÕ¨+3\u0081<äê:×\u0090\u009fö\u000bL\u0001£þùó_yµ&\u000b\u0016nÜÄ\u009d\u001aFp?×½-ë\u0083BÙI?\u0016\u0092\u008bè\u009aNt¤&û«Q°·\u008e\rAc\u000eÆ\u0083\u001c¢r|È>/£\u0085ÌÛ\u00921E\u0097\u0017ê»@§¦dücR\u0018©Û\u000f\u008aeM»<\u001eötëÊb \\\u0086\u0016Ý\u00943Ü\u0089;\u009fþ:9Ôknµ\bÐ£\u001e}K\u0017É±¯Kòæ=\u0080jZ\u0096ôÄ\u008f\u001c)NÃp\u009d¹7¡Ò\u0004l~\u0006º ê{5\u0015\u001ey+ÜÖ2\u0099\u0088Nî2Eà\u009b¸ñjWT\u00ad\u001dy\"ÜÜ2\u009e\u0088\u0003î5Eö\u009b®ñgW\u001b\u00ad\u0003\u0000Îf\u0091¼v\u0012:iøÏ°%\u0092{\\Ñ\u00054Ð\u008aûàgF$\u009d£óÎI\u0080¯N\u0005CXÚ¾£\u0014{jcÀ\u001d'Ö}\u008aÓW).\u008cáâ®8p\u009e\u0015ôSKû¡\u008f\u0007~]2°ø\u0016¦lÛÂT\u0018\u0019\u007fÂÕµ+g\u0081käê:Ï\u0090Óö\nä\u0089AE|ÔÙ\u001e7I\u008d\u008cëò@3y+ÜÖ2\u0099\u0088Nî2Eà\u009b¸ñjWT\u00ad\u001d\u0000Ø\u0093\u001b6åØ§b:\u0004\u0006¯Ïq\u009c\u001bS½gG.ê²\u008cªVGø\u0018\u0083ß%\u0093Ï±\u0091y;;Þõ`\u008c\n\u0004¬Rwé\u0019í£æE2ï.²ÊT\u008fþ\u0012\u0080\u001c*'Íë\u0097¦9oÃ\u0010fÏ\bÒÒMtk\u001e&¡þKúí@·\u000fZ\u0092ü\u009e\u0086«(yò3\u0095ø?\u008eÁOk\u0016\u000e\u0094Ð¢z\u009e\u001c}¦zIÇ\u0013\u0084µS_\u0018á.\u0084ï.òðs\u009a\u0016=\u0086ÇÒi]3mÕjxý\u0002´¤\u0002N\u0019\u0011×»\u008e]¶çc\u0089<,ýö\u0091\u0098\n\"\u0013ÅÔoæ1êÛu}(\u0000Ãª\u0084LF\u0016Z¸2Cïå \u008fwQ\u000bôÙ\u009e\u0081 SÊml$7áÙúcD\u0005\u0005¨ÀrÚ\u0014¶¾b@7ëº\u008d\u0083WZù\u0002\u009cÖ&ëÈ©\u0092s4.ßËa\u0085\u000b\\y2ÜÀ2¿\u0088Jî6Eö\u009bªñaWW\u00ad\u0016\u0000øf\u0080¼i\u00126iîÏ\u00ady\tÜÜ2\u0098\u0088Wî>Eá\u009b\u0094ñwWR\u00ad\u001e\u0000Î4:\u0091ß\u007f\u008eÅQ£/\b½ÖêpyÕ\u0096;Ô\u0081\u001açtL\u0091\u0092îø%^\u0015¤\u0019\t\u0088oÚµq\u001bx`\u00adÆû,Ôr\u0018ØE=\u0090\u0083±é<Oy\u0094 ú\u0082@Í¦A\fFQ¿·¹\u0092H7ªÙ¨c\\\u0005-®áp«\u001au¼\bF#ëÐ\u008d\u0091Wfù'\u0082ý$ðÎ \u0090O:\rßÃa\u00ad\u000bH\u00ad7vü\u0018Ì¢ÀDkî\u0004³éU´ÿm\u0081#+HÌæ\u0096\u00918BÂ;gôy\u0014ÜØð5UË»\u0088\u0001_g4Ìë\u0012²x)Þ_$\u0016\u0089ÕïÉ5x\u009b7àèF½¬\u0098òXX\r½À\u0003«i|Ï%\u0014¥záÀ\u0095&D\u008c\bÑâ7¼\u009d!ã=I\u0003®ÀôÁZH 6\u0005øk¨±gy8ÜÜ2\u0085\u0088Eî2Eá\u009b¦ñ#Wx\u00ad=\u0000âf ¼;\u00127iäÏ¦%\u0088{\u0013Ñ\u00054Ì\u008a¯à3F&\u009dâóÏI\u0090¯C\u0005\u0006Xÿ¾òê¾OJ¡\u001b\u001b×}½Öc\b~bóÄÀ>\u0092\u0093[õ\u0004/®\u0081¥úq\\$¶\u001cèÃB\u009d§B\u0019nsÅÕ\u0090\u000e_`mÚG4a\u0091\u008e\u007fÞÅ\u001fy+Üß2\u008e\u0088Bî(Eö\u009bëñfWU\u00ad\u0007\u0000Îf\u0091¼;\u0012%iêÏ¯%\u0092{WÑK4à\u008a\u0095àZF\b\u009d¢\u0099N<¢".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1723);
        e$s2$41144 = cArr;
        d$s3$41144 = -5145850882708742989L;
    }

    public static /* synthetic */ Survey v(ActivityRoster activityRoster) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 17;
        q = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Survey survey = activityRoster.bd;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 11;
        q = i5 % 128;
        if (i5 % 2 != 0) {
            return survey;
        }
        throw null;
    }

    public static /* synthetic */ ArrayList w(ActivityRoster activityRoster) {
        int i = 2 % 2;
        int i2 = p + 39;
        int i3 = i2 % 128;
        q = i3;
        int i4 = i2 % 2;
        ArrayList<Roster> arrayList = activityRoster.aV;
        int i5 = i3 + 93;
        p = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public static /* synthetic */ byte[] x(ActivityRoster activityRoster) {
        int i = 2 % 2;
        int i2 = q + 89;
        p = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = activityRoster.bb;
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return bArr;
    }

    public static boolean y(ActivityRoster activityRoster, double d, boolean z, boolean z2, boolean z3, String str) {
        int i = 2 % 2;
        if (z2) {
            int i2 = q;
            int i3 = i2 + 15;
            p = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (z3) {
                if (d <= activityRoster.aU) {
                    int i4 = i2 + 105;
                    p = i4 % 128;
                    if (i4 % 2 == 0) {
                        return activityRoster.T(z, str);
                    }
                    activityRoster.T(z, str);
                    obj.hashCode();
                    throw null;
                }
            } else if (d < activityRoster.aU) {
                return activityRoster.T(z, str);
            }
        } else if (z3) {
            int i5 = q + 121;
            p = i5 % 128;
            int i6 = i5 % 2;
            if (d >= activityRoster.aU) {
                return activityRoster.T(z, str);
            }
        } else if (d > activityRoster.aU) {
            return activityRoster.T(z, str);
        }
        return true;
    }

    public static /* synthetic */ boolean z(ActivityRoster activityRoster, boolean z, String str) {
        int i = 2 % 2;
        int i2 = p + 5;
        q = i2 % 128;
        int i3 = i2 % 2;
        boolean zT = activityRoster.T(z, str);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        int i5 = q + 95;
        p = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return zT;
    }

    public final void F() {
        int i = 2 % 2;
        int i2 = q + 103;
        p = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < this.radioGroupGender.getChildCount()) {
            int i5 = p + 77;
            q = i5 % 128;
            i4 = i5 % 2 == 0 ? ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupGender, i4, true, i4, 0) : ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupGender, i4, true, i4, 1);
        }
        int i6 = 0;
        while (i6 < this.radioGroupCalendar.getChildCount()) {
            i6 = ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupCalendar, i6, true, i6, 1);
        }
        this.tv_dob.setEnabled(false);
        this.radioGroupGender.clearCheck();
        this.radioGroupCalendar.clearCheck();
        TextView textView = this.tv_dob;
        Object[] objArr = new Object[1];
        a(getPackageName().length() - 12, (char) (getApplicationInfo().targetSdkVersion - 31), getPackageName().length() + 194, objArr);
        textView.setHint(((String) objArr[0]).intern());
        this.tv_dob.setText(BuildConfig.FLAVOR);
        this.spinnerYear.setSelection(0);
        this.spinnerMonth.setSelection(0);
    }

    public final void G() {
        int i = 2 % 2;
        int i2 = p + 119;
        q = i2 % 128;
        int i3 = i2 % 2;
        this.bH = false;
        this.aK = false;
        this.vald_txt_view.setText(BuildConfig.FLAVOR);
        this.vald_txt_view.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        this.bY = BuildConfig.FLAVOR;
        this.bZ = BuildConfig.FLAVOR;
        this.ca = BuildConfig.FLAVOR;
        this.bU = BuildConfig.FLAVOR;
        this.bV = BuildConfig.FLAVOR;
        this.bT = BuildConfig.FLAVOR;
        this.cc = BuildConfig.FLAVOR;
        this.bS = BuildConfig.FLAVOR;
        int i4 = q + 117;
        p = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void I(double d) {
        int i = 2 % 2;
        int i2 = p + 35;
        q = i2 % 128;
        int i3 = i2 % 2;
        if (this.sp_relation_to_household.getSelectedItemPosition() != 0) {
            int i4 = q + 35;
            p = i4 % 128;
            int i5 = i4 % 2;
            if (this.aM.get(this.sp_relation_to_household.getSelectedItemPosition()).getOptionId() != 186 || d >= 18.0d) {
                return;
            }
            C0104p c0104pC = C0104p.c();
            AppCompatActivity appCompatActivity = this.ae;
            Object[] objArr = new Object[1];
            a(7 - Gravity.getAbsoluteGravity(0, 0), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 35801), getApplicationInfo().targetSdkVersion + 211, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(51 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (getApplicationInfo().targetSdkVersion - 31), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 212, objArr2);
            c0104pC.d(appCompatActivity, strIntern, ((String) objArr2[0]).intern(), new DialogInterfaceOnClickListenerC0122o(this, 0), false);
            int i6 = q + 7;
            p = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final void J() {
        int i = 2 % 2;
        int i2 = p + 47;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            getCurrentFocus();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            Object[] objArr = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 8, (char) (getApplicationInfo().targetSdkVersion - 31), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 92, objArr);
            ((InputMethodManager) getSystemService(((String) objArr[0]).intern())).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            currentFocus.clearFocus();
            int i3 = q + 23;
            p = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final ArrayList<String> L(ArrayList<question_options> arrayList) {
        String str;
        int i = 2 % 2;
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            return arrayList2;
        }
        Iterator<question_options> it = arrayList.iterator();
        while (!(!it.hasNext())) {
            int i2 = q + 99;
            p = i2 % 128;
            int i3 = i2 % 2;
            question_options next = it.next();
            if (next != null && (str = next.option) != null) {
                int i4 = q + 9;
                p = i4 % 128;
                int i5 = i4 % 2;
                if (!str.trim().isEmpty()) {
                    arrayList2.add(next.option);
                    int i6 = q + 15;
                    p = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        if (!(!arrayList2.isEmpty())) {
            Object[] objArr = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 11, (char) (getApplicationInfo().targetSdkVersion + 26129), Color.green(0) + 491, objArr);
            arrayList2.add(((String) objArr[0]).intern());
        }
        return arrayList2;
    }

    public final void O(String str, String str2) {
        int i = 2 % 2;
        int i2 = p + 91;
        q = i2 % 128;
        int i3 = i2 % 2;
        this.tv_dob.setText(str);
        this.bW = str2;
        int i4 = p + 95;
        q = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
    }

    public void R(ArrayList<Item> arrayList, Spinner spinner) {
        int i = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new o00oO0o(this, spinner));
        int i2 = p + 91;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean T(boolean z, String str) {
        int i = 2 % 2;
        runOnUiThread(new o000oOoO(str));
        if (!z) {
            return true;
        }
        int i2 = p;
        int i3 = i2 + 85;
        q = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        q = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final void U() {
        int i = 2 % 2;
        C0104p c0104pC = C0104p.c();
        Object[] objArr = new Object[1];
        a(getApplicationInfo().targetSdkVersion - 24, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 112), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 922, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(getApplicationInfo().targetSdkVersion, (char) (getPackageName().length() + 16344), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 1007, objArr2);
        c0104pC.h(this, strIntern, ((String) objArr2[0]).intern(), new DialogInterfaceOnClickListenerC0122o(this, 2), new DialogInterfaceOnClickListenerC0119a(this, 3), false);
        int i2 = q + 9;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void V() {
        int i = 2 % 2;
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        this.bB = gregorianCalendar.get(1);
        this.bC = gregorianCalendar.get(2);
        this.br = gregorianCalendar.get(5);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.ae, new N(this, 1), this.bB, this.bC, this.br);
        datePickerDialog.getDatePicker().setMaxDate(new Date(this.bB - 1900, this.bC, this.br).getTime());
        datePickerDialog.show();
        int i2 = q + 15;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        C0104p.c().h(this.ae, getResources().getString(R.string.enter_data_lost), getResources().getString(R.string.roster_exit), new DialogInterfaceOnClickListenerC0119a(this, 1), null, false);
        int i2 = p + 79;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @OnClick
    public void onCnicImageClick(View view) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 33;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 1 / 0;
            if (this.bb == null) {
                return;
            }
        } else if (this.bb == null) {
            return;
        }
        int i5 = i2 + 103;
        p = i5 % 128;
        int i6 = i5 % 2;
        try {
            ivas.gov.bisp.enumeration.p026az.P pE = ivas.gov.bisp.enumeration.p026az.P.e();
            AppCompatActivity appCompatActivity = this.ae;
            Bitmap bitmapG = ivas.gov.bisp.enumeration.p026az.P.e().g(this.bb);
            Object[] objArr = new Object[1];
            a(getPackageName().length() - 18, (char) (6485 - Color.argb(0, 0, 0, 0)), 1137 - Drawable.resolveOpacity(0, 0), objArr);
            pE.h(appCompatActivity, bitmapG, ((String) objArr[0]).intern());
        } catch (Exception unused) {
        }
    }

    @OnClick
    public void onCnicPic(View view) {
        int i = 2 % 2;
        int i2 = q + 57;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q + 93;
        int i3 = i2 % 128;
        p = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        q = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_roster;
    }

    @OnClick
    public void saveToRosterList(View view) {
        int size;
        int i;
        boolean z;
        String str;
        int i2 = 2 % 2;
        int i3 = p + 107;
        q = i3 % 128;
        if (i3 % 2 == 0) {
            size = this.aV.size();
            i = 1;
        } else {
            size = this.aV.size();
            i = 0;
        }
        while (true) {
            if (i >= size) {
                z = false;
                str = BuildConfig.FLAVOR;
                break;
            }
            int i4 = p + 61;
            int i5 = i4 % 128;
            q = i5;
            int i6 = i4 % 2;
            if (i != this.aW) {
                int i7 = i5 + 103;
                p = i7 % 128;
                if (i7 % 2 != 0) {
                    if (this.aV.get(i).relation_to_household_id == 22027) {
                        str = this.aV.get(i).name_of_member;
                        ag.i = str;
                        z = true;
                        break;
                    }
                } else if (this.aV.get(i).relation_to_household_id == 186) {
                    str = this.aV.get(i).name_of_member;
                    ag.i = str;
                    z = true;
                    break;
                }
            }
            i++;
        }
        if (this.aM.get(this.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 186) {
            int i8 = p + 17;
            q = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            if (z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.ae);
                Object[] objArr = new Object[1];
                a(getApplicationInfo().targetSdkVersion - 24, (char) (Gravity.getAbsoluteGravity(0, 0) + 19712), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1520, objArr);
                builder.setTitle(((String) objArr[0]).intern());
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(getApplicationInfo().targetSdkVersion - 1, (char) (getApplicationInfo().targetSdkVersion + 2347), View.resolveSize(0, 0) + 1527, objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(str);
                Object[] objArr3 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 2, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 60130), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1553, objArr3);
                sb.append(((String) objArr3[0]).intern());
                builder.setMessage(sb.toString());
                builder.setCancelable(true);
                Object[] objArr4 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 113, (char) (getPackageName().codePointAt(6) - 111), getApplicationInfo().targetSdkVersion + 1564, objArr4);
                builder.setPositiveButton(((String) objArr4[0]).intern(), new Oooo0(this));
                builder.create().show();
                return;
            }
        }
        new o0O0O00(this).execute(new Void[0]);
    }

    @OnClick
    public void scanClicked(View view) {
        int i = 2 % 2;
        int i2 = p + 87;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    @OnClick
    public void valdClicked(View view) {
        int i = 2 % 2;
        int i2 = q + 25;
        p = i2 % 128;
        if (i2 % 2 == 0 ? this.et_RosterCNIC.getText().length() != 15 : this.et_RosterCNIC.getText().length() != 11) {
            b.aIz aiz = new b.aIz(this);
            AlertController.OooO0O0 oooO0O0 = aiz.a;
            Object[] objArr = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length(), (char) (19795 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 1644, objArr);
            oooO0O0.e = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 7, (char) KeyEvent.getDeadChar(0, 0), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 1582, objArr2);
            oooO0O0.f = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(getPackageName().codePointAt(2) - 95, (char) (ExpandableListView.getPackedPositionGroup(0L) + 57466), 1769 - AndroidCharacter.getMirror('0'), objArr3);
            oooO0O0.h = ((String) objArr3[0]).intern();
            oooO0O0.i = null;
            aiz.d();
            return;
        }
        Roster roster = this.bk;
        if (roster.cnic.equalsIgnoreCase(roster.cnicRepeat)) {
            return;
        }
        b bVarB = new b.aIz(this).b();
        Object[] objArr4 = new Object[1];
        a(getPackageName().length() + 5, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), 1637 - Color.green(0), objArr4);
        bVarB.setTitle(((String) objArr4[0]).intern());
        AlertController alertController = bVarB.a;
        Object[] objArr5 = new Object[1];
        a(getPackageName().length() + 1, (char) (getApplicationInfo().targetSdkVersion + 37750), getApplicationInfo().targetSdkVersion + 1636, objArr5);
        alertController.f = ((String) objArr5[0]).intern();
        TextView textView = alertController.H;
        if (textView != null) {
            int i3 = q + 119;
            p = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr6 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 89, (char) (getApplicationInfo().targetSdkVersion + 37750), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1663, objArr6);
            textView.setText(((String) objArr6[0]).intern());
        }
        Object[] objArr7 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 2, (char) (ImageFormat.getBitsPerPixel(0) + 40382), KeyEvent.normalizeMetaState(0) + 1347, objArr7);
        bVarB.i(-3, ((String) objArr7[0]).intern(), new OooOo(this));
        bVarB.setCancelable(false);
        bVarB.show();
    }

    public class OooO00o implements J {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = a + 3;
            b = i2 % 128;
            int i3 = i2 % 2;
            ActivityRoster.this.aN = arrayList;
            int i4 = a;
            int i5 = i4 | 95;
            int i6 = i5 << 1;
            int i7 = -((~(i4 & 95)) & i5);
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            int i11 = 0;
            while (i11 < ActivityRoster.this.aN.size()) {
                int i12 = b;
                int i13 = i12 & 113;
                int i14 = i12 | 113;
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                a = i15 % 128;
                Object obj = null;
                if (i15 % 2 != 0) {
                    ActivityRoster.this.aN.get(i11);
                    obj.hashCode();
                    throw null;
                }
                int optionId = ActivityRoster.this.aN.get(i11).getOptionId();
                Roster roster = ActivityRoster.this.bk;
                int i16 = a;
                int i17 = ((i16 | 33) << 1) - (i16 ^ 33);
                b = i17 % 128;
                int i18 = i17 % 2;
                if (optionId == roster.chronic_disease) {
                    int i19 = a;
                    int i20 = i19 & 5;
                    int i21 = i20 + ((i19 ^ 5) | i20);
                    b = i21 % 128;
                    if (i21 % 2 != 0) {
                        i10 = i11;
                        break;
                    } else {
                        obj.hashCode();
                        throw null;
                    }
                }
                i11 = (i11 | 1) + (i11 & 1);
                int i22 = b;
                int i23 = ((i22 ^ 18) + ((i22 & 18) << 1)) - 1;
                a = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = 2 % 3;
                }
            }
            ActivityRoster.this.sp_chronic_disease.setSelection(i10);
            int i25 = a;
            int i26 = (i25 & (-32)) | ((~i25) & 31);
            int i27 = (i25 & 31) << 1;
            int i28 = (i26 & i27) + (i27 | i26);
            b = i28 % 128;
            int i29 = i28 % 2;
        }
    }

    public class o000oOoO implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ String c;

        public o000oOoO(String str) {
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatActivity appCompatActivity;
            String str;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 12) + (i2 | 12)) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                ActivityRoster activityRoster = ActivityRoster.this;
                int i4 = ActivityRoster.af;
                appCompatActivity = activityRoster.ae;
                str = this.c;
                int i5 = 30 / 0;
            } else {
                ActivityRoster activityRoster2 = ActivityRoster.this;
                int i6 = ActivityRoster.af;
                appCompatActivity = activityRoster2.ae;
                str = this.c;
            }
            int i7 = b;
            int i8 = i7 & 93;
            int i9 = (i7 ^ 93) | i8;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            Toast.makeText(appCompatActivity, str, 0).show();
        }
    }

    public static boolean A(Context context, String... strArr) {
        int i = 2 % 2;
        if (strArr == null) {
            return true;
        }
        int i2 = q + 109;
        p = i2 % 128;
        int i3 = i2 % 2;
        for (String str : strArr) {
            int i4 = q + 125;
            p = i4 % 128;
            int i5 = i4 % 2;
            if (l.b(context, str) != 0) {
                int i6 = q;
                int i7 = i6 + 23;
                p = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 13;
                p = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 52 / 0;
                }
                return false;
            }
        }
        return true;
    }

    @OnClick
    public void onDOB(View view) {
        int i = 2 % 2;
        int i2 = p + 101;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Roster roster = this.bk;
        if (roster == null || roster.relation_to_household_id != 186) {
            V();
            return;
        }
        ArrayList<Roster> arrayList = this.aV;
        if (arrayList == null || arrayList.size() <= 0 || this.aV.size() <= 1) {
            int i3 = p + 97;
            q = i3 % 128;
            int i4 = i3 % 2;
            V();
            return;
        }
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity = this.ae;
        Object[] objArr = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 3, (char) (getApplicationInfo().targetSdkVersion + 35774), 242 - (Process.myTid() >> 22), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 105, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 115), View.MeasureSpec.makeMeasureSpec(0, 0) + 1144, objArr2);
        c0104pC.h(appCompatActivity, strIntern, ((String) objArr2[0]).intern(), new DialogInterfaceOnClickListenerC0119a(this, 0), DialogInterfaceOnClickListenerC0217y.i, true);
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        CountDownTimer countDownTimer = this.ba;
        if (countDownTimer != null) {
            int i2 = q + 15;
            p = i2 % 128;
            if (i2 % 2 != 0) {
                countDownTimer.cancel();
                throw null;
            }
            countDownTimer.cancel();
        }
        int i3 = q + 29;
        p = i3 % 128;
        int i4 = i3 % 2;
    }

    public class OooOO0 implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-64)) | ((~i2) & 63);
            int i4 = (i2 & 63) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList<Item> arrayList;
            Spinner spinner;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 71;
            int i5 = i3 | 71;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 % 128;
            b = i7;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (i == 0) {
                int i8 = (-2) - ((i7 + 100) ^ (-1));
                a = i8 % 128;
                int i9 = i8 % 2;
                ActivityRoster.this.sp_attended_school.setBackgroundResource(R.drawable.spinner_bg);
                int i10 = b;
                int i11 = i10 & 37;
                int i12 = -(-((i10 ^ 37) | i11));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                int i14 = i13 % 2;
            } else {
                ActivityRoster.this.sp_attended_school.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i15 = a;
                int i16 = ((i15 | 65) << 1) - (i15 ^ 65);
                b = i16 % 128;
                int i17 = i16 % 2;
            }
            if (ActivityRoster.this.sp_attended_school.getSelectedItemPosition() != 0) {
                int i18 = a;
                int i19 = (i18 & (-124)) | ((~i18) & 123);
                int i20 = -(-((i18 & 123) << 1));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    ActivityRoster activityRoster = ActivityRoster.this;
                    arrayList = activityRoster.aP;
                    spinner = activityRoster.sp_attended_school;
                    int i22 = 21 / 0;
                } else {
                    ActivityRoster activityRoster2 = ActivityRoster.this;
                    arrayList = activityRoster2.aP;
                    spinner = activityRoster2.sp_attended_school;
                }
                int optionId = arrayList.get(spinner.getSelectedItemPosition()).getOptionId();
                int i23 = a;
                int i24 = ((i23 | 45) << 1) - (i23 ^ 45);
                b = i24 % 128;
                if (i24 % 2 != 0 ? optionId != 25 : optionId != 107) {
                    int i25 = i23 & 99;
                    int i26 = i25 + ((i23 ^ 99) | i25);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    ActivityRoster.this.sp_highest_education.setVisibility(0);
                    int i28 = b;
                    int i29 = (i28 & (-60)) | ((~i28) & 59);
                    int i30 = (i28 & 59) << 1;
                    int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    return;
                }
            }
            ActivityRoster.this.sp_highest_education.setVisibility(8);
            int i33 = b;
            int i34 = i33 ^ 5;
            int i35 = ((i33 & 5) | i34) << 1;
            int i36 = -i34;
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            a = i37 % 128;
            if (i37 % 2 != 0) {
                throw null;
            }
        }
    }

    public class o0O0O00 extends AsyncTask<Void, Integer, Boolean> {
        private static int a = 1;
        private static int b;
        public ProgressDialog c;
        public Context d;
        public String e = BuildConfig.FLAVOR;

        public o0O0O00(Context context) {
            this.d = context;
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 101;
            int i4 = -(-(i2 | 101));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return c();
            }
            c();
            throw null;
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            int i = 2 % 2;
            try {
                ProgressDialog progressDialog = new ProgressDialog(this.d);
                this.c = progressDialog;
                int i2 = a;
                int i3 = (((i2 | 22) << 1) - (i2 ^ 22)) - 1;
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    progressDialog.setCancelable(true);
                } else {
                    progressDialog.setCancelable(false);
                }
                this.c.setTitle("Validating roster");
                int i4 = (-2) - ((a + 92) ^ (-1));
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    this.c.setMessage("Please Wait...");
                } else {
                    this.c.setMessage("Please Wait...");
                }
                this.c.setIndeterminate(true);
                this.c.show();
                int i5 = b;
                int i6 = i5 & 83;
                int i7 = ((((i5 ^ 83) | i6) << 1) - (~(-((i5 | 83) & (~i6))))) - 1;
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 95 / 0;
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 53;
            int i4 = (i3 - (~(-(-((i2 ^ 53) | i3))))) - 1;
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                throw null;
            }
            Boolean bool2 = bool;
            ProgressDialog progressDialog = this.c;
            if (progressDialog != null && progressDialog.isShowing()) {
                int i5 = b;
                int i6 = (((i5 ^ 119) | (i5 & 119)) << 1) - (((~i5) & 119) | (i5 & (-120)));
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    this.c.dismiss();
                    int i7 = 83 / 0;
                } else {
                    this.c.dismiss();
                }
            }
            if (!bool2.booleanValue()) {
                if (!this.e.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                    int i8 = a + 66;
                    int i9 = (i8 ^ (-1)) + (i8 << 1);
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    Toast.makeText(this.d, this.e, 0).show();
                    int i11 = b;
                    int i12 = (i11 ^ 20) + ((i11 & 20) << 1);
                    int i13 = (i12 ^ (-1)) + (i12 << 1);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
                int i15 = a;
                int i16 = i15 & 47;
                int i17 = (i15 ^ 47) | i16;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                return;
            }
            int i20 = b;
            int i21 = (((i20 | 8) << 1) - (i20 ^ 8)) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
            if (ActivityRoster.this.por_roster.getText().toString().length() <= 0) {
                String string = ActivityRoster.this.et_RosterCNIC.getText().toString();
                int i23 = b;
                int i24 = i23 & 9;
                int i25 = (i24 - (~((i23 ^ 9) | i24))) - 1;
                a = i25 % 128;
                int i26 = i25 % 2;
                if (string.length() <= 0) {
                    ActivityRoster.this.Q();
                    int i27 = b;
                    int i28 = i27 & 125;
                    int i29 = ((i27 ^ 125) | i28) << 1;
                    int i30 = -((i27 | 125) & (~i28));
                    int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                    a = i31 % 128;
                    if (i31 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i32 = a + 97;
                b = i32 % 128;
                int i33 = i32 % 2;
                if (!ax.c(ActivityRoster.this)) {
                    ActivityRoster.this.Q();
                    int i34 = b;
                    int i35 = (i34 & 75) + (i34 | 75);
                    a = i35 % 128;
                    int i36 = i35 % 2;
                    return;
                }
                int i37 = b;
                int i38 = i37 & 43;
                int i39 = ((i37 | 43) & (~i38)) + (i38 << 1);
                a = i39 % 128;
                int i40 = i39 % 2;
                ActivityRoster.this.Q();
                int i41 = a;
                int i42 = i41 & 39;
                int i43 = (i42 - (~(-(-((i41 ^ 39) | i42))))) - 1;
                b = i43 % 128;
                int i44 = i43 % 2;
                return;
            }
            int i45 = a + 73;
            b = i45 % 128;
            int i46 = i45 % 2;
            if (!ax.c(ActivityRoster.this)) {
                ActivityRoster.this.Q();
                int i47 = b;
                int i48 = i47 & 99;
                int i49 = i48 + ((i47 ^ 99) | i48);
                a = i49 % 128;
                int i50 = i49 % 2;
                return;
            }
            int i51 = a;
            int i52 = i51 & 65;
            int i53 = (((i51 | 65) & (~i52)) - (~(-(-(i52 << 1))))) - 1;
            b = i53 % 128;
            int i54 = i53 % 2;
            ActivityRoster activityRoster = ActivityRoster.this;
            if (!(!activityRoster.aK)) {
                activityRoster.Q();
                int i55 = a;
                int i56 = i55 & 77;
                int i57 = (i56 - (~(-(-((i55 ^ 77) | i56))))) - 1;
                b = i57 % 128;
                int i58 = i57 % 2;
                return;
            }
            int i59 = a;
            int i60 = i59 & 21;
            int i61 = ((i59 ^ 21) | i60) << 1;
            int i62 = -((i59 | 21) & (~i60));
            int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
            b = i63 % 128;
            int i64 = i63 % 2;
            Toast.makeText(activityRoster.getApplicationContext(), "Please validate card!", 0).show();
            int i65 = a;
            int i66 = i65 & 69;
            int i67 = (((i65 ^ 69) | i66) << 1) - ((i65 | 69) & (~i66));
            b = i67 % 128;
            if (i67 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:126:0x0382 A[Catch: Exception -> 0x0cd9, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:128:0x0394 A[Catch: Exception -> 0x0cd9, TRY_LEAVE, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:131:0x03b9 A[Catch: Exception -> 0x0cd9, TRY_ENTER, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:138:0x0400  */
        /* JADX WARN: Code duplicated, block: B:141:0x0420 A[Catch: Exception -> 0x0cd9, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:147:0x045f A[Catch: Exception -> 0x0cd9, TRY_ENTER, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:149:0x0479  */
        /* JADX WARN: Code duplicated, block: B:150:0x047b A[Catch: Exception -> 0x0cd9, TRY_LEAVE, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:154:0x049e  */
        /* JADX WARN: Code duplicated, block: B:156:0x04b0 A[Catch: Exception -> 0x0cd9, TRY_ENTER, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:158:0x04b4 A[Catch: Exception -> 0x0cd9, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:159:0x04e5 A[Catch: Exception -> 0x0cd9, TRY_LEAVE, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:164:0x04eb A[Catch: Exception -> 0x0cd9, TRY_ENTER, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:167:0x0511  */
        /* JADX WARN: Code duplicated, block: B:169:0x0524 A[Catch: Exception -> 0x0cd9, TRY_ENTER, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:171:0x052c A[Catch: Exception -> 0x0cd9, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:173:0x0536 A[Catch: Exception -> 0x0cd9, TRY_LEAVE, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:179:0x0542 A[Catch: Exception -> 0x0cd9, TRY_ENTER, TRY_LEAVE, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:191:0x057a A[Catch: Exception -> 0x0cd9, TRY_LEAVE, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:203:0x0592 A[Catch: Exception -> 0x0cd9, TRY_ENTER, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:205:0x05a8 A[Catch: Exception -> 0x0cd9, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:471:0x0c6f  */
        /* JADX WARN: Code duplicated, block: B:69:0x01fa A[Catch: Exception -> 0x0cd9, TRY_ENTER, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:71:0x0210 A[Catch: Exception -> 0x0cd9, TRY_LEAVE, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:89:0x0285  */
        /* JADX WARN: Code duplicated, block: B:92:0x02ad A[Catch: Exception -> 0x0cd9, TRY_LEAVE, TryCatch #15 {Exception -> 0x0cd9, blocks: (B:3:0x001b, B:5:0x0034, B:10:0x005a, B:12:0x0064, B:14:0x0072, B:16:0x0084, B:18:0x0092, B:19:0x009a, B:20:0x00a1, B:21:0x00a4, B:25:0x00a8, B:27:0x00c1, B:29:0x00d0, B:31:0x00e5, B:33:0x00f3, B:35:0x0101, B:37:0x011c, B:39:0x0126, B:41:0x0130, B:43:0x013e, B:45:0x0154, B:47:0x0162, B:50:0x0178, B:53:0x0195, B:55:0x01a3, B:58:0x01b8, B:60:0x01ce, B:62:0x01e8, B:64:0x01eb, B:65:0x01f6, B:69:0x01fa, B:71:0x0210, B:73:0x0224, B:75:0x0227, B:77:0x0231, B:79:0x023f, B:82:0x025a, B:87:0x026f, B:90:0x0297, B:92:0x02ad, B:94:0x02c3, B:96:0x02cb, B:98:0x02e1, B:100:0x02eb, B:102:0x02f7, B:104:0x02ff, B:106:0x030d, B:108:0x0332, B:112:0x034d, B:115:0x0364, B:117:0x036e, B:126:0x0382, B:128:0x0394, B:131:0x03b9, B:133:0x03c0, B:136:0x03da, B:139:0x0412, B:141:0x0420, B:143:0x043a, B:147:0x045f, B:150:0x047b, B:152:0x0498, B:156:0x04b0, B:158:0x04b4, B:165:0x0507, B:169:0x0524, B:171:0x052c, B:173:0x0536, B:174:0x053b, B:175:0x053e, B:159:0x04e5, B:160:0x04e7, B:164:0x04eb, B:179:0x0542, B:180:0x0546, B:181:0x0549, B:185:0x054d, B:187:0x055b, B:189:0x0577, B:191:0x057a, B:192:0x057d, B:193:0x0580, B:123:0x0376, B:197:0x0584, B:198:0x058b, B:199:0x058e, B:203:0x0592, B:205:0x05a8, B:207:0x05b6, B:210:0x05ca, B:215:0x05ef, B:217:0x05f7, B:219:0x060f, B:235:0x0658, B:237:0x0662, B:239:0x0670, B:241:0x067a, B:243:0x0688, B:245:0x0692, B:247:0x069a, B:249:0x06a4, B:252:0x06bc, B:256:0x06d5, B:260:0x06ed, B:262:0x06fb, B:263:0x06ff, B:267:0x0703, B:268:0x070a, B:272:0x070e, B:275:0x0725, B:276:0x0729, B:277:0x072c, B:251:0x06b2, B:281:0x0730, B:284:0x074e, B:286:0x075a, B:288:0x075d, B:290:0x0767, B:293:0x077f, B:296:0x079d, B:298:0x07a0, B:299:0x07a2, B:304:0x07b0, B:308:0x07c5, B:310:0x07d2, B:316:0x07e3, B:318:0x07ed, B:321:0x0814, B:323:0x0830, B:325:0x083f, B:328:0x0857, B:330:0x0861, B:334:0x0880, B:336:0x088e, B:337:0x0899, B:338:0x089c, B:342:0x08a0, B:344:0x08b7, B:315:0x07d7, B:327:0x084d, B:303:0x07a6, B:345:0x08ba, B:347:0x08c6, B:349:0x08df, B:351:0x08f3, B:354:0x0910, B:356:0x0917, B:361:0x091c, B:363:0x0922, B:365:0x0926, B:367:0x092e, B:370:0x093b, B:372:0x0947, B:374:0x0957, B:376:0x096d, B:381:0x0987, B:383:0x099f, B:385:0x09bb, B:387:0x09d3, B:390:0x0a00, B:391:0x0a04, B:396:0x0a09, B:398:0x0a0e, B:403:0x0a3a, B:405:0x0a43, B:408:0x0a6e, B:410:0x0a73, B:411:0x0a76, B:412:0x0a79, B:404:0x0a3f, B:416:0x0a7d, B:419:0x0a98, B:421:0x0aa6, B:427:0x0ab7, B:429:0x0abf, B:431:0x0adb, B:436:0x0b08, B:438:0x0b11, B:437:0x0b0d, B:440:0x0b29, B:442:0x0b3c, B:446:0x0b60, B:448:0x0b7c, B:450:0x0b94, B:455:0x0bc2, B:457:0x0bda, B:459:0x0bf6, B:463:0x0c1c, B:466:0x0c46, B:470:0x0c67, B:472:0x0c70, B:474:0x0c75, B:476:0x0c8d, B:426:0x0aab, B:377:0x0972, B:478:0x0ca9, B:221:0x0615, B:222:0x0618, B:226:0x061c, B:229:0x063a, B:231:0x0644, B:233:0x064c, B:85:0x0265, B:482:0x0cc0, B:484:0x0ccc, B:485:0x0cd5), top: B:522:0x001b }] */
        public Boolean c() {
            double d;
            Item item;
            ActivityRoster activityRoster;
            boolean z;
            ActivityRoster activityRoster2;
            boolean z2;
            String string;
            String strTrim;
            int i;
            int i2;
            int iD;
            ActivityRoster activityRoster3;
            int i3;
            int i4;
            int i5 = 2 % 2;
            int i6 = a;
            int i7 = i6 & 7;
            int i8 = (i7 - (~(-(-((i6 ^ 7) | i7))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object obj = null;
                if (!(!ActivityRoster.this.et_MemberName.getText().toString().trim().equals(BuildConfig.FLAVOR))) {
                    int i10 = b;
                    int i11 = (-2) - (((i10 & 6) + (i10 | 6)) ^ (-1));
                    a = i11 % 128;
                    if (i11 % 2 != 0) {
                        ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_MemberName, "Member Name");
                        return Boolean.FALSE;
                    }
                    ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_MemberName, "Member Name");
                    throw null;
                }
                ActivityRoster activityRoster4 = ActivityRoster.this;
                if (activityRoster4.aM.get(activityRoster4.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 186) {
                    int i12 = b;
                    int i13 = (i12 & 59) + (i12 | 59);
                    a = i13 % 128;
                    if (i13 % 2 == 0) {
                        ActivityRoster.this.sp_networks.getSelectedItemPosition();
                        obj.hashCode();
                        throw null;
                    }
                    if (ActivityRoster.this.sp_networks.getSelectedItemPosition() == 0) {
                        ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_networks, "Network Type");
                        return Boolean.FALSE;
                    }
                    if (!ac.k(ActivityRoster.this.et_mobile_number.getText().toString())) {
                        ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_mobile_number, "valid Mobile number");
                        return Boolean.FALSE;
                    }
                    ActivityRoster.this.et_mobile_number.getText();
                }
                int checkedRadioButtonId = ActivityRoster.this.rg_bank_info.getCheckedRadioButtonId();
                int i14 = a;
                int i15 = ((i14 | 24) << 1) - (i14 ^ 24);
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                boolean z3 = false;
                if (checkedRadioButtonId != ActivityRoster.this.rg_bank_info.getChildAt(0).getId()) {
                    int checkedRadioButtonId2 = ActivityRoster.this.rg_bank_info.getCheckedRadioButtonId();
                    int i18 = b;
                    int i19 = ((i18 & 106) + (i18 | 106)) - 1;
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    if (checkedRadioButtonId2 != ActivityRoster.this.rg_bank_info.getChildAt(1).getId()) {
                        ivas.gov.bisp.enumeration.p026az.z.m(this.d, ActivityRoster.this.rg_bank_info, "Bank Details");
                        return Boolean.FALSE;
                    }
                }
                int checkedRadioButtonId3 = ActivityRoster.this.rg_bank_info.getCheckedRadioButtonId();
                ActivityRoster activityRoster5 = ActivityRoster.this;
                int i21 = a;
                int i22 = i21 & 63;
                int i23 = (((i21 | 63) & (~i22)) - (~(i22 << 1))) - 1;
                b = i23 % 128;
                int i24 = i23 % 2;
                if (checkedRadioButtonId3 == activityRoster5.rb_yes_bank.getId()) {
                    if (ActivityRoster.this.sp_banks.getSelectedItemPosition() == 0) {
                        ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_banks, "Bank Name");
                        return Boolean.FALSE;
                    }
                    if (ActivityRoster.this.et_account_title.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                        ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_account_title, "Account Title");
                        return Boolean.FALSE;
                    }
                    if (ActivityRoster.this.sp_banks.getSelectedItem().toString().contains("Telenor")) {
                        Spinner spinner = ActivityRoster.this.sp_banks;
                        int i25 = a;
                        int i26 = (((i25 & (-76)) | (75 & (~i25))) - (~((i25 & 75) << 1))) - 1;
                        b = i26 % 128;
                        if (i26 % 2 != 0) {
                            spinner.getSelectedItem().toString().contains("Mobilink");
                            throw null;
                        }
                        if (spinner.getSelectedItem().toString().contains("Mobilink") && ActivityRoster.this.sp_banks.getSelectedItem().toString().contains("U-Paisa")) {
                            if (ActivityRoster.this.et_easypaisa_number.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                                ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_easypaisa_number, "Account Number");
                                int i27 = a;
                                int i28 = i27 & 107;
                                int i29 = (i27 ^ 107) | i28;
                                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                                b = i30 % 128;
                                int i31 = i30 % 2;
                                return Boolean.FALSE;
                            }
                        } else if (ActivityRoster.this.et_account_number.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                            ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_account_number, "Account Number");
                            int i32 = b;
                            int i33 = (i32 & 39) + (i32 | 39);
                            a = i33 % 128;
                            int i34 = i33 % 2;
                            return Boolean.FALSE;
                        }
                    } else if (ActivityRoster.this.et_account_number.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                        ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_account_number, "Account Number");
                        int i35 = b;
                        int i36 = (i35 & 39) + (i35 | 39);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        return Boolean.FALSE;
                    }
                }
                if (ActivityRoster.this.sp_relation_to_household.getSelectedItemPosition() == 0) {
                    ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_relation_to_household, "or enter Relation to Household");
                    return Boolean.FALSE;
                }
                int checkedRadioButtonId4 = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                RadioGroup radioGroup = ActivityRoster.this.radioGroupGender;
                int i38 = a;
                int i39 = ((i38 | 27) << 1) - (i38 ^ 27);
                b = i39 % 128;
                if (i39 % 2 != 0) {
                    if (checkedRadioButtonId4 != radioGroup.getChildAt(0).getId()) {
                        if (ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId() != ActivityRoster.this.radioGroupGender.getChildAt(1).getId()) {
                            int i40 = b;
                            int i41 = i40 & 9;
                            int i42 = -(-(i40 | 9));
                            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                            a = i43 % 128;
                            int i44 = i43 % 2;
                            if (ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId() != ActivityRoster.this.radioGroupGender.getChildAt(2).getId()) {
                                Context context = this.d;
                                RadioGroup radioGroup2 = ActivityRoster.this.radioGroupGender;
                                int i45 = a;
                                int i46 = i45 & 83;
                                int i47 = (i45 ^ 83) | i46;
                                int i48 = (i46 & i47) + (i47 | i46);
                                b = i48 % 128;
                                int i49 = i48 % 2;
                                ivas.gov.bisp.enumeration.p026az.z.m(context, radioGroup2, "Gender");
                                return Boolean.FALSE;
                            }
                        }
                    }
                } else if (checkedRadioButtonId4 != radioGroup.getChildAt(0).getId()) {
                    if (ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId() != ActivityRoster.this.radioGroupGender.getChildAt(1).getId()) {
                        int i410 = b;
                        int i411 = i410 & 9;
                        int i412 = -(-(i410 | 9));
                        int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
                        a = i413 % 128;
                        int i414 = i413 % 2;
                        if (ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId() != ActivityRoster.this.radioGroupGender.getChildAt(2).getId()) {
                            Context context2 = this.d;
                            RadioGroup radioGroup3 = ActivityRoster.this.radioGroupGender;
                            int i415 = a;
                            int i416 = i415 & 83;
                            int i417 = (i415 ^ 83) | i416;
                            int i418 = (i416 & i417) + (i417 | i416);
                            b = i418 % 128;
                            int i419 = i418 % 2;
                            ivas.gov.bisp.enumeration.p026az.z.m(context2, radioGroup3, "Gender");
                            return Boolean.FALSE;
                        }
                    }
                }
                if (ActivityRoster.this.tv_dob.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                    ivas.gov.bisp.enumeration.p026az.z.n(this.d, "Please select date of birth");
                    return Boolean.FALSE;
                }
                ActivityRoster activityRoster6 = ActivityRoster.this;
                if (activityRoster6.aU >= 18.0d) {
                    if (activityRoster6.radioGroupCNICOptions.getCheckedRadioButtonId() == -1) {
                        ivas.gov.bisp.enumeration.p026az.z.m(this.d, ActivityRoster.this.radioGroupCNICOptions, "for cnic");
                        return Boolean.FALSE;
                    }
                    int checkedRadioButtonId5 = ActivityRoster.this.radioGroupCNICOptions.getCheckedRadioButtonId();
                    ActivityRoster activityRoster7 = ActivityRoster.this;
                    int i50 = a;
                    int i51 = ((i50 ^ 57) | (i50 & 57)) << 1;
                    int i52 = -((i50 & (-58)) | ((~i50) & 57));
                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                    b = i53 % 128;
                    int i54 = i53 % 2;
                    if (checkedRadioButtonId5 != activityRoster7.rb_afghani_por.getId()) {
                        int i55 = b;
                        int i56 = ((i55 & (-92)) | ((~i55) & 91)) + ((i55 & 91) << 1);
                        a = i56 % 128;
                        if (i56 % 2 == 0) {
                            ActivityRoster.this.radioGroupCNICOptions.getCheckedRadioButtonId();
                            obj.hashCode();
                            throw null;
                        }
                        int checkedRadioButtonId6 = ActivityRoster.this.radioGroupCNICOptions.getCheckedRadioButtonId();
                        int i57 = b;
                        int i58 = ((i57 & 14) + (i57 | 14)) - 1;
                        a = i58 % 128;
                        if (i58 % 2 == 0) {
                            int i59 = 24 / 0;
                            if (checkedRadioButtonId6 == ActivityRoster.this.rb_afghani_acc.getId()) {
                                if (ActivityRoster.this.por_roster.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                                    ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.por_roster, "POR/ACC");
                                    return Boolean.FALSE;
                                }
                            } else if (ActivityRoster.this.radioGroupCNICOptions.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonCNICPresent.getId()) {
                                strTrim = ActivityRoster.this.et_RosterCNIC.getText().toString().trim();
                                int i60 = a;
                                int i61 = i60 & 65;
                                int i62 = -(-((i60 ^ 65) | i61));
                                i = (i61 ^ i62) + ((i62 & i61) << 1);
                                b = i % 128;
                                if (i % 2 == 0) {
                                    strTrim.equals(BuildConfig.FLAVOR);
                                    obj.hashCode();
                                    throw null;
                                }
                                if ((!strTrim.equals(BuildConfig.FLAVOR)) && ActivityRoster.this.et_RosterCNIC.getText().toString().trim().length() == 15) {
                                    if (!ActivityRoster.this.et_RosterCNIC.getText().toString().trim().equals(ActivityRoster.this.et_RosterCNICRepeat.getText().toString().trim())) {
                                        int i63 = b;
                                        int i64 = i63 ^ 93;
                                        int i65 = -(-((i63 & 93) << 1));
                                        int i66 = (i64 & i65) + (i65 | i64);
                                        a = i66 % 128;
                                        int i67 = i66 % 2;
                                        ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_RosterCNICRepeat, "same CNIC number again");
                                        return Boolean.FALSE;
                                    }
                                    if (!ac.c(ActivityRoster.this.et_RosterCNIC.getText().toString().trim().replaceAll("-", BuildConfig.FLAVOR)) && !ac.i(ActivityRoster.this.et_RosterCNIC.getText().toString().trim().replaceAll("-", BuildConfig.FLAVOR))) {
                                        i2 = b + 5;
                                        a = i2 % 128;
                                        if (i2 % 2 != 0) {
                                            EditText editText = ActivityRoster.this.et_RosterCNIC;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (ac.d(ActivityRoster.this.et_RosterCNIC.getText().toString().trim().replaceAll("-", BuildConfig.FLAVOR))) {
                                            iD = ah.c().d("batchSize", 1);
                                            activityRoster3 = ActivityRoster.this;
                                            int i68 = b;
                                            int i69 = (-2) - (((i68 ^ 28) + ((i68 & 28) << 1)) ^ (-1));
                                            a = i69 % 128;
                                            int i70 = i69 % 2;
                                            if (ActivityRoster.v(activityRoster3) != null) {
                                                int i71 = a;
                                                i4 = ((i71 & 51) - (~(-(-(i71 | 51))))) - 1;
                                                b = i4 % 128;
                                                if (i4 % 2 == 0) {
                                                    boolean z4 = ag.d;
                                                    throw null;
                                                }
                                                if (ag.d) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("SELECT * FROM SURVEY WHERE batch_name = '");
                                                    sb.append(ActivityRoster.v(ActivityRoster.this).batchName);
                                                    sb.append("' LIMIT 0,");
                                                    sb.append(iD);
                                                    new ArrayList(SugarRecord.findWithQuery(Survey.class, sb.toString(), null));
                                                } else {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("SELECT * FROM SURVEY WHERE is_sent_to_supervisor = 0 LIMIT 0,");
                                                    sb2.append(iD);
                                                    new ArrayList(SugarRecord.findWithQuery(Survey.class, sb2.toString(), null));
                                                }
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append("SELECT * FROM SURVEY WHERE is_sent_to_supervisor = 0 LIMIT 0,");
                                                sb3.append(iD);
                                                new ArrayList(SugarRecord.findWithQuery(Survey.class, sb3.toString(), null));
                                            }
                                            if (ActivityRoster.this.linearLayoutCNICPic.getVisibility() == 0) {
                                                int i72 = a;
                                                int i73 = i72 & 55;
                                                i3 = (i73 - (~(-(-((i72 ^ 55) | i73))))) - 1;
                                                b = i3 % 128;
                                                if (i3 % 2 == 0) {
                                                    ActivityRoster.x(ActivityRoster.this);
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                if (ActivityRoster.x(ActivityRoster.this) == null) {
                                                    ivas.gov.bisp.enumeration.p026az.z.n(this.d, "Capture image of CNIC to proceed");
                                                    return Boolean.FALSE;
                                                }
                                            }
                                        }
                                    }
                                    ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_RosterCNICRepeat, "valid CNIC number");
                                    return Boolean.FALSE;
                                }
                                ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_RosterCNIC, "CNIC");
                                int i74 = b;
                                int i75 = i74 ^ 69;
                                int i76 = ((((i74 & 69) | i75) << 1) - (~(-i75))) - 1;
                                a = i76 % 128;
                                int i77 = i76 % 2;
                                return Boolean.FALSE;
                            }
                        } else if (checkedRadioButtonId6 == ActivityRoster.this.rb_afghani_acc.getId()) {
                            if (ActivityRoster.this.por_roster.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                                ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.por_roster, "POR/ACC");
                                return Boolean.FALSE;
                            }
                        } else if (ActivityRoster.this.radioGroupCNICOptions.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonCNICPresent.getId()) {
                            strTrim = ActivityRoster.this.et_RosterCNIC.getText().toString().trim();
                            int i610 = a;
                            int i611 = i610 & 65;
                            int i612 = -(-((i610 ^ 65) | i611));
                            i = (i611 ^ i612) + ((i612 & i611) << 1);
                            b = i % 128;
                            if (i % 2 == 0) {
                                strTrim.equals(BuildConfig.FLAVOR);
                                obj.hashCode();
                                throw null;
                            }
                            if (!strTrim.equals(BuildConfig.FLAVOR)) {
                                if (!ActivityRoster.this.et_RosterCNIC.getText().toString().trim().equals(ActivityRoster.this.et_RosterCNICRepeat.getText().toString().trim())) {
                                    int i613 = b;
                                    int i614 = i613 ^ 93;
                                    int i615 = -(-((i613 & 93) << 1));
                                    int i616 = (i614 & i615) + (i615 | i614);
                                    a = i616 % 128;
                                    int i617 = i616 % 2;
                                    ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_RosterCNICRepeat, "same CNIC number again");
                                    return Boolean.FALSE;
                                }
                                if (!ac.c(ActivityRoster.this.et_RosterCNIC.getText().toString().trim().replaceAll("-", BuildConfig.FLAVOR))) {
                                    i2 = b + 5;
                                    a = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        EditText editText2 = ActivityRoster.this.et_RosterCNIC;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (ac.d(ActivityRoster.this.et_RosterCNIC.getText().toString().trim().replaceAll("-", BuildConfig.FLAVOR))) {
                                        iD = ah.c().d("batchSize", 1);
                                        activityRoster3 = ActivityRoster.this;
                                        int i618 = b;
                                        int i619 = (-2) - (((i618 ^ 28) + ((i618 & 28) << 1)) ^ (-1));
                                        a = i619 % 128;
                                        int i78 = i619 % 2;
                                        if (ActivityRoster.v(activityRoster3) != null) {
                                            int i79 = a;
                                            i4 = ((i79 & 51) - (~(-(-(i79 | 51))))) - 1;
                                            b = i4 % 128;
                                            if (i4 % 2 == 0) {
                                                boolean z5 = ag.d;
                                                throw null;
                                            }
                                            if (ag.d) {
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append("SELECT * FROM SURVEY WHERE batch_name = '");
                                                sb4.append(ActivityRoster.v(ActivityRoster.this).batchName);
                                                sb4.append("' LIMIT 0,");
                                                sb4.append(iD);
                                                new ArrayList(SugarRecord.findWithQuery(Survey.class, sb4.toString(), null));
                                            } else {
                                                StringBuilder sb5 = new StringBuilder();
                                                sb5.append("SELECT * FROM SURVEY WHERE is_sent_to_supervisor = 0 LIMIT 0,");
                                                sb5.append(iD);
                                                new ArrayList(SugarRecord.findWithQuery(Survey.class, sb5.toString(), null));
                                            }
                                        } else {
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append("SELECT * FROM SURVEY WHERE is_sent_to_supervisor = 0 LIMIT 0,");
                                            sb6.append(iD);
                                            new ArrayList(SugarRecord.findWithQuery(Survey.class, sb6.toString(), null));
                                        }
                                        if (ActivityRoster.this.linearLayoutCNICPic.getVisibility() == 0) {
                                            int i710 = a;
                                            int i711 = i710 & 55;
                                            i3 = (i711 - (~(-(-((i710 ^ 55) | i711))))) - 1;
                                            b = i3 % 128;
                                            if (i3 % 2 == 0) {
                                                ActivityRoster.x(ActivityRoster.this);
                                                obj.hashCode();
                                                throw null;
                                            }
                                            if (ActivityRoster.x(ActivityRoster.this) == null) {
                                                ivas.gov.bisp.enumeration.p026az.z.n(this.d, "Capture image of CNIC to proceed");
                                                return Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_RosterCNICRepeat, "valid CNIC number");
                                return Boolean.FALSE;
                            }
                            ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_RosterCNIC, "CNIC");
                            int i712 = b;
                            int i713 = i712 ^ 69;
                            int i714 = ((((i712 & 69) | i713) << 1) - (~(-i713))) - 1;
                            a = i714 % 128;
                            int i715 = i714 % 2;
                            return Boolean.FALSE;
                        }
                    } else if (ActivityRoster.this.por_roster.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                        ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.por_roster, "POR/ACC");
                        return Boolean.FALSE;
                    }
                }
                if (ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonMale.getId()) {
                    ActivityRoster activityRoster8 = ActivityRoster.this;
                    double d2 = activityRoster8.aU;
                    int i80 = a;
                    int i81 = i80 | 73;
                    int i82 = i81 << 1;
                    int i83 = -((~(i80 & 73)) & i81);
                    int i84 = ((i82 | i83) << 1) - (i82 ^ i83);
                    b = i84 % 128;
                    if (i84 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (d2 >= 13.0d && activityRoster8.sp_marital_status.getSelectedItemPosition() == 0) {
                        Context context3 = this.d;
                        Spinner spinner2 = ActivityRoster.this.sp_marital_status;
                        int i85 = a;
                        int i86 = i85 & 51;
                        int i87 = (i85 ^ 51) | i86;
                        int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                        b = i88 % 128;
                        int i89 = i88 % 2;
                        ivas.gov.bisp.enumeration.p026az.z.o(context3, spinner2, " marital status");
                        return Boolean.FALSE;
                    }
                } else if (ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonFemale.getId()) {
                    int i90 = a;
                    int i91 = (i90 & 59) + (i90 | 59);
                    b = i91 % 128;
                    int i92 = i91 % 2;
                    ActivityRoster activityRoster9 = ActivityRoster.this;
                    if (activityRoster9.aU >= 10.0d && activityRoster9.sp_marital_status.getSelectedItemPosition() == 0) {
                        ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_marital_status, " marital status");
                        return Boolean.FALSE;
                    }
                }
                if (ActivityRoster.this.sp_disability.getSelectedItemPosition() == 0) {
                    ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_disability, "Disability");
                    return Boolean.FALSE;
                }
                if (ActivityRoster.this.sp_chronic_disease.getSelectedItemPosition() == 0) {
                    ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_chronic_disease, "Chronic Disease");
                    return Boolean.FALSE;
                }
                ActivityRoster activityRoster10 = ActivityRoster.this;
                if (activityRoster10.aU >= 4.0d) {
                    if (activityRoster10.sp_attended_school.getVisibility() != 0) {
                        ActivityRoster.this.runOnUiThread(new j(this));
                    } else if (ActivityRoster.this.sp_attended_school.getSelectedItemPosition() == 0) {
                        ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_attended_school, "attended school");
                        return Boolean.FALSE;
                    }
                    if (ActivityRoster.this.sp_highest_education.getVisibility() == 0) {
                        int i93 = b;
                        int i94 = ((i93 & 30) + (i93 | 30)) - 1;
                        a = i94 % 128;
                        if (i94 % 2 == 0) {
                            ActivityRoster.this.sp_highest_education.getSelectedItemPosition();
                            throw null;
                        }
                        if (ActivityRoster.this.sp_highest_education.getSelectedItemPosition() == 0) {
                            int i95 = a;
                            int i96 = (i95 & 13) + (i95 | 13);
                            b = i96 % 128;
                            if (i96 % 2 == 0) {
                                ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_highest_education, "Higher Education");
                                return Boolean.FALSE;
                            }
                            Spinner spinner3 = ActivityRoster.this.sp_highest_education;
                            throw null;
                        }
                    } else {
                        ActivityRoster activityRoster11 = ActivityRoster.this;
                        c cVar = new c(this);
                        int i97 = a;
                        int i98 = (((i97 | 54) << 1) - (i97 ^ 54)) - 1;
                        b = i98 % 128;
                        if (i98 % 2 != 0) {
                            activityRoster11.runOnUiThread(cVar);
                            throw null;
                        }
                        activityRoster11.runOnUiThread(cVar);
                    }
                }
                ActivityRoster activityRoster12 = ActivityRoster.this;
                double d3 = activityRoster12.aU;
                int i99 = b;
                int i100 = (i99 & (-90)) | ((~i99) & 89);
                int i101 = -(-((i99 & 89) << 1));
                int i102 = (i100 & i101) + (i101 | i100);
                a = i102 % 128;
                int i103 = i102 % 2;
                if (d3 >= 4.0d) {
                    if (!ivas.gov.bisp.enumeration.p026az.z.m(this.d, activityRoster12.radioGroupLanguage, "Language")) {
                        return Boolean.FALSE;
                    }
                    if (ActivityRoster.this.sp_work_activity.getVisibility() != 0) {
                        ActivityRoster.this.runOnUiThread(new h(this));
                    } else if (ActivityRoster.this.sp_work_activity.getSelectedItemPosition() == 0) {
                        int i104 = a;
                        int i105 = ((i104 & 23) - (~(i104 | 23))) - 1;
                        b = i105 % 128;
                        int i106 = i105 % 2;
                        ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_work_activity, "Work Activity");
                        int i107 = a;
                        int i108 = ((i107 | 10) << 1) - (i107 ^ 10);
                        int i109 = (i108 ^ (-1)) + (i108 << 1);
                        b = i109 % 128;
                        if (i109 % 2 == 0) {
                            return Boolean.FALSE;
                        }
                        Boolean bool = Boolean.FALSE;
                        throw null;
                    }
                    if (ActivityRoster.this.et_hoursWorked.getVisibility() == 0) {
                        int i110 = a + 31;
                        b = i110 % 128;
                        if (i110 % 2 != 0) {
                            string = ActivityRoster.this.et_hoursWorked.getText().toString();
                            int i111 = 5 / 0;
                        } else {
                            string = ActivityRoster.this.et_hoursWorked.getText().toString();
                        }
                        if (string.trim().equals(BuildConfig.FLAVOR)) {
                            ivas.gov.bisp.enumeration.p026az.z.k(this.d, ActivityRoster.this.et_hoursWorked, "Hours worked");
                            Boolean bool2 = Boolean.FALSE;
                            int i112 = a;
                            int i113 = ((i112 ^ 27) | (i112 & 27)) << 1;
                            int i114 = -(((~i112) & 27) | (i112 & (-28)));
                            int i115 = (i113 & i114) + (i114 | i113);
                            b = i115 % 128;
                            int i116 = i115 % 2;
                            return bool2;
                        }
                        String string2 = ActivityRoster.this.et_hoursWorked.getText().toString();
                        int i117 = a;
                        int i118 = i117 & 93;
                        int i119 = (i117 ^ 93) | i118;
                        int i120 = (i118 & i119) + (i119 | i118);
                        b = i120 % 128;
                        int i121 = i120 % 2;
                        if (Integer.parseInt(string2.trim()) > 84.0d) {
                            ivas.gov.bisp.enumeration.p026az.z.l(this.d, ActivityRoster.this.et_hoursWorked, "No. of work hours cannot be more than 84.0");
                            return Boolean.FALSE;
                        }
                    } else {
                        ActivityRoster.this.runOnUiThread(new r(this));
                    }
                    if (ActivityRoster.this.sp_employment_status.getVisibility() != 0) {
                        ActivityRoster activityRoster13 = ActivityRoster.this;
                        e eVar = new e(this);
                        int i122 = a;
                        int i123 = i122 ^ 1;
                        int i124 = ((((i122 & 1) | i123) << 1) - (~(-i123))) - 1;
                        b = i124 % 128;
                        int i125 = i124 % 2;
                        activityRoster13.runOnUiThread(eVar);
                    } else if (ActivityRoster.this.sp_employment_status.getSelectedItemPosition() == 0) {
                        int i126 = b;
                        int i127 = i126 ^ 51;
                        int i128 = -(-((i126 & 51) << 1));
                        int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
                        a = i129 % 128;
                        if (i129 % 2 != 0) {
                            ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_employment_status, "Employment Status");
                            return Boolean.FALSE;
                        }
                        ivas.gov.bisp.enumeration.p026az.z.o(this.d, ActivityRoster.this.sp_employment_status, "Employment Status");
                        obj.hashCode();
                        throw null;
                    }
                }
                if (ActivityRoster.this.bU.equals("female")) {
                    ActivityRoster activityRoster14 = ActivityRoster.this;
                    ArrayList<Item> arrayList = activityRoster14.aM;
                    int i130 = b;
                    int i131 = i130 & 3;
                    int i132 = ((((i130 ^ 3) | i131) << 1) - (~(-((i130 | 3) & (~i131))))) - 1;
                    a = i132 % 128;
                    int i133 = i132 % 2;
                    if (arrayList.get(activityRoster14.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 271) {
                        Toast toastMakeText = Toast.makeText(ActivityRoster.this.bN, "Female can't be husband", 0);
                        int i134 = b;
                        int i135 = (i134 & 8) + (i134 | 8);
                        int i136 = (i135 ^ (-1)) + (i135 << 1);
                        a = i136 % 128;
                        if (i136 % 2 != 0) {
                            toastMakeText.show();
                            return Boolean.FALSE;
                        }
                        toastMakeText.show();
                        int i137 = 85 / 0;
                        return Boolean.FALSE;
                    }
                }
                if (ag.g) {
                    if (ActivityRoster.w(ActivityRoster.this) != null && ActivityRoster.w(ActivityRoster.this).size() > 0) {
                        int i138 = 0;
                        while (true) {
                            if (i138 >= ActivityRoster.w(ActivityRoster.this).size()) {
                                d = -1.0d;
                                break;
                            }
                            if (((Roster) ActivityRoster.w(ActivityRoster.this).get(i138)).relation_to_household_id == 186) {
                                Object obj2 = ActivityRoster.w(ActivityRoster.this).get(i138);
                                int i139 = a;
                                int i140 = (i139 & 85) + (i139 | 85);
                                b = i140 % 128;
                                int i141 = i140 % 2;
                                d = ((Roster) obj2).age;
                                break;
                            }
                            int i142 = i138 - 102;
                            i138 = ((i142 & 103) - (~(-(-(i142 | 103))))) - 1;
                        }
                    } else {
                        d = -1.0d;
                        break;
                    }
                    if (d != -1.0d) {
                        ActivityRoster activityRoster15 = ActivityRoster.this;
                        if (activityRoster15.aM.get(activityRoster15.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 190) {
                            ActivityRoster activityRoster16 = ActivityRoster.this;
                            return Boolean.valueOf(ActivityRoster.y(activityRoster16, d, true, false, true, activityRoster16.getString(R.string.age_mother_father)));
                        }
                        ActivityRoster activityRoster17 = ActivityRoster.this;
                        if (activityRoster17.aM.get(activityRoster17.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 271) {
                            ActivityRoster activityRoster18 = ActivityRoster.this;
                            boolean zY = ActivityRoster.y(activityRoster18, d, false, false, false, activityRoster18.getString(R.string.age_husband));
                            int i143 = b;
                            int i144 = i143 & 103;
                            int i145 = -(-((i143 ^ 103) | i144));
                            int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                            a = i146 % 128;
                            if (i146 % 2 != 0) {
                                return Boolean.valueOf(zY);
                            }
                            int i147 = 57 / 0;
                            return Boolean.valueOf(zY);
                        }
                        ActivityRoster activityRoster19 = ActivityRoster.this;
                        if (activityRoster19.aM.get(activityRoster19.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 273) {
                            int i148 = b;
                            int i149 = i148 & 65;
                            int i150 = (((i148 ^ 65) | i149) << 1) - ((i148 | 65) & (~i149));
                            a = i150 % 128;
                            if (i150 % 2 == 0) {
                                activityRoster2 = ActivityRoster.this;
                                z2 = false;
                            } else {
                                activityRoster2 = ActivityRoster.this;
                                z2 = true;
                            }
                            boolean z6 = z2;
                            boolean zY2 = ActivityRoster.y(activityRoster2, d, z2, z6, z6, activityRoster2.getString(R.string.age_son_daughter));
                            int i151 = b;
                            int i152 = (((i151 ^ 39) | (i151 & 39)) << 1) - (((~i151) & 39) | (i151 & (-40)));
                            a = i152 % 128;
                            if (i152 % 2 != 0) {
                                return Boolean.valueOf(zY2);
                            }
                            Boolean.valueOf(zY2);
                            obj.hashCode();
                            throw null;
                        }
                        ActivityRoster activityRoster20 = ActivityRoster.this;
                        ArrayList<Item> arrayList2 = activityRoster20.aM;
                        int i153 = b;
                        int i154 = (((i153 ^ 105) | (i153 & 105)) << 1) - (((~i153) & 105) | (i153 & (-106)));
                        a = i154 % 128;
                        if (i154 % 2 == 0) {
                            item = arrayList2.get(activityRoster20.sp_relation_to_household.getSelectedItemPosition());
                            int i155 = 96 / 0;
                        } else {
                            item = arrayList2.get(activityRoster20.sp_relation_to_household.getSelectedItemPosition());
                        }
                        if (item.getOptionId() == 274) {
                            ActivityRoster activityRoster21 = ActivityRoster.this;
                            return Boolean.valueOf(ActivityRoster.y(activityRoster21, d, false, true, false, activityRoster21.getString(R.string.age_step_son_daughter)));
                        }
                        ActivityRoster activityRoster22 = ActivityRoster.this;
                        if (activityRoster22.aM.get(activityRoster22.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 189) {
                            int i156 = a;
                            int i157 = i156 & 31;
                            int i158 = -(-((i156 ^ 31) | i157));
                            int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
                            b = i159 % 128;
                            if (i159 % 2 != 0) {
                                activityRoster = ActivityRoster.this;
                                z = false;
                            } else {
                                activityRoster = ActivityRoster.this;
                                z = true;
                            }
                            return Boolean.valueOf(ActivityRoster.y(activityRoster, d, z, true, true, activityRoster.getString(R.string.age_grand_child)));
                        }
                        ActivityRoster activityRoster23 = ActivityRoster.this;
                        ArrayList<Item> arrayList3 = activityRoster23.aM;
                        Spinner spinner4 = activityRoster23.sp_relation_to_household;
                        int i160 = b;
                        int i161 = i160 & 101;
                        int i162 = i161 + ((i160 ^ 101) | i161);
                        a = i162 % 128;
                        int i163 = i162 % 2;
                        if (arrayList3.get(spinner4.getSelectedItemPosition()).getOptionId() == 192) {
                            int i164 = a;
                            int i165 = i164 & 29;
                            int i166 = (i164 ^ 29) | i165;
                            int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                            b = i167 % 128;
                            int i168 = i167 % 2;
                            ActivityRoster activityRoster24 = ActivityRoster.this;
                            return Boolean.valueOf(ActivityRoster.y(activityRoster24, d, false, true, false, activityRoster24.getString(R.string.age_nephew_niece)));
                        }
                        ActivityRoster activityRoster25 = ActivityRoster.this;
                        if (activityRoster25.aM.get(activityRoster25.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 193) {
                            ActivityRoster activityRoster26 = ActivityRoster.this;
                            Boolean boolValueOf = Boolean.valueOf(ActivityRoster.y(activityRoster26, d, false, true, false, activityRoster26.getString(R.string.age_son_daughter_in_law)));
                            int i169 = a;
                            int i170 = i169 & 59;
                            int i171 = (i170 - (~((i169 ^ 59) | i170))) - 1;
                            b = i171 % 128;
                            if (i171 % 2 == 0) {
                                return boolValueOf;
                            }
                            throw null;
                        }
                        ActivityRoster activityRoster27 = ActivityRoster.this;
                        if (activityRoster27.aM.get(activityRoster27.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 195) {
                            ActivityRoster activityRoster28 = ActivityRoster.this;
                            return Boolean.valueOf(ActivityRoster.y(activityRoster28, d, false, false, false, activityRoster28.getString(R.string.age_mother_father_in_law)));
                        }
                        ActivityRoster activityRoster29 = ActivityRoster.this;
                        if (activityRoster29.aM.get(activityRoster29.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 196) {
                            int i172 = a;
                            int i173 = i172 & 105;
                            int i174 = i172 | 105;
                            int i175 = (i173 & i174) + (i174 | i173);
                            b = i175 % 128;
                            int i176 = i175 % 2;
                            ActivityRoster activityRoster30 = ActivityRoster.this;
                            boolean zY3 = ActivityRoster.y(activityRoster30, d, true, false, true, activityRoster30.getString(R.string.age_grand_mother_father));
                            if (zY3) {
                                int i177 = b;
                                int i178 = i177 & 37;
                                int i179 = (i177 ^ 37) | i178;
                                int i180 = (i178 ^ i179) + ((i179 & i178) << 1);
                                a = i180 % 128;
                                int i181 = i180 % 2;
                                ActivityRoster activityRoster31 = ActivityRoster.this;
                                if (activityRoster31.aU - d < 20.0d) {
                                    int i182 = b;
                                    int i183 = i182 ^ 45;
                                    int i184 = ((i182 & 45) | i183) << 1;
                                    int i185 = -i183;
                                    int i186 = ((i184 | i185) << 1) - (i184 ^ i185);
                                    a = i186 % 128;
                                    int i187 = i186 % 2;
                                    ActivityRoster.z(activityRoster31, true, activityRoster31.getString(R.string.age_grand_mother_father_20));
                                } else {
                                    z3 = zY3;
                                }
                            } else {
                                z3 = zY3;
                            }
                            return Boolean.valueOf(z3);
                        }
                        ActivityRoster activityRoster32 = ActivityRoster.this;
                        if (activityRoster32.aM.get(activityRoster32.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 197) {
                            ActivityRoster activityRoster33 = ActivityRoster.this;
                            return Boolean.valueOf(ActivityRoster.y(activityRoster33, d, false, false, false, activityRoster33.getString(R.string.age_uncle_aunt)));
                        }
                    }
                }
                return Boolean.TRUE;
            } catch (Exception e) {
                this.e = e.getMessage();
                return Boolean.FALSE;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        if (ax.c(this)) {
            int i2 = p + 115;
            q = i2 % 128;
            int i3 = i2 % 2;
            this.btn_vald_cnic.setEnabled(true);
        }
        if (!this.bc) {
            int i4 = q + 35;
            p = i4 % 128;
            int i5 = i4 % 2;
            SharedPreferences sharedPreferences = ah.c.d;
            Object[] objArr = new Object[1];
            a(ExpandableListView.getPackedPositionChild(0L) + 17, (char) (getPackageName().length() - 25), getPackageName().codePointAt(8) + 1447, objArr);
            if (sharedPreferences.getInt(((String) objArr[0]).intern(), 1) == 1) {
                SharedPreferences sharedPreferences2 = ah.c.d;
                Object[] objArr2 = new Object[1];
                a(getPackageName().length() - 14, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), getApplicationInfo().targetSdkVersion + 1478, objArr2);
                this.ba = new Oooo000(sharedPreferences2.getInt(((String) objArr2[0]).intern(), 0) * 1000, 1000L).start();
                return;
            }
        }
        this.textViewTimeRemaining.setVisibility(8);
        this.btn_save.setEnabled(true);
        int i6 = p + 5;
        q = i6 % 128;
        int i7 = i6 % 2;
    }

    public class o000000 implements TextWatcher {
        private static int a = 0;
        private static int b = 1;

        public o000000(EditText editText) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b + 109;
            a = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = i5 & 57;
            int i7 = (((i5 | 57) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0278  */
        /* JADX WARN: Code duplicated, block: B:104:0x027c A[Catch: Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:109:0x02aa A[Catch: Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:112:0x02bf A[Catch: Exception -> 0x02cb, TRY_ENTER, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x02c2 A[Catch: Exception -> 0x02cb, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:115:0x02c5 A[Catch: Exception -> 0x02cb, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:13:0x002d A[Catch: Exception -> 0x02cb, PHI: r11
  0x002d: PHI (r11v10 ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster) = 
  (r11v9 ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster)
  (r11v88 ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster)
 binds: [B:12:0x002b, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:15:0x0031  */
        /* JADX WARN: Code duplicated, block: B:19:0x0059  */
        /* JADX WARN: Code duplicated, block: B:20:0x005d A[Catch: Exception -> 0x02cb, PHI: r11
  0x005d: PHI (r11v74 ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster) = 
  (r11v9 ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster)
  (r11v88 ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster)
 binds: [B:12:0x002b, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0078  */
        /* JADX WARN: Code duplicated, block: B:26:0x0082 A[Catch: Exception -> 0x02cb, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[Catch: Exception -> 0x02cb, TRY_ENTER, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00ac A[Catch: Exception -> 0x02cb, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00bf A[Catch: Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00f8 A[Catch: Exception -> 0x02cb, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:53:0x010d  */
        /* JADX WARN: Code duplicated, block: B:57:0x012b  */
        /* JADX WARN: Code duplicated, block: B:61:0x015c A[Catch: Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x0166  */
        /* JADX WARN: Code duplicated, block: B:64:0x0173 A[Catch: Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0198  */
        /* JADX WARN: Code duplicated, block: B:71:0x019a A[Catch: Exception -> 0x02cb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:83:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:86:0x0202  */
        /* JADX WARN: Code duplicated, block: B:92:0x023f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:93:0x0240  */
        /* JADX WARN: Code duplicated, block: B:98:0x0260 A[Catch: Exception -> 0x02cb, TRY_ENTER, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:99:0x0263 A[Catch: Exception -> 0x02cb, TRY_LEAVE, TryCatch #2 {Exception -> 0x02cb, blocks: (B:4:0x001a, B:6:0x0020, B:20:0x005d, B:24:0x007a, B:25:0x007d, B:27:0x0086, B:30:0x00a6, B:31:0x00a9, B:36:0x00bf, B:38:0x00d3, B:45:0x00f4, B:47:0x00f8, B:50:0x0105, B:54:0x0119, B:58:0x0141, B:61:0x015c, B:64:0x0173, B:66:0x0186, B:71:0x019a, B:72:0x01a1, B:73:0x01a4, B:76:0x01a7, B:78:0x01c2, B:81:0x01dd, B:84:0x01f8, B:87:0x020e, B:89:0x0222, B:95:0x0244, B:98:0x0260, B:99:0x0263, B:104:0x027c, B:106:0x0293, B:109:0x02aa, B:112:0x02bf, B:113:0x02c2, B:115:0x02c5, B:116:0x02c8, B:32:0x00ac, B:26:0x0082, B:13:0x002d, B:16:0x0048, B:11:0x0026), top: B:126:0x0018 }] */
        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ActivityRoster activityRoster;
            int i4;
            ActivityRoster activityRoster2;
            int i5;
            int checkedRadioButtonId;
            ActivityRoster activityRoster3;
            ActivityRoster activityRoster4;
            int i6;
            int i7;
            int i8;
            int checkedRadioButtonId2;
            int i9;
            int i10;
            TextView textView;
            int i11;
            TextView textView2;
            int i12;
            ActivityRoster activityRoster5;
            int i13;
            int i14 = 2 % 2;
            int i15 = a;
            int i16 = ((i15 | 11) << 1) - (i15 ^ 11);
            b = i16 % 128;
            Object obj = null;
            try {
                if (i16 % 2 == 0) {
                    activityRoster = ActivityRoster.this;
                    int i17 = 49 / 0;
                    if (!activityRoster.aX) {
                        activityRoster.F();
                        textView = ActivityRoster.this.vald_txt_view_caption;
                        int i18 = a;
                        int i19 = i18 ^ 73;
                        int i20 = ((i18 & 73) | i19) << 1;
                        int i21 = -i19;
                        i11 = (i20 & i21) + (i20 | i21);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            textView.setVisibility(107);
                        } else {
                            textView.setVisibility(8);
                        }
                        ActivityRoster.this.vald_txt_view.setVisibility(8);
                        textView2 = ActivityRoster.this.vald_name_txt_view;
                        int i22 = b;
                        int i23 = (i22 & (-116)) | ((~i22) & 115);
                        int i24 = -(-((i22 & 115) << 1));
                        i12 = (i23 ^ i24) + ((i24 & i23) << 1);
                        a = i12 % 128;
                        if (i12 % 2 != 0) {
                            textView2.setVisibility(82);
                        } else {
                            textView2.setVisibility(8);
                        }
                        activityRoster5 = ActivityRoster.this;
                        int i25 = b + 20;
                        i13 = (i25 ^ (-1)) + (i25 << 1);
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            activityRoster5.G();
                            try {
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        } else {
                            activityRoster5.G();
                            int i26 = a;
                            int i27 = i26 & 101;
                            int i28 = -(-(i26 | 101));
                            int i29 = (i27 & i28) + (i28 | i27);
                            b = i29 % 128;
                            int i30 = i29 % 2;
                        }
                    } else if (activityRoster.be) {
                        int i31 = a;
                        int i32 = i31 & 45;
                        int i33 = ((i31 ^ 45) | i32) << 1;
                        int i34 = -((i31 | 45) & (~i32));
                        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        activityRoster.aK = false;
                        int i37 = a;
                        i4 = (i37 ^ 71) + ((i37 & 71) << 1);
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i38 = 4 % 4;
                        }
                    }
                } else {
                    activityRoster = ActivityRoster.this;
                    if (!activityRoster.aX) {
                        activityRoster.F();
                        textView = ActivityRoster.this.vald_txt_view_caption;
                        int i110 = a;
                        int i111 = i110 ^ 73;
                        int i210 = ((i110 & 73) | i111) << 1;
                        int i211 = -i111;
                        i11 = (i210 & i211) + (i210 | i211);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            textView.setVisibility(107);
                        } else {
                            textView.setVisibility(8);
                        }
                        ActivityRoster.this.vald_txt_view.setVisibility(8);
                        textView2 = ActivityRoster.this.vald_name_txt_view;
                        int i212 = b;
                        int i213 = (i212 & (-116)) | ((~i212) & 115);
                        int i214 = -(-((i212 & 115) << 1));
                        i12 = (i213 ^ i214) + ((i214 & i213) << 1);
                        a = i12 % 128;
                        if (i12 % 2 != 0) {
                            textView2.setVisibility(82);
                        } else {
                            textView2.setVisibility(8);
                        }
                        activityRoster5 = ActivityRoster.this;
                        int i215 = b + 20;
                        i13 = (i215 ^ (-1)) + (i215 << 1);
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            activityRoster5.G();
                            throw null;
                        }
                        activityRoster5.G();
                        int i216 = a;
                        int i217 = i216 & 101;
                        int i218 = -(-(i216 | 101));
                        int i219 = (i217 & i218) + (i218 | i217);
                        b = i219 % 128;
                        int i39 = i219 % 2;
                    } else if (activityRoster.be) {
                        int i310 = a;
                        int i311 = i310 & 45;
                        int i312 = ((i310 ^ 45) | i311) << 1;
                        int i313 = -((i310 | 45) & (~i311));
                        int i314 = ((i312 | i313) << 1) - (i313 ^ i312);
                        b = i314 % 128;
                        int i315 = i314 % 2;
                        activityRoster.aK = false;
                        int i316 = a;
                        i4 = (i316 ^ 71) + ((i316 & 71) << 1);
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i317 = 4 % 4;
                        }
                    }
                }
                ActivityRoster activityRoster6 = ActivityRoster.this;
                int i40 = activityRoster6.ac;
                if (i40 != 1) {
                    int i41 = a;
                    int i42 = i41 & 49;
                    int i43 = (i41 | 49) & (~i42);
                    int i44 = -(-(i42 << 1));
                    int i45 = (i43 & i44) + (i43 | i44);
                    b = i45 % 128;
                    if (i45 % 2 != 0 ? i40 == 2 : i40 == 4) {
                        if (ag.j == 1) {
                            int i46 = b + 57;
                            a = i46 % 128;
                            int i47 = i46 % 2;
                            if (activityRoster6.aU < 18.0d) {
                                activityRoster6.checkBoxBispBenif.setVisibility(8);
                                activityRoster2 = ActivityRoster.this;
                                int i48 = a;
                                i5 = (i48 & 23) + (i48 | 23);
                                b = i5 % 128;
                                if (i5 % 2 == 0) {
                                    activityRoster2.aY = true;
                                    return;
                                } else {
                                    activityRoster2.aY = false;
                                    return;
                                }
                            }
                            int i49 = a;
                            int i50 = (i49 & 119) + (i49 | 119);
                            b = i50 % 128;
                            int i51 = i50 % 2;
                            if (activityRoster6.radioGroupCNICOptions.getCheckedRadioButtonId() != ActivityRoster.this.rb_afghani_acc.getId()) {
                                int i52 = b;
                                int i53 = i52 & 123;
                                int i54 = ((i52 ^ 123) | i53) << 1;
                                int i55 = -((i52 | 123) & (~i53));
                                int i56 = (i54 & i55) + (i55 | i54);
                                a = i56 % 128;
                                int i57 = i56 % 2;
                                checkedRadioButtonId2 = ActivityRoster.this.radioGroupCNICOptions.getCheckedRadioButtonId();
                                int i58 = b;
                                i9 = ((i58 ^ 65) - (~(-(-((i58 & 65) << 1))))) - 1;
                                a = i9 % 128;
                                if (i9 % 2 != 0) {
                                    ActivityRoster.this.rb_afghani_por.getId();
                                    try {
                                        obj.hashCode();
                                        throw null;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (checkedRadioButtonId2 != ActivityRoster.this.rb_afghani_por.getId()) {
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                    int i59 = a;
                                    int i60 = (i59 & 111) + (i59 | 111);
                                    b = i60 % 128;
                                    int i61 = i60 % 2;
                                    ActivityRoster.this.aY = false;
                                    int i62 = a;
                                    i10 = (i62 & 87) + (i62 | 87);
                                    b = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        int i63 = 97 / 0;
                                        return;
                                    }
                                    return;
                                }
                                int i64 = b;
                                int i65 = ((i64 & 82) + (82 | i64)) - 1;
                                a = i65 % 128;
                                int i66 = i65 % 2;
                            }
                            checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                            activityRoster3 = ActivityRoster.this;
                            int i67 = a;
                            int i68 = i67 ^ 115;
                            int i69 = ((((i67 & 115) | i68) << 1) - (~(-i68))) - 1;
                            b = i69 % 128;
                            int i70 = i69 % 2;
                            if (checkedRadioButtonId != activityRoster3.radioButtonFemale.getId()) {
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                int i71 = a;
                                int i72 = ((i71 & 121) - (~(-(-(i71 | 121))))) - 1;
                                b = i72 % 128;
                                int i73 = i72 % 2;
                                ActivityRoster.this.aY = false;
                                int i74 = b;
                                int i75 = i74 & 83;
                                int i76 = (((i74 ^ 83) | i75) << 1) - ((i74 | 83) & (~i75));
                                a = i76 % 128;
                                int i77 = i76 % 2;
                                return;
                            }
                            int i78 = a;
                            int i79 = i78 & 55;
                            int i80 = -(-((i78 ^ 55) | i79));
                            int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                            b = i81 % 128;
                            int i82 = i81 % 2;
                            if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                int i83 = b;
                                int i84 = i83 & 79;
                                int i85 = (i83 ^ 79) | i84;
                                int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                                a = i86 % 128;
                                int i87 = i86 % 2;
                                if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 1) {
                                    int i88 = a;
                                    int i89 = i88 & 97;
                                    int i90 = i89 + ((i88 ^ 97) | i89);
                                    b = i90 % 128;
                                    int i91 = i90 % 2;
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                    int i92 = b;
                                    int i93 = (((i92 | 4) << 1) - (i92 ^ 4)) - 1;
                                    a = i93 % 128;
                                    int i94 = i93 % 2;
                                    ActivityRoster.this.aY = true;
                                    int i95 = a;
                                    i8 = ((((i95 ^ 17) | (i95 & 17)) << 1) - (~(-(((~i95) & 17) | (i95 & (-18)))))) - 1;
                                    b = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        return;
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                            }
                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                            activityRoster4 = ActivityRoster.this;
                            int i96 = a;
                            int i97 = i96 & 83;
                            i6 = (i97 - (~(-(-((i96 ^ 83) | i97))))) - 1;
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                activityRoster4.aY = true;
                            } else {
                                activityRoster4.aY = false;
                            }
                            int i98 = b;
                            int i99 = i98 & 45;
                            int i100 = (i98 ^ 45) | i99;
                            i7 = (i99 ^ i100) + ((i100 & i99) << 1);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i101 = 27 / 0;
                                return;
                            }
                            return;
                        }
                    } else if (ag.d) {
                        if (ag.j == 1) {
                            int i410 = b + 57;
                            a = i410 % 128;
                            int i411 = i410 % 2;
                            if (activityRoster6.aU < 18.0d) {
                                activityRoster6.checkBoxBispBenif.setVisibility(8);
                                activityRoster2 = ActivityRoster.this;
                                int i412 = a;
                                i5 = (i412 & 23) + (i412 | 23);
                                b = i5 % 128;
                                if (i5 % 2 == 0) {
                                    activityRoster2.aY = true;
                                    return;
                                } else {
                                    activityRoster2.aY = false;
                                    return;
                                }
                            }
                            int i413 = a;
                            int i510 = (i413 & 119) + (i413 | 119);
                            b = i510 % 128;
                            int i511 = i510 % 2;
                            if (activityRoster6.radioGroupCNICOptions.getCheckedRadioButtonId() != ActivityRoster.this.rb_afghani_acc.getId()) {
                                int i512 = b;
                                int i513 = i512 & 123;
                                int i514 = ((i512 ^ 123) | i513) << 1;
                                int i515 = -((i512 | 123) & (~i513));
                                int i516 = (i514 & i515) + (i515 | i514);
                                a = i516 % 128;
                                int i517 = i516 % 2;
                                checkedRadioButtonId2 = ActivityRoster.this.radioGroupCNICOptions.getCheckedRadioButtonId();
                                int i518 = b;
                                i9 = ((i518 ^ 65) - (~(-(-((i518 & 65) << 1))))) - 1;
                                a = i9 % 128;
                                if (i9 % 2 != 0) {
                                    ActivityRoster.this.rb_afghani_por.getId();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (checkedRadioButtonId2 != ActivityRoster.this.rb_afghani_por.getId()) {
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                    int i519 = a;
                                    int i610 = (i519 & 111) + (i519 | 111);
                                    b = i610 % 128;
                                    int i611 = i610 % 2;
                                    ActivityRoster.this.aY = false;
                                    int i612 = a;
                                    i10 = (i612 & 87) + (i612 | 87);
                                    b = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        int i613 = 97 / 0;
                                        return;
                                    }
                                    return;
                                }
                                int i614 = b;
                                int i615 = ((i614 & 82) + (82 | i614)) - 1;
                                a = i615 % 128;
                                int i616 = i615 % 2;
                            }
                            checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                            activityRoster3 = ActivityRoster.this;
                            int i617 = a;
                            int i618 = i617 ^ 115;
                            int i619 = ((((i617 & 115) | i618) << 1) - (~(-i618))) - 1;
                            b = i619 % 128;
                            int i710 = i619 % 2;
                            if (checkedRadioButtonId != activityRoster3.radioButtonFemale.getId()) {
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                int i711 = a;
                                int i712 = ((i711 & 121) - (~(-(-(i711 | 121))))) - 1;
                                b = i712 % 128;
                                int i713 = i712 % 2;
                                ActivityRoster.this.aY = false;
                                int i714 = b;
                                int i715 = i714 & 83;
                                int i716 = (((i714 ^ 83) | i715) << 1) - ((i714 | 83) & (~i715));
                                a = i716 % 128;
                                int i717 = i716 % 2;
                                return;
                            }
                            int i718 = a;
                            int i719 = i718 & 55;
                            int i810 = -(-((i718 ^ 55) | i719));
                            int i811 = ((i719 | i810) << 1) - (i810 ^ i719);
                            b = i811 % 128;
                            int i812 = i811 % 2;
                            if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                int i813 = b;
                                int i814 = i813 & 79;
                                int i815 = (i813 ^ 79) | i814;
                                int i816 = ((i814 | i815) << 1) - (i815 ^ i814);
                                a = i816 % 128;
                                int i817 = i816 % 2;
                                if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 1) {
                                    int i818 = a;
                                    int i819 = i818 & 97;
                                    int i910 = i819 + ((i818 ^ 97) | i819);
                                    b = i910 % 128;
                                    int i911 = i910 % 2;
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                    int i912 = b;
                                    int i913 = (((i912 | 4) << 1) - (i912 ^ 4)) - 1;
                                    a = i913 % 128;
                                    int i914 = i913 % 2;
                                    ActivityRoster.this.aY = true;
                                    int i915 = a;
                                    i8 = ((((i915 ^ 17) | (i915 & 17)) << 1) - (~(-(((~i915) & 17) | (i915 & (-18)))))) - 1;
                                    b = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        return;
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                            }
                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                            activityRoster4 = ActivityRoster.this;
                            int i916 = a;
                            int i917 = i916 & 83;
                            i6 = (i917 - (~(-(-((i916 ^ 83) | i917))))) - 1;
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                activityRoster4.aY = true;
                            } else {
                                activityRoster4.aY = false;
                            }
                            int i918 = b;
                            int i919 = i918 & 45;
                            int i102 = (i918 ^ 45) | i919;
                            i7 = (i919 ^ i102) + ((i102 & i919) << 1);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i103 = 27 / 0;
                                return;
                            }
                            return;
                        }
                    }
                } else if (ag.j == 1) {
                    int i414 = b + 57;
                    a = i414 % 128;
                    int i415 = i414 % 2;
                    if (activityRoster6.aU < 18.0d) {
                        activityRoster6.checkBoxBispBenif.setVisibility(8);
                        activityRoster2 = ActivityRoster.this;
                        int i416 = a;
                        i5 = (i416 & 23) + (i416 | 23);
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            activityRoster2.aY = true;
                            return;
                        } else {
                            activityRoster2.aY = false;
                            return;
                        }
                    }
                    int i417 = a;
                    int i5110 = (i417 & 119) + (i417 | 119);
                    b = i5110 % 128;
                    int i5111 = i5110 % 2;
                    if (activityRoster6.radioGroupCNICOptions.getCheckedRadioButtonId() != ActivityRoster.this.rb_afghani_acc.getId()) {
                        int i5112 = b;
                        int i5113 = i5112 & 123;
                        int i5114 = ((i5112 ^ 123) | i5113) << 1;
                        int i5115 = -((i5112 | 123) & (~i5113));
                        int i5116 = (i5114 & i5115) + (i5115 | i5114);
                        a = i5116 % 128;
                        int i5117 = i5116 % 2;
                        checkedRadioButtonId2 = ActivityRoster.this.radioGroupCNICOptions.getCheckedRadioButtonId();
                        int i5118 = b;
                        i9 = ((i5118 ^ 65) - (~(-(-((i5118 & 65) << 1))))) - 1;
                        a = i9 % 128;
                        if (i9 % 2 != 0) {
                            ActivityRoster.this.rb_afghani_por.getId();
                            obj.hashCode();
                            throw null;
                        }
                        if (checkedRadioButtonId2 != ActivityRoster.this.rb_afghani_por.getId()) {
                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                            int i5119 = a;
                            int i6110 = (i5119 & 111) + (i5119 | 111);
                            b = i6110 % 128;
                            int i6111 = i6110 % 2;
                            ActivityRoster.this.aY = false;
                            int i6112 = a;
                            i10 = (i6112 & 87) + (i6112 | 87);
                            b = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i6113 = 97 / 0;
                                return;
                            }
                            return;
                        }
                        int i6114 = b;
                        int i6115 = ((i6114 & 82) + (82 | i6114)) - 1;
                        a = i6115 % 128;
                        int i6116 = i6115 % 2;
                    }
                    checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                    activityRoster3 = ActivityRoster.this;
                    int i6117 = a;
                    int i6118 = i6117 ^ 115;
                    int i6119 = ((((i6117 & 115) | i6118) << 1) - (~(-i6118))) - 1;
                    b = i6119 % 128;
                    int i7110 = i6119 % 2;
                    if (checkedRadioButtonId != activityRoster3.radioButtonFemale.getId()) {
                        ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                        int i7111 = a;
                        int i7112 = ((i7111 & 121) - (~(-(-(i7111 | 121))))) - 1;
                        b = i7112 % 128;
                        int i7113 = i7112 % 2;
                        ActivityRoster.this.aY = false;
                        int i7114 = b;
                        int i7115 = i7114 & 83;
                        int i7116 = (((i7114 ^ 83) | i7115) << 1) - ((i7114 | 83) & (~i7115));
                        a = i7116 % 128;
                        int i7117 = i7116 % 2;
                        return;
                    }
                    int i7118 = a;
                    int i7119 = i7118 & 55;
                    int i8110 = -(-((i7118 ^ 55) | i7119));
                    int i8111 = ((i7119 | i8110) << 1) - (i8110 ^ i7119);
                    b = i8111 % 128;
                    int i8112 = i8111 % 2;
                    if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 0) {
                        int i8113 = b;
                        int i8114 = i8113 & 79;
                        int i8115 = (i8113 ^ 79) | i8114;
                        int i8116 = ((i8114 | i8115) << 1) - (i8115 ^ i8114);
                        a = i8116 % 128;
                        int i8117 = i8116 % 2;
                        if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 1) {
                            int i8118 = a;
                            int i8119 = i8118 & 97;
                            int i9110 = i8119 + ((i8118 ^ 97) | i8119);
                            b = i9110 % 128;
                            int i9111 = i9110 % 2;
                            ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                            int i9112 = b;
                            int i9113 = (((i9112 | 4) << 1) - (i9112 ^ 4)) - 1;
                            a = i9113 % 128;
                            int i9114 = i9113 % 2;
                            ActivityRoster.this.aY = true;
                            int i9115 = a;
                            i8 = ((((i9115 ^ 17) | (i9115 & 17)) << 1) - (~(-(((~i9115) & 17) | (i9115 & (-18)))))) - 1;
                            b = i8 % 128;
                            if (i8 % 2 != 0) {
                                return;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    }
                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                    activityRoster4 = ActivityRoster.this;
                    int i9116 = a;
                    int i9117 = i9116 & 83;
                    i6 = (i9117 - (~(-(-((i9116 ^ 83) | i9117))))) - 1;
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        activityRoster4.aY = true;
                    } else {
                        activityRoster4.aY = false;
                    }
                    int i9118 = b;
                    int i9119 = i9118 & 45;
                    int i104 = (i9118 ^ 45) | i9119;
                    i7 = (i9119 ^ i104) + ((i104 & i9119) << 1);
                    a = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i105 = 27 / 0;
                        return;
                    }
                    return;
                }
            } catch (Exception unused) {
            }
            int i106 = a;
            int i107 = ((i106 & 48) + (i106 | 48)) - 1;
            b = i107 % 128;
            int i108 = i107 % 2;
        }
    }

    public class o0OO00O implements J {
        private static int a = 0;
        private static int b = 1;

        public o0OO00O() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int optionId;
            Roster roster;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 13;
            int i4 = ((i2 | 13) & (~i3)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            ActivityRoster.this.aJ = arrayList;
            int i6 = a;
            int i7 = ((i6 | 21) << 1) - (((~i6) & 21) | (i6 & (-22)));
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (true) {
                if (i9 >= ActivityRoster.this.aJ.size()) {
                    int i10 = a;
                    int i11 = i10 & 123;
                    int i12 = (i10 ^ 123) | i11;
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    i9 = 0;
                    break;
                }
                int i15 = b;
                int i16 = (i15 & 103) + (i15 | 103);
                a = i16 % 128;
                int i17 = i16 % 2;
                Item item = ActivityRoster.this.aJ.get(i9);
                int i18 = a;
                int i19 = i18 & 97;
                int i20 = -(-(i18 | 97));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    optionId = item.getOptionId();
                    roster = ActivityRoster.this.bk;
                    int i22 = 88 / 0;
                } else {
                    optionId = item.getOptionId();
                    roster = ActivityRoster.this.bk;
                }
                if (optionId == roster.marital_status) {
                    break;
                }
                int i23 = b + 15;
                int i24 = i23 % 128;
                a = i24;
                if (i23 % 2 != 0) {
                    int i25 = i9 - 18;
                    i9 = (i25 & 49) + (i25 | 49);
                } else {
                    int i26 = ((i9 ^ (-71)) | (i9 & (-71))) << 1;
                    int i27 = -(((~i9) & (-71)) | (i9 & 70));
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    int i29 = (i28 & (-73)) | ((~i28) & 72);
                    int i30 = -(-((i28 & 72) << 1));
                    i9 = (i29 ^ i30) + ((i29 & i30) << 1);
                }
                int i31 = i24 + 89;
                b = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 3 / 4;
                }
            }
            ActivityRoster.this.sp_marital_status.setSelection(i9);
            Spinner spinner = ActivityRoster.this.sp_marital_status;
            int i33 = b;
            int i34 = (i33 ^ 79) + ((i33 & 79) << 1);
            a = i34 % 128;
            if (i34 % 2 != 0) {
                spinner.setEnabled(true);
            } else {
                spinner.setEnabled(false);
            }
        }
    }

    public static void u(ActivityRoster activityRoster, int i, int i2, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = q + 25;
        p = i6 % 128;
        int i7 = i6 % 2;
        activityRoster.sp_marital_status.setSelection(0);
        int i8 = GregorianCalendar.getInstance().get(1) - i3;
        if (i2 == 0) {
            int i9 = p + 7;
            q = i9 % 128;
            i4 = i9 % 2 == 0 ? GregorianCalendar.getInstance().get(5) : GregorianCalendar.getInstance().get(2) + 1;
        } else {
            if (i2 > GregorianCalendar.getInstance().get(2) + 1) {
                int i10 = p + 53;
                q = i10 % 128;
                i8 = i10 % 2 == 0 ? i8 % 1 : i8 - 1;
            }
            i4 = (GregorianCalendar.getInstance().get(2) + 1) - i2;
            if (i4 < 0) {
                i4 += 12;
                int i11 = p + 83;
                q = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        String string = activityRoster.tv_dob.getText().toString();
        activityRoster.bE = string;
        Object[] objArr = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 1, (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 26827), ViewConfiguration.getWindowTouchSlop() >> 8, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, (char) (Gravity.getAbsoluteGravity(0, 0) + 26826), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr2);
        activityRoster.O(string, ivas.gov.bisp.enumeration.p091n.j.l(i, strIntern, i4, ((String) objArr2[0]).intern(), i8));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = p + 75;
        q = i3 % 128;
        int i4 = i3 % 2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            int i5 = p;
            int i6 = i5 + 13;
            q = i6 % 128;
            int i7 = i6 % 2;
            if (iArr.length > 0) {
                int i8 = i5 + 27;
                q = i8 % 128;
                if (i8 % 2 != 0 ? iArr[0] == 0 : iArr[0] == 0) {
                    startActivityForResult(new Intent(getApplicationContext(), (Class<?>) BarCodeReader.class), 200);
                    int i9 = p + 35;
                    q = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 13 / 0;
                        return;
                    }
                    return;
                }
            }
            int i11 = k.d;
            Object[] objArr = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 6, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 59104), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1249, objArr);
            if (shouldShowRequestPermissionRationale(((String) objArr[0]).intern())) {
                Object[] objArr2 = new Object[1];
                a(getPackageName().length(), (char) (getPackageName().length() + 59083), getPackageName().length() + 1228, objArr2);
                if (shouldShowRequestPermissionRationale(((String) objArr2[0]).intern())) {
                    b.aIz aiz = new b.aIz(this);
                    AlertController.OooO0O0 oooO0O0 = aiz.a;
                    Object[] objArr3 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 21, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1278 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
                    oooO0O0.e = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    a(getPackageName().length() + 34, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), 1288 - Color.argb(0, 0, 0, 0), objArr4);
                    oooO0O0.f = ((String) objArr4[0]).intern();
                    o00Oo0 o00oo0 = new o00Oo0();
                    Object[] objArr5 = new Object[1];
                    a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 34, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 40377), 1347 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr5);
                    oooO0O0.h = ((String) objArr5[0]).intern();
                    oooO0O0.i = o00oo0;
                    o00O0O o00o0o = new o00O0O();
                    Object[] objArr6 = new Object[1];
                    a(getPackageName().length() - 19, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1512), 1349 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr6);
                    oooO0O0.a = ((String) objArr6[0]).intern();
                    oooO0O0.j = o00o0o;
                    aiz.d();
                    return;
                }
            }
            b.aIz aiz2 = new b.aIz(this);
            AlertController.OooO0O0 oooO0O1 = aiz2.a;
            Object[] objArr7 = new Object[1];
            a(10 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), (char) (getApplicationInfo().targetSdkVersion - 31), getPackageName().length() + 1330, objArr7);
            oooO0O1.e = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 123, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 59957), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1367, objArr8);
            oooO0O1.f = ((String) objArr8[0]).intern();
            oo000o oo000oVar = new oo000o();
            Object[] objArr9 = new Object[1];
            a(View.getDefaultSize(0, 0) + 2, (char) (getPackageName().codePointAt(6) + 40270), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 1310, objArr9);
            oooO0O1.h = ((String) objArr9[0]).intern();
            oooO0O1.i = oo000oVar;
            o00Ooo o00ooo = new o00Ooo();
            Object[] objArr10 = new Object[1];
            a(getPackageName().codePointAt(17) - 103, (char) (getApplicationInfo().targetSdkVersion + 1485), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 1313, objArr10);
            oooO0O1.a = ((String) objArr10[0]).intern();
            oooO0O1.j = o00ooo;
            aiz2.d();
        }
    }

    public static void B(Activity activity) {
        int i = 2 % 2;
        Intent intent = new Intent();
        Object[] objArr = new Object[1];
        a(Color.red(0) + 45, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        intent.setAction(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(7 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)), 46 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        intent.setData(Uri.fromParts(((String) objArr2[0]).intern(), activity.getPackageName(), null));
        activity.startActivity(intent);
        int i2 = p + 11;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = p + 57;
        q = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            obj.hashCode();
            throw null;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            int i5 = p;
            int i6 = i5 + 113;
            q = i6 % 128;
            int i7 = i6 % 2;
            if (i != 200) {
                if (i == 1034) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = 8;
                        Bitmap bitmapF = ivas.gov.bisp.enumeration.p026az.P.f(null, BitmapFactory.decodeFile(null, options));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapF.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                        this.bb = byteArrayOutputStream.toByteArray();
                        this.imageViewCnic.setImageBitmap(Bitmap.createScaledBitmap(bitmapF, 80, 80, true));
                        this.imageViewCnic.setVisibility(0);
                        File file = new File((String) null);
                        if (file.exists()) {
                            file.delete();
                        }
                        Object[] objArr = new Object[1];
                        a(12 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 34499), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1102, objArr);
                        Toast.makeText(this, ((String) objArr[0]).intern(), 1).show();
                        return;
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr2 = new Object[1];
                        a(19 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getPackageName().length() + 1093, objArr2);
                        sb.append(((String) objArr2[0]).intern());
                        sb.append(e.getMessage());
                        Toast.makeText(this, sb.toString(), 0).show();
                        return;
                    }
                }
                return;
            }
            try {
                if (intent == null) {
                    U();
                    int i8 = p + 91;
                    q = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i9 = i5 + 111;
                q = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr3 = new Object[1];
                a(11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (getApplicationInfo().targetSdkVersion + 12949), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 1026, objArr3);
                String stringExtra = intent.getStringExtra(((String) objArr3[0]).intern());
                if (stringExtra.length() == 0) {
                    U();
                    return;
                }
                int i11 = p + 31;
                q = i11 % 128;
                if (i11 % 2 == 0) {
                    if (stringExtra.length() == 60) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(stringExtra.substring(0, 5));
                        Object[] objArr4 = new Object[1];
                        a(getPackageName().codePointAt(7) - 117, (char) (getApplicationInfo().targetSdkVersion + 26795), ExpandableListView.getPackedPositionType(0L), objArr4);
                        sb2.append(((String) objArr4[0]).intern());
                        sb2.append(stringExtra.substring(5, 12));
                        Object[] objArr5 = new Object[1];
                        a(getPackageName().codePointAt(12) - 111, (char) (getApplicationInfo().targetSdkVersion + 26795), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr5);
                        sb2.append(((String) objArr5[0]).intern());
                        sb2.append(stringExtra.substring(12));
                        stringExtra = sb2.toString();
                    }
                } else if (stringExtra.length() == 13) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(stringExtra.substring(0, 5));
                    Object[] objArr6 = new Object[1];
                    a(getPackageName().codePointAt(7) - 117, (char) (getApplicationInfo().targetSdkVersion + 26795), ExpandableListView.getPackedPositionType(0L), objArr6);
                    sb3.append(((String) objArr6[0]).intern());
                    sb3.append(stringExtra.substring(5, 12));
                    Object[] objArr7 = new Object[1];
                    a(getPackageName().codePointAt(12) - 111, (char) (getApplicationInfo().targetSdkVersion + 26795), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr7);
                    sb3.append(((String) objArr7[0]).intern());
                    sb3.append(stringExtra.substring(12));
                    stringExtra = sb3.toString();
                }
                this.et_RosterCNIC.setText(stringExtra);
                this.et_RosterCNICRepeat.setText(stringExtra);
            } catch (Exception e2) {
                BISPApplication bISPApplication = this.bN;
                Object[] objArr8 = new Object[1];
                a(20 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (Color.alpha(0) + 39110), 1086 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr8);
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(((String) objArr8[0]).intern());
                sbW.append(e2.getMessage());
                Toast.makeText(bISPApplication, sbW.toString(), 0).show();
            }
        }
    }

    @OnClick
    public void scanBioClicked(View view) {
        int i = 2 % 2;
        if (!A(this, this.bP)) {
            k.c(this, this.bP, this.cd);
            return;
        }
        this.ag.setChecked(true);
        this.ah.setChecked(false);
        this.ai.setImageResource(R.drawable.image_boarder);
        if (this.bQ.isShowing()) {
            int i2 = p + 109;
            q = i2 % 128;
            int i3 = i2 % 2;
            this.bQ.dismiss();
        }
        this.bQ.show();
        int iF = this.ak.f();
        int iH = this.ak.h();
        int iJ = this.ak.j();
        if (iH == 1 && iJ == 1) {
            int i4 = p + 55;
            q = i4 % 128;
            if (i4 % 2 != 0 ? iF == 1 : iF == 1) {
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                this.al = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new o000OOo());
                this.bX = true;
                return;
            }
        }
        Context applicationContext = getApplicationContext();
        Object[] objArr = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 9, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 35046), getPackageName().length() + 1572, objArr);
        Toast.makeText(applicationContext, ((String) objArr[0]).intern(), 0).show();
        if (this.bQ.isShowing()) {
            int i5 = q + 115;
            p = i5 % 128;
            int i6 = i5 % 2;
            this.bQ.dismiss();
        }
        this.bQ.hide();
    }

    public class OooO implements RadioGroup.OnCheckedChangeListener {
        private static int a = 1;
        private static int b;

        public OooO() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0095  */
        /* JADX WARN: Code duplicated, block: B:17:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:18:0x00b3  */
        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 ^ 47;
            int i6 = ((i4 & 47) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            if (i == ActivityRoster.this.radioButtonLanguage_yes.getId()) {
                int i10 = a;
                int i11 = i10 & 71;
                int i12 = (i10 ^ 71) | i11;
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
                ActivityRoster.this.sp_attended_school.setVisibility(0);
                return;
            }
            if (i == ActivityRoster.this.radioButtonLanguage_no.getId()) {
                int i15 = b;
                int i16 = i15 & 11;
                int i17 = -(-(i15 | 11));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                a = i18 % 128;
                int i19 = i18 % 2;
                ActivityRoster.this.sp_attended_school.setVisibility(8);
                ActivityRoster activityRoster = ActivityRoster.this;
                int i20 = a;
                int i21 = i20 ^ 93;
                int i22 = -(-((i20 & 93) << 1));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                if (i23 % 2 != 0) {
                    activityRoster.sp_attended_school.setSelection(0);
                    if (ActivityRoster.this.sp_highest_education.getVisibility() == 0) {
                        ActivityRoster.this.sp_highest_education.setVisibility(8);
                        i2 = (-2) - ((b + 26) ^ (-1));
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            ActivityRoster.this.sp_highest_education.setSelection(1);
                        } else {
                            ActivityRoster.this.sp_highest_education.setSelection(0);
                        }
                    }
                } else {
                    activityRoster.sp_attended_school.setSelection(1);
                    if (ActivityRoster.this.sp_highest_education.getVisibility() == 0) {
                        ActivityRoster.this.sp_highest_education.setVisibility(8);
                        i2 = (-2) - ((b + 26) ^ (-1));
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            ActivityRoster.this.sp_highest_education.setSelection(1);
                        } else {
                            ActivityRoster.this.sp_highest_education.setSelection(0);
                        }
                    }
                }
            }
            int i24 = a;
            int i25 = ((i24 & (-96)) | ((~i24) & 95)) + ((i24 & 95) << 1);
            b = i25 % 128;
            if (i25 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final double H(int i, int i2, int i3, boolean z) {
        double d;
        int i4 = 2 % 2;
        this.sp_marital_status.setSelection(0);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        Object[] objArr = new Object[1];
        a(getPackageName().codePointAt(7) - 117, (char) (26826 - (ViewConfiguration.getPressedStateDuration() >> 16)), getApplicationInfo().targetSdkVersion - 31, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a(1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (getApplicationInfo().targetSdkVersion + 26795), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(i3);
        String string = sb.toString();
        Object[] objArr3 = new Object[1];
        a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 11, (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 196, objArr3);
        Date dateH = ivas.gov.bisp.enumeration.p026az.z.h(string, ((String) objArr3[0]).intern());
        Date date = new Date();
        GregorianCalendar gregorianCalendarY = ivas.gov.bisp.enumeration.p091n.j.y(dateH);
        GregorianCalendar gregorianCalendarY2 = ivas.gov.bisp.enumeration.p091n.j.y(date);
        int i5 = gregorianCalendarY2.get(1) - gregorianCalendarY.get(1);
        if (i5 > 115) {
            int i6 = q + 123;
            int i7 = i6 % 128;
            p = i7;
            int i8 = i6 % 2;
            if (!(!z)) {
                int i9 = i7 + 85;
                q = i9 % 128;
                if (i9 % 2 == 0) {
                    this.spinnerYear.setSelection(1);
                    this.spinnerMonth.setSelection(1);
                } else {
                    this.spinnerYear.setSelection(0);
                    this.spinnerMonth.setSelection(0);
                }
            }
            return i5;
        }
        if (gregorianCalendarY2.get(2) + 1 < gregorianCalendarY.get(2) + 1) {
            d = gregorianCalendarY2.get(2) + 1 + (12 - (gregorianCalendarY.get(2) + 1));
            i5--;
        } else {
            d = (gregorianCalendarY2.get(2) + 1) - (gregorianCalendarY.get(2) + 1);
        }
        String string2 = this.tv_dob.getText().toString();
        this.bE = string2;
        Object[] objArr4 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 3, (char) (getPackageName().length() + 26801), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 114, (char) ((-16750390) - Color.rgb(0, 0, 0)), getPackageName().length() - 25, objArr5);
        O(string2, ivas.gov.bisp.enumeration.p091n.j.l(i, strIntern, i2, ((String) objArr5[0]).intern(), i3));
        if (z) {
            this.spinnerYear.setSelection(i5);
            this.spinnerMonth.setSelection((int) d);
        }
        return i5;
    }

    public class OooO0OO implements J {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            ActivityRoster activityRoster;
            Spinner spinner;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 43;
            int i5 = (i4 - (~((i3 ^ 43) | i4))) - 1;
            b = i5 % 128;
            int i6 = 0;
            if (i5 % 2 == 0) {
                activityRoster = ActivityRoster.this;
                activityRoster.bf = arrayList;
                spinner = activityRoster.sp_employment_status;
                int i7 = 63 / 0;
            } else {
                activityRoster = ActivityRoster.this;
                activityRoster.bf = arrayList;
                spinner = activityRoster.sp_employment_status;
            }
            int i8 = b;
            int i9 = (i8 ^ 61) + ((i8 & 61) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            activityRoster.R(arrayList, spinner);
            ActivityRoster activityRoster2 = ActivityRoster.this;
            BISPApplication bISPApplication = activityRoster2.bN;
            ArrayList<Item> arrayList2 = activityRoster2.bf;
            int i11 = a;
            int i12 = ((i11 | 107) << 1) - (i11 ^ 107);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                bISPApplication.M = arrayList2;
                i = 1;
            } else {
                bISPApplication.M = arrayList2;
                i = 0;
            }
            while (i < ActivityRoster.this.bf.size()) {
                int i13 = b;
                int i14 = ((i13 | 79) << 1) - (((~i13) & 79) | (i13 & (-80)));
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    ActivityRoster.this.bf.get(i);
                    throw null;
                }
                int optionId = ActivityRoster.this.bf.get(i).getOptionId();
                Roster roster = ActivityRoster.this.bk;
                int i15 = b;
                int i16 = i15 ^ 69;
                int i17 = -(-((i15 & 69) << 1));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                a = i18 % 128;
                int i19 = i18 % 2;
                if (optionId == roster.employment_status) {
                    int i20 = b;
                    int i21 = (i20 & 59) + (i20 | 59);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = i20 + 89;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    i6 = i;
                    break;
                }
                int i25 = i & 104;
                int i26 = (i | 104) & (~i25);
                int i27 = -(-(i25 << 1));
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                int i29 = i28 & (-103);
                int i30 = i28 | (-103);
                i = ((i29 & i30) << 1) + (i29 ^ i30);
                int i31 = a + 99;
                b = i31 % 128;
                int i32 = i31 % 2;
            }
            ActivityRoster.this.sp_employment_status.setSelection(i6);
            int i33 = b;
            int i34 = ((i33 ^ 16) + ((i33 & 16) << 1)) - 1;
            a = i34 % 128;
            int i35 = i34 % 2;
        }
    }

    public class OooOOOO implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public OooOOOO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 79;
            int i4 = (i2 & 79) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00da  */
        /* JADX WARN: Code duplicated, block: B:33:0x011a  */
        /* JADX WARN: Code duplicated, block: B:43:0x0150  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ActivityRoster activityRoster;
            TextView textView;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 & 17;
            int i6 = -(-((i4 ^ 17) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                ActivityRoster.this.radioGroupCalendar.getCheckedRadioButtonId();
                obj.hashCode();
                throw null;
            }
            int checkedRadioButtonId = ActivityRoster.this.radioGroupCalendar.getCheckedRadioButtonId();
            ActivityRoster activityRoster2 = ActivityRoster.this;
            int i8 = b + 109;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                activityRoster2.radioButtonCalendarNo.getId();
                throw null;
            }
            if (checkedRadioButtonId == activityRoster2.radioButtonCalendarNo.getId()) {
                int i9 = a;
                int i10 = i9 ^ 11;
                int i11 = ((i9 & 11) | i10) << 1;
                int i12 = -i10;
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                b = i13 % 128;
                if (i13 % 2 == 0 ? i > 115 : i > 114) {
                    Toast.makeText(ActivityRoster.this.ae, "Maximum Age should be 115", 0).show();
                    int i14 = a;
                    int i15 = i14 & 101;
                    int i16 = (i14 | 101) & (~i15);
                    int i17 = i15 << 1;
                    int i18 = (i16 & i17) + (i16 | i17);
                    b = i18 % 128;
                    if (i18 % 2 != 0) {
                        ActivityRoster.this.N();
                        activityRoster = ActivityRoster.this;
                        textView = activityRoster.tv_dob;
                        int i19 = 16 / 0;
                    } else {
                        ActivityRoster.this.N();
                        activityRoster = ActivityRoster.this;
                        textView = activityRoster.tv_dob;
                    }
                    int i20 = b;
                    int i21 = i20 & 83;
                    int i22 = -(-(i20 | 83));
                    int i23 = (i21 & i22) + (i22 | i21);
                    a = i23 % 128;
                    if (i23 % 2 != 0) {
                        textView.setText(BuildConfig.FLAVOR);
                        activityRoster.bW = BuildConfig.FLAVOR;
                        return;
                    } else {
                        textView.setText(BuildConfig.FLAVOR);
                        activityRoster.bW = BuildConfig.FLAVOR;
                        throw null;
                    }
                }
                ActivityRoster activityRoster3 = ActivityRoster.this;
                activityRoster3.aU = i;
                if (i <= 0) {
                    int i24 = b;
                    int i25 = i24 + 11;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    if (i == 0) {
                        int i27 = i24 & 21;
                        int i28 = (((i24 | 21) & (~i27)) - (~(-(-(i27 << 1))))) - 1;
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        if (activityRoster3.spinnerMonth.getSelectedItemPosition() > 0) {
                            ActivityRoster activityRoster4 = ActivityRoster.this;
                            int selectedItemPosition = activityRoster4.spinnerMonth.getSelectedItemPosition();
                            int i30 = a;
                            int i31 = i30 & 109;
                            int i32 = ((i30 ^ 109) | i31) << 1;
                            int i33 = -((i30 | 109) & (~i31));
                            int i34 = (i32 & i33) + (i33 | i32);
                            b = i34 % 128;
                            int i35 = i34 % 2;
                            ActivityRoster.u(activityRoster4, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                            int i36 = a;
                            i2 = (((i36 ^ 95) | (i36 & 95)) << 1) - (((~i36) & 95) | (i36 & (-96)));
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                int i37 = 5 / 4;
                            }
                        }
                    }
                } else {
                    ActivityRoster activityRoster5 = ActivityRoster.this;
                    int selectedItemPosition2 = activityRoster5.spinnerMonth.getSelectedItemPosition();
                    int i38 = a;
                    int i39 = i38 & 109;
                    int i310 = ((i38 ^ 109) | i39) << 1;
                    int i311 = -((i38 | 109) & (~i39));
                    int i312 = (i310 & i311) + (i311 | i310);
                    b = i312 % 128;
                    int i313 = i312 % 2;
                    ActivityRoster.u(activityRoster5, 1, selectedItemPosition2, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                    int i314 = a;
                    i2 = (((i314 ^ 95) | (i314 & 95)) << 1) - (((~i314) & 95) | (i314 & (-96)));
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i315 = 5 / 4;
                    }
                }
                ActivityRoster activityRoster6 = ActivityRoster.this;
                activityRoster6.P(activityRoster6.aU);
                if (i <= 0) {
                    int i40 = b;
                    int i41 = i40 & 69;
                    int i42 = ((~i41) & (i40 | 69)) + (i41 << 1);
                    a = i42 % 128;
                    if (i42 % 2 == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        int i43 = ((i40 & 88) + (i40 | 88)) - 1;
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        if (ActivityRoster.this.spinnerMonth.getSelectedItemPosition() > 0) {
                            ActivityRoster activityRoster7 = ActivityRoster.this;
                            activityRoster7.I(activityRoster7.aU);
                            int i45 = a;
                            int i46 = ((i45 | 119) << 1) - (i45 ^ 119);
                            b = i46 % 128;
                            int i47 = i46 % 2;
                        }
                    }
                } else {
                    ActivityRoster activityRoster8 = ActivityRoster.this;
                    activityRoster8.I(activityRoster8.aU);
                    int i48 = a;
                    int i49 = ((i48 | 119) << 1) - (i48 ^ 119);
                    b = i49 % 128;
                    int i410 = i49 % 2;
                }
            }
            int i50 = b;
            int i51 = i50 & 39;
            int i52 = (i51 - (~((i50 ^ 39) | i51))) - 1;
            a = i52 % 128;
            if (i52 % 2 == 0) {
                throw null;
            }
        }
    }

    public class oo0o0Oo implements J {
        private static int a = 0;
        private static int b = 1;

        public oo0o0Oo() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            Spinner spinner;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & (-104)) | ((~i3) & 103);
            int i5 = -(-((i3 & 103) << 1));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            ActivityRoster.this.aO = arrayList;
            int i8 = a;
            int i9 = (i8 ^ 23) + ((i8 & 23) << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 % 2;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= ActivityRoster.this.aO.size()) {
                    int i12 = a;
                    int i13 = (((i12 | 32) << 1) - (i12 ^ 32)) - 1;
                    b = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 4 % 5;
                    }
                    i11 = 0;
                    break;
                }
                int i15 = b;
                int i16 = (i15 | 25) << 1;
                int i17 = -(((~i15) & 25) | (i15 & (-26)));
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                Object obj = null;
                if (i18 % 2 != 0) {
                    ActivityRoster.this.aO.get(i11);
                    obj.hashCode();
                    throw null;
                }
                Item item = ActivityRoster.this.aO.get(i11);
                int i19 = a;
                int i20 = i19 ^ 19;
                int i21 = -(-((i19 & 19) << 1));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    item.getOptionId();
                    Roster roster = ActivityRoster.this.bk;
                    obj.hashCode();
                    throw null;
                }
                if (item.getOptionId() == ActivityRoster.this.bk.disability) {
                    break;
                }
                int i23 = a;
                int i24 = i23 | 73;
                int i25 = ((i24 << 1) - (~(-((~(i23 & 73)) & i24)))) - 1;
                int i26 = i25 % 128;
                b = i26;
                i11 = i25 % 2 == 0 ? (((i11 & (-6)) | ((~i11) & 5)) - (~(-(-((i11 & 5) << 1))))) - 1 : (-2) - ((((i11 & 80) + (i11 | 80)) - 78) ^ (-1));
                int i27 = i26 & 111;
                int i28 = ((i26 ^ 111) | i27) << 1;
                int i29 = -((i26 | 111) & (~i27));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                a = i30 % 128;
                int i31 = i30 % 2;
            }
            ActivityRoster activityRoster = ActivityRoster.this;
            if (activityRoster.bk.disability != 6) {
                activityRoster.sp_disability.setSelection(i11);
                Spinner spinner2 = ActivityRoster.this.sp_disability;
                int i32 = a;
                int i33 = i32 ^ 9;
                int i34 = -(-((i32 & 9) << 1));
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    spinner2.setEnabled(false);
                    return;
                } else {
                    spinner2.setEnabled(true);
                    return;
                }
            }
            int i36 = a + 21;
            b = i36 % 128;
            if (i36 % 2 == 0) {
                activityRoster.sp_disability.setEnabled(false);
                spinner = ActivityRoster.this.sp_disability;
                i = 0;
            } else {
                activityRoster.sp_disability.setEnabled(false);
                spinner = ActivityRoster.this.sp_disability;
                i = 1;
            }
            int i37 = a;
            int i38 = (i37 & 13) + (i37 | 13);
            b = i38 % 128;
            if (i38 % 2 == 0) {
                spinner.setSelection(i);
                int i39 = 1 / 0;
            } else {
                spinner.setSelection(i);
            }
            int i40 = b;
            int i41 = i40 & 115;
            int i42 = (i40 | 115) & (~i41);
            int i43 = i41 << 1;
            int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
            a = i44 % 128;
            int i45 = i44 % 2;
        }
    }

    public class OooOOO implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooOOO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b + 79;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:106:0x03c1  */
        /* JADX WARN: Code duplicated, block: B:109:0x03cc  */
        /* JADX WARN: Code duplicated, block: B:113:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:117:0x0418  */
        /* JADX WARN: Code duplicated, block: B:120:0x041d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:124:0x044f  */
        /* JADX WARN: Code duplicated, block: B:126:0x045a  */
        /* JADX WARN: Code duplicated, block: B:127:0x045e  */
        /* JADX WARN: Code duplicated, block: B:130:0x0480  */
        /* JADX WARN: Code duplicated, block: B:133:0x0485  */
        /* JADX WARN: Code duplicated, block: B:143:0x04ae  */
        /* JADX WARN: Code duplicated, block: B:145:0x04b8  */
        /* JADX WARN: Code duplicated, block: B:147:0x04cb  */
        /* JADX WARN: Code duplicated, block: B:149:0x04fb  */
        /* JADX WARN: Code duplicated, block: B:150:0x0501  */
        /* JADX WARN: Code duplicated, block: B:152:0x050a  */
        /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:21:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:23:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:25:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:33:0x010c  */
        /* JADX WARN: Code duplicated, block: B:35:0x012a  */
        /* JADX WARN: Code duplicated, block: B:37:0x0135  */
        /* JADX WARN: Code duplicated, block: B:38:0x0145  */
        /* JADX WARN: Code duplicated, block: B:41:0x0165  */
        /* JADX WARN: Code duplicated, block: B:44:0x016f  */
        /* JADX WARN: Code duplicated, block: B:46:0x0175  */
        /* JADX WARN: Code duplicated, block: B:47:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:49:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:50:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:51:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:52:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:54:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:55:0x022c  */
        /* JADX WARN: Code duplicated, block: B:57:0x022f  */
        /* JADX WARN: Code duplicated, block: B:66:0x0270 A[PHI: r4
  0x0270: PHI (r4v99 java.util.ArrayList<ivas.gov.bisp.enumeration.databaseModels.Item>) = 
  (r4v98 java.util.ArrayList<ivas.gov.bisp.enumeration.databaseModels.Item>)
  (r4v200 java.util.ArrayList<ivas.gov.bisp.enumeration.databaseModels.Item>)
 binds: [B:65:0x026e, B:62:0x0267] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:68:0x0284  */
        /* JADX WARN: Code duplicated, block: B:70:0x0294  */
        /* JADX WARN: Code duplicated, block: B:71:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:93:0x0352  */
        /* JADX WARN: Code duplicated, block: B:95:0x0385  */
        /* JADX WARN: Code duplicated, block: B:98:0x038a A[ADDED_TO_REGION] */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int checkedRadioButtonId;
            RadioButton radioButton;
            int i7;
            ActivityRoster activityRoster;
            int i8;
            ArrayList<Item> arrayList;
            int i9;
            int optionId;
            int i10;
            int i11;
            int i12;
            String str;
            String str2;
            int i13;
            int i14;
            int i15;
            int i16;
            Item item;
            int i17;
            int i18;
            int i19;
            C0104p c0104pC;
            AppCompatActivity appCompatActivity;
            String strT;
            am amVar;
            int i20;
            int i21;
            int i22 = 2 % 2;
            int i23 = a;
            int i24 = (i23 & 18) + (i23 | 18);
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            Object obj = null;
            if (i == 0) {
                int i28 = ((i26 | 11) << 1) - (i26 ^ 11);
                a = i28 % 128;
                if (i28 % 2 != 0) {
                    ActivityRoster.this.sp_marital_status.setBackgroundResource(R.drawable.spinner_bg);
                    obj.hashCode();
                    throw null;
                }
                ActivityRoster.this.sp_marital_status.setBackgroundResource(R.drawable.spinner_bg);
                int i29 = a;
                int i30 = ((i29 ^ 102) + ((i29 & 102) << 1)) - 1;
                b = i30 % 128;
                int i31 = i30 % 2;
            } else {
                ActivityRoster.this.sp_marital_status.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i32 = b;
                int i33 = i32 & 53;
                int i34 = ((i32 | 53) & (~i33)) + (i33 << 1);
                a = i34 % 128;
                if (i34 % 2 != 0) {
                    int i35 = 5 % 2;
                }
            }
            ActivityRoster activityRoster2 = ActivityRoster.this;
            int i36 = ActivityRoster.af;
            int i37 = activityRoster2.ac;
            int i38 = a;
            int i39 = i38 & 93;
            int i40 = ((i38 ^ 93) | i39) << 1;
            int i41 = -((i38 | 93) & (~i39));
            int i42 = (i40 & i41) + (i41 | i40);
            int i43 = i42 % 128;
            b = i43;
            int i44 = i42 % 2;
            if (i37 != 1) {
                int i45 = i43 + 73;
                a = i45 % 128;
                int i46 = i45 % 2;
                if (i37 != 2) {
                    int i47 = ((((i43 ^ 55) | (i43 & 55)) << 1) - (~(-(((~i43) & 55) | (i43 & (-56)))))) - 1;
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    if (!(!ag.d)) {
                        if (ag.j == 1) {
                            i2 = a;
                            int i49 = i2 & 75;
                            int i50 = i49 + ((i2 ^ 75) | i49);
                            b = i50 % 128;
                            int i51 = i50 % 2;
                            if (i != 0) {
                                int i52 = i2 & 105;
                                int i53 = (i52 - (~((i2 ^ 105) | i52))) - 1;
                                i3 = i53 % 128;
                                b = i3;
                                int i54 = i53 % 2;
                                if (i != 1) {
                                    i4 = (i3 ^ 87) + ((i3 & 87) << 1);
                                    a = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        double d = activityRoster2.aU;
                                        throw null;
                                    }
                                    if (activityRoster2.aU >= 18.0d) {
                                        int i55 = a;
                                        i5 = ((i55 & (-100)) | ((~i55) & 99)) + ((i55 & 99) << 1);
                                        b = i5 % 128;
                                        if (i5 % 2 == 0) {
                                            activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonCNICPresent.getId()) {
                                            int i56 = b;
                                            int i57 = i56 & 85;
                                            int i58 = -(-((i56 ^ 85) | i57));
                                            int i59 = (i57 & i58) + (i58 | i57);
                                            a = i59 % 128;
                                            int i60 = i59 % 2;
                                            if (ActivityRoster.this.et_RosterCNIC.length() == 15) {
                                                i6 = a + 113;
                                                b = i6 % 128;
                                                if (i6 % 2 == 0) {
                                                    checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                                    radioButton = ActivityRoster.this.radioButtonFemale;
                                                    int i61 = 93 / 0;
                                                } else {
                                                    checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                                    radioButton = ActivityRoster.this.radioButtonFemale;
                                                }
                                                int i62 = a;
                                                int i63 = i62 & 93;
                                                int i64 = -(-((i62 ^ 93) | i63));
                                                i7 = (i63 & i64) + (i64 | i63);
                                                b = i7 % 128;
                                                if (i7 % 2 == 0) {
                                                    int i65 = 74 / 0;
                                                    if (checkedRadioButtonId == radioButton.getId()) {
                                                        int i66 = b;
                                                        int i67 = (i66 & (-48)) | ((~i66) & 47);
                                                        int i68 = -(-((i66 & 47) << 1));
                                                        int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                                                        a = i69 % 128;
                                                        int i70 = i69 % 2;
                                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                                        ActivityRoster.this.aY = true;
                                                        int i71 = b;
                                                        int i72 = i71 & 63;
                                                        int i73 = (i71 ^ 63) | i72;
                                                        int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                                                        a = i74 % 128;
                                                        int i75 = i74 % 2;
                                                    } else {
                                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                                        activityRoster = ActivityRoster.this;
                                                        int i76 = a;
                                                        int i77 = i76 | 31;
                                                        i8 = ((i77 << 1) - (~(-((~(i76 & 31)) & i77)))) - 1;
                                                        b = i8 % 128;
                                                        if (i8 % 2 == 0) {
                                                            activityRoster.aY = true;
                                                        } else {
                                                            activityRoster.aY = false;
                                                        }
                                                    }
                                                } else if (checkedRadioButtonId == radioButton.getId()) {
                                                    int i610 = b;
                                                    int i611 = (i610 & (-48)) | ((~i610) & 47);
                                                    int i612 = -(-((i610 & 47) << 1));
                                                    int i613 = ((i611 | i612) << 1) - (i612 ^ i611);
                                                    a = i613 % 128;
                                                    int i78 = i613 % 2;
                                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                                    ActivityRoster.this.aY = true;
                                                    int i79 = b;
                                                    int i710 = i79 & 63;
                                                    int i711 = (i79 ^ 63) | i710;
                                                    int i712 = ((i710 | i711) << 1) - (i711 ^ i710);
                                                    a = i712 % 128;
                                                    int i713 = i712 % 2;
                                                } else {
                                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                                    activityRoster = ActivityRoster.this;
                                                    int i714 = a;
                                                    int i715 = i714 | 31;
                                                    i8 = ((i715 << 1) - (~(-((~(i714 & 31)) & i715)))) - 1;
                                                    b = i8 % 128;
                                                    if (i8 % 2 == 0) {
                                                        activityRoster.aY = true;
                                                    } else {
                                                        activityRoster.aY = false;
                                                    }
                                                }
                                            } else {
                                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                                int i80 = b;
                                                int i81 = (i80 ^ 45) + ((i80 & 45) << 1);
                                                a = i81 % 128;
                                                int i82 = i81 % 2;
                                                ActivityRoster.this.aY = false;
                                                int i83 = b;
                                                int i84 = i83 ^ 75;
                                                int i85 = (((i83 & 75) | i84) << 1) - i84;
                                                a = i85 % 128;
                                                int i86 = i85 % 2;
                                            }
                                        } else {
                                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                            int i87 = b;
                                            int i88 = (i87 ^ 45) + ((i87 & 45) << 1);
                                            a = i88 % 128;
                                            int i89 = i88 % 2;
                                            ActivityRoster.this.aY = false;
                                            int i810 = b;
                                            int i811 = i810 ^ 75;
                                            int i812 = (((i810 & 75) | i811) << 1) - i811;
                                            a = i812 % 128;
                                            int i813 = i812 % 2;
                                        }
                                    } else {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        ActivityRoster activityRoster3 = ActivityRoster.this;
                                        int i90 = b + 66;
                                        int i91 = (i90 ^ (-1)) + (i90 << 1);
                                        a = i91 % 128;
                                        int i92 = i91 % 2;
                                        activityRoster3.aY = false;
                                        int i93 = a;
                                        int i94 = (i93 & (-118)) | ((~i93) & 117);
                                        int i95 = -(-((i93 & 117) << 1));
                                        int i96 = (i94 & i95) + (i95 | i94);
                                        b = i96 % 128;
                                        int i97 = i96 % 2;
                                    }
                                } else {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    ActivityRoster.this.aY = false;
                                    int i98 = a;
                                    int i99 = i98 ^ 37;
                                    int i100 = (((i98 & 37) | i99) << 1) - i99;
                                    b = i100 % 128;
                                    int i101 = i100 % 2;
                                }
                            } else {
                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                ActivityRoster.this.aY = false;
                                int i910 = a;
                                int i911 = i910 ^ 37;
                                int i102 = (((i910 & 37) | i911) << 1) - i911;
                                b = i102 % 128;
                                int i103 = i102 % 2;
                            }
                        }
                    }
                } else if (ag.j == 1) {
                    i2 = a;
                    int i410 = i2 & 75;
                    int i510 = i410 + ((i2 ^ 75) | i410);
                    b = i510 % 128;
                    int i511 = i510 % 2;
                    if (i != 0) {
                        int i512 = i2 & 105;
                        int i513 = (i512 - (~((i2 ^ 105) | i512))) - 1;
                        i3 = i513 % 128;
                        b = i3;
                        int i514 = i513 % 2;
                        if (i != 1) {
                            i4 = (i3 ^ 87) + ((i3 & 87) << 1);
                            a = i4 % 128;
                            if (i4 % 2 != 0) {
                                double d2 = activityRoster2.aU;
                                throw null;
                            }
                            if (activityRoster2.aU >= 18.0d) {
                                int i515 = a;
                                i5 = ((i515 & (-100)) | ((~i515) & 99)) + ((i515 & 99) << 1);
                                b = i5 % 128;
                                if (i5 % 2 == 0) {
                                    activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonCNICPresent.getId()) {
                                    int i516 = b;
                                    int i517 = i516 & 85;
                                    int i518 = -(-((i516 ^ 85) | i517));
                                    int i519 = (i517 & i518) + (i518 | i517);
                                    a = i519 % 128;
                                    int i614 = i519 % 2;
                                    if (ActivityRoster.this.et_RosterCNIC.length() == 15) {
                                        i6 = a + 113;
                                        b = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                            radioButton = ActivityRoster.this.radioButtonFemale;
                                            int i615 = 93 / 0;
                                        } else {
                                            checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                            radioButton = ActivityRoster.this.radioButtonFemale;
                                        }
                                        int i616 = a;
                                        int i617 = i616 & 93;
                                        int i618 = -(-((i616 ^ 93) | i617));
                                        i7 = (i617 & i618) + (i618 | i617);
                                        b = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            int i619 = 74 / 0;
                                            if (checkedRadioButtonId == radioButton.getId()) {
                                                int i6110 = b;
                                                int i6111 = (i6110 & (-48)) | ((~i6110) & 47);
                                                int i6112 = -(-((i6110 & 47) << 1));
                                                int i6113 = ((i6111 | i6112) << 1) - (i6112 ^ i6111);
                                                a = i6113 % 128;
                                                int i716 = i6113 % 2;
                                                ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                                ActivityRoster.this.aY = true;
                                                int i717 = b;
                                                int i718 = i717 & 63;
                                                int i719 = (i717 ^ 63) | i718;
                                                int i7110 = ((i718 | i719) << 1) - (i719 ^ i718);
                                                a = i7110 % 128;
                                                int i7111 = i7110 % 2;
                                            } else {
                                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                                activityRoster = ActivityRoster.this;
                                                int i7112 = a;
                                                int i7113 = i7112 | 31;
                                                i8 = ((i7113 << 1) - (~(-((~(i7112 & 31)) & i7113)))) - 1;
                                                b = i8 % 128;
                                                if (i8 % 2 == 0) {
                                                    activityRoster.aY = true;
                                                } else {
                                                    activityRoster.aY = false;
                                                }
                                            }
                                        } else if (checkedRadioButtonId == radioButton.getId()) {
                                            int i6114 = b;
                                            int i6115 = (i6114 & (-48)) | ((~i6114) & 47);
                                            int i6116 = -(-((i6114 & 47) << 1));
                                            int i6117 = ((i6115 | i6116) << 1) - (i6116 ^ i6115);
                                            a = i6117 % 128;
                                            int i7114 = i6117 % 2;
                                            ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                            ActivityRoster.this.aY = true;
                                            int i7115 = b;
                                            int i7116 = i7115 & 63;
                                            int i7117 = (i7115 ^ 63) | i7116;
                                            int i7118 = ((i7116 | i7117) << 1) - (i7117 ^ i7116);
                                            a = i7118 % 128;
                                            int i7119 = i7118 % 2;
                                        } else {
                                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                            activityRoster = ActivityRoster.this;
                                            int i71110 = a;
                                            int i71111 = i71110 | 31;
                                            i8 = ((i71111 << 1) - (~(-((~(i71110 & 31)) & i71111)))) - 1;
                                            b = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                activityRoster.aY = true;
                                            } else {
                                                activityRoster.aY = false;
                                            }
                                        }
                                    } else {
                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                        int i814 = b;
                                        int i815 = (i814 ^ 45) + ((i814 & 45) << 1);
                                        a = i815 % 128;
                                        int i816 = i815 % 2;
                                        ActivityRoster.this.aY = false;
                                        int i817 = b;
                                        int i818 = i817 ^ 75;
                                        int i819 = (((i817 & 75) | i818) << 1) - i818;
                                        a = i819 % 128;
                                        int i8110 = i819 % 2;
                                    }
                                } else {
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                    int i8111 = b;
                                    int i8112 = (i8111 ^ 45) + ((i8111 & 45) << 1);
                                    a = i8112 % 128;
                                    int i8113 = i8112 % 2;
                                    ActivityRoster.this.aY = false;
                                    int i8114 = b;
                                    int i8115 = i8114 ^ 75;
                                    int i8116 = (((i8114 & 75) | i8115) << 1) - i8115;
                                    a = i8116 % 128;
                                    int i8117 = i8116 % 2;
                                }
                            } else {
                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                ActivityRoster activityRoster4 = ActivityRoster.this;
                                int i912 = b + 66;
                                int i913 = (i912 ^ (-1)) + (i912 << 1);
                                a = i913 % 128;
                                int i914 = i913 % 2;
                                activityRoster4.aY = false;
                                int i915 = a;
                                int i916 = (i915 & (-118)) | ((~i915) & 117);
                                int i917 = -(-((i915 & 117) << 1));
                                int i918 = (i916 & i917) + (i917 | i916);
                                b = i918 % 128;
                                int i919 = i918 % 2;
                            }
                        } else {
                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                            ActivityRoster.this.aY = false;
                            int i9110 = a;
                            int i9111 = i9110 ^ 37;
                            int i104 = (((i9110 & 37) | i9111) << 1) - i9111;
                            b = i104 % 128;
                            int i105 = i104 % 2;
                        }
                    } else {
                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                        ActivityRoster.this.aY = false;
                        int i9112 = a;
                        int i9113 = i9112 ^ 37;
                        int i106 = (((i9112 & 37) | i9113) << 1) - i9113;
                        b = i106 % 128;
                        int i107 = i106 % 2;
                    }
                }
            } else if (ag.j == 1) {
                i2 = a;
                int i411 = i2 & 75;
                int i5110 = i411 + ((i2 ^ 75) | i411);
                b = i5110 % 128;
                int i5111 = i5110 % 2;
                if (i != 0) {
                    int i5112 = i2 & 105;
                    int i5113 = (i5112 - (~((i2 ^ 105) | i5112))) - 1;
                    i3 = i5113 % 128;
                    b = i3;
                    int i5114 = i5113 % 2;
                    if (i != 1) {
                        i4 = (i3 ^ 87) + ((i3 & 87) << 1);
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            double d3 = activityRoster2.aU;
                            throw null;
                        }
                        if (activityRoster2.aU >= 18.0d) {
                            int i5115 = a;
                            i5 = ((i5115 & (-100)) | ((~i5115) & 99)) + ((i5115 & 99) << 1);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId();
                                obj.hashCode();
                                throw null;
                            }
                            if (activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonCNICPresent.getId()) {
                                int i5116 = b;
                                int i5117 = i5116 & 85;
                                int i5118 = -(-((i5116 ^ 85) | i5117));
                                int i5119 = (i5117 & i5118) + (i5118 | i5117);
                                a = i5119 % 128;
                                int i6118 = i5119 % 2;
                                if (ActivityRoster.this.et_RosterCNIC.length() == 15) {
                                    i6 = a + 113;
                                    b = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                        radioButton = ActivityRoster.this.radioButtonFemale;
                                        int i6119 = 93 / 0;
                                    } else {
                                        checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                        radioButton = ActivityRoster.this.radioButtonFemale;
                                    }
                                    int i6120 = a;
                                    int i6121 = i6120 & 93;
                                    int i6122 = -(-((i6120 ^ 93) | i6121));
                                    i7 = (i6121 & i6122) + (i6122 | i6121);
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        int i6123 = 74 / 0;
                                        if (checkedRadioButtonId == radioButton.getId()) {
                                            int i61110 = b;
                                            int i61111 = (i61110 & (-48)) | ((~i61110) & 47);
                                            int i61112 = -(-((i61110 & 47) << 1));
                                            int i61113 = ((i61111 | i61112) << 1) - (i61112 ^ i61111);
                                            a = i61113 % 128;
                                            int i71112 = i61113 % 2;
                                            ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                            ActivityRoster.this.aY = true;
                                            int i71113 = b;
                                            int i71114 = i71113 & 63;
                                            int i71115 = (i71113 ^ 63) | i71114;
                                            int i71116 = ((i71114 | i71115) << 1) - (i71115 ^ i71114);
                                            a = i71116 % 128;
                                            int i71117 = i71116 % 2;
                                        } else {
                                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                            activityRoster = ActivityRoster.this;
                                            int i71118 = a;
                                            int i71119 = i71118 | 31;
                                            i8 = ((i71119 << 1) - (~(-((~(i71118 & 31)) & i71119)))) - 1;
                                            b = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                activityRoster.aY = true;
                                            } else {
                                                activityRoster.aY = false;
                                            }
                                        }
                                    } else if (checkedRadioButtonId == radioButton.getId()) {
                                        int i61114 = b;
                                        int i61115 = (i61114 & (-48)) | ((~i61114) & 47);
                                        int i61116 = -(-((i61114 & 47) << 1));
                                        int i61117 = ((i61115 | i61116) << 1) - (i61116 ^ i61115);
                                        a = i61117 % 128;
                                        int i711110 = i61117 % 2;
                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                        ActivityRoster.this.aY = true;
                                        int i711111 = b;
                                        int i711112 = i711111 & 63;
                                        int i711113 = (i711111 ^ 63) | i711112;
                                        int i711114 = ((i711112 | i711113) << 1) - (i711113 ^ i711112);
                                        a = i711114 % 128;
                                        int i711115 = i711114 % 2;
                                    } else {
                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                        activityRoster = ActivityRoster.this;
                                        int i711116 = a;
                                        int i711117 = i711116 | 31;
                                        i8 = ((i711117 << 1) - (~(-((~(i711116 & 31)) & i711117)))) - 1;
                                        b = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            activityRoster.aY = true;
                                        } else {
                                            activityRoster.aY = false;
                                        }
                                    }
                                } else {
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                    int i8118 = b;
                                    int i8119 = (i8118 ^ 45) + ((i8118 & 45) << 1);
                                    a = i8119 % 128;
                                    int i81110 = i8119 % 2;
                                    ActivityRoster.this.aY = false;
                                    int i81111 = b;
                                    int i81112 = i81111 ^ 75;
                                    int i81113 = (((i81111 & 75) | i81112) << 1) - i81112;
                                    a = i81113 % 128;
                                    int i81114 = i81113 % 2;
                                }
                            } else {
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                int i81115 = b;
                                int i81116 = (i81115 ^ 45) + ((i81115 & 45) << 1);
                                a = i81116 % 128;
                                int i81117 = i81116 % 2;
                                ActivityRoster.this.aY = false;
                                int i81118 = b;
                                int i81119 = i81118 ^ 75;
                                int i811110 = (((i81118 & 75) | i81119) << 1) - i81119;
                                a = i811110 % 128;
                                int i811111 = i811110 % 2;
                            }
                        } else {
                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                            ActivityRoster activityRoster5 = ActivityRoster.this;
                            int i9114 = b + 66;
                            int i9115 = (i9114 ^ (-1)) + (i9114 << 1);
                            a = i9115 % 128;
                            int i9116 = i9115 % 2;
                            activityRoster5.aY = false;
                            int i9117 = a;
                            int i9118 = (i9117 & (-118)) | ((~i9117) & 117);
                            int i9119 = -(-((i9117 & 117) << 1));
                            int i9120 = (i9118 & i9119) + (i9119 | i9118);
                            b = i9120 % 128;
                            int i9121 = i9120 % 2;
                        }
                    } else {
                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                        ActivityRoster.this.aY = false;
                        int i91110 = a;
                        int i91111 = i91110 ^ 37;
                        int i108 = (((i91110 & 37) | i91111) << 1) - i91111;
                        b = i108 % 128;
                        int i109 = i108 % 2;
                    }
                } else {
                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                    ActivityRoster.this.aY = false;
                    int i91112 = a;
                    int i91113 = i91112 ^ 37;
                    int i1010 = (((i91112 & 37) | i91113) << 1) - i91113;
                    b = i1010 % 128;
                    int i1011 = i1010 % 2;
                }
            }
            if (i > 0) {
                int i110 = a;
                int i111 = (i110 | 101) << 1;
                int i112 = -(((~i110) & 101) | (i110 & (-102)));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                b = i113 % 128;
                if (i113 % 2 == 0) {
                    arrayList = ActivityRoster.this.aJ;
                    int i114 = 62 / 0;
                    if (arrayList != null) {
                        int i115 = b;
                        int i116 = ((i115 ^ 122) + ((i115 & 122) << 1)) - 1;
                        a = i116 % 128;
                        int i117 = i116 % 2;
                        if (arrayList.size() > 0) {
                            int i118 = b;
                            i9 = ((i118 & 110) + (i118 | 110)) - 1;
                            a = i9 % 128;
                            if (i9 % 2 != 0) {
                                optionId = ActivityRoster.this.aJ.get(i).getOptionId();
                                int i119 = 17 / 0;
                            } else {
                                optionId = ActivityRoster.this.aJ.get(i).getOptionId();
                            }
                            int i120 = b;
                            int i121 = i120 & 1;
                            int i122 = (i120 | 1) & (~i121);
                            int i123 = i121 << 1;
                            i10 = (i122 ^ i123) + ((i122 & i123) << 1);
                            a = i10 % 128;
                            if (i10 % 2 != 0 ? optionId == 201 : optionId == 28409) {
                                Item item2 = ActivityRoster.this.aJ.get(i);
                                int i124 = b;
                                int i125 = i124 ^ 63;
                                int i126 = ((((i124 & 63) | i125) << 1) - (~(-i125))) - 1;
                                a = i126 % 128;
                                int i127 = i126 % 2;
                                int optionId2 = item2.getOptionId();
                                i11 = a;
                                int i128 = (i11 & 122) + (i11 | 122);
                                i12 = (i128 ^ (-1)) + (i128 << 1);
                                b = i12 % 128;
                                str = "married";
                                if (i12 % 2 == 0 ? optionId2 != 201 : optionId2 != 31649) {
                                    int i129 = ((i11 & 54) + (i11 | 54)) - 1;
                                    b = i129 % 128;
                                    int i130 = i129 % 2;
                                    str2 = BuildConfig.FLAVOR;
                                } else {
                                    int i131 = ((i11 ^ 12) + ((i11 & 12) << 1)) - 1;
                                    b = i131 % 128;
                                    if (i131 % 2 == 0) {
                                        throw null;
                                    }
                                    str2 = "married";
                                }
                                Item item3 = ActivityRoster.this.aJ.get(i);
                                int i132 = a;
                                i13 = (i132 ^ 43) + ((i132 & 43) << 1);
                                b = i13 % 128;
                                if (i13 % 2 == 0 ? item3.getOptionId() == 203 : item3.getOptionId() == 13844) {
                                    int i133 = a;
                                    int i134 = i133 & 57;
                                    int i135 = ((i133 ^ 57) | i134) << 1;
                                    int i136 = -((i133 | 57) & (~i134));
                                    i14 = (i135 ^ i136) + ((i136 & i135) << 1);
                                    b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        int i137 = 33 / 0;
                                    }
                                    str2 = "divorced";
                                }
                                int optionId3 = ActivityRoster.this.aJ.get(i).getOptionId();
                                i15 = a;
                                int i138 = (105 & (~i15)) | (i15 & (-106));
                                int i139 = -(-((i15 & 105) << 1));
                                i16 = ((i138 | i139) << 1) - (i138 ^ i139);
                                b = i16 % 128;
                                if (i16 % 2 == 0 ? optionId3 == 202 : optionId3 == 4597) {
                                    int i140 = (-2) - ((((i15 | 26) << 1) - (i15 ^ 26)) ^ (-1));
                                    b = i140 % 128;
                                    int i141 = i140 % 2;
                                    str2 = "widow";
                                }
                                item = ActivityRoster.this.aJ.get(i);
                                int i142 = a;
                                int i143 = i142 & 67;
                                int i144 = (i143 - (~((i142 ^ 67) | i143))) - 1;
                                b = i144 % 128;
                                int i145 = i144 % 2;
                                if (item.getOptionId() == 204) {
                                    i21 = a + 81;
                                    b = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        int i146 = 68 / 0;
                                    }
                                } else {
                                    str = str2;
                                }
                                ActivityRoster activityRoster6 = ActivityRoster.this;
                                Objects.requireNonNull(activityRoster6);
                                double d4 = activityRoster6.aU;
                                int i147 = a;
                                int i148 = i147 & 41;
                                i17 = ((((i147 ^ 41) | i148) << 1) - (~(-((i147 | 41) & (~i148))))) - 1;
                                int i149 = i17 % 128;
                                b = i149;
                                if (i17 % 2 == 0 ? d4 <= 0.0d : d4 <= 0.0d) {
                                    int i150 = i149 & 7;
                                    int i151 = ((i149 ^ 7) | i150) << 1;
                                    int i152 = -((i149 | 7) & (~i150));
                                    int i153 = (i151 ^ i152) + ((i152 & i151) << 1);
                                    a = i153 % 128;
                                    if (i153 % 2 != 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (i18 == 0 && activityRoster6.spinnerMonth.getSelectedItemPosition() > 0) {
                                        if (ActivityRoster.this.aU < 17.0d) {
                                            int i154 = a;
                                            int i155 = ((i154 | 94) << 1) - (i154 ^ 94);
                                            i19 = (i155 ^ (-1)) + (i155 << 1);
                                            b = i19 % 128;
                                            if (i19 % 2 != 0) {
                                                C0104p.c();
                                                AppCompatActivity appCompatActivity2 = ActivityRoster.this.ae;
                                                obj.hashCode();
                                                throw null;
                                            }
                                            c0104pC = C0104p.c();
                                            appCompatActivity = ActivityRoster.this.ae;
                                            strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                            amVar = new am(this, 7);
                                            int i156 = a;
                                            i20 = (((i156 & (-86)) | ((~i156) & 85)) - (~((i156 & 85) << 1))) - 1;
                                            b = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                                obj.hashCode();
                                                throw null;
                                            }
                                            c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                        }
                                    }
                                } else if (ActivityRoster.this.aU < 17.0d) {
                                    int i157 = a;
                                    int i158 = ((i157 | 94) << 1) - (i157 ^ 94);
                                    i19 = (i158 ^ (-1)) + (i158 << 1);
                                    b = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        C0104p.c();
                                        AppCompatActivity appCompatActivity3 = ActivityRoster.this.ae;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    c0104pC = C0104p.c();
                                    appCompatActivity = ActivityRoster.this.ae;
                                    strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                    amVar = new am(this, 7);
                                    int i159 = a;
                                    i20 = (((i159 & (-86)) | ((~i159) & 85)) - (~((i159 & 85) << 1))) - 1;
                                    b = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                }
                            } else {
                                Item item4 = ActivityRoster.this.aJ.get(i);
                                int i160 = a;
                                int i161 = ((i160 ^ 32) + ((i160 & 32) << 1)) - 1;
                                b = i161 % 128;
                                int i162 = i161 % 2;
                                if (item4.getOptionId() != 203) {
                                    int i163 = a;
                                    int i164 = ((i163 | 113) << 1) - (i163 ^ 113);
                                    b = i164 % 128;
                                    if (i164 % 2 == 0) {
                                        ActivityRoster.this.aJ.get(i);
                                        throw null;
                                    }
                                    if (ActivityRoster.this.aJ.get(i).getOptionId() != 202) {
                                        int i165 = b;
                                        int i166 = i165 & 13;
                                        int i167 = -(-((i165 ^ 13) | i166));
                                        int i168 = (i166 & i167) + (i167 | i166);
                                        a = i168 % 128;
                                        if (i168 % 2 != 0) {
                                            ActivityRoster.this.aJ.get(i).getOptionId();
                                            throw null;
                                        }
                                        if (ActivityRoster.this.aJ.get(i).getOptionId() == 204) {
                                            Item item5 = ActivityRoster.this.aJ.get(i);
                                            int i1210 = b;
                                            int i1211 = i1210 ^ 63;
                                            int i1212 = ((((i1210 & 63) | i1211) << 1) - (~(-i1211))) - 1;
                                            a = i1212 % 128;
                                            int i1213 = i1212 % 2;
                                            int optionId4 = item5.getOptionId();
                                            i11 = a;
                                            int i1214 = (i11 & 122) + (i11 | 122);
                                            i12 = (i1214 ^ (-1)) + (i1214 << 1);
                                            b = i12 % 128;
                                            str = "married";
                                            if (i12 % 2 == 0) {
                                                int i1215 = ((i11 & 54) + (i11 | 54)) - 1;
                                                b = i1215 % 128;
                                                int i1310 = i1215 % 2;
                                                str2 = BuildConfig.FLAVOR;
                                            } else {
                                                int i1216 = ((i11 & 54) + (i11 | 54)) - 1;
                                                b = i1216 % 128;
                                                int i1311 = i1216 % 2;
                                                str2 = BuildConfig.FLAVOR;
                                            }
                                            Item item6 = ActivityRoster.this.aJ.get(i);
                                            int i1312 = a;
                                            i13 = (i1312 ^ 43) + ((i1312 & 43) << 1);
                                            b = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                int i1313 = a;
                                                int i1314 = i1313 & 57;
                                                int i1315 = ((i1313 ^ 57) | i1314) << 1;
                                                int i1316 = -((i1313 | 57) & (~i1314));
                                                i14 = (i1315 ^ i1316) + ((i1316 & i1315) << 1);
                                                b = i14 % 128;
                                                if (i14 % 2 == 0) {
                                                    int i1317 = 33 / 0;
                                                }
                                                str2 = "divorced";
                                            } else {
                                                int i1318 = a;
                                                int i1319 = i1318 & 57;
                                                int i13110 = ((i1318 ^ 57) | i1319) << 1;
                                                int i13111 = -((i1318 | 57) & (~i1319));
                                                i14 = (i13110 ^ i13111) + ((i13111 & i13110) << 1);
                                                b = i14 % 128;
                                                if (i14 % 2 == 0) {
                                                    int i13112 = 33 / 0;
                                                }
                                                str2 = "divorced";
                                            }
                                            int optionId5 = ActivityRoster.this.aJ.get(i).getOptionId();
                                            i15 = a;
                                            int i1320 = (105 & (~i15)) | (i15 & (-106));
                                            int i1321 = -(-((i15 & 105) << 1));
                                            i16 = ((i1320 | i1321) << 1) - (i1320 ^ i1321);
                                            b = i16 % 128;
                                            if (i16 % 2 == 0) {
                                                int i1410 = (-2) - ((((i15 | 26) << 1) - (i15 ^ 26)) ^ (-1));
                                                b = i1410 % 128;
                                                int i1411 = i1410 % 2;
                                                str2 = "widow";
                                            } else {
                                                int i1412 = (-2) - ((((i15 | 26) << 1) - (i15 ^ 26)) ^ (-1));
                                                b = i1412 % 128;
                                                int i1413 = i1412 % 2;
                                                str2 = "widow";
                                            }
                                            item = ActivityRoster.this.aJ.get(i);
                                            int i1414 = a;
                                            int i1415 = i1414 & 67;
                                            int i1416 = (i1415 - (~((i1414 ^ 67) | i1415))) - 1;
                                            b = i1416 % 128;
                                            int i1417 = i1416 % 2;
                                            if (item.getOptionId() == 204) {
                                                i21 = a + 81;
                                                b = i21 % 128;
                                                if (i21 % 2 == 0) {
                                                    int i1418 = 68 / 0;
                                                }
                                            } else {
                                                str = str2;
                                            }
                                            ActivityRoster activityRoster7 = ActivityRoster.this;
                                            Objects.requireNonNull(activityRoster7);
                                            double d5 = activityRoster7.aU;
                                            int i1419 = a;
                                            int i1420 = i1419 & 41;
                                            i17 = ((((i1419 ^ 41) | i1420) << 1) - (~(-((i1419 | 41) & (~i1420))))) - 1;
                                            int i1421 = i17 % 128;
                                            b = i1421;
                                            if (i17 % 2 == 0) {
                                            }
                                            if (ActivityRoster.this.aU < 17.0d) {
                                                int i1510 = a;
                                                int i1511 = ((i1510 | 94) << 1) - (i1510 ^ 94);
                                                i19 = (i1511 ^ (-1)) + (i1511 << 1);
                                                b = i19 % 128;
                                                if (i19 % 2 != 0) {
                                                    C0104p.c();
                                                    AppCompatActivity appCompatActivity4 = ActivityRoster.this.ae;
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                c0104pC = C0104p.c();
                                                appCompatActivity = ActivityRoster.this.ae;
                                                strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                                amVar = new am(this, 7);
                                                int i1512 = a;
                                                i20 = (((i1512 & (-86)) | ((~i1512) & 85)) - (~((i1512 & 85) << 1))) - 1;
                                                b = i20 % 128;
                                                if (i20 % 2 != 0) {
                                                    c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                            }
                                        }
                                    } else {
                                        Item item7 = ActivityRoster.this.aJ.get(i);
                                        int i1217 = b;
                                        int i1218 = i1217 ^ 63;
                                        int i1219 = ((((i1217 & 63) | i1218) << 1) - (~(-i1218))) - 1;
                                        a = i1219 % 128;
                                        int i12110 = i1219 % 2;
                                        int optionId6 = item7.getOptionId();
                                        i11 = a;
                                        int i12111 = (i11 & 122) + (i11 | 122);
                                        i12 = (i12111 ^ (-1)) + (i12111 << 1);
                                        b = i12 % 128;
                                        str = "married";
                                        if (i12 % 2 == 0) {
                                            int i12112 = ((i11 & 54) + (i11 | 54)) - 1;
                                            b = i12112 % 128;
                                            int i13113 = i12112 % 2;
                                            str2 = BuildConfig.FLAVOR;
                                        } else {
                                            int i12113 = ((i11 & 54) + (i11 | 54)) - 1;
                                            b = i12113 % 128;
                                            int i13114 = i12113 % 2;
                                            str2 = BuildConfig.FLAVOR;
                                        }
                                        Item item8 = ActivityRoster.this.aJ.get(i);
                                        int i13115 = a;
                                        i13 = (i13115 ^ 43) + ((i13115 & 43) << 1);
                                        b = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            int i13116 = a;
                                            int i13117 = i13116 & 57;
                                            int i13118 = ((i13116 ^ 57) | i13117) << 1;
                                            int i13119 = -((i13116 | 57) & (~i13117));
                                            i14 = (i13118 ^ i13119) + ((i13119 & i13118) << 1);
                                            b = i14 % 128;
                                            if (i14 % 2 == 0) {
                                                int i131110 = 33 / 0;
                                            }
                                            str2 = "divorced";
                                        } else {
                                            int i131111 = a;
                                            int i131112 = i131111 & 57;
                                            int i131113 = ((i131111 ^ 57) | i131112) << 1;
                                            int i131114 = -((i131111 | 57) & (~i131112));
                                            i14 = (i131113 ^ i131114) + ((i131114 & i131113) << 1);
                                            b = i14 % 128;
                                            if (i14 % 2 == 0) {
                                                int i131115 = 33 / 0;
                                            }
                                            str2 = "divorced";
                                        }
                                        int optionId7 = ActivityRoster.this.aJ.get(i).getOptionId();
                                        i15 = a;
                                        int i1322 = (105 & (~i15)) | (i15 & (-106));
                                        int i1323 = -(-((i15 & 105) << 1));
                                        i16 = ((i1322 | i1323) << 1) - (i1322 ^ i1323);
                                        b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            int i14110 = (-2) - ((((i15 | 26) << 1) - (i15 ^ 26)) ^ (-1));
                                            b = i14110 % 128;
                                            int i14111 = i14110 % 2;
                                            str2 = "widow";
                                        } else {
                                            int i14112 = (-2) - ((((i15 | 26) << 1) - (i15 ^ 26)) ^ (-1));
                                            b = i14112 % 128;
                                            int i14113 = i14112 % 2;
                                            str2 = "widow";
                                        }
                                        item = ActivityRoster.this.aJ.get(i);
                                        int i14114 = a;
                                        int i14115 = i14114 & 67;
                                        int i14116 = (i14115 - (~((i14114 ^ 67) | i14115))) - 1;
                                        b = i14116 % 128;
                                        int i14117 = i14116 % 2;
                                        if (item.getOptionId() == 204) {
                                            i21 = a + 81;
                                            b = i21 % 128;
                                            if (i21 % 2 == 0) {
                                                int i14118 = 68 / 0;
                                            }
                                        } else {
                                            str = str2;
                                        }
                                        ActivityRoster activityRoster8 = ActivityRoster.this;
                                        Objects.requireNonNull(activityRoster8);
                                        double d6 = activityRoster8.aU;
                                        int i14119 = a;
                                        int i1422 = i14119 & 41;
                                        i17 = ((((i14119 ^ 41) | i1422) << 1) - (~(-((i14119 | 41) & (~i1422))))) - 1;
                                        int i1423 = i17 % 128;
                                        b = i1423;
                                        if (i17 % 2 == 0) {
                                        }
                                        if (ActivityRoster.this.aU < 17.0d) {
                                            int i1513 = a;
                                            int i1514 = ((i1513 | 94) << 1) - (i1513 ^ 94);
                                            i19 = (i1514 ^ (-1)) + (i1514 << 1);
                                            b = i19 % 128;
                                            if (i19 % 2 != 0) {
                                                C0104p.c();
                                                AppCompatActivity appCompatActivity5 = ActivityRoster.this.ae;
                                                obj.hashCode();
                                                throw null;
                                            }
                                            c0104pC = C0104p.c();
                                            appCompatActivity = ActivityRoster.this.ae;
                                            strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                            amVar = new am(this, 7);
                                            int i1515 = a;
                                            i20 = (((i1515 & (-86)) | ((~i1515) & 85)) - (~((i1515 & 85) << 1))) - 1;
                                            b = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                                obj.hashCode();
                                                throw null;
                                            }
                                            c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                        }
                                    }
                                } else {
                                    Item item9 = ActivityRoster.this.aJ.get(i);
                                    int i12114 = b;
                                    int i12115 = i12114 ^ 63;
                                    int i12116 = ((((i12114 & 63) | i12115) << 1) - (~(-i12115))) - 1;
                                    a = i12116 % 128;
                                    int i12117 = i12116 % 2;
                                    int optionId8 = item9.getOptionId();
                                    i11 = a;
                                    int i12118 = (i11 & 122) + (i11 | 122);
                                    i12 = (i12118 ^ (-1)) + (i12118 << 1);
                                    b = i12 % 128;
                                    str = "married";
                                    if (i12 % 2 == 0) {
                                        int i12119 = ((i11 & 54) + (i11 | 54)) - 1;
                                        b = i12119 % 128;
                                        int i131116 = i12119 % 2;
                                        str2 = BuildConfig.FLAVOR;
                                    } else {
                                        int i121110 = ((i11 & 54) + (i11 | 54)) - 1;
                                        b = i121110 % 128;
                                        int i131117 = i121110 % 2;
                                        str2 = BuildConfig.FLAVOR;
                                    }
                                    Item item10 = ActivityRoster.this.aJ.get(i);
                                    int i131118 = a;
                                    i13 = (i131118 ^ 43) + ((i131118 & 43) << 1);
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        int i131119 = a;
                                        int i1311110 = i131119 & 57;
                                        int i1311111 = ((i131119 ^ 57) | i1311110) << 1;
                                        int i1311112 = -((i131119 | 57) & (~i1311110));
                                        i14 = (i1311111 ^ i1311112) + ((i1311112 & i1311111) << 1);
                                        b = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            int i1311113 = 33 / 0;
                                        }
                                        str2 = "divorced";
                                    } else {
                                        int i1311114 = a;
                                        int i1311115 = i1311114 & 57;
                                        int i1311116 = ((i1311114 ^ 57) | i1311115) << 1;
                                        int i1311117 = -((i1311114 | 57) & (~i1311115));
                                        i14 = (i1311116 ^ i1311117) + ((i1311117 & i1311116) << 1);
                                        b = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            int i1311118 = 33 / 0;
                                        }
                                        str2 = "divorced";
                                    }
                                    int optionId9 = ActivityRoster.this.aJ.get(i).getOptionId();
                                    i15 = a;
                                    int i1324 = (105 & (~i15)) | (i15 & (-106));
                                    int i1325 = -(-((i15 & 105) << 1));
                                    i16 = ((i1324 | i1325) << 1) - (i1324 ^ i1325);
                                    b = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        int i141110 = (-2) - ((((i15 | 26) << 1) - (i15 ^ 26)) ^ (-1));
                                        b = i141110 % 128;
                                        int i141111 = i141110 % 2;
                                        str2 = "widow";
                                    } else {
                                        int i141112 = (-2) - ((((i15 | 26) << 1) - (i15 ^ 26)) ^ (-1));
                                        b = i141112 % 128;
                                        int i141113 = i141112 % 2;
                                        str2 = "widow";
                                    }
                                    item = ActivityRoster.this.aJ.get(i);
                                    int i141114 = a;
                                    int i141115 = i141114 & 67;
                                    int i141116 = (i141115 - (~((i141114 ^ 67) | i141115))) - 1;
                                    b = i141116 % 128;
                                    int i141117 = i141116 % 2;
                                    if (item.getOptionId() == 204) {
                                        i21 = a + 81;
                                        b = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            int i141118 = 68 / 0;
                                        }
                                    } else {
                                        str = str2;
                                    }
                                    ActivityRoster activityRoster9 = ActivityRoster.this;
                                    Objects.requireNonNull(activityRoster9);
                                    double d7 = activityRoster9.aU;
                                    int i141119 = a;
                                    int i1424 = i141119 & 41;
                                    i17 = ((((i141119 ^ 41) | i1424) << 1) - (~(-((i141119 | 41) & (~i1424))))) - 1;
                                    int i1425 = i17 % 128;
                                    b = i1425;
                                    if (i17 % 2 == 0) {
                                    }
                                    if (ActivityRoster.this.aU < 17.0d) {
                                        int i1516 = a;
                                        int i1517 = ((i1516 | 94) << 1) - (i1516 ^ 94);
                                        i19 = (i1517 ^ (-1)) + (i1517 << 1);
                                        b = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            C0104p.c();
                                            AppCompatActivity appCompatActivity6 = ActivityRoster.this.ae;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        c0104pC = C0104p.c();
                                        appCompatActivity = ActivityRoster.this.ae;
                                        strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                        amVar = new am(this, 7);
                                        int i1518 = a;
                                        i20 = (((i1518 & (-86)) | ((~i1518) & 85)) - (~((i1518 & 85) << 1))) - 1;
                                        b = i20 % 128;
                                        if (i20 % 2 != 0) {
                                            c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = ActivityRoster.this.aJ;
                    if (arrayList != null) {
                        int i1110 = b;
                        int i1111 = ((i1110 ^ 122) + ((i1110 & 122) << 1)) - 1;
                        a = i1111 % 128;
                        int i1112 = i1111 % 2;
                        if (arrayList.size() > 0) {
                            int i1113 = b;
                            i9 = ((i1113 & 110) + (i1113 | 110)) - 1;
                            a = i9 % 128;
                            if (i9 % 2 != 0) {
                                optionId = ActivityRoster.this.aJ.get(i).getOptionId();
                                int i1114 = 17 / 0;
                            } else {
                                optionId = ActivityRoster.this.aJ.get(i).getOptionId();
                            }
                            int i1220 = b;
                            int i1221 = i1220 & 1;
                            int i1222 = (i1220 | 1) & (~i1221);
                            int i1223 = i1221 << 1;
                            i10 = (i1222 ^ i1223) + ((i1222 & i1223) << 1);
                            a = i10 % 128;
                            if (i10 % 2 != 0) {
                            }
                            Item item11 = ActivityRoster.this.aJ.get(i);
                            int i121111 = b;
                            int i121112 = i121111 ^ 63;
                            int i121113 = ((((i121111 & 63) | i121112) << 1) - (~(-i121112))) - 1;
                            a = i121113 % 128;
                            int i121114 = i121113 % 2;
                            int optionId10 = item11.getOptionId();
                            i11 = a;
                            int i121115 = (i11 & 122) + (i11 | 122);
                            i12 = (i121115 ^ (-1)) + (i121115 << 1);
                            b = i12 % 128;
                            str = "married";
                            if (i12 % 2 == 0) {
                                int i121116 = ((i11 & 54) + (i11 | 54)) - 1;
                                b = i121116 % 128;
                                int i1311119 = i121116 % 2;
                                str2 = BuildConfig.FLAVOR;
                            } else {
                                int i121117 = ((i11 & 54) + (i11 | 54)) - 1;
                                b = i121117 % 128;
                                int i13111110 = i121117 % 2;
                                str2 = BuildConfig.FLAVOR;
                            }
                            Item item12 = ActivityRoster.this.aJ.get(i);
                            int i1311120 = a;
                            i13 = (i1311120 ^ 43) + ((i1311120 & 43) << 1);
                            b = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i13111111 = a;
                                int i13111112 = i13111111 & 57;
                                int i13111113 = ((i13111111 ^ 57) | i13111112) << 1;
                                int i13111114 = -((i13111111 | 57) & (~i13111112));
                                i14 = (i13111113 ^ i13111114) + ((i13111114 & i13111113) << 1);
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i13111115 = 33 / 0;
                                }
                                str2 = "divorced";
                            } else {
                                int i13111116 = a;
                                int i13111117 = i13111116 & 57;
                                int i13111118 = ((i13111116 ^ 57) | i13111117) << 1;
                                int i13111119 = -((i13111116 | 57) & (~i13111117));
                                i14 = (i13111118 ^ i13111119) + ((i13111119 & i13111118) << 1);
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i131111110 = 33 / 0;
                                }
                                str2 = "divorced";
                            }
                            int optionId11 = ActivityRoster.this.aJ.get(i).getOptionId();
                            i15 = a;
                            int i1326 = (105 & (~i15)) | (i15 & (-106));
                            int i1327 = -(-((i15 & 105) << 1));
                            i16 = ((i1326 | i1327) << 1) - (i1326 ^ i1327);
                            b = i16 % 128;
                            if (i16 % 2 == 0) {
                                int i1411110 = (-2) - ((((i15 | 26) << 1) - (i15 ^ 26)) ^ (-1));
                                b = i1411110 % 128;
                                int i1411111 = i1411110 % 2;
                                str2 = "widow";
                            } else {
                                int i1411112 = (-2) - ((((i15 | 26) << 1) - (i15 ^ 26)) ^ (-1));
                                b = i1411112 % 128;
                                int i1411113 = i1411112 % 2;
                                str2 = "widow";
                            }
                            item = ActivityRoster.this.aJ.get(i);
                            int i1411114 = a;
                            int i1411115 = i1411114 & 67;
                            int i1411116 = (i1411115 - (~((i1411114 ^ 67) | i1411115))) - 1;
                            b = i1411116 % 128;
                            int i1411117 = i1411116 % 2;
                            if (item.getOptionId() == 204) {
                                i21 = a + 81;
                                b = i21 % 128;
                                if (i21 % 2 == 0) {
                                    int i1411118 = 68 / 0;
                                }
                            } else {
                                str = str2;
                            }
                            ActivityRoster activityRoster10 = ActivityRoster.this;
                            Objects.requireNonNull(activityRoster10);
                            double d8 = activityRoster10.aU;
                            int i1411119 = a;
                            int i1426 = i1411119 & 41;
                            i17 = ((((i1411119 ^ 41) | i1426) << 1) - (~(-((i1411119 | 41) & (~i1426))))) - 1;
                            int i1427 = i17 % 128;
                            b = i1427;
                            if (i17 % 2 == 0) {
                            }
                            if (ActivityRoster.this.aU < 17.0d) {
                                int i1519 = a;
                                int i15110 = ((i1519 | 94) << 1) - (i1519 ^ 94);
                                i19 = (i15110 ^ (-1)) + (i15110 << 1);
                                b = i19 % 128;
                                if (i19 % 2 != 0) {
                                    C0104p.c();
                                    AppCompatActivity appCompatActivity7 = ActivityRoster.this.ae;
                                    obj.hashCode();
                                    throw null;
                                }
                                c0104pC = C0104p.c();
                                appCompatActivity = ActivityRoster.this.ae;
                                strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                amVar = new am(this, 7);
                                int i15111 = a;
                                i20 = (((i15111 & (-86)) | ((~i15111) & 85)) - (~((i15111 & 85) << 1))) - 1;
                                b = i20 % 128;
                                if (i20 % 2 != 0) {
                                    c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                    obj.hashCode();
                                    throw null;
                                }
                                c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                            }
                        }
                    }
                }
            }
            int i169 = a;
            int i170 = ((i169 ^ 23) | (i169 & 23)) << 1;
            int i171 = -(((~i169) & 23) | (i169 & (-24)));
            int i172 = (i170 & i171) + (i171 | i170);
            b = i172 % 128;
            int i173 = i172 % 2;
        }
    }

    public class OooOOO0 implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooOOO0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a + 24;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            if (i != 0) {
                o00000 o00000Var = ActivityRoster.this.new o00000(i, new OooO00o(i));
                int i6 = b;
                int i7 = i6 & 67;
                int i8 = (((i6 | 67) & (~i7)) - (~(i7 << 1))) - 1;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    o00000Var.execute(new Void[1]);
                } else {
                    o00000Var.execute(new Void[0]);
                }
                int i9 = (-2) - ((a + 54) ^ (-1));
                b = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = a + 27;
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 94 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        public class OooO00o implements a {
            private static int a = 1;
            private static int b;
            public final /* synthetic */ int c;

            /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster$OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C0009OooO00o implements J {
                private static int a = 0;
                private static int b = 1;

                public C0009OooO00o() {
                }

                @Override // ivas.gov.bisp.enumeration.W.J
                public void fillList(ArrayList<Item> arrayList) {
                    int i = 2 % 2;
                    int i2 = b;
                    int i3 = (i2 & (-24)) | ((~i2) & 23);
                    int i4 = (i2 & 23) << 1;
                    int i5 = (i3 & i4) + (i4 | i3);
                    a = i5 % 128;
                    int i6 = i5 % 2;
                    ActivityRoster.this.aJ = arrayList;
                    int i7 = b + 35;
                    a = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                }
            }

            public OooO00o(int i) {
                this.c = i;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x030d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:17:0x00fe  */
            /* JADX WARN: Code duplicated, block: B:19:0x013f  */
            /* JADX WARN: Code duplicated, block: B:20:0x0144  */
            /* JADX WARN: Code duplicated, block: B:23:0x014e  */
            /* JADX WARN: Code duplicated, block: B:32:0x018b  */
            /* JADX WARN: Code duplicated, block: B:34:0x01ab  */
            /* JADX WARN: Code duplicated, block: B:40:0x023e  */
            /* JADX WARN: Code duplicated, block: B:41:0x024a  */
            /* JADX WARN: Code duplicated, block: B:44:0x0267  */
            /* JADX WARN: Code duplicated, block: B:46:0x0276  */
            /* JADX WARN: Code duplicated, block: B:49:0x02be  */
            /* JADX WARN: Code duplicated, block: B:51:0x02c4  */
            /* JADX WARN: Code duplicated, block: B:53:0x02d3  */
            /* JADX WARN: Code duplicated, block: B:56:0x0326 A[LOOP:1: B:47:0x02a3->B:56:0x0326, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:80:0x03db  */
            /* JADX WARN: Code duplicated, block: B:82:0x03e3  */
            /* JADX WARN: Code duplicated, block: B:84:0x0408  */
            /* JADX WARN: Code duplicated, block: B:89:0x0441  */
            /* JADX WARN: Code duplicated, block: B:91:0x020e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:94:0x0148 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:97:0x0369 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x034b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:99:0x033e A[SYNTHETIC] */
            @Override // ivas.gov.bisp.enumeration.W.a
            public void b(ArrayList<question_options> arrayList, int i) {
                int i2;
                ActivityRoster activityRoster;
                double d;
                int i3;
                ArrayList<Item> arrayList2;
                Item item;
                int i4;
                int i5;
                ActivityRoster activityRoster2;
                o oVar;
                int i6;
                o oVar2;
                ActivityRoster activityRoster3;
                int i7;
                ActivityRoster activityRoster4;
                int i8;
                ArrayList<Item> arrayList3;
                int i9;
                int i10;
                int optionId;
                ActivityRoster activityRoster5;
                int i11;
                int i12;
                int i13 = 2 % 2;
                int i14 = b;
                int i15 = i14 & 69;
                int i16 = (i14 | 69) & (~i15);
                int i17 = i15 << 1;
                int i18 = (i16 & i17) + (i16 | i17);
                a = i18 % 128;
                int i19 = i18 % 2;
                ArrayList<Item> arrayList4 = ActivityRoster.this.aM;
                int i20 = this.c;
                int i21 = a;
                int i22 = i21 & 95;
                int i23 = -(-((i21 ^ 95) | i22));
                int i24 = (i22 & i23) + (i23 | i22);
                b = i24 % 128;
                Object obj = null;
                if (i24 % 2 == 0 ? arrayList4.get(i20).getOptionId() == 271 : arrayList4.get(i20).getOptionId() == 14960) {
                    ActivityRoster activityRoster6 = ActivityRoster.this;
                    ArrayList<Item> arrayList5 = new ArrayList<>();
                    int i25 = a;
                    int i26 = (((i25 ^ 37) | (i25 & 37)) << 1) - (((~i25) & 37) | (i25 & (-38)));
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    activityRoster6.aJ = arrayList5;
                    ActivityRoster activityRoster7 = ActivityRoster.this;
                    arrayList2 = activityRoster7.aJ;
                    item = new Item(activityRoster7.getResources().getString(R.string.marital_status));
                    int i28 = b;
                    i4 = ((i28 ^ 48) + ((i28 & 48) << 1)) - 1;
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        arrayList2.add(0, item);
                        i5 = 1;
                    } else {
                        arrayList2.add(0, item);
                        i5 = 0;
                    }
                    while (i5 < arrayList.size()) {
                        int i29 = a;
                        int i30 = i29 & 113;
                        int i31 = (i29 ^ 113) | i30;
                        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        int i34 = arrayList.get(i5).option_id;
                        int i35 = a;
                        i11 = (i35 ^ 41) + ((i35 & 41) << 1);
                        b = i11 % 128;
                        if (i11 % 2 != 0 ? i34 != 200 : i34 != 20784) {
                            if (arrayList.get(i5).option_id != 202) {
                                int i36 = b;
                                int i37 = (((i36 ^ 27) | (i36 & 27)) << 1) - (((~i36) & 27) | (i36 & (-28)));
                                a = i37 % 128;
                                int i38 = i37 % 2;
                                if (arrayList.get(i5).option_id != 203) {
                                    question_options question_optionsVar = arrayList.get(i5);
                                    Item item2 = new Item(question_optionsVar.option_id, question_optionsVar.option, question_optionsVar.question);
                                    int i39 = a;
                                    int i40 = ((i39 | 85) << 1) - (i39 ^ 85);
                                    b = i40 % 128;
                                    int i41 = i40 % 2;
                                    ActivityRoster.this.aJ.add(item2);
                                    int i42 = b;
                                    int i43 = i42 & 65;
                                    int i44 = (((i42 | 65) & (~i43)) - (~(i43 << 1))) - 1;
                                    a = i44 % 128;
                                    int i45 = i44 % 2;
                                }
                            }
                        }
                        int i46 = (((i5 & 44) | ((~i5) & (-45))) - (~((i5 & (-45)) << 1))) - 1;
                        int i47 = i46 ^ 46;
                        int i48 = ((i46 & 46) | i47) << 1;
                        int i49 = -i47;
                        i5 = (i49 | i48) + (i48 & i49);
                        int i50 = a;
                        int i51 = i50 & 39;
                        int i52 = (i50 | 39) & (~i51);
                        int i53 = i51 << 1;
                        i12 = (i52 ^ i53) + ((i52 & i53) << 1);
                        b = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i54 = 4 / 5;
                        }
                    }
                    activityRoster2 = ActivityRoster.this;
                    ActivityRoster activityRoster8 = ActivityRoster.this;
                    oVar = new o(activityRoster8.ae, R.layout.spinner_item, activityRoster8.aJ);
                    int i55 = b;
                    int i56 = i55 & 13;
                    int i57 = ((i55 ^ 13) | i56) << 1;
                    int i58 = -((i55 | 13) & (~i56));
                    i6 = (i57 & i58) + (i58 | i57);
                    a = i6 % 128;
                    if (i6 % 2 == 0) {
                        activityRoster2.aI = oVar;
                        oVar2 = ActivityRoster.this.aI;
                        int i59 = 12 / 0;
                    } else {
                        activityRoster2.aI = oVar;
                        oVar2 = ActivityRoster.this.aI;
                    }
                    oVar2.setDropDownViewResource(R.layout.spinner_item_dropdown);
                    activityRoster3 = ActivityRoster.this;
                    i7 = a + 33;
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        activityRoster3.sp_marital_status.setAdapter((SpinnerAdapter) activityRoster3.aI);
                        obj.hashCode();
                        throw null;
                    }
                    activityRoster3.sp_marital_status.setAdapter((SpinnerAdapter) activityRoster3.aI);
                    activityRoster4 = ActivityRoster.this;
                    if (activityRoster4.bD) {
                        int i60 = b;
                        int i61 = ((i60 ^ 47) | (i60 & 47)) << 1;
                        int i62 = -(((~i60) & 47) | (i60 & (-48)));
                        int i63 = (i61 & i62) + (i62 | i61);
                        a = i63 % 128;
                        int i64 = i63 % 2;
                        activityRoster4.bD = false;
                        int i65 = b;
                        int i66 = ((i65 & (-120)) | ((~i65) & 119)) + ((i65 & 119) << 1);
                        a = i66 % 128;
                        int i67 = i66 % 2;
                        i8 = 0;
                        while (true) {
                            arrayList3 = ActivityRoster.this.aJ;
                            int i68 = a;
                            int i69 = i68 & 7;
                            int i70 = -(-((i68 ^ 7) | i69));
                            i9 = ((i69 | i70) << 1) - (i70 ^ i69);
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                arrayList3.size();
                                throw null;
                            }
                            if (i8 < arrayList3.size()) {
                                i8 = 0;
                                break;
                            }
                            int i71 = b;
                            i10 = (i71 ^ 27) + ((i71 & 27) << 1);
                            a = i10 % 128;
                            if (i10 % 2 != 0) {
                                ActivityRoster.this.aJ.get(i8);
                                obj.hashCode();
                                throw null;
                            }
                            Item item3 = ActivityRoster.this.aJ.get(i8);
                            int i72 = a;
                            int i73 = (-2) - (((i72 & 82) + (i72 | 82)) ^ (-1));
                            b = i73 % 128;
                            int i74 = i73 % 2;
                            optionId = item3.getOptionId();
                            activityRoster5 = ActivityRoster.this;
                            int i75 = b;
                            int i76 = i75 & 97;
                            int i77 = (i75 ^ 97) | i76;
                            int i78 = (i76 & i77) + (i77 | i76);
                            a = i78 % 128;
                            int i79 = i78 % 2;
                            if (optionId == activityRoster5.bk.marital_status) {
                                int i80 = b + 107;
                                int i81 = i80 % 128;
                                a = i81;
                                int i82 = i80 % 2;
                                int i83 = i81 ^ 81;
                                int i84 = (i81 & 81) << 1;
                                int i85 = ((i83 | i84) << 1) - (i83 ^ i84);
                                b = i85 % 128;
                                int i86 = i85 % 2;
                                break;
                            }
                            i8 = (((i8 | 2) << 1) - (i8 ^ 2)) - 1;
                            int i87 = a;
                            int i88 = (((i87 | 68) << 1) - (i87 ^ 68)) - 1;
                            b = i88 % 128;
                            int i89 = i88 % 2;
                        }
                        ActivityRoster.this.sp_marital_status.setSelection(i8);
                        int i90 = a;
                        int i91 = i90 ^ 117;
                        int i92 = -(-((i90 & 117) << 1));
                        int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                        b = i93 % 128;
                        int i94 = i93 % 2;
                    }
                } else {
                    ArrayList<Item> arrayList6 = ActivityRoster.this.aM;
                    int i95 = a;
                    int i96 = i95 & 91;
                    int i97 = i96 + ((i95 ^ 91) | i96);
                    b = i97 % 128;
                    int i98 = i97 % 2;
                    Item item4 = arrayList6.get(this.c);
                    int i99 = b + 40;
                    int i100 = (i99 ^ (-1)) + (i99 << 1);
                    a = i100 % 128;
                    int i101 = i100 % 2;
                    if (item4.getOptionId() != 272) {
                        int i102 = a;
                        int i103 = i102 ^ 37;
                        int i104 = ((((i102 & 37) | i103) << 1) - (~(-i103))) - 1;
                        b = i104 % 128;
                        int i105 = i104 % 2;
                        ActivityRoster activityRoster9 = ActivityRoster.this;
                        if (activityRoster9.bD) {
                            activityRoster9.bD = false;
                            int i106 = b;
                            int i107 = i106 ^ 9;
                            int i108 = (((i106 & 9) | i107) << 1) - i107;
                            a = i108 % 128;
                            int i109 = i108 % 2;
                        } else {
                            ActivityRoster activityRoster10 = ActivityRoster.this;
                            au auVar = new au(activityRoster10, "marital_status", activityRoster10.getResources().getString(R.string.marital_status), ActivityRoster.this.sp_marital_status, new C0009OooO00o());
                            int i110 = a;
                            int i111 = (i110 & 75) + (i110 | 75);
                            b = i111 % 128;
                            int i112 = i111 % 2;
                            auVar.execute(new Void[0]);
                            int i113 = b;
                            int i114 = ((i113 | 75) << 1) - (i113 ^ 75);
                            a = i114 % 128;
                            if (i114 % 2 == 0) {
                                int i115 = 3 % 4;
                            }
                        }
                    } else {
                        ActivityRoster activityRoster11 = ActivityRoster.this;
                        ArrayList<Item> arrayList7 = new ArrayList<>();
                        int i210 = a;
                        int i211 = (((i210 ^ 37) | (i210 & 37)) << 1) - (((~i210) & 37) | (i210 & (-38)));
                        b = i211 % 128;
                        int i212 = i211 % 2;
                        activityRoster11.aJ = arrayList7;
                        ActivityRoster activityRoster12 = ActivityRoster.this;
                        arrayList2 = activityRoster12.aJ;
                        item = new Item(activityRoster12.getResources().getString(R.string.marital_status));
                        int i213 = b;
                        i4 = ((i213 ^ 48) + ((i213 & 48) << 1)) - 1;
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            arrayList2.add(0, item);
                            i5 = 1;
                        } else {
                            arrayList2.add(0, item);
                            i5 = 0;
                        }
                        while (i5 < arrayList.size()) {
                            int i214 = a;
                            int i310 = i214 & 113;
                            int i311 = (i214 ^ 113) | i310;
                            int i312 = (i310 ^ i311) + ((i311 & i310) << 1);
                            b = i312 % 128;
                            int i313 = i312 % 2;
                            int i314 = arrayList.get(i5).option_id;
                            int i315 = a;
                            i11 = (i315 ^ 41) + ((i315 & 41) << 1);
                            b = i11 % 128;
                            if (i11 % 2 != 0) {
                                if (arrayList.get(i5).option_id != 202) {
                                    int i316 = b;
                                    int i317 = (((i316 ^ 27) | (i316 & 27)) << 1) - (((~i316) & 27) | (i316 & (-28)));
                                    a = i317 % 128;
                                    int i318 = i317 % 2;
                                    if (arrayList.get(i5).option_id != 203) {
                                        question_options question_optionsVar2 = arrayList.get(i5);
                                        Item item5 = new Item(question_optionsVar2.option_id, question_optionsVar2.option, question_optionsVar2.question);
                                        int i319 = a;
                                        int i410 = ((i319 | 85) << 1) - (i319 ^ 85);
                                        b = i410 % 128;
                                        int i411 = i410 % 2;
                                        ActivityRoster.this.aJ.add(item5);
                                        int i412 = b;
                                        int i413 = i412 & 65;
                                        int i414 = (((i412 | 65) & (~i413)) - (~(i413 << 1))) - 1;
                                        a = i414 % 128;
                                        int i415 = i414 % 2;
                                    }
                                }
                            } else if (arrayList.get(i5).option_id != 202) {
                                int i3110 = b;
                                int i3111 = (((i3110 ^ 27) | (i3110 & 27)) << 1) - (((~i3110) & 27) | (i3110 & (-28)));
                                a = i3111 % 128;
                                int i3112 = i3111 % 2;
                                if (arrayList.get(i5).option_id != 203) {
                                    question_options question_optionsVar3 = arrayList.get(i5);
                                    Item item6 = new Item(question_optionsVar3.option_id, question_optionsVar3.option, question_optionsVar3.question);
                                    int i3113 = a;
                                    int i416 = ((i3113 | 85) << 1) - (i3113 ^ 85);
                                    b = i416 % 128;
                                    int i417 = i416 % 2;
                                    ActivityRoster.this.aJ.add(item6);
                                    int i418 = b;
                                    int i419 = i418 & 65;
                                    int i4110 = (((i418 | 65) & (~i419)) - (~(i419 << 1))) - 1;
                                    a = i4110 % 128;
                                    int i4111 = i4110 % 2;
                                }
                            }
                            int i420 = (((i5 & 44) | ((~i5) & (-45))) - (~((i5 & (-45)) << 1))) - 1;
                            int i421 = i420 ^ 46;
                            int i422 = ((i420 & 46) | i421) << 1;
                            int i423 = -i421;
                            i5 = (i423 | i422) + (i422 & i423);
                            int i510 = a;
                            int i511 = i510 & 39;
                            int i512 = (i510 | 39) & (~i511);
                            int i513 = i511 << 1;
                            i12 = (i512 ^ i513) + ((i512 & i513) << 1);
                            b = i12 % 128;
                            if (i12 % 2 != 0) {
                                int i514 = 4 / 5;
                            }
                        }
                        activityRoster2 = ActivityRoster.this;
                        ActivityRoster activityRoster13 = ActivityRoster.this;
                        oVar = new o(activityRoster13.ae, R.layout.spinner_item, activityRoster13.aJ);
                        int i515 = b;
                        int i516 = i515 & 13;
                        int i517 = ((i515 ^ 13) | i516) << 1;
                        int i518 = -((i515 | 13) & (~i516));
                        i6 = (i517 & i518) + (i518 | i517);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            activityRoster2.aI = oVar;
                            oVar2 = ActivityRoster.this.aI;
                            int i519 = 12 / 0;
                        } else {
                            activityRoster2.aI = oVar;
                            oVar2 = ActivityRoster.this.aI;
                        }
                        oVar2.setDropDownViewResource(R.layout.spinner_item_dropdown);
                        activityRoster3 = ActivityRoster.this;
                        i7 = a + 33;
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            activityRoster3.sp_marital_status.setAdapter((SpinnerAdapter) activityRoster3.aI);
                            obj.hashCode();
                            throw null;
                        }
                        activityRoster3.sp_marital_status.setAdapter((SpinnerAdapter) activityRoster3.aI);
                        activityRoster4 = ActivityRoster.this;
                        if (activityRoster4.bD) {
                            int i610 = b;
                            int i611 = ((i610 ^ 47) | (i610 & 47)) << 1;
                            int i612 = -(((~i610) & 47) | (i610 & (-48)));
                            int i613 = (i611 & i612) + (i612 | i611);
                            a = i613 % 128;
                            int i614 = i613 % 2;
                            activityRoster4.bD = false;
                            int i615 = b;
                            int i616 = ((i615 & (-120)) | ((~i615) & 119)) + ((i615 & 119) << 1);
                            a = i616 % 128;
                            int i617 = i616 % 2;
                            i8 = 0;
                            while (true) {
                                arrayList3 = ActivityRoster.this.aJ;
                                int i618 = a;
                                int i619 = i618 & 7;
                                int i710 = -(-((i618 ^ 7) | i619));
                                i9 = ((i619 | i710) << 1) - (i710 ^ i619);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    arrayList3.size();
                                    throw null;
                                }
                                if (i8 < arrayList3.size()) {
                                    i8 = 0;
                                    break;
                                }
                                int i711 = b;
                                i10 = (i711 ^ 27) + ((i711 & 27) << 1);
                                a = i10 % 128;
                                if (i10 % 2 != 0) {
                                    ActivityRoster.this.aJ.get(i8);
                                    obj.hashCode();
                                    throw null;
                                }
                                Item item7 = ActivityRoster.this.aJ.get(i8);
                                int i712 = a;
                                int i713 = (-2) - (((i712 & 82) + (i712 | 82)) ^ (-1));
                                b = i713 % 128;
                                int i714 = i713 % 2;
                                optionId = item7.getOptionId();
                                activityRoster5 = ActivityRoster.this;
                                int i715 = b;
                                int i716 = i715 & 97;
                                int i717 = (i715 ^ 97) | i716;
                                int i718 = (i716 & i717) + (i717 | i716);
                                a = i718 % 128;
                                int i719 = i718 % 2;
                                if (optionId == activityRoster5.bk.marital_status) {
                                    int i810 = b + 107;
                                    int i811 = i810 % 128;
                                    a = i811;
                                    int i812 = i810 % 2;
                                    int i813 = i811 ^ 81;
                                    int i814 = (i811 & 81) << 1;
                                    int i815 = ((i813 | i814) << 1) - (i813 ^ i814);
                                    b = i815 % 128;
                                    int i816 = i815 % 2;
                                    break;
                                }
                                i8 = (((i8 | 2) << 1) - (i8 ^ 2)) - 1;
                                int i817 = a;
                                int i818 = (((i817 | 68) << 1) - (i817 ^ 68)) - 1;
                                b = i818 % 128;
                                int i819 = i818 % 2;
                            }
                            ActivityRoster.this.sp_marital_status.setSelection(i8);
                            int i910 = a;
                            int i911 = i910 ^ 117;
                            int i912 = -(-((i910 & 117) << 1));
                            int i913 = ((i911 | i912) << 1) - (i912 ^ i911);
                            b = i913 % 128;
                            int i914 = i913 % 2;
                        }
                    }
                }
                ArrayList<Item> arrayList8 = ActivityRoster.this.aM;
                int i116 = this.c;
                int i117 = b + 95;
                a = i117 % 128;
                int i118 = i117 % 2;
                if (arrayList8.get(i116).getOptionId() == 186) {
                    int i119 = b;
                    int i120 = i119 & 51;
                    int i121 = ((((i119 ^ 51) | i120) << 1) - (~(-((i119 | 51) & (~i120))))) - 1;
                    a = i121 % 128;
                    if (i121 % 2 == 0) {
                        double d2 = ActivityRoster.this.aU;
                        obj.hashCode();
                        throw null;
                    }
                    ActivityRoster activityRoster14 = ActivityRoster.this;
                    double d3 = activityRoster14.aU;
                    int i122 = b;
                    int i123 = i122 & 9;
                    int i124 = (i122 ^ 9) | i123;
                    int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
                    int i126 = i125 % 128;
                    a = i126;
                    if (i125 % 2 != 0 ? d3 > 0.0d : d3 > 0.0d) {
                        activityRoster = ActivityRoster.this;
                        d = activityRoster.aU;
                        i3 = b;
                        int i127 = ((i3 ^ 107) | (i3 & 107)) << 1;
                        int i128 = -((i3 & (-108)) | ((~i3) & 107));
                        int i129 = (i127 ^ i128) + ((i127 & i128) << 1);
                        a = i129 % 128;
                        int i130 = i129 % 2;
                        if (d < 18.0d) {
                            int i131 = i3 + 43;
                            a = i131 % 128;
                            int i132 = i131 % 2;
                            activityRoster.I(d);
                            int i133 = a;
                            int i134 = ((i133 ^ 26) + ((i133 & 26) << 1)) - 1;
                            b = i134 % 128;
                            int i135 = i134 % 2;
                        }
                    } else {
                        int i136 = (((i126 | 50) << 1) - (i126 ^ 50)) - 1;
                        b = i136 % 128;
                        if (i136 % 2 != 0) {
                            int i137 = 46 / 0;
                            if (i2 == 0) {
                                if (activityRoster14.spinnerMonth.getSelectedItemPosition() > 0) {
                                    activityRoster = ActivityRoster.this;
                                    d = activityRoster.aU;
                                    i3 = b;
                                    int i1210 = ((i3 ^ 107) | (i3 & 107)) << 1;
                                    int i1211 = -((i3 & (-108)) | ((~i3) & 107));
                                    int i1212 = (i1210 ^ i1211) + ((i1210 & i1211) << 1);
                                    a = i1212 % 128;
                                    int i138 = i1212 % 2;
                                    if (d < 18.0d) {
                                        int i139 = i3 + 43;
                                        a = i139 % 128;
                                        int i1310 = i139 % 2;
                                        activityRoster.I(d);
                                        int i1311 = a;
                                        int i1312 = ((i1311 ^ 26) + ((i1311 & 26) << 1)) - 1;
                                        b = i1312 % 128;
                                        int i1313 = i1312 % 2;
                                    }
                                }
                            }
                        } else if (i2 == 0) {
                            if (activityRoster14.spinnerMonth.getSelectedItemPosition() > 0) {
                                activityRoster = ActivityRoster.this;
                                d = activityRoster.aU;
                                i3 = b;
                                int i1213 = ((i3 ^ 107) | (i3 & 107)) << 1;
                                int i1214 = -((i3 & (-108)) | ((~i3) & 107));
                                int i1215 = (i1213 ^ i1214) + ((i1213 & i1214) << 1);
                                a = i1215 % 128;
                                int i1314 = i1215 % 2;
                                if (d < 18.0d) {
                                    int i1315 = i3 + 43;
                                    a = i1315 % 128;
                                    int i1316 = i1315 % 2;
                                    activityRoster.I(d);
                                    int i1317 = a;
                                    int i1318 = ((i1317 ^ 26) + ((i1317 & 26) << 1)) - 1;
                                    b = i1318 % 128;
                                    int i1319 = i1318 % 2;
                                }
                            }
                        }
                    }
                }
                int i140 = a;
                int i141 = i140 & 111;
                int i142 = ((((i140 ^ 111) | i141) << 1) - (~(-((i140 | 111) & (~i141))))) - 1;
                b = i142 % 128;
                int i143 = i142 % 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0558  */
    /* JADX WARN: Code duplicated, block: B:103:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:104:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:16:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x020c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0247  */
    /* JADX WARN: Code duplicated, block: B:45:0x0250  */
    /* JADX WARN: Code duplicated, block: B:65:0x039f  */
    /* JADX WARN: Code duplicated, block: B:79:0x044e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0492  */
    /* JADX WARN: Code duplicated, block: B:84:0x049e  */
    /* JADX WARN: Code duplicated, block: B:87:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:89:0x04e9  */
    public final JSONObject M(Spinner spinner, ArrayList arrayList, LinearLayout linearLayout) throws Exception {
        boolean z;
        String strTrim;
        int i;
        Object objValueOf;
        Spinner spinner2;
        int i2;
        Object objValueOf2;
        int selectedItemPosition;
        Object[] objArr;
        int i3;
        boolean z2;
        boolean z3;
        CheckBox checkBox;
        int i4 = 2;
        int i5 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Roster roster = this.bk;
        double d = roster.age * 365.0d;
        String str = roster.gender;
        Object obj = null;
        int i6 = 4;
        if (d > this.bw * 365) {
            int i7 = q + 9;
            p = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (str != null) {
                Object[] objArr2 = new Object[1];
                a(6 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 23899), 352 - Drawable.resolveOpacity(0, 0), objArr2);
                if (str.equalsIgnoreCase(((String) objArr2[0]).intern()) && d >= 3285.0d && d <= this.bI * 365) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Object[] objArr3 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 38, (char) (getApplicationInfo().targetSdkVersion + 22917), getPackageName().length() + 486, objArr3);
            jSONObject.put(((String) objArr3[0]).intern(), BuildConfig.FLAVOR);
            Object[] objArr4 = new Object[1];
            a(18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), Color.green(0) + 522, objArr4);
            jSONObject.put(((String) objArr4[0]).intern(), JSONObject.NULL);
            return jSONObject;
        }
        int selectedItemPosition2 = spinner.getSelectedItemPosition();
        if (selectedItemPosition2 < 0 || selectedItemPosition2 >= arrayList.size()) {
            strTrim = BuildConfig.FLAVOR;
            i = 0;
        } else {
            i = ((question_options) arrayList.get(selectedItemPosition2)).option_id;
            strTrim = ((question_options) arrayList.get(selectedItemPosition2)).option.trim();
        }
        if (i == 0) {
            Object[] objArr5 = new Object[1];
            a(getPackageName().codePointAt(15) - 107, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30657), getApplicationInfo().targetSdkVersion + 509, objArr5);
            objValueOf = ((String) objArr5[0]).intern();
        } else {
            objValueOf = String.valueOf(i);
            int i8 = q + 53;
            p = i8 % 128;
            int i9 = i8 % 2;
        }
        Object[] objArr6 = new Object[1];
        a(11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 22899), (ViewConfiguration.getTouchSlop() >> 8) + 511, objArr6);
        jSONObject.put(((String) objArr6[0]).intern(), objValueOf);
        JSONArray jSONArray = new JSONArray();
        Object[] objArr7 = new Object[1];
        a(View.MeasureSpec.getMode(0) + 13, (char) (getApplicationInfo().targetSdkVersion + 54571), getPackageName().length() + 518, objArr7);
        if (strTrim.equalsIgnoreCase(((String) objArr7[0]).intern())) {
            spinner2 = this.bg;
            if (spinner2 != null) {
                i2 = 0;
            } else {
                i2 = 0;
            }
            JSONObject jSONObject2 = new JSONObject();
            Object[] objArr8 = new Object[1];
            a(16 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), (char) (46414 - Color.green(0)), 571 - Drawable.resolveOpacity(0, 0), objArr8);
            jSONObject2.put(((String) objArr8[0]).intern(), i);
            Object[] objArr9 = new Object[1];
            a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 9395), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 473, objArr9);
            jSONObject2.put(((String) objArr9[0]).intern(), i);
            if (i2 > 0) {
                objValueOf2 = Integer.valueOf(i2);
            } else {
                objValueOf2 = JSONObject.NULL;
            }
            Object[] objArr10 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 25, (char) (getApplicationInfo().targetSdkVersion + 36722), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 603, objArr10);
            jSONObject2.put(((String) objArr10[0]).intern(), objValueOf2);
            jSONArray.put(jSONObject2);
        } else {
            int i10 = p + 9;
            q = i10 % 128;
            if (i10 % 2 == 0) {
                Object[] objArr11 = new Object[1];
                a(4 / ExpandableListView.getPackedPositionGroup(0L), (char) (61 - getApplicationInfo().targetSdkVersion), 23385 >>> AndroidCharacter.getMirror('4'), objArr11);
                if (!strTrim.equalsIgnoreCase(((String) objArr11[0]).intern())) {
                    objArr = new Object[1];
                    a(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 13, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 41372), getPackageName().codePointAt(4) + 512, objArr);
                    if (!strTrim.equalsIgnoreCase(((String) objArr[0]).intern())) {
                        i3 = 0;
                        z2 = false;
                        z3 = false;
                        while (i3 < linearLayout.getChildCount()) {
                            View childAt = linearLayout.getChildAt(i3);
                            checkBox = (CheckBox) childAt.findViewById(R.id.cb_vaccine);
                            Spinner spinner3 = (Spinner) childAt.findViewById(R.id.spinner_response);
                            Spinner spinner4 = (Spinner) childAt.findViewById(R.id.spinner_reason);
                            if (checkBox == null && spinner3 != null && spinner4 != null) {
                                Object tag = childAt.getTag();
                                if (tag == null) {
                                    int i11 = q + 97;
                                    p = i11 % 128;
                                    if (i11 % i4 != 0) {
                                        int i12 = 74 / 0;
                                    }
                                } else {
                                    int iIntValue = ((Integer) tag).intValue();
                                    if (checkBox.isChecked()) {
                                        JSONObject jSONObject3 = new JSONObject();
                                        Object[] objArr12 = new Object[1];
                                        a(getApplicationInfo().targetSdkVersion - 14, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, i6).codePointAt(2) + 46378), (ViewConfiguration.getEdgeSlop() >> 16) + 571, objArr12);
                                        jSONObject3.put(((String) objArr12[0]).intern(), iIntValue);
                                        int selectedItemPosition3 = spinner3.getSelectedItemPosition();
                                        if (selectedItemPosition3 < 0 || selectedItemPosition3 >= this.bp.size()) {
                                            Object[] objArr13 = new Object[1];
                                            a(View.resolveSizeAndState(0, 0, 0) + 20, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 9396), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 588, objArr13);
                                            jSONObject3.put(((String) objArr13[0]).intern(), JSONObject.NULL);
                                        } else {
                                            int i13 = this.bp.get(selectedItemPosition3).option_id;
                                            String strTrim2 = this.bp.get(selectedItemPosition3).option.trim();
                                            Object[] objArr14 = new Object[1];
                                            a(getApplicationInfo().targetSdkVersion - 11, (char) (getApplicationInfo().targetSdkVersion + 9401), 588 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr14);
                                            jSONObject3.put(((String) objArr14[0]).intern(), i13);
                                            Object[] objArr15 = new Object[1];
                                            a(20 - Color.red(0), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 32315), getApplicationInfo().targetSdkVersion + 577, objArr15);
                                            if (strTrim2.equalsIgnoreCase(((String) objArr15[0]).intern())) {
                                                z3 = true;
                                            } else {
                                                Object[] objArr16 = new Object[1];
                                                a(11 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 63953), 628 - Color.blue(0), objArr16);
                                                if (strTrim2.equalsIgnoreCase(((String) objArr16[0]).intern())) {
                                                    z3 = true;
                                                }
                                            }
                                        }
                                        int selectedItemPosition4 = spinner4.getVisibility() == 0 ? spinner4.getSelectedItemPosition() : -1;
                                        if (selectedItemPosition4 >= 0) {
                                            int i14 = q + 21;
                                            p = i14 % 128;
                                            if (i14 % 2 != 0) {
                                                this.bq.size();
                                                Object obj2 = null;
                                                obj2.hashCode();
                                                throw null;
                                            }
                                            if (selectedItemPosition4 < this.bq.size()) {
                                                Object[] objArr17 = new Object[1];
                                                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 30, (char) (36753 - (ViewConfiguration.getJumpTapTimeout() >> 16)), getApplicationInfo().targetSdkVersion + 609, objArr17);
                                                jSONObject3.put(((String) objArr17[0]).intern(), this.bq.get(selectedItemPosition4).option_id);
                                            } else {
                                                Object[] objArr18 = new Object[1];
                                                a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 5, (char) (getApplicationInfo().targetSdkVersion + 36722), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 603, objArr18);
                                                jSONObject3.put(((String) objArr18[0]).intern(), JSONObject.NULL);
                                            }
                                        } else {
                                            Object[] objArr19 = new Object[1];
                                            a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 5, (char) (getApplicationInfo().targetSdkVersion + 36722), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 603, objArr19);
                                            jSONObject3.put(((String) objArr19[0]).intern(), JSONObject.NULL);
                                        }
                                        jSONArray.put(jSONObject3);
                                        z2 = true;
                                    }
                                }
                            }
                            i3++;
                            i4 = 2;
                            i6 = 4;
                        }
                        if (z2) {
                            Object[] objArr20 = new Object[1];
                            a(36 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 36885), getPackageName().length() + 688, objArr20);
                            throw new Exception(((String) objArr20[0]).intern());
                        }
                        int i15 = p + 43;
                        q = i15 % 128;
                        int i16 = i15 % 2;
                        if (!z3) {
                            Object[] objArr21 = new Object[1];
                            a(67 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getPackageName().codePointAt(17) + 537, objArr21);
                            throw new Exception(((String) objArr21[0]).intern());
                        }
                    }
                }
            } else {
                Object[] objArr22 = new Object[1];
                a(ExpandableListView.getPackedPositionGroup(0L) + 2, (char) (getApplicationInfo().targetSdkVersion - 31), AndroidCharacter.getMirror('0') + 508, objArr22);
                if (!strTrim.equalsIgnoreCase(((String) objArr22[0]).intern())) {
                    objArr = new Object[1];
                    a(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 13, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 41372), getPackageName().codePointAt(4) + 512, objArr);
                    if (!strTrim.equalsIgnoreCase(((String) objArr[0]).intern())) {
                        i3 = 0;
                        z2 = false;
                        z3 = false;
                        while (i3 < linearLayout.getChildCount()) {
                            View childAt2 = linearLayout.getChildAt(i3);
                            checkBox = (CheckBox) childAt2.findViewById(R.id.cb_vaccine);
                            Spinner spinner5 = (Spinner) childAt2.findViewById(R.id.spinner_response);
                            Spinner spinner6 = (Spinner) childAt2.findViewById(R.id.spinner_reason);
                            if (checkBox == null) {
                            }
                            i3++;
                            i4 = 2;
                            i6 = 4;
                        }
                        if (z2) {
                            Object[] objArr23 = new Object[1];
                            a(36 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 36885), getPackageName().length() + 688, objArr23);
                            throw new Exception(((String) objArr23[0]).intern());
                        }
                        int i17 = p + 43;
                        q = i17 % 128;
                        int i18 = i17 % 2;
                        if (!z3) {
                            Object[] objArr24 = new Object[1];
                            a(67 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getPackageName().codePointAt(17) + 537, objArr24);
                            throw new Exception(((String) objArr24[0]).intern());
                        }
                    }
                }
            }
            spinner2 = this.bg;
            if (spinner2 != null || spinner2.getVisibility() != 0 || (selectedItemPosition = this.bg.getSelectedItemPosition()) < 0 || selectedItemPosition >= this.bq.size()) {
                i2 = 0;
            } else {
                int i19 = p + 13;
                q = i19 % 128;
                int i20 = i19 % 2;
                i2 = this.bq.get(selectedItemPosition).option_id;
            }
            JSONObject jSONObject4 = new JSONObject();
            Object[] objArr25 = new Object[1];
            a(16 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), (char) (46414 - Color.green(0)), 571 - Drawable.resolveOpacity(0, 0), objArr25);
            jSONObject4.put(((String) objArr25[0]).intern(), i);
            Object[] objArr26 = new Object[1];
            a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 9395), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 473, objArr26);
            jSONObject4.put(((String) objArr26[0]).intern(), i);
            if (i2 > 0) {
                objValueOf2 = Integer.valueOf(i2);
            } else {
                objValueOf2 = JSONObject.NULL;
            }
            Object[] objArr110 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 25, (char) (getApplicationInfo().targetSdkVersion + 36722), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 603, objArr110);
            jSONObject4.put(((String) objArr110[0]).intern(), objValueOf2);
            jSONArray.put(jSONObject4);
        }
        int length = jSONArray.length();
        Object obj3 = jSONArray;
        if (length == 0) {
            obj3 = JSONObject.NULL;
        }
        Object[] objArr27 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 18, (char) (getPackageName().length() - 25), 523 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr27);
        jSONObject.put(((String) objArr27[0]).intern(), obj3);
        return jSONObject;
    }

    public final void N() {
        int i = 2 % 2;
        int i2 = p + 79;
        q = i2 % 128;
        int i3 = i2 % 2;
        this.spinnerYear.setSelection(0);
        this.aU = 0.0d;
        this.tv_dob.setText(BuildConfig.FLAVOR);
        this.bW = BuildConfig.FLAVOR;
        this.linearLayoutCNIC.setVisibility(0);
        this.linearLayoutCNICPic.setVisibility(8);
        this.radioGroupCNICOptions.setVisibility(8);
        this.et_RosterCNIC.setVisibility(8);
        this.et_RosterCNICRepeat.setVisibility(8);
        this.buttonScanCNIC.setVisibility(8);
        this.btn_vald_cnic.setVisibility(8);
        int i4 = p + 61;
        q = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0253 A[Catch: Exception -> 0x0416, TryCatch #1 {Exception -> 0x0416, blocks: (B:6:0x00f7, B:7:0x0221, B:11:0x0234, B:13:0x0240, B:22:0x0258, B:21:0x0253, B:19:0x0247, B:23:0x025b, B:27:0x0297, B:36:0x03ce, B:39:0x03dd, B:40:0x03e0, B:28:0x034a, B:32:0x036d, B:35:0x037e, B:33:0x0373, B:34:0x0379), top: B:49:0x00f7 }] */
    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        TextView textView = (TextView) findViewById(R.id.application_version_textView);
        Object[] objArr = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 7, (char) (getPackageName().length() - 25), getApplicationInfo().targetSdkVersion + 22, objArr);
        textView.setText(((String) objArr[0]).intern());
        this.bN = (BISPApplication) getApplicationContext();
        this.aL = (ImageView) findViewById(R.id.roaster_finger);
        new C0145s().c();
        new ProgressDialog(this);
        this.ll_nadra_name.setVisibility(8);
        this.cd = 1;
        Object[] objArr2 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 37, (char) (getApplicationInfo().targetSdkVersion - 31), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 60, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(getApplicationInfo().targetSdkVersion + 9, (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1), ImageFormat.getBitsPerPixel(0) + 106, objArr3);
        String[] strArr = {strIntern, ((String) objArr3[0]).intern()};
        if (!A(this, strArr)) {
            k.c(this, strArr, this.cd);
        }
        this.ak = ivas.gov.bisp.enumeration.p037bj.c.c(getApplicationContext());
        new ArrayList();
        this.ak.f();
        try {
            this.bQ = new Dialog(this);
            new SessionManager(this);
            new ProgressDialog(this);
            this.bQ.setContentView(R.layout.dialog_capturefinger);
            Dialog dialog = this.bQ;
            Object[] objArr4 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 2, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 21859), getApplicationInfo().targetSdkVersion + 114, objArr4);
            dialog.setTitle(((String) objArr4[0]).intern());
            this.ag = (RadioButton) this.bQ.findViewById(R.id.left_hand);
            this.ah = (RadioButton) this.bQ.findViewById(R.id.right_hand);
            this.aj = (Button) this.bQ.findViewById(R.id.select_finger);
            this.ai = (ImageView) this.bQ.findViewById(R.id.imageview_fp);
            this.ag.setOnCheckedChangeListener(new ivas.gov.bisp.enumeration.bI.N(this));
            this.ah.setOnCheckedChangeListener(new L(this));
            this.aj.setOnClickListener(new ViewOnClickListenerC0124s(this));
            this.et_RosterCNICRepeat.requestFocus();
            Intent intent = getIntent();
            Object[] objArr5 = new Object[1];
            a(7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') + 24206), getPackageName().codePointAt(7) + 33, objArr5);
            this.bd = (Survey) intent.getSerializableExtra(((String) objArr5[0]).intern());
            Intent intent2 = getIntent();
            Object[] objArr6 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 38, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion + 126, objArr6);
            this.aV = (ArrayList) intent2.getSerializableExtra(((String) objArr6[0]).intern());
            this.aZ = 0;
            for (int i2 = 0; i2 < this.aV.size(); i2++) {
                int i3 = p + 51;
                q = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 57 / 0;
                    if (this.aV.get(i2).bioImage != null) {
                        this.aZ++;
                    }
                } else if (this.aV.get(i2).bioImage != null) {
                    this.aZ++;
                }
            }
            Intent intent3 = getIntent();
            Object[] objArr7 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 24, (char) (29212 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR)), getApplicationInfo().targetSdkVersion + 137, objArr7);
            boolean booleanExtra = intent3.getBooleanExtra(((String) objArr7[0]).intern(), false);
            this.aX = booleanExtra;
            this.bD = booleanExtra;
            if (booleanExtra) {
                int i5 = q + 103;
                p = i5 % 128;
                int i6 = i5 % 2;
                Intent intent4 = getIntent();
                Object[] objArr8 = new Object[1];
                a(14 - View.getDefaultSize(0, 0), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 37076), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 174, objArr8);
                this.aW = intent4.getIntExtra(((String) objArr8[0]).intern(), -1);
                Intent intent5 = getIntent();
                Object[] objArr9 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 18, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 190, objArr9);
                this.bo = intent5.getStringExtra(((String) objArr9[0]).intern());
                Roster roster = this.aV.get(this.aW);
                this.bk = roster;
                String str = roster.cnic;
                Object[] objArr10 = new Object[1];
                a(getPackageName().codePointAt(8) - 45, (char) (getApplicationInfo().targetSdkVersion + 26795), getPackageName().length() - 25, objArr10);
                str.replace(((String) objArr10[0]).intern(), BuildConfig.FLAVOR);
            } else {
                this.et_RosterCNIC.setVisibility(0);
                this.et_RosterCNICRepeat.setVisibility(0);
                this.buttonScanCNIC.setVisibility(8);
                this.btn_vald_cnic.setVisibility(8);
                if (this.aZ < 3) {
                    int i7 = q + 13;
                    p = i7 % 128;
                    if (i7 % 2 != 0) {
                        this.btn_bio_cnic.setEnabled(false);
                    } else {
                        this.btn_bio_cnic.setEnabled(true);
                    }
                } else {
                    this.btn_bio_cnic.setEnabled(false);
                }
                this.et_RosterCNIC.requestFocus();
                Object[] objArr11 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 37, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), 207 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr11);
                ((InputMethodManager) getSystemService(((String) objArr11[0]).intern())).showSoftInput(this.et_RosterCNIC, 1);
                this.bh = ivas.gov.bisp.enumeration.p026az.z.e();
            }
            K();
            if (this.aX) {
                int i8 = q + 7;
                p = i8 % 128;
                int i9 = i8 % 2;
                S();
            }
            this.spinnerYear.setOnItemSelectedListener(this.bF);
            this.spinnerMonth.setOnItemSelectedListener(this.bx);
            this.sp_relation_to_household.setOnItemSelectedListener(this.bs);
            this.sp_marital_status.setOnItemSelectedListener(this.by);
            this.sp_attended_school.setOnItemSelectedListener(this.bt);
            this.sp_work_activity.setOnItemSelectedListener(this.bv);
            int i10 = p + 17;
            q = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 3;
            }
        } catch (Exception unused) {
        }
        ac.e(this.et_RosterCNIC);
        ac.e(this.et_RosterCNICRepeat);
    }

    public class o000000O implements TextWatcher {
        private static int a = 1;
        private static int b;
        public EditText c;

        public o000000O(EditText editText) {
            this.c = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 124) << 1) - (i2 ^ 124)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (i5 & 99) + (i5 | 99);
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:104:0x029a A[Catch: Exception -> 0x044f, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:106:0x029e  */
        /* JADX WARN: Code duplicated, block: B:108:0x02b4 A[Catch: Exception -> 0x044f, TRY_ENTER, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:110:0x02bc A[Catch: Exception -> 0x044f, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:116:0x02dd  */
        /* JADX WARN: Code duplicated, block: B:118:0x02f7 A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:125:0x030a A[Catch: Exception -> 0x044f, TRY_ENTER, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:128:0x031c  */
        /* JADX WARN: Code duplicated, block: B:130:0x0333 A[Catch: Exception -> 0x044f, TRY_ENTER, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:132:0x033d A[Catch: Exception -> 0x044f, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:145:0x03a1 A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:150:0x03ae A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:153:0x03c4 A[Catch: Exception -> 0x044f, TRY_ENTER, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:154:0x03c7 A[Catch: Exception -> 0x044f, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:162:0x0402 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:163:0x0403  */
        /* JADX WARN: Code duplicated, block: B:165:0x0407 A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:170:0x0436 A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x01be A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:76:0x01d7 A[Catch: Exception -> 0x044f, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0242 A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0257 A[Catch: Exception -> 0x044f, TRY_ENTER, TryCatch #1 {Exception -> 0x044f, blocks: (B:4:0x001b, B:7:0x003c, B:12:0x005a, B:14:0x006f, B:16:0x0086, B:19:0x00a1, B:30:0x00d6, B:35:0x00ed, B:37:0x00f3, B:41:0x0112, B:43:0x0121, B:46:0x0132, B:48:0x013e, B:54:0x014d, B:56:0x0161, B:59:0x0182, B:93:0x0266, B:101:0x0294, B:104:0x029a, B:108:0x02b4, B:110:0x02bc, B:114:0x02d7, B:118:0x02f7, B:120:0x0305, B:126:0x0316, B:130:0x0333, B:132:0x033d, B:135:0x0352, B:137:0x0368, B:140:0x037d, B:142:0x0396, B:145:0x03a1, B:146:0x03a8, B:147:0x03ab, B:150:0x03ae, B:153:0x03c4, B:154:0x03c7, B:125:0x030a, B:157:0x03d3, B:159:0x03f6, B:165:0x0407, B:167:0x0422, B:170:0x0436, B:171:0x0438, B:172:0x043b, B:61:0x01a0, B:62:0x01af, B:63:0x01b2, B:53:0x0143, B:42:0x011a, B:66:0x01b5, B:67:0x01b8, B:68:0x01bb, B:71:0x01be, B:74:0x01d1, B:76:0x01d7, B:78:0x01f6, B:80:0x020e, B:82:0x0221, B:85:0x0242, B:87:0x0252, B:92:0x0257, B:20:0x00a5, B:21:0x00a8, B:22:0x00ab, B:13:0x0065, B:25:0x00ae, B:28:0x00c2, B:175:0x043e, B:176:0x0440, B:177:0x0443, B:180:0x0446, B:181:0x0449, B:182:0x044c), top: B:192:0x0019 }] */
        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditText editText;
            int i4;
            int i5;
            int i6;
            int i7;
            int checkedRadioButtonId;
            RadioButton radioButton;
            ActivityRoster activityRoster;
            int i8;
            int i9;
            int i10 = 2 % 2;
            int i11 = a;
            int i12 = ((i11 | 122) << 1) - (i11 ^ 122);
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            b = i13 % 128;
            Object obj = null;
            try {
                if (i13 % 2 != 0) {
                    charSequence.toString();
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String string = charSequence.toString();
                ActivityRoster activityRoster2 = ActivityRoster.this;
                int i14 = b;
                int i15 = ((i14 ^ 7) | (i14 & 7)) << 1;
                int i16 = -(((~i14) & 7) | (i14 & (-8)));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    boolean z = activityRoster2.aX;
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!activityRoster2.aX) {
                    int i18 = a;
                    int i19 = i18 & 51;
                    int i20 = -(-((i18 ^ 51) | i19));
                    int i21 = (i19 & i20) + (i20 | i19);
                    b = i21 % 128;
                    if (i21 % 2 != 0) {
                        activityRoster2.F();
                        ActivityRoster.this.vald_txt_view_caption.setVisibility(97);
                    } else {
                        activityRoster2.F();
                        ActivityRoster.this.vald_txt_view_caption.setVisibility(8);
                    }
                    ActivityRoster.this.vald_txt_view.setVisibility(8);
                    ActivityRoster activityRoster3 = ActivityRoster.this;
                    int i22 = b;
                    int i23 = i22 & 13;
                    int i24 = ((i22 | 13) & (~i23)) + (i23 << 1);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    activityRoster3.vald_name_txt_view.setVisibility(8);
                    ActivityRoster activityRoster4 = ActivityRoster.this;
                    int i26 = a;
                    int i27 = i26 ^ 67;
                    int i28 = ((i26 & 67) | i27) << 1;
                    int i29 = -i27;
                    int i30 = (i28 & i29) + (i28 | i29);
                    b = i30 % 128;
                    if (i30 % 2 != 0) {
                        activityRoster4.G();
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    activityRoster4.G();
                } else if (activityRoster2.be) {
                    int i31 = a;
                    int i32 = (-2) - (((i31 & 74) + (i31 | 74)) ^ (-1));
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    activityRoster2.bH = false;
                    int i34 = b;
                    int i35 = i34 ^ 109;
                    int i36 = ((i34 & 109) | i35) << 1;
                    int i37 = -i35;
                    int i38 = (i36 & i37) + (i36 | i37);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                }
                if (string.length() == 14) {
                    int i40 = a + 39;
                    b = i40 % 128;
                    if (i40 % 2 != 0) {
                        string.endsWith("-");
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (!string.endsWith("-")) {
                        EditText editText2 = this.c;
                        StringBuilder sb = new StringBuilder();
                        int i41 = b;
                        int i42 = i41 ^ 87;
                        int i43 = ((i41 & 87) | i42) << 1;
                        int i44 = -i42;
                        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                        a = i45 % 128;
                        if (i45 % 2 == 0) {
                            sb.append(string.substring(1, 4));
                        } else {
                            sb.append(string.substring(0, 5));
                        }
                        sb.append("-");
                        int i46 = a;
                        int i47 = (i46 & 95) + (i46 | 95);
                        b = i47 % 128;
                        if (i47 % 2 != 0) {
                            sb.append(string.substring(6, 13));
                            sb.append("-");
                            int i48 = 13 / 0;
                        } else {
                            sb.append(string.substring(6, 13));
                            sb.append("-");
                        }
                        sb.append(string.substring(13));
                        int i49 = (-2) - ((a + 54) ^ (-1));
                        b = i49 % 128;
                        int i50 = i49 % 2;
                        editText2.setText(sb.toString());
                        EditText editText3 = this.c;
                        int i51 = b;
                        int i52 = (i51 | 83) << 1;
                        int i53 = -(((~i51) & 83) | (i51 & (-84)));
                        int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                        a = i54 % 128;
                        if (i54 % 2 == 0) {
                            editText3.setSelection(editText3.getText().toString().length());
                            try {
                                obj.hashCode();
                                throw null;
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        editText3.setSelection(editText3.getText().toString().length());
                        int i55 = a;
                        int i56 = ((i55 & 96) + (i55 | 96)) - 1;
                        b = i56 % 128;
                        int i57 = i56 % 2;
                    } else if (string.length() == 6) {
                        int i58 = a;
                        int i59 = i58 & 75;
                        int i60 = i59 + ((i58 ^ 75) | i59);
                        b = i60 % 128;
                        int i61 = i60 % 2;
                        if (!string.endsWith("-")) {
                            EditText editText4 = this.c;
                            StringBuilder sb2 = new StringBuilder();
                            int i62 = b;
                            int i63 = ((i62 ^ 11) | (i62 & 11)) << 1;
                            int i64 = -(((~i62) & 11) | (i62 & (-12)));
                            int i65 = (i63 & i64) + (i64 | i63);
                            a = i65 % 128;
                            int i66 = i65 % 2;
                            sb2.append(string.substring(0, 5));
                            int i67 = a;
                            int i68 = i67 ^ 113;
                            int i69 = ((((i67 & 113) | i68) << 1) - (~(-i68))) - 1;
                            b = i69 % 128;
                            int i70 = i69 % 2;
                            sb2.append("-");
                            sb2.append(string.substring(5));
                            int i71 = b + 111;
                            a = i71 % 128;
                            int i72 = i71 % 2;
                            editText4.setText(sb2.toString());
                            editText = this.c;
                            int i73 = b;
                            int i74 = (i73 | 65) << 1;
                            int i75 = -(((~i73) & 65) | (i73 & (-66)));
                            i4 = (i74 & i75) + (i75 | i74);
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                editText.setSelection(editText.getText().toString().length());
                                int i76 = 3 / 0;
                            } else {
                                editText.setSelection(editText.getText().toString().length());
                            }
                        }
                    }
                } else if (string.length() == 6) {
                    int i510 = a;
                    int i511 = i510 & 75;
                    int i610 = i511 + ((i510 ^ 75) | i511);
                    b = i610 % 128;
                    int i611 = i610 % 2;
                    if (!string.endsWith("-")) {
                        EditText editText5 = this.c;
                        StringBuilder sb3 = new StringBuilder();
                        int i612 = b;
                        int i613 = ((i612 ^ 11) | (i612 & 11)) << 1;
                        int i614 = -(((~i612) & 11) | (i612 & (-12)));
                        int i615 = (i613 & i614) + (i614 | i613);
                        a = i615 % 128;
                        int i616 = i615 % 2;
                        sb3.append(string.substring(0, 5));
                        int i617 = a;
                        int i618 = i617 ^ 113;
                        int i619 = ((((i617 & 113) | i618) << 1) - (~(-i618))) - 1;
                        b = i619 % 128;
                        int i77 = i619 % 2;
                        sb3.append("-");
                        sb3.append(string.substring(5));
                        int i78 = b + 111;
                        a = i78 % 128;
                        int i79 = i78 % 2;
                        editText5.setText(sb3.toString());
                        editText = this.c;
                        int i710 = b;
                        int i711 = (i710 | 65) << 1;
                        int i712 = -(((~i710) & 65) | (i710 & (-66)));
                        i4 = (i711 & i712) + (i712 | i711);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            editText.setSelection(editText.getText().toString().length());
                            int i713 = 3 / 0;
                        } else {
                            editText.setSelection(editText.getText().toString().length());
                        }
                    }
                }
                ActivityRoster activityRoster5 = ActivityRoster.this;
                int i80 = activityRoster5.ac;
                if (i80 != 1) {
                    int i81 = a;
                    int i82 = i81 & 55;
                    int i83 = (i81 ^ 55) | i82;
                    int i84 = (i82 & i83) + (i83 | i82);
                    int i85 = i84 % 128;
                    b = i85;
                    if (i84 % 2 == 0 ? i80 != 2 : i80 != 5) {
                        int i86 = i85 & 75;
                        int i87 = (i85 | 75) & (~i86);
                        int i88 = i86 << 1;
                        int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                        a = i89 % 128;
                        int i90 = i89 % 2;
                        if (ag.d) {
                            if (ag.j == 1) {
                                int i91 = b;
                                int i92 = (i91 & (-122)) | ((~i91) & 121);
                                int i93 = (i91 & 121) << 1;
                                i5 = (i92 & i93) + (i93 | i92);
                                a = i5 % 128;
                                if (i5 % 2 == 0) {
                                    double d = activityRoster5.aU;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (activityRoster5.aU < 18.0d) {
                                    activityRoster5.checkBoxBispBenif.setVisibility(8);
                                    ActivityRoster activityRoster6 = ActivityRoster.this;
                                    int i94 = a;
                                    int i95 = i94 & 105;
                                    int i96 = -(-((i94 ^ 105) | i95));
                                    int i97 = (i95 & i96) + (i96 | i95);
                                    b = i97 % 128;
                                    int i98 = i97 % 2;
                                    activityRoster6.aY = false;
                                    int i99 = a;
                                    int i100 = i99 ^ 23;
                                    int i101 = (i99 & 23) << 1;
                                    int i102 = (i100 ^ i101) + ((i101 & i100) << 1);
                                    b = i102 % 128;
                                    int i103 = i102 % 2;
                                    return;
                                }
                                if (activityRoster5.radioGroupCNICOptions.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonCNICPresent.getId()) {
                                    int i104 = b + 81;
                                    a = i104 % 128;
                                    int i105 = i104 % 2;
                                    if (string.length() >= 14) {
                                        int i106 = b;
                                        int i107 = ((i106 ^ 33) | (i106 & 33)) << 1;
                                        int i108 = -(((~i106) & 33) | (i106 & (-34)));
                                        i7 = (i107 ^ i108) + ((i108 & i107) << 1);
                                        a = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                            radioButton = ActivityRoster.this.radioButtonFemale;
                                            int i109 = 67 / 0;
                                        } else {
                                            checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                            radioButton = ActivityRoster.this.radioButtonFemale;
                                        }
                                        if (checkedRadioButtonId != radioButton.getId()) {
                                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                            activityRoster = ActivityRoster.this;
                                            i8 = a + 3;
                                            b = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                activityRoster.aY = true;
                                            } else {
                                                activityRoster.aY = false;
                                            }
                                            int i110 = a + 71;
                                            b = i110 % 128;
                                            int i111 = i110 % 2;
                                            return;
                                        }
                                        int i112 = b;
                                        int i113 = i112 & 45;
                                        int i114 = (i112 | 45) & (~i113);
                                        int i115 = -(-(i113 << 1));
                                        i9 = ((i114 | i115) << 1) - (i114 ^ i115);
                                        a = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            ActivityRoster.this.sp_marital_status.getSelectedItemPosition();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                        }
                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                        ActivityRoster activityRoster7 = ActivityRoster.this;
                                        int i116 = a;
                                        int i117 = (((i116 | 48) << 1) - (i116 ^ 48)) - 1;
                                        b = i117 % 128;
                                        int i118 = i117 % 2;
                                        activityRoster7.aY = false;
                                        int i119 = a + 1;
                                        b = i119 % 128;
                                        int i120 = i119 % 2;
                                        return;
                                    }
                                }
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                ActivityRoster activityRoster8 = ActivityRoster.this;
                                int i121 = b;
                                int i122 = (i121 & (-86)) | ((~i121) & 85);
                                int i123 = -(-((i121 & 85) << 1));
                                int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
                                a = i124 % 128;
                                int i125 = i124 % 2;
                                activityRoster8.aY = false;
                                i6 = a + 33;
                                b = i6 % 128;
                                if (i6 % 2 == 0) {
                                    return;
                                }
                                obj.hashCode();
                                throw null;
                            }
                        }
                    } else if (ag.j == 1) {
                        int i910 = b;
                        int i911 = (i910 & (-122)) | ((~i910) & 121);
                        int i912 = (i910 & 121) << 1;
                        i5 = (i911 & i912) + (i912 | i911);
                        a = i5 % 128;
                        if (i5 % 2 == 0) {
                            double d2 = activityRoster5.aU;
                            try {
                                obj.hashCode();
                                throw null;
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        if (activityRoster5.aU < 18.0d) {
                            activityRoster5.checkBoxBispBenif.setVisibility(8);
                            ActivityRoster activityRoster9 = ActivityRoster.this;
                            int i913 = a;
                            int i914 = i913 & 105;
                            int i915 = -(-((i913 ^ 105) | i914));
                            int i916 = (i914 & i915) + (i915 | i914);
                            b = i916 % 128;
                            int i917 = i916 % 2;
                            activityRoster9.aY = false;
                            int i918 = a;
                            int i1010 = i918 ^ 23;
                            int i1011 = (i918 & 23) << 1;
                            int i1012 = (i1010 ^ i1011) + ((i1011 & i1010) << 1);
                            b = i1012 % 128;
                            int i1013 = i1012 % 2;
                            return;
                        }
                        if (activityRoster5.radioGroupCNICOptions.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonCNICPresent.getId()) {
                            int i1014 = b + 81;
                            a = i1014 % 128;
                            int i1015 = i1014 % 2;
                            if (string.length() >= 14) {
                                int i1016 = b;
                                int i1017 = ((i1016 ^ 33) | (i1016 & 33)) << 1;
                                int i1018 = -(((~i1016) & 33) | (i1016 & (-34)));
                                i7 = (i1017 ^ i1018) + ((i1018 & i1017) << 1);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                    checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                    radioButton = ActivityRoster.this.radioButtonFemale;
                                    int i1019 = 67 / 0;
                                } else {
                                    checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                    radioButton = ActivityRoster.this.radioButtonFemale;
                                }
                                if (checkedRadioButtonId != radioButton.getId()) {
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                    activityRoster = ActivityRoster.this;
                                    i8 = a + 3;
                                    b = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        activityRoster.aY = true;
                                    } else {
                                        activityRoster.aY = false;
                                    }
                                    int i1110 = a + 71;
                                    b = i1110 % 128;
                                    int i1111 = i1110 % 2;
                                    return;
                                }
                                int i1112 = b;
                                int i1113 = i1112 & 45;
                                int i1114 = (i1112 | 45) & (~i1113);
                                int i1115 = -(-(i1113 << 1));
                                i9 = ((i1114 | i1115) << 1) - (i1114 ^ i1115);
                                a = i9 % 128;
                                if (i9 % 2 == 0) {
                                    ActivityRoster.this.sp_marital_status.getSelectedItemPosition();
                                    try {
                                        obj.hashCode();
                                        throw null;
                                    } catch (Throwable th7) {
                                        throw th7;
                                    }
                                }
                                if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 0 || ActivityRoster.this.sp_marital_status.getSelectedItemPosition() == 1) {
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                    ActivityRoster activityRoster10 = ActivityRoster.this;
                                    int i1116 = a;
                                    int i1117 = (((i1116 | 48) << 1) - (i1116 ^ 48)) - 1;
                                    b = i1117 % 128;
                                    int i1118 = i1117 % 2;
                                    activityRoster10.aY = false;
                                    int i1119 = a + 1;
                                    b = i1119 % 128;
                                    int i126 = i1119 % 2;
                                    return;
                                }
                                int i127 = b;
                                int i128 = (i127 & 97) + (i127 | 97);
                                a = i128 % 128;
                                int i129 = i128 % 2;
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                ActivityRoster activityRoster11 = ActivityRoster.this;
                                int i130 = b;
                                int i131 = (i130 ^ 79) + ((i130 & 79) << 1);
                                a = i131 % 128;
                                int i132 = i131 % 2;
                                activityRoster11.aY = true;
                                int i133 = a;
                                int i134 = i133 & 97;
                                int i135 = -(-(i133 | 97));
                                int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
                                b = i136 % 128;
                                int i137 = i136 % 2;
                                return;
                            }
                        }
                        ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                        ActivityRoster activityRoster12 = ActivityRoster.this;
                        int i1210 = b;
                        int i1211 = (i1210 & (-86)) | ((~i1210) & 85);
                        int i1212 = -(-((i1210 & 85) << 1));
                        int i1213 = (i1211 ^ i1212) + ((i1212 & i1211) << 1);
                        a = i1213 % 128;
                        int i1214 = i1213 % 2;
                        activityRoster12.aY = false;
                        i6 = a + 33;
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                } else if (ag.j == 1) {
                    int i919 = b;
                    int i9110 = (i919 & (-122)) | ((~i919) & 121);
                    int i9111 = (i919 & 121) << 1;
                    i5 = (i9110 & i9111) + (i9111 | i9110);
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        double d3 = activityRoster5.aU;
                        obj.hashCode();
                        throw null;
                    }
                    if (activityRoster5.aU < 18.0d) {
                        activityRoster5.checkBoxBispBenif.setVisibility(8);
                        ActivityRoster activityRoster13 = ActivityRoster.this;
                        int i9112 = a;
                        int i9113 = i9112 & 105;
                        int i9114 = -(-((i9112 ^ 105) | i9113));
                        int i9115 = (i9113 & i9114) + (i9114 | i9113);
                        b = i9115 % 128;
                        int i9116 = i9115 % 2;
                        activityRoster13.aY = false;
                        int i9117 = a;
                        int i10110 = i9117 ^ 23;
                        int i10111 = (i9117 & 23) << 1;
                        int i10112 = (i10110 ^ i10111) + ((i10111 & i10110) << 1);
                        b = i10112 % 128;
                        int i10113 = i10112 % 2;
                        return;
                    }
                    if (activityRoster5.radioGroupCNICOptions.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonCNICPresent.getId()) {
                        int i10114 = b + 81;
                        a = i10114 % 128;
                        int i10115 = i10114 % 2;
                        if (string.length() >= 14) {
                            int i10116 = b;
                            int i10117 = ((i10116 ^ 33) | (i10116 & 33)) << 1;
                            int i10118 = -(((~i10116) & 33) | (i10116 & (-34)));
                            i7 = (i10117 ^ i10118) + ((i10118 & i10117) << 1);
                            a = i7 % 128;
                            if (i7 % 2 == 0) {
                                checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                radioButton = ActivityRoster.this.radioButtonFemale;
                                int i10119 = 67 / 0;
                            } else {
                                checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                radioButton = ActivityRoster.this.radioButtonFemale;
                            }
                            if (checkedRadioButtonId != radioButton.getId()) {
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                activityRoster = ActivityRoster.this;
                                i8 = a + 3;
                                b = i8 % 128;
                                if (i8 % 2 != 0) {
                                    activityRoster.aY = true;
                                } else {
                                    activityRoster.aY = false;
                                }
                                int i11110 = a + 71;
                                b = i11110 % 128;
                                int i11111 = i11110 % 2;
                                return;
                            }
                            int i11112 = b;
                            int i11113 = i11112 & 45;
                            int i11114 = (i11112 | 45) & (~i11113);
                            int i11115 = -(-(i11113 << 1));
                            i9 = ((i11114 | i11115) << 1) - (i11114 ^ i11115);
                            a = i9 % 128;
                            if (i9 % 2 == 0) {
                                ActivityRoster.this.sp_marital_status.getSelectedItemPosition();
                                obj.hashCode();
                                throw null;
                            }
                            if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 0) {
                            }
                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                            ActivityRoster activityRoster14 = ActivityRoster.this;
                            int i11116 = a;
                            int i11117 = (((i11116 | 48) << 1) - (i11116 ^ 48)) - 1;
                            b = i11117 % 128;
                            int i11118 = i11117 % 2;
                            activityRoster14.aY = false;
                            int i11119 = a + 1;
                            b = i11119 % 128;
                            int i1215 = i11119 % 2;
                            return;
                        }
                    }
                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                    ActivityRoster activityRoster15 = ActivityRoster.this;
                    int i1216 = b;
                    int i1217 = (i1216 & (-86)) | ((~i1216) & 85);
                    int i1218 = -(-((i1216 & 85) << 1));
                    int i1219 = (i1217 ^ i1218) + ((i1218 & i1217) << 1);
                    a = i1219 % 128;
                    int i12110 = i1219 % 2;
                    activityRoster15.aY = false;
                    i6 = a + 33;
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i138 = b;
                int i139 = (i138 & 117) + (i138 | 117);
                a = i139 % 128;
                if (i139 % 2 == 0) {
                    int i140 = 58 / 0;
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void K() {
        int i = 2 % 2;
        this.et_MemberName.setText(this.bk.name_of_member);
        final int i2 = 1;
        this.et_MemberName.setEnabled(true);
        String strF = ivas.gov.bisp.enumeration.p026az.z.f();
        final int i3 = 0;
        Object[] objArr = new Object[1];
        a(1 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 26822), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36, objArr);
        String[] strArrSplit = strF.split(((String) objArr[0]).intern());
        Integer.parseInt(strArrSplit[0]);
        Integer.parseInt(strArrSplit[1]);
        Integer.parseInt(strArrSplit[2]);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.networks)));
        this.aT = arrayList;
        Spinner spinner = this.sp_networks;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new C0127y(this, spinner));
        this.aS = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.banks)));
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this.ae, R.layout.spinner_item, this.aS);
        arrayAdapter2.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this.sp_banks.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.sp_banks.setOnItemSelectedListener(new O(this));
        if (this.bN.V == null || !this.aX) {
            Object[] objArr2 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 22, (char) (9595 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), getApplicationInfo().targetSdkVersion + 268, objArr2);
            new au(this, ((String) objArr2[0]).intern(), getResources().getString(R.string.relation_to_head), this.sp_relation_to_household, new Q(this)).execute(new Void[0]);
        } else {
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getTouchSlop() >> 8) + 26, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 9590), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + SQLiteDatabase.MAX_SQL_CACHE_SIZE, objArr3);
            new au(this, ((String) objArr3[0]).intern(), getResources().getString(R.string.relation_to_head), this.sp_relation_to_household, new T(this)).execute(new Void[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArr4 = new Object[1];
        a((Process.myTid() >> 22) + 12, (char) (getApplicationInfo().targetSdkVersion + 44236), getApplicationInfo().targetSdkVersion + 294, objArr4);
        arrayList2.add(((String) objArr4[0]).intern());
        int i4 = 1;
        while (i4 < 12) {
            StringBuilder sb = new StringBuilder();
            sb.append(i4);
            arrayList2.add(sb.toString());
            i4++;
            int i5 = q + 45;
            p = i5 % 128;
            int i6 = i5 % 2;
        }
        this.spinnerMonth.setAdapter((SpinnerAdapter) new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList2));
        this.spinnerMonth.setEnabled(false);
        ArrayList arrayList3 = new ArrayList();
        Object[] objArr5 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 7, (char) (getApplicationInfo().targetSdkVersion + 26065), 337 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr5);
        arrayList3.add(((String) objArr5[0]).intern());
        for (int i7 = 1; i7 < 116; i7++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i7);
            arrayList3.add(sb2.toString());
        }
        this.spinnerYear.setAdapter((SpinnerAdapter) new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList3));
        this.spinnerYear.setEnabled(false);
        this.radioGroupCalendar.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bI.M
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ActivityRoster d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x037c  */
            /* JADX WARN: Code duplicated, block: B:103:0x0397 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:104:0x0398  */
            /* JADX WARN: Code duplicated, block: B:105:0x0399  */
            /* JADX WARN: Code duplicated, block: B:107:0x039f  */
            /* JADX WARN: Code duplicated, block: B:109:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:110:0x03c5  */
            /* JADX WARN: Code duplicated, block: B:113:0x03de  */
            /* JADX WARN: Code duplicated, block: B:114:0x03e8  */
            /* JADX WARN: Code duplicated, block: B:118:0x03f7  */
            /* JADX WARN: Code duplicated, block: B:120:0x0402  */
            /* JADX WARN: Code duplicated, block: B:121:0x0409  */
            /* JADX WARN: Code duplicated, block: B:123:0x040d  */
            /* JADX WARN: Code duplicated, block: B:125:0x0431  */
            /* JADX WARN: Code duplicated, block: B:128:0x043f  */
            /* JADX WARN: Code duplicated, block: B:130:0x0448  */
            /* JADX WARN: Code duplicated, block: B:133:0x0473  */
            /* JADX WARN: Code duplicated, block: B:134:0x0479  */
            /* JADX WARN: Code duplicated, block: B:34:0x0147  */
            /* JADX WARN: Code duplicated, block: B:36:0x0180  */
            /* JADX WARN: Code duplicated, block: B:38:0x0194  */
            /* JADX WARN: Code duplicated, block: B:40:0x01a8  */
            /* JADX WARN: Code duplicated, block: B:41:0x01ae  */
            /* JADX WARN: Code duplicated, block: B:44:0x01c8  */
            /* JADX WARN: Code duplicated, block: B:47:0x01d5  */
            /* JADX WARN: Code duplicated, block: B:49:0x01de  */
            /* JADX WARN: Code duplicated, block: B:50:0x01f9  */
            /* JADX WARN: Code duplicated, block: B:53:0x0219  */
            /* JADX WARN: Code duplicated, block: B:55:0x0224  */
            /* JADX WARN: Code duplicated, block: B:56:0x0228  */
            /* JADX WARN: Code duplicated, block: B:60:0x0253  */
            /* JADX WARN: Code duplicated, block: B:62:0x0268  */
            /* JADX WARN: Code duplicated, block: B:64:0x0279  */
            /* JADX WARN: Code duplicated, block: B:67:0x027e  */
            /* JADX WARN: Code duplicated, block: B:69:0x0284  */
            /* JADX WARN: Code duplicated, block: B:71:0x0288  */
            /* JADX WARN: Code duplicated, block: B:73:0x0293  */
            /* JADX WARN: Code duplicated, block: B:75:0x029b  */
            /* JADX WARN: Code duplicated, block: B:77:0x02ad  */
            /* JADX WARN: Code duplicated, block: B:79:0x02d9  */
            /* JADX WARN: Code duplicated, block: B:81:0x02df  */
            /* JADX WARN: Code duplicated, block: B:83:0x02f2  */
            /* JADX WARN: Code duplicated, block: B:85:0x02fa  */
            /* JADX WARN: Code duplicated, block: B:93:0x0340  */
            /* JADX WARN: Code duplicated, block: B:95:0x0346  */
            /* JADX WARN: Code duplicated, block: B:97:0x035b  */
            /* JADX WARN: Code duplicated, block: B:99:0x0362  */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i8) {
                Button button;
                int i9;
                int i10;
                int i11;
                Button button2;
                int i12;
                Button button3;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int checkedRadioButtonId;
                RadioButton radioButton;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24 = 2 % 2;
                int i25 = b;
                int i26 = ((i25 ^ 68) + ((i25 & 68) << 1)) - 1;
                a = i26 % 128;
                int i27 = i26 % 2;
                Object obj = null;
                if (i2 != 0) {
                    int i28 = i25 & 97;
                    int i29 = (i28 - (~(-(-((i25 ^ 97) | i28))))) - 1;
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = i25 & 101;
                    int i32 = (i31 - (~(-(-((i25 ^ 101) | i31))))) - 1;
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    ActivityRoster activityRoster = this.d;
                    if (i8 != activityRoster.radioButtonCalendarYes.getId()) {
                        activityRoster.tv_dob.setEnabled(false);
                        activityRoster.spinnerYear.setEnabled(true);
                        int i34 = b;
                        int i35 = i34 & 61;
                        int i36 = ((((i34 ^ 61) | i35) << 1) - (~(-((i34 | 61) & (~i35))))) - 1;
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        activityRoster.spinnerMonth.setEnabled(true);
                        int i38 = a;
                        int i39 = (i38 & 47) + (i38 | 47);
                        b = i39 % 128;
                        if (i39 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i40 = b;
                    int i41 = (i40 & (-64)) | ((~i40) & 63);
                    int i42 = -(-((i40 & 63) << 1));
                    int i43 = (i41 & i42) + (i42 | i41);
                    a = i43 % 128;
                    if (i43 % 2 != 0) {
                        activityRoster.tv_dob.setEnabled(false);
                        activityRoster.spinnerYear.setEnabled(true);
                    } else {
                        activityRoster.tv_dob.setEnabled(false);
                        activityRoster.spinnerYear.setEnabled(false);
                    }
                    activityRoster.spinnerMonth.setEnabled(false);
                    int i44 = b;
                    int i45 = (((i44 ^ 27) | (i44 & 27)) << 1) - (((~i44) & 27) | (i44 & (-28)));
                    a = i45 % 128;
                    if (i45 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                ActivityRoster activityRoster2 = this.d;
                activityRoster2.por_roster.setText(BuildConfig.FLAVOR);
                int i46 = a;
                int i47 = i46 ^ 39;
                int i48 = ((i46 & 39) | i47) << 1;
                int i49 = -i47;
                int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
                b = i50 % 128;
                int i51 = 8;
                if (i50 % 2 == 0) {
                    activityRoster2.vald_txt_view_caption.setVisibility(79);
                } else {
                    activityRoster2.vald_txt_view_caption.setVisibility(8);
                }
                activityRoster2.vald_txt_view.setVisibility(8);
                activityRoster2.vald_name_txt_view.setVisibility(8);
                int i52 = a;
                int i53 = i52 & 9;
                int i54 = ((i52 ^ 9) | i53) << 1;
                int i55 = -((i52 | 9) & (~i53));
                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                b = i56 % 128;
                int i57 = i56 % 2;
                activityRoster2.G();
                if (i8 != activityRoster2.rb_afghani_acc.getId()) {
                    int i58 = b;
                    int i59 = i58 ^ 65;
                    int i60 = -(-((i58 & 65) << 1));
                    int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                    a = i61 % 128;
                    if (i61 % 2 != 0) {
                        int i62 = 42 / 0;
                        if (i8 != activityRoster2.rb_afghani_por.getId()) {
                            int i63 = a;
                            int i64 = (((i63 ^ 123) | (i63 & 123)) << 1) - (((~i63) & 123) | (i63 & (-124)));
                            b = i64 % 128;
                            int i65 = i64 % 2;
                            activityRoster2.por_roster.setVisibility(8);
                            int i66 = a;
                            int i67 = i66 & 3;
                            int i68 = ((i66 ^ 3) | i67) << 1;
                            int i69 = -((i66 | 3) & (~i67));
                            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                            b = i70 % 128;
                            int i71 = i70 % 2;
                            if (i8 == activityRoster2.radioButtonCNICPresent.getId()) {
                                int i72 = a + 113;
                                b = i72 % 128;
                                int i73 = i72 % 2;
                                activityRoster2.btn_vald_cnic.setVisibility(8);
                                if (ax.c(activityRoster2)) {
                                    int i74 = b;
                                    int i75 = i74 ^ 37;
                                    int i76 = -(-((i74 & 37) << 1));
                                    i23 = (i75 & i76) + (i76 | i75);
                                    a = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        activityRoster2.btn_vald_cnic.setEnabled(false);
                                    } else {
                                        activityRoster2.btn_vald_cnic.setEnabled(true);
                                    }
                                }
                                activityRoster2.et_RosterCNIC.setVisibility(0);
                                activityRoster2.et_RosterCNICRepeat.setVisibility(0);
                                i14 = a + 105;
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    activityRoster2.buttonScanCNIC.setVisibility(92);
                                    if (activityRoster2.aZ < 5) {
                                        int i77 = b;
                                        int i78 = (((i77 & (-68)) | ((~i77) & 67)) - (~(-(-((i77 & 67) << 1))))) - 1;
                                        a = i78 % 128;
                                        int i79 = i78 % 2;
                                        activityRoster2.btn_bio_cnic.setEnabled(true);
                                    } else {
                                        activityRoster2.btn_bio_cnic.setEnabled(false);
                                        int i80 = b;
                                        int i81 = i80 ^ 61;
                                        int i82 = -(-((i80 & 61) << 1));
                                        int i83 = (i81 & i82) + (i82 | i81);
                                        a = i83 % 128;
                                        int i84 = i83 % 2;
                                    }
                                } else {
                                    activityRoster2.buttonScanCNIC.setVisibility(8);
                                    if (activityRoster2.aZ < 3) {
                                        int i710 = b;
                                        int i711 = (((i710 & (-68)) | ((~i710) & 67)) - (~(-(-((i710 & 67) << 1))))) - 1;
                                        a = i711 % 128;
                                        int i712 = i711 % 2;
                                        activityRoster2.btn_bio_cnic.setEnabled(true);
                                    } else {
                                        activityRoster2.btn_bio_cnic.setEnabled(false);
                                        int i85 = b;
                                        int i86 = i85 ^ 61;
                                        int i87 = -(-((i85 & 61) << 1));
                                        int i88 = (i86 & i87) + (i87 | i86);
                                        a = i88 % 128;
                                        int i89 = i88 % 2;
                                    }
                                }
                                activityRoster2.buttonScanCNIC.setEnabled(true);
                                if (!activityRoster2.aX) {
                                    i22 = a + 1;
                                    b = i22 % 128;
                                    if (i22 % 2 != 0) {
                                        activityRoster2.F();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    activityRoster2.F();
                                }
                                ((InputMethodManager) activityRoster2.getSystemService("input_method")).showSoftInput(activityRoster2.et_RosterCNIC, 1);
                                int i90 = a;
                                int i91 = i90 & 89;
                                int i92 = (((i90 | 89) & (~i91)) - (~(-(-(i91 << 1))))) - 1;
                                b = i92 % 128;
                                int i93 = i92 % 2;
                                i15 = activityRoster2.ac;
                                if (i15 != 1) {
                                    int i94 = a;
                                    int i95 = i94 ^ 13;
                                    int i96 = -(-((i94 & 13) << 1));
                                    int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                                    i20 = i97 % 128;
                                    b = i20;
                                    int i98 = i97 % 2;
                                    if (i15 != 2) {
                                        i21 = (-2) - ((((i20 | 108) << 1) - (i20 ^ 108)) ^ (-1));
                                        a = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            boolean z = ag.d;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (ag.d) {
                                            if (ag.j == 1) {
                                                i16 = a + 115;
                                                b = i16 % 128;
                                                if (i16 % 2 != 0) {
                                                    double d = activityRoster2.aU;
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                if (activityRoster2.aU >= 18.0d) {
                                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                    activityRoster2.aY = false;
                                                    int i99 = b;
                                                    int i100 = i99 & 97;
                                                    int i101 = (i99 | 97) & (~i100);
                                                    int i102 = i100 << 1;
                                                    i17 = (i101 & i102) + (i101 | i102);
                                                    a = i17 % 128;
                                                    if (i17 % 2 == 0) {
                                                        throw null;
                                                    }
                                                    return;
                                                }
                                                int i103 = b + 123;
                                                a = i103 % 128;
                                                int i104 = i103 % 2;
                                                if (activityRoster2.et_RosterCNIC.length() == 15) {
                                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                    activityRoster2.aY = false;
                                                    int i105 = b;
                                                    int i106 = i105 & 73;
                                                    int i107 = (i105 | 73) & (~i106);
                                                    int i108 = i106 << 1;
                                                    int i109 = (i107 & i108) + (i107 | i108);
                                                    a = i109 % 128;
                                                    int i110 = i109 % 2;
                                                    return;
                                                }
                                                int i111 = b;
                                                int i112 = (i111 & (-62)) | ((~i111) & 61);
                                                int i113 = -(-((i111 & 61) << 1));
                                                int i114 = (i112 & i113) + (i113 | i112);
                                                a = i114 % 128;
                                                int i115 = i114 % 2;
                                                checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                                radioButton = activityRoster2.radioButtonFemale;
                                                int i116 = a;
                                                i18 = (i116 & 97) + (i116 | 97);
                                                b = i18 % 128;
                                                if (i18 % 2 != 0) {
                                                    radioButton.getId();
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                if (checkedRadioButtonId == radioButton.getId()) {
                                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                    activityRoster2.aY = false;
                                                    int i117 = b;
                                                    int i118 = i117 & 31;
                                                    int i119 = i118 + ((i117 ^ 31) | i118);
                                                    a = i119 % 128;
                                                    int i120 = i119 % 2;
                                                    return;
                                                }
                                                int i121 = a;
                                                int i122 = i121 & 125;
                                                int i123 = (i121 ^ 125) | i122;
                                                i19 = (i122 ^ i123) + ((i123 & i122) << 1);
                                                b = i19 % 128;
                                                if (i19 % 2 != 0) {
                                                    activityRoster2.sp_marital_status.getSelectedItemPosition();
                                                    throw null;
                                                }
                                                if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0 || activityRoster2.sp_marital_status.getSelectedItemPosition() == 1) {
                                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                    activityRoster2.aY = false;
                                                    int i124 = b;
                                                    int i125 = ((i124 & 107) - (~(i124 | 107))) - 1;
                                                    a = i125 % 128;
                                                    int i126 = i125 % 2;
                                                    return;
                                                }
                                                int i127 = b;
                                                int i128 = (i127 & 23) + (i127 | 23);
                                                a = i128 % 128;
                                                int i129 = i128 % 2;
                                                activityRoster2.checkBoxBispBenif.setVisibility(0);
                                                activityRoster2.aY = true;
                                                int i130 = a;
                                                int i131 = ((i130 ^ 11) - (~(-(-((i130 & 11) << 1))))) - 1;
                                                b = i131 % 128;
                                                if (i131 % 2 == 0) {
                                                    int i132 = 0 / 0;
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    } else if (ag.j == 1) {
                                        i16 = a + 115;
                                        b = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            double d2 = activityRoster2.aU;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (activityRoster2.aU >= 18.0d) {
                                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                                            activityRoster2.aY = false;
                                            int i910 = b;
                                            int i1010 = i910 & 97;
                                            int i1011 = (i910 | 97) & (~i1010);
                                            int i1012 = i1010 << 1;
                                            i17 = (i1011 & i1012) + (i1011 | i1012);
                                            a = i17 % 128;
                                            if (i17 % 2 == 0) {
                                                throw null;
                                            }
                                            return;
                                        }
                                        int i1013 = b + 123;
                                        a = i1013 % 128;
                                        int i1014 = i1013 % 2;
                                        if (activityRoster2.et_RosterCNIC.length() == 15) {
                                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                                            activityRoster2.aY = false;
                                            int i1015 = b;
                                            int i1016 = i1015 & 73;
                                            int i1017 = (i1015 | 73) & (~i1016);
                                            int i1018 = i1016 << 1;
                                            int i1019 = (i1017 & i1018) + (i1017 | i1018);
                                            a = i1019 % 128;
                                            int i1110 = i1019 % 2;
                                            return;
                                        }
                                        int i1111 = b;
                                        int i1112 = (i1111 & (-62)) | ((~i1111) & 61);
                                        int i1113 = -(-((i1111 & 61) << 1));
                                        int i1114 = (i1112 & i1113) + (i1113 | i1112);
                                        a = i1114 % 128;
                                        int i1115 = i1114 % 2;
                                        checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                        radioButton = activityRoster2.radioButtonFemale;
                                        int i1116 = a;
                                        i18 = (i1116 & 97) + (i1116 | 97);
                                        b = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            radioButton.getId();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (checkedRadioButtonId == radioButton.getId()) {
                                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                                            activityRoster2.aY = false;
                                            int i1117 = b;
                                            int i1118 = i1117 & 31;
                                            int i1119 = i1118 + ((i1117 ^ 31) | i1118);
                                            a = i1119 % 128;
                                            int i1210 = i1119 % 2;
                                            return;
                                        }
                                        int i1211 = a;
                                        int i1212 = i1211 & 125;
                                        int i1213 = (i1211 ^ 125) | i1212;
                                        i19 = (i1212 ^ i1213) + ((i1213 & i1212) << 1);
                                        b = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            activityRoster2.sp_marital_status.getSelectedItemPosition();
                                            throw null;
                                        }
                                        if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                        }
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i1214 = b;
                                        int i1215 = ((i1214 & 107) - (~(i1214 | 107))) - 1;
                                        a = i1215 % 128;
                                        int i1216 = i1215 % 2;
                                        return;
                                    }
                                } else if (ag.j == 1) {
                                    i16 = a + 115;
                                    b = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        double d3 = activityRoster2.aU;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (activityRoster2.aU >= 18.0d) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i911 = b;
                                        int i10110 = i911 & 97;
                                        int i10111 = (i911 | 97) & (~i10110);
                                        int i10112 = i10110 << 1;
                                        i17 = (i10111 & i10112) + (i10111 | i10112);
                                        a = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            throw null;
                                        }
                                        return;
                                    }
                                    int i10113 = b + 123;
                                    a = i10113 % 128;
                                    int i10114 = i10113 % 2;
                                    if (activityRoster2.et_RosterCNIC.length() == 15) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i10115 = b;
                                        int i10116 = i10115 & 73;
                                        int i10117 = (i10115 | 73) & (~i10116);
                                        int i10118 = i10116 << 1;
                                        int i10119 = (i10117 & i10118) + (i10117 | i10118);
                                        a = i10119 % 128;
                                        int i11110 = i10119 % 2;
                                        return;
                                    }
                                    int i11111 = b;
                                    int i11112 = (i11111 & (-62)) | ((~i11111) & 61);
                                    int i11113 = -(-((i11111 & 61) << 1));
                                    int i11114 = (i11112 & i11113) + (i11113 | i11112);
                                    a = i11114 % 128;
                                    int i11115 = i11114 % 2;
                                    checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                    radioButton = activityRoster2.radioButtonFemale;
                                    int i11116 = a;
                                    i18 = (i11116 & 97) + (i11116 | 97);
                                    b = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        radioButton.getId();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (checkedRadioButtonId == radioButton.getId()) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i11117 = b;
                                        int i11118 = i11117 & 31;
                                        int i11119 = i11118 + ((i11117 ^ 31) | i11118);
                                        a = i11119 % 128;
                                        int i1217 = i11119 % 2;
                                        return;
                                    }
                                    int i1218 = a;
                                    int i1219 = i1218 & 125;
                                    int i12110 = (i1218 ^ 125) | i1219;
                                    i19 = (i1219 ^ i12110) + ((i12110 & i1219) << 1);
                                    b = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        activityRoster2.sp_marital_status.getSelectedItemPosition();
                                        throw null;
                                    }
                                    if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                    }
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i12111 = b;
                                    int i12112 = ((i12111 & 107) - (~(i12111 | 107))) - 1;
                                    a = i12112 % 128;
                                    int i12113 = i12112 % 2;
                                    return;
                                }
                            } else {
                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                int i133 = a;
                                i11 = (((i133 ^ 77) | (i133 & 77)) << 1) - (((~i133) & 77) | (i133 & (-78)));
                                b = i11 % 128;
                                if (i11 % 2 == 0) {
                                    activityRoster2.aY = false;
                                    activityRoster2.et_RosterCNIC.setVisibility(71);
                                } else {
                                    activityRoster2.aY = false;
                                    activityRoster2.et_RosterCNIC.setVisibility(8);
                                }
                                activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                                button2 = activityRoster2.buttonScanCNIC;
                                i12 = b + 59;
                                a = i12 % 128;
                                if (i12 % 2 != 0) {
                                    button2.setVisibility(16);
                                    button3 = activityRoster2.btn_vald_cnic;
                                    i51 = 100;
                                } else {
                                    button2.setVisibility(8);
                                    button3 = activityRoster2.btn_vald_cnic;
                                }
                                button3.setVisibility(i51);
                                if (!activityRoster2.aX) {
                                    i13 = b + 79;
                                    a = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        activityRoster2.F();
                                        return;
                                    } else {
                                        activityRoster2.F();
                                        int i134 = 98 / 0;
                                        return;
                                    }
                                }
                            }
                        } else {
                            activityRoster2.rb_afghani_acc.getId();
                            Button button4 = activityRoster2.btn_vald_cnic;
                            int i135 = a;
                            int i136 = i135 & 13;
                            int i137 = i136 + ((i135 ^ 13) | i136);
                            b = i137 % 128;
                            int i138 = i137 % 2;
                            button4.setVisibility(8);
                            button = activityRoster2.buttonScanCNIC;
                            i9 = a + 3;
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                button.setVisibility(8);
                                int i139 = 86 / 0;
                                if (!(!ax.c(activityRoster2))) {
                                    int i140 = a;
                                    int i141 = i140 & 11;
                                    int i142 = (i140 ^ 11) | i141;
                                    int i143 = ((i141 | i142) << 1) - (i142 ^ i141);
                                    b = i143 % 128;
                                    int i144 = i143 % 2;
                                    activityRoster2.btn_vald_cnic.setEnabled(true);
                                }
                            } else {
                                button.setVisibility(8);
                                if (ax.c(activityRoster2)) {
                                    int i145 = a;
                                    int i146 = i145 & 11;
                                    int i147 = (i145 ^ 11) | i146;
                                    int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                                    b = i148 % 128;
                                    int i149 = i148 % 2;
                                    activityRoster2.btn_vald_cnic.setEnabled(true);
                                }
                            }
                            activityRoster2.et_RosterCNIC.setVisibility(8);
                            activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                            i10 = a + 65;
                            b = i10 % 128;
                            if (i10 % 2 == 0) {
                                activityRoster2.por_roster.setVisibility(1);
                            } else {
                                activityRoster2.por_roster.setVisibility(0);
                            }
                            activityRoster2.buttonScanCNIC.setEnabled(false);
                            int i150 = b + 105;
                            a = i150 % 128;
                            int i151 = i150 % 2;
                            activityRoster2.btn_bio_cnic.setEnabled(false);
                            int i152 = a;
                            int i153 = i152 & 93;
                            int i154 = -(-((i152 ^ 93) | i153));
                            int i155 = ((i153 | i154) << 1) - (i154 ^ i153);
                            b = i155 % 128;
                            int i156 = i155 % 2;
                        }
                    } else if (i8 != activityRoster2.rb_afghani_por.getId()) {
                        int i610 = a;
                        int i611 = (((i610 ^ 123) | (i610 & 123)) << 1) - (((~i610) & 123) | (i610 & (-124)));
                        b = i611 % 128;
                        int i612 = i611 % 2;
                        activityRoster2.por_roster.setVisibility(8);
                        int i613 = a;
                        int i614 = i613 & 3;
                        int i615 = ((i613 ^ 3) | i614) << 1;
                        int i616 = -((i613 | 3) & (~i614));
                        int i713 = (i615 ^ i616) + ((i616 & i615) << 1);
                        b = i713 % 128;
                        int i714 = i713 % 2;
                        if (i8 == activityRoster2.radioButtonCNICPresent.getId()) {
                            int i715 = a + 113;
                            b = i715 % 128;
                            int i716 = i715 % 2;
                            activityRoster2.btn_vald_cnic.setVisibility(8);
                            if (ax.c(activityRoster2)) {
                                int i717 = b;
                                int i718 = i717 ^ 37;
                                int i719 = -(-((i717 & 37) << 1));
                                i23 = (i718 & i719) + (i719 | i718);
                                a = i23 % 128;
                                if (i23 % 2 != 0) {
                                    activityRoster2.btn_vald_cnic.setEnabled(false);
                                } else {
                                    activityRoster2.btn_vald_cnic.setEnabled(true);
                                }
                            }
                            activityRoster2.et_RosterCNIC.setVisibility(0);
                            activityRoster2.et_RosterCNICRepeat.setVisibility(0);
                            i14 = a + 105;
                            b = i14 % 128;
                            if (i14 % 2 == 0) {
                                activityRoster2.buttonScanCNIC.setVisibility(92);
                                if (activityRoster2.aZ < 5) {
                                    int i7110 = b;
                                    int i7111 = (((i7110 & (-68)) | ((~i7110) & 67)) - (~(-(-((i7110 & 67) << 1))))) - 1;
                                    a = i7111 % 128;
                                    int i7112 = i7111 % 2;
                                    activityRoster2.btn_bio_cnic.setEnabled(true);
                                } else {
                                    activityRoster2.btn_bio_cnic.setEnabled(false);
                                    int i810 = b;
                                    int i811 = i810 ^ 61;
                                    int i812 = -(-((i810 & 61) << 1));
                                    int i813 = (i811 & i812) + (i812 | i811);
                                    a = i813 % 128;
                                    int i814 = i813 % 2;
                                }
                            } else {
                                activityRoster2.buttonScanCNIC.setVisibility(8);
                                if (activityRoster2.aZ < 3) {
                                    int i7113 = b;
                                    int i7114 = (((i7113 & (-68)) | ((~i7113) & 67)) - (~(-(-((i7113 & 67) << 1))))) - 1;
                                    a = i7114 % 128;
                                    int i7115 = i7114 % 2;
                                    activityRoster2.btn_bio_cnic.setEnabled(true);
                                } else {
                                    activityRoster2.btn_bio_cnic.setEnabled(false);
                                    int i815 = b;
                                    int i816 = i815 ^ 61;
                                    int i817 = -(-((i815 & 61) << 1));
                                    int i818 = (i816 & i817) + (i817 | i816);
                                    a = i818 % 128;
                                    int i819 = i818 % 2;
                                }
                            }
                            activityRoster2.buttonScanCNIC.setEnabled(true);
                            if (!activityRoster2.aX) {
                                i22 = a + 1;
                                b = i22 % 128;
                                if (i22 % 2 != 0) {
                                    activityRoster2.F();
                                    obj.hashCode();
                                    throw null;
                                }
                                activityRoster2.F();
                            }
                            ((InputMethodManager) activityRoster2.getSystemService("input_method")).showSoftInput(activityRoster2.et_RosterCNIC, 1);
                            int i912 = a;
                            int i913 = i912 & 89;
                            int i914 = (((i912 | 89) & (~i913)) - (~(-(-(i913 << 1))))) - 1;
                            b = i914 % 128;
                            int i915 = i914 % 2;
                            i15 = activityRoster2.ac;
                            if (i15 != 1) {
                                int i916 = a;
                                int i917 = i916 ^ 13;
                                int i918 = -(-((i916 & 13) << 1));
                                int i919 = ((i917 | i918) << 1) - (i918 ^ i917);
                                i20 = i919 % 128;
                                b = i20;
                                int i920 = i919 % 2;
                                if (i15 != 2) {
                                    i21 = (-2) - ((((i20 | 108) << 1) - (i20 ^ 108)) ^ (-1));
                                    a = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        boolean z2 = ag.d;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (ag.d) {
                                        if (ag.j == 1) {
                                            i16 = a + 115;
                                            b = i16 % 128;
                                            if (i16 % 2 != 0) {
                                                double d4 = activityRoster2.aU;
                                                obj.hashCode();
                                                throw null;
                                            }
                                            if (activityRoster2.aU >= 18.0d) {
                                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                activityRoster2.aY = false;
                                                int i9110 = b;
                                                int i101110 = i9110 & 97;
                                                int i101111 = (i9110 | 97) & (~i101110);
                                                int i101112 = i101110 << 1;
                                                i17 = (i101111 & i101112) + (i101111 | i101112);
                                                a = i17 % 128;
                                                if (i17 % 2 == 0) {
                                                    throw null;
                                                }
                                                return;
                                            }
                                            int i101113 = b + 123;
                                            a = i101113 % 128;
                                            int i101114 = i101113 % 2;
                                            if (activityRoster2.et_RosterCNIC.length() == 15) {
                                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                activityRoster2.aY = false;
                                                int i101115 = b;
                                                int i101116 = i101115 & 73;
                                                int i101117 = (i101115 | 73) & (~i101116);
                                                int i101118 = i101116 << 1;
                                                int i101119 = (i101117 & i101118) + (i101117 | i101118);
                                                a = i101119 % 128;
                                                int i111110 = i101119 % 2;
                                                return;
                                            }
                                            int i111111 = b;
                                            int i111112 = (i111111 & (-62)) | ((~i111111) & 61);
                                            int i111113 = -(-((i111111 & 61) << 1));
                                            int i111114 = (i111112 & i111113) + (i111113 | i111112);
                                            a = i111114 % 128;
                                            int i111115 = i111114 % 2;
                                            checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                            radioButton = activityRoster2.radioButtonFemale;
                                            int i111116 = a;
                                            i18 = (i111116 & 97) + (i111116 | 97);
                                            b = i18 % 128;
                                            if (i18 % 2 != 0) {
                                                radioButton.getId();
                                                obj.hashCode();
                                                throw null;
                                            }
                                            if (checkedRadioButtonId == radioButton.getId()) {
                                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                activityRoster2.aY = false;
                                                int i111117 = b;
                                                int i111118 = i111117 & 31;
                                                int i111119 = i111118 + ((i111117 ^ 31) | i111118);
                                                a = i111119 % 128;
                                                int i12114 = i111119 % 2;
                                                return;
                                            }
                                            int i12115 = a;
                                            int i12116 = i12115 & 125;
                                            int i12117 = (i12115 ^ 125) | i12116;
                                            i19 = (i12116 ^ i12117) + ((i12117 & i12116) << 1);
                                            b = i19 % 128;
                                            if (i19 % 2 != 0) {
                                                activityRoster2.sp_marital_status.getSelectedItemPosition();
                                                throw null;
                                            }
                                            if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                            }
                                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                                            activityRoster2.aY = false;
                                            int i12118 = b;
                                            int i12119 = ((i12118 & 107) - (~(i12118 | 107))) - 1;
                                            a = i12119 % 128;
                                            int i121110 = i12119 % 2;
                                            return;
                                        }
                                    }
                                } else if (ag.j == 1) {
                                    i16 = a + 115;
                                    b = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        double d5 = activityRoster2.aU;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (activityRoster2.aU >= 18.0d) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i9111 = b;
                                        int i1011110 = i9111 & 97;
                                        int i1011111 = (i9111 | 97) & (~i1011110);
                                        int i1011112 = i1011110 << 1;
                                        i17 = (i1011111 & i1011112) + (i1011111 | i1011112);
                                        a = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            throw null;
                                        }
                                        return;
                                    }
                                    int i1011113 = b + 123;
                                    a = i1011113 % 128;
                                    int i1011114 = i1011113 % 2;
                                    if (activityRoster2.et_RosterCNIC.length() == 15) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i1011115 = b;
                                        int i1011116 = i1011115 & 73;
                                        int i1011117 = (i1011115 | 73) & (~i1011116);
                                        int i1011118 = i1011116 << 1;
                                        int i1011119 = (i1011117 & i1011118) + (i1011117 | i1011118);
                                        a = i1011119 % 128;
                                        int i1111110 = i1011119 % 2;
                                        return;
                                    }
                                    int i1111111 = b;
                                    int i1111112 = (i1111111 & (-62)) | ((~i1111111) & 61);
                                    int i1111113 = -(-((i1111111 & 61) << 1));
                                    int i1111114 = (i1111112 & i1111113) + (i1111113 | i1111112);
                                    a = i1111114 % 128;
                                    int i1111115 = i1111114 % 2;
                                    checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                    radioButton = activityRoster2.radioButtonFemale;
                                    int i1111116 = a;
                                    i18 = (i1111116 & 97) + (i1111116 | 97);
                                    b = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        radioButton.getId();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (checkedRadioButtonId == radioButton.getId()) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i1111117 = b;
                                        int i1111118 = i1111117 & 31;
                                        int i1111119 = i1111118 + ((i1111117 ^ 31) | i1111118);
                                        a = i1111119 % 128;
                                        int i121111 = i1111119 % 2;
                                        return;
                                    }
                                    int i121112 = a;
                                    int i121113 = i121112 & 125;
                                    int i121114 = (i121112 ^ 125) | i121113;
                                    i19 = (i121113 ^ i121114) + ((i121114 & i121113) << 1);
                                    b = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        activityRoster2.sp_marital_status.getSelectedItemPosition();
                                        throw null;
                                    }
                                    if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                    }
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i121115 = b;
                                    int i121116 = ((i121115 & 107) - (~(i121115 | 107))) - 1;
                                    a = i121116 % 128;
                                    int i121117 = i121116 % 2;
                                    return;
                                }
                            } else if (ag.j == 1) {
                                i16 = a + 115;
                                b = i16 % 128;
                                if (i16 % 2 != 0) {
                                    double d6 = activityRoster2.aU;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (activityRoster2.aU >= 18.0d) {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i9112 = b;
                                    int i10111110 = i9112 & 97;
                                    int i10111111 = (i9112 | 97) & (~i10111110);
                                    int i10111112 = i10111110 << 1;
                                    i17 = (i10111111 & i10111112) + (i10111111 | i10111112);
                                    a = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                int i10111113 = b + 123;
                                a = i10111113 % 128;
                                int i10111114 = i10111113 % 2;
                                if (activityRoster2.et_RosterCNIC.length() == 15) {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i10111115 = b;
                                    int i10111116 = i10111115 & 73;
                                    int i10111117 = (i10111115 | 73) & (~i10111116);
                                    int i10111118 = i10111116 << 1;
                                    int i10111119 = (i10111117 & i10111118) + (i10111117 | i10111118);
                                    a = i10111119 % 128;
                                    int i11111110 = i10111119 % 2;
                                    return;
                                }
                                int i11111111 = b;
                                int i11111112 = (i11111111 & (-62)) | ((~i11111111) & 61);
                                int i11111113 = -(-((i11111111 & 61) << 1));
                                int i11111114 = (i11111112 & i11111113) + (i11111113 | i11111112);
                                a = i11111114 % 128;
                                int i11111115 = i11111114 % 2;
                                checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                radioButton = activityRoster2.radioButtonFemale;
                                int i11111116 = a;
                                i18 = (i11111116 & 97) + (i11111116 | 97);
                                b = i18 % 128;
                                if (i18 % 2 != 0) {
                                    radioButton.getId();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (checkedRadioButtonId == radioButton.getId()) {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i11111117 = b;
                                    int i11111118 = i11111117 & 31;
                                    int i11111119 = i11111118 + ((i11111117 ^ 31) | i11111118);
                                    a = i11111119 % 128;
                                    int i121118 = i11111119 % 2;
                                    return;
                                }
                                int i121119 = a;
                                int i1211110 = i121119 & 125;
                                int i1211111 = (i121119 ^ 125) | i1211110;
                                i19 = (i1211110 ^ i1211111) + ((i1211111 & i1211110) << 1);
                                b = i19 % 128;
                                if (i19 % 2 != 0) {
                                    activityRoster2.sp_marital_status.getSelectedItemPosition();
                                    throw null;
                                }
                                if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                }
                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                activityRoster2.aY = false;
                                int i1211112 = b;
                                int i1211113 = ((i1211112 & 107) - (~(i1211112 | 107))) - 1;
                                a = i1211113 % 128;
                                int i1211114 = i1211113 % 2;
                                return;
                            }
                        } else {
                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                            int i1310 = a;
                            i11 = (((i1310 ^ 77) | (i1310 & 77)) << 1) - (((~i1310) & 77) | (i1310 & (-78)));
                            b = i11 % 128;
                            if (i11 % 2 == 0) {
                                activityRoster2.aY = false;
                                activityRoster2.et_RosterCNIC.setVisibility(71);
                            } else {
                                activityRoster2.aY = false;
                                activityRoster2.et_RosterCNIC.setVisibility(8);
                            }
                            activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                            button2 = activityRoster2.buttonScanCNIC;
                            i12 = b + 59;
                            a = i12 % 128;
                            if (i12 % 2 != 0) {
                                button2.setVisibility(16);
                                button3 = activityRoster2.btn_vald_cnic;
                                i51 = 100;
                            } else {
                                button2.setVisibility(8);
                                button3 = activityRoster2.btn_vald_cnic;
                            }
                            button3.setVisibility(i51);
                            if (!activityRoster2.aX) {
                                i13 = b + 79;
                                a = i13 % 128;
                                if (i13 % 2 != 0) {
                                    activityRoster2.F();
                                    return;
                                } else {
                                    activityRoster2.F();
                                    int i1311 = 98 / 0;
                                    return;
                                }
                            }
                        }
                    } else {
                        activityRoster2.rb_afghani_acc.getId();
                        Button button5 = activityRoster2.btn_vald_cnic;
                        int i1312 = a;
                        int i1313 = i1312 & 13;
                        int i1314 = i1313 + ((i1312 ^ 13) | i1313);
                        b = i1314 % 128;
                        int i1315 = i1314 % 2;
                        button5.setVisibility(8);
                        button = activityRoster2.buttonScanCNIC;
                        i9 = a + 3;
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            button.setVisibility(8);
                            int i1316 = 86 / 0;
                            if (!(!ax.c(activityRoster2))) {
                                int i1410 = a;
                                int i1411 = i1410 & 11;
                                int i1412 = (i1410 ^ 11) | i1411;
                                int i1413 = ((i1411 | i1412) << 1) - (i1412 ^ i1411);
                                b = i1413 % 128;
                                int i1414 = i1413 % 2;
                                activityRoster2.btn_vald_cnic.setEnabled(true);
                            }
                        } else {
                            button.setVisibility(8);
                            if (ax.c(activityRoster2)) {
                                int i1415 = a;
                                int i1416 = i1415 & 11;
                                int i1417 = (i1415 ^ 11) | i1416;
                                int i1418 = ((i1416 | i1417) << 1) - (i1417 ^ i1416);
                                b = i1418 % 128;
                                int i1419 = i1418 % 2;
                                activityRoster2.btn_vald_cnic.setEnabled(true);
                            }
                        }
                        activityRoster2.et_RosterCNIC.setVisibility(8);
                        activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                        i10 = a + 65;
                        b = i10 % 128;
                        if (i10 % 2 == 0) {
                            activityRoster2.por_roster.setVisibility(1);
                        } else {
                            activityRoster2.por_roster.setVisibility(0);
                        }
                        activityRoster2.buttonScanCNIC.setEnabled(false);
                        int i157 = b + 105;
                        a = i157 % 128;
                        int i158 = i157 % 2;
                        activityRoster2.btn_bio_cnic.setEnabled(false);
                        int i159 = a;
                        int i1510 = i159 & 93;
                        int i1511 = -(-((i159 ^ 93) | i1510));
                        int i1512 = ((i1510 | i1511) << 1) - (i1511 ^ i1510);
                        b = i1512 % 128;
                        int i1513 = i1512 % 2;
                    }
                } else {
                    activityRoster2.rb_afghani_acc.getId();
                    Button button6 = activityRoster2.btn_vald_cnic;
                    int i1317 = a;
                    int i1318 = i1317 & 13;
                    int i1319 = i1318 + ((i1317 ^ 13) | i1318);
                    b = i1319 % 128;
                    int i13110 = i1319 % 2;
                    button6.setVisibility(8);
                    button = activityRoster2.buttonScanCNIC;
                    i9 = a + 3;
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        button.setVisibility(8);
                        int i13111 = 86 / 0;
                        if (!(!ax.c(activityRoster2))) {
                            int i14110 = a;
                            int i14111 = i14110 & 11;
                            int i14112 = (i14110 ^ 11) | i14111;
                            int i14113 = ((i14111 | i14112) << 1) - (i14112 ^ i14111);
                            b = i14113 % 128;
                            int i14114 = i14113 % 2;
                            activityRoster2.btn_vald_cnic.setEnabled(true);
                        }
                    } else {
                        button.setVisibility(8);
                        if (ax.c(activityRoster2)) {
                            int i14115 = a;
                            int i14116 = i14115 & 11;
                            int i14117 = (i14115 ^ 11) | i14116;
                            int i14118 = ((i14116 | i14117) << 1) - (i14117 ^ i14116);
                            b = i14118 % 128;
                            int i14119 = i14118 % 2;
                            activityRoster2.btn_vald_cnic.setEnabled(true);
                        }
                    }
                    activityRoster2.et_RosterCNIC.setVisibility(8);
                    activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                    i10 = a + 65;
                    b = i10 % 128;
                    if (i10 % 2 == 0) {
                        activityRoster2.por_roster.setVisibility(1);
                    } else {
                        activityRoster2.por_roster.setVisibility(0);
                    }
                    activityRoster2.buttonScanCNIC.setEnabled(false);
                    int i1514 = b + 105;
                    a = i1514 % 128;
                    int i1515 = i1514 % 2;
                    activityRoster2.btn_bio_cnic.setEnabled(false);
                    int i1516 = a;
                    int i1517 = i1516 & 93;
                    int i1518 = -(-((i1516 ^ 93) | i1517));
                    int i1519 = ((i1517 | i1518) << 1) - (i1518 ^ i1517);
                    b = i1519 % 128;
                    int i15110 = i1519 % 2;
                }
                int i160 = a;
                int i161 = (i160 ^ 35) + ((i160 & 35) << 1);
                b = i161 % 128;
                if (i161 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        this.rg_bank_info.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bI.x
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ActivityRoster d;

            {
                this.d = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:100:0x02e5, code lost:
            
                if ((r1 % 2) != 0) goto L102;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x02e7, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x02e8, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
            
                if (r0 != r1.getId()) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
            
                r0 = ivas.gov.bisp.enumeration.bI.C0126x.a + 87;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r0 % 128;
                r0 = r0 % 2;
                r14.ll_bank_info.setVisibility(0);
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r0 = (r14 & 79) + (r14 | 79);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
            
                if ((r0 % 2) != 0) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
            
                r13 = 30 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
            
                r0 = r14.rg_bank_info.getCheckedRadioButtonId();
                r1 = r14.rb_no_bank;
                r2 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r5 = r2 & 17;
                r5 = (r5 - (~(-(-((r2 ^ 17) | r5))))) - 1;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r5 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
            
                if ((r5 % 2) != 0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
            
                if (r0 != r1.getId()) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
            
                r14.ll_bank_info.setVisibility(8);
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r0 = r14 & 37;
                r14 = -(-((r14 ^ 37) | r0));
                r1 = (r0 ^ r14) + ((r14 & r0) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
            
                if ((r1 % 2) == 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
            
                r14 = 4 / 4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r0 = (r14 & (-10)) | ((~r14) & 9);
                r14 = (r14 & 9) << 1;
                r1 = (r0 & r14) + (r14 | r0);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
            
                r1.getId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00d2, code lost:
            
                r0 = r12.d;
                r1 = ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster.af;
                r1 = r0.ac;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
            
                if (r1 == 1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
            
                r7 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r8 = ((r7 ^ 41) | (r7 & 41)) << 1;
                r9 = -((r7 & (-42)) | ((~r7) & 41));
                r10 = (r8 ^ r9) + ((r8 & r9) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r10 % 128;
                r10 = r10 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
            
                if (r1 == 2) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00f6, code lost:
            
                r7 = r7 + 119;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
            
                if ((r7 % 2) == 0) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
            
                if ((!ivas.gov.bisp.enumeration.bK.ag.d) == true) goto L73;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
            
                r13 = ivas.gov.bisp.enumeration.bK.ag.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
            
                if (ivas.gov.bisp.enumeration.bK.ag.j != 1) goto L73;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r7 = (r1 & 111) + (r1 | 111);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
            
                if (r14 != r0.radioButtonFemale.getId()) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0120, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r7 = r1 ^ 83;
                r1 = (r1 & 83) << 1;
                r8 = (r7 & r1) + (r1 | r7);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r8 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
            
                if ((r8 % 2) != 0) goto L70;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0138, code lost:
            
                if (r0.aU < 18.0d) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0146, code lost:
            
                if (r0.radioGroupCNICOptions.getCheckedRadioButtonId() != r0.radioButtonCNICPresent.getId()) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0148, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r8 = r1 & 89;
                r7 = (((r1 ^ 89) | r8) << 1) - ((r1 | 89) & (~r8));
                ivas.gov.bisp.enumeration.bI.C0126x.a = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0160, code lost:
            
                if (r0.et_RosterCNIC.length() != 15) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0162, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r7 = r1 & 13;
                r2 = ((r1 ^ 13) | r7) << 1;
                r1 = -((r1 | 13) & (~r7));
                r7 = ((r2 | r1) << 1) - (r1 ^ r2);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0179, code lost:
            
                if ((r7 % 2) == 0) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0181, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 0) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0183, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b + 13;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x018c, code lost:
            
                if ((r1 % 2) == 0) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0194, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 1) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x019d, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 1) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x019f, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a + 71;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x01a8, code lost:
            
                if ((r1 % 2) != 0) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x01aa, code lost:
            
                r0.checkBoxBispBenif.setVisibility(1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x01b0, code lost:
            
                r0.checkBoxBispBenif.setVisibility(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x01b5, code lost:
            
                r0.aY = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x01b8, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r2 = r1 & 121;
                r1 = -(-(r1 | 121));
                r7 = ((r2 | r1) << 1) - (r1 ^ r2);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x01d2, code lost:
            
                r0.sp_marital_status.getSelectedItemPosition();
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x01d7, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x01d8, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r2 = r1 & 11;
                r1 = (r1 ^ 11) | r2;
                r7 = (r2 ^ r1) + ((r1 & r2) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r7 % 128;
                r7 = r7 % 2;
                r0.aY = false;
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b + 67;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x01fa, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r2 = r1 & 67;
                r2 = r2 + ((r1 ^ 67) | r2);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x020f, code lost:
            
                r13 = r0.aU;
                r3.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x0214, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0215, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r2 = r1 & 37;
                r1 = (r1 ^ 37) | r2;
                r7 = ((r2 | r1) << 1) - (r1 ^ r2);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x0233, code lost:
            
                if (r14 != r0.radioButtonMale.getId()) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x0235, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r1 = (r14 ^ 115) + ((r14 & 115) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0242, code lost:
            
                if ((r1 % 2) == 0) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x024a, code lost:
            
                if (r0.aU >= 13.0d) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x024c, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a + 123;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r14 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x0255, code lost:
            
                if ((r14 % 2) != 0) goto L82;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0257, code lost:
            
                r0.sp_marital_status.setVisibility(100);
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x025f, code lost:
            
                r0.sp_marital_status.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x0264, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0265, code lost:
            
                r0.sp_marital_status.setVisibility(0);
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b + 79;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r14 % 128;
                r14 = r14 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0273, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0274, code lost:
            
                r13 = r0.aU;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0276, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x027d, code lost:
            
                if (r14 != r0.radioButtonFemale.getId()) goto L99;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x027f, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r1 = (r14 & 63) + (r14 | 63);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0291, code lost:
            
                if (r0.aU >= 10.0d) goto L98;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0293, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r1 = r14 & 121;
                r1 = r1 + ((r14 ^ 121) | r1);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x02a0, code lost:
            
                if ((r1 % 2) != 0) goto L95;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x02a2, code lost:
            
                r0.sp_marital_status.setVisibility(44);
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x02aa, code lost:
            
                r0.sp_marital_status.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x02af, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b + 79;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r14 % 128;
                r14 = r14 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x02b8, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x02b9, code lost:
            
                r0.sp_marital_status.setVisibility(0);
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r0 = r14 & 77;
                r14 = (r14 | 77) & (~r0);
                r0 = r0 << 1;
                r1 = (r14 & r0) + (r14 | r0);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x02d0, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r0 = (r14 & (-8)) | ((~r14) & 7);
                r14 = (r14 & 7) << 1;
                r1 = ((r0 | r14) << 1) - (r14 ^ r0);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
            
                r14 = (r0 & (-22)) | ((~r0) & 21);
                r0 = -(-((r0 & 21) << 1));
                r1 = (r14 & r0) + (r14 | r0);
                r14 = r1 % 128;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r14;
                r1 = r1 % 2;
                r14 = r14 + 67;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r14 % 128;
                r14 = r14 % 2;
                r14 = r12.d;
                r0 = r14.rg_bank_info.getCheckedRadioButtonId();
                r1 = r14.rb_yes_bank;
                r7 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r8 = (r7 ^ 15) + ((15 & r7) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r8 % 128;
                r8 = r8 % 2;
             */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCheckedChanged(android.widget.RadioGroup r13, int r14) {
                /*
                    Method dump skipped, instruction units count: 745
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bI.C0126x.onCheckedChanged(android.widget.RadioGroup, int):void");
            }
        });
        int i8 = this.ac;
        if ((i8 == 1 || i8 == 2 || ag.d) && !ag.g) {
            if (this.bk.cnic_valid_name.equals(BuildConfig.FLAVOR)) {
                this.ll_nadra_name.setVisibility(8);
            } else {
                this.ll_nadra_name.setVisibility(0);
                this.et_MemberName.setText(this.bk.name_of_member);
                this.vald_name_txt_view.setText(this.bk.cnic_valid_name);
            }
            if (this.bk.date_of_birth.equals(BuildConfig.FLAVOR)) {
                this.radioGroupCalendar.setEnabled(true);
                this.radioButtonCalendarYes.setEnabled(true);
                this.radioButtonCalendarNo.setEnabled(true);
                this.spinnerYear.setEnabled(true);
                this.spinnerMonth.setEnabled(true);
            } else {
                this.tv_dob.setText(this.bk.date_of_birth);
                this.radioGroupCalendar.setEnabled(false);
                this.radioButtonCalendarYes.setEnabled(false);
                this.radioButtonCalendarNo.setEnabled(false);
                this.spinnerYear.setEnabled(false);
                this.spinnerMonth.setEnabled(false);
                String string = this.tv_dob.getText().toString();
                Object[] objArr6 = new Object[1];
                a(10 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (getPackageName().length() - 25), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 232, objArr6);
                try {
                    Date date = new SimpleDateFormat(((String) objArr6[0]).intern()).parse(string);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(date.getTime());
                    this.aU = H(calendar.get(5), calendar.get(2), calendar.get(1), true);
                } catch (ParseException unused) {
                }
            }
            String str = this.bk.gender;
            Object[] objArr7 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 32, (char) (47909 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 344, objArr7);
            if (str.equalsIgnoreCase(((String) objArr7[0]).intern())) {
                int i9 = q + 77;
                p = i9 % 128;
                int i10 = i9 % 2;
                this.radioButtonMale.setChecked(true);
                this.radioButtonFemale.setChecked(false);
                this.radioButtonTrans.setChecked(false);
                this.radioGroupGender.setEnabled(false);
                this.radioButtonTrans.setEnabled(false);
                this.radioButtonFemale.setEnabled(false);
                this.radioButtonMale.setEnabled(false);
            } else {
                String str2 = this.bk.gender;
                Object[] objArr8 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 2, (char) (getApplicationInfo().targetSdkVersion + 23872), getApplicationInfo().targetSdkVersion + 321, objArr8);
                if (!(!str2.equalsIgnoreCase(((String) objArr8[0]).intern()))) {
                    this.radioButtonMale.setChecked(false);
                    this.radioButtonFemale.setChecked(true);
                    this.radioButtonTrans.setChecked(false);
                    this.radioGroupGender.setEnabled(false);
                    this.radioButtonTrans.setEnabled(false);
                    this.radioButtonFemale.setEnabled(false);
                    this.radioButtonMale.setEnabled(false);
                } else {
                    String str3 = this.bk.gender;
                    Object[] objArr9 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 20, (char) (getPackageName().codePointAt(14) - 101), (ViewConfiguration.getJumpTapTimeout() >> 16) + 358, objArr9);
                    if (str3.equalsIgnoreCase(((String) objArr9[0]).intern())) {
                        this.radioButtonMale.setChecked(false);
                        this.radioButtonFemale.setChecked(false);
                        this.radioButtonTrans.setChecked(true);
                        this.radioGroupGender.setEnabled(false);
                        this.radioButtonTrans.setEnabled(false);
                        this.radioButtonFemale.setEnabled(false);
                        this.radioButtonMale.setEnabled(false);
                    } else {
                        String str4 = this.bk.gender;
                        Object[] objArr10 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 26, (char) Color.red(0), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 320, objArr10);
                        if (str4.equalsIgnoreCase(((String) objArr10[0]).intern())) {
                            this.radioButtonMale.setChecked(false);
                            this.radioButtonFemale.setChecked(false);
                            this.radioButtonTrans.setChecked(true);
                            this.radioGroupGender.setEnabled(false);
                            this.radioButtonTrans.setEnabled(false);
                            this.radioButtonFemale.setEnabled(false);
                            this.radioButtonMale.setEnabled(false);
                        } else {
                            this.radioGroupGender.setEnabled(true);
                            this.radioButtonTrans.setEnabled(true);
                            this.radioButtonFemale.setEnabled(true);
                            this.radioButtonMale.setEnabled(true);
                        }
                    }
                }
            }
            Object[] objArr11 = new Object[1];
            a(18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (getPackageName().length() + 30207), 380 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
            new au(this, ((String) objArr11[0]).intern(), getResources().getString(R.string.disablity_status), this.sp_disability, new S(this)).execute(new Void[0]);
            int i11 = this.bk.marital_status;
            if (i11 == 200 || i11 == 201 || i11 == 202 || i11 == 203) {
                Object[] objArr12 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 10, (char) (getApplicationInfo().targetSdkVersion - 31), 397 - Color.green(0), objArr12);
                new au(this, ((String) objArr12[0]).intern(), getResources().getString(R.string.marital_status), this.sp_marital_status, new ivas.gov.bisp.enumeration.bI.R(this)).execute(new Void[0]);
            } else {
                this.sp_marital_status.setEnabled(true);
            }
            if (!this.bk.cnic.equals(BuildConfig.FLAVOR)) {
                String str5 = this.bk.cnic;
                this.et_RosterCNIC.setText(str5);
                this.et_RosterCNICRepeat.setText(str5);
            }
            this.sp_relation_to_household.setSelection(0);
            this.linearLayoutCNIC.setVisibility(0);
            this.et_MemberName.setEnabled(false);
            this.sp_relation_to_household.setEnabled(true);
        }
        ArrayList<Item> arrayList4 = this.bN.R;
        if (arrayList4 == null) {
            Object[] objArr13 = new Object[1];
            a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 397, objArr13);
            new au(this, ((String) objArr13[0]).intern(), getResources().getString(R.string.marital_status), this.sp_marital_status, new C0125v(this)).execute(new Void[0]);
        } else {
            this.aJ = arrayList4;
            R(arrayList4, this.sp_marital_status);
            if (this.aX) {
                for (int i12 = 0; i12 < this.aJ.size(); i12++) {
                    int i13 = p + 43;
                    q = i13 % 128;
                    if (i13 % 2 == 0) {
                        this.aJ.get(i12).getOptionId();
                        int i14 = this.bk.marital_status;
                        throw null;
                    }
                    if (this.aJ.get(i12).getOptionId() == this.bk.marital_status) {
                        break;
                    }
                }
            }
        }
        ArrayList<Item> arrayList5 = this.bN.Q;
        if (arrayList5 == null) {
            Object[] objArr14 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 18, (char) (getApplicationInfo().targetSdkVersion - 31), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 375, objArr14);
            new au(this, ((String) objArr14[0]).intern(), getResources().getString(R.string.chronic_disease), this.sp_chronic_disease, new A(this)).execute(new Void[0]);
        } else {
            this.aN = arrayList5;
            R(arrayList5, this.sp_chronic_disease);
            if (this.aX) {
                for (int i15 = 0; i15 < this.aN.size() && this.aN.get(i15).getOptionId() != this.bk.chronic_disease; i15++) {
                    int i16 = q + 55;
                    p = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
        }
        ArrayList<Item> arrayList6 = this.bN.P;
        if (arrayList6 != null) {
            this.aP = arrayList6;
            R(arrayList6, this.sp_attended_school);
            this.sp_attended_school.setOnItemSelectedListener(this.bt);
            if (this.aX) {
                int i18 = q + 91;
                p = i18 % 128;
                int i19 = i18 % 2;
                for (int i20 = 0; i20 < this.aP.size(); i20++) {
                    int i21 = p + 117;
                    q = i21 % 128;
                    int i22 = i21 % 2;
                    if (this.aP.get(i20).getOptionId() == this.bk.attended_school) {
                        break;
                    }
                }
            }
        } else {
            Object[] objArr15 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 17, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), getPackageName().length() + 408, objArr15);
            new au(this, ((String) objArr15[0]).intern(), getResources().getString(R.string.attended_school), this.sp_attended_school, new ivas.gov.bisp.enumeration.bI.am(this)).execute(new Void[0]);
        }
        ArrayList<Item> arrayList7 = this.bN.L;
        if (arrayList7 == null) {
            Object[] objArr16 = new Object[1];
            a((ViewConfiguration.getFadingEdgeLength() >> 16) + 27, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 443, objArr16);
            new au(this, ((String) objArr16[0]).intern(), getResources().getString(R.string.education_level), this.sp_highest_education, new V(this)).execute(new Void[0]);
        } else {
            this.aQ = arrayList7;
            R(arrayList7, this.sp_highest_education);
            if (this.aX) {
                for (int i23 = 0; i23 < this.aQ.size(); i23++) {
                    if (this.aQ.get(i23).getOptionId() == this.bk.higher_education) {
                        this.sp_highest_education.setSelection(i23);
                        break;
                    }
                }
            }
        }
        ArrayList<Item> arrayList8 = this.bN.M;
        if (arrayList8 == null) {
            Object[] objArr17 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 14, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), View.getDefaultSize(0, 0) + 474, objArr17);
            new au(this, ((String) objArr17[0]).intern(), getResources().getString(R.string.employment_status), this.sp_employment_status, new C(this)).execute(new Void[0]);
        } else {
            this.bf = arrayList8;
            R(arrayList8, this.sp_employment_status);
            if (this.aX) {
                int i24 = 0;
                while (true) {
                    if (i24 >= this.bf.size()) {
                        i24 = 0;
                        break;
                    }
                    int i25 = q + 45;
                    p = i25 % 128;
                    int i26 = i25 % 2;
                    if (this.bf.get(i24).getOptionId() == this.bk.employment_status) {
                        break;
                    }
                    int i27 = q + 11;
                    p = i27 % 128;
                    i24 = i27 % 2 != 0 ? i24 + 10 : i24 + 1;
                }
                this.sp_employment_status.setSelection(i24);
            }
        }
        if (this.aX) {
            int i28 = 0;
            while (true) {
                if (i28 >= this.aT.size()) {
                    i28 = 0;
                    break;
                } else if (this.aT.get(i28).equals(this.bk.mobile_network_name)) {
                    break;
                } else {
                    i28++;
                }
            }
            this.sp_networks.setSelection(i28);
        }
        if (this.aX) {
            int i29 = 0;
            while (true) {
                if (i29 >= this.aS.size()) {
                    i29 = 0;
                    break;
                } else if (this.aS.get(i29).equals(this.bk.banks_name)) {
                    break;
                } else {
                    i29++;
                }
            }
            this.sp_banks.setSelection(i29);
        }
        ac.m(new Spinner[]{this.sp_disability, this.sp_chronic_disease, this.sp_employment_status}, new o[]{null, null, null});
        EditText editText = this.et_RosterCNIC;
        editText.addTextChangedListener(new o000000O(editText));
        EditText editText2 = this.et_RosterCNICRepeat;
        editText2.addTextChangedListener(new o000000O(editText2));
        EditText editText3 = this.por_roster;
        editText3.addTextChangedListener(new o000000(editText3));
        this.sp_highest_education.setOnItemSelectedListener(new OooO0o());
        this.radioGroupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bI.x
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ActivityRoster d;

            {
                this.d = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:100:0x02e5, code lost:
            
                if ((r1 % 2) != 0) goto L102;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x02e7, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x02e8, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
            
                if (r0 != r1.getId()) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
            
                r0 = ivas.gov.bisp.enumeration.bI.C0126x.a + 87;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r0 % 128;
                r0 = r0 % 2;
                r14.ll_bank_info.setVisibility(0);
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r0 = (r14 & 79) + (r14 | 79);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
            
                if ((r0 % 2) != 0) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
            
                r13 = 30 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
            
                r0 = r14.rg_bank_info.getCheckedRadioButtonId();
                r1 = r14.rb_no_bank;
                r2 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r5 = r2 & 17;
                r5 = (r5 - (~(-(-((r2 ^ 17) | r5))))) - 1;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r5 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
            
                if ((r5 % 2) != 0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
            
                if (r0 != r1.getId()) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
            
                r14.ll_bank_info.setVisibility(8);
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r0 = r14 & 37;
                r14 = -(-((r14 ^ 37) | r0));
                r1 = (r0 ^ r14) + ((r14 & r0) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
            
                if ((r1 % 2) == 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
            
                r14 = 4 / 4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r0 = (r14 & (-10)) | ((~r14) & 9);
                r14 = (r14 & 9) << 1;
                r1 = (r0 & r14) + (r14 | r0);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
            
                r1.getId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00d2, code lost:
            
                r0 = r12.d;
                r1 = ivas.gov.bisp.enumeration.rosterActivity.ActivityRoster.af;
                r1 = r0.ac;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
            
                if (r1 == 1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
            
                r7 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r8 = ((r7 ^ 41) | (r7 & 41)) << 1;
                r9 = -((r7 & (-42)) | ((~r7) & 41));
                r10 = (r8 ^ r9) + ((r8 & r9) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r10 % 128;
                r10 = r10 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
            
                if (r1 == 2) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00f6, code lost:
            
                r7 = r7 + 119;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
            
                if ((r7 % 2) == 0) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
            
                if ((!ivas.gov.bisp.enumeration.bK.ag.d) == true) goto L73;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
            
                r13 = ivas.gov.bisp.enumeration.bK.ag.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
            
                if (ivas.gov.bisp.enumeration.bK.ag.j != 1) goto L73;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r7 = (r1 & 111) + (r1 | 111);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
            
                if (r14 != r0.radioButtonFemale.getId()) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0120, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r7 = r1 ^ 83;
                r1 = (r1 & 83) << 1;
                r8 = (r7 & r1) + (r1 | r7);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r8 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
            
                if ((r8 % 2) != 0) goto L70;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0138, code lost:
            
                if (r0.aU < 18.0d) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0146, code lost:
            
                if (r0.radioGroupCNICOptions.getCheckedRadioButtonId() != r0.radioButtonCNICPresent.getId()) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0148, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r8 = r1 & 89;
                r7 = (((r1 ^ 89) | r8) << 1) - ((r1 | 89) & (~r8));
                ivas.gov.bisp.enumeration.bI.C0126x.a = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0160, code lost:
            
                if (r0.et_RosterCNIC.length() != 15) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0162, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r7 = r1 & 13;
                r2 = ((r1 ^ 13) | r7) << 1;
                r1 = -((r1 | 13) & (~r7));
                r7 = ((r2 | r1) << 1) - (r1 ^ r2);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0179, code lost:
            
                if ((r7 % 2) == 0) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0181, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 0) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0183, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b + 13;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x018c, code lost:
            
                if ((r1 % 2) == 0) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0194, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 1) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x019d, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 1) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x019f, code lost:
            
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a + 71;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x01a8, code lost:
            
                if ((r1 % 2) != 0) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x01aa, code lost:
            
                r0.checkBoxBispBenif.setVisibility(1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x01b0, code lost:
            
                r0.checkBoxBispBenif.setVisibility(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x01b5, code lost:
            
                r0.aY = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x01b8, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r2 = r1 & 121;
                r1 = -(-(r1 | 121));
                r7 = ((r2 | r1) << 1) - (r1 ^ r2);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x01d2, code lost:
            
                r0.sp_marital_status.getSelectedItemPosition();
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x01d7, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x01d8, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r2 = r1 & 11;
                r1 = (r1 ^ 11) | r2;
                r7 = (r2 ^ r1) + ((r1 & r2) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r7 % 128;
                r7 = r7 % 2;
                r0.aY = false;
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b + 67;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x01fa, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r2 = r1 & 67;
                r2 = r2 + ((r1 ^ 67) | r2);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x020f, code lost:
            
                r13 = r0.aU;
                r3.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x0214, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0215, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r1 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r2 = r1 & 37;
                r1 = (r1 ^ 37) | r2;
                r7 = ((r2 | r1) << 1) - (r1 ^ r2);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x0233, code lost:
            
                if (r14 != r0.radioButtonMale.getId()) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x0235, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r1 = (r14 ^ 115) + ((r14 & 115) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0242, code lost:
            
                if ((r1 % 2) == 0) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x024a, code lost:
            
                if (r0.aU >= 13.0d) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x024c, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a + 123;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r14 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x0255, code lost:
            
                if ((r14 % 2) != 0) goto L82;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0257, code lost:
            
                r0.sp_marital_status.setVisibility(100);
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x025f, code lost:
            
                r0.sp_marital_status.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x0264, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0265, code lost:
            
                r0.sp_marital_status.setVisibility(0);
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b + 79;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r14 % 128;
                r14 = r14 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0273, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0274, code lost:
            
                r13 = r0.aU;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0276, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x027d, code lost:
            
                if (r14 != r0.radioButtonFemale.getId()) goto L99;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x027f, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r1 = (r14 & 63) + (r14 | 63);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0291, code lost:
            
                if (r0.aU >= 10.0d) goto L98;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0293, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r1 = r14 & 121;
                r1 = r1 + ((r14 ^ 121) | r1);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x02a0, code lost:
            
                if ((r1 % 2) != 0) goto L95;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x02a2, code lost:
            
                r0.sp_marital_status.setVisibility(44);
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x02aa, code lost:
            
                r0.sp_marital_status.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x02af, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b + 79;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r14 % 128;
                r14 = r14 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x02b8, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x02b9, code lost:
            
                r0.sp_marital_status.setVisibility(0);
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r0 = r14 & 77;
                r14 = (r14 | 77) & (~r0);
                r0 = r0 << 1;
                r1 = (r14 & r0) + (r14 | r0);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x02d0, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0126x.b;
                r0 = (r14 & (-8)) | ((~r14) & 7);
                r14 = (r14 & 7) << 1;
                r1 = ((r0 | r14) << 1) - (r14 ^ r0);
                ivas.gov.bisp.enumeration.bI.C0126x.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
            
                r14 = (r0 & (-22)) | ((~r0) & 21);
                r0 = -(-((r0 & 21) << 1));
                r1 = (r14 & r0) + (r14 | r0);
                r14 = r1 % 128;
                ivas.gov.bisp.enumeration.bI.C0126x.a = r14;
                r1 = r1 % 2;
                r14 = r14 + 67;
                ivas.gov.bisp.enumeration.bI.C0126x.b = r14 % 128;
                r14 = r14 % 2;
                r14 = r12.d;
                r0 = r14.rg_bank_info.getCheckedRadioButtonId();
                r1 = r14.rb_yes_bank;
                r7 = ivas.gov.bisp.enumeration.bI.C0126x.a;
                r8 = (r7 ^ 15) + ((15 & r7) << 1);
                ivas.gov.bisp.enumeration.bI.C0126x.b = r8 % 128;
                r8 = r8 % 2;
             */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCheckedChanged(android.widget.RadioGroup r13, int r14) {
                /*
                    Method dump skipped, instruction units count: 745
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bI.C0126x.onCheckedChanged(android.widget.RadioGroup, int):void");
            }
        });
        this.radioGroupLanguage.setOnCheckedChangeListener(new OooO());
        this.radioGroupCNICOptions.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bI.M
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ActivityRoster d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x037c  */
            /* JADX WARN: Code duplicated, block: B:103:0x0397 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:104:0x0398  */
            /* JADX WARN: Code duplicated, block: B:105:0x0399  */
            /* JADX WARN: Code duplicated, block: B:107:0x039f  */
            /* JADX WARN: Code duplicated, block: B:109:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:110:0x03c5  */
            /* JADX WARN: Code duplicated, block: B:113:0x03de  */
            /* JADX WARN: Code duplicated, block: B:114:0x03e8  */
            /* JADX WARN: Code duplicated, block: B:118:0x03f7  */
            /* JADX WARN: Code duplicated, block: B:120:0x0402  */
            /* JADX WARN: Code duplicated, block: B:121:0x0409  */
            /* JADX WARN: Code duplicated, block: B:123:0x040d  */
            /* JADX WARN: Code duplicated, block: B:125:0x0431  */
            /* JADX WARN: Code duplicated, block: B:128:0x043f  */
            /* JADX WARN: Code duplicated, block: B:130:0x0448  */
            /* JADX WARN: Code duplicated, block: B:133:0x0473  */
            /* JADX WARN: Code duplicated, block: B:134:0x0479  */
            /* JADX WARN: Code duplicated, block: B:34:0x0147  */
            /* JADX WARN: Code duplicated, block: B:36:0x0180  */
            /* JADX WARN: Code duplicated, block: B:38:0x0194  */
            /* JADX WARN: Code duplicated, block: B:40:0x01a8  */
            /* JADX WARN: Code duplicated, block: B:41:0x01ae  */
            /* JADX WARN: Code duplicated, block: B:44:0x01c8  */
            /* JADX WARN: Code duplicated, block: B:47:0x01d5  */
            /* JADX WARN: Code duplicated, block: B:49:0x01de  */
            /* JADX WARN: Code duplicated, block: B:50:0x01f9  */
            /* JADX WARN: Code duplicated, block: B:53:0x0219  */
            /* JADX WARN: Code duplicated, block: B:55:0x0224  */
            /* JADX WARN: Code duplicated, block: B:56:0x0228  */
            /* JADX WARN: Code duplicated, block: B:60:0x0253  */
            /* JADX WARN: Code duplicated, block: B:62:0x0268  */
            /* JADX WARN: Code duplicated, block: B:64:0x0279  */
            /* JADX WARN: Code duplicated, block: B:67:0x027e  */
            /* JADX WARN: Code duplicated, block: B:69:0x0284  */
            /* JADX WARN: Code duplicated, block: B:71:0x0288  */
            /* JADX WARN: Code duplicated, block: B:73:0x0293  */
            /* JADX WARN: Code duplicated, block: B:75:0x029b  */
            /* JADX WARN: Code duplicated, block: B:77:0x02ad  */
            /* JADX WARN: Code duplicated, block: B:79:0x02d9  */
            /* JADX WARN: Code duplicated, block: B:81:0x02df  */
            /* JADX WARN: Code duplicated, block: B:83:0x02f2  */
            /* JADX WARN: Code duplicated, block: B:85:0x02fa  */
            /* JADX WARN: Code duplicated, block: B:93:0x0340  */
            /* JADX WARN: Code duplicated, block: B:95:0x0346  */
            /* JADX WARN: Code duplicated, block: B:97:0x035b  */
            /* JADX WARN: Code duplicated, block: B:99:0x0362  */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i30) {
                Button button;
                int i31;
                int i110;
                int i111;
                Button button2;
                int i112;
                Button button3;
                int i113;
                int i114;
                int i115;
                int i116;
                int i117;
                int checkedRadioButtonId;
                RadioButton radioButton;
                int i118;
                int i119;
                int i210;
                int i211;
                int i212;
                int i213;
                int i214 = 2 % 2;
                int i215 = b;
                int i216 = ((i215 ^ 68) + ((i215 & 68) << 1)) - 1;
                a = i216 % 128;
                int i217 = i216 % 2;
                Object obj = null;
                if (i3 != 0) {
                    int i218 = i215 & 97;
                    int i219 = (i218 - (~(-(-((i215 ^ 97) | i218))))) - 1;
                    a = i219 % 128;
                    int i32 = i219 % 2;
                    int i33 = i215 & 101;
                    int i34 = (i33 - (~(-(-((i215 ^ 101) | i33))))) - 1;
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    ActivityRoster activityRoster = this.d;
                    if (i30 != activityRoster.radioButtonCalendarYes.getId()) {
                        activityRoster.tv_dob.setEnabled(false);
                        activityRoster.spinnerYear.setEnabled(true);
                        int i36 = b;
                        int i37 = i36 & 61;
                        int i38 = ((((i36 ^ 61) | i37) << 1) - (~(-((i36 | 61) & (~i37))))) - 1;
                        a = i38 % 128;
                        int i39 = i38 % 2;
                        activityRoster.spinnerMonth.setEnabled(true);
                        int i310 = a;
                        int i311 = (i310 & 47) + (i310 | 47);
                        b = i311 % 128;
                        if (i311 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i40 = b;
                    int i41 = (i40 & (-64)) | ((~i40) & 63);
                    int i42 = -(-((i40 & 63) << 1));
                    int i43 = (i41 & i42) + (i42 | i41);
                    a = i43 % 128;
                    if (i43 % 2 != 0) {
                        activityRoster.tv_dob.setEnabled(false);
                        activityRoster.spinnerYear.setEnabled(true);
                    } else {
                        activityRoster.tv_dob.setEnabled(false);
                        activityRoster.spinnerYear.setEnabled(false);
                    }
                    activityRoster.spinnerMonth.setEnabled(false);
                    int i44 = b;
                    int i45 = (((i44 ^ 27) | (i44 & 27)) << 1) - (((~i44) & 27) | (i44 & (-28)));
                    a = i45 % 128;
                    if (i45 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                ActivityRoster activityRoster2 = this.d;
                activityRoster2.por_roster.setText(BuildConfig.FLAVOR);
                int i46 = a;
                int i47 = i46 ^ 39;
                int i48 = ((i46 & 39) | i47) << 1;
                int i49 = -i47;
                int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
                b = i50 % 128;
                int i51 = 8;
                if (i50 % 2 == 0) {
                    activityRoster2.vald_txt_view_caption.setVisibility(79);
                } else {
                    activityRoster2.vald_txt_view_caption.setVisibility(8);
                }
                activityRoster2.vald_txt_view.setVisibility(8);
                activityRoster2.vald_name_txt_view.setVisibility(8);
                int i52 = a;
                int i53 = i52 & 9;
                int i54 = ((i52 ^ 9) | i53) << 1;
                int i55 = -((i52 | 9) & (~i53));
                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                b = i56 % 128;
                int i57 = i56 % 2;
                activityRoster2.G();
                if (i30 != activityRoster2.rb_afghani_acc.getId()) {
                    int i58 = b;
                    int i59 = i58 ^ 65;
                    int i60 = -(-((i58 & 65) << 1));
                    int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                    a = i61 % 128;
                    if (i61 % 2 != 0) {
                        int i62 = 42 / 0;
                        if (i30 != activityRoster2.rb_afghani_por.getId()) {
                            int i610 = a;
                            int i611 = (((i610 ^ 123) | (i610 & 123)) << 1) - (((~i610) & 123) | (i610 & (-124)));
                            b = i611 % 128;
                            int i612 = i611 % 2;
                            activityRoster2.por_roster.setVisibility(8);
                            int i613 = a;
                            int i614 = i613 & 3;
                            int i615 = ((i613 ^ 3) | i614) << 1;
                            int i616 = -((i613 | 3) & (~i614));
                            int i713 = (i615 ^ i616) + ((i616 & i615) << 1);
                            b = i713 % 128;
                            int i714 = i713 % 2;
                            if (i30 == activityRoster2.radioButtonCNICPresent.getId()) {
                                int i715 = a + 113;
                                b = i715 % 128;
                                int i716 = i715 % 2;
                                activityRoster2.btn_vald_cnic.setVisibility(8);
                                if (ax.c(activityRoster2)) {
                                    int i717 = b;
                                    int i718 = i717 ^ 37;
                                    int i719 = -(-((i717 & 37) << 1));
                                    i213 = (i718 & i719) + (i719 | i718);
                                    a = i213 % 128;
                                    if (i213 % 2 != 0) {
                                        activityRoster2.btn_vald_cnic.setEnabled(false);
                                    } else {
                                        activityRoster2.btn_vald_cnic.setEnabled(true);
                                    }
                                }
                                activityRoster2.et_RosterCNIC.setVisibility(0);
                                activityRoster2.et_RosterCNICRepeat.setVisibility(0);
                                i114 = a + 105;
                                b = i114 % 128;
                                if (i114 % 2 == 0) {
                                    activityRoster2.buttonScanCNIC.setVisibility(92);
                                    if (activityRoster2.aZ < 5) {
                                        int i7113 = b;
                                        int i7114 = (((i7113 & (-68)) | ((~i7113) & 67)) - (~(-(-((i7113 & 67) << 1))))) - 1;
                                        a = i7114 % 128;
                                        int i7115 = i7114 % 2;
                                        activityRoster2.btn_bio_cnic.setEnabled(true);
                                    } else {
                                        activityRoster2.btn_bio_cnic.setEnabled(false);
                                        int i815 = b;
                                        int i816 = i815 ^ 61;
                                        int i817 = -(-((i815 & 61) << 1));
                                        int i818 = (i816 & i817) + (i817 | i816);
                                        a = i818 % 128;
                                        int i819 = i818 % 2;
                                    }
                                } else {
                                    activityRoster2.buttonScanCNIC.setVisibility(8);
                                    if (activityRoster2.aZ < 3) {
                                        int i7116 = b;
                                        int i7117 = (((i7116 & (-68)) | ((~i7116) & 67)) - (~(-(-((i7116 & 67) << 1))))) - 1;
                                        a = i7117 % 128;
                                        int i7118 = i7117 % 2;
                                        activityRoster2.btn_bio_cnic.setEnabled(true);
                                    } else {
                                        activityRoster2.btn_bio_cnic.setEnabled(false);
                                        int i8110 = b;
                                        int i8111 = i8110 ^ 61;
                                        int i8112 = -(-((i8110 & 61) << 1));
                                        int i8113 = (i8111 & i8112) + (i8112 | i8111);
                                        a = i8113 % 128;
                                        int i8114 = i8113 % 2;
                                    }
                                }
                                activityRoster2.buttonScanCNIC.setEnabled(true);
                                if (!activityRoster2.aX) {
                                    i212 = a + 1;
                                    b = i212 % 128;
                                    if (i212 % 2 != 0) {
                                        activityRoster2.F();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    activityRoster2.F();
                                }
                                ((InputMethodManager) activityRoster2.getSystemService("input_method")).showSoftInput(activityRoster2.et_RosterCNIC, 1);
                                int i912 = a;
                                int i913 = i912 & 89;
                                int i914 = (((i912 | 89) & (~i913)) - (~(-(-(i913 << 1))))) - 1;
                                b = i914 % 128;
                                int i915 = i914 % 2;
                                i115 = activityRoster2.ac;
                                if (i115 != 1) {
                                    int i916 = a;
                                    int i917 = i916 ^ 13;
                                    int i918 = -(-((i916 & 13) << 1));
                                    int i919 = ((i917 | i918) << 1) - (i918 ^ i917);
                                    i210 = i919 % 128;
                                    b = i210;
                                    int i920 = i919 % 2;
                                    if (i115 != 2) {
                                        i211 = (-2) - ((((i210 | 108) << 1) - (i210 ^ 108)) ^ (-1));
                                        a = i211 % 128;
                                        if (i211 % 2 == 0) {
                                            boolean z2 = ag.d;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (ag.d) {
                                            if (ag.j == 1) {
                                                i116 = a + 115;
                                                b = i116 % 128;
                                                if (i116 % 2 != 0) {
                                                    double d6 = activityRoster2.aU;
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                if (activityRoster2.aU >= 18.0d) {
                                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                    activityRoster2.aY = false;
                                                    int i9112 = b;
                                                    int i10111110 = i9112 & 97;
                                                    int i10111111 = (i9112 | 97) & (~i10111110);
                                                    int i10111112 = i10111110 << 1;
                                                    i117 = (i10111111 & i10111112) + (i10111111 | i10111112);
                                                    a = i117 % 128;
                                                    if (i117 % 2 == 0) {
                                                        throw null;
                                                    }
                                                    return;
                                                }
                                                int i10111113 = b + 123;
                                                a = i10111113 % 128;
                                                int i10111114 = i10111113 % 2;
                                                if (activityRoster2.et_RosterCNIC.length() == 15) {
                                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                    activityRoster2.aY = false;
                                                    int i10111115 = b;
                                                    int i10111116 = i10111115 & 73;
                                                    int i10111117 = (i10111115 | 73) & (~i10111116);
                                                    int i10111118 = i10111116 << 1;
                                                    int i10111119 = (i10111117 & i10111118) + (i10111117 | i10111118);
                                                    a = i10111119 % 128;
                                                    int i11111110 = i10111119 % 2;
                                                    return;
                                                }
                                                int i11111111 = b;
                                                int i11111112 = (i11111111 & (-62)) | ((~i11111111) & 61);
                                                int i11111113 = -(-((i11111111 & 61) << 1));
                                                int i11111114 = (i11111112 & i11111113) + (i11111113 | i11111112);
                                                a = i11111114 % 128;
                                                int i11111115 = i11111114 % 2;
                                                checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                                radioButton = activityRoster2.radioButtonFemale;
                                                int i11111116 = a;
                                                i118 = (i11111116 & 97) + (i11111116 | 97);
                                                b = i118 % 128;
                                                if (i118 % 2 != 0) {
                                                    radioButton.getId();
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                if (checkedRadioButtonId == radioButton.getId()) {
                                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                    activityRoster2.aY = false;
                                                    int i11111117 = b;
                                                    int i11111118 = i11111117 & 31;
                                                    int i11111119 = i11111118 + ((i11111117 ^ 31) | i11111118);
                                                    a = i11111119 % 128;
                                                    int i121118 = i11111119 % 2;
                                                    return;
                                                }
                                                int i121119 = a;
                                                int i1211110 = i121119 & 125;
                                                int i1211111 = (i121119 ^ 125) | i1211110;
                                                i119 = (i1211110 ^ i1211111) + ((i1211111 & i1211110) << 1);
                                                b = i119 % 128;
                                                if (i119 % 2 != 0) {
                                                    activityRoster2.sp_marital_status.getSelectedItemPosition();
                                                    throw null;
                                                }
                                                if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0 || activityRoster2.sp_marital_status.getSelectedItemPosition() == 1) {
                                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                    activityRoster2.aY = false;
                                                    int i1211112 = b;
                                                    int i1211113 = ((i1211112 & 107) - (~(i1211112 | 107))) - 1;
                                                    a = i1211113 % 128;
                                                    int i1211114 = i1211113 % 2;
                                                    return;
                                                }
                                                int i127 = b;
                                                int i128 = (i127 & 23) + (i127 | 23);
                                                a = i128 % 128;
                                                int i129 = i128 % 2;
                                                activityRoster2.checkBoxBispBenif.setVisibility(0);
                                                activityRoster2.aY = true;
                                                int i130 = a;
                                                int i131 = ((i130 ^ 11) - (~(-(-((i130 & 11) << 1))))) - 1;
                                                b = i131 % 128;
                                                if (i131 % 2 == 0) {
                                                    int i132 = 0 / 0;
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    } else if (ag.j == 1) {
                                        i116 = a + 115;
                                        b = i116 % 128;
                                        if (i116 % 2 != 0) {
                                            double d7 = activityRoster2.aU;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (activityRoster2.aU >= 18.0d) {
                                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                                            activityRoster2.aY = false;
                                            int i9113 = b;
                                            int i101111110 = i9113 & 97;
                                            int i101111111 = (i9113 | 97) & (~i101111110);
                                            int i101111112 = i101111110 << 1;
                                            i117 = (i101111111 & i101111112) + (i101111111 | i101111112);
                                            a = i117 % 128;
                                            if (i117 % 2 == 0) {
                                                throw null;
                                            }
                                            return;
                                        }
                                        int i101111113 = b + 123;
                                        a = i101111113 % 128;
                                        int i101111114 = i101111113 % 2;
                                        if (activityRoster2.et_RosterCNIC.length() == 15) {
                                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                                            activityRoster2.aY = false;
                                            int i101111115 = b;
                                            int i101111116 = i101111115 & 73;
                                            int i101111117 = (i101111115 | 73) & (~i101111116);
                                            int i101111118 = i101111116 << 1;
                                            int i101111119 = (i101111117 & i101111118) + (i101111117 | i101111118);
                                            a = i101111119 % 128;
                                            int i111111110 = i101111119 % 2;
                                            return;
                                        }
                                        int i111111111 = b;
                                        int i111111112 = (i111111111 & (-62)) | ((~i111111111) & 61);
                                        int i111111113 = -(-((i111111111 & 61) << 1));
                                        int i111111114 = (i111111112 & i111111113) + (i111111113 | i111111112);
                                        a = i111111114 % 128;
                                        int i111111115 = i111111114 % 2;
                                        checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                        radioButton = activityRoster2.radioButtonFemale;
                                        int i111111116 = a;
                                        i118 = (i111111116 & 97) + (i111111116 | 97);
                                        b = i118 % 128;
                                        if (i118 % 2 != 0) {
                                            radioButton.getId();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (checkedRadioButtonId == radioButton.getId()) {
                                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                                            activityRoster2.aY = false;
                                            int i111111117 = b;
                                            int i111111118 = i111111117 & 31;
                                            int i111111119 = i111111118 + ((i111111117 ^ 31) | i111111118);
                                            a = i111111119 % 128;
                                            int i1211115 = i111111119 % 2;
                                            return;
                                        }
                                        int i1211116 = a;
                                        int i1211117 = i1211116 & 125;
                                        int i1211118 = (i1211116 ^ 125) | i1211117;
                                        i119 = (i1211117 ^ i1211118) + ((i1211118 & i1211117) << 1);
                                        b = i119 % 128;
                                        if (i119 % 2 != 0) {
                                            activityRoster2.sp_marital_status.getSelectedItemPosition();
                                            throw null;
                                        }
                                        if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                        }
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i1211119 = b;
                                        int i12111110 = ((i1211119 & 107) - (~(i1211119 | 107))) - 1;
                                        a = i12111110 % 128;
                                        int i12111111 = i12111110 % 2;
                                        return;
                                    }
                                } else if (ag.j == 1) {
                                    i116 = a + 115;
                                    b = i116 % 128;
                                    if (i116 % 2 != 0) {
                                        double d8 = activityRoster2.aU;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (activityRoster2.aU >= 18.0d) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i9114 = b;
                                        int i1011111110 = i9114 & 97;
                                        int i1011111111 = (i9114 | 97) & (~i1011111110);
                                        int i1011111112 = i1011111110 << 1;
                                        i117 = (i1011111111 & i1011111112) + (i1011111111 | i1011111112);
                                        a = i117 % 128;
                                        if (i117 % 2 == 0) {
                                            throw null;
                                        }
                                        return;
                                    }
                                    int i1011111113 = b + 123;
                                    a = i1011111113 % 128;
                                    int i1011111114 = i1011111113 % 2;
                                    if (activityRoster2.et_RosterCNIC.length() == 15) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i1011111115 = b;
                                        int i1011111116 = i1011111115 & 73;
                                        int i1011111117 = (i1011111115 | 73) & (~i1011111116);
                                        int i1011111118 = i1011111116 << 1;
                                        int i1011111119 = (i1011111117 & i1011111118) + (i1011111117 | i1011111118);
                                        a = i1011111119 % 128;
                                        int i1111111110 = i1011111119 % 2;
                                        return;
                                    }
                                    int i1111111111 = b;
                                    int i1111111112 = (i1111111111 & (-62)) | ((~i1111111111) & 61);
                                    int i1111111113 = -(-((i1111111111 & 61) << 1));
                                    int i1111111114 = (i1111111112 & i1111111113) + (i1111111113 | i1111111112);
                                    a = i1111111114 % 128;
                                    int i1111111115 = i1111111114 % 2;
                                    checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                    radioButton = activityRoster2.radioButtonFemale;
                                    int i1111111116 = a;
                                    i118 = (i1111111116 & 97) + (i1111111116 | 97);
                                    b = i118 % 128;
                                    if (i118 % 2 != 0) {
                                        radioButton.getId();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (checkedRadioButtonId == radioButton.getId()) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i1111111117 = b;
                                        int i1111111118 = i1111111117 & 31;
                                        int i1111111119 = i1111111118 + ((i1111111117 ^ 31) | i1111111118);
                                        a = i1111111119 % 128;
                                        int i12111112 = i1111111119 % 2;
                                        return;
                                    }
                                    int i12111113 = a;
                                    int i12111114 = i12111113 & 125;
                                    int i12111115 = (i12111113 ^ 125) | i12111114;
                                    i119 = (i12111114 ^ i12111115) + ((i12111115 & i12111114) << 1);
                                    b = i119 % 128;
                                    if (i119 % 2 != 0) {
                                        activityRoster2.sp_marital_status.getSelectedItemPosition();
                                        throw null;
                                    }
                                    if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                    }
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i12111116 = b;
                                    int i12111117 = ((i12111116 & 107) - (~(i12111116 | 107))) - 1;
                                    a = i12111117 % 128;
                                    int i12111118 = i12111117 % 2;
                                    return;
                                }
                            } else {
                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                int i1310 = a;
                                i111 = (((i1310 ^ 77) | (i1310 & 77)) << 1) - (((~i1310) & 77) | (i1310 & (-78)));
                                b = i111 % 128;
                                if (i111 % 2 == 0) {
                                    activityRoster2.aY = false;
                                    activityRoster2.et_RosterCNIC.setVisibility(71);
                                } else {
                                    activityRoster2.aY = false;
                                    activityRoster2.et_RosterCNIC.setVisibility(8);
                                }
                                activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                                button2 = activityRoster2.buttonScanCNIC;
                                i112 = b + 59;
                                a = i112 % 128;
                                if (i112 % 2 != 0) {
                                    button2.setVisibility(16);
                                    button3 = activityRoster2.btn_vald_cnic;
                                    i51 = 100;
                                } else {
                                    button2.setVisibility(8);
                                    button3 = activityRoster2.btn_vald_cnic;
                                }
                                button3.setVisibility(i51);
                                if (!activityRoster2.aX) {
                                    i113 = b + 79;
                                    a = i113 % 128;
                                    if (i113 % 2 != 0) {
                                        activityRoster2.F();
                                        return;
                                    } else {
                                        activityRoster2.F();
                                        int i1311 = 98 / 0;
                                        return;
                                    }
                                }
                            }
                        } else {
                            activityRoster2.rb_afghani_acc.getId();
                            Button button6 = activityRoster2.btn_vald_cnic;
                            int i1317 = a;
                            int i1318 = i1317 & 13;
                            int i1319 = i1318 + ((i1317 ^ 13) | i1318);
                            b = i1319 % 128;
                            int i13110 = i1319 % 2;
                            button6.setVisibility(8);
                            button = activityRoster2.buttonScanCNIC;
                            i31 = a + 3;
                            b = i31 % 128;
                            if (i31 % 2 == 0) {
                                button.setVisibility(8);
                                int i13111 = 86 / 0;
                                if (!(!ax.c(activityRoster2))) {
                                    int i14115 = a;
                                    int i14116 = i14115 & 11;
                                    int i14117 = (i14115 ^ 11) | i14116;
                                    int i14118 = ((i14116 | i14117) << 1) - (i14117 ^ i14116);
                                    b = i14118 % 128;
                                    int i14119 = i14118 % 2;
                                    activityRoster2.btn_vald_cnic.setEnabled(true);
                                }
                            } else {
                                button.setVisibility(8);
                                if (ax.c(activityRoster2)) {
                                    int i141110 = a;
                                    int i141111 = i141110 & 11;
                                    int i141112 = (i141110 ^ 11) | i141111;
                                    int i141113 = ((i141111 | i141112) << 1) - (i141112 ^ i141111);
                                    b = i141113 % 128;
                                    int i141114 = i141113 % 2;
                                    activityRoster2.btn_vald_cnic.setEnabled(true);
                                }
                            }
                            activityRoster2.et_RosterCNIC.setVisibility(8);
                            activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                            i110 = a + 65;
                            b = i110 % 128;
                            if (i110 % 2 == 0) {
                                activityRoster2.por_roster.setVisibility(1);
                            } else {
                                activityRoster2.por_roster.setVisibility(0);
                            }
                            activityRoster2.buttonScanCNIC.setEnabled(false);
                            int i1514 = b + 105;
                            a = i1514 % 128;
                            int i1515 = i1514 % 2;
                            activityRoster2.btn_bio_cnic.setEnabled(false);
                            int i1516 = a;
                            int i1517 = i1516 & 93;
                            int i1518 = -(-((i1516 ^ 93) | i1517));
                            int i1519 = ((i1517 | i1518) << 1) - (i1518 ^ i1517);
                            b = i1519 % 128;
                            int i15110 = i1519 % 2;
                        }
                    } else if (i30 != activityRoster2.rb_afghani_por.getId()) {
                        int i617 = a;
                        int i618 = (((i617 ^ 123) | (i617 & 123)) << 1) - (((~i617) & 123) | (i617 & (-124)));
                        b = i618 % 128;
                        int i619 = i618 % 2;
                        activityRoster2.por_roster.setVisibility(8);
                        int i6110 = a;
                        int i6111 = i6110 & 3;
                        int i6112 = ((i6110 ^ 3) | i6111) << 1;
                        int i6113 = -((i6110 | 3) & (~i6111));
                        int i7110 = (i6112 ^ i6113) + ((i6113 & i6112) << 1);
                        b = i7110 % 128;
                        int i7111 = i7110 % 2;
                        if (i30 == activityRoster2.radioButtonCNICPresent.getId()) {
                            int i7112 = a + 113;
                            b = i7112 % 128;
                            int i7119 = i7112 % 2;
                            activityRoster2.btn_vald_cnic.setVisibility(8);
                            if (ax.c(activityRoster2)) {
                                int i7120 = b;
                                int i7121 = i7120 ^ 37;
                                int i7122 = -(-((i7120 & 37) << 1));
                                i213 = (i7121 & i7122) + (i7122 | i7121);
                                a = i213 % 128;
                                if (i213 % 2 != 0) {
                                    activityRoster2.btn_vald_cnic.setEnabled(false);
                                } else {
                                    activityRoster2.btn_vald_cnic.setEnabled(true);
                                }
                            }
                            activityRoster2.et_RosterCNIC.setVisibility(0);
                            activityRoster2.et_RosterCNICRepeat.setVisibility(0);
                            i114 = a + 105;
                            b = i114 % 128;
                            if (i114 % 2 == 0) {
                                activityRoster2.buttonScanCNIC.setVisibility(92);
                                if (activityRoster2.aZ < 5) {
                                    int i71110 = b;
                                    int i71111 = (((i71110 & (-68)) | ((~i71110) & 67)) - (~(-(-((i71110 & 67) << 1))))) - 1;
                                    a = i71111 % 128;
                                    int i71112 = i71111 % 2;
                                    activityRoster2.btn_bio_cnic.setEnabled(true);
                                } else {
                                    activityRoster2.btn_bio_cnic.setEnabled(false);
                                    int i8115 = b;
                                    int i8116 = i8115 ^ 61;
                                    int i8117 = -(-((i8115 & 61) << 1));
                                    int i8118 = (i8116 & i8117) + (i8117 | i8116);
                                    a = i8118 % 128;
                                    int i8119 = i8118 % 2;
                                }
                            } else {
                                activityRoster2.buttonScanCNIC.setVisibility(8);
                                if (activityRoster2.aZ < 3) {
                                    int i71113 = b;
                                    int i71114 = (((i71113 & (-68)) | ((~i71113) & 67)) - (~(-(-((i71113 & 67) << 1))))) - 1;
                                    a = i71114 % 128;
                                    int i71115 = i71114 % 2;
                                    activityRoster2.btn_bio_cnic.setEnabled(true);
                                } else {
                                    activityRoster2.btn_bio_cnic.setEnabled(false);
                                    int i81110 = b;
                                    int i81111 = i81110 ^ 61;
                                    int i81112 = -(-((i81110 & 61) << 1));
                                    int i81113 = (i81111 & i81112) + (i81112 | i81111);
                                    a = i81113 % 128;
                                    int i81114 = i81113 % 2;
                                }
                            }
                            activityRoster2.buttonScanCNIC.setEnabled(true);
                            if (!activityRoster2.aX) {
                                i212 = a + 1;
                                b = i212 % 128;
                                if (i212 % 2 != 0) {
                                    activityRoster2.F();
                                    obj.hashCode();
                                    throw null;
                                }
                                activityRoster2.F();
                            }
                            ((InputMethodManager) activityRoster2.getSystemService("input_method")).showSoftInput(activityRoster2.et_RosterCNIC, 1);
                            int i9110 = a;
                            int i9111 = i9110 & 89;
                            int i9115 = (((i9110 | 89) & (~i9111)) - (~(-(-(i9111 << 1))))) - 1;
                            b = i9115 % 128;
                            int i9116 = i9115 % 2;
                            i115 = activityRoster2.ac;
                            if (i115 != 1) {
                                int i9117 = a;
                                int i9118 = i9117 ^ 13;
                                int i9119 = -(-((i9117 & 13) << 1));
                                int i9120 = ((i9118 | i9119) << 1) - (i9119 ^ i9118);
                                i210 = i9120 % 128;
                                b = i210;
                                int i921 = i9120 % 2;
                                if (i115 != 2) {
                                    i211 = (-2) - ((((i210 | 108) << 1) - (i210 ^ 108)) ^ (-1));
                                    a = i211 % 128;
                                    if (i211 % 2 == 0) {
                                        boolean z3 = ag.d;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (ag.d) {
                                        if (ag.j == 1) {
                                            i116 = a + 115;
                                            b = i116 % 128;
                                            if (i116 % 2 != 0) {
                                                double d9 = activityRoster2.aU;
                                                obj.hashCode();
                                                throw null;
                                            }
                                            if (activityRoster2.aU >= 18.0d) {
                                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                activityRoster2.aY = false;
                                                int i91110 = b;
                                                int i10111111110 = i91110 & 97;
                                                int i10111111111 = (i91110 | 97) & (~i10111111110);
                                                int i10111111112 = i10111111110 << 1;
                                                i117 = (i10111111111 & i10111111112) + (i10111111111 | i10111111112);
                                                a = i117 % 128;
                                                if (i117 % 2 == 0) {
                                                    throw null;
                                                }
                                                return;
                                            }
                                            int i10111111113 = b + 123;
                                            a = i10111111113 % 128;
                                            int i10111111114 = i10111111113 % 2;
                                            if (activityRoster2.et_RosterCNIC.length() == 15) {
                                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                activityRoster2.aY = false;
                                                int i10111111115 = b;
                                                int i10111111116 = i10111111115 & 73;
                                                int i10111111117 = (i10111111115 | 73) & (~i10111111116);
                                                int i10111111118 = i10111111116 << 1;
                                                int i10111111119 = (i10111111117 & i10111111118) + (i10111111117 | i10111111118);
                                                a = i10111111119 % 128;
                                                int i11111111110 = i10111111119 % 2;
                                                return;
                                            }
                                            int i11111111111 = b;
                                            int i11111111112 = (i11111111111 & (-62)) | ((~i11111111111) & 61);
                                            int i11111111113 = -(-((i11111111111 & 61) << 1));
                                            int i11111111114 = (i11111111112 & i11111111113) + (i11111111113 | i11111111112);
                                            a = i11111111114 % 128;
                                            int i11111111115 = i11111111114 % 2;
                                            checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                            radioButton = activityRoster2.radioButtonFemale;
                                            int i11111111116 = a;
                                            i118 = (i11111111116 & 97) + (i11111111116 | 97);
                                            b = i118 % 128;
                                            if (i118 % 2 != 0) {
                                                radioButton.getId();
                                                obj.hashCode();
                                                throw null;
                                            }
                                            if (checkedRadioButtonId == radioButton.getId()) {
                                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                                activityRoster2.aY = false;
                                                int i11111111117 = b;
                                                int i11111111118 = i11111111117 & 31;
                                                int i11111111119 = i11111111118 + ((i11111111117 ^ 31) | i11111111118);
                                                a = i11111111119 % 128;
                                                int i12111119 = i11111111119 % 2;
                                                return;
                                            }
                                            int i121111110 = a;
                                            int i121111111 = i121111110 & 125;
                                            int i121111112 = (i121111110 ^ 125) | i121111111;
                                            i119 = (i121111111 ^ i121111112) + ((i121111112 & i121111111) << 1);
                                            b = i119 % 128;
                                            if (i119 % 2 != 0) {
                                                activityRoster2.sp_marital_status.getSelectedItemPosition();
                                                throw null;
                                            }
                                            if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                            }
                                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                                            activityRoster2.aY = false;
                                            int i121111113 = b;
                                            int i121111114 = ((i121111113 & 107) - (~(i121111113 | 107))) - 1;
                                            a = i121111114 % 128;
                                            int i121111115 = i121111114 % 2;
                                            return;
                                        }
                                    }
                                } else if (ag.j == 1) {
                                    i116 = a + 115;
                                    b = i116 % 128;
                                    if (i116 % 2 != 0) {
                                        double d10 = activityRoster2.aU;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (activityRoster2.aU >= 18.0d) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i91111 = b;
                                        int i101111111110 = i91111 & 97;
                                        int i101111111111 = (i91111 | 97) & (~i101111111110);
                                        int i101111111112 = i101111111110 << 1;
                                        i117 = (i101111111111 & i101111111112) + (i101111111111 | i101111111112);
                                        a = i117 % 128;
                                        if (i117 % 2 == 0) {
                                            throw null;
                                        }
                                        return;
                                    }
                                    int i101111111113 = b + 123;
                                    a = i101111111113 % 128;
                                    int i101111111114 = i101111111113 % 2;
                                    if (activityRoster2.et_RosterCNIC.length() == 15) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i101111111115 = b;
                                        int i101111111116 = i101111111115 & 73;
                                        int i101111111117 = (i101111111115 | 73) & (~i101111111116);
                                        int i101111111118 = i101111111116 << 1;
                                        int i101111111119 = (i101111111117 & i101111111118) + (i101111111117 | i101111111118);
                                        a = i101111111119 % 128;
                                        int i111111111110 = i101111111119 % 2;
                                        return;
                                    }
                                    int i111111111111 = b;
                                    int i111111111112 = (i111111111111 & (-62)) | ((~i111111111111) & 61);
                                    int i111111111113 = -(-((i111111111111 & 61) << 1));
                                    int i111111111114 = (i111111111112 & i111111111113) + (i111111111113 | i111111111112);
                                    a = i111111111114 % 128;
                                    int i111111111115 = i111111111114 % 2;
                                    checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                    radioButton = activityRoster2.radioButtonFemale;
                                    int i111111111116 = a;
                                    i118 = (i111111111116 & 97) + (i111111111116 | 97);
                                    b = i118 % 128;
                                    if (i118 % 2 != 0) {
                                        radioButton.getId();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (checkedRadioButtonId == radioButton.getId()) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        activityRoster2.aY = false;
                                        int i111111111117 = b;
                                        int i111111111118 = i111111111117 & 31;
                                        int i111111111119 = i111111111118 + ((i111111111117 ^ 31) | i111111111118);
                                        a = i111111111119 % 128;
                                        int i121111116 = i111111111119 % 2;
                                        return;
                                    }
                                    int i121111117 = a;
                                    int i121111118 = i121111117 & 125;
                                    int i121111119 = (i121111117 ^ 125) | i121111118;
                                    i119 = (i121111118 ^ i121111119) + ((i121111119 & i121111118) << 1);
                                    b = i119 % 128;
                                    if (i119 % 2 != 0) {
                                        activityRoster2.sp_marital_status.getSelectedItemPosition();
                                        throw null;
                                    }
                                    if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                    }
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i1211111110 = b;
                                    int i1211111111 = ((i1211111110 & 107) - (~(i1211111110 | 107))) - 1;
                                    a = i1211111111 % 128;
                                    int i1211111112 = i1211111111 % 2;
                                    return;
                                }
                            } else if (ag.j == 1) {
                                i116 = a + 115;
                                b = i116 % 128;
                                if (i116 % 2 != 0) {
                                    double d11 = activityRoster2.aU;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (activityRoster2.aU >= 18.0d) {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i91112 = b;
                                    int i1011111111110 = i91112 & 97;
                                    int i1011111111111 = (i91112 | 97) & (~i1011111111110);
                                    int i1011111111112 = i1011111111110 << 1;
                                    i117 = (i1011111111111 & i1011111111112) + (i1011111111111 | i1011111111112);
                                    a = i117 % 128;
                                    if (i117 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                int i1011111111113 = b + 123;
                                a = i1011111111113 % 128;
                                int i1011111111114 = i1011111111113 % 2;
                                if (activityRoster2.et_RosterCNIC.length() == 15) {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i1011111111115 = b;
                                    int i1011111111116 = i1011111111115 & 73;
                                    int i1011111111117 = (i1011111111115 | 73) & (~i1011111111116);
                                    int i1011111111118 = i1011111111116 << 1;
                                    int i1011111111119 = (i1011111111117 & i1011111111118) + (i1011111111117 | i1011111111118);
                                    a = i1011111111119 % 128;
                                    int i1111111111110 = i1011111111119 % 2;
                                    return;
                                }
                                int i1111111111111 = b;
                                int i1111111111112 = (i1111111111111 & (-62)) | ((~i1111111111111) & 61);
                                int i1111111111113 = -(-((i1111111111111 & 61) << 1));
                                int i1111111111114 = (i1111111111112 & i1111111111113) + (i1111111111113 | i1111111111112);
                                a = i1111111111114 % 128;
                                int i1111111111115 = i1111111111114 % 2;
                                checkedRadioButtonId = activityRoster2.radioGroupGender.getCheckedRadioButtonId();
                                radioButton = activityRoster2.radioButtonFemale;
                                int i1111111111116 = a;
                                i118 = (i1111111111116 & 97) + (i1111111111116 | 97);
                                b = i118 % 128;
                                if (i118 % 2 != 0) {
                                    radioButton.getId();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (checkedRadioButtonId == radioButton.getId()) {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    activityRoster2.aY = false;
                                    int i1111111111117 = b;
                                    int i1111111111118 = i1111111111117 & 31;
                                    int i1111111111119 = i1111111111118 + ((i1111111111117 ^ 31) | i1111111111118);
                                    a = i1111111111119 % 128;
                                    int i1211111113 = i1111111111119 % 2;
                                    return;
                                }
                                int i1211111114 = a;
                                int i1211111115 = i1211111114 & 125;
                                int i1211111116 = (i1211111114 ^ 125) | i1211111115;
                                i119 = (i1211111115 ^ i1211111116) + ((i1211111116 & i1211111115) << 1);
                                b = i119 % 128;
                                if (i119 % 2 != 0) {
                                    activityRoster2.sp_marital_status.getSelectedItemPosition();
                                    throw null;
                                }
                                if (activityRoster2.sp_marital_status.getSelectedItemPosition() != 0) {
                                }
                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                activityRoster2.aY = false;
                                int i1211111117 = b;
                                int i1211111118 = ((i1211111117 & 107) - (~(i1211111117 | 107))) - 1;
                                a = i1211111118 % 128;
                                int i1211111119 = i1211111118 % 2;
                                return;
                            }
                        } else {
                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                            int i1312 = a;
                            i111 = (((i1312 ^ 77) | (i1312 & 77)) << 1) - (((~i1312) & 77) | (i1312 & (-78)));
                            b = i111 % 128;
                            if (i111 % 2 == 0) {
                                activityRoster2.aY = false;
                                activityRoster2.et_RosterCNIC.setVisibility(71);
                            } else {
                                activityRoster2.aY = false;
                                activityRoster2.et_RosterCNIC.setVisibility(8);
                            }
                            activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                            button2 = activityRoster2.buttonScanCNIC;
                            i112 = b + 59;
                            a = i112 % 128;
                            if (i112 % 2 != 0) {
                                button2.setVisibility(16);
                                button3 = activityRoster2.btn_vald_cnic;
                                i51 = 100;
                            } else {
                                button2.setVisibility(8);
                                button3 = activityRoster2.btn_vald_cnic;
                            }
                            button3.setVisibility(i51);
                            if (!activityRoster2.aX) {
                                i113 = b + 79;
                                a = i113 % 128;
                                if (i113 % 2 != 0) {
                                    activityRoster2.F();
                                    return;
                                } else {
                                    activityRoster2.F();
                                    int i1313 = 98 / 0;
                                    return;
                                }
                            }
                        }
                    } else {
                        activityRoster2.rb_afghani_acc.getId();
                        Button button7 = activityRoster2.btn_vald_cnic;
                        int i13112 = a;
                        int i13113 = i13112 & 13;
                        int i13114 = i13113 + ((i13112 ^ 13) | i13113);
                        b = i13114 % 128;
                        int i13115 = i13114 % 2;
                        button7.setVisibility(8);
                        button = activityRoster2.buttonScanCNIC;
                        i31 = a + 3;
                        b = i31 % 128;
                        if (i31 % 2 == 0) {
                            button.setVisibility(8);
                            int i13116 = 86 / 0;
                            if (!(!ax.c(activityRoster2))) {
                                int i141115 = a;
                                int i141116 = i141115 & 11;
                                int i141117 = (i141115 ^ 11) | i141116;
                                int i141118 = ((i141116 | i141117) << 1) - (i141117 ^ i141116);
                                b = i141118 % 128;
                                int i141119 = i141118 % 2;
                                activityRoster2.btn_vald_cnic.setEnabled(true);
                            }
                        } else {
                            button.setVisibility(8);
                            if (ax.c(activityRoster2)) {
                                int i1411110 = a;
                                int i1411111 = i1411110 & 11;
                                int i1411112 = (i1411110 ^ 11) | i1411111;
                                int i1411113 = ((i1411111 | i1411112) << 1) - (i1411112 ^ i1411111);
                                b = i1411113 % 128;
                                int i1411114 = i1411113 % 2;
                                activityRoster2.btn_vald_cnic.setEnabled(true);
                            }
                        }
                        activityRoster2.et_RosterCNIC.setVisibility(8);
                        activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                        i110 = a + 65;
                        b = i110 % 128;
                        if (i110 % 2 == 0) {
                            activityRoster2.por_roster.setVisibility(1);
                        } else {
                            activityRoster2.por_roster.setVisibility(0);
                        }
                        activityRoster2.buttonScanCNIC.setEnabled(false);
                        int i15111 = b + 105;
                        a = i15111 % 128;
                        int i15112 = i15111 % 2;
                        activityRoster2.btn_bio_cnic.setEnabled(false);
                        int i15113 = a;
                        int i15114 = i15113 & 93;
                        int i15115 = -(-((i15113 ^ 93) | i15114));
                        int i15116 = ((i15114 | i15115) << 1) - (i15115 ^ i15114);
                        b = i15116 % 128;
                        int i15117 = i15116 % 2;
                    }
                } else {
                    activityRoster2.rb_afghani_acc.getId();
                    Button button8 = activityRoster2.btn_vald_cnic;
                    int i13117 = a;
                    int i13118 = i13117 & 13;
                    int i13119 = i13118 + ((i13117 ^ 13) | i13118);
                    b = i13119 % 128;
                    int i131110 = i13119 % 2;
                    button8.setVisibility(8);
                    button = activityRoster2.buttonScanCNIC;
                    i31 = a + 3;
                    b = i31 % 128;
                    if (i31 % 2 == 0) {
                        button.setVisibility(8);
                        int i131111 = 86 / 0;
                        if (!(!ax.c(activityRoster2))) {
                            int i1411115 = a;
                            int i1411116 = i1411115 & 11;
                            int i1411117 = (i1411115 ^ 11) | i1411116;
                            int i1411118 = ((i1411116 | i1411117) << 1) - (i1411117 ^ i1411116);
                            b = i1411118 % 128;
                            int i1411119 = i1411118 % 2;
                            activityRoster2.btn_vald_cnic.setEnabled(true);
                        }
                    } else {
                        button.setVisibility(8);
                        if (ax.c(activityRoster2)) {
                            int i14111110 = a;
                            int i14111111 = i14111110 & 11;
                            int i14111112 = (i14111110 ^ 11) | i14111111;
                            int i14111113 = ((i14111111 | i14111112) << 1) - (i14111112 ^ i14111111);
                            b = i14111113 % 128;
                            int i14111114 = i14111113 % 2;
                            activityRoster2.btn_vald_cnic.setEnabled(true);
                        }
                    }
                    activityRoster2.et_RosterCNIC.setVisibility(8);
                    activityRoster2.et_RosterCNICRepeat.setVisibility(8);
                    i110 = a + 65;
                    b = i110 % 128;
                    if (i110 % 2 == 0) {
                        activityRoster2.por_roster.setVisibility(1);
                    } else {
                        activityRoster2.por_roster.setVisibility(0);
                    }
                    activityRoster2.buttonScanCNIC.setEnabled(false);
                    int i15118 = b + 105;
                    a = i15118 % 128;
                    int i15119 = i15118 % 2;
                    activityRoster2.btn_bio_cnic.setEnabled(false);
                    int i151110 = a;
                    int i151111 = i151110 & 93;
                    int i151112 = -(-((i151110 ^ 93) | i151111));
                    int i151113 = ((i151111 | i151112) << 1) - (i151112 ^ i151111);
                    b = i151113 % 128;
                    int i151114 = i151113 % 2;
                }
                int i160 = a;
                int i161 = (i160 ^ 35) + ((i160 & 35) << 1);
                b = i161 % 128;
                if (i161 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        this.spinnerYear.setOnItemSelectedListener(this.bF);
        this.spinnerMonth.setOnItemSelectedListener(this.bx);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0779  */
    /* JADX WARN: Code duplicated, block: B:34:0x027b  */
    /* JADX WARN: Code duplicated, block: B:56:0x046f  */
    public void S() throws ParseException {
        double dConvert;
        boolean z;
        int i = 2 % 2;
        AppDatabase appDatabaseL = AppDatabase.l(getApplicationContext());
        ivas.gov.bisp.enumeration.p096p.h hVarM = appDatabaseL.m();
        Object[] objArr = new Object[1];
        a(TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 12, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 16917), getApplicationInfo().targetSdkVersion + 890, objArr);
        this.bm = new ArrayList<>(hVarM.ah(((String) objArr[0]).intern()));
        ivas.gov.bisp.enumeration.p096p.h hVarM2 = appDatabaseL.m();
        Object[] objArr2 = new Object[1];
        a(KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 19, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 33339), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 933, objArr2);
        this.bn = new ArrayList<>(hVarM2.ah(((String) objArr2[0]).intern()));
        ivas.gov.bisp.enumeration.p096p.h hVarM3 = appDatabaseL.m();
        Object[] objArr3 = new Object[1];
        a(20 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 948, objArr3);
        this.bp = new ArrayList<>(hVarM3.ah(((String) objArr3[0]).intern()));
        ivas.gov.bisp.enumeration.p096p.h hVarM4 = appDatabaseL.m();
        Object[] objArr4 = new Object[1];
        a(getPackageName().length() - 6, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion + 942, objArr4);
        this.bq = new ArrayList<>(hVarM4.ah(((String) objArr4[0]).intern()));
        ivas.gov.bisp.enumeration.p096p.h hVarM5 = appDatabaseL.m();
        int i2 = 8;
        Object[] objArr5 = new Object[1];
        a(15 - (Process.myTid() >> 22), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 992 - (ViewConfiguration.getScrollBarSize() >> 8), objArr5);
        this.aH = new ArrayList<>(hVarM5.ah(((String) objArr5[0]).intern()));
        ivas.gov.bisp.enumeration.p096p.h hVarM6 = appDatabaseL.m();
        Object[] objArr6 = new Object[1];
        a(getApplicationInfo().targetSdkVersion - 16, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 1008, objArr6);
        this.bu = new ArrayList<>(hVarM6.ah(((String) objArr6[0]).intern()));
        if (this.bp == null) {
            this.bp = new ArrayList<>();
        }
        if (this.bq == null) {
            this.bq = new ArrayList<>();
        }
        if (this.aH == null) {
            this.aH = new ArrayList<>();
        }
        if (this.bu == null) {
            this.bu = new ArrayList<>();
        }
        if (this.bE == null) {
            this.bE = this.tv_dob.getText().toString();
        }
        Object[] objArr7 = new Object[1];
        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 6, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 115), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 233, objArr7);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr7[0]).intern(), Locale.getDefault());
        String str = this.bE;
        if (str == null || str.trim().isEmpty()) {
            dConvert = 0.0d;
        } else {
            try {
                dConvert = TimeUnit.DAYS.convert(System.currentTimeMillis() - simpleDateFormat.parse(this.bE).getTime(), TimeUnit.MILLISECONDS);
            } catch (ParseException unused) {
                dConvert = 0.0d;
            }
        }
        String str2 = this.bk.gender;
        if (dConvert <= this.bw * 365) {
            z = true;
        } else {
            if (str2 != null) {
                Object[] objArr8 = new Object[1];
                a(6 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 23903), 352 - View.getDefaultSize(0, 0), objArr8);
                if (str2.equalsIgnoreCase(((String) objArr8[0]).intern()) && dConvert >= 3285.0d && dConvert <= this.bI * 365) {
                    z = true;
                }
            }
            z = false;
        }
        boolean z2 = dConvert <= ((double) (this.bw * 365));
        this.bJ = (LinearLayout) findViewById(R.id.parentLayoutHeightWeight);
        this.bz = (Spinner) findViewById(R.id.spinnerHeightOfChild);
        this.bK = (Spinner) findViewById(R.id.spinnerWeightOfChild);
        this.llVaccinationDynamic = (LinearLayout) findViewById(R.id.llVaccinationDynamic);
        View viewFindViewById = findViewById(R.id.layout_immunization_header);
        this.bj = (Spinner) viewFindViewById.findViewById(R.id.spinnerImmunized);
        this.bg = (Spinner) viewFindViewById.findViewById(R.id.spinnerReason);
        this.bl = (TextView) viewFindViewById.findViewById(R.id.tvReasonLabel);
        if (!z2) {
            this.bJ.setVisibility(8);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, L(this.bu));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.bK.setAdapter((SpinnerAdapter) arrayAdapter);
        this.bK.setOnItemSelectedListener(new o0ooOOo());
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, L(this.aH));
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.bz.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.bz.setOnItemSelectedListener(new o0OOO0o());
        viewFindViewById.setVisibility(0);
        if (!z) {
            this.llVaccinationDynamic.setVisibility(8);
            viewFindViewById.setVisibility(8);
        }
        this.llVaccinationDynamic.setVisibility(0);
        this.llVaccinationDynamic.removeAllViews();
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, L(this.bm));
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.bj.setAdapter((SpinnerAdapter) arrayAdapter3);
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, L(this.bq));
        arrayAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.bg.setAdapter((SpinnerAdapter) arrayAdapter4);
        this.bj.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (getResources().getDisplayMetrics().density * 50.0f)));
        this.bj.setBackgroundResource(R.drawable.spinner_bg);
        this.bg.setBackgroundResource(R.drawable.spinner_bg);
        this.bl.setVisibility(8);
        this.bg.setVisibility(8);
        this.llVaccinationDynamic.setVisibility(8);
        this.bj.setOnItemSelectedListener(new o0Oo0oo(dConvert));
        this.tv_dob.setText(this.bk.date_of_birth);
        this.et_MemberName.setText(this.bk.name_of_member);
        Intent intent = getIntent();
        Object[] objArr9 = new Object[1];
        a(14 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (char) (37113 - Color.argb(0, 0, 0, 0)), getPackageName().codePointAt(18) + 74, objArr9);
        int intExtra = intent.getIntExtra(((String) objArr9[0]).intern(), -1);
        this.aW = intExtra;
        if (intExtra != -1) {
            this.btn_bio_cnic.setVisibility(0);
            String string = this.tv_dob.getText().toString();
            Object[] objArr10 = new Object[1];
            a(View.resolveSize(0, 0) + 10, (char) (getPackageName().codePointAt(8) - 46), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 232, objArr10);
            try {
                Date date = new SimpleDateFormat(((String) objArr10[0]).intern()).parse(string);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(date.getTime());
                this.aU = H(calendar.get(5), calendar.get(2), calendar.get(1), true);
            } catch (ParseException unused2) {
            }
            P(this.bk.age);
            this.radioGroupCalendar.check(R.id.rb_calendar_yes);
            if (this.bk.age >= 4.0d) {
                this.sp_attended_school.setVisibility(0);
                int i3 = this.bk.attended_school;
                if (i3 == 0) {
                    this.sp_attended_school.setVisibility(8);
                    this.sp_highest_education.setVisibility(8);
                } else if (i3 != 25) {
                    this.sp_highest_education.setVisibility(0);
                }
            } else {
                this.sp_attended_school.setVisibility(8);
                this.sp_highest_education.setVisibility(8);
            }
            this.tv_dob.setText(this.bk.date_of_birth);
            this.et_mobile_number.setText(this.bk.mobile_no);
            Roster roster = this.bk;
            this.bW = roster.date_of_birth_var;
            if (roster.cnic_valid_name.equals(BuildConfig.FLAVOR)) {
                this.ll_nadra_name.setVisibility(8);
            } else {
                this.ll_nadra_name.setVisibility(0);
                this.et_MemberName.setText(this.bk.name_of_member);
                this.vald_name_txt_view.setText(this.bk.cnic_valid_name);
            }
            String str3 = this.bk.cnic_valid_english_name;
            if (str3 != null && !str3.equals(BuildConfig.FLAVOR)) {
                String str4 = this.bk.cnic_valid_english_name;
                Object[] objArr11 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 45, (char) (44395 - (ViewConfiguration.getEdgeSlop() >> 16)), getApplicationInfo().targetSdkVersion + 991, objArr11);
                if (!str4.equals(((String) objArr11[0]).intern())) {
                    Roster roster2 = this.bk;
                    String str5 = roster2.cnic_valid_english_name;
                    roster2.name_of_member = str5;
                    this.et_MemberName.setText(str5);
                    this.et_MemberName.setEnabled(false);
                    this.et_MemberName.setFocusable(false);
                }
            }
            if (this.bk.date_of_birth.equals(BuildConfig.FLAVOR)) {
                this.radioGroupCalendar.setEnabled(true);
                this.radioButtonCalendarYes.setEnabled(true);
                this.radioButtonCalendarNo.setEnabled(true);
                this.spinnerYear.setEnabled(true);
                this.spinnerMonth.setEnabled(true);
            } else {
                this.tv_dob.setText(this.bk.date_of_birth);
                this.radioGroupCalendar.setEnabled(false);
                this.radioButtonCalendarYes.setEnabled(false);
                this.radioButtonCalendarNo.setEnabled(false);
                this.spinnerYear.setEnabled(false);
                this.spinnerMonth.setEnabled(false);
                String string2 = this.tv_dob.getText().toString();
                Object[] objArr12 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 26, (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 232 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr12);
                try {
                    Date date2 = new SimpleDateFormat(((String) objArr12[0]).intern()).parse(string2);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(date2.getTime());
                    this.aU = H(calendar2.get(5), calendar2.get(2), calendar2.get(1), true);
                } catch (ParseException unused3) {
                }
            }
            String str6 = this.bk.gender;
            Object[] objArr13 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 27, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 47904), getPackageName().codePointAt(22) + 243, objArr13);
            if (str6.equalsIgnoreCase(((String) objArr13[0]).intern())) {
                this.radioButtonMale.setChecked(true);
                this.radioButtonFemale.setChecked(false);
                this.radioButtonTrans.setChecked(false);
                this.radioGroupGender.setEnabled(false);
                this.radioButtonTrans.setEnabled(false);
                this.radioButtonFemale.setEnabled(false);
                this.radioButtonMale.setEnabled(false);
            } else {
                String str7 = this.bk.gender;
                Object[] objArr14 = new Object[1];
                a(5 - ImageFormat.getBitsPerPixel(0), (char) (getPackageName().length() + 23878), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 303, objArr14);
                if (str7.equalsIgnoreCase(((String) objArr14[0]).intern())) {
                    this.radioButtonMale.setChecked(false);
                    this.radioButtonFemale.setChecked(true);
                    this.radioButtonTrans.setChecked(false);
                    this.radioGroupGender.setEnabled(false);
                    this.radioButtonTrans.setEnabled(false);
                    this.radioButtonFemale.setEnabled(false);
                    this.radioButtonMale.setEnabled(false);
                } else {
                    String str8 = this.bk.gender;
                    Object[] objArr15 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 20, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), getApplicationInfo().targetSdkVersion + 327, objArr15);
                    if (str8.equalsIgnoreCase(((String) objArr15[0]).intern())) {
                        this.radioButtonMale.setChecked(false);
                        this.radioButtonFemale.setChecked(false);
                        this.radioButtonTrans.setChecked(true);
                        this.radioGroupGender.setEnabled(false);
                        this.radioButtonTrans.setEnabled(false);
                        this.radioButtonFemale.setEnabled(false);
                        this.radioButtonMale.setEnabled(false);
                    } else {
                        String str9 = this.bk.gender;
                        Object[] objArr16 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 25, (char) (getPackageName().codePointAt(19) - 114), 369 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr16);
                        if (str9.equalsIgnoreCase(((String) objArr16[0]).intern())) {
                            this.radioButtonMale.setChecked(false);
                            this.radioButtonFemale.setChecked(false);
                            this.radioButtonTrans.setChecked(true);
                            this.radioGroupGender.setEnabled(false);
                            this.radioButtonTrans.setEnabled(false);
                            this.radioButtonFemale.setEnabled(false);
                            this.radioButtonMale.setEnabled(false);
                        } else {
                            this.radioGroupGender.setEnabled(true);
                            this.radioButtonTrans.setEnabled(true);
                            this.radioButtonFemale.setEnabled(true);
                            this.radioButtonMale.setEnabled(true);
                        }
                    }
                }
            }
            int i4 = this.bk.marital_status;
            if (i4 != 200) {
                int i5 = p;
                int i6 = i5 + 33;
                q = i6 % 128;
                if (i6 % 2 != 0 ? i4 == 201 : i4 == 1822) {
                    Object[] objArr17 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 17, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), 397 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr17);
                    new au(this, ((String) objArr17[0]).intern(), getResources().getString(R.string.marital_status), this.sp_marital_status, new o0OO00O()).execute(new Void[0]);
                } else if (i4 != 202) {
                    int i7 = i5 + 111;
                    q = i7 % 128;
                    if (i7 % 2 != 0 ? i4 == 203 : i4 == 2462) {
                        Object[] objArr18 = new Object[1];
                        a(getApplicationInfo().targetSdkVersion - 17, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), 397 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr18);
                        new au(this, ((String) objArr18[0]).intern(), getResources().getString(R.string.marital_status), this.sp_marital_status, new o0OO00O()).execute(new Void[0]);
                    } else {
                        this.sp_marital_status.setEnabled(true);
                    }
                } else {
                    Object[] objArr19 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 17, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), 397 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr19);
                    new au(this, ((String) objArr19[0]).intern(), getResources().getString(R.string.marital_status), this.sp_marital_status, new o0OO00O()).execute(new Void[0]);
                }
            } else {
                Object[] objArr110 = new Object[1];
                a(getApplicationInfo().targetSdkVersion - 17, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), 397 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr110);
                new au(this, ((String) objArr110[0]).intern(), getResources().getString(R.string.marital_status), this.sp_marital_status, new o0OO00O()).execute(new Void[0]);
            }
            Object[] objArr20 = new Object[1];
            a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, (char) (getApplicationInfo().targetSdkVersion + 30201), getPackageName().codePointAt(3) + 265, objArr20);
            new au(this, ((String) objArr20[0]).intern(), getResources().getString(R.string.disablity_status), this.sp_disability, new oo0o0Oo()).execute(new Void[0]);
            if (!this.bk.cnic.equals(BuildConfig.FLAVOR)) {
                String strB = ag.b(this.bk.cnic);
                this.et_RosterCNIC.setText(strB);
                this.et_RosterCNICRepeat.setText(strB);
            }
            if (this.aM != null) {
                int i8 = 0;
                while (true) {
                    if (i8 >= this.aM.size()) {
                        i8 = 0;
                        break;
                    }
                    int i9 = q + 119;
                    p = i9 % 128;
                    if (i9 % 2 != 0) {
                        this.aM.get(i8).getOptionId();
                        int i10 = this.bk.relation_to_household_id;
                        throw null;
                    }
                    if (this.aM.get(i8).getOptionId() == this.bk.relation_to_household_id) {
                        break;
                    } else {
                        i8++;
                    }
                }
                this.sp_relation_to_household.setSelection(i8);
            }
            CheckBox checkBox = this.checkBoxBispBenif;
            String str10 = this.bk.isBispBenif;
            Object[] objArr21 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 28, (char) (getApplicationInfo().targetSdkVersion - 31), getApplicationInfo().targetSdkVersion + 809, objArr21);
            checkBox.setChecked(str10.equals(((String) objArr21[0]).intern()));
            Roster roster3 = this.bk;
            int i11 = roster3.cnicOption;
            if (i11 == 0) {
                this.radioButtonCNICNotMade.setChecked(true);
                int i12 = q + 7;
                p = i12 % 128;
                int i13 = i12 % 2;
            } else if (i11 == 1) {
                this.radioButtonCNICAbsent.setChecked(true);
            } else if (i11 == 2) {
                this.et_RosterCNIC.setText(roster3.cnic);
                this.et_RosterCNICRepeat.setText(this.bk.cnicRepeat);
                this.radioButtonCNICPresent.setChecked(true);
                this.bH = this.bk.cnic_valid.booleanValue();
            } else if (i11 == 3) {
                this.rb_afghani_acc.setChecked(true);
                this.por_roster.setVisibility(0);
                this.btn_vald_cnic.setVisibility(i2);
                this.buttonScanCNIC.setVisibility(i2);
                this.por_roster.setText(this.bk.cnic);
                this.aK = this.bk.cnic_valid.booleanValue();
                if (ax.c(this)) {
                    int i14 = p + 99;
                    q = i14 % 128;
                    int i15 = i14 % 2;
                    this.btn_vald_cnic.setEnabled(true);
                }
                this.et_RosterCNIC.setVisibility(i2);
                this.et_RosterCNICRepeat.setVisibility(i2);
                this.buttonScanCNIC.setEnabled(false);
                this.btn_bio_cnic.setEnabled(false);
            } else if (i11 == 4) {
                this.rb_afghani_por.setChecked(true);
                this.por_roster.setVisibility(0);
                this.btn_vald_cnic.setVisibility(i2);
                this.buttonScanCNIC.setVisibility(i2);
                this.por_roster.setText(this.bk.cnic);
                this.aK = this.bk.cnic_valid.booleanValue();
                if (ax.c(this)) {
                    int i16 = p + 113;
                    q = i16 % 128;
                    int i17 = i16 % 2;
                    this.btn_vald_cnic.setEnabled(true);
                }
                this.et_RosterCNIC.setVisibility(i2);
                this.et_RosterCNICRepeat.setVisibility(i2);
                this.buttonScanCNIC.setEnabled(false);
                this.btn_bio_cnic.setEnabled(false);
            }
            this.et_RosterBForm.setText(this.bk.bform);
            this.et_RosterBFormRepeat.setText(this.bk.bformRepeat);
            Object[] objArr22 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 27, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 37), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 407, objArr22);
            new au(this, ((String) objArr22[0]).intern(), getResources().getString(R.string.chronic_disease), this.sp_chronic_disease, new OooO00o()).execute(new Void[0]);
            int i18 = this.bk.language;
            if (i18 == 0) {
                this.radioButtonLanguage_no.setChecked(true);
                this.radioButtonLanguage_yes.setChecked(false);
            } else if (i18 == 1) {
                this.radioButtonLanguage_no.setChecked(false);
                this.radioButtonLanguage_yes.setChecked(true);
            }
            if (this.sp_attended_school.getVisibility() == 0) {
                int i19 = p + 25;
                q = i19 % 128;
                int i20 = i19 % 2;
                int i21 = 0;
                while (true) {
                    if (i21 >= this.aP.size()) {
                        i21 = 0;
                        break;
                    } else if (this.aP.get(i21).getOptionId() == this.bk.attended_school) {
                        break;
                    } else {
                        i21++;
                    }
                }
                this.sp_attended_school.setSelection(i21);
            }
            Object[] objArr23 = new Object[1];
            a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, (char) (getPackageName().length() + 14157), 1026 - ExpandableListView.getPackedPositionType(0L), objArr23);
            new au(this, ((String) objArr23[0]).intern(), getResources().getString(R.string.work_Activity), this.sp_work_activity, new OooO0O0()).execute(new Void[0]);
            double d = this.bk.hours_worked;
            if (d != 0.0d) {
                this.et_hoursWorked.setText(String.valueOf((int) d));
            }
            Object[] objArr24 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 13, (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 438, objArr24);
            new au(this, ((String) objArr24[0]).intern(), getResources().getString(R.string.employment_status), this.sp_employment_status, new OooO0OO()).execute(new Void[0]);
            int i22 = this.ac;
            if ((i22 == 1 || i22 == 2 || ag.d) && this.bk.relation_to_household_id == 186) {
                int i23 = q + 5;
                p = i23 % 128;
                int i24 = i23 % 2;
                this.et_MemberName.setEnabled(true);
                this.sp_relation_to_household.setEnabled(true);
            }
            this.spinnerYear.setEnabled(false);
            this.spinnerMonth.setEnabled(false);
            this.spinnerMonth.setSelection(this.bk.age_month, false);
            this.spinnerYear.setSelection(this.bk.age_year, false);
            if (this.radioGroupCalendar.getCheckedRadioButtonId() == this.radioButtonCalendarNo.getId()) {
                this.spinnerYear.setEnabled(true);
                this.spinnerMonth.setEnabled(true);
            }
            Roster roster4 = this.bk;
            this.bY = roster4.cnic_valid_name;
            this.bZ = roster4.cnic_valid_father_Name;
            this.ca = roster4.cnic_valid_dob;
            this.bU = roster4.cnic_valid_gender;
            this.bV = roster4.cnic_valid_current_address;
            this.bT = roster4.cnic_valid_permanent_address;
            this.cc = roster4.cnic_valid_identification_mark;
            this.bS = roster4.cnic_valid_religion;
            if (roster4.cnic_valid.booleanValue()) {
                if (this.aU != 0.0d) {
                    int i25 = 0;
                    while (i25 < this.radioGroupGender.getChildCount()) {
                        int i26 = p + 91;
                        q = i26 % 128;
                        i25 = i26 % 2 == 0 ? ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupGender, i25, true, i25, 1) : ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupGender, i25, false, i25, 1);
                    }
                    int i27 = 0;
                    while (i27 < this.radioGroupCalendar.getChildCount()) {
                        i27 = ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupCalendar, i27, false, i27, 1);
                    }
                }
                this.radioButtonCalendarYes.setChecked(true);
                this.tv_dob.setEnabled(false);
                this.spinnerYear.setEnabled(false);
                this.spinnerMonth.setEnabled(false);
                this.be = true;
            }
        } else {
            i2 = 8;
        }
        if (this.aX) {
            if (this.bk.banks_name.equals(BuildConfig.FLAVOR)) {
                this.ll_bank_info.setVisibility(i2);
                this.rb_yes_bank.setChecked(false);
                this.rb_no_bank.setChecked(true);
                return;
            }
            int i28 = p + 33;
            q = i28 % 128;
            int i29 = i28 % 2;
            this.ll_bank_info.setVisibility(0);
            this.rb_yes_bank.setChecked(true);
            this.rb_no_bank.setChecked(false);
            if (!this.bk.bank_address.equals(BuildConfig.FLAVOR)) {
                this.et_easypaisa_number.setText(this.bk.bank_address);
            }
            if (!this.bk.account_title.equals(BuildConfig.FLAVOR)) {
                this.et_account_title.setText(this.bk.account_title);
            }
            if (this.bk.account_number.equals(BuildConfig.FLAVOR)) {
                return;
            }
            this.et_account_number.setText(this.bk.account_number);
        }
    }

    public void Q() {
        int i;
        int i2;
        int i3;
        String strIntern;
        int i4 = 2 % 2;
        Roster roster = new Roster();
        if (!this.bi) {
            C0104p c0104pC = C0104p.c();
            AppCompatActivity appCompatActivity = this.ae;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 5, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 760, objArr);
            String strIntern2 = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(71 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (getApplicationInfo().targetSdkVersion + 26274), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 769, objArr2);
            c0104pC.e(appCompatActivity, strIntern2, ((String) objArr2[0]).intern(), new DialogInterfaceOnClickListenerC0119a(this, 2), false);
            return;
        }
        roster.name_of_member = this.et_MemberName.getText().toString();
        roster.urdu_name_of_member = this.vald_name_txt_view.getText().toString();
        boolean z = this.aK;
        if (!z) {
            z = this.bH;
        }
        roster.cnic_valid = Boolean.valueOf(z);
        roster.cnic_valid_name = this.bY;
        roster.cnic_valid_father_Name = this.bZ;
        roster.cnic_valid_dob = this.ca;
        roster.cnic_valid_gender = this.bU;
        roster.cnic_valid_current_address = this.bV;
        roster.cnic_valid_permanent_address = this.bT;
        roster.cnic_valid_identification_mark = this.cc;
        roster.cnic_valid_religion = this.bS;
        roster.mobile_network_name = this.sp_networks.getSelectedItem().toString();
        roster.mobile_no = this.et_mobile_number.getText().toString();
        if (this.rg_bank_info.getCheckedRadioButtonId() != this.rg_bank_info.getChildAt(1).getId()) {
            roster.banks_name = this.sp_banks.getSelectedItem().toString();
            roster.branch_code = 0;
            roster.bank_address = this.et_easypaisa_number.getText().toString();
            roster.account_title = this.et_account_title.getText().toString();
            roster.account_number = this.et_account_number.getText().toString();
        }
        roster.radioGroupCalendarId = this.radioGroupCalendar.getCheckedRadioButtonId();
        if (this.sp_relation_to_household.getSelectedItemPosition() != 0) {
            roster.relation_to_household_id = this.aM.get(this.sp_relation_to_household.getSelectedItemPosition()).getOptionId();
            roster.relation_to_household_name = this.aM.get(this.sp_relation_to_household.getSelectedItemPosition()).getOption();
            if (this.aX && this.bk.relation_to_household_id == 186) {
                int i5 = p + 67;
                q = i5 % 128;
                int i6 = i5 % 2;
                ag.g = false;
            }
            if (this.aM.get(this.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 186) {
                ag.g = true;
            }
        } else {
            roster.relation_to_household_id = 0;
            roster.relation_to_household_name = BuildConfig.FLAVOR;
            if (this.aX && this.bk.relation_to_household_id == 186) {
                ag.g = false;
            }
        }
        roster.date_of_birth = this.tv_dob.getText().toString();
        roster.date_of_birth_var = this.bW;
        roster.age_month = this.spinnerMonth.getSelectedItemPosition();
        roster.age_year = this.spinnerYear.getSelectedItemPosition();
        if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonMale.getId()) {
            int i7 = q + 87;
            p = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr3 = new Object[1];
            a(getPackageName().length() - 21, (char) (getPackageName().length() + 47883), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 344, objArr3);
            roster.gender = ((String) objArr3[0]).intern();
        } else if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonFemale.getId()) {
            Object[] objArr4 = new Object[1];
            a(ExpandableListView.getPackedPositionType(0L) + 6, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 23903), 351 - ImageFormat.getBitsPerPixel(0), objArr4);
            roster.gender = ((String) objArr4[0]).intern();
        } else if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonTrans.getId()) {
            Object[] objArr5 = new Object[1];
            a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), 358 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
            roster.gender = ((String) objArr5[0]).intern();
        } else {
            roster.gender = BuildConfig.FLAVOR;
        }
        if (this.sp_marital_status.getSelectedItemPosition() != 0) {
            int i9 = q + 63;
            p = i9 % 128;
            int i10 = i9 % 2;
            roster.marital_status = this.aJ.get(this.sp_marital_status.getSelectedItemPosition()).getOptionId();
            roster.merital_status_name = this.aJ.get(this.sp_marital_status.getSelectedItemPosition()).getOption();
        }
        int i11 = this.ac;
        if (((i11 == 1 || i11 == 2 || !(!ag.d)) && ag.j == 1 && this.aY) || this.aY) {
            if (this.checkBoxBispBenif.isChecked()) {
                Object[] objArr6 = new Object[1];
                a(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 3, (char) (getApplicationInfo().targetSdkVersion - 31), 839 - ImageFormat.getBitsPerPixel(0), objArr6);
                strIntern = ((String) objArr6[0]).intern();
            } else {
                Object[] objArr7 = new Object[1];
                a(2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 37), AndroidCharacter.getMirror('0') + 795, objArr7);
                strIntern = ((String) objArr7[0]).intern();
            }
            roster.isBispBenif = strIntern;
        }
        if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICNotMade.getId()) {
            roster.cnicOption = 0;
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICAbsent.getId()) {
            roster.cnicOption = 1;
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
            int i12 = p + 123;
            q = i12 % 128;
            int i13 = i12 % 2;
            roster.cnicOption = 2;
            Roster roster2 = this.bk;
            roster.cnic = roster2.cnic;
            roster.cnicRepeat = roster2.cnicRepeat;
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
            roster.cnicOption = 3;
            roster.cnic = ivas.gov.bisp.enumeration.p091n.j.m(this.por_roster);
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId()) {
            roster.cnicOption = 4;
            roster.cnic = ivas.gov.bisp.enumeration.p091n.j.m(this.por_roster);
        }
        if (this.linearLayoutCNICPic.getVisibility() == 0) {
            int i14 = q + 85;
            p = i14 % 128;
            int i15 = i14 % 2;
            byte[] bArr = this.bb;
            if (bArr != null) {
                roster.cnicArray = bArr;
                Object[] objArr8 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 44, (char) (getApplicationInfo().targetSdkVersion - 31), Color.alpha(0) + 845, objArr8);
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(((String) objArr8[0]).intern());
                sbW.append(ivas.gov.bisp.enumeration.p026az.z.e());
                roster.cnicPicName = sbW.toString();
            }
        }
        byte[] bArr2 = this.bO;
        if (bArr2 != null) {
            roster.bioImage = bArr2;
        }
        if (this.sp_disability.getSelectedItemPosition() != 0) {
            roster.disability = this.aO.get(this.sp_disability.getSelectedItemPosition()).getOptionId();
            roster.disability_name = this.aO.get(this.sp_disability.getSelectedItemPosition()).getOption();
        }
        if (this.sp_chronic_disease.getSelectedItemPosition() != 0) {
            roster.chronic_disease = this.aN.get(this.sp_chronic_disease.getSelectedItemPosition()).getOptionId();
            roster.chronic_disease_name = this.aN.get(this.sp_chronic_disease.getSelectedItemPosition()).getOption();
        }
        if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_yes.getId()) {
            roster.language = 1;
        } else if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_no.getId()) {
            roster.language = 0;
            this.sp_attended_school.setSelection(1);
        }
        if (this.sp_attended_school.getSelectedItemPosition() != 0) {
            roster.attended_school = this.aP.get(this.sp_attended_school.getSelectedItemPosition()).getOptionId();
            roster.attended_school_name = this.aP.get(this.sp_attended_school.getSelectedItemPosition()).getOption();
        }
        if (this.sp_highest_education.getVisibility() == 0 && this.sp_highest_education.getSelectedItemPosition() != 0) {
            roster.higher_education = this.aQ.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
            roster.higher_education_name = this.aQ.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
        }
        if (this.sp_work_activity.getVisibility() == 0 && this.sp_work_activity.getSelectedItemPosition() != 0) {
            roster.work_activity = this.aR.get(this.sp_work_activity.getSelectedItemPosition()).getOptionId();
            roster.work_activity_name = this.aR.get(this.sp_work_activity.getSelectedItemPosition()).getOption();
        }
        if (this.sp_employment_status.getVisibility() == 0) {
            int i16 = q + 93;
            p = i16 % 128;
            int i17 = i16 % 2;
            if (this.sp_employment_status.getSelectedItemPosition() != 0) {
                roster.employment_status = this.bf.get(this.sp_employment_status.getSelectedItemPosition()).getOptionId();
                roster.employment_status_name = this.bf.get(this.sp_employment_status.getSelectedItemPosition()).getOption();
            }
        }
        if (this.et_hoursWorked.getVisibility() == 0) {
            int i18 = p + 3;
            q = i18 % 128;
            if (i18 % 2 == 0) {
                roster.hours_worked = Double.parseDouble(this.et_hoursWorked.getText().toString());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            roster.hours_worked = Double.parseDouble(this.et_hoursWorked.getText().toString());
        }
        roster.age = this.aU;
        if (this.aX) {
            roster.roster_relational_id = this.aV.get(this.aW).roster_relational_id;
            roster.rosterUniqueId = this.aV.get(this.aW).rosterUniqueId;
            Roster roster3 = this.bk;
            roster.start = roster3.start;
            roster.end = roster3.end;
            roster.diff = roster3.diff;
        } else {
            if (this.aV.size() == 0) {
                int i19 = q + 11;
                p = i19 % 128;
                i = i19 % 2 != 0 ? 0 : 1;
            } else {
                ArrayList<Roster> arrayList = this.aV;
                i = arrayList.get(arrayList.size() - 1).roster_relational_id + 1;
            }
            roster.roster_relational_id = i;
            roster.rosterUniqueId = UUID.randomUUID().toString();
            roster.start = this.bh;
            String strE = ivas.gov.bisp.enumeration.p026az.z.e();
            roster.end = strE;
            roster.diff = ac.f(roster.start, strE);
        }
        if (!BISPApplication.f()) {
            String strE2 = BISPApplication.e();
            Object[] objArr9 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 3, (char) (getPackageName().codePointAt(17) - 109), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 801, objArr9);
            roster.latitude = strE2.split(((String) objArr9[0]).intern())[0];
            Object[] objArr10 = new Object[1];
            a(getPackageName().codePointAt(21) - 115, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), getPackageName().codePointAt(2) + 753, objArr10);
            roster.longitude = strE2.split(((String) objArr10[0]).intern())[1];
        }
        roster.setValidatedFromNadra(this.bk.isValidatedFromNadra());
        try {
            JSONObject jSONObjectM = M(this.bj, this.bm, this.llVaccinationDynamic);
            Object[] objArr11 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 7, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 22944), (-16776705) - Color.rgb(0, 0, 0), objArr11);
            roster.isImmunized = jSONObjectM.optString(((String) objArr11[0]).intern(), BuildConfig.FLAVOR);
            double d = this.bk.age;
            int selectedItemPosition = this.bK.getSelectedItemPosition();
            if (selectedItemPosition < 0 || selectedItemPosition >= this.bu.size()) {
                i2 = 0;
            } else {
                int i20 = p + 21;
                q = i20 % 128;
                int i21 = i20 % 2;
                i2 = this.bu.get(selectedItemPosition).option_id;
                Objects.requireNonNull(this.bu.get(selectedItemPosition).option);
            }
            int selectedItemPosition2 = this.bz.getSelectedItemPosition();
            if (selectedItemPosition2 < 0 || selectedItemPosition2 >= this.aH.size()) {
                i3 = 0;
            } else {
                i3 = this.aH.get(selectedItemPosition2).option_id;
                Objects.requireNonNull(this.aH.get(selectedItemPosition2).option);
            }
            boolean z2 = d * 365.0d <= ((double) (this.bw * 365));
            if (z2 && (i3 == 0 || i2 == 0)) {
                Object[] objArr12 = new Object[1];
                a(getApplicationInfo().targetSdkVersion - 1, (char) View.getDefaultSize(0, 0), 850 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), objArr12);
                Toast.makeText(this, ((String) objArr12[0]).intern(), 1).show();
                return;
            }
            roster.height_of_child = String.valueOf(i3);
            roster.weight_of_child = String.valueOf(i2);
            if (i3 == 0) {
                roster.height_of_child = BuildConfig.FLAVOR;
            }
            if (i2 == 0) {
                roster.weight_of_child = BuildConfig.FLAVOR;
            }
            if (!z2) {
                roster.height_of_child = BuildConfig.FLAVOR;
                roster.weight_of_child = BuildConfig.FLAVOR;
            }
            Object[] objArr13 = new Object[1];
            a(18 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 37), getPackageName().codePointAt(16) + 405, objArr13);
            JSONArray jSONArrayOptJSONArray = jSONObjectM.optJSONArray(((String) objArr13[0]).intern());
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                Object[] objArr14 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 34, (char) (Color.green(0) + 56663), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 877, objArr14);
                roster.rosterVaccinationsJson = ((String) objArr14[0]).intern();
            } else {
                roster.rosterVaccinationsJson = jSONArrayOptJSONArray.toString();
            }
            boolean z3 = this.aW != -1;
            String str = this.bo;
            if (str != null) {
                Object[] objArr15 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 35, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 26822), getPackageName().length() - 25, objArr15);
                String strReplaceAll = str.replaceAll(((String) objArr15[0]).intern(), BuildConfig.FLAVOR);
                String str2 = roster.cnic;
                Object[] objArr16 = new Object[1];
                a(getApplicationInfo().targetSdkVersion - 30, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 26790), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr16);
                if (strReplaceAll.equals(str2.replaceAll(((String) objArr16[0]).intern(), BuildConfig.FLAVOR)) && z3) {
                    Intent intent = new Intent();
                    if (this.aX) {
                        Object[] objArr17 = new Object[1];
                        a(13 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (getPackageName().length() - 25), getPackageName().codePointAt(21) + 767, objArr17);
                        intent.putExtra(((String) objArr17[0]).intern(), this.bA);
                        Object[] objArr18 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 28, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 847, objArr18);
                        intent.putExtra(((String) objArr18[0]).intern(), this.aW);
                        Object[] objArr19 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 25, (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion + 873, objArr19);
                        String strIntern3 = ((String) objArr19[0]).intern();
                        String cnic = roster.getCnic();
                        Object[] objArr20 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 114, (char) (getApplicationInfo().targetSdkVersion + 26795), getApplicationInfo().targetSdkVersion - 31, objArr20);
                        intent.putExtra(strIntern3, cnic.replaceAll(((String) objArr20[0]).intern(), BuildConfig.FLAVOR));
                        int i22 = p + 103;
                        q = i22 % 128;
                        int i23 = i22 % 2;
                    }
                    Object[] objArr21 = new Object[1];
                    a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 43, (char) (12262 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 914, objArr21);
                    intent.putExtra(((String) objArr21[0]).intern(), roster);
                    setResult(-1, intent);
                    finish();
                    return;
                }
            }
            C0104p c0104pC2 = C0104p.c();
            AppCompatActivity appCompatActivity2 = this.ae;
            Object[] objArr22 = new Object[1];
            a(5 - (Process.myTid() >> 22), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 764 - (ViewConfiguration.getScrollBarSize() >> 8), objArr22);
            String strIntern4 = ((String) objArr22[0]).intern();
            Object[] objArr23 = new Object[1];
            a(71 - View.MeasureSpec.getMode(0), (char) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 26301), getApplicationInfo().targetSdkVersion + 738, objArr23);
            c0104pC2.e(appCompatActivity2, strIntern4, ((String) objArr23[0]).intern(), new DialogInterfaceOnClickListenerC0122o(this, 1), false);
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), 1).show();
            roster.isImmunized = BuildConfig.FLAVOR;
            Object[] objArr24 = new Object[1];
            a(2 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (getPackageName().length() + 56638), 881 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), objArr24);
            roster.rosterVaccinationsJson = ((String) objArr24[0]).intern();
        }
    }

    public class o0Oo0oo implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ double c;

        public o0Oo0oo(double d) {
            this.c = d;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 21) << 1;
            int i4 = -(((~i2) & 21) | (i2 & (-22)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:114:0x03d3  */
        /* JADX WARN: Code duplicated, block: B:135:0x044a  */
        /* JADX WARN: Code duplicated, block: B:137:0x0450  */
        /* JADX WARN: Code duplicated, block: B:139:0x0469  */
        /* JADX WARN: Code duplicated, block: B:142:0x0474  */
        /* JADX WARN: Code duplicated, block: B:144:0x047a  */
        /* JADX WARN: Code duplicated, block: B:146:0x0482  */
        /* JADX WARN: Code duplicated, block: B:151:0x04b0  */
        /* JADX WARN: Code duplicated, block: B:153:0x04b8 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:156:0x04d1  */
        /* JADX WARN: Code duplicated, block: B:158:0x04dd  */
        /* JADX WARN: Code duplicated, block: B:159:0x04df  */
        /* JADX WARN: Code duplicated, block: B:162:0x04ea A[PHI: r1
  0x04ea: PHI (r1v38 int) = (r1v37 int), (r1v47 int) binds: [B:160:0x04e7, B:158:0x04dd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:164:0x0506  */
        /* JADX WARN: Code duplicated, block: B:166:0x050f  */
        /* JADX WARN: Code duplicated, block: B:168:0x0518  */
        /* JADX WARN: Code duplicated, block: B:170:0x052a  */
        /* JADX WARN: Code duplicated, block: B:17:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:212:0x0294 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:216:0x053c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:217:0x0538 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:219:0x02c1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:220:0x02b9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x028d A[PHI: r7
  0x028d: PHI (r7v22 java.lang.String) = (r7v20 java.lang.String), (r7v31 java.lang.String) binds: [B:66:0x028b, B:63:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:71:0x02a3  */
        /* JADX WARN: Code duplicated, block: B:96:0x0355  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String strTrim;
            ActivityRoster activityRoster;
            LinearLayout linearLayout;
            String strTrim2;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            Spinner spinner;
            int i8 = 2;
            int i9 = 2 % 2;
            int i10 = 1;
            if (i == 0) {
                int i11 = a;
                int i12 = i11 & 91;
                int i13 = ((i11 ^ 91) | i12) << 1;
                int i14 = -((i11 | 91) & (~i12));
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    ActivityRoster.this.bj.setBackgroundResource(R.drawable.spinner_bg);
                    int i16 = 21 / 0;
                } else {
                    ActivityRoster.this.bj.setBackgroundResource(R.drawable.spinner_bg);
                }
                int i17 = a;
                int i18 = (i17 & 16) + (i17 | 16);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                b = i19 % 128;
                int i20 = i19 % 2;
            }
            ActivityRoster.this.bj.setBackgroundResource(R.drawable.spinner_bg_selected);
            int i21 = a;
            int i22 = (i21 & (-50)) | ((~i21) & 49);
            int i23 = (i21 & 49) << 1;
            int i24 = (i22 & i23) + (i22 | i23);
            b = i24 % 128;
            Object obj = null;
            if (i24 % 2 != 0) {
                throw null;
            }
            if (i >= 0) {
                int i25 = (-2) - ((i21 + 46) ^ (-1));
                b = i25 % 128;
                int i26 = i25 % 2;
                if (i < ActivityRoster.this.bm.size()) {
                    int i27 = b;
                    int i28 = (((i27 & (-58)) | ((~i27) & 57)) - (~((i27 & 57) << 1))) - 1;
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    if (ActivityRoster.this.bm.get(i) != null) {
                        int i30 = b;
                        int i31 = (i30 & (-44)) | ((~i30) & 43);
                        int i32 = -(-((i30 & 43) << 1));
                        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                        strTrim = ActivityRoster.this.bm.get(i).option.trim();
                        int i35 = b;
                        int i36 = i35 & 11;
                        int i37 = i36 + ((i35 ^ 11) | i36);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                    } else {
                        strTrim = BuildConfig.FLAVOR;
                    }
                } else {
                    strTrim = BuildConfig.FLAVOR;
                }
            } else {
                strTrim = BuildConfig.FLAVOR;
            }
            int i39 = 8;
            if ((!strTrim.equalsIgnoreCase("Immunized - Card Available")) && !strTrim.equalsIgnoreCase("Immunized - Card not available")) {
                int i40 = a;
                int i41 = ((i40 | 54) << 1) - (i40 ^ 54);
                int i42 = (i41 ^ (-1)) + (i41 << 1);
                b = i42 % 128;
                int i43 = i42 % 2;
                if (!strTrim.equalsIgnoreCase("Not Immunized")) {
                    int i44 = b + 113;
                    a = i44 % 128;
                    if (i44 % 2 == 0) {
                        strTrim.equalsIgnoreCase("No");
                        throw null;
                    }
                    if (!strTrim.equalsIgnoreCase("No")) {
                        int i45 = b;
                        int i46 = (-2) - ((((i45 | 32) << 1) - (i45 ^ 32)) ^ (-1));
                        a = i46 % 128;
                        if (i46 % 2 == 0) {
                            strTrim.equalsIgnoreCase("Non-Immunized");
                            obj.hashCode();
                            throw null;
                        }
                        if (!strTrim.equalsIgnoreCase("Non-Immunized")) {
                            ActivityRoster.this.llVaccinationDynamic.setVisibility(8);
                            ActivityRoster activityRoster2 = ActivityRoster.this;
                            int i47 = a;
                            int i48 = i47 & 15;
                            int i49 = (i47 ^ 15) | i48;
                            int i50 = (i48 & i49) + (i49 | i48);
                            b = i50 % 128;
                            if (i50 % 2 != 0) {
                                activityRoster2.bl.setVisibility(68);
                                spinner = ActivityRoster.this.bg;
                                i39 = 124;
                            } else {
                                activityRoster2.bl.setVisibility(8);
                                spinner = ActivityRoster.this.bg;
                            }
                            spinner.setVisibility(i39);
                            int i51 = b;
                            int i52 = i51 | 107;
                            int i53 = i52 << 1;
                            int i54 = -((~(i51 & 107)) & i52);
                            int i55 = (i53 & i54) + (i54 | i53);
                            a = i55 % 128;
                            int i56 = i55 % 2;
                            return;
                        }
                    }
                }
                ActivityRoster.this.llVaccinationDynamic.setVisibility(8);
                ActivityRoster.this.bl.setVisibility(0);
                int i57 = b;
                int i58 = i57 ^ 81;
                int i59 = -(-((i57 & 81) << 1));
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                a = i60 % 128;
                int i61 = i60 % 2;
                ActivityRoster.this.bg.setVisibility(0);
                return;
            }
            ActivityRoster.this.bl.setVisibility(8);
            ActivityRoster activityRoster3 = ActivityRoster.this;
            int i62 = a;
            int i63 = (i62 ^ 89) + ((i62 & 89) << 1);
            b = i63 % 128;
            int i64 = i63 % 2;
            activityRoster3.bg.setVisibility(8);
            LinearLayout linearLayout2 = ActivityRoster.this.llVaccinationDynamic;
            int i65 = b;
            int i66 = (((i65 & (-90)) | ((~i65) & 89)) - (~((i65 & 89) << 1))) - 1;
            a = i66 % 128;
            int i67 = i66 % 2;
            linearLayout2.setVisibility(0);
            ActivityRoster activityRoster4 = ActivityRoster.this;
            LinearLayout linearLayout3 = activityRoster4.llVaccinationDynamic;
            ArrayList<question_options> arrayList = activityRoster4.bn;
            int i68 = a;
            int i69 = (((i68 ^ 97) | (i68 & 97)) << 1) - (((~i68) & 97) | (i68 & (-98)));
            b = i69 % 128;
            if (i69 % 2 != 0) {
                activityRoster4.J();
                linearLayout3.removeAllViews();
                throw null;
            }
            double d = this.c;
            activityRoster4.J();
            linearLayout3.removeAllViews();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(activityRoster4);
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                String str = activityRoster4.bk.gender;
                Iterator<question_options> it = arrayList.iterator();
                int i70 = a;
                int i71 = i70 & 49;
                int i72 = (~i71) & (i70 | 49);
                int i73 = -(-(i71 << 1));
                int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
                b = i74 % 128;
                int i75 = i74 % 2;
                while (it.hasNext()) {
                    int i76 = b + 119;
                    a = i76 % 128;
                    if (i76 % i8 == 0) {
                        it.next();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    question_options next = it.next();
                    if (next != null) {
                        int i77 = a;
                        int i78 = i77 | 103;
                        int i79 = i78 << 1;
                        int i80 = -((~(i77 & 103)) & i78);
                        int i81 = ((i79 | i80) << i10) - (i79 ^ i80);
                        b = i81 % 128;
                        int i82 = i81 % i8;
                        String str2 = next.option;
                        if (str2 != null) {
                            int i83 = b + 79;
                            a = i83 % 128;
                            if (i83 % i8 == 0) {
                                strTrim2 = str2.trim();
                                int i84 = 92 / 0;
                                if (d <= 42.0d) {
                                    if (((strTrim2.contains("پیدائش") ? 1 : 0) ^ i10) != i10) {
                                        int i85 = b;
                                        i7 = (i85 ^ 113) + ((i85 & 113) << i10);
                                        a = i7 % 128;
                                        if (i7 % i8 != 0) {
                                            arrayList2.add(next);
                                            Object obj3 = null;
                                            obj3.hashCode();
                                            throw null;
                                        }
                                        arrayList2.add(next);
                                        int i86 = b;
                                        int i87 = i86 & 97;
                                        int i88 = (i87 - (~((i86 ^ 97) | i87))) - i10;
                                        a = i88 % 128;
                                        int i89 = i88 % i8;
                                    }
                                }
                            } else {
                                strTrim2 = str2.trim();
                                if (d <= 42.0d) {
                                    if (((strTrim2.contains("پیدائش") ? 1 : 0) ^ i10) != i10) {
                                        int i810 = b;
                                        i7 = (i810 ^ 113) + ((i810 & 113) << i10);
                                        a = i7 % 128;
                                        if (i7 % i8 != 0) {
                                            arrayList2.add(next);
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        arrayList2.add(next);
                                        int i811 = b;
                                        int i812 = i811 & 97;
                                        int i813 = (i812 - (~((i811 ^ 97) | i812))) - i10;
                                        a = i813 % 128;
                                        int i814 = i813 % i8;
                                    }
                                }
                            }
                            if (d <= 98.0d) {
                                int i90 = b;
                                int i91 = i90 & 71;
                                int i92 = (i90 ^ 71) | i91;
                                int i93 = (i91 & i92) + (i91 | i92);
                                a = i93 % 128;
                                if (i93 % i8 == 0) {
                                    strTrim2.contains("پیدائش");
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                                if (strTrim2.contains("پیدائش") || strTrim2.contains("چھ ہفتے")) {
                                    arrayList2.add(next);
                                }
                                i10 = 1;
                            }
                            if (d <= 270.0d) {
                                int i94 = b;
                                int i95 = i94 & 37;
                                int i96 = ((((i94 ^ 37) | i95) << 1) - (~(-((~i95) & (i94 | 37))))) - 1;
                                a = i96 % 128;
                                int i97 = i96 % 2;
                                if (!strTrim2.contains("پیدائش")) {
                                    int i98 = b;
                                    int i99 = i98 & 43;
                                    int i100 = -(-((i98 ^ 43) | i99));
                                    int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                                    a = i101 % 128;
                                    if (i101 % 2 == 0) {
                                        int i102 = 4 / 0;
                                        if (!strTrim2.contains("چھ ہفتے")) {
                                            int i103 = b;
                                            int i104 = i103 & 69;
                                            int i105 = (i104 - (~((i103 ^ 69) | i104))) - 1;
                                            a = i105 % 128;
                                            int i106 = i105 % 2;
                                            if (strTrim2.contains("دس ہفتے")) {
                                            }
                                            i8 = 2;
                                            i10 = 1;
                                        }
                                    } else if (!strTrim2.contains("چھ ہفتے")) {
                                        int i107 = b;
                                        int i108 = i107 & 69;
                                        int i109 = (i108 - (~((i107 ^ 69) | i108))) - 1;
                                        a = i109 % 128;
                                        int i1010 = i109 % 2;
                                        if (strTrim2.contains("دس ہفتے")) {
                                        }
                                        i8 = 2;
                                        i10 = 1;
                                    }
                                }
                                arrayList2.add(next);
                                int i110 = a;
                                int i111 = ((i110 & 72) + (i110 | 72)) - 1;
                                b = i111 % 128;
                                int i112 = i111 % 2;
                                i8 = 2;
                                i10 = 1;
                            }
                            if (d <= 450.0d) {
                                int i113 = a;
                                int i114 = (i113 ^ 99) + ((i113 & 99) << 1);
                                b = i114 % 128;
                                if (i114 % 2 != 0) {
                                    strTrim2.contains("پیدائش");
                                    Object obj6 = null;
                                    obj6.hashCode();
                                    throw null;
                                }
                                if (strTrim2.contains("پیدائش")) {
                                    linearLayout = linearLayout3;
                                } else {
                                    int i115 = a + 35;
                                    linearLayout = linearLayout3;
                                    b = i115 % 128;
                                    int i116 = i115 % 2;
                                    if (!strTrim2.contains("چھ ہفتے")) {
                                        int i117 = b + 95;
                                        a = i117 % 128;
                                        if (i117 % 2 == 0) {
                                            int i118 = 96 / 0;
                                            if (!strTrim2.contains("دس ہفتے")) {
                                                if (!strTrim2.contains("14 ہفتے")) {
                                                }
                                                linearLayout3 = linearLayout;
                                                i8 = 2;
                                                i10 = 1;
                                            }
                                        } else if (!strTrim2.contains("دس ہفتے")) {
                                            if (!strTrim2.contains("14 ہفتے")) {
                                            }
                                            linearLayout3 = linearLayout;
                                            i8 = 2;
                                            i10 = 1;
                                        }
                                    }
                                }
                                arrayList2.add(next);
                                int i119 = b;
                                int i120 = i119 & 121;
                                int i121 = (i119 | 121) & (~i120);
                                int i122 = i120 << 1;
                                int i123 = (i121 ^ i122) + ((i121 & i122) << 1);
                                a = i123 % 128;
                                int i124 = i123 % 2;
                                linearLayout3 = linearLayout;
                                i8 = 2;
                                i10 = 1;
                            } else {
                                linearLayout = linearLayout3;
                            }
                            activityRoster = activityRoster4;
                            if (d <= activityRoster4.bw * 365) {
                                int i125 = b;
                                int i126 = (i125 & 39) + (i125 | 39);
                                a = i126 % 128;
                                if (i126 % 2 == 0) {
                                    strTrim2.contains("پیدائش");
                                    throw null;
                                }
                                if (!strTrim2.contains("پیدائش")) {
                                    int i127 = b;
                                    int i128 = (((i127 | 25) << 1) - (~(-(i127 ^ 25)))) - 1;
                                    a = i128 % 128;
                                    if (i128 % 2 == 0) {
                                        int i129 = 60 / 0;
                                        if (!strTrim2.contains("چھ ہفتے")) {
                                            if (!strTrim2.contains("دس ہفتے")) {
                                                int i130 = b;
                                                int i131 = i130 | 89;
                                                int i132 = i131 << 1;
                                                int i133 = -((~(i130 & 89)) & i131);
                                                i6 = (i132 ^ i133) + ((i133 & i132) << 1);
                                                a = i6 % 128;
                                                if (i6 % 2 == 0) {
                                                    int i134 = 81 / 0;
                                                    if (!strTrim2.contains("14 ہفتے")) {
                                                        if (!strTrim2.contains("9 ماہ")) {
                                                            int i135 = a;
                                                            int i136 = (i135 ^ 77) + ((i135 & 77) << 1);
                                                            b = i136 % 128;
                                                            int i137 = i136 % 2;
                                                            if (strTrim2.contains("15 ماہ")) {
                                                                if (strTrim2.contains("ہیومن پیپیلوما وائرس") && str != null) {
                                                                    int i138 = b;
                                                                    int i139 = i138 & 123;
                                                                    i2 = (((i138 | 123) & (~i139)) - (~(-(-(i139 << 1))))) - 1;
                                                                    a = i2 % 128;
                                                                    if (i2 % 2 == 0) {
                                                                        int i140 = 50 / 0;
                                                                        if (str.equalsIgnoreCase("female")) {
                                                                            i3 = 1;
                                                                            int i141 = b;
                                                                            int i142 = ((i141 ^ 125) | (i141 & 125)) << i3;
                                                                            int i143 = -(((~i141) & 125) | (i141 & (-126)));
                                                                            i4 = ((i142 | i143) << i3) - (i143 ^ i142);
                                                                            a = i4 % 128;
                                                                            if (i4 % 2 != 0) {
                                                                                Object obj7 = null;
                                                                                obj7.hashCode();
                                                                                throw null;
                                                                            }
                                                                            if (d >= 3285.0d) {
                                                                                if (d <= activityRoster.bI * 365) {
                                                                                    int i144 = b;
                                                                                    int i145 = (i144 & 91) + (i144 | 91);
                                                                                    a = i145 % 128;
                                                                                    i5 = i145 % 2;
                                                                                    arrayList2.add(next);
                                                                                    if (i5 != 0) {
                                                                                        throw null;
                                                                                    }
                                                                                    int i146 = a;
                                                                                    int i147 = (i146 & 123) + (i146 | 123);
                                                                                    b = i147 % 128;
                                                                                    int i148 = i147 % 2;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i3 = 1;
                                                                        if (!(!str.equalsIgnoreCase("female"))) {
                                                                            int i149 = b;
                                                                            int i1410 = ((i149 ^ 125) | (i149 & 125)) << i3;
                                                                            int i1411 = -(((~i149) & 125) | (i149 & (-126)));
                                                                            i4 = ((i1410 | i1411) << i3) - (i1411 ^ i1410);
                                                                            a = i4 % 128;
                                                                            if (i4 % 2 != 0) {
                                                                                Object obj8 = null;
                                                                                obj8.hashCode();
                                                                                throw null;
                                                                            }
                                                                            if (d >= 3285.0d) {
                                                                                if (d <= activityRoster.bI * 365) {
                                                                                    int i1412 = b;
                                                                                    int i1413 = (i1412 & 91) + (i1412 | 91);
                                                                                    a = i1413 % 128;
                                                                                    i5 = i1413 % 2;
                                                                                    arrayList2.add(next);
                                                                                    if (i5 != 0) {
                                                                                        throw null;
                                                                                    }
                                                                                    int i1414 = a;
                                                                                    int i1415 = (i1414 & 123) + (i1414 | 123);
                                                                                    b = i1415 % 128;
                                                                                    int i1416 = i1415 % 2;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int i150 = b;
                                                                int i151 = ((i150 ^ 41) | (i150 & 41)) << 1;
                                                                int i152 = -(((~i150) & 41) | (i150 & (-42)));
                                                                int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                                                                a = i153 % 128;
                                                                int i154 = i153 % 2;
                                                            }
                                                        }
                                                    }
                                                } else if (!strTrim2.contains("14 ہفتے")) {
                                                    if (!strTrim2.contains("9 ماہ")) {
                                                        int i1310 = a;
                                                        int i1311 = (i1310 ^ 77) + ((i1310 & 77) << 1);
                                                        b = i1311 % 128;
                                                        int i1312 = i1311 % 2;
                                                        if (strTrim2.contains("15 ماہ")) {
                                                            if (strTrim2.contains("ہیومن پیپیلوما وائرس")) {
                                                                int i1313 = b;
                                                                int i1314 = i1313 & 123;
                                                                i2 = (((i1313 | 123) & (~i1314)) - (~(-(-(i1314 << 1))))) - 1;
                                                                a = i2 % 128;
                                                                if (i2 % 2 == 0) {
                                                                    int i1417 = 50 / 0;
                                                                    if (str.equalsIgnoreCase("female")) {
                                                                        i3 = 1;
                                                                        int i1418 = b;
                                                                        int i1419 = ((i1418 ^ 125) | (i1418 & 125)) << i3;
                                                                        int i14110 = -(((~i1418) & 125) | (i1418 & (-126)));
                                                                        i4 = ((i1419 | i14110) << i3) - (i14110 ^ i1419);
                                                                        a = i4 % 128;
                                                                        if (i4 % 2 != 0) {
                                                                            Object obj9 = null;
                                                                            obj9.hashCode();
                                                                            throw null;
                                                                        }
                                                                        if (d >= 3285.0d) {
                                                                            if (d <= activityRoster.bI * 365) {
                                                                                int i14111 = b;
                                                                                int i14112 = (i14111 & 91) + (i14111 | 91);
                                                                                a = i14112 % 128;
                                                                                i5 = i14112 % 2;
                                                                                arrayList2.add(next);
                                                                                if (i5 != 0) {
                                                                                    throw null;
                                                                                }
                                                                                int i14113 = a;
                                                                                int i14114 = (i14113 & 123) + (i14113 | 123);
                                                                                b = i14114 % 128;
                                                                                int i14115 = i14114 % 2;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    i3 = 1;
                                                                    if (!(!str.equalsIgnoreCase("female"))) {
                                                                        int i14116 = b;
                                                                        int i14117 = ((i14116 ^ 125) | (i14116 & 125)) << i3;
                                                                        int i14118 = -(((~i14116) & 125) | (i14116 & (-126)));
                                                                        i4 = ((i14117 | i14118) << i3) - (i14118 ^ i14117);
                                                                        a = i4 % 128;
                                                                        if (i4 % 2 != 0) {
                                                                            Object obj10 = null;
                                                                            obj10.hashCode();
                                                                            throw null;
                                                                        }
                                                                        if (d >= 3285.0d) {
                                                                            if (d <= activityRoster.bI * 365) {
                                                                                int i14119 = b;
                                                                                int i141110 = (i14119 & 91) + (i14119 | 91);
                                                                                a = i141110 % 128;
                                                                                i5 = i141110 % 2;
                                                                                arrayList2.add(next);
                                                                                if (i5 != 0) {
                                                                                    throw null;
                                                                                }
                                                                                int i141111 = a;
                                                                                int i141112 = (i141111 & 123) + (i141111 | 123);
                                                                                b = i141112 % 128;
                                                                                int i141113 = i141112 % 2;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            int i155 = b;
                                                            int i156 = ((i155 ^ 41) | (i155 & 41)) << 1;
                                                            int i157 = -(((~i155) & 41) | (i155 & (-42)));
                                                            int i158 = ((i156 | i157) << 1) - (i157 ^ i156);
                                                            a = i158 % 128;
                                                            int i159 = i158 % 2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (!strTrim2.contains("چھ ہفتے")) {
                                        if (!strTrim2.contains("دس ہفتے")) {
                                            int i1315 = b;
                                            int i1316 = i1315 | 89;
                                            int i1317 = i1316 << 1;
                                            int i1318 = -((~(i1315 & 89)) & i1316);
                                            i6 = (i1317 ^ i1318) + ((i1318 & i1317) << 1);
                                            a = i6 % 128;
                                            if (i6 % 2 == 0) {
                                                int i1319 = 81 / 0;
                                                if (!strTrim2.contains("14 ہفتے")) {
                                                    if (!strTrim2.contains("9 ماہ")) {
                                                        int i13110 = a;
                                                        int i13111 = (i13110 ^ 77) + ((i13110 & 77) << 1);
                                                        b = i13111 % 128;
                                                        int i13112 = i13111 % 2;
                                                        if (strTrim2.contains("15 ماہ")) {
                                                            if (strTrim2.contains("ہیومن پیپیلوما وائرس")) {
                                                                int i13113 = b;
                                                                int i13114 = i13113 & 123;
                                                                i2 = (((i13113 | 123) & (~i13114)) - (~(-(-(i13114 << 1))))) - 1;
                                                                a = i2 % 128;
                                                                if (i2 % 2 == 0) {
                                                                    int i14120 = 50 / 0;
                                                                    if (str.equalsIgnoreCase("female")) {
                                                                        i3 = 1;
                                                                        int i141114 = b;
                                                                        int i141115 = ((i141114 ^ 125) | (i141114 & 125)) << i3;
                                                                        int i141116 = -(((~i141114) & 125) | (i141114 & (-126)));
                                                                        i4 = ((i141115 | i141116) << i3) - (i141116 ^ i141115);
                                                                        a = i4 % 128;
                                                                        if (i4 % 2 != 0) {
                                                                            Object obj11 = null;
                                                                            obj11.hashCode();
                                                                            throw null;
                                                                        }
                                                                        if (d >= 3285.0d) {
                                                                            if (d <= activityRoster.bI * 365) {
                                                                                int i141117 = b;
                                                                                int i141118 = (i141117 & 91) + (i141117 | 91);
                                                                                a = i141118 % 128;
                                                                                i5 = i141118 % 2;
                                                                                arrayList2.add(next);
                                                                                if (i5 != 0) {
                                                                                    throw null;
                                                                                }
                                                                                int i141119 = a;
                                                                                int i1411110 = (i141119 & 123) + (i141119 | 123);
                                                                                b = i1411110 % 128;
                                                                                int i1411111 = i1411110 % 2;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    i3 = 1;
                                                                    if (!(!str.equalsIgnoreCase("female"))) {
                                                                        int i1411112 = b;
                                                                        int i1411113 = ((i1411112 ^ 125) | (i1411112 & 125)) << i3;
                                                                        int i1411114 = -(((~i1411112) & 125) | (i1411112 & (-126)));
                                                                        i4 = ((i1411113 | i1411114) << i3) - (i1411114 ^ i1411113);
                                                                        a = i4 % 128;
                                                                        if (i4 % 2 != 0) {
                                                                            Object obj12 = null;
                                                                            obj12.hashCode();
                                                                            throw null;
                                                                        }
                                                                        if (d >= 3285.0d) {
                                                                            if (d <= activityRoster.bI * 365) {
                                                                                int i1411115 = b;
                                                                                int i1411116 = (i1411115 & 91) + (i1411115 | 91);
                                                                                a = i1411116 % 128;
                                                                                i5 = i1411116 % 2;
                                                                                arrayList2.add(next);
                                                                                if (i5 != 0) {
                                                                                    throw null;
                                                                                }
                                                                                int i1411117 = a;
                                                                                int i1411118 = (i1411117 & 123) + (i1411117 | 123);
                                                                                b = i1411118 % 128;
                                                                                int i1411119 = i1411118 % 2;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            int i1510 = b;
                                                            int i1511 = ((i1510 ^ 41) | (i1510 & 41)) << 1;
                                                            int i1512 = -(((~i1510) & 41) | (i1510 & (-42)));
                                                            int i1513 = ((i1511 | i1512) << 1) - (i1512 ^ i1511);
                                                            a = i1513 % 128;
                                                            int i1514 = i1513 % 2;
                                                        }
                                                    }
                                                }
                                            } else if (!strTrim2.contains("14 ہفتے")) {
                                                if (!strTrim2.contains("9 ماہ")) {
                                                    int i13115 = a;
                                                    int i13116 = (i13115 ^ 77) + ((i13115 & 77) << 1);
                                                    b = i13116 % 128;
                                                    int i13117 = i13116 % 2;
                                                    if (strTrim2.contains("15 ماہ")) {
                                                        if (strTrim2.contains("ہیومن پیپیلوما وائرس")) {
                                                            int i13118 = b;
                                                            int i13119 = i13118 & 123;
                                                            i2 = (((i13118 | 123) & (~i13119)) - (~(-(-(i13119 << 1))))) - 1;
                                                            a = i2 % 128;
                                                            if (i2 % 2 == 0) {
                                                                int i14121 = 50 / 0;
                                                                if (str.equalsIgnoreCase("female")) {
                                                                    i3 = 1;
                                                                    int i14111110 = b;
                                                                    int i14111111 = ((i14111110 ^ 125) | (i14111110 & 125)) << i3;
                                                                    int i14111112 = -(((~i14111110) & 125) | (i14111110 & (-126)));
                                                                    i4 = ((i14111111 | i14111112) << i3) - (i14111112 ^ i14111111);
                                                                    a = i4 % 128;
                                                                    if (i4 % 2 != 0) {
                                                                        Object obj13 = null;
                                                                        obj13.hashCode();
                                                                        throw null;
                                                                    }
                                                                    if (d >= 3285.0d) {
                                                                        if (d <= activityRoster.bI * 365) {
                                                                            int i14111113 = b;
                                                                            int i14111114 = (i14111113 & 91) + (i14111113 | 91);
                                                                            a = i14111114 % 128;
                                                                            i5 = i14111114 % 2;
                                                                            arrayList2.add(next);
                                                                            if (i5 != 0) {
                                                                                throw null;
                                                                            }
                                                                            int i14111115 = a;
                                                                            int i14111116 = (i14111115 & 123) + (i14111115 | 123);
                                                                            b = i14111116 % 128;
                                                                            int i14111117 = i14111116 % 2;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                i3 = 1;
                                                                if (!(!str.equalsIgnoreCase("female"))) {
                                                                    int i14111118 = b;
                                                                    int i14111119 = ((i14111118 ^ 125) | (i14111118 & 125)) << i3;
                                                                    int i141111110 = -(((~i14111118) & 125) | (i14111118 & (-126)));
                                                                    i4 = ((i14111119 | i141111110) << i3) - (i141111110 ^ i14111119);
                                                                    a = i4 % 128;
                                                                    if (i4 % 2 != 0) {
                                                                        Object obj14 = null;
                                                                        obj14.hashCode();
                                                                        throw null;
                                                                    }
                                                                    if (d >= 3285.0d) {
                                                                        if (d <= activityRoster.bI * 365) {
                                                                            int i141111111 = b;
                                                                            int i141111112 = (i141111111 & 91) + (i141111111 | 91);
                                                                            a = i141111112 % 128;
                                                                            i5 = i141111112 % 2;
                                                                            arrayList2.add(next);
                                                                            if (i5 != 0) {
                                                                                throw null;
                                                                            }
                                                                            int i141111113 = a;
                                                                            int i141111114 = (i141111113 & 123) + (i141111113 | 123);
                                                                            b = i141111114 % 128;
                                                                            int i141111115 = i141111114 % 2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int i1515 = b;
                                                        int i1516 = ((i1515 ^ 41) | (i1515 & 41)) << 1;
                                                        int i1517 = -(((~i1515) & 41) | (i1515 & (-42)));
                                                        int i1518 = ((i1516 | i1517) << 1) - (i1517 ^ i1516);
                                                        a = i1518 % 128;
                                                        int i1519 = i1518 % 2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                arrayList2.add(next);
                                int i160 = a;
                                int i161 = (i160 & 7) + (i160 | 7);
                                b = i161 % 128;
                                int i162 = i161 % 2;
                            } else {
                                if (strTrim2.contains("ہیومن پیپیلوما وائرس")) {
                                    int i131110 = b;
                                    int i131111 = i131110 & 123;
                                    i2 = (((i131110 | 123) & (~i131111)) - (~(-(-(i131111 << 1))))) - 1;
                                    a = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        int i14122 = 50 / 0;
                                        if (str.equalsIgnoreCase("female")) {
                                            i3 = 1;
                                            int i141111116 = b;
                                            int i141111117 = ((i141111116 ^ 125) | (i141111116 & 125)) << i3;
                                            int i141111118 = -(((~i141111116) & 125) | (i141111116 & (-126)));
                                            i4 = ((i141111117 | i141111118) << i3) - (i141111118 ^ i141111117);
                                            a = i4 % 128;
                                            if (i4 % 2 != 0) {
                                                Object obj15 = null;
                                                obj15.hashCode();
                                                throw null;
                                            }
                                            if (d >= 3285.0d) {
                                                if (d <= activityRoster.bI * 365) {
                                                    int i141111119 = b;
                                                    int i1411111110 = (i141111119 & 91) + (i141111119 | 91);
                                                    a = i1411111110 % 128;
                                                    i5 = i1411111110 % 2;
                                                    arrayList2.add(next);
                                                    if (i5 != 0) {
                                                        throw null;
                                                    }
                                                    int i1411111111 = a;
                                                    int i1411111112 = (i1411111111 & 123) + (i1411111111 | 123);
                                                    b = i1411111112 % 128;
                                                    int i1411111113 = i1411111112 % 2;
                                                }
                                            }
                                        }
                                    } else {
                                        i3 = 1;
                                        if (!(!str.equalsIgnoreCase("female"))) {
                                            int i1411111114 = b;
                                            int i1411111115 = ((i1411111114 ^ 125) | (i1411111114 & 125)) << i3;
                                            int i1411111116 = -(((~i1411111114) & 125) | (i1411111114 & (-126)));
                                            i4 = ((i1411111115 | i1411111116) << i3) - (i1411111116 ^ i1411111115);
                                            a = i4 % 128;
                                            if (i4 % 2 != 0) {
                                                Object obj16 = null;
                                                obj16.hashCode();
                                                throw null;
                                            }
                                            if (d >= 3285.0d) {
                                                if (d <= activityRoster.bI * 365) {
                                                    int i1411111117 = b;
                                                    int i1411111118 = (i1411111117 & 91) + (i1411111117 | 91);
                                                    a = i1411111118 % 128;
                                                    i5 = i1411111118 % 2;
                                                    arrayList2.add(next);
                                                    if (i5 != 0) {
                                                        throw null;
                                                    }
                                                    int i1411111119 = a;
                                                    int i14111111110 = (i1411111119 & 123) + (i1411111119 | 123);
                                                    b = i14111111110 % 128;
                                                    int i14111111111 = i14111111110 % 2;
                                                }
                                            }
                                        }
                                    }
                                }
                                int i15110 = b;
                                int i15111 = ((i15110 ^ 41) | (i15110 & 41)) << 1;
                                int i15112 = -(((~i15110) & 41) | (i15110 & (-42)));
                                int i15113 = ((i15111 | i15112) << 1) - (i15112 ^ i15111);
                                a = i15113 % 128;
                                int i15114 = i15113 % 2;
                            }
                            activityRoster4 = activityRoster;
                            linearLayout3 = linearLayout;
                            i8 = 2;
                            i10 = 1;
                        } else {
                            i8 = 2;
                        }
                    } else {
                        activityRoster = activityRoster4;
                        linearLayout = linearLayout3;
                    }
                    int i163 = b;
                    int i164 = (i163 ^ 95) + ((i163 & 95) << 1);
                    a = i164 % 128;
                    int i165 = i164 % 2;
                    activityRoster4 = activityRoster;
                    linearLayout3 = linearLayout;
                    i8 = 2;
                    i10 = 1;
                }
                final ActivityRoster activityRoster5 = activityRoster4;
                LinearLayout linearLayout4 = linearLayout3;
                ArrayList<String> arrayListL = activityRoster5.L(activityRoster5.bp);
                ArrayList<String> arrayListL2 = activityRoster5.L(activityRoster5.bq);
                int i166 = a;
                int i167 = ((i166 ^ 79) | (i166 & 79)) << 1;
                int i168 = -(((~i166) & 79) | (i166 & (-80)));
                int i169 = (i167 ^ i168) + ((i168 & i167) << 1);
                b = i169 % 128;
                int i170 = i169 % 2;
                if (arrayListL.isEmpty()) {
                    arrayListL = new ArrayList<>(Collections.singletonList("No options available"));
                    int i171 = a;
                    int i172 = i171 & 21;
                    int i173 = (i172 - (~(-(-((i171 ^ 21) | i172))))) - 1;
                    b = i173 % 128;
                    if (i173 % 2 != 0) {
                        int i174 = 5 / 2;
                    }
                }
                if (arrayListL2.isEmpty()) {
                    arrayListL2 = new ArrayList<>(Collections.singletonList("No reasons available"));
                }
                ArrayAdapter arrayAdapter = new ArrayAdapter(activityRoster5, android.R.layout.simple_spinner_item, arrayListL);
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(activityRoster5, android.R.layout.simple_spinner_item, arrayListL2);
                arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                Iterator it2 = arrayList2.iterator();
                int i175 = b;
                int i176 = (i175 ^ 81) + ((i175 & 81) << 1);
                a = i176 % 128;
                int i177 = i176 % 2;
                for (boolean z = true; !(it2.hasNext() ^ z); z = true) {
                    int i178 = a + 45;
                    b = i178 % 128;
                    int i179 = i178 % 2;
                    question_options question_optionsVar = (question_options) it2.next();
                    final LinearLayout linearLayout5 = linearLayout4;
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.vaccine_item, (ViewGroup) linearLayout5, false);
                    int i180 = b;
                    int i181 = ((i180 ^ 31) | (i180 & 31)) << 1;
                    int i182 = -(((~i180) & 31) | (i180 & (-32)));
                    int i183 = (i181 & i182) + (i182 | i181);
                    a = i183 % 128;
                    int i184 = i183 % 2;
                    CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.cb_vaccine);
                    final Spinner spinner2 = (Spinner) viewInflate.findViewById(R.id.spinner_response);
                    int i185 = b;
                    int i186 = (i185 & 75) + (i185 | 75);
                    a = i186 % 128;
                    int i187 = i186 % 2;
                    final Spinner spinner3 = (Spinner) viewInflate.findViewById(R.id.spinner_reason);
                    checkBox.setText(question_optionsVar.option);
                    checkBox.setTypeface(C0084m.b(activityRoster5, R.font.jameel_noori_nastaleeq));
                    spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
                    spinner3.setAdapter((SpinnerAdapter) arrayAdapter2);
                    spinner2.setVisibility(8);
                    spinner3.setVisibility(8);
                    checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ivas.gov.bisp.enumeration.bI.J
                        private static int a = 1;
                        private static int b;

                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                            Spinner spinner4;
                            int i188;
                            int i189 = 2 % 2;
                            int i190 = a;
                            int i191 = (i190 ^ 113) + ((i190 & 113) << 1);
                            int i192 = i191 % 128;
                            b = i192;
                            int i193 = i191 % 2;
                            ActivityRoster activityRoster6 = activityRoster5;
                            LinearLayout linearLayout6 = linearLayout5;
                            Spinner spinner5 = spinner2;
                            int i194 = (((i192 & (-12)) | ((~i192) & 11)) - (~(-(-((i192 & 11) << 1))))) - 1;
                            a = i194 % 128;
                            if (i194 % 2 == 0) {
                                spinner4 = spinner3;
                                int i195 = ActivityRoster.af;
                                int i196 = 60 / 0;
                            } else {
                                spinner4 = spinner3;
                                int i197 = ActivityRoster.af;
                            }
                            activityRoster6.J();
                            linearLayout6.getParent().requestDisallowInterceptTouchEvent(true);
                            int i198 = a;
                            int i199 = i198 & 49;
                            int i200 = ((~i199) & (i198 | 49)) + (i199 << 1);
                            b = i200 % 128;
                            if (i200 % 2 != 0) {
                                Object obj17 = null;
                                obj17.hashCode();
                                throw null;
                            }
                            if (z2) {
                                int i201 = ((i198 ^ 13) | (i198 & 13)) << 1;
                                int i202 = -(((~i198) & 13) | (i198 & (-14)));
                                int i203 = ((i201 | i202) << 1) - (i202 ^ i201);
                                b = i203 % 128;
                                i188 = i203 % 2 != 0 ? 1 : 0;
                            } else {
                                int i204 = (i198 & 113) + (i198 | 113);
                                b = i204 % 128;
                                int i205 = i204 % 2;
                                i188 = 8;
                            }
                            spinner5.setVisibility(i188);
                            if (!z2) {
                                int i206 = b;
                                int i207 = i206 & 5;
                                int i208 = (i206 | 5) & (~i207);
                                int i209 = i207 << 1;
                                int i210 = (i208 ^ i209) + ((i208 & i209) << 1);
                                a = i210 % 128;
                                int i211 = i210 % 2;
                                spinner4.setVisibility(8);
                                int i212 = b;
                                int i213 = i212 & 1;
                                int i214 = -(-((i212 ^ 1) | i213));
                                int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
                                a = i215 % 128;
                                int i216 = i215 % 2;
                            }
                            linearLayout6.getParent().requestDisallowInterceptTouchEvent(false);
                            int i217 = a + 35;
                            b = i217 % 128;
                            int i218 = i217 % 2;
                        }
                    });
                    spinner2.setOnItemSelectedListener(new W(activityRoster5, spinner3));
                    int i188 = b + 69;
                    a = i188 % 128;
                    if (i188 % 2 == 0) {
                        viewInflate.setTag(Integer.valueOf(question_optionsVar.option_id));
                        linearLayout5.addView(viewInflate);
                        Object obj17 = null;
                        obj17.hashCode();
                        throw null;
                    }
                    viewInflate.setTag(Integer.valueOf(question_optionsVar.option_id));
                    linearLayout5.addView(viewInflate);
                    linearLayout4 = linearLayout5;
                }
            }
            int i189 = a + 5;
            b = i189 % 128;
            int i190 = i189 % 2;
        }
    }

    public void P(double d) {
        int i = 2 % 2;
        int i2 = 0;
        this.linearLayoutCNIC.setVisibility(0);
        this.radioGroupCNICOptions.setVisibility(8);
        if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
            this.et_RosterCNIC.setVisibility(0);
            this.et_RosterCNICRepeat.setVisibility(0);
            this.buttonScanCNIC.setVisibility(8);
            this.btn_vald_cnic.setVisibility(8);
            if (this.aZ < 3) {
                this.btn_bio_cnic.setEnabled(true);
            } else {
                this.btn_bio_cnic.setEnabled(false);
            }
            this.por_roster.setVisibility(8);
        } else {
            this.et_RosterCNIC.setVisibility(8);
            this.et_RosterCNICRepeat.setVisibility(8);
            if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId() || this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
                this.por_roster.setVisibility(0);
                this.buttonScanCNIC.setVisibility(8);
                this.btn_vald_cnic.setVisibility(8);
                if (this.aZ < 3) {
                    this.btn_bio_cnic.setEnabled(true);
                } else {
                    this.btn_bio_cnic.setEnabled(false);
                }
            } else {
                int i3 = q + 125;
                p = i3 % 128;
                int i4 = i3 % 2;
                this.por_roster.setVisibility(8);
                this.buttonScanCNIC.setVisibility(8);
                this.btn_vald_cnic.setVisibility(8);
                int i5 = p + 61;
                q = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        this.et_RosterBForm.setEnabled(false);
        this.et_RosterBForm.setText(BuildConfig.FLAVOR);
        this.et_RosterBForm.setVisibility(8);
        this.et_RosterBFormRepeat.setEnabled(false);
        this.et_RosterBFormRepeat.setText(BuildConfig.FLAVOR);
        this.et_RosterBFormRepeat.setVisibility(8);
        if (d < 17.0d) {
            this.sp_marital_status.setSelection(0);
        }
        if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonMale.getId()) {
            if (d < 13.0d) {
                this.sp_marital_status.setVisibility(8);
            } else {
                this.sp_marital_status.setVisibility(0);
                int i7 = p + 51;
                q = i7 % 128;
                int i8 = i7 % 2;
            }
        } else if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonFemale.getId()) {
            if (d < 10.0d) {
                this.sp_marital_status.setVisibility(8);
            } else {
                this.sp_marital_status.setVisibility(0);
            }
        }
        if (d >= 4.0d) {
            this.tv_languageQuestion.setVisibility(0);
            this.radioGroupLanguage.setVisibility(0);
        } else {
            this.tv_languageQuestion.setVisibility(8);
            this.radioGroupLanguage.setVisibility(8);
        }
        this.radioButtonLanguage_yes.setChecked(false);
        this.radioButtonLanguage_no.setChecked(false);
        this.radioGroupLanguage.clearCheck();
        if (d >= 4.0d) {
            this.sp_attended_school.setVisibility(0);
            if (this.sp_attended_school.getSelectedItemPosition() == 2 || this.sp_attended_school.getSelectedItemPosition() == 3) {
                this.sp_highest_education.setVisibility(0);
            } else {
                this.sp_highest_education.setVisibility(8);
            }
        } else {
            this.sp_attended_school.setVisibility(8);
            this.sp_highest_education.setVisibility(8);
        }
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 27, (char) (getPackageName().length() - 25), getApplicationInfo().targetSdkVersion + 416, objArr);
        String strIntern = ((String) objArr[0]).intern();
        String string = getResources().getString(R.string.education_level);
        Spinner spinner = this.sp_highest_education;
        Object[] objArr2 = new Object[1];
        a(getPackageName().codePointAt(15) - 94, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 744, objArr2);
        new au(this, strIntern, string, spinner, ((String) objArr2[0]).intern(), new C0120m(this, d)).execute(new Void[0]);
        if (d < 10.0d) {
            int i9 = p + 29;
            q = i9 % 128;
            int i10 = i9 % 2;
            this.sp_work_activity.setVisibility(8);
            this.sp_work_activity.setSelection(0);
            this.sp_employment_status.setVisibility(8);
            this.sp_employment_status.setSelection(0);
            this.tv_workingHourQuestion.setVisibility(8);
            this.et_hoursWorked.setVisibility(8);
        } else {
            this.sp_work_activity.setVisibility(0);
            this.sp_work_activity.setSelection(0);
            this.sp_employment_status.setVisibility(0);
            this.sp_employment_status.setSelection(0);
        }
        int i11 = this.ac;
        if ((i11 == 1 || i11 == 2 || ag.d) && ag.j == 1) {
            if (d < 18.0d || this.radioGroupCNICOptions.getCheckedRadioButtonId() != this.radioButtonCNICPresent.getId() || this.et_RosterCNIC.length() != 15 || this.radioGroupGender.getCheckedRadioButtonId() != this.radioButtonFemale.getId() || this.sp_marital_status.getSelectedItemPosition() == 0 || this.sp_marital_status.getSelectedItemPosition() == 1) {
                this.checkBoxBispBenif.setVisibility(8);
                this.aY = false;
            } else {
                this.checkBoxBispBenif.setVisibility(0);
                this.aY = true;
            }
        }
        if (d == 0.0d) {
            int i12 = q + 117;
            p = i12 % 128;
            int i13 = i12 % 2;
            this.linearLayoutCNIC.setVisibility(0);
            this.linearLayoutCNICPic.setVisibility(8);
            this.radioGroupCNICOptions.setVisibility(8);
            this.et_RosterCNIC.setVisibility(0);
            this.et_RosterCNIC.setEnabled(false);
            this.buttonScanCNIC.setVisibility(8);
            this.btn_vald_cnic.setVisibility(8);
            this.et_RosterCNICRepeat.setVisibility(0);
            this.et_RosterCNICRepeat.setEnabled(false);
            this.et_RosterBForm.setEnabled(false);
            this.et_RosterBForm.setText(BuildConfig.FLAVOR);
            this.et_RosterBForm.setVisibility(8);
            this.sp_marital_status.setVisibility(0);
            this.et_RosterBFormRepeat.setEnabled(false);
            this.et_RosterBFormRepeat.setText(BuildConfig.FLAVOR);
            this.et_RosterBFormRepeat.setVisibility(8);
            this.tv_languageQuestion.setVisibility(0);
            this.radioGroupLanguage.setVisibility(0);
            this.radioGroupGender.setEnabled(true);
            int i14 = 0;
            while (i14 < this.radioGroupGender.getChildCount()) {
                i14 = ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupGender, i14, true, i14, 1);
            }
            while (i2 < this.radioGroupCalendar.getChildCount()) {
                i2 = ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupCalendar, i2, true, i2, 1);
            }
            this.por_roster.setVisibility(8);
        }
    }

    private static void a(int i, char c, int i2, Object[] objArr) {
        int i3;
        int i4 = 2 % 2;
        o.e eVar = new o.e();
        long[] jArr = new long[i];
        eVar.d = 0;
        while (eVar.d < i) {
            int i5 = $11 + 23;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            jArr[eVar.d] = (((long) ((char) (((long) e$s2$41144[i2 + eVar.d]) ^ (-9150281428767639173L)))) ^ (((long) eVar.d) * ((-9150281428767639173L) ^ d$s3$41144))) ^ ((long) c);
            eVar.d++;
        }
        char[] cArr = new char[i];
        eVar.d = 0;
        while (eVar.d < i) {
            int i7 = $10 + 39;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[eVar.d] = (char) jArr[eVar.d];
                i3 = eVar.d >> 1;
            } else {
                cArr[eVar.d] = (char) jArr[eVar.d];
                i3 = eVar.d + 1;
            }
            eVar.d = i3;
        }
        objArr[0] = new String(cArr);
    }
}
