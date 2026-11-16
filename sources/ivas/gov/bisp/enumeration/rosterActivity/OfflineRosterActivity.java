package ivas.gov.bisp.enumeration.rosterActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import butterknife.BindView;
import butterknife.OnClick;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.BaseActivity;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.W.a;
import ivas.gov.bisp.enumeration.bI.B;
import ivas.gov.bisp.enumeration.bI.C0123q;
import ivas.gov.bisp.enumeration.bI.E;
import ivas.gov.bisp.enumeration.bI.F;
import ivas.gov.bisp.enumeration.bI.K;
import ivas.gov.bisp.enumeration.bI.U;
import ivas.gov.bisp.enumeration.bI.Y;
import ivas.gov.bisp.enumeration.bI.Z;
import ivas.gov.bisp.enumeration.bI.aa;
import ivas.gov.bisp.enumeration.bI.ab;
import ivas.gov.bisp.enumeration.bI.ad;
import ivas.gov.bisp.enumeration.bI.ae;
import ivas.gov.bisp.enumeration.bI.ai;
import ivas.gov.bisp.enumeration.bI.al;
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
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p035bh.C0145s;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0204j;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0217y;
import ivas.gov.bisp.enumeration.p043bp.am;
import ivas.gov.bisp.enumeration.p051bx.o;
import ivas.gov.bisp.enumeration.p085h.k;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.UUID;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class OfflineRosterActivity extends BaseActivity {
    public static final /* synthetic */ int af = 0;
    private static int p = 1;
    private static int q;
    public ArrayList<String> aG;
    public ArrayList<Item> aH;
    public ArrayList<Item> aI;
    public ArrayList<Item> aJ;
    public o aK;
    public ArrayList<String> aL;
    public Roster aN;
    public ArrayList<Roster> aO;
    public boolean aP;
    public CountDownTimer aT;
    public File aY;
    public int aZ;
    public Button ag;
    public ImageView ah;
    public ivas.gov.bisp.enumeration.p037bj.c aj;
    public ArrayList<Item> bA;
    public Bitmap bB;
    public int bb;
    public boolean bc;
    public int bd;
    public String be;
    public ArrayList<Item> bj;
    public Dialog bl;
    public ArrayList<Item> br;
    public ArrayList<Item> bs;

    @BindView
    public Button btn_bio_cnic;

    @BindView
    public Button btn_save;

    @BindView
    public Button btn_vald_cnic;
    public ArrayList<Item> bu;

    @BindView
    public Button buttonScanCNIC;
    public BISPApplication bv;

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
    public LinearLayout ll_bank_info;

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
    public int ai = 0;
    public int ak = 256;
    public int al = 360;
    public final byte[] bk = new byte[92160];
    public String[] bm = new String[0];
    public String bn = BuildConfig.FLAVOR;
    public String bq = BuildConfig.FLAVOR;
    public String bz = BuildConfig.FLAVOR;
    public String bp = BuildConfig.FLAVOR;
    public String bo = BuildConfig.FLAVOR;
    public String bw = BuildConfig.FLAVOR;
    public String bx = BuildConfig.FLAVOR;
    public boolean by = false;
    public boolean bt = false;
    public int aM = 0;
    public double aQ = 0.0d;
    public boolean aF = false;
    public Survey bh = null;
    public boolean bg = false;
    public String aS = BuildConfig.FLAVOR;
    public AdapterView.OnItemSelectedListener aU = new OooOO0O();
    public AdapterView.OnItemSelectedListener bi = new OooOOO0();
    public AdapterView.OnItemSelectedListener aR = new OooOOO();
    public AdapterView.OnItemSelectedListener aW = new OooOOOO();
    public AdapterView.OnItemSelectedListener aV = new OooOo00();
    public AdapterView.OnItemSelectedListener aX = new OooO00o();
    public boolean ba = false;
    public Handler bf = new OooO0OO();

    public class OooO implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public OooO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 59;
            int i5 = (i3 ^ 59) | i4;
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            OfflineRosterActivity.this.sp_highest_education.setSelection(i);
            int i8 = a;
            int i9 = (i8 | 101) << 1;
            int i10 = -(i8 ^ 101);
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 91 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 97) | (i2 & 97)) << 1;
            int i4 = -(((~i2) & 97) | (i2 & (-98)));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 88 / 0;
            }
        }
    }

    public class OooO00o implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0099  */
        /* JADX WARN: Code duplicated, block: B:21:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:36:0x010a  */
        /* JADX WARN: Code duplicated, block: B:37:0x011f  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int selectedItemPosition;
            Spinner spinner;
            int i2;
            int i3 = 2 % 2;
            int i4 = a + 61;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                OfflineRosterActivity.this.radioGroupCalendar.getCheckedRadioButtonId();
                RadioButton radioButton = OfflineRosterActivity.this.radioButtonCalendarNo;
                throw null;
            }
            int checkedRadioButtonId = OfflineRosterActivity.this.radioGroupCalendar.getCheckedRadioButtonId();
            RadioButton radioButton2 = OfflineRosterActivity.this.radioButtonCalendarNo;
            int i5 = a;
            int i6 = i5 & 81;
            int i7 = (i6 - (~(-(-((i5 ^ 81) | i6))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            if (checkedRadioButtonId == radioButton2.getId()) {
                int i9 = a;
                int i10 = i9 & 47;
                int i11 = (i9 | 47) & (~i10);
                int i12 = i10 << 1;
                int i13 = (i11 & i12) + (i11 | i12);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    OfflineRosterActivity offlineRosterActivity = OfflineRosterActivity.this;
                    offlineRosterActivity.aQ = offlineRosterActivity.spinnerYear.getSelectedItemPosition();
                    int i14 = 56 / 0;
                } else {
                    OfflineRosterActivity offlineRosterActivity2 = OfflineRosterActivity.this;
                    offlineRosterActivity2.aQ = offlineRosterActivity2.spinnerYear.getSelectedItemPosition();
                }
                OfflineRosterActivity offlineRosterActivity3 = OfflineRosterActivity.this;
                double d = offlineRosterActivity3.aQ;
                int i15 = b;
                int i16 = i15 ^ 97;
                int i17 = ((i15 & 97) | i16) << 1;
                int i18 = -i16;
                int i19 = (i17 & i18) + (i18 | i17);
                a = i19 % 128;
                int i20 = i19 % 2;
                if (d <= 0.0d) {
                    int i21 = i15 + 60;
                    int i22 = (i21 ^ (-1)) + (i21 << 1);
                    int i23 = i22 % 128;
                    a = i23;
                    if (i22 % 2 != 0 ? d == 0.0d : d == 0.0d) {
                        int i24 = i23 + 5;
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        if (i > 0) {
                            selectedItemPosition = offlineRosterActivity3.spinnerMonth.getSelectedItemPosition();
                            spinner = OfflineRosterActivity.this.spinnerYear;
                            int i26 = b;
                            i2 = ((i26 | 97) << 1) - (i26 ^ 97);
                            a = i2 % 128;
                            if (i2 % 2 != 0) {
                                OfflineRosterActivity.u(offlineRosterActivity3, 1, selectedItemPosition, spinner.getSelectedItemPosition());
                                throw null;
                            }
                            OfflineRosterActivity.u(offlineRosterActivity3, 1, selectedItemPosition, spinner.getSelectedItemPosition());
                        }
                    }
                } else {
                    selectedItemPosition = offlineRosterActivity3.spinnerMonth.getSelectedItemPosition();
                    spinner = OfflineRosterActivity.this.spinnerYear;
                    int i27 = b;
                    i2 = ((i27 | 97) << 1) - (i27 ^ 97);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        OfflineRosterActivity.u(offlineRosterActivity3, 1, selectedItemPosition, spinner.getSelectedItemPosition());
                        throw null;
                    }
                    OfflineRosterActivity.u(offlineRosterActivity3, 1, selectedItemPosition, spinner.getSelectedItemPosition());
                }
                OfflineRosterActivity offlineRosterActivity4 = OfflineRosterActivity.this;
                offlineRosterActivity4.P(offlineRosterActivity4.aQ);
                int i28 = b;
                int i29 = i28 & 57;
                int i30 = -(-(i28 | 57));
                int i31 = (i29 & i30) + (i30 | i29);
                a = i31 % 128;
                int i32 = i31 % 2;
                OfflineRosterActivity offlineRosterActivity5 = OfflineRosterActivity.this;
                double d2 = offlineRosterActivity5.aQ;
                int i33 = a;
                int i34 = i33 & 23;
                int i35 = -(-(i33 | 23));
                int i36 = (i34 & i35) + (i35 | i34);
                int i37 = i36 % 128;
                b = i37;
                if (i36 % 2 == 0 ? d2 > 0.0d : d2 > 1.0d) {
                    offlineRosterActivity5.I(d2);
                    int i38 = a;
                    int i39 = (-2) - (((i38 ^ 22) + ((i38 & 22) << 1)) ^ (-1));
                    b = i39 % 128;
                    int i40 = i39 % 2;
                } else if (d2 == 0.0d) {
                    int i41 = i37 & 31;
                    int i42 = ((i37 | 31) & (~i41)) + (i41 << 1);
                    a = i42 % 128;
                    if (i42 % 2 == 0) {
                        throw null;
                    }
                    if (i > 0) {
                        offlineRosterActivity5.I(d2);
                        int i310 = a;
                        int i311 = (-2) - (((i310 ^ 22) + ((i310 & 22) << 1)) ^ (-1));
                        b = i311 % 128;
                        int i43 = i311 % 2;
                    }
                }
            }
            int i44 = a + 11;
            b = i44 % 128;
            if (i44 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }

    public class OooO0O0 implements Runnable {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ String c;

        public OooO0O0(String str) {
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a + 122;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                OfflineRosterActivity offlineRosterActivity = OfflineRosterActivity.this;
                int i4 = OfflineRosterActivity.af;
                AppCompatActivity appCompatActivity = offlineRosterActivity.ae;
                throw null;
            }
            OfflineRosterActivity offlineRosterActivity2 = OfflineRosterActivity.this;
            int i5 = OfflineRosterActivity.af;
            Toast.makeText(offlineRosterActivity2.ae, this.c, 0).show();
            int i6 = b;
            int i7 = i6 ^ 47;
            int i8 = (i6 & 47) << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0OO extends Handler {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 19) << 1;
            int i4 = -(i2 ^ 19);
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = message.what;
            if (i6 != 0) {
                throw null;
            }
            if (i7 == 0) {
                int i8 = a;
                int i9 = (i8 ^ 91) + ((i8 & 91) << 1);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    Objects.requireNonNull(OfflineRosterActivity.this);
                    throw null;
                }
                Objects.requireNonNull(OfflineRosterActivity.this);
            }
            int i10 = a;
            int i11 = (-2) - ((((i10 | 100) << 1) - (i10 ^ 100)) ^ (-1));
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 98 / 0;
            }
        }
    }

    public class OooO0o implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Spinner c;

        public OooO0o(OfflineRosterActivity offlineRosterActivity, Spinner spinner) {
            this.c = spinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 | 53) << 1) - (~(-((i3 & (-54)) | ((~i3) & 53))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            if (i != 0) {
                this.c.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i6 = a;
                int i7 = (i6 & 21) + (i6 | 21);
                b = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            int i9 = i3 & 53;
            int i10 = ((i3 ^ 53) | i9) << 1;
            int i11 = -((i3 | 53) & (~i9));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            int i13 = i12 % 2;
            this.c.setBackgroundResource(R.drawable.spinner_bg);
            int i14 = a;
            int i15 = i14 ^ 7;
            int i16 = (((i14 & 7) | i15) << 1) - i15;
            b = i16 % 128;
            int i17 = i16 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-26)) | ((~i2) & 25);
            int i4 = -(-((i2 & 25) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooOO0O implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0O() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((((i2 ^ 71) | (i2 & 71)) << 1) - (~(-(((~i2) & 71) | (i2 & (-72)))))) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 ^ 49;
            int i5 = (((i3 & 49) | i4) << 1) - i4;
            int i6 = i5 % 128;
            b = i6;
            Object obj = null;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (i == 0) {
                int i7 = (-2) - ((i6 + 92) ^ (-1));
                a = i7 % 128;
                int i8 = i7 % 2;
                OfflineRosterActivity.this.sp_attended_school.setBackgroundResource(R.drawable.spinner_bg);
                int i9 = b;
                int i10 = i9 & 53;
                int i11 = i9 | 53;
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                int i13 = i12 % 2;
            } else {
                OfflineRosterActivity.this.sp_attended_school.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i14 = b;
                int i15 = ((i14 ^ 29) | (i14 & 29)) << 1;
                int i16 = -(((~i14) & 29) | (i14 & (-30)));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            if (OfflineRosterActivity.this.sp_attended_school.getSelectedItemPosition() != 0) {
                int i19 = a + 37;
                b = i19 % 128;
                int i20 = i19 % 2;
                OfflineRosterActivity offlineRosterActivity = OfflineRosterActivity.this;
                ArrayList<Item> arrayList = offlineRosterActivity.bj;
                Spinner spinner = offlineRosterActivity.sp_attended_school;
                int i21 = b;
                int i22 = (i21 ^ 55) + ((i21 & 55) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
                int optionId = arrayList.get(spinner.getSelectedItemPosition()).getOptionId();
                if (i23 == 0 ? optionId != 25 : optionId != 121) {
                    OfflineRosterActivity.this.sp_highest_education.setVisibility(0);
                    int i24 = a;
                    int i25 = i24 & 51;
                    int i26 = -(-((i24 ^ 51) | i25));
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    b = i27 % 128;
                    if (i27 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            OfflineRosterActivity.this.sp_highest_education.setVisibility(8);
            int i28 = b + 42;
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
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
            int i3 = a;
            int i4 = ((i3 ^ 116) + ((i3 & 116) << 1)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (i == 0) {
                int i6 = (i3 ^ 83) + ((i3 & 83) << 1);
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    OfflineRosterActivity.this.sp_work_activity.setBackgroundResource(R.drawable.spinner_bg);
                    int i7 = 80 / 0;
                } else {
                    OfflineRosterActivity.this.sp_work_activity.setBackgroundResource(R.drawable.spinner_bg);
                }
            } else {
                OfflineRosterActivity.this.sp_work_activity.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i8 = b + 119;
                a = i8 % 128;
                int i9 = i8 % 2;
            }
            if (i == 1) {
                int i10 = b;
                int i11 = (-2) - (((i10 ^ 48) + ((i10 & 48) << 1)) ^ (-1));
                a = i11 % 128;
                int i12 = i11 % 2;
                OfflineRosterActivity.this.tv_workingHourQuestion.setVisibility(0);
                int i13 = a;
                int i14 = ((i13 & (-104)) | ((~i13) & 103)) + ((i13 & 103) << 1);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    OfflineRosterActivity.this.et_hoursWorked.setVisibility(1);
                    return;
                } else {
                    OfflineRosterActivity.this.et_hoursWorked.setVisibility(0);
                    return;
                }
            }
            OfflineRosterActivity.this.tv_workingHourQuestion.setVisibility(8);
            int i15 = a;
            int i16 = i15 & 79;
            int i17 = (((i15 ^ 79) | i16) << 1) - ((i15 | 79) & (~i16));
            b = i17 % 128;
            int i18 = i17 % 2;
            OfflineRosterActivity.this.et_hoursWorked.setVisibility(8);
            int i19 = a;
            int i20 = ((i19 ^ 59) | (i19 & 59)) << 1;
            int i21 = -(((~i19) & 59) | (i19 & (-60)));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 87 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 105;
            int i4 = (i2 | 105) & (~i3);
            int i5 = i3 << 1;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static /* synthetic */ boolean A(OfflineRosterActivity offlineRosterActivity, boolean z, String str) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 75;
        int i4 = i3 + ((i2 ^ 75) | i3);
        q = i4 % 128;
        int i5 = i4 % 2;
        boolean zS = offlineRosterActivity.S(z, str);
        int i6 = q;
        int i7 = (((i6 & (-66)) | ((~i6) & 65)) - (~((i6 & 65) << 1))) - 1;
        p = i7 % 128;
        int i8 = i7 % 2;
        return zS;
    }

    public static /* synthetic */ boolean B(OfflineRosterActivity offlineRosterActivity) {
        int i = 2 % 2;
        int i2 = p + 81;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            return offlineRosterActivity.bc;
        }
        int i3 = 16 / 0;
        return offlineRosterActivity.bc;
    }

    public static /* synthetic */ Roster v(OfflineRosterActivity offlineRosterActivity) {
        int i = 2 % 2;
        int i2 = q + 75;
        p = i2 % 128;
        int i3 = i2 % 2;
        Roster roster = offlineRosterActivity.aN;
        if (i3 != 0) {
            return roster;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ArrayList w(OfflineRosterActivity offlineRosterActivity) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 & (-64)) | ((~i2) & 63)) + ((i2 & 63) << 1);
        int i4 = i3 % 128;
        q = i4;
        int i5 = i3 % 2;
        Object obj = null;
        ArrayList<Roster> arrayList = offlineRosterActivity.aO;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 & 65;
        int i7 = ((i4 ^ 65) | i6) << 1;
        int i8 = -((i4 | 65) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        p = i9 % 128;
        if (i9 % 2 != 0) {
            return arrayList;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Survey x(OfflineRosterActivity offlineRosterActivity) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (((i2 | 44) << 1) - (i2 ^ 44)) - 1;
        q = i3 % 128;
        int i4 = i3 % 2;
        Survey survey = offlineRosterActivity.bh;
        if (i4 == 0) {
            return survey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ byte[] y(OfflineRosterActivity offlineRosterActivity) {
        int i = 2 % 2;
        int i2 = q + 115;
        p = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(offlineRosterActivity);
        int i4 = q;
        int i5 = ((i4 & 96) + (i4 | 96)) - 1;
        p = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public void I(double d) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 111;
        int i4 = i2 | 111;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        p = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            this.sp_relation_to_household.getSelectedItemPosition();
            obj.hashCode();
            throw null;
        }
        if (this.sp_relation_to_household.getSelectedItemPosition() != 0) {
            int i6 = p;
            int i7 = (i6 & 57) + (i6 | 57);
            q = i7 % 128;
            int i8 = i7 % 2;
            Item item = this.bu.get(this.sp_relation_to_household.getSelectedItemPosition());
            int i9 = p;
            int i10 = (i9 ^ 6) + ((i9 & 6) << 1);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            q = i11 % 128;
            int i12 = i11 % 2;
            if (item.getOptionId() == 186) {
                int i13 = q;
                int i14 = i13 + 85;
                p = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                if (d < 18.0d) {
                    int i15 = i13 ^ 63;
                    int i16 = ((((i13 & 63) | i15) << 1) - (~(-i15))) - 1;
                    p = i16 % 128;
                    int i17 = i16 % 2;
                    C0104p.c().d(this.ae, "Warning", "You can't add household of age less than 18 years?", new al(this, 1), false);
                    int i18 = p;
                    int i19 = i18 & 25;
                    int i20 = i19 + ((i18 ^ 25) | i19);
                    q = i20 % 128;
                    int i21 = i20 % 2;
                }
            }
        }
        int i22 = q;
        int i23 = i22 & 87;
        int i24 = (((i22 | 87) & (~i23)) - (~(-(-(i23 << 1))))) - 1;
        p = i24 % 128;
        int i25 = i24 % 2;
    }

    public void O(ArrayList<Item> arrayList, Spinner spinner) {
        int i = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList);
        int i2 = q + 91;
        p = i2 % 128;
        int i3 = i2 % 2;
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new OooO0o(this, spinner));
        int i4 = q + 108;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        p = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean S(boolean z, String str) {
        int i = 2 % 2;
        runOnUiThread(new OooO0O0(str));
        int i2 = p;
        int i3 = i2 ^ 31;
        int i4 = ((i2 & 31) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        q = i6 % 128;
        int i7 = i6 % 2;
        if (z) {
            int i8 = (i2 & 65) + (i2 | 65);
            q = i8 % 128;
            return i8 % 2 != 0;
        }
        int i9 = i2 & 119;
        int i10 = (i2 ^ 119) | i9;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        q = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    @OnClick
    public void onCnicImageClick(View view) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((i2 & 116) + (i2 | 116)) - 1;
        p = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @OnClick
    public void onCnicPic(View view) {
        int i = 2 % 2;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        AppCompatActivity appCompatActivity = this.ae;
        int i2 = q + 111;
        p = i2 % 128;
        int i3 = i2 % 2;
        if (intent.resolveActivity(appCompatActivity.getPackageManager()) != null) {
            int i4 = p;
            int i5 = i4 & 93;
            int i6 = (i4 | 93) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            q = i8 % 128;
            int i9 = i8 % 2;
            try {
                this.aY = H();
                int i10 = q + 37;
                p = i10 % 128;
                int i11 = i10 % 2;
            } catch (IOException unused) {
                Toast.makeText(this.ae, "Error loading image", 0).show();
            }
            File file = this.aY;
            if (file != null) {
                int i12 = p;
                int i13 = ((i12 & (-16)) | ((~i12) & 15)) + ((i12 & 15) << 1);
                q = i13 % 128;
                int i14 = i13 % 2;
                FileProvider.OooO00o oooO00oC = FileProvider.c(this.ae, "ivas.gov.bisp.enumeration.camera");
                int i15 = q;
                int i16 = (((i15 & (-88)) | ((~i15) & 87)) - (~(-(-((i15 & 87) << 1))))) - 1;
                p = i16 % 128;
                int i17 = i16 % 2;
                Uri uriE = oooO00oC.e(file);
                int i18 = p;
                int i19 = i18 & 9;
                int i20 = (i19 - (~(-(-((i18 ^ 9) | i19))))) - 1;
                q = i20 % 128;
                int i21 = i20 % 2;
                intent.putExtra("output", uriE);
                AppCompatActivity appCompatActivity2 = this.ae;
                int i22 = p;
                int i23 = i22 & 75;
                int i24 = (i23 - (~(-(-((i22 ^ 75) | i23))))) - 1;
                q = i24 % 128;
                int i25 = i24 % 2;
                appCompatActivity2.startActivityForResult(intent, 1034);
                int i26 = p + 9;
                q = i26 % 128;
                int i27 = i26 % 2;
                return;
            }
            Toast.makeText(this.ae, "Error loading image", 0).show();
            int i28 = p;
            int i29 = (i28 ^ 45) + ((i28 & 45) << 1);
            q = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = 5 / 2;
            }
        }
        int i31 = q;
        int i32 = i31 & 47;
        int i33 = i32 + ((i31 ^ 47) | i32);
        p = i33 % 128;
        int i34 = i33 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
        p = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = (i2 & (-2)) | ((~i2) & 1);
        int i5 = (i2 & 1) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        p = i6 % 128;
        if (i6 % 2 != 0) {
            return R.layout.activity_offline_roster;
        }
        throw null;
    }

    @OnClick
    public void saveToRosterList(View view) {
        int i = 2 % 2;
        new OooOo(this).execute(new Void[0]);
        int i2 = p;
        int i3 = (((i2 | 70) << 1) - (i2 ^ 70)) - 1;
        q = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
    }

    public class OooOo extends AsyncTask<Void, Integer, Boolean> {
        private static int a = 1;
        private static int b;
        public ProgressDialog c;
        public Context d;

        public OooOo(Context context) {
            this.d = context;
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 83;
            int i4 = i3 + ((i2 ^ 83) | i3);
            b = i4 % 128;
            if (i4 % 2 == 0) {
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
                int i2 = b + 61;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    this.c = progressDialog;
                } else {
                    this.c = progressDialog;
                }
                progressDialog.setCancelable(false);
                ProgressDialog progressDialog2 = this.c;
                int i3 = b;
                int i4 = i3 & 115;
                int i5 = (i3 | 115) & (~i4);
                int i6 = i4 << 1;
                int i7 = (i5 & i6) + (i5 | i6);
                a = i7 % 128;
                int i8 = i7 % 2;
                progressDialog2.setTitle("Validating roster");
                ProgressDialog progressDialog3 = this.c;
                int i9 = a;
                int i10 = i9 & 49;
                int i11 = (i9 ^ 49) | i10;
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    progressDialog3.setMessage("Please Wait...");
                    this.c.setIndeterminate(false);
                } else {
                    progressDialog3.setMessage("Please Wait...");
                    this.c.setIndeterminate(true);
                }
                ProgressDialog progressDialog4 = this.c;
                int i13 = a;
                int i14 = i13 | 113;
                int i15 = i14 << 1;
                int i16 = -((~(i13 & 113)) & i14);
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    progressDialog4.show();
                } else {
                    progressDialog4.show();
                    throw null;
                }
            } catch (Exception unused) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        
            if ((!ivas.gov.bisp.enumeration.p024ax.ax.c(r7.e)) != true) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        
            if (ivas.gov.bisp.enumeration.p024ax.ax.c(r7.e) != true) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        
            r7.e.G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
        
            r8 = ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.b;
            r1 = (r8 ^ 1) + ((r8 & 1) << 1);
            ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
        
            if ((r1 % 2) == 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
        
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
        
            r8 = r7.e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
        
            if (r8.bt != false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
        
            r2 = ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.a + 21;
            ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
        
            if ((r2 % 2) == 0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
        
            r8 = r8.getApplicationContext();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
        
            android.widget.Toast.makeText(r8, "Please validate card!", 0).show();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
        
            r8 = r8.getApplicationContext();
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
        
            r8 = ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.b;
            r1 = (r8 ^ 49) + ((r8 & 49) << 1);
            ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
        
            if ((r1 % 2) == 0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ee, code lost:
        
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
        
            r8.G();
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
        
            r8 = ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.a;
            r1 = ((r8 & 44) + (r8 | 44)) - 1;
            ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        
            return;
         */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(java.lang.Boolean r8) {
            /*
                Method dump skipped, instruction units count: 439
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.onPostExecute(java.lang.Object):void");
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0267 A[Catch: Exception -> 0x0ef3, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0ef3, blocks: (B:3:0x0007, B:5:0x0025, B:10:0x003e, B:12:0x0048, B:22:0x0067, B:26:0x0090, B:28:0x009e, B:29:0x00a2, B:33:0x00a6, B:20:0x0059, B:18:0x004f, B:34:0x00ad, B:36:0x00c3, B:39:0x00ea, B:41:0x00f8, B:43:0x010b, B:46:0x0119, B:50:0x013c, B:52:0x0148, B:53:0x0151, B:54:0x0154, B:57:0x0157, B:61:0x017e, B:63:0x018a, B:64:0x0193, B:65:0x0196, B:68:0x0199, B:71:0x01af, B:77:0x01dd, B:79:0x01eb, B:85:0x01fc, B:88:0x0205, B:91:0x0224, B:84:0x01f0, B:93:0x0230, B:97:0x0259, B:98:0x0262, B:105:0x0286, B:103:0x0267, B:107:0x0289, B:110:0x02ad, B:112:0x02b3, B:115:0x02ce, B:117:0x02d4, B:118:0x02d9, B:122:0x02dd, B:124:0x02e7, B:126:0x02f5, B:128:0x0310, B:130:0x031c, B:132:0x0332, B:134:0x0348, B:136:0x0356, B:138:0x0364, B:140:0x037a, B:142:0x0384, B:144:0x03aa, B:146:0x03b2, B:149:0x03cb, B:151:0x03ce, B:152:0x03d0, B:156:0x03d4, B:158:0x03e6, B:161:0x03fa, B:163:0x040c, B:168:0x0439, B:166:0x0423, B:170:0x0447, B:172:0x0469, B:174:0x0488, B:176:0x0496, B:178:0x04a4, B:181:0x04d5, B:186:0x0501, B:188:0x050e, B:194:0x051f, B:197:0x052f, B:199:0x0541, B:201:0x0545, B:203:0x058f, B:207:0x059a, B:209:0x05a0, B:211:0x05b6, B:214:0x05bd, B:216:0x05c3, B:218:0x05df, B:220:0x05e7, B:222:0x060a, B:224:0x061a, B:227:0x0630, B:229:0x063c, B:235:0x064b, B:237:0x0651, B:234:0x0641, B:241:0x06a5, B:243:0x06ad, B:246:0x06c3, B:248:0x06cf, B:250:0x06f9, B:252:0x06ff, B:254:0x0707, B:257:0x0720, B:259:0x0737, B:260:0x073c, B:261:0x073f, B:264:0x0742, B:267:0x0763, B:270:0x0772, B:273:0x07a2, B:275:0x07a5, B:276:0x07a7, B:277:0x07aa, B:280:0x07ad, B:281:0x07b8, B:286:0x07d6, B:290:0x07ef, B:292:0x07fd, B:298:0x080e, B:297:0x0802, B:202:0x0572, B:193:0x0513, B:300:0x0811, B:345:0x0961, B:347:0x0973, B:349:0x097d, B:352:0x098e, B:363:0x09e3, B:365:0x09ed, B:367:0x09fb, B:369:0x0a05, B:371:0x0a13, B:373:0x0a1d, B:375:0x0a25, B:377:0x0a2f, B:380:0x0a47, B:382:0x0a51, B:384:0x0a5b, B:386:0x0a69, B:389:0x0a86, B:390:0x0a8a, B:391:0x0a8d, B:392:0x0a90, B:379:0x0a3d, B:395:0x0a93, B:397:0x0a9d, B:399:0x0aa9, B:401:0x0aac, B:403:0x0ab6, B:407:0x0ad1, B:409:0x0adf, B:410:0x0ae3, B:418:0x0afc, B:420:0x0b06, B:422:0x0b1c, B:424:0x0b2a, B:426:0x0b45, B:431:0x0b6a, B:433:0x0b74, B:435:0x0b7e, B:437:0x0b8c, B:428:0x0b53, B:430:0x0b67, B:414:0x0ae7, B:417:0x0af9, B:438:0x0b97, B:439:0x0b9a, B:443:0x0b9e, B:445:0x0ba2, B:447:0x0baa, B:450:0x0bcb, B:452:0x0bd7, B:454:0x0bee, B:456:0x0bf6, B:464:0x0c2b, B:466:0x0c43, B:468:0x0c5a, B:470:0x0c68, B:472:0x0c80, B:474:0x0c96, B:476:0x0cae, B:478:0x0cc4, B:480:0x0cdc, B:482:0x0cf2, B:484:0x0d0a, B:489:0x0d37, B:491:0x0d4f, B:494:0x0d7a, B:496:0x0d92, B:499:0x0daf, B:501:0x0dbe, B:506:0x0dc3, B:508:0x0dd1, B:510:0x0de9, B:512:0x0dff, B:515:0x0e15, B:520:0x0e3a, B:522:0x0e50, B:525:0x0e6f, B:530:0x0e80, B:532:0x0e93, B:534:0x0e9e, B:536:0x0eaa, B:538:0x0eaf, B:540:0x0ec7, B:528:0x0e78, B:518:0x0e28, B:542:0x0edd, B:543:0x0ee1, B:544:0x0ee4, B:547:0x0ee7, B:354:0x099c, B:357:0x09c3, B:359:0x09cd, B:361:0x09d5, B:302:0x081f, B:304:0x0835, B:306:0x0849, B:308:0x084c, B:310:0x086e, B:312:0x0874, B:315:0x0890, B:319:0x08ad, B:321:0x08bf, B:323:0x08cb, B:325:0x08e1, B:327:0x08f3, B:329:0x08ff, B:332:0x0919, B:334:0x0927, B:340:0x0938, B:343:0x0953, B:339:0x092c, B:316:0x089d, B:549:0x0eea, B:550:0x0eed, B:551:0x0ef0), top: B:576:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:535:0x0ea9  */
        /* JADX WARN: Code duplicated, block: B:95:0x0246  */
        /* JADX WARN: Code duplicated, block: B:97:0x0259 A[Catch: Exception -> 0x0ef3, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0ef3, blocks: (B:3:0x0007, B:5:0x0025, B:10:0x003e, B:12:0x0048, B:22:0x0067, B:26:0x0090, B:28:0x009e, B:29:0x00a2, B:33:0x00a6, B:20:0x0059, B:18:0x004f, B:34:0x00ad, B:36:0x00c3, B:39:0x00ea, B:41:0x00f8, B:43:0x010b, B:46:0x0119, B:50:0x013c, B:52:0x0148, B:53:0x0151, B:54:0x0154, B:57:0x0157, B:61:0x017e, B:63:0x018a, B:64:0x0193, B:65:0x0196, B:68:0x0199, B:71:0x01af, B:77:0x01dd, B:79:0x01eb, B:85:0x01fc, B:88:0x0205, B:91:0x0224, B:84:0x01f0, B:93:0x0230, B:97:0x0259, B:98:0x0262, B:105:0x0286, B:103:0x0267, B:107:0x0289, B:110:0x02ad, B:112:0x02b3, B:115:0x02ce, B:117:0x02d4, B:118:0x02d9, B:122:0x02dd, B:124:0x02e7, B:126:0x02f5, B:128:0x0310, B:130:0x031c, B:132:0x0332, B:134:0x0348, B:136:0x0356, B:138:0x0364, B:140:0x037a, B:142:0x0384, B:144:0x03aa, B:146:0x03b2, B:149:0x03cb, B:151:0x03ce, B:152:0x03d0, B:156:0x03d4, B:158:0x03e6, B:161:0x03fa, B:163:0x040c, B:168:0x0439, B:166:0x0423, B:170:0x0447, B:172:0x0469, B:174:0x0488, B:176:0x0496, B:178:0x04a4, B:181:0x04d5, B:186:0x0501, B:188:0x050e, B:194:0x051f, B:197:0x052f, B:199:0x0541, B:201:0x0545, B:203:0x058f, B:207:0x059a, B:209:0x05a0, B:211:0x05b6, B:214:0x05bd, B:216:0x05c3, B:218:0x05df, B:220:0x05e7, B:222:0x060a, B:224:0x061a, B:227:0x0630, B:229:0x063c, B:235:0x064b, B:237:0x0651, B:234:0x0641, B:241:0x06a5, B:243:0x06ad, B:246:0x06c3, B:248:0x06cf, B:250:0x06f9, B:252:0x06ff, B:254:0x0707, B:257:0x0720, B:259:0x0737, B:260:0x073c, B:261:0x073f, B:264:0x0742, B:267:0x0763, B:270:0x0772, B:273:0x07a2, B:275:0x07a5, B:276:0x07a7, B:277:0x07aa, B:280:0x07ad, B:281:0x07b8, B:286:0x07d6, B:290:0x07ef, B:292:0x07fd, B:298:0x080e, B:297:0x0802, B:202:0x0572, B:193:0x0513, B:300:0x0811, B:345:0x0961, B:347:0x0973, B:349:0x097d, B:352:0x098e, B:363:0x09e3, B:365:0x09ed, B:367:0x09fb, B:369:0x0a05, B:371:0x0a13, B:373:0x0a1d, B:375:0x0a25, B:377:0x0a2f, B:380:0x0a47, B:382:0x0a51, B:384:0x0a5b, B:386:0x0a69, B:389:0x0a86, B:390:0x0a8a, B:391:0x0a8d, B:392:0x0a90, B:379:0x0a3d, B:395:0x0a93, B:397:0x0a9d, B:399:0x0aa9, B:401:0x0aac, B:403:0x0ab6, B:407:0x0ad1, B:409:0x0adf, B:410:0x0ae3, B:418:0x0afc, B:420:0x0b06, B:422:0x0b1c, B:424:0x0b2a, B:426:0x0b45, B:431:0x0b6a, B:433:0x0b74, B:435:0x0b7e, B:437:0x0b8c, B:428:0x0b53, B:430:0x0b67, B:414:0x0ae7, B:417:0x0af9, B:438:0x0b97, B:439:0x0b9a, B:443:0x0b9e, B:445:0x0ba2, B:447:0x0baa, B:450:0x0bcb, B:452:0x0bd7, B:454:0x0bee, B:456:0x0bf6, B:464:0x0c2b, B:466:0x0c43, B:468:0x0c5a, B:470:0x0c68, B:472:0x0c80, B:474:0x0c96, B:476:0x0cae, B:478:0x0cc4, B:480:0x0cdc, B:482:0x0cf2, B:484:0x0d0a, B:489:0x0d37, B:491:0x0d4f, B:494:0x0d7a, B:496:0x0d92, B:499:0x0daf, B:501:0x0dbe, B:506:0x0dc3, B:508:0x0dd1, B:510:0x0de9, B:512:0x0dff, B:515:0x0e15, B:520:0x0e3a, B:522:0x0e50, B:525:0x0e6f, B:530:0x0e80, B:532:0x0e93, B:534:0x0e9e, B:536:0x0eaa, B:538:0x0eaf, B:540:0x0ec7, B:528:0x0e78, B:518:0x0e28, B:542:0x0edd, B:543:0x0ee1, B:544:0x0ee4, B:547:0x0ee7, B:354:0x099c, B:357:0x09c3, B:359:0x09cd, B:361:0x09d5, B:302:0x081f, B:304:0x0835, B:306:0x0849, B:308:0x084c, B:310:0x086e, B:312:0x0874, B:315:0x0890, B:319:0x08ad, B:321:0x08bf, B:323:0x08cb, B:325:0x08e1, B:327:0x08f3, B:329:0x08ff, B:332:0x0919, B:334:0x0927, B:340:0x0938, B:343:0x0953, B:339:0x092c, B:316:0x089d, B:549:0x0eea, B:550:0x0eed, B:551:0x0ef0), top: B:576:0x0007 }] */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r18.e.sp_networks.getSelectedItemPosition() == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
            if (r18.e.sp_networks.getSelectedItemPosition() == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            ivas.gov.bisp.enumeration.p026az.z.o(r18.d, r18.e.sp_networks, "Network Type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        
            return java.lang.Boolean.FALSE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            if (ivas.gov.bisp.enumeration.bK.ac.k(r18.e.et_mobile_number.getText().toString()) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        
            r0 = ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.b;
            r3 = r0 | 93;
            r4 = r3 << 1;
            r0 = -((~(r0 & 93)) & r3);
            r3 = (r4 ^ r0) + ((r0 & r4) << 1);
            ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.a = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        
            if ((r3 % 2) == 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
        
            ivas.gov.bisp.enumeration.p026az.z.k(r18.d, r18.e.et_mobile_number, "valid Mobile number");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            return java.lang.Boolean.FALSE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
        
            r0 = r18.e.et_mobile_number;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
        
            r18.e.et_mobile_number.getText();
         */
        /* JADX WARN: Code restructure failed: missing block: B:519:0x0e38, code lost:
        
            if (r7.get(r0.getSelectedItemPosition()).getOptionId() == 195) goto L520;
         */
        /* JADX WARN: Code restructure failed: missing block: B:529:0x0e7e, code lost:
        
            if (r0.getOptionId() == 196) goto L530;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Boolean c() {
            /*
                Method dump skipped, instruction units count: 3830
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.OooOo.c():java.lang.Boolean");
        }
    }

    public class o000oOoO extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;
        public ArrayList<question_options> c = new ArrayList<>();
        public int d;
        public a e;

        public o000oOoO(int i, a aVar) {
            this.d = i;
            this.e = aVar;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 45) + (i2 | 45);
            b = i3 % 128;
            int i4 = i3 % 2;
            ArrayList<question_options> arrayList = new ArrayList<>(AppDatabase.l(OfflineRosterActivity.this.getApplicationContext()).m().ah("martial_status"));
            int i5 = a;
            int i6 = ((i5 & (-74)) | ((~i5) & 73)) + ((i5 & 73) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            Object obj = null;
            this.c = arrayList;
            if (i7 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r5) {
            a aVar;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 27;
            int i4 = (((i2 ^ 27) | i3) << 1) - ((i2 | 27) & (~i3));
            a = i4 % 128;
            if (i4 % 2 == 0) {
                super.onPostExecute(r5);
                aVar = this.e;
                int i5 = 32 / 0;
            } else {
                super.onPostExecute(r5);
                aVar = this.e;
            }
            aVar.b(this.c, this.d);
            int i6 = b;
            int i7 = i6 & 59;
            int i8 = ((i6 ^ 59) | i7) << 1;
            int i9 = -((i6 | 59) & (~i7));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0073 A[LOOP:0: B:9:0x0030->B:14:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public static boolean C(Context context, String... strArr) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = (((i3 ^ 125) | (i3 & 125)) << 1) - ((i3 & (-126)) | ((~i3) & 125));
        q = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
            if (strArr != null) {
                length = strArr.length;
                int i6 = i3 + 4;
                int i7 = (i6 ^ (-1)) + (i6 << 1);
                q = i7 % 128;
                int i8 = i7 % 2;
                i = 0;
                while (i < length) {
                    int i9 = q;
                    int i10 = (((i9 ^ 61) | (i9 & 61)) << 1) - (((~i9) & 61) | (i9 & (-62)));
                    p = i10 % 128;
                    int i11 = i10 % 2;
                    if (l.b(context, strArr[i]) != 0) {
                        int i12 = q;
                        int i13 = (-2) - (((i12 ^ 76) + ((i12 & 76) << 1)) ^ (-1));
                        int i14 = i13 % 128;
                        p = i14;
                        int i15 = i13 % 2;
                        int i16 = (((i14 | 49) << 1) - (~(-(((~i14) & 49) | (i14 & (-50)))))) - 1;
                        q = i16 % 128;
                        int i17 = i16 % 2;
                        return false;
                    }
                    i = (((i ^ 1) | (i & 1)) << 1) - (((~i) & 1) | (i & (-2)));
                    int i18 = p;
                    int i19 = (i18 & 28) + (i18 | 28);
                    int i20 = (i19 ^ (-1)) + (i19 << 1);
                    q = i20 % 128;
                    int i21 = i20 % 2;
                }
            }
        } else if (strArr != null) {
            length = strArr.length;
            int i22 = i3 + 4;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            q = i23 % 128;
            int i24 = i23 % 2;
            i = 0;
            while (i < length) {
                int i25 = q;
                int i110 = (((i25 ^ 61) | (i25 & 61)) << 1) - (((~i25) & 61) | (i25 & (-62)));
                p = i110 % 128;
                int i111 = i110 % 2;
                if (l.b(context, strArr[i]) != 0) {
                    int i112 = q;
                    int i113 = (-2) - (((i112 ^ 76) + ((i112 & 76) << 1)) ^ (-1));
                    int i114 = i113 % 128;
                    p = i114;
                    int i115 = i113 % 2;
                    int i116 = (((i114 | 49) << 1) - (~(-(((~i114) & 49) | (i114 & (-50)))))) - 1;
                    q = i116 % 128;
                    int i117 = i116 % 2;
                    return false;
                }
                i = (((i ^ 1) | (i & 1)) << 1) - (((~i) & 1) | (i & (-2)));
                int i118 = p;
                int i119 = (i118 & 28) + (i118 | 28);
                int i26 = (i119 ^ (-1)) + (i119 << 1);
                q = i26 % 128;
                int i27 = i26 % 2;
            }
        }
        int i28 = p + 17;
        q = i28 % 128;
        if (i28 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void Q(String str, String str2) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 117;
        int i4 = ((i2 | 117) & (~i3)) + (i3 << 1);
        p = i4 % 128;
        int i5 = i4 % 2;
        this.tv_dob.setText(str);
        this.be = str2;
        int i6 = p;
        int i7 = i6 ^ 35;
        int i8 = (((i6 & 35) | i7) << 1) - i7;
        q = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    public static boolean z(OfflineRosterActivity offlineRosterActivity, double d, boolean z, boolean z2, boolean z3, String str) {
        boolean zS;
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 99;
        int i4 = (i3 - (~((i2 ^ 99) | i3))) - 1;
        int i5 = i4 % 128;
        p = i5;
        int i6 = i4 % 2;
        Object obj = null;
        if (!(!z2)) {
            int i7 = i2 | 101;
            int i8 = ((i7 << 1) - (~(-(i7 & (~(i2 & 101)))))) - 1;
            p = i8 % 128;
            int i9 = i8 % 2;
            if (z3) {
                int i10 = ((i2 ^ 88) + ((i2 & 88) << 1)) - 1;
                p = i10 % 128;
                int i11 = i10 % 2;
                if (d <= offlineRosterActivity.aQ) {
                    int i12 = i2 + 21;
                    p = i12 % 128;
                    if (i12 % 2 == 0) {
                        offlineRosterActivity.S(z, str);
                        throw null;
                    }
                    zS = offlineRosterActivity.S(z, str);
                    int i13 = q;
                    int i14 = (i13 ^ 13) + ((i13 & 13) << 1);
                    p = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    int i16 = p;
                    int i17 = (i16 | 51) << 1;
                    int i18 = -(i16 ^ 51);
                    int i19 = (i17 & i18) + (i18 | i17);
                    q = i19 % 128;
                    int i20 = i19 % 2;
                    zS = true;
                }
            } else if (d < offlineRosterActivity.aQ) {
                int i21 = i2 & 13;
                int i22 = (i2 ^ 13) | i21;
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                p = i23 % 128;
                if (i23 % 2 == 0) {
                    offlineRosterActivity.S(z, str);
                    obj.hashCode();
                    throw null;
                }
                zS = offlineRosterActivity.S(z, str);
            } else {
                int i110 = p;
                int i111 = (i110 | 51) << 1;
                int i112 = -(i110 ^ 51);
                int i113 = (i111 & i112) + (i112 | i111);
                q = i113 % 128;
                int i24 = i113 % 2;
                zS = true;
            }
        } else if (z3) {
            int i25 = i5 & 67;
            int i26 = (i5 ^ 67) | i25;
            int i27 = (i25 & i26) + (i25 | i26);
            int i28 = i27 % 128;
            q = i28;
            if (i27 % 2 != 0) {
                double d2 = offlineRosterActivity.aQ;
                throw null;
            }
            if (d >= offlineRosterActivity.aQ) {
                int i29 = (i28 & 11) + (i28 | 11);
                p = i29 % 128;
                if (i29 % 2 == 0) {
                    offlineRosterActivity.S(z, str);
                    throw null;
                }
                zS = offlineRosterActivity.S(z, str);
            } else {
                int i114 = p;
                int i115 = (i114 | 51) << 1;
                int i116 = -(i114 ^ 51);
                int i117 = (i115 & i116) + (i116 | i115);
                q = i117 % 128;
                int i210 = i117 % 2;
                zS = true;
            }
        } else if (d > offlineRosterActivity.aQ) {
            int i30 = (i2 & 49) + (i2 | 49);
            p = i30 % 128;
            int i31 = i30 % 2;
            zS = offlineRosterActivity.S(z, str);
            int i32 = p;
            int i33 = ((i32 ^ 20) + ((i32 & 20) << 1)) - 1;
            q = i33 % 128;
            int i34 = i33 % 2;
        } else {
            int i118 = p;
            int i119 = (i118 | 51) << 1;
            int i1110 = -(i118 ^ 51);
            int i1111 = (i119 & i1110) + (i1110 | i119);
            q = i1111 % 128;
            int i211 = i1111 % 2;
            zS = true;
        }
        int i35 = q;
        int i36 = (((i35 | 22) << 1) - (i35 ^ 22)) - 1;
        p = i36 % 128;
        int i37 = i36 % 2;
        return zS;
    }

    public final File H() throws IOException {
        String strT;
        int i = 2 % 2;
        int i2 = p;
        int i3 = (i2 & (-64)) | ((~i2) & 63);
        int i4 = (i2 & 63) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        q = i5 % 128;
        if (i5 % 2 != 0) {
            strT = ivas.gov.bisp.enumeration.p091n.j.t("JPEG_", ivas.gov.bisp.enumeration.p026az.z.e(), "_");
            int i6 = 65 / 0;
        } else {
            strT = ivas.gov.bisp.enumeration.p091n.j.t("JPEG_", ivas.gov.bisp.enumeration.p026az.z.e(), "_");
        }
        int i7 = q;
        int i8 = (((i7 | 50) << 1) - (i7 ^ 50)) - 1;
        p = i8 % 128;
        if (i8 % 2 == 0) {
            File.createTempFile(strT, ".jpg", this.ae.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
            throw null;
        }
        File fileCreateTempFile = File.createTempFile(strT, ".jpg", this.ae.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        fileCreateTempFile.getAbsolutePath();
        int i9 = p;
        int i10 = (i9 & (-14)) | ((~i9) & 13);
        int i11 = -(-((i9 & 13) << 1));
        int i12 = (i10 & i11) + (i11 | i10);
        q = i12 % 128;
        int i13 = i12 % 2;
        return fileCreateTempFile;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = p + 125;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            C0104p.c();
            AppCompatActivity appCompatActivity = this.ae;
            getResources();
            throw null;
        }
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity2 = this.ae;
        String string = getResources().getString(R.string.enter_data_lost);
        String string2 = getResources().getString(R.string.roster_exit);
        DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j = new DialogInterfaceOnClickListenerC0204j(this, 5);
        int i3 = p;
        int i4 = ((i3 ^ 25) | (i3 & 25)) << 1;
        int i5 = -(((~i3) & 25) | (i3 & (-26)));
        int i6 = (i4 & i5) + (i5 | i4);
        q = i6 % 128;
        int i7 = i6 % 2;
        c0104pC.h(appCompatActivity2, string, string2, dialogInterfaceOnClickListenerC0204j, null, false);
        int i8 = p + 3;
        q = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 72 / 0;
        }
    }

    @OnClick
    public void onDOB(View view) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (i2 & 71) + (i2 | 71);
        int i4 = i3 % 128;
        q = i4;
        int i5 = i3 % 2;
        Roster roster = this.aN;
        if (roster != null) {
            int i6 = ((((i4 ^ 97) | (i4 & 97)) << 1) - (~(-(((~i4) & 97) | (i4 & (-98)))))) - 1;
            p = i6 % 128;
            if (i6 % 2 != 0 ? roster.relation_to_household_id == 186 : roster.relation_to_household_id == 32687) {
                ArrayList<Roster> arrayList = this.aO;
                if (arrayList != null) {
                    int i7 = p;
                    int i8 = (i7 & 31) + (i7 | 31);
                    q = i8 % 128;
                    Object obj = null;
                    if (i8 % 2 != 0) {
                        arrayList.size();
                        obj.hashCode();
                        throw null;
                    }
                    if (arrayList.size() > 0 && this.aO.size() > 1) {
                        C0104p c0104pC = C0104p.c();
                        AppCompatActivity appCompatActivity = this.ae;
                        al alVar = new al(this, 0);
                        int i9 = p + 69;
                        q = i9 % 128;
                        c0104pC.h(appCompatActivity, "Warning", "If you change age of household then all added rosters will be removed. Are you sure you want to change age?? ", alVar, i9 % 2 != 0 ? DialogInterfaceOnClickListenerC0217y.c : DialogInterfaceOnClickListenerC0217y.c, true);
                        int i10 = q;
                        int i11 = ((i10 & 56) + (i10 | 56)) - 1;
                        p = i11 % 128;
                        if (i11 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
                int i12 = p;
                int i13 = i12 & 39;
                int i14 = (i12 | 39) & (~i13);
                int i15 = i13 << 1;
                int i16 = (i14 & i15) + (i14 | i15);
                q = i16 % 128;
                int i17 = i16 % 2;
                R();
                int i18 = q;
                int i19 = i18 & 121;
                int i20 = -(-((i18 ^ 121) | i19));
                int i21 = (i19 & i20) + (i20 | i19);
                p = i21 % 128;
                int i22 = i21 % 2;
                return;
            }
        }
        R();
        int i23 = q;
        int i24 = (i23 & 41) + (i23 | 41);
        p = i24 % 128;
        if (i24 % 2 == 0) {
            int i25 = 21 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 ^ 31;
        int i4 = ((i2 & 31) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        p = i6 % 128;
        int i7 = i6 % 2;
        super.onResume();
        if (!(!ax.c(this))) {
            int i8 = p;
            int i9 = i8 & 15;
            int i10 = (((i8 | 15) & (~i9)) - (~(i9 << 1))) - 1;
            q = i10 % 128;
            int i11 = i10 % 2;
            this.btn_vald_cnic.setEnabled(true);
        }
        int i12 = q;
        int i13 = ((i12 | 120) << 1) - (i12 ^ 120);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        p = i14 % 128;
        int i15 = i14 % 2;
    }

    public class OooOO0 implements RadioGroup.OnCheckedChangeListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int i2 = 2 % 2;
            int i3 = a + 107;
            b = i3 % 128;
            int i4 = i3 % 2;
            if (i == OfflineRosterActivity.this.radioButtonLanguage_yes.getId()) {
                int i5 = a + 107;
                b = i5 % 128;
                (i5 % 2 == 0 ? OfflineRosterActivity.this : OfflineRosterActivity.this).sp_attended_school.setVisibility(0);
                int i6 = b;
                int i7 = (i6 & (-74)) | ((~i6) & 73);
                int i8 = (i6 & 73) << 1;
                int i9 = (i7 & i8) + (i8 | i7);
                a = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
            if (i == OfflineRosterActivity.this.radioButtonLanguage_no.getId()) {
                int i11 = a;
                int i12 = ((i11 & (-8)) | ((~i11) & 7)) + ((i11 & 7) << 1);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    OfflineRosterActivity.this.sp_attended_school.setVisibility(9);
                } else {
                    OfflineRosterActivity.this.sp_attended_school.setVisibility(8);
                }
                OfflineRosterActivity offlineRosterActivity = OfflineRosterActivity.this;
                int i13 = b;
                int i14 = i13 & 35;
                int i15 = ((i13 | 35) & (~i14)) + (i14 << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                offlineRosterActivity.sp_attended_school.setSelection(0);
                if (OfflineRosterActivity.this.sp_highest_education.getVisibility() == 0) {
                    int i17 = b;
                    int i18 = (i17 | 57) << 1;
                    int i19 = -(i17 ^ 57);
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    a = i20 % 128;
                    if (i20 % 2 != 0) {
                        OfflineRosterActivity.this.sp_highest_education.setVisibility(81);
                    } else {
                        OfflineRosterActivity.this.sp_highest_education.setVisibility(8);
                    }
                    OfflineRosterActivity.this.sp_highest_education.setSelection(0);
                    int i21 = a;
                    int i22 = i21 & 63;
                    int i23 = ((i21 ^ 63) | i22) << 1;
                    int i24 = -((i21 | 63) & (~i22));
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            int i27 = b;
            int i28 = (i27 & 11) + (i27 | 11);
            a = i28 % 128;
            if (i28 % 2 != 0) {
                throw null;
            }
        }
    }

    public final void J() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 37;
        q = i3 % 128;
        if (i3 % 2 != 0) {
            this.by = false;
            this.bt = true;
        } else {
            this.by = false;
            this.bt = false;
        }
        TextView textView = this.vald_txt_view;
        int i4 = i2 & 61;
        int i5 = (i2 | 61) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        q = i7 % 128;
        int i8 = i7 % 2;
        textView.setText(BuildConfig.FLAVOR);
        TextView textView2 = this.vald_txt_view;
        Resources resources = getResources();
        int i9 = q;
        int i10 = i9 ^ 57;
        int i11 = ((i9 & 57) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        p = i13 % 128;
        if (i13 % 2 == 0) {
            textView2.setTextColor(resources.getColor(android.R.color.holo_green_dark));
            throw null;
        }
        textView2.setTextColor(resources.getColor(android.R.color.holo_green_dark));
        this.bn = BuildConfig.FLAVOR;
        this.bq = BuildConfig.FLAVOR;
        int i14 = q;
        int i15 = (((i14 & (-24)) | ((~i14) & 23)) - (~(-(-((i14 & 23) << 1))))) - 1;
        p = i15 % 128;
        int i16 = i15 % 2;
        this.bz = BuildConfig.FLAVOR;
        this.bp = BuildConfig.FLAVOR;
        int i17 = i14 & 17;
        int i18 = i17 + ((i14 ^ 17) | i17);
        p = i18 % 128;
        if (i18 % 2 == 0) {
            this.bo = BuildConfig.FLAVOR;
            this.bw = BuildConfig.FLAVOR;
            int i19 = 86 / 0;
        } else {
            this.bo = BuildConfig.FLAVOR;
            this.bw = BuildConfig.FLAVOR;
        }
        int i20 = i14 & 73;
        int i21 = i20 + ((i14 ^ 73) | i20);
        p = i21 % 128;
        int i22 = i21 % 2;
        this.bx = BuildConfig.FLAVOR;
        int i23 = (i14 & 61) + (i14 | 61);
        p = i23 % 128;
        if (i23 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CountDownTimer countDownTimer;
        int i;
        int i2 = 2 % 2;
        int i3 = p + 44;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        q = i4 % 128;
        int i5 = i4 % 2;
        super.onDestroy();
        int i6 = this.ac;
        Object obj = null;
        if (i6 != 1) {
            int i7 = q + 11;
            p = i7 % 128;
            if (i7 % 2 != 0 ? i6 == 2 : i6 == 5) {
                countDownTimer = this.aT;
                if (countDownTimer != null) {
                    int i8 = p;
                    int i9 = i8 ^ 81;
                    int i10 = -(-((i8 & 81) << 1));
                    int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                    q = i11 % 128;
                    i = i11 % 2;
                    countDownTimer.cancel();
                    if (i != 0) {
                        throw null;
                    }
                }
            }
        } else {
            countDownTimer = this.aT;
            if (countDownTimer != null) {
                int i12 = p;
                int i13 = i12 ^ 81;
                int i14 = -(-((i12 & 81) << 1));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                q = i15 % 128;
                i = i15 % 2;
                countDownTimer.cancel();
                if (i != 0) {
                    throw null;
                }
            }
        }
        int i16 = q;
        int i17 = i16 & 33;
        int i18 = (i16 | 33) & (~i17);
        int i19 = -(-(i17 << 1));
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        p = i20 % 128;
        if (i20 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @OnClick
    public void scanBioClicked(View view) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 ^ 41) | (i2 & 41)) << 1;
        int i4 = -(((~i2) & 41) | (i2 & (-42)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        q = i5 % 128;
        (i5 % 2 != 0 ? Toast.makeText(this, "Button Clicked", 1) : Toast.makeText(this, "Button Clicked", 0)).show();
        String[] strArr = this.bm;
        int i6 = q;
        int i7 = (i6 & (-94)) | ((~i6) & 93);
        int i8 = -(-((i6 & 93) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        p = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            C(this, strArr);
            obj.hashCode();
            throw null;
        }
        if (C(this, strArr)) {
            throw null;
        }
        int i10 = q + 75;
        p = i10 % 128;
        int i11 = i10 % 2;
        k.c(this, this.bm, this.ai);
        int i12 = q;
        int i13 = (i12 & 43) + (i12 | 43);
        p = i13 % 128;
        int i14 = i13 % 2;
    }

    public class Oooo0 implements TextWatcher {
        private static int a = 1;
        private static int b;
        public EditText c;

        public Oooo0(EditText editText) {
            this.c = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 89;
            int i4 = ((i2 & 89) | i3) << 1;
            int i5 = -i3;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b + 47;
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x02a3  */
        /* JADX WARN: Code duplicated, block: B:103:0x02b7  */
        /* JADX WARN: Code duplicated, block: B:105:0x02c8 A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x02da  */
        /* JADX WARN: Code duplicated, block: B:110:0x02f1  */
        /* JADX WARN: Code duplicated, block: B:114:0x0316  */
        /* JADX WARN: Code duplicated, block: B:116:0x0326 A[Catch: Exception -> 0x040d, TRY_ENTER, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:118:0x0330 A[Catch: Exception -> 0x040d, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:122:0x0345 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:123:0x0346  */
        /* JADX WARN: Code duplicated, block: B:129:0x0372 A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:132:0x038f A[Catch: Exception -> 0x040d, TRY_ENTER, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:133:0x0392 A[Catch: Exception -> 0x040d, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:136:0x03a0 A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:146:0x03d2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:147:0x03d3  */
        /* JADX WARN: Code duplicated, block: B:148:0x03d4 A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:153:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:155:0x03fe A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:0x0175 A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x017b  */
        /* JADX WARN: Code duplicated, block: B:50:0x0189 A[Catch: Exception -> 0x040d, TRY_ENTER, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x018f A[Catch: Exception -> 0x040d, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x01a4 A[Catch: Exception -> 0x040d, TRY_ENTER, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x01ac A[Catch: Exception -> 0x040d, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0202 A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x021b A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x0228 A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0268 A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x026c  */
        /* JADX WARN: Code duplicated, block: B:94:0x027b A[Catch: Exception -> 0x040d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x040d, blocks: (B:4:0x0017, B:6:0x0028, B:9:0x003b, B:22:0x00a9, B:27:0x00c4, B:29:0x00ca, B:31:0x00de, B:33:0x00fd, B:35:0x011d, B:37:0x013d, B:39:0x015b, B:76:0x022f, B:82:0x025b, B:85:0x0260, B:86:0x0262, B:87:0x0265, B:90:0x0268, B:94:0x027b, B:98:0x0293, B:101:0x02b1, B:105:0x02c8, B:108:0x02e7, B:111:0x02ff, B:116:0x0326, B:117:0x032d, B:119:0x0338, B:118:0x0330, B:124:0x0347, B:126:0x035f, B:129:0x0372, B:132:0x038f, B:133:0x0392, B:136:0x03a0, B:137:0x03ab, B:138:0x03ae, B:141:0x03b1, B:143:0x03c3, B:148:0x03d4, B:150:0x03e9, B:155:0x03fe, B:156:0x0400, B:41:0x016e, B:42:0x0171, B:46:0x0175, B:50:0x0189, B:52:0x018f, B:55:0x01a4, B:57:0x01b3, B:59:0x01ce, B:61:0x01e9, B:64:0x0202, B:66:0x021b, B:67:0x0222, B:68:0x0225, B:56:0x01ac, B:71:0x0228, B:72:0x022b, B:12:0x005d, B:14:0x0079, B:17:0x008b, B:18:0x0090, B:20:0x0099, B:19:0x0093, B:160:0x0404, B:161:0x0407, B:162:0x040a), top: B:175:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:97:0x0283  */
        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            StringBuilder sb;
            int i5;
            EditText editText;
            String string;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            OfflineRosterActivity offlineRosterActivity;
            int i11;
            int selectedItemPosition;
            int i12;
            int i13;
            int i14;
            int i15 = 2 % 2;
            int i16 = b;
            int i17 = ((i16 & 68) + (i16 | 68)) - 1;
            a = i17 % 128;
            Object obj = null;
            try {
                if (i17 % 2 == 0) {
                    charSequence.toString();
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String string2 = charSequence.toString();
                OfflineRosterActivity offlineRosterActivity2 = OfflineRosterActivity.this;
                if (!offlineRosterActivity2.bc) {
                    int i18 = b;
                    int i19 = i18 & 91;
                    int i20 = (i18 ^ 91) | i19;
                    int i21 = (i19 & i20) + (i20 | i19);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    offlineRosterActivity2.vald_txt_view_caption.setVisibility(8);
                    OfflineRosterActivity offlineRosterActivity3 = OfflineRosterActivity.this;
                    int i23 = b;
                    int i24 = i23 | 71;
                    int i25 = i24 << 1;
                    int i26 = -((~(i23 & 71)) & i24);
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    offlineRosterActivity3.vald_txt_view.setVisibility(8);
                    OfflineRosterActivity offlineRosterActivity4 = OfflineRosterActivity.this;
                    int i29 = a + 89;
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        offlineRosterActivity4.vald_name_txt_view.setVisibility(110);
                    } else {
                        offlineRosterActivity4.vald_name_txt_view.setVisibility(8);
                    }
                    OfflineRosterActivity.this.J();
                    int i30 = b + 70;
                    int i31 = (i30 ^ (-1)) + (i30 << 1);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                } else if (offlineRosterActivity2.bg) {
                    int i33 = a;
                    int i34 = i33 & 31;
                    int i35 = (i34 - (~((i33 ^ 31) | i34))) - 1;
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    offlineRosterActivity2.by = false;
                    int i37 = a;
                    int i38 = i37 & 77;
                    int i39 = (i37 ^ 77) | i38;
                    int i40 = (i38 & i39) + (i39 | i38);
                    b = i40 % 128;
                    int i41 = i40 % 2;
                }
                if (string2.length() == 14) {
                    int i42 = (-2) - ((a + 10) ^ (-1));
                    b = i42 % 128;
                    if (i42 % 2 != 0) {
                        string2.endsWith("-");
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!string2.endsWith("-")) {
                        EditText editText2 = this.c;
                        StringBuilder sb2 = new StringBuilder();
                        int i43 = (-2) - ((a + 90) ^ (-1));
                        b = i43 % 128;
                        int i44 = i43 % 2;
                        sb2.append(string2.substring(0, 5));
                        sb2.append("-");
                        int i45 = a;
                        int i46 = i45 ^ 75;
                        int i47 = -(-((i45 & 75) << 1));
                        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        sb2.append(string2.substring(6, 13));
                        sb2.append("-");
                        int i50 = a;
                        int i51 = i50 & 29;
                        int i52 = ((i50 ^ 29) | i51) << 1;
                        int i53 = -((i50 | 29) & (~i51));
                        int i54 = (i52 & i53) + (i53 | i52);
                        b = i54 % 128;
                        int i55 = i54 % 2;
                        sb2.append(string2.substring(13));
                        String string3 = sb2.toString();
                        int i56 = b;
                        int i57 = (((i56 & (-108)) | ((~i56) & 107)) - (~(-(-((i56 & 107) << 1))))) - 1;
                        a = i57 % 128;
                        int i58 = i57 % 2;
                        editText2.setText(string3);
                        EditText editText3 = this.c;
                        int length = editText3.getText().toString().length();
                        int i59 = a;
                        int i60 = ((i59 | 45) << 1) - (i59 ^ 45);
                        b = i60 % 128;
                        int i61 = i60 % 2;
                        editText3.setSelection(length);
                        int i62 = b;
                        int i63 = i62 ^ 99;
                        int i64 = (((i62 & 99) | i63) << 1) - i63;
                        a = i64 % 128;
                        int i65 = i64 % 2;
                    } else if (string2.length() == 6) {
                        int i66 = b;
                        i4 = (i66 & 19) + (i66 | 19);
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            string2.endsWith("-");
                            try {
                                throw null;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        if (!string2.endsWith("-")) {
                            EditText editText4 = this.c;
                            sb = new StringBuilder();
                            int i67 = b;
                            i5 = (i67 & 113) + (i67 | 113);
                            a = i5 % 128;
                            if (i5 % 2 == 0) {
                                sb.append(string2.substring(1, 2));
                            } else {
                                sb.append(string2.substring(0, 5));
                            }
                            sb.append("-");
                            String strSubstring = string2.substring(5);
                            int i68 = a;
                            int i69 = (((i68 ^ 119) | (i68 & 119)) << 1) - (((~i68) & 119) | (i68 & (-120)));
                            b = i69 % 128;
                            int i70 = i69 % 2;
                            sb.append(strSubstring);
                            editText4.setText(sb.toString());
                            int i71 = a;
                            int i72 = i71 & 105;
                            int i73 = (i72 - (~(-(-((i71 ^ 105) | i72))))) - 1;
                            b = i73 % 128;
                            int i74 = i73 % 2;
                            editText = this.c;
                            string = editText.getText().toString();
                            int i75 = b;
                            i6 = (i75 ^ 65) + ((i75 & 65) << 1);
                            a = i6 % 128;
                            if (i6 % 2 != 0) {
                                editText.setSelection(string.length());
                                try {
                                    obj.hashCode();
                                    throw null;
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            editText.setSelection(string.length());
                            int i76 = a;
                            int i77 = (((i76 & (-92)) | ((~i76) & 91)) - (~((i76 & 91) << 1))) - 1;
                            b = i77 % 128;
                            int i78 = i77 % 2;
                        }
                    }
                } else if (string2.length() == 6) {
                    int i610 = b;
                    i4 = (i610 & 19) + (i610 | 19);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        string2.endsWith("-");
                        throw null;
                    }
                    if (!string2.endsWith("-")) {
                        EditText editText5 = this.c;
                        sb = new StringBuilder();
                        int i611 = b;
                        i5 = (i611 & 113) + (i611 | 113);
                        a = i5 % 128;
                        if (i5 % 2 == 0) {
                            sb.append(string2.substring(1, 2));
                        } else {
                            sb.append(string2.substring(0, 5));
                        }
                        sb.append("-");
                        String strSubstring2 = string2.substring(5);
                        int i612 = a;
                        int i613 = (((i612 ^ 119) | (i612 & 119)) << 1) - (((~i612) & 119) | (i612 & (-120)));
                        b = i613 % 128;
                        int i79 = i613 % 2;
                        sb.append(strSubstring2);
                        editText5.setText(sb.toString());
                        int i710 = a;
                        int i711 = i710 & 105;
                        int i712 = (i711 - (~(-(-((i710 ^ 105) | i711))))) - 1;
                        b = i712 % 128;
                        int i713 = i712 % 2;
                        editText = this.c;
                        string = editText.getText().toString();
                        int i714 = b;
                        i6 = (i714 ^ 65) + ((i714 & 65) << 1);
                        a = i6 % 128;
                        if (i6 % 2 != 0) {
                            editText.setSelection(string.length());
                            obj.hashCode();
                            throw null;
                        }
                        editText.setSelection(string.length());
                        int i715 = a;
                        int i716 = (((i715 & (-92)) | ((~i715) & 91)) - (~((i715 & 91) << 1))) - 1;
                        b = i716 % 128;
                        int i717 = i716 % 2;
                    }
                }
                OfflineRosterActivity offlineRosterActivity5 = OfflineRosterActivity.this;
                int i80 = offlineRosterActivity5.ac;
                if (i80 != 1) {
                    int i81 = b;
                    int i82 = i81 & 33;
                    int i83 = ((i81 ^ 33) | i82) << 1;
                    int i84 = -((i81 | 33) & (~i82));
                    int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                    int i86 = i85 % 128;
                    a = i86;
                    int i87 = i85 % 2;
                    if (i80 != 2) {
                        int i88 = i86 + 66;
                        int i89 = (i88 ^ (-1)) + (i88 << 1);
                        b = i89 % 128;
                        if (i89 % 2 != 0) {
                            boolean z = ag.d;
                            try {
                                obj.hashCode();
                                throw null;
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        if (ag.d) {
                            if (ag.j == 1) {
                                int i90 = b;
                                i7 = ((i90 | 109) << 1) - (i90 ^ 109);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                    double d = offlineRosterActivity5.aQ;
                                    try {
                                        throw null;
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                if (offlineRosterActivity5.aQ < 18.0d) {
                                    offlineRosterActivity5.checkBoxBispBenif.setVisibility(8);
                                    OfflineRosterActivity offlineRosterActivity6 = OfflineRosterActivity.this;
                                    int i91 = a;
                                    int i92 = (i91 & 55) + (i91 | 55);
                                    b = i92 % 128;
                                    int i93 = i92 % 2;
                                    offlineRosterActivity6.aF = false;
                                    int i94 = a;
                                    i8 = ((i94 & 106) + (i94 | 106)) - 1;
                                    b = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        int i95 = 9 / 0;
                                        return;
                                    }
                                    return;
                                }
                                int i96 = b;
                                int i97 = i96 & 85;
                                int i98 = (i96 ^ 85) | i97;
                                int i99 = (i97 & i98) + (i98 | i97);
                                a = i99 % 128;
                                int i100 = i99 % 2;
                                if (offlineRosterActivity5.radioGroupCNICOptions.getCheckedRadioButtonId() == OfflineRosterActivity.this.radioButtonCNICPresent.getId()) {
                                    int i101 = a;
                                    int i102 = (((i101 | 112) << 1) - (i101 ^ 112)) - 1;
                                    b = i102 % 128;
                                    int i103 = i102 % 2;
                                    if (string2.length() >= 14) {
                                        int i104 = a;
                                        i10 = ((i104 ^ 98) + ((i104 & 98) << 1)) - 1;
                                        b = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId();
                                            RadioButton radioButton = OfflineRosterActivity.this.radioButtonFemale;
                                            try {
                                                obj.hashCode();
                                                throw null;
                                            } catch (Throwable th7) {
                                                throw th7;
                                            }
                                        }
                                        if (OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId() != OfflineRosterActivity.this.radioButtonFemale.getId()) {
                                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                            offlineRosterActivity = OfflineRosterActivity.this;
                                            int i105 = a;
                                            int i106 = i105 & 29;
                                            int i107 = i105 | 29;
                                            i11 = (i106 ^ i107) + ((i107 & i106) << 1);
                                            b = i11 % 128;
                                            if (i11 % 2 != 0) {
                                                offlineRosterActivity.aF = true;
                                            } else {
                                                offlineRosterActivity.aF = false;
                                            }
                                            int i108 = a;
                                            int i109 = (i108 & 91) + (i108 | 91);
                                            b = i109 % 128;
                                            int i110 = i109 % 2;
                                            return;
                                        }
                                        int i111 = b;
                                        int i112 = ((i111 | 17) << 1) - (i111 ^ 17);
                                        a = i112 % 128;
                                        int i113 = i112 % 2;
                                        if (OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                            int i114 = a;
                                            int i115 = (((i114 | 114) << 1) - (i114 ^ 114)) - 1;
                                            b = i115 % 128;
                                            int i116 = i115 % 2;
                                            selectedItemPosition = OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition();
                                            int i117 = a;
                                            int i118 = i117 & 21;
                                            int i119 = i118 + ((i117 ^ 21) | i118);
                                            i12 = i119 % 128;
                                            b = i12;
                                            int i120 = i119 % 2;
                                            if (selectedItemPosition != 1) {
                                                i13 = (-2) - (((i12 ^ 110) + ((i12 & 110) << 1)) ^ (-1));
                                                a = i13 % 128;
                                                if (i13 % 2 == 0) {
                                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(1);
                                                } else {
                                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(0);
                                                }
                                                OfflineRosterActivity.this.aF = true;
                                                i14 = b + 103;
                                                a = i14 % 128;
                                                if (i14 % 2 == 0) {
                                                    throw null;
                                                }
                                                return;
                                            }
                                        }
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                        OfflineRosterActivity offlineRosterActivity7 = OfflineRosterActivity.this;
                                        int i121 = b;
                                        int i122 = (i121 ^ 59) + ((i121 & 59) << 1);
                                        a = i122 % 128;
                                        int i123 = i122 % 2;
                                        offlineRosterActivity7.aF = false;
                                        int i124 = a;
                                        int i125 = (((i124 | 63) << 1) - (~(-(i124 ^ 63)))) - 1;
                                        b = i125 % 128;
                                        int i126 = i125 % 2;
                                        return;
                                    }
                                }
                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                int i127 = b + 113;
                                a = i127 % 128;
                                int i128 = i127 % 2;
                                OfflineRosterActivity.this.aF = false;
                                i9 = b + 93;
                                a = i9 % 128;
                                if (i9 % 2 == 0) {
                                    throw null;
                                }
                                return;
                            }
                        }
                    } else if (ag.j == 1) {
                        int i910 = b;
                        i7 = ((i910 | 109) << 1) - (i910 ^ 109);
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            double d2 = offlineRosterActivity5.aQ;
                            throw null;
                        }
                        if (offlineRosterActivity5.aQ < 18.0d) {
                            offlineRosterActivity5.checkBoxBispBenif.setVisibility(8);
                            OfflineRosterActivity offlineRosterActivity8 = OfflineRosterActivity.this;
                            int i911 = a;
                            int i912 = (i911 & 55) + (i911 | 55);
                            b = i912 % 128;
                            int i913 = i912 % 2;
                            offlineRosterActivity8.aF = false;
                            int i914 = a;
                            i8 = ((i914 & 106) + (i914 | 106)) - 1;
                            b = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i915 = 9 / 0;
                                return;
                            }
                            return;
                        }
                        int i916 = b;
                        int i917 = i916 & 85;
                        int i918 = (i916 ^ 85) | i917;
                        int i919 = (i917 & i918) + (i918 | i917);
                        a = i919 % 128;
                        int i1010 = i919 % 2;
                        if (offlineRosterActivity5.radioGroupCNICOptions.getCheckedRadioButtonId() == OfflineRosterActivity.this.radioButtonCNICPresent.getId()) {
                            int i1011 = a;
                            int i1012 = (((i1011 | 112) << 1) - (i1011 ^ 112)) - 1;
                            b = i1012 % 128;
                            int i1013 = i1012 % 2;
                            if (string2.length() >= 14) {
                                int i1014 = a;
                                i10 = ((i1014 ^ 98) + ((i1014 & 98) << 1)) - 1;
                                b = i10 % 128;
                                if (i10 % 2 != 0) {
                                    OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId();
                                    RadioButton radioButton2 = OfflineRosterActivity.this.radioButtonFemale;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId() != OfflineRosterActivity.this.radioButtonFemale.getId()) {
                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                    offlineRosterActivity = OfflineRosterActivity.this;
                                    int i1015 = a;
                                    int i1016 = i1015 & 29;
                                    int i1017 = i1015 | 29;
                                    i11 = (i1016 ^ i1017) + ((i1017 & i1016) << 1);
                                    b = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        offlineRosterActivity.aF = true;
                                    } else {
                                        offlineRosterActivity.aF = false;
                                    }
                                    int i1018 = a;
                                    int i1019 = (i1018 & 91) + (i1018 | 91);
                                    b = i1019 % 128;
                                    int i1110 = i1019 % 2;
                                    return;
                                }
                                int i1111 = b;
                                int i1112 = ((i1111 | 17) << 1) - (i1111 ^ 17);
                                a = i1112 % 128;
                                int i1113 = i1112 % 2;
                                if (OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                    int i1114 = a;
                                    int i1115 = (((i1114 | 114) << 1) - (i1114 ^ 114)) - 1;
                                    b = i1115 % 128;
                                    int i1116 = i1115 % 2;
                                    selectedItemPosition = OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition();
                                    int i1117 = a;
                                    int i1118 = i1117 & 21;
                                    int i1119 = i1118 + ((i1117 ^ 21) | i1118);
                                    i12 = i1119 % 128;
                                    b = i12;
                                    int i129 = i1119 % 2;
                                    if (selectedItemPosition != 1) {
                                        i13 = (-2) - (((i12 ^ 110) + ((i12 & 110) << 1)) ^ (-1));
                                        a = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(1);
                                        } else {
                                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(0);
                                        }
                                        OfflineRosterActivity.this.aF = true;
                                        i14 = b + 103;
                                        a = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            throw null;
                                        }
                                        return;
                                    }
                                }
                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                OfflineRosterActivity offlineRosterActivity9 = OfflineRosterActivity.this;
                                int i1210 = b;
                                int i1211 = (i1210 ^ 59) + ((i1210 & 59) << 1);
                                a = i1211 % 128;
                                int i1212 = i1211 % 2;
                                offlineRosterActivity9.aF = false;
                                int i1213 = a;
                                int i1214 = (((i1213 | 63) << 1) - (~(-(i1213 ^ 63)))) - 1;
                                b = i1214 % 128;
                                int i1215 = i1214 % 2;
                                return;
                            }
                        }
                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                        int i1216 = b + 113;
                        a = i1216 % 128;
                        int i1217 = i1216 % 2;
                        OfflineRosterActivity.this.aF = false;
                        i9 = b + 93;
                        a = i9 % 128;
                        if (i9 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                } else if (ag.j == 1) {
                    int i9110 = b;
                    i7 = ((i9110 | 109) << 1) - (i9110 ^ 109);
                    a = i7 % 128;
                    if (i7 % 2 == 0) {
                        double d3 = offlineRosterActivity5.aQ;
                        throw null;
                    }
                    if (offlineRosterActivity5.aQ < 18.0d) {
                        offlineRosterActivity5.checkBoxBispBenif.setVisibility(8);
                        OfflineRosterActivity offlineRosterActivity10 = OfflineRosterActivity.this;
                        int i9111 = a;
                        int i9112 = (i9111 & 55) + (i9111 | 55);
                        b = i9112 % 128;
                        int i9113 = i9112 % 2;
                        offlineRosterActivity10.aF = false;
                        int i9114 = a;
                        i8 = ((i9114 & 106) + (i9114 | 106)) - 1;
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9115 = 9 / 0;
                            return;
                        }
                        return;
                    }
                    int i9116 = b;
                    int i9117 = i9116 & 85;
                    int i9118 = (i9116 ^ 85) | i9117;
                    int i9119 = (i9117 & i9118) + (i9118 | i9117);
                    a = i9119 % 128;
                    int i10110 = i9119 % 2;
                    if (offlineRosterActivity5.radioGroupCNICOptions.getCheckedRadioButtonId() == OfflineRosterActivity.this.radioButtonCNICPresent.getId()) {
                        int i10111 = a;
                        int i10112 = (((i10111 | 112) << 1) - (i10111 ^ 112)) - 1;
                        b = i10112 % 128;
                        int i10113 = i10112 % 2;
                        if (string2.length() >= 14) {
                            int i10114 = a;
                            i10 = ((i10114 ^ 98) + ((i10114 & 98) << 1)) - 1;
                            b = i10 % 128;
                            if (i10 % 2 != 0) {
                                OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId();
                                RadioButton radioButton3 = OfflineRosterActivity.this.radioButtonFemale;
                                obj.hashCode();
                                throw null;
                            }
                            if (OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId() != OfflineRosterActivity.this.radioButtonFemale.getId()) {
                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                offlineRosterActivity = OfflineRosterActivity.this;
                                int i10115 = a;
                                int i10116 = i10115 & 29;
                                int i10117 = i10115 | 29;
                                i11 = (i10116 ^ i10117) + ((i10117 & i10116) << 1);
                                b = i11 % 128;
                                if (i11 % 2 != 0) {
                                    offlineRosterActivity.aF = true;
                                } else {
                                    offlineRosterActivity.aF = false;
                                }
                                int i10118 = a;
                                int i10119 = (i10118 & 91) + (i10118 | 91);
                                b = i10119 % 128;
                                int i11110 = i10119 % 2;
                                return;
                            }
                            int i11111 = b;
                            int i11112 = ((i11111 | 17) << 1) - (i11111 ^ 17);
                            a = i11112 % 128;
                            int i11113 = i11112 % 2;
                            if (OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                int i11114 = a;
                                int i11115 = (((i11114 | 114) << 1) - (i11114 ^ 114)) - 1;
                                b = i11115 % 128;
                                int i11116 = i11115 % 2;
                                selectedItemPosition = OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition();
                                int i11117 = a;
                                int i11118 = i11117 & 21;
                                int i11119 = i11118 + ((i11117 ^ 21) | i11118);
                                i12 = i11119 % 128;
                                b = i12;
                                int i1218 = i11119 % 2;
                                if (selectedItemPosition != 1) {
                                    i13 = (-2) - (((i12 ^ 110) + ((i12 & 110) << 1)) ^ (-1));
                                    a = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(1);
                                    } else {
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(0);
                                    }
                                    OfflineRosterActivity.this.aF = true;
                                    i14 = b + 103;
                                    a = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                            }
                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                            OfflineRosterActivity offlineRosterActivity11 = OfflineRosterActivity.this;
                            int i1219 = b;
                            int i12110 = (i1219 ^ 59) + ((i1219 & 59) << 1);
                            a = i12110 % 128;
                            int i12111 = i12110 % 2;
                            offlineRosterActivity11.aF = false;
                            int i12112 = a;
                            int i12113 = (((i12112 | 63) << 1) - (~(-(i12112 ^ 63)))) - 1;
                            b = i12113 % 128;
                            int i12114 = i12113 % 2;
                            return;
                        }
                    }
                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                    int i12115 = b + 113;
                    a = i12115 % 128;
                    int i12116 = i12115 % 2;
                    OfflineRosterActivity.this.aF = false;
                    i9 = b + 93;
                    a = i9 % 128;
                    if (i9 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i130 = b;
                int i131 = (((i130 & (-120)) | ((~i130) & 119)) - (~((i130 & 119) << 1))) - 1;
                a = i131 % 128;
                if (i131 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (Exception unused) {
            }
        }
    }

    public static String D(String str) {
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat dateInstance = DateFormat.getDateInstance();
        int i2 = q;
        int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
        p = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                dateInstance.format(simpleDateFormat.parse(str));
                obj.hashCode();
                throw null;
            }
            String str2 = dateInstance.format(simpleDateFormat.parse(str));
            int i4 = q + 13;
            p = i4 % 128;
            if (i4 % 2 != 0) {
                return str2;
            }
            obj.hashCode();
            throw null;
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:146:0x0668  */
    /* JADX WARN: Code duplicated, block: B:149:0x0671  */
    /* JADX WARN: Code duplicated, block: B:151:0x0680  */
    /* JADX WARN: Code duplicated, block: B:153:0x069b  */
    /* JADX WARN: Code duplicated, block: B:155:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:157:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:211:0x06da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x06ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x06e7 A[EDGE_INSN: B:213:0x06e7->B:161:0x06e7 BREAK  A[LOOP:5: B:147:0x0669->B:156:0x06b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0482 A[EDGE_INSN: B:227:0x0482->B:95:0x0482 BREAK  A[LOOP:8: B:86:0x0441->B:92:0x046a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0227  */
    /* JADX WARN: Code duplicated, block: B:38:0x022b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0241  */
    /* JADX WARN: Code duplicated, block: B:41:0x0247  */
    /* JADX WARN: Code duplicated, block: B:85:0x042d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0449  */
    /* JADX WARN: Code duplicated, block: B:90:0x0464  */
    /* JADX WARN: Code duplicated, block: B:92:0x046a A[LOOP:8: B:86:0x0441->B:92:0x046a, LOOP_END] */
    public final void K() {
        String[] strArrSplit;
        String str;
        int i;
        int i2;
        int optionId;
        int i3;
        int optionId2;
        int i4;
        int i5;
        int optionId3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 2 % 2;
        int i12 = p;
        int i13 = i12 | 75;
        int i14 = i13 << 1;
        int i15 = -((~(i12 & 75)) & i13);
        int i16 = i14 ^ i15;
        int i17 = i15 & i14;
        final int i18 = 1;
        int i19 = i16 + (i17 << 1);
        q = i19 % 128;
        final int i20 = 0;
        if (i19 % 2 != 0) {
            strArrSplit = ivas.gov.bisp.enumeration.p026az.z.f().split("-");
            Integer.parseInt(strArrSplit[1]);
            str = strArrSplit[0];
        } else {
            strArrSplit = ivas.gov.bisp.enumeration.p026az.z.f().split("-");
            Integer.parseInt(strArrSplit[0]);
            str = strArrSplit[1];
        }
        Integer.parseInt(str);
        Integer.parseInt(strArrSplit[2]);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.networks)));
        this.aL = arrayList;
        Spinner spinner = this.sp_networks;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new F(this, spinner));
        this.aG = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.banks)));
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this.ae, R.layout.spinner_item, this.aG);
        arrayAdapter2.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this.sp_banks.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.sp_banks.setOnItemSelectedListener(new Y(this));
        if (this.bv.V != null) {
            int i21 = q;
            int i22 = i21 & 101;
            int i23 = (i22 - (~((i21 ^ 101) | i22))) - 1;
            p = i23 % 128;
            int i24 = i23 % 2;
            if (this.bc) {
                au auVar = new au(this, "relation_to_household_head", getResources().getString(R.string.relation_to_head), this.sp_relation_to_household, new Z(this));
                int i25 = p;
                int i26 = i25 & 59;
                int i27 = -(-(i25 | 59));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                q = i28 % 128;
                int i29 = i28 % 2;
                auVar.execute(new Void[0]);
            } else {
                au auVar2 = new au(this, "relation_to_household_head", getResources().getString(R.string.relation_to_head), this.sp_relation_to_household, new C0123q(this));
                int i30 = q;
                int i31 = (((i30 & (-114)) | ((~i30) & 113)) - (~(-(-((i30 & 113) << 1))))) - 1;
                p = i31 % 128;
                int i32 = i31 % 2;
                auVar2.execute(new Void[0]);
            }
        } else {
            au auVar3 = new au(this, "relation_to_household_head", getResources().getString(R.string.relation_to_head), this.sp_relation_to_household, new C0123q(this));
            int i33 = q;
            int i34 = (((i33 & (-114)) | ((~i33) & 113)) - (~(-(-((i33 & 113) << 1))))) - 1;
            p = i34 % 128;
            int i35 = i34 % 2;
            auVar3.execute(new Void[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("Select Month");
        int i36 = p;
        int i37 = i36 & 23;
        int i38 = ((i36 ^ 23) | i37) << 1;
        int i39 = -((i36 | 23) & (~i37));
        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
        q = i40 % 128;
        int i41 = i40 % 2;
        int i42 = 1;
        while (i42 < 12) {
            StringBuilder sb = new StringBuilder();
            sb.append(i42);
            int i43 = q + 67;
            p = i43 % 128;
            int i44 = i43 % 2;
            arrayList2.add(sb.toString());
            int i45 = (i42 & 6) | ((~i42) & (-7));
            int i46 = -(-((i42 & (-7)) << 1));
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            int i48 = i47 & 8;
            int i49 = (i47 ^ 8) | i48;
            i42 = ((i48 | i49) << 1) - (i48 ^ i49);
        }
        this.spinnerMonth.setAdapter((SpinnerAdapter) new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList2));
        this.spinnerMonth.setEnabled(false);
        ArrayList arrayList3 = new ArrayList();
        int i50 = p + 119;
        q = i50 % 128;
        if (i50 % 2 != 0) {
            arrayList3.add("Select Year");
        } else {
            arrayList3.add("Select Year");
        }
        for (int i51 = 1; i51 < 116; i51 = ((i51 & 1) << 1) + ((i51 & (-2)) | ((~i51) & 1))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i51);
            arrayList3.add(sb2.toString());
        }
        this.spinnerYear.setAdapter((SpinnerAdapter) new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList3));
        this.spinnerYear.setEnabled(false);
        this.radioGroupCalendar.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bI.D
            private static int a = 1;
            private static int b;
            public final /* synthetic */ OfflineRosterActivity d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
            /* JADX WARN: Code duplicated, block: B:35:0x010e  */
            /* JADX WARN: Code duplicated, block: B:37:0x011d  */
            /* JADX WARN: Code duplicated, block: B:39:0x0125  */
            /* JADX WARN: Code duplicated, block: B:41:0x014f  */
            /* JADX WARN: Code duplicated, block: B:43:0x0155  */
            /* JADX WARN: Code duplicated, block: B:58:0x01b7  */
            /* JADX WARN: Code duplicated, block: B:60:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:61:0x01d0  */
            /* JADX WARN: Code duplicated, block: B:62:0x01e4  */
            /* JADX WARN: Code duplicated, block: B:64:0x01e8  */
            /* JADX WARN: Code duplicated, block: B:65:0x0203  */
            /* JADX WARN: Code duplicated, block: B:67:0x0206  */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i52) {
                int i53;
                int checkedRadioButtonId;
                RadioButton radioButton;
                int i54;
                int i55;
                int i56 = 2 % 2;
                int i57 = a;
                int i58 = i57 & 59;
                int i59 = (((i57 | 59) & (~i58)) - (~(-(-(i58 << 1))))) - 1;
                int i60 = i59 % 128;
                b = i60;
                int i61 = i59 % 2;
                Object obj = null;
                if (i18 != 0) {
                    int i62 = i60 & 33;
                    int i63 = (~i62) & (i60 | 33);
                    int i64 = -(-(i62 << 1));
                    int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                    int i66 = i65 % 128;
                    a = i66;
                    int i67 = i65 % 2;
                    int i68 = i66 & 49;
                    int i69 = -(-((i66 ^ 49) | i68));
                    int i70 = (i68 & i69) + (i69 | i68);
                    b = i70 % 128;
                    if (i70 % 2 != 0) {
                        OfflineRosterActivity offlineRosterActivity = this.d;
                        offlineRosterActivity.radioButtonCalendarYes.getId();
                        TextView textView = offlineRosterActivity.tv_dob;
                        obj.hashCode();
                        throw null;
                    }
                    OfflineRosterActivity offlineRosterActivity2 = this.d;
                    offlineRosterActivity2.radioButtonCalendarYes.getId();
                    TextView textView2 = offlineRosterActivity2.tv_dob;
                    int i71 = b;
                    int i72 = i71 & 83;
                    int i73 = (i72 - (~((i71 ^ 83) | i72))) - 1;
                    a = i73 % 128;
                    int i74 = i73 % 2;
                    textView2.setEnabled(true);
                    offlineRosterActivity2.spinnerYear.setEnabled(false);
                    Spinner spinner2 = offlineRosterActivity2.spinnerMonth;
                    int i75 = b + 13;
                    a = i75 % 128;
                    if (i75 % 2 == 0) {
                        spinner2.setEnabled(true);
                    } else {
                        spinner2.setEnabled(false);
                    }
                    int i76 = b;
                    int i77 = (((i76 | 22) << 1) - (i76 ^ 22)) - 1;
                    a = i77 % 128;
                    if (i77 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                OfflineRosterActivity offlineRosterActivity3 = this.d;
                int i78 = OfflineRosterActivity.af;
                int i79 = offlineRosterActivity3.ac;
                int i80 = a;
                int i81 = i80 & 123;
                int i82 = (i80 ^ 123) | i81;
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                int i84 = i83 % 128;
                b = i84;
                int i85 = i83 % 2;
                if (i79 != 1) {
                    int i86 = ((i84 ^ 121) | (i84 & 121)) << 1;
                    int i87 = -(((~i84) & 121) | (i84 & (-122)));
                    int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                    int i89 = i88 % 128;
                    a = i89;
                    if (i88 % 2 != 0 ? i79 != 2 : i79 != 3) {
                        int i90 = i89 & 63;
                        int i91 = (i89 | 63) & (~i90);
                        int i92 = i90 << 1;
                        int i93 = (i91 & i92) + (i92 | i91);
                        b = i93 % 128;
                        if (i93 % 2 != 0) {
                            int i94 = 12 / 0;
                            if (!(!ag.d)) {
                                if (ag.j == 1) {
                                    int i95 = b;
                                    int i96 = ((i95 & 68) + (i95 | 68)) - 1;
                                    a = i96 % 128;
                                    int i97 = i96 % 2;
                                    if (i52 == offlineRosterActivity3.radioButtonFemale.getId()) {
                                        int i98 = b;
                                        i53 = (i98 ^ 79) + ((i98 & 79) << 1);
                                        a = i53 % 128;
                                        if (i53 % 2 != 0) {
                                            double d = offlineRosterActivity3.aQ;
                                            throw null;
                                        }
                                        if (offlineRosterActivity3.aQ >= 18.0d) {
                                            int i99 = a;
                                            int i100 = i99 ^ 89;
                                            int i101 = (i99 & 89) << 1;
                                            int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                                            b = i102 % 128;
                                            int i103 = i102 % 2;
                                            checkedRadioButtonId = offlineRosterActivity3.radioGroupCNICOptions.getCheckedRadioButtonId();
                                            radioButton = offlineRosterActivity3.radioButtonCNICPresent;
                                            int i104 = b;
                                            i54 = ((i104 ^ 82) + ((i104 & 82) << 1)) - 1;
                                            a = i54 % 128;
                                            if (i54 % 2 != 0) {
                                                radioButton.getId();
                                                throw null;
                                            }
                                            if (checkedRadioButtonId == radioButton.getId()) {
                                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                                offlineRosterActivity3.aF = false;
                                                int i105 = a;
                                                int i106 = (i105 & 105) + (i105 | 105);
                                                b = i106 % 128;
                                                int i107 = i106 % 2;
                                            } else {
                                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                                offlineRosterActivity3.aF = false;
                                                int i108 = a;
                                                int i109 = (i108 & 105) + (i108 | 105);
                                                b = i109 % 128;
                                                int i1010 = i109 % 2;
                                            }
                                        } else {
                                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                            offlineRosterActivity3.aF = false;
                                            int i110 = a;
                                            int i111 = i110 ^ 93;
                                            int i112 = ((i110 & 93) | i111) << 1;
                                            int i113 = -i111;
                                            int i114 = (i112 ^ i113) + ((i112 & i113) << 1);
                                            b = i114 % 128;
                                            int i115 = i114 % 2;
                                        }
                                    } else {
                                        offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                        offlineRosterActivity3.aF = false;
                                        int i116 = b;
                                        int i117 = ((i116 ^ 125) | (i116 & 125)) << 1;
                                        int i118 = -(((~i116) & 125) | (i116 & (-126)));
                                        int i119 = (i117 & i118) + (i118 | i117);
                                        a = i119 % 128;
                                        int i120 = i119 % 2;
                                    }
                                }
                            }
                        } else if (ag.d) {
                            if (ag.j == 1) {
                                int i910 = b;
                                int i911 = ((i910 & 68) + (i910 | 68)) - 1;
                                a = i911 % 128;
                                int i912 = i911 % 2;
                                if (i52 == offlineRosterActivity3.radioButtonFemale.getId()) {
                                    int i913 = b;
                                    i53 = (i913 ^ 79) + ((i913 & 79) << 1);
                                    a = i53 % 128;
                                    if (i53 % 2 != 0) {
                                        double d2 = offlineRosterActivity3.aQ;
                                        throw null;
                                    }
                                    if (offlineRosterActivity3.aQ >= 18.0d) {
                                        int i914 = a;
                                        int i1011 = i914 ^ 89;
                                        int i1012 = (i914 & 89) << 1;
                                        int i1013 = ((i1011 | i1012) << 1) - (i1012 ^ i1011);
                                        b = i1013 % 128;
                                        int i1014 = i1013 % 2;
                                        checkedRadioButtonId = offlineRosterActivity3.radioGroupCNICOptions.getCheckedRadioButtonId();
                                        radioButton = offlineRosterActivity3.radioButtonCNICPresent;
                                        int i1015 = b;
                                        i54 = ((i1015 ^ 82) + ((i1015 & 82) << 1)) - 1;
                                        a = i54 % 128;
                                        if (i54 % 2 != 0) {
                                            radioButton.getId();
                                            throw null;
                                        }
                                        if (checkedRadioButtonId == radioButton.getId()) {
                                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                            offlineRosterActivity3.aF = false;
                                            int i1016 = a;
                                            int i1017 = (i1016 & 105) + (i1016 | 105);
                                            b = i1017 % 128;
                                            int i1018 = i1017 % 2;
                                        } else {
                                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                            offlineRosterActivity3.aF = false;
                                            int i1019 = a;
                                            int i10110 = (i1019 & 105) + (i1019 | 105);
                                            b = i10110 % 128;
                                            int i10111 = i10110 % 2;
                                        }
                                    } else {
                                        offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                        offlineRosterActivity3.aF = false;
                                        int i1110 = a;
                                        int i1111 = i1110 ^ 93;
                                        int i1112 = ((i1110 & 93) | i1111) << 1;
                                        int i1113 = -i1111;
                                        int i1114 = (i1112 ^ i1113) + ((i1112 & i1113) << 1);
                                        b = i1114 % 128;
                                        int i1115 = i1114 % 2;
                                    }
                                } else {
                                    offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                    offlineRosterActivity3.aF = false;
                                    int i1116 = b;
                                    int i1117 = ((i1116 ^ 125) | (i1116 & 125)) << 1;
                                    int i1118 = -(((~i1116) & 125) | (i1116 & (-126)));
                                    int i1119 = (i1117 & i1118) + (i1118 | i1117);
                                    a = i1119 % 128;
                                    int i121 = i1119 % 2;
                                }
                            }
                        }
                    } else if (ag.j == 1) {
                        int i915 = b;
                        int i916 = ((i915 & 68) + (i915 | 68)) - 1;
                        a = i916 % 128;
                        int i917 = i916 % 2;
                        if (i52 == offlineRosterActivity3.radioButtonFemale.getId()) {
                            int i918 = b;
                            i53 = (i918 ^ 79) + ((i918 & 79) << 1);
                            a = i53 % 128;
                            if (i53 % 2 != 0) {
                                double d3 = offlineRosterActivity3.aQ;
                                throw null;
                            }
                            if (offlineRosterActivity3.aQ >= 18.0d) {
                                int i919 = a;
                                int i10112 = i919 ^ 89;
                                int i10113 = (i919 & 89) << 1;
                                int i10114 = ((i10112 | i10113) << 1) - (i10113 ^ i10112);
                                b = i10114 % 128;
                                int i10115 = i10114 % 2;
                                checkedRadioButtonId = offlineRosterActivity3.radioGroupCNICOptions.getCheckedRadioButtonId();
                                radioButton = offlineRosterActivity3.radioButtonCNICPresent;
                                int i10116 = b;
                                i54 = ((i10116 ^ 82) + ((i10116 & 82) << 1)) - 1;
                                a = i54 % 128;
                                if (i54 % 2 != 0) {
                                    radioButton.getId();
                                    throw null;
                                }
                                if (checkedRadioButtonId == radioButton.getId() || offlineRosterActivity3.et_RosterCNIC.length() != 15) {
                                    offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                    offlineRosterActivity3.aF = false;
                                    int i10117 = a;
                                    int i10118 = (i10117 & 105) + (i10117 | 105);
                                    b = i10118 % 128;
                                    int i10119 = i10118 % 2;
                                } else {
                                    int i122 = a;
                                    int i123 = (i122 & 99) + (i122 | 99);
                                    b = i123 % 128;
                                    int i124 = i123 % 2;
                                    if (offlineRosterActivity3.sp_marital_status.getSelectedItemPosition() != 0) {
                                        int i125 = a;
                                        int i126 = i125 & 83;
                                        int i127 = i125 | 83;
                                        int i128 = (i126 & i127) + (i127 | i126);
                                        b = i128 % 128;
                                        if (i128 % 2 == 0 ? offlineRosterActivity3.sp_marital_status.getSelectedItemPosition() == 1 : offlineRosterActivity3.sp_marital_status.getSelectedItemPosition() == 1) {
                                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                            offlineRosterActivity3.aF = false;
                                            int i129 = b;
                                            i55 = (i129 & 29) + (i129 | 29);
                                            a = i55 % 128;
                                            if (i55 % 2 == 0) {
                                                int i130 = 5 / 4;
                                            }
                                        } else {
                                            int i131 = b;
                                            int i132 = (i131 ^ 84) + ((i131 & 84) << 1);
                                            int i133 = (i132 ^ (-1)) + (i132 << 1);
                                            a = i133 % 128;
                                            if (i133 % 2 == 0) {
                                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(0);
                                                offlineRosterActivity3.aF = false;
                                            } else {
                                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(0);
                                                offlineRosterActivity3.aF = true;
                                            }
                                        }
                                    } else {
                                        offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                        offlineRosterActivity3.aF = false;
                                        int i1210 = b;
                                        i55 = (i1210 & 29) + (i1210 | 29);
                                        a = i55 % 128;
                                        if (i55 % 2 == 0) {
                                            int i134 = 5 / 4;
                                        }
                                    }
                                }
                            } else {
                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                offlineRosterActivity3.aF = false;
                                int i11110 = a;
                                int i11111 = i11110 ^ 93;
                                int i11112 = ((i11110 & 93) | i11111) << 1;
                                int i11113 = -i11111;
                                int i11114 = (i11112 ^ i11113) + ((i11112 & i11113) << 1);
                                b = i11114 % 128;
                                int i11115 = i11114 % 2;
                            }
                        } else {
                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                            offlineRosterActivity3.aF = false;
                            int i11116 = b;
                            int i11117 = ((i11116 ^ 125) | (i11116 & 125)) << 1;
                            int i11118 = -(((~i11116) & 125) | (i11116 & (-126)));
                            int i11119 = (i11117 & i11118) + (i11118 | i11117);
                            a = i11119 % 128;
                            int i1211 = i11119 % 2;
                        }
                    }
                } else if (ag.j == 1) {
                    int i9110 = b;
                    int i9111 = ((i9110 & 68) + (i9110 | 68)) - 1;
                    a = i9111 % 128;
                    int i9112 = i9111 % 2;
                    if (i52 == offlineRosterActivity3.radioButtonFemale.getId()) {
                        int i9113 = b;
                        i53 = (i9113 ^ 79) + ((i9113 & 79) << 1);
                        a = i53 % 128;
                        if (i53 % 2 != 0) {
                            double d4 = offlineRosterActivity3.aQ;
                            throw null;
                        }
                        if (offlineRosterActivity3.aQ >= 18.0d) {
                            int i9114 = a;
                            int i101110 = i9114 ^ 89;
                            int i101111 = (i9114 & 89) << 1;
                            int i101112 = ((i101110 | i101111) << 1) - (i101111 ^ i101110);
                            b = i101112 % 128;
                            int i101113 = i101112 % 2;
                            checkedRadioButtonId = offlineRosterActivity3.radioGroupCNICOptions.getCheckedRadioButtonId();
                            radioButton = offlineRosterActivity3.radioButtonCNICPresent;
                            int i101114 = b;
                            i54 = ((i101114 ^ 82) + ((i101114 & 82) << 1)) - 1;
                            a = i54 % 128;
                            if (i54 % 2 != 0) {
                                radioButton.getId();
                                throw null;
                            }
                            if (checkedRadioButtonId == radioButton.getId()) {
                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                offlineRosterActivity3.aF = false;
                                int i101115 = a;
                                int i101116 = (i101115 & 105) + (i101115 | 105);
                                b = i101116 % 128;
                                int i101117 = i101116 % 2;
                            } else {
                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                offlineRosterActivity3.aF = false;
                                int i101118 = a;
                                int i101119 = (i101118 & 105) + (i101118 | 105);
                                b = i101119 % 128;
                                int i1011110 = i101119 % 2;
                            }
                        } else {
                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                            offlineRosterActivity3.aF = false;
                            int i111110 = a;
                            int i111111 = i111110 ^ 93;
                            int i111112 = ((i111110 & 93) | i111111) << 1;
                            int i111113 = -i111111;
                            int i111114 = (i111112 ^ i111113) + ((i111112 & i111113) << 1);
                            b = i111114 % 128;
                            int i111115 = i111114 % 2;
                        }
                    } else {
                        offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                        offlineRosterActivity3.aF = false;
                        int i111116 = b;
                        int i111117 = ((i111116 ^ 125) | (i111116 & 125)) << 1;
                        int i111118 = -(((~i111116) & 125) | (i111116 & (-126)));
                        int i111119 = (i111117 & i111118) + (i111118 | i111117);
                        a = i111119 % 128;
                        int i1212 = i111119 % 2;
                    }
                }
                if (i52 == offlineRosterActivity3.radioButtonMale.getId()) {
                    int i135 = b + 105;
                    a = i135 % 128;
                    int i136 = i135 % 2;
                    if (offlineRosterActivity3.aQ >= 13.0d) {
                        offlineRosterActivity3.sp_marital_status.setVisibility(0);
                        int i137 = (-2) - ((a + 80) ^ (-1));
                        b = i137 % 128;
                        if (i137 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    int i138 = b;
                    int i139 = i138 & 43;
                    int i140 = i139 + ((i138 ^ 43) | i139);
                    a = i140 % 128;
                    if (i140 % 2 == 0) {
                        offlineRosterActivity3.sp_marital_status.setVisibility(118);
                        return;
                    } else {
                        offlineRosterActivity3.sp_marital_status.setVisibility(8);
                        return;
                    }
                }
                if (i52 == offlineRosterActivity3.radioButtonFemale.getId()) {
                    int i141 = a + 45;
                    b = i141 % 128;
                    if (i141 % 2 != 0) {
                        double d5 = offlineRosterActivity3.aQ;
                        throw null;
                    }
                    if (offlineRosterActivity3.aQ < 10.0d) {
                        int i142 = b;
                        int i143 = i142 & 57;
                        int i144 = i142 | 57;
                        int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                        a = i145 % 128;
                        int i146 = i145 % 2;
                        offlineRosterActivity3.sp_marital_status.setVisibility(8);
                        int i147 = b + 53;
                        a = i147 % 128;
                        if (i147 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    offlineRosterActivity3.sp_marital_status.setVisibility(0);
                    int i148 = a;
                    int i149 = ((i148 ^ 36) + ((i148 & 36) << 1)) - 1;
                    b = i149 % 128;
                    if (i149 % 2 != 0) {
                        int i150 = 2 % 3;
                    }
                }
                int i151 = b;
                int i152 = (i151 | 15) << 1;
                int i153 = -(i151 ^ 15);
                int i154 = ((i152 | i153) << 1) - (i153 ^ i152);
                a = i154 % 128;
                if (i154 % 2 == 0) {
                    throw null;
                }
            }
        });
        this.rg_bank_info.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bI.n
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ OfflineRosterActivity d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:136:0x0477  */
            /* JADX WARN: Code duplicated, block: B:138:0x04a6  */
            /* JADX WARN: Code duplicated, block: B:141:0x04b2  */
            /* JADX WARN: Code duplicated, block: B:143:0x04bd  */
            /* JADX WARN: Code duplicated, block: B:146:0x04ee  */
            /* JADX WARN: Code duplicated, block: B:147:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:150:0x0513  */
            /* JADX WARN: Code duplicated, block: B:65:0x0296  */
            /* JADX WARN: Code duplicated, block: B:67:0x029a  */
            /* JADX WARN: Code duplicated, block: B:69:0x02af  */
            /* JADX WARN: Code duplicated, block: B:72:0x02b9  */
            /* JADX WARN: Code restructure failed: missing block: B:100:0x0371, code lost:
            
                if ((r14 % 2) != 0) goto L102;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x0373, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x0374, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x0375, code lost:
            
                r0.radioGroupGender.getCheckedRadioButtonId();
                r0.radioButtonFemale.getId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x037f, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0380, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aF = false;
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.a;
                r0 = (r14 | 1) << 1;
                r14 = -(r14 ^ 1);
                r1 = (r0 & r14) + (r14 | r0);
                ivas.gov.bisp.enumeration.bI.C0121n.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0397, code lost:
            
                if ((r1 % 2) == 0) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x0399, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x039a, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x039b, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aF = false;
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b;
                r0 = r14 & 47;
                r14 = -(-((r14 ^ 47) | r0));
                r1 = (r0 ^ r14) + ((r14 & r0) << 1);
                ivas.gov.bisp.enumeration.bI.C0121n.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x03b4, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:156:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x02b6, code lost:
            
                if (r0.aQ >= 18.0d) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x02bd, code lost:
            
                if (r0.aQ >= 18.0d) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x02bf, code lost:
            
                r14 = (-2) - ((ivas.gov.bisp.enumeration.bI.C0121n.b + 74) ^ (-1));
                ivas.gov.bisp.enumeration.bI.C0121n.a = r14 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x02cc, code lost:
            
                if ((r14 % 2) == 0) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x02d6, code lost:
            
                if (r0.et_RosterCNIC.length() != 108) goto L105;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x02e1, code lost:
            
                if (r0.et_RosterCNIC.length() != 15) goto L105;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x02e3, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b + 63;
                ivas.gov.bisp.enumeration.bI.C0121n.a = r14 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x02ec, code lost:
            
                if ((r14 % 2) != 0) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x02fa, code lost:
            
                if (r0.radioGroupGender.getCheckedRadioButtonId() != r0.radioButtonFemale.getId()) goto L99;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0302, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 0) goto L95;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0304, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b;
                r1 = (((r14 | 96) << 1) - (r14 ^ 96)) - 1;
                ivas.gov.bisp.enumeration.bI.C0121n.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x0318, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 1) goto L95;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x031a, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b;
                r1 = (r14 & 53) + (r14 | 53);
                ivas.gov.bisp.enumeration.bI.C0121n.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x0326, code lost:
            
                if ((r1 % 2) == 0) goto L92;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0328, code lost:
            
                r0.checkBoxBispBenif.setVisibility(1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x032e, code lost:
            
                r0.checkBoxBispBenif.setVisibility(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x0333, code lost:
            
                r0.aF = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x0335, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x0336, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aF = false;
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b + 14;
                r0 = (r14 ^ (-1)) + (r14 << 1);
                ivas.gov.bisp.enumeration.bI.C0121n.a = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x034a, code lost:
            
                if ((r0 % 2) == 0) goto L156;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x034c, code lost:
            
                r13 = 10 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x034f, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x0350, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.a;
                r1 = r14 & 31;
                r14 = (r14 ^ 31) | r1;
                r4 = (r1 ^ r14) + ((r14 & r1) << 1);
                ivas.gov.bisp.enumeration.bI.C0121n.b = r4 % 128;
                r4 = r4 % 2;
                r0.aF = false;
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b + 35;
                ivas.gov.bisp.enumeration.bI.C0121n.a = r14 % 128;
             */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCheckedChanged(android.widget.RadioGroup r13, int r14) {
                /*
                    Method dump skipped, instruction units count: 1331
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bI.C0121n.onCheckedChanged(android.widget.RadioGroup, int):void");
            }
        });
        int i52 = q;
        int i53 = ((i52 | 28) << 1) - (i52 ^ 28);
        int i54 = (i53 ^ (-1)) + (i53 << 1);
        p = i54 % 128;
        if (i54 % 2 != 0 ? (i = this.ac) != 1 : (i = this.ac) != 1) {
            int i55 = q;
            int i56 = (((i55 ^ 3) | (i55 & 3)) << 1) - (((~i55) & 3) | (i55 & (-4)));
            p = i56 % 128;
            int i57 = i56 % 2;
            if (i == 2 || ag.d) {
                if (!ag.g) {
                    this.et_MemberName.setText(ag.i);
                    i10 = (-2) - ((p + 42) ^ (-1));
                    q = i10 % 128;
                    if (i10 % 2 != 0) {
                        this.sp_relation_to_household.setSelection(0);
                    } else {
                        this.sp_relation_to_household.setSelection(1);
                    }
                    LinearLayout linearLayout = this.linearLayoutCNIC;
                    int i58 = p;
                    int i59 = i58 ^ 115;
                    int i60 = (i58 & 115) << 1;
                    int i61 = (i59 & i60) + (i60 | i59);
                    q = i61 % 128;
                    int i62 = i61 % 2;
                    linearLayout.setVisibility(0);
                    this.et_MemberName.setEnabled(true);
                    this.sp_relation_to_household.setEnabled(false);
                    int i63 = p;
                    int i64 = ((i63 | 87) << 1) - (((~i63) & 87) | (i63 & (-88)));
                    q = i64 % 128;
                    int i65 = i64 % 2;
                }
            }
        } else if (!ag.g) {
            this.et_MemberName.setText(ag.i);
            i10 = (-2) - ((p + 42) ^ (-1));
            q = i10 % 128;
            if (i10 % 2 != 0) {
                this.sp_relation_to_household.setSelection(0);
            } else {
                this.sp_relation_to_household.setSelection(1);
            }
            LinearLayout linearLayout2 = this.linearLayoutCNIC;
            int i510 = p;
            int i511 = i510 ^ 115;
            int i66 = (i510 & 115) << 1;
            int i67 = (i511 & i66) + (i66 | i511);
            q = i67 % 128;
            int i68 = i67 % 2;
            linearLayout2.setVisibility(0);
            this.et_MemberName.setEnabled(true);
            this.sp_relation_to_household.setEnabled(false);
            int i69 = p;
            int i610 = ((i69 | 87) << 1) - (((~i69) & 87) | (i69 & (-88)));
            q = i610 % 128;
            int i611 = i610 % 2;
        }
        ArrayList<Item> arrayList4 = this.bv.R;
        if (arrayList4 != null) {
            this.bs = arrayList4;
            O(arrayList4, this.sp_marital_status);
            if (this.bc) {
                int i70 = q;
                int i71 = (((i70 | 6) << 1) - (i70 ^ 6)) - 1;
                p = i71 % 128;
                int i72 = i71 % 2;
                int i73 = i70 | 99;
                int i74 = i73 << 1;
                int i75 = -((~(i70 & 99)) & i73);
                int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                p = i76 % 128;
                int i77 = i76 % 2;
                int i78 = 0;
                while (i78 < this.bs.size()) {
                    int i79 = q;
                    int i80 = (i79 ^ 86) + ((i79 & 86) << 1);
                    int i81 = (i80 ^ (-1)) + (i80 << 1);
                    p = i81 % 128;
                    int i82 = i81 % 2;
                    if (this.bs.get(i78).getOptionId() == this.aN.marital_status) {
                        break;
                    }
                    int i83 = p;
                    int i84 = ((i83 | 81) << 1) - (((~i83) & 81) | (i83 & (-82)));
                    q = i84 % 128;
                    if (i84 % 2 != 0) {
                        int i85 = ((i78 ^ 83) | (i78 & 83)) << 1;
                        int i86 = -(((~i78) & 83) | (i78 & (-84)));
                        i78 = ((i85 | i86) << 1) - (i86 ^ i85);
                    } else {
                        i78 = (((i78 & (-2)) | ((~i78) & 1)) - (~(-(-((i78 & 1) << 1))))) - 1;
                    }
                }
            }
        } else {
            new au(this, "marital_status", getResources().getString(R.string.marital_status), this.sp_marital_status, new K(this)).execute(new Void[0]);
        }
        ArrayList<Item> arrayList5 = this.bv.S;
        if (arrayList5 == null) {
            au auVar4 = new au(this, "disability_status", getResources().getString(R.string.disablity_status), this.sp_disability, new aa(this));
            int i87 = p;
            int i88 = ((i87 ^ 121) | (i87 & 121)) << 1;
            int i89 = -(((~i87) & 121) | (i87 & (-122)));
            int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
            q = i90 % 128;
            int i91 = i90 % 2;
            auVar4.execute(new Void[0]);
        } else {
            this.bA = arrayList5;
            O(arrayList5, this.sp_disability);
            if (this.bc) {
                int i92 = q;
                int i93 = ((i92 ^ 64) + ((i92 & 64) << 1)) - 1;
                p = i93 % 128;
                int i94 = i93 % 2;
                for (int i95 = 0; i95 < this.bA.size(); i95++) {
                    int i96 = q;
                    int i97 = i96 & 19;
                    int i98 = ((i96 | 19) & (~i97)) + (i97 << 1);
                    p = i98 % 128;
                    int i99 = i98 % 2;
                    int optionId4 = this.bA.get(i95).getOptionId();
                    int i100 = p;
                    int i101 = i100 ^ 53;
                    int i102 = ((((i100 & 53) | i101) << 1) - (~(-i101))) - 1;
                    q = i102 % 128;
                    if (i102 % 2 != 0) {
                        int i103 = this.aN.disability;
                        throw null;
                    }
                    if (optionId4 == this.aN.disability) {
                        break;
                    }
                }
            }
        }
        ArrayList<Item> arrayList6 = this.bv.Q;
        if (arrayList6 == null) {
            au auVar5 = new au(this, "having_chronic_disease", getResources().getString(R.string.chronic_disease), this.sp_chronic_disease, new ab(this));
            int i104 = p + 31;
            q = i104 % 128;
            if (i104 % 2 != 0) {
                auVar5.execute(new Void[1]);
            } else {
                auVar5.execute(new Void[0]);
            }
        } else {
            this.br = arrayList6;
            O(arrayList6, this.sp_chronic_disease);
            int i105 = p;
            int i106 = i105 & 41;
            int i107 = i106 + ((i105 ^ 41) | i106);
            int i108 = i107 % 128;
            q = i108;
            if (i107 % 2 != 0) {
                int i109 = 49 / 0;
                if (this.bc) {
                    int i110 = (((i108 & (-102)) | ((~i108) & 101)) - (~(-(-((i108 & 101) << 1))))) - 1;
                    p = i110 % 128;
                    int i111 = i110 % 2;
                    i2 = 0;
                    while (i2 < this.br.size()) {
                        optionId = this.br.get(i2).getOptionId();
                        int i112 = q;
                        i3 = (i112 ^ 7) + ((i112 & 7) << 1);
                        p = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i113 = this.aN.chronic_disease;
                            throw null;
                        }
                        if (optionId != this.aN.chronic_disease) {
                            break;
                        }
                        int i114 = i2 & (-112);
                        int i115 = (i114 - (~(-(-((i2 ^ (-112)) | i114))))) - 1;
                        int i116 = i115 & 113;
                        i2 = (i116 << 1) + ((i115 | 113) & (~i116));
                    }
                }
            } else if (this.bc) {
                int i117 = (((i108 & (-102)) | ((~i108) & 101)) - (~(-(-((i108 & 101) << 1))))) - 1;
                p = i117 % 128;
                int i118 = i117 % 2;
                i2 = 0;
                while (i2 < this.br.size()) {
                    optionId = this.br.get(i2).getOptionId();
                    int i119 = q;
                    i3 = (i119 ^ 7) + ((i119 & 7) << 1);
                    p = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i1110 = this.aN.chronic_disease;
                        throw null;
                    }
                    if (optionId != this.aN.chronic_disease) {
                        break;
                        break;
                    }
                    int i1111 = i2 & (-112);
                    int i1112 = (i1111 - (~(-(-((i2 ^ (-112)) | i1111))))) - 1;
                    int i1113 = i1112 & 113;
                    i2 = (i1113 << 1) + ((i1112 | 113) & (~i1113));
                }
            }
        }
        ArrayList<Item> arrayList7 = this.bv.P;
        if (arrayList7 == null) {
            au auVar6 = new au(this, "gone_to_school", getResources().getString(R.string.attended_school), this.sp_attended_school, new U(this));
            int i120 = q;
            int i121 = i120 & 27;
            int i122 = (((i120 | 27) & (~i121)) - (~(i121 << 1))) - 1;
            p = i122 % 128;
            int i123 = i122 % 2;
            auVar6.execute(new Void[0]);
            int i124 = p;
            int i125 = (((i124 & (-110)) | ((~i124) & 109)) - (~((i124 & 109) << 1))) - 1;
            q = i125 % 128;
            if (i125 % 2 != 0) {
                int i126 = 2 % 3;
            }
        } else {
            this.bj = arrayList7;
            O(arrayList7, this.sp_attended_school);
            int i127 = q;
            int i128 = i127 | 31;
            int i129 = ((i128 << 1) - (~(-((~(i127 & 31)) & i128)))) - 1;
            p = i129 % 128;
            if (i129 % 2 == 0) {
                this.sp_attended_school.setOnItemSelectedListener(this.aU);
                throw null;
            }
            this.sp_attended_school.setOnItemSelectedListener(this.aU);
            if (this.bc) {
                int i130 = 0;
                while (i130 < this.bj.size()) {
                    int i131 = q + 113;
                    p = i131 % 128;
                    if (i131 % 2 == 0) {
                        optionId2 = this.bj.get(i130).getOptionId();
                        int i132 = 15 / 0;
                    } else {
                        optionId2 = this.bj.get(i130).getOptionId();
                    }
                    if (optionId2 == this.aN.attended_school) {
                        break;
                    }
                    int i133 = p;
                    int i134 = i133 & 17;
                    int i135 = i134 + ((i133 ^ 17) | i134);
                    q = i135 % 128;
                    if (i135 % 2 != 0) {
                        i130 += 56;
                    } else {
                        int i136 = ((i130 | (-115)) << 1) - (i130 ^ (-115));
                        i130 = (i136 & 116) + (i136 | 116);
                    }
                }
            }
        }
        ArrayList<Item> arrayList8 = this.bv.L;
        if (arrayList8 == null) {
            au auVar7 = new au(this, "highest_completed_education", getResources().getString(R.string.education_level), this.sp_highest_education, new E(this));
            int i137 = p;
            int i138 = ((i137 ^ 37) | (i137 & 37)) << 1;
            int i139 = -(((~i137) & 37) | (i137 & (-38)));
            int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
            q = i140 % 128;
            if (i140 % 2 != 0) {
                auVar7.execute(new Void[0]);
            } else {
                auVar7.execute(new Void[0]);
            }
        } else {
            this.aH = arrayList8;
            O(arrayList8, this.sp_highest_education);
            if (this.bc) {
                int i141 = q;
                int i142 = i141 & 115;
                int i143 = (~i142) & (i141 | 115);
                int i144 = -(-(i142 << 1));
                int i145 = (i143 & i144) + (i144 | i143);
                p = i145 % 128;
                int i146 = i145 % 2;
                int i147 = i141 + 111;
                p = i147 % 128;
                int i148 = i147 % 2;
                int i149 = 0;
                while (i149 < this.aH.size()) {
                    int optionId5 = this.aH.get(i149).getOptionId();
                    int i150 = p;
                    int i151 = i150 & 71;
                    int i152 = (i151 - (~((i150 ^ 71) | i151))) - 1;
                    q = i152 % 128;
                    int i153 = i152 % 2;
                    if (optionId5 == this.aN.higher_education) {
                        int i154 = p;
                        int i155 = (i154 & 99) + (i154 | 99);
                        q = i155 % 128;
                        if (i155 % 2 == 0) {
                            this.sp_highest_education.setSelection(i149);
                            break;
                        } else {
                            this.sp_highest_education.setSelection(i149);
                            throw null;
                        }
                    }
                    int i156 = i149 - 102;
                    int i157 = i156 & 103;
                    i149 = (((i156 ^ 103) | i157) << 1) - ((i156 | 103) & (~i157));
                }
            }
        }
        ArrayList<Item> arrayList9 = this.bv.O;
        if (arrayList9 == null) {
            new au(this, "work_status", getResources().getString(R.string.work_Activity), this.sp_work_activity, new ai(this)).execute(new Void[0]);
        } else {
            this.aI = arrayList9;
            O(arrayList9, this.sp_work_activity);
            int i158 = p;
            int i159 = ((i158 | 89) << 1) - (i158 ^ 89);
            q = i159 % 128;
            if (i159 % 2 != 0) {
                this.sp_work_activity.setOnItemSelectedListener(this.bi);
                int i160 = 66 / 0;
                if (this.bc) {
                    i4 = 0;
                    while (true) {
                        if (i4 < this.aI.size()) {
                            int i161 = q;
                            int i162 = (i161 & 7) + (i161 | 7);
                            p = i162 % 128;
                            int i163 = i162 % 2;
                            i4 = 0;
                            break;
                        }
                        int i164 = p;
                        int i165 = i164 & 101;
                        i5 = i165 + ((i164 ^ 101) | i165);
                        q = i5 % 128;
                        if (i5 % 2 == 0) {
                            this.aI.get(i4).getOptionId();
                            throw null;
                        }
                        optionId3 = this.aI.get(i4).getOptionId();
                        int i166 = q + 67;
                        p = i166 % 128;
                        int i167 = i166 % 2;
                        if (optionId3 != this.aN.work_activity) {
                            break;
                        }
                        int i168 = q;
                        int i169 = i168 ^ 71;
                        int i170 = (i168 & 71) << 1;
                        i6 = (i169 & i170) + (i170 | i169);
                        p = i6 % 128;
                        if (i6 % 2 == 0) {
                            i8 = i4 & 29;
                            i7 = i4 | 29;
                            i9 = i8 ^ i7;
                        } else {
                            int i171 = (((i4 | 62) << 1) - (i4 ^ 62)) - 1;
                            int i172 = i171 & (-60);
                            i7 = ((i171 ^ (-60)) | i172) << 1;
                            i8 = -((i171 | (-60)) & (~i172));
                            i9 = i7 ^ i8;
                        }
                        i4 = ((i7 & i8) << 1) + i9;
                    }
                    this.sp_work_activity.setSelection(i4);
                }
            } else {
                this.sp_work_activity.setOnItemSelectedListener(this.bi);
                if (!(!this.bc)) {
                    i4 = 0;
                    while (true) {
                        if (i4 < this.aI.size()) {
                            int i1610 = q;
                            int i1611 = (i1610 & 7) + (i1610 | 7);
                            p = i1611 % 128;
                            int i1612 = i1611 % 2;
                            i4 = 0;
                            break;
                        }
                        int i1613 = p;
                        int i1614 = i1613 & 101;
                        i5 = i1614 + ((i1613 ^ 101) | i1614);
                        q = i5 % 128;
                        if (i5 % 2 == 0) {
                            this.aI.get(i4).getOptionId();
                            throw null;
                        }
                        optionId3 = this.aI.get(i4).getOptionId();
                        int i1615 = q + 67;
                        p = i1615 % 128;
                        int i1616 = i1615 % 2;
                        if (optionId3 != this.aN.work_activity) {
                            break;
                            break;
                        }
                        int i1617 = q;
                        int i1618 = i1617 ^ 71;
                        int i173 = (i1617 & 71) << 1;
                        i6 = (i1618 & i173) + (i173 | i1618);
                        p = i6 % 128;
                        if (i6 % 2 == 0) {
                            i8 = i4 & 29;
                            i7 = i4 | 29;
                            i9 = i8 ^ i7;
                        } else {
                            int i174 = (((i4 | 62) << 1) - (i4 ^ 62)) - 1;
                            int i175 = i174 & (-60);
                            i7 = ((i174 ^ (-60)) | i175) << 1;
                            i8 = -((i174 | (-60)) & (~i175));
                            i9 = i7 ^ i8;
                        }
                        i4 = ((i7 & i8) << 1) + i9;
                    }
                    this.sp_work_activity.setSelection(i4);
                }
            }
        }
        ArrayList<Item> arrayList10 = this.bv.M;
        if (arrayList10 == null) {
            new au(this, "employment_status", getResources().getString(R.string.employment_status), this.sp_employment_status, new ae(this)).execute(new Void[0]);
        } else {
            this.aJ = arrayList10;
            O(arrayList10, this.sp_employment_status);
            if (this.bc) {
                int i176 = p + 43;
                q = i176 % 128;
                int i177 = i176 % 2 != 0 ? 1 : 0;
                while (true) {
                    if (i177 >= this.aJ.size()) {
                        int i178 = q + 13;
                        p = i178 % 128;
                        int i179 = i178 % 2;
                        i177 = 0;
                        break;
                    }
                    int i180 = p;
                    int i181 = (i180 & 69) + (i180 | 69);
                    q = i181 % 128;
                    int i182 = i181 % 2;
                    if (this.aJ.get(i177).getOptionId() == this.aN.employment_status) {
                        break;
                    }
                    int i183 = p;
                    int i184 = ((i183 | 51) << 1) - (i183 ^ 51);
                    q = i184 % 128;
                    int i185 = i184 % 2;
                    int i186 = i177 & 1;
                    int i187 = ((i177 ^ 1) | i186) << 1;
                    int i188 = -((i177 | 1) & (~i186));
                    i177 = ((i188 & i187) << 1) + (i187 ^ i188);
                    int i189 = i183 + 25;
                    q = i189 % 128;
                    int i190 = i189 % 2;
                }
                this.sp_employment_status.setSelection(i177);
            }
        }
        if (this.bc) {
            int i191 = p;
            int i192 = ((i191 ^ 7) - (~((i191 & 7) << 1))) - 1;
            q = i192 % 128;
            int i193 = i192 % 2;
            int i194 = 0;
            while (true) {
                if (i194 >= this.aL.size()) {
                    i194 = 0;
                    break;
                }
                int i195 = q;
                int i196 = ((i195 & 16) + (i195 | 16)) - 1;
                p = i196 % 128;
                int i197 = i196 % 2;
                String str2 = this.aL.get(i194);
                Roster roster = this.aN;
                int i198 = q;
                int i199 = ((i198 | 31) << 1) - (i198 ^ 31);
                p = i199 % 128;
                int i200 = i199 % 2;
                if (str2.equals(roster.mobile_network_name)) {
                    break;
                } else {
                    i194 = (i194 | 1) + (i194 & 1);
                }
            }
            this.sp_networks.setSelection(i194);
        }
        if (this.bc) {
            int i201 = 0;
            while (true) {
                if (i201 >= this.aG.size()) {
                    i201 = 0;
                    break;
                }
                int i202 = p;
                int i203 = i202 & 37;
                int i204 = (((i202 ^ 37) | i203) << 1) - ((i202 | 37) & (~i203));
                q = i204 % 128;
                int i205 = i204 % 2;
                if (this.aG.get(i201).equals(this.aN.banks_name)) {
                    break;
                }
                int i206 = p;
                int i207 = i206 ^ 1;
                int i208 = ((((i206 & 1) | i207) << 1) - (~(-i207))) - 1;
                q = i208 % 128;
                int i209 = i208 % 2;
                int i210 = (i201 | 1) << 1;
                int i211 = -(i201 ^ 1);
                i201 = ((i211 & i210) << 1) + (i210 ^ i211);
            }
            this.sp_banks.setSelection(i201);
        }
        ac.m(new Spinner[]{this.sp_disability, this.sp_chronic_disease, this.sp_employment_status}, new o[]{null, null, null});
        EditText editText = this.et_RosterCNIC;
        editText.addTextChangedListener(new Oooo0(editText));
        EditText editText2 = this.et_RosterCNICRepeat;
        editText2.addTextChangedListener(new Oooo0(editText2));
        EditText editText3 = this.por_roster;
        editText3.addTextChangedListener(new Oooo000(editText3));
        this.sp_highest_education.setOnItemSelectedListener(new OooO());
        this.radioGroupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bI.D
            private static int a = 1;
            private static int b;
            public final /* synthetic */ OfflineRosterActivity d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
            /* JADX WARN: Code duplicated, block: B:35:0x010e  */
            /* JADX WARN: Code duplicated, block: B:37:0x011d  */
            /* JADX WARN: Code duplicated, block: B:39:0x0125  */
            /* JADX WARN: Code duplicated, block: B:41:0x014f  */
            /* JADX WARN: Code duplicated, block: B:43:0x0155  */
            /* JADX WARN: Code duplicated, block: B:58:0x01b7  */
            /* JADX WARN: Code duplicated, block: B:60:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:61:0x01d0  */
            /* JADX WARN: Code duplicated, block: B:62:0x01e4  */
            /* JADX WARN: Code duplicated, block: B:64:0x01e8  */
            /* JADX WARN: Code duplicated, block: B:65:0x0203  */
            /* JADX WARN: Code duplicated, block: B:67:0x0206  */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i512) {
                int i513;
                int checkedRadioButtonId;
                RadioButton radioButton;
                int i514;
                int i515;
                int i516 = 2 % 2;
                int i517 = a;
                int i518 = i517 & 59;
                int i519 = (((i517 | 59) & (~i518)) - (~(-(-(i518 << 1))))) - 1;
                int i612 = i519 % 128;
                b = i612;
                int i613 = i519 % 2;
                Object obj = null;
                if (i20 != 0) {
                    int i614 = i612 & 33;
                    int i615 = (~i614) & (i612 | 33);
                    int i616 = -(-(i614 << 1));
                    int i617 = ((i615 | i616) << 1) - (i616 ^ i615);
                    int i618 = i617 % 128;
                    a = i618;
                    int i619 = i617 % 2;
                    int i620 = i618 & 49;
                    int i621 = -(-((i618 ^ 49) | i620));
                    int i710 = (i620 & i621) + (i621 | i620);
                    b = i710 % 128;
                    if (i710 % 2 != 0) {
                        OfflineRosterActivity offlineRosterActivity = this.d;
                        offlineRosterActivity.radioButtonCalendarYes.getId();
                        TextView textView = offlineRosterActivity.tv_dob;
                        obj.hashCode();
                        throw null;
                    }
                    OfflineRosterActivity offlineRosterActivity2 = this.d;
                    offlineRosterActivity2.radioButtonCalendarYes.getId();
                    TextView textView2 = offlineRosterActivity2.tv_dob;
                    int i711 = b;
                    int i712 = i711 & 83;
                    int i713 = (i712 - (~((i711 ^ 83) | i712))) - 1;
                    a = i713 % 128;
                    int i714 = i713 % 2;
                    textView2.setEnabled(true);
                    offlineRosterActivity2.spinnerYear.setEnabled(false);
                    Spinner spinner2 = offlineRosterActivity2.spinnerMonth;
                    int i715 = b + 13;
                    a = i715 % 128;
                    if (i715 % 2 == 0) {
                        spinner2.setEnabled(true);
                    } else {
                        spinner2.setEnabled(false);
                    }
                    int i716 = b;
                    int i717 = (((i716 | 22) << 1) - (i716 ^ 22)) - 1;
                    a = i717 % 128;
                    if (i717 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                OfflineRosterActivity offlineRosterActivity3 = this.d;
                int i718 = OfflineRosterActivity.af;
                int i719 = offlineRosterActivity3.ac;
                int i810 = a;
                int i811 = i810 & 123;
                int i812 = (i810 ^ 123) | i811;
                int i813 = (i811 ^ i812) + ((i812 & i811) << 1);
                int i814 = i813 % 128;
                b = i814;
                int i815 = i813 % 2;
                if (i719 != 1) {
                    int i816 = ((i814 ^ 121) | (i814 & 121)) << 1;
                    int i817 = -(((~i814) & 121) | (i814 & (-122)));
                    int i818 = (i816 ^ i817) + ((i817 & i816) << 1);
                    int i819 = i818 % 128;
                    a = i819;
                    if (i818 % 2 != 0 ? i719 != 2 : i719 != 3) {
                        int i910 = i819 & 63;
                        int i911 = (i819 | 63) & (~i910);
                        int i912 = i910 << 1;
                        int i913 = (i911 & i912) + (i912 | i911);
                        b = i913 % 128;
                        if (i913 % 2 != 0) {
                            int i914 = 12 / 0;
                            if (!(!ag.d)) {
                                if (ag.j == 1) {
                                    int i9110 = b;
                                    int i9111 = ((i9110 & 68) + (i9110 | 68)) - 1;
                                    a = i9111 % 128;
                                    int i9112 = i9111 % 2;
                                    if (i512 == offlineRosterActivity3.radioButtonFemale.getId()) {
                                        int i9113 = b;
                                        i513 = (i9113 ^ 79) + ((i9113 & 79) << 1);
                                        a = i513 % 128;
                                        if (i513 % 2 != 0) {
                                            double d4 = offlineRosterActivity3.aQ;
                                            throw null;
                                        }
                                        if (offlineRosterActivity3.aQ >= 18.0d) {
                                            int i9114 = a;
                                            int i101110 = i9114 ^ 89;
                                            int i101111 = (i9114 & 89) << 1;
                                            int i101112 = ((i101110 | i101111) << 1) - (i101111 ^ i101110);
                                            b = i101112 % 128;
                                            int i101113 = i101112 % 2;
                                            checkedRadioButtonId = offlineRosterActivity3.radioGroupCNICOptions.getCheckedRadioButtonId();
                                            radioButton = offlineRosterActivity3.radioButtonCNICPresent;
                                            int i101114 = b;
                                            i514 = ((i101114 ^ 82) + ((i101114 & 82) << 1)) - 1;
                                            a = i514 % 128;
                                            if (i514 % 2 != 0) {
                                                radioButton.getId();
                                                throw null;
                                            }
                                            if (checkedRadioButtonId == radioButton.getId()) {
                                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                                offlineRosterActivity3.aF = false;
                                                int i101118 = a;
                                                int i101119 = (i101118 & 105) + (i101118 | 105);
                                                b = i101119 % 128;
                                                int i1011110 = i101119 % 2;
                                            } else {
                                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                                offlineRosterActivity3.aF = false;
                                                int i1011111 = a;
                                                int i1011112 = (i1011111 & 105) + (i1011111 | 105);
                                                b = i1011112 % 128;
                                                int i1011113 = i1011112 % 2;
                                            }
                                        } else {
                                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                            offlineRosterActivity3.aF = false;
                                            int i111110 = a;
                                            int i111111 = i111110 ^ 93;
                                            int i111112 = ((i111110 & 93) | i111111) << 1;
                                            int i111113 = -i111111;
                                            int i111114 = (i111112 ^ i111113) + ((i111112 & i111113) << 1);
                                            b = i111114 % 128;
                                            int i111115 = i111114 % 2;
                                        }
                                    } else {
                                        offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                        offlineRosterActivity3.aF = false;
                                        int i111116 = b;
                                        int i111117 = ((i111116 ^ 125) | (i111116 & 125)) << 1;
                                        int i111118 = -(((~i111116) & 125) | (i111116 & (-126)));
                                        int i111119 = (i111117 & i111118) + (i111118 | i111117);
                                        a = i111119 % 128;
                                        int i1212 = i111119 % 2;
                                    }
                                }
                            }
                        } else if (ag.d) {
                            if (ag.j == 1) {
                                int i9115 = b;
                                int i9116 = ((i9115 & 68) + (i9115 | 68)) - 1;
                                a = i9116 % 128;
                                int i9117 = i9116 % 2;
                                if (i512 == offlineRosterActivity3.radioButtonFemale.getId()) {
                                    int i9118 = b;
                                    i513 = (i9118 ^ 79) + ((i9118 & 79) << 1);
                                    a = i513 % 128;
                                    if (i513 % 2 != 0) {
                                        double d5 = offlineRosterActivity3.aQ;
                                        throw null;
                                    }
                                    if (offlineRosterActivity3.aQ >= 18.0d) {
                                        int i9119 = a;
                                        int i101115 = i9119 ^ 89;
                                        int i101116 = (i9119 & 89) << 1;
                                        int i101117 = ((i101115 | i101116) << 1) - (i101116 ^ i101115);
                                        b = i101117 % 128;
                                        int i1011114 = i101117 % 2;
                                        checkedRadioButtonId = offlineRosterActivity3.radioGroupCNICOptions.getCheckedRadioButtonId();
                                        radioButton = offlineRosterActivity3.radioButtonCNICPresent;
                                        int i1011115 = b;
                                        i514 = ((i1011115 ^ 82) + ((i1011115 & 82) << 1)) - 1;
                                        a = i514 % 128;
                                        if (i514 % 2 != 0) {
                                            radioButton.getId();
                                            throw null;
                                        }
                                        if (checkedRadioButtonId == radioButton.getId()) {
                                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                            offlineRosterActivity3.aF = false;
                                            int i1011116 = a;
                                            int i1011117 = (i1011116 & 105) + (i1011116 | 105);
                                            b = i1011117 % 128;
                                            int i1011118 = i1011117 % 2;
                                        } else {
                                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                            offlineRosterActivity3.aF = false;
                                            int i1011119 = a;
                                            int i10111110 = (i1011119 & 105) + (i1011119 | 105);
                                            b = i10111110 % 128;
                                            int i10111111 = i10111110 % 2;
                                        }
                                    } else {
                                        offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                        offlineRosterActivity3.aF = false;
                                        int i1111110 = a;
                                        int i1111111 = i1111110 ^ 93;
                                        int i1111112 = ((i1111110 & 93) | i1111111) << 1;
                                        int i1111113 = -i1111111;
                                        int i1111114 = (i1111112 ^ i1111113) + ((i1111112 & i1111113) << 1);
                                        b = i1111114 % 128;
                                        int i1111115 = i1111114 % 2;
                                    }
                                } else {
                                    offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                    offlineRosterActivity3.aF = false;
                                    int i1111116 = b;
                                    int i1111117 = ((i1111116 ^ 125) | (i1111116 & 125)) << 1;
                                    int i1111118 = -(((~i1111116) & 125) | (i1111116 & (-126)));
                                    int i1111119 = (i1111117 & i1111118) + (i1111118 | i1111117);
                                    a = i1111119 % 128;
                                    int i1213 = i1111119 % 2;
                                }
                            }
                        }
                    } else if (ag.j == 1) {
                        int i91110 = b;
                        int i91111 = ((i91110 & 68) + (i91110 | 68)) - 1;
                        a = i91111 % 128;
                        int i91112 = i91111 % 2;
                        if (i512 == offlineRosterActivity3.radioButtonFemale.getId()) {
                            int i91113 = b;
                            i513 = (i91113 ^ 79) + ((i91113 & 79) << 1);
                            a = i513 % 128;
                            if (i513 % 2 != 0) {
                                double d6 = offlineRosterActivity3.aQ;
                                throw null;
                            }
                            if (offlineRosterActivity3.aQ >= 18.0d) {
                                int i91114 = a;
                                int i1011120 = i91114 ^ 89;
                                int i1011121 = (i91114 & 89) << 1;
                                int i1011122 = ((i1011120 | i1011121) << 1) - (i1011121 ^ i1011120);
                                b = i1011122 % 128;
                                int i10111112 = i1011122 % 2;
                                checkedRadioButtonId = offlineRosterActivity3.radioGroupCNICOptions.getCheckedRadioButtonId();
                                radioButton = offlineRosterActivity3.radioButtonCNICPresent;
                                int i10111113 = b;
                                i514 = ((i10111113 ^ 82) + ((i10111113 & 82) << 1)) - 1;
                                a = i514 % 128;
                                if (i514 % 2 != 0) {
                                    radioButton.getId();
                                    throw null;
                                }
                                if (checkedRadioButtonId == radioButton.getId() || offlineRosterActivity3.et_RosterCNIC.length() != 15) {
                                    offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                    offlineRosterActivity3.aF = false;
                                    int i10111114 = a;
                                    int i10111115 = (i10111114 & 105) + (i10111114 | 105);
                                    b = i10111115 % 128;
                                    int i10111116 = i10111115 % 2;
                                } else {
                                    int i1210 = a;
                                    int i1211 = (i1210 & 99) + (i1210 | 99);
                                    b = i1211 % 128;
                                    int i1214 = i1211 % 2;
                                    if (offlineRosterActivity3.sp_marital_status.getSelectedItemPosition() != 0) {
                                        int i1215 = a;
                                        int i1216 = i1215 & 83;
                                        int i1217 = i1215 | 83;
                                        int i1218 = (i1216 & i1217) + (i1217 | i1216);
                                        b = i1218 % 128;
                                        if (i1218 % 2 == 0 ? offlineRosterActivity3.sp_marital_status.getSelectedItemPosition() == 1 : offlineRosterActivity3.sp_marital_status.getSelectedItemPosition() == 1) {
                                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                            offlineRosterActivity3.aF = false;
                                            int i1219 = b;
                                            i515 = (i1219 & 29) + (i1219 | 29);
                                            a = i515 % 128;
                                            if (i515 % 2 == 0) {
                                                int i1310 = 5 / 4;
                                            }
                                        } else {
                                            int i1311 = b;
                                            int i1312 = (i1311 ^ 84) + ((i1311 & 84) << 1);
                                            int i1313 = (i1312 ^ (-1)) + (i1312 << 1);
                                            a = i1313 % 128;
                                            if (i1313 % 2 == 0) {
                                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(0);
                                                offlineRosterActivity3.aF = false;
                                            } else {
                                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(0);
                                                offlineRosterActivity3.aF = true;
                                            }
                                        }
                                    } else {
                                        offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                        offlineRosterActivity3.aF = false;
                                        int i12110 = b;
                                        i515 = (i12110 & 29) + (i12110 | 29);
                                        a = i515 % 128;
                                        if (i515 % 2 == 0) {
                                            int i1314 = 5 / 4;
                                        }
                                    }
                                }
                            } else {
                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                offlineRosterActivity3.aF = false;
                                int i11111110 = a;
                                int i11111111 = i11111110 ^ 93;
                                int i11111112 = ((i11111110 & 93) | i11111111) << 1;
                                int i11111113 = -i11111111;
                                int i11111114 = (i11111112 ^ i11111113) + ((i11111112 & i11111113) << 1);
                                b = i11111114 % 128;
                                int i11111115 = i11111114 % 2;
                            }
                        } else {
                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                            offlineRosterActivity3.aF = false;
                            int i11111116 = b;
                            int i11111117 = ((i11111116 ^ 125) | (i11111116 & 125)) << 1;
                            int i11111118 = -(((~i11111116) & 125) | (i11111116 & (-126)));
                            int i11111119 = (i11111117 & i11111118) + (i11111118 | i11111117);
                            a = i11111119 % 128;
                            int i12111 = i11111119 % 2;
                        }
                    }
                } else if (ag.j == 1) {
                    int i91115 = b;
                    int i91116 = ((i91115 & 68) + (i91115 | 68)) - 1;
                    a = i91116 % 128;
                    int i91117 = i91116 % 2;
                    if (i512 == offlineRosterActivity3.radioButtonFemale.getId()) {
                        int i91118 = b;
                        i513 = (i91118 ^ 79) + ((i91118 & 79) << 1);
                        a = i513 % 128;
                        if (i513 % 2 != 0) {
                            double d7 = offlineRosterActivity3.aQ;
                            throw null;
                        }
                        if (offlineRosterActivity3.aQ >= 18.0d) {
                            int i91119 = a;
                            int i1011123 = i91119 ^ 89;
                            int i1011124 = (i91119 & 89) << 1;
                            int i1011125 = ((i1011123 | i1011124) << 1) - (i1011124 ^ i1011123);
                            b = i1011125 % 128;
                            int i10111117 = i1011125 % 2;
                            checkedRadioButtonId = offlineRosterActivity3.radioGroupCNICOptions.getCheckedRadioButtonId();
                            radioButton = offlineRosterActivity3.radioButtonCNICPresent;
                            int i10111118 = b;
                            i514 = ((i10111118 ^ 82) + ((i10111118 & 82) << 1)) - 1;
                            a = i514 % 128;
                            if (i514 % 2 != 0) {
                                radioButton.getId();
                                throw null;
                            }
                            if (checkedRadioButtonId == radioButton.getId()) {
                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                offlineRosterActivity3.aF = false;
                                int i10111119 = a;
                                int i101111110 = (i10111119 & 105) + (i10111119 | 105);
                                b = i101111110 % 128;
                                int i101111111 = i101111110 % 2;
                            } else {
                                offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                                offlineRosterActivity3.aF = false;
                                int i101111112 = a;
                                int i101111113 = (i101111112 & 105) + (i101111112 | 105);
                                b = i101111113 % 128;
                                int i101111114 = i101111113 % 2;
                            }
                        } else {
                            offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                            offlineRosterActivity3.aF = false;
                            int i111111110 = a;
                            int i111111111 = i111111110 ^ 93;
                            int i111111112 = ((i111111110 & 93) | i111111111) << 1;
                            int i111111113 = -i111111111;
                            int i111111114 = (i111111112 ^ i111111113) + ((i111111112 & i111111113) << 1);
                            b = i111111114 % 128;
                            int i111111115 = i111111114 % 2;
                        }
                    } else {
                        offlineRosterActivity3.checkBoxBispBenif.setVisibility(8);
                        offlineRosterActivity3.aF = false;
                        int i111111116 = b;
                        int i111111117 = ((i111111116 ^ 125) | (i111111116 & 125)) << 1;
                        int i111111118 = -(((~i111111116) & 125) | (i111111116 & (-126)));
                        int i111111119 = (i111111117 & i111111118) + (i111111118 | i111111117);
                        a = i111111119 % 128;
                        int i12112 = i111111119 % 2;
                    }
                }
                if (i512 == offlineRosterActivity3.radioButtonMale.getId()) {
                    int i1315 = b + 105;
                    a = i1315 % 128;
                    int i1316 = i1315 % 2;
                    if (offlineRosterActivity3.aQ >= 13.0d) {
                        offlineRosterActivity3.sp_marital_status.setVisibility(0);
                        int i1317 = (-2) - ((a + 80) ^ (-1));
                        b = i1317 % 128;
                        if (i1317 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    int i1318 = b;
                    int i1319 = i1318 & 43;
                    int i1410 = i1319 + ((i1318 ^ 43) | i1319);
                    a = i1410 % 128;
                    if (i1410 % 2 == 0) {
                        offlineRosterActivity3.sp_marital_status.setVisibility(118);
                        return;
                    } else {
                        offlineRosterActivity3.sp_marital_status.setVisibility(8);
                        return;
                    }
                }
                if (i512 == offlineRosterActivity3.radioButtonFemale.getId()) {
                    int i1411 = a + 45;
                    b = i1411 % 128;
                    if (i1411 % 2 != 0) {
                        double d8 = offlineRosterActivity3.aQ;
                        throw null;
                    }
                    if (offlineRosterActivity3.aQ < 10.0d) {
                        int i1412 = b;
                        int i1413 = i1412 & 57;
                        int i1414 = i1412 | 57;
                        int i1415 = ((i1413 | i1414) << 1) - (i1414 ^ i1413);
                        a = i1415 % 128;
                        int i1416 = i1415 % 2;
                        offlineRosterActivity3.sp_marital_status.setVisibility(8);
                        int i1417 = b + 53;
                        a = i1417 % 128;
                        if (i1417 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    offlineRosterActivity3.sp_marital_status.setVisibility(0);
                    int i1418 = a;
                    int i1419 = ((i1418 ^ 36) + ((i1418 & 36) << 1)) - 1;
                    b = i1419 % 128;
                    if (i1419 % 2 != 0) {
                        int i1510 = 2 % 3;
                    }
                }
                int i1511 = b;
                int i1512 = (i1511 | 15) << 1;
                int i1513 = -(i1511 ^ 15);
                int i1514 = ((i1512 | i1513) << 1) - (i1513 ^ i1512);
                a = i1514 % 128;
                if (i1514 % 2 == 0) {
                    throw null;
                }
            }
        });
        this.radioGroupLanguage.setOnCheckedChangeListener(new OooOO0());
        this.radioGroupCNICOptions.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bI.n
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ OfflineRosterActivity d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:136:0x0477  */
            /* JADX WARN: Code duplicated, block: B:138:0x04a6  */
            /* JADX WARN: Code duplicated, block: B:141:0x04b2  */
            /* JADX WARN: Code duplicated, block: B:143:0x04bd  */
            /* JADX WARN: Code duplicated, block: B:146:0x04ee  */
            /* JADX WARN: Code duplicated, block: B:147:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:150:0x0513  */
            /* JADX WARN: Code duplicated, block: B:65:0x0296  */
            /* JADX WARN: Code duplicated, block: B:67:0x029a  */
            /* JADX WARN: Code duplicated, block: B:69:0x02af  */
            /* JADX WARN: Code duplicated, block: B:72:0x02b9  */
            /* JADX WARN: Code restructure failed: missing block: B:100:0x0371, code lost:
            
                if ((r14 % 2) != 0) goto L102;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x0373, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x0374, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x0375, code lost:
            
                r0.radioGroupGender.getCheckedRadioButtonId();
                r0.radioButtonFemale.getId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x037f, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0380, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aF = false;
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.a;
                r0 = (r14 | 1) << 1;
                r14 = -(r14 ^ 1);
                r1 = (r0 & r14) + (r14 | r0);
                ivas.gov.bisp.enumeration.bI.C0121n.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0397, code lost:
            
                if ((r1 % 2) == 0) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x0399, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x039a, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x039b, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aF = false;
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b;
                r0 = r14 & 47;
                r14 = -(-((r14 ^ 47) | r0));
                r1 = (r0 ^ r14) + ((r14 & r0) << 1);
                ivas.gov.bisp.enumeration.bI.C0121n.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x03b4, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:156:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x02b6, code lost:
            
                if (r0.aQ >= 18.0d) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x02bd, code lost:
            
                if (r0.aQ >= 18.0d) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x02bf, code lost:
            
                r14 = (-2) - ((ivas.gov.bisp.enumeration.bI.C0121n.b + 74) ^ (-1));
                ivas.gov.bisp.enumeration.bI.C0121n.a = r14 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x02cc, code lost:
            
                if ((r14 % 2) == 0) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x02d6, code lost:
            
                if (r0.et_RosterCNIC.length() != 108) goto L105;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x02e1, code lost:
            
                if (r0.et_RosterCNIC.length() != 15) goto L105;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x02e3, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b + 63;
                ivas.gov.bisp.enumeration.bI.C0121n.a = r14 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x02ec, code lost:
            
                if ((r14 % 2) != 0) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x02fa, code lost:
            
                if (r0.radioGroupGender.getCheckedRadioButtonId() != r0.radioButtonFemale.getId()) goto L99;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0302, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 0) goto L95;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0304, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b;
                r1 = (((r14 | 96) << 1) - (r14 ^ 96)) - 1;
                ivas.gov.bisp.enumeration.bI.C0121n.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x0318, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 1) goto L95;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x031a, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b;
                r1 = (r14 & 53) + (r14 | 53);
                ivas.gov.bisp.enumeration.bI.C0121n.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x0326, code lost:
            
                if ((r1 % 2) == 0) goto L92;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0328, code lost:
            
                r0.checkBoxBispBenif.setVisibility(1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x032e, code lost:
            
                r0.checkBoxBispBenif.setVisibility(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x0333, code lost:
            
                r0.aF = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x0335, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x0336, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aF = false;
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b + 14;
                r0 = (r14 ^ (-1)) + (r14 << 1);
                ivas.gov.bisp.enumeration.bI.C0121n.a = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x034a, code lost:
            
                if ((r0 % 2) == 0) goto L156;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x034c, code lost:
            
                r13 = 10 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x034f, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x0350, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.a;
                r1 = r14 & 31;
                r14 = (r14 ^ 31) | r1;
                r4 = (r1 ^ r14) + ((r14 & r1) << 1);
                ivas.gov.bisp.enumeration.bI.C0121n.b = r4 % 128;
                r4 = r4 % 2;
                r0.aF = false;
                r14 = ivas.gov.bisp.enumeration.bI.C0121n.b + 35;
                ivas.gov.bisp.enumeration.bI.C0121n.a = r14 % 128;
             */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCheckedChanged(android.widget.RadioGroup r13, int r14) {
                /*
                    Method dump skipped, instruction units count: 1331
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.bI.C0121n.onCheckedChanged(android.widget.RadioGroup, int):void");
            }
        });
        this.spinnerYear.setOnItemSelectedListener(this.aV);
        this.spinnerMonth.setOnItemSelectedListener(this.aX);
        int i212 = p;
        int i213 = (((i212 | 86) << 1) - (i212 ^ 86)) - 1;
        q = i213 % 128;
        int i214 = i213 % 2;
    }

    public final void L() {
        int i = 2 % 2;
        int i2 = p + 37;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            this.spinnerYear.setSelection(1);
        } else {
            this.spinnerYear.setSelection(0);
        }
        this.aQ = 0.0d;
        this.tv_dob.setText(BuildConfig.FLAVOR);
        this.be = BuildConfig.FLAVOR;
        LinearLayout linearLayout = this.linearLayoutCNIC;
        int i3 = q;
        int i4 = ((i3 | 93) << 1) - (((~i3) & 93) | (i3 & (-94)));
        p = i4 % 128;
        int i5 = i4 % 2;
        linearLayout.setVisibility(0);
        this.linearLayoutCNICPic.setVisibility(8);
        RadioGroup radioGroup = this.radioGroupCNICOptions;
        int i6 = q;
        int i7 = (i6 ^ 45) + ((i6 & 45) << 1);
        p = i7 % 128;
        int i8 = i7 % 2;
        radioGroup.setVisibility(8);
        this.et_RosterCNIC.setVisibility(8);
        int i9 = p;
        int i10 = (((i9 ^ 47) | (i9 & 47)) << 1) - (((~i9) & 47) | (i9 & (-48)));
        q = i10 % 128;
        if (i10 % 2 != 0) {
            this.et_RosterCNICRepeat.setVisibility(76);
            this.buttonScanCNIC.setVisibility(42);
        } else {
            this.et_RosterCNICRepeat.setVisibility(8);
            this.buttonScanCNIC.setVisibility(8);
        }
        int i11 = q + 112;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        p = i12 % 128;
        int i13 = i12 % 2;
        this.btn_vald_cnic.setVisibility(8);
        Button button = this.btn_bio_cnic;
        int i14 = q;
        int i15 = (i14 & 35) + (i14 | 35);
        p = i15 % 128;
        int i16 = i15 % 2;
        button.setVisibility(8);
        int i17 = p;
        int i18 = (-2) - (((i17 ^ 88) + ((i17 & 88) << 1)) ^ (-1));
        q = i18 % 128;
        int i19 = i18 % 2;
    }

    public final void R() {
        Calendar gregorianCalendar;
        int i;
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = (i3 & 69) + (i3 | 69);
        q = i4 % 128;
        if (i4 % 2 != 0) {
            gregorianCalendar = GregorianCalendar.getInstance();
            i = gregorianCalendar.get(0);
        } else {
            gregorianCalendar = GregorianCalendar.getInstance();
            i = gregorianCalendar.get(1);
        }
        this.aZ = i;
        this.bb = gregorianCalendar.get(2);
        this.bd = gregorianCalendar.get(5);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.ae, new N(this, 2), this.aZ, this.bb, this.bd);
        DatePicker datePicker = datePickerDialog.getDatePicker();
        int i5 = this.aZ;
        int i6 = i5 & (-1900);
        int i7 = -(-((i5 ^ (-1900)) | i6));
        Date date = new Date((i6 ^ i7) + ((i7 & i6) << 1), this.bb, this.bd);
        int i8 = p;
        int i9 = i8 & 41;
        int i10 = i9 + ((i8 ^ 41) | i9);
        q = i10 % 128;
        int i11 = i10 % 2;
        datePicker.setMaxDate(date.getTime());
        datePickerDialog.show();
        int i12 = q + 19;
        p = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 77 / 0;
        }
    }

    public class OooOo00 implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooOo00() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 61) << 1) - (~(-(((~i2) & 61) | (i2 & (-62)))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:25:0x014a  */
        /* JADX WARN: Code duplicated, block: B:37:0x0189  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = i4 ^ 111;
            int i6 = ((i4 & 111) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            int checkedRadioButtonId = OfflineRosterActivity.this.radioGroupCalendar.getCheckedRadioButtonId();
            OfflineRosterActivity offlineRosterActivity = OfflineRosterActivity.this;
            int i10 = a;
            int i11 = i10 & 99;
            int i12 = (i10 | 99) & (~i11);
            int i13 = i11 << 1;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            b = i14 % 128;
            int i15 = i14 % 2;
            if (checkedRadioButtonId == offlineRosterActivity.radioButtonCalendarNo.getId()) {
                int i16 = a;
                int i17 = (((i16 & (-92)) | ((~i16) & 91)) - (~((i16 & 91) << 1))) - 1;
                int i18 = i17 % 128;
                b = i18;
                int i19 = i17 % 2;
                if (i > 115) {
                    int i20 = i18 & 11;
                    int i21 = (i18 | 11) & (~i20);
                    int i22 = -(-(i20 << 1));
                    int i23 = (i21 & i22) + (i21 | i22);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    Toast toastMakeText = Toast.makeText(OfflineRosterActivity.this.ae, "Maximum Age should be 115", 0);
                    int i25 = b;
                    int i26 = ((i25 & 44) + (i25 | 44)) - 1;
                    a = i26 % 128;
                    if (i26 % 2 != 0) {
                        toastMakeText.show();
                        OfflineRosterActivity.this.L();
                        int i27 = 56 / 0;
                    } else {
                        toastMakeText.show();
                        OfflineRosterActivity.this.L();
                    }
                    int i28 = b;
                    int i29 = i28 & 37;
                    int i30 = -(-((i28 ^ 37) | i29));
                    int i31 = (i29 & i30) + (i30 | i29);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    OfflineRosterActivity offlineRosterActivity2 = OfflineRosterActivity.this;
                    offlineRosterActivity2.tv_dob.setText(BuildConfig.FLAVOR);
                    int i33 = b;
                    int i34 = (i33 ^ 107) + ((i33 & 107) << 1);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    offlineRosterActivity2.be = BuildConfig.FLAVOR;
                    int i36 = a;
                    int i37 = (i36 ^ 47) + ((i36 & 47) << 1);
                    b = i37 % 128;
                    if (i37 % 2 == 0) {
                        int i38 = 87 / 0;
                        return;
                    }
                    return;
                }
                OfflineRosterActivity offlineRosterActivity3 = OfflineRosterActivity.this;
                offlineRosterActivity3.aQ = i;
                if (i <= 0) {
                    int i39 = b;
                    int i40 = ((((i39 ^ 97) | (i39 & 97)) << 1) - (~(-(((~i39) & 97) | (i39 & (-98)))))) - 1;
                    a = i40 % 128;
                    if (i40 % 2 != 0) {
                        throw null;
                    }
                    if (i == 0 && offlineRosterActivity3.spinnerMonth.getSelectedItemPosition() > 0) {
                        OfflineRosterActivity offlineRosterActivity4 = OfflineRosterActivity.this;
                        Spinner spinner = offlineRosterActivity4.spinnerMonth;
                        int i41 = b;
                        int i42 = i41 ^ 29;
                        int i43 = ((i41 & 29) | i42) << 1;
                        int i44 = -i42;
                        int i45 = (i43 & i44) + (i43 | i44);
                        a = i45 % 128;
                        int i46 = i45 % 2;
                        int selectedItemPosition = spinner.getSelectedItemPosition();
                        int selectedItemPosition2 = OfflineRosterActivity.this.spinnerYear.getSelectedItemPosition();
                        int i47 = a;
                        int i48 = i47 & 29;
                        int i49 = -(-(i47 | 29));
                        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                        b = i50 % 128;
                        int i51 = i50 % 2;
                        OfflineRosterActivity.u(offlineRosterActivity4, 1, selectedItemPosition, selectedItemPosition2);
                        int i52 = b;
                        int i53 = i52 | 5;
                        i2 = ((i53 << 1) - (~(-((~(i52 & 5)) & i53)))) - 1;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i54 = 5 % 5;
                        }
                    }
                } else {
                    OfflineRosterActivity offlineRosterActivity5 = OfflineRosterActivity.this;
                    Spinner spinner2 = offlineRosterActivity5.spinnerMonth;
                    int i410 = b;
                    int i411 = i410 ^ 29;
                    int i412 = ((i410 & 29) | i411) << 1;
                    int i413 = -i411;
                    int i414 = (i412 & i413) + (i412 | i413);
                    a = i414 % 128;
                    int i415 = i414 % 2;
                    int selectedItemPosition3 = spinner2.getSelectedItemPosition();
                    int selectedItemPosition4 = OfflineRosterActivity.this.spinnerYear.getSelectedItemPosition();
                    int i416 = a;
                    int i417 = i416 & 29;
                    int i418 = -(-(i416 | 29));
                    int i55 = ((i417 | i418) << 1) - (i418 ^ i417);
                    b = i55 % 128;
                    int i56 = i55 % 2;
                    OfflineRosterActivity.u(offlineRosterActivity5, 1, selectedItemPosition3, selectedItemPosition4);
                    int i57 = b;
                    int i58 = i57 | 5;
                    i2 = ((i58 << 1) - (~(-((~(i57 & 5)) & i58)))) - 1;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i59 = 5 % 5;
                    }
                }
                OfflineRosterActivity offlineRosterActivity6 = OfflineRosterActivity.this;
                offlineRosterActivity6.P(offlineRosterActivity6.aQ);
                if (i <= 0) {
                    int i60 = a;
                    int i61 = i60 & 65;
                    int i62 = (i61 - (~(-(-((i60 ^ 65) | i61))))) - 1;
                    b = i62 % 128;
                    int i63 = i62 % 2;
                    if (i == 0) {
                        int i64 = ((i60 & (-98)) | ((~i60) & 97)) + ((i60 & 97) << 1);
                        b = i64 % 128;
                        if (i64 % 2 == 0) {
                            OfflineRosterActivity.this.spinnerMonth.getSelectedItemPosition();
                            throw null;
                        }
                        if (OfflineRosterActivity.this.spinnerMonth.getSelectedItemPosition() > 0) {
                            OfflineRosterActivity offlineRosterActivity7 = OfflineRosterActivity.this;
                            offlineRosterActivity7.I(offlineRosterActivity7.aQ);
                            int i65 = b;
                            int i66 = (i65 & 91) + (i65 | 91);
                            a = i66 % 128;
                            int i67 = i66 % 2;
                        }
                    }
                } else {
                    OfflineRosterActivity offlineRosterActivity8 = OfflineRosterActivity.this;
                    offlineRosterActivity8.I(offlineRosterActivity8.aQ);
                    int i68 = b;
                    int i69 = (i68 & 91) + (i68 | 91);
                    a = i69 % 128;
                    int i610 = i69 % 2;
                }
            }
            int i70 = a;
            int i71 = (i70 & (-104)) | ((~i70) & 103);
            int i72 = -(-((i70 & 103) << 1));
            int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
            b = i73 % 128;
            if (i73 % 2 == 0) {
                int i74 = 19 / 0;
            }
        }
    }

    public static void u(OfflineRosterActivity offlineRosterActivity, int i, int i2, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = p;
        int i7 = (i6 & (-44)) | ((~i6) & 43);
        int i8 = (i6 & 43) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        q = i9 % 128;
        int i10 = i9 % 2;
        offlineRosterActivity.sp_marital_status.setSelection(0);
        int i11 = GregorianCalendar.getInstance().get(1);
        int i12 = p;
        int i13 = ((i12 | 49) << 1) - (i12 ^ 49);
        q = i13 % 128;
        int i14 = i13 % 2;
        int i15 = -i3;
        int i16 = i11 & i15;
        int i17 = (((i11 ^ i15) | i16) << 1) - (~(-((i15 | i11) & (~i16))));
        int i18 = i17 - 1;
        if (i2 == 0) {
            int i19 = i12 + 79;
            q = i19 % 128;
            int i20 = i19 % 2;
            int i21 = GregorianCalendar.getInstance().get(2);
            i4 = (((i21 | 2) << 1) - (i21 ^ 2)) - 1;
            int i22 = p;
            int i23 = i22 & 77;
            int i24 = (i22 ^ 77) | i23;
            int i25 = (i23 & i24) + (i24 | i23);
            q = i25 % 128;
            int i26 = i25 % 2;
        } else {
            int i27 = GregorianCalendar.getInstance().get(2);
            int i28 = i27 ^ 1;
            int i29 = -(-((i27 & 1) << 1));
            if (i2 > ((i28 | i29) << 1) - (i29 ^ i28)) {
                int i30 = p + 101;
                int i31 = i30 % 128;
                q = i31;
                int i32 = i30 % 2;
                i18 = i17 - 2;
                int i33 = (((i31 & (-118)) | ((~i31) & 117)) - (~(-(-((i31 & 117) << 1))))) - 1;
                p = i33 % 128;
                int i34 = i33 % 2;
            }
            int i35 = GregorianCalendar.getInstance().get(2);
            int i36 = (i35 ^ 2) + ((i35 & 2) << 1);
            int i37 = (i36 ^ (-1)) + (i36 << 1);
            int i38 = -i2;
            i4 = ((i37 | i38) << 1) - (i38 ^ i37);
            int i39 = q;
            int i40 = i39 & 41;
            int i41 = ((((i39 ^ 41) | i40) << 1) - (~(-((i39 | 41) & (~i40))))) - 1;
            int i42 = i41 % 128;
            p = i42;
            int i43 = i41 % 2;
            if (i4 < 0) {
                int i44 = ((i42 ^ 113) - (~(-(-((i42 & 113) << 1))))) - 1;
                int i45 = i44 % 128;
                q = i45;
                int i46 = i44 % 2;
                i4 = ((i4 & 13) + (i4 | 13)) - 1;
                int i47 = ((i45 | 21) << 1) - (i45 ^ 21);
                p = i47 % 128;
                int i48 = i47 % 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        int i49 = q;
        int i50 = i49 | 101;
        int i51 = i50 << 1;
        int i52 = -((~(i49 & 101)) & i50);
        int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
        p = i53 % 128;
        int i54 = i53 % 2;
        sb.append("-");
        sb.append(i4);
        int i55 = q;
        int i56 = (i55 ^ 29) + ((i55 & 29) << 1);
        p = i56 % 128;
        int i57 = i56 % 2;
        sb.append("-");
        sb.append(i18);
        int i58 = q;
        int i59 = i58 ^ 73;
        int i60 = -(-((i58 & 73) << 1));
        int i61 = (i59 & i60) + (i60 | i59);
        p = i61 % 128;
        int i62 = i61 % 2;
        String strD = D(sb.toString());
        int i63 = p;
        int i64 = ((i63 | 125) << 1) - (i63 ^ 125);
        q = i64 % 128;
        if (i64 % 2 != 0) {
            offlineRosterActivity.Q(strD, ivas.gov.bisp.enumeration.p091n.j.l(i, "-", i4, "-", i18));
            int i65 = 98 / 0;
        } else {
            offlineRosterActivity.Q(strD, ivas.gov.bisp.enumeration.p091n.j.l(i, "-", i4, "-", i18));
        }
        int i66 = p;
        int i67 = ((i66 ^ 24) + ((i66 & 24) << 1)) - 1;
        q = i67 % 128;
        if (i67 % 2 != 0) {
            int i68 = 58 / 0;
        }
    }

    public class OooOOO implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public OooOOO() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004b  */
        /* JADX WARN: Code duplicated, block: B:11:0x0051  */
        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            o000oOoO o000oooo;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 & 23;
            int i6 = (((i4 | 23) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 51 / 0;
                if (i != 0) {
                    o000oooo = OfflineRosterActivity.this.new o000oOoO(i, new OooO00o(i));
                    int i8 = b;
                    int i9 = ((i8 ^ 113) | (i8 & 113)) << 1;
                    int i10 = -(((~i8) & 113) | (i8 & (-114)));
                    i2 = (i9 & i10) + (i10 | i9);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        o000oooo.execute(new Void[0]);
                    } else {
                        o000oooo.execute(new Void[0]);
                    }
                }
            } else if (i != 0) {
                o000oooo = OfflineRosterActivity.this.new o000oOoO(i, new OooO00o(i));
                int i11 = b;
                int i12 = ((i11 ^ 113) | (i11 & 113)) << 1;
                int i13 = -(((~i11) & 113) | (i11 & (-114)));
                i2 = (i12 & i13) + (i13 | i12);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    o000oooo.execute(new Void[0]);
                } else {
                    o000oooo.execute(new Void[0]);
                }
            }
            int i14 = b;
            int i15 = (i14 & (-90)) | ((~i14) & 89);
            int i16 = (i14 & 89) << 1;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 77) | (i2 & 77)) << 1;
            int i4 = -(((~i2) & 77) | (i2 & (-78)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public class OooO00o implements a {
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ int c;

            /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity$OooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C0010OooO00o implements J {
                private static int a = 0;
                private static int b = 1;

                public C0010OooO00o() {
                }

                @Override // ivas.gov.bisp.enumeration.W.J
                public void fillList(ArrayList<Item> arrayList) {
                    int i = 2 % 2;
                    int i2 = b;
                    int i3 = (((i2 | 20) << 1) - (i2 ^ 20)) - 1;
                    a = i3 % 128;
                    int i4 = i3 % 2;
                    OfflineRosterActivity.this.bs = arrayList;
                    int i5 = a;
                    int i6 = i5 | 61;
                    int i7 = (i6 << 1) - ((~(i5 & 61)) & i6);
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 1 / 0;
                    }
                }
            }

            public OooO00o(int i) {
                this.c = i;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x01b7 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:102:0x01b7 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:103:0x01b7 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:104:0x01b7 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:105:0x01b7 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:107:0x030a A[EDGE_INSN: B:107:0x030a->B:68:0x030a BREAK  A[LOOP:1: B:51:0x0265->B:63:0x02d7], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:108:0x02fa A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:109:0x02ed A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x02bd A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:16:0x00cb  */
            /* JADX WARN: Code duplicated, block: B:18:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:19:0x00fe  */
            /* JADX WARN: Code duplicated, block: B:23:0x0115  */
            /* JADX WARN: Code duplicated, block: B:25:0x0120  */
            /* JADX WARN: Code duplicated, block: B:28:0x012d  */
            /* JADX WARN: Code duplicated, block: B:30:0x0139  */
            /* JADX WARN: Code duplicated, block: B:32:0x0145  */
            /* JADX WARN: Code duplicated, block: B:34:0x015f  */
            /* JADX WARN: Code duplicated, block: B:36:0x0195  */
            /* JADX WARN: Code duplicated, block: B:38:0x01ad  */
            /* JADX WARN: Code duplicated, block: B:44:0x020b  */
            /* JADX WARN: Code duplicated, block: B:46:0x0241  */
            /* JADX WARN: Code duplicated, block: B:48:0x024c  */
            /* JADX WARN: Code duplicated, block: B:49:0x0250  */
            /* JADX WARN: Code duplicated, block: B:53:0x0283  */
            /* JADX WARN: Code duplicated, block: B:55:0x0298  */
            /* JADX WARN: Code duplicated, block: B:57:0x02af  */
            /* JADX WARN: Code duplicated, block: B:61:0x02d2  */
            /* JADX WARN: Code duplicated, block: B:63:0x02d7 A[LOOP:1: B:51:0x0265->B:63:0x02d7, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:84:0x03b1  */
            /* JADX WARN: Code duplicated, block: B:86:0x03c6  */
            /* JADX WARN: Code duplicated, block: B:88:0x03cc  */
            /* JADX WARN: Code duplicated, block: B:89:0x03d8  */
            /* JADX WARN: Code duplicated, block: B:95:0x03fa  */
            /* JADX WARN: Code duplicated, block: B:99:0x01b0 A[SYNTHETIC] */
            @Override // ivas.gov.bisp.enumeration.W.a
            public void b(ArrayList<question_options> arrayList, int i) {
                ArrayList<Item> arrayList2;
                Item item;
                int i2;
                int i3;
                OfflineRosterActivity offlineRosterActivity;
                o oVar;
                int i4;
                OfflineRosterActivity offlineRosterActivity2;
                int i5;
                int i6;
                ArrayList<Item> arrayList3;
                int i7;
                Item item2;
                int i8;
                int i9;
                int i10;
                Item item3;
                ArrayList<Item> arrayList4;
                int i11;
                int i12;
                OfflineRosterActivity offlineRosterActivity3;
                double d;
                int i13;
                ArrayList<Item> arrayList5;
                int i14;
                int i15 = 2 % 2;
                int i16 = a;
                int i17 = (i16 & 99) + (i16 | 99);
                b = i17 % 128;
                Object obj = null;
                if (i17 % 2 == 0) {
                    ArrayList<Item> arrayList6 = OfflineRosterActivity.this.bu;
                    throw null;
                }
                int i18 = 0;
                if (OfflineRosterActivity.this.bu.get(this.c).getOptionId() != 271) {
                    int i19 = b;
                    int i20 = ((i19 ^ 108) + ((i19 & 108) << 1)) - 1;
                    a = i20 % 128;
                    if (i20 % 2 != 0) {
                        arrayList5 = OfflineRosterActivity.this.bu;
                        i14 = this.c;
                        int i21 = 4 / 0;
                    } else {
                        arrayList5 = OfflineRosterActivity.this.bu;
                        i14 = this.c;
                    }
                    if (arrayList5.get(i14).getOptionId() != 272) {
                        int i22 = b + 121;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        OfflineRosterActivity offlineRosterActivity4 = OfflineRosterActivity.this;
                        if (offlineRosterActivity4.aP) {
                            offlineRosterActivity4.aP = false;
                            int i24 = a;
                            int i25 = ((i24 & (-112)) | ((~i24) & 111)) + ((i24 & 111) << 1);
                            b = i25 % 128;
                            int i26 = i25 % 2;
                        } else {
                            OfflineRosterActivity offlineRosterActivity5 = OfflineRosterActivity.this;
                            au auVar = new au(offlineRosterActivity5, "marital_status", offlineRosterActivity5.getResources().getString(R.string.marital_status), OfflineRosterActivity.this.sp_marital_status, new C0010OooO00o());
                            int i27 = a;
                            int i28 = i27 & 83;
                            int i29 = i28 + ((i27 ^ 83) | i28);
                            b = i29 % 128;
                            int i30 = i29 % 2;
                            auVar.execute(new Void[0]);
                            int i31 = b;
                            int i32 = ((i31 | 23) << 1) - (i31 ^ 23);
                            a = i32 % 128;
                            int i33 = i32 % 2;
                        }
                    } else {
                        OfflineRosterActivity.this.bs = new ArrayList<>();
                        OfflineRosterActivity offlineRosterActivity6 = OfflineRosterActivity.this;
                        arrayList2 = offlineRosterActivity6.bs;
                        item = new Item(offlineRosterActivity6.getResources().getString(R.string.marital_status));
                        int i34 = b;
                        int i35 = i34 ^ 105;
                        i2 = (((i34 & 105) | i35) << 1) - i35;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            arrayList2.add(0, item);
                            i3 = 1;
                        } else {
                            arrayList2.add(0, item);
                            i3 = 0;
                        }
                        int i36 = b;
                        int i37 = (i36 ^ 99) + ((i36 & 99) << 1);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                        while (i3 < arrayList.size()) {
                            i10 = b + 101;
                            a = i10 % 128;
                            if (i10 % 2 != 0) {
                                if (arrayList.get(i3).option_id != 24242) {
                                    continue;
                                } else if (arrayList.get(i3).option_id != 202) {
                                    int i39 = a;
                                    int i40 = (((i39 | 82) << 1) - (i39 ^ 82)) - 1;
                                    b = i40 % 128;
                                    int i41 = i40 % 2;
                                    if (arrayList.get(i3).option_id != 203) {
                                        question_options question_optionsVar = arrayList.get(i3);
                                        item3 = new Item(question_optionsVar.option_id, question_optionsVar.option, question_optionsVar.question);
                                        int i42 = a;
                                        int i43 = i42 & 71;
                                        int i44 = i43 + ((i42 ^ 71) | i43);
                                        b = i44 % 128;
                                        int i45 = i44 % 2;
                                        arrayList4 = OfflineRosterActivity.this.bs;
                                        int i46 = b;
                                        int i47 = (i46 & 46) + (i46 | 46);
                                        i11 = (i47 ^ (-1)) + (i47 << 1);
                                        a = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            arrayList4.add(item3);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList4.add(item3);
                                        int i48 = a;
                                        int i49 = i48 & 101;
                                        int i50 = -(-((i48 ^ 101) | i49));
                                        i12 = ((i49 | i50) << 1) - (i50 ^ i49);
                                        b = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            int i51 = 4 / 2;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else if (arrayList.get(i3).option_id != 200) {
                                continue;
                            } else if (arrayList.get(i3).option_id != 202) {
                                int i310 = a;
                                int i410 = (((i310 | 82) << 1) - (i310 ^ 82)) - 1;
                                b = i410 % 128;
                                int i411 = i410 % 2;
                                if (arrayList.get(i3).option_id != 203) {
                                    question_options question_optionsVar2 = arrayList.get(i3);
                                    item3 = new Item(question_optionsVar2.option_id, question_optionsVar2.option, question_optionsVar2.question);
                                    int i412 = a;
                                    int i413 = i412 & 71;
                                    int i414 = i413 + ((i412 ^ 71) | i413);
                                    b = i414 % 128;
                                    int i415 = i414 % 2;
                                    arrayList4 = OfflineRosterActivity.this.bs;
                                    int i416 = b;
                                    int i417 = (i416 & 46) + (i416 | 46);
                                    i11 = (i417 ^ (-1)) + (i417 << 1);
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        arrayList4.add(item3);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    arrayList4.add(item3);
                                    int i418 = a;
                                    int i419 = i418 & 101;
                                    int i52 = -(-((i418 ^ 101) | i419));
                                    i12 = ((i419 | i52) << 1) - (i52 ^ i419);
                                    b = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        int i53 = 4 / 2;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                            int i54 = ((i3 & (-67)) + (i3 | (-67))) - 1;
                            int i55 = i54 & 69;
                            int i56 = -(-((i54 ^ 69) | i55));
                            i3 = ((i55 | i56) << 1) - (i55 ^ i56);
                            int i57 = a;
                            int i58 = (i57 | 29) << 1;
                            int i59 = -(i57 ^ 29);
                            int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
                            b = i60 % 128;
                            int i61 = i60 % 2;
                        }
                        offlineRosterActivity = OfflineRosterActivity.this;
                        OfflineRosterActivity offlineRosterActivity7 = OfflineRosterActivity.this;
                        oVar = new o(offlineRosterActivity7.ae, R.layout.spinner_item, offlineRosterActivity7.bs);
                        int i62 = a;
                        int i63 = i62 & 81;
                        int i64 = (i62 | 81) & (~i63);
                        int i65 = i63 << 1;
                        i4 = (i64 ^ i65) + ((i64 & i65) << 1);
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            offlineRosterActivity.aK = oVar;
                            OfflineRosterActivity.this.aK.setDropDownViewResource(R.layout.spinner_item_dropdown);
                            obj.hashCode();
                            throw null;
                        }
                        offlineRosterActivity.aK = oVar;
                        OfflineRosterActivity.this.aK.setDropDownViewResource(R.layout.spinner_item_dropdown);
                        OfflineRosterActivity offlineRosterActivity8 = OfflineRosterActivity.this;
                        Spinner spinner = offlineRosterActivity8.sp_marital_status;
                        o oVar2 = offlineRosterActivity8.aK;
                        int i66 = b;
                        int i67 = ((i66 ^ 23) | (i66 & 23)) << 1;
                        int i68 = -(((~i66) & 23) | (i66 & (-24)));
                        int i69 = (i67 & i68) + (i68 | i67);
                        a = i69 % 128;
                        int i70 = i69 % 2;
                        spinner.setAdapter((SpinnerAdapter) oVar2);
                        offlineRosterActivity2 = OfflineRosterActivity.this;
                        if (!(!offlineRosterActivity2.aP)) {
                            i5 = a + 85;
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                offlineRosterActivity2.aP = true;
                                i6 = 1;
                            } else {
                                offlineRosterActivity2.aP = false;
                                i6 = 0;
                            }
                            int i71 = b;
                            int i72 = (i71 & (-112)) | ((~i71) & 111);
                            int i73 = (i71 & 111) << 1;
                            int i74 = (i72 & i73) + (i73 | i72);
                            a = i74 % 128;
                            int i75 = i74 % 2;
                            while (true) {
                                arrayList3 = OfflineRosterActivity.this.bs;
                                int i76 = a;
                                int i77 = i76 & 97;
                                int i78 = (((i76 ^ 97) | i77) << 1) - ((i76 | 97) & (~i77));
                                b = i78 % 128;
                                int i79 = i78 % 2;
                                if (i6 < arrayList3.size()) {
                                    break;
                                }
                                int i80 = a;
                                int i81 = i80 & 79;
                                i7 = (((i80 | 79) & (~i81)) - (~(-(-(i81 << 1))))) - 1;
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    OfflineRosterActivity.this.bs.get(i6);
                                    obj.hashCode();
                                    throw null;
                                }
                                item2 = OfflineRosterActivity.this.bs.get(i6);
                                i8 = a + 63;
                                b = i8 % 128;
                                if (i8 % 2 != 0) {
                                    item2.getOptionId();
                                    Roster roster = OfflineRosterActivity.this.aN;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (item2.getOptionId() == OfflineRosterActivity.this.aN.marital_status) {
                                    int i82 = a;
                                    int i83 = i82 & 5;
                                    int i84 = -(-((i82 ^ 5) | i83));
                                    i9 = (i83 ^ i84) + ((i84 & i83) << 1);
                                    b = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        int i85 = 71 / 0;
                                    }
                                    i18 = i6;
                                    break;
                                }
                                i6 = (-2) - ((((i6 & 68) + (i6 | 68)) - 66) ^ (-1));
                                int i86 = a + 43;
                                b = i86 % 128;
                                int i87 = i86 % 2;
                            }
                            OfflineRosterActivity.this.sp_marital_status.setSelection(i18);
                            int i88 = b;
                            int i89 = ((i88 | 17) << 1) - (((~i88) & 17) | (i88 & (-18)));
                            a = i89 % 128;
                            int i90 = i89 % 2;
                        }
                    }
                } else {
                    OfflineRosterActivity.this.bs = new ArrayList<>();
                    OfflineRosterActivity offlineRosterActivity9 = OfflineRosterActivity.this;
                    arrayList2 = offlineRosterActivity9.bs;
                    item = new Item(offlineRosterActivity9.getResources().getString(R.string.marital_status));
                    int i311 = b;
                    int i312 = i311 ^ 105;
                    i2 = (((i311 & 105) | i312) << 1) - i312;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        arrayList2.add(0, item);
                        i3 = 1;
                    } else {
                        arrayList2.add(0, item);
                        i3 = 0;
                    }
                    int i313 = b;
                    int i314 = (i313 ^ 99) + ((i313 & 99) << 1);
                    a = i314 % 128;
                    int i315 = i314 % 2;
                    while (i3 < arrayList.size()) {
                        i10 = b + 101;
                        a = i10 % 128;
                        if (i10 % 2 != 0) {
                            if (arrayList.get(i3).option_id != 24242) {
                                continue;
                            } else if (arrayList.get(i3).option_id != 202) {
                                int i316 = a;
                                int i4110 = (((i316 | 82) << 1) - (i316 ^ 82)) - 1;
                                b = i4110 % 128;
                                int i4111 = i4110 % 2;
                                if (arrayList.get(i3).option_id != 203) {
                                    question_options question_optionsVar3 = arrayList.get(i3);
                                    item3 = new Item(question_optionsVar3.option_id, question_optionsVar3.option, question_optionsVar3.question);
                                    int i4112 = a;
                                    int i4113 = i4112 & 71;
                                    int i4114 = i4113 + ((i4112 ^ 71) | i4113);
                                    b = i4114 % 128;
                                    int i4115 = i4114 % 2;
                                    arrayList4 = OfflineRosterActivity.this.bs;
                                    int i4116 = b;
                                    int i4117 = (i4116 & 46) + (i4116 | 46);
                                    i11 = (i4117 ^ (-1)) + (i4117 << 1);
                                    a = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        arrayList4.add(item3);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    arrayList4.add(item3);
                                    int i4118 = a;
                                    int i4119 = i4118 & 101;
                                    int i510 = -(-((i4118 ^ 101) | i4119));
                                    i12 = ((i4119 | i510) << 1) - (i510 ^ i4119);
                                    b = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        int i511 = 4 / 2;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else if (arrayList.get(i3).option_id != 200) {
                            continue;
                        } else if (arrayList.get(i3).option_id != 202) {
                            int i317 = a;
                            int i41110 = (((i317 | 82) << 1) - (i317 ^ 82)) - 1;
                            b = i41110 % 128;
                            int i41111 = i41110 % 2;
                            if (arrayList.get(i3).option_id != 203) {
                                question_options question_optionsVar4 = arrayList.get(i3);
                                item3 = new Item(question_optionsVar4.option_id, question_optionsVar4.option, question_optionsVar4.question);
                                int i41112 = a;
                                int i41113 = i41112 & 71;
                                int i41114 = i41113 + ((i41112 ^ 71) | i41113);
                                b = i41114 % 128;
                                int i41115 = i41114 % 2;
                                arrayList4 = OfflineRosterActivity.this.bs;
                                int i41116 = b;
                                int i41117 = (i41116 & 46) + (i41116 | 46);
                                i11 = (i41117 ^ (-1)) + (i41117 << 1);
                                a = i11 % 128;
                                if (i11 % 2 == 0) {
                                    arrayList4.add(item3);
                                    obj.hashCode();
                                    throw null;
                                }
                                arrayList4.add(item3);
                                int i41118 = a;
                                int i41119 = i41118 & 101;
                                int i512 = -(-((i41118 ^ 101) | i41119));
                                i12 = ((i41119 | i512) << 1) - (i512 ^ i41119);
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                    int i513 = 4 / 2;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                        int i514 = ((i3 & (-67)) + (i3 | (-67))) - 1;
                        int i515 = i514 & 69;
                        int i516 = -(-((i514 ^ 69) | i515));
                        i3 = ((i515 | i516) << 1) - (i515 ^ i516);
                        int i517 = a;
                        int i518 = (i517 | 29) << 1;
                        int i519 = -(i517 ^ 29);
                        int i610 = (i518 ^ i519) + ((i519 & i518) << 1);
                        b = i610 % 128;
                        int i611 = i610 % 2;
                    }
                    offlineRosterActivity = OfflineRosterActivity.this;
                    OfflineRosterActivity offlineRosterActivity10 = OfflineRosterActivity.this;
                    oVar = new o(offlineRosterActivity10.ae, R.layout.spinner_item, offlineRosterActivity10.bs);
                    int i612 = a;
                    int i613 = i612 & 81;
                    int i614 = (i612 | 81) & (~i613);
                    int i615 = i613 << 1;
                    i4 = (i614 ^ i615) + ((i614 & i615) << 1);
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        offlineRosterActivity.aK = oVar;
                        OfflineRosterActivity.this.aK.setDropDownViewResource(R.layout.spinner_item_dropdown);
                        obj.hashCode();
                        throw null;
                    }
                    offlineRosterActivity.aK = oVar;
                    OfflineRosterActivity.this.aK.setDropDownViewResource(R.layout.spinner_item_dropdown);
                    OfflineRosterActivity offlineRosterActivity11 = OfflineRosterActivity.this;
                    Spinner spinner2 = offlineRosterActivity11.sp_marital_status;
                    o oVar3 = offlineRosterActivity11.aK;
                    int i616 = b;
                    int i617 = ((i616 ^ 23) | (i616 & 23)) << 1;
                    int i618 = -(((~i616) & 23) | (i616 & (-24)));
                    int i619 = (i617 & i618) + (i618 | i617);
                    a = i619 % 128;
                    int i710 = i619 % 2;
                    spinner2.setAdapter((SpinnerAdapter) oVar3);
                    offlineRosterActivity2 = OfflineRosterActivity.this;
                    if (!(!offlineRosterActivity2.aP)) {
                        i5 = a + 85;
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            offlineRosterActivity2.aP = true;
                            i6 = 1;
                        } else {
                            offlineRosterActivity2.aP = false;
                            i6 = 0;
                        }
                        int i711 = b;
                        int i712 = (i711 & (-112)) | ((~i711) & 111);
                        int i713 = (i711 & 111) << 1;
                        int i714 = (i712 & i713) + (i713 | i712);
                        a = i714 % 128;
                        int i715 = i714 % 2;
                        while (true) {
                            arrayList3 = OfflineRosterActivity.this.bs;
                            int i716 = a;
                            int i717 = i716 & 97;
                            int i718 = (((i716 ^ 97) | i717) << 1) - ((i716 | 97) & (~i717));
                            b = i718 % 128;
                            int i719 = i718 % 2;
                            if (i6 < arrayList3.size()) {
                                break;
                                break;
                            }
                            int i810 = a;
                            int i811 = i810 & 79;
                            i7 = (((i810 | 79) & (~i811)) - (~(-(-(i811 << 1))))) - 1;
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                OfflineRosterActivity.this.bs.get(i6);
                                obj.hashCode();
                                throw null;
                            }
                            item2 = OfflineRosterActivity.this.bs.get(i6);
                            i8 = a + 63;
                            b = i8 % 128;
                            if (i8 % 2 != 0) {
                                item2.getOptionId();
                                Roster roster2 = OfflineRosterActivity.this.aN;
                                obj.hashCode();
                                throw null;
                            }
                            if (item2.getOptionId() == OfflineRosterActivity.this.aN.marital_status) {
                                int i812 = a;
                                int i813 = i812 & 5;
                                int i814 = -(-((i812 ^ 5) | i813));
                                i9 = (i813 ^ i814) + ((i814 & i813) << 1);
                                b = i9 % 128;
                                if (i9 % 2 == 0) {
                                    int i815 = 71 / 0;
                                }
                                i18 = i6;
                                break;
                            }
                            i6 = (-2) - ((((i6 & 68) + (i6 | 68)) - 66) ^ (-1));
                            int i816 = a + 43;
                            b = i816 % 128;
                            int i817 = i816 % 2;
                        }
                        OfflineRosterActivity.this.sp_marital_status.setSelection(i18);
                        int i818 = b;
                        int i819 = ((i818 | 17) << 1) - (((~i818) & 17) | (i818 & (-18)));
                        a = i819 % 128;
                        int i91 = i819 % 2;
                    }
                }
                ArrayList<Item> arrayList7 = OfflineRosterActivity.this.bu;
                int i92 = this.c;
                int i93 = a;
                int i94 = i93 ^ 113;
                int i95 = -(-((i93 & 113) << 1));
                int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                b = i96 % 128;
                if (i96 % 2 != 0 ? arrayList7.get(i92).getOptionId() == 186 : arrayList7.get(i92).getOptionId() == 29732) {
                    int i97 = (-2) - ((a + 68) ^ (-1));
                    b = i97 % 128;
                    if (i97 % 2 == 0) {
                        double d2 = OfflineRosterActivity.this.aQ;
                        throw null;
                    }
                    OfflineRosterActivity offlineRosterActivity12 = OfflineRosterActivity.this;
                    double d3 = offlineRosterActivity12.aQ;
                    int i98 = a;
                    int i99 = i98 & 17;
                    int i100 = (((i98 ^ 17) | i99) << 1) - ((~i99) & (i98 | 17));
                    b = i100 % 128;
                    int i101 = i100 % 2;
                    if (d3 <= 0.0d) {
                        int i102 = (-2) - ((((i98 | 126) << 1) - (i98 ^ 126)) ^ (-1));
                        b = i102 % 128;
                        int i103 = i102 % 2;
                        if (d3 == 0.0d) {
                            int i104 = i98 ^ 71;
                            int i105 = (((i98 & 71) | i104) << 1) - i104;
                            b = i105 % 128;
                            int i106 = i105 % 2;
                            if (offlineRosterActivity12.spinnerMonth.getSelectedItemPosition() > 0) {
                                offlineRosterActivity3 = OfflineRosterActivity.this;
                                d = offlineRosterActivity3.aQ;
                                int i107 = a;
                                int i108 = i107 & 7;
                                i13 = i108 + ((i107 ^ 7) | i108);
                                b = i13 % 128;
                                if (i13 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                if (d < 18.0d) {
                                    offlineRosterActivity3.I(d);
                                    int i109 = a + 1;
                                    b = i109 % 128;
                                    int i110 = i109 % 2;
                                }
                            }
                        }
                    } else {
                        offlineRosterActivity3 = OfflineRosterActivity.this;
                        d = offlineRosterActivity3.aQ;
                        int i1010 = a;
                        int i1011 = i1010 & 7;
                        i13 = i1011 + ((i1010 ^ 7) | i1011);
                        b = i13 % 128;
                        if (i13 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (d < 18.0d) {
                            offlineRosterActivity3.I(d);
                            int i1012 = a + 1;
                            b = i1012 % 128;
                            int i111 = i1012 % 2;
                        }
                    }
                }
                int i112 = a;
                int i113 = i112 & 111;
                int i114 = ((i112 ^ 111) | i113) << 1;
                int i115 = -((i112 | 111) & (~i113));
                int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                b = i116 % 128;
                int i117 = i116 % 2;
            }
        }
    }

    public final void M() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 91;
        int i4 = (((~i3) & (i2 | 91)) - (~(i3 << 1))) - 1;
        q = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 | 15;
        int i7 = (i6 << 1) - ((~(i2 & 15)) & i6);
        q = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < this.radioGroupGender.getChildCount()) {
            int i10 = q;
            int i11 = i10 & 123;
            int i12 = (i11 - (~((i10 ^ 123) | i11))) - 1;
            p = i12 % 128;
            int i13 = i12 % 2;
            i9 = ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupGender, i9, true, i9, 1);
        }
        int i14 = p;
        int i15 = (i14 ^ 117) + ((i14 & 117) << 1);
        q = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < this.radioGroupCalendar.getChildCount()) {
            int i18 = q;
            int i19 = (i18 & 11) + (i18 | 11);
            p = i19 % 128;
            int i20 = i19 % 2;
            i17 = ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupCalendar, i17, true, i17, 1);
            int i21 = q;
            int i22 = (i21 ^ 95) + ((i21 & 95) << 1);
            p = i22 % 128;
            int i23 = i22 % 2;
        }
        this.tv_dob.setEnabled(true);
        RadioGroup radioGroup = this.radioGroupGender;
        int i24 = q;
        int i25 = (i24 | 89) << 1;
        int i26 = -(((~i24) & 89) | (i24 & (-90)));
        int i27 = (i25 & i26) + (i26 | i25);
        p = i27 % 128;
        int i28 = i27 % 2;
        radioGroup.clearCheck();
        this.radioGroupCalendar.clearCheck();
        int i29 = q;
        int i30 = i29 ^ 1;
        int i31 = -(-((i29 & 1) << 1));
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        p = i32 % 128;
        int i33 = i32 % 2;
        this.tv_dob.setHint("Date of Birth");
        TextView textView = this.tv_dob;
        int i34 = p;
        int i35 = i34 ^ 61;
        int i36 = (i34 & 61) << 1;
        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
        q = i37 % 128;
        int i38 = i37 % 2;
        textView.setText(BuildConfig.FLAVOR);
        this.spinnerYear.setSelection(0);
        int i39 = q;
        int i40 = (i39 ^ 49) + ((i39 & 49) << 1);
        p = i40 % 128;
        int i41 = i40 % 2;
        this.spinnerMonth.setSelection(0);
        int i42 = p + 121;
        q = i42 % 128;
        int i43 = i42 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        String[] strArr;
        int i;
        int i2;
        TextView textView;
        int i3;
        int i4 = 2 % 2;
        int i5 = p;
        int i6 = i5 & 3;
        int i7 = (i6 - (~(-(-((i5 ^ 3) | i6))))) - 1;
        q = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            super.t();
            this.bv = (BISPApplication) getApplicationContext();
            throw null;
        }
        super.t();
        this.bv = (BISPApplication) getApplicationContext();
        new C0145s().c();
        new ProgressDialog(this);
        int i8 = p + 19;
        q = i8 % 128;
        int i9 = i8 % 2;
        this.vald_txt_view_caption.setVisibility(8);
        TextView textView2 = this.vald_txt_view;
        int i10 = p;
        int i11 = i10 ^ 27;
        int i12 = -(-((i10 & 27) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        q = i13 % 128;
        int i14 = i13 % 2;
        textView2.setVisibility(8);
        this.vald_name_txt_view.setVisibility(8);
        int i15 = q;
        int i16 = i15 & 73;
        int i17 = -(-((i15 ^ 73) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        p = i18 % 128;
        if (i18 % 2 == 0) {
            this.ai = 1;
            strArr = new String[4];
            strArr[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
        } else {
            this.ai = 1;
            strArr = new String[2];
            strArr[0] = "android.permission.WRITE_EXTERNAL_STORAGE";
        }
        strArr[1] = "android.permission.READ_EXTERNAL_STORAGE";
        if (!C(this, strArr)) {
            int i19 = p;
            int i20 = (i19 ^ 65) + ((i19 & 65) << 1);
            q = i20 % 128;
            int i21 = i20 % 2;
            k.c(this, strArr, this.ai);
            int i22 = p;
            int i23 = i22 & 59;
            int i24 = (i22 | 59) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            q = i26 % 128;
            int i27 = i26 % 2;
        }
        this.aj = ivas.gov.bisp.enumeration.p037bj.c.c(getApplicationContext());
        new ArrayList();
        this.aj.f();
        try {
            Dialog dialog = new Dialog(this);
            this.bl = dialog;
            dialog.setContentView(R.layout.dialog_capturefinger);
            int i28 = q;
            int i29 = ((i28 ^ 93) - (~(-(-((i28 & 93) << 1))))) - 1;
            p = i29 % 128;
            int i30 = i29 % 2;
            this.bl.setTitle("Select");
            Button button = (Button) this.bl.findViewById(R.id.select_finger);
            int i31 = q;
            int i32 = ((i31 & 111) - (~(-(-(i31 | 111))))) - 1;
            p = i32 % 128;
            if (i32 % 2 == 0) {
                this.ag = button;
                this.ah = (ImageView) this.bl.findViewById(R.id.imageview_fp);
                obj.hashCode();
                throw null;
            }
            this.ag = button;
            this.ah = (ImageView) this.bl.findViewById(R.id.imageview_fp);
            this.ag.setOnClickListener(new ad(this));
            this.et_RosterCNICRepeat.requestFocus();
            int i33 = p + 27;
            q = i33 % 128;
            if (i33 % 2 != 0) {
                this.bh = (Survey) getIntent().getSerializableExtra("survey");
                getIntent();
                obj.hashCode();
                throw null;
            }
            this.bh = (Survey) getIntent().getSerializableExtra("survey");
            this.aO = (ArrayList) getIntent().getSerializableExtra("roster_list");
            boolean booleanExtra = getIntent().getBooleanExtra("is_edit", false);
            int i34 = q;
            int i35 = (i34 ^ 81) + ((i34 & 81) << 1);
            p = i35 % 128;
            if (i35 % 2 == 0) {
                this.bc = booleanExtra;
                this.aP = booleanExtra;
                throw null;
            }
            this.bc = booleanExtra;
            this.aP = booleanExtra;
            if (booleanExtra) {
                int intExtra = getIntent().getIntExtra("rosterPosition", 0);
                int i36 = q;
                int i37 = i36 & 59;
                int i38 = i37 + ((i36 ^ 59) | i37);
                p = i38 % 128;
                int i39 = i38 % 2;
                this.aM = intExtra;
                Roster roster = this.aO.get(intExtra);
                int i40 = p;
                int i41 = (i40 | 125) << 1;
                int i42 = -(((~i40) & 125) | (i40 & (-126)));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                int i44 = i43 % 128;
                q = i44;
                if (i43 % 2 != 0) {
                    this.aN = roster;
                    textView = this.textViewTimeRemaining;
                    i3 = 70;
                } else {
                    this.aN = roster;
                    textView = this.textViewTimeRemaining;
                    i3 = 8;
                }
                int i45 = ((i44 | 45) << 1) - (i44 ^ 45);
                p = i45 % 128;
                int i46 = i45 % 2;
                textView.setVisibility(i3);
                int i47 = q;
                int i48 = i47 & 9;
                int i49 = (i47 ^ 9) | i48;
                int i50 = (i48 & i49) + (i49 | i48);
                p = i50 % 128;
                int i51 = i50 % 2;
            } else {
                this.et_RosterCNIC.setVisibility(0);
                this.et_RosterCNICRepeat.setVisibility(0);
                int i52 = p;
                int i53 = i52 & 35;
                int i54 = -(-((i52 ^ 35) | i53));
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                q = i55 % 128;
                int i56 = i55 % 2;
                this.buttonScanCNIC.setVisibility(8);
                Button button2 = this.btn_vald_cnic;
                int i57 = q;
                int i58 = i57 ^ 103;
                int i59 = ((i57 & 103) | i58) << 1;
                int i60 = -i58;
                int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
                p = i61 % 128;
                if (i61 % 2 == 0) {
                    button2.setVisibility(8);
                    this.btn_bio_cnic.setVisibility(14);
                } else {
                    button2.setVisibility(8);
                    this.btn_bio_cnic.setVisibility(8);
                }
                this.et_RosterCNIC.requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
                int i62 = q;
                int i63 = i62 ^ 43;
                int i64 = ((i62 & 43) | i63) << 1;
                int i65 = -i63;
                int i66 = ((i64 | i65) << 1) - (i64 ^ i65);
                p = i66 % 128;
                if (i66 % 2 == 0) {
                    inputMethodManager.showSoftInput(this.et_RosterCNIC, 0);
                } else {
                    inputMethodManager.showSoftInput(this.et_RosterCNIC, 1);
                }
                this.aS = ivas.gov.bisp.enumeration.p026az.z.e();
                int i67 = q;
                int i68 = i67 & 43;
                int i69 = (i67 | 43) & (~i68);
                int i70 = i68 << 1;
                int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
                p = i71 % 128;
                if (i71 % 2 == 0) {
                    i = this.ac;
                    if (i != 1) {
                        int i72 = q;
                        i2 = i72 + 65;
                        p = i2 % 128;
                        if (i2 % 2 == 0 ? i != 2 : i != 4) {
                            int i73 = (i72 ^ 11) + ((i72 & 11) << 1);
                            p = i73 % 128;
                            int i74 = i73 % 2;
                            this.textViewTimeRemaining.setVisibility(8);
                            int i75 = q;
                            int i76 = i75 & 17;
                            int i77 = i76 + ((i75 ^ 17) | i76);
                            p = i77 % 128;
                            int i78 = i77 % 2;
                        }
                    }
                } else {
                    i = this.ac;
                    if (i != 1) {
                        int i79 = q;
                        i2 = i79 + 65;
                        p = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    }
                }
                B b = new B(this, 1000 * ah.c.d.getLong("roster_time", 0L), 1000L);
                int i80 = q + 33;
                p = i80 % 128;
                int i81 = i80 % 2;
                this.aT = b.start();
                int i82 = q;
                int i83 = (i82 ^ 35) + ((i82 & 35) << 1);
                p = i83 % 128;
                if (i83 % 2 == 0) {
                    int i84 = 4 % 5;
                }
            }
            K();
            if (!(!this.bc)) {
                int i85 = q;
                int i86 = i85 & 45;
                int i87 = i85 | 45;
                int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                p = i88 % 128;
                if (i88 % 2 == 0) {
                    N();
                    throw null;
                }
                N();
                int i89 = q;
                int i90 = ((i89 | 113) << 1) - (i89 ^ 113);
                p = i90 % 128;
                int i91 = i90 % 2;
            }
            this.spinnerYear.setOnItemSelectedListener(this.aV);
            Spinner spinner = this.spinnerMonth;
            int i92 = p;
            int i93 = i92 & 71;
            int i94 = ((i92 | 71) & (~i93)) + (i93 << 1);
            q = i94 % 128;
            int i95 = i94 % 2;
            spinner.setOnItemSelectedListener(this.aX);
            this.sp_relation_to_household.setOnItemSelectedListener(this.aR);
            int i96 = q;
            int i97 = i96 & 93;
            int i98 = i97 + ((i96 ^ 93) | i97);
            p = i98 % 128;
            int i99 = i98 % 2;
            this.sp_marital_status.setOnItemSelectedListener(this.aW);
            Spinner spinner2 = this.sp_attended_school;
            int i100 = q;
            int i101 = (i100 & 43) + (i100 | 43);
            p = i101 % 128;
            if (i101 % 2 == 0) {
                spinner2.setOnItemSelectedListener(this.aU);
                this.sp_work_activity.setOnItemSelectedListener(this.bi);
                int i102 = 67 / 0;
            } else {
                spinner2.setOnItemSelectedListener(this.aU);
                this.sp_work_activity.setOnItemSelectedListener(this.bi);
            }
            int i103 = q + 101;
            p = i103 % 128;
            if (i103 % 2 == 0) {
                int i104 = 3 % 3;
            }
            ac.e(this.et_RosterCNIC);
            ac.e(this.et_RosterCNICRepeat);
            int i105 = q;
            int i106 = ((i105 & 8) + (i105 | 8)) - 1;
            p = i106 % 128;
            int i107 = i106 % 2;
            this.tv_dob.setEnabled(true);
            int i108 = q;
            int i109 = ((i108 & (-10)) | ((~i108) & 9)) + ((9 & i108) << 1);
            p = i109 % 128;
            int i110 = i109 % 2;
        } catch (Exception unused) {
        }
    }

    public class Oooo000 implements TextWatcher {
        private static int a = 0;
        private static int b = 1;

        public Oooo000(EditText editText) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 115) << 1;
            int i4 = -(((~i2) & 115) | (i2 & (-116)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (((i5 | 93) << 1) - (~(-(i5 ^ 93)))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x02bb A[Catch: Exception -> 0x02de, TRY_ENTER, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:101:0x02be A[Catch: Exception -> 0x02de, TRY_LEAVE, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00e8 A[Catch: Exception -> 0x02de, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:46:0x0101  */
        /* JADX WARN: Code duplicated, block: B:52:0x0132  */
        /* JADX WARN: Code duplicated, block: B:54:0x0143 A[Catch: Exception -> 0x02de, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0155  */
        /* JADX WARN: Code duplicated, block: B:57:0x0163 A[Catch: Exception -> 0x02de, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x019a A[Catch: Exception -> 0x02de, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:74:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:77:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:79:0x0210 A[Catch: Exception -> 0x02de, TRY_ENTER, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:80:0x0218 A[Catch: Exception -> 0x02de, TRY_LEAVE, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0278 A[Catch: Exception -> 0x02de, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:95:0x029c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:96:0x029d  */
        /* JADX WARN: Code duplicated, block: B:97:0x029e A[Catch: Exception -> 0x02de, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02de, blocks: (B:4:0x0013, B:8:0x002b, B:10:0x0047, B:12:0x005b, B:14:0x006f, B:25:0x00ac, B:32:0x00db, B:35:0x00e0, B:36:0x00e2, B:37:0x00e5, B:40:0x00e8, B:43:0x00f9, B:47:0x010a, B:49:0x012a, B:54:0x0143, B:57:0x0163, B:59:0x017d, B:62:0x019a, B:63:0x01a1, B:64:0x01a4, B:67:0x01a7, B:69:0x01c0, B:72:0x01d9, B:75:0x01ec, B:79:0x0210, B:82:0x0235, B:80:0x0218, B:85:0x0253, B:87:0x0267, B:90:0x0278, B:92:0x028f, B:97:0x029e, B:100:0x02bb, B:101:0x02be, B:16:0x007f, B:22:0x0094, B:23:0x0097, B:104:0x02d4, B:105:0x02d8, B:106:0x02db), top: B:115:0x0011 }] */
        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            OfflineRosterActivity offlineRosterActivity;
            int i4;
            int checkedRadioButtonId;
            RadioButton radioButton;
            int checkedRadioButtonId2;
            OfflineRosterActivity offlineRosterActivity2;
            int i5;
            int i6;
            int i7;
            int i8 = 2 % 2;
            int i9 = a;
            int i10 = ((i9 | 1) << 1) - (i9 ^ 1);
            b = i10 % 128;
            Object obj = null;
            try {
                if (i10 % 2 == 0) {
                    boolean z = OfflineRosterActivity.this.bc;
                    obj.hashCode();
                    throw null;
                }
                OfflineRosterActivity offlineRosterActivity3 = OfflineRosterActivity.this;
                if (!offlineRosterActivity3.bc) {
                    int i11 = b;
                    int i12 = ((i11 | 101) << 1) - (i11 ^ 101);
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    offlineRosterActivity3.vald_txt_view_caption.setVisibility(8);
                    OfflineRosterActivity offlineRosterActivity4 = OfflineRosterActivity.this;
                    int i14 = b;
                    int i15 = (((i14 & (-56)) | ((~i14) & 55)) - (~(-(-((i14 & 55) << 1))))) - 1;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    offlineRosterActivity4.vald_txt_view.setVisibility(8);
                    OfflineRosterActivity offlineRosterActivity5 = OfflineRosterActivity.this;
                    int i17 = a;
                    int i18 = ((i17 & 36) + (i17 | 36)) - 1;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    offlineRosterActivity5.vald_name_txt_view.setVisibility(8);
                    OfflineRosterActivity offlineRosterActivity6 = OfflineRosterActivity.this;
                    int i20 = b;
                    int i21 = ((i20 & 88) + (i20 | 88)) - 1;
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    offlineRosterActivity6.J();
                    int i23 = b;
                    int i24 = (i23 & 31) + (i23 | 31);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                } else if (!(!offlineRosterActivity3.bg)) {
                    int i26 = a;
                    int i27 = (i26 ^ 77) + ((i26 & 77) << 1);
                    b = i27 % 128;
                    if (i27 % 2 == 0) {
                        offlineRosterActivity3.bt = true;
                    } else {
                        offlineRosterActivity3.bt = false;
                    }
                    int i28 = b;
                    int i29 = (i28 & (-118)) | ((~i28) & 117);
                    int i30 = (i28 & 117) << 1;
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                }
                OfflineRosterActivity offlineRosterActivity7 = OfflineRosterActivity.this;
                int i33 = offlineRosterActivity7.ac;
                if (i33 != 1) {
                    int i34 = a;
                    int i35 = ((i34 ^ 33) - (~((i34 & 33) << 1))) - 1;
                    int i36 = i35 % 128;
                    b = i36;
                    int i37 = i35 % 2;
                    if (i33 != 2) {
                        int i38 = i36 & 63;
                        int i39 = ((i36 ^ 63) | i38) << 1;
                        int i40 = -((i36 | 63) & (~i38));
                        int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
                        a = i41 % 128;
                        if (i41 % 2 != 0) {
                            boolean z2 = ag.d;
                            obj.hashCode();
                            throw null;
                        }
                        if (ag.d) {
                            if (ag.j == 1) {
                                int i42 = b;
                                int i43 = i42 & 45;
                                int i44 = i43 + ((i42 ^ 45) | i43);
                                a = i44 % 128;
                                int i45 = i44 % 2;
                                if (offlineRosterActivity7.aQ < 18.0d) {
                                    offlineRosterActivity7.checkBoxBispBenif.setVisibility(8);
                                    offlineRosterActivity = OfflineRosterActivity.this;
                                    int i46 = a;
                                    i4 = (((i46 ^ 61) | (i46 & 61)) << 1) - (((~i46) & 61) | (i46 & (-62)));
                                    b = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        offlineRosterActivity.aF = true;
                                    } else {
                                        offlineRosterActivity.aF = false;
                                    }
                                    int i47 = a;
                                    int i48 = (((i47 & (-126)) | ((~i47) & 125)) - (~((i47 & 125) << 1))) - 1;
                                    b = i48 % 128;
                                    int i49 = i48 % 2;
                                    return;
                                }
                                int i50 = a + 13;
                                b = i50 % 128;
                                int i51 = i50 % 2;
                                checkedRadioButtonId = offlineRosterActivity7.radioGroupCNICOptions.getCheckedRadioButtonId();
                                radioButton = OfflineRosterActivity.this.rb_afghani_acc;
                                int i52 = a;
                                int i53 = (i52 | 23) << 1;
                                int i54 = -(((~i52) & 23) | (i52 & (-24)));
                                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                                b = i55 % 128;
                                int i56 = i55 % 2;
                                if (checkedRadioButtonId != radioButton.getId()) {
                                    int i57 = a;
                                    i7 = ((i57 & (-118)) | ((~i57) & 117)) + ((i57 & 117) << 1);
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        OfflineRosterActivity.this.radioGroupCNICOptions.getCheckedRadioButtonId();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (OfflineRosterActivity.this.radioGroupCNICOptions.getCheckedRadioButtonId() != OfflineRosterActivity.this.rb_afghani_por.getId()) {
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                        int i58 = b;
                                        int i59 = i58 ^ 53;
                                        int i60 = ((i58 & 53) | i59) << 1;
                                        int i61 = -i59;
                                        int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                                        a = i62 % 128;
                                        int i63 = i62 % 2;
                                        OfflineRosterActivity.this.aF = false;
                                        int i64 = a;
                                        int i65 = ((i64 ^ 111) | (i64 & 111)) << 1;
                                        int i66 = -(((~i64) & 111) | (i64 & (-112)));
                                        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                                        b = i67 % 128;
                                        int i68 = i67 % 2;
                                        return;
                                    }
                                    int i69 = a;
                                    int i70 = (i69 ^ 27) + ((i69 & 27) << 1);
                                    b = i70 % 128;
                                    int i71 = i70 % 2;
                                }
                                checkedRadioButtonId2 = OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId();
                                offlineRosterActivity2 = OfflineRosterActivity.this;
                                int i72 = a;
                                int i73 = i72 | 1;
                                int i74 = (i73 << 1) - ((~(i72 & 1)) & i73);
                                b = i74 % 128;
                                int i75 = i74 % 2;
                                if (checkedRadioButtonId2 != offlineRosterActivity2.radioButtonFemale.getId()) {
                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                    OfflineRosterActivity offlineRosterActivity8 = OfflineRosterActivity.this;
                                    int i76 = b + 126;
                                    int i77 = (i76 ^ (-1)) + (i76 << 1);
                                    a = i77 % 128;
                                    int i78 = i77 % 2;
                                    offlineRosterActivity8.aF = false;
                                    i5 = b + 63;
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                int i79 = a;
                                int i80 = (-2) - (((i79 ^ 54) + ((i79 & 54) << 1)) ^ (-1));
                                b = i80 % 128;
                                int i81 = i80 % 2;
                                if (OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                    int i82 = a + 75;
                                    b = i82 % 128;
                                    int i83 = i82 % 2;
                                    if (OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition() != 1) {
                                        int i84 = b;
                                        int i85 = ((i84 ^ 33) | (i84 & 33)) << 1;
                                        int i86 = -(((~i84) & 33) | (i84 & (-34)));
                                        i6 = ((i85 | i86) << 1) - (i86 ^ i85);
                                        a = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(1);
                                        } else {
                                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(0);
                                        }
                                        int i87 = b;
                                        int i88 = i87 & 111;
                                        int i89 = ((i87 ^ 111) | i88) << 1;
                                        int i90 = -((i87 | 111) & (~i88));
                                        int i91 = (i89 ^ i90) + ((i90 & i89) << 1);
                                        a = i91 % 128;
                                        int i92 = i91 % 2;
                                        OfflineRosterActivity.this.aF = true;
                                        int i93 = a;
                                        int i94 = ((i93 ^ 87) | (i93 & 87)) << 1;
                                        int i95 = -(((~i93) & 87) | (i93 & (-88)));
                                        int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                                        b = i96 % 128;
                                        int i97 = i96 % 2;
                                        return;
                                    }
                                }
                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                int i98 = b;
                                int i99 = ((i98 & 62) + (i98 | 62)) - 1;
                                a = i99 % 128;
                                int i100 = i99 % 2;
                                OfflineRosterActivity.this.aF = false;
                                int i101 = b;
                                int i102 = (i101 & 101) + (i101 | 101);
                                a = i102 % 128;
                                int i103 = i102 % 2;
                                return;
                            }
                        }
                    } else if (ag.j == 1) {
                        int i410 = b;
                        int i411 = i410 & 45;
                        int i412 = i411 + ((i410 ^ 45) | i411);
                        a = i412 % 128;
                        int i413 = i412 % 2;
                        if (offlineRosterActivity7.aQ < 18.0d) {
                            offlineRosterActivity7.checkBoxBispBenif.setVisibility(8);
                            offlineRosterActivity = OfflineRosterActivity.this;
                            int i414 = a;
                            i4 = (((i414 ^ 61) | (i414 & 61)) << 1) - (((~i414) & 61) | (i414 & (-62)));
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                offlineRosterActivity.aF = true;
                            } else {
                                offlineRosterActivity.aF = false;
                            }
                            int i415 = a;
                            int i416 = (((i415 & (-126)) | ((~i415) & 125)) - (~((i415 & 125) << 1))) - 1;
                            b = i416 % 128;
                            int i417 = i416 % 2;
                            return;
                        }
                        int i510 = a + 13;
                        b = i510 % 128;
                        int i511 = i510 % 2;
                        checkedRadioButtonId = offlineRosterActivity7.radioGroupCNICOptions.getCheckedRadioButtonId();
                        radioButton = OfflineRosterActivity.this.rb_afghani_acc;
                        int i512 = a;
                        int i513 = (i512 | 23) << 1;
                        int i514 = -(((~i512) & 23) | (i512 & (-24)));
                        int i515 = (i513 ^ i514) + ((i514 & i513) << 1);
                        b = i515 % 128;
                        int i516 = i515 % 2;
                        if (checkedRadioButtonId != radioButton.getId()) {
                            int i517 = a;
                            i7 = ((i517 & (-118)) | ((~i517) & 117)) + ((i517 & 117) << 1);
                            b = i7 % 128;
                            if (i7 % 2 == 0) {
                                OfflineRosterActivity.this.radioGroupCNICOptions.getCheckedRadioButtonId();
                                obj.hashCode();
                                throw null;
                            }
                            if (OfflineRosterActivity.this.radioGroupCNICOptions.getCheckedRadioButtonId() != OfflineRosterActivity.this.rb_afghani_por.getId()) {
                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                int i518 = b;
                                int i519 = i518 ^ 53;
                                int i610 = ((i518 & 53) | i519) << 1;
                                int i611 = -i519;
                                int i612 = (i610 ^ i611) + ((i610 & i611) << 1);
                                a = i612 % 128;
                                int i613 = i612 % 2;
                                OfflineRosterActivity.this.aF = false;
                                int i614 = a;
                                int i615 = ((i614 ^ 111) | (i614 & 111)) << 1;
                                int i616 = -(((~i614) & 111) | (i614 & (-112)));
                                int i617 = (i615 ^ i616) + ((i616 & i615) << 1);
                                b = i617 % 128;
                                int i618 = i617 % 2;
                                return;
                            }
                            int i619 = a;
                            int i710 = (i619 ^ 27) + ((i619 & 27) << 1);
                            b = i710 % 128;
                            int i711 = i710 % 2;
                        }
                        checkedRadioButtonId2 = OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId();
                        offlineRosterActivity2 = OfflineRosterActivity.this;
                        int i712 = a;
                        int i713 = i712 | 1;
                        int i714 = (i713 << 1) - ((~(i712 & 1)) & i713);
                        b = i714 % 128;
                        int i715 = i714 % 2;
                        if (checkedRadioButtonId2 != offlineRosterActivity2.radioButtonFemale.getId()) {
                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                            OfflineRosterActivity offlineRosterActivity9 = OfflineRosterActivity.this;
                            int i716 = b + 126;
                            int i717 = (i716 ^ (-1)) + (i716 << 1);
                            a = i717 % 128;
                            int i718 = i717 % 2;
                            offlineRosterActivity9.aF = false;
                            i5 = b + 63;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            return;
                        }
                        int i719 = a;
                        int i810 = (-2) - (((i719 ^ 54) + ((i719 & 54) << 1)) ^ (-1));
                        b = i810 % 128;
                        int i811 = i810 % 2;
                        if (OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition() != 0) {
                            int i812 = a + 75;
                            b = i812 % 128;
                            int i813 = i812 % 2;
                            if (OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition() != 1) {
                                int i814 = b;
                                int i815 = ((i814 ^ 33) | (i814 & 33)) << 1;
                                int i816 = -(((~i814) & 33) | (i814 & (-34)));
                                i6 = ((i815 | i816) << 1) - (i816 ^ i815);
                                a = i6 % 128;
                                if (i6 % 2 != 0) {
                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(1);
                                } else {
                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(0);
                                }
                                int i817 = b;
                                int i818 = i817 & 111;
                                int i819 = ((i817 ^ 111) | i818) << 1;
                                int i910 = -((i817 | 111) & (~i818));
                                int i911 = (i819 ^ i910) + ((i910 & i819) << 1);
                                a = i911 % 128;
                                int i912 = i911 % 2;
                                OfflineRosterActivity.this.aF = true;
                                int i913 = a;
                                int i914 = ((i913 ^ 87) | (i913 & 87)) << 1;
                                int i915 = -(((~i913) & 87) | (i913 & (-88)));
                                int i916 = (i914 ^ i915) + ((i915 & i914) << 1);
                                b = i916 % 128;
                                int i917 = i916 % 2;
                                return;
                            }
                        }
                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                        int i918 = b;
                        int i919 = ((i918 & 62) + (i918 | 62)) - 1;
                        a = i919 % 128;
                        int i104 = i919 % 2;
                        OfflineRosterActivity.this.aF = false;
                        int i105 = b;
                        int i106 = (i105 & 101) + (i105 | 101);
                        a = i106 % 128;
                        int i107 = i106 % 2;
                        return;
                    }
                } else if (ag.j == 1) {
                    int i418 = b;
                    int i419 = i418 & 45;
                    int i4110 = i419 + ((i418 ^ 45) | i419);
                    a = i4110 % 128;
                    int i4111 = i4110 % 2;
                    if (offlineRosterActivity7.aQ < 18.0d) {
                        offlineRosterActivity7.checkBoxBispBenif.setVisibility(8);
                        offlineRosterActivity = OfflineRosterActivity.this;
                        int i4112 = a;
                        i4 = (((i4112 ^ 61) | (i4112 & 61)) << 1) - (((~i4112) & 61) | (i4112 & (-62)));
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            offlineRosterActivity.aF = true;
                        } else {
                            offlineRosterActivity.aF = false;
                        }
                        int i4113 = a;
                        int i4114 = (((i4113 & (-126)) | ((~i4113) & 125)) - (~((i4113 & 125) << 1))) - 1;
                        b = i4114 % 128;
                        int i4115 = i4114 % 2;
                        return;
                    }
                    int i5110 = a + 13;
                    b = i5110 % 128;
                    int i5111 = i5110 % 2;
                    checkedRadioButtonId = offlineRosterActivity7.radioGroupCNICOptions.getCheckedRadioButtonId();
                    radioButton = OfflineRosterActivity.this.rb_afghani_acc;
                    int i5112 = a;
                    int i5113 = (i5112 | 23) << 1;
                    int i5114 = -(((~i5112) & 23) | (i5112 & (-24)));
                    int i5115 = (i5113 ^ i5114) + ((i5114 & i5113) << 1);
                    b = i5115 % 128;
                    int i5116 = i5115 % 2;
                    if (checkedRadioButtonId != radioButton.getId()) {
                        int i5117 = a;
                        i7 = ((i5117 & (-118)) | ((~i5117) & 117)) + ((i5117 & 117) << 1);
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            OfflineRosterActivity.this.radioGroupCNICOptions.getCheckedRadioButtonId();
                            obj.hashCode();
                            throw null;
                        }
                        if (OfflineRosterActivity.this.radioGroupCNICOptions.getCheckedRadioButtonId() != OfflineRosterActivity.this.rb_afghani_por.getId()) {
                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                            int i5118 = b;
                            int i5119 = i5118 ^ 53;
                            int i6110 = ((i5118 & 53) | i5119) << 1;
                            int i6111 = -i5119;
                            int i6112 = (i6110 ^ i6111) + ((i6110 & i6111) << 1);
                            a = i6112 % 128;
                            int i6113 = i6112 % 2;
                            OfflineRosterActivity.this.aF = false;
                            int i6114 = a;
                            int i6115 = ((i6114 ^ 111) | (i6114 & 111)) << 1;
                            int i6116 = -(((~i6114) & 111) | (i6114 & (-112)));
                            int i6117 = (i6115 ^ i6116) + ((i6116 & i6115) << 1);
                            b = i6117 % 128;
                            int i6118 = i6117 % 2;
                            return;
                        }
                        int i6119 = a;
                        int i7110 = (i6119 ^ 27) + ((i6119 & 27) << 1);
                        b = i7110 % 128;
                        int i7111 = i7110 % 2;
                    }
                    checkedRadioButtonId2 = OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId();
                    offlineRosterActivity2 = OfflineRosterActivity.this;
                    int i7112 = a;
                    int i7113 = i7112 | 1;
                    int i7114 = (i7113 << 1) - ((~(i7112 & 1)) & i7113);
                    b = i7114 % 128;
                    int i7115 = i7114 % 2;
                    if (checkedRadioButtonId2 != offlineRosterActivity2.radioButtonFemale.getId()) {
                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                        OfflineRosterActivity offlineRosterActivity10 = OfflineRosterActivity.this;
                        int i7116 = b + 126;
                        int i7117 = (i7116 ^ (-1)) + (i7116 << 1);
                        a = i7117 % 128;
                        int i7118 = i7117 % 2;
                        offlineRosterActivity10.aF = false;
                        i5 = b + 63;
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    int i7119 = a;
                    int i8110 = (-2) - (((i7119 ^ 54) + ((i7119 & 54) << 1)) ^ (-1));
                    b = i8110 % 128;
                    int i8111 = i8110 % 2;
                    if (OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition() != 0) {
                        int i8112 = a + 75;
                        b = i8112 % 128;
                        int i8113 = i8112 % 2;
                        if (OfflineRosterActivity.this.sp_marital_status.getSelectedItemPosition() != 1) {
                            int i8114 = b;
                            int i8115 = ((i8114 ^ 33) | (i8114 & 33)) << 1;
                            int i8116 = -(((~i8114) & 33) | (i8114 & (-34)));
                            i6 = ((i8115 | i8116) << 1) - (i8116 ^ i8115);
                            a = i6 % 128;
                            if (i6 % 2 != 0) {
                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(1);
                            } else {
                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(0);
                            }
                            int i8117 = b;
                            int i8118 = i8117 & 111;
                            int i8119 = ((i8117 ^ 111) | i8118) << 1;
                            int i9110 = -((i8117 | 111) & (~i8118));
                            int i9111 = (i8119 ^ i9110) + ((i9110 & i8119) << 1);
                            a = i9111 % 128;
                            int i9112 = i9111 % 2;
                            OfflineRosterActivity.this.aF = true;
                            int i9113 = a;
                            int i9114 = ((i9113 ^ 87) | (i9113 & 87)) << 1;
                            int i9115 = -(((~i9113) & 87) | (i9113 & (-88)));
                            int i9116 = (i9114 ^ i9115) + ((i9115 & i9114) << 1);
                            b = i9116 % 128;
                            int i9117 = i9116 % 2;
                            return;
                        }
                    }
                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                    int i9118 = b;
                    int i9119 = ((i9118 & 62) + (i9118 | 62)) - 1;
                    a = i9119 % 128;
                    int i108 = i9119 % 2;
                    OfflineRosterActivity.this.aF = false;
                    int i109 = b;
                    int i1010 = (i109 & 101) + (i109 | 101);
                    a = i1010 % 128;
                    int i1011 = i1010 % 2;
                    return;
                }
                int i110 = a;
                int i111 = i110 | 75;
                int i112 = i111 << 1;
                int i113 = -((~(i110 & 75)) & i111);
                int i114 = (i112 & i113) + (i113 | i112);
                b = i114 % 128;
                if (i114 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (Exception unused) {
            }
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
            int i3 = (i2 & (-60)) | ((~i2) & 59);
            int i4 = (i2 & 59) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0398  */
        /* JADX WARN: Code duplicated, block: B:104:0x039d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:108:0x03d0  */
        /* JADX WARN: Code duplicated, block: B:111:0x040f  */
        /* JADX WARN: Code duplicated, block: B:112:0x0429  */
        /* JADX WARN: Code duplicated, block: B:115:0x0443  */
        /* JADX WARN: Code duplicated, block: B:118:0x044a  */
        /* JADX WARN: Code duplicated, block: B:128:0x046f  */
        /* JADX WARN: Code duplicated, block: B:130:0x0479  */
        /* JADX WARN: Code duplicated, block: B:132:0x048b  */
        /* JADX WARN: Code duplicated, block: B:134:0x04c8  */
        /* JADX WARN: Code duplicated, block: B:135:0x04d0  */
        /* JADX WARN: Code duplicated, block: B:136:0x04d8  */
        /* JADX WARN: Code duplicated, block: B:22:0x0095  */
        /* JADX WARN: Code duplicated, block: B:24:0x0099  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00df  */
        /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:39:0x0113  */
        /* JADX WARN: Code duplicated, block: B:42:0x0120  */
        /* JADX WARN: Code duplicated, block: B:54:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:55:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:56:0x020f  */
        /* JADX WARN: Code duplicated, block: B:58:0x0238  */
        /* JADX WARN: Code duplicated, block: B:67:0x025f A[PHI: r3
  0x025f: PHI (r3v23 java.util.ArrayList<ivas.gov.bisp.enumeration.databaseModels.Item>) = 
  (r3v22 java.util.ArrayList<ivas.gov.bisp.enumeration.databaseModels.Item>)
  (r3v111 java.util.ArrayList<ivas.gov.bisp.enumeration.databaseModels.Item>)
 binds: [B:66:0x025d, B:63:0x0256] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:69:0x0265  */
        /* JADX WARN: Code duplicated, block: B:71:0x0297  */
        /* JADX WARN: Code duplicated, block: B:91:0x0325  */
        /* JADX WARN: Code duplicated, block: B:93:0x034a  */
        /* JADX WARN: Code duplicated, block: B:96:0x034f A[ADDED_TO_REGION] */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList<Item> arrayList;
            int optionId;
            int i2;
            int i3;
            int i4;
            String str;
            String str2;
            int i5;
            int i6;
            Item item;
            Item item2;
            int i7;
            int i8;
            int i9;
            C0104p c0104pC;
            AppCompatActivity appCompatActivity;
            String strT;
            am amVar;
            int i10;
            int i11;
            Item item3;
            int i12;
            int i13;
            int i14;
            int i15;
            int checkedRadioButtonId;
            RadioButton radioButton;
            int i16;
            int i17 = 2 % 2;
            int i18 = a;
            int i19 = i18 | 101;
            int i20 = i19 << 1;
            int i21 = -((~(i18 & 101)) & i19);
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            int i23 = i22 % 128;
            b = i23;
            int i24 = i22 % 2;
            if (i == 0) {
                int i25 = i23 ^ 105;
                int i26 = (((i23 & 105) | i25) << 1) - i25;
                a = i26 % 128;
                if (i26 % 2 == 0) {
                    OfflineRosterActivity.this.sp_marital_status.setBackgroundResource(R.drawable.spinner_bg);
                    int i27 = 1 / 0;
                } else {
                    OfflineRosterActivity.this.sp_marital_status.setBackgroundResource(R.drawable.spinner_bg);
                }
            } else {
                OfflineRosterActivity.this.sp_marital_status.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i28 = b + 27;
                a = i28 % 128;
                int i29 = i28 % 2;
            }
            OfflineRosterActivity offlineRosterActivity = OfflineRosterActivity.this;
            int i30 = OfflineRosterActivity.af;
            int i31 = offlineRosterActivity.ac;
            int i32 = b;
            int i33 = ((i32 ^ 12) + ((i32 & 12) << 1)) - 1;
            int i34 = i33 % 128;
            a = i34;
            int i35 = 8;
            if (i33 % 2 != 0 ? i31 == 1 : i31 == 0) {
                if (ag.j == 1) {
                    int i36 = a;
                    int i37 = ((((i36 ^ 65) | (i36 & 65)) << 1) - (~(-(((~i36) & 65) | (i36 & (-66)))))) - 1;
                    i12 = i37 % 128;
                    b = i12;
                    int i38 = i37 % 2;
                    if (i != 0) {
                        int i39 = (i12 ^ 3) + ((i12 & 3) << 1);
                        i14 = i39 % 128;
                        a = i14;
                        int i40 = i39 % 2;
                        if (i != 1) {
                            int i41 = i14 & 57;
                            int i42 = i14 | 57;
                            i15 = (i41 & i42) + (i42 | i41);
                            b = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i43 = 1 / 0;
                                if (offlineRosterActivity.aQ >= 18.0d) {
                                    checkedRadioButtonId = offlineRosterActivity.radioGroupCNICOptions.getCheckedRadioButtonId();
                                    radioButton = OfflineRosterActivity.this.radioButtonCNICPresent;
                                    int i44 = a;
                                    int i45 = (i44 ^ 107) + ((i44 & 107) << 1);
                                    b = i45 % 128;
                                    int i46 = i45 % 2;
                                    if (checkedRadioButtonId == radioButton.getId()) {
                                        int i47 = b;
                                        i16 = (((i47 & (-14)) | ((~i47) & 13)) - (~(-(-((i47 & 13) << 1))))) - 1;
                                        a = i16 % 128;
                                        if (i16 % 2 == 0 ? OfflineRosterActivity.this.et_RosterCNIC.length() != 15 : OfflineRosterActivity.this.et_RosterCNIC.length() != 102) {
                                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                            int i48 = a;
                                            int i49 = (i48 ^ 59) + ((i48 & 59) << 1);
                                            b = i49 % 128;
                                            int i50 = i49 % 2;
                                            OfflineRosterActivity.this.aF = false;
                                            int i51 = b;
                                            int i52 = ((i51 | 45) << 1) - (i51 ^ 45);
                                            a = i52 % 128;
                                            int i53 = i52 % 2;
                                        } else {
                                            int checkedRadioButtonId2 = OfflineRosterActivity.this.radioGroupGender.getCheckedRadioButtonId();
                                            RadioButton radioButton2 = OfflineRosterActivity.this.radioButtonFemale;
                                            int i54 = a;
                                            int i55 = ((i54 ^ 103) | (i54 & 103)) << 1;
                                            int i56 = -(((~i54) & 103) | (i54 & (-104)));
                                            int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                                            b = i57 % 128;
                                            if (i57 % 2 != 0) {
                                                radioButton2.getId();
                                                throw null;
                                            }
                                            if (checkedRadioButtonId2 == radioButton2.getId()) {
                                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(0);
                                                int i58 = a;
                                                int i59 = (((i58 | 115) << 1) - (~(-(i58 ^ 115)))) - 1;
                                                b = i59 % 128;
                                                int i60 = i59 % 2;
                                                OfflineRosterActivity.this.aF = true;
                                                int i61 = (-2) - ((b + 32) ^ (-1));
                                                a = i61 % 128;
                                                int i62 = i61 % 2;
                                            } else {
                                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                                OfflineRosterActivity offlineRosterActivity2 = OfflineRosterActivity.this;
                                                int i63 = a;
                                                int i64 = (i63 ^ 111) + ((i63 & 111) << 1);
                                                b = i64 % 128;
                                                int i65 = i64 % 2;
                                                offlineRosterActivity2.aF = false;
                                                int i66 = a;
                                                int i67 = i66 & 5;
                                                int i68 = (i66 | 5) & (~i67);
                                                int i69 = i67 << 1;
                                                int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
                                                b = i70 % 128;
                                                if (i70 % 2 != 0) {
                                                    int i71 = 3 % 3;
                                                }
                                            }
                                        }
                                    } else {
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                        int i410 = a;
                                        int i411 = (i410 ^ 59) + ((i410 & 59) << 1);
                                        b = i411 % 128;
                                        int i510 = i411 % 2;
                                        OfflineRosterActivity.this.aF = false;
                                        int i511 = b;
                                        int i512 = ((i511 | 45) << 1) - (i511 ^ 45);
                                        a = i512 % 128;
                                        int i513 = i512 % 2;
                                    }
                                } else {
                                    offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                                    OfflineRosterActivity offlineRosterActivity3 = OfflineRosterActivity.this;
                                    int i72 = b;
                                    int i73 = i72 & 67;
                                    int i74 = (((i72 ^ 67) | i73) << 1) - ((i72 | 67) & (~i73));
                                    a = i74 % 128;
                                    int i75 = i74 % 2;
                                    offlineRosterActivity3.aF = false;
                                    int i76 = a;
                                    int i77 = i76 & 25;
                                    int i78 = ((i76 ^ 25) | i77) << 1;
                                    int i79 = -((i76 | 25) & (~i77));
                                    int i80 = (i78 & i79) + (i79 | i78);
                                    b = i80 % 128;
                                    int i81 = i80 % 2;
                                }
                            } else if (offlineRosterActivity.aQ >= 18.0d) {
                                checkedRadioButtonId = offlineRosterActivity.radioGroupCNICOptions.getCheckedRadioButtonId();
                                radioButton = OfflineRosterActivity.this.radioButtonCNICPresent;
                                int i412 = a;
                                int i413 = (i412 ^ 107) + ((i412 & 107) << 1);
                                b = i413 % 128;
                                int i414 = i413 % 2;
                                if (checkedRadioButtonId == radioButton.getId()) {
                                    int i415 = b;
                                    i16 = (((i415 & (-14)) | ((~i415) & 13)) - (~(-(-((i415 & 13) << 1))))) - 1;
                                    a = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                        int i416 = a;
                                        int i417 = (i416 ^ 59) + ((i416 & 59) << 1);
                                        b = i417 % 128;
                                        int i514 = i417 % 2;
                                        OfflineRosterActivity.this.aF = false;
                                        int i515 = b;
                                        int i516 = ((i515 | 45) << 1) - (i515 ^ 45);
                                        a = i516 % 128;
                                        int i517 = i516 % 2;
                                    } else {
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                        int i418 = a;
                                        int i419 = (i418 ^ 59) + ((i418 & 59) << 1);
                                        b = i419 % 128;
                                        int i518 = i419 % 2;
                                        OfflineRosterActivity.this.aF = false;
                                        int i519 = b;
                                        int i5110 = ((i519 | 45) << 1) - (i519 ^ 45);
                                        a = i5110 % 128;
                                        int i5111 = i5110 % 2;
                                    }
                                } else {
                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                    int i4110 = a;
                                    int i4111 = (i4110 ^ 59) + ((i4110 & 59) << 1);
                                    b = i4111 % 128;
                                    int i5112 = i4111 % 2;
                                    OfflineRosterActivity.this.aF = false;
                                    int i5113 = b;
                                    int i5114 = ((i5113 | 45) << 1) - (i5113 ^ 45);
                                    a = i5114 % 128;
                                    int i5115 = i5114 % 2;
                                }
                            } else {
                                offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                                OfflineRosterActivity offlineRosterActivity4 = OfflineRosterActivity.this;
                                int i710 = b;
                                int i711 = i710 & 67;
                                int i712 = (((i710 ^ 67) | i711) << 1) - ((i710 | 67) & (~i711));
                                a = i712 % 128;
                                int i713 = i712 % 2;
                                offlineRosterActivity4.aF = false;
                                int i714 = a;
                                int i715 = i714 & 25;
                                int i716 = ((i714 ^ 25) | i715) << 1;
                                int i717 = -((i714 | 25) & (~i715));
                                int i82 = (i716 & i717) + (i717 | i716);
                                b = i82 % 128;
                                int i83 = i82 % 2;
                            }
                        } else {
                            offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                            OfflineRosterActivity offlineRosterActivity5 = OfflineRosterActivity.this;
                            int i84 = b;
                            int i85 = ((i84 | 105) << 1) - (i84 ^ 105);
                            a = i85 % 128;
                            int i86 = i85 % 2;
                            offlineRosterActivity5.aF = false;
                            int i87 = b;
                            i13 = ((i87 & (-86)) | ((~i87) & 85)) + ((i87 & 85) << 1);
                            a = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i88 = 2 / 3;
                            }
                        }
                    } else {
                        offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                        OfflineRosterActivity offlineRosterActivity6 = OfflineRosterActivity.this;
                        int i89 = b;
                        int i810 = ((i89 | 105) << 1) - (i89 ^ 105);
                        a = i810 % 128;
                        int i811 = i810 % 2;
                        offlineRosterActivity6.aF = false;
                        int i812 = b;
                        i13 = ((i812 & (-86)) | ((~i812) & 85)) + ((i812 & 85) << 1);
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i813 = 2 / 3;
                        }
                    }
                }
            } else if (i31 != 2) {
                int i90 = (i34 & (-24)) | ((~i34) & 23);
                int i91 = (i34 & 23) << 1;
                int i92 = (i90 & i91) + (i90 | i91);
                b = i92 % 128;
                if (i92 % 2 != 0) {
                    boolean z = ag.d;
                    throw null;
                }
                if (!(!ag.d)) {
                    if (ag.j == 1) {
                        int i310 = a;
                        int i311 = ((((i310 ^ 65) | (i310 & 65)) << 1) - (~(-(((~i310) & 65) | (i310 & (-66)))))) - 1;
                        i12 = i311 % 128;
                        b = i12;
                        int i312 = i311 % 2;
                        if (i != 0) {
                            int i313 = (i12 ^ 3) + ((i12 & 3) << 1);
                            i14 = i313 % 128;
                            a = i14;
                            int i420 = i313 % 2;
                            if (i != 1) {
                                int i421 = i14 & 57;
                                int i422 = i14 | 57;
                                i15 = (i421 & i422) + (i422 | i421);
                                b = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i423 = 1 / 0;
                                    if (offlineRosterActivity.aQ >= 18.0d) {
                                        checkedRadioButtonId = offlineRosterActivity.radioGroupCNICOptions.getCheckedRadioButtonId();
                                        radioButton = OfflineRosterActivity.this.radioButtonCNICPresent;
                                        int i4112 = a;
                                        int i4113 = (i4112 ^ 107) + ((i4112 & 107) << 1);
                                        b = i4113 % 128;
                                        int i4114 = i4113 % 2;
                                        if (checkedRadioButtonId == radioButton.getId()) {
                                            int i4115 = b;
                                            i16 = (((i4115 & (-14)) | ((~i4115) & 13)) - (~(-(-((i4115 & 13) << 1))))) - 1;
                                            a = i16 % 128;
                                            if (i16 % 2 == 0) {
                                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                                int i4116 = a;
                                                int i4117 = (i4116 ^ 59) + ((i4116 & 59) << 1);
                                                b = i4117 % 128;
                                                int i5116 = i4117 % 2;
                                                OfflineRosterActivity.this.aF = false;
                                                int i5117 = b;
                                                int i5118 = ((i5117 | 45) << 1) - (i5117 ^ 45);
                                                a = i5118 % 128;
                                                int i5119 = i5118 % 2;
                                            } else {
                                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                                int i4118 = a;
                                                int i4119 = (i4118 ^ 59) + ((i4118 & 59) << 1);
                                                b = i4119 % 128;
                                                int i51110 = i4119 % 2;
                                                OfflineRosterActivity.this.aF = false;
                                                int i51111 = b;
                                                int i51112 = ((i51111 | 45) << 1) - (i51111 ^ 45);
                                                a = i51112 % 128;
                                                int i51113 = i51112 % 2;
                                            }
                                        } else {
                                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                            int i41110 = a;
                                            int i41111 = (i41110 ^ 59) + ((i41110 & 59) << 1);
                                            b = i41111 % 128;
                                            int i51114 = i41111 % 2;
                                            OfflineRosterActivity.this.aF = false;
                                            int i51115 = b;
                                            int i51116 = ((i51115 | 45) << 1) - (i51115 ^ 45);
                                            a = i51116 % 128;
                                            int i51117 = i51116 % 2;
                                        }
                                    } else {
                                        offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                                        OfflineRosterActivity offlineRosterActivity7 = OfflineRosterActivity.this;
                                        int i718 = b;
                                        int i719 = i718 & 67;
                                        int i7110 = (((i718 ^ 67) | i719) << 1) - ((i718 | 67) & (~i719));
                                        a = i7110 % 128;
                                        int i7111 = i7110 % 2;
                                        offlineRosterActivity7.aF = false;
                                        int i7112 = a;
                                        int i7113 = i7112 & 25;
                                        int i7114 = ((i7112 ^ 25) | i7113) << 1;
                                        int i7115 = -((i7112 | 25) & (~i7113));
                                        int i814 = (i7114 & i7115) + (i7115 | i7114);
                                        b = i814 % 128;
                                        int i815 = i814 % 2;
                                    }
                                } else if (offlineRosterActivity.aQ >= 18.0d) {
                                    checkedRadioButtonId = offlineRosterActivity.radioGroupCNICOptions.getCheckedRadioButtonId();
                                    radioButton = OfflineRosterActivity.this.radioButtonCNICPresent;
                                    int i41112 = a;
                                    int i41113 = (i41112 ^ 107) + ((i41112 & 107) << 1);
                                    b = i41113 % 128;
                                    int i41114 = i41113 % 2;
                                    if (checkedRadioButtonId == radioButton.getId()) {
                                        int i41115 = b;
                                        i16 = (((i41115 & (-14)) | ((~i41115) & 13)) - (~(-(-((i41115 & 13) << 1))))) - 1;
                                        a = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                            int i41116 = a;
                                            int i41117 = (i41116 ^ 59) + ((i41116 & 59) << 1);
                                            b = i41117 % 128;
                                            int i51118 = i41117 % 2;
                                            OfflineRosterActivity.this.aF = false;
                                            int i51119 = b;
                                            int i511110 = ((i51119 | 45) << 1) - (i51119 ^ 45);
                                            a = i511110 % 128;
                                            int i511111 = i511110 % 2;
                                        } else {
                                            OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                            int i41118 = a;
                                            int i41119 = (i41118 ^ 59) + ((i41118 & 59) << 1);
                                            b = i41119 % 128;
                                            int i511112 = i41119 % 2;
                                            OfflineRosterActivity.this.aF = false;
                                            int i511113 = b;
                                            int i511114 = ((i511113 | 45) << 1) - (i511113 ^ 45);
                                            a = i511114 % 128;
                                            int i511115 = i511114 % 2;
                                        }
                                    } else {
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                        int i411110 = a;
                                        int i411111 = (i411110 ^ 59) + ((i411110 & 59) << 1);
                                        b = i411111 % 128;
                                        int i511116 = i411111 % 2;
                                        OfflineRosterActivity.this.aF = false;
                                        int i511117 = b;
                                        int i511118 = ((i511117 | 45) << 1) - (i511117 ^ 45);
                                        a = i511118 % 128;
                                        int i511119 = i511118 % 2;
                                    }
                                } else {
                                    offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                                    OfflineRosterActivity offlineRosterActivity8 = OfflineRosterActivity.this;
                                    int i7116 = b;
                                    int i7117 = i7116 & 67;
                                    int i7118 = (((i7116 ^ 67) | i7117) << 1) - ((i7116 | 67) & (~i7117));
                                    a = i7118 % 128;
                                    int i7119 = i7118 % 2;
                                    offlineRosterActivity8.aF = false;
                                    int i71110 = a;
                                    int i71111 = i71110 & 25;
                                    int i71112 = ((i71110 ^ 25) | i71111) << 1;
                                    int i71113 = -((i71110 | 25) & (~i71111));
                                    int i816 = (i71112 & i71113) + (i71113 | i71112);
                                    b = i816 % 128;
                                    int i817 = i816 % 2;
                                }
                            } else {
                                offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                                OfflineRosterActivity offlineRosterActivity9 = OfflineRosterActivity.this;
                                int i818 = b;
                                int i819 = ((i818 | 105) << 1) - (i818 ^ 105);
                                a = i819 % 128;
                                int i8110 = i819 % 2;
                                offlineRosterActivity9.aF = false;
                                int i8111 = b;
                                i13 = ((i8111 & (-86)) | ((~i8111) & 85)) + ((i8111 & 85) << 1);
                                a = i13 % 128;
                                if (i13 % 2 == 0) {
                                    int i8112 = 2 / 3;
                                }
                            }
                        } else {
                            offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                            OfflineRosterActivity offlineRosterActivity10 = OfflineRosterActivity.this;
                            int i8113 = b;
                            int i8114 = ((i8113 | 105) << 1) - (i8113 ^ 105);
                            a = i8114 % 128;
                            int i8115 = i8114 % 2;
                            offlineRosterActivity10.aF = false;
                            int i8116 = b;
                            i13 = ((i8116 & (-86)) | ((~i8116) & 85)) + ((i8116 & 85) << 1);
                            a = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i8117 = 2 / 3;
                            }
                        }
                    }
                }
            } else if (ag.j == 1) {
                int i314 = a;
                int i315 = ((((i314 ^ 65) | (i314 & 65)) << 1) - (~(-(((~i314) & 65) | (i314 & (-66)))))) - 1;
                i12 = i315 % 128;
                b = i12;
                int i316 = i315 % 2;
                if (i != 0) {
                    int i317 = (i12 ^ 3) + ((i12 & 3) << 1);
                    i14 = i317 % 128;
                    a = i14;
                    int i424 = i317 % 2;
                    if (i != 1) {
                        int i425 = i14 & 57;
                        int i426 = i14 | 57;
                        i15 = (i425 & i426) + (i426 | i425);
                        b = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i427 = 1 / 0;
                            if (offlineRosterActivity.aQ >= 18.0d) {
                                checkedRadioButtonId = offlineRosterActivity.radioGroupCNICOptions.getCheckedRadioButtonId();
                                radioButton = OfflineRosterActivity.this.radioButtonCNICPresent;
                                int i411112 = a;
                                int i411113 = (i411112 ^ 107) + ((i411112 & 107) << 1);
                                b = i411113 % 128;
                                int i411114 = i411113 % 2;
                                if (checkedRadioButtonId == radioButton.getId()) {
                                    int i411115 = b;
                                    i16 = (((i411115 & (-14)) | ((~i411115) & 13)) - (~(-(-((i411115 & 13) << 1))))) - 1;
                                    a = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                        int i411116 = a;
                                        int i411117 = (i411116 ^ 59) + ((i411116 & 59) << 1);
                                        b = i411117 % 128;
                                        int i5111110 = i411117 % 2;
                                        OfflineRosterActivity.this.aF = false;
                                        int i5111111 = b;
                                        int i5111112 = ((i5111111 | 45) << 1) - (i5111111 ^ 45);
                                        a = i5111112 % 128;
                                        int i5111113 = i5111112 % 2;
                                    } else {
                                        OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                        int i411118 = a;
                                        int i411119 = (i411118 ^ 59) + ((i411118 & 59) << 1);
                                        b = i411119 % 128;
                                        int i5111114 = i411119 % 2;
                                        OfflineRosterActivity.this.aF = false;
                                        int i5111115 = b;
                                        int i5111116 = ((i5111115 | 45) << 1) - (i5111115 ^ 45);
                                        a = i5111116 % 128;
                                        int i5111117 = i5111116 % 2;
                                    }
                                } else {
                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                    int i4111110 = a;
                                    int i4111111 = (i4111110 ^ 59) + ((i4111110 & 59) << 1);
                                    b = i4111111 % 128;
                                    int i5111118 = i4111111 % 2;
                                    OfflineRosterActivity.this.aF = false;
                                    int i5111119 = b;
                                    int i51111110 = ((i5111119 | 45) << 1) - (i5111119 ^ 45);
                                    a = i51111110 % 128;
                                    int i51111111 = i51111110 % 2;
                                }
                            } else {
                                offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                                OfflineRosterActivity offlineRosterActivity11 = OfflineRosterActivity.this;
                                int i71114 = b;
                                int i71115 = i71114 & 67;
                                int i71116 = (((i71114 ^ 67) | i71115) << 1) - ((i71114 | 67) & (~i71115));
                                a = i71116 % 128;
                                int i71117 = i71116 % 2;
                                offlineRosterActivity11.aF = false;
                                int i71118 = a;
                                int i71119 = i71118 & 25;
                                int i711110 = ((i71118 ^ 25) | i71119) << 1;
                                int i711111 = -((i71118 | 25) & (~i71119));
                                int i8118 = (i711110 & i711111) + (i711111 | i711110);
                                b = i8118 % 128;
                                int i8119 = i8118 % 2;
                            }
                        } else if (offlineRosterActivity.aQ >= 18.0d) {
                            checkedRadioButtonId = offlineRosterActivity.radioGroupCNICOptions.getCheckedRadioButtonId();
                            radioButton = OfflineRosterActivity.this.radioButtonCNICPresent;
                            int i4111112 = a;
                            int i4111113 = (i4111112 ^ 107) + ((i4111112 & 107) << 1);
                            b = i4111113 % 128;
                            int i4111114 = i4111113 % 2;
                            if (checkedRadioButtonId == radioButton.getId()) {
                                int i4111115 = b;
                                i16 = (((i4111115 & (-14)) | ((~i4111115) & 13)) - (~(-(-((i4111115 & 13) << 1))))) - 1;
                                a = i16 % 128;
                                if (i16 % 2 == 0) {
                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                    int i4111116 = a;
                                    int i4111117 = (i4111116 ^ 59) + ((i4111116 & 59) << 1);
                                    b = i4111117 % 128;
                                    int i51111112 = i4111117 % 2;
                                    OfflineRosterActivity.this.aF = false;
                                    int i51111113 = b;
                                    int i51111114 = ((i51111113 | 45) << 1) - (i51111113 ^ 45);
                                    a = i51111114 % 128;
                                    int i51111115 = i51111114 % 2;
                                } else {
                                    OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                    int i4111118 = a;
                                    int i4111119 = (i4111118 ^ 59) + ((i4111118 & 59) << 1);
                                    b = i4111119 % 128;
                                    int i51111116 = i4111119 % 2;
                                    OfflineRosterActivity.this.aF = false;
                                    int i51111117 = b;
                                    int i51111118 = ((i51111117 | 45) << 1) - (i51111117 ^ 45);
                                    a = i51111118 % 128;
                                    int i51111119 = i51111118 % 2;
                                }
                            } else {
                                OfflineRosterActivity.this.checkBoxBispBenif.setVisibility(8);
                                int i41111110 = a;
                                int i41111111 = (i41111110 ^ 59) + ((i41111110 & 59) << 1);
                                b = i41111111 % 128;
                                int i511111110 = i41111111 % 2;
                                OfflineRosterActivity.this.aF = false;
                                int i511111111 = b;
                                int i511111112 = ((i511111111 | 45) << 1) - (i511111111 ^ 45);
                                a = i511111112 % 128;
                                int i511111113 = i511111112 % 2;
                            }
                        } else {
                            offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                            OfflineRosterActivity offlineRosterActivity12 = OfflineRosterActivity.this;
                            int i711112 = b;
                            int i711113 = i711112 & 67;
                            int i711114 = (((i711112 ^ 67) | i711113) << 1) - ((i711112 | 67) & (~i711113));
                            a = i711114 % 128;
                            int i711115 = i711114 % 2;
                            offlineRosterActivity12.aF = false;
                            int i711116 = a;
                            int i711117 = i711116 & 25;
                            int i711118 = ((i711116 ^ 25) | i711117) << 1;
                            int i711119 = -((i711116 | 25) & (~i711117));
                            int i81110 = (i711118 & i711119) + (i711119 | i711118);
                            b = i81110 % 128;
                            int i81111 = i81110 % 2;
                        }
                    } else {
                        offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                        OfflineRosterActivity offlineRosterActivity13 = OfflineRosterActivity.this;
                        int i81112 = b;
                        int i81113 = ((i81112 | 105) << 1) - (i81112 ^ 105);
                        a = i81113 % 128;
                        int i81114 = i81113 % 2;
                        offlineRosterActivity13.aF = false;
                        int i81115 = b;
                        i13 = ((i81115 & (-86)) | ((~i81115) & 85)) + ((i81115 & 85) << 1);
                        a = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i81116 = 2 / 3;
                        }
                    }
                } else {
                    offlineRosterActivity.checkBoxBispBenif.setVisibility(8);
                    OfflineRosterActivity offlineRosterActivity14 = OfflineRosterActivity.this;
                    int i81117 = b;
                    int i81118 = ((i81117 | 105) << 1) - (i81117 ^ 105);
                    a = i81118 % 128;
                    int i81119 = i81118 % 2;
                    offlineRosterActivity14.aF = false;
                    int i811110 = b;
                    i13 = ((i811110 & (-86)) | ((~i811110) & 85)) + ((i811110 & 85) << 1);
                    a = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i811111 = 2 / 3;
                    }
                }
            }
            if (i > 0) {
                int i93 = b;
                int i94 = i93 ^ 35;
                int i95 = (i93 & 35) << 1;
                int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                a = i96 % 128;
                if (i96 % 2 == 0) {
                    arrayList = OfflineRosterActivity.this.bs;
                    int i97 = 26 / 0;
                    if (arrayList != null) {
                        if (arrayList.size() > 0) {
                            int i98 = a;
                            int i99 = i98 & 31;
                            int i100 = (i98 ^ 31) | i99;
                            int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                            b = i101 % 128;
                            int i102 = i101 % 2;
                            optionId = OfflineRosterActivity.this.bs.get(i).getOptionId();
                            int i103 = b;
                            int i104 = ((i103 | 77) << 1) - (i103 ^ 77);
                            i2 = i104 % 128;
                            a = i2;
                            int i105 = i104 % 2;
                            if (optionId != 201) {
                                int i106 = i2 ^ 19;
                                int i107 = -(-((i2 & 19) << 1));
                                int i108 = (i106 ^ i107) + ((i106 & i107) << 1);
                                b = i108 % 128;
                                int i109 = i108 % 2;
                                Item item4 = OfflineRosterActivity.this.bs.get(i);
                                int i110 = b;
                                i11 = (i110 & 17) + (i110 | 17);
                                a = i11 % 128;
                                if (i11 % 2 == 0 ? item4.getOptionId() == 203 : item4.getOptionId() == 29042) {
                                    int optionId2 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                    int i111 = a;
                                    int i112 = i111 & 51;
                                    int i113 = -(-((i111 ^ 51) | i112));
                                    i3 = ((i112 | i113) << 1) - (i113 ^ i112);
                                    i4 = i3 % 128;
                                    b = i4;
                                    str = "married";
                                    if (i3 % 2 != 0 ? optionId2 != 201 : optionId2 != 10230) {
                                        int i114 = (-2) - ((i4 + 66) ^ (-1));
                                        a = i114 % 128;
                                        int i115 = i114 % 2;
                                        str2 = BuildConfig.FLAVOR;
                                    } else {
                                        int i116 = (i4 & (-12)) | ((~i4) & 11);
                                        int i117 = (i4 & 11) << 1;
                                        int i118 = ((i116 | i117) << 1) - (i116 ^ i117);
                                        a = i118 % 128;
                                        int i119 = i118 % 2;
                                        str2 = "married";
                                    }
                                    int optionId3 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                    int i120 = b;
                                    int i121 = (i120 & (-2)) | ((~i120) & 1);
                                    int i122 = -(-((i120 & 1) << 1));
                                    i5 = (i121 ^ i122) + ((i122 & i121) << 1);
                                    i6 = i5 % 128;
                                    a = i6;
                                    if (i5 % 2 == 0 ? optionId3 == 203 : optionId3 == 25841) {
                                        int i123 = i6 & 65;
                                        int i124 = -(-(i6 | 65));
                                        int i125 = (i123 ^ i124) + ((i123 & i124) << 1);
                                        b = i125 % 128;
                                        int i126 = i125 % 2;
                                        str2 = "divorced";
                                    }
                                    item = OfflineRosterActivity.this.bs.get(i);
                                    int i127 = b;
                                    int i128 = i127 ^ 1;
                                    int i129 = (((i127 & 1) | i128) << 1) - i128;
                                    a = i129 % 128;
                                    int i130 = i129 % 2;
                                    if (item.getOptionId() == 202) {
                                        int i131 = b;
                                        int i132 = i131 & 35;
                                        int i133 = (i132 - (~(-(-((i131 ^ 35) | i132))))) - 1;
                                        a = i133 % 128;
                                        int i134 = i133 % 2;
                                        int i135 = ((i131 & (-16)) | ((~i131) & 15)) + ((i131 & 15) << 1);
                                        a = i135 % 128;
                                        int i136 = i135 % 2;
                                        str2 = "widow";
                                    }
                                    item2 = OfflineRosterActivity.this.bs.get(i);
                                    int i137 = a;
                                    int i138 = i137 & 67;
                                    int i139 = i138 + ((i137 ^ 67) | i138);
                                    b = i139 % 128;
                                    int i140 = i139 % 2;
                                    if (item2.getOptionId() == 204) {
                                        int i141 = a;
                                        int i142 = ((i141 | 63) << 1) - (i141 ^ 63);
                                        b = i142 % 128;
                                        int i143 = i142 % 2;
                                        int i144 = ((i141 ^ 112) + ((i141 & 112) << 1)) - 1;
                                        b = i144 % 128;
                                        int i145 = i144 % 2;
                                    } else {
                                        str = str2;
                                    }
                                    OfflineRosterActivity offlineRosterActivity15 = OfflineRosterActivity.this;
                                    Objects.requireNonNull(offlineRosterActivity15);
                                    double d = offlineRosterActivity15.aQ;
                                    int i146 = b;
                                    int i147 = (i146 & 84) + (i146 | 84);
                                    i7 = (i147 ^ (-1)) + (i147 << 1);
                                    a = i7 % 128;
                                    if (i7 % 2 == 0 ? d <= 0.0d : d <= 0.0d) {
                                        int i148 = i146 & 109;
                                        int i149 = -(-((i146 ^ 109) | i148));
                                        int i150 = (i148 & i149) + (i148 | i149);
                                        a = i150 % 128;
                                        if (i150 % 2 == 0) {
                                            throw null;
                                        }
                                        if (i8 == 0 && offlineRosterActivity15.spinnerMonth.getSelectedItemPosition() > 0) {
                                            if (OfflineRosterActivity.this.aQ < 17.0d) {
                                                int i151 = b;
                                                int i152 = i151 | 75;
                                                i9 = (i152 << 1) - ((~(i151 & 75)) & i152);
                                                a = i9 % 128;
                                                if (i9 % 2 == 0) {
                                                    C0104p.c();
                                                    AppCompatActivity appCompatActivity2 = OfflineRosterActivity.this.ae;
                                                    throw null;
                                                }
                                                c0104pC = C0104p.c();
                                                appCompatActivity = OfflineRosterActivity.this.ae;
                                                int i153 = b;
                                                int i154 = ((i153 ^ 119) | (i153 & 119)) << 1;
                                                int i155 = -(((~i153) & 119) | (i153 & (-120)));
                                                int i156 = ((i154 | i155) << 1) - (i155 ^ i154);
                                                a = i156 % 128;
                                                int i157 = i156 % 2;
                                                strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                                amVar = new am(this, i35);
                                                i10 = b + 5;
                                                a = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                    c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                                } else {
                                                    c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                                }
                                            }
                                        }
                                    } else if (OfflineRosterActivity.this.aQ < 17.0d) {
                                        int i158 = b;
                                        int i159 = i158 | 75;
                                        i9 = (i159 << 1) - ((~(i158 & 75)) & i159);
                                        a = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            C0104p.c();
                                            AppCompatActivity appCompatActivity3 = OfflineRosterActivity.this.ae;
                                            throw null;
                                        }
                                        c0104pC = C0104p.c();
                                        appCompatActivity = OfflineRosterActivity.this.ae;
                                        int i1510 = b;
                                        int i1511 = ((i1510 ^ 119) | (i1510 & 119)) << 1;
                                        int i1512 = -(((~i1510) & 119) | (i1510 & (-120)));
                                        int i1513 = ((i1511 | i1512) << 1) - (i1512 ^ i1511);
                                        a = i1513 % 128;
                                        int i1514 = i1513 % 2;
                                        strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                        amVar = new am(this, i35);
                                        i10 = b + 5;
                                        a = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                        } else {
                                            c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                        }
                                    }
                                } else {
                                    int optionId4 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                    int i160 = b;
                                    int i161 = i160 & 1;
                                    int i162 = -(-((i160 ^ 1) | i161));
                                    int i163 = (i161 & i162) + (i161 | i162);
                                    a = i163 % 128;
                                    if (i163 % 2 != 0 ? optionId4 == 202 : optionId4 == 14585) {
                                        int optionId5 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                        int i1110 = a;
                                        int i1111 = i1110 & 51;
                                        int i1112 = -(-((i1110 ^ 51) | i1111));
                                        i3 = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                                        i4 = i3 % 128;
                                        b = i4;
                                        str = "married";
                                        if (i3 % 2 != 0) {
                                            int i1113 = (-2) - ((i4 + 66) ^ (-1));
                                            a = i1113 % 128;
                                            int i1114 = i1113 % 2;
                                            str2 = BuildConfig.FLAVOR;
                                        } else {
                                            int i1115 = (-2) - ((i4 + 66) ^ (-1));
                                            a = i1115 % 128;
                                            int i1116 = i1115 % 2;
                                            str2 = BuildConfig.FLAVOR;
                                        }
                                        int optionId6 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                        int i1210 = b;
                                        int i1211 = (i1210 & (-2)) | ((~i1210) & 1);
                                        int i1212 = -(-((i1210 & 1) << 1));
                                        i5 = (i1211 ^ i1212) + ((i1212 & i1211) << 1);
                                        i6 = i5 % 128;
                                        a = i6;
                                        if (i5 % 2 == 0) {
                                            int i1213 = i6 & 65;
                                            int i1214 = -(-(i6 | 65));
                                            int i1215 = (i1213 ^ i1214) + ((i1213 & i1214) << 1);
                                            b = i1215 % 128;
                                            int i1216 = i1215 % 2;
                                            str2 = "divorced";
                                        } else {
                                            int i1217 = i6 & 65;
                                            int i1218 = -(-(i6 | 65));
                                            int i1219 = (i1217 ^ i1218) + ((i1217 & i1218) << 1);
                                            b = i1219 % 128;
                                            int i12110 = i1219 % 2;
                                            str2 = "divorced";
                                        }
                                        item = OfflineRosterActivity.this.bs.get(i);
                                        int i1220 = b;
                                        int i1221 = i1220 ^ 1;
                                        int i1222 = (((i1220 & 1) | i1221) << 1) - i1221;
                                        a = i1222 % 128;
                                        int i1310 = i1222 % 2;
                                        if (item.getOptionId() == 202) {
                                            int i1311 = b;
                                            int i1312 = i1311 & 35;
                                            int i1313 = (i1312 - (~(-(-((i1311 ^ 35) | i1312))))) - 1;
                                            a = i1313 % 128;
                                            int i1314 = i1313 % 2;
                                            int i1315 = ((i1311 & (-16)) | ((~i1311) & 15)) + ((i1311 & 15) << 1);
                                            a = i1315 % 128;
                                            int i1316 = i1315 % 2;
                                            str2 = "widow";
                                        }
                                        item2 = OfflineRosterActivity.this.bs.get(i);
                                        int i1317 = a;
                                        int i1318 = i1317 & 67;
                                        int i1319 = i1318 + ((i1317 ^ 67) | i1318);
                                        b = i1319 % 128;
                                        int i1410 = i1319 % 2;
                                        if (item2.getOptionId() == 204) {
                                            int i1411 = a;
                                            int i1412 = ((i1411 | 63) << 1) - (i1411 ^ 63);
                                            b = i1412 % 128;
                                            int i1413 = i1412 % 2;
                                            int i1414 = ((i1411 ^ 112) + ((i1411 & 112) << 1)) - 1;
                                            b = i1414 % 128;
                                            int i1415 = i1414 % 2;
                                        } else {
                                            str = str2;
                                        }
                                        OfflineRosterActivity offlineRosterActivity16 = OfflineRosterActivity.this;
                                        Objects.requireNonNull(offlineRosterActivity16);
                                        double d2 = offlineRosterActivity16.aQ;
                                        int i1416 = b;
                                        int i1417 = (i1416 & 84) + (i1416 | 84);
                                        i7 = (i1417 ^ (-1)) + (i1417 << 1);
                                        a = i7 % 128;
                                        if (i7 % 2 == 0) {
                                        }
                                        if (OfflineRosterActivity.this.aQ < 17.0d) {
                                            int i1515 = b;
                                            int i1516 = i1515 | 75;
                                            i9 = (i1516 << 1) - ((~(i1515 & 75)) & i1516);
                                            a = i9 % 128;
                                            if (i9 % 2 == 0) {
                                                C0104p.c();
                                                AppCompatActivity appCompatActivity4 = OfflineRosterActivity.this.ae;
                                                throw null;
                                            }
                                            c0104pC = C0104p.c();
                                            appCompatActivity = OfflineRosterActivity.this.ae;
                                            int i1517 = b;
                                            int i1518 = ((i1517 ^ 119) | (i1517 & 119)) << 1;
                                            int i1519 = -(((~i1517) & 119) | (i1517 & (-120)));
                                            int i15110 = ((i1518 | i1519) << 1) - (i1519 ^ i1518);
                                            a = i15110 % 128;
                                            int i15111 = i15110 % 2;
                                            strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                            amVar = new am(this, i35);
                                            i10 = b + 5;
                                            a = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                            } else {
                                                c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                            }
                                        }
                                    } else {
                                        int i164 = i160 + 27;
                                        a = i164 % 128;
                                        if (i164 % 2 == 0) {
                                            item3 = OfflineRosterActivity.this.bs.get(i);
                                            int i165 = 79 / 0;
                                        } else {
                                            item3 = OfflineRosterActivity.this.bs.get(i);
                                        }
                                        if (item3.getOptionId() == 204) {
                                            int optionId7 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                            int i1117 = a;
                                            int i1118 = i1117 & 51;
                                            int i1119 = -(-((i1117 ^ 51) | i1118));
                                            i3 = ((i1118 | i1119) << 1) - (i1119 ^ i1118);
                                            i4 = i3 % 128;
                                            b = i4;
                                            str = "married";
                                            if (i3 % 2 != 0) {
                                                int i11110 = (-2) - ((i4 + 66) ^ (-1));
                                                a = i11110 % 128;
                                                int i11111 = i11110 % 2;
                                                str2 = BuildConfig.FLAVOR;
                                            } else {
                                                int i11112 = (-2) - ((i4 + 66) ^ (-1));
                                                a = i11112 % 128;
                                                int i11113 = i11112 % 2;
                                                str2 = BuildConfig.FLAVOR;
                                            }
                                            int optionId8 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                            int i12111 = b;
                                            int i12112 = (i12111 & (-2)) | ((~i12111) & 1);
                                            int i12113 = -(-((i12111 & 1) << 1));
                                            i5 = (i12112 ^ i12113) + ((i12113 & i12112) << 1);
                                            i6 = i5 % 128;
                                            a = i6;
                                            if (i5 % 2 == 0) {
                                                int i12114 = i6 & 65;
                                                int i12115 = -(-(i6 | 65));
                                                int i12116 = (i12114 ^ i12115) + ((i12114 & i12115) << 1);
                                                b = i12116 % 128;
                                                int i12117 = i12116 % 2;
                                                str2 = "divorced";
                                            } else {
                                                int i12118 = i6 & 65;
                                                int i12119 = -(-(i6 | 65));
                                                int i121110 = (i12118 ^ i12119) + ((i12118 & i12119) << 1);
                                                b = i121110 % 128;
                                                int i121111 = i121110 % 2;
                                                str2 = "divorced";
                                            }
                                            item = OfflineRosterActivity.this.bs.get(i);
                                            int i1223 = b;
                                            int i1224 = i1223 ^ 1;
                                            int i1225 = (((i1223 & 1) | i1224) << 1) - i1224;
                                            a = i1225 % 128;
                                            int i13110 = i1225 % 2;
                                            if (item.getOptionId() == 202) {
                                                int i13111 = b;
                                                int i13112 = i13111 & 35;
                                                int i13113 = (i13112 - (~(-(-((i13111 ^ 35) | i13112))))) - 1;
                                                a = i13113 % 128;
                                                int i13114 = i13113 % 2;
                                                int i13115 = ((i13111 & (-16)) | ((~i13111) & 15)) + ((i13111 & 15) << 1);
                                                a = i13115 % 128;
                                                int i13116 = i13115 % 2;
                                                str2 = "widow";
                                            }
                                            item2 = OfflineRosterActivity.this.bs.get(i);
                                            int i13117 = a;
                                            int i13118 = i13117 & 67;
                                            int i13119 = i13118 + ((i13117 ^ 67) | i13118);
                                            b = i13119 % 128;
                                            int i1418 = i13119 % 2;
                                            if (item2.getOptionId() == 204) {
                                                int i1419 = a;
                                                int i14110 = ((i1419 | 63) << 1) - (i1419 ^ 63);
                                                b = i14110 % 128;
                                                int i14111 = i14110 % 2;
                                                int i14112 = ((i1419 ^ 112) + ((i1419 & 112) << 1)) - 1;
                                                b = i14112 % 128;
                                                int i14113 = i14112 % 2;
                                            } else {
                                                str = str2;
                                            }
                                            OfflineRosterActivity offlineRosterActivity17 = OfflineRosterActivity.this;
                                            Objects.requireNonNull(offlineRosterActivity17);
                                            double d3 = offlineRosterActivity17.aQ;
                                            int i14114 = b;
                                            int i14115 = (i14114 & 84) + (i14114 | 84);
                                            i7 = (i14115 ^ (-1)) + (i14115 << 1);
                                            a = i7 % 128;
                                            if (i7 % 2 == 0) {
                                            }
                                            if (OfflineRosterActivity.this.aQ < 17.0d) {
                                                int i15112 = b;
                                                int i15113 = i15112 | 75;
                                                i9 = (i15113 << 1) - ((~(i15112 & 75)) & i15113);
                                                a = i9 % 128;
                                                if (i9 % 2 == 0) {
                                                    C0104p.c();
                                                    AppCompatActivity appCompatActivity5 = OfflineRosterActivity.this.ae;
                                                    throw null;
                                                }
                                                c0104pC = C0104p.c();
                                                appCompatActivity = OfflineRosterActivity.this.ae;
                                                int i15114 = b;
                                                int i15115 = ((i15114 ^ 119) | (i15114 & 119)) << 1;
                                                int i15116 = -(((~i15114) & 119) | (i15114 & (-120)));
                                                int i15117 = ((i15115 | i15116) << 1) - (i15116 ^ i15115);
                                                a = i15117 % 128;
                                                int i15118 = i15117 % 2;
                                                strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                                amVar = new am(this, i35);
                                                i10 = b + 5;
                                                a = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                    c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                                } else {
                                                    c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int optionId9 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                int i11114 = a;
                                int i11115 = i11114 & 51;
                                int i11116 = -(-((i11114 ^ 51) | i11115));
                                i3 = ((i11115 | i11116) << 1) - (i11116 ^ i11115);
                                i4 = i3 % 128;
                                b = i4;
                                str = "married";
                                if (i3 % 2 != 0) {
                                    int i11117 = (-2) - ((i4 + 66) ^ (-1));
                                    a = i11117 % 128;
                                    int i11118 = i11117 % 2;
                                    str2 = BuildConfig.FLAVOR;
                                } else {
                                    int i11119 = (-2) - ((i4 + 66) ^ (-1));
                                    a = i11119 % 128;
                                    int i111110 = i11119 % 2;
                                    str2 = BuildConfig.FLAVOR;
                                }
                                int optionId10 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                int i121112 = b;
                                int i121113 = (i121112 & (-2)) | ((~i121112) & 1);
                                int i121114 = -(-((i121112 & 1) << 1));
                                i5 = (i121113 ^ i121114) + ((i121114 & i121113) << 1);
                                i6 = i5 % 128;
                                a = i6;
                                if (i5 % 2 == 0) {
                                    int i121115 = i6 & 65;
                                    int i121116 = -(-(i6 | 65));
                                    int i121117 = (i121115 ^ i121116) + ((i121115 & i121116) << 1);
                                    b = i121117 % 128;
                                    int i121118 = i121117 % 2;
                                    str2 = "divorced";
                                } else {
                                    int i121119 = i6 & 65;
                                    int i1211110 = -(-(i6 | 65));
                                    int i1211111 = (i121119 ^ i1211110) + ((i121119 & i1211110) << 1);
                                    b = i1211111 % 128;
                                    int i1211112 = i1211111 % 2;
                                    str2 = "divorced";
                                }
                                item = OfflineRosterActivity.this.bs.get(i);
                                int i1226 = b;
                                int i1227 = i1226 ^ 1;
                                int i1228 = (((i1226 & 1) | i1227) << 1) - i1227;
                                a = i1228 % 128;
                                int i131110 = i1228 % 2;
                                if (item.getOptionId() == 202) {
                                    int i131111 = b;
                                    int i131112 = i131111 & 35;
                                    int i131113 = (i131112 - (~(-(-((i131111 ^ 35) | i131112))))) - 1;
                                    a = i131113 % 128;
                                    int i131114 = i131113 % 2;
                                    int i131115 = ((i131111 & (-16)) | ((~i131111) & 15)) + ((i131111 & 15) << 1);
                                    a = i131115 % 128;
                                    int i131116 = i131115 % 2;
                                    str2 = "widow";
                                }
                                item2 = OfflineRosterActivity.this.bs.get(i);
                                int i131117 = a;
                                int i131118 = i131117 & 67;
                                int i131119 = i131118 + ((i131117 ^ 67) | i131118);
                                b = i131119 % 128;
                                int i14116 = i131119 % 2;
                                if (item2.getOptionId() == 204) {
                                    int i14117 = a;
                                    int i14118 = ((i14117 | 63) << 1) - (i14117 ^ 63);
                                    b = i14118 % 128;
                                    int i14119 = i14118 % 2;
                                    int i141110 = ((i14117 ^ 112) + ((i14117 & 112) << 1)) - 1;
                                    b = i141110 % 128;
                                    int i141111 = i141110 % 2;
                                } else {
                                    str = str2;
                                }
                                OfflineRosterActivity offlineRosterActivity18 = OfflineRosterActivity.this;
                                Objects.requireNonNull(offlineRosterActivity18);
                                double d4 = offlineRosterActivity18.aQ;
                                int i141112 = b;
                                int i141113 = (i141112 & 84) + (i141112 | 84);
                                i7 = (i141113 ^ (-1)) + (i141113 << 1);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                }
                                if (OfflineRosterActivity.this.aQ < 17.0d) {
                                    int i15119 = b;
                                    int i151110 = i15119 | 75;
                                    i9 = (i151110 << 1) - ((~(i15119 & 75)) & i151110);
                                    a = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        C0104p.c();
                                        AppCompatActivity appCompatActivity6 = OfflineRosterActivity.this.ae;
                                        throw null;
                                    }
                                    c0104pC = C0104p.c();
                                    appCompatActivity = OfflineRosterActivity.this.ae;
                                    int i151111 = b;
                                    int i151112 = ((i151111 ^ 119) | (i151111 & 119)) << 1;
                                    int i151113 = -(((~i151111) & 119) | (i151111 & (-120)));
                                    int i151114 = ((i151112 | i151113) << 1) - (i151113 ^ i151112);
                                    a = i151114 % 128;
                                    int i151115 = i151114 % 2;
                                    strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                    amVar = new am(this, i35);
                                    i10 = b + 5;
                                    a = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                    } else {
                                        c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = OfflineRosterActivity.this.bs;
                    if (arrayList != null) {
                        if (arrayList.size() > 0) {
                            int i910 = a;
                            int i911 = i910 & 31;
                            int i1010 = (i910 ^ 31) | i911;
                            int i1011 = ((i911 | i1010) << 1) - (i1010 ^ i911);
                            b = i1011 % 128;
                            int i1012 = i1011 % 2;
                            optionId = OfflineRosterActivity.this.bs.get(i).getOptionId();
                            int i1013 = b;
                            int i1014 = ((i1013 | 77) << 1) - (i1013 ^ 77);
                            i2 = i1014 % 128;
                            a = i2;
                            int i1015 = i1014 % 2;
                            if (optionId != 201) {
                                int i1016 = i2 ^ 19;
                                int i1017 = -(-((i2 & 19) << 1));
                                int i1018 = (i1016 ^ i1017) + ((i1016 & i1017) << 1);
                                b = i1018 % 128;
                                int i1019 = i1018 % 2;
                                Item item5 = OfflineRosterActivity.this.bs.get(i);
                                int i1120 = b;
                                i11 = (i1120 & 17) + (i1120 | 17);
                                a = i11 % 128;
                                if (i11 % 2 == 0) {
                                }
                                int optionId11 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                int i111111 = a;
                                int i111112 = i111111 & 51;
                                int i111113 = -(-((i111111 ^ 51) | i111112));
                                i3 = ((i111112 | i111113) << 1) - (i111113 ^ i111112);
                                i4 = i3 % 128;
                                b = i4;
                                str = "married";
                                if (i3 % 2 != 0) {
                                    int i111114 = (-2) - ((i4 + 66) ^ (-1));
                                    a = i111114 % 128;
                                    int i111115 = i111114 % 2;
                                    str2 = BuildConfig.FLAVOR;
                                } else {
                                    int i111116 = (-2) - ((i4 + 66) ^ (-1));
                                    a = i111116 % 128;
                                    int i111117 = i111116 % 2;
                                    str2 = BuildConfig.FLAVOR;
                                }
                                int optionId12 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                int i1211113 = b;
                                int i1211114 = (i1211113 & (-2)) | ((~i1211113) & 1);
                                int i1211115 = -(-((i1211113 & 1) << 1));
                                i5 = (i1211114 ^ i1211115) + ((i1211115 & i1211114) << 1);
                                i6 = i5 % 128;
                                a = i6;
                                if (i5 % 2 == 0) {
                                    int i1211116 = i6 & 65;
                                    int i1211117 = -(-(i6 | 65));
                                    int i1211118 = (i1211116 ^ i1211117) + ((i1211116 & i1211117) << 1);
                                    b = i1211118 % 128;
                                    int i1211119 = i1211118 % 2;
                                    str2 = "divorced";
                                } else {
                                    int i12111110 = i6 & 65;
                                    int i12111111 = -(-(i6 | 65));
                                    int i12111112 = (i12111110 ^ i12111111) + ((i12111110 & i12111111) << 1);
                                    b = i12111112 % 128;
                                    int i12111113 = i12111112 % 2;
                                    str2 = "divorced";
                                }
                                item = OfflineRosterActivity.this.bs.get(i);
                                int i1229 = b;
                                int i12210 = i1229 ^ 1;
                                int i12211 = (((i1229 & 1) | i12210) << 1) - i12210;
                                a = i12211 % 128;
                                int i1311110 = i12211 % 2;
                                if (item.getOptionId() == 202) {
                                    int i1311111 = b;
                                    int i1311112 = i1311111 & 35;
                                    int i1311113 = (i1311112 - (~(-(-((i1311111 ^ 35) | i1311112))))) - 1;
                                    a = i1311113 % 128;
                                    int i1311114 = i1311113 % 2;
                                    int i1311115 = ((i1311111 & (-16)) | ((~i1311111) & 15)) + ((i1311111 & 15) << 1);
                                    a = i1311115 % 128;
                                    int i1311116 = i1311115 % 2;
                                    str2 = "widow";
                                }
                                item2 = OfflineRosterActivity.this.bs.get(i);
                                int i1311117 = a;
                                int i1311118 = i1311117 & 67;
                                int i1311119 = i1311118 + ((i1311117 ^ 67) | i1311118);
                                b = i1311119 % 128;
                                int i141114 = i1311119 % 2;
                                if (item2.getOptionId() == 204) {
                                    int i141115 = a;
                                    int i141116 = ((i141115 | 63) << 1) - (i141115 ^ 63);
                                    b = i141116 % 128;
                                    int i141117 = i141116 % 2;
                                    int i141118 = ((i141115 ^ 112) + ((i141115 & 112) << 1)) - 1;
                                    b = i141118 % 128;
                                    int i141119 = i141118 % 2;
                                } else {
                                    str = str2;
                                }
                                OfflineRosterActivity offlineRosterActivity19 = OfflineRosterActivity.this;
                                Objects.requireNonNull(offlineRosterActivity19);
                                double d5 = offlineRosterActivity19.aQ;
                                int i1411110 = b;
                                int i1411111 = (i1411110 & 84) + (i1411110 | 84);
                                i7 = (i1411111 ^ (-1)) + (i1411111 << 1);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                }
                                if (OfflineRosterActivity.this.aQ < 17.0d) {
                                    int i151116 = b;
                                    int i151117 = i151116 | 75;
                                    i9 = (i151117 << 1) - ((~(i151116 & 75)) & i151117);
                                    a = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        C0104p.c();
                                        AppCompatActivity appCompatActivity7 = OfflineRosterActivity.this.ae;
                                        throw null;
                                    }
                                    c0104pC = C0104p.c();
                                    appCompatActivity = OfflineRosterActivity.this.ae;
                                    int i151118 = b;
                                    int i151119 = ((i151118 ^ 119) | (i151118 & 119)) << 1;
                                    int i1511110 = -(((~i151118) & 119) | (i151118 & (-120)));
                                    int i1511111 = ((i151119 | i1511110) << 1) - (i1511110 ^ i151119);
                                    a = i1511111 % 128;
                                    int i1511112 = i1511111 % 2;
                                    strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                    amVar = new am(this, i35);
                                    i10 = b + 5;
                                    a = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                    } else {
                                        c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                    }
                                }
                            } else {
                                int optionId13 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                int i111118 = a;
                                int i111119 = i111118 & 51;
                                int i1111110 = -(-((i111118 ^ 51) | i111119));
                                i3 = ((i111119 | i1111110) << 1) - (i1111110 ^ i111119);
                                i4 = i3 % 128;
                                b = i4;
                                str = "married";
                                if (i3 % 2 != 0) {
                                    int i1111111 = (-2) - ((i4 + 66) ^ (-1));
                                    a = i1111111 % 128;
                                    int i1111112 = i1111111 % 2;
                                    str2 = BuildConfig.FLAVOR;
                                } else {
                                    int i1111113 = (-2) - ((i4 + 66) ^ (-1));
                                    a = i1111113 % 128;
                                    int i1111114 = i1111113 % 2;
                                    str2 = BuildConfig.FLAVOR;
                                }
                                int optionId14 = OfflineRosterActivity.this.bs.get(i).getOptionId();
                                int i12111114 = b;
                                int i12111115 = (i12111114 & (-2)) | ((~i12111114) & 1);
                                int i12111116 = -(-((i12111114 & 1) << 1));
                                i5 = (i12111115 ^ i12111116) + ((i12111116 & i12111115) << 1);
                                i6 = i5 % 128;
                                a = i6;
                                if (i5 % 2 == 0) {
                                    int i12111117 = i6 & 65;
                                    int i12111118 = -(-(i6 | 65));
                                    int i12111119 = (i12111117 ^ i12111118) + ((i12111117 & i12111118) << 1);
                                    b = i12111119 % 128;
                                    int i121111110 = i12111119 % 2;
                                    str2 = "divorced";
                                } else {
                                    int i121111111 = i6 & 65;
                                    int i121111112 = -(-(i6 | 65));
                                    int i121111113 = (i121111111 ^ i121111112) + ((i121111111 & i121111112) << 1);
                                    b = i121111113 % 128;
                                    int i121111114 = i121111113 % 2;
                                    str2 = "divorced";
                                }
                                item = OfflineRosterActivity.this.bs.get(i);
                                int i12212 = b;
                                int i12213 = i12212 ^ 1;
                                int i12214 = (((i12212 & 1) | i12213) << 1) - i12213;
                                a = i12214 % 128;
                                int i13111110 = i12214 % 2;
                                if (item.getOptionId() == 202) {
                                    int i13111111 = b;
                                    int i13111112 = i13111111 & 35;
                                    int i13111113 = (i13111112 - (~(-(-((i13111111 ^ 35) | i13111112))))) - 1;
                                    a = i13111113 % 128;
                                    int i13111114 = i13111113 % 2;
                                    int i13111115 = ((i13111111 & (-16)) | ((~i13111111) & 15)) + ((i13111111 & 15) << 1);
                                    a = i13111115 % 128;
                                    int i13111116 = i13111115 % 2;
                                    str2 = "widow";
                                }
                                item2 = OfflineRosterActivity.this.bs.get(i);
                                int i13111117 = a;
                                int i13111118 = i13111117 & 67;
                                int i13111119 = i13111118 + ((i13111117 ^ 67) | i13111118);
                                b = i13111119 % 128;
                                int i1411112 = i13111119 % 2;
                                if (item2.getOptionId() == 204) {
                                    int i1411113 = a;
                                    int i1411114 = ((i1411113 | 63) << 1) - (i1411113 ^ 63);
                                    b = i1411114 % 128;
                                    int i1411115 = i1411114 % 2;
                                    int i1411116 = ((i1411113 ^ 112) + ((i1411113 & 112) << 1)) - 1;
                                    b = i1411116 % 128;
                                    int i1411117 = i1411116 % 2;
                                } else {
                                    str = str2;
                                }
                                OfflineRosterActivity offlineRosterActivity110 = OfflineRosterActivity.this;
                                Objects.requireNonNull(offlineRosterActivity110);
                                double d6 = offlineRosterActivity110.aQ;
                                int i1411118 = b;
                                int i1411119 = (i1411118 & 84) + (i1411118 | 84);
                                i7 = (i1411119 ^ (-1)) + (i1411119 << 1);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                }
                                if (OfflineRosterActivity.this.aQ < 17.0d) {
                                    int i1511113 = b;
                                    int i1511114 = i1511113 | 75;
                                    i9 = (i1511114 << 1) - ((~(i1511113 & 75)) & i1511114);
                                    a = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        C0104p.c();
                                        AppCompatActivity appCompatActivity8 = OfflineRosterActivity.this.ae;
                                        throw null;
                                    }
                                    c0104pC = C0104p.c();
                                    appCompatActivity = OfflineRosterActivity.this.ae;
                                    int i1511115 = b;
                                    int i1511116 = ((i1511115 ^ 119) | (i1511115 & 119)) << 1;
                                    int i1511117 = -(((~i1511115) & 119) | (i1511115 & (-120)));
                                    int i1511118 = ((i1511116 | i1511117) << 1) - (i1511117 ^ i1511116);
                                    a = i1511118 % 128;
                                    int i1511119 = i1511118 % 2;
                                    strT = ivas.gov.bisp.enumeration.p091n.j.t("Are you sure roster is ", str, "?");
                                    amVar = new am(this, i35);
                                    i10 = b + 5;
                                    a = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                    } else {
                                        c0104pC.h(appCompatActivity, "Warning", strT, null, amVar, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i166 = b;
            int i167 = i166 & 9;
            int i168 = (i166 ^ 9) | i167;
            int i169 = (i167 ^ i168) + ((i168 & i167) << 1);
            a = i169 % 128;
            if (i169 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x020a  */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x05bb, code lost:
    
        if (r21.radioGroupGender.getCheckedRadioButtonId() == r21.radioButtonFemale.getId()) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05ca, code lost:
    
        if (r21.radioGroupGender.getCheckedRadioButtonId() == r21.radioButtonFemale.getId()) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x05d2, code lost:
    
        if (r21.sp_marital_status.getSelectedItemPosition() == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x05da, code lost:
    
        if (r21.sp_marital_status.getSelectedItemPosition() == 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x05dc, code lost:
    
        r0 = ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.q + 37;
        ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.p = r0 % 128;
        r0 = r0 % 2;
        r21.checkBoxBispBenif.setVisibility(0);
        r21.aF = true;
        r0 = ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.p;
        r1 = ((((r0 ^ 1) | (r0 & 1)) << 1) - (~(-(((~r0) & 1) | (r0 & (-2)))))) - 1;
        ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.q = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0603, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0604, code lost:
    
        r21.checkBoxBispBenif.setVisibility(8);
        r21.aF = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x060b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x060c, code lost:
    
        r21.checkBoxBispBenif.setVisibility(8);
        r21.aF = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0613, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P(double r22) {
        /*
            Method dump skipped, instruction units count: 1608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.rosterActivity.OfflineRosterActivity.P(double):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0429  */
    /* JADX WARN: Code duplicated, block: B:102:0x0437  */
    /* JADX WARN: Code duplicated, block: B:104:0x0468  */
    /* JADX WARN: Code duplicated, block: B:106:0x0470  */
    /* JADX WARN: Code duplicated, block: B:109:0x0490  */
    /* JADX WARN: Code duplicated, block: B:111:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x04be  */
    /* JADX WARN: Code duplicated, block: B:116:0x04da  */
    /* JADX WARN: Code duplicated, block: B:118:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0503  */
    /* JADX WARN: Code duplicated, block: B:123:0x052d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0539  */
    /* JADX WARN: Code duplicated, block: B:126:0x0547  */
    /* JADX WARN: Code duplicated, block: B:129:0x056f  */
    /* JADX WARN: Code duplicated, block: B:134:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:136:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:141:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:144:0x0625  */
    /* JADX WARN: Code duplicated, block: B:148:0x0645  */
    /* JADX WARN: Code duplicated, block: B:149:0x0651  */
    /* JADX WARN: Code duplicated, block: B:152:0x067d  */
    /* JADX WARN: Code duplicated, block: B:153:0x068a  */
    /* JADX WARN: Code duplicated, block: B:157:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:159:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:161:0x0708  */
    /* JADX WARN: Code duplicated, block: B:162:0x070b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0716  */
    /* JADX WARN: Code duplicated, block: B:168:0x0731  */
    /* JADX WARN: Code duplicated, block: B:169:0x073b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0757  */
    /* JADX WARN: Code duplicated, block: B:175:0x0776  */
    /* JADX WARN: Code duplicated, block: B:177:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:178:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:180:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:182:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:185:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:188:0x083c  */
    /* JADX WARN: Code duplicated, block: B:59:0x02de  */
    /* JADX WARN: Code duplicated, block: B:64:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x033a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0345  */
    /* JADX WARN: Code duplicated, block: B:85:0x0364  */
    /* JADX WARN: Code duplicated, block: B:87:0x0376  */
    /* JADX WARN: Code duplicated, block: B:88:0x037a  */
    /* JADX WARN: Code duplicated, block: B:89:0x037e  */
    /* JADX WARN: Code duplicated, block: B:91:0x038c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0390  */
    /* JADX WARN: Code duplicated, block: B:94:0x039e  */
    /* JADX WARN: Code duplicated, block: B:95:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:97:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:99:0x0426  */
    public void G() {
        EditText editText;
        double d;
        Intent intent;
        Roster roster;
        int i;
        Roster roster2;
        int i2;
        String string;
        int i3;
        String option;
        int i4;
        int i5;
        ArrayList<Item> arrayList;
        int selectedItemPosition;
        ArrayList<Item> arrayList2;
        int selectedItemPosition2;
        int i6;
        int i7;
        Item item;
        int i8;
        ArrayList<Item> arrayList3;
        int i9;
        ArrayList<Item> arrayList4;
        int selectedItemPosition3;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14 = 2 % 2;
        Roster roster3 = new Roster();
        roster3.name_of_member = this.et_MemberName.getText().toString();
        boolean z = this.bt;
        if (!z) {
            z = this.by;
            int i15 = q;
            int i16 = (((i15 ^ 11) | (i15 & 11)) << 1) - (((~i15) & 11) | (i15 & (-12)));
            p = i16 % 128;
            int i17 = i16 % 2;
        }
        roster3.cnic_valid = Boolean.valueOf(z);
        String string2 = this.et_MemberName.getText().toString();
        int i18 = q + 33;
        p = i18 % 128;
        int i19 = i18 % 2;
        roster3.cnic_valid_name = string2;
        roster3.cnic_valid_father_Name = this.bn;
        roster3.cnic_valid_dob = this.bq;
        int i20 = p;
        int i21 = (i20 & 31) + (i20 | 31);
        q = i21 % 128;
        if (i21 % 2 != 0) {
            roster3.cnic = this.et_RosterCNIC.getText().toString();
            editText = this.et_RosterCNICRepeat;
            int i22 = 26 / 0;
        } else {
            roster3.cnic = this.et_RosterCNIC.getText().toString();
            editText = this.et_RosterCNICRepeat;
        }
        roster3.cnicRepeat = editText.getText().toString();
        roster3.cnic_valid_gender = this.bz;
        roster3.cnic_valid_current_address = this.bp;
        roster3.cnic_valid_permanent_address = this.bo;
        String str2 = this.bw;
        int i23 = p;
        int i24 = i23 & 35;
        int i25 = ((((i23 ^ 35) | i24) << 1) - (~(-((i23 | 35) & (~i24))))) - 1;
        q = i25 % 128;
        int i26 = i25 % 2;
        roster3.cnic_valid_identification_mark = str2;
        roster3.cnic_valid_religion = this.bx;
        Object selectedItem = this.sp_networks.getSelectedItem();
        int i27 = p + 67;
        q = i27 % 128;
        int i28 = i27 % 2;
        roster3.mobile_network_name = selectedItem.toString();
        roster3.mobile_no = this.et_mobile_number.getText().toString();
        if (this.rg_bank_info.getCheckedRadioButtonId() != this.rg_bank_info.getChildAt(1).getId()) {
            int i29 = p;
            int i30 = i29 & 19;
            int i31 = (i30 - (~(-(-((i29 ^ 19) | i30))))) - 1;
            q = i31 % 128;
            int i32 = i31 % 2;
            roster3.banks_name = this.sp_banks.getSelectedItem().toString();
            int i33 = q;
            int i34 = ((i33 & 60) + (i33 | 60)) - 1;
            p = i34 % 128;
            int i35 = i34 % 2;
            roster3.branch_code = 0;
            roster3.bank_address = this.et_easypaisa_number.getText().toString();
            roster3.account_title = this.et_account_title.getText().toString();
            Editable text = this.et_account_number.getText();
            int i36 = q;
            int i37 = ((i36 & (-86)) | ((~i36) & 85)) + ((i36 & 85) << 1);
            p = i37 % 128;
            if (i37 % 2 == 0) {
                roster3.account_number = text.toString();
                int i38 = 61 / 0;
            } else {
                roster3.account_number = text.toString();
            }
        }
        roster3.radioGroupCalendarId = this.radioGroupCalendar.getCheckedRadioButtonId();
        if (this.sp_relation_to_household.getSelectedItemPosition() != 0) {
            int i39 = p;
            int i40 = i39 & 11;
            int i41 = i40 + ((11 ^ i39) | i40);
            q = i41 % 128;
            int i42 = i41 % 2;
            roster3.relation_to_household_id = this.bu.get(this.sp_relation_to_household.getSelectedItemPosition()).getOptionId();
            ArrayList<Item> arrayList5 = this.bu;
            int i43 = q;
            int i44 = i43 ^ 125;
            int i45 = (i43 & 125) << 1;
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            p = i46 % 128;
            int i47 = i46 % 2;
            String option2 = arrayList5.get(this.sp_relation_to_household.getSelectedItemPosition()).getOption();
            int i48 = p;
            int i49 = i48 & 61;
            int i50 = ((((i48 ^ 61) | i49) << 1) - (~(-((i48 | 61) & (~i49))))) - 1;
            q = i50 % 128;
            int i51 = i50 % 2;
            roster3.relation_to_household_name = option2;
            if (this.bc && this.aN.relation_to_household_id == 186) {
                ag.g = false;
            }
            if (this.bu.get(this.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 186) {
                int i52 = q;
                int i53 = i52 & 77;
                int i54 = (i52 | 77) & (~i53);
                int i55 = -(-(i53 << 1));
                int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
                p = i56 % 128;
                int i57 = i56 % 2;
                ag.g = true;
            }
        } else {
            roster3.relation_to_household_id = 0;
            roster3.relation_to_household_name = BuildConfig.FLAVOR;
            if (this.bc) {
                int i58 = p;
                int i59 = (((i58 | 52) << 1) - (i58 ^ 52)) - 1;
                q = i59 % 128;
                if (i59 % 2 == 0 ? this.aN.relation_to_household_id == 186 : this.aN.relation_to_household_id == 8752) {
                    ag.g = false;
                }
            }
        }
        roster3.date_of_birth = this.tv_dob.getText().toString();
        roster3.date_of_birth_var = this.be;
        roster3.age_month = this.spinnerMonth.getSelectedItemPosition();
        roster3.age_year = this.spinnerYear.getSelectedItemPosition();
        Object obj = null;
        if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonMale.getId()) {
            roster3.gender = "male";
        } else if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonFemale.getId()) {
            int i60 = p;
            int i61 = (-2) - ((((i60 | 72) << 1) - (i60 ^ 72)) ^ (-1));
            q = i61 % 128;
            if (i61 % 2 != 0) {
                roster3.gender = "female";
                throw null;
            }
            roster3.gender = "female";
        } else if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonTrans.getId()) {
            roster3.gender = "transgender";
        } else {
            roster3.gender = BuildConfig.FLAVOR;
        }
        if (this.sp_marital_status.getSelectedItemPosition() != 0) {
            roster3.marital_status = this.bs.get(this.sp_marital_status.getSelectedItemPosition()).getOptionId();
            roster3.merital_status_name = this.bs.get(this.sp_marital_status.getSelectedItemPosition()).getOption();
        }
        int i62 = this.ac;
        try {
            if (i62 == 1) {
                if (ag.j == 1) {
                    if (this.aF) {
                    }
                } else if (this.aF) {
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.spinnerYear.getSelectedItemPosition());
                d = Double.parseDouble(sb.toString());
                int i63 = p;
                int i64 = ((i63 ^ 51) | (i63 & 51)) << 1;
                int i65 = -(((~i63) & 51) | (i63 & (-52)));
                i13 = (i64 & i65) + (i65 | i64);
                q = i13 % 128;
                if (i13 % 2 != 0) {
                    int i66 = 2 / 2;
                }
                if (d >= 18.0d) {
                    int i67 = q;
                    int i68 = i67 & 63;
                    int i69 = (((i67 | 63) & (~i68)) - (~(i68 << 1))) - 1;
                    p = i69 % 128;
                    int i70 = i69 % 2;
                    if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICNotMade.getId()) {
                        int i71 = q;
                        i12 = (((i71 | 77) << 1) - (~(-(i71 ^ 77)))) - 1;
                        p = i12 % 128;
                        if (i12 % 2 == 0) {
                            roster3.cnicOption = 1;
                        } else {
                            roster3.cnicOption = 0;
                        }
                    } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICAbsent.getId()) {
                        roster3.cnicOption = 1;
                    } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
                        roster3.cnicOption = 2;
                        roster3.cnic = this.et_RosterCNIC.getText().toString();
                        Editable text2 = this.et_RosterCNICRepeat.getText();
                        int i72 = q;
                        int i73 = ((i72 ^ 77) | (i72 & 77)) << 1;
                        int i74 = -(((~i72) & 77) | (i72 & (-78)));
                        int i75 = (i73 & i74) + (i74 | i73);
                        p = i75 % 128;
                        int i76 = i75 % 2;
                        roster3.cnicRepeat = text2.toString();
                        int i77 = q;
                        int i78 = i77 ^ 9;
                        int i79 = (((i77 & 9) | i78) << 1) - i78;
                        p = i79 % 128;
                        int i80 = i79 % 2;
                    } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
                        int i81 = p;
                        int i82 = i81 & 105;
                        int i83 = ((i81 ^ 105) | i82) << 1;
                        int i84 = -((i81 | 105) & (~i82));
                        int i85 = (i83 & i84) + (i84 | i83);
                        q = i85 % 128;
                        int i86 = i85 % 2;
                        roster3.cnicOption = 3;
                        roster3.cnic = this.et_RosterCNIC.getText().toString();
                        int i87 = q;
                        i11 = ((i87 & (-46)) | ((~i87) & 45)) + ((i87 & 45) << 1);
                        p = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i88 = 2 % 5;
                        }
                    } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId()) {
                        int i89 = q;
                        int i90 = i89 & 65;
                        int i91 = (i90 - (~((i89 ^ 65) | i90))) - 1;
                        p = i91 % 128;
                        int i92 = i91 % 2;
                        roster3.cnicOption = 4;
                        roster3.cnic = this.et_RosterCNIC.getText().toString();
                        int i93 = p;
                        i10 = ((i93 | 97) << 1) - (((~i93) & 97) | (i93 & (-98)));
                        q = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i94 = 2 / 2;
                        }
                    }
                    this.linearLayoutCNICPic.getVisibility();
                } else {
                    roster3.cnic = this.et_RosterCNIC.getText().toString();
                    roster3.cnicRepeat = this.et_RosterCNICRepeat.getText().toString();
                }
                if (this.sp_disability.getSelectedItemPosition() != 0) {
                    roster3.disability = this.bA.get(this.sp_disability.getSelectedItemPosition()).getOptionId();
                    i9 = (-2) - ((q + 22) ^ (-1));
                    p = i9 % 128;
                    if (i9 % 2 == 0) {
                        arrayList4 = this.bA;
                        selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
                        int i95 = 71 / 0;
                    } else {
                        arrayList4 = this.bA;
                        selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
                    }
                    roster3.disability_name = arrayList4.get(selectedItemPosition3).getOption();
                }
                if (this.sp_chronic_disease.getSelectedItemPosition() != 0) {
                    item = this.br.get(this.sp_chronic_disease.getSelectedItemPosition());
                    int i96 = p;
                    i8 = ((i96 | 101) << 1) - (i96 ^ 101);
                    q = i8 % 128;
                    if (i8 % 2 != 0) {
                        roster3.chronic_disease = item.getOptionId();
                        arrayList3 = this.br;
                        int i97 = 64 / 0;
                    } else {
                        roster3.chronic_disease = item.getOptionId();
                        arrayList3 = this.br;
                    }
                    roster3.chronic_disease_name = arrayList3.get(this.sp_chronic_disease.getSelectedItemPosition()).getOption();
                }
                if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_yes.getId()) {
                    int i98 = q + 71;
                    p = i98 % 128;
                    int i99 = i98 % 2;
                    roster3.language = 1;
                } else if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_no.getId()) {
                    int i100 = q;
                    int i101 = ((i100 | 75) << 1) - (i100 ^ 75);
                    p = i101 % 128;
                    int i102 = i101 % 2;
                    roster3.language = 0;
                    int i103 = q;
                    int i104 = i103 & 89;
                    int i105 = (((i103 | 89) & (~i104)) - (~(i104 << 1))) - 1;
                    p = i105 % 128;
                    int i106 = i105 % 2;
                }
                if (this.sp_attended_school.getVisibility() == 0) {
                    roster3.attended_school = this.bj.get(this.sp_attended_school.getSelectedItemPosition()).getOptionId();
                    int i107 = p;
                    int i108 = (i107 ^ 91) + ((i107 & 91) << 1);
                    q = i108 % 128;
                    int i109 = i108 % 2;
                    roster3.attended_school_name = this.bj.get(this.sp_attended_school.getSelectedItemPosition()).getOption();
                    int i110 = q;
                    int i111 = (i110 ^ 89) + ((i110 & 89) << 1);
                    p = i111 % 128;
                    int i112 = i111 % 2;
                }
                if (this.sp_highest_education.getVisibility() == 0) {
                    int i113 = p;
                    i7 = (i113 & 115) + (i113 | 115);
                    q = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i114 = 72 / 0;
                        if (this.sp_highest_education.getSelectedItemPosition() != 0) {
                            roster3.higher_education = this.aH.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
                            ArrayList<Item> arrayList6 = this.aH;
                            int i115 = p;
                            int i116 = ((i115 & (-80)) | ((~i115) & 79)) + ((i115 & 79) << 1);
                            q = i116 % 128;
                            int i117 = i116 % 2;
                            roster3.higher_education_name = arrayList6.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
                        }
                    } else if (this.sp_highest_education.getSelectedItemPosition() != 0) {
                        roster3.higher_education = this.aH.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
                        ArrayList<Item> arrayList7 = this.aH;
                        int i118 = p;
                        int i119 = ((i118 & (-80)) | ((~i118) & 79)) + ((i118 & 79) << 1);
                        q = i119 % 128;
                        int i1110 = i119 % 2;
                        roster3.higher_education_name = arrayList7.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
                    }
                }
                if (this.sp_work_activity.getVisibility() == 0) {
                    int i120 = q;
                    i5 = ((((i120 ^ 51) | (i120 & 51)) << 1) - (~(-((51 & (~i120)) | (i120 & (-52)))))) - 1;
                    p = i5 % 128;
                    if (i5 % 2 == 0) {
                        arrayList = this.aI;
                        selectedItemPosition = this.sp_work_activity.getSelectedItemPosition();
                        int i121 = 56 / 0;
                    } else {
                        arrayList = this.aI;
                        selectedItemPosition = this.sp_work_activity.getSelectedItemPosition();
                    }
                    roster3.work_activity = arrayList.get(selectedItemPosition).getOptionId();
                    arrayList2 = this.aI;
                    selectedItemPosition2 = this.sp_work_activity.getSelectedItemPosition();
                    int i122 = p;
                    i6 = (((i122 | 80) << 1) - (i122 ^ 80)) - 1;
                    q = i6 % 128;
                    if (i6 % 2 != 0) {
                        roster3.work_activity_name = arrayList2.get(selectedItemPosition2).getOption();
                        obj.hashCode();
                        throw null;
                    }
                    roster3.work_activity_name = arrayList2.get(selectedItemPosition2).getOption();
                }
                if (this.sp_employment_status.getVisibility() == 0) {
                    int i123 = p;
                    int i124 = i123 & 19;
                    int i125 = -(-(i123 | 19));
                    int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                    q = i126 % 128;
                    int i127 = i126 % 2;
                    if (this.sp_employment_status.getSelectedItemPosition() != 0) {
                        int i128 = q;
                        int i129 = i128 | 95;
                        int i130 = i129 << 1;
                        int i131 = -((~(i128 & 95)) & i129);
                        int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
                        p = i132 % 128;
                        int i133 = i132 % 2;
                        roster3.employment_status = this.aJ.get(this.sp_employment_status.getSelectedItemPosition()).getOptionId();
                        option = this.aJ.get(this.sp_employment_status.getSelectedItemPosition()).getOption();
                        int i134 = p;
                        int i135 = i134 & 99;
                        i4 = (i135 - (~((i134 ^ 99) | i135))) - 1;
                        q = i4 % 128;
                        if (i4 % 2 != 0) {
                            roster3.employment_status_name = option;
                            throw null;
                        }
                        roster3.employment_status_name = option;
                    }
                }
                if (this.et_hoursWorked.getVisibility() == 0) {
                    string = this.et_hoursWorked.getText().toString();
                    int i136 = q;
                    int i137 = i136 & 119;
                    i3 = ((i136 | 119) & (~i137)) + (i137 << 1);
                    p = i3 % 128;
                    if (i3 % 2 == 0) {
                        roster3.hours_worked = Double.parseDouble(string);
                        int i138 = 67 / 0;
                    } else {
                        roster3.hours_worked = Double.parseDouble(string);
                    }
                    int i139 = q;
                    int i140 = (i139 & 24) + (i139 | 24);
                    int i141 = (i140 ^ (-1)) + (i140 << 1);
                    p = i141 % 128;
                    int i142 = i141 % 2;
                }
                roster3.age = d;
                if (this.bc) {
                    roster = this.aO.get(this.aM);
                    int i143 = q;
                    int i144 = i143 & 87;
                    int i145 = -(-((i143 ^ 87) | i144));
                    i = ((i144 | i145) << 1) - (i145 ^ i144);
                    p = i % 128;
                    if (i % 2 == 0) {
                        roster3.roster_relational_id = roster.roster_relational_id;
                        obj.hashCode();
                        throw null;
                    }
                    roster3.roster_relational_id = roster.roster_relational_id;
                    roster3.rosterUniqueId = this.aO.get(this.aM).rosterUniqueId;
                    roster2 = this.aN;
                    int i146 = q;
                    int i147 = i146 | 59;
                    int i148 = i147 << 1;
                    int i149 = -((~(i146 & 59)) & i147);
                    i2 = ((i148 | i149) << 1) - (i149 ^ i148);
                    p = i2 % 128;
                    if (i2 % 2 == 0) {
                        roster3.start = roster2.start;
                        String str3 = roster2.end;
                        throw null;
                    }
                    roster3.start = roster2.start;
                    roster3.end = roster2.end;
                    roster3.diff = roster2.diff;
                } else {
                    roster3.roster_relational_id = this.aO.size() - (-1);
                    roster3.rosterUniqueId = UUID.randomUUID().toString();
                    String str4 = this.aS;
                    int i150 = p;
                    int i151 = ((i150 | 121) << 1) - (i150 ^ 121);
                    q = i151 % 128;
                    int i152 = i151 % 2;
                    roster3.start = str4;
                    String strE = ivas.gov.bisp.enumeration.p026az.z.e();
                    roster3.end = strE;
                    roster3.diff = ac.f(roster3.start, strE);
                }
                if (!BISPApplication.f()) {
                    int i153 = q;
                    int i154 = ((i153 ^ 103) - (~(-(-((i153 & 103) << 1))))) - 1;
                    p = i154 % 128;
                    int i155 = i154 % 2;
                    String strE2 = BISPApplication.e();
                    roster3.latitude = strE2.split(",")[0];
                    String[] strArrSplit = strE2.split(",");
                    int i156 = p;
                    int i157 = i156 & 63;
                    int i158 = ((i156 ^ 63) | i157) << 1;
                    int i159 = -((i156 | 63) & (~i157));
                    int i160 = ((i158 | i159) << 1) - (i159 ^ i158);
                    q = i160 % 128;
                    int i161 = i160 % 2;
                    roster3.longitude = strArrSplit[1];
                }
                intent = new Intent();
                if (this.bc) {
                    int i162 = p;
                    int i163 = i162 & 7;
                    int i164 = ((i162 ^ 7) | i163) << 1;
                    int i165 = -((i162 | 7) & (~i163));
                    int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
                    q = i166 % 128;
                    int i167 = i166 % 2;
                    intent.putExtra("household_age", this.ba);
                    int i168 = p;
                    int i169 = (((i168 | 115) << 1) - (~(-(((~i168) & 115) | (i168 & (-116)))))) - 1;
                    q = i169 % 128;
                    int i170 = i169 % 2;
                    intent.putExtra("position", this.aM);
                    int i171 = q + 15;
                    p = i171 % 128;
                    int i172 = i171 % 2;
                }
                intent.putExtra("roster", roster3);
                setResult(-1, intent);
                finish();
                int i173 = q;
                int i174 = i173 | 19;
                int i175 = i174 << 1;
                int i176 = -((~(i173 & 19)) & i174);
                int i177 = (i175 & i176) + (i176 | i175);
                p = i177 % 128;
                int i178 = i177 % 2;
            }
            int i179 = (-2) - ((q + 50) ^ (-1));
            p = i179 % 128;
            int i180 = i179 % 2;
            if (i62 == 2 || ag.d) {
                if (ag.j == 1 || !this.aF) {
                    if (this.aF) {
                    }
                }
            } else if (this.aF) {
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.spinnerYear.getSelectedItemPosition());
            d = Double.parseDouble(sb2.toString());
            int i610 = p;
            int i611 = ((i610 ^ 51) | (i610 & 51)) << 1;
            int i612 = -(((~i610) & 51) | (i610 & (-52)));
            i13 = (i611 & i612) + (i612 | i611);
            q = i13 % 128;
            if (i13 % 2 != 0) {
                int i613 = 2 / 2;
            }
            if (d >= 18.0d) {
                int i614 = q;
                int i615 = i614 & 63;
                int i616 = (((i614 | 63) & (~i615)) - (~(i615 << 1))) - 1;
                p = i616 % 128;
                int i710 = i616 % 2;
                if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICNotMade.getId()) {
                    int i711 = q;
                    i12 = (((i711 | 77) << 1) - (~(-(i711 ^ 77)))) - 1;
                    p = i12 % 128;
                    if (i12 % 2 == 0) {
                        roster3.cnicOption = 1;
                    } else {
                        roster3.cnicOption = 0;
                    }
                } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICAbsent.getId()) {
                    roster3.cnicOption = 1;
                } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
                    roster3.cnicOption = 2;
                    roster3.cnic = this.et_RosterCNIC.getText().toString();
                    Editable text3 = this.et_RosterCNICRepeat.getText();
                    int i712 = q;
                    int i713 = ((i712 ^ 77) | (i712 & 77)) << 1;
                    int i714 = -(((~i712) & 77) | (i712 & (-78)));
                    int i715 = (i713 & i714) + (i714 | i713);
                    p = i715 % 128;
                    int i716 = i715 % 2;
                    roster3.cnicRepeat = text3.toString();
                    int i717 = q;
                    int i718 = i717 ^ 9;
                    int i719 = (((i717 & 9) | i718) << 1) - i718;
                    p = i719 % 128;
                    int i810 = i719 % 2;
                } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
                    int i811 = p;
                    int i812 = i811 & 105;
                    int i813 = ((i811 ^ 105) | i812) << 1;
                    int i814 = -((i811 | 105) & (~i812));
                    int i815 = (i813 & i814) + (i814 | i813);
                    q = i815 % 128;
                    int i816 = i815 % 2;
                    roster3.cnicOption = 3;
                    roster3.cnic = this.et_RosterCNIC.getText().toString();
                    int i817 = q;
                    i11 = ((i817 & (-46)) | ((~i817) & 45)) + ((i817 & 45) << 1);
                    p = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i818 = 2 % 5;
                    }
                } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId()) {
                    int i819 = q;
                    int i910 = i819 & 65;
                    int i911 = (i910 - (~((i819 ^ 65) | i910))) - 1;
                    p = i911 % 128;
                    int i912 = i911 % 2;
                    roster3.cnicOption = 4;
                    roster3.cnic = this.et_RosterCNIC.getText().toString();
                    int i913 = p;
                    i10 = ((i913 | 97) << 1) - (((~i913) & 97) | (i913 & (-98)));
                    q = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i914 = 2 / 2;
                    }
                }
                this.linearLayoutCNICPic.getVisibility();
            } else {
                roster3.cnic = this.et_RosterCNIC.getText().toString();
                roster3.cnicRepeat = this.et_RosterCNICRepeat.getText().toString();
            }
            if (this.sp_disability.getSelectedItemPosition() != 0) {
                roster3.disability = this.bA.get(this.sp_disability.getSelectedItemPosition()).getOptionId();
                i9 = (-2) - ((q + 22) ^ (-1));
                p = i9 % 128;
                if (i9 % 2 == 0) {
                    arrayList4 = this.bA;
                    selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
                    int i915 = 71 / 0;
                } else {
                    arrayList4 = this.bA;
                    selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
                }
                roster3.disability_name = arrayList4.get(selectedItemPosition3).getOption();
            }
            if (this.sp_chronic_disease.getSelectedItemPosition() != 0) {
                item = this.br.get(this.sp_chronic_disease.getSelectedItemPosition());
                int i916 = p;
                i8 = ((i916 | 101) << 1) - (i916 ^ 101);
                q = i8 % 128;
                if (i8 % 2 != 0) {
                    roster3.chronic_disease = item.getOptionId();
                    arrayList3 = this.br;
                    int i917 = 64 / 0;
                } else {
                    roster3.chronic_disease = item.getOptionId();
                    arrayList3 = this.br;
                }
                roster3.chronic_disease_name = arrayList3.get(this.sp_chronic_disease.getSelectedItemPosition()).getOption();
            }
            if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_yes.getId()) {
                int i918 = q + 71;
                p = i918 % 128;
                int i919 = i918 % 2;
                roster3.language = 1;
            } else if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_no.getId()) {
                int i1010 = q;
                int i1011 = ((i1010 | 75) << 1) - (i1010 ^ 75);
                p = i1011 % 128;
                int i1012 = i1011 % 2;
                roster3.language = 0;
                int i1013 = q;
                int i1014 = i1013 & 89;
                int i1015 = (((i1013 | 89) & (~i1014)) - (~(i1014 << 1))) - 1;
                p = i1015 % 128;
                int i1016 = i1015 % 2;
            }
            if (this.sp_attended_school.getVisibility() == 0 && this.sp_attended_school.getSelectedItemPosition() != 0) {
                roster3.attended_school = this.bj.get(this.sp_attended_school.getSelectedItemPosition()).getOptionId();
                int i1017 = p;
                int i1018 = (i1017 ^ 91) + ((i1017 & 91) << 1);
                q = i1018 % 128;
                int i1019 = i1018 % 2;
                roster3.attended_school_name = this.bj.get(this.sp_attended_school.getSelectedItemPosition()).getOption();
                int i1111 = q;
                int i1112 = (i1111 ^ 89) + ((i1111 & 89) << 1);
                p = i1112 % 128;
                int i1113 = i1112 % 2;
            }
            if (this.sp_highest_education.getVisibility() == 0) {
                int i1114 = p;
                i7 = (i1114 & 115) + (i1114 | 115);
                q = i7 % 128;
                if (i7 % 2 != 0) {
                    int i1115 = 72 / 0;
                    if (this.sp_highest_education.getSelectedItemPosition() != 0) {
                        roster3.higher_education = this.aH.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
                        ArrayList<Item> arrayList8 = this.aH;
                        int i1116 = p;
                        int i1117 = ((i1116 & (-80)) | ((~i1116) & 79)) + ((i1116 & 79) << 1);
                        q = i1117 % 128;
                        int i1118 = i1117 % 2;
                        roster3.higher_education_name = arrayList8.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
                    }
                } else if (this.sp_highest_education.getSelectedItemPosition() != 0) {
                    roster3.higher_education = this.aH.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
                    ArrayList<Item> arrayList9 = this.aH;
                    int i1119 = p;
                    int i11110 = ((i1119 & (-80)) | ((~i1119) & 79)) + ((i1119 & 79) << 1);
                    q = i11110 % 128;
                    int i11111 = i11110 % 2;
                    roster3.higher_education_name = arrayList9.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
                }
            }
            if (this.sp_work_activity.getVisibility() == 0 && this.sp_work_activity.getSelectedItemPosition() != 0) {
                int i1210 = q;
                i5 = ((((i1210 ^ 51) | (i1210 & 51)) << 1) - (~(-((51 & (~i1210)) | (i1210 & (-52)))))) - 1;
                p = i5 % 128;
                if (i5 % 2 == 0) {
                    arrayList = this.aI;
                    selectedItemPosition = this.sp_work_activity.getSelectedItemPosition();
                    int i1211 = 56 / 0;
                } else {
                    arrayList = this.aI;
                    selectedItemPosition = this.sp_work_activity.getSelectedItemPosition();
                }
                roster3.work_activity = arrayList.get(selectedItemPosition).getOptionId();
                arrayList2 = this.aI;
                selectedItemPosition2 = this.sp_work_activity.getSelectedItemPosition();
                int i1212 = p;
                i6 = (((i1212 | 80) << 1) - (i1212 ^ 80)) - 1;
                q = i6 % 128;
                if (i6 % 2 != 0) {
                    roster3.work_activity_name = arrayList2.get(selectedItemPosition2).getOption();
                    obj.hashCode();
                    throw null;
                }
                roster3.work_activity_name = arrayList2.get(selectedItemPosition2).getOption();
            }
            if (this.sp_employment_status.getVisibility() == 0) {
                int i1213 = p;
                int i1214 = i1213 & 19;
                int i1215 = -(-(i1213 | 19));
                int i1216 = (i1214 ^ i1215) + ((i1215 & i1214) << 1);
                q = i1216 % 128;
                int i1217 = i1216 % 2;
                if (this.sp_employment_status.getSelectedItemPosition() != 0) {
                    int i1218 = q;
                    int i1219 = i1218 | 95;
                    int i1310 = i1219 << 1;
                    int i1311 = -((~(i1218 & 95)) & i1219);
                    int i1312 = ((i1310 | i1311) << 1) - (i1311 ^ i1310);
                    p = i1312 % 128;
                    int i1313 = i1312 % 2;
                    roster3.employment_status = this.aJ.get(this.sp_employment_status.getSelectedItemPosition()).getOptionId();
                    option = this.aJ.get(this.sp_employment_status.getSelectedItemPosition()).getOption();
                    int i1314 = p;
                    int i1315 = i1314 & 99;
                    i4 = (i1315 - (~((i1314 ^ 99) | i1315))) - 1;
                    q = i4 % 128;
                    if (i4 % 2 != 0) {
                        roster3.employment_status_name = option;
                        throw null;
                    }
                    roster3.employment_status_name = option;
                }
            }
            if (this.et_hoursWorked.getVisibility() == 0) {
                string = this.et_hoursWorked.getText().toString();
                int i1316 = q;
                int i1317 = i1316 & 119;
                i3 = ((i1316 | 119) & (~i1317)) + (i1317 << 1);
                p = i3 % 128;
                if (i3 % 2 == 0) {
                    roster3.hours_worked = Double.parseDouble(string);
                    int i1318 = 67 / 0;
                } else {
                    roster3.hours_worked = Double.parseDouble(string);
                }
                int i1319 = q;
                int i1410 = (i1319 & 24) + (i1319 | 24);
                int i1411 = (i1410 ^ (-1)) + (i1410 << 1);
                p = i1411 % 128;
                int i1412 = i1411 % 2;
            }
            roster3.age = d;
            if (this.bc) {
                roster = this.aO.get(this.aM);
                int i1413 = q;
                int i1414 = i1413 & 87;
                int i1415 = -(-((i1413 ^ 87) | i1414));
                i = ((i1414 | i1415) << 1) - (i1415 ^ i1414);
                p = i % 128;
                if (i % 2 == 0) {
                    roster3.roster_relational_id = roster.roster_relational_id;
                    obj.hashCode();
                    throw null;
                }
                roster3.roster_relational_id = roster.roster_relational_id;
                roster3.rosterUniqueId = this.aO.get(this.aM).rosterUniqueId;
                roster2 = this.aN;
                int i1416 = q;
                int i1417 = i1416 | 59;
                int i1418 = i1417 << 1;
                int i1419 = -((~(i1416 & 59)) & i1417);
                i2 = ((i1418 | i1419) << 1) - (i1419 ^ i1418);
                p = i2 % 128;
                if (i2 % 2 == 0) {
                    roster3.start = roster2.start;
                    String str5 = roster2.end;
                    throw null;
                }
                roster3.start = roster2.start;
                roster3.end = roster2.end;
                roster3.diff = roster2.diff;
            } else {
                roster3.roster_relational_id = this.aO.size() - (-1);
                roster3.rosterUniqueId = UUID.randomUUID().toString();
                String str6 = this.aS;
                int i1510 = p;
                int i1511 = ((i1510 | 121) << 1) - (i1510 ^ 121);
                q = i1511 % 128;
                int i1512 = i1511 % 2;
                roster3.start = str6;
                String strE3 = ivas.gov.bisp.enumeration.p026az.z.e();
                roster3.end = strE3;
                roster3.diff = ac.f(roster3.start, strE3);
            }
            if (!BISPApplication.f()) {
                int i1513 = q;
                int i1514 = ((i1513 ^ 103) - (~(-(-((i1513 & 103) << 1))))) - 1;
                p = i1514 % 128;
                int i1515 = i1514 % 2;
                String strE4 = BISPApplication.e();
                roster3.latitude = strE4.split(",")[0];
                String[] strArrSplit2 = strE4.split(",");
                int i1516 = p;
                int i1517 = i1516 & 63;
                int i1518 = ((i1516 ^ 63) | i1517) << 1;
                int i1519 = -((i1516 | 63) & (~i1517));
                int i1610 = ((i1518 | i1519) << 1) - (i1519 ^ i1518);
                q = i1610 % 128;
                int i1611 = i1610 % 2;
                roster3.longitude = strArrSplit2[1];
            }
            intent = new Intent();
            if (this.bc) {
                int i1612 = p;
                int i1613 = i1612 & 7;
                int i1614 = ((i1612 ^ 7) | i1613) << 1;
                int i1615 = -((i1612 | 7) & (~i1613));
                int i1616 = ((i1614 | i1615) << 1) - (i1615 ^ i1614);
                q = i1616 % 128;
                int i1617 = i1616 % 2;
                intent.putExtra("household_age", this.ba);
                int i1618 = p;
                int i1619 = (((i1618 | 115) << 1) - (~(-(((~i1618) & 115) | (i1618 & (-116)))))) - 1;
                q = i1619 % 128;
                int i1710 = i1619 % 2;
                intent.putExtra("position", this.aM);
                int i1711 = q + 15;
                p = i1711 % 128;
                int i1712 = i1711 % 2;
            }
            intent.putExtra("roster", roster3);
            setResult(-1, intent);
            finish();
            int i1713 = q;
            int i1714 = i1713 | 19;
            int i1715 = i1714 << 1;
            int i1716 = -((~(i1713 & 19)) & i1714);
            int i1717 = (i1715 & i1716) + (i1716 | i1715);
            p = i1717 % 128;
            int i1718 = i1717 % 2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.spinnerYear.getSelectedItemPosition());
            d = Double.parseDouble(sb3.toString());
            int i617 = p;
            int i618 = ((i617 ^ 51) | (i617 & 51)) << 1;
            int i619 = -(((~i617) & 51) | (i617 & (-52)));
            i13 = (i618 & i619) + (i619 | i618);
            q = i13 % 128;
            if (i13 % 2 != 0) {
                int i6110 = 2 / 2;
            }
        } catch (Exception unused) {
            d = 0.0d;
        }
        if (this.checkBoxBispBenif.isChecked()) {
            int i181 = q + 59;
            p = i181 % 128;
            if (i181 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = "yes";
        } else {
            str = "no";
        }
        roster3.isBispBenif = str;
        if (d >= 18.0d) {
            int i6111 = q;
            int i6112 = i6111 & 63;
            int i6113 = (((i6111 | 63) & (~i6112)) - (~(i6112 << 1))) - 1;
            p = i6113 % 128;
            int i7110 = i6113 % 2;
            if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICNotMade.getId()) {
                int i7111 = q;
                i12 = (((i7111 | 77) << 1) - (~(-(i7111 ^ 77)))) - 1;
                p = i12 % 128;
                if (i12 % 2 == 0) {
                    roster3.cnicOption = 1;
                } else {
                    roster3.cnicOption = 0;
                }
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICAbsent.getId()) {
                roster3.cnicOption = 1;
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
                roster3.cnicOption = 2;
                roster3.cnic = this.et_RosterCNIC.getText().toString();
                Editable text4 = this.et_RosterCNICRepeat.getText();
                int i7112 = q;
                int i7113 = ((i7112 ^ 77) | (i7112 & 77)) << 1;
                int i7114 = -(((~i7112) & 77) | (i7112 & (-78)));
                int i7115 = (i7113 & i7114) + (i7114 | i7113);
                p = i7115 % 128;
                int i7116 = i7115 % 2;
                roster3.cnicRepeat = text4.toString();
                int i7117 = q;
                int i7118 = i7117 ^ 9;
                int i7119 = (((i7117 & 9) | i7118) << 1) - i7118;
                p = i7119 % 128;
                int i8110 = i7119 % 2;
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
                int i8111 = p;
                int i8112 = i8111 & 105;
                int i8113 = ((i8111 ^ 105) | i8112) << 1;
                int i8114 = -((i8111 | 105) & (~i8112));
                int i8115 = (i8113 & i8114) + (i8114 | i8113);
                q = i8115 % 128;
                int i8116 = i8115 % 2;
                roster3.cnicOption = 3;
                roster3.cnic = this.et_RosterCNIC.getText().toString();
                int i8117 = q;
                i11 = ((i8117 & (-46)) | ((~i8117) & 45)) + ((i8117 & 45) << 1);
                p = i11 % 128;
                if (i11 % 2 == 0) {
                    int i8118 = 2 % 5;
                }
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId()) {
                int i8119 = q;
                int i9110 = i8119 & 65;
                int i9111 = (i9110 - (~((i8119 ^ 65) | i9110))) - 1;
                p = i9111 % 128;
                int i9112 = i9111 % 2;
                roster3.cnicOption = 4;
                roster3.cnic = this.et_RosterCNIC.getText().toString();
                int i9113 = p;
                i10 = ((i9113 | 97) << 1) - (((~i9113) & 97) | (i9113 & (-98)));
                q = i10 % 128;
                if (i10 % 2 != 0) {
                    int i9114 = 2 / 2;
                }
            }
            this.linearLayoutCNICPic.getVisibility();
        } else {
            roster3.cnic = this.et_RosterCNIC.getText().toString();
            roster3.cnicRepeat = this.et_RosterCNICRepeat.getText().toString();
        }
        if (this.sp_disability.getSelectedItemPosition() != 0) {
            roster3.disability = this.bA.get(this.sp_disability.getSelectedItemPosition()).getOptionId();
            i9 = (-2) - ((q + 22) ^ (-1));
            p = i9 % 128;
            if (i9 % 2 == 0) {
                arrayList4 = this.bA;
                selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
                int i9115 = 71 / 0;
            } else {
                arrayList4 = this.bA;
                selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
            }
            roster3.disability_name = arrayList4.get(selectedItemPosition3).getOption();
        }
        if (this.sp_chronic_disease.getSelectedItemPosition() != 0) {
            item = this.br.get(this.sp_chronic_disease.getSelectedItemPosition());
            int i9116 = p;
            i8 = ((i9116 | 101) << 1) - (i9116 ^ 101);
            q = i8 % 128;
            if (i8 % 2 != 0) {
                roster3.chronic_disease = item.getOptionId();
                arrayList3 = this.br;
                int i9117 = 64 / 0;
            } else {
                roster3.chronic_disease = item.getOptionId();
                arrayList3 = this.br;
            }
            roster3.chronic_disease_name = arrayList3.get(this.sp_chronic_disease.getSelectedItemPosition()).getOption();
        }
        if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_yes.getId()) {
            int i9118 = q + 71;
            p = i9118 % 128;
            int i9119 = i9118 % 2;
            roster3.language = 1;
        } else if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_no.getId()) {
            int i10110 = q;
            int i10111 = ((i10110 | 75) << 1) - (i10110 ^ 75);
            p = i10111 % 128;
            int i10112 = i10111 % 2;
            roster3.language = 0;
            int i10113 = q;
            int i10114 = i10113 & 89;
            int i10115 = (((i10113 | 89) & (~i10114)) - (~(i10114 << 1))) - 1;
            p = i10115 % 128;
            int i10116 = i10115 % 2;
        }
        if (this.sp_attended_school.getVisibility() == 0) {
            roster3.attended_school = this.bj.get(this.sp_attended_school.getSelectedItemPosition()).getOptionId();
            int i10117 = p;
            int i10118 = (i10117 ^ 91) + ((i10117 & 91) << 1);
            q = i10118 % 128;
            int i10119 = i10118 % 2;
            roster3.attended_school_name = this.bj.get(this.sp_attended_school.getSelectedItemPosition()).getOption();
            int i11112 = q;
            int i11113 = (i11112 ^ 89) + ((i11112 & 89) << 1);
            p = i11113 % 128;
            int i11114 = i11113 % 2;
        }
        if (this.sp_highest_education.getVisibility() == 0) {
            int i11115 = p;
            i7 = (i11115 & 115) + (i11115 | 115);
            q = i7 % 128;
            if (i7 % 2 != 0) {
                int i11116 = 72 / 0;
                if (this.sp_highest_education.getSelectedItemPosition() != 0) {
                    roster3.higher_education = this.aH.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
                    ArrayList<Item> arrayList10 = this.aH;
                    int i11117 = p;
                    int i11118 = ((i11117 & (-80)) | ((~i11117) & 79)) + ((i11117 & 79) << 1);
                    q = i11118 % 128;
                    int i11119 = i11118 % 2;
                    roster3.higher_education_name = arrayList10.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
                }
            } else if (this.sp_highest_education.getSelectedItemPosition() != 0) {
                roster3.higher_education = this.aH.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
                ArrayList<Item> arrayList11 = this.aH;
                int i111110 = p;
                int i111111 = ((i111110 & (-80)) | ((~i111110) & 79)) + ((i111110 & 79) << 1);
                q = i111111 % 128;
                int i111112 = i111111 % 2;
                roster3.higher_education_name = arrayList11.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
            }
        }
        if (this.sp_work_activity.getVisibility() == 0) {
            int i12110 = q;
            i5 = ((((i12110 ^ 51) | (i12110 & 51)) << 1) - (~(-((51 & (~i12110)) | (i12110 & (-52)))))) - 1;
            p = i5 % 128;
            if (i5 % 2 == 0) {
                arrayList = this.aI;
                selectedItemPosition = this.sp_work_activity.getSelectedItemPosition();
                int i12111 = 56 / 0;
            } else {
                arrayList = this.aI;
                selectedItemPosition = this.sp_work_activity.getSelectedItemPosition();
            }
            roster3.work_activity = arrayList.get(selectedItemPosition).getOptionId();
            arrayList2 = this.aI;
            selectedItemPosition2 = this.sp_work_activity.getSelectedItemPosition();
            int i12112 = p;
            i6 = (((i12112 | 80) << 1) - (i12112 ^ 80)) - 1;
            q = i6 % 128;
            if (i6 % 2 != 0) {
                roster3.work_activity_name = arrayList2.get(selectedItemPosition2).getOption();
                obj.hashCode();
                throw null;
            }
            roster3.work_activity_name = arrayList2.get(selectedItemPosition2).getOption();
        }
        if (this.sp_employment_status.getVisibility() == 0) {
            int i12113 = p;
            int i12114 = i12113 & 19;
            int i12115 = -(-(i12113 | 19));
            int i12116 = (i12114 ^ i12115) + ((i12115 & i12114) << 1);
            q = i12116 % 128;
            int i12117 = i12116 % 2;
            if (this.sp_employment_status.getSelectedItemPosition() != 0) {
                int i12118 = q;
                int i12119 = i12118 | 95;
                int i13110 = i12119 << 1;
                int i13111 = -((~(i12118 & 95)) & i12119);
                int i13112 = ((i13110 | i13111) << 1) - (i13111 ^ i13110);
                p = i13112 % 128;
                int i13113 = i13112 % 2;
                roster3.employment_status = this.aJ.get(this.sp_employment_status.getSelectedItemPosition()).getOptionId();
                option = this.aJ.get(this.sp_employment_status.getSelectedItemPosition()).getOption();
                int i13114 = p;
                int i13115 = i13114 & 99;
                i4 = (i13115 - (~((i13114 ^ 99) | i13115))) - 1;
                q = i4 % 128;
                if (i4 % 2 != 0) {
                    roster3.employment_status_name = option;
                    throw null;
                }
                roster3.employment_status_name = option;
            }
        }
        if (this.et_hoursWorked.getVisibility() == 0) {
            string = this.et_hoursWorked.getText().toString();
            int i13116 = q;
            int i13117 = i13116 & 119;
            i3 = ((i13116 | 119) & (~i13117)) + (i13117 << 1);
            p = i3 % 128;
            if (i3 % 2 == 0) {
                roster3.hours_worked = Double.parseDouble(string);
                int i13118 = 67 / 0;
            } else {
                roster3.hours_worked = Double.parseDouble(string);
            }
            int i13119 = q;
            int i14110 = (i13119 & 24) + (i13119 | 24);
            int i14111 = (i14110 ^ (-1)) + (i14110 << 1);
            p = i14111 % 128;
            int i14112 = i14111 % 2;
        }
        roster3.age = d;
        if (this.bc) {
            roster = this.aO.get(this.aM);
            int i14113 = q;
            int i14114 = i14113 & 87;
            int i14115 = -(-((i14113 ^ 87) | i14114));
            i = ((i14114 | i14115) << 1) - (i14115 ^ i14114);
            p = i % 128;
            if (i % 2 == 0) {
                roster3.roster_relational_id = roster.roster_relational_id;
                obj.hashCode();
                throw null;
            }
            roster3.roster_relational_id = roster.roster_relational_id;
            roster3.rosterUniqueId = this.aO.get(this.aM).rosterUniqueId;
            roster2 = this.aN;
            int i14116 = q;
            int i14117 = i14116 | 59;
            int i14118 = i14117 << 1;
            int i14119 = -((~(i14116 & 59)) & i14117);
            i2 = ((i14118 | i14119) << 1) - (i14119 ^ i14118);
            p = i2 % 128;
            if (i2 % 2 == 0) {
                roster3.start = roster2.start;
                String str7 = roster2.end;
                throw null;
            }
            roster3.start = roster2.start;
            roster3.end = roster2.end;
            roster3.diff = roster2.diff;
        } else {
            roster3.roster_relational_id = this.aO.size() - (-1);
            roster3.rosterUniqueId = UUID.randomUUID().toString();
            String str8 = this.aS;
            int i15110 = p;
            int i15111 = ((i15110 | 121) << 1) - (i15110 ^ 121);
            q = i15111 % 128;
            int i15112 = i15111 % 2;
            roster3.start = str8;
            String strE5 = ivas.gov.bisp.enumeration.p026az.z.e();
            roster3.end = strE5;
            roster3.diff = ac.f(roster3.start, strE5);
        }
        if (!BISPApplication.f()) {
            int i15113 = q;
            int i15114 = ((i15113 ^ 103) - (~(-(-((i15113 & 103) << 1))))) - 1;
            p = i15114 % 128;
            int i15115 = i15114 % 2;
            String strE6 = BISPApplication.e();
            roster3.latitude = strE6.split(",")[0];
            String[] strArrSplit3 = strE6.split(",");
            int i15116 = p;
            int i15117 = i15116 & 63;
            int i15118 = ((i15116 ^ 63) | i15117) << 1;
            int i15119 = -((i15116 | 63) & (~i15117));
            int i16110 = ((i15118 | i15119) << 1) - (i15119 ^ i15118);
            q = i16110 % 128;
            int i16111 = i16110 % 2;
            roster3.longitude = strArrSplit3[1];
        }
        intent = new Intent();
        if (this.bc) {
            int i16112 = p;
            int i16113 = i16112 & 7;
            int i16114 = ((i16112 ^ 7) | i16113) << 1;
            int i16115 = -((i16112 | 7) & (~i16113));
            int i16116 = ((i16114 | i16115) << 1) - (i16115 ^ i16114);
            q = i16116 % 128;
            int i16117 = i16116 % 2;
            intent.putExtra("household_age", this.ba);
            int i16118 = p;
            int i16119 = (((i16118 | 115) << 1) - (~(-(((~i16118) & 115) | (i16118 & (-116)))))) - 1;
            q = i16119 % 128;
            int i1719 = i16119 % 2;
            intent.putExtra("position", this.aM);
            int i17110 = q + 15;
            p = i17110 % 128;
            int i17111 = i17110 % 2;
        }
        intent.putExtra("roster", roster3);
        setResult(-1, intent);
        finish();
        int i17112 = q;
        int i17113 = i17112 | 19;
        int i17114 = i17113 << 1;
        int i17115 = -((~(i17112 & 19)) & i17113);
        int i17116 = (i17114 & i17115) + (i17115 | i17114);
        p = i17116 % 128;
        int i17117 = i17116 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x0350  */
    public void N() {
        Spinner spinner;
        int i;
        Button button;
        int i2;
        Spinner spinner2;
        boolean z;
        int i3 = 2 % 2;
        int intExtra = getIntent().getIntExtra("rosterPosition", -1);
        this.aM = intExtra;
        int i4 = q;
        int i5 = i4 & 11;
        int i6 = (((i4 ^ 11) | i5) << 1) - ((~i5) & (i4 | 11));
        p = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (intExtra != -1) {
            int i7 = i4 & 1;
            int i8 = -(-((i4 ^ 1) | i7));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            p = i9 % 128;
            if (i9 % 2 == 0) {
                this.aQ = this.aN.age;
                obj.hashCode();
                throw null;
            }
            double d = this.aN.age;
            this.aQ = d;
            P(d);
            this.radioGroupCalendar.check(R.id.rb_calendar_yes);
            if (this.aN.age >= 4.0d) {
                int i10 = p;
                int i11 = (i10 | 119) << 1;
                int i12 = -(((~i10) & 119) | (i10 & (-120)));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                q = i13 % 128;
                if (i13 % 2 != 0) {
                    this.sp_attended_school.setVisibility(1);
                } else {
                    this.sp_attended_school.setVisibility(0);
                }
                int i14 = this.aN.attended_school;
                int i15 = p - (-1);
                int i16 = i15 % 128;
                q = i16;
                int i17 = i15 % 2;
                if (i14 != 0) {
                    int i18 = (((i16 | 109) << 1) - (~(-(((~i16) & 109) | (i16 & (-110)))))) - 1;
                    p = i18 % 128;
                    if (i18 % 2 != 0 ? i14 != 25 : i14 != 78) {
                        this.sp_highest_education.setVisibility(0);
                    }
                } else {
                    this.sp_attended_school.setVisibility(8);
                    spinner = this.sp_highest_education;
                    int i19 = q;
                    int i20 = (i19 ^ 16) + ((i19 & 16) << 1);
                    i = (i20 ^ (-1)) + (i20 << 1);
                    p = i % 128;
                    if (i % 2 == 0) {
                        spinner.setVisibility(42);
                    } else {
                        spinner.setVisibility(8);
                    }
                }
            } else {
                this.sp_attended_school.setVisibility(8);
                spinner = this.sp_highest_education;
                int i110 = q;
                int i21 = (i110 ^ 16) + ((i110 & 16) << 1);
                i = (i21 ^ (-1)) + (i21 << 1);
                p = i % 128;
                if (i % 2 == 0) {
                    spinner.setVisibility(42);
                } else {
                    spinner.setVisibility(8);
                }
            }
            this.tv_dob.setText(this.aN.date_of_birth);
            this.et_mobile_number.setText(this.aN.mobile_no);
            Roster roster = this.aN;
            int i22 = p + 85;
            q = i22 % 128;
            if (i22 % 2 != 0) {
                this.be = roster.date_of_birth_var;
                this.et_MemberName.setText(roster.name_of_member);
                throw null;
            }
            this.be = roster.date_of_birth_var;
            this.et_MemberName.setText(roster.name_of_member);
            if (this.bu != null) {
                int i23 = q;
                int i24 = (((i23 | 6) << 1) - (i23 ^ 6)) - 1;
                p = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 0;
                while (true) {
                    if (i26 >= this.bu.size()) {
                        i26 = 0;
                        break;
                    }
                    int i27 = q;
                    int i28 = (i27 ^ 25) + ((i27 & 25) << 1);
                    p = i28 % 128;
                    if (i28 % 2 == 0) {
                        this.bu.get(i26);
                        obj.hashCode();
                        throw null;
                    }
                    if (this.bu.get(i26).getOptionId() == this.aN.relation_to_household_id) {
                        break;
                    }
                    int i29 = q;
                    int i30 = i29 & 33;
                    int i31 = -(-((i29 ^ 33) | i30));
                    int i32 = (i30 & i31) + (i31 | i30);
                    p = i32 % 128;
                    int i33 = i32 % 2;
                    i26 = (i26 & (-34)) + (i26 | (-34)) + 35;
                }
                this.sp_relation_to_household.setSelection(i26);
            }
            if (!(!this.aN.gender.equals("male"))) {
                int i34 = (-2) - ((q + 48) ^ (-1));
                p = i34 % 128;
                if (i34 % 2 == 0) {
                    this.radioButtonMale.setChecked(true);
                    this.radioButtonFemale.setChecked(true);
                } else {
                    this.radioButtonMale.setChecked(true);
                    this.radioButtonFemale.setChecked(false);
                }
                this.radioButtonTrans.setChecked(false);
            } else if (this.aN.gender.equals("female")) {
                this.radioButtonMale.setChecked(false);
                RadioButton radioButton = this.radioButtonFemale;
                int i35 = q;
                int i36 = i35 | 21;
                int i37 = i36 << 1;
                int i38 = -((~(i35 & 21)) & i36);
                int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                p = i39 % 128;
                int i40 = i39 % 2;
                radioButton.setChecked(true);
                this.radioButtonTrans.setChecked(false);
            } else if (!(!this.aN.gender.equals("trans"))) {
                int i41 = q;
                int i42 = i41 & 79;
                int i43 = i41 | 79;
                int i44 = (i42 & i43) + (i43 | i42);
                p = i44 % 128;
                int i45 = i44 % 2;
                this.radioButtonMale.setChecked(false);
                this.radioButtonFemale.setChecked(false);
                this.radioButtonTrans.setChecked(true);
            }
            int i46 = 0;
            while (true) {
                if (i46 >= this.bs.size()) {
                    i46 = 0;
                    break;
                } else {
                    if (this.bs.get(i46).getOptionId() == this.aN.marital_status) {
                        break;
                    }
                    int i47 = i46 & 1;
                    i46 = ((i46 | 1) & (~i47)) + (i47 << 1);
                }
            }
            this.sp_marital_status.setSelection(i46);
            CheckBox checkBox = this.checkBoxBispBenif;
            Roster roster2 = this.aN;
            int i48 = q;
            int i49 = (((i48 | 118) << 1) - (i48 ^ 118)) - 1;
            p = i49 % 128;
            int i50 = i49 % 2;
            checkBox.setChecked(roster2.isBispBenif.equals("yes"));
            Roster roster3 = this.aN;
            int i51 = q;
            int i52 = (i51 & 87) + (i51 | 87);
            p = i52 % 128;
            if (i52 % 2 == 0) {
                int i53 = roster3.cnicOption;
                throw null;
            }
            int i54 = roster3.cnicOption;
            if (i54 == 0) {
                int i55 = p;
                int i56 = (i55 | 49) << 1;
                int i57 = -(((~i55) & 49) | (i55 & (-50)));
                int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                q = i58 % 128;
                int i59 = i58 % 2;
                this.radioButtonCNICNotMade.setChecked(true);
            } else if (i54 == 1) {
                this.radioButtonCNICAbsent.setChecked(true);
            } else if (i54 == 2) {
                this.et_RosterCNIC.setText(roster3.cnic);
                int i60 = q;
                int i61 = ((i60 ^ 39) - (~(-(-((i60 & 39) << 1))))) - 1;
                p = i61 % 128;
                if (i61 % 2 == 0) {
                    String str = this.aN.cnicRepeat;
                    throw null;
                }
                EditText editText = this.et_RosterCNICRepeat;
                String str2 = this.aN.cnicRepeat;
                int i62 = q + 64;
                int i63 = (i62 ^ (-1)) + (i62 << 1);
                p = i63 % 128;
                int i64 = i63 % 2;
                editText.setText(str2);
                this.radioButtonCNICPresent.setChecked(true);
                boolean zBooleanValue = this.aN.cnic_valid.booleanValue();
                int i65 = p;
                int i66 = i65 & 101;
                int i67 = i66 + ((i65 ^ 101) | i66);
                q = i67 % 128;
                int i68 = i67 % 2;
                this.by = zBooleanValue;
            } else if (i54 == 3) {
                int i69 = p + 100;
                int i70 = (i69 ^ (-1)) + (i69 << 1);
                q = i70 % 128;
                int i71 = i70 % 2;
                this.rb_afghani_acc.setChecked(true);
                this.por_roster.setVisibility(0);
                int i72 = q;
                int i73 = ((i72 & 114) + (i72 | 114)) - 1;
                p = i73 % 128;
                if (i73 % 2 == 0) {
                    this.btn_vald_cnic.setVisibility(125);
                    button = this.buttonScanCNIC;
                    i2 = 67;
                } else {
                    this.btn_vald_cnic.setVisibility(8);
                    button = this.buttonScanCNIC;
                    i2 = 8;
                }
                button.setVisibility(i2);
                this.btn_bio_cnic.setVisibility(8);
                this.por_roster.setText(this.aN.cnic);
                Roster roster4 = this.aN;
                int i74 = p;
                int i75 = i74 ^ 103;
                int i76 = -(-((i74 & 103) << 1));
                int i77 = (i75 & i76) + (i76 | i75);
                q = i77 % 128;
                if (i77 % 2 != 0) {
                    this.bt = roster4.cnic_valid.booleanValue();
                    int i78 = 54 / 0;
                    if (ax.c(this)) {
                        this.btn_vald_cnic.setEnabled(true);
                    }
                } else {
                    this.bt = roster4.cnic_valid.booleanValue();
                    if (ax.c(this)) {
                        this.btn_vald_cnic.setEnabled(true);
                    }
                }
                this.et_RosterCNIC.setVisibility(8);
                EditText editText2 = this.et_RosterCNICRepeat;
                int i79 = q;
                int i80 = (i79 ^ 33) + ((i79 & 33) << 1);
                p = i80 % 128;
                if (i80 % 2 == 0) {
                    editText2.setVisibility(8);
                } else {
                    editText2.setVisibility(8);
                }
                this.buttonScanCNIC.setEnabled(false);
                Button button2 = this.btn_bio_cnic;
                int i81 = q;
                int i82 = i81 & 37;
                int i83 = -(-((i81 ^ 37) | i82));
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                p = i84 % 128;
                int i85 = i84 % 2;
                button2.setEnabled(false);
                int i86 = q + 25;
                p = i86 % 128;
                int i87 = i86 % 2;
            } else if (i54 == 4) {
                this.rb_afghani_por.setChecked(true);
                this.por_roster.setVisibility(0);
                this.btn_vald_cnic.setVisibility(8);
                this.buttonScanCNIC.setVisibility(8);
                this.btn_bio_cnic.setVisibility(8);
                EditText editText3 = this.por_roster;
                Roster roster5 = this.aN;
                int i88 = p;
                int i89 = (i88 & (-84)) | ((~i88) & 83);
                int i90 = -(-((i88 & 83) << 1));
                int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
                q = i91 % 128;
                int i92 = i91 % 2;
                editText3.setText(roster5.cnic);
                Roster roster6 = this.aN;
                int i93 = q;
                int i94 = ((i93 | 25) << 1) - (25 ^ i93);
                p = i94 % 128;
                int i95 = i94 % 2;
                this.bt = roster6.cnic_valid.booleanValue();
                if (ax.c(this)) {
                    this.btn_vald_cnic.setEnabled(true);
                }
                this.et_RosterCNIC.setVisibility(8);
                this.et_RosterCNICRepeat.setVisibility(8);
                this.buttonScanCNIC.setEnabled(false);
                this.btn_bio_cnic.setEnabled(false);
            }
            this.et_RosterBForm.setText(this.aN.bform);
            int i96 = p;
            int i97 = i96 & 89;
            int i98 = (i96 ^ 89) | i97;
            int i99 = (i97 & i98) + (i98 | i97);
            q = i99 % 128;
            if (i99 % 2 != 0) {
                this.et_RosterBFormRepeat.setText(this.aN.bformRepeat);
                int i100 = 67 / 0;
            } else {
                this.et_RosterBFormRepeat.setText(this.aN.bformRepeat);
            }
            int i101 = q + 19;
            int i102 = i101 % 128;
            p = i102;
            int i103 = i101 % 2;
            int i104 = i102 + 37;
            q = i104 % 128;
            int i105 = i104 % 2;
            int i106 = 0;
            while (true) {
                if (i106 >= this.bA.size()) {
                    i106 = 0;
                    break;
                }
                int i107 = p;
                int i108 = i107 & 21;
                int i109 = (i107 | 21) & (~i108);
                int i111 = -(-(i108 << 1));
                int i112 = (i109 & i111) + (i109 | i111);
                q = i112 % 128;
                if (i112 % 2 != 0) {
                    this.bA.get(i106);
                    throw null;
                }
                if (this.bA.get(i106).getOptionId() == this.aN.disability) {
                    break;
                } else {
                    i106 = (i106 | 1) + (i106 & 1);
                }
            }
            this.sp_disability.setSelection(i106);
            int i113 = 0;
            while (true) {
                if (i113 >= this.br.size()) {
                    i113 = 0;
                    break;
                }
                int i114 = p;
                int i115 = i114 ^ 51;
                int i116 = -(-((i114 & 51) << 1));
                int i117 = (i115 & i116) + (i116 | i115);
                q = i117 % 128;
                int i118 = i117 % 2;
                if (this.br.get(i113).getOptionId() == this.aN.chronic_disease) {
                    break;
                } else {
                    i113++;
                }
            }
            this.sp_chronic_disease.setSelection(i113);
            int i119 = this.aN.language;
            if (i119 == 0) {
                this.radioButtonLanguage_no.setChecked(true);
                RadioButton radioButton2 = this.radioButtonLanguage_yes;
                int i120 = (-2) - ((q + 120) ^ (-1));
                p = i120 % 128;
                int i121 = i120 % 2;
                radioButton2.setChecked(false);
            } else if (i119 == 1) {
                this.radioButtonLanguage_no.setChecked(false);
                this.radioButtonLanguage_yes.setChecked(true);
            }
            if (this.sp_attended_school.getVisibility() == 0) {
                int i122 = p;
                int i123 = ((i122 | 51) << 1) - (i122 ^ 51);
                q = i123 % 128;
                int i124 = i123 % 2 != 0 ? 1 : 0;
                while (true) {
                    if (i124 >= this.bj.size()) {
                        i124 = 0;
                        break;
                    }
                    int i125 = p;
                    int i126 = ((i125 ^ 111) | (i125 & 111)) << 1;
                    int i127 = -(((~i125) & 111) | (i125 & (-112)));
                    int i128 = (i126 & i127) + (i127 | i126);
                    q = i128 % 128;
                    int i129 = i128 % 2;
                    if (this.bj.get(i124).getOptionId() == this.aN.attended_school) {
                        break;
                    }
                    int i130 = p + 75;
                    q = i130 % 128;
                    int i131 = i130 % 2;
                    int i132 = (-2) - ((i124 - 121) ^ (-1));
                    i124 = (((i132 | 123) << 1) - (~(-(((~i132) & 123) | (i132 & (-124)))))) - 1;
                }
                this.sp_attended_school.setSelection(i124);
            }
            int i133 = 0;
            while (true) {
                if (i133 >= this.aI.size()) {
                    i133 = 0;
                    break;
                }
                int optionId = this.aI.get(i133).getOptionId();
                int i134 = q;
                int i135 = i134 ^ 1;
                int i136 = -(-((i134 & 1) << 1));
                int i137 = (i135 & i136) + (i136 | i135);
                p = i137 % 128;
                if (i137 % 2 != 0) {
                    if (optionId == this.aN.work_activity) {
                        break;
                    }
                    int i138 = i133 | 1;
                    int i139 = i138 << 1;
                    int i140 = -((~(i133 & 1)) & i138);
                    i133 = ((i140 & i139) << 1) + (i139 ^ i140);
                } else {
                    int i141 = 46 / 0;
                    if (optionId == this.aN.work_activity) {
                        break;
                    }
                    int i1310 = i133 | 1;
                    int i1311 = i1310 << 1;
                    int i142 = -((~(i133 & 1)) & i1310);
                    i133 = ((i142 & i1311) << 1) + (i1311 ^ i142);
                }
            }
            this.sp_work_activity.setSelection(i133);
            double d2 = this.aN.hours_worked;
            int i143 = p;
            int i144 = i143 & 35;
            int i145 = (i143 ^ 35) | i144;
            int i146 = (i144 & i145) + (i145 | i144);
            q = i146 % 128;
            int i147 = i146 % 2;
            if (d2 != 0.0d) {
                this.et_hoursWorked.setText(String.valueOf((int) d2));
            }
            int i148 = 0;
            while (true) {
                if (i148 >= this.aJ.size()) {
                    i148 = 0;
                    break;
                }
                if (this.aJ.get(i148).getOptionId() == this.aN.employment_status) {
                    break;
                }
                int i149 = i148 & 38;
                int i150 = (i148 ^ 38) | i149;
                int i151 = ((i149 | i150) << 1) - (i150 ^ i149);
                int i152 = i151 & (-37);
                int i153 = -(-((i151 ^ (-37)) | i152));
                i148 = ((i152 | i153) << 1) - (i152 ^ i153);
            }
            this.sp_employment_status.setSelection(i148);
            int i154 = this.ac;
            if ((i154 == 1 || i154 == 2 || ag.d) && this.aN.relation_to_household_id == 186) {
                int i155 = p;
                int i156 = i155 & 1;
                int i157 = (((i155 | 1) & (~i156)) - (~(-(-(i156 << 1))))) - 1;
                q = i157 % 128;
                if (i157 % 2 != 0) {
                    this.et_MemberName.setEnabled(true);
                    spinner2 = this.sp_relation_to_household;
                    z = true;
                } else {
                    this.et_MemberName.setEnabled(true);
                    spinner2 = this.sp_relation_to_household;
                    z = false;
                }
                spinner2.setEnabled(z);
            }
            this.spinnerYear.setEnabled(false);
            this.spinnerMonth.setEnabled(false);
            this.spinnerMonth.setSelection(this.aN.age_month, false);
            this.spinnerYear.setSelection(this.aN.age_year, false);
            int i158 = q;
            int i159 = i158 ^ 63;
            int i160 = -(-((i158 & 63) << 1));
            int i161 = ((i159 | i160) << 1) - (i160 ^ i159);
            p = i161 % 128;
            int i162 = i161 % 2;
            this.radioButtonCalendarNo.setChecked(false);
            this.radioButtonCalendarNo.setEnabled(false);
            this.tv_dob.setEnabled(true);
            if (this.radioGroupCalendar.getCheckedRadioButtonId() == this.radioButtonCalendarNo.getId()) {
                int i163 = q;
                int i164 = i163 & 123;
                int i165 = ((i163 | 123) & (~i164)) + (i164 << 1);
                p = i165 % 128;
                if (i165 % 2 == 0) {
                    this.spinnerYear.setEnabled(false);
                } else {
                    this.spinnerYear.setEnabled(true);
                }
                this.spinnerMonth.setEnabled(true);
            }
            Roster roster7 = this.aN;
            String str3 = roster7.cnic_valid_name;
            int i166 = q;
            int i167 = i166 & 69;
            int i168 = i167 + ((i166 ^ 69) | i167);
            p = i168 % 128;
            int i169 = i168 % 2;
            this.bn = roster7.cnic_valid_father_Name;
            this.bq = roster7.cnic_valid_dob;
            this.bz = roster7.cnic_valid_gender;
            this.bp = roster7.cnic_valid_current_address;
            this.bo = roster7.cnic_valid_permanent_address;
            this.bw = roster7.cnic_valid_identification_mark;
            String str4 = roster7.cnic_valid_religion;
            int i170 = q;
            int i171 = i170 & 123;
            int i172 = (123 | i170) & (~i171);
            int i173 = -(-(i171 << 1));
            int i174 = ((i172 | i173) << 1) - (i172 ^ i173);
            p = i174 % 128;
            if (i174 % 2 == 0) {
                this.bx = str4;
                roster7.cnic_valid.booleanValue();
                throw null;
            }
            this.bx = str4;
            if (roster7.cnic_valid.booleanValue()) {
                int i175 = p;
                int i176 = (i175 & 47) + (i175 | 47);
                q = i176 % 128;
                int i177 = i176 % 2;
                int i178 = i175 & 71;
                int i179 = (i175 | 71) & (~i178);
                int i180 = -(-(i178 << 1));
                int i181 = ((i179 | i180) << 1) - (i179 ^ i180);
                q = i181 % 128;
                int i182 = i181 % 2;
                int i183 = 0;
                while (i183 < this.radioGroupGender.getChildCount()) {
                    i183 = ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupGender, i183, false, i183, 1);
                    int i184 = q + 83;
                    p = i184 % 128;
                    if (i184 % 2 == 0) {
                        throw null;
                    }
                }
                int i185 = 0;
                while (i185 < this.radioGroupCalendar.getChildCount()) {
                    i185 = ivas.gov.bisp.enumeration.p091n.j.i(this.radioGroupCalendar, i185, false, i185, 1);
                }
                this.radioButtonCalendarYes.setChecked(false);
                this.tv_dob.setEnabled(true);
                this.spinnerYear.setEnabled(false);
                int i186 = q;
                int i187 = i186 & 119;
                int i188 = i186 | 119;
                int i189 = ((i187 | i188) << 1) - (i188 ^ i187);
                p = i189 % 128;
                int i190 = i189 % 2;
                this.spinnerMonth.setEnabled(false);
                this.bg = true;
            }
        }
        if (this.bc) {
            int i191 = p;
            int i192 = i191 & 101;
            int i193 = ((i191 | 101) & (~i192)) + (i192 << 1);
            q = i193 % 128;
            if (i193 % 2 != 0) {
                this.aN.banks_name.equals(BuildConfig.FLAVOR);
                obj.hashCode();
                throw null;
            }
            if (!(!this.aN.banks_name.equals(BuildConfig.FLAVOR))) {
                this.ll_bank_info.setVisibility(8);
                this.rb_yes_bank.setChecked(false);
                this.rb_no_bank.setChecked(true);
                return;
            }
            this.ll_bank_info.setVisibility(0);
            this.rb_yes_bank.setChecked(true);
            this.rb_no_bank.setChecked(false);
            if (!this.aN.bank_address.equals(BuildConfig.FLAVOR)) {
                this.et_easypaisa_number.setText(this.aN.bank_address);
            }
            if (!this.aN.account_title.equals(BuildConfig.FLAVOR)) {
                int i194 = q;
                int i195 = i194 & 81;
                int i196 = ((((i194 ^ 81) | i195) << 1) - (~(-((i194 | 81) & (~i195))))) - 1;
                p = i196 % 128;
                if (i196 % 2 == 0) {
                    this.et_account_title.setText(this.aN.account_title);
                    int i197 = 4 / 0;
                } else {
                    this.et_account_title.setText(this.aN.account_title);
                }
            }
            if (this.aN.account_number.equals(BuildConfig.FLAVOR)) {
                return;
            }
            int i198 = q;
            int i199 = (((i198 | 12) << 1) - (i198 ^ 12)) - 1;
            p = i199 % 128;
            int i200 = i199 % 2;
            this.et_account_number.setText(this.aN.account_number);
        }
    }
}
