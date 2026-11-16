package ivas.gov.bisp.enumeration;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
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
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import butterknife.BindView;
import butterknife.OnClick;
import ivas.gov.bisp.enumeration.ActivityRoster;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.W.a;
import ivas.gov.bisp.enumeration.bC.e;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.question_options;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.P;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p035bh.C0145s;
import ivas.gov.bisp.enumeration.p043bp.C;
import ivas.gov.bisp.enumeration.p043bp.C0207n;
import ivas.gov.bisp.enumeration.p043bp.C0210q;
import ivas.gov.bisp.enumeration.p043bp.D;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0204j;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0212s;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0217y;
import ivas.gov.bisp.enumeration.p043bp.E;
import ivas.gov.bisp.enumeration.p043bp.F;
import ivas.gov.bisp.enumeration.p043bp.K;
import ivas.gov.bisp.enumeration.p043bp.U;
import ivas.gov.bisp.enumeration.p043bp.V;
import ivas.gov.bisp.enumeration.p043bp.X;
import ivas.gov.bisp.enumeration.p043bp.Y;
import ivas.gov.bisp.enumeration.p043bp.Z;
import ivas.gov.bisp.enumeration.p043bp.aa;
import ivas.gov.bisp.enumeration.p043bp.ab;
import ivas.gov.bisp.enumeration.p043bp.ad;
import ivas.gov.bisp.enumeration.p043bp.ae;
import ivas.gov.bisp.enumeration.p043bp.ai;
import ivas.gov.bisp.enumeration.p051bx.o;
import ivas.gov.bisp.enumeration.p085h.k;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRoster extends BaseActivity {
    public static final /* synthetic */ int af = 0;
    private static int p = 1;
    private static int q;
    public int aG;
    public o aH;
    public ArrayList<Item> aI;
    public ImageView aK;
    public ArrayList<Item> aL;
    public ArrayList<Item> aM;
    public ArrayList<Item> aN;
    public ArrayList<Item> aO;
    public ArrayList<Item> aP;
    public ArrayList<Item> aQ;
    public ArrayList<String> aR;
    public ArrayList<String> aS;
    public boolean aU;
    public boolean aW;
    public CountDownTimer aX;
    public byte[] aZ;
    public RadioButton ag;
    public RadioButton ah;
    public ImageView ai;
    public Button aj;
    public ivas.gov.bisp.enumeration.p037bj.c ak;
    public ExecutorService al;
    public Bitmap bA;
    public boolean bF;
    public ArrayList<Item> be;
    public ArrayList<Roster> bj;
    public Roster bn;
    public int bo;
    public int bp;
    public String bq;

    @BindView
    public Button btn_bio_cnic;

    @BindView
    public Button btn_save;

    @BindView
    public Button btn_vald_cnic;

    @BindView
    public Button buttonScanCNIC;
    public BISPApplication bw;
    public byte[] bx;
    public Dialog bz;

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
    public int bL = 0;
    public int bu = 256;
    public int bv = 360;
    public final byte[] bJ = new byte[92160];
    public String[] by = new String[0];
    public String bG = BuildConfig.FLAVOR;
    public String bH = BuildConfig.FLAVOR;
    public String bI = BuildConfig.FLAVOR;
    public String bD = BuildConfig.FLAVOR;
    public String bE = BuildConfig.FLAVOR;
    public String bC = BuildConfig.FLAVOR;
    public String bK = BuildConfig.FLAVOR;
    public String bB = BuildConfig.FLAVOR;
    public boolean bs = false;
    public boolean aJ = false;
    public int aV = 0;
    public double br = 0.0d;
    public int aT = 0;
    public boolean aY = false;
    public Survey ba = null;
    public boolean bc = false;
    public boolean bb = false;
    public String bd = BuildConfig.FLAVOR;
    public AdapterView.OnItemSelectedListener bg = new OooO0O0();
    public AdapterView.OnItemSelectedListener bh = new OooO0OO();
    public AdapterView.OnItemSelectedListener bi = new OooO0o();
    public AdapterView.OnItemSelectedListener bf = new OooO();
    public AdapterView.OnItemSelectedListener bk = new OooOO0();
    public AdapterView.OnItemSelectedListener bl = new OooOO0O();
    public boolean bm = false;
    public Handler bt = new OooOo();

    public class OooO0o implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 97;
            int i4 = i3 + ((i2 ^ 97) | i3);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b + 73;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i != 0) {
                o000OOo o000ooo = ActivityRoster.this.new o000OOo(i, new OooO00o(i));
                int i4 = b;
                int i5 = ((i4 ^ 49) | (i4 & 49)) << 1;
                int i6 = -(((~i4) & 49) | (i4 & (-50)));
                int i7 = (i5 & i6) + (i6 | i5);
                a = i7 % 128;
                int i8 = i7 % 2;
                o000ooo.execute(new Void[0]);
                int i9 = a;
                int i10 = i9 & 93;
                int i11 = ((i9 ^ 93) | i10) << 1;
                int i12 = -((i9 | 93) & (~i10));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = a;
            int i16 = (((i15 & (-60)) | ((~i15) & 59)) - (~(-(-((i15 & 59) << 1))))) - 1;
            b = i16 % 128;
            int i17 = i16 % 2;
        }

        public class OooO00o implements a {
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ int c;

            /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ActivityRoster$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C0007OooO00o implements J {
                private static int a = 1;
                private static int b;

                public C0007OooO00o() {
                }

                @Override // ivas.gov.bisp.enumeration.W.J
                public void fillList(ArrayList<Item> arrayList) {
                    ActivityRoster activityRoster;
                    int i = 2 % 2;
                    int i2 = b;
                    int i3 = (i2 & 87) + (i2 | 87);
                    a = i3 % 128;
                    int i4 = i3 % 2;
                    OooO0o oooO0o = OooO0o.this;
                    if (i4 == 0) {
                        activityRoster = ActivityRoster.this;
                        int i5 = 94 / 0;
                    } else {
                        activityRoster = ActivityRoster.this;
                    }
                    int i6 = a;
                    int i7 = i6 ^ 87;
                    int i8 = (((i6 & 87) | i7) << 1) - i7;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    activityRoster.aI = arrayList;
                    int i10 = a;
                    int i11 = (i10 & 93) + (i10 | 93);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                }
            }

            public OooO00o(int i) {
                this.c = i;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x0246 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:104:0x017b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:106:0x03ba A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:107:0x036b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:14:0x0120  */
            /* JADX WARN: Code duplicated, block: B:17:0x0181  */
            /* JADX WARN: Code duplicated, block: B:19:0x019b  */
            /* JADX WARN: Code duplicated, block: B:21:0x01b7  */
            /* JADX WARN: Code duplicated, block: B:23:0x01d1  */
            /* JADX WARN: Code duplicated, block: B:25:0x01ed  */
            /* JADX WARN: Code duplicated, block: B:26:0x01fa  */
            /* JADX WARN: Code duplicated, block: B:33:0x0294  */
            /* JADX WARN: Code duplicated, block: B:34:0x029f  */
            /* JADX WARN: Code duplicated, block: B:37:0x02b5  */
            /* JADX WARN: Code duplicated, block: B:39:0x02d0  */
            /* JADX WARN: Code duplicated, block: B:41:0x02d8  */
            /* JADX WARN: Code duplicated, block: B:44:0x030a  */
            /* JADX WARN: Code duplicated, block: B:46:0x031a  */
            /* JADX WARN: Code duplicated, block: B:47:0x0327  */
            /* JADX WARN: Code duplicated, block: B:50:0x0365  */
            /* JADX WARN: Code duplicated, block: B:54:0x037d A[EDGE_INSN: B:54:0x037d->B:60:0x03bf BREAK  A[LOOP:1: B:42:0x02fe->B:57:0x0398]] */
            /* JADX WARN: Code duplicated, block: B:55:0x0394  */
            /* JADX WARN: Code duplicated, block: B:57:0x0398 A[LOOP:1: B:42:0x02fe->B:57:0x0398, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:62:0x03da  */
            /* JADX WARN: Code duplicated, block: B:63:0x03de  */
            /* JADX WARN: Code duplicated, block: B:86:0x046c  */
            /* JADX WARN: Code duplicated, block: B:88:0x0484  */
            /* JADX WARN: Code duplicated, block: B:90:0x048a  */
            /* JADX WARN: Code duplicated, block: B:91:0x04a1  */
            /* JADX WARN: Code duplicated, block: B:97:0x04b7  */
            /* JADX WARN: Code duplicated, block: B:99:0x04c1  */
            @Override // ivas.gov.bisp.enumeration.W.a
            public void b(ArrayList<question_options> arrayList, int i) {
                int i2;
                o oVar;
                int i3;
                ActivityRoster activityRoster;
                int i4;
                int i5;
                ActivityRoster activityRoster2;
                int i6;
                Spinner spinner;
                int i7;
                int i8;
                Item item;
                int optionId;
                ActivityRoster activityRoster3;
                int i9;
                int i10;
                int i11;
                int i12;
                Item item2;
                int i13;
                ActivityRoster activityRoster4;
                double d;
                int i14;
                int i15;
                Item item3;
                int i16 = 2 % 2;
                int i17 = a;
                int i18 = ((i17 ^ 39) - (~(-(-((i17 & 39) << 1))))) - 1;
                b = i18 % 128;
                int i19 = i18 % 2;
                ArrayList<Item> arrayList2 = ActivityRoster.this.aL;
                int i20 = this.c;
                int i21 = b;
                int i22 = i21 ^ 49;
                int i23 = (i21 & 49) << 1;
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 0;
                Object obj = null;
                if (arrayList2.get(i20).getOptionId() != 271) {
                    int i27 = a;
                    int i28 = i27 & 11;
                    int i29 = (i27 | 11) & (~i28);
                    int i30 = -(-(i28 << 1));
                    int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    ArrayList<Item> arrayList3 = ActivityRoster.this.aL;
                    int i33 = a;
                    int i34 = (i33 | 55) << 1;
                    int i35 = -(((~i33) & 55) | (i33 & (-56)));
                    int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                    b = i36 % 128;
                    if (i36 % 2 == 0) {
                        item3 = arrayList3.get(this.c);
                        int i37 = 21 / 0;
                    } else {
                        item3 = arrayList3.get(this.c);
                    }
                    int i38 = a + 82;
                    int i39 = (i38 ^ (-1)) + (i38 << 1);
                    b = i39 % 128;
                    int i40 = i39 % 2;
                    if (item3.getOptionId() != 272) {
                        int i41 = b;
                        int i42 = i41 & 113;
                        int i43 = i42 + ((i41 ^ 113) | i42);
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        ActivityRoster activityRoster5 = ActivityRoster.this;
                        if (activityRoster5.aW) {
                            activityRoster5.aW = false;
                            int i45 = a;
                            int i46 = (i45 ^ 83) + ((i45 & 83) << 1);
                            b = i46 % 128;
                            int i47 = i46 % 2;
                        } else {
                            ActivityRoster activityRoster6 = ActivityRoster.this;
                            au auVar = new au(activityRoster6, "marital_status", activityRoster6.getResources().getString(R.string.marital_status), ActivityRoster.this.sp_marital_status, new C0007OooO00o());
                            int i48 = a;
                            int i49 = ((i48 ^ 113) | (i48 & 113)) << 1;
                            int i50 = -(((~i48) & 113) | (i48 & (-114)));
                            int i51 = (i49 & i50) + (i50 | i49);
                            b = i51 % 128;
                            int i52 = i51 % 2;
                            auVar.execute(new Void[0]);
                            int i53 = b;
                            int i54 = (i53 & (-52)) | ((~i53) & 51);
                            int i55 = (i53 & 51) << 1;
                            int i56 = (i54 & i55) + (i55 | i54);
                            a = i56 % 128;
                            int i57 = i56 % 2;
                        }
                    } else {
                        ActivityRoster activityRoster7 = ActivityRoster.this;
                        ArrayList<Item> arrayList4 = new ArrayList<>();
                        int i58 = a;
                        int i59 = i58 & 97;
                        int i60 = (((i58 | 97) & (~i59)) - (~(i59 << 1))) - 1;
                        b = i60 % 128;
                        int i61 = i60 % 2;
                        activityRoster7.aI = arrayList4;
                        ActivityRoster activityRoster8 = ActivityRoster.this;
                        ArrayList<Item> arrayList5 = activityRoster8.aI;
                        Item item4 = new Item(activityRoster8.getResources().getString(R.string.marital_status));
                        int i62 = b;
                        int i63 = i62 ^ 109;
                        int i64 = (i62 & 109) << 1;
                        int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                        a = i65 % 128;
                        int i66 = i65 % 2;
                        arrayList5.add(0, item4);
                        int i67 = a;
                        int i68 = i67 & 83;
                        int i69 = (((i67 | 83) & (~i68)) - (~(i68 << 1))) - 1;
                        b = i69 % 128;
                        int i70 = i69 % 2;
                        i2 = 0;
                        while (i2 < arrayList.size()) {
                            int i71 = b;
                            int i72 = ((i71 | 65) << 1) - (i71 ^ 65);
                            a = i72 % 128;
                            int i73 = i72 % 2;
                            if (arrayList.get(i2).option_id != 200) {
                                int i74 = b;
                                int i75 = (((i74 | 6) << 1) - (i74 ^ 6)) - 1;
                                a = i75 % 128;
                                int i76 = i75 % 2;
                                if (arrayList.get(i2).option_id != 202) {
                                    int i77 = b;
                                    int i78 = (i77 ^ 111) + ((i77 & 111) << 1);
                                    a = i78 % 128;
                                    int i79 = i78 % 2;
                                    if (arrayList.get(i2).option_id != 203) {
                                        question_options question_optionsVar = arrayList.get(i2);
                                        item2 = new Item(question_optionsVar.option_id, question_optionsVar.option, question_optionsVar.question);
                                        i13 = a + 53;
                                        b = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            ActivityRoster.this.aI.add(item2);
                                            int i80 = 46 / 0;
                                        } else {
                                            ActivityRoster.this.aI.add(item2);
                                        }
                                        int i81 = a;
                                        int i82 = i81 ^ 33;
                                        int i83 = (i81 & 33) << 1;
                                        int i84 = (i82 & i83) + (i82 | i83);
                                        b = i84 % 128;
                                        int i85 = i84 % 2;
                                        int i86 = i81 & 71;
                                        int i87 = ((i81 ^ 71) | i86) << 1;
                                        int i88 = -((i81 | 71) & (~i86));
                                        int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                                        b = i89 % 128;
                                        int i90 = i89 % 2;
                                    }
                                }
                            }
                            int i91 = i2 + 94;
                            i2 = (i91 | (-93)) + (i91 & (-93));
                            int i92 = a;
                            int i93 = i92 & 25;
                            int i94 = (i92 ^ 25) | i93;
                            i12 = ((i93 | i94) << 1) - (i94 ^ i93);
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i95 = 5 / 4;
                            }
                        }
                        ActivityRoster activityRoster9 = ActivityRoster.this;
                        ActivityRoster activityRoster10 = ActivityRoster.this;
                        o oVar2 = new o(activityRoster10.ae, R.layout.spinner_item, activityRoster10.aI);
                        int i96 = b;
                        int i97 = (((i96 & (-14)) | ((~i96) & 13)) - (~(-(-((i96 & 13) << 1))))) - 1;
                        a = i97 % 128;
                        int i98 = i97 % 2;
                        activityRoster9.aH = oVar2;
                        oVar = ActivityRoster.this.aH;
                        int i99 = a;
                        int i100 = (i99 & 94) + (i99 | 94);
                        i3 = (i100 ^ (-1)) + (i100 << 1);
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            oVar.setDropDownViewResource(R.layout.spinner_item_dropdown);
                            activityRoster = ActivityRoster.this;
                            int i101 = 40 / 0;
                        } else {
                            oVar.setDropDownViewResource(R.layout.spinner_item_dropdown);
                            activityRoster = ActivityRoster.this;
                        }
                        int i102 = a;
                        i4 = ((i102 | 13) << 1) - (i102 ^ 13);
                        b = i4 % 128;
                        if (i4 % 2 != 0) {
                            activityRoster.sp_marital_status.setAdapter((SpinnerAdapter) activityRoster.aH);
                            obj.hashCode();
                            throw null;
                        }
                        activityRoster.sp_marital_status.setAdapter((SpinnerAdapter) activityRoster.aH);
                        int i103 = b;
                        i5 = ((i103 | 9) << 1) - (((~i103) & 9) | (i103 & (-10)));
                        a = i5 % 128;
                        if (i5 % 2 == 0) {
                            boolean z = ActivityRoster.this.aW;
                            obj.hashCode();
                            throw null;
                        }
                        activityRoster2 = ActivityRoster.this;
                        if (activityRoster2.aW) {
                            int i104 = b;
                            int i105 = i104 & 47;
                            int i106 = (((i104 ^ 47) | i105) << 1) - ((i104 | 47) & (~i105));
                            a = i106 % 128;
                            int i107 = i106 % 2;
                            activityRoster2.aW = false;
                            int i108 = b;
                            int i109 = i108 & 25;
                            int i110 = (i108 ^ 25) | i109;
                            int i111 = (i109 & i110) + (i110 | i109);
                            a = i111 % 128;
                            int i112 = i111 % 2;
                            i6 = 0;
                            while (i6 < ActivityRoster.this.aI.size()) {
                                int i113 = a;
                                i8 = (i113 ^ 107) + ((i113 & 107) << 1);
                                b = i8 % 128;
                                if (i8 % 2 == 0) {
                                    item = ActivityRoster.this.aI.get(i6);
                                    int i114 = 2 / 0;
                                } else {
                                    item = ActivityRoster.this.aI.get(i6);
                                }
                                int i115 = b;
                                int i116 = i115 & 79;
                                int i117 = -(-((i115 ^ 79) | i116));
                                int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
                                a = i118 % 128;
                                int i119 = i118 % 2;
                                optionId = item.getOptionId();
                                activityRoster3 = ActivityRoster.this;
                                int i120 = a;
                                int i121 = i120 & 45;
                                int i122 = -(-((i120 ^ 45) | i121));
                                i9 = (i121 ^ i122) + ((i122 & i121) << 1);
                                b = i9 % 128;
                                if (i9 % 2 != 0) {
                                    int i123 = activityRoster3.bn.marital_status;
                                    throw null;
                                }
                                if (optionId == activityRoster3.bn.marital_status) {
                                    int i124 = b;
                                    int i125 = i124 & 67;
                                    i10 = ((i124 | 67) & (~i125)) + (i125 << 1);
                                    i11 = i10 % 128;
                                    a = i11;
                                    if (i10 % 2 == 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    int i126 = i11 & 119;
                                    int i127 = ((((i11 ^ 119) | i126) << 1) - (~(-((i11 | 119) & (~i126))))) - 1;
                                    b = i127 % 128;
                                    int i128 = i127 % 2;
                                    i26 = i6;
                                    break;
                                }
                                int i129 = ((i6 & (-8)) - (~(-(-(i6 | (-8)))))) - 1;
                                int i130 = i129 & 9;
                                int i131 = -(-(i129 | 9));
                                i6 = ((i130 | i131) << 1) - (i130 ^ i131);
                                int i132 = a + 5;
                                b = i132 % 128;
                                int i133 = i132 % 2;
                            }
                            spinner = ActivityRoster.this.sp_marital_status;
                            int i134 = a;
                            int i135 = i134 & 83;
                            int i136 = -(-(i134 | 83));
                            i7 = ((i135 | i136) << 1) - (i136 ^ i135);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                spinner.setSelection(i26);
                                obj.hashCode();
                                throw null;
                            }
                            spinner.setSelection(i26);
                        }
                    }
                } else {
                    ActivityRoster activityRoster11 = ActivityRoster.this;
                    ArrayList<Item> arrayList6 = new ArrayList<>();
                    int i510 = a;
                    int i511 = i510 & 97;
                    int i610 = (((i510 | 97) & (~i511)) - (~(i511 << 1))) - 1;
                    b = i610 % 128;
                    int i611 = i610 % 2;
                    activityRoster11.aI = arrayList6;
                    ActivityRoster activityRoster12 = ActivityRoster.this;
                    ArrayList<Item> arrayList7 = activityRoster12.aI;
                    Item item5 = new Item(activityRoster12.getResources().getString(R.string.marital_status));
                    int i612 = b;
                    int i613 = i612 ^ 109;
                    int i614 = (i612 & 109) << 1;
                    int i615 = (i613 ^ i614) + ((i614 & i613) << 1);
                    a = i615 % 128;
                    int i616 = i615 % 2;
                    arrayList7.add(0, item5);
                    int i617 = a;
                    int i618 = i617 & 83;
                    int i619 = (((i617 | 83) & (~i618)) - (~(i618 << 1))) - 1;
                    b = i619 % 128;
                    int i710 = i619 % 2;
                    i2 = 0;
                    while (i2 < arrayList.size()) {
                        int i711 = b;
                        int i712 = ((i711 | 65) << 1) - (i711 ^ 65);
                        a = i712 % 128;
                        int i713 = i712 % 2;
                        if (arrayList.get(i2).option_id != 200) {
                            int i714 = b;
                            int i715 = (((i714 | 6) << 1) - (i714 ^ 6)) - 1;
                            a = i715 % 128;
                            int i716 = i715 % 2;
                            if (arrayList.get(i2).option_id != 202) {
                                int i717 = b;
                                int i718 = (i717 ^ 111) + ((i717 & 111) << 1);
                                a = i718 % 128;
                                int i719 = i718 % 2;
                                if (arrayList.get(i2).option_id != 203) {
                                    question_options question_optionsVar2 = arrayList.get(i2);
                                    item2 = new Item(question_optionsVar2.option_id, question_optionsVar2.option, question_optionsVar2.question);
                                    i13 = a + 53;
                                    b = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        ActivityRoster.this.aI.add(item2);
                                        int i810 = 46 / 0;
                                    } else {
                                        ActivityRoster.this.aI.add(item2);
                                    }
                                    int i811 = a;
                                    int i812 = i811 ^ 33;
                                    int i813 = (i811 & 33) << 1;
                                    int i814 = (i812 & i813) + (i812 | i813);
                                    b = i814 % 128;
                                    int i815 = i814 % 2;
                                    int i816 = i811 & 71;
                                    int i817 = ((i811 ^ 71) | i816) << 1;
                                    int i818 = -((i811 | 71) & (~i816));
                                    int i819 = (i817 ^ i818) + ((i818 & i817) << 1);
                                    b = i819 % 128;
                                    int i910 = i819 % 2;
                                }
                            }
                        }
                        int i911 = i2 + 94;
                        i2 = (i911 | (-93)) + (i911 & (-93));
                        int i912 = a;
                        int i913 = i912 & 25;
                        int i914 = (i912 ^ 25) | i913;
                        i12 = ((i913 | i914) << 1) - (i914 ^ i913);
                        b = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i915 = 5 / 4;
                        }
                    }
                    ActivityRoster activityRoster13 = ActivityRoster.this;
                    ActivityRoster activityRoster14 = ActivityRoster.this;
                    o oVar3 = new o(activityRoster14.ae, R.layout.spinner_item, activityRoster14.aI);
                    int i916 = b;
                    int i917 = (((i916 & (-14)) | ((~i916) & 13)) - (~(-(-((i916 & 13) << 1))))) - 1;
                    a = i917 % 128;
                    int i918 = i917 % 2;
                    activityRoster13.aH = oVar3;
                    oVar = ActivityRoster.this.aH;
                    int i919 = a;
                    int i1010 = (i919 & 94) + (i919 | 94);
                    i3 = (i1010 ^ (-1)) + (i1010 << 1);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        oVar.setDropDownViewResource(R.layout.spinner_item_dropdown);
                        activityRoster = ActivityRoster.this;
                        int i1011 = 40 / 0;
                    } else {
                        oVar.setDropDownViewResource(R.layout.spinner_item_dropdown);
                        activityRoster = ActivityRoster.this;
                    }
                    int i1012 = a;
                    i4 = ((i1012 | 13) << 1) - (i1012 ^ 13);
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        activityRoster.sp_marital_status.setAdapter((SpinnerAdapter) activityRoster.aH);
                        obj.hashCode();
                        throw null;
                    }
                    activityRoster.sp_marital_status.setAdapter((SpinnerAdapter) activityRoster.aH);
                    int i1013 = b;
                    i5 = ((i1013 | 9) << 1) - (((~i1013) & 9) | (i1013 & (-10)));
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        boolean z2 = ActivityRoster.this.aW;
                        obj.hashCode();
                        throw null;
                    }
                    activityRoster2 = ActivityRoster.this;
                    if (activityRoster2.aW) {
                        int i1014 = b;
                        int i1015 = i1014 & 47;
                        int i1016 = (((i1014 ^ 47) | i1015) << 1) - ((i1014 | 47) & (~i1015));
                        a = i1016 % 128;
                        int i1017 = i1016 % 2;
                        activityRoster2.aW = false;
                        int i1018 = b;
                        int i1019 = i1018 & 25;
                        int i1110 = (i1018 ^ 25) | i1019;
                        int i1111 = (i1019 & i1110) + (i1110 | i1019);
                        a = i1111 % 128;
                        int i1112 = i1111 % 2;
                        i6 = 0;
                        while (i6 < ActivityRoster.this.aI.size()) {
                            int i1113 = a;
                            i8 = (i1113 ^ 107) + ((i1113 & 107) << 1);
                            b = i8 % 128;
                            if (i8 % 2 == 0) {
                                item = ActivityRoster.this.aI.get(i6);
                                int i1114 = 2 / 0;
                            } else {
                                item = ActivityRoster.this.aI.get(i6);
                            }
                            int i1115 = b;
                            int i1116 = i1115 & 79;
                            int i1117 = -(-((i1115 ^ 79) | i1116));
                            int i1118 = ((i1116 | i1117) << 1) - (i1117 ^ i1116);
                            a = i1118 % 128;
                            int i1119 = i1118 % 2;
                            optionId = item.getOptionId();
                            activityRoster3 = ActivityRoster.this;
                            int i1210 = a;
                            int i1211 = i1210 & 45;
                            int i1212 = -(-((i1210 ^ 45) | i1211));
                            i9 = (i1211 ^ i1212) + ((i1212 & i1211) << 1);
                            b = i9 % 128;
                            if (i9 % 2 != 0) {
                                int i1213 = activityRoster3.bn.marital_status;
                                throw null;
                            }
                            if (optionId == activityRoster3.bn.marital_status) {
                                int i1214 = b;
                                int i1215 = i1214 & 67;
                                i10 = ((i1214 | 67) & (~i1215)) + (i1215 << 1);
                                i11 = i10 % 128;
                                a = i11;
                                if (i10 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                int i1216 = i11 & 119;
                                int i1217 = ((((i11 ^ 119) | i1216) << 1) - (~(-((i11 | 119) & (~i1216))))) - 1;
                                b = i1217 % 128;
                                int i1218 = i1217 % 2;
                                i26 = i6;
                                break;
                            }
                            int i1219 = ((i6 & (-8)) - (~(-(-(i6 | (-8)))))) - 1;
                            int i137 = i1219 & 9;
                            int i138 = -(-(i1219 | 9));
                            i6 = ((i137 | i138) << 1) - (i137 ^ i138);
                            int i139 = a + 5;
                            b = i139 % 128;
                            int i1310 = i139 % 2;
                        }
                        spinner = ActivityRoster.this.sp_marital_status;
                        int i1311 = a;
                        int i1312 = i1311 & 83;
                        int i1313 = -(-(i1311 | 83));
                        i7 = ((i1312 | i1313) << 1) - (i1313 ^ i1312);
                        b = i7 % 128;
                        if (i7 % 2 != 0) {
                            spinner.setSelection(i26);
                            obj.hashCode();
                            throw null;
                        }
                        spinner.setSelection(i26);
                    }
                }
                ArrayList<Item> arrayList8 = ActivityRoster.this.aL;
                int i140 = this.c;
                int i141 = b;
                int i142 = (-2) - (((i141 ^ 108) + ((i141 & 108) << 1)) ^ (-1));
                a = i142 % 128;
                if (i142 % 2 == 0 ? arrayList8.get(i140).getOptionId() == 186 : arrayList8.get(i140).getOptionId() == 29494) {
                    ActivityRoster activityRoster15 = ActivityRoster.this;
                    double d2 = activityRoster15.br;
                    int i143 = b;
                    int i144 = (i143 ^ 25) + ((i143 & 25) << 1);
                    int i145 = i144 % 128;
                    a = i145;
                    int i146 = i144 % 2;
                    if (d2 <= 0.0d) {
                        int i147 = ((i145 | 121) << 1) - (i145 ^ 121);
                        b = i147 % 128;
                        if (i147 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (d2 == 0.0d) {
                            int i148 = i145 ^ 19;
                            int i149 = (i145 & 19) << 1;
                            int i150 = (i148 & i149) + (i148 | i149);
                            b = i150 % 128;
                            if (i150 % 2 == 0) {
                                activityRoster15.spinnerMonth.getSelectedItemPosition();
                                throw null;
                            }
                            if (activityRoster15.spinnerMonth.getSelectedItemPosition() > 0) {
                                activityRoster4 = ActivityRoster.this;
                                d = activityRoster4.br;
                                int i151 = b;
                                i14 = ((i151 ^ 68) + ((i151 & 68) << 1)) - 1;
                                i15 = i14 % 128;
                                a = i15;
                                if (i14 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                if (d < 18.0d) {
                                    int i152 = (i15 & 121) + (i15 | 121);
                                    b = i152 % 128;
                                    int i153 = i152 % 2;
                                    activityRoster4.H(d);
                                    int i154 = b + 43;
                                    a = i154 % 128;
                                    int i155 = i154 % 2;
                                }
                            }
                        }
                    } else {
                        activityRoster4 = ActivityRoster.this;
                        d = activityRoster4.br;
                        int i156 = b;
                        i14 = ((i156 ^ 68) + ((i156 & 68) << 1)) - 1;
                        i15 = i14 % 128;
                        a = i15;
                        if (i14 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (d < 18.0d) {
                            int i157 = (i15 & 121) + (i15 | 121);
                            b = i157 % 128;
                            int i158 = i157 % 2;
                            activityRoster4.H(d);
                            int i159 = b + 43;
                            a = i159 % 128;
                            int i1510 = i159 % 2;
                        }
                    }
                }
                int i160 = a;
                int i161 = (i160 ^ 103) + ((i160 & 103) << 1);
                b = i161 % 128;
                if (i161 % 2 == 0) {
                    throw null;
                }
            }
        }
    }

    public class OooOO0 implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0() {
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:37:0x0113  */
        /* JADX WARN: Code duplicated, block: B:44:0x0151  */
        /* JADX WARN: Code duplicated, block: B:45:0x0170  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int checkedRadioButtonId;
            ActivityRoster activityRoster;
            ActivityRoster activityRoster2;
            int selectedItemPosition;
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = ((i5 | 13) << 1) - (i5 ^ 13);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                checkedRadioButtonId = ActivityRoster.this.radioGroupCalendar.getCheckedRadioButtonId();
                activityRoster = ActivityRoster.this;
                int i7 = 57 / 0;
            } else {
                checkedRadioButtonId = ActivityRoster.this.radioGroupCalendar.getCheckedRadioButtonId();
                activityRoster = ActivityRoster.this;
            }
            if (checkedRadioButtonId == activityRoster.radioButtonCalendarNo.getId()) {
                int i8 = a;
                int i9 = i8 & 61;
                int i10 = -(-((i8 ^ 61) | i9));
                int i11 = (i9 & i10) + (i9 | i10);
                b = i11 % 128;
                int i12 = i11 % 2;
                if (i > 115) {
                    int i13 = (((i8 | 68) << 1) - (i8 ^ 68)) - 1;
                    b = i13 % 128;
                    (i13 % 2 == 0 ? Toast.makeText(ActivityRoster.this.ae, "Maximum Age should be 115", 1) : Toast.makeText(ActivityRoster.this.ae, "Maximum Age should be 115", 0)).show();
                    ActivityRoster.this.K();
                    ActivityRoster activityRoster3 = ActivityRoster.this;
                    int i14 = a;
                    int i15 = ((i14 | 63) << 1) - (i14 ^ 63);
                    b = i15 % 128;
                    if (i15 % 2 == 0) {
                        activityRoster3.tv_dob.setText(BuildConfig.FLAVOR);
                        int i16 = 93 / 0;
                    } else {
                        activityRoster3.tv_dob.setText(BuildConfig.FLAVOR);
                    }
                    activityRoster3.bq = BuildConfig.FLAVOR;
                    int i17 = b;
                    int i18 = i17 & 103;
                    int i19 = -(-((i17 ^ 103) | i18));
                    int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    return;
                }
                ActivityRoster activityRoster4 = ActivityRoster.this;
                activityRoster4.br = i;
                if (i <= 0) {
                    int i22 = a;
                    int i23 = i22 & 19;
                    int i24 = -(-((i22 ^ 19) | i23));
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    int i26 = i25 % 128;
                    b = i26;
                    if (i25 % 2 == 0) {
                        int i27 = 51 / 0;
                        if (i == 0) {
                            int i28 = i26 ^ 87;
                            int i29 = ((i26 & 87) | i28) << 1;
                            int i30 = -i28;
                            i3 = (i29 & i30) + (i29 | i30);
                            a = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i31 = 70 / 0;
                                if (activityRoster4.spinnerMonth.getSelectedItemPosition() > 0) {
                                    activityRoster2 = ActivityRoster.this;
                                    selectedItemPosition = activityRoster2.spinnerMonth.getSelectedItemPosition();
                                    int i32 = b;
                                    int i33 = i32 & 67;
                                    i2 = ((((i32 ^ 67) | i33) << 1) - (~(-((i32 | 67) & (~i33))))) - 1;
                                    a = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                                }
                            } else if (activityRoster4.spinnerMonth.getSelectedItemPosition() > 0) {
                                activityRoster2 = ActivityRoster.this;
                                selectedItemPosition = activityRoster2.spinnerMonth.getSelectedItemPosition();
                                int i34 = b;
                                int i35 = i34 & 67;
                                i2 = ((((i34 ^ 67) | i35) << 1) - (~(-((i34 | 67) & (~i35))))) - 1;
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                            }
                        }
                    } else if (i == 0) {
                        int i210 = i26 ^ 87;
                        int i211 = ((i26 & 87) | i210) << 1;
                        int i36 = -i210;
                        i3 = (i211 & i36) + (i211 | i36);
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i37 = 70 / 0;
                            if (activityRoster4.spinnerMonth.getSelectedItemPosition() > 0) {
                                activityRoster2 = ActivityRoster.this;
                                selectedItemPosition = activityRoster2.spinnerMonth.getSelectedItemPosition();
                                int i38 = b;
                                int i39 = i38 & 67;
                                i2 = ((((i38 ^ 67) | i39) << 1) - (~(-((i38 | 67) & (~i39))))) - 1;
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                            }
                        } else if (activityRoster4.spinnerMonth.getSelectedItemPosition() > 0) {
                            activityRoster2 = ActivityRoster.this;
                            selectedItemPosition = activityRoster2.spinnerMonth.getSelectedItemPosition();
                            int i310 = b;
                            int i311 = i310 & 67;
                            i2 = ((((i310 ^ 67) | i311) << 1) - (~(-((i310 | 67) & (~i311))))) - 1;
                            a = i2 % 128;
                            if (i2 % 2 != 0) {
                                ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                        }
                    }
                } else {
                    activityRoster2 = ActivityRoster.this;
                    selectedItemPosition = activityRoster2.spinnerMonth.getSelectedItemPosition();
                    int i312 = b;
                    int i313 = i312 & 67;
                    i2 = ((((i312 ^ 67) | i313) << 1) - (~(-((i312 | 67) & (~i313))))) - 1;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    ActivityRoster.z(activityRoster2, 1, selectedItemPosition, ActivityRoster.this.spinnerYear.getSelectedItemPosition());
                }
                ActivityRoster activityRoster5 = ActivityRoster.this;
                activityRoster5.M(activityRoster5.br);
                if (i <= 0) {
                    int i40 = a;
                    int i41 = i40 + 13;
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    if (i == 0) {
                        int i43 = i40 & 9;
                        int i44 = ((i40 ^ 9) | i43) << 1;
                        int i45 = -((i40 | 9) & (~i43));
                        int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                        b = i46 % 128;
                        int i47 = i46 % 2;
                        if (ActivityRoster.this.spinnerMonth.getSelectedItemPosition() > 0) {
                            ActivityRoster activityRoster6 = ActivityRoster.this;
                            activityRoster6.H(activityRoster6.br);
                            int i48 = a;
                            int i49 = i48 & 9;
                            int i50 = ((i48 ^ 9) | i49) << 1;
                            int i51 = -((i48 | 9) & (~i49));
                            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                            b = i52 % 128;
                            int i53 = i52 % 2;
                        }
                    }
                } else {
                    ActivityRoster activityRoster7 = ActivityRoster.this;
                    activityRoster7.H(activityRoster7.br);
                    int i410 = a;
                    int i411 = i410 & 9;
                    int i54 = ((i410 ^ 9) | i411) << 1;
                    int i55 = -((i410 | 9) & (~i411));
                    int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                    b = i56 % 128;
                    int i57 = i56 % 2;
                }
            }
            int i58 = b + 109;
            a = i58 % 128;
            int i59 = i58 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 111;
            int i4 = -(-((i2 & 111) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 34 / 0;
            }
        }
    }

    public class OooOO0O implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0O() {
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:25:0x0114  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ActivityRoster activityRoster;
            double selectedItemPosition;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 107;
            int i5 = (i3 ^ 107) | i4;
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                ActivityRoster.this.radioGroupCalendar.getCheckedRadioButtonId();
                RadioButton radioButton = ActivityRoster.this.radioButtonCalendarNo;
                obj.hashCode();
                throw null;
            }
            int checkedRadioButtonId = ActivityRoster.this.radioGroupCalendar.getCheckedRadioButtonId();
            RadioButton radioButton2 = ActivityRoster.this.radioButtonCalendarNo;
            int i7 = a;
            int i8 = i7 & 95;
            int i9 = (i7 | 95) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (checkedRadioButtonId == radioButton2.getId()) {
                int i13 = a;
                int i14 = i13 & 117;
                int i15 = -(-(i13 | 117));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    activityRoster = ActivityRoster.this;
                    selectedItemPosition = activityRoster.spinnerYear.getSelectedItemPosition();
                    int i17 = 31 / 0;
                } else {
                    activityRoster = ActivityRoster.this;
                    selectedItemPosition = activityRoster.spinnerYear.getSelectedItemPosition();
                }
                activityRoster.br = selectedItemPosition;
                ActivityRoster activityRoster2 = ActivityRoster.this;
                double d = activityRoster2.br;
                int i18 = b;
                int i19 = ((i18 | 58) << 1) - (i18 ^ 58);
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                if (d <= 0.0d) {
                    int i22 = (i18 & (-12)) | ((~i18) & 11);
                    int i23 = (i18 & 11) << 1;
                    int i24 = (i22 & i23) + (i23 | i22);
                    a = i24 % 128;
                    if (i24 % 2 == 0 ? d == 0.0d : d == 0.0d) {
                        if (i > 0) {
                            int selectedItemPosition2 = activityRoster2.spinnerMonth.getSelectedItemPosition();
                            Spinner spinner = ActivityRoster.this.spinnerYear;
                            int i25 = b + 11;
                            a = i25 % 128;
                            int i26 = i25 % 2;
                            ActivityRoster.z(activityRoster2, 1, selectedItemPosition2, spinner.getSelectedItemPosition());
                            int i27 = b;
                            int i28 = i27 & 71;
                            int i29 = (i27 | 71) & (~i28);
                            int i30 = i28 << 1;
                            int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                            a = i31 % 128;
                            int i32 = i31 % 2;
                        }
                    }
                } else {
                    int selectedItemPosition3 = activityRoster2.spinnerMonth.getSelectedItemPosition();
                    Spinner spinner2 = ActivityRoster.this.spinnerYear;
                    int i210 = b + 11;
                    a = i210 % 128;
                    int i211 = i210 % 2;
                    ActivityRoster.z(activityRoster2, 1, selectedItemPosition3, spinner2.getSelectedItemPosition());
                    int i212 = b;
                    int i213 = i212 & 71;
                    int i214 = (i212 | 71) & (~i213);
                    int i33 = i213 << 1;
                    int i34 = (i214 ^ i33) + ((i214 & i33) << 1);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                }
                ActivityRoster activityRoster3 = ActivityRoster.this;
                activityRoster3.M(activityRoster3.br);
                ActivityRoster activityRoster4 = ActivityRoster.this;
                int i36 = b;
                int i37 = ((i36 & 126) + (i36 | 126)) - 1;
                a = i37 % 128;
                int i38 = i37 % 2;
                double d2 = activityRoster4.br;
                if (d2 <= 0.0d) {
                    int i39 = b;
                    int i40 = (i39 & (-66)) | ((~i39) & 65);
                    int i41 = -(-((i39 & 65) << 1));
                    int i42 = (i40 & i41) + (i41 | i40);
                    int i43 = i42 % 128;
                    a = i43;
                    int i44 = i42 % 2;
                    if (d2 == 0.0d) {
                        int i45 = i43 ^ 89;
                        int i46 = ((((i43 & 89) | i45) << 1) - (~(-i45))) - 1;
                        b = i46 % 128;
                        int i47 = i46 % 2;
                        if (i > 0) {
                            activityRoster4.H(d2);
                            int i48 = b;
                            int i49 = (i48 ^ 87) + ((i48 & 87) << 1);
                            a = i49 % 128;
                            int i50 = i49 % 2;
                        }
                    }
                } else {
                    activityRoster4.H(d2);
                    int i410 = b;
                    int i411 = (i410 ^ 87) + ((i410 & 87) << 1);
                    a = i411 % 128;
                    int i51 = i411 % 2;
                }
            }
            int i52 = a;
            int i53 = i52 & 71;
            int i54 = (i52 | 71) & (~i53);
            int i55 = i53 << 1;
            int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
            b = i56 % 128;
            if (i56 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 85) << 1) - (((~i2) & 85) | (i2 & (-86)));
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooOOO extends CountDownTimer {
        private static int a = 0;
        private static int b = 1;

        public OooOOO(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int i = 2 % 2;
            try {
                TextView textView = ActivityRoster.this.textViewTimeRemaining;
                StringBuilder sb = new StringBuilder();
                int i2 = a;
                int i3 = ((i2 ^ 115) - (~((i2 & 115) << 1))) - 1;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    sb.append("Time Remaining : ");
                    int i4 = 28 / 0;
                } else {
                    sb.append("Time Remaining : ");
                }
                sb.append((int) (j / 1000));
                textView.setText(sb.toString());
                int i5 = a;
                int i6 = i5 | 23;
                int i7 = i6 << 1;
                int i8 = -((~(i5 & 23)) & i6);
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                b = i9 % 128;
                int i10 = i9 % 2;
                ActivityRoster.this.btn_save.setEnabled(false);
                ActivityRoster activityRoster = ActivityRoster.this;
                int i11 = a;
                int i12 = i11 & 53;
                int i13 = (((i11 | 53) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    activityRoster.bc = false;
                } else {
                    activityRoster.bc = true;
                }
                int i14 = a;
                int i15 = ((i14 ^ 87) - (~(-(-((i14 & 87) << 1))))) - 1;
                b = i15 % 128;
                if (i15 % 2 == 0) {
                    throw null;
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-64)) | ((~i2) & 63);
            int i4 = (i2 & 63) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    ActivityRoster.this.textViewTimeRemaining.setVisibility(86);
                } else {
                    ActivityRoster.this.textViewTimeRemaining.setVisibility(8);
                }
                ActivityRoster activityRoster = ActivityRoster.this;
                int i6 = b;
                int i7 = (i6 & 99) + (i6 | 99);
                a = i7 % 128;
                int i8 = i7 % 2;
                activityRoster.btn_save.setEnabled(true);
                int i9 = a;
                int i10 = ((i9 | 63) << 1) - (i9 ^ 63);
                b = i10 % 128;
                int i11 = i10 % 2;
            } catch (Exception unused) {
            }
        }
    }

    public class OooOOO0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooOOO0(ActivityRoster activityRoster) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b + 65;
            a = i3 % 128;
            int i4 = i3 % 2;
            dialogInterface.dismiss();
            int i5 = b;
            int i6 = (((i5 ^ 63) | (i5 & 63)) << 1) - (((~i5) & 63) | (i5 & (-64)));
            a = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    public class OooOOOO implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooOOOO(ActivityRoster activityRoster) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 59) << 1) - (i3 ^ 59);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                dialogInterface.cancel();
                dialogInterface.dismiss();
                int i5 = 52 / 0;
            } else {
                dialogInterface.cancel();
                dialogInterface.dismiss();
            }
            int i6 = b;
            int i7 = ((i6 | 3) << 1) - (i6 ^ 3);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooOo extends Handler {
        private static int a = 0;
        private static int b = 1;

        public OooOo() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ActivityRoster activityRoster;
            int i = 2 % 2;
            int i2 = b + 42;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = message.what;
                throw null;
            }
            if (message.what == 0) {
                int i5 = a;
                int i6 = (((i5 | 82) << 1) - (i5 ^ 82)) - 1;
                b = i6 % 128;
                int i7 = i6 % 2;
                ActivityRoster activityRoster2 = ActivityRoster.this;
                if (!(!activityRoster2.bF)) {
                    int i8 = b;
                    int i9 = (i8 ^ 58) + ((i8 & 58) << 1);
                    int i10 = (i9 ^ (-1)) + (i9 << 1);
                    a = i10 % 128;
                    if (i10 % 2 != 0) {
                        activityRoster2.bA = e.c(activityRoster2.bx);
                        activityRoster = ActivityRoster.this;
                        int i11 = 33 / 0;
                    } else {
                        activityRoster2.bA = e.c(activityRoster2.bx);
                        activityRoster = ActivityRoster.this;
                    }
                    int i12 = a + 105;
                    b = i12 % 128;
                    if (i12 % 2 == 0) {
                        activityRoster.ai.setImageBitmap(activityRoster.bA);
                        int i13 = 76 / 0;
                    } else {
                        activityRoster.ai.setImageBitmap(activityRoster.bA);
                    }
                    int i14 = b;
                    int i15 = (i14 & (-78)) | ((~i14) & 77);
                    int i16 = (i14 & 77) << 1;
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            int i19 = b + 23;
            a = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    public class OooOo00 implements Runnable {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ String c;

        public OooOo00(String str) {
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-86)) | ((~i2) & 85);
            int i4 = (i2 & 85) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            Toast.makeText(i5 % 2 == 0 ? ActivityRoster.this.ae : ActivityRoster.this.ae, this.c, 0).show();
            int i6 = a;
            int i7 = ((i6 ^ 121) - (~((i6 & 121) << 1))) - 1;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }
    }

    public class Oooo0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public Oooo0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 95;
            int i5 = (i3 | 95) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            ActivityRoster.B(ActivityRoster.this);
            int i9 = a;
            int i10 = (i9 & (-114)) | ((~i9) & 113);
            int i11 = -(-((i9 & 113) << 1));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public class Oooo000 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public Oooo000() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 121) | (i3 & 121)) << 1;
            int i5 = -(((~i3) & 121) | (i3 & (-122)));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            (i6 % 2 != 0 ? Toast.makeText(ActivityRoster.this.getApplicationContext(), "Application will not work correctly without permissions.", 0) : Toast.makeText(ActivityRoster.this.getApplicationContext(), "Application will not work correctly without permissions.", 1)).show();
            int i7 = a;
            int i8 = i7 & 113;
            int i9 = ((i7 | 113) & (~i8)) + (i8 << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 29 / 0;
            }
        }
    }

    public class o000oOoO implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public o000oOoO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 ^ 115) + ((i3 & 115) << 1);
            a = i4 % 128;
            Toast.makeText(i4 % 2 == 0 ? ActivityRoster.this.getApplicationContext() : ActivityRoster.this.getApplicationContext(), "Application will not work correctly without permissions.", 1).show();
        }
    }

    public class o00O0O implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ Spinner c;

        public o00O0O(ActivityRoster activityRoster, Spinner spinner) {
            this.c = spinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 53;
            int i5 = i4 + ((i3 ^ 53) | i4);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            Object obj = null;
            if (i != 0) {
                this.c.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i8 = a + 125;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i9 = i6 & 27;
            int i10 = i6 | 27;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            this.c.setBackgroundResource(R.drawable.spinner_bg);
            int i13 = b;
            int i14 = (((i13 & (-36)) | ((~i13) & 35)) - (~(-(-((i13 & 35) << 1))))) - 1;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 11;
            int i4 = (((i2 | 11) & (~i3)) - (~(i3 << 1))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public class o00Ooo implements J {
        private static int a = 1;
        private static int b;

        public o00Ooo() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            Item item;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-44)) | ((~i2) & 43)) + ((i2 & 43) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            ActivityRoster.this.aN = arrayList;
            int i5 = a;
            int i6 = (i5 | 93) << 1;
            int i7 = -(i5 ^ 93);
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (true) {
                if (i10 >= ActivityRoster.this.aN.size()) {
                    int i11 = b;
                    int i12 = (i11 & (-38)) | ((~i11) & 37);
                    int i13 = -(-((i11 & 37) << 1));
                    int i14 = (i12 & i13) + (i13 | i12);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    i10 = 0;
                    break;
                }
                int i16 = b;
                int i17 = i16 & 27;
                int i18 = -(-((i16 ^ 27) | i17));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    item = ActivityRoster.this.aN.get(i10);
                    int i20 = 53 / 0;
                } else {
                    item = ActivityRoster.this.aN.get(i10);
                }
                int optionId = item.getOptionId();
                ActivityRoster activityRoster = ActivityRoster.this;
                int i21 = b;
                int i22 = (i21 & 112) + (i21 | 112);
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                a = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = activityRoster.bn.disability;
                    throw null;
                }
                if (optionId == activityRoster.bn.disability) {
                    break;
                }
                i10 = (-2) - ((i10 + 2) ^ (-1));
                int i25 = a;
                int i26 = i25 ^ 101;
                int i27 = -(-((i25 & 101) << 1));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                b = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = 5 / 3;
                }
            }
            ActivityRoster activityRoster2 = ActivityRoster.this;
            if (activityRoster2.bn.disability != 6) {
                activityRoster2.sp_disability.setSelection(i10);
                Spinner spinner = ActivityRoster.this.sp_disability;
                int i30 = b;
                int i31 = ((i30 | 1) << 1) - (i30 ^ 1);
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    spinner.setEnabled(false);
                } else {
                    spinner.setEnabled(true);
                }
                int i32 = b + 37;
                a = i32 % 128;
                int i33 = i32 % 2;
                return;
            }
            int i34 = b;
            int i35 = (((i34 | 108) << 1) - (i34 ^ 108)) - 1;
            a = i35 % 128;
            int i36 = i35 % 2;
            activityRoster2.sp_disability.setEnabled(false);
            ActivityRoster activityRoster3 = ActivityRoster.this;
            int i37 = a;
            int i38 = i37 ^ 67;
            int i39 = (((i37 & 67) | i38) << 1) - i38;
            b = i39 % 128;
            int i40 = i39 % 2;
            activityRoster3.sp_disability.setSelection(1);
            int i41 = b;
            int i42 = ((i41 ^ 119) - (~((i41 & 119) << 1))) - 1;
            a = i42 % 128;
            if (i42 % 2 == 0) {
                int i43 = 96 / 0;
            }
        }
    }

    public class o0OOO0o implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public o0OOO0o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & (-26)) | ((~i3) & 25);
            int i5 = (i3 & 25) << 1;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            Spinner spinner = ActivityRoster.this.sp_highest_education;
            if (i7 != 0) {
                spinner.setSelection(i);
            } else {
                spinner.setSelection(i);
                int i8 = 68 / 0;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 43) << 1) - (i2 ^ 43);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class o0OoOo0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public o0OoOo0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 101;
            int i5 = (i3 | 101) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            ActivityRoster.B(ActivityRoster.this);
            int i9 = a;
            int i10 = i9 & 57;
            int i11 = i10 + ((i9 ^ 57) | i10);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Survey u(ActivityRoster activityRoster) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 59;
        q = i3 % 128;
        int i4 = i3 % 2;
        Survey survey = activityRoster.ba;
        if (i4 != 0) {
            int i5 = 91 / 0;
        }
        int i6 = i2 + 89;
        q = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 81 / 0;
        }
        return survey;
    }

    public static /* synthetic */ byte[] v(ActivityRoster activityRoster) {
        int i = 2 % 2;
        int i2 = (-2) - ((p + 70) ^ (-1));
        int i3 = i2 % 128;
        q = i3;
        int i4 = i2 % 2;
        byte[] bArr = activityRoster.aZ;
        int i5 = i3 + 49;
        p = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    public static /* synthetic */ ArrayList x(ActivityRoster activityRoster) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 & 91) + (i2 | 91);
        p = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<Roster> arrayList = activityRoster.bj;
        if (i4 == 0) {
            int i5 = 93 / 0;
        }
        return arrayList;
    }

    public static /* synthetic */ boolean y(ActivityRoster activityRoster, boolean z, String str) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (((i2 | 48) << 1) - (i2 ^ 48)) - 1;
        q = i3 % 128;
        int i4 = i3 % 2;
        boolean zN = activityRoster.N(z, str);
        if (i4 != 0) {
            int i5 = 26 / 0;
        }
        return zN;
    }

    public void H(double d) {
        int i = 2 % 2;
        int i2 = q + 115;
        p = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (this.sp_relation_to_household.getSelectedItemPosition() != 0) {
            int i4 = q;
            int i5 = (((i4 ^ 71) | (i4 & 71)) << 1) - (((~i4) & 71) | (i4 & (-72)));
            p = i5 % 128;
            if (i5 % 2 == 0) {
                this.aL.get(this.sp_relation_to_household.getSelectedItemPosition());
                throw null;
            }
            Item item = this.aL.get(this.sp_relation_to_household.getSelectedItemPosition());
            int i6 = p;
            int i7 = (((i6 | 98) << 1) - (i6 ^ 98)) - 1;
            q = i7 % 128;
            int i8 = i7 % 2;
            if (item.getOptionId() == 186) {
                int i9 = p;
                int i10 = i9 & 57;
                int i11 = -(-((i9 ^ 57) | i10));
                int i12 = (i10 & i11) + (i10 | i11);
                q = i12 % 128;
                if (i12 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (d < 18.0d) {
                    int i13 = (i9 ^ 43) + ((i9 & 43) << 1);
                    q = i13 % 128;
                    int i14 = i13 % 2;
                    C0104p.c().d(this.ae, "Warning", "You can't add household of age less than 18 years?", new C(this, 0), false);
                    int i15 = q + 39;
                    p = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
        }
        int i17 = q;
        int i18 = i17 & 49;
        int i19 = (i17 | 49) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        p = i21 % 128;
        if (i21 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r5 = (r6 | 25) << 1;
        r6 = -(r6 ^ 25);
        r1 = (r5 & r6) + (r5 | r6);
        ivas.gov.bisp.enumeration.ActivityRoster.q = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r6 = r6 + 5;
        ivas.gov.bisp.enumeration.ActivityRoster.q = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(boolean r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            ivas.gov.bisp.enumeration.ActivityRoster$OooOo00 r1 = new ivas.gov.bisp.enumeration.ActivityRoster$OooOo00
            r1.<init>(r6)
            r4.runOnUiThread(r1)
            int r6 = ivas.gov.bisp.enumeration.ActivityRoster.p
            int r1 = r6 + 78
            r2 = r1 ^ (-1)
            r3 = 1
            int r1 = r1 << r3
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.ActivityRoster.q = r1
            int r2 = r2 % r0
            r1 = 0
            if (r2 == 0) goto L22
            r2 = 27
            int r2 = r2 / r1
            if (r5 == 0) goto L2c
            goto L24
        L22:
            if (r5 == 0) goto L2c
        L24:
            int r6 = r6 + 5
            int r5 = r6 % 128
            ivas.gov.bisp.enumeration.ActivityRoster.q = r5
            int r6 = r6 % r0
            return r1
        L2c:
            r5 = r6 | 25
            int r5 = r5 << r3
            r6 = r6 ^ 25
            int r6 = -r6
            r1 = r5 & r6
            r5 = r5 | r6
            int r1 = r1 + r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.ActivityRoster.q = r5
            int r1 = r1 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ActivityRoster.N(boolean, java.lang.String):boolean");
    }

    public final void R() {
        int i = 2 % 2;
        C0104p.c().h(this, "Confirm", "Do you want to scan CNIC again?", new DialogInterfaceOnClickListenerC0212s(this, 1), new C(this, 1), false);
        int i2 = p + 87;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034 A[Catch: Exception -> 0x0047, TRY_ENTER, TryCatch #1 {Exception -> 0x0047, blocks: (B:8:0x001b, B:11:0x0034, B:13:0x003c, B:15:0x0044), top: B:25:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #1 {Exception -> 0x0047, blocks: (B:8:0x001b, B:11:0x0034, B:13:0x003c, B:15:0x0044), top: B:25:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:25:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @OnClick
    public void onCnicImageClick(View view) {
        P pE;
        AppCompatActivity appCompatActivity;
        P pE2;
        byte[] bArr;
        int i;
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = (i3 & 109) + (i3 | 109);
        q = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr2 = this.aZ;
        if (i5 != 0) {
            int i6 = 7 / 0;
            if (bArr2 != null) {
                try {
                    pE = P.e();
                    appCompatActivity = this.ae;
                    pE2 = P.e();
                    bArr = this.aZ;
                    i = q + 105;
                    p = i % 128;
                    if (i % 2 != 0) {
                        pE.h(appCompatActivity, pE2.g(bArr), "Picture");
                        return;
                    }
                    pE.h(appCompatActivity, pE2.g(bArr), "Picture");
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Exception unused) {
                }
            }
        } else if (bArr2 != null) {
            pE = P.e();
            appCompatActivity = this.ae;
            pE2 = P.e();
            bArr = this.aZ;
            i = q + 105;
            p = i % 128;
            if (i % 2 != 0) {
                pE.h(appCompatActivity, pE2.g(bArr), "Picture");
                return;
            } else {
                pE.h(appCompatActivity, pE2.g(bArr), "Picture");
                throw null;
            }
        }
        int i7 = p + 77;
        q = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 42 / 0;
        }
    }

    @OnClick
    public void onCnicPic(View view) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 ^ 47) + ((i2 & 47) << 1);
        p = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
        int i4 = i3 % 128;
        p = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 33;
        int i7 = (((i4 ^ 33) | i6) << 1) - ((i4 | 33) & (~i6));
        q = i7 % 128;
        if (i7 % 2 == 0) {
            return R.layout.activity_roster;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @OnClick
    public void scanClicked(View view) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 79;
        int i4 = i3 + ((i2 ^ 79) | i3);
        p = i4 % 128;
        int i5 = i4 % 2;
    }

    public class o000OOo extends AsyncTask<Void, Void, Void> {
        private static int a = 0;
        private static int b = 1;
        public ArrayList<question_options> c = new ArrayList<>();
        public int d;
        public a e;

        public o000OOo(int i, a aVar) {
            this.d = i;
            this.e = aVar;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r6) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 87;
            int i4 = -(-((i2 ^ 87) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            super.onPostExecute(r6);
            a aVar = this.e;
            int i7 = a;
            int i8 = (i7 & (-18)) | ((~i7) & 17);
            int i9 = -(-((i7 & 17) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                aVar.b(this.c, this.d);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            aVar.b(this.c, this.d);
            int i11 = a + 19;
            b = i11 % 128;
            int i12 = i11 % 2;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 115) + ((i2 & 115) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            ArrayList<question_options> arrayList = new ArrayList<>(AppDatabase.l(ActivityRoster.this.getApplicationContext()).m().ah("martial_status"));
            int i5 = a;
            int i6 = ((i5 ^ 122) + ((i5 & 122) << 1)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            this.c = arrayList;
            int i8 = i5 + 97;
            b = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
    }

    public class o00Oo0 implements J {
        private static int a = 0;
        private static int b = 1;

        public o00Oo0() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            Object obj;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 25;
            int i4 = (i2 & 25) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            ActivityRoster.this.aI = arrayList;
            int i7 = a;
            int i8 = (i7 & 55) + (i7 | 55);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 / 5;
            }
            int i10 = 0;
            while (true) {
                obj = null;
                if (i10 >= ActivityRoster.this.aI.size()) {
                    int i11 = a;
                    int i12 = i11 ^ 109;
                    int i13 = -(-((i11 & 109) << 1));
                    int i14 = (i12 & i13) + (i13 | i12);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 5 / 3;
                    }
                    i10 = 0;
                    break;
                }
                int i16 = a;
                int i17 = i16 & 67;
                int i18 = (((i16 | 67) & (~i17)) - (~(i17 << 1))) - 1;
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    ActivityRoster.this.aI.get(i10);
                    throw null;
                }
                int optionId = ActivityRoster.this.aI.get(i10).getOptionId();
                ActivityRoster activityRoster = ActivityRoster.this;
                int i19 = b;
                int i20 = i19 & 113;
                int i21 = -(-((i19 ^ 113) | i20));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = activityRoster.bn.marital_status;
                    throw null;
                }
                if (optionId == activityRoster.bn.marital_status) {
                    break;
                }
                int i24 = b;
                int i25 = (i24 ^ 47) + ((i24 & 47) << 1);
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = (((i10 & (-28)) | ((~i10) & 27)) - (~(-(-((i10 & 27) << 1))))) - 1;
                    i10 = ((i26 & 25) | ((~i26) & (-26))) + ((i26 & (-26)) << 1);
                } else {
                    i10++;
                }
                int i27 = i24 & 43;
                int i28 = -(-((i24 ^ 43) | i27));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                a = i29 % 128;
                int i30 = i29 % 2;
            }
            ActivityRoster.this.sp_marital_status.setSelection(i10);
            ActivityRoster activityRoster2 = ActivityRoster.this;
            int i31 = b;
            int i32 = ((i31 | 21) << 1) - (i31 ^ 21);
            a = i32 % 128;
            int i33 = i32 % 2;
            activityRoster2.sp_marital_status.setEnabled(false);
            int i34 = b + 99;
            a = i34 % 128;
            if (i34 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class o0Oo0oo extends AsyncTask<Void, Integer, Boolean> {
        private static int a = 0;
        private static int b = 1;
        public ProgressDialog c;
        public Context d;
        public String e = BuildConfig.FLAVOR;

        public o0Oo0oo(Context context) {
            this.d = context;
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = b + 71;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                return c();
            }
            c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            ProgressDialog progressDialog;
            int i = 2 % 2;
            try {
                ProgressDialog progressDialog2 = new ProgressDialog(this.d);
                int i2 = a;
                int i3 = (i2 & 5) + (i2 | 5);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    this.c = progressDialog2;
                    progressDialog2.setCancelable(true);
                } else {
                    this.c = progressDialog2;
                    progressDialog2.setCancelable(false);
                }
                ProgressDialog progressDialog3 = this.c;
                int i4 = b;
                int i5 = (i4 | 125) << 1;
                int i6 = -(i4 ^ 125);
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    progressDialog3.setTitle("Validating roster");
                    progressDialog = this.c;
                    int i8 = 19 / 0;
                } else {
                    progressDialog3.setTitle("Validating roster");
                    progressDialog = this.c;
                }
                progressDialog.setMessage("Please Wait...");
                this.c.setIndeterminate(true);
                int i9 = a;
                int i10 = ((i9 ^ 113) - (~(-(-((i9 & 113) << 1))))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                this.c.show();
                int i12 = b;
                int i13 = i12 & 69;
                int i14 = i13 + ((i12 ^ 69) | i13);
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 94 / 0;
                }
            } catch (Exception unused) {
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0037  */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x012b, code lost:
        
            if (ivas.gov.bisp.enumeration.p024ax.ax.c(r7.f) != false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0134, code lost:
        
            if (ivas.gov.bisp.enumeration.p024ax.ax.c(r7.f) != false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
        
            r7.f.L();
            r8 = ivas.gov.bisp.enumeration.ActivityRoster.o0Oo0oo.b;
            r1 = (r8 & (-82)) | ((~r8) & 81);
            r8 = (r8 & 81) << 1;
            r2 = ((r1 | r8) << 1) - (r8 ^ r1);
            ivas.gov.bisp.enumeration.ActivityRoster.o0Oo0oo.a = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0151, code lost:
        
            r7.f.L();
            r8 = ivas.gov.bisp.enumeration.ActivityRoster.o0Oo0oo.a;
            r2 = (((r8 | 58) << 1) - (r8 ^ 58)) - 1;
            ivas.gov.bisp.enumeration.ActivityRoster.o0Oo0oo.b = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0164, code lost:
        
            return;
         */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(java.lang.Boolean r8) {
            /*
                Method dump skipped, instruction units count: 456
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ActivityRoster.o0Oo0oo.onPostExecute(java.lang.Object):void");
        }

        /* JADX WARN: Code duplicated, block: B:170:0x04e9 A[Catch: Exception -> 0x0c64, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:186:0x0552 A[Catch: Exception -> 0x0c64, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:204:0x05a7 A[Catch: Exception -> 0x0c64, PHI: r0
  0x05a7: PHI (r0v205 ivas.gov.bisp.enumeration.ActivityRoster) = (r0v204 ivas.gov.bisp.enumeration.ActivityRoster), (r0v220 ivas.gov.bisp.enumeration.ActivityRoster) binds: [B:203:0x05a5, B:198:0x059a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:206:0x05af  */
        /* JADX WARN: Code duplicated, block: B:208:0x05c8 A[Catch: Exception -> 0x0c64, TRY_ENTER, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:210:0x05d4 A[Catch: Exception -> 0x0c64, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:274:0x072a A[Catch: Exception -> 0x0c64, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:276:0x0736  */
        /* JADX WARN: Code duplicated, block: B:278:0x0749 A[Catch: Exception -> 0x0c64, TRY_ENTER, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:280:0x074c A[Catch: Exception -> 0x0c64, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:285:0x0754 A[Catch: Exception -> 0x0c64, TRY_ENTER, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:287:0x075e A[Catch: Exception -> 0x0c64, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:289:0x0768  */
        /* JADX WARN: Code duplicated, block: B:291:0x0777 A[Catch: Exception -> 0x0c64, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:297:0x0788 A[Catch: Exception -> 0x0c64, TRY_ENTER, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:300:0x0796 A[Catch: Exception -> 0x0c64, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:303:0x07aa A[Catch: Exception -> 0x0c64, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:305:0x07c1 A[Catch: Exception -> 0x0c64, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:308:0x07d9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:309:0x07da  */
        /* JADX WARN: Code duplicated, block: B:311:0x07de A[Catch: Exception -> 0x0c64, TRY_ENTER, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:313:0x07f9 A[Catch: Exception -> 0x0c64, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:316:0x0816 A[Catch: Exception -> 0x0c64, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:319:0x0825 A[Catch: Exception -> 0x0c64, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:323:0x082d A[Catch: Exception -> 0x0c64, TRY_ENTER, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:326:0x0841 A[Catch: Exception -> 0x0c64, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:328:0x084b  */
        /* JADX WARN: Code duplicated, block: B:332:0x086f A[Catch: Exception -> 0x0c64, TRY_ENTER, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:334:0x0875 A[Catch: Exception -> 0x0c64, TRY_LEAVE, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:339:0x0880 A[Catch: Exception -> 0x0c64, TRY_ENTER, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:457:0x0c16  */
        /* JADX WARN: Code duplicated, block: B:87:0x0252 A[Catch: Exception -> 0x0c64, TRY_ENTER, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x0268 A[Catch: Exception -> 0x0c64, TryCatch #17 {Exception -> 0x0c64, blocks: (B:3:0x0007, B:5:0x001f, B:8:0x0039, B:10:0x0040, B:14:0x0044, B:16:0x004a, B:21:0x007e, B:23:0x0088, B:25:0x0097, B:27:0x009f, B:29:0x00b1, B:31:0x00bf, B:32:0x00c7, B:33:0x00ce, B:36:0x00d1, B:38:0x00e7, B:41:0x010f, B:43:0x011d, B:45:0x0132, B:49:0x0152, B:50:0x015b, B:55:0x0168, B:54:0x015f, B:58:0x0174, B:60:0x018a, B:62:0x01a5, B:64:0x01ad, B:67:0x01c3, B:69:0x01e2, B:71:0x01ee, B:73:0x0202, B:76:0x020f, B:79:0x0232, B:81:0x023c, B:83:0x0248, B:84:0x024f, B:87:0x0252, B:89:0x0268, B:91:0x0274, B:93:0x027e, B:95:0x028c, B:97:0x02a2, B:99:0x02b8, B:101:0x02ce, B:103:0x02dc, B:107:0x0305, B:109:0x030d, B:110:0x0314, B:111:0x0317, B:114:0x031a, B:117:0x032d, B:121:0x0344, B:122:0x034a, B:127:0x0354, B:126:0x034e, B:129:0x035c, B:131:0x036e, B:134:0x0394, B:136:0x03a6, B:141:0x03d4, B:139:0x03be, B:143:0x03e2, B:145:0x0408, B:148:0x0428, B:150:0x042b, B:151:0x042d, B:154:0x0430, B:182:0x052e, B:157:0x044c, B:161:0x0476, B:164:0x0492, B:167:0x04b4, B:169:0x04b8, B:171:0x0505, B:173:0x050f, B:175:0x0517, B:170:0x04e9, B:177:0x0521, B:178:0x0528, B:179:0x052b, B:184:0x053c, B:186:0x0552, B:188:0x056a, B:190:0x0570, B:195:0x0591, B:197:0x0599, B:228:0x0641, B:230:0x064b, B:232:0x0659, B:235:0x0670, B:238:0x068d, B:240:0x0691, B:244:0x0695, B:246:0x0698, B:248:0x06a2, B:250:0x06aa, B:253:0x06c0, B:256:0x06d8, B:258:0x06e2, B:260:0x06ec, B:262:0x06fa, B:255:0x06ce, B:263:0x0704, B:267:0x0720, B:340:0x088a, B:342:0x0897, B:345:0x08b1, B:350:0x08d6, B:353:0x08f4, B:355:0x08fa, B:356:0x08ff, B:348:0x08c4, B:359:0x0902, B:361:0x0906, B:363:0x090e, B:366:0x091b, B:368:0x0927, B:371:0x0944, B:377:0x0981, B:381:0x09a9, B:383:0x09bf, B:385:0x09d7, B:387:0x09ed, B:389:0x0a05, B:393:0x0a1b, B:395:0x0a29, B:396:0x0a38, B:399:0x0a3b, B:401:0x0a62, B:403:0x0a6a, B:407:0x0a81, B:414:0x0aa4, B:415:0x0ab0, B:416:0x0ab3, B:419:0x0ab6, B:421:0x0ace, B:423:0x0aed, B:425:0x0af2, B:427:0x0b05, B:429:0x0b17, B:431:0x0b2d, B:433:0x0b44, B:438:0x0b64, B:440:0x0b6d, B:439:0x0b69, B:442:0x0b80, B:444:0x0b9c, B:446:0x0bae, B:448:0x0bc4, B:452:0x0bed, B:454:0x0c00, B:456:0x0c0b, B:458:0x0c17, B:460:0x0c1c, B:464:0x0c40, B:466:0x0c56, B:274:0x072a, B:278:0x0749, B:280:0x074c, B:281:0x074e, B:282:0x0751, B:285:0x0754, B:287:0x075e, B:291:0x0777, B:293:0x0784, B:298:0x0793, B:297:0x0788, B:301:0x07a0, B:303:0x07aa, B:305:0x07c1, B:311:0x07de, B:313:0x07f9, B:316:0x0816, B:319:0x0825, B:320:0x082a, B:324:0x0837, B:326:0x0841, B:329:0x085c, B:332:0x086f, B:334:0x0875, B:335:0x087a, B:336:0x087d, B:339:0x0880, B:323:0x082d, B:300:0x0796, B:204:0x05a7, B:208:0x05c8, B:210:0x05d4, B:211:0x05d8, B:202:0x059f, B:214:0x05db, B:217:0x05f8, B:219:0x0600, B:221:0x060a, B:224:0x0624, B:226:0x063b, B:468:0x0c59, B:469:0x0c5e, B:470:0x0c61), top: B:510:0x0007 }] */
        /* JADX WARN: Code restructure failed: missing block: B:349:0x08d4, code lost:
        
            if (r1.get(r0.getSelectedItemPosition()).getOptionId() == 271) goto L350;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Boolean c() {
            /*
                Method dump skipped, instruction units count: 3182
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ActivityRoster.o0Oo0oo.c():java.lang.Boolean");
        }
    }

    public class o0ooOOo implements J {
        private static int a = 0;
        private static int b = 1;

        public o0ooOOo() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            ActivityRoster activityRoster;
            ActivityRoster activityRoster2;
            BISPApplication bISPApplication;
            int i = 2 % 2;
            int i2 = a + 93;
            b = i2 % 128;
            int i3 = 0;
            if (i2 % 2 == 0) {
                activityRoster = ActivityRoster.this;
                activityRoster.be = arrayList;
                int i4 = 68 / 0;
            } else {
                activityRoster = ActivityRoster.this;
                activityRoster.be = arrayList;
            }
            int i5 = b;
            int i6 = i5 & 27;
            int i7 = (i5 | 27) & (~i6);
            int i8 = i6 << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                activityRoster.E(arrayList, activityRoster.sp_employment_status);
                activityRoster2 = ActivityRoster.this;
                bISPApplication = activityRoster2.bw;
                int i10 = 42 / 0;
            } else {
                activityRoster.E(arrayList, activityRoster.sp_employment_status);
                activityRoster2 = ActivityRoster.this;
                bISPApplication = activityRoster2.bw;
            }
            bISPApplication.M = activityRoster2.be;
            int i11 = b;
            int i12 = (i11 & 33) + (i11 | 33);
            a = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (i14 < ActivityRoster.this.be.size()) {
                int i15 = a;
                int i16 = (((i15 & (-58)) | ((~i15) & 57)) - (~(-(-((i15 & 57) << 1))))) - 1;
                b = i16 % 128;
                int i17 = i16 % 2;
                int optionId = ActivityRoster.this.be.get(i14).getOptionId();
                int i18 = b;
                int i19 = i18 & 103;
                int i20 = (i18 ^ 103) | i19;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                a = i21 % 128;
                int i22 = i21 % 2;
                if (optionId == ActivityRoster.this.bn.employment_status) {
                    int i23 = a;
                    int i24 = ((i23 ^ 69) | (i23 & 69)) << 1;
                    int i25 = -((i23 & (-70)) | ((~i23) & 69));
                    int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                    b = i26 % 128;
                    if (i26 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i27 = ((i23 ^ 55) | (i23 & 55)) << 1;
                    int i28 = -(((~i23) & 55) | (i23 & (-56)));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    i3 = i14;
                    break;
                }
                int i31 = i14 & 6;
                int i32 = i14 | 6;
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                i14 = (-2) - (((i33 & (-4)) + (i33 | (-4))) ^ (-1));
                int i34 = b;
                int i35 = (i34 | 81) << 1;
                int i36 = -(((~i34) & 81) | (i34 & (-82)));
                int i37 = (i35 & i36) + (i36 | i35);
                a = i37 % 128;
                if (i37 % 2 != 0) {
                    int i38 = 5 % 2;
                }
            }
            ActivityRoster.this.sp_employment_status.setSelection(i3);
            int i39 = b;
            int i40 = ((i39 ^ 124) + ((i39 & 124) << 1)) - 1;
            a = i40 % 128;
            int i41 = i40 % 2;
        }
    }

    public static boolean A(Context context, String... strArr) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = q;
        int i4 = (i3 & 89) + (i3 | 89);
        p = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (strArr != null) {
            int i5 = i3 & 75;
            int i6 = ((i3 ^ 75) | i5) << 1;
            int i7 = -((i3 | 75) & (~i5));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            p = i8 % 128;
            if (i8 % 2 == 0) {
                length = strArr.length;
                i = 1;
            } else {
                length = strArr.length;
                i = 0;
            }
            while (i < length) {
                int i9 = q;
                int i10 = i9 & 43;
                int i11 = (i9 | 43) & (~i10);
                int i12 = i10 << 1;
                int i13 = (i11 & i12) + (i11 | i12);
                p = i13 % 128;
                if (i13 % 2 == 0) {
                    l.b(context, strArr[i]);
                    obj.hashCode();
                    throw null;
                }
                if (l.b(context, strArr[i]) != 0) {
                    int i14 = q;
                    int i15 = i14 ^ 1;
                    int i16 = -(-((i14 & 1) << 1));
                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                    p = i17 % 128;
                    int i18 = i17 % 2;
                    return false;
                }
                int i19 = i & 1;
                int i20 = (i ^ 1) | i19;
                i = ((i20 & i19) << 1) + (i19 ^ i20);
                int i21 = q;
                int i22 = (((i21 & (-100)) | ((~i21) & 99)) - (~(-(-((i21 & 99) << 1))))) - 1;
                p = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        int i24 = p;
        int i25 = ((i24 | 60) << 1) - (i24 ^ 60);
        int i26 = (i25 ^ (-1)) + (i25 << 1);
        q = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 70 / 0;
        }
        return true;
    }

    public static void B(Activity activity) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        int i2 = p + 29;
        q = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            obj.hashCode();
            throw null;
        }
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivity(intent);
        int i3 = q;
        int i4 = ((i3 ^ 8) + ((i3 & 8) << 1)) - 1;
        p = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    public static boolean w(ActivityRoster activityRoster, double d, boolean z, boolean z2, boolean z3, String str) {
        boolean zN;
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 ^ 103;
        int i4 = (i2 & 103) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        p = i6;
        int i7 = i5 % 2;
        if (z2) {
            int i8 = (i6 & (-122)) | ((~i6) & 121);
            int i9 = (i6 & 121) << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            int i11 = i10 % 128;
            q = i11;
            Object obj = null;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!(!z3)) {
                if (d <= activityRoster.br) {
                    int i12 = i11 + 19;
                    p = i12 % 128;
                    if (i12 % 2 == 0) {
                        activityRoster.N(z, str);
                        throw null;
                    }
                    zN = activityRoster.N(z, str);
                    int i13 = p;
                    int i14 = ((i13 ^ 4) + ((i13 & 4) << 1)) - 1;
                    q = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 4 % 5;
                    }
                } else {
                    int i16 = q;
                    int i17 = i16 ^ 91;
                    int i18 = -(-((i16 & 91) << 1));
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    p = i19 % 128;
                    int i20 = i19 % 2;
                    zN = true;
                }
            } else if (d < activityRoster.br) {
                int i21 = i6 ^ 19;
                int i22 = -(-((i6 & 19) << 1));
                int i23 = (i21 & i22) + (i21 | i22);
                q = i23 % 128;
                if (i23 % 2 != 0) {
                    activityRoster.N(z, str);
                    throw null;
                }
                zN = activityRoster.N(z, str);
            } else {
                int i110 = q;
                int i111 = i110 ^ 91;
                int i112 = -(-((i110 & 91) << 1));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                p = i113 % 128;
                int i24 = i113 % 2;
                zN = true;
            }
        } else if (z3) {
            int i25 = i6 & 83;
            int i26 = (i25 - (~((i6 ^ 83) | i25))) - 1;
            int i27 = i26 % 128;
            q = i27;
            int i28 = i26 % 2;
            if (d >= activityRoster.br) {
                int i29 = i27 + 17;
                p = i29 % 128;
                int i30 = i29 % 2;
                zN = activityRoster.N(z, str);
                int i31 = q;
                int i32 = (i31 & 49) + (i31 | 49);
                p = i32 % 128;
                int i33 = i32 % 2;
            } else {
                int i114 = q;
                int i115 = i114 ^ 91;
                int i116 = -(-((i114 & 91) << 1));
                int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                p = i117 % 128;
                int i210 = i117 % 2;
                zN = true;
            }
        } else if (d > activityRoster.br) {
            int i34 = ((i6 | 117) << 1) - (i6 ^ 117);
            q = i34 % 128;
            int i35 = i34 % 2;
            zN = activityRoster.N(z, str);
            int i36 = q;
            int i37 = i36 ^ 99;
            int i38 = ((i36 & 99) | i37) << 1;
            int i39 = -i37;
            int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
            p = i40 % 128;
            int i41 = i40 % 2;
        } else {
            int i118 = q;
            int i119 = i118 ^ 91;
            int i1110 = -(-((i118 & 91) << 1));
            int i1111 = (i119 ^ i1110) + ((i1110 & i119) << 1);
            p = i1111 % 128;
            int i211 = i1111 % 2;
            zN = true;
        }
        int i42 = q;
        int i43 = i42 & 37;
        int i44 = (((i42 | 37) & (~i43)) - (~(i43 << 1))) - 1;
        p = i44 % 128;
        int i45 = i44 % 2;
        return zN;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00db  */
    /* JADX WARN: Code duplicated, block: B:20:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f3  */
    public final double G(int i, int i2, int i3, boolean z) {
        GregorianCalendar gregorianCalendarY;
        GregorianCalendar gregorianCalendarY2;
        double d;
        double d2;
        int i4;
        int i5 = 2 % 2;
        this.sp_marital_status.setSelection(0);
        StringBuilder sb = new StringBuilder();
        int i6 = p;
        int i7 = ((i6 | 27) << 1) - (i6 ^ 27);
        q = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        sb.append(i);
        sb.append("-");
        if (i8 != 0) {
            obj.hashCode();
            throw null;
        }
        int i9 = p;
        int i10 = i9 ^ 27;
        int i11 = (i9 & 27) << 1;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        q = i12 % 128;
        int i13 = i12 % 2;
        sb.append(i2);
        sb.append("-");
        int i14 = p;
        int i15 = ((i14 ^ 23) - (~((i14 & 23) << 1))) - 1;
        q = i15 % 128;
        if (i15 % 2 != 0) {
            sb.append(i3);
            sb.toString();
            obj.hashCode();
            throw null;
        }
        sb.append(i3);
        Date dateH = z.h(sb.toString(), "dd-MM-yyyy");
        Date date = new Date();
        int i16 = q;
        int i17 = i16 & 9;
        int i18 = -(-((i16 ^ 9) | i17));
        int i19 = (i17 & i18) + (i18 | i17);
        p = i19 % 128;
        if (i19 % 2 == 0) {
            gregorianCalendarY = j.y(dateH);
            gregorianCalendarY2 = j.y(date);
            int i20 = 18 / 0;
        } else {
            gregorianCalendarY = j.y(dateH);
            gregorianCalendarY2 = j.y(date);
        }
        int i21 = p;
        int i22 = i21 | 61;
        int i23 = ((i22 << 1) - (~(-((~(i21 & 61)) & i22)))) - 1;
        q = i23 % 128;
        int i24 = i23 % 2;
        int i25 = gregorianCalendarY2.get(1);
        int i26 = -gregorianCalendarY.get(1);
        int i27 = (i25 & i26) + (i25 | i26);
        int i28 = p + 83;
        int i29 = i28 % 128;
        q = i29;
        int i30 = i28 % 2;
        if (i27 > 115) {
            int i31 = ((i29 & (-120)) | ((~i29) & 119)) + ((i29 & 119) << 1);
            p = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 39 / 0;
                if (!(!z)) {
                    i4 = ((i29 & 44) + (i29 | 44)) - 1;
                    p = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.spinnerYear.setSelection(0);
                        this.spinnerMonth.setSelection(1);
                    } else {
                        this.spinnerYear.setSelection(0);
                        this.spinnerMonth.setSelection(0);
                    }
                    int i33 = p;
                    int i34 = i33 & 87;
                    int i35 = ((i33 ^ 87) | i34) << 1;
                    int i36 = -((i33 | 87) & (~i34));
                    int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                    q = i37 % 128;
                    int i38 = i37 % 2;
                }
            } else if (z) {
                i4 = ((i29 & 44) + (i29 | 44)) - 1;
                p = i4 % 128;
                if (i4 % 2 == 0) {
                    this.spinnerYear.setSelection(0);
                    this.spinnerMonth.setSelection(1);
                } else {
                    this.spinnerYear.setSelection(0);
                    this.spinnerMonth.setSelection(0);
                }
                int i39 = p;
                int i310 = i39 & 87;
                int i311 = ((i39 ^ 87) | i310) << 1;
                int i312 = -((i39 | 87) & (~i310));
                int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                q = i313 % 128;
                int i314 = i313 % 2;
            }
            double d3 = i27;
            int i40 = q;
            int i41 = (((i40 ^ 93) | (i40 & 93)) << 1) - (((~i40) & 93) | (i40 & (-94)));
            p = i41 % 128;
            if (i41 % 2 == 0) {
                int i42 = 54 / 0;
            }
            return d3;
        }
        int i43 = gregorianCalendarY2.get(2);
        int i44 = i43 & 1;
        int i45 = (i43 | 1) & (~i44);
        int i46 = i44 << 1;
        int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
        int i48 = p;
        int i49 = i48 & 101;
        int i50 = -(-(i48 | 101));
        int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
        q = i51 % 128;
        int i52 = i51 % 2;
        int i53 = gregorianCalendarY.get(2);
        if (i47 < (i53 ^ 1) + ((i53 & 1) << 1)) {
            int i54 = q + 103;
            p = i54 % 128;
            int i55 = i54 % 2;
            int i56 = gregorianCalendarY.get(2);
            int i57 = gregorianCalendarY2.get(2);
            int i58 = (i57 & 1) + (i57 | 1);
            int i59 = p;
            int i60 = (i59 & (-102)) | ((~i59) & 101);
            int i61 = (i59 & 101) << 1;
            int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
            q = i62 % 128;
            int i63 = i62 % 2;
            int i64 = i56 ^ 1;
            int i65 = ((i56 & 1) | i64) << 1;
            int i66 = -i64;
            int i67 = -((i65 & i66) + (i65 | i66));
            int i68 = i67 & 12;
            int i69 = -(-((i67 ^ 12) | i68));
            d2 = (i58 - (~(-(-(((i68 | i69) << 1) - (i69 ^ i68)))))) - 1;
            int i70 = ~i27;
            i27 = (((i70 | i27) << 1) - (~(-i70))) - 1;
            int i71 = i59 + 113;
            q = i71 % 128;
            int i72 = i71 % 2;
        } else {
            int i73 = gregorianCalendarY2.get(2);
            int i74 = i73 & 1;
            int i75 = i74 + ((i73 ^ 1) | i74);
            int i76 = p + 77;
            q = i76 % 128;
            if (i76 % 2 != 0) {
                d = i75 >> gregorianCalendarY.get(2);
            } else {
                int i77 = gregorianCalendarY.get(2);
                int i78 = -(((i77 & 2) + (i77 | 2)) - 1);
                int i79 = i75 & i78;
                int i80 = (i78 | i75) & (~i79);
                int i81 = -(-(i79 << 1));
                d = (i80 ^ i81) + ((i80 & i81) << 1);
            }
            d2 = d;
            int i82 = p;
            int i83 = ((i82 | 61) << 1) - (i82 ^ 61);
            q = i83 % 128;
            int i84 = i83 % 2;
        }
        String string = this.tv_dob.getText().toString();
        int i85 = p;
        int i86 = (i85 & (-8)) | (7 & (~i85));
        int i87 = (i85 & 7) << 1;
        int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
        q = i88 % 128;
        int i89 = i88 % 2;
        String strL = j.l(i, "-", i2, "-", i3);
        int i90 = p;
        int i91 = i90 & 69;
        int i92 = ((i90 | 69) & (~i91)) + (i91 << 1);
        q = i92 % 128;
        if (i92 % 2 != 0) {
            P(string, strL);
            obj.hashCode();
            throw null;
        }
        P(string, strL);
        if (z) {
            int i93 = (int) d2;
            this.spinnerYear.setSelection(i27);
            int i94 = q;
            int i95 = i94 & 93;
            int i96 = -(-((i94 ^ 93) | i95));
            int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
            p = i97 % 128;
            if (i97 % 2 == 0) {
                this.spinnerMonth.setSelection(i93);
                obj.hashCode();
                throw null;
            }
            this.spinnerMonth.setSelection(i93);
            int i98 = p;
            int i99 = i98 & 61;
            int i100 = ((i98 | 61) & (~i99)) + (i99 << 1);
            q = i100 % 128;
            int i101 = i100 % 2;
        }
        double d4 = i27;
        int i102 = q;
        int i103 = i102 & 13;
        int i104 = -(-((i102 ^ 13) | i103));
        int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
        p = i105 % 128;
        int i106 = i105 % 2;
        return d4;
    }

    public final void J() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (((i2 | 73) << 1) - (~(-(i2 ^ 73)))) - 1;
        q = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 89;
        int i6 = i5 + ((i2 ^ 89) | i5);
        q = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (i8 < this.radioGroupGender.getChildCount()) {
            int i9 = p;
            int i10 = ((((i9 ^ 87) | (i9 & 87)) << 1) - (~(-(((~i9) & 87) | (i9 & (-88)))))) - 1;
            q = i10 % 128;
            int i11 = i10 % 2;
            i8 = j.i(this.radioGroupGender, i8, true, i8, 1);
            int i12 = q;
            int i13 = i12 & 87;
            int i14 = -(-((i12 ^ 87) | i13));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            p = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = p + 94;
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        q = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 3 % 3;
        }
        int i20 = 0;
        while (i20 < this.radioGroupCalendar.getChildCount()) {
            int i21 = q;
            int i22 = (((i21 | 55) << 1) - (~(-(i21 ^ 55)))) - 1;
            p = i22 % 128;
            int i23 = i22 % 2;
            i20 = j.i(this.radioGroupCalendar, i20, true, i20, 1);
            int i24 = p;
            int i25 = i24 + 9;
            q = i25 % 128;
            if (i25 % 2 != 0) {
                throw null;
            }
            int i26 = i24 & 9;
            int i27 = ((i24 | 9) & (~i26)) + (i26 << 1);
            q = i27 % 128;
            int i28 = i27 % 2;
        }
        this.tv_dob.setEnabled(false);
        this.radioGroupGender.clearCheck();
        int i29 = q;
        int i30 = (i29 & 22) + (i29 | 22);
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        p = i31 % 128;
        int i32 = i31 % 2;
        this.radioGroupCalendar.clearCheck();
        this.tv_dob.setHint("Date of Birth");
        int i33 = q + 89;
        p = i33 % 128;
        int i34 = i33 % 2;
        this.tv_dob.setText(BuildConfig.FLAVOR);
        this.spinnerYear.setSelection(0);
        int i35 = p + 57;
        q = i35 % 128;
        if (i35 % 2 != 0) {
            this.spinnerMonth.setSelection(1);
        } else {
            this.spinnerMonth.setSelection(0);
        }
        int i36 = p;
        int i37 = (((i36 | 46) << 1) - (i36 ^ 46)) - 1;
        q = i37 % 128;
        if (i37 % 2 != 0) {
            int i38 = 40 / 0;
        }
    }

    public final void K() {
        int i = 2 % 2;
        int i2 = q + 17;
        p = i2 % 128;
        int i3 = i2 % 2;
        this.spinnerYear.setSelection(0);
        this.br = 0.0d;
        int i4 = q;
        int i5 = i4 & 99;
        int i6 = ((i4 ^ 99) | i5) << 1;
        int i7 = -((i4 | 99) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        p = i8 % 128;
        if (i8 % 2 == 0) {
            this.tv_dob.setText(BuildConfig.FLAVOR);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.tv_dob.setText(BuildConfig.FLAVOR);
        int i9 = q;
        int i10 = i9 ^ 109;
        int i11 = ((i9 & 109) | i10) << 1;
        int i12 = -i10;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        p = i13 % 128;
        if (i13 % 2 == 0) {
            this.bq = BuildConfig.FLAVOR;
        } else {
            this.bq = BuildConfig.FLAVOR;
        }
        this.linearLayoutCNIC.setVisibility(0);
        this.linearLayoutCNICPic.setVisibility(8);
        RadioGroup radioGroup = this.radioGroupCNICOptions;
        int i14 = q;
        int i15 = ((i14 ^ 35) | (i14 & 35)) << 1;
        int i16 = -(((~i14) & 35) | (i14 & (-36)));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        p = i17 % 128;
        if (i17 % 2 == 0) {
            radioGroup.setVisibility(94);
            this.et_RosterCNIC.setVisibility(95);
        } else {
            radioGroup.setVisibility(8);
            this.et_RosterCNIC.setVisibility(8);
        }
        this.et_RosterCNICRepeat.setVisibility(8);
        Button button = this.buttonScanCNIC;
        int i18 = p + 49;
        q = i18 % 128;
        if (i18 % 2 != 0) {
            button.setVisibility(78);
            this.btn_vald_cnic.setVisibility(91);
        } else {
            button.setVisibility(8);
            this.btn_vald_cnic.setVisibility(8);
        }
    }

    public final void P(String str, String str2) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 55;
        int i4 = i3 + ((i2 ^ 55) | i3);
        p = i4 % 128;
        if (i4 % 2 != 0) {
            this.tv_dob.setText(str);
            this.bq = str2;
        } else {
            this.tv_dob.setText(str);
            this.bq = str2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0O0 implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public OooO0O0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 7;
            int i4 = (((i2 ^ 7) | i3) << 1) - ((i2 | 7) & (~i3));
            a = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 | 24) << 1) - (i3 ^ 24);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            if (i == 0) {
                int i7 = i3 & 23;
                int i8 = (((i3 | 23) & (~i7)) - (~(-(-(i7 << 1))))) - 1;
                a = i8 % 128;
                int i9 = i8 % 2;
                ActivityRoster.this.sp_attended_school.setBackgroundResource(R.drawable.spinner_bg);
                int i10 = b;
                int i11 = i10 ^ 13;
                int i12 = (i10 & 13) << 1;
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                int i14 = i13 % 2;
            } else {
                ActivityRoster.this.sp_attended_school.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i15 = b;
                int i16 = i15 & 49;
                int i17 = ((i15 ^ 49) | i16) << 1;
                int i18 = -((i15 | 49) & (~i16));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
            }
            if (ActivityRoster.this.sp_attended_school.getSelectedItemPosition() != 0) {
                int i21 = b;
                int i22 = (i21 ^ 95) + ((i21 & 95) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
                ActivityRoster activityRoster = ActivityRoster.this;
                ArrayList<Item> arrayList = activityRoster.aO;
                Spinner spinner = activityRoster.sp_attended_school;
                int i24 = a;
                int i25 = (i24 ^ 27) + ((i24 & 27) << 1);
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    arrayList.get(spinner.getSelectedItemPosition()).getOptionId();
                    throw null;
                }
                if (arrayList.get(spinner.getSelectedItemPosition()).getOptionId() != 25) {
                    int i26 = b;
                    int i27 = (((i26 & (-26)) | ((~i26) & 25)) - (~((i26 & 25) << 1))) - 1;
                    a = i27 % 128;
                    if (i27 % 2 == 0) {
                        ActivityRoster.this.sp_highest_education.setVisibility(1);
                        return;
                    } else {
                        ActivityRoster.this.sp_highest_education.setVisibility(0);
                        return;
                    }
                }
            }
            ActivityRoster.this.sp_highest_education.setVisibility(8);
            int i28 = a;
            int i29 = i28 & 61;
            int i30 = ((i28 | 61) & (~i29)) + (i29 << 1);
            b = i30 % 128;
            int i31 = i30 % 2;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        String string;
        Resources resources;
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 | 17) << 1;
        int i4 = -(i2 ^ 17);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        p = i5 % 128;
        if (i5 % 2 == 0) {
            C0104p.c();
            AppCompatActivity appCompatActivity = this.ae;
            getResources();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity2 = this.ae;
        Resources resources2 = getResources();
        int i6 = q;
        int i7 = i6 ^ 101;
        int i8 = ((((i6 & 101) | i7) << 1) - (~(-i7))) - 1;
        p = i8 % 128;
        if (i8 % 2 == 0) {
            string = resources2.getString(R.string.enter_data_lost);
            resources = getResources();
            int i9 = 72 / 0;
        } else {
            string = resources2.getString(R.string.enter_data_lost);
            resources = getResources();
        }
        String str = string;
        String string2 = resources.getString(R.string.roster_exit);
        DialogInterfaceOnClickListenerC0212s dialogInterfaceOnClickListenerC0212s = new DialogInterfaceOnClickListenerC0212s(this, 0);
        int i10 = q + 41;
        int i11 = i10 % 128;
        p = i11;
        int i12 = i10 % 2;
        int i13 = i11 & 123;
        int i14 = (i11 | 123) & (~i13);
        int i15 = i13 << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        q = i16 % 128;
        if (i16 % 2 == 0) {
            c0104pC.h(appCompatActivity2, str, string2, dialogInterfaceOnClickListenerC0212s, null, false);
        } else {
            c0104pC.h(appCompatActivity2, str, string2, dialogInterfaceOnClickListenerC0212s, null, false);
            int i17 = 40 / 0;
        }
    }

    @OnClick
    public void onDOB(View view) {
        C0104p c0104pC;
        AppCompatActivity appCompatActivity;
        int i = 2 % 2;
        int i2 = p + 69;
        int i3 = i2 % 128;
        q = i3;
        int i4 = i2 % 2;
        Roster roster = this.bn;
        if (roster != null) {
            int i5 = ((i3 | 90) << 1) - (i3 ^ 90);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            p = i6 % 128;
            if (i6 % 2 != 0 ? roster.relation_to_household_id == 186 : roster.relation_to_household_id == 1356) {
                ArrayList<Roster> arrayList = this.bj;
                if (arrayList != null) {
                    int i7 = q + 113;
                    p = i7 % 128;
                    if (i7 % 2 == 0) {
                        arrayList.size();
                        throw null;
                    }
                    if (arrayList.size() > 0) {
                        int i8 = q;
                        int i9 = (i8 & (-8)) | ((~i8) & 7);
                        int i10 = (i8 & 7) << 1;
                        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                        p = i11 % 128;
                        int i12 = i11 % 2;
                        if (this.bj.size() > 1) {
                            int i13 = q;
                            int i14 = i13 ^ 125;
                            int i15 = (i13 & 125) << 1;
                            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                            p = i16 % 128;
                            if (i16 % 2 == 0) {
                                c0104pC = C0104p.c();
                                appCompatActivity = this.ae;
                                int i17 = 34 / 0;
                            } else {
                                c0104pC = C0104p.c();
                                appCompatActivity = this.ae;
                            }
                            DialogInterfaceOnClickListenerC0212s dialogInterfaceOnClickListenerC0212s = new DialogInterfaceOnClickListenerC0212s(this, 2);
                            DialogInterfaceOnClickListenerC0217y dialogInterfaceOnClickListenerC0217y = DialogInterfaceOnClickListenerC0217y.d;
                            int i18 = p;
                            int i19 = (i18 & 65) + (i18 | 65);
                            q = i19 % 128;
                            if (i19 % 2 != 0) {
                                c0104pC.h(appCompatActivity, "Warning", "If you change age of household then all added rosters will be removed. Are you sure you want to change age?? ", dialogInterfaceOnClickListenerC0212s, dialogInterfaceOnClickListenerC0217y, true);
                                return;
                            } else {
                                c0104pC.h(appCompatActivity, "Warning", "If you change age of household then all added rosters will be removed. Are you sure you want to change age?? ", dialogInterfaceOnClickListenerC0212s, dialogInterfaceOnClickListenerC0217y, true);
                                return;
                            }
                        }
                    }
                }
                int i20 = p;
                int i21 = i20 & 21;
                int i22 = -(-(i20 | 21));
                int i23 = (i21 & i22) + (i22 | i21);
                q = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = 2 / 4;
                }
                Q();
                int i25 = p;
                int i26 = i25 & 55;
                int i27 = i25 | 55;
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                q = i28 % 128;
                int i29 = i28 % 2;
                return;
            }
        }
        Q();
        int i30 = q;
        int i31 = ((i30 & (-14)) | ((~i30) & 13)) + ((i30 & 13) << 1);
        p = i31 % 128;
        int i32 = i31 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = q + 77;
        p = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        CountDownTimer countDownTimer = this.aX;
        Object obj = null;
        if (countDownTimer != null) {
            int i4 = p;
            int i5 = ((i4 & (-22)) | ((~i4) & 21)) + ((i4 & 21) << 1);
            q = i5 % 128;
            int i6 = i5 % 2;
            countDownTimer.cancel();
            if (i6 != 0) {
                throw null;
            }
            int i7 = p + 105;
            q = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = p;
        int i10 = (i9 & 92) + (i9 | 92);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        q = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public class oo000o implements J {
        private static int a = 0;
        private static int b = 1;

        public oo000o() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 47;
            int i4 = ((i2 ^ 47) | i3) << 1;
            int i5 = -((i2 | 47) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            ActivityRoster.this.aM = arrayList;
            int i8 = b;
            int i9 = ((i8 & 28) + (i8 | 28)) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            int i12 = 0;
            while (i12 < ActivityRoster.this.aM.size()) {
                int i13 = b;
                int i14 = i13 & 13;
                int i15 = i14 + ((i13 ^ 13) | i14);
                a = i15 % 128;
                int i16 = i15 % 2;
                int optionId = ActivityRoster.this.aM.get(i12).getOptionId();
                int i17 = b;
                int i18 = i17 & 99;
                int i19 = (i17 ^ 99) | i18;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                a = i20 % 128;
                int i21 = i20 % 2;
                if (optionId == ActivityRoster.this.bn.chronic_disease) {
                    int i22 = b + 121;
                    int i23 = i22 % 128;
                    a = i23;
                    int i24 = i22 % 2;
                    int i25 = i23 + 15;
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    i11 = i12;
                    break;
                }
                int i27 = i12 & 1;
                int i28 = (i12 ^ 1) | i27;
                i12 = (i28 | i27) + (i27 & i28);
                int i29 = (-2) - ((a + 102) ^ (-1));
                b = i29 % 128;
                int i30 = i29 % 2;
            }
            ActivityRoster.this.sp_chronic_disease.setSelection(i11);
            int i31 = a;
            int i32 = i31 & 75;
            int i33 = (i32 - (~(-(-((i31 ^ 75) | i32))))) - 1;
            b = i33 % 128;
            int i34 = i33 % 2;
        }
    }

    public void E(ArrayList<Item> arrayList, Spinner spinner) {
        int i = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        AdapterView.OnItemSelectedListener o00o0o = new o00O0O(this, spinner);
        int i2 = (-2) - ((p + 40) ^ (-1));
        q = i2 % 128;
        int i3 = i2 % 2;
        spinner.setOnItemSelectedListener(o00o0o);
        int i4 = q;
        int i5 = ((i4 | 63) << 1) - (i4 ^ 63);
        p = i5 % 128;
        int i6 = i5 % 2;
    }

    public class OooO0OO implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 115) << 1) - (i2 ^ 115);
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 85;
            int i5 = i4 + ((i3 ^ 85) | i4);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (i == 0) {
                ActivityRoster.this.sp_work_activity.setBackgroundResource(R.drawable.spinner_bg);
                int i6 = a + 101;
                b = i6 % 128;
                int i7 = i6 % 2;
            } else {
                ActivityRoster.this.sp_work_activity.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i8 = b;
                int i9 = i8 & 79;
                int i10 = (i9 - (~(-(-((i8 ^ 79) | i9))))) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
            }
            if (i == 1) {
                int i12 = b;
                int i13 = i12 & 9;
                int i14 = -(-((i12 ^ 9) | i13));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                ActivityRoster.this.tv_workingHourQuestion.setVisibility(0);
                ActivityRoster.this.et_hoursWorked.setVisibility(0);
                int i17 = a + 123;
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            ActivityRoster.this.tv_workingHourQuestion.setVisibility(8);
            ActivityRoster activityRoster = ActivityRoster.this;
            int i18 = a;
            int i19 = i18 ^ 111;
            int i20 = ((((i18 & 111) | i19) << 1) - (~(-i19))) - 1;
            b = i20 % 128;
            if (i20 % 2 == 0) {
                activityRoster.et_hoursWorked.setVisibility(72);
            } else {
                activityRoster.et_hoursWorked.setVisibility(8);
            }
            int i21 = a;
            int i22 = ((i21 | 117) << 1) - (i21 ^ 117);
            b = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
        }
    }

    public class o0O0O00 implements TextWatcher {
        private static int a = 0;
        private static int b = 1;
        public EditText c;

        public o0O0O00(EditText editText) {
            this.c = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 29) - (~(-(-((i2 & 29) << 1))))) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = ((((i5 ^ 121) | (i5 & 121)) << 1) - (~(-(((~i5) & 121) | (i5 & (-122)))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x02e9 A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:104:0x0302 A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:106:0x030c  */
        /* JADX WARN: Code duplicated, block: B:109:0x0322  */
        /* JADX WARN: Code duplicated, block: B:111:0x0337 A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:117:0x0345 A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:119:0x034f  */
        /* JADX WARN: Code duplicated, block: B:130:0x03c3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:131:0x03c4  */
        /* JADX WARN: Code duplicated, block: B:132:0x03c5 A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:137:0x03ed A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:141:0x03f7 A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:151:0x042b A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0197 A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:58:0x019d  */
        /* JADX WARN: Code duplicated, block: B:61:0x01ac A[Catch: Exception -> 0x0444, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:64:0x01be A[Catch: Exception -> 0x0444, TRY_ENTER, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:65:0x01c6 A[Catch: Exception -> 0x0444, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:71:0x020b A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:73:0x0236 A[Catch: Exception -> 0x0444, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0279 A[Catch: Exception -> 0x0444, TRY_LEAVE, TryCatch #6 {Exception -> 0x0444, blocks: (B:4:0x000f, B:9:0x0034, B:13:0x005e, B:14:0x0067, B:16:0x0072, B:25:0x00aa, B:29:0x00c6, B:31:0x00cc, B:34:0x00de, B:38:0x0102, B:40:0x010e, B:42:0x0127, B:44:0x0145, B:47:0x015c, B:78:0x0249, B:83:0x0275, B:85:0x0279, B:88:0x028e, B:92:0x02ab, B:94:0x02be, B:97:0x02d8, B:101:0x02e9, B:104:0x0302, B:107:0x0318, B:111:0x0337, B:113:0x0341, B:120:0x0363, B:122:0x037a, B:117:0x0345, B:125:0x0390, B:127:0x03ae, B:132:0x03c5, B:134:0x03e1, B:137:0x03ed, B:138:0x03f4, B:141:0x03f7, B:142:0x03fe, B:143:0x0401, B:146:0x0404, B:148:0x041b, B:151:0x042b, B:153:0x043b, B:51:0x0182, B:52:0x0191, B:53:0x0194, B:39:0x010a, B:35:0x00e6, B:56:0x0197, B:59:0x01a6, B:61:0x01ac, B:64:0x01be, B:66:0x01cd, B:68:0x01e8, B:71:0x020b, B:73:0x0236, B:74:0x0243, B:75:0x0246, B:65:0x01c6, B:15:0x006a, B:10:0x003f, B:18:0x0086, B:23:0x009f, B:155:0x043e, B:156:0x0441), top: B:174:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:87:0x027d  */
        /* JADX WARN: Code duplicated, block: B:91:0x0296  */
        /* JADX WARN: Code duplicated, block: B:96:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:99:0x02de  */
        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            StringBuilder sb;
            int i4;
            int i5;
            int checkedRadioButtonId;
            RadioButton radioButton;
            int i6;
            int checkedRadioButtonId2;
            int i7;
            int i8;
            int i9;
            int selectedItemPosition;
            int i10;
            int i11 = 2 % 2;
            int i12 = b + 119;
            a = i12 % 128;
            Object obj = null;
            try {
                if (i12 % 2 != 0) {
                    charSequence.toString();
                    throw null;
                }
                String string = charSequence.toString();
                ActivityRoster activityRoster = ActivityRoster.this;
                if (!activityRoster.aU) {
                    int i13 = b;
                    int i14 = i13 & 91;
                    int i15 = (i13 | 91) & (~i14);
                    int i16 = i14 << 1;
                    int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                    a = i17 % 128;
                    if (i17 % 2 != 0) {
                        activityRoster.J();
                        ActivityRoster.this.vald_txt_view_caption.setVisibility(78);
                    } else {
                        activityRoster.J();
                        ActivityRoster.this.vald_txt_view_caption.setVisibility(8);
                    }
                    int i18 = b;
                    int i19 = i18 & 67;
                    int i20 = (i18 | 67) & (~i19);
                    int i21 = i19 << 1;
                    int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                    a = i22 % 128;
                    if (i22 % 2 != 0) {
                        ActivityRoster.this.vald_txt_view.setVisibility(34);
                    } else {
                        ActivityRoster.this.vald_txt_view.setVisibility(8);
                    }
                    ActivityRoster.this.vald_name_txt_view.setVisibility(8);
                    ActivityRoster.this.I();
                    int i23 = b + 49;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                } else if (!(!activityRoster.bb)) {
                    int i25 = a;
                    int i26 = i25 ^ 111;
                    int i27 = ((i25 & 111) | i26) << 1;
                    int i28 = -i26;
                    int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    activityRoster.bs = false;
                    int i31 = a + 111;
                    b = i31 % 128;
                    int i32 = i31 % 2;
                }
                int i33 = 6;
                if (string.length() == 14) {
                    int i34 = b;
                    int i35 = i34 & 35;
                    int i36 = (i34 ^ 35) | i35;
                    int i37 = (i35 & i36) + (i36 | i35);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                    if (!string.endsWith("-")) {
                        EditText editText = this.c;
                        StringBuilder sb2 = new StringBuilder();
                        int i39 = b + 83;
                        a = i39 % 128;
                        if (i39 % 2 != 0) {
                            sb2.append(string.substring(0, 5));
                        } else {
                            sb2.append(string.substring(0, 5));
                        }
                        int i40 = b;
                        int i41 = i40 ^ 69;
                        int i42 = ((((i40 & 69) | i41) << 1) - (~(-i41))) - 1;
                        a = i42 % 128;
                        if (i42 % 2 != 0) {
                            sb2.append("-");
                            i33 = 125;
                            i10 = 48;
                        } else {
                            sb2.append("-");
                            i10 = 13;
                        }
                        sb2.append(string.substring(i33, i10));
                        sb2.append("-");
                        int i43 = b;
                        int i44 = i43 & 99;
                        int i45 = ((i43 | 99) & (~i44)) + (i44 << 1);
                        a = i45 % 128;
                        int i46 = i45 % 2;
                        sb2.append(string.substring(13));
                        int i47 = b;
                        int i48 = i47 & 97;
                        int i49 = ((i47 ^ 97) | i48) << 1;
                        int i50 = -((i47 | 97) & (~i48));
                        int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                        a = i51 % 128;
                        int i52 = i51 % 2;
                        editText.setText(sb2.toString());
                        EditText editText2 = this.c;
                        int i53 = a;
                        int i54 = (i53 & 77) + (i53 | 77);
                        b = i54 % 128;
                        if (i54 % 2 == 0) {
                            editText2.setSelection(editText2.getText().toString().length());
                            obj.hashCode();
                            throw null;
                        }
                        editText2.setSelection(editText2.getText().toString().length());
                        int i55 = b;
                        int i56 = ((i55 & (-120)) | ((~i55) & 119)) + ((i55 & 119) << 1);
                        a = i56 % 128;
                        if (i56 % 2 != 0) {
                            int i57 = 3 / 5;
                        }
                    } else if (string.length() == 6) {
                        int i58 = a + 23;
                        b = i58 % 128;
                        int i59 = i58 % 2;
                        if (!string.endsWith("-")) {
                            EditText editText3 = this.c;
                            sb = new StringBuilder();
                            i4 = a + 17;
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                sb.append(string.substring(1, 2));
                            } else {
                                sb.append(string.substring(0, 5));
                            }
                            sb.append("-");
                            String strSubstring = string.substring(5);
                            int i60 = a;
                            int i61 = i60 & 23;
                            int i62 = (i60 | 23) & (~i61);
                            int i63 = -(-(i61 << 1));
                            int i64 = (i62 & i63) + (i62 | i63);
                            b = i64 % 128;
                            int i65 = i64 % 2;
                            sb.append(strSubstring);
                            editText3.setText(sb.toString());
                            int i66 = b;
                            i5 = ((((i66 ^ 23) | (i66 & 23)) << 1) - (~(-(((~i66) & 23) | (i66 & (-24)))))) - 1;
                            a = i5 % 128;
                            if (i5 % 2 == 0) {
                                this.c.getText().toString().length();
                                obj.hashCode();
                                throw null;
                            }
                            EditText editText4 = this.c;
                            editText4.setSelection(editText4.getText().toString().length());
                            int i67 = a;
                            int i68 = ((i67 ^ 33) | (i67 & 33)) << 1;
                            int i69 = -(((~i67) & 33) | (i67 & (-34)));
                            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                            b = i70 % 128;
                            int i71 = i70 % 2;
                        }
                    }
                } else if (string.length() == 6) {
                    int i510 = a + 23;
                    b = i510 % 128;
                    int i511 = i510 % 2;
                    if (!string.endsWith("-")) {
                        EditText editText5 = this.c;
                        sb = new StringBuilder();
                        i4 = a + 17;
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            sb.append(string.substring(1, 2));
                        } else {
                            sb.append(string.substring(0, 5));
                        }
                        sb.append("-");
                        String strSubstring2 = string.substring(5);
                        int i610 = a;
                        int i611 = i610 & 23;
                        int i612 = (i610 | 23) & (~i611);
                        int i613 = -(-(i611 << 1));
                        int i614 = (i612 & i613) + (i612 | i613);
                        b = i614 % 128;
                        int i615 = i614 % 2;
                        sb.append(strSubstring2);
                        editText5.setText(sb.toString());
                        int i616 = b;
                        i5 = ((((i616 ^ 23) | (i616 & 23)) << 1) - (~(-(((~i616) & 23) | (i616 & (-24)))))) - 1;
                        a = i5 % 128;
                        if (i5 % 2 == 0) {
                            this.c.getText().toString().length();
                            obj.hashCode();
                            throw null;
                        }
                        EditText editText6 = this.c;
                        editText6.setSelection(editText6.getText().toString().length());
                        int i617 = a;
                        int i618 = ((i617 ^ 33) | (i617 & 33)) << 1;
                        int i619 = -(((~i617) & 33) | (i617 & (-34)));
                        int i72 = (i618 ^ i619) + ((i619 & i618) << 1);
                        b = i72 % 128;
                        int i73 = i72 % 2;
                    }
                }
                ActivityRoster activityRoster2 = ActivityRoster.this;
                int i74 = activityRoster2.ac;
                if (i74 != 1) {
                    int i75 = a + 122;
                    int i76 = (i75 ^ (-1)) + (i75 << 1);
                    int i77 = i76 % 128;
                    b = i77;
                    int i78 = i76 % 2;
                    if (i74 != 2) {
                        int i79 = ((i77 ^ 25) | (i77 & 25)) << 1;
                        int i80 = -(((~i77) & 25) | (i77 & (-26)));
                        int i81 = (i79 ^ i80) + ((i79 & i80) << 1);
                        a = i81 % 128;
                        int i82 = i81 % 2;
                        if (ag.d) {
                            if (ag.j == 1) {
                                int i83 = b;
                                int i84 = i83 ^ 57;
                                int i85 = (i83 & 57) << 1;
                                int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                                a = i86 % 128;
                                int i87 = i86 % 2;
                                if (activityRoster2.br < 18.0d) {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    ActivityRoster activityRoster3 = ActivityRoster.this;
                                    int i88 = a + 97;
                                    b = i88 % 128;
                                    int i89 = i88 % 2;
                                    activityRoster3.aY = false;
                                    return;
                                }
                                int i90 = b;
                                int i91 = i90 | 63;
                                int i92 = i91 << 1;
                                int i93 = -((~(i90 & 63)) & i91);
                                int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                                a = i94 % 128;
                                int i95 = i94 % 2;
                                checkedRadioButtonId = activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId();
                                radioButton = ActivityRoster.this.radioButtonCNICPresent;
                                int i96 = b + 51;
                                a = i96 % 128;
                                int i97 = i96 % 2;
                                if (checkedRadioButtonId == radioButton.getId()) {
                                    int i98 = a;
                                    int i99 = (((i98 ^ 11) | (i98 & 11)) << 1) - (((~i98) & 11) | (i98 & (-12)));
                                    b = i99 % 128;
                                    int i100 = i99 % 2;
                                    if (string.length() >= 14) {
                                        i6 = a + 77;
                                        b = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        checkedRadioButtonId2 = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                        int i101 = a;
                                        i7 = ((i101 ^ 108) + ((i101 & 108) << 1)) - 1;
                                        b = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            ActivityRoster.this.radioButtonFemale.getId();
                                            throw null;
                                        }
                                        if (checkedRadioButtonId2 != ActivityRoster.this.radioButtonFemale.getId()) {
                                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                            ActivityRoster activityRoster4 = ActivityRoster.this;
                                            int i102 = a;
                                            int i103 = i102 ^ 79;
                                            int i104 = ((i102 & 79) | i103) << 1;
                                            int i105 = -i103;
                                            int i106 = (i104 ^ i105) + ((i104 & i105) << 1);
                                            b = i106 % 128;
                                            int i107 = i106 % 2;
                                            activityRoster4.aY = false;
                                            int i108 = a + 97;
                                            b = i108 % 128;
                                            int i109 = i108 % 2;
                                            return;
                                        }
                                        int i110 = a;
                                        int i111 = (i110 & 65) + (i110 | 65);
                                        b = i111 % 128;
                                        int i112 = i111 % 2;
                                        if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                            int i113 = b;
                                            int i114 = i113 & 101;
                                            int i115 = (i113 | 101) & (~i114);
                                            int i116 = i114 << 1;
                                            i9 = (i115 ^ i116) + ((i115 & i116) << 1);
                                            a = i9 % 128;
                                            if (i9 % 2 != 0) {
                                                selectedItemPosition = ActivityRoster.this.sp_marital_status.getSelectedItemPosition();
                                                int i117 = 73 / 0;
                                            } else {
                                                selectedItemPosition = ActivityRoster.this.sp_marital_status.getSelectedItemPosition();
                                            }
                                            if (selectedItemPosition != 1) {
                                                int i118 = a;
                                                int i119 = i118 | 103;
                                                int i120 = i119 << 1;
                                                int i121 = -((~(i118 & 103)) & i119);
                                                int i122 = (i120 & i121) + (i121 | i120);
                                                b = i122 % 128;
                                                int i123 = i122 % 2;
                                                ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                                int i124 = a;
                                                int i125 = i124 & 37;
                                                int i126 = i124 | 37;
                                                int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                                                b = i127 % 128;
                                                int i128 = i127 % 2;
                                                ActivityRoster.this.aY = true;
                                                int i129 = a;
                                                int i130 = i129 & 37;
                                                int i131 = (i129 ^ 37) | i130;
                                                int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
                                                b = i132 % 128;
                                                int i133 = i132 % 2;
                                                return;
                                            }
                                        }
                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                        int i134 = a;
                                        int i135 = (i134 & (-98)) | ((~i134) & 97);
                                        int i136 = -(-((i134 & 97) << 1));
                                        int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                                        b = i137 % 128;
                                        int i138 = i137 % 2;
                                        ActivityRoster.this.aY = false;
                                        int i139 = a;
                                        i8 = (-2) - (((i139 & 78) + (i139 | 78)) ^ (-1));
                                        b = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            throw null;
                                        }
                                        return;
                                    }
                                }
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                ActivityRoster activityRoster5 = ActivityRoster.this;
                                int i140 = a;
                                int i141 = ((i140 ^ 88) + ((i140 & 88) << 1)) - 1;
                                b = i141 % 128;
                                int i142 = i141 % 2;
                                activityRoster5.aY = false;
                                int i143 = a;
                                int i144 = (((i143 | 14) << 1) - (i143 ^ 14)) - 1;
                                b = i144 % 128;
                                int i145 = i144 % 2;
                                return;
                            }
                        }
                    } else if (ag.j == 1) {
                        int i810 = b;
                        int i811 = i810 ^ 57;
                        int i812 = (i810 & 57) << 1;
                        int i813 = (i811 ^ i812) + ((i812 & i811) << 1);
                        a = i813 % 128;
                        int i814 = i813 % 2;
                        if (activityRoster2.br < 18.0d) {
                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                            ActivityRoster activityRoster6 = ActivityRoster.this;
                            int i815 = a + 97;
                            b = i815 % 128;
                            int i816 = i815 % 2;
                            activityRoster6.aY = false;
                            return;
                        }
                        int i910 = b;
                        int i911 = i910 | 63;
                        int i912 = i911 << 1;
                        int i913 = -((~(i910 & 63)) & i911);
                        int i914 = (i912 ^ i913) + ((i913 & i912) << 1);
                        a = i914 % 128;
                        int i915 = i914 % 2;
                        checkedRadioButtonId = activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId();
                        radioButton = ActivityRoster.this.radioButtonCNICPresent;
                        int i916 = b + 51;
                        a = i916 % 128;
                        int i917 = i916 % 2;
                        if (checkedRadioButtonId == radioButton.getId()) {
                            int i918 = a;
                            int i919 = (((i918 ^ 11) | (i918 & 11)) << 1) - (((~i918) & 11) | (i918 & (-12)));
                            b = i919 % 128;
                            int i1010 = i919 % 2;
                            if (string.length() >= 14) {
                                i6 = a + 77;
                                b = i6 % 128;
                                if (i6 % 2 == 0) {
                                    ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                    obj.hashCode();
                                    throw null;
                                }
                                checkedRadioButtonId2 = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                int i1011 = a;
                                i7 = ((i1011 ^ 108) + ((i1011 & 108) << 1)) - 1;
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    ActivityRoster.this.radioButtonFemale.getId();
                                    throw null;
                                }
                                if (checkedRadioButtonId2 != ActivityRoster.this.radioButtonFemale.getId()) {
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                    ActivityRoster activityRoster7 = ActivityRoster.this;
                                    int i1012 = a;
                                    int i1013 = i1012 ^ 79;
                                    int i1014 = ((i1012 & 79) | i1013) << 1;
                                    int i1015 = -i1013;
                                    int i1016 = (i1014 ^ i1015) + ((i1014 & i1015) << 1);
                                    b = i1016 % 128;
                                    int i1017 = i1016 % 2;
                                    activityRoster7.aY = false;
                                    int i1018 = a + 97;
                                    b = i1018 % 128;
                                    int i1019 = i1018 % 2;
                                    return;
                                }
                                int i1110 = a;
                                int i1111 = (i1110 & 65) + (i1110 | 65);
                                b = i1111 % 128;
                                int i1112 = i1111 % 2;
                                if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                    int i1113 = b;
                                    int i1114 = i1113 & 101;
                                    int i1115 = (i1113 | 101) & (~i1114);
                                    int i1116 = i1114 << 1;
                                    i9 = (i1115 ^ i1116) + ((i1115 & i1116) << 1);
                                    a = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        selectedItemPosition = ActivityRoster.this.sp_marital_status.getSelectedItemPosition();
                                        int i1117 = 73 / 0;
                                    } else {
                                        selectedItemPosition = ActivityRoster.this.sp_marital_status.getSelectedItemPosition();
                                    }
                                    if (selectedItemPosition != 1) {
                                        int i1118 = a;
                                        int i1119 = i1118 | 103;
                                        int i1210 = i1119 << 1;
                                        int i1211 = -((~(i1118 & 103)) & i1119);
                                        int i1212 = (i1210 & i1211) + (i1211 | i1210);
                                        b = i1212 % 128;
                                        int i1213 = i1212 % 2;
                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                        int i1214 = a;
                                        int i1215 = i1214 & 37;
                                        int i1216 = i1214 | 37;
                                        int i1217 = (i1215 ^ i1216) + ((i1216 & i1215) << 1);
                                        b = i1217 % 128;
                                        int i1218 = i1217 % 2;
                                        ActivityRoster.this.aY = true;
                                        int i1219 = a;
                                        int i1310 = i1219 & 37;
                                        int i1311 = (i1219 ^ 37) | i1310;
                                        int i1312 = ((i1310 | i1311) << 1) - (i1311 ^ i1310);
                                        b = i1312 % 128;
                                        int i1313 = i1312 % 2;
                                        return;
                                    }
                                }
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                int i1314 = a;
                                int i1315 = (i1314 & (-98)) | ((~i1314) & 97);
                                int i1316 = -(-((i1314 & 97) << 1));
                                int i1317 = ((i1315 | i1316) << 1) - (i1316 ^ i1315);
                                b = i1317 % 128;
                                int i1318 = i1317 % 2;
                                ActivityRoster.this.aY = false;
                                int i1319 = a;
                                i8 = (-2) - (((i1319 & 78) + (i1319 | 78)) ^ (-1));
                                b = i8 % 128;
                                if (i8 % 2 == 0) {
                                    throw null;
                                }
                                return;
                            }
                        }
                        ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                        ActivityRoster activityRoster8 = ActivityRoster.this;
                        int i146 = a;
                        int i147 = ((i146 ^ 88) + ((i146 & 88) << 1)) - 1;
                        b = i147 % 128;
                        int i148 = i147 % 2;
                        activityRoster8.aY = false;
                        int i149 = a;
                        int i1410 = (((i149 | 14) << 1) - (i149 ^ 14)) - 1;
                        b = i1410 % 128;
                        int i1411 = i1410 % 2;
                        return;
                    }
                } else if (ag.j == 1) {
                    int i817 = b;
                    int i818 = i817 ^ 57;
                    int i819 = (i817 & 57) << 1;
                    int i8110 = (i818 ^ i819) + ((i819 & i818) << 1);
                    a = i8110 % 128;
                    int i8111 = i8110 % 2;
                    if (activityRoster2.br < 18.0d) {
                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                        ActivityRoster activityRoster9 = ActivityRoster.this;
                        int i8112 = a + 97;
                        b = i8112 % 128;
                        int i8113 = i8112 % 2;
                        activityRoster9.aY = false;
                        return;
                    }
                    int i9110 = b;
                    int i9111 = i9110 | 63;
                    int i9112 = i9111 << 1;
                    int i9113 = -((~(i9110 & 63)) & i9111);
                    int i9114 = (i9112 ^ i9113) + ((i9113 & i9112) << 1);
                    a = i9114 % 128;
                    int i9115 = i9114 % 2;
                    checkedRadioButtonId = activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId();
                    radioButton = ActivityRoster.this.radioButtonCNICPresent;
                    int i9116 = b + 51;
                    a = i9116 % 128;
                    int i9117 = i9116 % 2;
                    if (checkedRadioButtonId == radioButton.getId()) {
                        int i9118 = a;
                        int i9119 = (((i9118 ^ 11) | (i9118 & 11)) << 1) - (((~i9118) & 11) | (i9118 & (-12)));
                        b = i9119 % 128;
                        int i10110 = i9119 % 2;
                        if (string.length() >= 14) {
                            i6 = a + 77;
                            b = i6 % 128;
                            if (i6 % 2 == 0) {
                                ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                obj.hashCode();
                                throw null;
                            }
                            checkedRadioButtonId2 = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                            int i10111 = a;
                            i7 = ((i10111 ^ 108) + ((i10111 & 108) << 1)) - 1;
                            b = i7 % 128;
                            if (i7 % 2 == 0) {
                                ActivityRoster.this.radioButtonFemale.getId();
                                throw null;
                            }
                            if (checkedRadioButtonId2 != ActivityRoster.this.radioButtonFemale.getId()) {
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                ActivityRoster activityRoster10 = ActivityRoster.this;
                                int i10112 = a;
                                int i10113 = i10112 ^ 79;
                                int i10114 = ((i10112 & 79) | i10113) << 1;
                                int i10115 = -i10113;
                                int i10116 = (i10114 ^ i10115) + ((i10114 & i10115) << 1);
                                b = i10116 % 128;
                                int i10117 = i10116 % 2;
                                activityRoster10.aY = false;
                                int i10118 = a + 97;
                                b = i10118 % 128;
                                int i10119 = i10118 % 2;
                                return;
                            }
                            int i11110 = a;
                            int i11111 = (i11110 & 65) + (i11110 | 65);
                            b = i11111 % 128;
                            int i11112 = i11111 % 2;
                            if (ActivityRoster.this.sp_marital_status.getSelectedItemPosition() != 0) {
                                int i11113 = b;
                                int i11114 = i11113 & 101;
                                int i11115 = (i11113 | 101) & (~i11114);
                                int i11116 = i11114 << 1;
                                i9 = (i11115 ^ i11116) + ((i11115 & i11116) << 1);
                                a = i9 % 128;
                                if (i9 % 2 != 0) {
                                    selectedItemPosition = ActivityRoster.this.sp_marital_status.getSelectedItemPosition();
                                    int i11117 = 73 / 0;
                                } else {
                                    selectedItemPosition = ActivityRoster.this.sp_marital_status.getSelectedItemPosition();
                                }
                                if (selectedItemPosition != 1) {
                                    int i11118 = a;
                                    int i11119 = i11118 | 103;
                                    int i12110 = i11119 << 1;
                                    int i12111 = -((~(i11118 & 103)) & i11119);
                                    int i12112 = (i12110 & i12111) + (i12111 | i12110);
                                    b = i12112 % 128;
                                    int i12113 = i12112 % 2;
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                    int i12114 = a;
                                    int i12115 = i12114 & 37;
                                    int i12116 = i12114 | 37;
                                    int i12117 = (i12115 ^ i12116) + ((i12116 & i12115) << 1);
                                    b = i12117 % 128;
                                    int i12118 = i12117 % 2;
                                    ActivityRoster.this.aY = true;
                                    int i12119 = a;
                                    int i13110 = i12119 & 37;
                                    int i13111 = (i12119 ^ 37) | i13110;
                                    int i13112 = ((i13110 | i13111) << 1) - (i13111 ^ i13110);
                                    b = i13112 % 128;
                                    int i13113 = i13112 % 2;
                                    return;
                                }
                            }
                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                            int i13114 = a;
                            int i13115 = (i13114 & (-98)) | ((~i13114) & 97);
                            int i13116 = -(-((i13114 & 97) << 1));
                            int i13117 = ((i13115 | i13116) << 1) - (i13116 ^ i13115);
                            b = i13117 % 128;
                            int i13118 = i13117 % 2;
                            ActivityRoster.this.aY = false;
                            int i13119 = a;
                            i8 = (-2) - (((i13119 & 78) + (i13119 | 78)) ^ (-1));
                            b = i8 % 128;
                            if (i8 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                    }
                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                    ActivityRoster activityRoster11 = ActivityRoster.this;
                    int i1412 = a;
                    int i1413 = ((i1412 ^ 88) + ((i1412 & 88) << 1)) - 1;
                    b = i1413 % 128;
                    int i1414 = i1413 % 2;
                    activityRoster11.aY = false;
                    int i1415 = a;
                    int i1416 = (((i1415 | 14) << 1) - (i1415 ^ 14)) - 1;
                    b = i1416 % 128;
                    int i1417 = i1416 % 2;
                    return;
                }
                int i150 = a + 41;
                b = i150 % 128;
                int i151 = i150 % 2;
            } catch (Exception unused) {
            }
        }
    }

    public class o0OO00O implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public o0OO00O() {
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0064  */
        /* JADX WARN: Code duplicated, block: B:24:0x00f1 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis;
            ActivityRoster activityRoster;
            int i;
            int i2 = 2 % 2;
            while (true) {
                ActivityRoster activityRoster2 = ActivityRoster.this;
                if (!activityRoster2.bF) {
                    int i3 = a;
                    int i4 = i3 | 103;
                    int i5 = i4 << 1;
                    int i6 = -((~(i3 & 103)) & i4);
                    int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                }
                int i9 = b + 76;
                int i10 = (i9 ^ (-1)) + (i9 << 1);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    Objects.requireNonNull(activityRoster2.ak);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    activityRoster = ActivityRoster.this;
                    int i11 = 95 / 0;
                } else {
                    Objects.requireNonNull(activityRoster2.ak);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    activityRoster = ActivityRoster.this;
                }
                int i12 = activityRoster.ak.i(activityRoster.bJ);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                int i13 = b;
                int i14 = ((i13 ^ 55) - (~((i13 & 55) << 1))) - 1;
                a = i14 % 128;
                if (i14 % 2 != 0) {
                    if (i12 == 1) {
                        i = ((i13 & 98) + (i13 | 98)) - 1;
                        a = i % 128;
                        if (i % 2 == 0) {
                            ActivityRoster activityRoster3 = ActivityRoster.this;
                            byte[] bArr = activityRoster3.bJ;
                            int i15 = activityRoster3.bu;
                            int i16 = activityRoster3.bv;
                            throw null;
                        }
                        ActivityRoster activityRoster4 = ActivityRoster.this;
                        e.d(activityRoster4.bJ, activityRoster4.bu, activityRoster4.bv);
                        ActivityRoster activityRoster5 = ActivityRoster.this;
                        activityRoster5.bx = e.b(activityRoster5.bJ, activityRoster5.bu, activityRoster5.bv);
                        Message message = new Message();
                        message.what = 0;
                        Bundle bundle = new Bundle();
                        int i17 = b;
                        int i18 = i17 ^ 41;
                        int i19 = ((i17 & 41) | i18) << 1;
                        int i20 = -i18;
                        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        StringBuilder sbW = j.w(BuildConfig.FLAVOR);
                        sbW.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                        int i23 = b;
                        int i24 = ((i23 ^ 81) | (i23 & 81)) << 1;
                        int i25 = -(((~i23) & 81) | (i23 & (-82)));
                        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        bundle.putString("time", sbW.toString());
                        int i28 = a;
                        int i29 = i28 & 33;
                        int i30 = i29 + ((i28 ^ 33) | i29);
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        message.setData(bundle);
                        ActivityRoster.this.bt.sendMessage(message);
                        int i32 = a;
                        int i33 = i32 & 43;
                        int i34 = i33 + ((i32 ^ 43) | i33);
                        b = i34 % 128;
                        int i35 = i34 % 2;
                    } else {
                        continue;
                    }
                } else if (i12 == 1) {
                    i = ((i13 & 98) + (i13 | 98)) - 1;
                    a = i % 128;
                    if (i % 2 == 0) {
                        ActivityRoster activityRoster6 = ActivityRoster.this;
                        byte[] bArr2 = activityRoster6.bJ;
                        int i110 = activityRoster6.bu;
                        int i111 = activityRoster6.bv;
                        throw null;
                    }
                    ActivityRoster activityRoster7 = ActivityRoster.this;
                    e.d(activityRoster7.bJ, activityRoster7.bu, activityRoster7.bv);
                    ActivityRoster activityRoster8 = ActivityRoster.this;
                    activityRoster8.bx = e.b(activityRoster8.bJ, activityRoster8.bu, activityRoster8.bv);
                    Message message2 = new Message();
                    message2.what = 0;
                    Bundle bundle2 = new Bundle();
                    int i112 = b;
                    int i113 = i112 ^ 41;
                    int i114 = ((i112 & 41) | i113) << 1;
                    int i210 = -i113;
                    int i211 = (i114 ^ i210) + ((i114 & i210) << 1);
                    a = i211 % 128;
                    int i212 = i211 % 2;
                    StringBuilder sbW2 = j.w(BuildConfig.FLAVOR);
                    sbW2.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                    int i213 = b;
                    int i214 = ((i213 ^ 81) | (i213 & 81)) << 1;
                    int i215 = -(((~i213) & 81) | (i213 & (-82)));
                    int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
                    a = i216 % 128;
                    int i217 = i216 % 2;
                    bundle2.putString("time", sbW2.toString());
                    int i218 = a;
                    int i219 = i218 & 33;
                    int i36 = i219 + ((i218 ^ 33) | i219);
                    b = i36 % 128;
                    int i37 = i36 % 2;
                    message2.setData(bundle2);
                    ActivityRoster.this.bt.sendMessage(message2);
                    int i38 = a;
                    int i39 = i38 & 43;
                    int i310 = i39 + ((i38 ^ 43) | i39);
                    b = i310 % 128;
                    int i311 = i310 % 2;
                } else {
                    continue;
                }
            }
        }
    }

    public class OooO00o implements RadioGroup.OnCheckedChangeListener {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & (-82)) | ((~i3) & 81);
            int i5 = (i3 & 81) << 1;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                ActivityRoster.this.radioButtonLanguage_yes.getId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i == ActivityRoster.this.radioButtonLanguage_yes.getId()) {
                int i7 = b;
                int i8 = i7 ^ 95;
                int i9 = -(-((i7 & 95) << 1));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                ActivityRoster.this.sp_attended_school.setVisibility(0);
                return;
            }
            if (i == ActivityRoster.this.radioButtonLanguage_no.getId()) {
                int i12 = b;
                int i13 = i12 & 27;
                int i14 = (i12 ^ 27) | i13;
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    ActivityRoster.this.sp_attended_school.setVisibility(35);
                } else {
                    ActivityRoster.this.sp_attended_school.setVisibility(8);
                }
                ActivityRoster.this.sp_attended_school.setSelection(1);
                ActivityRoster activityRoster = ActivityRoster.this;
                int i16 = a;
                int i17 = i16 ^ 45;
                int i18 = ((i16 & 45) | i17) << 1;
                int i19 = -i17;
                int i20 = (i18 & i19) + (i18 | i19);
                b = i20 % 128;
                int i21 = i20 % 2;
                if (activityRoster.sp_highest_education.getVisibility() == 0) {
                    int i22 = b;
                    int i23 = ((i22 ^ 13) | (i22 & 13)) << 1;
                    int i24 = -(((~i22) & 13) | (i22 & (-14)));
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    ActivityRoster.this.sp_highest_education.setVisibility(8);
                    int i27 = a;
                    int i28 = i27 & 105;
                    int i29 = (i28 - (~(-(-((i27 ^ 105) | i28))))) - 1;
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    ActivityRoster.this.sp_highest_education.setSelection(0);
                    int i31 = b;
                    int i32 = i31 & 51;
                    int i33 = (i32 - (~(-(-((i31 ^ 51) | i32))))) - 1;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                }
            }
            int i35 = a;
            int i36 = i35 ^ 83;
            int i37 = ((i35 & 83) | i36) << 1;
            int i38 = -i36;
            int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
            b = i39 % 128;
            int i40 = i39 % 2;
        }
    }

    public class o00oO0o implements J {
        private static int a = 0;
        private static int b = 1;

        public o00oO0o() {
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 13;
            int i4 = (i2 ^ 13) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            ActivityRoster activityRoster = ActivityRoster.this;
            activityRoster.aQ = arrayList;
            BISPApplication bISPApplication = activityRoster.bw;
            int i7 = b;
            int i8 = (i7 & 111) + (i7 | 111);
            a = i8 % 128;
            int i9 = i8 % 2;
            bISPApplication.O = arrayList;
            int i10 = b;
            int i11 = ((i10 | 89) << 1) - (i10 ^ 89);
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (true) {
                if (i13 >= ActivityRoster.this.aQ.size()) {
                    i13 = 0;
                    break;
                }
                int i14 = a;
                int i15 = i14 & 111;
                int i16 = -(-(i14 | 111));
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    ActivityRoster.this.aQ.get(i13);
                    throw null;
                }
                int optionId = ActivityRoster.this.aQ.get(i13).getOptionId();
                Roster roster = ActivityRoster.this.bn;
                int i18 = b + 121;
                a = i18 % 128;
                int i19 = i18 % 2;
                if (optionId == roster.work_activity) {
                    int i20 = a;
                    int i21 = (i20 ^ 93) + ((i20 & 93) << 1);
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = i20 + 77;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    break;
                }
                i13 = ((((i13 ^ (-103)) | (i13 & (-103))) << 1) - (((~i13) & (-103)) | (i13 & 102))) + 104;
                int i25 = a;
                int i26 = i25 & 81;
                int i27 = ((i25 ^ 81) | i26) << 1;
                int i28 = -((i25 | 81) & (~i26));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                b = i29 % 128;
                int i30 = i29 % 2;
            }
            ActivityRoster.this.sp_work_activity.setSelection(i13);
            int i31 = a;
            int i32 = (i31 & (-24)) | ((~i31) & 23);
            int i33 = -(-((i31 & 23) << 1));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            b = i34 % 128;
            int i35 = i34 % 2;
            ActivityRoster activityRoster2 = ActivityRoster.this;
            Spinner spinner = activityRoster2.sp_work_activity;
            int i36 = a;
            int i37 = ((i36 & (-112)) | ((~i36) & 111)) + ((i36 & 111) << 1);
            b = i37 % 128;
            if (i37 % 2 != 0) {
                spinner.setOnItemSelectedListener(activityRoster2.bh);
            } else {
                spinner.setOnItemSelectedListener(activityRoster2.bh);
                int i38 = 32 / 0;
            }
        }
    }

    public static void z(ActivityRoster activityRoster, int i, int i2, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = p;
        int i7 = (((i6 | 70) << 1) - (i6 ^ 70)) - 1;
        q = i7 % 128;
        int i8 = i7 % 2;
        activityRoster.sp_marital_status.setSelection(0);
        int i9 = GregorianCalendar.getInstance().get(1);
        int i10 = -i3;
        int i11 = (i9 & i10) + (i10 | i9);
        if (i2 == 0) {
            int i12 = p;
            int i13 = ((i12 | 109) << 1) - (((~i12) & 109) | (i12 & (-110)));
            q = i13 % 128;
            int i14 = i13 % 2;
            int i15 = GregorianCalendar.getInstance().get(2);
            int i16 = i15 ^ 1;
            int i17 = ((i15 & 1) | i16) << 1;
            int i18 = -i16;
            i4 = ((i17 | i18) << 1) - (i17 ^ i18);
            int i19 = q;
            int i20 = i19 & 101;
            int i21 = (i19 | 101) & (~i20);
            int i22 = -(-(i20 << 1));
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            p = i23 % 128;
            int i24 = i23 % 2;
        } else {
            int i25 = GregorianCalendar.getInstance().get(2);
            int i26 = (i25 & (-2)) | ((~i25) & 1);
            int i27 = (i25 & 1) << 1;
            if (i2 > (i26 ^ i27) + ((i27 & i26) << 1)) {
                int i28 = p;
                int i29 = ((i28 ^ 109) | (i28 & 109)) << 1;
                int i30 = -((109 & (~i28)) | (i28 & (-110)));
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                q = i31 % 128;
                int i32 = i31 % 2;
                int i33 = -(-((i11 ^ (-1)) | i11));
                i11 = (i11 ^ i33) + ((i33 & i11) << 1);
                int i34 = i28 & 41;
                int i35 = ((i28 ^ 41) | i34) << 1;
                int i36 = -((i28 | 41) & (~i34));
                int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                q = i37 % 128;
                int i38 = i37 % 2;
            }
            int i39 = GregorianCalendar.getInstance().get(2);
            int i40 = i39 ^ 1;
            int i41 = ((i39 & 1) | i40) << 1;
            int i42 = -i40;
            int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
            int i44 = -i2;
            int i45 = i43 & i44;
            i4 = ((((i43 ^ i44) | i45) << 1) - (~(-((i44 | i43) & (~i45))))) - 1;
            int i46 = q;
            int i47 = i46 & 89;
            int i48 = (i46 ^ 89) | i47;
            int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
            p = i49 % 128;
            int i50 = i49 % 2;
            if (i4 < 0) {
                int i51 = (i46 ^ 47) + ((i46 & 47) << 1);
                int i52 = i51 % 128;
                p = i52;
                i4 = i51 % 2 == 0 ? i4 << 106 : ((i4 & (-13)) | ((~i4) & 12)) + ((i4 & 12) << 1);
                int i53 = (i52 ^ 75) + ((i52 & 75) << 1);
                q = i53 % 128;
                int i54 = i53 % 2;
            }
        }
        String string = activityRoster.tv_dob.getText().toString();
        int i55 = q + 71;
        p = i55 % 128;
        int i56 = i55 % 2;
        String strL = j.l(i, "-", i4, "-", i11);
        int i57 = p + 72;
        int i58 = (i57 ^ (-1)) + (i57 << 1);
        q = i58 % 128;
        if (i58 % 2 == 0) {
            activityRoster.P(string, strL);
            return;
        }
        activityRoster.P(string, strL);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void Q() {
        int i;
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = (i3 | 109) << 1;
        int i5 = -(((~i3) & 109) | (i3 & (-110)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        q = i6 % 128;
        int i7 = i6 % 2;
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        this.bo = gregorianCalendar.get(1);
        int i8 = q;
        int i9 = i8 & 125;
        int i10 = -(-((i8 ^ 125) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        p = i11 % 128;
        if (i11 % 2 == 0) {
            i = 3;
            this.bp = gregorianCalendar.get(3);
        } else {
            this.bp = gregorianCalendar.get(2);
            i = 5;
        }
        this.aG = gregorianCalendar.get(i);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.ae, new V(this, 0), this.bo, this.bp, this.aG);
        DatePicker datePicker = datePickerDialog.getDatePicker();
        int i12 = this.bo;
        int i13 = (i12 | (-1900)) << 1;
        int i14 = -(i12 ^ (-1900));
        Date date = new Date(((i13 | i14) << 1) - (i14 ^ i13), this.bp, this.aG);
        int i15 = q;
        int i16 = (i15 ^ 95) + ((i15 & 95) << 1);
        p = i16 % 128;
        if (i16 % 2 != 0) {
            datePicker.setMaxDate(date.getTime());
            datePickerDialog.show();
        } else {
            datePicker.setMaxDate(date.getTime());
            datePickerDialog.show();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0475  */
    /* JADX WARN: Code duplicated, block: B:112:0x0479  */
    /* JADX WARN: Code duplicated, block: B:114:0x048f  */
    /* JADX WARN: Code duplicated, block: B:116:0x049d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0509  */
    /* JADX WARN: Code duplicated, block: B:131:0x0536  */
    /* JADX WARN: Code duplicated, block: B:132:0x0540  */
    /* JADX WARN: Code duplicated, block: B:134:0x0558  */
    /* JADX WARN: Code duplicated, block: B:135:0x055d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0560  */
    /* JADX WARN: Code duplicated, block: B:31:0x0155  */
    /* JADX WARN: Code duplicated, block: B:32:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x034a  */
    public void M(double d) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = 0;
        this.linearLayoutCNIC.setVisibility(0);
        RadioGroup radioGroup = this.radioGroupCNICOptions;
        int i5 = p;
        int i6 = ((i5 & 86) + (i5 | 86)) - 1;
        q = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            radioGroup.setVisibility(8);
            this.radioGroupCNICOptions.getCheckedRadioButtonId();
            throw null;
        }
        radioGroup.setVisibility(8);
        if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
            this.et_RosterCNIC.setVisibility(0);
            EditText editText = this.et_RosterCNICRepeat;
            int i7 = q;
            int i8 = ((i7 ^ 35) | (i7 & 35)) << 1;
            int i9 = -((i7 & (-36)) | ((~i7) & 35));
            int i10 = (i8 & i9) + (i8 | i9);
            p = i10 % 128;
            if (i10 % 2 == 0) {
                editText.setVisibility(0);
                this.buttonScanCNIC.setVisibility(23);
            } else {
                editText.setVisibility(0);
                this.buttonScanCNIC.setVisibility(8);
            }
            int i11 = q;
            int i12 = i11 & 53;
            int i13 = (((i11 | 53) & (~i12)) - (~(i12 << 1))) - 1;
            p = i13 % 128;
            if (i13 % 2 == 0) {
                this.btn_vald_cnic.setVisibility(57);
            } else {
                this.btn_vald_cnic.setVisibility(8);
            }
            if (this.aT < 3) {
                int i14 = p;
                int i15 = (i14 ^ 123) + ((i14 & 123) << 1);
                q = i15 % 128;
                int i16 = i15 % 2;
                this.btn_bio_cnic.setEnabled(true);
            } else {
                this.btn_bio_cnic.setEnabled(false);
            }
            this.por_roster.setVisibility(8);
            int i17 = q;
            int i18 = (i17 & 17) + (i17 | 17);
            p = i18 % 128;
            int i19 = i18 % 2;
        } else {
            this.et_RosterCNIC.setVisibility(8);
            EditText editText2 = this.et_RosterCNICRepeat;
            int i20 = p + 25;
            q = i20 % 128;
            int i21 = i20 % 2;
            editText2.setVisibility(8);
            if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId() || this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
                this.por_roster.setVisibility(0);
                this.buttonScanCNIC.setVisibility(8);
                int i22 = p;
                int i23 = i22 & 41;
                int i24 = -(-((i22 ^ 41) | i23));
                int i25 = (i23 & i24) + (i24 | i23);
                q = i25 % 128;
                if (i25 % 2 != 0) {
                    this.btn_vald_cnic.setVisibility(72);
                    if (this.aT < 4) {
                        int i26 = p + 15;
                        q = i26 % 128;
                        int i27 = i26 % 2;
                        this.btn_bio_cnic.setEnabled(true);
                    } else {
                        this.btn_bio_cnic.setEnabled(false);
                    }
                } else {
                    this.btn_vald_cnic.setVisibility(8);
                    if (this.aT < 3) {
                        int i28 = p + 15;
                        q = i28 % 128;
                        int i29 = i28 % 2;
                        this.btn_bio_cnic.setEnabled(true);
                    } else {
                        this.btn_bio_cnic.setEnabled(false);
                    }
                }
            } else {
                int i30 = q;
                int i31 = (i30 & 81) + (i30 | 81);
                p = i31 % 128;
                int i32 = i31 % 2;
                this.por_roster.setVisibility(8);
                Button button = this.buttonScanCNIC;
                int i33 = q;
                int i34 = ((i33 | 121) << 1) - (i33 ^ 121);
                p = i34 % 128;
                int i35 = i34 % 2;
                button.setVisibility(8);
                this.btn_vald_cnic.setVisibility(8);
                int i36 = p + 121;
                q = i36 % 128;
                int i37 = i36 % 2;
            }
        }
        this.et_RosterBForm.setEnabled(false);
        this.et_RosterBForm.setText(BuildConfig.FLAVOR);
        EditText editText3 = this.et_RosterBForm;
        int i38 = q;
        int i39 = i38 | 103;
        int i40 = i39 << 1;
        int i41 = -((~(i38 & 103)) & i39);
        int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
        p = i42 % 128;
        int i43 = i42 % 2;
        editText3.setVisibility(8);
        this.et_RosterBFormRepeat.setEnabled(false);
        int i44 = q + 23;
        p = i44 % 128;
        if (i44 % 2 == 0) {
            this.et_RosterBFormRepeat.setText(BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        this.et_RosterBFormRepeat.setText(BuildConfig.FLAVOR);
        this.et_RosterBFormRepeat.setVisibility(8);
        if (d < 17.0d) {
            int i45 = q;
            int i46 = (i45 & 34) + (i45 | 34);
            int i47 = (i46 ^ (-1)) + (i46 << 1);
            p = i47 % 128;
            int i48 = i47 % 2;
            this.sp_marital_status.setSelection(0);
            int i49 = p + 55;
            q = i49 % 128;
            int i50 = i49 % 2;
        }
        int checkedRadioButtonId = this.radioGroupGender.getCheckedRadioButtonId();
        RadioButton radioButton = this.radioButtonMale;
        int i51 = q;
        int i52 = i51 & 47;
        int i53 = ((i51 ^ 47) | i52) << 1;
        int i54 = -((~i52) & (i51 | 47));
        int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
        p = i55 % 128;
        int i56 = i55 % 2;
        if (checkedRadioButtonId == radioButton.getId()) {
            int i57 = q;
            int i58 = ((i57 & 64) + (i57 | 64)) - 1;
            int i59 = i58 % 128;
            p = i59;
            if (i58 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (d < 13.0d) {
                int i60 = ((((i59 ^ 91) | (i59 & 91)) << 1) - (~(-(((~i59) & 91) | (i59 & (-92)))))) - 1;
                q = i60 % 128;
                if (i60 % 2 != 0) {
                    this.sp_marital_status.setVisibility(101);
                } else {
                    this.sp_marital_status.setVisibility(8);
                }
            } else {
                this.sp_marital_status.setVisibility(0);
            }
        } else if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonFemale.getId()) {
            int i61 = p + 49;
            int i62 = i61 % 128;
            q = i62;
            int i63 = i61 % 2;
            if (d < 10.0d) {
                int i64 = (((i62 | 80) << 1) - (i62 ^ 80)) - 1;
                p = i64 % 128;
                if (i64 % 2 == 0) {
                    this.sp_marital_status.setVisibility(82);
                } else {
                    this.sp_marital_status.setVisibility(8);
                }
            } else {
                this.sp_marital_status.setVisibility(0);
            }
        }
        if (d >= 4.0d) {
            int i65 = p;
            int i66 = i65 & 93;
            int i67 = ((i65 | 93) & (~i66)) + (i66 << 1);
            q = i67 % 128;
            int i68 = i67 % 2;
            this.tv_languageQuestion.setVisibility(0);
            RadioGroup radioGroup2 = this.radioGroupLanguage;
            int i69 = p;
            int i70 = i69 ^ 55;
            int i71 = ((i69 & 55) | i70) << 1;
            int i72 = -i70;
            int i73 = (i71 & i72) + (i71 | i72);
            q = i73 % 128;
            if (i73 % 2 != 0) {
                radioGroup2.setVisibility(1);
            } else {
                radioGroup2.setVisibility(0);
            }
            int i74 = q;
            int i75 = i74 & 21;
            int i76 = i75 + ((i74 ^ 21) | i75);
            p = i76 % 128;
            if (i76 % 2 == 0) {
                int i77 = 2 % 4;
            }
        } else {
            this.tv_languageQuestion.setVisibility(8);
            this.radioGroupLanguage.setVisibility(8);
            int i78 = p;
            int i79 = (((i78 & (-102)) | ((~i78) & 101)) - (~((i78 & 101) << 1))) - 1;
            q = i79 % 128;
            int i80 = i79 % 2;
        }
        this.radioButtonLanguage_yes.setChecked(false);
        this.radioButtonLanguage_no.setChecked(false);
        int i81 = q;
        int i82 = i81 | 89;
        int i83 = i82 << 1;
        int i84 = -((~(i81 & 89)) & i82);
        int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
        p = i85 % 128;
        if (i85 % 2 == 0) {
            this.radioGroupLanguage.clearCheck();
            throw null;
        }
        this.radioGroupLanguage.clearCheck();
        if (d >= 4.0d) {
            this.sp_attended_school.setVisibility(0);
            Spinner spinner = this.sp_attended_school;
            int i86 = q + 63;
            p = i86 % 128;
            if (i86 % 2 != 0 ? spinner.getSelectedItemPosition() == 2 : spinner.getSelectedItemPosition() == 4) {
                this.sp_highest_education.setVisibility(0);
            } else if (this.sp_attended_school.getSelectedItemPosition() != 3) {
                int i87 = p;
                int i88 = (i87 & 113) + (i87 | 113);
                q = i88 % 128;
                if (i88 % 2 != 0) {
                    this.sp_highest_education.setVisibility(127);
                } else {
                    this.sp_highest_education.setVisibility(8);
                }
            } else {
                this.sp_highest_education.setVisibility(0);
            }
        } else {
            this.sp_attended_school.setVisibility(8);
            Spinner spinner2 = this.sp_highest_education;
            int i89 = p;
            int i90 = (-2) - ((((i89 | 58) << 1) - (i89 ^ 58)) ^ (-1));
            q = i90 % 128;
            int i91 = i90 % 2;
            spinner2.setVisibility(8);
            int i92 = q;
            int i93 = (i92 & (-100)) | ((~i92) & 99);
            int i94 = -(-((i92 & 99) << 1));
            int i95 = (i93 & i94) + (i94 | i93);
            p = i95 % 128;
            int i96 = i95 % 2;
        }
        au auVar = new au(this, "highest_completed_education", getResources().getString(R.string.education_level), this.sp_highest_education, "education_update", new C0207n(this, d));
        int i97 = p;
        int i98 = i97 & 85;
        int i99 = (((i97 ^ 85) | i98) << 1) - ((i97 | 85) & (~i98));
        q = i99 % 128;
        if (i99 % 2 != 0) {
            auVar.execute(new Void[1]);
        } else {
            auVar.execute(new Void[0]);
        }
        int i100 = p;
        int i101 = (i100 & 53) + (i100 | 53);
        q = i101 % 128;
        if (i101 % 2 != 0) {
            throw null;
        }
        if (d < 10.0d) {
            this.sp_work_activity.setVisibility(8);
            this.sp_work_activity.setSelection(0);
            this.sp_employment_status.setVisibility(8);
            int i102 = q;
            int i103 = i102 & 113;
            int i104 = -(-(i102 | 113));
            int i105 = (i103 & i104) + (i104 | i103);
            p = i105 % 128;
            int i106 = i105 % 2;
            this.sp_employment_status.setSelection(0);
            this.tv_workingHourQuestion.setVisibility(8);
            this.et_hoursWorked.setVisibility(8);
            int i107 = p;
            int i108 = (i107 & 87) + (i107 | 87);
            q = i108 % 128;
            int i109 = i108 % 2;
        } else {
            this.sp_work_activity.setVisibility(0);
            this.sp_work_activity.setSelection(0);
            int i110 = p + 97;
            q = i110 % 128;
            int i111 = i110 % 2;
            this.sp_employment_status.setVisibility(0);
            this.sp_employment_status.setSelection(0);
            int i112 = p;
            int i113 = (i112 ^ 123) + ((i112 & 123) << 1);
            q = i113 % 128;
            int i114 = i113 % 2;
        }
        int i115 = this.ac;
        if (i115 != 1) {
            int i116 = q;
            int i117 = (i116 & 3) + (i116 | 3);
            int i118 = i117 % 128;
            p = i118;
            int i119 = i117 % 2;
            if (i115 != 2) {
                int i120 = i118 & 23;
                int i121 = i120 + ((i118 ^ 23) | i120);
                q = i121 % 128;
                if (i121 % 2 != 0) {
                    boolean z = ag.d;
                    throw null;
                }
                if (!ag.d) {
                    i = 121;
                } else if (ag.j == 1) {
                    int i122 = p;
                    int i123 = (-2) - (((i122 & 118) + (i122 | 118)) ^ (-1));
                    q = i123 % 128;
                    int i124 = i123 % 2;
                    if (d < 18.0d) {
                        i = 121;
                        this.checkBoxBispBenif.setVisibility(8);
                        int i125 = q;
                        int i126 = i125 & 101;
                        i2 = (i126 - (~((i125 ^ 101) | i126))) - 1;
                        p = i2 % 128;
                        if (i2 % 2 == 0) {
                            this.aY = false;
                            int i127 = 4 / 0;
                        } else {
                            this.aY = false;
                        }
                    } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId() || this.et_RosterCNIC.length() != 15) {
                        i = 121;
                        this.checkBoxBispBenif.setVisibility(8);
                        this.aY = false;
                    } else {
                        int i128 = p;
                        int i129 = ((i128 ^ 45) | (i128 & 45)) << 1;
                        int i130 = -(((~i128) & 45) | (i128 & (-46)));
                        int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
                        q = i131 % 128;
                        int i132 = i131 % 2;
                        if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonFemale.getId()) {
                            int i133 = p;
                            int i134 = (i133 & 77) + (i133 | 77);
                            q = i134 % 128;
                            if (i134 % 2 != 0) {
                                this.sp_marital_status.getSelectedItemPosition();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (this.sp_marital_status.getSelectedItemPosition() != 0) {
                                int i135 = q;
                                int i136 = i135 ^ 35;
                                int i137 = -(-((i135 & 35) << 1));
                                int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                                p = i138 % 128;
                                int i139 = i138 % 2;
                                if (this.sp_marital_status.getSelectedItemPosition() != 1) {
                                    this.checkBoxBispBenif.setVisibility(0);
                                    this.aY = true;
                                } else {
                                    this.checkBoxBispBenif.setVisibility(8);
                                    this.aY = false;
                                }
                            } else {
                                this.checkBoxBispBenif.setVisibility(8);
                                this.aY = false;
                            }
                            i = 121;
                        } else {
                            this.checkBoxBispBenif.setVisibility(8);
                            this.aY = false;
                            int i140 = p;
                            i = 121;
                            int i141 = (((i140 & (-122)) | ((~i140) & 121)) - (~((i140 & 121) << 1))) - 1;
                            q = i141 % 128;
                            int i142 = i141 % 2;
                        }
                    }
                } else {
                    i = 121;
                }
            } else if (ag.j == 1) {
                int i1210 = p;
                int i1211 = (-2) - (((i1210 & 118) + (i1210 | 118)) ^ (-1));
                q = i1211 % 128;
                int i1212 = i1211 % 2;
                if (d < 18.0d) {
                    i = 121;
                    this.checkBoxBispBenif.setVisibility(8);
                    int i1213 = q;
                    int i1214 = i1213 & 101;
                    i2 = (i1214 - (~((i1213 ^ 101) | i1214))) - 1;
                    p = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.aY = false;
                        int i1215 = 4 / 0;
                    } else {
                        this.aY = false;
                    }
                } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
                    i = 121;
                    this.checkBoxBispBenif.setVisibility(8);
                    this.aY = false;
                } else {
                    i = 121;
                    this.checkBoxBispBenif.setVisibility(8);
                    this.aY = false;
                }
            } else {
                i = 121;
            }
        } else if (ag.j == 1) {
            int i1216 = p;
            int i1217 = (-2) - (((i1216 & 118) + (i1216 | 118)) ^ (-1));
            q = i1217 % 128;
            int i1218 = i1217 % 2;
            if (d < 18.0d) {
                i = 121;
                this.checkBoxBispBenif.setVisibility(8);
                int i1219 = q;
                int i12110 = i1219 & 101;
                i2 = (i12110 - (~((i1219 ^ 101) | i12110))) - 1;
                p = i2 % 128;
                if (i2 % 2 == 0) {
                    this.aY = false;
                    int i12111 = 4 / 0;
                } else {
                    this.aY = false;
                }
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
                i = 121;
                this.checkBoxBispBenif.setVisibility(8);
                this.aY = false;
            } else {
                i = 121;
                this.checkBoxBispBenif.setVisibility(8);
                this.aY = false;
            }
        } else {
            i = 121;
        }
        if (d == 0.0d) {
            this.linearLayoutCNIC.setVisibility(0);
            this.linearLayoutCNICPic.setVisibility(8);
            RadioGroup radioGroup3 = this.radioGroupCNICOptions;
            int i143 = p;
            int i144 = i143 & 73;
            int i145 = (i143 ^ 73) | i144;
            int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
            q = i146 % 128;
            if (i146 % 2 != 0) {
                radioGroup3.setVisibility(i);
                this.et_RosterCNIC.setVisibility(1);
                this.et_RosterCNIC.setEnabled(true);
            } else {
                radioGroup3.setVisibility(8);
                this.et_RosterCNIC.setVisibility(0);
                this.et_RosterCNIC.setEnabled(false);
            }
            this.buttonScanCNIC.setVisibility(8);
            this.btn_vald_cnic.setVisibility(8);
            EditText editText4 = this.et_RosterCNICRepeat;
            int i147 = q;
            int i148 = ((i147 ^ 33) - (~((i147 & 33) << 1))) - 1;
            p = i148 % 128;
            if (i148 % 2 == 0) {
                editText4.setVisibility(1);
                this.et_RosterCNICRepeat.setEnabled(false);
                this.et_RosterBForm.setEnabled(true);
            } else {
                editText4.setVisibility(0);
                this.et_RosterCNICRepeat.setEnabled(false);
                this.et_RosterBForm.setEnabled(false);
            }
            this.et_RosterBForm.setText(BuildConfig.FLAVOR);
            this.et_RosterBForm.setVisibility(8);
            Spinner spinner3 = this.sp_marital_status;
            int i149 = q;
            int i150 = ((i149 ^ 123) | (i149 & 123)) << 1;
            int i151 = -(((~i149) & 123) | (i149 & (-124)));
            int i152 = (i150 & i151) + (i151 | i150);
            p = i152 % 128;
            int i153 = i152 % 2;
            spinner3.setVisibility(0);
            this.et_RosterBFormRepeat.setEnabled(false);
            this.et_RosterBFormRepeat.setText(BuildConfig.FLAVOR);
            this.et_RosterBFormRepeat.setVisibility(8);
            this.tv_languageQuestion.setVisibility(0);
            RadioGroup radioGroup4 = this.radioGroupLanguage;
            int i154 = p;
            int i155 = i154 ^ 23;
            int i156 = (i154 & 23) << 1;
            int i157 = (i155 ^ i156) + ((i156 & i155) << 1);
            q = i157 % 128;
            if (i157 % 2 != 0) {
                radioGroup4.setVisibility(0);
                this.radioGroupGender.setEnabled(false);
            } else {
                radioGroup4.setVisibility(0);
                this.radioGroupGender.setEnabled(true);
            }
            int i158 = 0;
            while (i158 < this.radioGroupGender.getChildCount()) {
                int i159 = q;
                int i160 = i159 & 13;
                int i161 = ((((i159 ^ 13) | i160) << 1) - (~(-((i159 | 13) & (~i160))))) - 1;
                p = i161 % 128;
                i158 = i161 % 2 == 0 ? j.i(this.radioGroupGender, i158, true, i158, 0) : j.i(this.radioGroupGender, i158, true, i158, 1);
                int i162 = q + 39;
                p = i162 % 128;
                if (i162 % 2 == 0) {
                    int i163 = 3 % 4;
                }
            }
            while (i4 < this.radioGroupCalendar.getChildCount()) {
                i4 = j.i(this.radioGroupCalendar, i4, true, i4, 1);
                int i164 = q;
                int i165 = ((i164 | 98) << 1) - (i164 ^ 98);
                int i166 = (i165 ^ (-1)) + (i165 << 1);
                p = i166 % 128;
                int i167 = i166 % 2;
            }
            this.por_roster.setVisibility(8);
        }
    }

    @OnClick
    public void saveToRosterList(View view) {
        Object obj;
        String str;
        boolean z;
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 ^ 8) + ((i2 & 8) << 1)) - 1;
        q = i3 % 128;
        int i4 = i3 % 2;
        int size = this.bj.size();
        int i5 = q;
        int i6 = (i5 & 9) + (i5 | 9);
        p = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            obj = null;
            if (i8 >= size) {
                int i9 = q + 61;
                p = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 5 / 2;
                }
                str = BuildConfig.FLAVOR;
                z = false;
                break;
            }
            int i11 = p;
            int i12 = ((i11 | 63) << 1) - (i11 ^ 63);
            q = i12 % 128;
            if (i12 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i8 != this.aV && this.bj.get(i8).relation_to_household_id == 186) {
                int i13 = p;
                int i14 = ((i13 | 30) << 1) - (i13 ^ 30);
                int i15 = (i14 ^ (-1)) + (i14 << 1);
                q = i15 % 128;
                int i16 = i15 % 2;
                str = this.bj.get(i8).name_of_member;
                int i17 = p + 81;
                q = i17 % 128;
                int i18 = i17 % 2;
                ag.i = str;
                int i19 = q;
                int i20 = (((i19 | 24) << 1) - (i19 ^ 24)) - 1;
                p = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 2 / 2;
                }
                z = true;
                break;
            }
            int i22 = i8 | 1;
            int i23 = i22 << 1;
            int i24 = -((~(i8 & 1)) & i22);
            i8 = ((i24 & i23) << 1) + (i23 ^ i24);
            int i25 = p + 93;
            q = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 4 / 3;
            }
        }
        ArrayList<Item> arrayList = this.aL;
        int selectedItemPosition = this.sp_relation_to_household.getSelectedItemPosition();
        int i27 = p;
        int i28 = i27 | 53;
        int i29 = i28 << 1;
        int i30 = -((~(i27 & 53)) & i28);
        int i31 = (i29 & i30) + (i30 | i29);
        q = i31 % 128;
        if (i31 % 2 == 0 ? arrayList.get(selectedItemPosition).getOptionId() == 186 : arrayList.get(selectedItemPosition).getOptionId() == 23538) {
            if (z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.ae);
                builder.setTitle("Alert.!");
                StringBuilder sb = new StringBuilder();
                int i32 = q;
                int i33 = i32 & 67;
                int i34 = i33 + ((i32 ^ 67) | i33);
                p = i34 % 128;
                if (i34 % 2 == 0) {
                    sb.append("HouseHold is already exist on ");
                    sb.append(str);
                    int i35 = 29 / 0;
                } else {
                    sb.append("HouseHold is already exist on ");
                    sb.append(str);
                }
                sb.append(" \nPlease Change HouseHold Status First");
                String string = sb.toString();
                int i36 = q;
                int i37 = i36 & 37;
                int i38 = (i36 | 37) & (~i37);
                int i39 = -(-(i37 << 1));
                int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                p = i40 % 128;
                if (i40 % 2 == 0) {
                    builder.setMessage(string);
                } else {
                    builder.setMessage(string);
                }
                builder.setCancelable(true);
                builder.setPositiveButton("ok", new OooOOOO(this));
                int i41 = q;
                int i42 = i41 & 37;
                int i43 = -(-(i41 | 37));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                p = i44 % 128;
                int i45 = i44 % 2;
                builder.create().show();
                int i46 = p;
                int i47 = (i46 ^ 13) + ((i46 & 13) << 1);
                q = i47 % 128;
                int i48 = i47 % 2;
                return;
            }
        }
        new o0Oo0oo(this).execute(new Void[0]);
        int i49 = p;
        int i50 = (-2) - ((((i49 | 116) << 1) - (i49 ^ 116)) ^ (-1));
        int i51 = i50 % 128;
        q = i51;
        if (i50 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i52 = ((i51 | 119) << 1) - (i51 ^ 119);
        p = i52 % 128;
        int i53 = i52 % 2;
    }

    public class oo0o0Oo implements TextWatcher {
        private static int a = 1;
        private static int b;

        public oo0o0Oo(EditText editText) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 3) + (i2 | 3);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (i5 ^ 117) + ((i5 & 117) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:115:0x0282 A[Catch: Exception -> 0x0314, TRY_ENTER, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:116:0x0285 A[Catch: Exception -> 0x0314, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:119:0x029a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:120:0x029b  */
        /* JADX WARN: Code duplicated, block: B:122:0x029f A[Catch: Exception -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:127:0x02ac A[Catch: Exception -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:132:0x02dc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:133:0x02dd  */
        /* JADX WARN: Code duplicated, block: B:134:0x02de A[Catch: Exception -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:137:0x02f6 A[Catch: Exception -> 0x0314, TRY_ENTER, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:138:0x02f9 A[Catch: Exception -> 0x0314, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00f8 A[Catch: Exception -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:55:0x0117  */
        /* JADX WARN: Code duplicated, block: B:60:0x0147  */
        /* JADX WARN: Code duplicated, block: B:62:0x0160 A[Catch: Exception -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x016e A[Catch: Exception -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x0181 A[Catch: Exception -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x0191 A[Catch: Exception -> 0x0314, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:94:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:96:0x0209 A[Catch: Exception -> 0x0314, TRY_ENTER, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:98:0x0213 A[Catch: Exception -> 0x0314, TRY_LEAVE, TryCatch #5 {Exception -> 0x0314, blocks: (B:4:0x0016, B:9:0x0036, B:11:0x003f, B:16:0x004a, B:19:0x0067, B:20:0x006a, B:22:0x0073, B:24:0x008e, B:31:0x00c3, B:41:0x00eb, B:44:0x00f0, B:45:0x00f2, B:46:0x00f5, B:49:0x00f8, B:52:0x010f, B:56:0x0124, B:58:0x013f, B:62:0x0160, B:64:0x016a, B:71:0x0181, B:73:0x018b, B:83:0x01af, B:85:0x01c3, B:78:0x0191, B:68:0x016e, B:90:0x01da, B:92:0x01ef, B:96:0x0209, B:98:0x0213, B:102:0x0231, B:103:0x0233, B:107:0x0254, B:104:0x0239, B:112:0x026a, B:115:0x0282, B:116:0x0285, B:122:0x029f, B:123:0x02a6, B:124:0x02a9, B:127:0x02ac, B:129:0x02c4, B:134:0x02de, B:137:0x02f6, B:138:0x02f9, B:21:0x006f, B:15:0x0043, B:26:0x009f, B:29:0x00b8, B:141:0x030d, B:142:0x0311), top: B:158:0x0014 }] */
        /* JADX WARN: Code restructure failed: missing block: B:161:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x018c, code lost:
        
            if (r12 == r9.c.rb_afghani_por.getId()) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0199, code lost:
        
            if (r12 == r9.c.rb_afghani_por.getId()) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x019b, code lost:
        
            r12 = ivas.gov.bisp.enumeration.ActivityRoster.oo0o0Oo.b;
            r0 = r12 & 61;
            r12 = ((r12 | 61) & (~r0)) + (r0 << 1);
            ivas.gov.bisp.enumeration.ActivityRoster.oo0o0Oo.a = r12 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x01aa, code lost:
        
            if ((r12 % 2) != 0) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01ac, code lost:
        
            r12 = 3 / 5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01af, code lost:
        
            r9.c.checkBoxBispBenif.setVisibility(8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ActivityRoster.oo0o0Oo.b;
            r12 = ((r11 | 81) << 1) - (r11 ^ 81);
            ivas.gov.bisp.enumeration.ActivityRoster.oo0o0Oo.a = r12 % 128;
            r12 = r12 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
        
            r9.c.aY = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x01c7, code lost:
        
            r11 = ivas.gov.bisp.enumeration.ActivityRoster.oo0o0Oo.b;
            r12 = ((r11 | 107) << 1) - (r11 ^ 107);
            ivas.gov.bisp.enumeration.ActivityRoster.oo0o0Oo.a = r12 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x01d4, code lost:
        
            if ((r12 % 2) != 0) goto L161;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x01d6, code lost:
        
            r10 = 80 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x01d9, code lost:
        
            return;
         */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
            /*
                Method dump skipped, instruction units count: 802
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ActivityRoster.oo0o0Oo.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public final void I() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 79;
        p = i3 % 128;
        int i4 = i3 % 2;
        this.bs = false;
        this.aJ = false;
        TextView textView = this.vald_txt_view;
        int i5 = i2 | 113;
        int i6 = i5 << 1;
        int i7 = -((~(i2 & 113)) & i5);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        p = i8 % 128;
        int i9 = i8 % 2;
        textView.setText(BuildConfig.FLAVOR);
        TextView textView2 = this.vald_txt_view;
        int color = getResources().getColor(android.R.color.holo_green_dark);
        int i10 = q + 59;
        p = i10 % 128;
        int i11 = i10 % 2;
        textView2.setTextColor(color);
        this.bG = BuildConfig.FLAVOR;
        this.bH = BuildConfig.FLAVOR;
        int i12 = p;
        int i13 = ((i12 | 47) << 1) - (i12 ^ 47);
        q = i13 % 128;
        int i14 = i13 % 2;
        this.bI = BuildConfig.FLAVOR;
        this.bD = BuildConfig.FLAVOR;
        int i15 = i12 & 9;
        int i16 = -(-(i12 | 9));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        q = i17 % 128;
        int i18 = i17 % 2;
        this.bE = BuildConfig.FLAVOR;
        this.bC = BuildConfig.FLAVOR;
        this.bK = BuildConfig.FLAVOR;
        int i19 = (i12 & (-122)) | ((~i12) & 121);
        int i20 = -(-((i12 & 121) << 1));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        q = i21 % 128;
        if (i21 % 2 == 0) {
            this.bB = BuildConfig.FLAVOR;
        } else {
            this.bB = BuildConfig.FLAVOR;
            int i22 = 15 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 101;
        int i4 = ((i2 | 101) & (~i3)) + (i3 << 1);
        q = i4 % 128;
        int i5 = i4 % 2;
        super.onResume();
        if (ax.c(this)) {
            int i6 = q;
            int i7 = i6 & 61;
            int i8 = i7 + ((i6 ^ 61) | i7);
            p = i8 % 128;
            int i9 = i8 % 2;
            this.btn_vald_cnic.setEnabled(true);
            int i10 = p + 71;
            q = i10 % 128;
            int i11 = i10 % 2;
        }
        if (!this.bc) {
            int i12 = q;
            int i13 = (i12 ^ 107) + ((i12 & 107) << 1);
            p = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ah.c.d.getInt("IsTimeableScreen", 1);
            int i16 = q;
            int i17 = (((i16 | 60) << 1) - (i16 ^ 60)) - 1;
            int i18 = i17 % 128;
            p = i18;
            int i19 = i17 % 2;
            if (i15 == 1) {
                int i20 = i18 & 17;
                int i21 = ((((i18 ^ 17) | i20) << 1) - (~(-((i18 | 17) & (~i20))))) - 1;
                q = i21 % 128;
                int i22 = i21 % 2;
                OooOOO oooOOO = new OooOOO(ah.c.d.getInt("roster_time", 0) * 1000, 1000L);
                int i23 = q;
                int i24 = ((i23 | 99) << 1) - (i23 ^ 99);
                p = i24 % 128;
                if (i24 % 2 != 0) {
                    this.aX = oooOOO.start();
                    return;
                }
                this.aX = oooOOO.start();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this.textViewTimeRemaining.setVisibility(8);
        this.btn_save.setEnabled(true);
        int i25 = p;
        int i26 = i25 & 15;
        int i27 = (((i25 ^ 15) | i26) << 1) - ((i25 | 15) & (~i26));
        q = i27 % 128;
        int i28 = i27 % 2;
    }

    @OnClick
    public void valdClicked(View view) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 41;
        int i4 = (((i2 ^ 41) | i3) << 1) - ((i2 | 41) & (~i3));
        q = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (this.et_RosterCNIC.getText().length() == 15) {
            int i6 = q + 79;
            p = i6 % 128;
            int i7 = i6 % 2;
            Roster roster = this.bn;
            String str = roster.cnic;
            String str2 = roster.cnicRepeat;
            int i8 = p;
            int i9 = i8 & 63;
            int i10 = i9 + ((i8 ^ 63) | i9);
            q = i10 % 128;
            if (i10 % 2 != 0) {
                str.equalsIgnoreCase(str2);
                obj.hashCode();
                throw null;
            }
            if (!str.equalsIgnoreCase(str2)) {
                b bVarB = new b.aIz(this).b();
                int i11 = q;
                int i12 = ((((i11 ^ 71) | (i11 & 71)) << 1) - (~(-(((~i11) & 71) | (i11 & (-72)))))) - 1;
                p = i12 % 128;
                int i13 = i12 % 2;
                bVarB.setTitle("Confirm CNIC does not matched!");
                AlertController alertController = bVarB.a;
                alertController.f = "Please enter correct CNIC!";
                int i14 = p;
                int i15 = i14 & 67;
                int i16 = ((i14 | 67) & (~i15)) + (i15 << 1);
                q = i16 % 128;
                int i17 = i16 % 2;
                TextView textView = alertController.H;
                if (textView != null) {
                    int i18 = q + 55;
                    p = i18 % 128;
                    if (i18 % 2 == 0) {
                        textView.setText("Please enter correct CNIC!");
                        obj.hashCode();
                        throw null;
                    }
                    textView.setText("Please enter correct CNIC!");
                }
                OooOOO0 oooOOO0 = new OooOOO0(this);
                int i19 = q;
                int i20 = i19 & 63;
                int i21 = -(-(i19 | 63));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                p = i22 % 128;
                int i23 = i22 % 2;
                bVarB.i(-3, "OK", oooOOO0);
                bVarB.setCancelable(false);
                bVarB.show();
                int i24 = p;
                int i25 = i24 & 113;
                int i26 = i25 + ((i24 ^ 113) | i25);
                q = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
                return;
            }
        } else {
            b.aIz aiz = new b.aIz(this);
            AlertController.OooO0O0 oooO0O0 = aiz.a;
            int i27 = p;
            int i28 = i27 ^ 9;
            int i29 = ((((i27 & 9) | i28) << 1) - (~(-i28))) - 1;
            q = i29 % 128;
            if (i29 % 2 != 0) {
                oooO0O0.e = "Info";
                oooO0O0.f = "Please enter valid CNIC!";
                int i30 = 47 / 0;
            } else {
                oooO0O0.e = "Info";
                oooO0O0.f = "Please enter valid CNIC!";
            }
            oooO0O0.h = "Ok";
            oooO0O0.i = null;
            aiz.d();
            int i31 = q;
            int i32 = i31 & 93;
            int i33 = (~i32) & (i31 | 93);
            int i34 = -(-(i32 << 1));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            p = i35 % 128;
            int i36 = i35 % 2;
            int i37 = i31 + 113;
            p = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = p;
        int i40 = (i39 & (-20)) | ((~i39) & 19);
        int i41 = (i39 & 19) << 1;
        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
        q = i42 % 128;
        if (i42 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if ((r5 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r0.setChecked(false);
        r9.ai.setImageResource(ivas.gov.bisp.enumeration.R.drawable.image_boarder);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if ((!r9.bz.isShowing()) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r0 = ivas.gov.bisp.enumeration.ActivityRoster.p;
        r4 = r0 & 19;
        r0 = -(-((r0 ^ 19) | r4));
        r5 = (r4 & r0) + (r0 | r4);
        ivas.gov.bisp.enumeration.ActivityRoster.q = r5 % 128;
        r5 = r5 % 2;
        r9.bz.dismiss();
        r0 = ivas.gov.bisp.enumeration.ActivityRoster.p + 7;
        ivas.gov.bisp.enumeration.ActivityRoster.q = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        r9.bz.show();
        r0 = r9.ak.f();
        r4 = ivas.gov.bisp.enumeration.ActivityRoster.q;
        r5 = r4 & 99;
        r4 = r4 | 99;
        r6 = ((r5 | r4) << 1) - (r4 ^ r5);
        ivas.gov.bisp.enumeration.ActivityRoster.p = r6 % 128;
        r6 = r6 % 2;
        r4 = r9.ak.h();
        r5 = r9.ak.j();
        r6 = ivas.gov.bisp.enumeration.ActivityRoster.q;
        r7 = r6 + 49;
        ivas.gov.bisp.enumeration.ActivityRoster.p = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        if (r4 != 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        r4 = r6 ^ 95;
        r7 = ((r6 & 95) | r4) << 1;
        r4 = -r4;
        r8 = (r7 & r4) + (r4 | r7);
        ivas.gov.bisp.enumeration.ActivityRoster.p = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (r5 != 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        r4 = ((r6 ^ 75) | (r6 & 75)) << 1;
        r5 = -((r6 & (-76)) | ((~r6) & 75));
        r6 = (r4 ^ r5) + ((r4 & r5) << 1);
        ivas.gov.bisp.enumeration.ActivityRoster.p = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cc, code lost:
    
        if ((r6 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r0 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        if (r0 != 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        r0 = java.util.concurrent.Executors.newSingleThreadExecutor();
        r9.al = r0;
        r1 = new ivas.gov.bisp.enumeration.ActivityRoster.o0OO00O(r9);
        r2 = ivas.gov.bisp.enumeration.ActivityRoster.p;
        r4 = ((r2 & (-80)) | ((~r2) & 79)) + ((r2 & 79) << 1);
        ivas.gov.bisp.enumeration.ActivityRoster.q = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ef, code lost:
    
        if ((r4 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f1, code lost:
    
        r0.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f5, code lost:
    
        r0.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
    
        r9.bF = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        android.widget.Toast.makeText(getApplicationContext(), "Drivers not initialized,Please try again", 0).show();
        r0 = ivas.gov.bisp.enumeration.ActivityRoster.p;
        r1 = r0 | 39;
        r4 = (r1 << 1) - ((~(r0 & 39)) & r1);
        ivas.gov.bisp.enumeration.ActivityRoster.q = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011f, code lost:
    
        if ((!r9.bz.isShowing()) == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
    
        r0 = ivas.gov.bisp.enumeration.ActivityRoster.q;
        r1 = ((r0 | 51) << 1) - (r0 ^ 51);
        ivas.gov.bisp.enumeration.ActivityRoster.p = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012e, code lost:
    
        if ((r1 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0130, code lost:
    
        r9.bz.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0136, code lost:
    
        r9.bz.dismiss();
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013f, code lost:
    
        r9.bz.hide();
        r0 = ivas.gov.bisp.enumeration.ActivityRoster.p;
        r1 = ((r0 | 104) << 1) - (r0 ^ 104);
        r0 = (r1 ^ (-1)) + (r1 << 1);
        ivas.gov.bisp.enumeration.ActivityRoster.q = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0155, code lost:
    
        if ((r0 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0157, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0158, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015c, code lost:
    
        r0.setChecked(false);
        r9.ai.setImageResource(ivas.gov.bisp.enumeration.R.drawable.image_boarder);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0164, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0165, code lost:
    
        ivas.gov.bisp.enumeration.p085h.k.c(r9, r9.by, r9.bL);
        r0 = ivas.gov.bisp.enumeration.ActivityRoster.p;
        r0 = (-2) - ((((r0 | 20) << 1) - (r0 ^ 20)) ^ (-1));
        ivas.gov.bisp.enumeration.ActivityRoster.q = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x017d, code lost:
    
        if ((r0 % 2) != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0180, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (A(r9, r9.by) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (A(r9, r9.by) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r9.ag.setChecked(true);
        r0 = r9.ah;
        r4 = ivas.gov.bisp.enumeration.ActivityRoster.q;
        r5 = (((r4 | 76) << 1) - (r4 ^ 76)) - 1;
        ivas.gov.bisp.enumeration.ActivityRoster.p = r5 % 128;
     */
    @butterknife.OnClick
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void scanBioClicked(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ActivityRoster.scanBioClicked(android.view.View):void");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x02c4 A[Catch: Exception -> 0x0426, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0426, blocks: (B:15:0x00d4, B:17:0x00e7, B:20:0x0116, B:23:0x0149, B:25:0x0191, B:27:0x01b7, B:29:0x01cd, B:32:0x01de, B:35:0x01f7, B:38:0x0220, B:40:0x023a, B:42:0x0240, B:45:0x025d, B:49:0x028d, B:56:0x02ab, B:60:0x02da, B:62:0x02ef, B:65:0x0307, B:66:0x030a, B:74:0x0352, B:79:0x036e, B:81:0x037e, B:82:0x0381, B:83:0x0384, B:86:0x0387, B:89:0x03a2, B:92:0x03cb, B:93:0x03d8, B:94:0x03e4, B:97:0x03e7, B:98:0x03f3, B:99:0x03f6, B:67:0x0311, B:58:0x02c4, B:52:0x0292, B:46:0x026c, B:70:0x0320, B:72:0x033b, B:102:0x03f9, B:103:0x040b, B:104:0x040e, B:107:0x0411, B:108:0x0423), top: B:124:0x00d4 }] */
    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 55;
        int i4 = (i2 ^ 55) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        p = i5 % 128;
        int i6 = i5 % 2;
        super.t();
        TextView textView = (TextView) findViewById(R.id.application_version_textView);
        int i7 = q;
        int i8 = i7 & 85;
        int i9 = ((i7 ^ 85) | i8) << 1;
        int i10 = -((i7 | 85) & (~i8));
        int i11 = (i9 & i10) + (i10 | i9);
        p = i11 % 128;
        if (i11 % 2 == 0) {
            textView.setText("v7.6 (LIVE)");
            this.bw = (BISPApplication) getApplicationContext();
            int i12 = 20 / 0;
        } else {
            textView.setText("v7.6 (LIVE)");
            this.bw = (BISPApplication) getApplicationContext();
        }
        this.aK = (ImageView) findViewById(R.id.roaster_finger);
        new C0145s().c();
        new ProgressDialog(this);
        LinearLayout linearLayout = this.ll_nadra_name;
        int i13 = p + 23;
        q = i13 % 128;
        int i14 = i13 % 2;
        linearLayout.setVisibility(8);
        this.bL = 1;
        String[] strArr = new String[2];
        int i15 = p;
        int i16 = ((i15 | 99) << 1) - (i15 ^ 99);
        q = i16 % 128;
        if (i16 % 2 != 0) {
            strArr[0] = "android.permission.WRITE_EXTERNAL_STORAGE";
            strArr[1] = "android.permission.READ_EXTERNAL_STORAGE";
            if (!A(this, strArr)) {
                k.c(this, strArr, this.bL);
                int i17 = p;
                int i18 = i17 & 79;
                int i19 = ((i17 | 79) & (~i18)) + (i18 << 1);
                q = i19 % 128;
                int i20 = i19 % 2;
            }
        } else {
            strArr[0] = "android.permission.WRITE_EXTERNAL_STORAGE";
            strArr[1] = "android.permission.READ_EXTERNAL_STORAGE";
            if (!A(this, strArr)) {
                k.c(this, strArr, this.bL);
                int i110 = p;
                int i111 = i110 & 79;
                int i112 = ((i110 | 79) & (~i111)) + (i111 << 1);
                q = i112 % 128;
                int i21 = i112 % 2;
            }
        }
        this.ak = ivas.gov.bisp.enumeration.p037bj.c.c(getApplicationContext());
        new ArrayList();
        this.ak.f();
        Object obj = null;
        try {
            Dialog dialog = new Dialog(this);
            int i22 = q;
            int i23 = ((i22 ^ 110) + ((i22 & 110) << 1)) - 1;
            p = i23 % 128;
            int i24 = i23 % 2;
            this.bz = dialog;
            dialog.setContentView(R.layout.dialog_capturefinger);
            this.bz.setTitle("Select");
            Dialog dialog2 = this.bz;
            int i25 = q;
            int i26 = i25 & 111;
            int i27 = ((i25 ^ 111) | i26) << 1;
            int i28 = -((i25 | 111) & (~i26));
            int i29 = (i27 & i28) + (i28 | i27);
            p = i29 % 128;
            if (i29 % 2 == 0) {
                this.ag = (RadioButton) dialog2.findViewById(R.id.left_hand);
                this.ah = (RadioButton) this.bz.findViewById(R.id.right_hand);
                throw null;
            }
            this.ag = (RadioButton) dialog2.findViewById(R.id.left_hand);
            this.ah = (RadioButton) this.bz.findViewById(R.id.right_hand);
            Dialog dialog3 = this.bz;
            int i30 = q;
            int i31 = (i30 & (-106)) | ((~i30) & 105);
            int i32 = -(-((i30 & 105) << 1));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            p = i33 % 128;
            if (i33 % 2 == 0) {
                this.aj = (Button) dialog3.findViewById(R.id.select_finger);
                this.ai = (ImageView) this.bz.findViewById(R.id.imageview_fp);
                obj.hashCode();
                throw null;
            }
            this.aj = (Button) dialog3.findViewById(R.id.select_finger);
            this.ai = (ImageView) this.bz.findViewById(R.id.imageview_fp);
            this.ag.setOnCheckedChangeListener(new D(this));
            this.ah.setOnCheckedChangeListener(new ad(this));
            this.aj.setOnClickListener(new F(this));
            this.et_RosterCNICRepeat.requestFocus();
            int i34 = q;
            int i35 = i34 & 107;
            int i36 = -(-((i34 ^ 107) | i35));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            p = i37 % 128;
            int i38 = i37 % 2;
            this.ba = (Survey) getIntent().getSerializableExtra("survey");
            Serializable serializableExtra = getIntent().getSerializableExtra("roster_list");
            int i39 = q;
            int i40 = (((i39 | 62) << 1) - (i39 ^ 62)) - 1;
            int i41 = i40 % 128;
            p = i41;
            int i42 = i40 % 2;
            this.bj = (ArrayList) serializableExtra;
            this.aT = 0;
            int i43 = i41 & 87;
            int i44 = (((i41 | 87) & (~i43)) - (~(i43 << 1))) - 1;
            q = i44 % 128;
            int i45 = i44 % 2;
            int i46 = 0;
            while (i46 < this.bj.size()) {
                int i47 = q + 3;
                p = i47 % 128;
                int i48 = i47 % 2;
                if (this.bj.get(i46).bioImage != null) {
                    int i49 = (-2) - ((q + 58) ^ (-1));
                    int i50 = i49 % 128;
                    p = i50;
                    int i51 = i49 % 2;
                    int i52 = this.aT;
                    int i53 = i52 & 1;
                    int i54 = ((i52 ^ 1) | i53) << 1;
                    int i55 = -((i52 | 1) & (~i53));
                    this.aT = (i54 & i55) + (i55 | i54);
                    int i56 = ((i50 | 125) << 1) - (i50 ^ 125);
                    q = i56 % 128;
                    int i57 = i56 % 2;
                }
                i46++;
                int i58 = p + 49;
                q = i58 % 128;
                int i59 = i58 % 2;
            }
            boolean booleanExtra = getIntent().getBooleanExtra("is_edit", false);
            this.aU = booleanExtra;
            int i60 = p;
            int i61 = ((i60 ^ 54) + ((i60 & 54) << 1)) - 1;
            q = i61 % 128;
            int i62 = i61 % 2;
            this.aW = booleanExtra;
            if (!booleanExtra) {
                this.et_RosterCNIC.setVisibility(0);
                this.et_RosterCNICRepeat.setVisibility(0);
                int i63 = p;
                int i64 = i63 & 45;
                int i65 = -(-(i63 | 45));
                int i66 = (i64 & i65) + (i65 | i64);
                q = i66 % 128;
                if (i66 % 2 != 0) {
                    this.buttonScanCNIC.setVisibility(30);
                    this.btn_vald_cnic.setVisibility(113);
                } else {
                    this.buttonScanCNIC.setVisibility(8);
                    this.btn_vald_cnic.setVisibility(8);
                }
                int i67 = q;
                int i68 = (i67 & (-80)) | ((~i67) & 79);
                int i69 = -(-((i67 & 79) << 1));
                int i70 = (i68 & i69) + (i68 | i69);
                p = i70 % 128;
                if (i70 % 2 == 0) {
                    if (this.aT < 5) {
                        int i71 = (i67 & (-86)) | ((~i67) & 85);
                        int i72 = -(-((i67 & 85) << 1));
                        int i73 = (i71 & i72) + (i71 | i72);
                        p = i73 % 128;
                        int i74 = i73 % 2;
                        this.btn_bio_cnic.setEnabled(true);
                        int i75 = q;
                        int i76 = i75 ^ 7;
                        int i77 = -(-((i75 & 7) << 1));
                        int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                        p = i78 % 128;
                        int i79 = i78 % 2;
                    } else {
                        this.btn_bio_cnic.setEnabled(false);
                        int i80 = q;
                        int i81 = ((i80 | 96) << 1) - (i80 ^ 96);
                        int i82 = (i81 ^ (-1)) + (i81 << 1);
                        p = i82 % 128;
                        int i83 = i82 % 2;
                    }
                } else if (this.aT < 3) {
                    int i710 = (i67 & (-86)) | ((~i67) & 85);
                    int i711 = -(-((i67 & 85) << 1));
                    int i712 = (i710 & i711) + (i710 | i711);
                    p = i712 % 128;
                    int i713 = i712 % 2;
                    this.btn_bio_cnic.setEnabled(true);
                    int i714 = q;
                    int i715 = i714 ^ 7;
                    int i716 = -(-((i714 & 7) << 1));
                    int i717 = ((i715 | i716) << 1) - (i716 ^ i715);
                    p = i717 % 128;
                    int i718 = i717 % 2;
                } else {
                    this.btn_bio_cnic.setEnabled(false);
                    int i84 = q;
                    int i85 = ((i84 | 96) << 1) - (i84 ^ 96);
                    int i86 = (i85 ^ (-1)) + (i85 << 1);
                    p = i86 % 128;
                    int i87 = i86 % 2;
                }
                this.et_RosterCNIC.requestFocus();
                int i88 = p;
                int i89 = (((i88 | 42) << 1) - (i88 ^ 42)) - 1;
                q = i89 % 128;
                int i90 = i89 % 2;
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
                EditText editText = this.et_RosterCNIC;
                int i91 = p;
                int i92 = i91 ^ 119;
                int i93 = (((i91 & 119) | i92) << 1) - i92;
                q = i93 % 128;
                if (i93 % 2 != 0) {
                    inputMethodManager.showSoftInput(editText, 1);
                } else {
                    inputMethodManager.showSoftInput(editText, 1);
                }
                this.bd = z.e();
            } else {
                int i94 = ((i60 | 79) << 1) - (i60 ^ 79);
                q = i94 % 128;
                int i95 = i94 % 2;
                int intExtra = getIntent().getIntExtra("rosterPosition", 0);
                this.aV = intExtra;
                int i96 = p;
                int i97 = ((i96 ^ 42) + ((i96 & 42) << 1)) - 1;
                q = i97 % 128;
                int i98 = i97 % 2;
                this.bn = this.bj.get(intExtra);
                int i99 = q;
                int i100 = ((i99 | 9) << 1) - (i99 ^ 9);
                p = i100 % 128;
                int i101 = i100 % 2;
            }
            F();
            if (!(!this.aU)) {
                int i102 = p;
                int i103 = i102 ^ 71;
                int i104 = ((i102 & 71) | i103) << 1;
                int i105 = -i103;
                int i106 = (i104 & i105) + (i104 | i105);
                q = i106 % 128;
                if (i106 % 2 != 0) {
                    O();
                    obj.hashCode();
                    throw null;
                }
                O();
                int i107 = q;
                int i108 = (i107 & 95) + (i107 | 95);
                p = i108 % 128;
                int i109 = i108 % 2;
            }
            this.spinnerYear.setOnItemSelectedListener(this.bk);
            Spinner spinner = this.spinnerMonth;
            int i113 = q;
            int i114 = i113 & 5;
            int i115 = (i113 ^ 5) | i114;
            int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
            p = i116 % 128;
            if (i116 % 2 == 0) {
                spinner.setOnItemSelectedListener(this.bl);
                this.sp_relation_to_household.setOnItemSelectedListener(this.bi);
                obj.hashCode();
                throw null;
            }
            spinner.setOnItemSelectedListener(this.bl);
            this.sp_relation_to_household.setOnItemSelectedListener(this.bi);
            this.sp_marital_status.setOnItemSelectedListener(this.bf);
            Spinner spinner2 = this.sp_attended_school;
            int i117 = p;
            int i118 = i117 & 55;
            int i119 = -(-(i117 | 55));
            int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
            q = i120 % 128;
            if (i120 % 2 != 0) {
                spinner2.setOnItemSelectedListener(this.bg);
                this.sp_work_activity.setOnItemSelectedListener(this.bh);
                throw null;
            }
            spinner2.setOnItemSelectedListener(this.bg);
            this.sp_work_activity.setOnItemSelectedListener(this.bh);
            ac.e(this.et_RosterCNIC);
            ac.e(this.et_RosterCNICRepeat);
            int i121 = p;
            int i122 = ((i121 ^ 42) + ((i121 & 42) << 1)) - 1;
            q = i122 % 128;
            if (i122 % 2 != 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = p + 25;
        q = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            int i6 = q;
            int i7 = (i6 & (-18)) | ((~i6) & 17);
            int i8 = (i6 & 17) << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            p = i9 % 128;
            if (i9 % 2 != 0 ? i == 200 : i == 7309) {
                int i10 = i6 & 121;
                int i11 = -(-((i6 ^ 121) | i10));
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                p = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                try {
                    if (intent == null) {
                        R();
                        int i13 = p;
                        int i14 = (i13 ^ 93) + ((i13 & 93) << 1);
                        q = i14 % 128;
                        int i15 = i14 % 2;
                        return;
                    }
                    String stringExtra = intent.getStringExtra("barcode_key");
                    if (stringExtra.length() == 0) {
                        R();
                        int i16 = q;
                        int i17 = i16 ^ 89;
                        int i18 = -(-((i16 & 89) << 1));
                        int i19 = (i17 & i18) + (i18 | i17);
                        p = i19 % 128;
                        int i20 = i19 % 2;
                        return;
                    }
                    int i21 = q;
                    int i22 = ((i21 & 87) - (~(i21 | 87))) - 1;
                    p = i22 % 128;
                    int i23 = i22 % 2;
                    if (stringExtra.length() == 13) {
                        StringBuilder sb = new StringBuilder();
                        String strSubstring = stringExtra.substring(0, 5);
                        int i24 = q;
                        int i25 = i24 & 95;
                        int i26 = (i24 | 95) & (~i25);
                        int i27 = i25 << 1;
                        int i28 = (i26 & i27) + (i26 | i27);
                        p = i28 % 128;
                        int i29 = i28 % 2;
                        sb.append(strSubstring);
                        sb.append("-");
                        int i30 = q;
                        int i31 = (i30 & (-52)) | ((~i30) & 51);
                        int i32 = (i30 & 51) << 1;
                        int i33 = (i31 & i32) + (i32 | i31);
                        p = i33 % 128;
                        if (i33 % 2 == 0) {
                            sb.append(stringExtra.substring(5, 57));
                            sb.append("-");
                        } else {
                            sb.append(stringExtra.substring(5, 12));
                            sb.append("-");
                        }
                        int i34 = p;
                        int i35 = ((i34 | 55) << 1) - (i34 ^ 55);
                        q = i35 % 128;
                        int i36 = i35 % 2;
                        sb.append(stringExtra.substring(12));
                        stringExtra = sb.toString();
                        int i37 = p;
                        int i38 = (13 & (~i37)) | (i37 & (-14));
                        int i39 = -(-((i37 & 13) << 1));
                        int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                        q = i40 % 128;
                        if (i40 % 2 != 0) {
                            int i41 = 68 / 0;
                        }
                        int i42 = (i37 & (-78)) | ((~i37) & 77);
                        int i43 = (i37 & 77) << 1;
                        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                        q = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    this.et_RosterCNIC.setText(stringExtra);
                    this.et_RosterCNICRepeat.setText(stringExtra);
                    int i46 = q + 47;
                    p = i46 % 128;
                    int i47 = i46 % 2;
                    return;
                } catch (Exception e) {
                    BISPApplication bISPApplication = this.bw;
                    StringBuilder sbW = j.w("Exception Scanning:\n");
                    sbW.append(e.getMessage());
                    Toast.makeText(bISPApplication, sbW.toString(), 0).show();
                    return;
                }
            }
            if (i == 1034) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 8;
                    Bitmap bitmapF = P.f(null, BitmapFactory.decodeFile(null, options));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int i48 = p;
                    int i49 = (-2) - (((i48 ^ 112) + ((i48 & 112) << 1)) ^ (-1));
                    q = i49 % 128;
                    if (i49 % 2 != 0) {
                        bitmapF.compress(Bitmap.CompressFormat.JPEG, 55, byteArrayOutputStream);
                    } else {
                        bitmapF.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    int i50 = q;
                    int i51 = (i50 ^ 51) + ((i50 & 51) << 1);
                    p = i51 % 128;
                    int i52 = i51 % 2;
                    this.aZ = byteArray;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapF, 80, 80, true);
                    int i53 = p;
                    int i54 = (i53 ^ 103) + ((i53 & 103) << 1);
                    q = i54 % 128;
                    int i55 = i54 % 2;
                    this.imageViewCnic.setImageBitmap(bitmapCreateScaledBitmap);
                    this.imageViewCnic.setVisibility(0);
                    File file = new File((String) null);
                    if (!(!file.exists())) {
                        int i56 = q;
                        int i57 = i56 & 55;
                        int i58 = -(-((i56 ^ 55) | i57));
                        int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                        p = i59 % 128;
                        int i60 = i59 % 2;
                        file.delete();
                        int i61 = q;
                        int i62 = i61 & 95;
                        int i63 = ((((i61 ^ 95) | i62) << 1) - (~(-((i61 | 95) & (~i62))))) - 1;
                        p = i63 % 128;
                        int i64 = i63 % 2;
                    }
                    Toast.makeText(this, "Image Taken!", 1).show();
                    int i65 = p;
                    int i66 = i65 & 57;
                    int i67 = -(-((i65 ^ 57) | i66));
                    int i68 = (i66 & i67) + (i67 | i66);
                    q = i68 % 128;
                    int i69 = i68 % 2;
                    return;
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Exception Picture:\n");
                    sb2.append(e2.getMessage());
                    Toast.makeText(this, sb2.toString(), 0).show();
                }
            }
        }
        int i70 = q;
        int i71 = i70 & 119;
        int i72 = (i70 | 119) & (~i71);
        int i73 = i71 << 1;
        int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
        p = i74 % 128;
        if (i74 % 2 == 0) {
            int i75 = 66 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
    /* JADX WARN: Code duplicated, block: B:41:0x0147  */
    /* JADX WARN: Code duplicated, block: B:42:0x0148  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        Object obj;
        b.aIz aiz;
        AlertController.OooO0O0 oooO0O0;
        o000oOoO o000oooo;
        int i3;
        int i4;
        b.aIz aiz2;
        AlertController.OooO0O0 oooO0O1;
        int i5;
        Oooo0 oooo0;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = p + 68;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        q = i12 % 128;
        if (i12 % 2 != 0) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (i == 1) {
                i2 = q;
                int i13 = (((i2 | 98) << 1) - (i2 ^ 98)) - 1;
                p = i13 % 128;
                int i14 = i13 % 2;
                if (iArr.length > 0) {
                    int i15 = i2 + 43;
                    p = i15 % 128;
                    int i16 = i15 % 2;
                    if (iArr[0] == 0) {
                        Intent intent = new Intent(getApplicationContext(), (Class<?>) BarCodeReader.class);
                        int i17 = q;
                        int i18 = i17 & 59;
                        i8 = (((i17 ^ 59) | i18) << 1) - ((i17 | 59) & (~i18));
                        p = i8 % 128;
                        if (i8 % 2 == 0) {
                            i9 = 1471;
                        } else {
                            i9 = 200;
                        }
                        startActivityForResult(intent, i9);
                        return;
                    }
                }
                int i19 = k.d;
                obj = null;
                if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    int i20 = p;
                    int i21 = i20 & 39;
                    int i22 = (i20 ^ 39) | i21;
                    int i23 = (i21 & i22) + (i22 | i21);
                    q = i23 % 128;
                    int i24 = i23 % 2;
                    if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        aiz2 = new b.aIz(this);
                        oooO0O1 = aiz2.a;
                        i5 = p + 73;
                        q = i5 % 128;
                        if (i5 % 2 != 0) {
                            oooO0O1.e = "Permission";
                            int i25 = 38 / 0;
                        } else {
                            oooO0O1.e = "Permission";
                        }
                        oooO0O1.f = "You need permissions to use App features. Please grant it !";
                        oooo0 = new Oooo0();
                        int i26 = p;
                        int i27 = i26 & 37;
                        i6 = (i27 - (~(-(-((i26 ^ 37) | i27))))) - 1;
                        q = i6 % 128;
                        if (i6 % 2 == 0) {
                            oooO0O1.h = "OK";
                            oooO0O1.i = oooo0;
                            throw null;
                        }
                        oooO0O1.h = "OK";
                        oooO0O1.i = oooo0;
                        Oooo000 oooo000 = new Oooo000();
                        int i28 = q + 65;
                        p = i28 % 128;
                        int i29 = i28 % 2;
                        oooO0O1.a = "CANCEL";
                        oooO0O1.j = oooo000;
                        aiz2.d();
                        int i30 = q;
                        i7 = (i30 ^ 49) + ((i30 & 49) << 1);
                        p = i7 % 128;
                        if (i7 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
                aiz = new b.aIz(this);
                oooO0O0 = aiz.a;
                oooO0O0.e = "Permissions";
                oooO0O0.f = "You denied permission. So, the feature will be disabled. To enable it, go on settings and grant permissions for the application";
                o0OoOo0 o0oooo0 = new o0OoOo0();
                oooO0O0.h = "OK";
                oooO0O0.i = o0oooo0;
                o000oooo = new o000oOoO();
                int i31 = q;
                i3 = ((((i31 ^ 123) | (i31 & 123)) << 1) - (~(-(((~i31) & 123) | (i31 & (-124)))))) - 1;
                p = i3 % 128;
                if (i3 % 2 != 0) {
                    oooO0O0.a = "CANCEL";
                    oooO0O0.j = o000oooo;
                    aiz.d();
                    obj.hashCode();
                    throw null;
                }
                oooO0O0.a = "CANCEL";
                oooO0O0.j = o000oooo;
                aiz.d();
                int i32 = p;
                int i33 = i32 | 17;
                int i34 = i33 << 1;
                int i35 = -((~(i32 & 17)) & i33);
                i4 = (i34 ^ i35) + ((i35 & i34) << 1);
                q = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (i == 1) {
                i2 = q;
                int i110 = (((i2 | 98) << 1) - (i2 ^ 98)) - 1;
                p = i110 % 128;
                int i111 = i110 % 2;
                if (iArr.length > 0) {
                    int i112 = i2 + 43;
                    p = i112 % 128;
                    int i113 = i112 % 2;
                    if (iArr[0] == 0) {
                        Intent intent2 = new Intent(getApplicationContext(), (Class<?>) BarCodeReader.class);
                        int i114 = q;
                        int i115 = i114 & 59;
                        i8 = (((i114 ^ 59) | i115) << 1) - ((i114 | 59) & (~i115));
                        p = i8 % 128;
                        if (i8 % 2 == 0) {
                            i9 = 1471;
                        } else {
                            i9 = 200;
                        }
                        startActivityForResult(intent2, i9);
                        return;
                    }
                }
                int i116 = k.d;
                obj = null;
                if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    int i210 = p;
                    int i211 = i210 & 39;
                    int i212 = (i210 ^ 39) | i211;
                    int i213 = (i211 & i212) + (i212 | i211);
                    q = i213 % 128;
                    int i214 = i213 % 2;
                    if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        aiz2 = new b.aIz(this);
                        oooO0O1 = aiz2.a;
                        i5 = p + 73;
                        q = i5 % 128;
                        if (i5 % 2 != 0) {
                            oooO0O1.e = "Permission";
                            int i215 = 38 / 0;
                        } else {
                            oooO0O1.e = "Permission";
                        }
                        oooO0O1.f = "You need permissions to use App features. Please grant it !";
                        oooo0 = new Oooo0();
                        int i216 = p;
                        int i217 = i216 & 37;
                        i6 = (i217 - (~(-(-((i216 ^ 37) | i217))))) - 1;
                        q = i6 % 128;
                        if (i6 % 2 == 0) {
                            oooO0O1.h = "OK";
                            oooO0O1.i = oooo0;
                            throw null;
                        }
                        oooO0O1.h = "OK";
                        oooO0O1.i = oooo0;
                        Oooo000 oooo001 = new Oooo000();
                        int i218 = q + 65;
                        p = i218 % 128;
                        int i219 = i218 % 2;
                        oooO0O1.a = "CANCEL";
                        oooO0O1.j = oooo001;
                        aiz2.d();
                        int i36 = q;
                        i7 = (i36 ^ 49) + ((i36 & 49) << 1);
                        p = i7 % 128;
                        if (i7 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
                aiz = new b.aIz(this);
                oooO0O0 = aiz.a;
                oooO0O0.e = "Permissions";
                oooO0O0.f = "You denied permission. So, the feature will be disabled. To enable it, go on settings and grant permissions for the application";
                o0OoOo0 o0oooo1 = new o0OoOo0();
                oooO0O0.h = "OK";
                oooO0O0.i = o0oooo1;
                o000oooo = new o000oOoO();
                int i37 = q;
                i3 = ((((i37 ^ 123) | (i37 & 123)) << 1) - (~(-(((~i37) & 123) | (i37 & (-124)))))) - 1;
                p = i3 % 128;
                if (i3 % 2 != 0) {
                    oooO0O0.a = "CANCEL";
                    oooO0O0.j = o000oooo;
                    aiz.d();
                    obj.hashCode();
                    throw null;
                }
                oooO0O0.a = "CANCEL";
                oooO0O0.j = o000oooo;
                aiz.d();
                int i38 = p;
                int i39 = i38 | 17;
                int i310 = i39 << 1;
                int i311 = -((~(i38 & 17)) & i39);
                i4 = (i310 ^ i311) + ((i311 & i310) << 1);
                q = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        }
        int i40 = q;
        int i41 = i40 & 77;
        int i42 = i41 + ((i40 ^ 77) | i41);
        p = i42 % 128;
        int i43 = i42 % 2;
    }

    public class OooO implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 61;
            int i4 = -(-((i2 ^ 61) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x03d0 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:104:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:105:0x03f2  */
        /* JADX WARN: Code duplicated, block: B:109:0x0418  */
        /* JADX WARN: Code duplicated, block: B:110:0x0435  */
        /* JADX WARN: Code duplicated, block: B:113:0x0449  */
        /* JADX WARN: Code duplicated, block: B:116:0x0452  */
        /* JADX WARN: Code duplicated, block: B:127:0x0485  */
        /* JADX WARN: Code duplicated, block: B:129:0x048f  */
        /* JADX WARN: Code duplicated, block: B:26:0x009e  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c6 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:34:0x00c9 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:50:0x0146  */
        /* JADX WARN: Code duplicated, block: B:51:0x0173  */
        /* JADX WARN: Code duplicated, block: B:54:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:56:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:57:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:59:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:85:0x031b  */
        /* JADX WARN: Code duplicated, block: B:87:0x033b  */
        /* JADX WARN: Code duplicated, block: B:90:0x0340 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:95:0x0390  */
        /* JADX WARN: Code duplicated, block: B:98:0x03cb  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            int i3;
            ActivityRoster activityRoster;
            int i4;
            int i5;
            int i6;
            String str;
            String str2;
            int optionId;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            Item item;
            int i12;
            int i13;
            int optionId2;
            int i14 = 2 % 2;
            int i15 = b + 43;
            int i16 = i15 % 128;
            a = i16;
            int i17 = i15 % 2;
            Object obj = null;
            if (i == 0) {
                int i18 = i16 & 113;
                int i19 = -(-((i16 ^ 113) | i18));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    ActivityRoster.this.sp_marital_status.setBackgroundResource(R.drawable.spinner_bg);
                    throw null;
                }
                ActivityRoster.this.sp_marital_status.setBackgroundResource(R.drawable.spinner_bg);
                int i21 = b;
                int i22 = (i21 ^ 71) + ((i21 & 71) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
            } else {
                ActivityRoster.this.sp_marital_status.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i24 = a + 93;
                b = i24 % 128;
                int i25 = i24 % 2;
            }
            ActivityRoster activityRoster2 = ActivityRoster.this;
            int i26 = activityRoster2.ac;
            if (i26 != 1) {
                int i27 = b;
                int i28 = i27 ^ 57;
                int i29 = (i27 & 57) << 1;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                int i31 = i30 % 128;
                a = i31;
                if (i30 % 2 == 0 ? i26 != 2 : i26 != 5) {
                    int i32 = i31 & 9;
                    int i33 = ((i31 ^ 9) | i32) << 1;
                    int i34 = -((i31 | 9) & (~i32));
                    int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                    b = i35 % 128;
                    if (i35 % 2 == 0) {
                        int i36 = 9 / 0;
                        if (!(!ag.d)) {
                            if (ag.j == 1) {
                                int i37 = a;
                                int i38 = i37 & 45;
                                int i39 = ((i37 ^ 45) | i38) << 1;
                                int i40 = -((i37 | 45) & (~i38));
                                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                                i2 = i41 % 128;
                                b = i2;
                                int i42 = i41 % 2;
                                if (i != 0) {
                                    i3 = i2 + 95;
                                    a = i3 % 128;
                                    if (i3 % 2 != 0) {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        ActivityRoster activityRoster3 = ActivityRoster.this;
                                        int i43 = a;
                                        int i44 = ((((i43 ^ 101) | (i43 & 101)) << 1) - (~(-(((~i43) & 101) | (i43 & (-102)))))) - 1;
                                        b = i44 % 128;
                                        int i45 = i44 % 2;
                                        activityRoster3.aY = false;
                                        int i46 = b;
                                        int i47 = i46 & 15;
                                        int i48 = (i46 | 15) & (~i47);
                                        int i49 = -(-(i47 << 1));
                                        int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
                                        a = i50 % 128;
                                        int i51 = i50 % 2;
                                    } else {
                                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                                        ActivityRoster activityRoster4 = ActivityRoster.this;
                                        int i410 = a;
                                        int i411 = ((((i410 ^ 101) | (i410 & 101)) << 1) - (~(-(((~i410) & 101) | (i410 & (-102)))))) - 1;
                                        b = i411 % 128;
                                        int i412 = i411 % 2;
                                        activityRoster4.aY = false;
                                        int i413 = b;
                                        int i414 = i413 & 15;
                                        int i415 = (i413 | 15) & (~i414);
                                        int i416 = -(-(i414 << 1));
                                        int i52 = ((i415 | i416) << 1) - (i415 ^ i416);
                                        a = i52 % 128;
                                        int i53 = i52 % 2;
                                    }
                                } else {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    ActivityRoster activityRoster5 = ActivityRoster.this;
                                    int i417 = a;
                                    int i418 = ((((i417 ^ 101) | (i417 & 101)) << 1) - (~(-(((~i417) & 101) | (i417 & (-102)))))) - 1;
                                    b = i418 % 128;
                                    int i419 = i418 % 2;
                                    activityRoster5.aY = false;
                                    int i4110 = b;
                                    int i4111 = i4110 & 15;
                                    int i4112 = (i4110 | 15) & (~i4111);
                                    int i4113 = -(-(i4111 << 1));
                                    int i54 = ((i4112 | i4113) << 1) - (i4112 ^ i4113);
                                    a = i54 % 128;
                                    int i55 = i54 % 2;
                                }
                            }
                        }
                    } else if (ag.d) {
                        if (ag.j == 1) {
                            int i310 = a;
                            int i311 = i310 & 45;
                            int i312 = ((i310 ^ 45) | i311) << 1;
                            int i420 = -((i310 | 45) & (~i311));
                            int i421 = (i312 ^ i420) + ((i420 & i312) << 1);
                            i2 = i421 % 128;
                            b = i2;
                            int i422 = i421 % 2;
                            if (i != 0) {
                                i3 = i2 + 95;
                                a = i3 % 128;
                                if (i3 % 2 != 0) {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    ActivityRoster activityRoster6 = ActivityRoster.this;
                                    int i4114 = a;
                                    int i4115 = ((((i4114 ^ 101) | (i4114 & 101)) << 1) - (~(-(((~i4114) & 101) | (i4114 & (-102)))))) - 1;
                                    b = i4115 % 128;
                                    int i4116 = i4115 % 2;
                                    activityRoster6.aY = false;
                                    int i4117 = b;
                                    int i4118 = i4117 & 15;
                                    int i4119 = (i4117 | 15) & (~i4118);
                                    int i41110 = -(-(i4118 << 1));
                                    int i56 = ((i4119 | i41110) << 1) - (i4119 ^ i41110);
                                    a = i56 % 128;
                                    int i57 = i56 % 2;
                                } else {
                                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                                    ActivityRoster activityRoster7 = ActivityRoster.this;
                                    int i41111 = a;
                                    int i41112 = ((((i41111 ^ 101) | (i41111 & 101)) << 1) - (~(-(((~i41111) & 101) | (i41111 & (-102)))))) - 1;
                                    b = i41112 % 128;
                                    int i41113 = i41112 % 2;
                                    activityRoster7.aY = false;
                                    int i41114 = b;
                                    int i41115 = i41114 & 15;
                                    int i41116 = (i41114 | 15) & (~i41115);
                                    int i41117 = -(-(i41115 << 1));
                                    int i58 = ((i41116 | i41117) << 1) - (i41116 ^ i41117);
                                    a = i58 % 128;
                                    int i59 = i58 % 2;
                                }
                            } else {
                                activityRoster2.checkBoxBispBenif.setVisibility(8);
                                ActivityRoster activityRoster8 = ActivityRoster.this;
                                int i41118 = a;
                                int i41119 = ((((i41118 ^ 101) | (i41118 & 101)) << 1) - (~(-(((~i41118) & 101) | (i41118 & (-102)))))) - 1;
                                b = i41119 % 128;
                                int i411110 = i41119 % 2;
                                activityRoster8.aY = false;
                                int i411111 = b;
                                int i411112 = i411111 & 15;
                                int i411113 = (i411111 | 15) & (~i411112);
                                int i411114 = -(-(i411112 << 1));
                                int i510 = ((i411113 | i411114) << 1) - (i411113 ^ i411114);
                                a = i510 % 128;
                                int i511 = i510 % 2;
                            }
                        }
                    }
                } else if (ag.j == 1) {
                    int i313 = a;
                    int i314 = i313 & 45;
                    int i315 = ((i313 ^ 45) | i314) << 1;
                    int i423 = -((i313 | 45) & (~i314));
                    int i424 = (i315 ^ i423) + ((i423 & i315) << 1);
                    i2 = i424 % 128;
                    b = i2;
                    int i425 = i424 % 2;
                    if (i != 0) {
                        i3 = i2 + 95;
                        a = i3 % 128;
                        if (i3 % 2 != 0 ? i == 1 : i == 1) {
                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                            ActivityRoster activityRoster9 = ActivityRoster.this;
                            int i411115 = a;
                            int i411116 = ((((i411115 ^ 101) | (i411115 & 101)) << 1) - (~(-(((~i411115) & 101) | (i411115 & (-102)))))) - 1;
                            b = i411116 % 128;
                            int i411117 = i411116 % 2;
                            activityRoster9.aY = false;
                            int i411118 = b;
                            int i411119 = i411118 & 15;
                            int i4111110 = (i411118 | 15) & (~i411119);
                            int i4111111 = -(-(i411119 << 1));
                            int i512 = ((i4111110 | i4111111) << 1) - (i4111110 ^ i4111111);
                            a = i512 % 128;
                            int i513 = i512 % 2;
                        } else if (activityRoster2.br >= 18.0d) {
                            int i60 = b;
                            int i61 = i60 & 99;
                            int i62 = i60 | 99;
                            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                            a = i63 % 128;
                            int i64 = i63 % 2;
                            if (activityRoster2.radioGroupCNICOptions.getCheckedRadioButtonId() == ActivityRoster.this.radioButtonCNICPresent.getId()) {
                                int i65 = (-2) - ((a + 32) ^ (-1));
                                b = i65 % 128;
                                int i66 = i65 % 2;
                                if (ActivityRoster.this.et_RosterCNIC.length() == 15) {
                                    int i67 = a;
                                    int i68 = i67 & 33;
                                    int i69 = (i67 ^ 33) | i68;
                                    int i70 = (i68 & i69) + (i69 | i68);
                                    b = i70 % 128;
                                    if (i70 % 2 == 0) {
                                        ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                        RadioButton radioButton = ActivityRoster.this.radioButtonFemale;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    int checkedRadioButtonId = ActivityRoster.this.radioGroupGender.getCheckedRadioButtonId();
                                    RadioButton radioButton2 = ActivityRoster.this.radioButtonFemale;
                                    int i71 = a;
                                    int i72 = (i71 & 67) + (i71 | 67);
                                    b = i72 % 128;
                                    if (i72 % 2 == 0) {
                                        int i73 = 71 / 0;
                                        if (checkedRadioButtonId == radioButton2.getId()) {
                                            ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                            ActivityRoster activityRoster10 = ActivityRoster.this;
                                            int i74 = a;
                                            int i75 = ((i74 | 27) << 1) - (i74 ^ 27);
                                            b = i75 % 128;
                                            int i76 = i75 % 2;
                                            activityRoster10.aY = true;
                                            int i77 = b;
                                            int i78 = i77 & 97;
                                            int i79 = (((i77 | 97) & (~i78)) - (~(-(-(i78 << 1))))) - 1;
                                            a = i79 % 128;
                                            int i80 = i79 % 2;
                                        } else {
                                            ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                            int i81 = b;
                                            int i82 = i81 & 53;
                                            int i83 = (((i81 ^ 53) | i82) << 1) - ((i81 | 53) & (~i82));
                                            a = i83 % 128;
                                            int i84 = i83 % 2;
                                            ActivityRoster.this.aY = false;
                                            int i85 = b;
                                            int i86 = (i85 ^ 89) + ((i85 & 89) << 1);
                                            a = i86 % 128;
                                            int i87 = i86 % 2;
                                        }
                                    } else if (checkedRadioButtonId == radioButton2.getId()) {
                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(0);
                                        ActivityRoster activityRoster11 = ActivityRoster.this;
                                        int i710 = a;
                                        int i711 = ((i710 | 27) << 1) - (i710 ^ 27);
                                        b = i711 % 128;
                                        int i712 = i711 % 2;
                                        activityRoster11.aY = true;
                                        int i713 = b;
                                        int i714 = i713 & 97;
                                        int i715 = (((i713 | 97) & (~i714)) - (~(-(-(i714 << 1))))) - 1;
                                        a = i715 % 128;
                                        int i88 = i715 % 2;
                                    } else {
                                        ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                        int i89 = b;
                                        int i810 = i89 & 53;
                                        int i811 = (((i89 ^ 53) | i810) << 1) - ((i89 | 53) & (~i810));
                                        a = i811 % 128;
                                        int i812 = i811 % 2;
                                        ActivityRoster.this.aY = false;
                                        int i813 = b;
                                        int i814 = (i813 ^ 89) + ((i813 & 89) << 1);
                                        a = i814 % 128;
                                        int i815 = i814 % 2;
                                    }
                                } else {
                                    ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                    activityRoster = ActivityRoster.this;
                                    int i90 = b;
                                    i4 = ((i90 | 99) << 1) - (i90 ^ 99);
                                    a = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        activityRoster.aY = true;
                                    } else {
                                        activityRoster.aY = false;
                                    }
                                }
                            } else {
                                ActivityRoster.this.checkBoxBispBenif.setVisibility(8);
                                activityRoster = ActivityRoster.this;
                                int i91 = b;
                                i4 = ((i91 | 99) << 1) - (i91 ^ 99);
                                a = i4 % 128;
                                if (i4 % 2 != 0) {
                                    activityRoster.aY = true;
                                } else {
                                    activityRoster.aY = false;
                                }
                            }
                        } else {
                            activityRoster2.checkBoxBispBenif.setVisibility(8);
                            ActivityRoster activityRoster12 = ActivityRoster.this;
                            int i92 = a;
                            int i93 = (i92 & 106) + (i92 | 106);
                            int i94 = (i93 ^ (-1)) + (i93 << 1);
                            b = i94 % 128;
                            int i95 = i94 % 2;
                            activityRoster12.aY = false;
                            int i96 = a;
                            int i97 = ((i96 ^ 65) - (~((i96 & 65) << 1))) - 1;
                            b = i97 % 128;
                            int i98 = i97 % 2;
                        }
                    } else {
                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                        ActivityRoster activityRoster13 = ActivityRoster.this;
                        int i4111112 = a;
                        int i4111113 = ((((i4111112 ^ 101) | (i4111112 & 101)) << 1) - (~(-(((~i4111112) & 101) | (i4111112 & (-102)))))) - 1;
                        b = i4111113 % 128;
                        int i4111114 = i4111113 % 2;
                        activityRoster13.aY = false;
                        int i4111115 = b;
                        int i4111116 = i4111115 & 15;
                        int i4111117 = (i4111115 | 15) & (~i4111116);
                        int i4111118 = -(-(i4111116 << 1));
                        int i514 = ((i4111117 | i4111118) << 1) - (i4111117 ^ i4111118);
                        a = i514 % 128;
                        int i515 = i514 % 2;
                    }
                }
            } else if (ag.j == 1) {
                int i316 = a;
                int i317 = i316 & 45;
                int i318 = ((i316 ^ 45) | i317) << 1;
                int i426 = -((i316 | 45) & (~i317));
                int i427 = (i318 ^ i426) + ((i426 & i318) << 1);
                i2 = i427 % 128;
                b = i2;
                int i428 = i427 % 2;
                if (i != 0) {
                    i3 = i2 + 95;
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                        ActivityRoster activityRoster14 = ActivityRoster.this;
                        int i4111119 = a;
                        int i41111110 = ((((i4111119 ^ 101) | (i4111119 & 101)) << 1) - (~(-(((~i4111119) & 101) | (i4111119 & (-102)))))) - 1;
                        b = i41111110 % 128;
                        int i41111111 = i41111110 % 2;
                        activityRoster14.aY = false;
                        int i41111112 = b;
                        int i41111113 = i41111112 & 15;
                        int i41111114 = (i41111112 | 15) & (~i41111113);
                        int i41111115 = -(-(i41111113 << 1));
                        int i516 = ((i41111114 | i41111115) << 1) - (i41111114 ^ i41111115);
                        a = i516 % 128;
                        int i517 = i516 % 2;
                    } else {
                        activityRoster2.checkBoxBispBenif.setVisibility(8);
                        ActivityRoster activityRoster15 = ActivityRoster.this;
                        int i41111116 = a;
                        int i41111117 = ((((i41111116 ^ 101) | (i41111116 & 101)) << 1) - (~(-(((~i41111116) & 101) | (i41111116 & (-102)))))) - 1;
                        b = i41111117 % 128;
                        int i41111118 = i41111117 % 2;
                        activityRoster15.aY = false;
                        int i41111119 = b;
                        int i411111110 = i41111119 & 15;
                        int i411111111 = (i41111119 | 15) & (~i411111110);
                        int i411111112 = -(-(i411111110 << 1));
                        int i518 = ((i411111111 | i411111112) << 1) - (i411111111 ^ i411111112);
                        a = i518 % 128;
                        int i519 = i518 % 2;
                    }
                } else {
                    activityRoster2.checkBoxBispBenif.setVisibility(8);
                    ActivityRoster activityRoster16 = ActivityRoster.this;
                    int i411111113 = a;
                    int i411111114 = ((((i411111113 ^ 101) | (i411111113 & 101)) << 1) - (~(-(((~i411111113) & 101) | (i411111113 & (-102)))))) - 1;
                    b = i411111114 % 128;
                    int i411111115 = i411111114 % 2;
                    activityRoster16.aY = false;
                    int i411111116 = b;
                    int i411111117 = i411111116 & 15;
                    int i411111118 = (i411111116 | 15) & (~i411111117);
                    int i411111119 = -(-(i411111117 << 1));
                    int i5110 = ((i411111118 | i411111119) << 1) - (i411111118 ^ i411111119);
                    a = i5110 % 128;
                    int i5111 = i5110 % 2;
                }
            }
            if (i > 0) {
                int i99 = b;
                int i100 = i99 & 103;
                int i101 = ((((i99 ^ 103) | i100) << 1) - (~(-((i99 | 103) & (~i100))))) - 1;
                a = i101 % 128;
                if (i101 % 2 != 0) {
                    ArrayList<Item> arrayList = ActivityRoster.this.aI;
                    obj.hashCode();
                    throw null;
                }
                ArrayList<Item> arrayList2 = ActivityRoster.this.aI;
                if (arrayList2 != null) {
                    int i102 = a;
                    int i103 = i102 & 73;
                    int i104 = i103 + ((i102 ^ 73) | i103);
                    b = i104 % 128;
                    if (i104 % 2 == 0) {
                        arrayList2.size();
                        throw null;
                    }
                    if (arrayList2.size() > 0) {
                        Item item2 = ActivityRoster.this.aI.get(i);
                        int i105 = a;
                        int i106 = ((i105 ^ 56) + ((i105 & 56) << 1)) - 1;
                        b = i106 % 128;
                        int i107 = i106 % 2;
                        if (item2.getOptionId() != 201) {
                            int i108 = b;
                            int i109 = i108 & 79;
                            int i110 = ((i108 ^ 79) | i109) << 1;
                            int i111 = -((i108 | 79) & (~i109));
                            int i112 = (i110 & i111) + (i111 | i110);
                            a = i112 % 128;
                            if (i112 % 2 != 0) {
                                optionId2 = ActivityRoster.this.aI.get(i).getOptionId();
                                int i113 = 90 / 0;
                            } else {
                                optionId2 = ActivityRoster.this.aI.get(i).getOptionId();
                            }
                            if (optionId2 != 203) {
                                int i114 = b;
                                int i115 = i114 & 117;
                                int i116 = (i115 - (~(-(-((i114 ^ 117) | i115))))) - 1;
                                a = i116 % 128;
                                if (i116 % 2 != 0) {
                                    ActivityRoster.this.aI.get(i).getOptionId();
                                    throw null;
                                }
                                if (ActivityRoster.this.aI.get(i).getOptionId() != 202) {
                                    int i117 = b;
                                    int i118 = ((i117 ^ 87) - (~((i117 & 87) << 1))) - 1;
                                    a = i118 % 128;
                                    int i119 = i118 % 2;
                                    int optionId3 = ActivityRoster.this.aI.get(i).getOptionId();
                                    int i120 = b;
                                    int i121 = (i120 & 11) + (i120 | 11);
                                    a = i121 % 128;
                                    int i122 = i121 % 2;
                                    if (optionId3 == 204) {
                                        int optionId4 = ActivityRoster.this.aI.get(i).getOptionId();
                                        int i123 = a;
                                        i5 = ((i123 ^ 54) + ((i123 & 54) << 1)) - 1;
                                        i6 = i5 % 128;
                                        b = i6;
                                        str = "married";
                                        if (i5 % 2 == 0 ? optionId4 != 201 : optionId4 != 4030) {
                                            int i124 = ((i6 ^ 37) | (i6 & 37)) << 1;
                                            int i125 = -((i6 & (-38)) | ((~i6) & 37));
                                            int i126 = ((i124 | i125) << 1) - (i124 ^ i125);
                                            a = i126 % 128;
                                            int i127 = i126 % 2;
                                            str2 = BuildConfig.FLAVOR;
                                        } else {
                                            int i128 = i6 | 27;
                                            int i129 = i128 << 1;
                                            int i130 = -(i128 & (~(i6 & 27)));
                                            int i131 = (i129 & i130) + (i130 | i129);
                                            a = i131 % 128;
                                            int i132 = i131 % 2;
                                            str2 = "married";
                                        }
                                        optionId = ActivityRoster.this.aI.get(i).getOptionId();
                                        i7 = a;
                                        int i133 = i7 & 9;
                                        int i134 = (((~i133) & (i7 | 9)) - (~(i133 << 1))) - 1;
                                        b = i134 % 128;
                                        int i135 = i134 % 2;
                                        if (optionId == 203) {
                                            int i136 = (i7 & 105) + (i7 | 105);
                                            b = i136 % 128;
                                            int i137 = i136 % 2;
                                            int i138 = ((i7 ^ 72) + ((i7 & 72) << 1)) - 1;
                                            b = i138 % 128;
                                            int i139 = i138 % 2;
                                            str2 = "divorced";
                                        }
                                        int optionId5 = ActivityRoster.this.aI.get(i).getOptionId();
                                        i8 = b;
                                        i9 = (((i8 & (-26)) | ((~i8) & 25)) - (~((i8 & 25) << 1))) - 1;
                                        a = i9 % 128;
                                        if (i9 % 2 != 0 ? optionId5 == 202 : optionId5 == 19736) {
                                            i10 = (((i8 | 6) << 1) - (i8 ^ 6)) - 1;
                                            i11 = i10 % 128;
                                            a = i11;
                                            if (i10 % 2 != 0) {
                                                obj.hashCode();
                                                throw null;
                                            }
                                            int i140 = (-2) - ((((i11 | 96) << 1) - (i11 ^ 96)) ^ (-1));
                                            b = i140 % 128;
                                            int i141 = i140 % 2;
                                            str2 = "widow";
                                        }
                                        item = ActivityRoster.this.aI.get(i);
                                        int i142 = a;
                                        int i143 = i142 & 15;
                                        int i144 = (i142 ^ 15) | i143;
                                        int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                                        b = i145 % 128;
                                        int i146 = i145 % 2;
                                        if (item.getOptionId() == 204) {
                                            int i147 = b;
                                            int i148 = i147 & 113;
                                            int i149 = (i148 - (~(-(-((i147 ^ 113) | i148))))) - 1;
                                            a = i149 % 128;
                                            int i150 = i149 % 2;
                                            int i151 = i147 & 97;
                                            int i152 = i151 + ((i147 ^ 97) | i151);
                                            a = i152 % 128;
                                            int i153 = i152 % 2;
                                        } else {
                                            str = str2;
                                        }
                                        ActivityRoster activityRoster17 = ActivityRoster.this;
                                        Objects.requireNonNull(activityRoster17);
                                        int i154 = a;
                                        i12 = (i154 & 47) + (i154 | 47);
                                        b = i12 % 128;
                                        if (i12 % 2 == 0 ? activityRoster17.br <= 0.0d : activityRoster17.br <= 1.0d) {
                                            int i155 = a;
                                            int i156 = (i155 & 53) + (i155 | 53);
                                            int i157 = i156 % 128;
                                            b = i157;
                                            int i158 = i156 % 2;
                                            if (i13 == 0) {
                                                int i159 = i157 + 59;
                                                a = i159 % 128;
                                                if (i159 % 2 != 0) {
                                                    int i160 = 74 / 0;
                                                    if (activityRoster17.spinnerMonth.getSelectedItemPosition() > 0) {
                                                        if (ActivityRoster.this.br < 17.0d) {
                                                            int i161 = a;
                                                            int i162 = ((i161 | 89) << 1) - (i161 ^ 89);
                                                            b = i162 % 128;
                                                            int i163 = i162 % 2;
                                                            C0104p c0104pC = C0104p.c();
                                                            AppCompatActivity appCompatActivity = ActivityRoster.this.ae;
                                                            String strT = j.t("Are you sure roster is ", str, "?");
                                                            DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j = new DialogInterfaceOnClickListenerC0204j(this, 1);
                                                            int i164 = a;
                                                            int i165 = i164 & 27;
                                                            int i166 = i165 + ((i164 ^ 27) | i165);
                                                            b = i166 % 128;
                                                            int i167 = i166 % 2;
                                                            c0104pC.h(appCompatActivity, "Warning", strT, null, dialogInterfaceOnClickListenerC0204j, false);
                                                            int i168 = a;
                                                            int i169 = i168 ^ 75;
                                                            int i170 = (i168 & 75) << 1;
                                                            int i171 = ((i169 | i170) << 1) - (i170 ^ i169);
                                                            b = i171 % 128;
                                                            int i172 = i171 % 2;
                                                        }
                                                    }
                                                } else if (activityRoster17.spinnerMonth.getSelectedItemPosition() > 0) {
                                                    if (ActivityRoster.this.br < 17.0d) {
                                                        int i1610 = a;
                                                        int i1611 = ((i1610 | 89) << 1) - (i1610 ^ 89);
                                                        b = i1611 % 128;
                                                        int i1612 = i1611 % 2;
                                                        C0104p c0104pC2 = C0104p.c();
                                                        AppCompatActivity appCompatActivity2 = ActivityRoster.this.ae;
                                                        String strT2 = j.t("Are you sure roster is ", str, "?");
                                                        DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j2 = new DialogInterfaceOnClickListenerC0204j(this, 1);
                                                        int i1613 = a;
                                                        int i1614 = i1613 & 27;
                                                        int i1615 = i1614 + ((i1613 ^ 27) | i1614);
                                                        b = i1615 % 128;
                                                        int i1616 = i1615 % 2;
                                                        c0104pC2.h(appCompatActivity2, "Warning", strT2, null, dialogInterfaceOnClickListenerC0204j2, false);
                                                        int i1617 = a;
                                                        int i1618 = i1617 ^ 75;
                                                        int i173 = (i1617 & 75) << 1;
                                                        int i174 = ((i1618 | i173) << 1) - (i173 ^ i1618);
                                                        b = i174 % 128;
                                                        int i175 = i174 % 2;
                                                    }
                                                }
                                            }
                                        } else if (ActivityRoster.this.br < 17.0d) {
                                            int i1619 = a;
                                            int i16110 = ((i1619 | 89) << 1) - (i1619 ^ 89);
                                            b = i16110 % 128;
                                            int i16111 = i16110 % 2;
                                            C0104p c0104pC3 = C0104p.c();
                                            AppCompatActivity appCompatActivity3 = ActivityRoster.this.ae;
                                            String strT3 = j.t("Are you sure roster is ", str, "?");
                                            DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j3 = new DialogInterfaceOnClickListenerC0204j(this, 1);
                                            int i16112 = a;
                                            int i16113 = i16112 & 27;
                                            int i16114 = i16113 + ((i16112 ^ 27) | i16113);
                                            b = i16114 % 128;
                                            int i16115 = i16114 % 2;
                                            c0104pC3.h(appCompatActivity3, "Warning", strT3, null, dialogInterfaceOnClickListenerC0204j3, false);
                                            int i16116 = a;
                                            int i16117 = i16116 ^ 75;
                                            int i176 = (i16116 & 75) << 1;
                                            int i177 = ((i16117 | i176) << 1) - (i176 ^ i16117);
                                            b = i177 % 128;
                                            int i178 = i177 % 2;
                                        }
                                    }
                                } else {
                                    int optionId6 = ActivityRoster.this.aI.get(i).getOptionId();
                                    int i1210 = a;
                                    i5 = ((i1210 ^ 54) + ((i1210 & 54) << 1)) - 1;
                                    i6 = i5 % 128;
                                    b = i6;
                                    str = "married";
                                    if (i5 % 2 == 0) {
                                        int i1211 = ((i6 ^ 37) | (i6 & 37)) << 1;
                                        int i1212 = -((i6 & (-38)) | ((~i6) & 37));
                                        int i1213 = ((i1211 | i1212) << 1) - (i1211 ^ i1212);
                                        a = i1213 % 128;
                                        int i1214 = i1213 % 2;
                                        str2 = BuildConfig.FLAVOR;
                                    } else {
                                        int i1215 = ((i6 ^ 37) | (i6 & 37)) << 1;
                                        int i1216 = -((i6 & (-38)) | ((~i6) & 37));
                                        int i1217 = ((i1215 | i1216) << 1) - (i1215 ^ i1216);
                                        a = i1217 % 128;
                                        int i1218 = i1217 % 2;
                                        str2 = BuildConfig.FLAVOR;
                                    }
                                    optionId = ActivityRoster.this.aI.get(i).getOptionId();
                                    i7 = a;
                                    int i1310 = i7 & 9;
                                    int i1311 = (((~i1310) & (i7 | 9)) - (~(i1310 << 1))) - 1;
                                    b = i1311 % 128;
                                    int i1312 = i1311 % 2;
                                    if (optionId == 203) {
                                        int i1313 = (i7 & 105) + (i7 | 105);
                                        b = i1313 % 128;
                                        int i1314 = i1313 % 2;
                                        int i1315 = ((i7 ^ 72) + ((i7 & 72) << 1)) - 1;
                                        b = i1315 % 128;
                                        int i1316 = i1315 % 2;
                                        str2 = "divorced";
                                    }
                                    int optionId7 = ActivityRoster.this.aI.get(i).getOptionId();
                                    i8 = b;
                                    i9 = (((i8 & (-26)) | ((~i8) & 25)) - (~((i8 & 25) << 1))) - 1;
                                    a = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        i10 = (((i8 | 6) << 1) - (i8 ^ 6)) - 1;
                                        i11 = i10 % 128;
                                        a = i11;
                                        if (i10 % 2 != 0) {
                                            obj.hashCode();
                                            throw null;
                                        }
                                        int i1410 = (-2) - ((((i11 | 96) << 1) - (i11 ^ 96)) ^ (-1));
                                        b = i1410 % 128;
                                        int i1411 = i1410 % 2;
                                        str2 = "widow";
                                    } else {
                                        i10 = (((i8 | 6) << 1) - (i8 ^ 6)) - 1;
                                        i11 = i10 % 128;
                                        a = i11;
                                        if (i10 % 2 != 0) {
                                            obj.hashCode();
                                            throw null;
                                        }
                                        int i1412 = (-2) - ((((i11 | 96) << 1) - (i11 ^ 96)) ^ (-1));
                                        b = i1412 % 128;
                                        int i1413 = i1412 % 2;
                                        str2 = "widow";
                                    }
                                    item = ActivityRoster.this.aI.get(i);
                                    int i1414 = a;
                                    int i1415 = i1414 & 15;
                                    int i1416 = (i1414 ^ 15) | i1415;
                                    int i1417 = ((i1415 | i1416) << 1) - (i1416 ^ i1415);
                                    b = i1417 % 128;
                                    int i1418 = i1417 % 2;
                                    if (item.getOptionId() == 204) {
                                        int i1419 = b;
                                        int i1420 = i1419 & 113;
                                        int i1421 = (i1420 - (~(-(-((i1419 ^ 113) | i1420))))) - 1;
                                        a = i1421 % 128;
                                        int i1510 = i1421 % 2;
                                        int i1511 = i1419 & 97;
                                        int i1512 = i1511 + ((i1419 ^ 97) | i1511);
                                        a = i1512 % 128;
                                        int i1513 = i1512 % 2;
                                    } else {
                                        str = str2;
                                    }
                                    ActivityRoster activityRoster18 = ActivityRoster.this;
                                    Objects.requireNonNull(activityRoster18);
                                    int i1514 = a;
                                    i12 = (i1514 & 47) + (i1514 | 47);
                                    b = i12 % 128;
                                    if (i12 % 2 == 0) {
                                    }
                                    if (ActivityRoster.this.br < 17.0d) {
                                        int i16118 = a;
                                        int i16119 = ((i16118 | 89) << 1) - (i16118 ^ 89);
                                        b = i16119 % 128;
                                        int i161110 = i16119 % 2;
                                        C0104p c0104pC4 = C0104p.c();
                                        AppCompatActivity appCompatActivity4 = ActivityRoster.this.ae;
                                        String strT4 = j.t("Are you sure roster is ", str, "?");
                                        DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j4 = new DialogInterfaceOnClickListenerC0204j(this, 1);
                                        int i161111 = a;
                                        int i161112 = i161111 & 27;
                                        int i161113 = i161112 + ((i161111 ^ 27) | i161112);
                                        b = i161113 % 128;
                                        int i161114 = i161113 % 2;
                                        c0104pC4.h(appCompatActivity4, "Warning", strT4, null, dialogInterfaceOnClickListenerC0204j4, false);
                                        int i161115 = a;
                                        int i161116 = i161115 ^ 75;
                                        int i179 = (i161115 & 75) << 1;
                                        int i1710 = ((i161116 | i179) << 1) - (i179 ^ i161116);
                                        b = i1710 % 128;
                                        int i1711 = i1710 % 2;
                                    }
                                }
                            } else {
                                int optionId8 = ActivityRoster.this.aI.get(i).getOptionId();
                                int i1219 = a;
                                i5 = ((i1219 ^ 54) + ((i1219 & 54) << 1)) - 1;
                                i6 = i5 % 128;
                                b = i6;
                                str = "married";
                                if (i5 % 2 == 0) {
                                    int i12110 = ((i6 ^ 37) | (i6 & 37)) << 1;
                                    int i12111 = -((i6 & (-38)) | ((~i6) & 37));
                                    int i12112 = ((i12110 | i12111) << 1) - (i12110 ^ i12111);
                                    a = i12112 % 128;
                                    int i12113 = i12112 % 2;
                                    str2 = BuildConfig.FLAVOR;
                                } else {
                                    int i12114 = ((i6 ^ 37) | (i6 & 37)) << 1;
                                    int i12115 = -((i6 & (-38)) | ((~i6) & 37));
                                    int i12116 = ((i12114 | i12115) << 1) - (i12114 ^ i12115);
                                    a = i12116 % 128;
                                    int i12117 = i12116 % 2;
                                    str2 = BuildConfig.FLAVOR;
                                }
                                optionId = ActivityRoster.this.aI.get(i).getOptionId();
                                i7 = a;
                                int i1317 = i7 & 9;
                                int i1318 = (((~i1317) & (i7 | 9)) - (~(i1317 << 1))) - 1;
                                b = i1318 % 128;
                                int i1319 = i1318 % 2;
                                if (optionId == 203) {
                                    int i13110 = (i7 & 105) + (i7 | 105);
                                    b = i13110 % 128;
                                    int i13111 = i13110 % 2;
                                    int i13112 = ((i7 ^ 72) + ((i7 & 72) << 1)) - 1;
                                    b = i13112 % 128;
                                    int i13113 = i13112 % 2;
                                    str2 = "divorced";
                                }
                                int optionId9 = ActivityRoster.this.aI.get(i).getOptionId();
                                i8 = b;
                                i9 = (((i8 & (-26)) | ((~i8) & 25)) - (~((i8 & 25) << 1))) - 1;
                                a = i9 % 128;
                                if (i9 % 2 != 0) {
                                    i10 = (((i8 | 6) << 1) - (i8 ^ 6)) - 1;
                                    i11 = i10 % 128;
                                    a = i11;
                                    if (i10 % 2 != 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    int i14110 = (-2) - ((((i11 | 96) << 1) - (i11 ^ 96)) ^ (-1));
                                    b = i14110 % 128;
                                    int i14111 = i14110 % 2;
                                    str2 = "widow";
                                } else {
                                    i10 = (((i8 | 6) << 1) - (i8 ^ 6)) - 1;
                                    i11 = i10 % 128;
                                    a = i11;
                                    if (i10 % 2 != 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    int i14112 = (-2) - ((((i11 | 96) << 1) - (i11 ^ 96)) ^ (-1));
                                    b = i14112 % 128;
                                    int i14113 = i14112 % 2;
                                    str2 = "widow";
                                }
                                item = ActivityRoster.this.aI.get(i);
                                int i14114 = a;
                                int i14115 = i14114 & 15;
                                int i14116 = (i14114 ^ 15) | i14115;
                                int i14117 = ((i14115 | i14116) << 1) - (i14116 ^ i14115);
                                b = i14117 % 128;
                                int i14118 = i14117 % 2;
                                if (item.getOptionId() == 204) {
                                    int i14119 = b;
                                    int i1422 = i14119 & 113;
                                    int i1423 = (i1422 - (~(-(-((i14119 ^ 113) | i1422))))) - 1;
                                    a = i1423 % 128;
                                    int i1515 = i1423 % 2;
                                    int i1516 = i14119 & 97;
                                    int i1517 = i1516 + ((i14119 ^ 97) | i1516);
                                    a = i1517 % 128;
                                    int i1518 = i1517 % 2;
                                } else {
                                    str = str2;
                                }
                                ActivityRoster activityRoster19 = ActivityRoster.this;
                                Objects.requireNonNull(activityRoster19);
                                int i1519 = a;
                                i12 = (i1519 & 47) + (i1519 | 47);
                                b = i12 % 128;
                                if (i12 % 2 == 0) {
                                }
                                if (ActivityRoster.this.br < 17.0d) {
                                    int i161117 = a;
                                    int i161118 = ((i161117 | 89) << 1) - (i161117 ^ 89);
                                    b = i161118 % 128;
                                    int i161119 = i161118 % 2;
                                    C0104p c0104pC5 = C0104p.c();
                                    AppCompatActivity appCompatActivity5 = ActivityRoster.this.ae;
                                    String strT5 = j.t("Are you sure roster is ", str, "?");
                                    DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j5 = new DialogInterfaceOnClickListenerC0204j(this, 1);
                                    int i1611110 = a;
                                    int i1611111 = i1611110 & 27;
                                    int i1611112 = i1611111 + ((i1611110 ^ 27) | i1611111);
                                    b = i1611112 % 128;
                                    int i1611113 = i1611112 % 2;
                                    c0104pC5.h(appCompatActivity5, "Warning", strT5, null, dialogInterfaceOnClickListenerC0204j5, false);
                                    int i1611114 = a;
                                    int i1611115 = i1611114 ^ 75;
                                    int i1712 = (i1611114 & 75) << 1;
                                    int i1713 = ((i1611115 | i1712) << 1) - (i1712 ^ i1611115);
                                    b = i1713 % 128;
                                    int i1714 = i1713 % 2;
                                }
                            }
                        } else {
                            int optionId10 = ActivityRoster.this.aI.get(i).getOptionId();
                            int i12118 = a;
                            i5 = ((i12118 ^ 54) + ((i12118 & 54) << 1)) - 1;
                            i6 = i5 % 128;
                            b = i6;
                            str = "married";
                            if (i5 % 2 == 0) {
                                int i12119 = ((i6 ^ 37) | (i6 & 37)) << 1;
                                int i121110 = -((i6 & (-38)) | ((~i6) & 37));
                                int i121111 = ((i12119 | i121110) << 1) - (i12119 ^ i121110);
                                a = i121111 % 128;
                                int i121112 = i121111 % 2;
                                str2 = BuildConfig.FLAVOR;
                            } else {
                                int i121113 = ((i6 ^ 37) | (i6 & 37)) << 1;
                                int i121114 = -((i6 & (-38)) | ((~i6) & 37));
                                int i121115 = ((i121113 | i121114) << 1) - (i121113 ^ i121114);
                                a = i121115 % 128;
                                int i121116 = i121115 % 2;
                                str2 = BuildConfig.FLAVOR;
                            }
                            optionId = ActivityRoster.this.aI.get(i).getOptionId();
                            i7 = a;
                            int i13114 = i7 & 9;
                            int i13115 = (((~i13114) & (i7 | 9)) - (~(i13114 << 1))) - 1;
                            b = i13115 % 128;
                            int i13116 = i13115 % 2;
                            if (optionId == 203) {
                                int i13117 = (i7 & 105) + (i7 | 105);
                                b = i13117 % 128;
                                int i13118 = i13117 % 2;
                                int i13119 = ((i7 ^ 72) + ((i7 & 72) << 1)) - 1;
                                b = i13119 % 128;
                                int i131110 = i13119 % 2;
                                str2 = "divorced";
                            }
                            int optionId11 = ActivityRoster.this.aI.get(i).getOptionId();
                            i8 = b;
                            i9 = (((i8 & (-26)) | ((~i8) & 25)) - (~((i8 & 25) << 1))) - 1;
                            a = i9 % 128;
                            if (i9 % 2 != 0) {
                                i10 = (((i8 | 6) << 1) - (i8 ^ 6)) - 1;
                                i11 = i10 % 128;
                                a = i11;
                                if (i10 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                int i141110 = (-2) - ((((i11 | 96) << 1) - (i11 ^ 96)) ^ (-1));
                                b = i141110 % 128;
                                int i141111 = i141110 % 2;
                                str2 = "widow";
                            } else {
                                i10 = (((i8 | 6) << 1) - (i8 ^ 6)) - 1;
                                i11 = i10 % 128;
                                a = i11;
                                if (i10 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                int i141112 = (-2) - ((((i11 | 96) << 1) - (i11 ^ 96)) ^ (-1));
                                b = i141112 % 128;
                                int i141113 = i141112 % 2;
                                str2 = "widow";
                            }
                            item = ActivityRoster.this.aI.get(i);
                            int i141114 = a;
                            int i141115 = i141114 & 15;
                            int i141116 = (i141114 ^ 15) | i141115;
                            int i141117 = ((i141115 | i141116) << 1) - (i141116 ^ i141115);
                            b = i141117 % 128;
                            int i141118 = i141117 % 2;
                            if (item.getOptionId() == 204) {
                                int i141119 = b;
                                int i1424 = i141119 & 113;
                                int i1425 = (i1424 - (~(-(-((i141119 ^ 113) | i1424))))) - 1;
                                a = i1425 % 128;
                                int i15110 = i1425 % 2;
                                int i15111 = i141119 & 97;
                                int i15112 = i15111 + ((i141119 ^ 97) | i15111);
                                a = i15112 % 128;
                                int i15113 = i15112 % 2;
                            } else {
                                str = str2;
                            }
                            ActivityRoster activityRoster110 = ActivityRoster.this;
                            Objects.requireNonNull(activityRoster110);
                            int i15114 = a;
                            i12 = (i15114 & 47) + (i15114 | 47);
                            b = i12 % 128;
                            if (i12 % 2 == 0) {
                            }
                            if (ActivityRoster.this.br < 17.0d) {
                                int i1611116 = a;
                                int i1611117 = ((i1611116 | 89) << 1) - (i1611116 ^ 89);
                                b = i1611117 % 128;
                                int i1611118 = i1611117 % 2;
                                C0104p c0104pC6 = C0104p.c();
                                AppCompatActivity appCompatActivity6 = ActivityRoster.this.ae;
                                String strT6 = j.t("Are you sure roster is ", str, "?");
                                DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j6 = new DialogInterfaceOnClickListenerC0204j(this, 1);
                                int i1611119 = a;
                                int i16111110 = i1611119 & 27;
                                int i16111111 = i16111110 + ((i1611119 ^ 27) | i16111110);
                                b = i16111111 % 128;
                                int i16111112 = i16111111 % 2;
                                c0104pC6.h(appCompatActivity6, "Warning", strT6, null, dialogInterfaceOnClickListenerC0204j6, false);
                                int i16111113 = a;
                                int i16111114 = i16111113 ^ 75;
                                int i1715 = (i16111113 & 75) << 1;
                                int i1716 = ((i16111114 | i1715) << 1) - (i1715 ^ i16111114);
                                b = i1716 % 128;
                                int i1717 = i1716 % 2;
                            }
                        }
                    }
                }
            }
            int i180 = a;
            int i181 = i180 & 103;
            int i182 = (i181 - (~(-(-((i180 ^ 103) | i181))))) - 1;
            b = i182 % 128;
            int i183 = i182 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0414  */
    /* JADX WARN: Code duplicated, block: B:106:0x042a  */
    /* JADX WARN: Code duplicated, block: B:107:0x045e  */
    /* JADX WARN: Code duplicated, block: B:111:0x046b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0475  */
    /* JADX WARN: Code duplicated, block: B:116:0x0490  */
    /* JADX WARN: Code duplicated, block: B:118:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:119:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:121:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:125:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x0520  */
    /* JADX WARN: Code duplicated, block: B:128:0x0532  */
    /* JADX WARN: Code duplicated, block: B:132:0x055a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0566  */
    /* JADX WARN: Code duplicated, block: B:135:0x0574  */
    /* JADX WARN: Code duplicated, block: B:138:0x0590  */
    /* JADX WARN: Code duplicated, block: B:140:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:149:0x060e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0621  */
    /* JADX WARN: Code duplicated, block: B:154:0x063c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0687  */
    /* JADX WARN: Code duplicated, block: B:164:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:167:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:169:0x0713  */
    /* JADX WARN: Code duplicated, block: B:170:0x071f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0732  */
    /* JADX WARN: Code duplicated, block: B:174:0x074c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0757  */
    /* JADX WARN: Code duplicated, block: B:178:0x075f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0775  */
    /* JADX WARN: Code duplicated, block: B:181:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:185:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:188:0x081f  */
    /* JADX WARN: Code duplicated, block: B:190:0x084f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0855  */
    /* JADX WARN: Code duplicated, block: B:66:0x031a  */
    /* JADX WARN: Code duplicated, block: B:68:0x031e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0322  */
    /* JADX WARN: Code duplicated, block: B:83:0x0359  */
    /* JADX WARN: Code duplicated, block: B:84:0x035d  */
    /* JADX WARN: Code duplicated, block: B:86:0x036b  */
    /* JADX WARN: Code duplicated, block: B:87:0x036f  */
    /* JADX WARN: Code duplicated, block: B:89:0x037d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0391  */
    /* JADX WARN: Code duplicated, block: B:92:0x0394  */
    /* JADX WARN: Code duplicated, block: B:94:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:96:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:97:0x03df  */
    /* JADX WARN: Code duplicated, block: B:99:0x03ed  */
    public void L() {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        Intent intent;
        int i4;
        Roster roster;
        int i5;
        ArrayList<Roster> arrayList;
        int i6;
        int i7;
        ArrayList<Item> arrayList2;
        int i8;
        ArrayList<Item> arrayList3;
        int selectedItemPosition;
        int i9;
        Item item;
        int i10;
        ArrayList<Item> arrayList4;
        int selectedItemPosition2;
        ArrayList<Item> arrayList5;
        int selectedItemPosition3;
        int i11;
        int i12;
        byte[] bArr2;
        int i13;
        String str;
        int i14 = 2 % 2;
        Roster roster2 = new Roster();
        roster2.name_of_member = this.et_MemberName.getText().toString();
        roster2.urdu_name_of_member = this.vald_name_txt_view.getText().toString();
        int i15 = q;
        int i16 = ((i15 ^ 61) | (i15 & 61)) << 1;
        int i17 = -(((~i15) & 61) | (i15 & (-62)));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        p = i18 % 128;
        int i19 = i18 % 2;
        boolean z = this.aJ;
        if (!z) {
            z = this.bs;
        }
        roster2.cnic_valid = Boolean.valueOf(z);
        roster2.cnic_valid_name = this.bG;
        roster2.cnic_valid_father_Name = this.bH;
        roster2.cnic_valid_dob = this.bI;
        int i20 = q;
        int i21 = i20 & 95;
        int i22 = (i20 ^ 95) | i21;
        int i23 = (i21 & i22) + (i22 | i21);
        p = i23 % 128;
        int i24 = i23 % 2;
        roster2.cnic_valid_gender = this.bD;
        roster2.cnic_valid_current_address = this.bE;
        roster2.cnic_valid_permanent_address = this.bC;
        roster2.cnic_valid_identification_mark = this.bK;
        int i25 = p + 93;
        q = i25 % 128;
        int i26 = i25 % 2;
        roster2.cnic_valid_religion = this.bB;
        roster2.mobile_network_name = this.sp_networks.getSelectedItem().toString();
        String string = this.et_mobile_number.getText().toString();
        int i27 = q;
        int i28 = i27 ^ 5;
        int i29 = (((i27 & 5) | i28) << 1) - i28;
        p = i29 % 128;
        int i30 = i29 % 2;
        roster2.mobile_no = string;
        Object obj = null;
        if (this.rg_bank_info.getCheckedRadioButtonId() != this.rg_bank_info.getChildAt(1).getId()) {
            roster2.banks_name = this.sp_banks.getSelectedItem().toString();
            roster2.branch_code = 0;
            Editable text = this.et_easypaisa_number.getText();
            int i31 = p;
            int i32 = i31 & 5;
            int i33 = i32 + ((i31 ^ 5) | i32);
            q = i33 % 128;
            if (i33 % 2 != 0) {
                roster2.bank_address = text.toString();
                this.et_account_title.getText();
                throw null;
            }
            roster2.bank_address = text.toString();
            roster2.account_title = this.et_account_title.getText().toString();
            roster2.account_number = this.et_account_number.getText().toString();
            int i34 = q;
            int i35 = ((i34 | 24) << 1) - (i34 ^ 24);
            int i36 = (i35 ^ (-1)) + (i35 << 1);
            p = i36 % 128;
            int i37 = i36 % 2;
        }
        roster2.radioGroupCalendarId = this.radioGroupCalendar.getCheckedRadioButtonId();
        if (this.sp_relation_to_household.getSelectedItemPosition() != 0) {
            Item item2 = this.aL.get(this.sp_relation_to_household.getSelectedItemPosition());
            int i38 = p;
            int i39 = (((i38 & (-62)) | ((~i38) & 61)) - (~((61 & i38) << 1))) - 1;
            q = i39 % 128;
            int i40 = i39 % 2;
            roster2.relation_to_household_id = item2.getOptionId();
            roster2.relation_to_household_name = this.aL.get(this.sp_relation_to_household.getSelectedItemPosition()).getOption();
            if (this.aU) {
                int i41 = p;
                int i42 = ((i41 ^ 33) - (~(-(-((i41 & 33) << 1))))) - 1;
                q = i42 % 128;
                if (i42 % 2 == 0 ? this.bn.relation_to_household_id == 186 : this.bn.relation_to_household_id == 32034) {
                    ag.g = false;
                }
            }
            if (this.aL.get(this.sp_relation_to_household.getSelectedItemPosition()).getOptionId() == 186) {
                int i43 = p;
                int i44 = (i43 & 119) + (i43 | 119);
                q = i44 % 128;
                int i45 = i44 % 2;
                ag.g = true;
            }
        } else {
            roster2.relation_to_household_id = 0;
            roster2.relation_to_household_name = BuildConfig.FLAVOR;
            if (this.aU) {
                int i46 = q;
                int i47 = i46 & 43;
                int i48 = -(-((i46 ^ 43) | i47));
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                p = i49 % 128;
                int i50 = i49 % 2;
                if (this.bn.relation_to_household_id == 186) {
                    ag.g = false;
                    int i51 = p + 39;
                    q = i51 % 128;
                    int i52 = i51 % 2;
                }
            }
        }
        roster2.date_of_birth = this.tv_dob.getText().toString();
        roster2.date_of_birth_var = this.bq;
        int i53 = q;
        int i54 = i53 & 23;
        int i55 = ((((i53 ^ 23) | i54) << 1) - (~(-((i53 | 23) & (~i54))))) - 1;
        p = i55 % 128;
        if (i55 % 2 == 0) {
            roster2.age_month = this.spinnerMonth.getSelectedItemPosition();
            throw null;
        }
        roster2.age_month = this.spinnerMonth.getSelectedItemPosition();
        int i56 = p;
        int i57 = (i56 | 53) << 1;
        int i58 = -(i56 ^ 53);
        int i59 = (i57 & i58) + (i58 | i57);
        q = i59 % 128;
        int i60 = i59 % 2;
        roster2.age_year = this.spinnerYear.getSelectedItemPosition();
        RadioGroup radioGroup = this.radioGroupGender;
        int i61 = p;
        int i62 = (((i61 & (-16)) | ((~i61) & 15)) - (~(-(-((i61 & 15) << 1))))) - 1;
        q = i62 % 128;
        if (i62 % 2 != 0) {
            radioGroup.getCheckedRadioButtonId();
            this.radioButtonMale.getId();
            throw null;
        }
        if (radioGroup.getCheckedRadioButtonId() == this.radioButtonMale.getId()) {
            int i63 = q;
            int i64 = i63 & 35;
            int i65 = i64 + ((i63 ^ 35) | i64);
            p = i65 % 128;
            if (i65 % 2 == 0) {
                roster2.gender = "male";
                int i66 = 45 / 0;
            } else {
                roster2.gender = "male";
            }
        } else {
            int checkedRadioButtonId = this.radioGroupGender.getCheckedRadioButtonId();
            RadioButton radioButton = this.radioButtonFemale;
            int i67 = p;
            int i68 = i67 & 55;
            int i69 = (i67 ^ 55) | i68;
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            q = i70 % 128;
            int i71 = i70 % 2;
            if (checkedRadioButtonId == radioButton.getId()) {
                roster2.gender = "female";
            } else if (this.radioGroupGender.getCheckedRadioButtonId() == this.radioButtonTrans.getId()) {
                roster2.gender = "transgender";
            } else {
                roster2.gender = BuildConfig.FLAVOR;
            }
        }
        if (this.sp_marital_status.getSelectedItemPosition() != 0) {
            roster2.marital_status = this.aI.get(this.sp_marital_status.getSelectedItemPosition()).getOptionId();
            String option = this.aI.get(this.sp_marital_status.getSelectedItemPosition()).getOption();
            int i72 = p;
            int i73 = ((i72 | 13) << 1) - (i72 ^ 13);
            q = i73 % 128;
            if (i73 % 2 != 0) {
                roster2.merital_status_name = option;
                int i74 = 22 / 0;
            } else {
                roster2.merital_status_name = option;
            }
        }
        int i75 = this.ac;
        if (i75 == 1) {
            if (ag.j == 1) {
                if (this.aY) {
                }
            } else if (this.aY) {
            }
            if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICNotMade.getId()) {
                roster2.cnicOption = 0;
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICAbsent.getId()) {
                roster2.cnicOption = 1;
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
                int i76 = q;
                i = ((i76 | 105) << 1) - (((~i76) & 105) | (i76 & (-106)));
                p = i % 128;
                if (i % 2 == 0) {
                    roster2.cnicOption = 5;
                } else {
                    roster2.cnicOption = 2;
                }
                Roster roster3 = this.bn;
                String str2 = roster3.cnic;
                int i77 = q;
                int i78 = i77 & 15;
                int i79 = (i77 | 15) & (~i78);
                int i80 = i78 << 1;
                int i81 = (i79 & i80) + (i79 | i80);
                p = i81 % 128;
                int i82 = i81 % 2;
                roster2.cnic = str2;
                roster2.cnicRepeat = roster3.cnicRepeat;
                int i83 = p;
                int i84 = (((i83 & (-64)) | ((~i83) & 63)) - (~((i83 & 63) << 1))) - 1;
                q = i84 % 128;
                int i85 = i84 % 2;
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
                roster2.cnicOption = 3;
                roster2.cnic = j.m(this.por_roster);
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId()) {
                int i86 = p;
                int i87 = (i86 & (-30)) | ((~i86) & 29);
                int i88 = (i86 & 29) << 1;
                int i89 = (i87 & i88) + (i88 | i87);
                q = i89 % 128;
                int i90 = i89 % 2;
                roster2.cnicOption = 4;
                roster2.cnic = j.m(this.por_roster);
            }
            if (this.linearLayoutCNICPic.getVisibility() == 0) {
                int i91 = p;
                int i92 = i91 ^ 45;
                i13 = (((i91 & 45) | i92) << 1) - i92;
                q = i13 % 128;
                if (i13 % 2 == 0) {
                    roster2.cnicArray = bArr2;
                    j.w("cnic_");
                    obj.hashCode();
                    throw null;
                }
                roster2.cnicArray = bArr2;
                StringBuilder sbW = j.w("cnic_");
                int i93 = q;
                int i94 = (i93 | 17) << 1;
                int i95 = -(i93 ^ 17);
                int i96 = (i94 & i95) + (i95 | i94);
                p = i96 % 128;
                int i97 = i96 % 2;
                sbW.append(z.e());
                String string2 = sbW.toString();
                int i98 = q;
                int i99 = i98 & 91;
                int i100 = i98 | 91;
                int i101 = (i99 & i100) + (i100 | i99);
                p = i101 % 128;
                int i102 = i101 % 2;
                roster2.cnicPicName = string2;
            }
            bArr = this.bx;
            if (bArr != null) {
                roster2.bioImage = bArr;
            }
            if (this.sp_disability.getSelectedItemPosition() != 0) {
                arrayList5 = this.aN;
                selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
                int i103 = p;
                i11 = ((i103 & (-120)) | ((~i103) & 119)) + ((i103 & 119) << 1);
                q = i11 % 128;
                if (i11 % 2 == 0) {
                    roster2.disability = arrayList5.get(selectedItemPosition3).getOptionId();
                    throw null;
                }
                roster2.disability = arrayList5.get(selectedItemPosition3).getOptionId();
                int i104 = q;
                int i105 = (i104 & (-50)) | ((~i104) & 49);
                int i106 = -(-((i104 & 49) << 1));
                i12 = (i105 & i106) + (i106 | i105);
                p = i12 % 128;
                if (i12 % 2 != 0) {
                    this.sp_disability.getSelectedItemPosition();
                    throw null;
                }
                roster2.disability_name = this.aN.get(this.sp_disability.getSelectedItemPosition()).getOption();
                int i107 = p + 23;
                q = i107 % 128;
                int i108 = i107 % 2;
            }
            if (this.sp_chronic_disease.getSelectedItemPosition() != 0) {
                int i109 = p;
                int i110 = (i109 & (-94)) | ((~i109) & 93);
                int i111 = (i109 & 93) << 1;
                int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                q = i112 % 128;
                int i113 = i112 % 2;
                item = this.aM.get(this.sp_chronic_disease.getSelectedItemPosition());
                int i114 = p;
                i10 = ((i114 & 75) - (~(i114 | 75))) - 1;
                q = i10 % 128;
                if (i10 % 2 != 0) {
                    roster2.chronic_disease = item.getOptionId();
                    arrayList4 = this.aM;
                    selectedItemPosition2 = this.sp_chronic_disease.getSelectedItemPosition();
                    int i115 = 56 / 0;
                } else {
                    roster2.chronic_disease = item.getOptionId();
                    arrayList4 = this.aM;
                    selectedItemPosition2 = this.sp_chronic_disease.getSelectedItemPosition();
                }
                roster2.chronic_disease_name = arrayList4.get(selectedItemPosition2).getOption();
            }
            if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_yes.getId()) {
                int i116 = q + 75;
                p = i116 % 128;
                int i117 = i116 % 2;
                roster2.language = 1;
            } else if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_no.getId()) {
                int i118 = p;
                int i119 = (i118 ^ 93) + ((i118 & 93) << 1);
                q = i119 % 128;
                int i120 = i119 % 2;
                roster2.language = 0;
                this.sp_attended_school.setSelection(1);
            }
            if (this.sp_attended_school.getSelectedItemPosition() != 0) {
                arrayList3 = this.aO;
                selectedItemPosition = this.sp_attended_school.getSelectedItemPosition();
                i9 = p + 43;
                q = i9 % 128;
                if (i9 % 2 == 0) {
                    roster2.attended_school = arrayList3.get(selectedItemPosition).getOptionId();
                    obj.hashCode();
                    throw null;
                }
                roster2.attended_school = arrayList3.get(selectedItemPosition).getOptionId();
                roster2.attended_school_name = this.aO.get(this.sp_attended_school.getSelectedItemPosition()).getOption();
            }
            if (this.sp_highest_education.getVisibility() == 0) {
                roster2.higher_education = this.aP.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
                arrayList2 = this.aP;
                int i121 = q;
                int i122 = i121 & 103;
                int i123 = -(-((i121 ^ 103) | i122));
                i8 = (i122 & i123) + (i123 | i122);
                p = i8 % 128;
                if (i8 % 2 != 0) {
                    arrayList2.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
                    obj.hashCode();
                    throw null;
                }
                roster2.higher_education_name = arrayList2.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
            }
            if (this.sp_work_activity.getVisibility() == 0) {
                Item item3 = this.aQ.get(this.sp_work_activity.getSelectedItemPosition());
                int i124 = p;
                int i125 = i124 & 67;
                int i126 = -(-((i124 ^ 67) | i125));
                int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                q = i127 % 128;
                int i128 = i127 % 2;
                roster2.work_activity = item3.getOptionId();
                roster2.work_activity_name = this.aQ.get(this.sp_work_activity.getSelectedItemPosition()).getOption();
            }
            if (this.sp_employment_status.getVisibility() == 0) {
                ArrayList<Item> arrayList6 = this.be;
                int selectedItemPosition4 = this.sp_employment_status.getSelectedItemPosition();
                int i129 = p;
                int i130 = ((i129 ^ 19) | (i129 & 19)) << 1;
                int i131 = -(((~i129) & 19) | (i129 & (-20)));
                int i132 = (i130 ^ i131) + ((i131 & i130) << 1);
                q = i132 % 128;
                int i133 = i132 % 2;
                roster2.employment_status = arrayList6.get(selectedItemPosition4).getOptionId();
                roster2.employment_status_name = this.be.get(this.sp_employment_status.getSelectedItemPosition()).getOption();
            }
            if (this.et_hoursWorked.getVisibility() == 0) {
                int i134 = p + 71;
                q = i134 % 128;
                int i135 = i134 % 2;
                roster2.hours_worked = Double.parseDouble(this.et_hoursWorked.getText().toString());
            }
            roster2.age = this.br;
            if (this.aU) {
                roster = this.bj.get(this.aV);
                int i136 = p;
                int i137 = i136 & 87;
                i5 = i137 + ((i136 ^ 87) | i137);
                q = i5 % 128;
                if (i5 % 2 != 0) {
                    roster2.roster_relational_id = roster.roster_relational_id;
                    arrayList = this.bj;
                    i6 = this.aV;
                    int i138 = 26 / 0;
                } else {
                    roster2.roster_relational_id = roster.roster_relational_id;
                    arrayList = this.bj;
                    i6 = this.aV;
                }
                i7 = q + 103;
                p = i7 % 128;
                if (i7 % 2 != 0) {
                    roster2.rosterUniqueId = arrayList.get(i6).rosterUniqueId;
                    throw null;
                }
                roster2.rosterUniqueId = arrayList.get(i6).rosterUniqueId;
                Roster roster4 = this.bn;
                roster2.start = roster4.start;
                roster2.end = roster4.end;
                roster2.diff = roster4.diff;
            } else {
                if (this.bj.size() == 0) {
                    int i139 = p;
                    int i140 = i139 + 73;
                    q = i140 % 128;
                    int i141 = i140 % 2;
                    int i142 = i139 & 35;
                    int i143 = i142 + ((i139 ^ 35) | i142);
                    q = i143 % 128;
                    int i144 = i143 % 2;
                    i2 = 1;
                } else {
                    ArrayList<Roster> arrayList7 = this.bj;
                    int size = arrayList7.size();
                    int i145 = ~size;
                    int i146 = size << 1;
                    int i147 = arrayList7.get((i145 ^ i146) + ((i146 & i145) << 1)).roster_relational_id;
                    int i148 = i147 & 1;
                    i2 = (((i147 | 1) & (~i148)) - (~(-(-(i148 << 1))))) - 1;
                    int i149 = q;
                    int i150 = i149 & 59;
                    i3 = i150 + ((i149 ^ 59) | i150);
                    p = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i151 = 3 % 2;
                    }
                }
                roster2.roster_relational_id = i2;
                roster2.rosterUniqueId = UUID.randomUUID().toString();
                roster2.start = this.bd;
                String strE = z.e();
                roster2.end = strE;
                roster2.diff = ac.f(roster2.start, strE);
            }
            if (!BISPApplication.f()) {
                String strE2 = BISPApplication.e();
                String[] strArrSplit = strE2.split(",");
                int i152 = q + 73;
                p = i152 % 128;
                int i153 = i152 % 2;
                roster2.latitude = strArrSplit[0];
                String[] strArrSplit2 = strE2.split(",");
                int i154 = q;
                int i155 = i154 & 43;
                int i156 = (i154 ^ 43) | i155;
                int i157 = (i155 & i156) + (i156 | i155);
                p = i157 % 128;
                int i158 = i157 % 2;
                roster2.longitude = strArrSplit2[1];
                int i159 = p;
                int i160 = i159 & 43;
                int i161 = (((i159 ^ 43) | i160) << 1) - ((i159 | 43) & (~i160));
                q = i161 % 128;
                int i162 = i161 % 2;
            }
            roster2.setValidatedFromNadra(this.bn.isValidatedFromNadra());
            intent = new Intent();
            if (this.aU) {
                int i163 = p;
                int i164 = (((i163 | 72) << 1) - (i163 ^ 72)) - 1;
                q = i164 % 128;
                int i165 = i164 % 2;
                intent.putExtra("household_age", this.bm);
                int i166 = p;
                int i167 = i166 & 79;
                int i168 = ((i166 ^ 79) | i167) << 1;
                int i169 = -((i166 | 79) & (~i167));
                i4 = (i168 ^ i169) + ((i169 & i168) << 1);
                q = i4 % 128;
                if (i4 % 2 == 0) {
                    intent.putExtra("position", this.aV);
                    obj.hashCode();
                    throw null;
                }
                intent.putExtra("position", this.aV);
            }
            intent.putExtra("roster", roster2);
            setResult(-1, intent);
            int i170 = p + 13;
            q = i170 % 128;
            int i171 = i170 % 2;
            finish();
        }
        int i172 = q;
        int i173 = i172 & 53;
        int i174 = ((i172 ^ 53) | i173) << 1;
        int i175 = -((i172 | 53) & (~i173));
        int i176 = (i174 ^ i175) + ((i175 & i174) << 1);
        int i177 = i176 % 128;
        p = i177;
        int i178 = i176 % 2;
        if (i75 == 2) {
            if (ag.j == 1) {
                if (this.aY) {
                }
            } else if (this.aY) {
            }
            if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICNotMade.getId()) {
                roster2.cnicOption = 0;
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICAbsent.getId()) {
                roster2.cnicOption = 1;
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
                int i710 = q;
                i = ((i710 | 105) << 1) - (((~i710) & 105) | (i710 & (-106)));
                p = i % 128;
                if (i % 2 == 0) {
                    roster2.cnicOption = 5;
                } else {
                    roster2.cnicOption = 2;
                }
                Roster roster5 = this.bn;
                String str3 = roster5.cnic;
                int i711 = q;
                int i712 = i711 & 15;
                int i713 = (i711 | 15) & (~i712);
                int i810 = i712 << 1;
                int i811 = (i713 & i810) + (i713 | i810);
                p = i811 % 128;
                int i812 = i811 % 2;
                roster2.cnic = str3;
                roster2.cnicRepeat = roster5.cnicRepeat;
                int i813 = p;
                int i814 = (((i813 & (-64)) | ((~i813) & 63)) - (~((i813 & 63) << 1))) - 1;
                q = i814 % 128;
                int i815 = i814 % 2;
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
                roster2.cnicOption = 3;
                roster2.cnic = j.m(this.por_roster);
            } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId()) {
                int i816 = p;
                int i817 = (i816 & (-30)) | ((~i816) & 29);
                int i818 = (i816 & 29) << 1;
                int i819 = (i817 & i818) + (i818 | i817);
                q = i819 % 128;
                int i910 = i819 % 2;
                roster2.cnicOption = 4;
                roster2.cnic = j.m(this.por_roster);
            }
            if (this.linearLayoutCNICPic.getVisibility() == 0) {
                int i911 = p;
                int i912 = i911 ^ 45;
                i13 = (((i911 & 45) | i912) << 1) - i912;
                q = i13 % 128;
                if (i13 % 2 == 0) {
                    roster2.cnicArray = bArr2;
                    j.w("cnic_");
                    obj.hashCode();
                    throw null;
                }
                roster2.cnicArray = bArr2;
                StringBuilder sbW2 = j.w("cnic_");
                int i913 = q;
                int i914 = (i913 | 17) << 1;
                int i915 = -(i913 ^ 17);
                int i916 = (i914 & i915) + (i915 | i914);
                p = i916 % 128;
                int i917 = i916 % 2;
                sbW2.append(z.e());
                String string3 = sbW2.toString();
                int i918 = q;
                int i919 = i918 & 91;
                int i1010 = i918 | 91;
                int i1011 = (i919 & i1010) + (i1010 | i919);
                p = i1011 % 128;
                int i1012 = i1011 % 2;
                roster2.cnicPicName = string3;
            }
            bArr = this.bx;
            if (bArr != null) {
                roster2.bioImage = bArr;
            }
            if (this.sp_disability.getSelectedItemPosition() != 0) {
                arrayList5 = this.aN;
                selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
                int i1013 = p;
                i11 = ((i1013 & (-120)) | ((~i1013) & 119)) + ((i1013 & 119) << 1);
                q = i11 % 128;
                if (i11 % 2 == 0) {
                    roster2.disability = arrayList5.get(selectedItemPosition3).getOptionId();
                    throw null;
                }
                roster2.disability = arrayList5.get(selectedItemPosition3).getOptionId();
                int i1014 = q;
                int i1015 = (i1014 & (-50)) | ((~i1014) & 49);
                int i1016 = -(-((i1014 & 49) << 1));
                i12 = (i1015 & i1016) + (i1016 | i1015);
                p = i12 % 128;
                if (i12 % 2 != 0) {
                    this.sp_disability.getSelectedItemPosition();
                    throw null;
                }
                roster2.disability_name = this.aN.get(this.sp_disability.getSelectedItemPosition()).getOption();
                int i1017 = p + 23;
                q = i1017 % 128;
                int i1018 = i1017 % 2;
            }
            if (this.sp_chronic_disease.getSelectedItemPosition() != 0) {
                int i1019 = p;
                int i1110 = (i1019 & (-94)) | ((~i1019) & 93);
                int i1111 = (i1019 & 93) << 1;
                int i1112 = (i1110 ^ i1111) + ((i1111 & i1110) << 1);
                q = i1112 % 128;
                int i1113 = i1112 % 2;
                item = this.aM.get(this.sp_chronic_disease.getSelectedItemPosition());
                int i1114 = p;
                i10 = ((i1114 & 75) - (~(i1114 | 75))) - 1;
                q = i10 % 128;
                if (i10 % 2 != 0) {
                    roster2.chronic_disease = item.getOptionId();
                    arrayList4 = this.aM;
                    selectedItemPosition2 = this.sp_chronic_disease.getSelectedItemPosition();
                    int i1115 = 56 / 0;
                } else {
                    roster2.chronic_disease = item.getOptionId();
                    arrayList4 = this.aM;
                    selectedItemPosition2 = this.sp_chronic_disease.getSelectedItemPosition();
                }
                roster2.chronic_disease_name = arrayList4.get(selectedItemPosition2).getOption();
            }
            if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_yes.getId()) {
                int i1116 = q + 75;
                p = i1116 % 128;
                int i1117 = i1116 % 2;
                roster2.language = 1;
            } else if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_no.getId()) {
                int i1118 = p;
                int i1119 = (i1118 ^ 93) + ((i1118 & 93) << 1);
                q = i1119 % 128;
                int i1210 = i1119 % 2;
                roster2.language = 0;
                this.sp_attended_school.setSelection(1);
            }
            if (this.sp_attended_school.getSelectedItemPosition() != 0) {
                arrayList3 = this.aO;
                selectedItemPosition = this.sp_attended_school.getSelectedItemPosition();
                i9 = p + 43;
                q = i9 % 128;
                if (i9 % 2 == 0) {
                    roster2.attended_school = arrayList3.get(selectedItemPosition).getOptionId();
                    obj.hashCode();
                    throw null;
                }
                roster2.attended_school = arrayList3.get(selectedItemPosition).getOptionId();
                roster2.attended_school_name = this.aO.get(this.sp_attended_school.getSelectedItemPosition()).getOption();
            }
            if (this.sp_highest_education.getVisibility() == 0) {
                roster2.higher_education = this.aP.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
                arrayList2 = this.aP;
                int i1211 = q;
                int i1212 = i1211 & 103;
                int i1213 = -(-((i1211 ^ 103) | i1212));
                i8 = (i1212 & i1213) + (i1213 | i1212);
                p = i8 % 128;
                if (i8 % 2 != 0) {
                    arrayList2.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
                    obj.hashCode();
                    throw null;
                }
                roster2.higher_education_name = arrayList2.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
            }
            if (this.sp_work_activity.getVisibility() == 0) {
                Item item4 = this.aQ.get(this.sp_work_activity.getSelectedItemPosition());
                int i1214 = p;
                int i1215 = i1214 & 67;
                int i1216 = -(-((i1214 ^ 67) | i1215));
                int i1217 = ((i1215 | i1216) << 1) - (i1216 ^ i1215);
                q = i1217 % 128;
                int i1218 = i1217 % 2;
                roster2.work_activity = item4.getOptionId();
                roster2.work_activity_name = this.aQ.get(this.sp_work_activity.getSelectedItemPosition()).getOption();
            }
            if (this.sp_employment_status.getVisibility() == 0) {
                ArrayList<Item> arrayList8 = this.be;
                int selectedItemPosition5 = this.sp_employment_status.getSelectedItemPosition();
                int i1219 = p;
                int i1310 = ((i1219 ^ 19) | (i1219 & 19)) << 1;
                int i1311 = -(((~i1219) & 19) | (i1219 & (-20)));
                int i1312 = (i1310 ^ i1311) + ((i1311 & i1310) << 1);
                q = i1312 % 128;
                int i1313 = i1312 % 2;
                roster2.employment_status = arrayList8.get(selectedItemPosition5).getOptionId();
                roster2.employment_status_name = this.be.get(this.sp_employment_status.getSelectedItemPosition()).getOption();
            }
            if (this.et_hoursWorked.getVisibility() == 0) {
                int i1314 = p + 71;
                q = i1314 % 128;
                int i1315 = i1314 % 2;
                roster2.hours_worked = Double.parseDouble(this.et_hoursWorked.getText().toString());
            }
            roster2.age = this.br;
            if (this.aU) {
                roster = this.bj.get(this.aV);
                int i1316 = p;
                int i1317 = i1316 & 87;
                i5 = i1317 + ((i1316 ^ 87) | i1317);
                q = i5 % 128;
                if (i5 % 2 != 0) {
                    roster2.roster_relational_id = roster.roster_relational_id;
                    arrayList = this.bj;
                    i6 = this.aV;
                    int i1318 = 26 / 0;
                } else {
                    roster2.roster_relational_id = roster.roster_relational_id;
                    arrayList = this.bj;
                    i6 = this.aV;
                }
                i7 = q + 103;
                p = i7 % 128;
                if (i7 % 2 != 0) {
                    roster2.rosterUniqueId = arrayList.get(i6).rosterUniqueId;
                    throw null;
                }
                roster2.rosterUniqueId = arrayList.get(i6).rosterUniqueId;
                Roster roster6 = this.bn;
                roster2.start = roster6.start;
                roster2.end = roster6.end;
                roster2.diff = roster6.diff;
            } else {
                if (this.bj.size() == 0) {
                    int i1319 = p;
                    int i1410 = i1319 + 73;
                    q = i1410 % 128;
                    int i1411 = i1410 % 2;
                    int i1412 = i1319 & 35;
                    int i1413 = i1412 + ((i1319 ^ 35) | i1412);
                    q = i1413 % 128;
                    int i1414 = i1413 % 2;
                    i2 = 1;
                } else {
                    ArrayList<Roster> arrayList9 = this.bj;
                    int size2 = arrayList9.size();
                    int i1415 = ~size2;
                    int i1416 = size2 << 1;
                    int i1417 = arrayList9.get((i1415 ^ i1416) + ((i1416 & i1415) << 1)).roster_relational_id;
                    int i1418 = i1417 & 1;
                    i2 = (((i1417 | 1) & (~i1418)) - (~(-(-(i1418 << 1))))) - 1;
                    int i1419 = q;
                    int i1510 = i1419 & 59;
                    i3 = i1510 + ((i1419 ^ 59) | i1510);
                    p = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i1511 = 3 % 2;
                    }
                }
                roster2.roster_relational_id = i2;
                roster2.rosterUniqueId = UUID.randomUUID().toString();
                roster2.start = this.bd;
                String strE3 = z.e();
                roster2.end = strE3;
                roster2.diff = ac.f(roster2.start, strE3);
            }
            if (!BISPApplication.f()) {
                String strE4 = BISPApplication.e();
                String[] strArrSplit3 = strE4.split(",");
                int i1512 = q + 73;
                p = i1512 % 128;
                int i1513 = i1512 % 2;
                roster2.latitude = strArrSplit3[0];
                String[] strArrSplit4 = strE4.split(",");
                int i1514 = q;
                int i1515 = i1514 & 43;
                int i1516 = (i1514 ^ 43) | i1515;
                int i1517 = (i1515 & i1516) + (i1516 | i1515);
                p = i1517 % 128;
                int i1518 = i1517 % 2;
                roster2.longitude = strArrSplit4[1];
                int i1519 = p;
                int i1610 = i1519 & 43;
                int i1611 = (((i1519 ^ 43) | i1610) << 1) - ((i1519 | 43) & (~i1610));
                q = i1611 % 128;
                int i1612 = i1611 % 2;
            }
            roster2.setValidatedFromNadra(this.bn.isValidatedFromNadra());
            intent = new Intent();
            if (this.aU) {
                int i1613 = p;
                int i1614 = (((i1613 | 72) << 1) - (i1613 ^ 72)) - 1;
                q = i1614 % 128;
                int i1615 = i1614 % 2;
                intent.putExtra("household_age", this.bm);
                int i1616 = p;
                int i1617 = i1616 & 79;
                int i1618 = ((i1616 ^ 79) | i1617) << 1;
                int i1619 = -((i1616 | 79) & (~i1617));
                i4 = (i1618 ^ i1619) + ((i1619 & i1618) << 1);
                q = i4 % 128;
                if (i4 % 2 == 0) {
                    intent.putExtra("position", this.aV);
                    obj.hashCode();
                    throw null;
                }
                intent.putExtra("position", this.aV);
            }
            intent.putExtra("roster", roster2);
            setResult(-1, intent);
            int i179 = p + 13;
            q = i179 % 128;
            int i1710 = i179 % 2;
            finish();
        }
        int i180 = ((i177 ^ 119) - (~(-(-((i177 & 119) << 1))))) - 1;
        q = i180 % 128;
        if (i180 % 2 != 0) {
            boolean z2 = ag.d;
            obj.hashCode();
            throw null;
        }
        if (ag.d) {
            if (ag.j == 1 || !this.aY) {
                if (this.aY) {
                }
            }
        } else if (this.aY) {
        }
        if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICNotMade.getId()) {
            roster2.cnicOption = 0;
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICAbsent.getId()) {
            roster2.cnicOption = 1;
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
            int i714 = q;
            i = ((i714 | 105) << 1) - (((~i714) & 105) | (i714 & (-106)));
            p = i % 128;
            if (i % 2 == 0) {
                roster2.cnicOption = 5;
            } else {
                roster2.cnicOption = 2;
            }
            Roster roster7 = this.bn;
            String str4 = roster7.cnic;
            int i715 = q;
            int i716 = i715 & 15;
            int i717 = (i715 | 15) & (~i716);
            int i8110 = i716 << 1;
            int i8111 = (i717 & i8110) + (i717 | i8110);
            p = i8111 % 128;
            int i8112 = i8111 % 2;
            roster2.cnic = str4;
            roster2.cnicRepeat = roster7.cnicRepeat;
            int i8113 = p;
            int i8114 = (((i8113 & (-64)) | ((~i8113) & 63)) - (~((i8113 & 63) << 1))) - 1;
            q = i8114 % 128;
            int i8115 = i8114 % 2;
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
            roster2.cnicOption = 3;
            roster2.cnic = j.m(this.por_roster);
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId()) {
            int i8116 = p;
            int i8117 = (i8116 & (-30)) | ((~i8116) & 29);
            int i8118 = (i8116 & 29) << 1;
            int i8119 = (i8117 & i8118) + (i8118 | i8117);
            q = i8119 % 128;
            int i9110 = i8119 % 2;
            roster2.cnicOption = 4;
            roster2.cnic = j.m(this.por_roster);
        }
        if (this.linearLayoutCNICPic.getVisibility() == 0 && (bArr2 = this.aZ) != null) {
            int i9111 = p;
            int i9112 = i9111 ^ 45;
            i13 = (((i9111 & 45) | i9112) << 1) - i9112;
            q = i13 % 128;
            if (i13 % 2 == 0) {
                roster2.cnicArray = bArr2;
                j.w("cnic_");
                obj.hashCode();
                throw null;
            }
            roster2.cnicArray = bArr2;
            StringBuilder sbW3 = j.w("cnic_");
            int i9113 = q;
            int i9114 = (i9113 | 17) << 1;
            int i9115 = -(i9113 ^ 17);
            int i9116 = (i9114 & i9115) + (i9115 | i9114);
            p = i9116 % 128;
            int i9117 = i9116 % 2;
            sbW3.append(z.e());
            String string4 = sbW3.toString();
            int i9118 = q;
            int i9119 = i9118 & 91;
            int i10110 = i9118 | 91;
            int i10111 = (i9119 & i10110) + (i10110 | i9119);
            p = i10111 % 128;
            int i10112 = i10111 % 2;
            roster2.cnicPicName = string4;
        }
        bArr = this.bx;
        if (bArr != null) {
            roster2.bioImage = bArr;
        }
        if (this.sp_disability.getSelectedItemPosition() != 0) {
            arrayList5 = this.aN;
            selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
            int i10113 = p;
            i11 = ((i10113 & (-120)) | ((~i10113) & 119)) + ((i10113 & 119) << 1);
            q = i11 % 128;
            if (i11 % 2 == 0) {
                roster2.disability = arrayList5.get(selectedItemPosition3).getOptionId();
                throw null;
            }
            roster2.disability = arrayList5.get(selectedItemPosition3).getOptionId();
            int i10114 = q;
            int i10115 = (i10114 & (-50)) | ((~i10114) & 49);
            int i10116 = -(-((i10114 & 49) << 1));
            i12 = (i10115 & i10116) + (i10116 | i10115);
            p = i12 % 128;
            if (i12 % 2 != 0) {
                this.sp_disability.getSelectedItemPosition();
                throw null;
            }
            roster2.disability_name = this.aN.get(this.sp_disability.getSelectedItemPosition()).getOption();
            int i10117 = p + 23;
            q = i10117 % 128;
            int i10118 = i10117 % 2;
        }
        if (this.sp_chronic_disease.getSelectedItemPosition() != 0) {
            int i10119 = p;
            int i11110 = (i10119 & (-94)) | ((~i10119) & 93);
            int i11111 = (i10119 & 93) << 1;
            int i11112 = (i11110 ^ i11111) + ((i11111 & i11110) << 1);
            q = i11112 % 128;
            int i11113 = i11112 % 2;
            item = this.aM.get(this.sp_chronic_disease.getSelectedItemPosition());
            int i11114 = p;
            i10 = ((i11114 & 75) - (~(i11114 | 75))) - 1;
            q = i10 % 128;
            if (i10 % 2 != 0) {
                roster2.chronic_disease = item.getOptionId();
                arrayList4 = this.aM;
                selectedItemPosition2 = this.sp_chronic_disease.getSelectedItemPosition();
                int i11115 = 56 / 0;
            } else {
                roster2.chronic_disease = item.getOptionId();
                arrayList4 = this.aM;
                selectedItemPosition2 = this.sp_chronic_disease.getSelectedItemPosition();
            }
            roster2.chronic_disease_name = arrayList4.get(selectedItemPosition2).getOption();
        }
        if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_yes.getId()) {
            int i11116 = q + 75;
            p = i11116 % 128;
            int i11117 = i11116 % 2;
            roster2.language = 1;
        } else if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_no.getId()) {
            int i11118 = p;
            int i11119 = (i11118 ^ 93) + ((i11118 & 93) << 1);
            q = i11119 % 128;
            int i12110 = i11119 % 2;
            roster2.language = 0;
            this.sp_attended_school.setSelection(1);
        }
        if (this.sp_attended_school.getSelectedItemPosition() != 0) {
            arrayList3 = this.aO;
            selectedItemPosition = this.sp_attended_school.getSelectedItemPosition();
            i9 = p + 43;
            q = i9 % 128;
            if (i9 % 2 == 0) {
                roster2.attended_school = arrayList3.get(selectedItemPosition).getOptionId();
                obj.hashCode();
                throw null;
            }
            roster2.attended_school = arrayList3.get(selectedItemPosition).getOptionId();
            roster2.attended_school_name = this.aO.get(this.sp_attended_school.getSelectedItemPosition()).getOption();
        }
        if (this.sp_highest_education.getVisibility() == 0 && this.sp_highest_education.getSelectedItemPosition() != 0) {
            roster2.higher_education = this.aP.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
            arrayList2 = this.aP;
            int i12111 = q;
            int i12112 = i12111 & 103;
            int i12113 = -(-((i12111 ^ 103) | i12112));
            i8 = (i12112 & i12113) + (i12113 | i12112);
            p = i8 % 128;
            if (i8 % 2 != 0) {
                arrayList2.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
                obj.hashCode();
                throw null;
            }
            roster2.higher_education_name = arrayList2.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
        }
        if (this.sp_work_activity.getVisibility() == 0 && this.sp_work_activity.getSelectedItemPosition() != 0) {
            Item item5 = this.aQ.get(this.sp_work_activity.getSelectedItemPosition());
            int i12114 = p;
            int i12115 = i12114 & 67;
            int i12116 = -(-((i12114 ^ 67) | i12115));
            int i12117 = ((i12115 | i12116) << 1) - (i12116 ^ i12115);
            q = i12117 % 128;
            int i12118 = i12117 % 2;
            roster2.work_activity = item5.getOptionId();
            roster2.work_activity_name = this.aQ.get(this.sp_work_activity.getSelectedItemPosition()).getOption();
        }
        if (this.sp_employment_status.getVisibility() == 0 && this.sp_employment_status.getSelectedItemPosition() != 0) {
            ArrayList<Item> arrayList10 = this.be;
            int selectedItemPosition6 = this.sp_employment_status.getSelectedItemPosition();
            int i12119 = p;
            int i13110 = ((i12119 ^ 19) | (i12119 & 19)) << 1;
            int i13111 = -(((~i12119) & 19) | (i12119 & (-20)));
            int i13112 = (i13110 ^ i13111) + ((i13111 & i13110) << 1);
            q = i13112 % 128;
            int i13113 = i13112 % 2;
            roster2.employment_status = arrayList10.get(selectedItemPosition6).getOptionId();
            roster2.employment_status_name = this.be.get(this.sp_employment_status.getSelectedItemPosition()).getOption();
        }
        if (this.et_hoursWorked.getVisibility() == 0) {
            int i13114 = p + 71;
            q = i13114 % 128;
            int i13115 = i13114 % 2;
            roster2.hours_worked = Double.parseDouble(this.et_hoursWorked.getText().toString());
        }
        roster2.age = this.br;
        if (this.aU) {
            roster = this.bj.get(this.aV);
            int i13116 = p;
            int i13117 = i13116 & 87;
            i5 = i13117 + ((i13116 ^ 87) | i13117);
            q = i5 % 128;
            if (i5 % 2 != 0) {
                roster2.roster_relational_id = roster.roster_relational_id;
                arrayList = this.bj;
                i6 = this.aV;
                int i13118 = 26 / 0;
            } else {
                roster2.roster_relational_id = roster.roster_relational_id;
                arrayList = this.bj;
                i6 = this.aV;
            }
            i7 = q + 103;
            p = i7 % 128;
            if (i7 % 2 != 0) {
                roster2.rosterUniqueId = arrayList.get(i6).rosterUniqueId;
                throw null;
            }
            roster2.rosterUniqueId = arrayList.get(i6).rosterUniqueId;
            Roster roster8 = this.bn;
            roster2.start = roster8.start;
            roster2.end = roster8.end;
            roster2.diff = roster8.diff;
        } else {
            if (this.bj.size() == 0) {
                int i13119 = p;
                int i14110 = i13119 + 73;
                q = i14110 % 128;
                int i14111 = i14110 % 2;
                int i14112 = i13119 & 35;
                int i14113 = i14112 + ((i13119 ^ 35) | i14112);
                q = i14113 % 128;
                int i14114 = i14113 % 2;
                i2 = 1;
            } else {
                ArrayList<Roster> arrayList11 = this.bj;
                int size3 = arrayList11.size();
                int i14115 = ~size3;
                int i14116 = size3 << 1;
                int i14117 = arrayList11.get((i14115 ^ i14116) + ((i14116 & i14115) << 1)).roster_relational_id;
                int i14118 = i14117 & 1;
                i2 = (((i14117 | 1) & (~i14118)) - (~(-(-(i14118 << 1))))) - 1;
                int i14119 = q;
                int i15110 = i14119 & 59;
                i3 = i15110 + ((i14119 ^ 59) | i15110);
                p = i3 % 128;
                if (i3 % 2 == 0) {
                    int i15111 = 3 % 2;
                }
            }
            roster2.roster_relational_id = i2;
            roster2.rosterUniqueId = UUID.randomUUID().toString();
            roster2.start = this.bd;
            String strE5 = z.e();
            roster2.end = strE5;
            roster2.diff = ac.f(roster2.start, strE5);
        }
        if (!BISPApplication.f()) {
            String strE6 = BISPApplication.e();
            String[] strArrSplit5 = strE6.split(",");
            int i15112 = q + 73;
            p = i15112 % 128;
            int i15113 = i15112 % 2;
            roster2.latitude = strArrSplit5[0];
            String[] strArrSplit6 = strE6.split(",");
            int i15114 = q;
            int i15115 = i15114 & 43;
            int i15116 = (i15114 ^ 43) | i15115;
            int i15117 = (i15115 & i15116) + (i15116 | i15115);
            p = i15117 % 128;
            int i15118 = i15117 % 2;
            roster2.longitude = strArrSplit6[1];
            int i15119 = p;
            int i16110 = i15119 & 43;
            int i16111 = (((i15119 ^ 43) | i16110) << 1) - ((i15119 | 43) & (~i16110));
            q = i16111 % 128;
            int i16112 = i16111 % 2;
        }
        roster2.setValidatedFromNadra(this.bn.isValidatedFromNadra());
        intent = new Intent();
        if (this.aU) {
            int i16113 = p;
            int i16114 = (((i16113 | 72) << 1) - (i16113 ^ 72)) - 1;
            q = i16114 % 128;
            int i16115 = i16114 % 2;
            intent.putExtra("household_age", this.bm);
            int i16116 = p;
            int i16117 = i16116 & 79;
            int i16118 = ((i16116 ^ 79) | i16117) << 1;
            int i16119 = -((i16116 | 79) & (~i16117));
            i4 = (i16118 ^ i16119) + ((i16119 & i16118) << 1);
            q = i4 % 128;
            if (i4 % 2 == 0) {
                intent.putExtra("position", this.aV);
                obj.hashCode();
                throw null;
            }
            intent.putExtra("position", this.aV);
        }
        intent.putExtra("roster", roster2);
        setResult(-1, intent);
        int i1711 = p + 13;
        q = i1711 % 128;
        int i1712 = i1711 % 2;
        finish();
        if (this.checkBoxBispBenif.isChecked()) {
            int i181 = p;
            int i182 = i181 & 39;
            int i183 = i181 | 39;
            int i184 = ((i182 | i183) << 1) - (i183 ^ i182);
            q = i184 % 128;
            if (i184 % 2 != 0) {
                int i185 = 51 / 0;
            }
            str = "yes";
        } else {
            str = "no";
        }
        roster2.isBispBenif = str;
        if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICNotMade.getId()) {
            roster2.cnicOption = 0;
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICAbsent.getId()) {
            roster2.cnicOption = 1;
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.radioButtonCNICPresent.getId()) {
            int i718 = q;
            i = ((i718 | 105) << 1) - (((~i718) & 105) | (i718 & (-106)));
            p = i % 128;
            if (i % 2 == 0) {
                roster2.cnicOption = 5;
            } else {
                roster2.cnicOption = 2;
            }
            Roster roster9 = this.bn;
            String str5 = roster9.cnic;
            int i719 = q;
            int i7110 = i719 & 15;
            int i7111 = (i719 | 15) & (~i7110);
            int i81110 = i7110 << 1;
            int i81111 = (i7111 & i81110) + (i7111 | i81110);
            p = i81111 % 128;
            int i81112 = i81111 % 2;
            roster2.cnic = str5;
            roster2.cnicRepeat = roster9.cnicRepeat;
            int i81113 = p;
            int i81114 = (((i81113 & (-64)) | ((~i81113) & 63)) - (~((i81113 & 63) << 1))) - 1;
            q = i81114 % 128;
            int i81115 = i81114 % 2;
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_acc.getId()) {
            roster2.cnicOption = 3;
            roster2.cnic = j.m(this.por_roster);
        } else if (this.radioGroupCNICOptions.getCheckedRadioButtonId() == this.rb_afghani_por.getId()) {
            int i81116 = p;
            int i81117 = (i81116 & (-30)) | ((~i81116) & 29);
            int i81118 = (i81116 & 29) << 1;
            int i81119 = (i81117 & i81118) + (i81118 | i81117);
            q = i81119 % 128;
            int i91110 = i81119 % 2;
            roster2.cnicOption = 4;
            roster2.cnic = j.m(this.por_roster);
        }
        if (this.linearLayoutCNICPic.getVisibility() == 0) {
            int i91111 = p;
            int i91112 = i91111 ^ 45;
            i13 = (((i91111 & 45) | i91112) << 1) - i91112;
            q = i13 % 128;
            if (i13 % 2 == 0) {
                roster2.cnicArray = bArr2;
                j.w("cnic_");
                obj.hashCode();
                throw null;
            }
            roster2.cnicArray = bArr2;
            StringBuilder sbW4 = j.w("cnic_");
            int i91113 = q;
            int i91114 = (i91113 | 17) << 1;
            int i91115 = -(i91113 ^ 17);
            int i91116 = (i91114 & i91115) + (i91115 | i91114);
            p = i91116 % 128;
            int i91117 = i91116 % 2;
            sbW4.append(z.e());
            String string5 = sbW4.toString();
            int i91118 = q;
            int i91119 = i91118 & 91;
            int i101110 = i91118 | 91;
            int i101111 = (i91119 & i101110) + (i101110 | i91119);
            p = i101111 % 128;
            int i101112 = i101111 % 2;
            roster2.cnicPicName = string5;
        }
        bArr = this.bx;
        if (bArr != null) {
            roster2.bioImage = bArr;
        }
        if (this.sp_disability.getSelectedItemPosition() != 0) {
            arrayList5 = this.aN;
            selectedItemPosition3 = this.sp_disability.getSelectedItemPosition();
            int i101113 = p;
            i11 = ((i101113 & (-120)) | ((~i101113) & 119)) + ((i101113 & 119) << 1);
            q = i11 % 128;
            if (i11 % 2 == 0) {
                roster2.disability = arrayList5.get(selectedItemPosition3).getOptionId();
                throw null;
            }
            roster2.disability = arrayList5.get(selectedItemPosition3).getOptionId();
            int i101114 = q;
            int i101115 = (i101114 & (-50)) | ((~i101114) & 49);
            int i101116 = -(-((i101114 & 49) << 1));
            i12 = (i101115 & i101116) + (i101116 | i101115);
            p = i12 % 128;
            if (i12 % 2 != 0) {
                this.sp_disability.getSelectedItemPosition();
                throw null;
            }
            roster2.disability_name = this.aN.get(this.sp_disability.getSelectedItemPosition()).getOption();
            int i101117 = p + 23;
            q = i101117 % 128;
            int i101118 = i101117 % 2;
        }
        if (this.sp_chronic_disease.getSelectedItemPosition() != 0) {
            int i101119 = p;
            int i111110 = (i101119 & (-94)) | ((~i101119) & 93);
            int i111111 = (i101119 & 93) << 1;
            int i111112 = (i111110 ^ i111111) + ((i111111 & i111110) << 1);
            q = i111112 % 128;
            int i111113 = i111112 % 2;
            item = this.aM.get(this.sp_chronic_disease.getSelectedItemPosition());
            int i111114 = p;
            i10 = ((i111114 & 75) - (~(i111114 | 75))) - 1;
            q = i10 % 128;
            if (i10 % 2 != 0) {
                roster2.chronic_disease = item.getOptionId();
                arrayList4 = this.aM;
                selectedItemPosition2 = this.sp_chronic_disease.getSelectedItemPosition();
                int i111115 = 56 / 0;
            } else {
                roster2.chronic_disease = item.getOptionId();
                arrayList4 = this.aM;
                selectedItemPosition2 = this.sp_chronic_disease.getSelectedItemPosition();
            }
            roster2.chronic_disease_name = arrayList4.get(selectedItemPosition2).getOption();
        }
        if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_yes.getId()) {
            int i111116 = q + 75;
            p = i111116 % 128;
            int i111117 = i111116 % 2;
            roster2.language = 1;
        } else if (this.radioGroupLanguage.getCheckedRadioButtonId() == this.radioButtonLanguage_no.getId()) {
            int i111118 = p;
            int i111119 = (i111118 ^ 93) + ((i111118 & 93) << 1);
            q = i111119 % 128;
            int i121110 = i111119 % 2;
            roster2.language = 0;
            this.sp_attended_school.setSelection(1);
        }
        if (this.sp_attended_school.getSelectedItemPosition() != 0) {
            arrayList3 = this.aO;
            selectedItemPosition = this.sp_attended_school.getSelectedItemPosition();
            i9 = p + 43;
            q = i9 % 128;
            if (i9 % 2 == 0) {
                roster2.attended_school = arrayList3.get(selectedItemPosition).getOptionId();
                obj.hashCode();
                throw null;
            }
            roster2.attended_school = arrayList3.get(selectedItemPosition).getOptionId();
            roster2.attended_school_name = this.aO.get(this.sp_attended_school.getSelectedItemPosition()).getOption();
        }
        if (this.sp_highest_education.getVisibility() == 0) {
            roster2.higher_education = this.aP.get(this.sp_highest_education.getSelectedItemPosition()).getOptionId();
            arrayList2 = this.aP;
            int i121111 = q;
            int i121112 = i121111 & 103;
            int i121113 = -(-((i121111 ^ 103) | i121112));
            i8 = (i121112 & i121113) + (i121113 | i121112);
            p = i8 % 128;
            if (i8 % 2 != 0) {
                arrayList2.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
                obj.hashCode();
                throw null;
            }
            roster2.higher_education_name = arrayList2.get(this.sp_highest_education.getSelectedItemPosition()).getOption();
        }
        if (this.sp_work_activity.getVisibility() == 0) {
            Item item6 = this.aQ.get(this.sp_work_activity.getSelectedItemPosition());
            int i121114 = p;
            int i121115 = i121114 & 67;
            int i121116 = -(-((i121114 ^ 67) | i121115));
            int i121117 = ((i121115 | i121116) << 1) - (i121116 ^ i121115);
            q = i121117 % 128;
            int i121118 = i121117 % 2;
            roster2.work_activity = item6.getOptionId();
            roster2.work_activity_name = this.aQ.get(this.sp_work_activity.getSelectedItemPosition()).getOption();
        }
        if (this.sp_employment_status.getVisibility() == 0) {
            ArrayList<Item> arrayList12 = this.be;
            int selectedItemPosition7 = this.sp_employment_status.getSelectedItemPosition();
            int i121119 = p;
            int i131110 = ((i121119 ^ 19) | (i121119 & 19)) << 1;
            int i131111 = -(((~i121119) & 19) | (i121119 & (-20)));
            int i131112 = (i131110 ^ i131111) + ((i131111 & i131110) << 1);
            q = i131112 % 128;
            int i131113 = i131112 % 2;
            roster2.employment_status = arrayList12.get(selectedItemPosition7).getOptionId();
            roster2.employment_status_name = this.be.get(this.sp_employment_status.getSelectedItemPosition()).getOption();
        }
        if (this.et_hoursWorked.getVisibility() == 0) {
            int i131114 = p + 71;
            q = i131114 % 128;
            int i131115 = i131114 % 2;
            roster2.hours_worked = Double.parseDouble(this.et_hoursWorked.getText().toString());
        }
        roster2.age = this.br;
        if (this.aU) {
            roster = this.bj.get(this.aV);
            int i131116 = p;
            int i131117 = i131116 & 87;
            i5 = i131117 + ((i131116 ^ 87) | i131117);
            q = i5 % 128;
            if (i5 % 2 != 0) {
                roster2.roster_relational_id = roster.roster_relational_id;
                arrayList = this.bj;
                i6 = this.aV;
                int i131118 = 26 / 0;
            } else {
                roster2.roster_relational_id = roster.roster_relational_id;
                arrayList = this.bj;
                i6 = this.aV;
            }
            i7 = q + 103;
            p = i7 % 128;
            if (i7 % 2 != 0) {
                roster2.rosterUniqueId = arrayList.get(i6).rosterUniqueId;
                throw null;
            }
            roster2.rosterUniqueId = arrayList.get(i6).rosterUniqueId;
            Roster roster10 = this.bn;
            roster2.start = roster10.start;
            roster2.end = roster10.end;
            roster2.diff = roster10.diff;
        } else {
            if (this.bj.size() == 0) {
                int i131119 = p;
                int i141110 = i131119 + 73;
                q = i141110 % 128;
                int i141111 = i141110 % 2;
                int i141112 = i131119 & 35;
                int i141113 = i141112 + ((i131119 ^ 35) | i141112);
                q = i141113 % 128;
                int i141114 = i141113 % 2;
                i2 = 1;
            } else {
                ArrayList<Roster> arrayList13 = this.bj;
                int size4 = arrayList13.size();
                int i141115 = ~size4;
                int i141116 = size4 << 1;
                int i141117 = arrayList13.get((i141115 ^ i141116) + ((i141116 & i141115) << 1)).roster_relational_id;
                int i141118 = i141117 & 1;
                i2 = (((i141117 | 1) & (~i141118)) - (~(-(-(i141118 << 1))))) - 1;
                int i141119 = q;
                int i151110 = i141119 & 59;
                i3 = i151110 + ((i141119 ^ 59) | i151110);
                p = i3 % 128;
                if (i3 % 2 == 0) {
                    int i151111 = 3 % 2;
                }
            }
            roster2.roster_relational_id = i2;
            roster2.rosterUniqueId = UUID.randomUUID().toString();
            roster2.start = this.bd;
            String strE7 = z.e();
            roster2.end = strE7;
            roster2.diff = ac.f(roster2.start, strE7);
        }
        if (!BISPApplication.f()) {
            String strE8 = BISPApplication.e();
            String[] strArrSplit7 = strE8.split(",");
            int i151112 = q + 73;
            p = i151112 % 128;
            int i151113 = i151112 % 2;
            roster2.latitude = strArrSplit7[0];
            String[] strArrSplit8 = strE8.split(",");
            int i151114 = q;
            int i151115 = i151114 & 43;
            int i151116 = (i151114 ^ 43) | i151115;
            int i151117 = (i151115 & i151116) + (i151116 | i151115);
            p = i151117 % 128;
            int i151118 = i151117 % 2;
            roster2.longitude = strArrSplit8[1];
            int i151119 = p;
            int i161110 = i151119 & 43;
            int i161111 = (((i151119 ^ 43) | i161110) << 1) - ((i151119 | 43) & (~i161110));
            q = i161111 % 128;
            int i161112 = i161111 % 2;
        }
        roster2.setValidatedFromNadra(this.bn.isValidatedFromNadra());
        intent = new Intent();
        if (this.aU) {
            int i161113 = p;
            int i161114 = (((i161113 | 72) << 1) - (i161113 ^ 72)) - 1;
            q = i161114 % 128;
            int i161115 = i161114 % 2;
            intent.putExtra("household_age", this.bm);
            int i161116 = p;
            int i161117 = i161116 & 79;
            int i161118 = ((i161116 ^ 79) | i161117) << 1;
            int i161119 = -((i161116 | 79) & (~i161117));
            i4 = (i161118 ^ i161119) + ((i161119 & i161118) << 1);
            q = i4 % 128;
            if (i4 % 2 == 0) {
                intent.putExtra("position", this.aV);
                obj.hashCode();
                throw null;
            }
            intent.putExtra("position", this.aV);
        }
        intent.putExtra("roster", roster2);
        setResult(-1, intent);
        int i1713 = p + 13;
        q = i1713 % 128;
        int i1714 = i1713 % 2;
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:90:0x04c6  */
    public final void F() {
        String str;
        Spinner spinner;
        boolean z;
        int i;
        int i2;
        int optionId;
        String str2;
        Roster roster;
        int i3 = 2 % 2;
        this.et_MemberName.setText(this.bn.name_of_member);
        final int i4 = 1;
        this.et_MemberName.setEnabled(true);
        String strF = z.f();
        int i5 = p;
        int i6 = i5 ^ 73;
        int i7 = ((i5 & 73) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        q = i9 % 128;
        final int i10 = 0;
        if (i9 % 2 != 0) {
            String[] strArrSplit = strF.split("-");
            Integer.parseInt(strArrSplit[1]);
            Integer.parseInt(strArrSplit[1]);
            str = strArrSplit[4];
        } else {
            String[] strArrSplit2 = strF.split("-");
            Integer.parseInt(strArrSplit2[0]);
            Integer.parseInt(strArrSplit2[1]);
            str = strArrSplit2[2];
        }
        Integer.parseInt(str);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.networks)));
        this.aS = arrayList;
        Spinner spinner2 = this.sp_networks;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner2.setSelection(0);
        spinner2.setOnItemSelectedListener(new ae(this, spinner2));
        this.aR = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.banks)));
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this.ae, R.layout.spinner_item, this.aR);
        arrayAdapter2.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this.sp_banks.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.sp_banks.setOnItemSelectedListener(new X(this));
        if (this.bw.V == null || !this.aU) {
            new au(this, "relation_to_household_head", getResources().getString(R.string.relation_to_head), this.sp_relation_to_household, new Y(this)).execute(new Void[0]);
            int i11 = p;
            int i12 = i11 & 33;
            int i13 = ((i11 ^ 33) | i12) << 1;
            int i14 = -((i11 | 33) & (~i12));
            int i15 = (i13 & i14) + (i14 | i13);
            q = i15 % 128;
            int i16 = i15 % 2;
        } else {
            au auVar = new au(this, "relation_to_household_head", getResources().getString(R.string.relation_to_head), this.sp_relation_to_household, new C0210q(this));
            int i17 = q;
            int i18 = (((i17 & (-18)) | ((~i17) & 17)) - (~((i17 & 17) << 1))) - 1;
            p = i18 % 128;
            if (i18 % 2 == 0) {
                auVar.execute(new Void[0]);
            } else {
                auVar.execute(new Void[0]);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("Select Month");
        int i19 = 1;
        while (i19 < 12) {
            StringBuilder sb = new StringBuilder();
            sb.append(i19);
            arrayList2.add(sb.toString());
            int i20 = (i19 & 122) + (i19 | 122);
            i19 = (i20 & (-121)) + (i20 | (-121));
            int i21 = p;
            int i22 = i21 & 11;
            int i23 = ((i21 | 11) & (~i22)) + (i22 << 1);
            q = i23 % 128;
            int i24 = i23 % 2;
        }
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList2);
        int i25 = q;
        int i26 = (i25 & 33) + (i25 | 33);
        p = i26 % 128;
        if (i26 % 2 == 0) {
            this.spinnerMonth.setAdapter((SpinnerAdapter) arrayAdapter3);
            spinner = this.spinnerMonth;
            z = true;
        } else {
            this.spinnerMonth.setAdapter((SpinnerAdapter) arrayAdapter3);
            spinner = this.spinnerMonth;
            z = false;
        }
        spinner.setEnabled(z);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("Select Year");
        for (int i27 = 1; i27 < 116; i27 = ((i27 & 1) << 1) + (i27 ^ 1)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i27);
            arrayList3.add(sb2.toString());
        }
        this.spinnerYear.setAdapter((SpinnerAdapter) new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList3));
        this.spinnerYear.setEnabled(false);
        this.radioGroupCalendar.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bp.al
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ActivityRoster d;

            {
                this.d = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:100:0x03e3, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r2 = ((r15 | 31) << 1) - (r15 ^ 31);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x03f0, code lost:
            
                if ((r2 % 2) != 0) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x03f2, code lost:
            
                r0.J();
                r15 = 63 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x03f9, code lost:
            
                r0.J();
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x03fc, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 105;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0404, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0405, code lost:
            
                r3.getId();
                r6.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x040b, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x040c, code lost:
            
                r0.rb_afghani_acc.getId();
                r0.btn_vald_cnic.setVisibility(8);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r15 = (-2) - (((r15 ^ 2) + ((r15 & 2) << 1)) ^ (-1));
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x0426, code lost:
            
                if ((r15 % 2) == 0) goto L113;
             */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
            
                if (r15 != r0.radioButtonCalendarYes.getId()) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x0428, code lost:
            
                r0.buttonScanCNIC.setVisibility(79);
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x0432, code lost:
            
                if ((!ivas.gov.bisp.enumeration.p024ax.ax.c(r0)) == false) goto L116;
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x0435, code lost:
            
                r0.buttonScanCNIC.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:114:0x043e, code lost:
            
                if (ivas.gov.bisp.enumeration.p024ax.ax.c(r0) == true) goto L116;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x0441, code lost:
            
                r0.btn_vald_cnic.setEnabled(true);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = r15 & 49;
                r15 = -(-((r15 ^ 49) | r1));
                r2 = (r1 & r15) + (r15 | r1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x0458, code lost:
            
                r0.et_RosterCNIC.setVisibility(8);
                r0.et_RosterCNICRepeat.setVisibility(8);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 103;
                r1 = r1 + ((r15 ^ 103) | r1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x046f, code lost:
            
                if ((r1 % 2) == 0) goto L120;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x0471, code lost:
            
                r0.por_roster.setVisibility(1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 49;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x0477, code lost:
            
                r0.por_roster.setVisibility(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x047c, code lost:
            
                r0.buttonScanCNIC.setEnabled(false);
                r0.btn_bio_cnic.setEnabled(false);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r0 = r15 ^ 29;
                r15 = ((r15 & 29) | r0) << 1;
                r0 = -r0;
                r1 = (r15 ^ r0) + ((r15 & r0) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x0499, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 76;
                r0 = (r15 ^ (-1)) + (r15 << 1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x04a6, code lost:
            
                if ((r0 % 2) == 0) goto L129;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x04a8, code lost:
            
                r14 = 67 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x04ab, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x04ac, code lost:
            
                r0.rb_afghani_acc.getId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x04b1, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
            
                if ((r15 % 2) == 0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
            
                r0.tv_dob.setEnabled(true);
                r0.spinnerYear.setEnabled(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                r0.tv_dob.setEnabled(false);
                r0.spinnerYear.setEnabled(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
            
                r0.spinnerMonth.setEnabled(false);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a + 115;
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
            
                r0.tv_dob.setEnabled(false);
                r15 = r0.spinnerYear;
                r1 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r3 = ((r1 ^ 55) | (r1 & 55)) << 1;
                r1 = -(((~r1) & 55) | (r1 & (-56)));
                r2 = (r3 ^ r1) + ((r1 & r3) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
                r15.setEnabled(true);
                r0.spinnerMonth.setEnabled(true);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r0 = (r15 ^ 27) + ((r15 & 27) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
            
                if ((r0 % 2) != 0) goto L128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
            
                r14 = 44 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
            
                r0 = r13.d;
                r0.por_roster.setText(net.sqlcipher.BuildConfig.FLAVOR);
                r1 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r6 = ((r1 & (-42)) | ((~r1) & 41)) + ((r1 & 41) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
            
                if ((r6 % 2) != 0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
            
                r0.vald_txt_view_caption.setVisibility(105);
                r6 = r0.vald_txt_view;
                r9 = 15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
            
                r0.vald_txt_view_caption.setVisibility(8);
                r6 = r0.vald_txt_view;
                r9 = 8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
            
                r10 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r11 = (r10 ^ 95) + ((r10 & 95) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r11 % 128;
                r11 = r11 % 2;
                r6.setVisibility(r9);
                r0.vald_name_txt_view.setVisibility(8);
                r0.I();
                r6 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r9 = r6 ^ 15;
                r6 = ((r6 & 15) | r9) << 1;
                r9 = -r9;
                r10 = (r6 & r9) + (r6 | r9);
                ivas.gov.bisp.enumeration.p043bp.al.b = r10 % 128;
                r6 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
            
                if ((r10 % 2) == 0) goto L126;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
            
                if (r15 == r0.rb_afghani_acc.getId()) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
            
                r9 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r10 = r9 & 45;
                r9 = -(-(r9 | 45));
                r11 = (r10 & r9) + (r9 | r10);
                ivas.gov.bisp.enumeration.p043bp.al.b = r11 % 128;
                r11 = r11 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
            
                if (r15 == r0.rb_afghani_por.getId()) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0124, code lost:
            
                r3 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r9 = r3 & 115;
                r3 = (r3 | 115) & (~r9);
                r9 = r9 << 1;
                r10 = ((r3 | r9) << 1) - (r3 ^ r9);
                ivas.gov.bisp.enumeration.p043bp.al.b = r10 % 128;
                r10 = r10 % 2;
                r0.por_roster.setVisibility(8);
                r3 = r0.radioButtonCNICPresent;
                r9 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r10 = (((r9 & (-12)) | ((~r9) & 11)) - (~(-(-((r9 & 11) << 1))))) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.b = r10 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0153, code lost:
            
                if ((r10 % 2) == 0) goto L106;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0159, code lost:
            
                if (r15 != r3.getId()) goto L98;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x015b, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 21;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
                r15 = r15 % 2;
                r0.btn_vald_cnic.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x016d, code lost:
            
                if (ivas.gov.bisp.enumeration.p024ax.ax.c(r0) == false) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x016f, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = ((r15 & 114) + (r15 | 114)) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
                r0.btn_vald_cnic.setEnabled(true);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 31;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x018a, code lost:
            
                r0.et_RosterCNIC.setVisibility(0);
                r15 = r0.et_RosterCNICRepeat;
                r1 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r2 = (((r1 | 2) << 1) - (r1 ^ 2)) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
                r15.setVisibility(0);
                r0.buttonScanCNIC.setVisibility(8);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = ((r15 | 109) << 1) - (((~r15) & 109) | (r15 & (-110)));
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x01ba, code lost:
            
                if (r0.aT >= 3) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x01bc, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 49;
                r15 = -(-((r15 ^ 49) | r1));
                r2 = (r1 & r15) + (r15 | r1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x01ce, code lost:
            
                if ((r2 % 2) == 0) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x01d0, code lost:
            
                r0.btn_bio_cnic.setEnabled(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x01d6, code lost:
            
                r0.btn_bio_cnic.setEnabled(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x01db, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = (r15 & 45) + (r15 | 45);
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e8, code lost:
            
                r0.btn_bio_cnic.setEnabled(false);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a + 103;
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x01f6, code lost:
            
                r0.buttonScanCNIC.setEnabled(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
            
                if (r0.aU != false) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x01ff, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = r15 ^ 69;
                r15 = ((r15 & 69) | r1) << 1;
                r1 = -r1;
                r2 = ((r15 | r1) << 1) - (r15 ^ r1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
                r0.J();
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 97;
                r15 = (r15 ^ 97) | r1;
                r2 = (r1 ^ r15) + ((r15 & r1) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0226, code lost:
            
                ((android.view.inputmethod.InputMethodManager) r0.getSystemService("input_method")).showSoftInput(r0.et_RosterCNIC, 1);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = ((r15 & 99) - (~(r15 | 99))) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0241, code lost:
            
                if ((r1 % 2) != 0) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0243, code lost:
            
                r15 = r0.ac;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0245, code lost:
            
                if (r15 == 0) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0248, code lost:
            
                r15 = r0.ac;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x024a, code lost:
            
                if (r15 == 1) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x024c, code lost:
            
                if (r15 == 2) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x024e, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a + 123;
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0257, code lost:
            
                if ((r15 % 2) == 0) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x025b, code lost:
            
                if (ivas.gov.bisp.enumeration.bK.ag.d == false) goto L122;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x025e, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bK.ag.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0260, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0263, code lost:
            
                if (ivas.gov.bisp.enumeration.bK.ag.j != 1) goto L122;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0265, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a + 27;
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x026e, code lost:
            
                if ((r15 % 2) == 0) goto L96;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x0276, code lost:
            
                if (r0.br < 18.0d) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x0278, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r2 = r15 & 97;
                r1 = ((r15 ^ 97) | r2) << 1;
                r15 = -((r15 | 97) & (~r2));
                r2 = ((r1 | r15) << 1) - (r15 ^ r1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x0295, code lost:
            
                if (r0.et_RosterCNIC.length() != 15) goto L92;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0297, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = ((r15 | 43) << 1) - (r15 ^ 43);
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
                r15 = r0.radioGroupGender.getCheckedRadioButtonId();
                r1 = r0.radioButtonFemale;
                r2 = ivas.gov.bisp.enumeration.p043bp.al.b + 45;
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x02b9, code lost:
            
                if (r15 != r1.getId()) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x02bb, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = ((r15 ^ 113) - (~((r15 & 113) << 1))) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x02ca, code lost:
            
                if ((r1 % 2) == 0) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x02d2, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 0) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x02d4, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = (r15 & (-54)) | ((~r15) & 53);
                r15 = -(-((r15 & 53) << 1));
                r2 = (r1 & r15) + (r15 | r1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x02f0, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 1) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x02f2, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 57;
                r15 = -(-((r15 ^ 57) | r1));
                r2 = (r1 & r15) + (r15 | r1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
                r2 = r2 % 2;
                r0.checkBoxBispBenif.setVisibility(0);
                r0.aY = true;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r0 = ((r15 & 112) + (r15 | 112)) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.a = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0319, code lost:
            
                if ((r0 % 2) != 0) goto L83;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x031b, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x031c, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x031d, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 99;
                r0 = ((((r15 ^ 99) | r1) << 1) - (~(-((r15 | 99) & (~r1))))) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.a = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0339, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x033a, code lost:
            
                r0.sp_marital_status.getSelectedItemPosition();
                r6.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0342, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x0343, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r0 = (r15 ^ 121) + ((r15 & 121) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x0357, code lost:
            
                if ((r0 % 2) != 0) goto L91;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x0359, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x035a, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x035b, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r0 = r15 & 71;
                r15 = (r15 | 71) & (~r0);
                r0 = r0 << 1;
                r1 = (r15 & r0) + (r15 | r0);
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x0374, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x0375, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r15 = (-2) - (((r15 & 22) + (r15 | 22)) ^ (-1));
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x038c, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x038d, code lost:
            
                r14 = r0.br;
                r6.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x0392, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x0393, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r3 = r15 ^ 15;
                r15 = ((r15 & 15) | r3) << 1;
                r3 = -r3;
                r6 = ((r15 | r3) << 1) - (r15 ^ r3);
                ivas.gov.bisp.enumeration.p043bp.al.a = r6 % 128;
                r6 = r6 % 2;
                r0.et_RosterCNIC.setVisibility(8);
                r15 = r0.et_RosterCNICRepeat;
                r3 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r6 = r3 & 55;
                r2 = -(-(55 | r3));
                r3 = (r6 ^ r2) + ((r2 & r6) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r3 % 128;
                r3 = r3 % 2;
                r15.setVisibility(8);
                r0.buttonScanCNIC.setVisibility(8);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r2 = r15 ^ 73;
                r15 = (((r15 & 73) | r2) << 1) - r2;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
                r15 = r15 % 2;
                r0.btn_vald_cnic.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x03e1, code lost:
            
                if (r0.aU != false) goto L122;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
            
                r0 = r1 & 79;
                r0 = r0 + ((r1 ^ 79) | r0);
                r1 = r0 % 128;
                ivas.gov.bisp.enumeration.p043bp.al.a = r1;
                r0 = r0 % 2;
                r1 = r1 + 25;
                ivas.gov.bisp.enumeration.p043bp.al.b = r1 % 128;
                r1 = r1 % 2;
                r0 = r13.d;
             */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCheckedChanged(android.widget.RadioGroup r14, int r15) {
                /*
                    Method dump skipped, instruction units count: 1202
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p043bp.al.onCheckedChanged(android.widget.RadioGroup, int):void");
            }
        });
        this.rg_bank_info.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bp.W
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ActivityRoster d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0113  */
            /* JADX WARN: Code duplicated, block: B:38:0x0117  */
            /* JADX WARN: Code duplicated, block: B:40:0x0126  */
            /* JADX WARN: Code duplicated, block: B:43:0x0132  */
            /* JADX WARN: Code duplicated, block: B:45:0x013a  */
            /* JADX WARN: Code duplicated, block: B:47:0x0157  */
            /* JADX WARN: Code duplicated, block: B:49:0x0173  */
            /* JADX WARN: Code duplicated, block: B:51:0x0190  */
            /* JADX WARN: Code duplicated, block: B:53:0x01a3  */
            /* JADX WARN: Code duplicated, block: B:56:0x01af  */
            /* JADX WARN: Code duplicated, block: B:58:0x01b7  */
            /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
            /* JADX WARN: Code duplicated, block: B:62:0x01fe  */
            /* JADX WARN: Code duplicated, block: B:64:0x0221  */
            /* JADX WARN: Code duplicated, block: B:65:0x023e  */
            /* JADX WARN: Code duplicated, block: B:67:0x0255  */
            /* JADX WARN: Code duplicated, block: B:68:0x025b  */
            /* JADX WARN: Code duplicated, block: B:70:0x0267  */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0297, code lost:
            
                if (r0.br < 13.0d) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x029e, code lost:
            
                if (r0.br < 13.0d) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x02a0, code lost:
            
                r13 = ivas.gov.bisp.enumeration.p043bp.W.a;
                r1 = ((r13 | 109) << 1) - (r13 ^ 109);
                ivas.gov.bisp.enumeration.p043bp.W.b = r1 % 128;
                r1 = r1 % 2;
                r0.sp_marital_status.setVisibility(8);
                r13 = ivas.gov.bisp.enumeration.p043bp.W.a;
                r0 = ((r13 ^ 80) + ((r13 & 80) << 1)) - 1;
                ivas.gov.bisp.enumeration.p043bp.W.b = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x02c0, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x02c1, code lost:
            
                r0.sp_marital_status.setVisibility(0);
                r13 = ivas.gov.bisp.enumeration.p043bp.W.b + 59;
                ivas.gov.bisp.enumeration.p043bp.W.a = r13 % 128;
                r13 = r13 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x02cf, code lost:
            
                return;
             */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCheckedChanged(android.widget.RadioGroup r12, int r13) {
                /*
                    Method dump skipped, instruction units count: 832
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p043bp.W.onCheckedChanged(android.widget.RadioGroup, int):void");
            }
        });
        int i28 = p;
        int i29 = i28 & 39;
        int i30 = -(-((i28 ^ 39) | i29));
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        q = i31 % 128;
        int i32 = i31 % 2;
        int i33 = this.ac;
        if ((i33 == 1 || i33 == 2 || ag.d) && (!ag.g)) {
            if (this.bn.cnic_valid_name.equals(BuildConfig.FLAVOR)) {
                this.ll_nadra_name.setVisibility(8);
                int i34 = q;
                int i35 = (i34 & (-126)) | ((~i34) & 125);
                int i36 = (i34 & 125) << 1;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                p = i37 % 128;
                int i38 = i37 % 2;
            } else {
                this.ll_nadra_name.setVisibility(0);
                EditText editText = this.et_MemberName;
                int i39 = p;
                int i40 = i39 & 11;
                int i41 = -(-(i39 | 11));
                int i42 = (i40 & i41) + (i41 | i40);
                q = i42 % 128;
                int i43 = i42 % 2;
                editText.setText(this.bn.name_of_member);
                this.vald_name_txt_view.setText(this.bn.cnic_valid_name);
            }
            if (this.bn.date_of_birth.equals(BuildConfig.FLAVOR)) {
                this.radioGroupCalendar.setEnabled(true);
                this.radioButtonCalendarYes.setEnabled(true);
                this.radioButtonCalendarNo.setEnabled(true);
                this.spinnerYear.setEnabled(true);
                this.spinnerMonth.setEnabled(true);
                int i44 = p;
                int i45 = (i44 & 117) + (i44 | 117);
                q = i45 % 128;
                int i46 = i45 % 2;
            } else {
                this.tv_dob.setText(this.bn.date_of_birth);
                RadioGroup radioGroup = this.radioGroupCalendar;
                int i47 = q;
                int i48 = i47 & 31;
                int i49 = -(-(i47 | 31));
                int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                p = i50 % 128;
                int i51 = i50 % 2;
                radioGroup.setEnabled(false);
                this.radioButtonCalendarYes.setEnabled(false);
                this.radioButtonCalendarNo.setEnabled(false);
                this.spinnerYear.setEnabled(false);
                this.spinnerMonth.setEnabled(false);
                try {
                    Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this.tv_dob.getText().toString());
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(date.getTime());
                    this.br = G(calendar.get(5), calendar.get(2), calendar.get(1), true);
                    int i52 = q + 5;
                    p = i52 % 128;
                    if (i52 % 2 == 0) {
                        int i53 = 4 % 3;
                    }
                } catch (ParseException unused) {
                }
            }
            if (this.bn.gender.equalsIgnoreCase("male")) {
                this.radioButtonMale.setChecked(true);
                this.radioButtonFemale.setChecked(false);
                this.radioButtonTrans.setChecked(false);
                RadioGroup radioGroup2 = this.radioGroupGender;
                int i54 = p;
                int i55 = ((i54 ^ 53) | (i54 & 53)) << 1;
                int i56 = -(((~i54) & 53) | (i54 & (-54)));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                q = i57 % 128;
                if (i57 % 2 != 0) {
                    radioGroup2.setEnabled(false);
                    this.radioButtonTrans.setEnabled(true);
                } else {
                    radioGroup2.setEnabled(false);
                    this.radioButtonTrans.setEnabled(false);
                }
                this.radioButtonFemale.setEnabled(false);
                this.radioButtonMale.setEnabled(false);
            } else if (!(!this.bn.gender.equalsIgnoreCase("female"))) {
                int i58 = p;
                int i59 = i58 & 61;
                int i60 = (((i58 | 61) & (~i59)) - (~(-(-(i59 << 1))))) - 1;
                q = i60 % 128;
                int i61 = i60 % 2;
                this.radioButtonMale.setChecked(false);
                this.radioButtonFemale.setChecked(true);
                this.radioButtonTrans.setChecked(false);
                int i62 = p;
                int i63 = ((i62 & 62) + (i62 | 62)) - 1;
                q = i63 % 128;
                int i64 = i63 % 2;
                this.radioGroupGender.setEnabled(false);
                this.radioButtonTrans.setEnabled(false);
                this.radioButtonFemale.setEnabled(false);
                int i65 = p;
                int i66 = i65 ^ 27;
                int i67 = (i65 & 27) << 1;
                int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                q = i68 % 128;
                int i69 = i68 % 2;
                this.radioButtonMale.setEnabled(false);
                int i70 = p;
                int i71 = ((i70 | 101) << 1) - (i70 ^ 101);
                q = i71 % 128;
                if (i71 % 2 != 0) {
                    int i72 = 4 % 2;
                }
            } else if (!(!this.bn.gender.equalsIgnoreCase("transgender"))) {
                int i73 = p;
                int i74 = (((i73 ^ 111) | (i73 & 111)) << 1) - (((~i73) & 111) | (i73 & (-112)));
                q = i74 % 128;
                int i75 = i74 % 2;
                this.radioButtonMale.setChecked(false);
                this.radioButtonFemale.setChecked(false);
                this.radioButtonTrans.setChecked(true);
                int i76 = q;
                int i77 = i76 & 119;
                int i78 = i77 + ((i76 ^ 119) | i77);
                p = i78 % 128;
                if (i78 % 2 == 0) {
                    this.radioGroupGender.setEnabled(true);
                } else {
                    this.radioGroupGender.setEnabled(false);
                }
                this.radioButtonTrans.setEnabled(false);
                this.radioButtonFemale.setEnabled(false);
                int i79 = q;
                int i80 = (i79 ^ 15) + ((i79 & 15) << 1);
                p = i80 % 128;
                int i81 = i80 % 2;
                this.radioButtonMale.setEnabled(false);
            } else {
                this.radioGroupGender.setEnabled(true);
                this.radioButtonTrans.setEnabled(true);
                this.radioButtonFemale.setEnabled(true);
                this.radioButtonMale.setEnabled(true);
            }
            new au(this, "disability_status", getResources().getString(R.string.disablity_status), this.sp_disability, new Z(this)).execute(new Void[0]);
            Roster roster2 = this.bn;
            int i82 = q;
            int i83 = i82 & 97;
            int i84 = (((i82 | 97) & (~i83)) - (~(i83 << 1))) - 1;
            p = i84 % 128;
            int i85 = i84 % 2;
            int i86 = roster2.marital_status;
            if (i86 == 200 || i86 == 201) {
                new au(this, "marital_status", getResources().getString(R.string.marital_status), this.sp_marital_status, new K(this)).execute(new Void[0]);
            } else {
                int i87 = p;
                int i88 = ((i87 | 111) << 1) - (i87 ^ 111);
                q = i88 % 128;
                if (i88 % 2 == 0 ? i86 == 202 : i86 == 7617) {
                    new au(this, "marital_status", getResources().getString(R.string.marital_status), this.sp_marital_status, new K(this)).execute(new Void[0]);
                } else {
                    int i89 = i87 & 25;
                    int i90 = i89 + ((i87 ^ 25) | i89);
                    q = i90 % 128;
                    if (i90 % 2 == 0 ? i86 == 203 : i86 == 2352) {
                        new au(this, "marital_status", getResources().getString(R.string.marital_status), this.sp_marital_status, new K(this)).execute(new Void[0]);
                    } else {
                        this.sp_marital_status.setEnabled(true);
                        int i91 = q;
                        int i92 = ((i91 ^ 124) + ((i91 & 124) << 1)) - 1;
                        p = i92 % 128;
                        if (i92 % 2 == 0) {
                            int i93 = 5 / 5;
                        }
                    }
                }
            }
            if (!this.bn.cnic.equals(BuildConfig.FLAVOR)) {
                String str3 = this.bn.cnic;
                EditText editText2 = this.et_RosterCNIC;
                int i94 = q;
                int i95 = ((((i94 ^ 93) | (i94 & 93)) << 1) - (~(-(((~i94) & 93) | (i94 & (-94)))))) - 1;
                p = i95 % 128;
                int i96 = i95 % 2;
                editText2.setText(str3);
                this.et_RosterCNICRepeat.setText(str3);
            }
            this.sp_relation_to_household.setSelection(0);
            this.linearLayoutCNIC.setVisibility(0);
            int i97 = q;
            int i98 = (i97 & 11) + (i97 | 11);
            p = i98 % 128;
            if (i98 % 2 == 0) {
                this.et_MemberName.setEnabled(true);
            } else {
                this.et_MemberName.setEnabled(false);
            }
            this.sp_relation_to_household.setEnabled(true);
        }
        ArrayList<Item> arrayList4 = this.bw.R;
        if (arrayList4 == null) {
            new au(this, "marital_status", getResources().getString(R.string.marital_status), this.sp_marital_status, new aa(this)).execute(new Void[0]);
        } else {
            this.aI = arrayList4;
            E(arrayList4, this.sp_marital_status);
            if (this.aU) {
                int i99 = 0;
                while (i99 < this.aI.size() && this.aI.get(i99).getOptionId() != this.bn.marital_status) {
                    int i100 = p;
                    int i101 = i100 ^ 67;
                    int i102 = (((i100 & 67) | i101) << 1) - i101;
                    q = i102 % 128;
                    if (i102 % 2 != 0) {
                        int i103 = i99 & 87;
                        i = ((i99 ^ 87) | i103) << 1;
                        i2 = (i99 | 87) & (~i103);
                    } else {
                        int i104 = (-2) - ((i99 - 119) ^ (-1));
                        i = i104 & 121;
                        i2 = -((i104 ^ 121) | i);
                    }
                    int i105 = -i2;
                    i99 = (i105 | i) + (i & i105);
                }
            }
        }
        ArrayList<Item> arrayList5 = this.bw.Q;
        Object obj = null;
        if (arrayList5 == null) {
            new au(this, "having_chronic_disease", getResources().getString(R.string.chronic_disease), this.sp_chronic_disease, new ab(this)).execute(new Void[0]);
        } else {
            this.aM = arrayList5;
            E(arrayList5, this.sp_chronic_disease);
            if (this.aU) {
                int i106 = p;
                int i107 = i106 & 31;
                int i108 = ((((i106 ^ 31) | i107) << 1) - (~(-((i106 | 31) & (~i107))))) - 1;
                q = i108 % 128;
                if (i108 % 2 != 0) {
                    int i109 = 5 % 2;
                }
                int i110 = 0;
                while (i110 < this.aM.size()) {
                    int i111 = p;
                    int i112 = (i111 & 1) + (i111 | 1);
                    q = i112 % 128;
                    if (i112 % 2 != 0) {
                        this.aM.get(i110).getOptionId();
                        throw null;
                    }
                    if (this.aM.get(i110).getOptionId() == this.bn.chronic_disease) {
                        break;
                    }
                    int i113 = q;
                    int i114 = (i113 & 43) + (i113 | 43);
                    p = i114 % 128;
                    if (i114 % 2 == 0) {
                        int i115 = i110 & 39;
                        int i116 = (((i110 ^ 39) | i115) << 1) - ((i110 | 39) & (~i115));
                        int i117 = i116 & (-38);
                        int i118 = (i116 | (-38)) & (~i117);
                        int i119 = i117 << 1;
                        i110 = ((i119 & i118) << 1) + (i118 ^ i119);
                    } else {
                        int i120 = i110 + 60;
                        int i121 = i120 & (-59);
                        i110 = (((i120 ^ (-59)) | i121) << 1) - ((i120 | (-59)) & (~i121));
                    }
                }
            }
        }
        ArrayList<Item> arrayList6 = this.bw.P;
        if (arrayList6 != null) {
            this.aO = arrayList6;
            E(arrayList6, this.sp_attended_school);
            this.sp_attended_school.setOnItemSelectedListener(this.bg);
            if (this.aU) {
                int i122 = q + 15;
                p = i122 % 128;
                int i123 = i122 % 2;
                int i124 = 0;
                while (i124 < this.aO.size()) {
                    int optionId2 = this.aO.get(i124).getOptionId();
                    int i125 = q;
                    int i126 = (((i125 | 106) << 1) - (i125 ^ 106)) - 1;
                    p = i126 % 128;
                    int i127 = i126 % 2;
                    if (optionId2 == this.bn.attended_school) {
                        break;
                    }
                    int i128 = p;
                    int i129 = ((i128 ^ 33) | (i128 & 33)) << 1;
                    int i130 = -(((~i128) & 33) | (i128 & (-34)));
                    int i131 = (i129 & i130) + (i130 | i129);
                    q = i131 % 128;
                    int i132 = i131 % 2;
                    int i133 = i124 - 10;
                    i124 = ((i133 | 11) << 1) - (i133 ^ 11);
                }
            }
        } else {
            au auVar2 = new au(this, "gone_to_school", getResources().getString(R.string.attended_school), this.sp_attended_school, new U(this));
            int i134 = p;
            int i135 = i134 & 61;
            int i136 = (i134 ^ 61) | i135;
            int i137 = (i135 & i136) + (i136 | i135);
            q = i137 % 128;
            int i138 = i137 % 2;
            auVar2.execute(new Void[0]);
        }
        ArrayList<Item> arrayList7 = this.bw.L;
        if (arrayList7 == null) {
            new au(this, "highest_completed_education", getResources().getString(R.string.education_level), this.sp_highest_education, new E(this)).execute(new Void[0]);
            int i139 = q;
            int i140 = i139 & 3;
            int i141 = (((i139 ^ 3) | i140) << 1) - ((i139 | 3) & (~i140));
            p = i141 % 128;
            int i142 = i141 % 2;
        } else {
            this.aP = arrayList7;
            E(arrayList7, this.sp_highest_education);
            if (this.aU) {
                int i143 = 0;
                while (i143 < this.aP.size()) {
                    int optionId3 = this.aP.get(i143).getOptionId();
                    int i144 = p;
                    int i145 = i144 & 13;
                    int i146 = (i144 ^ 13) | i145;
                    int i147 = (i145 & i146) + (i146 | i145);
                    q = i147 % 128;
                    int i148 = i147 % 2;
                    if (optionId3 == this.bn.higher_education) {
                        int i149 = q;
                        int i150 = i149 ^ 43;
                        int i151 = (i149 & 43) << 1;
                        int i152 = (i150 ^ i151) + ((i151 & i150) << 1);
                        p = i152 % 128;
                        int i153 = i152 % 2;
                        this.sp_highest_education.setSelection(i143);
                        break;
                    }
                    int i154 = i143 & 1;
                    int i155 = (i143 ^ 1) | i154;
                    i143 = ((i154 | i155) << 1) - (i155 ^ i154);
                }
            }
        }
        ArrayList<Item> arrayList8 = this.bw.M;
        if (arrayList8 == null) {
            au auVar3 = new au(this, "employment_status", getResources().getString(R.string.employment_status), this.sp_employment_status, new ai(this));
            int i156 = p;
            int i157 = i156 & 99;
            int i158 = (i156 | 99) & (~i157);
            int i159 = i157 << 1;
            int i160 = (i158 & i159) + (i158 | i159);
            q = i160 % 128;
            int i161 = i160 % 2;
            auVar3.execute(new Void[0]);
        } else {
            this.be = arrayList8;
            E(arrayList8, this.sp_employment_status);
            int i162 = p;
            int i163 = i162 ^ 117;
            int i164 = (((i162 & 117) | i163) << 1) - i163;
            q = i164 % 128;
            if (i164 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this.aU) {
                int i165 = 0;
                while (true) {
                    if (i165 >= this.be.size()) {
                        i165 = 0;
                        break;
                    }
                    int i166 = q;
                    int i167 = (i166 ^ 113) + ((i166 & 113) << 1);
                    p = i167 % 128;
                    if (i167 % 2 == 0) {
                        optionId = this.be.get(i165).getOptionId();
                        int i168 = 47 / 0;
                    } else {
                        optionId = this.be.get(i165).getOptionId();
                    }
                    if (optionId == this.bn.employment_status) {
                        break;
                    }
                    int i169 = (i165 & (-22)) | ((~i165) & 21);
                    int i170 = -(-((i165 & 21) << 1));
                    int i171 = ((i169 | i170) << 1) - (i170 ^ i169);
                    int i172 = i171 & (-20);
                    int i173 = -(-((i171 ^ (-20)) | i172));
                    i165 = (i172 | i173) + (i172 & i173);
                }
                this.sp_employment_status.setSelection(i165);
            }
        }
        if (this.aU) {
            int i174 = p;
            int i175 = ((i174 ^ 6) + ((i174 & 6) << 1)) - 1;
            q = i175 % 128;
            int i176 = i175 % 2;
            int i177 = 0;
            while (true) {
                if (i177 >= this.aS.size()) {
                    int i178 = q + 49;
                    p = i178 % 128;
                    int i179 = i178 % 2;
                    i177 = 0;
                    break;
                }
                int i180 = q;
                int i181 = i180 & 123;
                int i182 = (i181 - (~(-(-((i180 ^ 123) | i181))))) - 1;
                p = i182 % 128;
                if (i182 % 2 == 0) {
                    str2 = this.aS.get(i177);
                    roster = this.bn;
                    int i183 = 59 / 0;
                } else {
                    str2 = this.aS.get(i177);
                    roster = this.bn;
                }
                int i184 = q;
                int i185 = i184 & 75;
                int i186 = i184 | 75;
                int i187 = ((i185 | i186) << 1) - (i186 ^ i185);
                p = i187 % 128;
                int i188 = i187 % 2;
                if (str2.equals(roster.mobile_network_name)) {
                    break;
                }
                int i189 = p;
                int i190 = i189 + 29;
                q = i190 % 128;
                if (i190 % 2 != 0) {
                    i177 = (i177 & 104) + (i177 | 104);
                } else {
                    int i191 = i177 + 103;
                    int i192 = (i191 ^ (-1)) + (i191 << 1);
                    i177 = (-2) - ((((i192 | (-100)) << 1) - (i192 ^ (-100))) ^ (-1));
                }
                int i193 = ((i189 & (-56)) | ((~i189) & 55)) + ((i189 & 55) << 1);
                q = i193 % 128;
                if (i193 % 2 != 0) {
                    int i194 = 3 % 2;
                }
            }
            this.sp_networks.setSelection(i177);
        }
        if (!(!this.aU)) {
            int i195 = p;
            int i196 = ((i195 | 37) << 1) - (i195 ^ 37);
            q = i196 % 128;
            int i197 = i196 % 2;
            int i198 = 0;
            while (true) {
                if (i198 >= this.aR.size()) {
                    int i199 = q;
                    int i200 = i199 & 63;
                    int i201 = -(-(i199 | 63));
                    int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
                    p = i202 % 128;
                    int i203 = i202 % 2;
                    i198 = 0;
                    break;
                }
                int i204 = q;
                int i205 = (i204 & 75) + (i204 | 75);
                p = i205 % 128;
                int i206 = i205 % 2;
                if (this.aR.get(i198).equals(this.bn.banks_name)) {
                    break;
                }
                int i207 = q;
                int i208 = i207 & 47;
                int i209 = -(-((i207 ^ 47) | i208));
                int i210 = (i208 ^ i209) + ((i209 & i208) << 1);
                p = i210 % 128;
                if (i210 % 2 == 0) {
                    i198 = (((i198 | 104) << 1) - (~(-(((~i198) & 104) | (i198 & (-105)))))) - 45;
                } else {
                    int i211 = i198 & 111;
                    int i212 = -(-((i198 ^ 111) | i211));
                    int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                    int i214 = i213 & (-110);
                    i198 = i214 + ((i213 ^ (-110)) | i214);
                }
            }
            this.sp_banks.setSelection(i198);
        }
        ac.m(new Spinner[]{this.sp_disability, this.sp_chronic_disease, this.sp_employment_status}, new o[]{null, null, null});
        EditText editText3 = this.et_RosterCNIC;
        editText3.addTextChangedListener(new o0O0O00(editText3));
        EditText editText4 = this.et_RosterCNICRepeat;
        editText4.addTextChangedListener(new o0O0O00(editText4));
        EditText editText5 = this.por_roster;
        editText5.addTextChangedListener(new oo0o0Oo(editText5));
        this.sp_highest_education.setOnItemSelectedListener(new o0OOO0o());
        this.radioGroupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bp.W
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ActivityRoster d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0113  */
            /* JADX WARN: Code duplicated, block: B:38:0x0117  */
            /* JADX WARN: Code duplicated, block: B:40:0x0126  */
            /* JADX WARN: Code duplicated, block: B:43:0x0132  */
            /* JADX WARN: Code duplicated, block: B:45:0x013a  */
            /* JADX WARN: Code duplicated, block: B:47:0x0157  */
            /* JADX WARN: Code duplicated, block: B:49:0x0173  */
            /* JADX WARN: Code duplicated, block: B:51:0x0190  */
            /* JADX WARN: Code duplicated, block: B:53:0x01a3  */
            /* JADX WARN: Code duplicated, block: B:56:0x01af  */
            /* JADX WARN: Code duplicated, block: B:58:0x01b7  */
            /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
            /* JADX WARN: Code duplicated, block: B:62:0x01fe  */
            /* JADX WARN: Code duplicated, block: B:64:0x0221  */
            /* JADX WARN: Code duplicated, block: B:65:0x023e  */
            /* JADX WARN: Code duplicated, block: B:67:0x0255  */
            /* JADX WARN: Code duplicated, block: B:68:0x025b  */
            /* JADX WARN: Code duplicated, block: B:70:0x0267  */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0297, code lost:
            
                if (r0.br < 13.0d) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x029e, code lost:
            
                if (r0.br < 13.0d) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x02a0, code lost:
            
                r13 = ivas.gov.bisp.enumeration.p043bp.W.a;
                r1 = ((r13 | 109) << 1) - (r13 ^ 109);
                ivas.gov.bisp.enumeration.p043bp.W.b = r1 % 128;
                r1 = r1 % 2;
                r0.sp_marital_status.setVisibility(8);
                r13 = ivas.gov.bisp.enumeration.p043bp.W.a;
                r0 = ((r13 ^ 80) + ((r13 & 80) << 1)) - 1;
                ivas.gov.bisp.enumeration.p043bp.W.b = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x02c0, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x02c1, code lost:
            
                r0.sp_marital_status.setVisibility(0);
                r13 = ivas.gov.bisp.enumeration.p043bp.W.b + 59;
                ivas.gov.bisp.enumeration.p043bp.W.a = r13 % 128;
                r13 = r13 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x02cf, code lost:
            
                return;
             */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCheckedChanged(android.widget.RadioGroup r12, int r13) {
                /*
                    Method dump skipped, instruction units count: 832
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p043bp.W.onCheckedChanged(android.widget.RadioGroup, int):void");
            }
        });
        this.radioGroupLanguage.setOnCheckedChangeListener(new OooO00o());
        RadioGroup radioGroup3 = this.radioGroupCNICOptions;
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener(this) { // from class: ivas.gov.bisp.enumeration.bp.al
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ActivityRoster d;

            {
                this.d = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:100:0x03e3, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r2 = ((r15 | 31) << 1) - (r15 ^ 31);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x03f0, code lost:
            
                if ((r2 % 2) != 0) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x03f2, code lost:
            
                r0.J();
                r15 = 63 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x03f9, code lost:
            
                r0.J();
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x03fc, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 105;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0404, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0405, code lost:
            
                r3.getId();
                r6.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x040b, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x040c, code lost:
            
                r0.rb_afghani_acc.getId();
                r0.btn_vald_cnic.setVisibility(8);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r15 = (-2) - (((r15 ^ 2) + ((r15 & 2) << 1)) ^ (-1));
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x0426, code lost:
            
                if ((r15 % 2) == 0) goto L113;
             */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
            
                if (r15 != r0.radioButtonCalendarYes.getId()) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x0428, code lost:
            
                r0.buttonScanCNIC.setVisibility(79);
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x0432, code lost:
            
                if ((!ivas.gov.bisp.enumeration.p024ax.ax.c(r0)) == false) goto L116;
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x0435, code lost:
            
                r0.buttonScanCNIC.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:114:0x043e, code lost:
            
                if (ivas.gov.bisp.enumeration.p024ax.ax.c(r0) == true) goto L116;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x0441, code lost:
            
                r0.btn_vald_cnic.setEnabled(true);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = r15 & 49;
                r15 = -(-((r15 ^ 49) | r1));
                r2 = (r1 & r15) + (r15 | r1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x0458, code lost:
            
                r0.et_RosterCNIC.setVisibility(8);
                r0.et_RosterCNICRepeat.setVisibility(8);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 103;
                r1 = r1 + ((r15 ^ 103) | r1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x046f, code lost:
            
                if ((r1 % 2) == 0) goto L120;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x0471, code lost:
            
                r0.por_roster.setVisibility(1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 49;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x0477, code lost:
            
                r0.por_roster.setVisibility(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x047c, code lost:
            
                r0.buttonScanCNIC.setEnabled(false);
                r0.btn_bio_cnic.setEnabled(false);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r0 = r15 ^ 29;
                r15 = ((r15 & 29) | r0) << 1;
                r0 = -r0;
                r1 = (r15 ^ r0) + ((r15 & r0) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x0499, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 76;
                r0 = (r15 ^ (-1)) + (r15 << 1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x04a6, code lost:
            
                if ((r0 % 2) == 0) goto L129;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x04a8, code lost:
            
                r14 = 67 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x04ab, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x04ac, code lost:
            
                r0.rb_afghani_acc.getId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x04b1, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
            
                if ((r15 % 2) == 0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
            
                r0.tv_dob.setEnabled(true);
                r0.spinnerYear.setEnabled(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                r0.tv_dob.setEnabled(false);
                r0.spinnerYear.setEnabled(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
            
                r0.spinnerMonth.setEnabled(false);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a + 115;
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
            
                r0.tv_dob.setEnabled(false);
                r15 = r0.spinnerYear;
                r1 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r3 = ((r1 ^ 55) | (r1 & 55)) << 1;
                r1 = -(((~r1) & 55) | (r1 & (-56)));
                r2 = (r3 ^ r1) + ((r1 & r3) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
                r15.setEnabled(true);
                r0.spinnerMonth.setEnabled(true);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r0 = (r15 ^ 27) + ((r15 & 27) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
            
                if ((r0 % 2) != 0) goto L128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
            
                r14 = 44 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
            
                r0 = r13.d;
                r0.por_roster.setText(net.sqlcipher.BuildConfig.FLAVOR);
                r1 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r6 = ((r1 & (-42)) | ((~r1) & 41)) + ((r1 & 41) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
            
                if ((r6 % 2) != 0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
            
                r0.vald_txt_view_caption.setVisibility(105);
                r6 = r0.vald_txt_view;
                r9 = 15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
            
                r0.vald_txt_view_caption.setVisibility(8);
                r6 = r0.vald_txt_view;
                r9 = 8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
            
                r10 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r11 = (r10 ^ 95) + ((r10 & 95) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r11 % 128;
                r11 = r11 % 2;
                r6.setVisibility(r9);
                r0.vald_name_txt_view.setVisibility(8);
                r0.I();
                r6 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r9 = r6 ^ 15;
                r6 = ((r6 & 15) | r9) << 1;
                r9 = -r9;
                r10 = (r6 & r9) + (r6 | r9);
                ivas.gov.bisp.enumeration.p043bp.al.b = r10 % 128;
                r6 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
            
                if ((r10 % 2) == 0) goto L126;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
            
                if (r15 == r0.rb_afghani_acc.getId()) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
            
                r9 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r10 = r9 & 45;
                r9 = -(-(r9 | 45));
                r11 = (r10 & r9) + (r9 | r10);
                ivas.gov.bisp.enumeration.p043bp.al.b = r11 % 128;
                r11 = r11 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
            
                if (r15 == r0.rb_afghani_por.getId()) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0124, code lost:
            
                r3 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r9 = r3 & 115;
                r3 = (r3 | 115) & (~r9);
                r9 = r9 << 1;
                r10 = ((r3 | r9) << 1) - (r3 ^ r9);
                ivas.gov.bisp.enumeration.p043bp.al.b = r10 % 128;
                r10 = r10 % 2;
                r0.por_roster.setVisibility(8);
                r3 = r0.radioButtonCNICPresent;
                r9 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r10 = (((r9 & (-12)) | ((~r9) & 11)) - (~(-(-((r9 & 11) << 1))))) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.b = r10 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0153, code lost:
            
                if ((r10 % 2) == 0) goto L106;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0159, code lost:
            
                if (r15 != r3.getId()) goto L98;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x015b, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 21;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
                r15 = r15 % 2;
                r0.btn_vald_cnic.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x016d, code lost:
            
                if (ivas.gov.bisp.enumeration.p024ax.ax.c(r0) == false) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x016f, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = ((r15 & 114) + (r15 | 114)) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
                r0.btn_vald_cnic.setEnabled(true);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b + 31;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x018a, code lost:
            
                r0.et_RosterCNIC.setVisibility(0);
                r15 = r0.et_RosterCNICRepeat;
                r1 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r2 = (((r1 | 2) << 1) - (r1 ^ 2)) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
                r15.setVisibility(0);
                r0.buttonScanCNIC.setVisibility(8);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = ((r15 | 109) << 1) - (((~r15) & 109) | (r15 & (-110)));
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x01ba, code lost:
            
                if (r0.aT >= 3) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x01bc, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 49;
                r15 = -(-((r15 ^ 49) | r1));
                r2 = (r1 & r15) + (r15 | r1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x01ce, code lost:
            
                if ((r2 % 2) == 0) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x01d0, code lost:
            
                r0.btn_bio_cnic.setEnabled(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x01d6, code lost:
            
                r0.btn_bio_cnic.setEnabled(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x01db, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = (r15 & 45) + (r15 | 45);
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x01e8, code lost:
            
                r0.btn_bio_cnic.setEnabled(false);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a + 103;
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x01f6, code lost:
            
                r0.buttonScanCNIC.setEnabled(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
            
                if (r0.aU != false) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x01ff, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = r15 ^ 69;
                r15 = ((r15 & 69) | r1) << 1;
                r1 = -r1;
                r2 = ((r15 | r1) << 1) - (r15 ^ r1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
                r0.J();
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 97;
                r15 = (r15 ^ 97) | r1;
                r2 = (r1 ^ r15) + ((r15 & r1) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0226, code lost:
            
                ((android.view.inputmethod.InputMethodManager) r0.getSystemService("input_method")).showSoftInput(r0.et_RosterCNIC, 1);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = ((r15 & 99) - (~(r15 | 99))) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0241, code lost:
            
                if ((r1 % 2) != 0) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0243, code lost:
            
                r15 = r0.ac;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0245, code lost:
            
                if (r15 == 0) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0248, code lost:
            
                r15 = r0.ac;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x024a, code lost:
            
                if (r15 == 1) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x024c, code lost:
            
                if (r15 == 2) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x024e, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a + 123;
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0257, code lost:
            
                if ((r15 % 2) == 0) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x025b, code lost:
            
                if (ivas.gov.bisp.enumeration.bK.ag.d == false) goto L122;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x025e, code lost:
            
                r14 = ivas.gov.bisp.enumeration.bK.ag.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0260, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0263, code lost:
            
                if (ivas.gov.bisp.enumeration.bK.ag.j != 1) goto L122;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0265, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a + 27;
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x026e, code lost:
            
                if ((r15 % 2) == 0) goto L96;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x0276, code lost:
            
                if (r0.br < 18.0d) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x0278, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r2 = r15 & 97;
                r1 = ((r15 ^ 97) | r2) << 1;
                r15 = -((r15 | 97) & (~r2));
                r2 = ((r1 | r15) << 1) - (r15 ^ r1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x0295, code lost:
            
                if (r0.et_RosterCNIC.length() != 15) goto L92;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0297, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = ((r15 | 43) << 1) - (r15 ^ 43);
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
                r15 = r0.radioGroupGender.getCheckedRadioButtonId();
                r1 = r0.radioButtonFemale;
                r2 = ivas.gov.bisp.enumeration.p043bp.al.b + 45;
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x02b9, code lost:
            
                if (r15 != r1.getId()) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x02bb, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = ((r15 ^ 113) - (~((r15 & 113) << 1))) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x02ca, code lost:
            
                if ((r1 % 2) == 0) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x02d2, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 0) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x02d4, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r1 = (r15 & (-54)) | ((~r15) & 53);
                r15 = -(-((r15 & 53) << 1));
                r2 = (r1 & r15) + (r15 | r1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x02f0, code lost:
            
                if (r0.sp_marital_status.getSelectedItemPosition() == 1) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x02f2, code lost:
            
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 57;
                r15 = -(-((r15 ^ 57) | r1));
                r2 = (r1 & r15) + (r15 | r1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r2 % 128;
                r2 = r2 % 2;
                r0.checkBoxBispBenif.setVisibility(0);
                r0.aY = true;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r0 = ((r15 & 112) + (r15 | 112)) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.a = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0319, code lost:
            
                if ((r0 % 2) != 0) goto L83;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x031b, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x031c, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x031d, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r1 = r15 & 99;
                r0 = ((((r15 ^ 99) | r1) << 1) - (~(-((r15 | 99) & (~r1))))) - 1;
                ivas.gov.bisp.enumeration.p043bp.al.a = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0339, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x033a, code lost:
            
                r0.sp_marital_status.getSelectedItemPosition();
                r6.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0342, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x0343, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r0 = (r15 ^ 121) + ((r15 & 121) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.a = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x0357, code lost:
            
                if ((r0 % 2) != 0) goto L91;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x0359, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x035a, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x035b, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r0 = r15 & 71;
                r15 = (r15 | 71) & (~r0);
                r0 = r0 << 1;
                r1 = (r15 & r0) + (r15 | r0);
                ivas.gov.bisp.enumeration.p043bp.al.a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x0374, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x0375, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r15 = (-2) - (((r15 & 22) + (r15 | 22)) ^ (-1));
                ivas.gov.bisp.enumeration.p043bp.al.b = r15 % 128;
                r15 = r15 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x038c, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x038d, code lost:
            
                r14 = r0.br;
                r6.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x0392, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x0393, code lost:
            
                r0.checkBoxBispBenif.setVisibility(8);
                r0.aY = false;
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r3 = r15 ^ 15;
                r15 = ((r15 & 15) | r3) << 1;
                r3 = -r3;
                r6 = ((r15 | r3) << 1) - (r15 ^ r3);
                ivas.gov.bisp.enumeration.p043bp.al.a = r6 % 128;
                r6 = r6 % 2;
                r0.et_RosterCNIC.setVisibility(8);
                r15 = r0.et_RosterCNICRepeat;
                r3 = ivas.gov.bisp.enumeration.p043bp.al.a;
                r6 = r3 & 55;
                r2 = -(-(55 | r3));
                r3 = (r6 ^ r2) + ((r2 & r6) << 1);
                ivas.gov.bisp.enumeration.p043bp.al.b = r3 % 128;
                r3 = r3 % 2;
                r15.setVisibility(8);
                r0.buttonScanCNIC.setVisibility(8);
                r15 = ivas.gov.bisp.enumeration.p043bp.al.b;
                r2 = r15 ^ 73;
                r15 = (((r15 & 73) | r2) << 1) - r2;
                ivas.gov.bisp.enumeration.p043bp.al.a = r15 % 128;
                r15 = r15 % 2;
                r0.btn_vald_cnic.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x03e1, code lost:
            
                if (r0.aU != false) goto L122;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
            
                r0 = r1 & 79;
                r0 = r0 + ((r1 ^ 79) | r0);
                r1 = r0 % 128;
                ivas.gov.bisp.enumeration.p043bp.al.a = r1;
                r0 = r0 % 2;
                r1 = r1 + 25;
                ivas.gov.bisp.enumeration.p043bp.al.b = r1 % 128;
                r1 = r1 % 2;
                r0 = r13.d;
             */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCheckedChanged(android.widget.RadioGroup r14, int r15) {
                /*
                    Method dump skipped, instruction units count: 1202
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p043bp.al.onCheckedChanged(android.widget.RadioGroup, int):void");
            }
        };
        int i215 = p + 91;
        q = i215 % 128;
        int i216 = i215 % 2;
        radioGroup3.setOnCheckedChangeListener(onCheckedChangeListener);
        this.spinnerYear.setOnItemSelectedListener(this.bk);
        this.spinnerMonth.setOnItemSelectedListener(this.bl);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x068c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0697 A[DONT_INVERT, PHI: r0
  0x0697: PHI (r0v342 int) = (r0v244 int), (r0v346 int) binds: [B:144:0x068a, B:141:0x0683] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:147:0x0699  */
    /* JADX WARN: Code duplicated, block: B:165:0x0743 A[PHI: r0
  0x0743: PHI (r0v261 double) = (r0v260 double), (r0v330 double) binds: [B:164:0x0741, B:161:0x0738] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:176:0x078c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0794  */
    /* JADX WARN: Code duplicated, block: B:19:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0414  */
    /* JADX WARN: Code duplicated, block: B:88:0x041a  */
    public void O() throws ParseException {
        RadioButton radioButton;
        boolean z;
        au auVar;
        int i;
        EditText editText;
        String str;
        int i2;
        double d;
        int i3;
        int i4;
        int i5 = 2 % 2;
        this.tv_dob.setText(this.bn.date_of_birth);
        this.et_MemberName.setText(this.bn.name_of_member);
        int intExtra = getIntent().getIntExtra("rosterPosition", -1);
        this.aV = intExtra;
        Object obj = null;
        if (intExtra != -1) {
            this.btn_bio_cnic.setVisibility(0);
            try {
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this.tv_dob.getText().toString());
                Calendar calendar = Calendar.getInstance();
                int i6 = p;
                int i7 = i6 | 3;
                int i8 = i7 << 1;
                int i9 = -((~(i6 & 3)) & i7);
                int i10 = (i8 & i9) + (i9 | i8);
                q = i10 % 128;
                int i11 = i10 % 2;
                calendar.setTimeInMillis(date.getTime());
                int i12 = calendar.get(1);
                int i13 = p;
                int i14 = ((i13 ^ 89) | (i13 & 89)) << 1;
                int i15 = -(((~i13) & 89) | (i13 & (-90)));
                int i16 = (i14 & i15) + (i15 | i14);
                q = i16 % 128;
                if (i16 % 2 != 0) {
                    i3 = calendar.get(2);
                    i4 = calendar.get(3);
                } else {
                    i3 = calendar.get(2);
                    i4 = calendar.get(5);
                }
                this.br = G(i4, i3, i12, true);
            } catch (ParseException unused) {
            }
            M(this.bn.age);
            this.radioGroupCalendar.check(R.id.rb_calendar_yes);
            if (this.bn.age >= 4.0d) {
                int i17 = p;
                int i18 = i17 ^ 91;
                int i19 = (i17 & 91) << 1;
                int i20 = (i18 & i19) + (i19 | i18);
                q = i20 % 128;
                int i21 = i20 % 2;
                this.sp_attended_school.setVisibility(0);
                int i22 = this.bn.attended_school;
                if (i22 == 0) {
                    this.sp_attended_school.setVisibility(8);
                    this.sp_highest_education.setVisibility(8);
                } else if (i22 != 25) {
                    this.sp_highest_education.setVisibility(0);
                }
            } else {
                this.sp_attended_school.setVisibility(8);
                this.sp_highest_education.setVisibility(8);
            }
            this.tv_dob.setText(this.bn.date_of_birth);
            int i23 = p;
            int i24 = i23 & 39;
            int i25 = (i23 ^ 39) | i24;
            int i26 = (i24 & i25) + (i25 | i24);
            q = i26 % 128;
            if (i26 % 2 != 0) {
                this.et_mobile_number.setText(this.bn.mobile_no);
                obj.hashCode();
                throw null;
            }
            this.et_mobile_number.setText(this.bn.mobile_no);
            Roster roster = this.bn;
            this.bq = roster.date_of_birth_var;
            int i27 = q;
            int i28 = i27 & 93;
            int i29 = (((i27 ^ 93) | i28) << 1) - ((i27 | 93) & (~i28));
            p = i29 % 128;
            int i30 = i29 % 2;
            if (roster.cnic_valid_name.equals(BuildConfig.FLAVOR)) {
                this.ll_nadra_name.setVisibility(8);
                int i31 = q - (-1);
                p = i31 % 128;
                int i32 = i31 % 2;
            } else {
                this.ll_nadra_name.setVisibility(0);
                this.et_MemberName.setText(this.bn.name_of_member);
                TextView textView = this.vald_name_txt_view;
                String str2 = this.bn.cnic_valid_name;
                int i33 = q;
                int i34 = (i33 & 10) + (i33 | 10);
                int i35 = (i34 ^ (-1)) + (i34 << 1);
                p = i35 % 128;
                if (i35 % 2 == 0) {
                    textView.setText(str2);
                    obj.hashCode();
                    throw null;
                }
                textView.setText(str2);
            }
            String str3 = this.bn.cnic_valid_english_name;
            if (str3 != null && !str3.equals(BuildConfig.FLAVOR) && !this.bn.cnic_valid_english_name.equals("null")) {
                Roster roster2 = this.bn;
                String str4 = roster2.cnic_valid_english_name;
                roster2.name_of_member = str4;
                this.et_MemberName.setText(str4);
                this.et_MemberName.setEnabled(false);
                this.et_MemberName.setFocusable(false);
            }
            if (!this.bn.date_of_birth.equals(BuildConfig.FLAVOR)) {
                int i36 = p;
                int i37 = (i36 | 71) << 1;
                int i38 = -((71 & (~i36)) | (i36 & (-72)));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                q = i39 % 128;
                int i40 = i39 % 2;
                this.tv_dob.setText(this.bn.date_of_birth);
                this.radioGroupCalendar.setEnabled(false);
                this.radioButtonCalendarYes.setEnabled(false);
                this.radioButtonCalendarNo.setEnabled(false);
                this.spinnerYear.setEnabled(false);
                Spinner spinner = this.spinnerMonth;
                int i41 = q;
                int i42 = (i41 & (-32)) | ((~i41) & 31);
                int i43 = (i41 & 31) << 1;
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                p = i44 % 128;
                if (i44 % 2 == 0) {
                    spinner.setEnabled(false);
                } else {
                    spinner.setEnabled(false);
                }
                try {
                    Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(this.tv_dob.getText().toString());
                    int i45 = p;
                    int i46 = i45 & 99;
                    int i47 = (i45 ^ 99) | i46;
                    int i48 = (i46 & i47) + (i47 | i46);
                    q = i48 % 128;
                    int i49 = i48 % 2;
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(date2.getTime());
                    int i50 = calendar2.get(1);
                    int i51 = q;
                    int i52 = ((i51 ^ 7) | (i51 & 7)) << 1;
                    int i53 = -((7 & (~i51)) | (i51 & (-8)));
                    int i54 = (i52 & i53) + (i53 | i52);
                    p = i54 % 128;
                    int i55 = i54 % 2;
                    this.br = G(calendar2.get(5), calendar2.get(2), i50, true);
                    int i56 = q;
                    int i57 = i56 ^ 71;
                    int i58 = (((i56 & 71) | i57) << 1) - i57;
                    p = i58 % 128;
                    int i59 = i58 % 2;
                } catch (ParseException unused2) {
                }
            } else {
                this.radioGroupCalendar.setEnabled(true);
                this.radioButtonCalendarYes.setEnabled(true);
                this.radioButtonCalendarNo.setEnabled(true);
                Spinner spinner2 = this.spinnerYear;
                int i60 = q;
                int i61 = ((i60 ^ 98) + ((i60 & 98) << 1)) - 1;
                p = i61 % 128;
                int i62 = i61 % 2;
                spinner2.setEnabled(true);
                this.spinnerMonth.setEnabled(true);
            }
            if (this.bn.gender.equalsIgnoreCase("male")) {
                this.radioButtonMale.setChecked(true);
                this.radioButtonFemale.setChecked(false);
                this.radioButtonTrans.setChecked(false);
                int i63 = q;
                int i64 = (((i63 | 43) << 1) - (~(-(((~i63) & 43) | (i63 & (-44)))))) - 1;
                p = i64 % 128;
                int i65 = i64 % 2;
                this.radioGroupGender.setEnabled(false);
                this.radioButtonTrans.setEnabled(false);
                this.radioButtonFemale.setEnabled(false);
                this.radioButtonMale.setEnabled(false);
            } else if (this.bn.gender.equalsIgnoreCase("female")) {
                int i66 = p;
                int i67 = i66 & 69;
                int i68 = i67 + ((i66 ^ 69) | i67);
                q = i68 % 128;
                if (i68 % 2 != 0) {
                    this.radioButtonMale.setChecked(true);
                    this.radioButtonFemale.setChecked(false);
                } else {
                    this.radioButtonMale.setChecked(false);
                    this.radioButtonFemale.setChecked(true);
                }
                this.radioButtonTrans.setChecked(false);
                this.radioGroupGender.setEnabled(false);
                int i69 = q;
                int i70 = (i69 ^ 69) + ((i69 & 69) << 1);
                p = i70 % 128;
                if (i70 % 2 == 0) {
                    this.radioButtonTrans.setEnabled(true);
                } else {
                    this.radioButtonTrans.setEnabled(false);
                }
                this.radioButtonFemale.setEnabled(false);
                this.radioButtonMale.setEnabled(false);
            } else if (!(!this.bn.gender.equalsIgnoreCase("transgender"))) {
                this.radioButtonMale.setChecked(false);
                this.radioButtonFemale.setChecked(false);
                int i71 = p;
                int i72 = i71 ^ 9;
                int i73 = (i71 & 9) << 1;
                int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                q = i74 % 128;
                int i75 = i74 % 2;
                this.radioButtonTrans.setChecked(true);
                this.radioGroupGender.setEnabled(false);
                this.radioButtonTrans.setEnabled(false);
                this.radioButtonFemale.setEnabled(false);
                this.radioButtonMale.setEnabled(false);
                int i76 = q;
                int i77 = ((i76 ^ 2) + ((i76 & 2) << 1)) - 1;
                p = i77 % 128;
                int i78 = i77 % 2;
            } else {
                this.radioGroupGender.setEnabled(true);
                this.radioButtonTrans.setEnabled(true);
                this.radioButtonFemale.setEnabled(true);
                int i79 = p;
                int i80 = i79 & 73;
                int i81 = ((i79 ^ 73) | i80) << 1;
                int i82 = -((i79 | 73) & (~i80));
                int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                q = i83 % 128;
                int i84 = i83 % 2;
                this.radioButtonMale.setEnabled(true);
            }
            int i85 = this.bn.marital_status;
            if (i85 != 200) {
                int i86 = p;
                int i87 = i86 & 21;
                int i88 = i86 | 21;
                int i89 = (i87 & i88) + (i88 | i87);
                int i90 = i89 % 128;
                q = i90;
                if (i89 % 2 == 0 ? i85 == 201 : i85 == 13024) {
                    auVar = new au(this, "marital_status", getResources().getString(R.string.marital_status), this.sp_marital_status, new o00Oo0());
                    i = p + 119;
                    q = i % 128;
                    if (i % 2 != 0) {
                        auVar.execute(new Void[1]);
                    } else {
                        auVar.execute(new Void[0]);
                    }
                } else {
                    int i91 = i90 & 105;
                    int i92 = i91 + ((i90 ^ 105) | i91);
                    p = i92 % 128;
                    int i93 = i92 % 2;
                    if (i85 == 202 || i85 == 203) {
                        auVar = new au(this, "marital_status", getResources().getString(R.string.marital_status), this.sp_marital_status, new o00Oo0());
                        i = p + 119;
                        q = i % 128;
                        if (i % 2 != 0) {
                            auVar.execute(new Void[1]);
                        } else {
                            auVar.execute(new Void[0]);
                        }
                    } else {
                        this.sp_marital_status.setEnabled(true);
                    }
                }
            } else {
                auVar = new au(this, "marital_status", getResources().getString(R.string.marital_status), this.sp_marital_status, new o00Oo0());
                i = p + 119;
                q = i % 128;
                if (i % 2 != 0) {
                    auVar.execute(new Void[1]);
                } else {
                    auVar.execute(new Void[0]);
                }
            }
            new au(this, "disability_status", getResources().getString(R.string.disablity_status), this.sp_disability, new o00Ooo()).execute(new Void[0]);
            int i94 = q;
            int i95 = ((i94 | 50) << 1) - (i94 ^ 50);
            int i96 = (i95 ^ (-1)) + (i95 << 1);
            p = i96 % 128;
            if (i96 % 2 == 0) {
                this.bn.cnic.equals(BuildConfig.FLAVOR);
                obj.hashCode();
                throw null;
            }
            if (!this.bn.cnic.equals(BuildConfig.FLAVOR)) {
                String strB = ag.b(this.bn.cnic);
                this.et_RosterCNIC.setText(strB);
                this.et_RosterCNICRepeat.setText(strB);
            }
            if (this.aL != null) {
                int i97 = 0;
                while (true) {
                    if (i97 >= this.aL.size()) {
                        i97 = 0;
                        break;
                    }
                    if (this.aL.get(i97).getOptionId() == this.bn.relation_to_household_id) {
                        break;
                    }
                    i97 = ((i97 & 2) + (i97 | 2)) - 1;
                    int i98 = p;
                    int i99 = (i98 & 20) + (i98 | 20);
                    int i100 = (i99 ^ (-1)) + (i99 << 1);
                    q = i100 % 128;
                    int i101 = i100 % 2;
                }
                this.sp_relation_to_household.setSelection(i97);
            }
            this.checkBoxBispBenif.setChecked(this.bn.isBispBenif.equals("yes"));
            Roster roster3 = this.bn;
            int i102 = roster3.cnicOption;
            if (i102 == 0) {
                this.radioButtonCNICNotMade.setChecked(true);
            } else if (i102 == 1) {
                this.radioButtonCNICAbsent.setChecked(true);
            } else if (i102 == 2) {
                this.et_RosterCNIC.setText(roster3.cnic);
                this.et_RosterCNICRepeat.setText(this.bn.cnicRepeat);
                this.radioButtonCNICPresent.setChecked(true);
                this.bs = this.bn.cnic_valid.booleanValue();
                int i103 = p;
                int i104 = i103 ^ 79;
                int i105 = -(-((i103 & 79) << 1));
                int i106 = (i104 & i105) + (i105 | i104);
                q = i106 % 128;
                int i107 = i106 % 2;
            } else if (i102 == 3) {
                this.rb_afghani_acc.setChecked(true);
                this.por_roster.setVisibility(0);
                this.btn_vald_cnic.setVisibility(8);
                this.buttonScanCNIC.setVisibility(8);
                this.por_roster.setText(this.bn.cnic);
                int i108 = q;
                int i109 = (i108 & 1) + (i108 | 1);
                p = i109 % 128;
                if (i109 % 2 == 0) {
                    this.aJ = this.bn.cnic_valid.booleanValue();
                    obj.hashCode();
                    throw null;
                }
                this.aJ = this.bn.cnic_valid.booleanValue();
                if (!(!ax.c(this))) {
                    this.btn_vald_cnic.setEnabled(true);
                }
                this.et_RosterCNIC.setVisibility(8);
                this.et_RosterCNICRepeat.setVisibility(8);
                this.buttonScanCNIC.setEnabled(false);
                this.btn_bio_cnic.setEnabled(false);
            } else if (i102 == 4) {
                int i110 = q;
                int i111 = ((i110 ^ 75) | (i110 & 75)) << 1;
                int i112 = -(((~i110) & 75) | (i110 & (-76)));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                p = i113 % 128;
                int i114 = i113 % 2;
                this.rb_afghani_por.setChecked(true);
                this.por_roster.setVisibility(0);
                this.btn_vald_cnic.setVisibility(8);
                Button button = this.buttonScanCNIC;
                int i115 = p;
                int i116 = (i115 ^ 35) + ((i115 & 35) << 1);
                q = i116 % 128;
                if (i116 % 2 != 0) {
                    button.setVisibility(8);
                    editText = this.por_roster;
                    str = this.bn.cnic;
                    int i117 = 72 / 0;
                } else {
                    button.setVisibility(8);
                    editText = this.por_roster;
                    str = this.bn.cnic;
                }
                editText.setText(str);
                boolean zBooleanValue = this.bn.cnic_valid.booleanValue();
                int i118 = p;
                int i119 = i118 & 73;
                int i120 = (i118 | 73) & (~i119);
                int i121 = i119 << 1;
                int i122 = (i120 & i121) + (i120 | i121);
                q = i122 % 128;
                if (i122 % 2 != 0) {
                    this.aJ = zBooleanValue;
                    ax.c(this);
                    obj.hashCode();
                    throw null;
                }
                this.aJ = zBooleanValue;
                if (ax.c(this)) {
                    this.btn_vald_cnic.setEnabled(true);
                }
                this.et_RosterCNIC.setVisibility(8);
                EditText editText2 = this.et_RosterCNICRepeat;
                int i123 = q;
                int i124 = (i123 ^ 105) + ((i123 & 105) << 1);
                p = i124 % 128;
                int i125 = i124 % 2;
                editText2.setVisibility(8);
                this.buttonScanCNIC.setEnabled(false);
                Button button2 = this.btn_bio_cnic;
                int i126 = p;
                int i127 = (i126 ^ 94) + ((i126 & 94) << 1);
                int i128 = (i127 ^ (-1)) + (i127 << 1);
                q = i128 % 128;
                if (i128 % 2 != 0) {
                    button2.setEnabled(false);
                } else {
                    button2.setEnabled(false);
                }
            }
            this.et_RosterBForm.setText(this.bn.bform);
            this.et_RosterBFormRepeat.setText(this.bn.bformRepeat);
            au auVar2 = new au(this, "having_chronic_disease", getResources().getString(R.string.chronic_disease), this.sp_chronic_disease, new oo000o());
            int i129 = p + 69;
            q = i129 % 128;
            int i130 = i129 % 2;
            auVar2.execute(new Void[0]);
            int i131 = p;
            int i132 = i131 ^ 87;
            int i133 = ((((i131 & 87) | i132) << 1) - (~(-i132))) - 1;
            q = i133 % 128;
            if (i133 % 2 != 0) {
                i2 = this.bn.language;
                int i134 = 39 / 0;
                if (i2 == 0) {
                    this.radioButtonLanguage_no.setChecked(true);
                    this.radioButtonLanguage_yes.setChecked(false);
                } else if (i2 == 1) {
                    this.radioButtonLanguage_no.setChecked(false);
                    this.radioButtonLanguage_yes.setChecked(true);
                }
            } else {
                i2 = this.bn.language;
                if (i2 == 0) {
                    this.radioButtonLanguage_no.setChecked(true);
                    this.radioButtonLanguage_yes.setChecked(false);
                } else if (i2 == 1) {
                    this.radioButtonLanguage_no.setChecked(false);
                    this.radioButtonLanguage_yes.setChecked(true);
                }
            }
            if (this.sp_attended_school.getVisibility() == 0) {
                int i135 = p;
                int i136 = (i135 ^ 93) + ((i135 & 93) << 1);
                q = i136 % 128;
                int i137 = i136 % 2;
                int i138 = 0;
                while (true) {
                    if (i138 >= this.aO.size()) {
                        i138 = 0;
                        break;
                    }
                    int i139 = q;
                    int i140 = (i139 & (-4)) | ((~i139) & 3);
                    int i141 = -(-((i139 & 3) << 1));
                    int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
                    p = i142 % 128;
                    int i143 = i142 % 2;
                    if (this.aO.get(i138).getOptionId() == this.bn.attended_school) {
                        break;
                    }
                    int i144 = i138 & 1;
                    i138 = ((i138 ^ 1) | i144) + i144;
                }
                this.sp_attended_school.setSelection(i138);
            }
            au auVar3 = new au(this, "work_status", getResources().getString(R.string.work_Activity), this.sp_work_activity, new o00oO0o());
            int i145 = p;
            int i146 = i145 & 73;
            int i147 = i146 + ((i145 ^ 73) | i146);
            q = i147 % 128;
            int i148 = i147 % 2;
            auVar3.execute(new Void[0]);
            int i149 = q + 73;
            p = i149 % 128;
            if (i149 % 2 == 0) {
                d = this.bn.hours_worked;
                if (d != 1.0d) {
                    this.et_hoursWorked.setText(String.valueOf((int) d));
                }
            } else {
                d = this.bn.hours_worked;
                if (d != 0.0d) {
                    this.et_hoursWorked.setText(String.valueOf((int) d));
                }
            }
            new au(this, "employment_status", getResources().getString(R.string.employment_status), this.sp_employment_status, new o0ooOOo()).execute(new Void[0]);
            int i150 = this.ac;
            if (i150 != 1 && i150 != 2) {
                int i151 = p + 91;
                q = i151 % 128;
                if (i151 % 2 != 0) {
                    boolean z2 = ag.d;
                    throw null;
                }
                if (ag.d) {
                    if (this.bn.relation_to_household_id == 186) {
                        int i152 = q;
                        int i153 = ((i152 & (-26)) | ((~i152) & 25)) + ((i152 & 25) << 1);
                        p = i153 % 128;
                        int i154 = i153 % 2;
                        this.et_MemberName.setEnabled(true);
                        this.sp_relation_to_household.setEnabled(true);
                    }
                }
            } else if (this.bn.relation_to_household_id == 186) {
                int i155 = q;
                int i156 = ((i155 & (-26)) | ((~i155) & 25)) + ((i155 & 25) << 1);
                p = i156 % 128;
                int i157 = i156 % 2;
                this.et_MemberName.setEnabled(true);
                this.sp_relation_to_household.setEnabled(true);
            }
            this.spinnerYear.setEnabled(false);
            this.spinnerMonth.setEnabled(false);
            int i158 = q;
            int i159 = i158 & 71;
            int i160 = (((i158 | 71) & (~i159)) - (~(i159 << 1))) - 1;
            p = i160 % 128;
            int i161 = i160 % 2;
            this.spinnerMonth.setSelection(this.bn.age_month, false);
            this.spinnerYear.setSelection(this.bn.age_year, false);
            if (this.radioGroupCalendar.getCheckedRadioButtonId() == this.radioButtonCalendarNo.getId()) {
                this.spinnerYear.setEnabled(true);
                this.spinnerMonth.setEnabled(true);
            }
            Roster roster4 = this.bn;
            this.bG = roster4.cnic_valid_name;
            this.bH = roster4.cnic_valid_father_Name;
            String str5 = roster4.cnic_valid_dob;
            int i162 = q;
            int i163 = (i162 ^ 61) + ((i162 & 61) << 1);
            p = i163 % 128;
            if (i163 % 2 == 0) {
                this.bI = str5;
                this.bD = roster4.cnic_valid_gender;
                int i164 = 9 / 0;
            } else {
                this.bI = str5;
                this.bD = roster4.cnic_valid_gender;
            }
            this.bE = roster4.cnic_valid_current_address;
            this.bC = roster4.cnic_valid_permanent_address;
            this.bK = roster4.cnic_valid_identification_mark;
            this.bB = roster4.cnic_valid_religion;
            if (roster4.cnic_valid.booleanValue()) {
                int i165 = q;
                int i166 = i165 & 1;
                int i167 = -(-(i165 | 1));
                int i168 = ((i166 | i167) << 1) - (i167 ^ i166);
                int i169 = i168 % 128;
                p = i169;
                int i170 = i168 % 2;
                if (this.br != 0.0d) {
                    int i171 = ((i169 | 103) << 1) - (i169 ^ 103);
                    q = i171 % 128;
                    int i172 = i171 % 2;
                    int i173 = 0;
                    while (i173 < this.radioGroupGender.getChildCount()) {
                        i173 = j.i(this.radioGroupGender, i173, false, i173, 1);
                    }
                    int i174 = 0;
                    while (i174 < this.radioGroupCalendar.getChildCount()) {
                        int i175 = p;
                        int i176 = ((i175 ^ 37) | (i175 & 37)) << 1;
                        int i177 = -(((~i175) & 37) | (i175 & (-38)));
                        int i178 = (i176 ^ i177) + ((i177 & i176) << 1);
                        q = i178 % 128;
                        int i179 = i178 % 2;
                        i174 = j.i(this.radioGroupCalendar, i174, false, i174, 1);
                    }
                }
                this.radioButtonCalendarYes.setChecked(true);
                this.tv_dob.setEnabled(false);
                int i180 = q;
                int i181 = i180 ^ 101;
                int i182 = ((i180 & 101) | i181) << 1;
                int i183 = -i181;
                int i184 = ((i182 | i183) << 1) - (i182 ^ i183);
                p = i184 % 128;
                int i185 = i184 % 2;
                this.spinnerYear.setEnabled(false);
                this.spinnerMonth.setEnabled(false);
                int i186 = q;
                int i187 = i186 ^ 5;
                int i188 = ((((i186 & 5) | i187) << 1) - (~(-i187))) - 1;
                p = i188 % 128;
                int i189 = i188 % 2;
                this.bb = true;
            }
        }
        if (this.aU) {
            if (this.bn.banks_name.equals(BuildConfig.FLAVOR)) {
                this.ll_bank_info.setVisibility(8);
                RadioButton radioButton2 = this.rb_yes_bank;
                int i190 = p + 89;
                q = i190 % 128;
                if (i190 % 2 != 0) {
                    radioButton2.setChecked(false);
                    this.rb_no_bank.setChecked(false);
                } else {
                    radioButton2.setChecked(false);
                    this.rb_no_bank.setChecked(true);
                }
            } else {
                int i191 = q;
                int i192 = i191 & 111;
                int i193 = -(-((i191 ^ 111) | i192));
                int i194 = (i192 ^ i193) + ((i193 & i192) << 1);
                p = i194 % 128;
                if (i194 % 2 == 0) {
                    this.ll_bank_info.setVisibility(0);
                    radioButton = this.rb_yes_bank;
                    z = false;
                } else {
                    this.ll_bank_info.setVisibility(0);
                    radioButton = this.rb_yes_bank;
                    z = true;
                }
                radioButton.setChecked(z);
                this.rb_no_bank.setChecked(false);
                if (!this.bn.bank_address.equals(BuildConfig.FLAVOR)) {
                    EditText editText3 = this.et_easypaisa_number;
                    String str6 = this.bn.bank_address;
                    int i195 = p;
                    int i196 = ((i195 & 106) + (i195 | 106)) - 1;
                    q = i196 % 128;
                    int i197 = i196 % 2;
                    editText3.setText(str6);
                }
                if (!this.bn.account_title.equals(BuildConfig.FLAVOR)) {
                    this.et_account_title.setText(this.bn.account_title);
                }
                if (!this.bn.account_number.equals(BuildConfig.FLAVOR)) {
                    this.et_account_number.setText(this.bn.account_number);
                    return;
                }
            }
        }
        int i198 = q;
        int i199 = i198 | 101;
        int i200 = i199 << 1;
        int i201 = -((~(i198 & 101)) & i199);
        int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
        p = i202 % 128;
        if (i202 % 2 == 0) {
            throw null;
        }
    }
}
