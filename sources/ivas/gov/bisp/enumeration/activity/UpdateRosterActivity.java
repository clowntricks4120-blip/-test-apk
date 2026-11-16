package ivas.gov.bisp.enumeration.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.BaseActivity;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdatePhoneNoActivity;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateRosterListActivity;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.CitizenData;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p036bi.aK;
import ivas.gov.bisp.enumeration.p036bi.aO;
import ivas.gov.bisp.enumeration.p036bi.aP;
import ivas.gov.bisp.enumeration.p036bi.aQ;
import ivas.gov.bisp.enumeration.p036bi.aR;
import ivas.gov.bisp.enumeration.p036bi.aT;
import ivas.gov.bisp.enumeration.p036bi.aX;
import ivas.gov.bisp.enumeration.p036bi.aY;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0217y;
import ivas.gov.bisp.enumeration.p043bp.am;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.h;
import o.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateRosterActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final /* synthetic */ int af = 0;
    private static int c$s65$2282 = 937766423;
    private static boolean e$s68$2282 = true;
    private static int p = 1;
    private static int q;
    public TextView aA;
    public RadioButton aB;
    public Spinner aD;
    public Spinner aE;
    public TextView aF;
    public RadioGroup aG;
    public RadioButton aH;
    public RadioButton aI;
    public Spinner aJ;
    public RadioButton aK;
    public Spinner aL;
    public Spinner aM;
    public Spinner aN;
    public Spinner aO;
    public TextView aP;
    public TextView aQ;
    public EditText aR;
    public EditText aS;
    public LinearLayout aT;
    public EditText aU;
    public Spinner aV;
    public ArrayList<String> aW;
    public ArrayList<Item> aX;
    public ArrayList<Item> aY;
    public ArrayList<Item> aZ;
    public BISPApplication ag;
    public int ah;
    public boolean ai;
    public long aj;
    public int ak;
    public int al;
    public Button am;
    public RadioButton an;
    public EditText ao;
    public EditText ap;
    public Button aq;
    public EditText ar;
    public EditText as;
    public EditText at;
    public Spinner au;
    public RadioGroup av;
    public RadioButton aw;
    public RadioButton ax;
    public RadioGroup ay;
    public CheckBox az;
    public String bA;
    public String bB;
    public String bC;
    public Boolean bD;
    public String bE;
    public ArrayList<Item> ba;
    public int bb;
    public ArrayList<String> bc;
    public ArrayList<Item> bd;
    public RosterItem be;
    public SessionManager bg;
    public Spinner bh;
    public String bi;
    public EditText bj;
    public ArrayList<Item> bk;
    public ArrayList<Item> bl;
    public ArrayList<Item> bm;
    public String bn;
    public String bo;
    public String bp;
    public String bq;
    public String br;
    public String bs;
    public String bt;
    public ProgressDialog bu;
    public int bv;
    public String bw;
    public String bx;
    public int by;
    public String bz;
    private static char[] b$s64$2282 = {11858, 11909, 11960, 11954, 11949, 11964, 11905, 11965, 11952, 11907, 11910, 11841};
    private static boolean a$s67$2282 = true;
    public double aC = 0.0d;
    public String bf = BuildConfig.FLAVOR;

    public class OooO implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ Spinner c;

        public OooO(Spinner spinner) {
            this.c = spinner;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:49:0x0227  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 | 59) << 1) - (i3 ^ 59);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                this.c.getId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int id = this.c.getId();
            if (id != R.id.sp_attended_school) {
                int i5 = a;
                int i6 = (((i5 | 66) << 1) - (i5 ^ 66)) - 1;
                int i7 = i6 % 128;
                b = i7;
                int i8 = i6 % 2;
                if (id == R.id.sp_relation_to_household) {
                    if (i == 1) {
                        int i9 = (i7 ^ 103) + ((i7 & 103) << 1);
                        a = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = (i7 ^ 53) + ((i7 & 53) << 1);
                        a = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= UpdateRosterActivity.this.ag.N.size()) {
                                int i14 = a;
                                int i15 = i14 ^ 123;
                                int i16 = ((i14 & 123) | i15) << 1;
                                int i17 = -i15;
                                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                                b = i18 % 128;
                                int i19 = i18 % 2;
                                break;
                            }
                            int i20 = b;
                            int i21 = ((i20 | 124) << 1) - (i20 ^ 124);
                            int i22 = (i21 ^ (-1)) + (i21 << 1);
                            a = i22 % 128;
                            int i23 = i22 % 2;
                            RosterItem rosterItem = UpdateRosterActivity.this.ag.N.get(i13);
                            int i24 = b;
                            int i25 = i24 & 65;
                            int i26 = (i24 | 65) & (~i25);
                            int i27 = -(-(i25 << 1));
                            int i28 = (i26 & i27) + (i26 | i27);
                            a = i28 % 128;
                            int i29 = i28 % 2;
                            if (rosterItem.getRelationToHouseholdHead() == 186) {
                                int i30 = a;
                                int i31 = i30 & 39;
                                int i32 = (i30 ^ 39) | i31;
                                int i33 = (i31 & i32) + (i32 | i31);
                                int i34 = i33 % 128;
                                b = i34;
                                if (!(i33 % 2 != 0)) {
                                    break;
                                }
                                int i35 = ((i34 & 6) + (i34 | 6)) - 1;
                                a = i35 % 128;
                                int i36 = i35 % 2;
                                UpdateRosterActivity.this.au.setSelection(0);
                                int i37 = b;
                                int i38 = i37 & 9;
                                int i39 = i38 + ((i37 ^ 9) | i38);
                                a = i39 % 128;
                                int i40 = i39 % 2;
                                UpdateRosterActivity.w(UpdateRosterActivity.this, "House hold already exists");
                                int i41 = b + 49;
                                a = i41 % 128;
                                int i42 = i41 % 2;
                                break;
                            }
                            int i43 = (i13 ^ 82) + ((i13 & 82) << 1);
                            i13 = (i43 & (-81)) + (i43 | (-81));
                            int i44 = b;
                            int i45 = (i44 & 103) + (i44 | 103);
                            a = i45 % 128;
                            int i46 = i45 % 2;
                        }
                    }
                } else {
                    int i47 = i5 & 5;
                    int i48 = (i5 ^ 5) | i47;
                    int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    if (id == R.id.sp_work_activity) {
                        int i51 = i5 + 33;
                        b = i51 % 128;
                        if (i51 % 2 != 0 ? UpdateRosterActivity.this.aN.getSelectedItemPosition() == 2 : UpdateRosterActivity.this.aN.getSelectedItemPosition() == 3) {
                            UpdateRosterActivity.this.aR.setVisibility(8);
                            UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
                            int i52 = b;
                            int i53 = i52 & 17;
                            int i54 = (i52 ^ 17) | i53;
                            int i55 = (i53 & i54) + (i54 | i53);
                            a = i55 % 128;
                            int i56 = i55 % 2;
                            updateRosterActivity.aQ.setVisibility(8);
                            int i57 = a;
                            int i58 = ((((i57 ^ 79) | (i57 & 79)) << 1) - (~(-(((~i57) & 79) | (i57 & (-80)))))) - 1;
                            b = i58 % 128;
                            int i59 = i58 % 2;
                        } else {
                            int i60 = b;
                            int i61 = i60 ^ 105;
                            int i62 = -(-((i60 & 105) << 1));
                            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                            a = i63 % 128;
                            if (i63 % 2 == 0 ? UpdateRosterActivity.this.aN.getSelectedItemPosition() == 3 : UpdateRosterActivity.this.aN.getSelectedItemPosition() == 4) {
                                UpdateRosterActivity.this.aR.setVisibility(8);
                                UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
                                int i510 = b;
                                int i511 = i510 & 17;
                                int i512 = (i510 ^ 17) | i511;
                                int i513 = (i511 & i512) + (i512 | i511);
                                a = i513 % 128;
                                int i514 = i513 % 2;
                                updateRosterActivity2.aQ.setVisibility(8);
                                int i515 = a;
                                int i516 = ((((i515 ^ 79) | (i515 & 79)) << 1) - (~(-(((~i515) & 79) | (i515 & (-80)))))) - 1;
                                b = i516 % 128;
                                int i517 = i516 % 2;
                            } else {
                                int i64 = a;
                                int i65 = ((i64 | 75) << 1) - (i64 ^ 75);
                                b = i65 % 128;
                                int i66 = i65 % 2;
                                UpdateRosterActivity.this.aR.setVisibility(0);
                                int i67 = b;
                                int i68 = ((i67 | 85) << 1) - (i67 ^ 85);
                                a = i68 % 128;
                                int i69 = i68 % 2;
                            }
                        }
                    }
                }
            } else if (UpdateRosterActivity.this.aJ.getSelectedItemPosition() != 2) {
                int i70 = a;
                int i71 = ((((i70 ^ 99) | (i70 & 99)) << 1) - (~(-(((~i70) & 99) | (i70 & (-100)))))) - 1;
                b = i71 % 128;
                int i72 = i71 % 2;
                if (UpdateRosterActivity.this.aJ.getSelectedItemPosition() != 3) {
                    int i73 = b;
                    int i74 = (i73 ^ 47) + ((i73 & 47) << 1);
                    a = i74 % 128;
                    if (i74 % 2 != 0) {
                        UpdateRosterActivity.this.aM.setVisibility(88);
                    } else {
                        UpdateRosterActivity.this.aM.setVisibility(8);
                    }
                    int i75 = b;
                    int i76 = ((i75 ^ 97) | (i75 & 97)) << 1;
                    int i77 = -(((~i75) & 97) | (i75 & (-98)));
                    int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                    a = i78 % 128;
                    int i79 = i78 % 2;
                } else {
                    UpdateRosterActivity.this.aM.setVisibility(0);
                    int i80 = a;
                    int i81 = (i80 & 59) + (i80 | 59);
                    b = i81 % 128;
                    int i82 = i81 % 2;
                }
            } else {
                UpdateRosterActivity.this.aM.setVisibility(0);
                int i83 = a;
                int i84 = (i83 & 59) + (i83 | 59);
                b = i84 % 128;
                int i85 = i84 % 2;
            }
            if (i != 0) {
                this.c.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i86 = a;
                int i87 = ((i86 | 97) << 1) - (i86 ^ 97);
                b = i87 % 128;
                int i88 = i87 % 2;
                return;
            }
            int i89 = a;
            int i90 = (i89 ^ 49) + ((i89 & 49) << 1);
            b = i90 % 128;
            if (i90 % 2 == 0) {
                this.c.setBackgroundResource(R.drawable.spinner_bg);
                int i91 = 98 / 0;
            } else {
                this.c.setBackgroundResource(R.drawable.spinner_bg);
            }
            int i92 = a;
            int i93 = i92 & 105;
            int i94 = ((i92 ^ 105) | i93) << 1;
            int i95 = -((i92 | 105) & (~i93));
            int i96 = (i94 & i95) + (i95 | i94);
            b = i96 % 128;
            int i97 = i96 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 35) + (i2 | 35);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooOO0O implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooOO0O() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            Intent intent = new Intent(UpdateRosterActivity.this, (Class<?>) UpdatePhoneNoActivity.class);
            int i3 = a;
            int i4 = i3 & 87;
            int i5 = -(-(i3 | 87));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                intent.putExtra("roster_data", UpdateRosterActivity.this.be);
                throw null;
            }
            intent.putExtra("roster_data", UpdateRosterActivity.this.be);
            UpdateRosterActivity.this.startActivity(intent);
            dialogInterface.cancel();
            int i7 = b;
            int i8 = (-2) - (((i7 & 78) + (i7 | 78)) ^ (-1));
            a = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public class OooOo00 implements Runnable {
        private static int a = 1;
        private static int b;

        public OooOo00() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 63;
            int i4 = -(-((i2 & 63) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                UpdateRosterActivity.this.aR.setText("0");
            } else {
                UpdateRosterActivity.this.aR.setText("0");
                int i6 = 98 / 0;
            }
        }
    }

    public class o000oOoO implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public o000oOoO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            dialogInterface.dismiss();
            UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
            Intent intent = new Intent(UpdateRosterActivity.this, (Class<?>) UpdateRosterListActivity.class);
            int i3 = a + 13;
            b = i3 % 128;
            int i4 = i3 % 2;
            updateRosterActivity.startActivity(intent);
            UpdateRosterActivity.this.finish();
            int i5 = a;
            int i6 = (i5 ^ 67) + ((i5 & 67) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public class o00Oo0 implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public o00Oo0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 | 60) << 1) - (i3 ^ 60);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            if (i != 0) {
                UpdateRosterActivity.this.aO.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i8 = a;
                int i9 = i8 & 21;
                int i10 = -(-((i8 ^ 21) | i9));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            int i13 = i6 & 97;
            int i14 = i13 + ((i6 ^ 97) | i13);
            b = i14 % 128;
            int i15 = i14 % 2;
            UpdateRosterActivity.this.aO.setBackgroundResource(R.drawable.spinner_bg);
            int i16 = b;
            int i17 = i16 & 101;
            int i18 = ((i16 | 101) & (~i17)) + (i17 << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b + 53;
            a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public class o00Ooo implements J {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ int c;

        public o00Ooo(int i) {
            this.c = i;
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 79;
            int i5 = -(-((i3 ^ 79) | i4));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
            updateRosterActivity.aY = arrayList;
            BISPApplication bISPApplication = updateRosterActivity.ag;
            int i8 = b;
            int i9 = ((((i8 ^ 121) | (i8 & 121)) << 1) - (~(-(((~i8) & 121) | (i8 & (-122)))))) - 1;
            a = i9 % 128;
            int i10 = 0;
            if (i9 % 2 == 0) {
                bISPApplication.V = arrayList;
                updateRosterActivity.au.setEnabled(false);
                i = 1;
            } else {
                bISPApplication.V = arrayList;
                updateRosterActivity.au.setEnabled(true);
                i = 0;
            }
            int i11 = b;
            int i12 = ((i11 & 40) + (i11 | 40)) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 / 0;
            }
            while (i < UpdateRosterActivity.this.aY.size()) {
                int i14 = b;
                int i15 = ((i14 ^ 18) + ((i14 & 18) << 1)) - 1;
                a = i15 % 128;
                int i16 = i15 % 2;
                int optionId = UpdateRosterActivity.this.aY.get(i).getOptionId();
                int i17 = b;
                int i18 = i17 + 59;
                int i19 = i18 % 128;
                a = i19;
                if (i18 % 2 == 0) {
                    throw null;
                }
                if (optionId == this.c) {
                    int i20 = i19 ^ 115;
                    int i21 = ((i19 & 115) | i20) << 1;
                    int i22 = -i20;
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    i10 = i;
                    break;
                }
                int i25 = i ^ 1;
                i = ((((i & 1) | i25) << 1) - (~(-i25))) - 1;
                int i26 = i17 + 13;
                a = i26 % 128;
                if (i26 % 2 == 0) {
                    int i27 = 4 % 4;
                }
            }
            UpdateRosterActivity.this.au.setSelection(i10);
            UpdateRosterActivity.this.au.setOnItemSelectedListener(new OooO00o());
            int i28 = a;
            int i29 = (i28 & 95) + (i28 | 95);
            b = i29 % 128;
            int i30 = i29 % 2;
        }

        public class OooO00o implements AdapterView.OnItemSelectedListener {
            private static int a = 0;
            private static int b = 1;

            public OooO00o() {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                int i = 2 % 2;
                int i2 = a + 115;
                b = i2 % 128;
                int i3 = i2 % 2;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                boolean z;
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 & 65;
                int i5 = ((((i3 ^ 65) | i4) << 1) - (~(-((i3 | 65) & (~i4))))) - 1;
                b = i5 % 128;
                Object obj = null;
                if (i5 % 2 == 0) {
                    UpdateRosterActivity.this.au.getId();
                    throw null;
                }
                if (UpdateRosterActivity.this.au.getId() == R.id.sp_relation_to_household) {
                    int i6 = b;
                    int i7 = (i6 ^ 5) + ((i6 & 5) << 1);
                    a = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 0;
                    while (true) {
                        List<RosterItem> list = UpdateRosterActivity.this.ag.N;
                        int i10 = b + 119;
                        a = i10 % 128;
                        if (i10 % 2 != 0) {
                            list.size();
                            obj.hashCode();
                            throw null;
                        }
                        if (i9 >= list.size()) {
                            int i11 = a;
                            int i12 = i11 & 37;
                            int i13 = (i11 ^ 37) | i12;
                            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                            b = i14 % 128;
                            int i15 = i14 % 2;
                            z = false;
                            break;
                        }
                        int i16 = a;
                        int i17 = i16 & 115;
                        int i18 = (i17 - (~((i16 ^ 115) | i17))) - 1;
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
                        if (i9 != updateRosterActivity.bb) {
                            int i20 = a;
                            int i21 = i20 ^ 107;
                            int i22 = ((i20 & 107) | i21) << 1;
                            int i23 = -i21;
                            int i24 = (i22 & i23) + (i22 | i23);
                            b = i24 % 128;
                            int i25 = i24 % 2;
                            RosterItem rosterItem = updateRosterActivity.ag.N.get(i9);
                            int i26 = a;
                            int i27 = i26 & 105;
                            int i28 = i27 + ((i26 ^ 105) | i27);
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            if (rosterItem.getRelationToHouseholdHead() == 186) {
                                int i30 = a;
                                int i31 = i30 & 37;
                                int i32 = i30 | 37;
                                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                                int i34 = i33 % 128;
                                b = i34;
                                int i35 = i33 % 2;
                                int i36 = ((i34 & 20) + (i34 | 20)) - 1;
                                a = i36 % 128;
                                int i37 = i36 % 2;
                                z = true;
                                break;
                            }
                        }
                        i9 = ((i9 | 1) << 1) - (i9 ^ 1);
                        int i38 = a;
                        int i39 = i38 ^ 89;
                        int i40 = (((i38 & 89) | i39) << 1) - i39;
                        b = i40 % 128;
                        int i41 = i40 % 2;
                    }
                    if (i == 1) {
                        int i42 = a;
                        int i43 = (i42 & 109) + (i42 | 109);
                        int i44 = i43 % 128;
                        b = i44;
                        int i45 = i43 % 2;
                        if (!(!z)) {
                            int i46 = ((i44 & (-90)) | ((~i44) & 89)) + ((i44 & 89) << 1);
                            a = i46 % 128;
                            int i47 = i46 % 2;
                            Spinner spinner = UpdateRosterActivity.this.au;
                            int i48 = b;
                            int i49 = (i48 & 67) + (i48 | 67);
                            a = i49 % 128;
                            int i50 = i49 % 2;
                            spinner.setSelection(0);
                            UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
                            int i51 = b;
                            int i52 = i51 & 87;
                            int i53 = -(-(i51 | 87));
                            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                            a = i54 % 128;
                            int i55 = i54 % 2;
                            UpdateRosterActivity.w(updateRosterActivity2, "House hold already exists");
                            int i56 = a + 65;
                            b = i56 % 128;
                            int i57 = i56 % 2;
                        }
                    }
                }
                if (i != 0) {
                    Spinner spinner2 = UpdateRosterActivity.this.au;
                    int i58 = b + 112;
                    int i59 = (i58 ^ (-1)) + (i58 << 1);
                    a = i59 % 128;
                    int i60 = i59 % 2;
                    spinner2.setBackgroundResource(R.drawable.spinner_bg_selected);
                    int i61 = b;
                    int i62 = i61 & 31;
                    int i63 = (i61 | 31) & (~i62);
                    int i64 = i62 << 1;
                    int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
                    a = i65 % 128;
                    if (i65 % 2 != 0) {
                        int i66 = 40 / 0;
                        return;
                    }
                    return;
                }
                int i67 = a;
                int i68 = (i67 | 11) << 1;
                int i69 = -(i67 ^ 11);
                int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                b = i70 % 128;
                if (i70 % 2 == 0) {
                    UpdateRosterActivity.this.au.setBackgroundResource(R.drawable.spinner_bg);
                    obj.hashCode();
                    throw null;
                }
                UpdateRosterActivity.this.au.setBackgroundResource(R.drawable.spinner_bg);
                int i71 = b;
                int i72 = i71 & 43;
                int i73 = ((i71 | 43) & (~i72)) + (i72 << 1);
                a = i73 % 128;
                if (i73 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
    }

    public class o00oO0o implements J {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ int c;

        public o00oO0o(int i) {
            this.c = i;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:24:0x00f8  */
        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & 55) + (i3 | 55);
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
                updateRosterActivity.bd = arrayList;
                BISPApplication bISPApplication = updateRosterActivity.ag;
                throw null;
            }
            UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
            updateRosterActivity2.bd = arrayList;
            updateRosterActivity2.ag.S = arrayList;
            updateRosterActivity2.aE.setEnabled(true);
            int i5 = a + 29;
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (true) {
                if (i7 >= UpdateRosterActivity.this.bd.size()) {
                    int i8 = b;
                    int i9 = (i8 & (-56)) | ((~i8) & 55);
                    int i10 = (i8 & 55) << 1;
                    int i11 = (i9 & i10) + (i10 | i9);
                    a = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 3 % 2;
                    }
                    i7 = 0;
                    break;
                }
                int i13 = a;
                int i14 = ((i13 ^ 12) + ((i13 & 12) << 1)) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
                int optionId = UpdateRosterActivity.this.bd.get(i7).getOptionId();
                int i16 = a;
                int i17 = i16 & 91;
                int i18 = i16 | 91;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                int i20 = i19 % 128;
                b = i20;
                int i21 = i19 % 2;
                if (optionId == this.c) {
                    break;
                }
                int i22 = (i20 & (-120)) | ((~i20) & 119);
                int i23 = -(-((i20 & 119) << 1));
                int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                int i25 = i24 % 128;
                a = i25;
                int i26 = i24 % 2;
                i7 = ((i7 & 2) + (i7 | 2)) - 1;
                int i27 = i25 + 119;
                b = i27 % 128;
                int i28 = i27 % 2;
            }
            UpdateRosterActivity updateRosterActivity3 = UpdateRosterActivity.this;
            ArrayList<Item> arrayList2 = updateRosterActivity3.bd;
            int i29 = b;
            int i30 = i29 & 101;
            int i31 = (i29 ^ 101) | i30;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                updateRosterActivity3.I(arrayList2, updateRosterActivity3.aE);
                obj.hashCode();
                throw null;
            }
            updateRosterActivity3.I(arrayList2, updateRosterActivity3.aE);
            UpdateRosterActivity.this.aE.setSelection(i7);
            int i33 = a;
            int i34 = ((i33 | 37) << 1) - (i33 ^ 37);
            b = i34 % 128;
            if (i34 % 2 == 0) {
                int i35 = 81 / 0;
                if (i7 != 0) {
                    UpdateRosterActivity.this.aE.setEnabled(false);
                    int i36 = b;
                    int i37 = i36 & 1;
                    int i38 = -(-((i36 ^ 1) | i37));
                    i = ((i37 | i38) << 1) - (i38 ^ i37);
                    a = i % 128;
                    if (i % 2 != 0) {
                        int i39 = 5 / 4;
                    }
                }
            } else if (i7 != 0) {
                UpdateRosterActivity.this.aE.setEnabled(false);
                int i310 = b;
                int i311 = i310 & 1;
                int i312 = -(-((i310 ^ 1) | i311));
                i = ((i311 | i312) << 1) - (i312 ^ i311);
                a = i % 128;
                if (i % 2 != 0) {
                    int i313 = 5 / 4;
                }
            }
            int i40 = b;
            int i41 = ((i40 ^ 83) | (i40 & 83)) << 1;
            int i42 = -(((~i40) & 83) | (i40 & (-84)));
            int i43 = (i41 & i42) + (i42 | i41);
            a = i43 % 128;
            if (i43 % 2 != 0) {
                int i44 = 53 / 0;
            }
        }
    }

    public class o0ooOOo implements J {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ int c;

        public o0ooOOo(int i) {
            this.c = i;
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 14) + (i2 | 14)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
            updateRosterActivity.bm = arrayList;
            BISPApplication bISPApplication = updateRosterActivity.ag;
            int i5 = b;
            int i6 = ((i5 | 8) << 1) - (i5 ^ 8);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            bISPApplication.Q = arrayList;
            updateRosterActivity.aD.setEnabled(true);
            int i9 = a;
            int i10 = (i9 & 77) + (i9 | 77);
            b = i10 % 128;
            int i11 = 0;
            if (i10 % 2 == 0) {
                int i12 = 89 / 0;
            }
            int i13 = 0;
            while (true) {
                Object obj = null;
                if (i13 >= UpdateRosterActivity.this.bm.size()) {
                    break;
                }
                int i14 = b;
                int i15 = ((i14 ^ 85) | (i14 & 85)) << 1;
                int i16 = -(((~i14) & 85) | (i14 & (-86)));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                a = i17 % 128;
                int i18 = i17 % 2;
                Item item = UpdateRosterActivity.this.bm.get(i13);
                int i19 = a;
                int i20 = (i19 ^ 9) + ((i19 & 9) << 1);
                b = i20 % 128;
                int i21 = i20 % 2;
                if (item.getOptionId() == this.c) {
                    int i22 = a;
                    int i23 = i22 & 23;
                    int i24 = (i22 ^ 23) | i23;
                    int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                    b = i25 % 128;
                    if (i25 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i26 = i22 & 61;
                    int i27 = i26 + ((i22 ^ 61) | i26);
                    b = i27 % 128;
                    if (i27 % 2 == 0) {
                        int i28 = 4 / 3;
                    }
                    i11 = i13;
                    break;
                }
                int i29 = ((((i13 ^ 119) | (i13 & 119)) << 1) - (~(-(((~i13) & 119) | (i13 & (-120)))))) - 1;
                i13 = (-2) - (((i29 & (-117)) + (i29 | (-117))) ^ (-1));
                int i30 = a + 67;
                b = i30 % 128;
                if (i30 % 2 == 0) {
                    int i31 = 5 % 4;
                }
            }
            UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
            ArrayList<Item> arrayList2 = updateRosterActivity2.bm;
            Spinner spinner = updateRosterActivity2.aD;
            int i32 = b;
            int i33 = (i32 | 81) << 1;
            int i34 = -(((~i32) & 81) | (i32 & (-82)));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            a = i35 % 128;
            if (i35 % 2 != 0) {
                updateRosterActivity2.I(arrayList2, spinner);
                Spinner spinner2 = UpdateRosterActivity.this.aD;
                throw null;
            }
            updateRosterActivity2.I(arrayList2, spinner);
            UpdateRosterActivity.this.aD.setSelection(i11);
            int i36 = a;
            int i37 = i36 & 85;
            int i38 = -(-(i36 | 85));
            int i39 = (i37 & i38) + (i38 | i37);
            b = i39 % 128;
            int i40 = i39 % 2;
        }
    }

    public static void v(UpdateRosterActivity updateRosterActivity, String str) {
        int i = 2 % 2;
        Objects.requireNonNull(updateRosterActivity);
        String strReplace = str.replace("-", BuildConfig.FLAVOR);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("Cnic", strReplace);
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", updateRosterActivity.bg.r());
            jSONObject.put("call_origin", 100);
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(updateRosterActivity.bg.k()), b.b(updateRosterActivity.bg.m())));
            byte[] bArrB = b.b(updateRosterActivity.bg.k());
            byte[] bArrB2 = b.b(updateRosterActivity.bg.m());
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.getMode(0) + 127, null, new byte[]{-116, -123, -126, -117, -125, -118, -119, -124, -125, -120, -125, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            Toast.makeText(updateRosterActivity, "سروے کی اپ ڈیٹ دستیاب نہیں ہے", 0).show();
            int i2 = q + 21;
            p = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    public final void D(boolean z) {
        int i = 2 % 2;
        int i2 = q + 77;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (z) {
            this.aI.setChecked(true);
            this.aH.setChecked(false);
            this.aJ.setVisibility(0);
            this.aM.setVisibility(0);
            int i3 = p + 13;
            q = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.aI.setChecked(false);
        this.aH.setChecked(true);
        this.aJ.setVisibility(8);
        this.aM.setVisibility(8);
        int i5 = p + 65;
        q = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void F() {
        int i = 2 % 2;
        if (!this.bz.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            int i2 = p + 85;
            q = i2 % 128;
            int i3 = i2 % 2;
            if (!this.bz.equalsIgnoreCase("NA")) {
                this.aB.setChecked(false);
                this.an.setChecked(true);
                this.aL.setSelection(Arrays.asList(getResources().getStringArray(R.array.banks)).indexOf(this.bz));
                this.ao.setText(this.bA);
                this.at.setText(this.bB);
                this.as.setText(this.bw);
                return;
            }
        }
        this.aB.setChecked(true);
        this.an.setChecked(false);
        this.aT.setVisibility(8);
        int i4 = p + 91;
        q = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void H() {
        int i = 2 % 2;
        if (this.br.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            this.aO.setSelection(0);
            int i2 = p + 123;
            q = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.aO.setSelection(Arrays.asList(getResources().getStringArray(R.array.networks)).indexOf(this.br));
        int i4 = q + 9;
        p = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean J(boolean z, String str) {
        int i = 2 % 2;
        runOnUiThread(new o0OoOo0(str));
        if (!z) {
            return true;
        }
        int i2 = q + 53;
        int i3 = i2 % 128;
        p = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 3;
        q = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int id = radioGroup.getId();
        if (id == R.id.rg_bank_info) {
            if (i != this.an.getId()) {
                if (i == this.aB.getId()) {
                    this.aT.setVisibility(8);
                    return;
                }
                return;
            } else {
                int i3 = q + 89;
                p = i3 % 128;
                int i4 = i3 % 2;
                this.aT.setVisibility(0);
                return;
            }
        }
        int i5 = p + 31;
        q = i5 % 128;
        int i6 = i5 % 2;
        if (id != R.id.rg_gender) {
            if (id == R.id.rg_language) {
                if (i == this.aI.getId()) {
                    this.aJ.setVisibility(0);
                    return;
                } else {
                    this.aJ.setVisibility(8);
                    return;
                }
            }
            return;
        }
        if (i != this.aw.getId()) {
            this.aK.getId();
            int i7 = q + 63;
            p = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int id = view.getId();
        int i2 = 1;
        if (id != R.id.btn_save) {
            int i3 = p + 39;
            q = i3 % 128;
            int i4 = i3 % 2;
            if (id == R.id.tv_dob) {
                C0104p.c().h(this.ae, "Warning", "If you change age of household then all added rosters will be removed. Are you sure you want to change age?? ", new am(this, i2), DialogInterfaceOnClickListenerC0217y.e, true);
                return;
            }
        } else {
            this.bx = this.bg.p();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Phone Number.!");
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Please Comfirm your Phone # ");
            sbW.append(this.bx);
            builder.setMessage(sbW.toString());
            builder.setCancelable(true);
            builder.setPositiveButton("Confirm", new OooOO0());
            builder.setNegativeButton("No", new OooOO0O());
            builder.create().show();
        }
        int i5 = q + 51;
        p = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 25;
        q = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 121;
        q = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_update_roster;
        }
        throw null;
    }

    public class OooOOO implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public OooOOO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 65) | (i2 & 65)) << 1;
            int i4 = -(((~i2) & 65) | (i2 & (-66)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            UpdateRosterActivity.this.aM.setSelection(0);
            int i7 = a;
            int i8 = (i7 & 5) + (i7 | 5);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 27 / 0;
            }
        }
    }

    public class OooOOO0 implements Runnable {
        private static int a = 1;
        private static int b;

        public OooOOO0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 42) << 1) - (i2 ^ 42)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            UpdateRosterActivity.this.aJ.setSelection(0);
            int i5 = b + 29;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooOOOO implements Runnable {
        private static int a = 1;
        private static int b;

        public OooOOOO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 13) + (i2 | 13);
            a = i3 % 128;
            int i4 = i3 % 2;
            UpdateRosterActivity.this.aN.setSelection(0);
            int i5 = b;
            int i6 = (((i5 | 86) << 1) - (i5 ^ 86)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public class OooOo implements Runnable {
        private static int a = 1;
        private static int b;

        public OooOo() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 91;
            int i4 = ((((i2 ^ 91) | i3) << 1) - (~(-((i2 | 91) & (~i3))))) - 1;
            b = i4 % 128;
            (i4 % 2 != 0 ? UpdateRosterActivity.this : UpdateRosterActivity.this).aV.setSelection(0);
        }
    }

    public class Oooo000 implements Runnable {
        private static int a = 1;
        private static int b;

        public Oooo000() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 45) | (i2 & 45)) << 1) - (((~i2) & 45) | (i2 & (-46)));
            a = i3 % 128;
            (i3 % 2 == 0 ? UpdateRosterActivity.this : UpdateRosterActivity.this).aO.setSelection(0);
        }
    }

    public class o0OoOo0 implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ String c;

        public o0OoOo0(String str) {
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatActivity appCompatActivity;
            String str;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-20)) | ((~i2) & 19)) + ((i2 & 19) << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
                int i4 = UpdateRosterActivity.af;
                appCompatActivity = updateRosterActivity.ae;
                str = this.c;
                int i5 = 50 / 0;
            } else {
                UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
                int i6 = UpdateRosterActivity.af;
                appCompatActivity = updateRosterActivity2.ae;
                str = this.c;
            }
            int i7 = b;
            int i8 = (i7 & 110) + (i7 | 110);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            Toast.makeText(appCompatActivity, str, 0).show();
            int i11 = a;
            int i12 = i11 & 67;
            int i13 = (i12 - (~(-(-((i11 ^ 67) | i12))))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    public class OooO00o implements J {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ int c;

        public OooO00o(int i) {
            this.c = i;
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 ^ 125) | (i3 & 125)) << 1;
            int i5 = -(((~i3) & 125) | (i3 & (-126)));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
            updateRosterActivity.ba = arrayList;
            BISPApplication bISPApplication = updateRosterActivity.ag;
            int i8 = a;
            int i9 = i8 ^ 59;
            int i10 = ((i8 & 59) | i9) << 1;
            int i11 = -i9;
            int i12 = (i10 & i11) + (i10 | i11);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                bISPApplication.P = arrayList;
                updateRosterActivity.aJ.setEnabled(false);
                i = 1;
            } else {
                bISPApplication.P = arrayList;
                updateRosterActivity.aJ.setEnabled(true);
                i = 0;
            }
            int i13 = a;
            int i14 = (i13 & 69) + (i13 | 69);
            b = i14 % 128;
            int i15 = i14 % 2;
            while (true) {
                if (i >= UpdateRosterActivity.this.ba.size()) {
                    i = 0;
                    break;
                }
                int i16 = b;
                int i17 = i16 & 61;
                int i18 = ((i16 | 61) & (~i17)) + (i17 << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                Item item = UpdateRosterActivity.this.ba.get(i);
                int i20 = b;
                int i21 = ((i20 | 113) << 1) - (i20 ^ 113);
                a = i21 % 128;
                int i22 = i21 % 2;
                if (item.getOptionId() == this.c) {
                    int i23 = b;
                    int i24 = i23 & 15;
                    int i25 = (i23 ^ 15) | i24;
                    int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                    a = i26 % 128;
                    if (i26 % 2 == 0) {
                        throw null;
                    }
                    int i27 = i23 | 33;
                    int i28 = (i27 << 1) - ((~(i23 & 33)) & i27);
                    a = i28 % 128;
                    if (i28 % 2 != 0) {
                        break;
                    }
                    int i29 = 2 % 3;
                    break;
                }
                int i30 = i & 1;
                int i31 = (i | 1) & (~i30);
                int i32 = i30 << 1;
                i = (i31 | i32) + (i31 & i32);
                int i33 = b + 113;
                a = i33 % 128;
                int i34 = i33 % 2;
            }
            UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
            ArrayList<Item> arrayList2 = updateRosterActivity2.ba;
            Spinner spinner = updateRosterActivity2.aJ;
            int i35 = b;
            int i36 = i35 & 65;
            int i37 = (i36 - (~(-(-((i35 ^ 65) | i36))))) - 1;
            a = i37 % 128;
            if (i37 % 2 == 0) {
                updateRosterActivity2.I(arrayList2, spinner);
                throw null;
            }
            updateRosterActivity2.I(arrayList2, spinner);
            UpdateRosterActivity updateRosterActivity3 = UpdateRosterActivity.this;
            int i38 = b;
            int i39 = ((i38 | 48) << 1) - (i38 ^ 48);
            int i40 = (i39 ^ (-1)) + (i39 << 1);
            a = i40 % 128;
            if (i40 % 2 == 0) {
                updateRosterActivity3.aJ.setSelection(i);
                throw null;
            }
            updateRosterActivity3.aJ.setSelection(i);
            int i41 = a;
            int i42 = i41 & 21;
            int i43 = (i41 | 21) & (~i42);
            int i44 = -(-(i42 << 1));
            int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
            b = i45 % 128;
            if (i45 % 2 != 0) {
                int i46 = 20 / 0;
            }
        }
    }

    public class oo000o implements J {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ int c;

        public oo000o(int i) {
            this.c = i;
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            UpdateRosterActivity updateRosterActivity;
            int i;
            Object obj;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 47;
            int i5 = ((((i3 ^ 47) | i4) << 1) - (~(-((i3 | 47) & (~i4))))) - 1;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                updateRosterActivity = UpdateRosterActivity.this;
                updateRosterActivity.bl = arrayList;
                updateRosterActivity.ag.R = arrayList;
                int i6 = 49 / 0;
            } else {
                updateRosterActivity = UpdateRosterActivity.this;
                updateRosterActivity.bl = arrayList;
                updateRosterActivity.ag.R = arrayList;
            }
            int i7 = a;
            int i8 = i7 & 3;
            int i9 = ((((i7 ^ 3) | i8) << 1) - (~(-((i7 | 3) & (~i8))))) - 1;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                updateRosterActivity.bh.setEnabled(false);
                i = 1;
            } else {
                updateRosterActivity.bh.setEnabled(true);
                i = 0;
            }
            int i10 = a;
            int i11 = ((i10 & (-82)) | ((~i10) & 81)) + ((i10 & 81) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            while (true) {
                obj = null;
                if (i >= UpdateRosterActivity.this.bl.size()) {
                    int i13 = a;
                    int i14 = i13 & 77;
                    int i15 = ((i13 | 77) & (~i14)) + (i14 << 1);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    i = 0;
                    break;
                }
                int i17 = a;
                int i18 = (i17 & 6) + (i17 | 6);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    UpdateRosterActivity.this.bl.get(i);
                    throw null;
                }
                if (UpdateRosterActivity.this.bl.get(i).getOptionId() == this.c) {
                    break;
                }
                int i20 = b;
                int i21 = (i20 & 19) + (i20 | 19);
                int i22 = i21 % 128;
                a = i22;
                if (i21 % 2 == 0) {
                    int i23 = i & 46;
                    i = ((i | 46) & (~i23)) + (i23 << 1);
                } else {
                    i = ((i & (-2)) | ((~i) & 1)) + ((i & 1) << 1);
                }
                int i24 = i22 + 103;
                b = i24 % 128;
                int i25 = i24 % 2;
            }
            UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
            ArrayList<Item> arrayList2 = updateRosterActivity2.bl;
            Spinner spinner = updateRosterActivity2.bh;
            int i26 = (-2) - ((b + 38) ^ (-1));
            a = i26 % 128;
            int i27 = i26 % 2;
            updateRosterActivity2.I(arrayList2, spinner);
            UpdateRosterActivity updateRosterActivity3 = UpdateRosterActivity.this;
            int i28 = a;
            int i29 = ((i28 | 109) << 1) - (i28 ^ 109);
            b = i29 % 128;
            int i30 = i29 % 2;
            updateRosterActivity3.bh.setSelection(i);
            if (i != 0) {
                int i31 = a;
                int i32 = (i31 ^ 99) + ((i31 & 99) << 1);
                b = i32 % 128;
                int i33 = i32 % 2;
                UpdateRosterActivity.this.bh.setEnabled(false);
                int i34 = a;
                int i35 = (i34 & 23) + (i34 | 23);
                b = i35 % 128;
                int i36 = i35 % 2;
            }
            int i37 = b;
            int i38 = i37 & 13;
            int i39 = (i37 | 13) & (~i38);
            int i40 = -(-(i38 << 1));
            int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
            a = i41 % 128;
            if (i41 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public void I(ArrayList<Item> arrayList, Spinner spinner) {
        int i = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.ae, R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new OooO(spinner));
        int i2 = p + 39;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
    }

    public class o00O0O implements AdapterView.OnItemSelectedListener {
        private static int a = 1;
        private static int b;

        public o00O0O() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 55) << 1;
            int i4 = -(((~i2) & 55) | (i2 & (-56)));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 71;
            int i5 = i4 + ((i3 ^ 71) | i4);
            int i6 = i5 % 128;
            a = i6;
            Object obj = null;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i != 0) {
                UpdateRosterActivity.this.aL.setBackgroundResource(R.drawable.spinner_bg_selected);
                int i7 = b;
                int i8 = (i7 & 77) + (i7 | 77);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i9 = ((i6 ^ 30) + ((i6 & 30) << 1)) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            UpdateRosterActivity.this.aL.setBackgroundResource(R.drawable.spinner_bg);
            int i11 = a;
            int i12 = ((i11 ^ 98) + ((i11 & 98) << 1)) - 1;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        ProgressDialog progressDialog = this.bu;
        if (progressDialog != null) {
            int i2 = p + 33;
            q = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 32 / 0;
                if (progressDialog.isShowing()) {
                    this.bu.dismiss();
                    int i4 = p + 3;
                    q = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else if (progressDialog.isShowing()) {
                this.bu.dismiss();
                int i6 = p + 3;
                q = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (this.bf.equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) UpdateRosterListActivity.class));
        } else {
            startActivity(new Intent(this, (Class<?>) UpdateSplittingRosterListActivity.class));
        }
        finish();
    }

    public final double B(int i, int i2, int i3) {
        int i4 = 2 % 2;
        Date dateH = z.h(ivas.gov.bisp.enumeration.p091n.j.l(i, "-", i2, "-", i3), "dd-MM-yyyy");
        Date date = new Date();
        GregorianCalendar gregorianCalendarY = ivas.gov.bisp.enumeration.p091n.j.y(dateH);
        GregorianCalendar gregorianCalendarY2 = ivas.gov.bisp.enumeration.p091n.j.y(date);
        int i5 = gregorianCalendarY2.get(1) - gregorianCalendarY.get(1);
        if (i5 > 115) {
            int i6 = p + 29;
            q = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (gregorianCalendarY2.get(2) + 1 < gregorianCalendarY.get(2) + 1) {
            int i7 = p + 13;
            q = i7 % 128;
            if (i7 % 2 != 0) {
                gregorianCalendarY.get(5);
                gregorianCalendarY2.get(2);
                i5 += 80;
            } else {
                gregorianCalendarY.get(2);
                gregorianCalendarY2.get(2);
                i5--;
            }
        } else {
            gregorianCalendarY2.get(2);
            gregorianCalendarY.get(2);
        }
        this.aP.setText(this.aP.getText().toString());
        return i5;
    }

    public final boolean A(double d, boolean z, boolean z2, boolean z3, String str) {
        int i = 2 % 2;
        if (z2) {
            int i2 = q;
            int i3 = i2 + 119;
            p = i3 % 128;
            int i4 = i3 % 2;
            if (z3) {
                if (d <= this.aC) {
                    return J(z, str);
                }
            } else if (d < this.aC) {
                int i5 = i2 + 77;
                p = i5 % 128;
                if (i5 % 2 != 0) {
                    return J(z, str);
                }
                J(z, str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else if (!(!z3)) {
            int i6 = q + 73;
            p = i6 % 128;
            int i7 = i6 % 2;
            if (d >= this.aC) {
                return J(z, str);
            }
        } else if (d > this.aC) {
            boolean zJ = J(z, str);
            int i8 = p + 81;
            q = i8 % 128;
            int i9 = i8 % 2;
            return zJ;
        }
        return true;
    }

    public class OooO0O0 implements J {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ int c;

        public OooO0O0(int i) {
            this.c = i;
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int optionId;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 13;
            int i4 = (i2 | 13) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
            updateRosterActivity.bk = arrayList;
            BISPApplication bISPApplication = updateRosterActivity.ag;
            int i8 = b;
            int i9 = i8 & 13;
            int i10 = (i8 ^ 13) | i9;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            bISPApplication.L = arrayList;
            updateRosterActivity.aM.setEnabled(true);
            int i13 = a;
            int i14 = i13 ^ 11;
            int i15 = ((i13 & 11) | i14) << 1;
            int i16 = -i14;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 0;
            int i20 = 0;
            while (i20 < UpdateRosterActivity.this.bk.size()) {
                int i21 = a + 31;
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    optionId = UpdateRosterActivity.this.bk.get(i20).getOptionId();
                    int i22 = 5 / 0;
                } else {
                    optionId = UpdateRosterActivity.this.bk.get(i20).getOptionId();
                }
                if (optionId == this.c) {
                    int i23 = a;
                    int i24 = (i23 & (-108)) | ((~i23) & 107);
                    int i25 = -(-((i23 & 107) << 1));
                    int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 22 / 0;
                    }
                    i19 = i20;
                    break;
                }
                int i28 = i20 ^ (-65);
                int i29 = (i20 & (-65)) << 1;
                i20 = (((i28 | i29) << 1) - (i29 ^ i28)) + 66;
                int i30 = b;
                int i31 = ((i30 ^ 14) + ((i30 & 14) << 1)) - 1;
                a = i31 % 128;
                int i32 = i31 % 2;
            }
            UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
            ArrayList<Item> arrayList2 = updateRosterActivity2.bk;
            int i33 = a;
            int i34 = (((i33 & (-24)) | ((~i33) & 23)) - (~((i33 & 23) << 1))) - 1;
            b = i34 % 128;
            int i35 = i34 % 2;
            updateRosterActivity2.I(arrayList2, updateRosterActivity2.aM);
            int i36 = b;
            int i37 = (i36 & 103) + (i36 | 103);
            a = i37 % 128;
            int i38 = i37 % 2;
            UpdateRosterActivity.this.aM.setSelection(i19);
            int i39 = a + 25;
            b = i39 % 128;
            if (i39 % 2 != 0) {
                throw null;
            }
        }
    }

    public class OooO0o implements J {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ int c;

        public OooO0o(int i) {
            this.c = i;
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 ^ 99) + ((i3 & 99) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
            updateRosterActivity.aZ = arrayList;
            updateRosterActivity.ag.M = arrayList;
            int i6 = a;
            int i7 = i6 ^ 109;
            int i8 = (i6 & 109) << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                updateRosterActivity.aV.setEnabled(true);
                i = 1;
            } else {
                updateRosterActivity.aV.setEnabled(true);
                i = 0;
            }
            int i10 = a + 109;
            b = i10 % 128;
            int i11 = i10 % 2;
            while (true) {
                if (i >= UpdateRosterActivity.this.aZ.size()) {
                    i = 0;
                    break;
                }
                int i12 = a;
                int i13 = (i12 & 61) + (i12 | 61);
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    UpdateRosterActivity.this.aZ.get(i).getOptionId();
                    throw null;
                }
                if (UpdateRosterActivity.this.aZ.get(i).getOptionId() == this.c) {
                    int i14 = b;
                    int i15 = i14 ^ 15;
                    int i16 = ((i14 & 15) | i15) << 1;
                    int i17 = -i15;
                    int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                    a = i18 % 128;
                    if (i18 % 2 == 0) {
                        break;
                    }
                    int i19 = 97 / 0;
                    break;
                }
                i = ((i & 1) << 1) + (i ^ 1);
                int i20 = a;
                int i21 = ((i20 & (-70)) | ((~i20) & 69)) + ((i20 & 69) << 1);
                b = i21 % 128;
                int i22 = i21 % 2;
            }
            UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
            ArrayList<Item> arrayList2 = updateRosterActivity2.aZ;
            int i23 = b;
            int i24 = ((i23 | 125) << 1) - (i23 ^ 125);
            a = i24 % 128;
            if (i24 % 2 != 0) {
                updateRosterActivity2.I(arrayList2, updateRosterActivity2.aV);
                int i25 = 53 / 0;
            } else {
                updateRosterActivity2.I(arrayList2, updateRosterActivity2.aV);
            }
            UpdateRosterActivity.this.aV.setSelection(i);
            int i26 = b;
            int i27 = (i26 & (-86)) | ((~i26) & 85);
            int i28 = -(-((i26 & 85) << 1));
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            a = i29 % 128;
            int i30 = i29 % 2;
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
            int i4 = ((i3 | 99) << 1) - (i3 ^ 99);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                UpdateRosterActivity.this.bu.isShowing();
                throw null;
            }
            if (!(!UpdateRosterActivity.this.bu.isShowing())) {
                UpdateRosterActivity.this.bu.dismiss();
                int i5 = a;
                int i6 = (((i5 | 16) << 1) - (i5 ^ 16)) - 1;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 3;
                }
            }
            dialogInterface.dismiss();
            UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
            String str = updateRosterActivity.bo;
            int i8 = b + 45;
            a = i8 % 128;
            int i9 = i8 % 2;
            UpdateRosterActivity.v(updateRosterActivity, str);
            int i10 = b;
            int i11 = i10 & 69;
            int i12 = -(-((i10 ^ 69) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }
    }

    public class OooO0OO implements J {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ int c;

        public OooO0OO(int i) {
            this.c = i;
        }

        @Override // ivas.gov.bisp.enumeration.W.J
        public void fillList(ArrayList<Item> arrayList) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 3;
            int i4 = ((i2 & 3) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
            updateRosterActivity.aX = arrayList;
            int i8 = b;
            int i9 = (i8 & 19) + (i8 | 19);
            a = i9 % 128;
            int i10 = i9 % 2;
            updateRosterActivity.ag.O = arrayList;
            Spinner spinner = updateRosterActivity.aN;
            int i11 = a;
            int i12 = (((i11 & (-66)) | ((~i11) & 65)) - (~((i11 & 65) << 1))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            spinner.setEnabled(true);
            int i14 = a;
            int i15 = (((i14 | 46) << 1) - (i14 ^ 46)) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 0;
            int i18 = 0;
            while (i18 < UpdateRosterActivity.this.aX.size()) {
                int i19 = a;
                int i20 = i19 & 13;
                int i21 = i19 | 13;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                b = i22 % 128;
                int i23 = i22 % 2;
                Item item = UpdateRosterActivity.this.aX.get(i18);
                int i24 = a;
                int i25 = ((i24 & (-30)) | ((~i24) & 29)) + ((i24 & 29) << 1);
                b = i25 % 128;
                if (i25 % 2 == 0) {
                    int i26 = 77 / 0;
                    if (item.getOptionId() == this.c) {
                        int i27 = b;
                        int i28 = ((i27 ^ 45) | (i27 & 45)) << 1;
                        int i29 = -(((~i27) & 45) | (i27 & (-46)));
                        int i30 = (i28 & i29) + (i29 | i28);
                        a = i30 % 128;
                        int i31 = i30 % 2;
                        i17 = i18;
                        break;
                    }
                    int i32 = i18 & 1;
                    int i33 = (i18 ^ 1) | i32;
                    i18 = ((i32 | i33) << 1) - (i33 ^ i32);
                    int i34 = b + 125;
                    a = i34 % 128;
                    int i35 = i34 % 2;
                } else {
                    if (item.getOptionId() == this.c) {
                        int i210 = b;
                        int i211 = ((i210 ^ 45) | (i210 & 45)) << 1;
                        int i212 = -(((~i210) & 45) | (i210 & (-46)));
                        int i36 = (i211 & i212) + (i212 | i211);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        i17 = i18;
                        break;
                    }
                    int i38 = i18 & 1;
                    int i39 = (i18 ^ 1) | i38;
                    i18 = ((i38 | i39) << 1) - (i39 ^ i38);
                    int i310 = b + 125;
                    a = i310 % 128;
                    int i311 = i310 % 2;
                }
            }
            UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
            ArrayList<Item> arrayList2 = updateRosterActivity2.aX;
            Spinner spinner2 = updateRosterActivity2.aN;
            int i40 = a;
            int i41 = i40 & 27;
            int i42 = (i40 ^ 27) | i41;
            int i43 = (i41 & i42) + (i42 | i41);
            b = i43 % 128;
            if (i43 % 2 == 0) {
                updateRosterActivity2.I(arrayList2, spinner2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            updateRosterActivity2.I(arrayList2, spinner2);
            UpdateRosterActivity.this.aN.setSelection(i17);
            int i44 = b;
            int i45 = (-2) - ((((i44 | 124) << 1) - (i44 ^ 124)) ^ (-1));
            a = i45 % 128;
            int i46 = i45 % 2;
        }
    }

    public static void w(UpdateRosterActivity updateRosterActivity, String str) {
        int i = 2 % 2;
        Objects.requireNonNull(updateRosterActivity);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(updateRosterActivity);
        View viewInflate = LayoutInflater.from(updateRosterActivity).inflate(R.layout.new_custom_dialog, (ViewGroup) updateRosterActivity.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        ((TextView) viewInflate.findViewById(R.id.tv_message)).setText(str);
        ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new aY(updateRosterActivity, bVarB));
        int i2 = q + 49;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void K(String str, String str2) {
        int i = 2 % 2;
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(this.ae);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.e = str;
        oooO0O0.f = str2;
        oooO0O0.k = false;
        Oooo0 oooo0 = new Oooo0();
        oooO0O0.h = "Retry";
        oooO0O0.i = oooo0;
        o000oOoO o000oooo = new o000oOoO();
        oooO0O0.a = "Cancel";
        oooO0O0.j = o000oooo;
        aiz.b().show();
        int i2 = q + 85;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if (r6.equalsIgnoreCase("Female") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        r5.aw.setChecked(false);
        r5.aK.setChecked(true);
        r5.ax.setChecked(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        if (r6.equalsIgnoreCase("transgender") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        r6 = ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.p + 79;
        ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.q = r6 % 128;
        r6 = r6 % 2;
        r5.aw.setChecked(false);
        r5.aK.setChecked(false);
        r5.ax.setChecked(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        r5.aw.setChecked(false);
        r5.aK.setChecked(false);
        r5.ax.setChecked(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if ((!r6.equalsIgnoreCase("Male")) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r6.equalsIgnoreCase("Male") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        r5.aw.setChecked(true);
        r5.aK.setChecked(false);
        r5.ax.setChecked(false);
        r5.aw.setEnabled(false);
        r5.aK.setEnabled(false);
        r5.ax.setEnabled(false);
        r6 = ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.p + 73;
        ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.q = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.p
            int r1 = r1 + 79
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.q = r2
            int r1 = r1 % r0
            java.lang.String r2 = "Male"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L29
            android.widget.RadioButton r1 = r5.aw
            r1.setEnabled(r4)
            android.widget.RadioButton r1 = r5.aK
            r1.setEnabled(r3)
            android.widget.RadioButton r1 = r5.ax
            r1.setEnabled(r4)
            boolean r1 = r6.equalsIgnoreCase(r2)
            r1 = r1 ^ r3
            if (r1 == 0) goto L3e
            goto L66
        L29:
            android.widget.RadioButton r1 = r5.aw
            r1.setEnabled(r4)
            android.widget.RadioButton r1 = r5.aK
            r1.setEnabled(r4)
            android.widget.RadioButton r1 = r5.ax
            r1.setEnabled(r4)
            boolean r1 = r6.equalsIgnoreCase(r2)
            if (r1 == 0) goto L66
        L3e:
            android.widget.RadioButton r6 = r5.aw
            r6.setChecked(r3)
            android.widget.RadioButton r6 = r5.aK
            r6.setChecked(r4)
            android.widget.RadioButton r6 = r5.ax
            r6.setChecked(r4)
            android.widget.RadioButton r6 = r5.aw
            r6.setEnabled(r4)
            android.widget.RadioButton r6 = r5.aK
            r6.setEnabled(r4)
            android.widget.RadioButton r6 = r5.ax
            r6.setEnabled(r4)
            int r6 = ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.p
            int r6 = r6 + 73
            int r1 = r6 % 128
            ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.q = r1
            int r6 = r6 % r0
            return
        L66:
            java.lang.String r1 = "Female"
            boolean r1 = r6.equalsIgnoreCase(r1)
            if (r1 == 0) goto L7e
            android.widget.RadioButton r6 = r5.aw
            r6.setChecked(r4)
            android.widget.RadioButton r6 = r5.aK
            r6.setChecked(r3)
            android.widget.RadioButton r6 = r5.ax
            r6.setChecked(r4)
            return
        L7e:
            java.lang.String r1 = "transgender"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L9f
            int r6 = ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.p
            int r6 = r6 + 79
            int r1 = r6 % 128
            ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.q = r1
            int r6 = r6 % r0
            android.widget.RadioButton r6 = r5.aw
            r6.setChecked(r4)
            android.widget.RadioButton r6 = r5.aK
            r6.setChecked(r4)
            android.widget.RadioButton r6 = r5.ax
            r6.setChecked(r3)
            return
        L9f:
            android.widget.RadioButton r6 = r5.aw
            r6.setChecked(r4)
            android.widget.RadioButton r6 = r5.aK
            r6.setChecked(r4)
            android.widget.RadioButton r6 = r5.ax
            r6.setChecked(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.UpdateRosterActivity.G(java.lang.String):void");
    }

    public static void u(UpdateRosterActivity updateRosterActivity, String str, boolean z) {
        int i = 2 % 2;
        Objects.requireNonNull(updateRosterActivity);
        try {
            JSONObject jSONObject = new JSONObject(b.c(str, b.b(updateRosterActivity.bg.k()), b.b(updateRosterActivity.bg.m())));
            String string = jSONObject.getString("message".toLowerCase());
            jSONObject.getString("citizen_status".toLowerCase());
            if (!string.equalsIgnoreCase("Cnic Data Found In Nadra")) {
                updateRosterActivity.aq.setEnabled(false);
                updateRosterActivity.K("Citizen Validation", "Citizen data against this member not fetched from NADRA.");
                int i2 = q + 89;
                p = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data".toLowerCase()));
            jSONObject2.getString("relation".toLowerCase());
            jSONObject2.getString("cardStatus".toLowerCase());
            jSONObject2.getString("citizenNumber".toLowerCase());
            String string2 = jSONObject2.getString("name".toLowerCase());
            String string3 = jSONObject2.getString("nameEnglish".toLowerCase());
            String string4 = jSONObject2.getString("gender".toLowerCase());
            String string5 = jSONObject2.getString("age".toLowerCase());
            String string6 = jSONObject2.getString("martial_Status".toLowerCase());
            String string7 = jSONObject2.getString("disability".toLowerCase());
            if (!string2.equalsIgnoreCase("null") && !string4.equalsIgnoreCase("null")) {
                int i4 = p + 29;
                q = i4 % 128;
                int i5 = i4 % 2;
                if (!string5.equalsIgnoreCase("null")) {
                    int i6 = q + 1;
                    p = i6 % 128;
                    int i7 = i6 % 2;
                    if (!string6.equalsIgnoreCase("null")) {
                        if (z) {
                            ArrayList<CitizenData> arrayListF = updateRosterActivity.bg.f();
                            arrayListF.add(new CitizenData(updateRosterActivity.bo, str));
                            updateRosterActivity.bg.C(arrayListF);
                            int i8 = q + 13;
                            p = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        updateRosterActivity.aA.setText(string2);
                        if (string3 != null && !TextUtils.isEmpty(string3) && !string3.equals("null")) {
                            int i10 = p + 45;
                            q = i10 % 128;
                            int i11 = i10 % 2;
                            updateRosterActivity.ar.setText(string3);
                            updateRosterActivity.ar.setEnabled(false);
                        }
                        updateRosterActivity.G(string4);
                        updateRosterActivity.aP.setText(string5);
                        try {
                            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(updateRosterActivity.aP.getText().toString());
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(date.getTime());
                            double dB = updateRosterActivity.B(calendar.get(5), calendar.get(2), calendar.get(1));
                            updateRosterActivity.aC = dB;
                            updateRosterActivity.E(dB);
                        } catch (ParseException unused) {
                        }
                        updateRosterActivity.aP.setEnabled(false);
                        if (string6.equalsIgnoreCase("Widowed")) {
                            int i12 = q + 71;
                            p = i12 % 128;
                            if (i12 % 2 == 0) {
                                updateRosterActivity.bh.setSelection(4);
                                updateRosterActivity.bh.setEnabled(true);
                            } else {
                                updateRosterActivity.bh.setSelection(3);
                                updateRosterActivity.bh.setEnabled(false);
                            }
                        } else if (string6.equalsIgnoreCase("Married")) {
                            updateRosterActivity.bh.setSelection(2);
                            updateRosterActivity.bh.setEnabled(false);
                        } else if (string6.equalsIgnoreCase("Unmarried")) {
                            updateRosterActivity.bh.setSelection(1);
                            updateRosterActivity.bh.setEnabled(false);
                        } else if (!string6.equalsIgnoreCase("divorced")) {
                            updateRosterActivity.bh.setEnabled(true);
                        } else {
                            updateRosterActivity.bh.setSelection(4);
                            updateRosterActivity.bh.setEnabled(false);
                        }
                        if (string7.equalsIgnoreCase("f")) {
                            updateRosterActivity.aE.setSelection(1);
                            updateRosterActivity.aE.setEnabled(false);
                        } else {
                            updateRosterActivity.aE.setSelection(0);
                            updateRosterActivity.aE.setEnabled(true);
                        }
                        updateRosterActivity.C(updateRosterActivity.be, true);
                        return;
                    }
                }
            }
            updateRosterActivity.K("Citizen Validation", "Citizen data against this member not fetched from NADRA.");
        } catch (Exception unused2) {
        }
    }

    public void E(double d) {
        int i = 2 % 2;
        int i2 = p + 85;
        q = i2 % 128;
        int i3 = i2 % 2;
        if (d < 17.0d) {
            this.bh.setSelection(0);
        }
        if (this.av.getCheckedRadioButtonId() == this.aw.getId()) {
            if (d < 13.0d) {
                this.bh.setVisibility(8);
            } else {
                this.bh.setVisibility(0);
            }
        } else if (this.av.getCheckedRadioButtonId() == this.aK.getId()) {
            if (d < 10.0d) {
                int i4 = p + 31;
                q = i4 % 128;
                int i5 = i4 % 2;
                this.bh.setVisibility(8);
            } else {
                this.bh.setVisibility(0);
            }
        }
        if (d >= 4.0d) {
            this.aF.setVisibility(0);
            this.aG.setVisibility(0);
        } else {
            this.aF.setVisibility(8);
            this.aG.setVisibility(8);
        }
        this.aI.setChecked(false);
        this.aH.setChecked(false);
        this.aG.clearCheck();
        if (d >= 4.0d) {
            this.aJ.setVisibility(0);
            if (this.aJ.getSelectedItemPosition() == 2 || this.aJ.getSelectedItemPosition() == 3) {
                this.aM.setVisibility(0);
            } else {
                this.aM.setVisibility(8);
            }
        } else {
            this.aJ.setVisibility(8);
            this.aM.setVisibility(8);
        }
        new au(this, "highest_completed_education", getResources().getString(R.string.education_level), this.aM, "education_update", new aX(this, d)).execute(new Void[0]);
        if (d < 10.0d) {
            int i6 = q + 47;
            p = i6 % 128;
            int i7 = i6 % 2;
            this.aN.setVisibility(8);
            this.aN.setSelection(0);
            this.aV.setVisibility(8);
            this.aV.setSelection(0);
            this.aQ.setVisibility(8);
            this.aR.setVisibility(8);
        } else {
            this.aN.setVisibility(0);
            this.aN.setSelection(0);
            this.aV.setVisibility(0);
            this.aV.setSelection(0);
        }
        int i8 = this.ac;
        if ((i8 == 1 || i8 == 2 || ag.d) && ag.j == 1) {
            if (d < 18.0d) {
                this.az.setVisibility(8);
                return;
            }
            if (this.av.getCheckedRadioButtonId() != this.aK.getId()) {
                this.az.setVisibility(8);
            } else if (this.bh.getSelectedItemPosition() == 0 || this.bh.getSelectedItemPosition() == 1) {
                this.az.setVisibility(8);
            } else {
                this.az.setVisibility(0);
            }
        }
    }

    public Boolean L() {
        double d;
        int i = 2 % 2;
        try {
            if (!this.ar.getText().toString().trim().equals(BuildConfig.FLAVOR) && !this.ar.getText().toString().trim().equals("null")) {
                boolean z = false;
                if (this.ay.getCheckedRadioButtonId() != this.ay.getChildAt(0).getId()) {
                    int i2 = q + 37;
                    p = i2 % 128;
                    int i3 = i2 % 2;
                    if (this.ay.getCheckedRadioButtonId() != this.ay.getChildAt(1).getId()) {
                        z.m(this.ae, this.ay, "Bank Details");
                        return Boolean.FALSE;
                    }
                }
                if (this.aG.getCheckedRadioButtonId() == this.aH.getId()) {
                    this.aJ.setSelection(1);
                }
                if (this.ay.getCheckedRadioButtonId() == this.an.getId()) {
                    if (this.aL.getSelectedItemPosition() == 0) {
                        z.o(this.ae, this.aL, "Bank Name");
                        return Boolean.FALSE;
                    }
                    if (this.at.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                        z.k(this.ae, this.at, "Account Title");
                        return Boolean.FALSE;
                    }
                    if (this.aL.getSelectedItem().toString().contains("Telenor") && this.aL.getSelectedItem().toString().contains("Mobilink") && this.aL.getSelectedItem().toString().contains("U-Paisa")) {
                        if (this.ao.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                            z.k(this.ae, this.ao, "Account Number");
                            return Boolean.FALSE;
                        }
                    } else if (this.as.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                        z.k(this.ae, this.as, "Account Number");
                        return Boolean.FALSE;
                    }
                }
                if (this.au.getSelectedItemPosition() == 0) {
                    z.o(this.ae, this.au, "or enter Relation to Household");
                    return Boolean.FALSE;
                }
                if (this.av.getCheckedRadioButtonId() != this.av.getChildAt(0).getId()) {
                    int i4 = q + 79;
                    p = i4 % 128;
                    int i5 = i4 % 2;
                    if (this.av.getCheckedRadioButtonId() != this.av.getChildAt(1).getId() && this.av.getCheckedRadioButtonId() != this.av.getChildAt(2).getId()) {
                        z.m(this.ae, this.av, "Gender");
                        return Boolean.FALSE;
                    }
                }
                if (!this.aP.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                    int i6 = p + 77;
                    q = i6 % 128;
                    int i7 = i6 % 2;
                    if (!this.aP.getText().toString().trim().equals("null")) {
                        if (!this.bj.getText().toString().trim().equals(BuildConfig.FLAVOR) && this.bj.getText().toString().trim().length() == 13) {
                            if (!this.bj.getText().toString().trim().equals(this.ap.getText().toString().trim())) {
                                z.k(this.ae, this.ap, "same CNIC number again");
                                return Boolean.FALSE;
                            }
                            if (!ac.c(this.bo.trim().replaceAll("-", BuildConfig.FLAVOR)) && !ac.i(this.bo.trim().replaceAll("-", BuildConfig.FLAVOR)) && !ac.d(this.bo.trim().replaceAll("-", BuildConfig.FLAVOR))) {
                                ah.c().d("batchSize", 1);
                                if (this.ag.A() != null && this.ag.A().size() > 0) {
                                    for (int i8 = 0; i8 < this.ag.A().size(); i8++) {
                                        this.ag.A().get(i8).getCnic().equals(this.bo);
                                    }
                                }
                                if (this.av.getCheckedRadioButtonId() == this.aw.getId()) {
                                    if (this.aC >= 13.0d && this.bh.getSelectedItemPosition() == 0) {
                                        z.o(this.ae, this.bh, " marital status");
                                        return Boolean.FALSE;
                                    }
                                } else if (this.av.getCheckedRadioButtonId() == this.aK.getId() && this.aC >= 10.0d && this.bh.getSelectedItemPosition() == 0) {
                                    z.o(this.ae, this.bh, " marital status");
                                    return Boolean.FALSE;
                                }
                                if (this.aE.getSelectedItemPosition() == 0) {
                                    z.o(this.ae, this.aE, "Disability");
                                    return Boolean.FALSE;
                                }
                                if (this.aD.getSelectedItemPosition() == 0) {
                                    z.o(this.ae, this.aD, "Chronic Disease");
                                    return Boolean.FALSE;
                                }
                                Object obj = null;
                                if (this.aC >= 4.0d) {
                                    if (this.aJ.getVisibility() == 0) {
                                        int i9 = q + 63;
                                        p = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            this.aJ.getSelectedItemPosition();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        if (this.aJ.getSelectedItemPosition() == 0) {
                                            z.o(this.ae, this.aJ, "attended school");
                                            return Boolean.FALSE;
                                        }
                                    } else {
                                        runOnUiThread(new OooOOO0());
                                    }
                                    if (this.aM.getVisibility() != 0) {
                                        runOnUiThread(new OooOOO());
                                    } else if (this.aM.getSelectedItemPosition() == 0) {
                                        z.o(this.ae, this.aM, "Higher Education");
                                        return Boolean.FALSE;
                                    }
                                }
                                if (this.aC >= 4.0d) {
                                    if (!z.m(this.ae, this.aG, "Language")) {
                                        return Boolean.FALSE;
                                    }
                                    if (this.aN.getVisibility() != 0) {
                                        runOnUiThread(new OooOOOO());
                                    } else if (this.aN.getSelectedItemPosition() == 0) {
                                        int i10 = q + 77;
                                        p = i10 % 128;
                                        int i11 = i10 % 2;
                                        z.o(this.ae, this.aN, "Work Activity");
                                        return Boolean.FALSE;
                                    }
                                    if (this.aR.getVisibility() != 0) {
                                        runOnUiThread(new OooOo00());
                                    } else {
                                        if (this.aR.getText().toString().trim().equals(BuildConfig.FLAVOR)) {
                                            z.k(this.ae, this.aR, "Hours worked");
                                            return Boolean.FALSE;
                                        }
                                        if (Integer.parseInt(this.aR.getText().toString().trim()) > 84.0d) {
                                            z.l(this.ae, this.aR, "No. of work hours cannot be more than 84.0");
                                            return Boolean.FALSE;
                                        }
                                    }
                                    if (this.aV.getVisibility() != 0) {
                                        runOnUiThread(new OooOo());
                                    } else if (this.aV.getSelectedItemPosition() == 0) {
                                        z.o(this.ae, this.aV, "Employment Status");
                                        return Boolean.FALSE;
                                    }
                                }
                                if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 186) {
                                    if (!this.aS.getText().toString().equals(this.aU.getText().toString())) {
                                        z.l(this.ae, this.aS, "Mobile number not matched");
                                        z.l(this.ae, this.aU, "Mobile number not matched");
                                        return Boolean.FALSE;
                                    }
                                    if (this.aS.getText().toString().length() == 11) {
                                        int i12 = p + 7;
                                        q = i12 % 128;
                                        int i13 = i12 % 2;
                                        if (this.aU.getText().toString().length() == 11) {
                                            if (this.aO.getVisibility() == 0) {
                                                int i14 = p + 93;
                                                q = i14 % 128;
                                                if (i14 % 2 != 0) {
                                                    this.aO.getSelectedItemPosition();
                                                    throw null;
                                                }
                                                if (this.aO.getSelectedItemPosition() == 0) {
                                                    z.o(this.ae, this.aO, "Please Select Network");
                                                    return Boolean.FALSE;
                                                }
                                            } else {
                                                runOnUiThread(new Oooo000());
                                            }
                                        }
                                    }
                                    z.l(this.ae, this.aS, "Mobile number not correct");
                                    z.l(this.ae, this.aU, "Mobile number not correct");
                                    return Boolean.FALSE;
                                }
                                if (this.bp.equals("female") && this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 271) {
                                    Toast.makeText(this.ag, "Female can't be husband", 0).show();
                                    return Boolean.FALSE;
                                }
                                if (ag.g) {
                                    int i15 = p + 25;
                                    q = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        this.ag.A();
                                        throw null;
                                    }
                                    if (this.ag.A() == null || this.ag.A().size() <= 0) {
                                        d = -1.0d;
                                        break;
                                    }
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= this.ag.A().size()) {
                                            d = -1.0d;
                                            break;
                                        }
                                        if (this.ag.A().get(i16).getRelationToHouseholdHead() == 186) {
                                            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this.ag.A().get(i16).getDob());
                                            String str = new SimpleDateFormat("dd").format(date);
                                            new SimpleDateFormat("MMM").format(date);
                                            double dB = B(Integer.parseInt(str), Integer.parseInt(new SimpleDateFormat("MM").format(date)), Integer.parseInt(new SimpleDateFormat("yyyy").format(date)));
                                            this.aC = dB;
                                            d = dB;
                                            break;
                                        }
                                        i16++;
                                    }
                                    if (d != -1.0d) {
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 190) {
                                            return Boolean.valueOf(A(d, true, false, true, getString(R.string.age_mother_father)));
                                        }
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 271) {
                                            return Boolean.valueOf(A(d, false, false, false, getString(R.string.age_husband)));
                                        }
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 273) {
                                            return Boolean.valueOf(A(d, true, true, true, getString(R.string.age_son_daughter)));
                                        }
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 274) {
                                            return Boolean.valueOf(A(d, false, true, false, getString(R.string.age_step_son_daughter)));
                                        }
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 189) {
                                            return Boolean.valueOf(A(d, true, true, true, getString(R.string.age_grand_child)));
                                        }
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 192) {
                                            int i17 = p + 29;
                                            q = i17 % 128;
                                            if (i17 % 2 != 0) {
                                                return Boolean.valueOf(A(d, true, true, false, getString(R.string.age_nephew_niece)));
                                            }
                                            return Boolean.valueOf(A(d, false, true, false, getString(R.string.age_nephew_niece)));
                                        }
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 193) {
                                            return Boolean.valueOf(A(d, false, true, false, getString(R.string.age_son_daughter_in_law)));
                                        }
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 195) {
                                            return Boolean.valueOf(A(d, false, false, false, getString(R.string.age_mother_father_in_law)));
                                        }
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 196) {
                                            int i18 = p + 87;
                                            q = i18 % 128;
                                            int i19 = i18 % 2;
                                            boolean zA = A(d, true, false, true, getString(R.string.age_grand_mother_father));
                                            if (!zA || this.aC - d >= 20.0d) {
                                                z = zA;
                                            } else {
                                                J(true, getString(R.string.age_grand_mother_father_20));
                                            }
                                            return Boolean.valueOf(z);
                                        }
                                        if (this.aY.get(this.au.getSelectedItemPosition()).getOptionId() == 197) {
                                            return Boolean.valueOf(A(d, false, false, false, getString(R.string.age_uncle_aunt)));
                                        }
                                    }
                                }
                                return Boolean.TRUE;
                            }
                            z.k(this.ae, this.ap, "valid CNIC number");
                            return Boolean.FALSE;
                        }
                        z.k(this.ae, this.bj, "CNIC");
                        return Boolean.FALSE;
                    }
                }
                z.n(this.ae, "Please select date of birth");
                return Boolean.FALSE;
            }
            z.k(this.ae, this.ar, "Member Name");
            return Boolean.FALSE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public class OooOO0 implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char a$s76$35 = 13696;
        private static char b$s75$35 = 38758;
        private static int c = 0;
        private static char c$s74$35 = 34869;
        private static int d = 1;
        private static char d$s73$35 = 63810;

        public class OooO00o implements DialogInterface.OnClickListener {
            private static int a = 1;
            private static int b;

            public OooO00o(OooOO0 oooOO0) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 & 83;
                int i5 = (i3 ^ 83) | i4;
                int i6 = (i4 & i5) + (i5 | i4);
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    dialogInterface.cancel();
                    dialogInterface.dismiss();
                    throw null;
                }
                dialogInterface.cancel();
                dialogInterface.dismiss();
                int i7 = b + 126;
                int i8 = (i7 ^ (-1)) + (i7 << 1);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 71 / 0;
                }
            }
        }

        public OooOO0() {
        }

        /* JADX WARN: Code duplicated, block: B:52:0x017e A[Catch: Exception -> 0x0540, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x018e A[Catch: Exception -> 0x0540, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0194 A[Catch: Exception -> 0x0540, TRY_LEAVE, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x01a4 A[Catch: Exception -> 0x0540, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x01ab A[Catch: Exception -> 0x0540, TRY_ENTER, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x01b9 A[Catch: Exception -> 0x0540, TRY_LEAVE, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:69:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:71:0x01d8 A[Catch: Exception -> 0x0540, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x0218  */
        /* JADX WARN: Code duplicated, block: B:77:0x0226 A[Catch: Exception -> 0x0572, TryCatch #2 {Exception -> 0x0572, blocks: (B:73:0x01f2, B:76:0x0221, B:81:0x023d, B:84:0x0431, B:86:0x0474, B:85:0x0465, B:77:0x0226, B:79:0x0234, B:80:0x0239), top: B:113:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x0234 A[Catch: Exception -> 0x0572, TryCatch #2 {Exception -> 0x0572, blocks: (B:73:0x01f2, B:76:0x0221, B:81:0x023d, B:84:0x0431, B:86:0x0474, B:85:0x0465, B:77:0x0226, B:79:0x0234, B:80:0x0239), top: B:113:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:80:0x0239 A[Catch: Exception -> 0x0572, TryCatch #2 {Exception -> 0x0572, blocks: (B:73:0x01f2, B:76:0x0221, B:81:0x023d, B:84:0x0431, B:86:0x0474, B:85:0x0465, B:77:0x0226, B:79:0x0234, B:80:0x0239), top: B:113:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x0431 A[Catch: Exception -> 0x0572, TRY_ENTER, TryCatch #2 {Exception -> 0x0572, blocks: (B:73:0x01f2, B:76:0x0221, B:81:0x023d, B:84:0x0431, B:86:0x0474, B:85:0x0465, B:77:0x0226, B:79:0x0234, B:80:0x0239), top: B:113:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0465 A[Catch: Exception -> 0x0572, TryCatch #2 {Exception -> 0x0572, blocks: (B:73:0x01f2, B:76:0x0221, B:81:0x023d, B:84:0x0431, B:86:0x0474, B:85:0x0465, B:77:0x0226, B:79:0x0234, B:80:0x0239), top: B:113:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x04ff A[Catch: Exception -> 0x0540, TRY_ENTER, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0507 A[Catch: Exception -> 0x0540, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0514 A[Catch: Exception -> 0x0540, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        /* JADX WARN: Code duplicated, block: B:94:0x051c A[Catch: Exception -> 0x0540, TryCatch #0 {Exception -> 0x0540, blocks: (B:38:0x0142, B:42:0x0157, B:44:0x0167, B:92:0x0514, B:94:0x051c, B:95:0x0521, B:52:0x017e, B:54:0x018e, B:56:0x0194, B:59:0x01a4, B:66:0x01c1, B:70:0x01d5, B:72:0x01e8, B:71:0x01d8, B:61:0x01ab, B:63:0x01b9, B:88:0x04ff, B:90:0x0507, B:91:0x050c, B:50:0x016e, B:96:0x052b, B:98:0x0533, B:99:0x0538), top: B:110:0x0142 }] */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            String relationToHouseholdHeadName;
            String str;
            JSONObject jSONObject;
            int i2 = 2 % 2;
            int i3 = d + 49;
            c = i3 % 128;
            int i4 = i3 % 2;
            int size = UpdateRosterActivity.this.ag.N.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    relationToHouseholdHeadName = null;
                    break;
                }
                UpdateRosterActivity updateRosterActivity = UpdateRosterActivity.this;
                if (i5 != updateRosterActivity.bb) {
                    int i6 = d + 9;
                    c = i6 % 128;
                    if (i6 % 2 != 0) {
                        if (updateRosterActivity.ag.N.get(i5).getRelationToHouseholdHead() == 11560) {
                            int i7 = d + 109;
                            c = i7 % 128;
                            int i8 = i7 % 2;
                            relationToHouseholdHeadName = UpdateRosterActivity.this.ag.N.get(i5).getRelationToHouseholdHeadName();
                            ag.i = relationToHouseholdHeadName;
                            z = true;
                            break;
                        }
                    } else if (updateRosterActivity.ag.N.get(i5).getRelationToHouseholdHead() == 186) {
                        int i9 = d + 109;
                        c = i9 % 128;
                        int i10 = i9 % 2;
                        relationToHouseholdHeadName = UpdateRosterActivity.this.ag.N.get(i5).getRelationToHouseholdHeadName();
                        ag.i = relationToHouseholdHeadName;
                        z = true;
                        break;
                    }
                }
                i5++;
            }
            UpdateRosterActivity updateRosterActivity2 = UpdateRosterActivity.this;
            if (updateRosterActivity2.aY.get(updateRosterActivity2.au.getSelectedItemPosition()).getOptionId() == 186 && z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(UpdateRosterActivity.this.ae);
                builder.setTitle("Alert.!");
                StringBuilder sb = new StringBuilder();
                sb.append("HouseHold is already exist on ");
                sb.append(relationToHouseholdHeadName);
                sb.append(" \nPlease Change HouseHold Status First");
                builder.setMessage(sb.toString());
                builder.setCancelable(true);
                builder.setPositiveButton("ok", new OooO00o(this));
                builder.create().show();
            } else {
                UpdateRosterActivity.this.L();
                if (UpdateRosterActivity.this.L().booleanValue()) {
                    UpdateRosterActivity updateRosterActivity3 = UpdateRosterActivity.this;
                    ProgressDialog progressDialog = updateRosterActivity3.bu;
                    if (progressDialog != null) {
                        int i11 = c + 73;
                        d = i11 % 128;
                        if (i11 % 2 == 0) {
                            progressDialog.isShowing();
                            throw null;
                        }
                        if (progressDialog.isShowing()) {
                            int i12 = d + 21;
                            c = i12 % 128;
                            if (i12 % 2 != 0) {
                                UpdateRosterActivity.this.bu.dismiss();
                                throw null;
                            }
                            UpdateRosterActivity.this.bu.dismiss();
                        }
                    } else {
                        updateRosterActivity3.bu = new ProgressDialog(UpdateRosterActivity.this);
                    }
                    UpdateRosterActivity.this.bu.setCancelable(false);
                    UpdateRosterActivity.this.bu.setMessage("Please Wait...");
                    UpdateRosterActivity.this.bu.setProgressStyle(0);
                    UpdateRosterActivity.this.bu.show();
                    UpdateRosterActivity updateRosterActivity4 = UpdateRosterActivity.this;
                    Objects.requireNonNull(updateRosterActivity4);
                    try {
                        if (updateRosterActivity4.L().booleanValue()) {
                            int i13 = d + 59;
                            c = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i14 = 45 / 0;
                                if (updateRosterActivity4.bj.getText().toString().length() <= 0) {
                                    if (updateRosterActivity4.bu.isShowing()) {
                                        updateRosterActivity4.bu.dismiss();
                                    }
                                    z.k(updateRosterActivity4.ae, updateRosterActivity4.bj, "CNIC");
                                } else if (updateRosterActivity4.aA.getText().toString().length() > 0) {
                                    if (updateRosterActivity4.bu.isShowing()) {
                                        updateRosterActivity4.bu.dismiss();
                                    }
                                    z.n(updateRosterActivity4.ae, "Please Validate CNIC");
                                } else if (ax.c(updateRosterActivity4)) {
                                    if (updateRosterActivity4.aG.getCheckedRadioButtonId() == updateRosterActivity4.aI.getId()) {
                                        updateRosterActivity4.bD = Boolean.TRUE;
                                        str = "1";
                                    } else if (updateRosterActivity4.aG.getCheckedRadioButtonId() == updateRosterActivity4.aH.getId()) {
                                        updateRosterActivity4.bD = Boolean.FALSE;
                                        str = "0";
                                    } else {
                                        str = BuildConfig.FLAVOR;
                                    }
                                    if (updateRosterActivity4.aR.getVisibility() == 8) {
                                        int i15 = d + 65;
                                        c = i15 % 128;
                                        int i16 = i15 % 2;
                                        updateRosterActivity4.ah = -1;
                                    } else {
                                        updateRosterActivity4.ah = Integer.parseInt(updateRosterActivity4.aR.getText().toString());
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    JSONObject jSONObject3 = new JSONObject();
                                    try {
                                        String ipAddress = Formatter.formatIpAddress(((WifiManager) updateRosterActivity4.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
                                        if (updateRosterActivity4.av.getCheckedRadioButtonId() == updateRosterActivity4.aw.getId()) {
                                            int i17 = d + 89;
                                            c = i17 % 128;
                                            int i18 = i17 % 2;
                                            updateRosterActivity4.bp = "male";
                                        } else if (updateRosterActivity4.av.getCheckedRadioButtonId() == updateRosterActivity4.aK.getId()) {
                                            updateRosterActivity4.bp = "female";
                                        } else {
                                            updateRosterActivity4.bp = "transgender";
                                        }
                                        jSONObject2.put("house_hold_id", updateRosterActivity4.bC);
                                        jSONObject2.put("is_pmt", 0);
                                        jSONObject2.put("type", "update_roster");
                                        updateRosterActivity4.ag = (BISPApplication) updateRosterActivity4.getApplicationContext();
                                        JSONArray jSONArray = new JSONArray();
                                        jSONObject = new JSONObject();
                                        jSONObject.put("rId", updateRosterActivity4.aj);
                                        jSONObject.put("cnicEnc", updateRosterActivity4.bo);
                                        jSONObject.put("cnic", updateRosterActivity4.bo);
                                        jSONObject.put("hhMemberNames", updateRosterActivity4.ar.getText().toString());
                                        jSONObject.put("hhMemberNamesEnc", updateRosterActivity4.ar.getText().toString());
                                        jSONObject.put("hhMemberUrduName", updateRosterActivity4.aA.getText().toString());
                                        jSONObject.put("dob", updateRosterActivity4.aP.getText().toString());
                                        jSONObject.put("age", updateRosterActivity4.aC);
                                        jSONObject.put("maritalStatus", updateRosterActivity4.bl.get(updateRosterActivity4.bh.getSelectedItemPosition()).getOption());
                                        jSONObject.put("maritalStatusCode", updateRosterActivity4.bl.get(updateRosterActivity4.bh.getSelectedItemPosition()).getOptionId());
                                        jSONObject.put("gender", updateRosterActivity4.bp);
                                        jSONObject.put("relationToHhHead", updateRosterActivity4.aY.get(updateRosterActivity4.au.getSelectedItemPosition()).getOptionId());
                                        jSONObject.put("formNo", updateRosterActivity4.bq);
                                        jSONObject.put("disabilityStatus", updateRosterActivity4.bd.get(updateRosterActivity4.aE.getSelectedItemPosition()).getOption());
                                        jSONObject.put("disabilityCode", updateRosterActivity4.bd.get(updateRosterActivity4.aE.getSelectedItemPosition()).getOptionId());
                                        jSONObject.put("havingChronicDiseaseCode", updateRosterActivity4.bm.get(updateRosterActivity4.aD.getSelectedItemPosition()).getOptionId());
                                        jSONObject.put("isLiterate", str);
                                        jSONObject.put("goneToSchoolCode", updateRosterActivity4.ba.get(updateRosterActivity4.aJ.getSelectedItemPosition()).getOptionId());
                                        jSONObject.put("educationLevelCode", updateRosterActivity4.bk.get(updateRosterActivity4.aM.getSelectedItemPosition()).getOptionId());
                                        jSONObject.put("workStatusCode", updateRosterActivity4.aX.get(updateRosterActivity4.aN.getSelectedItemPosition()).getOptionId());
                                        jSONObject.put("workStatus", updateRosterActivity4.aX.get(updateRosterActivity4.aN.getSelectedItemPosition()).getOption());
                                        jSONObject.put("lastWeekWorkingHours", updateRosterActivity4.ah);
                                        jSONObject.put("employmentCode", updateRosterActivity4.aZ.get(updateRosterActivity4.aV.getSelectedItemPosition()).getOptionId());
                                        jSONObject.put("employmentStatus", updateRosterActivity4.aZ.get(updateRosterActivity4.aV.getSelectedItemPosition()).getOption());
                                        jSONObject.put("endBy", updateRosterActivity4.bg.z());
                                        jSONObject.put("endByIp", ipAddress);
                                        jSONObject.put("mobile_network_name", updateRosterActivity4.aO.getSelectedItem());
                                        jSONObject.put("mobile_no", updateRosterActivity4.aS.getText().toString());
                                        jSONObject.put("update_type", "update_roster");
                                        if (updateRosterActivity4.ay.getCheckedRadioButtonId() != updateRosterActivity4.ay.getChildAt(1).getId()) {
                                            jSONObject.put("banks_name", updateRosterActivity4.aL.getSelectedItem());
                                            jSONObject.put("branch_code", 0);
                                            jSONObject.put("bank_address", updateRosterActivity4.ao.getText().toString());
                                            jSONObject.put("account_title", updateRosterActivity4.at.getText().toString());
                                            jSONObject.put("account_number", updateRosterActivity4.as.getText().toString());
                                        } else {
                                            jSONObject.put("banks_name", BuildConfig.FLAVOR);
                                            jSONObject.put("branch_code", 0);
                                            jSONObject.put("bank_address", BuildConfig.FLAVOR);
                                            jSONObject.put("account_title", BuildConfig.FLAVOR);
                                            jSONObject.put("account_number", BuildConfig.FLAVOR);
                                        }
                                        jSONArray.put(0, jSONObject);
                                        jSONObject2.put("rosterList", jSONArray);
                                        jSONObject3.put("string1", b.d(jSONObject2.toString(), b.b(updateRosterActivity4.bg.k()), b.b(updateRosterActivity4.bg.m())));
                                        byte[] bArrB = b.b(updateRosterActivity4.bg.k());
                                        byte[] bArrB2 = b.b(updateRosterActivity4.bg.m());
                                        Object[] objArr = new Object[1];
                                        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, new char[]{49058, 45924, 16193, 8496, 59123, 15331, 15047, 864, 59164, 57308, 40721, 50451, 4541, 49383, 64254, 1831, 48408, 44058}, objArr);
                                        jSONObject3.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                                        aP aPVar = new aP(updateRosterActivity4, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject3, new aK(updateRosterActivity4), new aO(updateRosterActivity4));
                                        aPVar.m = new ivas.gov.bisp.enumeration.p022av.z(130000, 0, 0.0f);
                                        aPVar.k = false;
                                        a.b(updateRosterActivity4).c(aPVar);
                                    } catch (Exception unused) {
                                    }
                                }
                            } else if (updateRosterActivity4.bj.getText().toString().length() <= 0) {
                                if (updateRosterActivity4.bu.isShowing()) {
                                    updateRosterActivity4.bu.dismiss();
                                }
                                z.k(updateRosterActivity4.ae, updateRosterActivity4.bj, "CNIC");
                            } else if (updateRosterActivity4.aA.getText().toString().length() > 0) {
                                if (updateRosterActivity4.bu.isShowing()) {
                                    updateRosterActivity4.bu.dismiss();
                                }
                                z.n(updateRosterActivity4.ae, "Please Validate CNIC");
                            } else if (ax.c(updateRosterActivity4)) {
                                if (updateRosterActivity4.aG.getCheckedRadioButtonId() == updateRosterActivity4.aI.getId()) {
                                    updateRosterActivity4.bD = Boolean.TRUE;
                                    str = "1";
                                } else if (updateRosterActivity4.aG.getCheckedRadioButtonId() == updateRosterActivity4.aH.getId()) {
                                    updateRosterActivity4.bD = Boolean.FALSE;
                                    str = "0";
                                } else {
                                    str = BuildConfig.FLAVOR;
                                }
                                if (updateRosterActivity4.aR.getVisibility() == 8) {
                                    int i19 = d + 65;
                                    c = i19 % 128;
                                    int i110 = i19 % 2;
                                    updateRosterActivity4.ah = -1;
                                } else {
                                    updateRosterActivity4.ah = Integer.parseInt(updateRosterActivity4.aR.getText().toString());
                                }
                                JSONObject jSONObject4 = new JSONObject();
                                JSONObject jSONObject5 = new JSONObject();
                                String ipAddress2 = Formatter.formatIpAddress(((WifiManager) updateRosterActivity4.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
                                if (updateRosterActivity4.av.getCheckedRadioButtonId() == updateRosterActivity4.aw.getId()) {
                                    int i111 = d + 89;
                                    c = i111 % 128;
                                    int i112 = i111 % 2;
                                    updateRosterActivity4.bp = "male";
                                } else if (updateRosterActivity4.av.getCheckedRadioButtonId() == updateRosterActivity4.aK.getId()) {
                                    updateRosterActivity4.bp = "female";
                                } else {
                                    updateRosterActivity4.bp = "transgender";
                                }
                                jSONObject4.put("house_hold_id", updateRosterActivity4.bC);
                                jSONObject4.put("is_pmt", 0);
                                jSONObject4.put("type", "update_roster");
                                updateRosterActivity4.ag = (BISPApplication) updateRosterActivity4.getApplicationContext();
                                JSONArray jSONArray2 = new JSONArray();
                                jSONObject = new JSONObject();
                                jSONObject.put("rId", updateRosterActivity4.aj);
                                jSONObject.put("cnicEnc", updateRosterActivity4.bo);
                                jSONObject.put("cnic", updateRosterActivity4.bo);
                                jSONObject.put("hhMemberNames", updateRosterActivity4.ar.getText().toString());
                                jSONObject.put("hhMemberNamesEnc", updateRosterActivity4.ar.getText().toString());
                                jSONObject.put("hhMemberUrduName", updateRosterActivity4.aA.getText().toString());
                                jSONObject.put("dob", updateRosterActivity4.aP.getText().toString());
                                jSONObject.put("age", updateRosterActivity4.aC);
                                jSONObject.put("maritalStatus", updateRosterActivity4.bl.get(updateRosterActivity4.bh.getSelectedItemPosition()).getOption());
                                jSONObject.put("maritalStatusCode", updateRosterActivity4.bl.get(updateRosterActivity4.bh.getSelectedItemPosition()).getOptionId());
                                jSONObject.put("gender", updateRosterActivity4.bp);
                                jSONObject.put("relationToHhHead", updateRosterActivity4.aY.get(updateRosterActivity4.au.getSelectedItemPosition()).getOptionId());
                                jSONObject.put("formNo", updateRosterActivity4.bq);
                                jSONObject.put("disabilityStatus", updateRosterActivity4.bd.get(updateRosterActivity4.aE.getSelectedItemPosition()).getOption());
                                jSONObject.put("disabilityCode", updateRosterActivity4.bd.get(updateRosterActivity4.aE.getSelectedItemPosition()).getOptionId());
                                jSONObject.put("havingChronicDiseaseCode", updateRosterActivity4.bm.get(updateRosterActivity4.aD.getSelectedItemPosition()).getOptionId());
                                jSONObject.put("isLiterate", str);
                                jSONObject.put("goneToSchoolCode", updateRosterActivity4.ba.get(updateRosterActivity4.aJ.getSelectedItemPosition()).getOptionId());
                                jSONObject.put("educationLevelCode", updateRosterActivity4.bk.get(updateRosterActivity4.aM.getSelectedItemPosition()).getOptionId());
                                jSONObject.put("workStatusCode", updateRosterActivity4.aX.get(updateRosterActivity4.aN.getSelectedItemPosition()).getOptionId());
                                jSONObject.put("workStatus", updateRosterActivity4.aX.get(updateRosterActivity4.aN.getSelectedItemPosition()).getOption());
                                jSONObject.put("lastWeekWorkingHours", updateRosterActivity4.ah);
                                jSONObject.put("employmentCode", updateRosterActivity4.aZ.get(updateRosterActivity4.aV.getSelectedItemPosition()).getOptionId());
                                jSONObject.put("employmentStatus", updateRosterActivity4.aZ.get(updateRosterActivity4.aV.getSelectedItemPosition()).getOption());
                                jSONObject.put("endBy", updateRosterActivity4.bg.z());
                                jSONObject.put("endByIp", ipAddress2);
                                jSONObject.put("mobile_network_name", updateRosterActivity4.aO.getSelectedItem());
                                jSONObject.put("mobile_no", updateRosterActivity4.aS.getText().toString());
                                jSONObject.put("update_type", "update_roster");
                                if (updateRosterActivity4.ay.getCheckedRadioButtonId() != updateRosterActivity4.ay.getChildAt(1).getId()) {
                                    jSONObject.put("banks_name", updateRosterActivity4.aL.getSelectedItem());
                                    jSONObject.put("branch_code", 0);
                                    jSONObject.put("bank_address", updateRosterActivity4.ao.getText().toString());
                                    jSONObject.put("account_title", updateRosterActivity4.at.getText().toString());
                                    jSONObject.put("account_number", updateRosterActivity4.as.getText().toString());
                                } else {
                                    jSONObject.put("banks_name", BuildConfig.FLAVOR);
                                    jSONObject.put("branch_code", 0);
                                    jSONObject.put("bank_address", BuildConfig.FLAVOR);
                                    jSONObject.put("account_title", BuildConfig.FLAVOR);
                                    jSONObject.put("account_number", BuildConfig.FLAVOR);
                                }
                                jSONArray2.put(0, jSONObject);
                                jSONObject4.put("rosterList", jSONArray2);
                                jSONObject5.put("string1", b.d(jSONObject4.toString(), b.b(updateRosterActivity4.bg.k()), b.b(updateRosterActivity4.bg.m())));
                                byte[] bArrB3 = b.b(updateRosterActivity4.bg.k());
                                byte[] bArrB4 = b.b(updateRosterActivity4.bg.m());
                                Object[] objArr2 = new Object[1];
                                a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, new char[]{49058, 45924, 16193, 8496, 59123, 15331, 15047, 864, 59164, 57308, 40721, 50451, 4541, 49383, 64254, 1831, 48408, 44058}, objArr2);
                                jSONObject5.put("string2", b.d(((String) objArr2[0]).intern(), bArrB3, bArrB4));
                                aP aPVar2 = new aP(updateRosterActivity4, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject5, new aK(updateRosterActivity4), new aO(updateRosterActivity4));
                                aPVar2.m = new ivas.gov.bisp.enumeration.p022av.z(130000, 0, 0.0f);
                                aPVar2.k = false;
                                a.b(updateRosterActivity4).c(aPVar2);
                            }
                        } else {
                            if (updateRosterActivity4.bu.isShowing()) {
                                updateRosterActivity4.bu.dismiss();
                            }
                            Toast.makeText(updateRosterActivity4, "Please Validate Roster Fields", 0).show();
                        }
                    } catch (Exception e) {
                        if (updateRosterActivity4.bu.isShowing()) {
                            updateRosterActivity4.bu.dismiss();
                        }
                        AppCompatActivity appCompatActivity = updateRosterActivity4.ae;
                        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Exception: ");
                        sbW.append(e.getMessage());
                        Toast.makeText(appCompatActivity, sbW.toString(), 0).show();
                    }
                } else {
                    Toast.makeText(UpdateRosterActivity.this, "Please Validate Roster Fields", 0).show();
                }
            }
            dialogInterface.cancel();
        }

        private static void a(int i, char[] cArr, Object[] objArr) {
            int i2 = 2 % 2;
            h hVar = new h();
            char[] cArr2 = new char[cArr.length];
            hVar.d = 0;
            char[] cArr3 = new char[2];
            while (hVar.d < cArr.length) {
                cArr3[0] = cArr[hVar.d];
                cArr3[1] = cArr[hVar.d + 1];
                int i3 = 58224;
                for (int i4 = 0; i4 < 16; i4++) {
                    int i5 = $10 + 91;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    char c4 = (char) (c2 - (((c3 + i3) ^ ((c3 << 4) + ((char) (((long) b$s75$35) ^ 6963871449151285300L)))) ^ ((c3 >>> 5) + ((char) (((long) a$s76$35) ^ 6963871449151285300L)))));
                    cArr3[1] = c4;
                    cArr3[0] = (char) (c3 - (((c4 >>> 5) + ((char) (((long) c$s74$35) ^ 6963871449151285300L))) ^ ((c4 + i3) ^ ((c4 << 4) + ((char) (((long) d$s73$35) ^ 6963871449151285300L))))));
                    i3 -= 40503;
                }
                cArr2[hVar.d] = cArr3[0];
                cArr2[hVar.d + 1] = cArr3[1];
                hVar.d += 2;
            }
            String str = new String(cArr2, 0, i);
            int i7 = $10 + 67;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
        }
    }

    public final void C(RosterItem rosterItem, boolean z) {
        int i;
        int i2 = 2 % 2;
        this.aj = rosterItem.getrId();
        rosterItem.getHhid();
        rosterItem.gethH_Name();
        rosterItem.getCnic();
        rosterItem.getDob();
        rosterItem.getMaritalStatus();
        int maritalStatusCode = rosterItem.getMaritalStatusCode();
        rosterItem.getGender();
        int relationToHouseholdHead = rosterItem.getRelationToHouseholdHead();
        rosterItem.getForm_no();
        rosterItem.getDisabilityStatus();
        int disabilityCode = rosterItem.getDisabilityCode();
        int havingChronicDiseaseCode = rosterItem.getHavingChronicDiseaseCode();
        boolean zIsLiterate = rosterItem.isLiterate();
        int i3 = rosterItem.get_goneToSchoolCode();
        int i4 = rosterItem.get_educationLevelCode();
        int i5 = rosterItem.get_workStatusCode();
        rosterItem.getWorkStatus();
        rosterItem.get_lastWeekWorkingHours();
        int i6 = rosterItem.get_employmentCode();
        String mobile_network = rosterItem.getMobile_network();
        D(zIsLiterate);
        this.aW = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.banks)));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.ae, R.layout.spinner_item, this.aW);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this.aL.setAdapter((SpinnerAdapter) arrayAdapter);
        this.aL.setOnItemSelectedListener(new o00O0O());
        this.bc = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.networks)));
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this.ae, R.layout.spinner_item, this.bc);
        arrayAdapter2.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this.aO.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.aO.setOnItemSelectedListener(new o00Oo0());
        new au(this, "relation_to_household_head", getResources().getString(R.string.relation_to_head), this.au, new o00Ooo(relationToHouseholdHead)).execute(new Void[0]);
        if (z) {
            i = 0;
        } else {
            i = 0;
            new au(this, "marital_status", getResources().getString(R.string.marital_status), this.bh, new oo000o(maritalStatusCode)).execute(new Void[0]);
            new au(this, "disability_status", getResources().getString(R.string.disablity_status), this.aE, new o00oO0o(disabilityCode)).execute(new Void[0]);
            new au(this, "having_chronic_disease", getResources().getString(R.string.chronic_disease), this.aD, new o0ooOOo(havingChronicDiseaseCode)).execute(new Void[0]);
        }
        new au(this, "gone_to_school", getResources().getString(R.string.attended_school), this.aJ, new OooO00o(i3)).execute(new Void[i]);
        new au(this, "highest_completed_education", getResources().getString(R.string.education_level), this.aM, new OooO0O0(i4)).execute(new Void[i]);
        new au(this, "work_status", getResources().getString(R.string.work_Activity), this.aN, new OooO0OO(i5)).execute(new Void[i]);
        new au(this, "employment_status", getResources().getString(R.string.employment_status), this.aV, new OooO0o(i6)).execute(new Void[i]);
        if (!mobile_network.equals(BuildConfig.FLAVOR)) {
            int i7 = p + 51;
            q = i7 % 128;
            int i8 = i7 % 2;
            H();
        }
        if (!this.bz.equals(BuildConfig.FLAVOR)) {
            F();
            int i9 = p + 71;
            q = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ag = (BISPApplication) getApplicationContext();
        this.bu = new ProgressDialog(this);
        this.bg = new SessionManager(this);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.bj = (EditText) findViewById(R.id.cnic_roster);
        this.ap = (EditText) findViewById(R.id.cnic_roster_repeat);
        this.aq = (Button) findViewById(R.id.btn_vald_cnic);
        this.ar = (EditText) findViewById(R.id.name_of_member);
        this.au = (Spinner) findViewById(R.id.sp_relation_to_household);
        this.av = (RadioGroup) findViewById(R.id.rg_gender);
        this.aw = (RadioButton) findViewById(R.id.rb_male);
        this.aK = (RadioButton) findViewById(R.id.rb_female);
        this.ax = (RadioButton) findViewById(R.id.rb_trans_gender);
        this.aS = (EditText) findViewById(R.id.mobile_number);
        this.aU = (EditText) findViewById(R.id.mobile_number_repeat);
        this.ay = (RadioGroup) findViewById(R.id.rg_bank_info);
        this.an = (RadioButton) findViewById(R.id.rb_yes_bank);
        this.aB = (RadioButton) findViewById(R.id.rb_no_bank);
        this.aT = (LinearLayout) findViewById(R.id.ll_bank_info);
        this.as = (EditText) findViewById(R.id.et_account_number);
        this.at = (EditText) findViewById(R.id.et_account_title);
        this.ao = (EditText) findViewById(R.id.et_easypaisa_number);
        this.aP = (TextView) findViewById(R.id.tv_dob);
        this.aA = (TextView) findViewById(R.id.txt_valid_name_cnic);
        this.bh = (Spinner) findViewById(R.id.sp_merital_status);
        this.az = (CheckBox) findViewById(R.id.cb_is_bisp_benif);
        this.aE = (Spinner) findViewById(R.id.sp_disability);
        this.aD = (Spinner) findViewById(R.id.sp_chronic_disease);
        this.aF = (TextView) findViewById(R.id.tv_languageQuestion);
        this.aG = (RadioGroup) findViewById(R.id.rg_language);
        this.aI = (RadioButton) findViewById(R.id.rb_language_yes);
        this.aH = (RadioButton) findViewById(R.id.rb_language_no);
        this.aJ = (Spinner) findViewById(R.id.sp_attended_school);
        this.aM = (Spinner) findViewById(R.id.sp_highest_education);
        this.aN = (Spinner) findViewById(R.id.sp_work_activity);
        this.aO = (Spinner) findViewById(R.id.sp_networks);
        this.aL = (Spinner) findViewById(R.id.sp_banks);
        this.aQ = (TextView) findViewById(R.id.tv_workingHourQuestion);
        this.aR = (EditText) findViewById(R.id.hours_worked);
        this.aV = (Spinner) findViewById(R.id.sp_employment_status);
        this.am = (Button) findViewById(R.id.btn_save);
        this.av.setOnCheckedChangeListener(this);
        this.aG.setOnCheckedChangeListener(this);
        this.ay.setOnCheckedChangeListener(this);
        this.aP.setOnClickListener(this);
        this.am.setOnClickListener(this);
        this.aq.setEnabled(false);
        this.aq.setOnClickListener(new aT(this));
        Intent intent = getIntent();
        this.be = (RosterItem) intent.getSerializableExtra("roster_data");
        this.bb = intent.getIntExtra("roster_index", this.bb);
        this.bf = intent.getStringExtra("avtivity");
        RosterItem rosterItem = this.be;
        this.aj = rosterItem.getrId();
        this.ai = rosterItem.isIs_Benificiary();
        rosterItem.getMessage();
        this.bt = rosterItem.getDiscrepancy_status();
        this.bE = rosterItem.getHhMemberNames();
        this.bC = rosterItem.getHhid();
        this.bn = rosterItem.gethH_Name();
        this.bo = rosterItem.getCnic();
        String dob = rosterItem.getDob();
        rosterItem.getMaritalStatus();
        rosterItem.getMaritalStatusCode();
        this.bp = rosterItem.getGender();
        rosterItem.getRelationToHouseholdHead();
        this.bq = rosterItem.getForm_no();
        rosterItem.getDisabilityStatus();
        rosterItem.getDisabilityCode();
        rosterItem.getHavingChronicDiseaseCode();
        boolean zIsLiterate = rosterItem.isLiterate();
        rosterItem.getDisabilityCode();
        rosterItem.get_educationLevelCode();
        rosterItem.get_workStatusCode();
        int i2 = rosterItem.get_lastWeekWorkingHours();
        rosterItem.get_employmentCode();
        this.bs = rosterItem.getMobilenumber();
        this.br = rosterItem.getMobile_network();
        this.bz = rosterItem.getBank_name();
        this.bA = rosterItem.getBank_address();
        this.bv = rosterItem.getBranch_code();
        this.bB = rosterItem.getAcc_title();
        this.bw = rosterItem.getAcc_number();
        this.bi = rosterItem.getDupRosterList();
        C(rosterItem, false);
        this.ar.setText(this.bE);
        this.aR.setText(Integer.toString(i2));
        if (this.bs.equalsIgnoreCase(BuildConfig.FLAVOR) || this.bs.equalsIgnoreCase("NA")) {
            this.aS.setText(BuildConfig.FLAVOR);
            this.aU.setText(BuildConfig.FLAVOR);
        } else {
            this.aS.setText(this.bs);
            this.aU.setText(this.bs);
            int i3 = q + 45;
            p = i3 % 128;
            int i4 = i3 % 2;
        }
        if (this.bo.equalsIgnoreCase(BuildConfig.FLAVOR) || this.bo.equalsIgnoreCase("NA")) {
            this.bj.setEnabled(false);
            this.ap.setEnabled(false);
        } else {
            int i5 = q + 97;
            p = i5 % 128;
            if (i5 % 2 == 0) {
                this.bj.setEnabled(true);
                this.ap.setEnabled(true);
            } else {
                this.bj.setEnabled(false);
                this.ap.setEnabled(false);
            }
            String strB = ag.b(this.bo);
            this.bj.setText(strB);
            this.ap.setText(strB);
        }
        this.aP.setText(dob);
        this.aP.setEnabled(false);
        G(this.bp);
        if (!this.bz.equals(BuildConfig.FLAVOR)) {
            int i6 = p + 105;
            q = i6 % 128;
            if (i6 % 2 != 0) {
                F();
                throw null;
            }
            F();
        }
        if (!this.br.equals(BuildConfig.FLAVOR)) {
            int i7 = p + 61;
            q = i7 % 128;
            int i8 = i7 % 2;
            H();
        }
        D(zIsLiterate);
        if (this.bj.getText().toString().length() <= 0) {
            Toast.makeText(this, "Please Enter CNIC.", 0).show();
            return;
        }
        if (this.bg.k().length() <= 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Session Expire");
            builder.setMessage("Session Expire Please Login Again.!");
            builder.setCancelable(true);
            builder.setPositiveButton("Confirm", new aR(this));
            builder.create().show();
            return;
        }
        this.bx = this.bg.p();
        ProgressDialog progressDialog = this.bu;
        if (progressDialog == null) {
            this.bu = new ProgressDialog(this);
        } else if (progressDialog.isShowing()) {
            int i9 = q + 97;
            p = i9 % 128;
            int i10 = i9 % 2;
            this.bu.dismiss();
        }
        this.bu.setCancelable(false);
        this.bu.setMessage("Please Wait...");
        this.bu.setProgressStyle(0);
        this.bu.show();
        new aQ(this, 5000L, 1000L).start();
    }

    private static void a(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr2 = b$s64$2282;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr3[i4] = (char) (((long) cArr2[i4]) ^ 1962356595541487140L);
            }
            cArr2 = cArr3;
        }
        int i5 = (int) (1962356595541487140L ^ ((long) c$s65$2282));
        if (e$s68$2282) {
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d - 1) - lVar.a] + i] - i5);
                lVar.a++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!a$s67$2282) {
            lVar.d = iArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr5[lVar.a] = (char) (cArr2[iArr[(lVar.d - 1) - lVar.a] - i] - i5);
                lVar.a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i6 = $10 + 89;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        lVar.d = cArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        while (lVar.a < lVar.d) {
            int i8 = $10 + 51;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr6[lVar.a] = (char) (cArr2[cArr[lVar.d * lVar.a] + i] * i5);
                i2 = lVar.a % 0;
            } else {
                cArr6[lVar.a] = (char) (cArr2[cArr[(lVar.d - 1) - lVar.a] - i] - i5);
                i2 = lVar.a + 1;
            }
            lVar.a = i2;
        }
        objArr[0] = new String(cArr6);
    }
}
