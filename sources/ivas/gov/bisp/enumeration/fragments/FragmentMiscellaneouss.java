package ivas.gov.bisp.enumeration.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.J;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.KeyValue;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.o000Oo00.Oooo0;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p051bx.o;
import java.util.ArrayList;
import java.util.HashMap;
import net.sqlcipher.BuildConfig;
import o.h;
import o.l;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class FragmentMiscellaneouss extends Fragment implements e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s76$1142 = 15235;
    private static char b$s75$1142 = 29;
    private static int c = 0;
    private static int c$s65$1246 = 937766654;
    private static char c$s74$1142 = 40714;
    private static int d = 1;
    private static char d$s73$1142 = 43787;
    private static boolean e$s68$1246 = true;
    private ActivityBeginSurvey activityBeginSurvey;
    private HashMap<Integer, KeyValue> assetsInfoList;
    public Oooo0<Item> complaintsResolvedArrayAdapter;
    public Oooo0<Item> complaintsResolvedGovtArrayAdapter;
    public ArrayList<Item> complaintsResolvedGovtList;
    public ArrayList<Item> complaintsResolvedList;
    private CountDownTimer countDownTimer;

    @BindView
    public LinearLayout linearLayout1;

    @BindView
    public LinearLayout linearLayout2;

    @BindView
    public LinearLayout linearLayout3;

    @BindView
    public LinearLayout linearLayout4;

    @BindView
    public LinearLayout linearLayout5;

    @BindView
    public LinearLayout linearLayout6;

    @BindView
    public LinearLayout linearLayout7;

    @BindView
    public LinearLayout linearLayout8;

    @BindView
    public RadioButton radioButtonDefenceNo;

    @BindView
    public RadioButton radioButtonDefenceYes;

    @BindView
    public RadioButton radioButtonfinancialAssistance_no;

    @BindView
    public RadioButton radioButtonfinancialAssistance_yes;

    @BindView
    public RadioButton radioButtoninfantDeath_no;

    @BindView
    public RadioButton radioButtoninfantDeath_yes;

    @BindView
    public RadioButton radioButtonmigration_no;

    @BindView
    public RadioButton radioButtonmigration_yes;

    @BindView
    public RadioGroup radioGroupDefenseJob;

    @BindView
    public RadioGroup radioGroupfinancialAssistance;

    @BindView
    public RadioGroup radioGroupinfantDeath;

    @BindView
    public RadioGroup radioGroupmigration;
    public Oooo0<Item> satisfactionLevelArrayAdapter;
    public ArrayList<Item> satisfactionLevelList;

    @BindView
    public Spinner sp_levelSatisfaction;

    @BindView
    public Spinner sp_loan;

    @BindView
    public Spinner sp_resolveComplaint;

    @BindView
    public Spinner sp_resolveComplaintGovt;
    public Oooo0<Item> takenLoanArrayAdapter;
    public ArrayList<Item> takenLoanList;

    @BindView
    public TextView textViewTimeRemaining;
    private static char[] b$s64$1246 = {12034, 12141, 12063, 12140, 11998, 12138, 12129, 12059, 12036, 12135, 12057, 12130, 12095, 12137, 12035, 12133, 12136, 12039, 12132, 12090, 12134, 10555, 10533, 10554, 10626, 10551, 10502, 10500, 10528, 10542, 10536, 10537, 10543, 10663, 10541, 10672, 10632, 10540, 10559, 10538, 12148, 12061, 12149, 12032, 12139};
    private static boolean a$s67$1246 = true;
    private View parentView = null;
    private boolean isValidTrue = false;

    public void loadSpinners() {
        int i = 2 % 2;
        Activity activity = getActivity();
        Object[] objArr = new Object[1];
        a(29 - View.getDefaultSize(0, 0), new char[]{14153, 1893, 4008, 49395, 54755, 39561, 17184, 59955, 37867, 14769, 49312, 37325, 9484, 1970, 27510, 62791, 45239, 59560, 8372, 2223, 43372, 41994, 28639, 12946, 17621, 12746, 4214, 54162, 16657, 60670}, objArr);
        new au(activity, ((String) objArr[0]).intern(), getResources().getString(R.string.select_any), this.sp_resolveComplaint, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss.1
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = ((i3 & 72) + (i3 | 72)) - 1;
                a = i4 % 128;
                int i5 = i4 % 2;
                FragmentMiscellaneouss.this.complaintsResolvedList = arrayList;
                int i6 = a;
                int i7 = i6 & 27;
                int i8 = ((i6 ^ 27) | i7) << 1;
                int i9 = -((i6 | 27) & (~i7));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
            }
        }).execute(new Void[0]);
        Activity activity2 = getActivity();
        Object[] objArr2 = new Object[1];
        a(View.MeasureSpec.getSize(0) + 41, new char[]{14153, 1893, 4008, 49395, 54755, 39561, 17184, 59955, 37867, 14769, 49312, 37325, 60437, 22649, 182, 27836, 34182, 15397, 49914, 59437, 4673, 31602, 3568, 10654, 12099, 57912, 49914, 59437, 29322, 30299, 44530, 220, 3602, 49751, 4214, 54162, 43372, 41994, 25202, 55567, 39618, 31797}, objArr2);
        new au(activity2, ((String) objArr2[0]).intern(), getResources().getString(R.string.select_any), this.sp_resolveComplaintGovt, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss.2
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 & 79;
                int i5 = (i4 - (~((i3 ^ 79) | i4))) - 1;
                b = i5 % 128;
                int i6 = i5 % 2;
                FragmentMiscellaneouss.this.complaintsResolvedGovtList = arrayList;
                int i7 = a + 5;
                b = i7 % 128;
                int i8 = i7 % 2;
            }
        }).execute(new Void[0]);
        Activity activity3 = getActivity();
        Object[] objArr3 = new Object[1];
        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, new byte[]{-120, -117, -118, -122, -114, -83, -84, -86, -120, -122, -125, -122, -114, -86, -107, -122, -118, -85, -86, -124, -126, -118, -122, -117, -125, -118, -109, -114, -118, -122, -125, -114, -86, -109, -126, -86, -116, -120, -87, -120, -116}, null, objArr3);
        new au(activity3, ((String) objArr3[0]).intern(), getResources().getString(R.string.select_any), this.sp_levelSatisfaction, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss.3
            private static int a = 0;
            private static int b = 1;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = b;
                int i4 = i3 & 33;
                int i5 = -(-((i3 ^ 33) | i4));
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                FragmentMiscellaneouss.this.satisfactionLevelList = arrayList;
                int i8 = a;
                int i9 = (i8 | 65) << 1;
                int i10 = -(((~i8) & 65) | (i8 & (-66)));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        }).execute(new Void[0]);
        Activity activity4 = getActivity();
        Object[] objArr4 = new Object[1];
        b((ViewConfiguration.getTouchSlop() >> 8) + 127, null, new byte[]{-124, -125, -126, -116, -86, -124, -120, -121, -125, -122, -86, -114, -125, -107}, null, objArr4);
        new au(activity4, ((String) objArr4[0]).intern(), getResources().getString(R.string.select_any), this.sp_loan, new J() { // from class: ivas.gov.bisp.enumeration.fragments.FragmentMiscellaneouss.4
            private static int a = 1;
            private static int b;

            @Override // ivas.gov.bisp.enumeration.W.J
            public void fillList(ArrayList<Item> arrayList) {
                int i2 = 2 % 2;
                int i3 = a;
                int i4 = i3 & 9;
                int i5 = ((((i3 ^ 9) | i4) << 1) - (~(-((i3 | 9) & (~i4))))) - 1;
                b = i5 % 128;
                int i6 = i5 % 2;
                FragmentMiscellaneouss.this.takenLoanList = arrayList;
                int i7 = b;
                int i8 = i7 ^ 21;
                int i9 = (i7 & 21) << 1;
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
            }
        }).execute(new Void[0]);
        int i2 = d + 1;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        try {
            if (this.parentView == null) {
                int i2 = d + 79;
                c = i2 % 128;
                int i3 = i2 % 2;
                View viewInflate = layoutInflater.inflate(R.layout.fragment_miscellaneouss, viewGroup, false);
                this.parentView = viewInflate;
                ButterKnife.c(this, viewInflate);
                this.activityBeginSurvey = (ActivityBeginSurvey) getActivity();
                generateBody();
                this.activityBeginSurvey.aG.miscellaneousStart = z.e();
                int i4 = this.activityBeginSurvey.ac;
                if (i4 != 1 && i4 != 2) {
                    this.textViewTimeRemaining.setVisibility(8);
                }
            }
        } catch (Exception unused) {
        }
        View view = this.parentView;
        int i5 = d + 65;
        c = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public SupervisorParseObject parseJsonForSupervisor() {
        int i = 2 % 2;
        int i2 = d + 31;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void setSpotCheckUserVisibility() {
        int i = 2 % 2;
        int i2 = d + 109;
        c = i2 % 128;
        if (i2 % 2 == 0 ? this.activityBeginSurvey.ac == 2 : this.activityBeginSurvey.ac == 4) {
            this.linearLayout1.setVisibility(8);
            this.linearLayout2.setVisibility(8);
            this.linearLayout3.setVisibility(8);
            this.linearLayout4.setVisibility(8);
            this.linearLayout6.setVisibility(8);
            this.linearLayout7.setVisibility(8);
            this.linearLayout8.setVisibility(8);
        }
        int i3 = d + 85;
        c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 43 / 0;
        }
    }

    private void generateBody() {
        int i = 2 % 2;
        int i2 = d + 19;
        c = i2 % 128;
        int i3 = i2 % 2;
        loadSpinners();
        ac.m(new Spinner[]{this.sp_levelSatisfaction, this.sp_resolveComplaint, this.sp_resolveComplaintGovt, this.sp_loan}, new o[]{this.satisfactionLevelArrayAdapter, this.complaintsResolvedArrayAdapter, this.complaintsResolvedGovtArrayAdapter, this.takenLoanArrayAdapter});
        setSpotCheckUserVisibility();
        int i4 = d + 115;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public boolean isValid() {
        int i = 2 % 2;
        if (this.activityBeginSurvey.ac != 2) {
            Activity activity = getActivity();
            RadioGroup radioGroup = this.radioGroupDefenseJob;
            Object[] objArr = new Object[1];
            a(KeyEvent.normalizeMetaState(0) + 11, new char[]{32750, 15182, 33517, 53592, 65488, 25427, 11268, 15577, 42475, 36954, 1755, 41015}, objArr);
            if (!z.m(activity, radioGroup, ((String) objArr[0]).intern())) {
                int i2 = d + 31;
                c = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
        }
        Object obj = null;
        if (this.activityBeginSurvey.ac != 2) {
            int i4 = d + 77;
            c = i4 % 128;
            int i5 = i4 % 2;
            if (this.sp_loan.getSelectedItemPosition() == 0) {
                Activity activity2 = getActivity();
                Spinner spinner = this.sp_loan;
                Object[] objArr2 = new Object[1];
                b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, null, new byte[]{-124, -120, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr2);
                z.o(activity2, spinner, ((String) objArr2[0]).intern());
                return false;
            }
        }
        if (this.activityBeginSurvey.ac != 2) {
            Activity activity3 = getActivity();
            RadioGroup radioGroup2 = this.radioGroupfinancialAssistance;
            Object[] objArr3 = new Object[1];
            b(127 - View.MeasureSpec.getSize(0), null, new byte[]{-120, -117, -124, -125, -122, -114, -118, -114, -114, -115, -123, -116, -125, -118, -117, -124, -125, -124, -118, -119}, null, objArr3);
            if (!z.m(activity3, radioGroup2, ((String) objArr3[0]).intern())) {
                int i6 = c + 59;
                d = i6 % 128;
                if (i6 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (this.activityBeginSurvey.ac != 2) {
            Activity activity4 = getActivity();
            RadioGroup radioGroup3 = this.radioGroupmigration;
            Object[] objArr4 = new Object[1];
            b(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 127, null, new byte[]{-124, -126, -118, -122, -125, -111, -112, -118, -113}, null, objArr4);
            if (!z.m(activity4, radioGroup3, ((String) objArr4[0]).intern())) {
                return false;
            }
        }
        Activity activity5 = getActivity();
        RadioGroup radioGroup4 = this.radioGroupinfantDeath;
        Object[] objArr5 = new Object[1];
        b((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, null, new byte[]{-107, -122, -125, -120, -108, -123, -122, -124, -125, -109, -124, -110}, null, objArr5);
        if (!z.m(activity5, radioGroup4, ((String) objArr5[0]).intern())) {
            return false;
        }
        if (this.activityBeginSurvey.ac != 2 && this.sp_resolveComplaint.getSelectedItemPosition() == 0) {
            Activity activity6 = getActivity();
            Spinner spinner2 = this.sp_resolveComplaint;
            Object[] objArr6 = new Object[1];
            a(18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{56737, 16329, 17184, 59955, 37867, 14769, 11268, 15577, 60437, 22649, 182, 27836, 34182, 15397, 49914, 59437, 39618, 31797}, objArr6);
            z.o(activity6, spinner2, ((String) objArr6[0]).intern());
            return false;
        }
        if (this.activityBeginSurvey.ac != 2 && this.sp_resolveComplaintGovt.getSelectedItemPosition() == 0) {
            Activity activity7 = getActivity();
            Spinner spinner3 = this.sp_resolveComplaintGovt;
            Object[] objArr7 = new Object[1];
            a(23 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{56737, 16329, 17184, 59955, 37867, 14769, 11268, 15577, 60437, 22649, 182, 27836, 34182, 15397, 49914, 59437, 56707, 10180, 43425, 46681, 27123, 43839, 14654, 11649}, objArr7);
            z.o(activity7, spinner3, ((String) objArr7[0]).intern());
            int i7 = d + 121;
            c = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 25 / 0;
            }
            return false;
        }
        if (this.activityBeginSurvey.ac != 2) {
            int i9 = c + 39;
            d = i9 % 128;
            int i10 = i9 % 2;
            if (this.sp_levelSatisfaction.getSelectedItemPosition() == 0) {
                Activity activity8 = getActivity();
                Spinner spinner4 = this.sp_levelSatisfaction;
                Object[] objArr8 = new Object[1];
                a(18 - View.combineMeasuredStates(0, 0), new char[]{25905, 24506, 12417, 29350, 55954, 26813, 61940, 18991, 12417, 29350, 45239, 59560, 42979, 416, 15188, 23170, 52109, 5761}, objArr8);
                z.o(activity8, spinner4, ((String) objArr8[0]).intern());
                return false;
            }
        }
        HashMap<Integer, KeyValue> map = new HashMap<>();
        this.assetsInfoList = map;
        Object[] objArr9 = new Object[1];
        a(5 - Process.getGidForName(BuildConfig.FLAVOR), new char[]{43880, 61240, 50087, 11565, 25303, 52527}, objArr9);
        map.put(40, new KeyValue(((String) objArr9[0]).intern(), BuildConfig.FLAVOR));
        if (this.activityBeginSurvey.ac != 2) {
            HashMap<Integer, KeyValue> map2 = this.assetsInfoList;
            Object[] objArr10 = new Object[1];
            a(TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 14, new char[]{1228, 12097, 9091, 2543, 12828, 21522, 43880, 61240, 63619, 20026, 62078, 32210, 49937, 1066}, objArr10);
            map2.put(41, new KeyValue(((String) objArr10[0]).intern(), z.j(getActivity(), this.radioGroupDefenseJob)));
            HashMap<Integer, KeyValue> map3 = this.assetsInfoList;
            Object[] objArr11 = new Object[1];
            a(TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 3, new char[]{12030, 24390, 60858, 58264}, objArr11);
            map3.put(42, new KeyValue(((String) objArr11[0]).intern(), this.takenLoanList.get(this.sp_loan.getSelectedItemPosition()).getOption()));
            HashMap<Integer, KeyValue> map4 = this.assetsInfoList;
            Object[] objArr12 = new Object[1];
            b(127 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), null, new byte[]{-99, -100, -101, -105, -102, -106, -123, -103, -104, -105, -106}, null, objArr12);
            map4.put(43, new KeyValue(((String) objArr12[0]).intern(), z.j(getActivity(), this.radioGroupfinancialAssistance)));
            HashMap<Integer, KeyValue> map5 = this.assetsInfoList;
            Object[] objArr13 = new Object[1];
            a(9 - Color.red(0), new char[]{15567, 14082, 676, 55901, 37434, 20722, 32489, 15404, 38928, 63316}, objArr13);
            map5.put(44, new KeyValue(((String) objArr13[0]).intern(), z.j(getActivity(), this.radioGroupmigration)));
        }
        HashMap<Integer, KeyValue> map6 = this.assetsInfoList;
        Object[] objArr14 = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, new char[]{41046, 51724, 12077, 8169, 56860, 4979, 3076, 48439, 16372, 9446, 37766, 13099, 17121, 33058, 6416, 63619, 57001, 49007}, objArr14);
        map6.put(45, new KeyValue(((String) objArr14[0]).intern(), z.j(getActivity(), this.radioGroupinfantDeath)));
        if (this.activityBeginSurvey.ac != 2) {
            HashMap<Integer, KeyValue> map7 = this.assetsInfoList;
            Object[] objArr15 = new Object[1];
            b(127 - View.getDefaultSize(0, 0), null, new byte[]{-99, -105, -102, -97, -105, -100, -99, -123, -103, -99, -105, -98, -123}, null, objArr15);
            map7.put(46, new KeyValue(((String) objArr15[0]).intern(), this.complaintsResolvedList.get(this.sp_resolveComplaint.getSelectedItemPosition()).getOption()));
            HashMap<Integer, KeyValue> map8 = this.assetsInfoList;
            Object[] objArr16 = new Object[1];
            b(ExpandableListView.getPackedPositionChild(0L) + 128, null, new byte[]{-99, -105, -103, -105, -94, -88, -123, -89, -105, -104, -90, -123, -91, -94, -123, -92, -101, -95, -105, -93, -105, -123, -103, -95, -105, -94, -95, -96}, null, objArr16);
            map8.put(47, new KeyValue(((String) objArr16[0]).intern(), this.complaintsResolvedGovtList.get(this.sp_resolveComplaintGovt.getSelectedItemPosition()).getOption()));
            HashMap<Integer, KeyValue> map9 = this.assetsInfoList;
            Object[] objArr17 = new Object[1];
            a(22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{12828, 21522, 42011, 65331, 64545, 38393, 16733, 20810, 6416, 63619, 47052, 47683, 10054, 10029, 9091, 2543, 16733, 20810, 47946, 3519, 22615, 28123}, objArr17);
            map9.put(48, new KeyValue(((String) objArr17[0]).intern(), this.satisfactionLevelList.get(this.sp_levelSatisfaction.getSelectedItemPosition()).getOption()));
        }
        this.activityBeginSurvey.aE.putAll(this.assetsInfoList);
        if (!this.isValidTrue) {
            this.activityBeginSurvey.aG.miscellaneousEnd = z.e();
            Survey survey = this.activityBeginSurvey.aG;
            survey.diffMiscellaneous = ac.f(survey.miscellaneousStart, survey.miscellaneousEnd);
            this.isValidTrue = true;
        }
        return true;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        ActivityBeginSurvey activityBeginSurvey = this.activityBeginSurvey;
        if (activityBeginSurvey != null) {
            int i2 = activityBeginSurvey.ac;
            if (i2 != 1) {
                int i3 = d + 7;
                c = i3 % 128;
                if (i3 % 2 != 0) {
                    if (i2 != 2) {
                        return;
                    }
                } else if (i2 != 2) {
                    return;
                }
            }
            CountDownTimer countDownTimer = this.countDownTimer;
            if (countDownTimer != null) {
                int i4 = c + 87;
                d = i4 % 128;
                int i5 = i4 % 2;
                countDownTimer.cancel();
            }
        }
    }

    private void setDummyData() {
        int i = 2 % 2;
        int i2 = d + 19;
        c = i2 % 128;
        int i3 = i2 % 2;
        this.sp_levelSatisfaction.setSelection(1);
        this.sp_resolveComplaint.setSelection(1);
        this.sp_loan.setSelection(1);
        this.sp_resolveComplaintGovt.setSelection(1);
        this.radioButtoninfantDeath_yes.setChecked(true);
        this.radioButtonDefenceYes.setChecked(true);
        this.radioButtonmigration_yes.setChecked(true);
        this.radioButtonfinancialAssistance_yes.setChecked(true);
        int i4 = d + 111;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.X.e
    public void parseJson() {
        int i = 2 % 2;
        this.activityBeginSurvey.aG.infant_death = z.i(this.radioGroupinfantDeath);
        this.activityBeginSurvey.aG.financial_assistance = z.i(this.radioGroupfinancialAssistance);
        this.activityBeginSurvey.aG.defence_job = z.i(this.radioGroupDefenseJob);
        this.activityBeginSurvey.aG.migration = z.i(this.radioGroupmigration);
        if (this.sp_resolveComplaint.getSelectedItemPosition() != 0) {
            int i2 = c + 121;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                this.activityBeginSurvey.aG.resolve_complaint = this.complaintsResolvedList.get(this.sp_resolveComplaint.getSelectedItemPosition()).getOptionId();
                int i3 = 64 / 0;
            } else {
                this.activityBeginSurvey.aG.resolve_complaint = this.complaintsResolvedList.get(this.sp_resolveComplaint.getSelectedItemPosition()).getOptionId();
            }
        }
        if (this.sp_resolveComplaintGovt.getSelectedItemPosition() != 0) {
            int i4 = d + 39;
            c = i4 % 128;
            if (i4 % 2 != 0) {
                this.activityBeginSurvey.aG.resolve_complaint_govt = this.complaintsResolvedGovtList.get(this.sp_resolveComplaintGovt.getSelectedItemPosition()).getOptionId();
                throw null;
            }
            this.activityBeginSurvey.aG.resolve_complaint_govt = this.complaintsResolvedGovtList.get(this.sp_resolveComplaintGovt.getSelectedItemPosition()).getOptionId();
        }
        if (this.sp_levelSatisfaction.getSelectedItemPosition() != 0) {
            int i5 = d + 105;
            c = i5 % 128;
            int i6 = i5 % 2;
            this.activityBeginSurvey.aG.satisfaction_level = this.satisfactionLevelList.get(this.sp_levelSatisfaction.getSelectedItemPosition()).getOptionId();
        }
        if (this.sp_loan.getSelectedItemPosition() != 0) {
            int i7 = c + 37;
            d = i7 % 128;
            if (i7 % 2 != 0) {
                this.activityBeginSurvey.aG.taken_loan = this.takenLoanList.get(this.sp_loan.getSelectedItemPosition()).getOptionId();
            } else {
                this.activityBeginSurvey.aG.taken_loan = this.takenLoanList.get(this.sp_loan.getSelectedItemPosition()).getOptionId();
                throw null;
            }
        }
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
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $10 + 19;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (c2 - (((c3 + i5) ^ ((c3 << 4) + ((char) (((long) b$s75$1142) ^ 6963871449151285300L)))) ^ ((c3 >>> 5) + ((char) (((long) a$s76$1142) ^ 6963871449151285300L)))));
                cArr3[1] = c4;
                cArr3[0] = (char) (c3 - (((c4 >>> 5) + ((char) (((long) c$s74$1142) ^ 6963871449151285300L))) ^ ((c4 + i5) ^ ((c4 << 4) + ((char) (((long) d$s73$1142) ^ 6963871449151285300L))))));
                i5 -= 40503;
            }
            cArr2[hVar.d] = cArr3[0];
            cArr2[hVar.d + 1] = cArr3[1];
            hVar.d += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int i2 = 2 % 2;
        l lVar = new l();
        char[] cArr2 = b$s64$1246;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (((long) cArr2[i3]) ^ 1962356595541487140L);
            }
            cArr2 = cArr3;
        }
        int i4 = (int) (1962356595541487140L ^ ((long) c$s65$1246));
        if (e$s68$1246) {
            int i5 = $11 + 1;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d - 1) - lVar.a] + i] - i4);
                lVar.a++;
                int i7 = $11 + 43;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!a$s67$1246) {
            lVar.d = iArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr5[lVar.a] = (char) (cArr2[iArr[(lVar.d - 1) - lVar.a] - i] - i4);
                lVar.a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 23;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        lVar.d = cArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        while (lVar.a < lVar.d) {
            cArr6[lVar.a] = (char) (cArr2[cArr[(lVar.d - 1) - lVar.a] - i] - i4);
            lVar.a++;
        }
        objArr[0] = new String(cArr6);
    }
}
