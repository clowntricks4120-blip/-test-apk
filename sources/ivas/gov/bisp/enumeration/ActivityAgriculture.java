package ivas.gov.bisp.enumeration;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.CountDownTimer;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import ivas.gov.bisp.enumeration.ActivityAgriculture;
import ivas.gov.bisp.enumeration.X.i;
import ivas.gov.bisp.enumeration.adapters.AdapterAgriCrop;
import ivas.gov.bisp.enumeration.adapters.AdapterAgriResource;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.AgriMember;
import ivas.gov.bisp.enumeration.models.AgriResource;
import ivas.gov.bisp.enumeration.models.AgricultureDetail;
import ivas.gov.bisp.enumeration.models.Crop;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p043bp.C0201c;
import ivas.gov.bisp.enumeration.p043bp.C0203e;
import ivas.gov.bisp.enumeration.p043bp.C0209p;
import ivas.gov.bisp.enumeration.p043bp.C0214u;
import ivas.gov.bisp.enumeration.p043bp.C0218z;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0199a;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0204j;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0205l;
import ivas.gov.bisp.enumeration.p043bp.J;
import ivas.gov.bisp.enumeration.p043bp.P;
import ivas.gov.bisp.enumeration.p043bp.ViewOnClickListenerC0208o;
import ivas.gov.bisp.enumeration.p043bp.h;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;
import o.d;

/* JADX INFO: loaded from: classes.dex */
public class ActivityAgriculture extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s76$1051 = 57463;
    public static final /* synthetic */ int af = 0;
    private static char b$s75$1051 = 35322;
    private static int[] c$s11$1152 = {-1305218467, -1033362723, 1978321618, -2062747721, -597835248, -1648923950, 1834367483, 1505907530, 1067671645, 121365402, -1809754104, -436114738, -1166730788, 473912216, -1976125248, 680004436, -465646901, -1245599521};
    private static char c$s74$1051 = 22999;
    private static char d$s73$1051 = 62853;
    private static int p = 1;
    private static int q;
    public boolean aA;
    public ArrayList<String> aB;
    public List<Item> aC;
    public List<Crop> aD;
    public List<Crop> aE;
    public AdapterAgriResource aF;
    public AdapterAgriResource aG;
    public AdapterAgriCrop aH;
    public boolean aI;
    public AgricultureDetail aJ;
    public ArrayList<AgriResource> aK;
    public ArrayList<AgriResource> aL;
    public ArrayList<Item> aM;
    public LinearLayoutManager aN;
    public LinearLayoutManager aO;
    public LinearLayoutManager aP;
    public AdapterAgriCrop aQ;
    public int aR;
    public ArrayList<Item> aS;
    public RecyclerView ag;
    public RecyclerView ah;
    public View ai;
    public View aj;
    public AlertDialog ak;
    public AlertDialog al;
    public boolean aw = false;
    public ArrayList<String> ax;
    public CountDownTimer ay;
    public BISPApplication az;

    @BindView
    public Button buttonSave;

    @BindView
    public CardView cardViewCropAsset;

    @BindView
    public CardView cardViewWaterRes;

    @BindView
    public EditText editTextLandNumber;

    @BindView
    public EditText editTextOwnerMobile;

    @BindView
    public EditText editTextOwnerName;

    @BindView
    public LinearLayout linearLayoutLandDetail;

    @BindView
    public LinearLayout linearLayoutOtherLand;

    @BindView
    public LinearLayout linearLayoutWeatherCrop;

    @BindView
    public NestedScrollView nestedScrollView;

    @BindView
    public RadioGroup radioGroupKhareef;

    @BindView
    public RadioGroup radioGroupRabi;

    @BindView
    public RecyclerView recyclerViewKhareef;

    @BindView
    public RecyclerView recyclerViewRabi;

    @BindView
    public Spinner spinnerType;

    @BindView
    public Spinner spinnerUnit;

    @BindView
    public TextView textViewTimeRemaining;

    public class OooO00o extends CountDownTimer {
        private static int a = 1;
        private static int b;

        public OooO00o(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int i = 2 % 2;
            try {
                TextView textView = ActivityAgriculture.this.textViewTimeRemaining;
                StringBuilder sb = new StringBuilder();
                int i2 = b;
                int i3 = i2 & 91;
                int i4 = ((i2 ^ 91) | i3) << 1;
                int i5 = -((i2 | 91) & (~i3));
                int i6 = (i4 & i5) + (i5 | i4);
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    sb.append("Time Remaining : ");
                    int i7 = 41 / 0;
                } else {
                    sb.append("Time Remaining : ");
                }
                int i8 = a;
                int i9 = i8 ^ 83;
                int i10 = ((i8 & 83) | i9) << 1;
                int i11 = -i9;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    sb.append((int) (j / 1000));
                    textView.setText(sb.toString());
                } else {
                    sb.append((int) (j / 1000));
                    textView.setText(sb.toString());
                }
                ActivityAgriculture.this.buttonSave.setEnabled(false);
                ActivityAgriculture activityAgriculture = ActivityAgriculture.this;
                int i13 = a;
                int i14 = (((i13 ^ 91) | (i13 & 91)) << 1) - (((~i13) & 91) | (i13 & (-92)));
                b = i14 % 128;
                int i15 = i14 % 2;
                activityAgriculture.aw = true;
                int i16 = b;
                int i17 = (i16 & 117) + (i16 | 117);
                a = i17 % 128;
                int i18 = i17 % 2;
            } catch (Exception unused) {
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 11;
            int i4 = ((i2 ^ 11) | i3) << 1;
            int i5 = -((i2 | 11) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            try {
                ActivityAgriculture.this.textViewTimeRemaining.setVisibility(8);
                ActivityAgriculture activityAgriculture = ActivityAgriculture.this;
                int i8 = a;
                int i9 = (i8 ^ 33) + ((i8 & 33) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                activityAgriculture.buttonSave.setEnabled(true);
                int i11 = a + 12;
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 94 / 0;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity = this.ae;
        Object[] objArr = new Object[1];
        a(getPackageName().codePointAt(11) - 102, new char[]{3618, 53665, 52860, 31284, 23586, 41354, 46445, 64335, 51073, 50560, 18175, 4494, 12558, 65166}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 50, new char[]{51200, 15623, 20196, 7239, 11161, 47646, 22176, 45336, 59127, 36532, 48842, 56321, 54525, 60628, 17066, 49598, 50589, 30028, 52860, 31284, 38718, 60938, 44761, 38198, 29209, 43646, 60500, 28104, 19370, 1243, 23116, 1616, 2284, 37736, 23586, 41354, 46445, 64335, 28531, 32462, 50396, 18161, 43063, 6269, 2284, 37736, 22602, 64040, 26021, 38494, 12558, 65166}, objArr2);
        c0104pC.h(appCompatActivity, strIntern, ((String) objArr2[0]).intern(), new DialogInterfaceOnClickListenerC0204j(this, 0), null, false);
        int i2 = q + 107;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = p + 125;
        q = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        CountDownTimer countDownTimer = this.ay;
        if (countDownTimer != null) {
            int i4 = p + 91;
            q = i4 % 128;
            int i5 = i4 % 2;
            countDownTimer.cancel();
            if (i5 != 0) {
                int i6 = 99 / 0;
            }
            int i7 = q + 117;
            p = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 1;
        q = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 29;
        q = i4 % 128;
        if (i4 % 2 == 0) {
            return R.layout.activity_agriculture;
        }
        throw null;
    }

    public final ArrayList<Crop> u(int i, List<Crop> list, LinearLayoutManager linearLayoutManager) {
        int i2 = 2 % 2;
        ArrayList<Crop> arrayList = new ArrayList<>();
        if (i == 1) {
            int i3 = q + 121;
            p = i3 % 128;
            int i4 = i3 % 2;
            if (this.radioGroupRabi.getCheckedRadioButtonId() == R.id.rb_rabi_no) {
                arrayList.add(new Crop(getResources().getString(R.string.no_crop), -1, 1, 0, 0, BuildConfig.FLAVOR));
            } else {
                arrayList.addAll(w(list, linearLayoutManager));
            }
        } else if (this.radioGroupKhareef.getCheckedRadioButtonId() == R.id.rb_khareef_no) {
            arrayList.add(new Crop(getResources().getString(R.string.no_crop), -1, 1, 0, 0, BuildConfig.FLAVOR));
        } else {
            arrayList.addAll(w(list, linearLayoutManager));
            int i5 = q + 43;
            p = i5 % 128;
            int i6 = i5 % 2;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0086  */
    public final ArrayList<Crop> w(List<Crop> list, LinearLayoutManager linearLayoutManager) {
        int i = 2 % 2;
        ArrayList<Crop> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < list.size(); i2++) {
            View viewV = linearLayoutManager.v(i2);
            if (viewV != null) {
                int i3 = q + 75;
                p = i3 % 128;
                int i4 = i3 % 2;
                CheckBox checkBox = (CheckBox) viewV.findViewById(R.id.cb_selected);
                Spinner spinner = (Spinner) viewV.findViewById(R.id.sp_unit);
                EditText editText = (EditText) viewV.findViewById(R.id.et_number);
                if (checkBox.isChecked()) {
                    int i5 = q + 41;
                    p = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 63 / 0;
                        if (list.get(i2).getName().equals(getResources().getString(R.string.no_crop))) {
                            arrayList.add(new Crop(list.get(i2).getName(), list.get(i2).getCropId(), 1, 0, 0, BuildConfig.FLAVOR));
                        }
                    } else if (list.get(i2).getName().equals(getResources().getString(R.string.no_crop))) {
                        arrayList.add(new Crop(list.get(i2).getName(), list.get(i2).getCropId(), 1, 0, 0, BuildConfig.FLAVOR));
                    }
                }
                if (checkBox.isChecked()) {
                    arrayList.add(new Crop(list.get(i2).getName(), list.get(i2).getCropId(), 1, spinner.getSelectedItemPosition(), this.aC.get(spinner.getSelectedItemPosition() - 1).getOptionId(), j.m(editText)));
                } else {
                    arrayList.add(new Crop(list.get(i2).getName(), list.get(i2).getCropId(), 0, 0, 0, j.m(editText)));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        if (r1.getInt(((java.lang.String) r6[0]).intern(), 1) == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        r1 = ivas.gov.bisp.enumeration.bK.ah.c.d;
        r2 = new java.lang.Object[1];
        a(getApplicationInfo().targetSdkVersion - 22, new char[]{26717, 3087, 20656, 7944, 23500, 52577, 26978, 44034, 24524, 61438}, r2);
        r8.ay = new ivas.gov.bisp.enumeration.ActivityAgriculture.OooO00o(r8, r1.getInt(((java.lang.String) r2[0]).intern(), 0) * 1000, 1000).start();
        r1 = ivas.gov.bisp.enumeration.ActivityAgriculture.q + 75;
        ivas.gov.bisp.enumeration.ActivityAgriculture.p = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        if (r1.getInt(((java.lang.String) r6[0]).intern(), 0) == 0) goto L13;
     */
    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.ActivityAgriculture.onResume():void");
    }

    @OnClick
    public void onSave(View view) {
        boolean z;
        int i = 2 % 2;
        int i2 = p + 19;
        q = i2 % 128;
        int i3 = i2 % 2;
        if (this.spinnerType.getSelectedItemPosition() == 0) {
            AppCompatActivity appCompatActivity = this.ae;
            Spinner spinner = this.spinnerType;
            Object[] objArr = new Object[1];
            a(21 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{26717, 3087, 20656, 7944, 22526, 48818, 14944, 30438, 58856, 6061, 52860, 31284, 18414, 56751, 28934, 33857, 43063, 6269, 7738, 39691, 24524, 61438}, objArr);
            z.o(appCompatActivity, spinner, ((String) objArr[0]).intern());
            return;
        }
        if (this.spinnerType.getSelectedItemPosition() == 2 || this.spinnerType.getSelectedItemPosition() == 3) {
            if (j.E(this.editTextOwnerName, BuildConfig.FLAVOR)) {
                AppCompatActivity appCompatActivity2 = this.ae;
                EditText editText = this.editTextOwnerName;
                Object[] objArr2 = new Object[1];
                b(getApplicationInfo().targetSdkVersion - 21, new int[]{-938956173, 1160050658, -912259584, 285631279, -1059327756, -1603527253}, objArr2);
                z.k(appCompatActivity2, editText, ((String) objArr2[0]).intern());
                return;
            }
            if (j.E(this.editTextOwnerMobile, BuildConfig.FLAVOR)) {
                AppCompatActivity appCompatActivity3 = this.ae;
                EditText editText2 = this.editTextOwnerMobile;
                Object[] objArr3 = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 8, new char[]{47741, 28804, 4126, 21893, 42843, 27055, 47543, 51254, 39100, 19656, 8197, 60816}, objArr3);
                z.k(appCompatActivity3, editText2, ((String) objArr3[0]).intern());
                return;
            }
            if (!ac.k(this.editTextOwnerMobile.getText().toString())) {
                AppCompatActivity appCompatActivity4 = this.ae;
                EditText editText3 = this.editTextOwnerMobile;
                Object[] objArr4 = new Object[1];
                b(Color.rgb(0, 0, 0) + 16777235, new int[]{-1754362899, -1204566691, 1311320300, -1762660592, 1790442697, 1920954960, 1087579274, -588212708, -353532547, -693245988}, objArr4);
                z.k(appCompatActivity4, editText3, ((String) objArr4[0]).intern());
                return;
            }
        }
        if (this.spinnerUnit.getSelectedItemPosition() == 0) {
            AppCompatActivity appCompatActivity5 = this.ae;
            Spinner spinner2 = this.spinnerType;
            Object[] objArr5 = new Object[1];
            a(getPackageName().codePointAt(23) - 102, new char[]{18414, 56751, 28934, 33857, 2597, 40888, 60462, 9129, 2401, 1390}, objArr5);
            z.o(appCompatActivity5, spinner2, ((String) objArr5[0]).intern());
            return;
        }
        if (j.E(this.editTextLandNumber, BuildConfig.FLAVOR)) {
            AppCompatActivity appCompatActivity6 = this.ae;
            EditText editText4 = this.editTextLandNumber;
            Object[] objArr6 = new Object[1];
            a(8 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), new char[]{18414, 56751, 28934, 33857, 48583, 5702, 18175, 4494, 19479, 60153}, objArr6);
            z.k(appCompatActivity6, editText4, ((String) objArr6[0]).intern());
            return;
        }
        if (this.radioGroupRabi.getCheckedRadioButtonId() == -1) {
            int i4 = p + 113;
            q = i4 % 128;
            int i5 = i4 % 2;
            AppCompatActivity appCompatActivity7 = this.ae;
            RadioGroup radioGroup = this.radioGroupRabi;
            Object[] objArr7 = new Object[1];
            b(getApplicationInfo().targetSdkVersion - 15, new int[]{1357130419, 435029790, 755143401, -905728769, -1406195243, 72110331, -1971078368, -703404966}, objArr7);
            z.m(appCompatActivity7, radioGroup, ((String) objArr7[0]).intern());
            return;
        }
        if (this.radioGroupRabi.getCheckedRadioButtonId() == R.id.rb_rabi_yes) {
            if (this.aO != null) {
                int i6 = 0;
                while (true) {
                    if (i6 < this.aD.size()) {
                        if (this.aD.get(i6).getIsSelected() == 1) {
                            int i7 = p + 67;
                            q = i7 % 128;
                            if (i7 % 2 == 0) {
                                for (int i8 = 0; i8 < this.aD.size(); i8++) {
                                    View viewV = this.aO.v(i8);
                                    if (viewV != null) {
                                        CheckBox checkBox = (CheckBox) viewV.findViewById(R.id.cb_selected);
                                        Spinner spinner3 = (Spinner) viewV.findViewById(R.id.sp_unit);
                                        EditText editText5 = (EditText) viewV.findViewById(R.id.et_number);
                                        if (checkBox.isChecked() && !this.aD.get(i8).getName().equals(getResources().getString(R.string.no_crop))) {
                                            int i9 = p + 47;
                                            q = i9 % 128;
                                            int i10 = i9 % 2;
                                            if (spinner3.getSelectedItemPosition() == 0) {
                                                AppCompatActivity appCompatActivity8 = this.ae;
                                                Object[] objArr8 = new Object[1];
                                                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 102, new char[]{18414, 56751, 28934, 33857, 2597, 40888, 60462, 9129, 44519, 63739, 44285, 12771, 46874, 26504}, objArr8);
                                                StringBuilder sbW = j.w(((String) objArr8[0]).intern());
                                                sbW.append(this.aD.get(i8).getName());
                                                z.o(appCompatActivity8, spinner3, sbW.toString());
                                                return;
                                            }
                                            if (j.E(editText5, BuildConfig.FLAVOR)) {
                                                AppCompatActivity appCompatActivity9 = this.ae;
                                                Object[] objArr9 = new Object[1];
                                                b(((Process.getThreadPriority(0) + 20) >> 6) + 13, new int[]{466328288, -458134020, -350955152, -625293735, -945765528, 1750948884, -1219208342, -1221124616}, objArr9);
                                                StringBuilder sbW2 = j.w(((String) objArr9[0]).intern());
                                                sbW2.append(this.aD.get(i8).getName());
                                                z.k(appCompatActivity9, editText5, sbW2.toString());
                                                return;
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            i6++;
                        }
                    }
                    ViewParent parent = this.recyclerViewRabi.getParent();
                    RecyclerView recyclerView = this.recyclerViewRabi;
                    parent.requestChildFocus(recyclerView, recyclerView);
                    this.aO.aB(0);
                    Object[] objArr10 = new Object[1];
                    b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 25, new int[]{933192696, 419588560, -2051924292, 194008788, 1150384776, 1986848164, -794126523, 1039254878, -1700341442, -890037713, 1357130419, 435029790, 755143401, -905728769, 255862614, -1430252867}, objArr10);
                    Toast.makeText(this, ((String) objArr10[0]).intern(), 0).show();
                    return;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (this.radioGroupKhareef.getCheckedRadioButtonId() == -1) {
            AppCompatActivity appCompatActivity10 = this.ae;
            RadioGroup radioGroup2 = this.radioGroupKhareef;
            Object[] objArr11 = new Object[1];
            b(19 - Color.blue(0), new int[]{1493696509, 1156793395, -1853736903, -1470250556, 1242292804, 1299737337, -1215373802, 1235542671, 146130423, 1170766929}, objArr11);
            z.m(appCompatActivity10, radioGroup2, ((String) objArr11[0]).intern());
            return;
        }
        if (this.radioGroupKhareef.getCheckedRadioButtonId() == R.id.rb_khareef_yes) {
            int i11 = p + 91;
            q = i11 % 128;
            if (i11 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.aN != null) {
                int i12 = 0;
                while (true) {
                    if (i12 >= this.aE.size()) {
                        ViewParent parent2 = this.recyclerViewKhareef.getParent();
                        RecyclerView recyclerView2 = this.recyclerViewKhareef;
                        parent2.requestChildFocus(recyclerView2, recyclerView2);
                        this.aN.aB(0);
                        Object[] objArr12 = new Object[1];
                        a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 28, new char[]{1111, 41441, 8197, 60816, 27471, 6165, 48583, 5702, 44519, 63739, 8197, 60816, 62090, 7157, 44519, 63739, 63463, 15745, 52860, 31284, 12940, 10947, 29209, 43646, 48817, 51098, 15989, 51868, 5124, 26970, 32440, 56336}, objArr12);
                        Toast.makeText(this, ((String) objArr12[0]).intern(), 0).show();
                        return;
                    }
                    if (this.aE.get(i12).getIsSelected() == 1) {
                        for (int i13 = 0; i13 < this.aE.size(); i13++) {
                            int i14 = q + 23;
                            p = i14 % 128;
                            int i15 = i14 % 2;
                            View viewV2 = this.aN.v(i13);
                            if (viewV2 != null) {
                                CheckBox checkBox2 = (CheckBox) viewV2.findViewById(R.id.cb_selected);
                                Spinner spinner4 = (Spinner) viewV2.findViewById(R.id.sp_unit);
                                EditText editText6 = (EditText) viewV2.findViewById(R.id.et_number);
                                if (checkBox2.isChecked() && !this.aE.get(i13).getName().equals(getResources().getString(R.string.no_crop))) {
                                    if (spinner4.getSelectedItemPosition() == 0) {
                                        AppCompatActivity appCompatActivity11 = this.ae;
                                        Object[] objArr13 = new Object[1];
                                        a(13 - Color.argb(0, 0, 0, 0), new char[]{18414, 56751, 28934, 33857, 2597, 40888, 60462, 9129, 44519, 63739, 44285, 12771, 46874, 26504}, objArr13);
                                        StringBuilder sbW3 = j.w(((String) objArr13[0]).intern());
                                        sbW3.append(this.aE.get(i13).getName());
                                        z.o(appCompatActivity11, spinner4, sbW3.toString());
                                        return;
                                    }
                                    if (j.E(editText6, BuildConfig.FLAVOR)) {
                                        AppCompatActivity appCompatActivity12 = this.ae;
                                        Object[] objArr14 = new Object[1];
                                        b(getPackageName().length() - 12, new int[]{466328288, -458134020, -350955152, -625293735, -945765528, 1750948884, -1219208342, -1221124616}, objArr14);
                                        StringBuilder sbW4 = j.w(((String) objArr14[0]).intern());
                                        sbW4.append(this.aE.get(i13).getName());
                                        z.k(appCompatActivity12, editText6, sbW4.toString());
                                        int i16 = p + 119;
                                        q = i16 % 128;
                                        int i17 = i16 % 2;
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    i12++;
                }
            }
        } else if (!z) {
            Object[] objArr15 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 1, new char[]{1111, 41441, 8197, 60816, 27471, 6165, 48583, 5702, 44519, 63739, 8197, 60816, 62090, 7157, 44519, 63739, 63463, 15745, 52860, 31284, 5124, 26970, 32440, 56336, 3562, 65145, 62090, 7157, 11392, 12441, 51078, 49093, 63359, 50524, 14941, 23069, 43369, 17869}, objArr15);
            Toast.makeText(this, ((String) objArr15[0]).intern(), 0).show();
            return;
        }
        for (int i18 = 0; i18 < this.aL.size(); i18++) {
            if (this.aL.get(i18).getIsSelected() == 1) {
                for (int i19 = 0; i19 < this.aK.size(); i19++) {
                    if (this.aK.get(i19).getIsSelected() == 1) {
                        int i20 = p + 13;
                        q = i20 % 128;
                        if (i20 % 2 != 0) {
                            break;
                        }
                        for (int i21 = 0; i21 < this.aK.size(); i21++) {
                            AgriResource agriResource = this.aK.get(i21);
                            if (agriResource != null && agriResource.getIsSelected() == 1 && agriResource.getResourceOwnerPosition() == 0) {
                                AppCompatActivity appCompatActivity13 = this.ae;
                                Object[] objArr16 = new Object[1];
                                b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 26, new int[]{-938956173, 1160050658, 494862066, 1852262848, 888704824, 1292854157, 64948459, 1482626115, 1689018544, -2084192618, -317888279, -2085052183}, objArr16);
                                StringBuilder sbW5 = j.w(((String) objArr16[0]).intern());
                                sbW5.append(this.aK.get(i21).getName());
                                String string = sbW5.toString();
                                StringBuilder sb = new StringBuilder();
                                Object[] objArr17 = new Object[1];
                                a(getPackageName().codePointAt(20) - 83, new char[]{36812, 38738, 26771, 18014, 50783, 31091, 36973, 4740, 52289, 48315, 18889, 34571, 44519, 63739}, objArr17);
                                sb.append(((String) objArr17[0]).intern());
                                sb.append(string);
                                z.n(appCompatActivity13, sb.toString());
                                return;
                            }
                        }
                        AgricultureDetail agricultureDetail = new AgricultureDetail();
                        this.aJ = agricultureDetail;
                        agricultureDetail.setAgriType(this.aB.get(this.spinnerType.getSelectedItemPosition()));
                        this.aJ.setAgriTypePosition(this.spinnerType.getSelectedItemPosition());
                        this.aJ.setOwnerName(this.editTextOwnerName.getText().toString().trim());
                        this.aJ.setOwnerMobile(this.editTextOwnerMobile.getText().toString().trim());
                        this.aJ.setLandUnit(this.aC.get(this.spinnerUnit.getSelectedItemPosition() - 1).getOption());
                        this.aJ.setLandUnitPosition(this.spinnerUnit.getSelectedItemPosition());
                        this.aJ.setLandUnitId(this.aC.get(this.spinnerUnit.getSelectedItemPosition() - 1).getOptionId());
                        this.aJ.setLandNumber(this.editTextLandNumber.getText().toString().trim());
                        this.aJ.setRabiCrop(u(1, this.aD, this.aO));
                        this.aJ.setKhareefCrop(u(0, this.aE, this.aN));
                        this.aJ.setWaterResource(this.aL);
                        this.aJ.setCropResource(this.aK);
                        Intent intent = new Intent();
                        Object[] objArr18 = new Object[1];
                        a(TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 7, new char[]{37068, 63754, 61281, 43173, 27471, 6165}, objArr18);
                        intent.putExtra(((String) objArr18[0]).intern(), this.aJ);
                        if (this.aI) {
                            int i22 = q + 23;
                            p = i22 % 128;
                            int i23 = i22 % 2;
                            Object[] objArr19 = new Object[1];
                            b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 4, new int[]{-225772319, 464332582, 75925354, -755531060}, objArr19);
                            intent.putExtra(((String) objArr19[0]).intern(), this.aR);
                        }
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                }
                RecyclerView recyclerView3 = this.ah;
                if (recyclerView3 != null && recyclerView3.getVisibility() == 0) {
                    ViewParent parent3 = this.ah.getParent();
                    RecyclerView recyclerView4 = this.ah;
                    parent3.requestChildFocus(recyclerView4, recyclerView4);
                }
                this.aP.aB(0);
                Object[] objArr20 = new Object[1];
                b(32 - ((byte) KeyEvent.getModifierMetaStateMask()), new int[]{933192696, 419588560, -2051924292, 194008788, 1150384776, 1986848164, -794126523, 1039254878, -1700341442, -890037713, 1242292804, 1299737337, 477564737, -1729160225, 1722406188, 753929429, -1708822211, -1325706710}, objArr20);
                Toast.makeText(this, ((String) objArr20[0]).intern(), 0).show();
                return;
            }
        }
        RecyclerView recyclerView5 = this.ag;
        if (recyclerView5 != null) {
            int i24 = q + 121;
            p = i24 % 128;
            if (i24 % 2 == 0) {
                recyclerView5.getVisibility();
                throw null;
            }
            if (recyclerView5.getVisibility() == 0) {
                ViewParent parent4 = this.ag.getParent();
                RecyclerView recyclerView6 = this.ag;
                parent4.requestChildFocus(recyclerView6, recyclerView6);
            }
        }
        Object[] objArr21 = new Object[1];
        b(getApplicationInfo().targetSdkVersion + 3, new int[]{933192696, 419588560, -2051924292, 194008788, 1150384776, 1986848164, -794126523, 1039254878, -1700341442, -890037713, -1602771118, 1427624620, -388391631, 541868437, -388982453, -983771245, 1488459494, 1949140466}, objArr21);
        Toast.makeText(this, ((String) objArr21[0]).intern(), 0).show();
    }

    @Override // ivas.gov.bisp.enumeration.BaseActivity, ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = q + 107;
        p = i2 % 128;
        int i3 = i2 % 2;
        super.t();
        this.az = (BISPApplication) getApplicationContext();
        TextView textView = (TextView) findViewById(R.id.application_version_textView);
        final int i4 = 1;
        Object[] objArr = new Object[1];
        a(getApplicationInfo().targetSdkVersion - 20, new char[]{11654, 10302, 16389, 27538, 64525, 21511, 38197, 12088, 32387, 64721, 'm', 2133}, objArr);
        final int i5 = 0;
        textView.setText(((String) objArr[0]).intern());
        Intent intent = getIntent();
        Object[] objArr2 = new Object[1];
        a(13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{50696, 3603, 21596, 51563, 8197, 60816, 33226, 62252, 4203, 63206, 18520, 35142, 28357, 30336}, objArr2);
        this.aI = intent.getBooleanExtra(((String) objArr2[0]).intern(), false);
        Intent intent2 = getIntent();
        Object[] objArr3 = new Object[1];
        a(getApplicationInfo().targetSdkVersion - 24, new char[]{30472, 53458, 44096, 55875, 38718, 60938, 2401, 1390}, objArr3);
        this.aA = intent2.getBooleanExtra(((String) objArr3[0]).intern(), false);
        if (this.aI) {
            int i6 = p + 113;
            q = i6 % 128;
            int i7 = i6 % 2;
            Intent intent3 = getIntent();
            Object[] objArr4 = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 30, new char[]{37068, 63754, 61281, 43173, 27471, 6165}, objArr4);
            this.aJ = ((AgriMember) intent3.getSerializableExtra(((String) objArr4[0]).intern())).getAgricultureDetail();
            Intent intent4 = getIntent();
            Object[] objArr5 = new Object[1];
            b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 41, new int[]{-225772319, 464332582, 75925354, -755531060}, objArr5);
            this.aR = intent4.getIntExtra(((String) objArr5[0]).intern(), 0);
        } else {
            Intent intent5 = getIntent();
            Object[] objArr6 = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 25, new char[]{37068, 63754, 61281, 43173, 27471, 6165}, objArr6);
            this.aJ = (AgricultureDetail) intent5.getSerializableExtra(((String) objArr6[0]).intern());
        }
        ArrayList<String> arrayList = new ArrayList<>();
        this.aB = arrayList;
        arrayList.add(getResources().getString(R.string.type_of_agriculture));
        this.aB.add(getResources().getString(R.string.type_of_agriculture1));
        this.aB.add(getResources().getString(R.string.type_of_agriculture2));
        this.aB.add(getResources().getString(R.string.type_of_agriculture3));
        this.spinnerType.setAdapter((SpinnerAdapter) new ArrayAdapter(this.ae, R.layout.spinner_item, this.aB));
        this.spinnerType.setOnItemSelectedListener(new C0209p(this));
        this.ax = new ArrayList<>();
        if (!this.aA) {
            Object[] objArr7 = new Object[1];
            a(11 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), new char[]{20000, 55778, 26021, 38494, 50510, 46833, 26966, 55458, 18414, 56751, 28934, 33857}, objArr7);
            new au(this, ((String) objArr7[0]).intern(), getResources().getString(R.string.unit), new C0218z(this)).execute(new Void[0]);
        }
        this.aD = new ArrayList();
        this.recyclerViewRabi.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.aO = linearLayoutManager;
        this.recyclerViewRabi.setLayoutManager(linearLayoutManager);
        this.aM = new ArrayList<>();
        if (!this.aA) {
            Context applicationContext = getApplicationContext();
            Object[] objArr8 = new Object[1];
            b(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 27, new int[]{1242292804, 1299737337, -1222391776, -56608027, -108021787, -1108906942}, objArr8);
            new au(applicationContext, ((String) objArr8[0]).intern(), BuildConfig.FLAVOR, new P(this)).execute(new Void[0]);
        }
        this.aE = new ArrayList();
        this.recyclerViewKhareef.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(1, false);
        this.aN = linearLayoutManager2;
        this.recyclerViewKhareef.setLayoutManager(linearLayoutManager2);
        if (!this.aA) {
            Context applicationContext2 = getApplicationContext();
            Object[] objArr9 = new Object[1];
            a(12 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{5124, 26970, 32440, 56336, 63670, 41668, 5213, 9812, 18175, 4494, 12040, 47936}, objArr9);
            new au(applicationContext2, ((String) objArr9[0]).intern(), BuildConfig.FLAVOR, new C0214u(this)).execute(new Void[0]);
        }
        ArrayList<AgriResource> arrayList2 = new ArrayList<>();
        this.aL = arrayList2;
        arrayList2.add(new AgriResource(getResources().getString(R.string.water_resource1)));
        this.aL.add(new AgriResource(getResources().getString(R.string.water_resource2)));
        this.aL.add(new AgriResource(getResources().getString(R.string.water_resource3)));
        this.aL.add(new AgriResource(getResources().getString(R.string.water_resource4)));
        this.aL.add(new AgriResource(getResources().getString(R.string.water_resource5)));
        this.aL.add(new AgriResource(getResources().getString(R.string.water_resource6)));
        this.aG = new AdapterAgriResource(this.ae, this.aL, j.c, false);
        ArrayList<AgriResource> arrayList3 = new ArrayList<>();
        this.aK = arrayList3;
        arrayList3.add(new AgriResource(getResources().getString(R.string.crop_resource1)));
        this.aK.add(new AgriResource(getResources().getString(R.string.crop_resource2)));
        this.aK.add(new AgriResource(getResources().getString(R.string.crop_resource3)));
        this.aK.add(new AgriResource(getResources().getString(R.string.crop_resource4)));
        this.aK.add(new AgriResource(getResources().getString(R.string.crop_resource5)));
        this.aF = new AdapterAgriResource(this.ae, this.aK, new i(this) { // from class: ivas.gov.bisp.enumeration.bp.r
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ActivityAgriculture d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0064  */
            /* JADX WARN: Code duplicated, block: B:14:0x0079  */
            /* JADX WARN: Code duplicated, block: B:16:0x008f  */
            /* JADX WARN: Code duplicated, block: B:17:0x0093  */
            @Override // ivas.gov.bisp.enumeration.X.i
            public final void c(int i8) {
                Crop crop;
                int i9;
                int i10 = 2 % 2;
                int i11 = a;
                int i12 = i11 & 69;
                int i13 = -(-((i11 ^ 69) | i12));
                int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
                b = i14 % 128;
                Object obj = null;
                if (i14 % 2 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    ActivityAgriculture activityAgriculture = this.d;
                    AgriResource agriResource = activityAgriculture.aK.get(i8);
                    int i15 = b;
                    int i16 = (i15 ^ 117) + ((i15 & 117) << 1);
                    a = i16 % 128;
                    if (i16 % 2 != 0) {
                        agriResource.getIsSelected();
                        obj.hashCode();
                        throw null;
                    }
                    if (agriResource.getIsSelected() == 0) {
                        activityAgriculture.aK.get(i8).setIsSelected(1);
                        int i17 = a;
                        int i18 = i17 & 43;
                        int i19 = i18 + ((i17 ^ 43) | i18);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                    } else {
                        AgriResource agriResource2 = activityAgriculture.aK.get(i8);
                        int i21 = a + 11;
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        agriResource2.setIsSelected(0);
                        int i23 = a;
                        int i24 = i23 & 91;
                        int i25 = (((i23 | 91) & (~i24)) - (~(i24 << 1))) - 1;
                        b = i25 % 128;
                        int i26 = i25 % 2;
                    }
                    activityAgriculture.aF.a.d(i8, 1);
                    int i27 = b;
                    int i28 = (i27 ^ 69) + ((i27 & 69) << 1);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    return;
                }
                int i30 = i11 & 69;
                int i31 = ((i11 | 69) & (~i30)) + (i30 << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
                ActivityAgriculture activityAgriculture2 = this.d;
                Crop crop2 = activityAgriculture2.aE.get(i8);
                int i33 = b;
                int i34 = ((i33 ^ 55) | (i33 & 55)) << 1;
                int i35 = -(((~i33) & 55) | (i33 & (-56)));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                a = i36 % 128;
                if (i36 % 2 != 0) {
                    int i37 = 63 / 0;
                    if (crop2.getIsSelected() == 0) {
                        activityAgriculture2.aE.get(i8).setIsSelected(1);
                        int i38 = a + 61;
                        b = i38 % 128;
                        int i39 = i38 % 2;
                    } else {
                        crop = activityAgriculture2.aE.get(i8);
                        int i40 = a;
                        i9 = (i40 & 121) + (i40 | 121);
                        b = i9 % 128;
                        if (i9 % 2 == 0) {
                            crop.setIsSelected(0);
                        } else {
                            crop.setIsSelected(0);
                        }
                    }
                } else if (crop2.getIsSelected() == 0) {
                    activityAgriculture2.aE.get(i8).setIsSelected(1);
                    int i310 = a + 61;
                    b = i310 % 128;
                    int i311 = i310 % 2;
                } else {
                    crop = activityAgriculture2.aE.get(i8);
                    int i41 = a;
                    i9 = (i41 & 121) + (i41 | 121);
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        crop.setIsSelected(0);
                    } else {
                        crop.setIsSelected(0);
                    }
                }
                activityAgriculture2.aQ.a.d(i8, 1);
                int i42 = a;
                int i43 = (i42 | 17) << 1;
                int i44 = -(((~i42) & 17) | (i42 & (-18)));
                int i45 = (i43 & i44) + (i44 | i43);
                b = i45 % 128;
                if (i45 % 2 == 0) {
                    int i46 = 28 / 0;
                }
            }
        }, true);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.dialog_water_res, (ViewGroup) null);
        this.ai = viewInflate;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_water_resource);
        this.ag = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.ag.setLayoutManager(new LinearLayoutManager(1, false));
        this.ag.setAdapter(this.aG);
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.dialog_crop_asset, (ViewGroup) null);
        this.aj = viewInflate2;
        RecyclerView recyclerView2 = (RecyclerView) viewInflate2.findViewById(R.id.rv_crop_resource);
        this.ah = recyclerView2;
        recyclerView2.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(1, false);
        this.aP = linearLayoutManager3;
        this.ah.setLayoutManager(linearLayoutManager3);
        this.ah.setAdapter(this.aF);
        if (this.ai != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(this.ai);
            AlertDialog.Builder cancelable = builder.setCancelable(false);
            Object[] objArr10 = new Object[1];
            b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, new int[]{553856907, 1757587387}, objArr10);
            cancelable.setPositiveButton(((String) objArr10[0]).intern(), new DialogInterfaceOnClickListenerC0205l(this));
            this.ak = builder.create();
        }
        if (this.aj != null) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setView(this.aj);
            AlertDialog.Builder cancelable2 = builder2.setCancelable(false);
            Object[] objArr11 = new Object[1];
            b(getApplicationInfo().targetSdkVersion - 29, new int[]{553856907, 1757587387}, objArr11);
            cancelable2.setPositiveButton(((String) objArr11[0]).intern(), new DialogInterfaceOnClickListenerC0199a(this));
            this.al = builder2.create();
        }
        this.cardViewWaterRes.setOnClickListener(new ViewOnClickListenerC0208o(this));
        this.cardViewCropAsset.setOnClickListener(new J(this));
        if (this.aA) {
            List<Item> list = this.az.I;
            if (list != null) {
                int i8 = p + 75;
                q = i8 % 128;
                if (i8 % 2 != 0) {
                    this.aC = list;
                    int i9 = 25 / 0;
                } else {
                    this.aC = list;
                }
            }
            for (int i10 = 0; i10 < this.aC.size(); i10++) {
                this.ax.add(this.aC.get(i10).getOption());
            }
            this.spinnerUnit.setAdapter((SpinnerAdapter) new ArrayAdapter(this.ae, R.layout.spinner_item, this.ax));
            this.spinnerType.setSelection(this.aJ.getAgriTypePosition());
            this.editTextOwnerName.setText(this.aJ.getOwnerName());
            this.editTextOwnerMobile.setText(this.aJ.getOwnerMobile());
            this.spinnerUnit.setSelection(this.aJ.getLandUnitPosition());
            this.editTextLandNumber.setText(this.aJ.getLandNumber());
            try {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.aJ.getRabiCrop());
                List<Crop> list2 = this.az.H;
                if (list2 != null) {
                    int i11 = q + 103;
                    p = i11 % 128;
                    int i12 = i11 % 2;
                    this.aD = list2;
                }
                if (this.aD != null) {
                    int i13 = q + 59;
                    p = i13 % 128;
                    int i14 = i13 % 2;
                    z = false;
                    for (int i15 = 0; i15 < this.aD.size(); i15++) {
                        try {
                            int i16 = q + 23;
                            p = i16 % 128;
                            int i17 = i16 % 2;
                            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                if (this.aD.get(i15).getCropId() == ((Crop) arrayList4.get(i18)).getCropId()) {
                                    this.aD.set(i15, (Crop) arrayList4.get(i18));
                                    z = true;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.aH = new AdapterAgriCrop(getApplicationContext(), this.aD, this.ax, new C0203e(this, i5));
                    this.recyclerViewRabi.setAdapter(null);
                    this.recyclerViewRabi.setAdapter(this.aH);
                } else {
                    z = false;
                }
            } catch (Exception unused2) {
            }
            try {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(this.aJ.getKhareefCrop());
                List<Crop> list3 = this.az.G;
                if (list3 != null) {
                    int i19 = q + 87;
                    p = i19 % 128;
                    if (i19 % 2 == 0) {
                        this.aE = list3;
                        throw null;
                    }
                    this.aE = list3;
                }
                if (this.aE != null) {
                    int i20 = p + 93;
                    q = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = false;
                    for (int i22 = 0; i22 < this.aE.size(); i22++) {
                        try {
                            int i23 = p + 101;
                            q = i23 % 128;
                            int i24 = i23 % 2;
                            for (int i25 = 0; i25 < arrayList5.size(); i25++) {
                                int i26 = q + 89;
                                p = i26 % 128;
                                int i27 = i26 % 2;
                                if (this.aE.get(i22).getCropId() == ((Crop) arrayList5.get(i25)).getCropId()) {
                                    this.aE.set(i22, (Crop) arrayList5.get(i25));
                                    z2 = true;
                                }
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    this.aQ = new AdapterAgriCrop(getApplicationContext(), this.aE, this.ax, new i(this) { // from class: ivas.gov.bisp.enumeration.bp.r
                        private static int a = 0;
                        private static int b = 1;
                        public final /* synthetic */ ActivityAgriculture d;

                        {
                            this.d = this;
                        }

                        /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0079  */
                        /* JADX WARN: Code duplicated, block: B:16:0x008f  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0093  */
                        @Override // ivas.gov.bisp.enumeration.X.i
                        public final void c(int i28) {
                            Crop crop;
                            int i29;
                            int i110 = 2 % 2;
                            int i111 = a;
                            int i112 = i111 & 69;
                            int i113 = -(-((i111 ^ 69) | i112));
                            int i114 = (i112 ^ i113) + ((i112 & i113) << 1);
                            b = i114 % 128;
                            Object obj = null;
                            if (i114 % 2 == 0) {
                                throw null;
                            }
                            if (i4 == 0) {
                                ActivityAgriculture activityAgriculture = this.d;
                                AgriResource agriResource = activityAgriculture.aK.get(i28);
                                int i115 = b;
                                int i116 = (i115 ^ 117) + ((i115 & 117) << 1);
                                a = i116 % 128;
                                if (i116 % 2 != 0) {
                                    agriResource.getIsSelected();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (agriResource.getIsSelected() == 0) {
                                    activityAgriculture.aK.get(i28).setIsSelected(1);
                                    int i117 = a;
                                    int i118 = i117 & 43;
                                    int i119 = i118 + ((i117 ^ 43) | i118);
                                    b = i119 % 128;
                                    int i210 = i119 % 2;
                                } else {
                                    AgriResource agriResource2 = activityAgriculture.aK.get(i28);
                                    int i211 = a + 11;
                                    b = i211 % 128;
                                    int i212 = i211 % 2;
                                    agriResource2.setIsSelected(0);
                                    int i213 = a;
                                    int i214 = i213 & 91;
                                    int i215 = (((i213 | 91) & (~i214)) - (~(i214 << 1))) - 1;
                                    b = i215 % 128;
                                    int i216 = i215 % 2;
                                }
                                activityAgriculture.aF.a.d(i28, 1);
                                int i217 = b;
                                int i218 = (i217 ^ 69) + ((i217 & 69) << 1);
                                a = i218 % 128;
                                int i219 = i218 % 2;
                                return;
                            }
                            int i30 = i111 & 69;
                            int i31 = ((i111 | 69) & (~i30)) + (i30 << 1);
                            b = i31 % 128;
                            int i32 = i31 % 2;
                            ActivityAgriculture activityAgriculture2 = this.d;
                            Crop crop2 = activityAgriculture2.aE.get(i28);
                            int i33 = b;
                            int i34 = ((i33 ^ 55) | (i33 & 55)) << 1;
                            int i35 = -(((~i33) & 55) | (i33 & (-56)));
                            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                            a = i36 % 128;
                            if (i36 % 2 != 0) {
                                int i37 = 63 / 0;
                                if (crop2.getIsSelected() == 0) {
                                    activityAgriculture2.aE.get(i28).setIsSelected(1);
                                    int i310 = a + 61;
                                    b = i310 % 128;
                                    int i311 = i310 % 2;
                                } else {
                                    crop = activityAgriculture2.aE.get(i28);
                                    int i41 = a;
                                    i29 = (i41 & 121) + (i41 | 121);
                                    b = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        crop.setIsSelected(0);
                                    } else {
                                        crop.setIsSelected(0);
                                    }
                                }
                            } else if (crop2.getIsSelected() == 0) {
                                activityAgriculture2.aE.get(i28).setIsSelected(1);
                                int i312 = a + 61;
                                b = i312 % 128;
                                int i313 = i312 % 2;
                            } else {
                                crop = activityAgriculture2.aE.get(i28);
                                int i42 = a;
                                i29 = (i42 & 121) + (i42 | 121);
                                b = i29 % 128;
                                if (i29 % 2 == 0) {
                                    crop.setIsSelected(0);
                                } else {
                                    crop.setIsSelected(0);
                                }
                            }
                            activityAgriculture2.aQ.a.d(i28, 1);
                            int i43 = a;
                            int i44 = (i43 | 17) << 1;
                            int i45 = -(((~i43) & 17) | (i43 & (-18)));
                            int i46 = (i44 & i45) + (i45 | i44);
                            b = i46 % 128;
                            if (i46 % 2 == 0) {
                                int i47 = 28 / 0;
                            }
                        }
                    });
                    this.recyclerViewKhareef.setAdapter(null);
                    this.recyclerViewKhareef.setAdapter(this.aQ);
                } else {
                    z2 = false;
                }
            } catch (Exception unused4) {
            }
            if (z) {
                ((RadioButton) this.radioGroupRabi.findViewById(R.id.rb_rabi_yes)).setChecked(true);
                this.recyclerViewRabi.setVisibility(0);
            } else {
                ((RadioButton) this.radioGroupRabi.findViewById(R.id.rb_rabi_no)).setChecked(true);
                this.recyclerViewRabi.setVisibility(8);
            }
            if (z2) {
                ((RadioButton) this.radioGroupKhareef.findViewById(R.id.rb_khareef_yes)).setChecked(true);
                this.recyclerViewKhareef.setVisibility(0);
            } else {
                ((RadioButton) this.radioGroupKhareef.findViewById(R.id.rb_khareef_no)).setChecked(true);
                this.recyclerViewKhareef.setVisibility(8);
            }
            ArrayList<AgriResource> arrayList6 = new ArrayList<>();
            this.aL = arrayList6;
            arrayList6.addAll(this.aJ.getWaterResource());
            AdapterAgriResource adapterAgriResource = new AdapterAgriResource(this.ae, this.aL, j.c, false);
            this.aG = adapterAgriResource;
            RecyclerView recyclerView3 = this.ag;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(adapterAgriResource);
            }
            ArrayList<AgriResource> arrayList7 = new ArrayList<>();
            this.aK = arrayList7;
            arrayList7.addAll(this.aJ.getCropResource());
            AdapterAgriResource adapterAgriResource2 = new AdapterAgriResource(this.ae, this.aK, new i(this) { // from class: ivas.gov.bisp.enumeration.bp.r
                private static int a = 0;
                private static int b = 1;
                public final /* synthetic */ ActivityAgriculture d;

                {
                    this.d = this;
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0079  */
                /* JADX WARN: Code duplicated, block: B:16:0x008f  */
                /* JADX WARN: Code duplicated, block: B:17:0x0093  */
                @Override // ivas.gov.bisp.enumeration.X.i
                public final void c(int i28) {
                    Crop crop;
                    int i29;
                    int i110 = 2 % 2;
                    int i111 = a;
                    int i112 = i111 & 69;
                    int i113 = -(-((i111 ^ 69) | i112));
                    int i114 = (i112 ^ i113) + ((i112 & i113) << 1);
                    b = i114 % 128;
                    Object obj = null;
                    if (i114 % 2 == 0) {
                        throw null;
                    }
                    if (i5 == 0) {
                        ActivityAgriculture activityAgriculture = this.d;
                        AgriResource agriResource = activityAgriculture.aK.get(i28);
                        int i115 = b;
                        int i116 = (i115 ^ 117) + ((i115 & 117) << 1);
                        a = i116 % 128;
                        if (i116 % 2 != 0) {
                            agriResource.getIsSelected();
                            obj.hashCode();
                            throw null;
                        }
                        if (agriResource.getIsSelected() == 0) {
                            activityAgriculture.aK.get(i28).setIsSelected(1);
                            int i117 = a;
                            int i118 = i117 & 43;
                            int i119 = i118 + ((i117 ^ 43) | i118);
                            b = i119 % 128;
                            int i210 = i119 % 2;
                        } else {
                            AgriResource agriResource2 = activityAgriculture.aK.get(i28);
                            int i211 = a + 11;
                            b = i211 % 128;
                            int i212 = i211 % 2;
                            agriResource2.setIsSelected(0);
                            int i213 = a;
                            int i214 = i213 & 91;
                            int i215 = (((i213 | 91) & (~i214)) - (~(i214 << 1))) - 1;
                            b = i215 % 128;
                            int i216 = i215 % 2;
                        }
                        activityAgriculture.aF.a.d(i28, 1);
                        int i217 = b;
                        int i218 = (i217 ^ 69) + ((i217 & 69) << 1);
                        a = i218 % 128;
                        int i219 = i218 % 2;
                        return;
                    }
                    int i30 = i111 & 69;
                    int i31 = ((i111 | 69) & (~i30)) + (i30 << 1);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    ActivityAgriculture activityAgriculture2 = this.d;
                    Crop crop2 = activityAgriculture2.aE.get(i28);
                    int i33 = b;
                    int i34 = ((i33 ^ 55) | (i33 & 55)) << 1;
                    int i35 = -(((~i33) & 55) | (i33 & (-56)));
                    int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                    a = i36 % 128;
                    if (i36 % 2 != 0) {
                        int i37 = 63 / 0;
                        if (crop2.getIsSelected() == 0) {
                            activityAgriculture2.aE.get(i28).setIsSelected(1);
                            int i312 = a + 61;
                            b = i312 % 128;
                            int i313 = i312 % 2;
                        } else {
                            crop = activityAgriculture2.aE.get(i28);
                            int i42 = a;
                            i29 = (i42 & 121) + (i42 | 121);
                            b = i29 % 128;
                            if (i29 % 2 == 0) {
                                crop.setIsSelected(0);
                            } else {
                                crop.setIsSelected(0);
                            }
                        }
                    } else if (crop2.getIsSelected() == 0) {
                        activityAgriculture2.aE.get(i28).setIsSelected(1);
                        int i314 = a + 61;
                        b = i314 % 128;
                        int i315 = i314 % 2;
                    } else {
                        crop = activityAgriculture2.aE.get(i28);
                        int i43 = a;
                        i29 = (i43 & 121) + (i43 | 121);
                        b = i29 % 128;
                        if (i29 % 2 == 0) {
                            crop.setIsSelected(0);
                        } else {
                            crop.setIsSelected(0);
                        }
                    }
                    activityAgriculture2.aQ.a.d(i28, 1);
                    int i44 = a;
                    int i45 = (i44 | 17) << 1;
                    int i46 = -(((~i44) & 17) | (i44 & (-18)));
                    int i47 = (i45 & i46) + (i46 | i45);
                    b = i47 % 128;
                    if (i47 % 2 == 0) {
                        int i48 = 28 / 0;
                    }
                }
            }, true);
            this.aF = adapterAgriResource2;
            RecyclerView recyclerView4 = this.ah;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(adapterAgriResource2);
            }
        }
        this.radioGroupRabi.setOnCheckedChangeListener(new C0201c(this, i5));
        this.radioGroupKhareef.setOnCheckedChangeListener(new h(this, i5));
        ac.n(this.editTextOwnerMobile);
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        o.h hVar = new o.h();
        char[] cArr2 = new char[cArr.length];
        hVar.d = 0;
        char[] cArr3 = new char[2];
        while (hVar.d < cArr.length) {
            int i3 = $11 + 55;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[hVar.d];
            cArr3[1] = cArr[hVar.d + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 45;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (((long) b$s75$1051) ^ 6963871449151285300L)))) ^ ((c2 >>> 5) + ((char) (((long) a$s76$1051) ^ 6963871449151285300L)))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) c$s74$1051) ^ 6963871449151285300L))) ^ ((c3 + i5) ^ ((c3 << 4) + ((char) (((long) d$s73$1051) ^ 6963871449151285300L))))));
                i5 -= 40503;
            }
            cArr2[hVar.d] = cArr3[0];
            cArr2[hVar.d + 1] = cArr3[1];
            hVar.d += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int i, int[] iArr, Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        d dVar = new d();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = c$s11$1152;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                iArr4[i4] = (int) (((long) iArr3[i4]) ^ (-2705551458099060901L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = c$s11$1152;
        if (iArr6 != null) {
            int i5 = $10 + 107;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                iArr2[i2] = (int) (((long) iArr6[i2]) ^ (-2705551458099060901L));
                i2++;
                length = length;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        dVar.a = 0;
        while (dVar.a < iArr.length) {
            int i6 = $10 + 81;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr[0] = (char) (iArr[dVar.a] >> 16);
            cArr[1] = (char) iArr[dVar.a];
            cArr[2] = (char) (iArr[dVar.a + 1] >> 16);
            cArr[3] = (char) iArr[dVar.a + 1];
            dVar.e = (cArr[0] << 16) + cArr[1];
            dVar.d = (cArr[2] << 16) + cArr[3];
            d.b(iArr5);
            for (int i8 = 0; i8 < 16; i8++) {
                int i9 = $11 + 41;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                dVar.e ^= iArr5[i8];
                dVar.d = d.c(dVar.e) ^ dVar.d;
                int i11 = dVar.e;
                dVar.e = dVar.d;
                dVar.d = i11;
            }
            int i12 = dVar.e;
            dVar.e = dVar.d;
            dVar.d = i12;
            dVar.d ^= iArr5[16];
            dVar.e ^= iArr5[17];
            int i13 = dVar.e;
            int i14 = dVar.d;
            cArr[0] = (char) (dVar.e >>> 16);
            cArr[1] = (char) dVar.e;
            cArr[2] = (char) (dVar.d >>> 16);
            cArr[3] = (char) dVar.d;
            d.b(iArr5);
            cArr2[dVar.a * 2] = cArr[0];
            cArr2[(dVar.a * 2) + 1] = cArr[1];
            cArr2[(dVar.a * 2) + 2] = cArr[2];
            cArr2[(dVar.a * 2) + 3] = cArr[3];
            dVar.a += 2;
            int i15 = $10 + 69;
            $11 = i15 % 128;
            int i16 = i15 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
